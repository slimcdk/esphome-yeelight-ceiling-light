package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.xiaomi.push.C4773hw;
import com.xiaomi.push.C4790im;
import java.util.List;

public class PushMessageHelper {
    public static final String ERROR_MESSAGE = "error_message";
    public static final String ERROR_TYPE = "error_type";
    public static final String ERROR_TYPE_NEED_PERMISSION = "error_lack_of_permission";
    public static final String KEY_COMMAND = "key_command";
    public static final String KEY_MESSAGE = "key_message";
    public static final int MESSAGE_COMMAND = 3;
    public static final int MESSAGE_ERROR = 5;
    public static final int MESSAGE_QUIT = 4;
    public static final int MESSAGE_RAW = 1;
    public static final int MESSAGE_SENDMESSAGE = 2;
    public static final String MESSAGE_TYPE = "message_type";
    public static final int PUSH_MODE_BROADCAST = 2;
    public static final int PUSH_MODE_CALLBACK = 1;
    private static int pushMode;

    public static MiPushCommandMessage generateCommandMessage(String str, List<String> list, long j, String str2, String str3, List<String> list2) {
        MiPushCommandMessage miPushCommandMessage = new MiPushCommandMessage();
        miPushCommandMessage.setCommand(str);
        miPushCommandMessage.setCommandArguments(list);
        miPushCommandMessage.setResultCode(j);
        miPushCommandMessage.setReason(str2);
        miPushCommandMessage.setCategory(str3);
        miPushCommandMessage.setAutoMarkPkgs(list2);
        return miPushCommandMessage;
    }

    public static MiPushMessage generateMessage(C4790im imVar, C4773hw hwVar, boolean z) {
        MiPushMessage miPushMessage = new MiPushMessage();
        miPushMessage.setMessageId(imVar.mo29722a());
        if (!TextUtils.isEmpty(imVar.mo29727d())) {
            miPushMessage.setMessageType(1);
            miPushMessage.setAlias(imVar.mo29727d());
        } else if (!TextUtils.isEmpty(imVar.mo29725c())) {
            miPushMessage.setMessageType(2);
            miPushMessage.setTopic(imVar.mo29725c());
        } else if (!TextUtils.isEmpty(imVar.mo29730f())) {
            miPushMessage.setMessageType(3);
            miPushMessage.setUserAccount(imVar.mo29730f());
        } else {
            miPushMessage.setMessageType(0);
        }
        miPushMessage.setCategory(imVar.mo29728e());
        if (imVar.mo29722a() != null) {
            miPushMessage.setContent(imVar.mo29722a().mo29370c());
        }
        if (hwVar != null) {
            if (TextUtils.isEmpty(miPushMessage.getMessageId())) {
                miPushMessage.setMessageId(hwVar.mo29392a());
            }
            if (TextUtils.isEmpty(miPushMessage.getTopic())) {
                miPushMessage.setTopic(hwVar.mo29399b());
            }
            miPushMessage.setDescription(hwVar.mo29410d());
            miPushMessage.setTitle(hwVar.mo29404c());
            miPushMessage.setNotifyType(hwVar.mo29392a());
            miPushMessage.setNotifyId(hwVar.mo29404c());
            miPushMessage.setPassThrough(hwVar.mo29399b());
            miPushMessage.setExtra(hwVar.mo29392a());
        }
        miPushMessage.setNotified(z);
        return miPushMessage;
    }

    public static C4773hw generateMessage(MiPushMessage miPushMessage) {
        C4773hw hwVar = new C4773hw();
        hwVar.mo29395a(miPushMessage.getMessageId());
        hwVar.mo29401b(miPushMessage.getTopic());
        hwVar.mo29409d(miPushMessage.getDescription());
        hwVar.mo29406c(miPushMessage.getTitle());
        hwVar.mo29405c(miPushMessage.getNotifyId());
        hwVar.mo29394a(miPushMessage.getNotifyType());
        hwVar.mo29400b(miPushMessage.getPassThrough());
        hwVar.mo29396a(miPushMessage.getExtra());
        return hwVar;
    }

    public static int getPushMode(Context context) {
        if (pushMode == 0) {
            setPushMode(isUseCallbackPushMode(context) ? 1 : 2);
        }
        return pushMode;
    }

    private static boolean isIntentAvailable(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            return queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty();
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean isUseCallbackPushMode(Context context) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setClassName(context.getPackageName(), "com.xiaomi.mipush.sdk.PushServiceReceiver");
        return isIntentAvailable(context, intent);
    }

    public static void sendCommandMessageBroadcast(Context context, MiPushCommandMessage miPushCommandMessage) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(context.getPackageName());
        intent.putExtra(MESSAGE_TYPE, 3);
        intent.putExtra(KEY_COMMAND, miPushCommandMessage);
        new PushServiceReceiver().onReceive(context, intent);
    }

    public static void sendQuitMessageBroadcast(Context context) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(context.getPackageName());
        intent.putExtra(MESSAGE_TYPE, 4);
        new PushServiceReceiver().onReceive(context, intent);
    }

    private static void setPushMode(int i) {
        pushMode = i;
    }
}
