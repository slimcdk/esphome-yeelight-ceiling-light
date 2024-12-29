package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* renamed from: com.google.android.gms.measurement.internal.q7 */
final class C1755q7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f2536a;

    /* renamed from: b */
    final /* synthetic */ Uri f2537b;

    /* renamed from: c */
    final /* synthetic */ String f2538c;

    /* renamed from: d */
    final /* synthetic */ String f2539d;

    /* renamed from: e */
    final /* synthetic */ C1779s7 f2540e;

    C1755q7(C1779s7 s7Var, boolean z, Uri uri, String str, String str2) {
        this.f2540e = s7Var;
        this.f2536a = z;
        this.f2537b = uri;
        this.f2538c = str;
        this.f2539d = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b0 A[SYNTHETIC, Splitter:B:31:0x00b0] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x011d A[Catch:{ RuntimeException -> 0x01b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011f A[Catch:{ RuntimeException -> 0x01b2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            com.google.android.gms.measurement.internal.s7 r2 = r1.f2540e
            boolean r0 = r1.f2536a
            android.net.Uri r3 = r1.f2537b
            java.lang.String r4 = r1.f2538c
            java.lang.String r5 = r1.f2539d
            com.google.android.gms.measurement.internal.t7 r6 = r2.f2662a
            r6.mo14009h()
            com.google.android.gms.measurement.internal.t7 r6 = r2.f2662a     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.n5 r6 = r6.f2143a     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.ya r6 = r6.mo14382N()     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.internal.measurement.C1366wb.m3180b()     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.t7 r7 = r2.f2662a     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.n5 r7 = r7.f2143a     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.g r7 = r7.mo14402z()     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.n3 r8 = com.google.android.gms.measurement.internal.C1727o3.f2468t0     // Catch:{ RuntimeException -> 0x01b2 }
            r9 = 0
            boolean r7 = r7.mo14163B(r9, r8)     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.internal.measurement.C1366wb.m3180b()     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.t7 r10 = r2.f2662a     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.n5 r10 = r10.f2143a     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.g r10 = r10.mo14402z()     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.n3 r11 = com.google.android.gms.measurement.internal.C1727o3.f2470u0     // Catch:{ RuntimeException -> 0x01b2 }
            boolean r10 = r10.mo14163B(r9, r11)     // Catch:{ RuntimeException -> 0x01b2 }
            boolean r12 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x01b2 }
            java.lang.String r13 = "Activity created with data 'referrer' without required params"
            java.lang.String r14 = "utm_medium"
            java.lang.String r15 = "_cis"
            java.lang.String r9 = "utm_source"
            java.lang.String r1 = "utm_campaign"
            r16 = r4
            java.lang.String r4 = "gclid"
            if (r12 == 0) goto L_0x0052
        L_0x0050:
            r6 = 0
            goto L_0x00ac
        L_0x0052:
            boolean r12 = r5.contains(r4)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r12 != 0) goto L_0x0097
            boolean r12 = r5.contains(r1)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r12 != 0) goto L_0x0097
            boolean r12 = r5.contains(r9)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r12 != 0) goto L_0x0097
            boolean r12 = r5.contains(r14)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r12 != 0) goto L_0x0097
            if (r7 == 0) goto L_0x007c
            java.lang.String r12 = "utm_id"
            boolean r12 = r5.contains(r12)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r12 != 0) goto L_0x0097
            java.lang.String r12 = "dclid"
            boolean r12 = r5.contains(r12)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r12 != 0) goto L_0x0097
        L_0x007c:
            if (r10 == 0) goto L_0x0089
            java.lang.String r10 = "srsltid"
            boolean r10 = r5.contains(r10)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r10 != 0) goto L_0x0087
            goto L_0x0089
        L_0x0087:
            r10 = 1
            goto L_0x0097
        L_0x0089:
            com.google.android.gms.measurement.internal.n5 r6 = r6.f2143a     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.c4 r6 = r6.mo14228b()     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.z3 r6 = r6.mo14034q()     // Catch:{ RuntimeException -> 0x01b2 }
            r6.mo14693a(r13)     // Catch:{ RuntimeException -> 0x01b2 }
            goto L_0x0050
        L_0x0097:
            java.lang.String r12 = "https://google.com/search?"
            java.lang.String r12 = r12.concat(r5)     // Catch:{ RuntimeException -> 0x01b2 }
            android.net.Uri r12 = android.net.Uri.parse(r12)     // Catch:{ RuntimeException -> 0x01b2 }
            android.os.Bundle r6 = r6.mo14682t0(r12, r7, r10)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r6 == 0) goto L_0x00ac
            java.lang.String r7 = "referrer"
            r6.putString(r15, r7)     // Catch:{ RuntimeException -> 0x01b2 }
        L_0x00ac:
            java.lang.String r7 = "_cmp"
            if (r0 == 0) goto L_0x0115
            com.google.android.gms.measurement.internal.t7 r0 = r2.f2662a     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.n5 r0 = r0.f2143a     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.ya r0 = r0.mo14382N()     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.internal.measurement.C1366wb.m3180b()     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.t7 r10 = r2.f2662a     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.n5 r10 = r10.f2143a     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.g r10 = r10.mo14402z()     // Catch:{ RuntimeException -> 0x01b2 }
            r12 = 0
            boolean r8 = r10.mo14163B(r12, r8)     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.internal.measurement.C1366wb.m3180b()     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.t7 r10 = r2.f2662a     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.n5 r10 = r10.f2143a     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.g r10 = r10.mo14402z()     // Catch:{ RuntimeException -> 0x01b2 }
            r12 = 0
            boolean r10 = r10.mo14163B(r12, r11)     // Catch:{ RuntimeException -> 0x01b2 }
            android.os.Bundle r0 = r0.mo14682t0(r3, r8, r10)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r0 == 0) goto L_0x0115
            java.lang.String r3 = "intent"
            r0.putString(r15, r3)     // Catch:{ RuntimeException -> 0x01b2 }
            boolean r3 = r0.containsKey(r4)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r3 != 0) goto L_0x0106
            if (r6 == 0) goto L_0x0106
            boolean r3 = r6.containsKey(r4)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r3 == 0) goto L_0x0106
            r3 = 1
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ RuntimeException -> 0x01b2 }
            r3 = 0
            java.lang.String r10 = r6.getString(r4)     // Catch:{ RuntimeException -> 0x01b2 }
            r8[r3] = r10     // Catch:{ RuntimeException -> 0x01b2 }
            java.lang.String r3 = "_cer"
            java.lang.String r10 = "gclid=%s"
            java.lang.String r8 = java.lang.String.format(r10, r8)     // Catch:{ RuntimeException -> 0x01b2 }
            r0.putString(r3, r8)     // Catch:{ RuntimeException -> 0x01b2 }
        L_0x0106:
            com.google.android.gms.measurement.internal.t7 r3 = r2.f2662a     // Catch:{ RuntimeException -> 0x01b2 }
            r8 = r16
            r3.mo14570v(r8, r7, r0)     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.t7 r3 = r2.f2662a     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.eb r3 = r3.f2690n     // Catch:{ RuntimeException -> 0x01b2 }
            r3.mo14131a(r8, r0)     // Catch:{ RuntimeException -> 0x01b2 }
            goto L_0x0117
        L_0x0115:
            r8 = r16
        L_0x0117:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r0 == 0) goto L_0x011f
            goto L_0x01a1
        L_0x011f:
            com.google.android.gms.measurement.internal.t7 r0 = r2.f2662a     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.n5 r0 = r0.f2143a     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14034q()     // Catch:{ RuntimeException -> 0x01b2 }
            java.lang.String r3 = "Activity created with referrer"
            r0.mo14694b(r3, r5)     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.t7 r0 = r2.f2662a     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.n5 r0 = r0.f2143a     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.g r0 = r0.mo14402z()     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.n3 r3 = com.google.android.gms.measurement.internal.C1727o3.f2430a0     // Catch:{ RuntimeException -> 0x01b2 }
            r10 = 0
            boolean r0 = r0.mo14163B(r10, r3)     // Catch:{ RuntimeException -> 0x01b2 }
            java.lang.String r3 = "_ldl"
            java.lang.String r10 = "auto"
            if (r0 == 0) goto L_0x016d
            if (r6 == 0) goto L_0x0154
            com.google.android.gms.measurement.internal.t7 r0 = r2.f2662a     // Catch:{ RuntimeException -> 0x01b2 }
            r0.mo14570v(r8, r7, r6)     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.t7 r0 = r2.f2662a     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.eb r0 = r0.f2690n     // Catch:{ RuntimeException -> 0x01b2 }
            r0.mo14131a(r8, r6)     // Catch:{ RuntimeException -> 0x01b2 }
            goto L_0x0165
        L_0x0154:
            com.google.android.gms.measurement.internal.t7 r0 = r2.f2662a     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.n5 r0 = r0.f2143a     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14034q()     // Catch:{ RuntimeException -> 0x01b2 }
            java.lang.String r1 = "Referrer does not contain valid parameters"
            r0.mo14694b(r1, r5)     // Catch:{ RuntimeException -> 0x01b2 }
        L_0x0165:
            com.google.android.gms.measurement.internal.t7 r0 = r2.f2662a     // Catch:{ RuntimeException -> 0x01b2 }
            r1 = 1
            r4 = 0
            r0.mo14547M(r10, r3, r4, r1)     // Catch:{ RuntimeException -> 0x01b2 }
            return
        L_0x016d:
            boolean r0 = r5.contains(r4)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r0 == 0) goto L_0x01a2
            boolean r0 = r5.contains(r1)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r0 != 0) goto L_0x0195
            boolean r0 = r5.contains(r9)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r0 != 0) goto L_0x0195
            boolean r0 = r5.contains(r14)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r0 != 0) goto L_0x0195
            java.lang.String r0 = "utm_term"
            boolean r0 = r5.contains(r0)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r0 != 0) goto L_0x0195
            java.lang.String r0 = "utm_content"
            boolean r0 = r5.contains(r0)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r0 == 0) goto L_0x01a2
        L_0x0195:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r0 != 0) goto L_0x01a1
            com.google.android.gms.measurement.internal.t7 r0 = r2.f2662a     // Catch:{ RuntimeException -> 0x01b2 }
            r1 = 1
            r0.mo14547M(r10, r3, r5, r1)     // Catch:{ RuntimeException -> 0x01b2 }
        L_0x01a1:
            return
        L_0x01a2:
            com.google.android.gms.measurement.internal.t7 r0 = r2.f2662a     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.n5 r0 = r0.f2143a     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14034q()     // Catch:{ RuntimeException -> 0x01b2 }
            r0.mo14693a(r13)     // Catch:{ RuntimeException -> 0x01b2 }
            return
        L_0x01b2:
            r0 = move-exception
            com.google.android.gms.measurement.internal.t7 r1 = r2.f2662a
            com.google.android.gms.measurement.internal.n5 r1 = r1.f2143a
            com.google.android.gms.measurement.internal.c4 r1 = r1.mo14228b()
            com.google.android.gms.measurement.internal.z3 r1 = r1.mo14035r()
            java.lang.String r2 = "Throwable caught in handleReferrerForOnActivityCreated"
            r1.mo14694b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1755q7.run():void");
    }
}
