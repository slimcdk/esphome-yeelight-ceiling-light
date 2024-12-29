package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.xiaomi.push.C4752hz;
import com.xiaomi.push.C4769ip;
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

    public static MiPushCommandMessage generateCommandMessage(String str, List<String> list, long j, String str2, String str3) {
        MiPushCommandMessage miPushCommandMessage = new MiPushCommandMessage();
        miPushCommandMessage.setCommand(str);
        miPushCommandMessage.setCommandArguments(list);
        miPushCommandMessage.setResultCode(j);
        miPushCommandMessage.setReason(str2);
        miPushCommandMessage.setCategory(str3);
        return miPushCommandMessage;
    }

    public static MiPushMessage generateMessage(C4769ip ipVar, C4752hz hzVar, boolean z) {
        MiPushMessage miPushMessage = new MiPushMessage();
        miPushMessage.setMessageId(ipVar.mo25682a());
        if (!TextUtils.isEmpty(ipVar.mo25687d())) {
            miPushMessage.setMessageType(1);
            miPushMessage.setAlias(ipVar.mo25687d());
        } else if (!TextUtils.isEmpty(ipVar.mo25685c())) {
            miPushMessage.setMessageType(2);
            miPushMessage.setTopic(ipVar.mo25685c());
        } else if (!TextUtils.isEmpty(ipVar.mo25690f())) {
            miPushMessage.setMessageType(3);
            miPushMessage.setUserAccount(ipVar.mo25690f());
        } else {
            miPushMessage.setMessageType(0);
        }
        miPushMessage.setCategory(ipVar.mo25688e());
        if (ipVar.mo25682a() != null) {
            miPushMessage.setContent(ipVar.mo25682a().mo25339c());
        }
        if (hzVar != null) {
            if (TextUtils.isEmpty(miPushMessage.getMessageId())) {
                miPushMessage.setMessageId(hzVar.mo25361a());
            }
            if (TextUtils.isEmpty(miPushMessage.getTopic())) {
                miPushMessage.setTopic(hzVar.mo25368b());
            }
            miPushMessage.setDescription(hzVar.mo25379d());
            miPushMessage.setTitle(hzVar.mo25373c());
            miPushMessage.setNotifyType(hzVar.mo25361a());
            miPushMessage.setNotifyId(hzVar.mo25373c());
            miPushMessage.setPassThrough(hzVar.mo25368b());
            miPushMessage.setExtra(hzVar.mo25361a());
        }
        miPushMessage.setNotified(z);
        return miPushMessage;
    }

    public static C4752hz generateMessage(MiPushMessage miPushMessage) {
        C4752hz hzVar = new C4752hz();
        hzVar.mo25364a(miPushMessage.getMessageId());
        hzVar.mo25370b(miPushMessage.getTopic());
        hzVar.mo25378d(miPushMessage.getDescription());
        hzVar.mo25375c(miPushMessage.getTitle());
        hzVar.mo25374c(miPushMessage.getNotifyId());
        hzVar.mo25363a(miPushMessage.getNotifyType());
        hzVar.mo25369b(miPushMessage.getPassThrough());
        hzVar.mo25365a(miPushMessage.getExtra());
        return hzVar;
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
