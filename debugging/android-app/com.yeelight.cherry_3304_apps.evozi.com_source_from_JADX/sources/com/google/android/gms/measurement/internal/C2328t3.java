package com.google.android.gms.measurement.internal;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1773ec;
import com.google.android.gms.internal.measurement.C1832ia;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.t3 */
public final class C2328t3 extends C2133c3 {

    /* renamed from: c */
    private String f4602c;

    /* renamed from: d */
    private String f4603d;

    /* renamed from: e */
    private int f4604e;

    /* renamed from: f */
    private String f4605f;

    /* renamed from: g */
    private long f4606g;

    /* renamed from: h */
    private long f4607h;

    /* renamed from: i */
    private List<String> f4608i;

    /* renamed from: j */
    private int f4609j;

    /* renamed from: k */
    private String f4610k;

    /* renamed from: l */
    private String f4611l;

    /* renamed from: m */
    private String f4612m;

    C2328t3(C2111a5 a5Var, long j) {
        super(a5Var);
        this.f4607h = j;
    }

    @WorkerThread
    @VisibleForTesting
    /* renamed from: K */
    private final String m7627K() {
        C2383y3 K;
        String str;
        if (!C1773ec.m5044a() || !mo13112m().mo12474s(C2302r.f4538s0)) {
            try {
                Class<?> loadClass = mo12428c().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (loadClass == null) {
                    return null;
                }
                try {
                    Object invoke = loadClass.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{mo12428c()});
                    if (invoke == null) {
                        return null;
                    }
                    try {
                        return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                    } catch (Exception unused) {
                        K = mo12427b().mo13101L();
                        str = "Failed to retrieve Firebase Instance Id";
                    }
                } catch (Exception unused2) {
                    K = mo12427b().mo13100K();
                    str = "Failed to obtain Firebase Analytics instance";
                }
            } catch (ClassNotFoundException unused3) {
                return null;
            }
        } else {
            K = mo12427b().mo13104O();
            str = "Disabled IID for tests.";
            K.mo13130a(str);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final boolean mo12534A() {
        return true;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: B */
    public final zzm mo12981B(String str) {
        long j;
        boolean z;
        mo12567h();
        mo12566d();
        String C = mo12982C();
        String D = mo12983D();
        mo12537x();
        String str2 = this.f4603d;
        long G = (long) mo12986G();
        mo12537x();
        String str3 = this.f4605f;
        long C2 = mo13112m().mo12457C();
        mo12537x();
        mo12567h();
        if (this.f4606g == 0) {
            this.f4606g = this.f4689a.mo12412G().mo12977w(mo12428c(), mo12428c().getPackageName());
        }
        long j2 = this.f4606g;
        boolean p = this.f4689a.mo12436p();
        boolean z2 = !mo13111l().f4240w;
        mo12567h();
        mo12566d();
        String K = !this.f4689a.mo12436p() ? null : m7627K();
        C2111a5 a5Var = this.f4689a;
        Long valueOf = Long.valueOf(a5Var.mo12406A().f4227j.mo12849a());
        int i = (valueOf.longValue() > 0 ? 1 : (valueOf.longValue() == 0 ? 0 : -1));
        long j3 = a5Var.f3916F;
        if (i == 0) {
            j = j3;
            z = p;
        } else {
            z = p;
            j = Math.min(j3, valueOf.longValue());
        }
        int H = mo12987H();
        boolean booleanValue = mo13112m().mo12463J().booleanValue();
        C2117b m = mo13112m();
        m.mo12566d();
        Boolean x = m.mo12479x("google_analytics_ssaid_collection_enabled");
        boolean booleanValue2 = Boolean.valueOf(x == null || x.booleanValue()).booleanValue();
        C2218j4 l = mo13111l();
        l.mo12567h();
        boolean z3 = l.mo12755B().getBoolean("deferred_analytics_collection", false);
        String E = mo12984E();
        Boolean x2 = mo13112m().mo12479x("google_analytics_default_allow_ad_personalization_signals");
        return new zzm(C, D, str2, G, str3, C2, j2, str, z, z2, K, 0, j, H, booleanValue, booleanValue2, z3, E, x2 == null ? null : Boolean.valueOf(!x2.booleanValue()), this.f4607h, mo13112m().mo12474s(C2302r.f4508d0) ? this.f4608i : null, (!C1832ia.m5256a() || !mo13112m().mo12474s(C2302r.f4532p0)) ? null : mo12985F());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final String mo12982C() {
        mo12537x();
        return this.f4602c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final String mo12983D() {
        mo12537x();
        return this.f4610k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final String mo12984E() {
        mo12537x();
        return this.f4611l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final String mo12985F() {
        mo12537x();
        return this.f4612m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final int mo12986G() {
        mo12537x();
        return this.f4604e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final int mo12987H() {
        mo12537x();
        return this.f4609j;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: J */
    public final List<String> mo12988J() {
        return this.f4608i;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x017f A[Catch:{ IllegalStateException -> 0x0211 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x018f A[Catch:{ IllegalStateException -> 0x0211 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0199 A[Catch:{ IllegalStateException -> 0x0211 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x019b A[Catch:{ IllegalStateException -> 0x0211 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01a6 A[SYNTHETIC, Splitter:B:76:0x01a6] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01e4 A[Catch:{ IllegalStateException -> 0x0211 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01f4 A[Catch:{ IllegalStateException -> 0x0211 }] */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12535v() {
        /*
            r11 = this;
            android.content.Context r0 = r11.mo12428c()
            java.lang.String r0 = r0.getPackageName()
            android.content.Context r1 = r11.mo12428c()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "Unknown"
            java.lang.String r3 = ""
            r4 = 0
            java.lang.String r5 = "unknown"
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L_0x002d
            com.google.android.gms.measurement.internal.w3 r7 = r11.mo12427b()
            com.google.android.gms.measurement.internal.y3 r7 = r7.mo13096F()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.mo13131b(r9, r8)
            goto L_0x008c
        L_0x002d:
            java.lang.String r5 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x0032 }
            goto L_0x0043
        L_0x0032:
            com.google.android.gms.measurement.internal.w3 r7 = r11.mo12427b()
            com.google.android.gms.measurement.internal.y3 r7 = r7.mo13096F()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.mo13131b(r9, r8)
        L_0x0043:
            if (r5 != 0) goto L_0x0048
            java.lang.String r5 = "manual_install"
            goto L_0x0051
        L_0x0048:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x0051
            r5 = r3
        L_0x0051:
            android.content.Context r7 = r11.mo12428c()     // Catch:{ NameNotFoundException -> 0x0079 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0079 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r4)     // Catch:{ NameNotFoundException -> 0x0079 }
            if (r7 == 0) goto L_0x008c
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0079 }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0079 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0079 }
            if (r9 != 0) goto L_0x0070
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0079 }
            goto L_0x0071
        L_0x0070:
            r8 = r2
        L_0x0071:
            java.lang.String r2 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0076 }
            int r6 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0076 }
            goto L_0x008c
        L_0x0076:
            r7 = r2
            r2 = r8
            goto L_0x007a
        L_0x0079:
            r7 = r2
        L_0x007a:
            com.google.android.gms.measurement.internal.w3 r8 = r11.mo12427b()
            com.google.android.gms.measurement.internal.y3 r8 = r8.mo13096F()
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.mo13132c(r10, r9, r2)
            r2 = r7
        L_0x008c:
            r11.f4602c = r0
            r11.f4605f = r5
            r11.f4603d = r2
            r11.f4604e = r6
            r5 = 0
            r11.f4606g = r5
            r11.mo12414I()
            android.content.Context r2 = r11.mo12428c()
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.internal.C1433f.m3826c(r2)
            r5 = 1
            if (r2 == 0) goto L_0x00ae
            boolean r6 = r2.mo10776T()
            if (r6 == 0) goto L_0x00ae
            r6 = 1
            goto L_0x00af
        L_0x00ae:
            r6 = 0
        L_0x00af:
            com.google.android.gms.measurement.internal.a5 r7 = r11.f4689a
            java.lang.String r7 = r7.mo12417L()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x00cb
            com.google.android.gms.measurement.internal.a5 r7 = r11.f4689a
            java.lang.String r7 = r7.mo12418M()
            java.lang.String r8 = "am"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x00cb
            r7 = 1
            goto L_0x00cc
        L_0x00cb:
            r7 = 0
        L_0x00cc:
            r6 = r6 | r7
            if (r6 != 0) goto L_0x00f8
            if (r2 != 0) goto L_0x00df
            com.google.android.gms.measurement.internal.w3 r2 = r11.mo12427b()
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo13097G()
            java.lang.String r8 = "GoogleService failed to initialize (no status)"
            r2.mo13130a(r8)
            goto L_0x00f8
        L_0x00df:
            com.google.android.gms.measurement.internal.w3 r8 = r11.mo12427b()
            com.google.android.gms.measurement.internal.y3 r8 = r8.mo13097G()
            int r9 = r2.mo10773Q()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r2 = r2.mo10774R()
            java.lang.String r10 = "GoogleService failed to initialize, status"
            r8.mo13132c(r10, r9, r2)
        L_0x00f8:
            if (r6 == 0) goto L_0x0159
            com.google.android.gms.measurement.internal.a5 r2 = r11.f4689a
            int r2 = r2.mo12437q()
            com.google.android.gms.measurement.internal.w3 r6 = r11.mo12427b()
            switch(r2) {
                case 0: goto L_0x014c;
                case 1: goto L_0x0145;
                case 2: goto L_0x013e;
                case 3: goto L_0x0137;
                case 4: goto L_0x0130;
                case 5: goto L_0x0129;
                case 6: goto L_0x0122;
                case 7: goto L_0x011b;
                default: goto L_0x0107;
            }
        L_0x0107:
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo13102M()
            java.lang.String r8 = "App measurement disabled"
            r6.mo13130a(r8)
            com.google.android.gms.measurement.internal.w3 r6 = r11.mo12427b()
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo13097G()
            java.lang.String r8 = "Invalid scion state in identity"
            goto L_0x0152
        L_0x011b:
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo13102M()
            java.lang.String r8 = "App measurement disabled via the global data collection setting"
            goto L_0x0152
        L_0x0122:
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo13101L()
            java.lang.String r8 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            goto L_0x0152
        L_0x0129:
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo13104O()
            java.lang.String r8 = "App measurement disabled via the init parameters"
            goto L_0x0152
        L_0x0130:
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo13102M()
            java.lang.String r8 = "App measurement disabled via the manifest"
            goto L_0x0152
        L_0x0137:
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo13102M()
            java.lang.String r8 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            goto L_0x0152
        L_0x013e:
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo13104O()
            java.lang.String r8 = "App measurement deactivated via the init parameters"
            goto L_0x0152
        L_0x0145:
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo13102M()
            java.lang.String r8 = "App measurement deactivated via the manifest"
            goto L_0x0152
        L_0x014c:
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo13104O()
            java.lang.String r8 = "App measurement collection enabled"
        L_0x0152:
            r6.mo13130a(r8)
            if (r2 != 0) goto L_0x0159
            r2 = 1
            goto L_0x015a
        L_0x0159:
            r2 = 0
        L_0x015a:
            r11.f4610k = r3
            r11.f4611l = r3
            r11.f4612m = r3
            r11.mo12414I()
            if (r7 == 0) goto L_0x016d
            com.google.android.gms.measurement.internal.a5 r6 = r11.f4689a
            java.lang.String r6 = r6.mo12417L()
            r11.f4611l = r6
        L_0x016d:
            boolean r6 = com.google.android.gms.internal.measurement.C2085yb.m6615a()     // Catch:{ IllegalStateException -> 0x0211 }
            if (r6 == 0) goto L_0x018f
            com.google.android.gms.measurement.internal.b r6 = r11.mo13112m()     // Catch:{ IllegalStateException -> 0x0211 }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C2302r.f4488P0     // Catch:{ IllegalStateException -> 0x0211 }
            boolean r6 = r6.mo12474s(r7)     // Catch:{ IllegalStateException -> 0x0211 }
            if (r6 == 0) goto L_0x018f
            android.content.Context r6 = r11.mo12428c()     // Catch:{ IllegalStateException -> 0x0211 }
            java.lang.String r7 = "google_app_id"
            com.google.android.gms.common.internal.w r8 = new com.google.android.gms.common.internal.w     // Catch:{ IllegalStateException -> 0x0211 }
            r8.<init>(r6)     // Catch:{ IllegalStateException -> 0x0211 }
            java.lang.String r6 = r8.mo11290a(r7)     // Catch:{ IllegalStateException -> 0x0211 }
            goto L_0x0193
        L_0x018f:
            java.lang.String r6 = com.google.android.gms.common.api.internal.C1433f.m3825b()     // Catch:{ IllegalStateException -> 0x0211 }
        L_0x0193:
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x0211 }
            if (r7 == 0) goto L_0x019b
            r7 = r3
            goto L_0x019c
        L_0x019b:
            r7 = r6
        L_0x019c:
            r11.f4610k = r7     // Catch:{ IllegalStateException -> 0x0211 }
            boolean r7 = com.google.android.gms.internal.measurement.C1832ia.m5256a()     // Catch:{ IllegalStateException -> 0x0211 }
            java.lang.String r8 = "admob_app_id"
            if (r7 == 0) goto L_0x01de
            com.google.android.gms.measurement.internal.b r7 = r11.mo13112m()     // Catch:{ IllegalStateException -> 0x0211 }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C2302r.f4532p0     // Catch:{ IllegalStateException -> 0x0211 }
            boolean r7 = r7.mo12474s(r9)     // Catch:{ IllegalStateException -> 0x0211 }
            if (r7 == 0) goto L_0x01de
            com.google.android.gms.common.internal.w r7 = new com.google.android.gms.common.internal.w     // Catch:{ IllegalStateException -> 0x0211 }
            android.content.Context r9 = r11.mo12428c()     // Catch:{ IllegalStateException -> 0x0211 }
            r7.<init>(r9)     // Catch:{ IllegalStateException -> 0x0211 }
            java.lang.String r9 = "ga_app_id"
            java.lang.String r9 = r7.mo11290a(r9)     // Catch:{ IllegalStateException -> 0x0211 }
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IllegalStateException -> 0x0211 }
            if (r10 == 0) goto L_0x01c8
            goto L_0x01c9
        L_0x01c8:
            r3 = r9
        L_0x01c9:
            r11.f4612m = r3     // Catch:{ IllegalStateException -> 0x0211 }
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x0211 }
            if (r3 == 0) goto L_0x01d7
            boolean r3 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IllegalStateException -> 0x0211 }
            if (r3 != 0) goto L_0x01f2
        L_0x01d7:
            java.lang.String r3 = r7.mo11290a(r8)     // Catch:{ IllegalStateException -> 0x0211 }
        L_0x01db:
            r11.f4611l = r3     // Catch:{ IllegalStateException -> 0x0211 }
            goto L_0x01f2
        L_0x01de:
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x0211 }
            if (r3 != 0) goto L_0x01f2
            com.google.android.gms.common.internal.w r3 = new com.google.android.gms.common.internal.w     // Catch:{ IllegalStateException -> 0x0211 }
            android.content.Context r6 = r11.mo12428c()     // Catch:{ IllegalStateException -> 0x0211 }
            r3.<init>(r6)     // Catch:{ IllegalStateException -> 0x0211 }
            java.lang.String r3 = r3.mo11290a(r8)     // Catch:{ IllegalStateException -> 0x0211 }
            goto L_0x01db
        L_0x01f2:
            if (r2 == 0) goto L_0x0223
            com.google.android.gms.measurement.internal.w3 r2 = r11.mo12427b()     // Catch:{ IllegalStateException -> 0x0211 }
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo13104O()     // Catch:{ IllegalStateException -> 0x0211 }
            java.lang.String r3 = "App measurement enabled for app package, google app id"
            java.lang.String r6 = r11.f4602c     // Catch:{ IllegalStateException -> 0x0211 }
            java.lang.String r7 = r11.f4610k     // Catch:{ IllegalStateException -> 0x0211 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x0211 }
            if (r7 == 0) goto L_0x020b
            java.lang.String r7 = r11.f4611l     // Catch:{ IllegalStateException -> 0x0211 }
            goto L_0x020d
        L_0x020b:
            java.lang.String r7 = r11.f4610k     // Catch:{ IllegalStateException -> 0x0211 }
        L_0x020d:
            r2.mo13132c(r3, r6, r7)     // Catch:{ IllegalStateException -> 0x0211 }
            goto L_0x0223
        L_0x0211:
            r2 = move-exception
            com.google.android.gms.measurement.internal.w3 r3 = r11.mo12427b()
            com.google.android.gms.measurement.internal.y3 r3 = r3.mo13096F()
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r0)
            java.lang.String r6 = "Fetching Google App Id failed with exception. appId"
            r3.mo13132c(r6, r0, r2)
        L_0x0223:
            r0 = 0
            r11.f4608i = r0
            com.google.android.gms.measurement.internal.b r0 = r11.mo13112m()
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C2302r.f4508d0
            boolean r0 = r0.mo12474s(r2)
            if (r0 == 0) goto L_0x0277
            r11.mo12414I()
            com.google.android.gms.measurement.internal.b r0 = r11.mo13112m()
            java.lang.String r2 = "analytics.safelisted_events"
            java.util.List r0 = r0.mo12455A(r2)
            if (r0 == 0) goto L_0x0273
            int r2 = r0.size()
            if (r2 != 0) goto L_0x0256
            com.google.android.gms.measurement.internal.w3 r2 = r11.mo12427b()
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo13101L()
            java.lang.String r3 = "Safelisted event list is empty. Ignoring"
            r2.mo13130a(r3)
        L_0x0254:
            r5 = 0
            goto L_0x0273
        L_0x0256:
            java.util.Iterator r2 = r0.iterator()
        L_0x025a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0273
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.measurement.internal.s9 r6 = r11.mo13110k()
            java.lang.String r7 = "safelisted event"
            boolean r3 = r6.mo12974s0(r7, r3)
            if (r3 != 0) goto L_0x025a
            goto L_0x0254
        L_0x0273:
            if (r5 == 0) goto L_0x0277
            r11.f4608i = r0
        L_0x0277:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r0 < r2) goto L_0x028d
            if (r1 == 0) goto L_0x028a
            android.content.Context r0 = r11.mo12428c()
            boolean r0 = com.google.android.gms.common.p105j.C1618a.m4492a(r0)
            r11.f4609j = r0
            return
        L_0x028a:
            r11.f4609j = r4
            return
        L_0x028d:
            r11.f4609j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2328t3.mo12535v():void");
    }
}
