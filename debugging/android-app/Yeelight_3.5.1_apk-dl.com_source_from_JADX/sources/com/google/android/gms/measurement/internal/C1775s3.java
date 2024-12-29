package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.internal.measurement.C1114gc;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.gms.measurement.internal.s3 */
public final class C1775s3 extends C1561b4 {

    /* renamed from: c */
    private String f2638c;

    /* renamed from: d */
    private String f2639d;

    /* renamed from: e */
    private int f2640e;

    /* renamed from: f */
    private String f2641f;

    /* renamed from: g */
    private long f2642g;

    /* renamed from: h */
    private final long f2643h;

    /* renamed from: i */
    private List f2644i;

    /* renamed from: j */
    private String f2645j;

    /* renamed from: k */
    private int f2646k;

    /* renamed from: l */
    private String f2647l;

    /* renamed from: m */
    private String f2648m;

    /* renamed from: n */
    private String f2649n;

    /* renamed from: o */
    private long f2650o = 0;

    /* renamed from: p */
    private String f2651p = null;

    C1775s3(C1717n5 n5Var, long j) {
        super(n5Var);
        this.f2643h = j;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x013e A[Catch:{ IllegalStateException -> 0x018e }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0147 A[Catch:{ IllegalStateException -> 0x018e }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x016f A[Catch:{ IllegalStateException -> 0x018e }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ff  */
    @androidx.annotation.WorkerThread
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14023l() {
        /*
            r11 = this;
            com.google.android.gms.measurement.internal.n5 r0 = r11.f2143a
            android.content.Context r0 = r0.mo14231f()
            java.lang.String r0 = r0.getPackageName()
            com.google.android.gms.measurement.internal.n5 r1 = r11.f2143a
            android.content.Context r1 = r1.mo14231f()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "Unknown"
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r4 = ""
            r5 = 0
            java.lang.String r6 = "unknown"
            if (r1 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.n5 r7 = r11.f2143a
            com.google.android.gms.measurement.internal.c4 r7 = r7.mo14228b()
            com.google.android.gms.measurement.internal.z3 r7 = r7.mo14035r()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.mo14694b(r9, r8)
            goto L_0x0099
        L_0x0034:
            java.lang.String r6 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x0039 }
            goto L_0x004c
        L_0x0039:
            com.google.android.gms.measurement.internal.n5 r7 = r11.f2143a
            com.google.android.gms.measurement.internal.c4 r7 = r7.mo14228b()
            com.google.android.gms.measurement.internal.z3 r7 = r7.mo14035r()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.mo14694b(r9, r8)
        L_0x004c:
            if (r6 != 0) goto L_0x0051
            java.lang.String r6 = "manual_install"
            goto L_0x005a
        L_0x0051:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x005a
            r6 = r4
        L_0x005a:
            com.google.android.gms.measurement.internal.n5 r7 = r11.f2143a     // Catch:{ NameNotFoundException -> 0x0084 }
            android.content.Context r7 = r7.mo14231f()     // Catch:{ NameNotFoundException -> 0x0084 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0084 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r5)     // Catch:{ NameNotFoundException -> 0x0084 }
            if (r7 == 0) goto L_0x0099
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0084 }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0084 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0084 }
            if (r9 != 0) goto L_0x007b
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0084 }
            goto L_0x007c
        L_0x007b:
            r8 = r2
        L_0x007c:
            java.lang.String r2 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0081 }
            int r3 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0081 }
            goto L_0x0099
        L_0x0081:
            r7 = r2
            r2 = r8
            goto L_0x0085
        L_0x0084:
            r7 = r2
        L_0x0085:
            com.google.android.gms.measurement.internal.n5 r8 = r11.f2143a
            com.google.android.gms.measurement.internal.c4 r8 = r8.mo14228b()
            com.google.android.gms.measurement.internal.z3 r8 = r8.mo14035r()
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.mo14695c(r10, r9, r2)
            r2 = r7
        L_0x0099:
            r11.f2638c = r0
            r11.f2641f = r6
            r11.f2639d = r2
            r11.f2640e = r3
            r2 = 0
            r11.f2642g = r2
            com.google.android.gms.measurement.internal.n5 r2 = r11.f2143a
            java.lang.String r2 = r2.mo14383O()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 1
            if (r2 != 0) goto L_0x00c2
            com.google.android.gms.measurement.internal.n5 r2 = r11.f2143a
            java.lang.String r2 = r2.mo14384P()
            java.lang.String r6 = "am"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x00c2
            r2 = 1
            goto L_0x00c3
        L_0x00c2:
            r2 = 0
        L_0x00c3:
            com.google.android.gms.measurement.internal.n5 r6 = r11.f2143a
            int r6 = r6.mo14400x()
            com.google.android.gms.measurement.internal.n5 r7 = r11.f2143a
            com.google.android.gms.measurement.internal.c4 r7 = r7.mo14228b()
            switch(r6) {
                case 0: goto L_0x010a;
                case 1: goto L_0x0103;
                case 2: goto L_0x00fc;
                case 3: goto L_0x00f5;
                case 4: goto L_0x00ee;
                case 5: goto L_0x00e7;
                case 6: goto L_0x00e0;
                case 7: goto L_0x00d9;
                default: goto L_0x00d2;
            }
        L_0x00d2:
            com.google.android.gms.measurement.internal.z3 r7 = r7.mo14038u()
            java.lang.String r8 = "App measurement disabled due to denied storage consent"
            goto L_0x0110
        L_0x00d9:
            com.google.android.gms.measurement.internal.z3 r7 = r7.mo14038u()
            java.lang.String r8 = "App measurement disabled via the global data collection setting"
            goto L_0x0110
        L_0x00e0:
            com.google.android.gms.measurement.internal.z3 r7 = r7.mo14041x()
            java.lang.String r8 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            goto L_0x0110
        L_0x00e7:
            com.google.android.gms.measurement.internal.z3 r7 = r7.mo14039v()
            java.lang.String r8 = "App measurement disabled via the init parameters"
            goto L_0x0110
        L_0x00ee:
            com.google.android.gms.measurement.internal.z3 r7 = r7.mo14038u()
            java.lang.String r8 = "App measurement disabled via the manifest"
            goto L_0x0110
        L_0x00f5:
            com.google.android.gms.measurement.internal.z3 r7 = r7.mo14038u()
            java.lang.String r8 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            goto L_0x0110
        L_0x00fc:
            com.google.android.gms.measurement.internal.z3 r7 = r7.mo14039v()
            java.lang.String r8 = "App measurement deactivated via the init parameters"
            goto L_0x0110
        L_0x0103:
            com.google.android.gms.measurement.internal.z3 r7 = r7.mo14038u()
            java.lang.String r8 = "App measurement deactivated via the manifest"
            goto L_0x0110
        L_0x010a:
            com.google.android.gms.measurement.internal.z3 r7 = r7.mo14039v()
            java.lang.String r8 = "App measurement collection enabled"
        L_0x0110:
            r7.mo14693a(r8)
            r11.f2647l = r4
            r11.f2648m = r4
            com.google.android.gms.measurement.internal.n5 r7 = r11.f2143a
            r7.mo14230d()
            if (r2 == 0) goto L_0x0126
            com.google.android.gms.measurement.internal.n5 r2 = r11.f2143a
            java.lang.String r2 = r2.mo14383O()
            r11.f2648m = r2
        L_0x0126:
            com.google.android.gms.measurement.internal.n5 r2 = r11.f2143a     // Catch:{ IllegalStateException -> 0x018e }
            android.content.Context r2 = r2.mo14231f()     // Catch:{ IllegalStateException -> 0x018e }
            com.google.android.gms.measurement.internal.n5 r7 = r11.f2143a     // Catch:{ IllegalStateException -> 0x018e }
            java.lang.String r7 = r7.mo14386R()     // Catch:{ IllegalStateException -> 0x018e }
            java.lang.String r8 = "google_app_id"
            java.lang.String r2 = com.google.android.gms.measurement.internal.C1863z7.m4908b(r2, r8, r7)     // Catch:{ IllegalStateException -> 0x018e }
            boolean r7 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalStateException -> 0x018e }
            if (r3 == r7) goto L_0x013f
            r4 = r2
        L_0x013f:
            r11.f2647l = r4     // Catch:{ IllegalStateException -> 0x018e }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalStateException -> 0x018e }
            if (r2 != 0) goto L_0x016d
            com.google.android.gms.measurement.internal.n5 r2 = r11.f2143a     // Catch:{ IllegalStateException -> 0x018e }
            android.content.Context r2 = r2.mo14231f()     // Catch:{ IllegalStateException -> 0x018e }
            com.google.android.gms.measurement.internal.n5 r3 = r11.f2143a     // Catch:{ IllegalStateException -> 0x018e }
            java.lang.String r3 = r3.mo14386R()     // Catch:{ IllegalStateException -> 0x018e }
            com.google.android.gms.common.internal.C0917i.m1419j(r2)     // Catch:{ IllegalStateException -> 0x018e }
            android.content.res.Resources r4 = r2.getResources()     // Catch:{ IllegalStateException -> 0x018e }
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IllegalStateException -> 0x018e }
            if (r7 != 0) goto L_0x0161
            goto L_0x0165
        L_0x0161:
            java.lang.String r3 = com.google.android.gms.measurement.internal.C1627g5.m4241a(r2)     // Catch:{ IllegalStateException -> 0x018e }
        L_0x0165:
            java.lang.String r2 = "admob_app_id"
            java.lang.String r2 = com.google.android.gms.measurement.internal.C1627g5.m4242b(r2, r4, r3)     // Catch:{ IllegalStateException -> 0x018e }
            r11.f2648m = r2     // Catch:{ IllegalStateException -> 0x018e }
        L_0x016d:
            if (r6 != 0) goto L_0x01a2
            com.google.android.gms.measurement.internal.n5 r2 = r11.f2143a     // Catch:{ IllegalStateException -> 0x018e }
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo14228b()     // Catch:{ IllegalStateException -> 0x018e }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14039v()     // Catch:{ IllegalStateException -> 0x018e }
            java.lang.String r3 = "App measurement enabled for app package, google app id"
            java.lang.String r4 = r11.f2638c     // Catch:{ IllegalStateException -> 0x018e }
            java.lang.String r6 = r11.f2647l     // Catch:{ IllegalStateException -> 0x018e }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x018e }
            if (r6 == 0) goto L_0x0188
            java.lang.String r6 = r11.f2648m     // Catch:{ IllegalStateException -> 0x018e }
            goto L_0x018a
        L_0x0188:
            java.lang.String r6 = r11.f2647l     // Catch:{ IllegalStateException -> 0x018e }
        L_0x018a:
            r2.mo14695c(r3, r4, r6)     // Catch:{ IllegalStateException -> 0x018e }
            goto L_0x01a2
        L_0x018e:
            r2 = move-exception
            com.google.android.gms.measurement.internal.n5 r3 = r11.f2143a
            com.google.android.gms.measurement.internal.c4 r3 = r3.mo14228b()
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo14035r()
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r0)
            java.lang.String r4 = "Fetching Google App Id failed with exception. appId"
            r3.mo14695c(r4, r0, r2)
        L_0x01a2:
            r0 = 0
            r11.f2644i = r0
            com.google.android.gms.measurement.internal.n5 r0 = r11.f2143a
            r0.mo14230d()
            com.google.android.gms.measurement.internal.n5 r0 = r11.f2143a
            com.google.android.gms.measurement.internal.g r0 = r0.mo14402z()
            java.lang.String r2 = "analytics.safelisted_events"
            java.util.List r0 = r0.mo14184y(r2)
            if (r0 != 0) goto L_0x01b9
            goto L_0x01ee
        L_0x01b9:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x01cf
            com.google.android.gms.measurement.internal.n5 r0 = r11.f2143a
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14041x()
            java.lang.String r2 = "Safelisted event list is empty. Ignoring"
            r0.mo14693a(r2)
            goto L_0x01f0
        L_0x01cf:
            java.util.Iterator r2 = r0.iterator()
        L_0x01d3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01ee
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.measurement.internal.n5 r4 = r11.f2143a
            com.google.android.gms.measurement.internal.ya r4 = r4.mo14382N()
            java.lang.String r6 = "safelisted event"
            boolean r3 = r4.mo14660Q(r6, r3)
            if (r3 != 0) goto L_0x01d3
            goto L_0x01f0
        L_0x01ee:
            r11.f2644i = r0
        L_0x01f0:
            if (r1 == 0) goto L_0x01ff
            com.google.android.gms.measurement.internal.n5 r0 = r11.f2143a
            android.content.Context r0 = r0.mo14231f()
            boolean r0 = p028e0.C3142a.m8396a(r0)
            r11.f2646k = r0
            return
        L_0x01ff:
            r11.f2646k = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1775s3.mo14023l():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo14025n() {
        return true;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: o */
    public final int mo14504o() {
        mo14020i();
        return this.f2646k;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: p */
    public final int mo14505p() {
        mo14020i();
        return this.f2640e;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0269  */
    @androidx.annotation.WorkerThread
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzq mo14506q(java.lang.String r37) {
        /*
            r36 = this;
            r1 = r36
            r36.mo14009h()
            com.google.android.gms.measurement.internal.zzq r33 = new com.google.android.gms.measurement.internal.zzq
            java.lang.String r3 = r36.mo14508s()
            java.lang.String r4 = r36.mo14509t()
            r36.mo14020i()
            java.lang.String r5 = r1.f2639d
            r36.mo14020i()
            int r0 = r1.f2640e
            long r6 = (long) r0
            r36.mo14020i()
            java.lang.String r0 = r1.f2641f
            com.google.android.gms.common.internal.C0917i.m1419j(r0)
            java.lang.String r8 = r1.f2641f
            com.google.android.gms.measurement.internal.n5 r0 = r1.f2143a
            com.google.android.gms.measurement.internal.g r0 = r0.mo14402z()
            r0.mo14176q()
            r36.mo14020i()
            r36.mo14009h()
            long r9 = r1.f2642g
            r2 = 0
            r11 = 0
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x00d0
            com.google.android.gms.measurement.internal.n5 r0 = r1.f2143a
            com.google.android.gms.measurement.internal.ya r9 = r0.mo14382N()
            com.google.android.gms.measurement.internal.n5 r0 = r1.f2143a
            android.content.Context r0 = r0.mo14231f()
            com.google.android.gms.measurement.internal.n5 r10 = r1.f2143a
            android.content.Context r10 = r10.mo14231f()
            java.lang.String r10 = r10.getPackageName()
            r9.mo14009h()
            com.google.android.gms.common.internal.C0917i.m1419j(r0)
            com.google.android.gms.common.internal.C0917i.m1415f(r10)
            android.content.pm.PackageManager r13 = r0.getPackageManager()
            java.security.MessageDigest r14 = com.google.android.gms.measurement.internal.C1854ya.m4843t()
            r15 = -1
            if (r14 != 0) goto L_0x0078
            com.google.android.gms.measurement.internal.n5 r0 = r9.f2143a
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14035r()
            java.lang.String r9 = "Could not get MD5 instance"
            r0.mo14693a(r9)
        L_0x0076:
            r9 = r15
            goto L_0x00ce
        L_0x0078:
            if (r13 == 0) goto L_0x00cd
            boolean r10 = r9.mo14665V(r0, r10)     // Catch:{ NameNotFoundException -> 0x00bd }
            if (r10 != 0) goto L_0x00bb
            e0.b r0 = p028e0.C3144c.m8403a(r0)     // Catch:{ NameNotFoundException -> 0x00bd }
            com.google.android.gms.measurement.internal.n5 r10 = r9.f2143a     // Catch:{ NameNotFoundException -> 0x00bd }
            android.content.Context r10 = r10.mo14231f()     // Catch:{ NameNotFoundException -> 0x00bd }
            java.lang.String r10 = r10.getPackageName()     // Catch:{ NameNotFoundException -> 0x00bd }
            r13 = 64
            android.content.pm.PackageInfo r0 = r0.mo23629d(r10, r13)     // Catch:{ NameNotFoundException -> 0x00bd }
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x00bd }
            if (r0 == 0) goto L_0x00ab
            int r10 = r0.length     // Catch:{ NameNotFoundException -> 0x00bd }
            if (r10 <= 0) goto L_0x00ab
            r0 = r0[r2]     // Catch:{ NameNotFoundException -> 0x00bd }
            byte[] r0 = r0.toByteArray()     // Catch:{ NameNotFoundException -> 0x00bd }
            byte[] r0 = r14.digest(r0)     // Catch:{ NameNotFoundException -> 0x00bd }
            long r9 = com.google.android.gms.measurement.internal.C1854ya.m4842q0(r0)     // Catch:{ NameNotFoundException -> 0x00bd }
            r15 = r9
            goto L_0x0076
        L_0x00ab:
            com.google.android.gms.measurement.internal.n5 r0 = r9.f2143a     // Catch:{ NameNotFoundException -> 0x00bd }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()     // Catch:{ NameNotFoundException -> 0x00bd }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14040w()     // Catch:{ NameNotFoundException -> 0x00bd }
            java.lang.String r10 = "Could not get signatures"
            r0.mo14693a(r10)     // Catch:{ NameNotFoundException -> 0x00bd }
            goto L_0x0076
        L_0x00bb:
            r15 = r11
            goto L_0x0076
        L_0x00bd:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n5 r9 = r9.f2143a
            com.google.android.gms.measurement.internal.c4 r9 = r9.mo14228b()
            com.google.android.gms.measurement.internal.z3 r9 = r9.mo14035r()
            java.lang.String r10 = "Package name not found"
            r9.mo14694b(r10, r0)
        L_0x00cd:
            r9 = r11
        L_0x00ce:
            r1.f2642g = r9
        L_0x00d0:
            r13 = r9
            com.google.android.gms.measurement.internal.n5 r0 = r1.f2143a
            boolean r0 = r0.mo14395o()
            com.google.android.gms.measurement.internal.n5 r9 = r1.f2143a
            com.google.android.gms.measurement.internal.r4 r9 = r9.mo14375F()
            boolean r9 = r9.f2574p
            r10 = 1
            r15 = r9 ^ 1
            r36.mo14009h()
            com.google.android.gms.measurement.internal.n5 r9 = r1.f2143a
            boolean r9 = r9.mo14395o()
            r11 = 0
            if (r9 != 0) goto L_0x00f2
        L_0x00ee:
            r20 = r11
            goto L_0x0175
        L_0x00f2:
            com.google.android.gms.internal.measurement.C1020ae.m1694b()
            com.google.android.gms.measurement.internal.n5 r9 = r1.f2143a
            com.google.android.gms.measurement.internal.g r9 = r9.mo14402z()
            com.google.android.gms.measurement.internal.n3 r12 = com.google.android.gms.measurement.internal.C1727o3.f2434c0
            boolean r9 = r9.mo14163B(r11, r12)
            if (r9 == 0) goto L_0x0113
            com.google.android.gms.measurement.internal.n5 r9 = r1.f2143a
            com.google.android.gms.measurement.internal.c4 r9 = r9.mo14228b()
            com.google.android.gms.measurement.internal.z3 r9 = r9.mo14039v()
            java.lang.String r12 = "Disabled IID for tests."
            r9.mo14693a(r12)
            goto L_0x00ee
        L_0x0113:
            com.google.android.gms.measurement.internal.n5 r9 = r1.f2143a     // Catch:{ ClassNotFoundException -> 0x0173 }
            android.content.Context r9 = r9.mo14231f()     // Catch:{ ClassNotFoundException -> 0x0173 }
            java.lang.ClassLoader r9 = r9.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0173 }
            java.lang.String r12 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r9 = r9.loadClass(r12)     // Catch:{ ClassNotFoundException -> 0x0173 }
            if (r9 != 0) goto L_0x0126
            goto L_0x00ee
        L_0x0126:
            java.lang.Class[] r12 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0164 }
            java.lang.Class<android.content.Context> r18 = android.content.Context.class
            r12[r2] = r18     // Catch:{ Exception -> 0x0164 }
            java.lang.String r11 = "getInstance"
            java.lang.reflect.Method r11 = r9.getDeclaredMethod(r11, r12)     // Catch:{ Exception -> 0x0164 }
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0164 }
            com.google.android.gms.measurement.internal.n5 r10 = r1.f2143a     // Catch:{ Exception -> 0x0164 }
            android.content.Context r10 = r10.mo14231f()     // Catch:{ Exception -> 0x0164 }
            r12[r2] = r10     // Catch:{ Exception -> 0x0164 }
            r10 = 0
            java.lang.Object r11 = r11.invoke(r10, r12)     // Catch:{ Exception -> 0x0164 }
            if (r11 != 0) goto L_0x0144
            goto L_0x0173
        L_0x0144:
            java.lang.String r10 = "getFirebaseInstanceId"
            java.lang.Class[] r12 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0157 }
            java.lang.reflect.Method r9 = r9.getDeclaredMethod(r10, r12)     // Catch:{ Exception -> 0x0157 }
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0157 }
            java.lang.Object r9 = r9.invoke(r11, r10)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0157 }
            r20 = r9
            goto L_0x0175
        L_0x0157:
            com.google.android.gms.measurement.internal.n5 r9 = r1.f2143a
            com.google.android.gms.measurement.internal.c4 r9 = r9.mo14228b()
            com.google.android.gms.measurement.internal.z3 r9 = r9.mo14041x()
            java.lang.String r10 = "Failed to retrieve Firebase Instance Id"
            goto L_0x0170
        L_0x0164:
            com.google.android.gms.measurement.internal.n5 r9 = r1.f2143a
            com.google.android.gms.measurement.internal.c4 r9 = r9.mo14228b()
            com.google.android.gms.measurement.internal.z3 r9 = r9.mo14042y()
            java.lang.String r10 = "Failed to obtain Firebase Analytics instance"
        L_0x0170:
            r9.mo14693a(r10)
        L_0x0173:
            r20 = 0
        L_0x0175:
            com.google.android.gms.measurement.internal.n5 r9 = r1.f2143a
            com.google.android.gms.measurement.internal.r4 r10 = r9.mo14375F()
            com.google.android.gms.measurement.internal.n4 r10 = r10.f2563e
            long r10 = r10.mo14368a()
            r16 = 0
            int r12 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r12 != 0) goto L_0x018d
            long r9 = r9.f2340G
            r12 = r3
            r22 = r9
            goto L_0x0196
        L_0x018d:
            r12 = r3
            long r2 = r9.f2340G
            long r2 = java.lang.Math.min(r2, r10)
            r22 = r2
        L_0x0196:
            r36.mo14020i()
            int r11 = r1.f2646k
            com.google.android.gms.measurement.internal.n5 r2 = r1.f2143a
            com.google.android.gms.measurement.internal.g r2 = r2.mo14402z()
            boolean r24 = r2.mo14162A()
            com.google.android.gms.measurement.internal.n5 r2 = r1.f2143a
            com.google.android.gms.measurement.internal.r4 r2 = r2.mo14375F()
            r2.mo14009h()
            android.content.SharedPreferences r2 = r2.mo14445o()
            java.lang.String r3 = "deferred_analytics_collection"
            r9 = 0
            boolean r25 = r2.getBoolean(r3, r9)
            r36.mo14020i()
            java.lang.String r3 = r1.f2648m
            com.google.android.gms.measurement.internal.n5 r2 = r1.f2143a
            com.google.android.gms.measurement.internal.g r2 = r2.mo14402z()
            java.lang.String r9 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r2 = r2.mo14179t(r9)
            if (r2 != 0) goto L_0x01cf
            r26 = 0
            goto L_0x01db
        L_0x01cf:
            boolean r2 = r2.booleanValue()
            r9 = 1
            r2 = r2 ^ r9
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r26 = r2
        L_0x01db:
            long r9 = r1.f2643h
            java.util.List r2 = r1.f2644i
            r19 = r2
            com.google.android.gms.measurement.internal.n5 r2 = r1.f2143a
            com.google.android.gms.measurement.internal.r4 r2 = r2.mo14375F()
            com.google.android.gms.measurement.internal.h r2 = r2.mo14447q()
            java.lang.String r30 = r2.mo14219h()
            java.lang.String r2 = r1.f2645j
            if (r2 != 0) goto L_0x0216
            com.google.android.gms.measurement.internal.n5 r2 = r1.f2143a
            com.google.android.gms.measurement.internal.g r2 = r2.mo14402z()
            r21 = r3
            com.google.android.gms.measurement.internal.n3 r3 = com.google.android.gms.measurement.internal.C1727o3.f2413L0
            r27 = r9
            r9 = 0
            boolean r2 = r2.mo14163B(r9, r3)
            if (r2 == 0) goto L_0x0211
            com.google.android.gms.measurement.internal.n5 r2 = r1.f2143a
            com.google.android.gms.measurement.internal.ya r2 = r2.mo14382N()
            java.lang.String r2 = r2.mo14677q()
            goto L_0x0213
        L_0x0211:
            java.lang.String r2 = ""
        L_0x0213:
            r1.f2645j = r2
            goto L_0x021a
        L_0x0216:
            r21 = r3
            r27 = r9
        L_0x021a:
            java.lang.String r3 = r1.f2645j
            com.google.android.gms.internal.measurement.C1338ud.m3082b()
            com.google.android.gms.measurement.internal.n5 r2 = r1.f2143a
            com.google.android.gms.measurement.internal.g r2 = r2.mo14402z()
            com.google.android.gms.measurement.internal.n3 r9 = com.google.android.gms.measurement.internal.C1727o3.f2403G0
            r10 = 0
            boolean r2 = r2.mo14163B(r10, r9)
            if (r2 == 0) goto L_0x0269
            r36.mo14009h()
            long r9 = r1.f2650o
            r16 = 0
            int r2 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x023c
            r16 = r3
            goto L_0x025d
        L_0x023c:
            com.google.android.gms.measurement.internal.n5 r2 = r1.f2143a
            c0.e r2 = r2.mo14229c()
            long r9 = r2.mo11029a()
            r16 = r3
            long r2 = r1.f2650o
            long r9 = r9 - r2
            java.lang.String r2 = r1.f2649n
            if (r2 == 0) goto L_0x025d
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            int r17 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r17 <= 0) goto L_0x025d
            java.lang.String r2 = r1.f2651p
            if (r2 != 0) goto L_0x025d
            r36.mo14511v()
        L_0x025d:
            java.lang.String r2 = r1.f2649n
            if (r2 != 0) goto L_0x0264
            r36.mo14511v()
        L_0x0264:
            java.lang.String r2 = r1.f2649n
            r32 = r2
            goto L_0x026d
        L_0x0269:
            r16 = r3
            r32 = r10
        L_0x026d:
            r9 = 64000(0xfa00, double:3.162E-319)
            r17 = 0
            r29 = 0
            r31 = r19
            r2 = r33
            r35 = r16
            r34 = r21
            r3 = r12
            r21 = r11
            r11 = r13
            r13 = r37
            r14 = r0
            r16 = r20
            r19 = r22
            r22 = r24
            r23 = r25
            r24 = r34
            r25 = r26
            r26 = r27
            r28 = r31
            r31 = r35
            r2.<init>((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (long) r6, (java.lang.String) r8, (long) r9, (long) r11, (java.lang.String) r13, (boolean) r14, (boolean) r15, (java.lang.String) r16, (long) r17, (long) r19, (int) r21, (boolean) r22, (boolean) r23, (java.lang.String) r24, (java.lang.Boolean) r25, (long) r26, (java.util.List) r28, (java.lang.String) r29, (java.lang.String) r30, (java.lang.String) r31, (java.lang.String) r32)
            return r33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1775s3.mo14506q(java.lang.String):com.google.android.gms.measurement.internal.zzq");
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: r */
    public final String mo14507r() {
        mo14020i();
        return this.f2648m;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: s */
    public final String mo14508s() {
        mo14020i();
        C0917i.m1419j(this.f2638c);
        return this.f2638c;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: t */
    public final String mo14509t() {
        C1114gc.m2025b();
        if (this.f2143a.mo14402z().mo14163B((String) null, C1727o3.f2448j0)) {
            mo14009h();
        }
        mo14020i();
        C0917i.m1419j(this.f2647l);
        return this.f2647l;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: u */
    public final List mo14510u() {
        return this.f2644i;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: v */
    public final void mo14511v() {
        String str;
        mo14009h();
        if (!this.f2143a.mo14375F().mo14447q().mo14221i(zzah.ANALYTICS_STORAGE)) {
            this.f2143a.mo14228b().mo14034q().mo14693a("Analytics Storage consent is not granted");
            str = null;
        } else {
            byte[] bArr = new byte[16];
            this.f2143a.mo14382N().mo14683u().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
        }
        C1859z3 q = this.f2143a.mo14228b().mo14034q();
        Object[] objArr = new Object[1];
        objArr[0] = str == null ? "null" : "not null";
        q.mo14693a(String.format("Resetting session stitching token to %s", objArr));
        this.f2649n = str;
        this.f2650o = this.f2143a.mo14229c().mo11029a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final boolean mo14512w(String str) {
        String str2 = this.f2651p;
        boolean z = false;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        }
        this.f2651p = str;
        return z;
    }
}
