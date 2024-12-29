package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.xiaomi.channel.commonutils.logger.C3989b;

public class COSPushHelper {

    /* renamed from: a */
    private static long f6828a = 0;

    /* renamed from: a */
    private static volatile boolean f6829a = false;

    public static void convertMessage(Intent intent) {
        C4063h.m10950a(intent);
    }

    public static void doInNetworkChange(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (getNeedRegister()) {
            long j = f6828a;
            if (j <= 0 || j + Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL <= elapsedRealtime) {
                f6828a = elapsedRealtime;
                registerCOSAssemblePush(context);
            }
        }
    }

    public static boolean getNeedRegister() {
        return f6829a;
    }

    public static boolean hasNetwork(Context context) {
        return C4063h.m10943a(context);
    }

    public static void onNotificationMessageCome(Context context, String str) {
    }

    public static void onPassThoughMessageCome(Context context, String str) {
    }

    public static void registerCOSAssemblePush(Context context) {
        AbstractPushManager a = C4060e.m10932a(context).mo22955a(C4059d.ASSEMBLE_PUSH_COS);
        if (a != null) {
            C3989b.m10669a("ASSEMBLE_PUSH :  register cos when network change!");
            a.register();
        }
    }

    public static synchronized void setNeedRegister(boolean z) {
        synchronized (COSPushHelper.class) {
            f6829a = z;
        }
    }

    public static void uploadToken(Context context, String str) {
        C4063h.m10949a(context, C4059d.ASSEMBLE_PUSH_COS, str);
    }
}
