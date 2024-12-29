package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.xiaomi.channel.commonutils.logger.C4408b;

public class COSPushHelper {

    /* renamed from: a */
    private static long f7395a = 0;

    /* renamed from: a */
    private static volatile boolean f7396a = false;

    public static void convertMessage(Intent intent) {
        C4483i.m12772a(intent);
    }

    public static void doInNetworkChange(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (getNeedRegister()) {
            long j = f7395a;
            if (j <= 0 || j + Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL <= elapsedRealtime) {
                f7395a = elapsedRealtime;
                registerCOSAssemblePush(context);
            }
        }
    }

    public static boolean getNeedRegister() {
        return f7396a;
    }

    public static boolean hasNetwork(Context context) {
        return C4483i.m12764a(context);
    }

    public static void onNotificationMessageCome(Context context, String str) {
    }

    public static void onPassThoughMessageCome(Context context, String str) {
    }

    public static void registerCOSAssemblePush(Context context) {
        AbstractPushManager a = C4480f.m12751a(context).mo28709a(C4479e.ASSEMBLE_PUSH_COS);
        if (a != null) {
            C4408b.m12464a("ASSEMBLE_PUSH :  register cos when network change!");
            a.register();
        }
    }

    public static synchronized void setNeedRegister(boolean z) {
        synchronized (COSPushHelper.class) {
            f7396a = z;
        }
    }

    public static void uploadToken(Context context, String str) {
        C4483i.m12762a(context, C4479e.ASSEMBLE_PUSH_COS, str);
    }
}
