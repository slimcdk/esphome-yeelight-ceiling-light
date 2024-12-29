package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.C0961b;
import com.google.android.gms.common.util.VisibleForTesting;
import com.miot.service.manager.timer.TimerCodec;
import java.lang.reflect.InvocationTargetException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p028e0.C3144c;

/* renamed from: com.google.android.gms.measurement.internal.g */
public final class C1621g extends C1641h6 {

    /* renamed from: b */
    private Boolean f2097b;

    /* renamed from: c */
    private C1608f f2098c = C1595e.f2046a;

    /* renamed from: d */
    private Boolean f2099d;

    C1621g(C1717n5 n5Var) {
        super(n5Var);
    }

    /* renamed from: I */
    public static final long m4214I() {
        return ((Long) C1727o3.f2435d.mo14366a((Object) null)).longValue();
    }

    /* renamed from: i */
    public static final long m4215i() {
        return ((Long) C1727o3.f2396D.mo14366a((Object) null)).longValue();
    }

    /* renamed from: j */
    private final String m4216j(String str, String str2) {
        C1859z3 z3Var;
        String str3;
        Class<String> cls = String.class;
        try {
            String str4 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, ""});
            C0917i.m1419j(str4);
            return str4;
        } catch (ClassNotFoundException e) {
            e = e;
            z3Var = this.f2143a.mo14228b().mo14035r();
            str3 = "Could not find SystemProperties class";
            z3Var.mo14694b(str3, e);
            return "";
        } catch (NoSuchMethodException e2) {
            e = e2;
            z3Var = this.f2143a.mo14228b().mo14035r();
            str3 = "Could not find SystemProperties.get() method";
            z3Var.mo14694b(str3, e);
            return "";
        } catch (IllegalAccessException e3) {
            e = e3;
            z3Var = this.f2143a.mo14228b().mo14035r();
            str3 = "Could not access SystemProperties.get()";
            z3Var.mo14694b(str3, e);
            return "";
        } catch (InvocationTargetException e4) {
            e = e4;
            z3Var = this.f2143a.mo14228b().mo14035r();
            str3 = "SystemProperties.get() threw an exception";
            z3Var.mo14694b(str3, e);
            return "";
        }
    }

    /* renamed from: A */
    public final boolean mo14162A() {
        Boolean t = mo14179t("google_analytics_adid_collection_enabled");
        return t == null || t.booleanValue();
    }

    @WorkerThread
    /* renamed from: B */
    public final boolean mo14163B(String str, C1715n3 n3Var) {
        Object a;
        if (str != null) {
            String e = this.f2098c.mo14122e(str, n3Var.mo14367b());
            if (!TextUtils.isEmpty(e)) {
                a = n3Var.mo14366a(Boolean.valueOf(TimerCodec.ENABLE.equals(e)));
                return ((Boolean) a).booleanValue();
            }
        }
        a = n3Var.mo14366a((Object) null);
        return ((Boolean) a).booleanValue();
    }

    /* renamed from: C */
    public final boolean mo14164C(String str) {
        return TimerCodec.ENABLE.equals(this.f2098c.mo14122e(str, "gaia_collection_enabled"));
    }

    /* renamed from: D */
    public final boolean mo14165D() {
        Boolean t = mo14179t("google_analytics_automatic_screen_reporting_enabled");
        return t == null || t.booleanValue();
    }

    /* renamed from: E */
    public final boolean mo14166E() {
        this.f2143a.mo14230d();
        Boolean t = mo14179t("firebase_analytics_collection_deactivated");
        return t != null && t.booleanValue();
    }

    /* renamed from: F */
    public final boolean mo14167F(String str) {
        return TimerCodec.ENABLE.equals(this.f2098c.mo14122e(str, "measurement.event_sampling_enabled"));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: G */
    public final boolean mo14168G() {
        if (this.f2097b == null) {
            Boolean t = mo14179t("app_measurement_lite");
            this.f2097b = t;
            if (t == null) {
                this.f2097b = Boolean.FALSE;
            }
        }
        return this.f2097b.booleanValue() || !this.f2143a.mo14399s();
    }

    @EnsuresNonNull({"this.isMainProcess"})
    /* renamed from: H */
    public final boolean mo14169H() {
        if (this.f2099d == null) {
            synchronized (this) {
                if (this.f2099d == null) {
                    ApplicationInfo applicationInfo = this.f2143a.mo14231f().getApplicationInfo();
                    String a = C0961b.m1589a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(a)) {
                            z = true;
                        }
                        this.f2099d = Boolean.valueOf(z);
                    }
                    if (this.f2099d == null) {
                        this.f2099d = Boolean.TRUE;
                        this.f2143a.mo14228b().mo14035r().mo14693a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f2099d.booleanValue();
    }

    @WorkerThread
    /* renamed from: k */
    public final double mo14170k(String str, C1715n3 n3Var) {
        if (str != null) {
            String e = this.f2098c.mo14122e(str, n3Var.mo14367b());
            if (!TextUtils.isEmpty(e)) {
                try {
                    return ((Double) n3Var.mo14366a(Double.valueOf(Double.parseDouble(e)))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Double) n3Var.mo14366a((Object) null)).doubleValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final int mo14171l(@Size(min = 1) String str) {
        return mo14175p(str, C1727o3.f2404H, 500, 2000);
    }

    /* renamed from: m */
    public final int mo14172m() {
        C1854ya N = this.f2143a.mo14382N();
        Boolean J = N.f2143a.mo14380L().mo14270J();
        if (N.mo14674o0() < 201500) {
            return (J == null || J.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    /* renamed from: n */
    public final int mo14173n(@Size(min = 1) String str) {
        return mo14175p(str, C1727o3.f2406I, 25, 100);
    }

    @WorkerThread
    /* renamed from: o */
    public final int mo14174o(String str, C1715n3 n3Var) {
        if (str != null) {
            String e = this.f2098c.mo14122e(str, n3Var.mo14367b());
            if (!TextUtils.isEmpty(e)) {
                try {
                    return ((Integer) n3Var.mo14366a(Integer.valueOf(Integer.parseInt(e)))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Integer) n3Var.mo14366a((Object) null)).intValue();
    }

    @WorkerThread
    /* renamed from: p */
    public final int mo14175p(String str, C1715n3 n3Var, int i, int i2) {
        return Math.max(Math.min(mo14174o(str, n3Var), i2), i);
    }

    /* renamed from: q */
    public final long mo14176q() {
        this.f2143a.mo14230d();
        return 64000;
    }

    @WorkerThread
    /* renamed from: r */
    public final long mo14177r(String str, C1715n3 n3Var) {
        if (str != null) {
            String e = this.f2098c.mo14122e(str, n3Var.mo14367b());
            if (!TextUtils.isEmpty(e)) {
                try {
                    return ((Long) n3Var.mo14366a(Long.valueOf(Long.parseLong(e)))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Long) n3Var.mo14366a((Object) null)).longValue();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: s */
    public final Bundle mo14178s() {
        try {
            if (this.f2143a.mo14231f().getPackageManager() == null) {
                this.f2143a.mo14228b().mo14035r().mo14693a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo b = C3144c.m8403a(this.f2143a.mo14231f()).mo23627b(this.f2143a.mo14231f().getPackageName(), 128);
            if (b != null) {
                return b.metaData;
            }
            this.f2143a.mo14228b().mo14035r().mo14693a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            this.f2143a.mo14228b().mo14035r().mo14694b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: t */
    public final Boolean mo14179t(@Size(min = 1) String str) {
        C0917i.m1415f(str);
        Bundle s = mo14178s();
        if (s == null) {
            this.f2143a.mo14228b().mo14035r().mo14693a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!s.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(s.getBoolean(str));
        }
    }

    /* renamed from: u */
    public final String mo14180u() {
        return m4216j("debug.firebase.analytics.app", "");
    }

    /* renamed from: v */
    public final String mo14181v() {
        return m4216j("debug.deferred.deeplink", "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final String mo14182w() {
        this.f2143a.mo14230d();
        return "FA";
    }

    @WorkerThread
    /* renamed from: x */
    public final String mo14183x(String str, C1715n3 n3Var) {
        return (String) n3Var.mo14366a(str == null ? null : this.f2098c.mo14122e(str, n3Var.mo14367b()));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e A[SYNTHETIC, Splitter:B:8:0x002e] */
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo14184y(@androidx.annotation.Size(min = 1) java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.C0917i.m1415f(r4)
            android.os.Bundle r0 = r3.mo14178s()
            r1 = 0
            if (r0 != 0) goto L_0x001d
            com.google.android.gms.measurement.internal.n5 r4 = r3.f2143a
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo14228b()
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo14035r()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.mo14693a(r0)
        L_0x001b:
            r4 = r1
            goto L_0x002c
        L_0x001d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x0024
            goto L_0x001b
        L_0x0024:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x002c:
            if (r4 == 0) goto L_0x0058
            com.google.android.gms.measurement.internal.n5 r0 = r3.f2143a     // Catch:{ NotFoundException -> 0x0048 }
            android.content.Context r0 = r0.mo14231f()     // Catch:{ NotFoundException -> 0x0048 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0048 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0048 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0048 }
            if (r4 != 0) goto L_0x0043
            return r1
        L_0x0043:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0048 }
            return r4
        L_0x0048:
            r4 = move-exception
            com.google.android.gms.measurement.internal.n5 r0 = r3.f2143a
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14035r()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.mo14694b(r2, r4)
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1621g.mo14184y(java.lang.String):java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo14185z(C1608f fVar) {
        this.f2098c = fVar;
    }
}
