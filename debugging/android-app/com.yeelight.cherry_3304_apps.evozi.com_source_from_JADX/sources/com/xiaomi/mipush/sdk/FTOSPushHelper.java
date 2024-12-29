package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import java.util.Map;

public class FTOSPushHelper {

    /* renamed from: a */
    private static long f6830a = 0;

    /* renamed from: a */
    private static volatile boolean f6831a = false;

    /* renamed from: a */
    private static void m10747a(Context context) {
        AbstractPushManager a = C4060e.m10932a(context).mo22955a(C4059d.ASSEMBLE_PUSH_FTOS);
        if (a != null) {
            C3989b.m10669a("ASSEMBLE_PUSH :  register fun touch os when network change!");
            a.register();
        }
    }

    public static void doInNetworkChange(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (getNeedRegister()) {
            long j = f6830a;
            if (j <= 0 || j + Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL <= elapsedRealtime) {
                f6830a = elapsedRealtime;
                m10747a(context);
            }
        }
    }

    public static boolean getNeedRegister() {
        return f6831a;
    }

    public static boolean hasNetwork(Context context) {
        return C4063h.m10943a(context);
    }

    public static void notifyFTOSNotificationClicked(Context context, Map<String, String> map) {
        PushMessageReceiver a;
        if (map != null && map.containsKey("pushMsg")) {
            String str = map.get("pushMsg");
            if (!TextUtils.isEmpty(str) && (a = C4063h.m10943a(context)) != null) {
                MiPushMessage a2 = C4063h.m10942a(str);
                if (!a2.getExtra().containsKey("notify_effect")) {
                    a.onNotificationMessageClicked(context, a2);
                }
            }
        }
    }

    public static void setNeedRegister(boolean z) {
        f6831a = z;
    }

    public static void uploadToken(Context context, String str) {
        C4063h.m10949a(context, C4059d.ASSEMBLE_PUSH_FTOS, str);
    }
}
