package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import java.util.Map;

public class FTOSPushHelper {

    /* renamed from: a */
    private static long f7397a = 0;

    /* renamed from: a */
    private static volatile boolean f7398a = false;

    /* renamed from: a */
    private static void m12555a(Context context) {
        AbstractPushManager a = C4480f.m12751a(context).mo28709a(C4479e.ASSEMBLE_PUSH_FTOS);
        if (a != null) {
            C4408b.m12464a("ASSEMBLE_PUSH :  register fun touch os when network change!");
            a.register();
        }
    }

    public static void doInNetworkChange(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (getNeedRegister()) {
            long j = f7397a;
            if (j <= 0 || j + Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL <= elapsedRealtime) {
                f7397a = elapsedRealtime;
                m12555a(context);
            }
        }
    }

    public static boolean getNeedRegister() {
        return f7398a;
    }

    public static boolean hasNetwork(Context context) {
        return C4483i.m12764a(context);
    }

    public static void notifyFTOSNotificationClicked(Context context, Map<String, String> map) {
        PushMessageReceiver a;
        if (map != null && map.containsKey("pushMsg")) {
            String str = map.get("pushMsg");
            if (!TextUtils.isEmpty(str) && (a = C4483i.m12764a(context)) != null) {
                MiPushMessage a2 = C4483i.m12763a(str);
                if (!a2.getExtra().containsKey("notify_effect")) {
                    a.onNotificationMessageClicked(context, a2);
                }
            }
        }
    }

    public static void setNeedRegister(boolean z) {
        f7398a = z;
    }

    public static void uploadToken(Context context, String str) {
        C4483i.m12762a(context, C4479e.ASSEMBLE_PUSH_FTOS, str);
    }
}
