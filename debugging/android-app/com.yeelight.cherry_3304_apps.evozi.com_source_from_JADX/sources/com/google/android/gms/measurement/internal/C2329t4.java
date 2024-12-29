package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.internal.measurement.zzaa;

/* renamed from: com.google.android.gms.measurement.internal.t4 */
public final class C2329t4 {

    /* renamed from: a */
    private final C2362w4 f4613a;

    public C2329t4(C2362w4 w4Var) {
        C1609u.m4475k(w4Var);
        this.f4613a = w4Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        r4 = r1.getReceiverInfo(new android.content.ComponentName(r4, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m7638b(android.content.Context r4) {
        /*
            com.google.android.gms.common.internal.C1609u.m4475k(r4)
            r0 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001e }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x001e }
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementReceiver"
            r2.<init>(r4, r3)     // Catch:{ NameNotFoundException -> 0x001e }
            android.content.pm.ActivityInfo r4 = r1.getReceiverInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x001e }
            if (r4 == 0) goto L_0x001e
            boolean r4 = r4.enabled     // Catch:{ NameNotFoundException -> 0x001e }
            if (r4 == 0) goto L_0x001e
            r4 = 1
            return r4
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2329t4.m7638b(android.content.Context):boolean");
    }

    @MainThread
    /* renamed from: a */
    public final void mo12989a(Context context, Intent intent) {
        C2111a5 d = C2111a5.m6707d(context, (zzaa) null, (Long) null);
        C2361w3 b = d.mo12427b();
        if (intent == null) {
            b.mo13099J().mo13130a("Receiver called with null intent");
            return;
        }
        d.mo12414I();
        String action = intent.getAction();
        b.mo13104O().mo13131b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            b.mo13104O().mo13130a("Starting wakeful intent.");
            this.f4613a.mo12392a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            b.mo13099J().mo13130a("Install Referrer Broadcasts are deprecated");
        }
    }
}
