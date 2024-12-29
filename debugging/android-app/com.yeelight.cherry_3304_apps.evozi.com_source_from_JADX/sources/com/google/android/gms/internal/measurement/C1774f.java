package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1728c;

/* renamed from: com.google.android.gms.internal.measurement.f */
final class C1774f extends C1728c.C1729a {

    /* renamed from: e */
    private final /* synthetic */ String f3336e;

    /* renamed from: f */
    private final /* synthetic */ String f3337f;

    /* renamed from: g */
    private final /* synthetic */ Context f3338g;

    /* renamed from: h */
    private final /* synthetic */ Bundle f3339h;

    /* renamed from: i */
    private final /* synthetic */ C1728c f3340i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1774f(C1728c cVar, String str, String str2, Context context, Bundle bundle) {
        super(cVar);
        this.f3340i = cVar;
        this.f3336e = str;
        this.f3337f = str2;
        this.f3338g = context;
        this.f3339h = bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054 A[Catch:{ Exception -> 0x009a }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a A[Catch:{ Exception -> 0x009a }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11412b() {
        /*
            r14 = this;
            r0 = 0
            r1 = 1
            com.google.android.gms.internal.measurement.c r2 = r14.f3340i     // Catch:{ Exception -> 0x009a }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x009a }
            r3.<init>()     // Catch:{ Exception -> 0x009a }
            java.util.List unused = r2.f3276d = r3     // Catch:{ Exception -> 0x009a }
            com.google.android.gms.internal.measurement.c r2 = r14.f3340i     // Catch:{ Exception -> 0x009a }
            java.lang.String r3 = r14.f3336e     // Catch:{ Exception -> 0x009a }
            java.lang.String r4 = r14.f3337f     // Catch:{ Exception -> 0x009a }
            boolean r2 = com.google.android.gms.internal.measurement.C1728c.m4893E(r3, r4)     // Catch:{ Exception -> 0x009a }
            r3 = 0
            if (r2 == 0) goto L_0x0027
            java.lang.String r3 = r14.f3337f     // Catch:{ Exception -> 0x009a }
            java.lang.String r2 = r14.f3336e     // Catch:{ Exception -> 0x009a }
            com.google.android.gms.internal.measurement.c r4 = r14.f3340i     // Catch:{ Exception -> 0x009a }
            java.lang.String r4 = r4.f3273a     // Catch:{ Exception -> 0x009a }
            r10 = r2
            r11 = r3
            r9 = r4
            goto L_0x002a
        L_0x0027:
            r9 = r3
            r10 = r9
            r11 = r10
        L_0x002a:
            android.content.Context r2 = r14.f3338g     // Catch:{ Exception -> 0x009a }
            com.google.android.gms.internal.measurement.C1728c.m4900Q(r2)     // Catch:{ Exception -> 0x009a }
            java.lang.Boolean r2 = com.google.android.gms.internal.measurement.C1728c.f3267j     // Catch:{ Exception -> 0x009a }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x009a }
            if (r2 != 0) goto L_0x003e
            if (r10 == 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            r2 = 0
            goto L_0x003f
        L_0x003e:
            r2 = 1
        L_0x003f:
            com.google.android.gms.internal.measurement.c r3 = r14.f3340i     // Catch:{ Exception -> 0x009a }
            com.google.android.gms.internal.measurement.c r4 = r14.f3340i     // Catch:{ Exception -> 0x009a }
            android.content.Context r5 = r14.f3338g     // Catch:{ Exception -> 0x009a }
            com.google.android.gms.internal.measurement.rc r4 = r4.mo11526c(r5, r2)     // Catch:{ Exception -> 0x009a }
            com.google.android.gms.internal.measurement.C1977rc unused = r3.f3279g = r4     // Catch:{ Exception -> 0x009a }
            com.google.android.gms.internal.measurement.c r3 = r14.f3340i     // Catch:{ Exception -> 0x009a }
            com.google.android.gms.internal.measurement.rc r3 = r3.f3279g     // Catch:{ Exception -> 0x009a }
            if (r3 != 0) goto L_0x005a
            com.google.android.gms.internal.measurement.c r2 = r14.f3340i     // Catch:{ Exception -> 0x009a }
            java.lang.String unused = r2.f3273a     // Catch:{ Exception -> 0x009a }
            return
        L_0x005a:
            android.content.Context r3 = r14.f3338g     // Catch:{ Exception -> 0x009a }
            int r3 = com.google.android.gms.internal.measurement.C1728c.m4899P(r3)     // Catch:{ Exception -> 0x009a }
            android.content.Context r4 = r14.f3338g     // Catch:{ Exception -> 0x009a }
            int r4 = com.google.android.gms.internal.measurement.C1728c.m4898N(r4)     // Catch:{ Exception -> 0x009a }
            if (r2 == 0) goto L_0x0073
            int r2 = java.lang.Math.max(r3, r4)     // Catch:{ Exception -> 0x009a }
            if (r4 >= r3) goto L_0x0070
            r3 = 1
            goto L_0x0071
        L_0x0070:
            r3 = 0
        L_0x0071:
            r8 = r3
            goto L_0x007d
        L_0x0073:
            if (r3 <= 0) goto L_0x0076
            r4 = r3
        L_0x0076:
            if (r3 <= 0) goto L_0x007a
            r2 = 1
            goto L_0x007b
        L_0x007a:
            r2 = 0
        L_0x007b:
            r8 = r2
            r2 = r4
        L_0x007d:
            com.google.android.gms.internal.measurement.zzaa r13 = new com.google.android.gms.internal.measurement.zzaa     // Catch:{ Exception -> 0x009a }
            r4 = 27000(0x6978, double:1.334E-319)
            long r6 = (long) r2     // Catch:{ Exception -> 0x009a }
            android.os.Bundle r12 = r14.f3339h     // Catch:{ Exception -> 0x009a }
            r3 = r13
            r3.<init>(r4, r6, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x009a }
            com.google.android.gms.internal.measurement.c r2 = r14.f3340i     // Catch:{ Exception -> 0x009a }
            com.google.android.gms.internal.measurement.rc r2 = r2.f3279g     // Catch:{ Exception -> 0x009a }
            android.content.Context r3 = r14.f3338g     // Catch:{ Exception -> 0x009a }
            c.a.b.b.b.a r3 = p011c.p012a.p019b.p028b.p031b.C0564b.m335f(r3)     // Catch:{ Exception -> 0x009a }
            long r4 = r14.f3280a     // Catch:{ Exception -> 0x009a }
            r2.initialize(r3, r13, r4)     // Catch:{ Exception -> 0x009a }
            return
        L_0x009a:
            r2 = move-exception
            com.google.android.gms.internal.measurement.c r3 = r14.f3340i
            r3.m4910n(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1774f.mo11412b():void");
    }
}
