package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Map;

public class FCMPushHelper {
    public static void clearToken(Context context) {
        C4063h.m10946a(context, C4059d.ASSEMBLE_PUSH_FCM);
    }

    public static void convertMessage(Intent intent) {
        C4063h.m10950a(intent);
    }

    public static boolean isFCMSwitchOpen(Context context) {
        return C4063h.m10946a(context, C4059d.ASSEMBLE_PUSH_FCM) != null && MiPushClient.getOpenFCMPush(context);
    }

    public static void notifyFCMNotificationCome(Context context, Map<String, String> map) {
        PushMessageReceiver a;
        String str = map.get("pushMsg");
        if (!TextUtils.isEmpty(str) && (a = C4063h.m10943a(context)) != null) {
            a.onNotificationMessageArrived(context, C4063h.m10942a(str));
        }
    }

    public static void notifyFCMPassThoughMessageCome(Context context, Map<String, String> map) {
        PushMessageReceiver a;
        String str = map.get("pushMsg");
        if (!TextUtils.isEmpty(str) && (a = C4063h.m10943a(context)) != null) {
            a.onReceivePassThroughMessage(context, C4063h.m10942a(str));
        }
    }

    public static void reportFCMMessageDelete() {
        MiTinyDataClient.upload(C4063h.m10955b(C4059d.ASSEMBLE_PUSH_FCM), "fcm", 1, "some fcm messages was deleted ");
    }

    public static void uploadToken(Context context, String str) {
        C4063h.m10949a(context, C4059d.ASSEMBLE_PUSH_FCM, str);
    }
}
