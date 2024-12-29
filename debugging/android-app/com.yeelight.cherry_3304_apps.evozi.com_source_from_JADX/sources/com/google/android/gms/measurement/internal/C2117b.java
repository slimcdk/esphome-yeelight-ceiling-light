package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.p105j.C1620c;
import com.google.android.gms.common.util.C1661o;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1973r8;
import com.google.android.gms.internal.measurement.C2099za;
import com.miot.service.manager.timer.TimerCodec;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.measurement.internal.b */
public final class C2117b extends C2363w5 {

    /* renamed from: b */
    private Boolean f3956b;
    @NonNull

    /* renamed from: c */
    private C2141d f3957c = C2212ia.f4206a;

    /* renamed from: d */
    private Boolean f3958d;

    C2117b(C2111a5 a5Var) {
        super(a5Var);
    }

    /* renamed from: M */
    public static long m6762M() {
        return C2302r.f4463D.mo12867a(null).longValue();
    }

    /* renamed from: N */
    public static long m6763N() {
        return C2302r.f4507d.mo12867a(null).longValue();
    }

    @Nullable
    @VisibleForTesting
    /* renamed from: R */
    private final Bundle m6764R() {
        try {
            if (mo12428c().getPackageManager() == null) {
                mo12427b().mo13096F().mo13130a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c = C1620c.m4502a(mo12428c()).mo11301c(mo12428c().getPackageName(), 128);
            if (c != null) {
                return c.metaData;
            }
            mo12427b().mo13096F().mo13130a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            mo12427b().mo13096F().mo13131b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* renamed from: e */
    private final String m6765e(String str, String str2) {
        String str3;
        C2383y3 y3Var;
        Class<String> cls = String.class;
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, str2});
        } catch (ClassNotFoundException e) {
            e = e;
            y3Var = mo12427b().mo13096F();
            str3 = "Could not find SystemProperties class";
            y3Var.mo13131b(str3, e);
            return str2;
        } catch (NoSuchMethodException e2) {
            e = e2;
            y3Var = mo12427b().mo13096F();
            str3 = "Could not find SystemProperties.get() method";
            y3Var.mo13131b(str3, e);
            return str2;
        } catch (IllegalAccessException e3) {
            e = e3;
            y3Var = mo12427b().mo13096F();
            str3 = "Could not access SystemProperties.get()";
            y3Var.mo13131b(str3, e);
            return str2;
        } catch (InvocationTargetException e4) {
            e = e4;
            y3Var = mo12427b().mo13096F();
            str3 = "SystemProperties.get() threw an exception";
            y3Var.mo13131b(str3, e);
            return str2;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b A[SYNTHETIC, Splitter:B:9:0x002b] */
    @androidx.annotation.Nullable
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> mo12455A(@androidx.annotation.Size(min = 1) java.lang.String r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.C1609u.m4471g(r4)
            android.os.Bundle r0 = r3.m6764R()
            r1 = 0
            if (r0 != 0) goto L_0x0019
            com.google.android.gms.measurement.internal.w3 r4 = r3.mo12427b()
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo13096F()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.mo13130a(r0)
        L_0x0017:
            r4 = r1
            goto L_0x0028
        L_0x0019:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x0020
            goto L_0x0017
        L_0x0020:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x0028:
            if (r4 != 0) goto L_0x002b
            return r1
        L_0x002b:
            android.content.Context r0 = r3.mo12428c()     // Catch:{ NotFoundException -> 0x0043 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0043 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0043 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0043 }
            if (r4 != 0) goto L_0x003e
            return r1
        L_0x003e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0043 }
            return r4
        L_0x0043:
            r4 = move-exception
            com.google.android.gms.measurement.internal.w3 r0 = r3.mo12427b()
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13096F()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.mo13131b(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2117b.mo12455A(java.lang.String):java.util.List");
    }

    /* renamed from: B */
    public final boolean mo12456B(String str, C2284p3<Boolean> p3Var) {
        return mo12480y(str, p3Var);
    }

    /* renamed from: C */
    public final long mo12457C() {
        mo12414I();
        return 27000;
    }

    /* renamed from: D */
    public final boolean mo12458D(String str) {
        return TimerCodec.ENABLE.equals(this.f3957c.mo12565e(str, "gaia_collection_enabled"));
    }

    /* renamed from: E */
    public final boolean mo12459E() {
        if (this.f3958d == null) {
            synchronized (this) {
                if (this.f3958d == null) {
                    ApplicationInfo applicationInfo = mo12428c().getApplicationInfo();
                    String a = C1661o.m4611a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f3958d = Boolean.valueOf(str != null && str.equals(a));
                    }
                    if (this.f3958d == null) {
                        this.f3958d = Boolean.TRUE;
                        mo12427b().mo13096F().mo13130a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f3958d.booleanValue();
    }

    /* renamed from: F */
    public final boolean mo12460F(String str) {
        return TimerCodec.ENABLE.equals(this.f3957c.mo12565e(str, "measurement.event_sampling_enabled"));
    }

    /* renamed from: G */
    public final boolean mo12461G() {
        mo12414I();
        Boolean x = mo12479x("firebase_analytics_collection_deactivated");
        return x != null && x.booleanValue();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: H */
    public final boolean mo12462H(String str) {
        return mo12480y(str, C2302r.f4477K);
    }

    /* renamed from: J */
    public final Boolean mo12463J() {
        mo12566d();
        Boolean x = mo12479x("google_analytics_adid_collection_enabled");
        return Boolean.valueOf(x == null || x.booleanValue());
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: K */
    public final String mo12464K(String str) {
        C2284p3<String> p3Var = C2302r.f4479L;
        return p3Var.mo12867a(str == null ? null : this.f3957c.mo12565e(str, p3Var.mo12868b()));
    }

    /* renamed from: L */
    public final Boolean mo12465L() {
        mo12566d();
        if (!C2099za.m6677a() || !mo12474s(C2302r.f4464D0)) {
            return Boolean.TRUE;
        }
        Boolean x = mo12479x("google_analytics_automatic_screen_reporting_enabled");
        return Boolean.valueOf(x == null || x.booleanValue());
    }

    /* renamed from: O */
    public final String mo12466O() {
        return m6765e("debug.firebase.analytics.app", "");
    }

    /* renamed from: P */
    public final String mo12467P() {
        return m6765e("debug.deferred.deeplink", "");
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: Q */
    public final boolean mo12468Q() {
        if (this.f3956b == null) {
            Boolean x = mo12479x("app_measurement_lite");
            this.f3956b = x;
            if (x == null) {
                this.f3956b = Boolean.FALSE;
            }
        }
        return this.f3956b.booleanValue() || !this.f4689a.mo12420O();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final int mo12469n(@Size(min = 1) String str) {
        if (!C1973r8.m5912a() || !mo12480y((String) null, C2302r.f4480L0)) {
            return 500;
        }
        return mo12470o(str, C2302r.f4471H, 500, 2000);
    }

    @WorkerThread
    /* renamed from: o */
    public final int mo12470o(String str, @NonNull C2284p3<Integer> p3Var, int i, int i2) {
        return Math.max(Math.min(mo12476u(str, p3Var), i2), i);
    }

    @WorkerThread
    /* renamed from: p */
    public final long mo12471p(String str, @NonNull C2284p3<Long> p3Var) {
        if (str != null) {
            String e = this.f3957c.mo12565e(str, p3Var.mo12868b());
            if (!TextUtils.isEmpty(e)) {
                try {
                    return p3Var.mo12867a(Long.valueOf(Long.parseLong(e))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return p3Var.mo12867a(null).longValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x002f;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo12472q(com.google.android.gms.measurement.internal.C2147d5 r6) {
        /*
            r5 = this;
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = r6.mo12576A()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0033
            boolean r1 = com.google.android.gms.internal.measurement.C1832ia.m5256a()
            if (r1 == 0) goto L_0x002f
            com.google.android.gms.measurement.internal.b r1 = r5.mo13112m()
            java.lang.String r2 = r6.mo12634t()
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C2302r.f4532p0
            boolean r1 = r1.mo12480y(r2, r3)
            if (r1 == 0) goto L_0x002f
            java.lang.String r1 = r6.mo12582G()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0033
        L_0x002f:
            java.lang.String r1 = r6.mo12579D()
        L_0x0033:
            com.google.android.gms.measurement.internal.p3<java.lang.String> r2 = com.google.android.gms.measurement.internal.C2302r.f4509e
            r3 = 0
            java.lang.Object r2 = r2.mo12867a(r3)
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri$Builder r2 = r0.scheme(r2)
            com.google.android.gms.measurement.internal.p3<java.lang.String> r4 = com.google.android.gms.measurement.internal.C2302r.f4511f
            java.lang.Object r3 = r4.mo12867a(r3)
            java.lang.String r3 = (java.lang.String) r3
            android.net.Uri$Builder r2 = r2.encodedAuthority(r3)
            java.lang.String r3 = "config/app/"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r4 = r1.length()
            if (r4 == 0) goto L_0x005d
            java.lang.String r1 = r3.concat(r1)
            goto L_0x0062
        L_0x005d:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L_0x0062:
            android.net.Uri$Builder r1 = r2.path(r1)
            java.lang.String r6 = r6.mo12638x()
            java.lang.String r2 = "app_instance_id"
            android.net.Uri$Builder r6 = r1.appendQueryParameter(r2, r6)
            java.lang.String r1 = "platform"
            java.lang.String r2 = "android"
            android.net.Uri$Builder r6 = r6.appendQueryParameter(r1, r2)
            long r1 = r5.mo12457C()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "gmp_version"
            r6.appendQueryParameter(r2, r1)
            android.net.Uri r6 = r0.build()
            java.lang.String r6 = r6.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2117b.mo12472q(com.google.android.gms.measurement.internal.d5):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo12473r(@NonNull C2141d dVar) {
        this.f3957c = dVar;
    }

    /* renamed from: s */
    public final boolean mo12474s(C2284p3<Boolean> p3Var) {
        return mo12480y((String) null, p3Var);
    }

    @WorkerThread
    /* renamed from: t */
    public final int mo12475t(@Size(min = 1) String str) {
        return mo12476u(str, C2302r.f4529o);
    }

    @WorkerThread
    /* renamed from: u */
    public final int mo12476u(String str, @NonNull C2284p3<Integer> p3Var) {
        if (str != null) {
            String e = this.f3957c.mo12565e(str, p3Var.mo12868b());
            if (!TextUtils.isEmpty(e)) {
                try {
                    return p3Var.mo12867a(Integer.valueOf(Integer.parseInt(e))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return p3Var.mo12867a(null).intValue();
    }

    @WorkerThread
    /* renamed from: v */
    public final double mo12477v(String str, @NonNull C2284p3<Double> p3Var) {
        if (str != null) {
            String e = this.f3957c.mo12565e(str, p3Var.mo12868b());
            if (!TextUtils.isEmpty(e)) {
                try {
                    return p3Var.mo12867a(Double.valueOf(Double.parseDouble(e))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return p3Var.mo12867a(null).doubleValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final int mo12478w(@Size(min = 1) String str) {
        if (!C1973r8.m5912a() || !mo12480y((String) null, C2302r.f4480L0)) {
            return 25;
        }
        return mo12470o(str, C2302r.f4469G, 25, 100);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    @VisibleForTesting
    /* renamed from: x */
    public final Boolean mo12479x(@Size(min = 1) String str) {
        C1609u.m4471g(str);
        Bundle R = m6764R();
        if (R == null) {
            mo12427b().mo13096F().mo13130a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!R.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(R.getBoolean(str));
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.measurement.internal.p3<java.lang.Boolean>, com.google.android.gms.measurement.internal.p3] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.WorkerThread
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo12480y(java.lang.String r4, @androidx.annotation.NonNull com.google.android.gms.measurement.internal.C2284p3<java.lang.Boolean> r5) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x000e
        L_0x0003:
            java.lang.Object r4 = r5.mo12867a(r0)
        L_0x0007:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L_0x000e:
            com.google.android.gms.measurement.internal.d r1 = r3.f3957c
            java.lang.String r2 = r5.mo12868b()
            java.lang.String r4 = r1.mo12565e(r4, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L_0x001f
            goto L_0x0003
        L_0x001f:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r4 = r5.mo12867a(r4)
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2117b.mo12480y(java.lang.String, com.google.android.gms.measurement.internal.p3):boolean");
    }

    /* renamed from: z */
    public final int mo12481z() {
        return (!C1973r8.m5912a() || !mo13112m().mo12480y((String) null, C2302r.f4482M0) || mo13110k().mo12952I0() < 2147483) ? 25 : 100;
    }
}
