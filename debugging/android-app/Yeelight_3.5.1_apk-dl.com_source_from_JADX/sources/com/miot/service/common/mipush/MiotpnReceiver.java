package com.miot.service.common.mipush;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.miot.api.Constants;
import com.miot.common.device.parser.xml.DddTag;
import com.miot.common.utils.Logger;
import com.miot.service.common.manager.MiPushManager;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.manipulator.subscribe.NotificationManager;
import com.p022mi.iot.service.push.subscribe.SpecNotificationManager;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.mipush.sdk.PushMessageReceiver;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class MiotpnReceiver extends PushMessageReceiver {
    private static final String TAG = "MiotpnReceiver";

    private void processCommand(Context context, MiPushCommandMessage miPushCommandMessage) {
        String command = miPushCommandMessage.getCommand();
        command.hashCode();
        if (command.equals(MiPushClient.COMMAND_REGISTER)) {
            StringBuilder sb = new StringBuilder();
            sb.append("processCommand: ");
            sb.append(miPushCommandMessage.getCommand());
            sb.append(", context: ");
            sb.append(context);
            if (ServiceManager.getInstance().getPushManager() == null && context != null) {
                ServiceManager.getInstance().setPushManager(new MiPushManager(context.getApplicationContext()));
            }
            if (miPushCommandMessage.getResultCode() == 0) {
                List<String> commandArguments = miPushCommandMessage.getCommandArguments();
                ServiceManager.getInstance().getPushManager().onRegisterSucceed((commandArguments == null || commandArguments.size() <= 0) ? null : commandArguments.get(0));
            } else {
                ServiceManager.getInstance().getPushManager().onRegisterFailed(miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason());
            }
        }
        Intent intent = new Intent(Constants.ACTION_PUSH_COMMAND);
        intent.putExtra(Constants.EXTRA_PUSH_COMMAND, miPushCommandMessage);
        intent.setPackage(context.getPackageName());
        context.sendBroadcast(intent);
    }

    private void processMessage(Context context, MiPushMessage miPushMessage) {
        StringBuilder sb = new StringBuilder();
        sb.append("process push message: ");
        sb.append(miPushMessage.getContent());
        try {
            JSONObject jSONObject = new JSONObject(miPushMessage.getContent());
            MiPushManager pushManager = ServiceManager.getInstance().getPushManager();
            if (pushManager != null) {
                String optString = jSONObject.optString("type");
                if (DddTag.DEVICE.equals(optString)) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("body");
                    MiotpnMessageProcessor processor = pushManager.getProcessor(optString);
                    if (processor == null) {
                        processor = NotificationManager.getInstance().getProcessor();
                        if (processor != null) {
                            pushManager.addProcessor(MiotpnMessageType.DeviceEvent, processor);
                        } else {
                            throw new JSONException(String.format("MiotpnMessageProcessor not found: %s", new Object[]{optString}));
                        }
                    }
                    processor.onProcess(optJSONObject);
                    return;
                }
                String optString2 = jSONObject.optString("topic");
                if (!TextUtils.isEmpty(optString2)) {
                    MiotpnMessageProcessor specProcessor = pushManager.getSpecProcessor(optString2);
                    if (specProcessor == null) {
                        specProcessor = SpecNotificationManager.getInstance().getProcessor();
                        if (specProcessor == null) {
                            String.format("MiPushMessageProcessor not found: %s", new Object[]{optString2});
                            return;
                        }
                    }
                    specProcessor.onProcess(jSONObject);
                    return;
                }
                throw new JSONException("Can not handle, Both device and topic are empty!");
            }
        } catch (JSONException e) {
            Logger.m7500e(TAG, e.getMessage());
            sendBroadcast(context, miPushMessage);
        }
    }

    private void sendBroadcast(Context context, MiPushMessage miPushMessage) {
        Intent intent = new Intent(Constants.ACTION_PUSH_MESSAGE);
        intent.putExtra(Constants.EXTRA_PUSH_MESSAGE, miPushMessage);
        intent.setPackage(context.getPackageName());
        context.sendBroadcast(intent);
    }

    public void onCommandResult(Context context, MiPushCommandMessage miPushCommandMessage) {
        super.onCommandResult(context, miPushCommandMessage);
        processCommand(context, miPushCommandMessage);
    }

    public void onNotificationMessageArrived(Context context, MiPushMessage miPushMessage) {
        StringBuilder sb = new StringBuilder();
        sb.append("onNotificationMessageArrived: ");
        sb.append(miPushMessage);
        processMessage(context, miPushMessage);
    }

    public void onNotificationMessageClicked(Context context, MiPushMessage miPushMessage) {
        StringBuilder sb = new StringBuilder();
        sb.append("onNotificationMessageClicked: ");
        sb.append(miPushMessage);
        Intent intent = new Intent(Constants.ACTION_PUSH_NOTIFICATION_CLICKED);
        intent.putExtra(Constants.EXTRA_PUSH_MESSAGE, miPushMessage);
        intent.setPackage(context.getApplicationContext().getPackageName());
        context.sendBroadcast(intent);
    }

    public void onReceivePassThroughMessage(Context context, MiPushMessage miPushMessage) {
        StringBuilder sb = new StringBuilder();
        sb.append("onReceivePassThroughMessage: ");
        sb.append(miPushMessage);
        processMessage(context, miPushMessage);
    }
}
