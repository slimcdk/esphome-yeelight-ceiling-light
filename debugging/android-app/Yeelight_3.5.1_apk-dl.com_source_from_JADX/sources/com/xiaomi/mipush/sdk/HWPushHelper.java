package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import org.json.JSONArray;
import org.json.JSONObject;

public class HWPushHelper {

    /* renamed from: a */
    private static boolean f7399a = false;

    public static void convertMessage(Intent intent) {
        C4483i.m12772a(intent);
    }

    public static boolean hasNetwork(Context context) {
        return C4483i.m12764a(context);
    }

    public static boolean isHmsTokenSynced(Context context) {
        String a = C4483i.m12767a(C4479e.ASSEMBLE_PUSH_HUAWEI);
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        String a2 = C4483i.m12766a(context, a);
        String a3 = C4456af.m12606a(context).mo28646a(C4472au.UPLOAD_HUAWEI_TOKEN);
        return !TextUtils.isEmpty(a2) && !TextUtils.isEmpty(a3) && "synced".equals(a3);
    }

    public static boolean isUserOpenHmsPush(Context context) {
        return MiPushClient.getOpenHmsPush(context);
    }

    public static boolean needConnect() {
        return f7399a;
    }

    public static void notifyHmsNotificationMessageClicked(Context context, String str) {
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() > 0) {
                    int i = 0;
                    while (true) {
                        if (i >= jSONArray.length()) {
                            break;
                        }
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        if (jSONObject.has("pushMsg")) {
                            str2 = jSONObject.getString("pushMsg");
                            break;
                        }
                        i++;
                    }
                }
            } catch (Exception e) {
                C4408b.m12483d(e.toString());
            }
        }
        PushMessageReceiver a = C4483i.m12764a(context);
        if (a != null) {
            MiPushMessage a2 = C4483i.m12763a(str2);
            if (!a2.getExtra().containsKey("notify_effect")) {
                a.onNotificationMessageClicked(context, a2);
            }
        }
    }

    public static void notifyHmsPassThoughMessageArrived(Context context, String str) {
        String str2 = "";
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("content")) {
                    str2 = jSONObject.getString("content");
                }
            }
        } catch (Exception e) {
            C4408b.m12483d(e.toString());
        }
        PushMessageReceiver a = C4483i.m12764a(context);
        if (a != null) {
            a.onReceivePassThroughMessage(context, C4483i.m12763a(str2));
        }
    }

    public static void registerHuaWeiAssemblePush(Context context) {
        AbstractPushManager a = C4480f.m12751a(context).mo28709a(C4479e.ASSEMBLE_PUSH_HUAWEI);
        if (a != null) {
            a.register();
        }
    }

    public static void reportError(String str, int i) {
        C4483i.m12774a(str, i);
    }

    public static synchronized void setConnectTime(Context context) {
        synchronized (HWPushHelper.class) {
            context.getSharedPreferences("mipush_extra", 0).edit().putLong("last_connect_time", System.currentTimeMillis()).commit();
        }
    }

    public static synchronized void setGetTokenTime(Context context) {
        synchronized (HWPushHelper.class) {
            context.getSharedPreferences("mipush_extra", 0).edit().putLong("last_get_token_time", System.currentTimeMillis()).commit();
        }
    }

    public static void setNeedConnect(boolean z) {
        f7399a = z;
    }

    public static synchronized boolean shouldGetToken(Context context) {
        boolean z;
        synchronized (HWPushHelper.class) {
            z = false;
            if (Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_get_token_time", -1)) > 172800000) {
                z = true;
            }
        }
        return z;
    }

    public static synchronized boolean shouldTryConnect(Context context) {
        boolean z;
        synchronized (HWPushHelper.class) {
            z = false;
            if (Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_connect_time", -1)) > 5000) {
                z = true;
            }
        }
        return z;
    }

    public static void uploadToken(Context context, String str) {
        C4483i.m12762a(context, C4479e.ASSEMBLE_PUSH_HUAWEI, str);
    }
}
