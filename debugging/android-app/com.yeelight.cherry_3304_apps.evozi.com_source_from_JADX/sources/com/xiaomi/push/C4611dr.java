package com.xiaomi.push;

import android.content.Context;
import android.content.IntentFilter;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.mpcd.receivers.BroadcastActionsReceiver;

/* renamed from: com.xiaomi.push.dr */
public class C4611dr {
    /* renamed from: a */
    private static IntentFilter m13754a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_DATA_CLEARED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        return intentFilter;
    }

    /* renamed from: a */
    private static C4616dw m13755a() {
        return new C4612ds();
    }

    /* renamed from: a */
    public static void m13756a(Context context) {
        C4617dx.m13767a(context).mo24928a();
        try {
            context.registerReceiver(new BroadcastActionsReceiver(m13754a()), m13754a());
        } catch (Throwable th) {
            C3989b.m10678a(th);
        }
    }
}
