package com.xiaomi.mipush.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.miot.common.ReturnCode;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.mipush.sdk.MessageHandleService;
import com.xiaomi.push.C4667eo;

public abstract class PushMessageReceiver extends BroadcastReceiver {
    public void onCommandResult(Context context, MiPushCommandMessage miPushCommandMessage) {
    }

    public void onNotificationMessageArrived(Context context, MiPushMessage miPushMessage) {
    }

    public void onNotificationMessageClicked(Context context, MiPushMessage miPushMessage) {
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            C4408b.m12484e("[CRcv] receive a msg broadcast: " + intent.getAction());
        }
        MessageHandleService.addJob(context.getApplicationContext(), new MessageHandleService.C4440a(intent, this));
        try {
            int intExtra = intent.getIntExtra("eventMessageType", -1);
            if (intExtra == 2000) {
                C4667eo.m13689a(context.getApplicationContext()).mo29050a(context.getPackageName(), intent, (int) ReturnCode.E_ACTION_INVALID, (String) null);
            } else if (intExtra == 6000) {
                C4667eo.m13689a(context.getApplicationContext()).mo29050a(context.getPackageName(), intent, 6005, (String) null);
            }
        } catch (Exception e) {
            C4408b.m12483d("meet error in PushMessageReceiver. " + e);
        }
    }

    @Deprecated
    public void onReceiveMessage(Context context, MiPushMessage miPushMessage) {
    }

    public void onReceivePassThroughMessage(Context context, MiPushMessage miPushMessage) {
    }

    public void onReceiveRegisterResult(Context context, MiPushCommandMessage miPushCommandMessage) {
    }

    public void onRequirePermissions(Context context, String[] strArr) {
    }
}
