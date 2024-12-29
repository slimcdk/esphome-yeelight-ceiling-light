package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.C0879d;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.C0956a;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1119h1;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@VisibleForTesting
/* renamed from: com.google.android.gms.measurement.internal.j9 */
public final class C1670j9 extends C1561b4 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1657i9 f2203c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C1763r3 f2204d;

    /* renamed from: e */
    private volatile Boolean f2205e;

    /* renamed from: f */
    private final C1723o f2206f;

    /* renamed from: g */
    private final C1554aa f2207g;

    /* renamed from: h */
    private final List f2208h = new ArrayList();

    /* renamed from: i */
    private final C1723o f2209i;

    protected C1670j9(C1717n5 n5Var) {
        super(n5Var);
        this.f2207g = new C1554aa(n5Var.mo14229c());
        this.f2203c = new C1657i9(this);
        this.f2206f = new C1780s8(this, n5Var);
        this.f2209i = new C1804u8(this, n5Var);
    }

    @WorkerThread
    /* renamed from: C */
    private final zzq m4340C(boolean z) {
        Pair a;
        this.f2143a.mo14230d();
        C1775s3 B = this.f2143a.mo14371B();
        String str = null;
        if (z) {
            C1574c4 b = this.f2143a.mo14228b();
            if (!(b.f2143a.mo14375F().f2562d == null || (a = b.f2143a.mo14375F().f2562d.mo14419a()) == null || a == C1764r4.f2560x)) {
                str = String.valueOf(a.second) + Constants.COLON_SEPARATOR + ((String) a.first);
            }
        }
        return B.mo14506q(str);
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: D */
    public final void m4341D() {
        mo14009h();
        this.f2143a.mo14228b().mo14039v().mo14694b("Processing queued up service tasks", Integer.valueOf(this.f2208h.size()));
        for (Runnable run : this.f2208h) {
            try {
                run.run();
            } catch (RuntimeException e) {
                this.f2143a.mo14228b().mo14035r().mo14694b("Task exception while flushing queue", e);
            }
        }
        this.f2208h.clear();
        this.f2209i.mo14406b();
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: E */
    public final void m4342E() {
        mo14009h();
        this.f2207g.mo14015b();
        C1723o oVar = this.f2206f;
        this.f2143a.mo14402z();
        oVar.mo14407d(((Long) C1727o3.f2408J.mo14366a((Object) null)).longValue());
    }

    @WorkerThread
    /* renamed from: F */
    private final void m4343F(Runnable runnable) {
        mo14009h();
        if (mo14291z()) {
            runnable.run();
            return;
        }
        int size = this.f2208h.size();
        this.f2143a.mo14402z();
        if (((long) size) >= 1000) {
            this.f2143a.mo14228b().mo14035r().mo14693a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f2208h.add(runnable);
        this.f2209i.mo14407d(60000);
        mo14272P();
    }

    /* renamed from: G */
    private final boolean m4344G() {
        this.f2143a.mo14230d();
        return true;
    }

    /* renamed from: M */
    static /* bridge */ /* synthetic */ void m4349M(C1670j9 j9Var, ComponentName componentName) {
        j9Var.mo14009h();
        if (j9Var.f2204d != null) {
            j9Var.f2204d = null;
            j9Var.f2143a.mo14228b().mo14039v().mo14694b("Disconnected from device MeasurementService", componentName);
            j9Var.mo14009h();
            j9Var.mo14272P();
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: A */
    public final boolean mo14268A() {
        mo14009h();
        mo14020i();
        return !mo14269B() || this.f2143a.mo14382N().mo14674o0() >= ((Integer) C1727o3.f2446i0.mo14366a((Object) null)).intValue();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0123  */
    @androidx.annotation.WorkerThread
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14269B() {
        /*
            r6 = this;
            r6.mo14009h()
            r6.mo14020i()
            java.lang.Boolean r0 = r6.f2205e
            if (r0 != 0) goto L_0x0143
            r6.mo14009h()
            r6.mo14020i()
            com.google.android.gms.measurement.internal.n5 r0 = r6.f2143a
            com.google.android.gms.measurement.internal.r4 r0 = r0.mo14375F()
            r0.mo14009h()
            android.content.SharedPreferences r1 = r0.mo14445o()
            java.lang.String r2 = "use_service"
            boolean r1 = r1.contains(r2)
            r3 = 0
            if (r1 != 0) goto L_0x0028
            r0 = 0
            goto L_0x0034
        L_0x0028:
            android.content.SharedPreferences r0 = r0.mo14445o()
            boolean r0 = r0.getBoolean(r2, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0034:
            r1 = 1
            if (r0 == 0) goto L_0x003f
            boolean r4 = r0.booleanValue()
            if (r4 == 0) goto L_0x003f
            goto L_0x013d
        L_0x003f:
            com.google.android.gms.measurement.internal.n5 r4 = r6.f2143a
            r4.mo14230d()
            com.google.android.gms.measurement.internal.n5 r4 = r6.f2143a
            com.google.android.gms.measurement.internal.s3 r4 = r4.mo14371B()
            int r4 = r4.mo14504o()
            if (r4 != r1) goto L_0x0053
        L_0x0050:
            r3 = 1
            goto L_0x0105
        L_0x0053:
            com.google.android.gms.measurement.internal.n5 r4 = r6.f2143a
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo14228b()
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo14039v()
            java.lang.String r5 = "Checking service availability"
            r4.mo14693a(r5)
            com.google.android.gms.measurement.internal.n5 r4 = r6.f2143a
            com.google.android.gms.measurement.internal.ya r4 = r4.mo14382N()
            r5 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r4 = r4.mo14676p0(r5)
            if (r4 == 0) goto L_0x00f4
            if (r4 == r1) goto L_0x00e4
            r5 = 2
            if (r4 == r5) goto L_0x00c0
            r0 = 3
            if (r4 == r0) goto L_0x00af
            r0 = 9
            if (r4 == r0) goto L_0x00a2
            r0 = 18
            if (r4 == r0) goto L_0x0095
            com.google.android.gms.measurement.internal.n5 r0 = r6.f2143a
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14040w()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "Unexpected service status"
            r0.mo14694b(r4, r1)
            goto L_0x00be
        L_0x0095:
            com.google.android.gms.measurement.internal.n5 r0 = r6.f2143a
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14040w()
            java.lang.String r3 = "Service updating"
            goto L_0x0100
        L_0x00a2:
            com.google.android.gms.measurement.internal.n5 r0 = r6.f2143a
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14040w()
            java.lang.String r1 = "Service invalid"
            goto L_0x00bb
        L_0x00af:
            com.google.android.gms.measurement.internal.n5 r0 = r6.f2143a
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14040w()
            java.lang.String r1 = "Service disabled"
        L_0x00bb:
            r0.mo14693a(r1)
        L_0x00be:
            r1 = 0
            goto L_0x0105
        L_0x00c0:
            com.google.android.gms.measurement.internal.n5 r4 = r6.f2143a
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo14228b()
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo14034q()
            java.lang.String r5 = "Service container out of date"
            r4.mo14693a(r5)
            com.google.android.gms.measurement.internal.n5 r4 = r6.f2143a
            com.google.android.gms.measurement.internal.ya r4 = r4.mo14382N()
            int r4 = r4.mo14674o0()
            r5 = 17443(0x4423, float:2.4443E-41)
            if (r4 >= r5) goto L_0x00de
            goto L_0x0105
        L_0x00de:
            if (r0 != 0) goto L_0x00e1
            goto L_0x00e2
        L_0x00e1:
            r1 = 0
        L_0x00e2:
            r3 = r1
            goto L_0x00be
        L_0x00e4:
            com.google.android.gms.measurement.internal.n5 r0 = r6.f2143a
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14039v()
            java.lang.String r4 = "Service missing"
            r0.mo14693a(r4)
            goto L_0x0105
        L_0x00f4:
            com.google.android.gms.measurement.internal.n5 r0 = r6.f2143a
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14039v()
            java.lang.String r3 = "Service available"
        L_0x0100:
            r0.mo14693a(r3)
            goto L_0x0050
        L_0x0105:
            if (r3 != 0) goto L_0x0123
            com.google.android.gms.measurement.internal.n5 r0 = r6.f2143a
            com.google.android.gms.measurement.internal.g r0 = r0.mo14402z()
            boolean r0 = r0.mo14168G()
            if (r0 == 0) goto L_0x0123
            com.google.android.gms.measurement.internal.n5 r0 = r6.f2143a
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14035r()
            java.lang.String r1 = "No way to upload. Consider using the full version of Analytics"
            r0.mo14693a(r1)
            goto L_0x013c
        L_0x0123:
            if (r1 == 0) goto L_0x013c
            com.google.android.gms.measurement.internal.n5 r0 = r6.f2143a
            com.google.android.gms.measurement.internal.r4 r0 = r0.mo14375F()
            r0.mo14009h()
            android.content.SharedPreferences r0 = r0.mo14445o()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r2, r3)
            r0.apply()
        L_0x013c:
            r1 = r3
        L_0x013d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6.f2205e = r0
        L_0x0143:
            java.lang.Boolean r0 = r6.f2205e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1670j9.mo14269B():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final Boolean mo14270J() {
        return this.f2205e;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: O */
    public final void mo14271O() {
        mo14009h();
        mo14020i();
        zzq C = m4340C(true);
        this.f2143a.mo14372C().mo14596r();
        m4343F(new C1744p8(this, C));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: P */
    public final void mo14272P() {
        mo14009h();
        mo14020i();
        if (!mo14291z()) {
            if (mo14269B()) {
                this.f2203c.mo14248d();
            } else if (!this.f2143a.mo14402z().mo14168G()) {
                this.f2143a.mo14230d();
                List<ResolveInfo> queryIntentServices = this.f2143a.mo14231f().getPackageManager().queryIntentServices(new Intent().setClassName(this.f2143a.mo14231f(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                    this.f2143a.mo14228b().mo14035r().mo14693a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                Context f = this.f2143a.mo14231f();
                this.f2143a.mo14230d();
                intent.setComponent(new ComponentName(f, "com.google.android.gms.measurement.AppMeasurementService"));
                this.f2203c.mo14247b(intent);
            }
        }
    }

    @WorkerThread
    /* renamed from: Q */
    public final void mo14273Q() {
        mo14009h();
        mo14020i();
        this.f2203c.mo14249g();
        try {
            C0956a.m1580b().mo12424c(this.f2143a.mo14231f(), this.f2203c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f2204d = null;
    }

    @WorkerThread
    /* renamed from: R */
    public final void mo14274R(C1119h1 h1Var) {
        mo14009h();
        mo14020i();
        m4343F(new C1732o8(this, m4340C(false), h1Var));
    }

    @WorkerThread
    /* renamed from: S */
    public final void mo14275S(AtomicReference atomicReference) {
        mo14009h();
        mo14020i();
        m4343F(new C1720n8(this, atomicReference, m4340C(false)));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: T */
    public final void mo14276T(C1119h1 h1Var, String str, String str2) {
        mo14009h();
        mo14020i();
        m4343F(new C1553a9(this, str, str2, m4340C(false), h1Var));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: U */
    public final void mo14277U(AtomicReference atomicReference, String str, String str2, String str3) {
        mo14009h();
        mo14020i();
        m4343F(new C1864z8(this, atomicReference, (String) null, str2, str3, m4340C(false)));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: V */
    public final void mo14278V(C1119h1 h1Var, String str, String str2, boolean z) {
        mo14009h();
        mo14020i();
        m4343F(new C1682k8(this, str, str2, m4340C(false), z, h1Var));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: W */
    public final void mo14279W(AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        mo14009h();
        mo14020i();
        m4343F(new C1566b9(this, atomicReference, (String) null, str2, str3, m4340C(false), z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo14025n() {
        return false;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: o */
    public final void mo14280o(zzaw zzaw, String str) {
        C0917i.m1419j(zzaw);
        mo14009h();
        mo14020i();
        m4344G();
        m4343F(new C1840x8(this, true, m4340C(true), this.f2143a.mo14372C().mo14600v(zzaw), zzaw, str));
    }

    @WorkerThread
    /* renamed from: p */
    public final void mo14281p(C1119h1 h1Var, zzaw zzaw, String str) {
        mo14009h();
        mo14020i();
        if (this.f2143a.mo14382N().mo14676p0(C0879d.f886a) != 0) {
            this.f2143a.mo14228b().mo14040w().mo14693a("Not bundling data. Service unavailable or out of date");
            this.f2143a.mo14382N().mo14650G(h1Var, new byte[0]);
            return;
        }
        m4343F(new C1792t8(this, zzaw, str, h1Var));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: q */
    public final void mo14282q() {
        mo14009h();
        mo14020i();
        zzq C = m4340C(false);
        m4344G();
        this.f2143a.mo14372C().mo14595q();
        m4343F(new C1708m8(this, C));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: r */
    public final void mo14283r(C1763r3 r3Var, AbstractSafeParcelable abstractSafeParcelable, zzq zzq) {
        int i;
        int i2;
        C1859z3 r;
        String str;
        mo14009h();
        mo14020i();
        m4344G();
        this.f2143a.mo14402z();
        int i3 = 0;
        int i4 = 100;
        while (i3 < 1001 && i4 == 100) {
            ArrayList arrayList = new ArrayList();
            List p = this.f2143a.mo14372C().mo14594p(100);
            if (p != null) {
                arrayList.addAll(p);
                i = p.size();
            } else {
                i = 0;
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (i2 = 0; i2 < size; i2++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i2);
                if (abstractSafeParcelable2 instanceof zzaw) {
                    try {
                        r3Var.mo14191Q((zzaw) abstractSafeParcelable2, zzq);
                    } catch (RemoteException e) {
                        e = e;
                        r = this.f2143a.mo14228b().mo14035r();
                        str = "Failed to send event to the service";
                    }
                } else if (abstractSafeParcelable2 instanceof zzlo) {
                    try {
                        r3Var.mo14190N((zzlo) abstractSafeParcelable2, zzq);
                    } catch (RemoteException e2) {
                        e = e2;
                        r = this.f2143a.mo14228b().mo14035r();
                        str = "Failed to send user property to the service";
                    }
                } else if (abstractSafeParcelable2 instanceof zzac) {
                    try {
                        r3Var.mo14206s0((zzac) abstractSafeParcelable2, zzq);
                    } catch (RemoteException e3) {
                        e = e3;
                        r = this.f2143a.mo14228b().mo14035r();
                        str = "Failed to send conditional user property to the service";
                    }
                } else {
                    this.f2143a.mo14228b().mo14035r().mo14693a("Discarding data. Unrecognized parcel type.");
                }
            }
            i3++;
            i4 = i;
        }
        return;
        r.mo14694b(str, e);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: s */
    public final void mo14284s(zzac zzac) {
        C0917i.m1419j(zzac);
        mo14009h();
        mo14020i();
        this.f2143a.mo14230d();
        m4343F(new C1852y8(this, true, m4340C(true), this.f2143a.mo14372C().mo14599u(zzac), new zzac(zzac), zzac));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: t */
    public final void mo14285t(boolean z) {
        mo14009h();
        mo14020i();
        if (z) {
            m4344G();
            this.f2143a.mo14372C().mo14595q();
        }
        if (mo14268A()) {
            m4343F(new C1828w8(this, m4340C(false)));
        }
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: u */
    public final void mo14286u(C1552a8 a8Var) {
        mo14009h();
        mo14020i();
        m4343F(new C1756q8(this, a8Var));
    }

    @WorkerThread
    /* renamed from: v */
    public final void mo14287v(Bundle bundle) {
        mo14009h();
        mo14020i();
        m4343F(new C1768r8(this, m4340C(false), bundle));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: w */
    public final void mo14288w() {
        mo14009h();
        mo14020i();
        m4343F(new C1816v8(this, m4340C(true)));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: x */
    public final void mo14289x(C1763r3 r3Var) {
        mo14009h();
        C0917i.m1419j(r3Var);
        this.f2204d = r3Var;
        m4342E();
        m4341D();
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: y */
    public final void mo14290y(zzlo zzlo) {
        mo14009h();
        mo14020i();
        m4344G();
        m4343F(new C1695l8(this, m4340C(true), this.f2143a.mo14372C().mo14601w(zzlo), zzlo));
    }

    @WorkerThread
    /* renamed from: z */
    public final boolean mo14291z() {
        mo14009h();
        mo14020i();
        return this.f2204d != null;
    }
}
