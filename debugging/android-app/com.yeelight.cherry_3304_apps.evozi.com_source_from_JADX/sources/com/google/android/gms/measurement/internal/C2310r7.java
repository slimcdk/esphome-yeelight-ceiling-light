package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.C1533g;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.C1640a;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1992sc;
import com.xiaomi.mistatistic.sdk.MiStatInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@VisibleForTesting
/* renamed from: com.google.android.gms.measurement.internal.r7 */
public final class C2310r7 extends C2133c3 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2222j8 f4562c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2273o3 f4563d;

    /* renamed from: e */
    private volatile Boolean f4564e;

    /* renamed from: f */
    private final C2213j f4565f;

    /* renamed from: g */
    private final C2151d9 f4566g;

    /* renamed from: h */
    private final List<Runnable> f4567h = new ArrayList();

    /* renamed from: i */
    private final C2213j f4568i;

    protected C2310r7(C2111a5 a5Var) {
        super(a5Var);
        this.f4566g = new C2151d9(a5Var.mo12429f());
        this.f4562c = new C2222j8(this);
        this.f4565f = new C2343u7(this, a5Var);
        this.f4568i = new C2114a8(this, a5Var);
    }

    @WorkerThread
    @Nullable
    /* renamed from: D */
    private final zzm m7496D(boolean z) {
        mo12414I();
        return mo12571q().mo12981B(z ? mo12427b().mo13105P() : null);
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: E */
    public final void m7497E(ComponentName componentName) {
        mo12567h();
        if (this.f4563d != null) {
            this.f4563d = null;
            mo12427b().mo13104O().mo13131b("Disconnected from device MeasurementService", componentName);
            mo12567h();
            mo12924Z();
        }
    }

    @WorkerThread
    /* renamed from: R */
    private final void m7499R(Runnable runnable) {
        mo12567h();
        if (mo12920V()) {
            runnable.run();
        } else if (((long) this.f4567h.size()) >= 1000) {
            mo12427b().mo13096F().mo13130a("Discarding data. Max runnable queue size reached");
        } else {
            this.f4567h.add(runnable);
            this.f4568i.mo12751c(MiStatInterface.MIN_UPLOAD_INTERVAL);
            mo12924Z();
        }
    }

    /* renamed from: d0 */
    private final boolean m7500d0() {
        mo12414I();
        return true;
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: e0 */
    public final void m7501e0() {
        mo12567h();
        this.f4566g.mo12643a();
        this.f4565f.mo12751c(C2302r.f4475J.mo12867a(null).longValue());
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f1  */
    @androidx.annotation.WorkerThread
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m7502f0() {
        /*
            r5 = this;
            r5.mo12567h()
            r5.mo12537x()
            java.lang.Boolean r0 = r5.f4564e
            if (r0 != 0) goto L_0x00fe
            r5.mo12567h()
            r5.mo12537x()
            com.google.android.gms.measurement.internal.j4 r0 = r5.mo13111l()
            java.lang.Boolean r0 = r0.mo12758E()
            r1 = 1
            if (r0 == 0) goto L_0x0023
            boolean r2 = r0.booleanValue()
            if (r2 == 0) goto L_0x0023
            goto L_0x00f8
        L_0x0023:
            r5.mo12414I()
            com.google.android.gms.measurement.internal.t3 r2 = r5.mo12571q()
            int r2 = r2.mo12987H()
            r3 = 0
            if (r2 != r1) goto L_0x0034
        L_0x0031:
            r0 = 1
            goto L_0x00d4
        L_0x0034:
            com.google.android.gms.measurement.internal.w3 r2 = r5.mo12427b()
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo13104O()
            java.lang.String r4 = "Checking service availability"
            r2.mo13130a(r4)
            com.google.android.gms.measurement.internal.s9 r2 = r5.mo13110k()
            r4 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r2 = r2.mo12975t(r4)
            if (r2 == 0) goto L_0x00c5
            if (r2 == r1) goto L_0x00b5
            r4 = 2
            if (r2 == r4) goto L_0x0095
            r0 = 3
            if (r2 == r0) goto L_0x0086
            r0 = 9
            if (r2 == r0) goto L_0x007b
            r0 = 18
            if (r2 == r0) goto L_0x0070
            com.google.android.gms.measurement.internal.w3 r0 = r5.mo12427b()
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13099J()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "Unexpected service status"
            r0.mo13131b(r2, r1)
            goto L_0x0093
        L_0x0070:
            com.google.android.gms.measurement.internal.w3 r0 = r5.mo12427b()
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13099J()
            java.lang.String r2 = "Service updating"
            goto L_0x00cf
        L_0x007b:
            com.google.android.gms.measurement.internal.w3 r0 = r5.mo12427b()
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13099J()
            java.lang.String r1 = "Service invalid"
            goto L_0x0090
        L_0x0086:
            com.google.android.gms.measurement.internal.w3 r0 = r5.mo12427b()
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13099J()
            java.lang.String r1 = "Service disabled"
        L_0x0090:
            r0.mo13130a(r1)
        L_0x0093:
            r0 = 0
            goto L_0x00c3
        L_0x0095:
            com.google.android.gms.measurement.internal.w3 r2 = r5.mo12427b()
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo13103N()
            java.lang.String r4 = "Service container out of date"
            r2.mo13130a(r4)
            com.google.android.gms.measurement.internal.s9 r2 = r5.mo13110k()
            int r2 = r2.mo12952I0()
            r4 = 17443(0x4423, float:2.4443E-41)
            if (r2 >= r4) goto L_0x00af
            goto L_0x00c2
        L_0x00af:
            if (r0 != 0) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            r1 = 0
        L_0x00b3:
            r0 = 0
            goto L_0x00d4
        L_0x00b5:
            com.google.android.gms.measurement.internal.w3 r0 = r5.mo12427b()
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13104O()
            java.lang.String r2 = "Service missing"
            r0.mo13130a(r2)
        L_0x00c2:
            r0 = 1
        L_0x00c3:
            r1 = 0
            goto L_0x00d4
        L_0x00c5:
            com.google.android.gms.measurement.internal.w3 r0 = r5.mo12427b()
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13104O()
            java.lang.String r2 = "Service available"
        L_0x00cf:
            r0.mo13130a(r2)
            goto L_0x0031
        L_0x00d4:
            if (r1 != 0) goto L_0x00ee
            com.google.android.gms.measurement.internal.b r2 = r5.mo13112m()
            boolean r2 = r2.mo12468Q()
            if (r2 == 0) goto L_0x00ee
            com.google.android.gms.measurement.internal.w3 r0 = r5.mo12427b()
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13096F()
            java.lang.String r2 = "No way to upload. Consider using the full version of Analytics"
            r0.mo13130a(r2)
            goto L_0x00ef
        L_0x00ee:
            r3 = r0
        L_0x00ef:
            if (r3 == 0) goto L_0x00f8
            com.google.android.gms.measurement.internal.j4 r0 = r5.mo13111l()
            r0.mo12765u(r1)
        L_0x00f8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.f4564e = r0
        L_0x00fe:
            java.lang.Boolean r0 = r5.f4564e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2310r7.m7502f0():boolean");
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: g0 */
    public final void m7503g0() {
        mo12567h();
        if (mo12920V()) {
            mo12427b().mo13104O().mo13130a("Inactivity, disconnecting from the service");
            mo12926b0();
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: h0 */
    public final void m7504h0() {
        mo12567h();
        mo12427b().mo13104O().mo13131b("Processing queued up service tasks", Integer.valueOf(this.f4567h.size()));
        for (Runnable run : this.f4567h) {
            try {
                run.run();
            } catch (Exception e) {
                mo12427b().mo13096F().mo13131b("Task exception while flushing queue", e);
            }
        }
        this.f4567h.clear();
        this.f4568i.mo12753e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final boolean mo12534A() {
        return false;
    }

    @WorkerThread
    /* renamed from: F */
    public final void mo12907F(C1992sc scVar) {
        mo12567h();
        mo12537x();
        m7499R(new C2365w7(this, m7496D(false), scVar));
    }

    @WorkerThread
    /* renamed from: G */
    public final void mo12908G(C1992sc scVar, zzaq zzaq, String str) {
        mo12567h();
        mo12537x();
        if (mo13110k().mo12975t(C1533g.f2900a) != 0) {
            mo12427b().mo13099J().mo13130a("Not bundling data. Service unavailable or out of date");
            mo13110k().mo12964T(scVar, new byte[0]);
            return;
        }
        m7499R(new C2126b8(this, zzaq, str, scVar));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: H */
    public final void mo12909H(C1992sc scVar, String str, String str2) {
        mo12567h();
        mo12537x();
        m7499R(new C2210i8(this, str, str2, m7496D(false), scVar));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: J */
    public final void mo12910J(C1992sc scVar, String str, String str2, boolean z) {
        mo12567h();
        mo12537x();
        m7499R(new C2233k8(this, str, str2, z, m7496D(false), scVar));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: K */
    public final void mo12911K(zzaq zzaq, String str) {
        C1609u.m4475k(zzaq);
        mo12567h();
        mo12537x();
        boolean d0 = m7500d0();
        m7499R(new C2138c8(this, d0, d0 && mo12574t().mo12932E(zzaq), zzaq, m7496D(true), str));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: L */
    public final void mo12912L(C2273o3 o3Var) {
        mo12567h();
        C1609u.m4475k(o3Var);
        this.f4563d = o3Var;
        m7501e0();
        m7504h0();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: M */
    public final void mo12913M(C2273o3 o3Var, AbstractSafeParcelable abstractSafeParcelable, zzm zzm) {
        int i;
        C2383y3 F;
        String str;
        List<AbstractSafeParcelable> C;
        mo12567h();
        mo12566d();
        mo12537x();
        boolean d0 = m7500d0();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            if (!d0 || (C = mo12574t().mo12931C(100)) == null) {
                i = 0;
            } else {
                arrayList.addAll(C);
                i = C.size();
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) obj;
                if (abstractSafeParcelable2 instanceof zzaq) {
                    try {
                        o3Var.mo12667K0((zzaq) abstractSafeParcelable2, zzm);
                    } catch (RemoteException e) {
                        e = e;
                        F = mo12427b().mo13096F();
                        str = "Failed to send event to the service";
                    }
                } else if (abstractSafeParcelable2 instanceof zzkn) {
                    try {
                        o3Var.mo12674f0((zzkn) abstractSafeParcelable2, zzm);
                    } catch (RemoteException e2) {
                        e = e2;
                        F = mo12427b().mo13096F();
                        str = "Failed to send user property to the service";
                    }
                } else if (abstractSafeParcelable2 instanceof zzy) {
                    try {
                        o3Var.mo12681z((zzy) abstractSafeParcelable2, zzm);
                    } catch (RemoteException e3) {
                        e = e3;
                        F = mo12427b().mo13096F();
                        str = "Failed to send conditional user property to the service";
                    }
                } else {
                    mo12427b().mo13096F().mo13130a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
        return;
        F.mo13131b(str, e);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: N */
    public final void mo12914N(C2255m7 m7Var) {
        mo12567h();
        mo12537x();
        m7499R(new C2387y7(this, m7Var));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: P */
    public final void mo12915P(zzkn zzkn) {
        mo12567h();
        mo12537x();
        m7499R(new C2332t7(this, m7500d0() && mo12574t().mo12933F(zzkn), zzkn, m7496D(true)));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: Q */
    public final void mo12916Q(zzy zzy) {
        C1609u.m4475k(zzy);
        mo12567h();
        mo12537x();
        mo12414I();
        m7499R(new C2186g8(this, true, mo12574t().mo12934G(zzy), new zzy(zzy), m7496D(true), zzy));
    }

    @WorkerThread
    /* renamed from: S */
    public final void mo12917S(AtomicReference<String> atomicReference) {
        mo12567h();
        mo12537x();
        m7499R(new C2376x7(this, atomicReference, m7496D(false)));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: T */
    public final void mo12918T(AtomicReference<List<zzy>> atomicReference, String str, String str2, String str3) {
        mo12567h();
        mo12537x();
        m7499R(new C2174f8(this, atomicReference, str, str2, str3, m7496D(false)));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: U */
    public final void mo12919U(AtomicReference<List<zzkn>> atomicReference, String str, String str2, String str3, boolean z) {
        mo12567h();
        mo12537x();
        m7499R(new C2198h8(this, atomicReference, str, str2, str3, z, m7496D(false)));
    }

    @WorkerThread
    /* renamed from: V */
    public final boolean mo12920V() {
        mo12567h();
        mo12537x();
        return this.f4563d != null;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: W */
    public final void mo12921W() {
        mo12567h();
        mo12537x();
        m7499R(new C2162e8(this, m7496D(true)));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: X */
    public final void mo12922X() {
        mo12567h();
        mo12566d();
        mo12537x();
        zzm D = m7496D(false);
        if (m7500d0()) {
            mo12574t().mo12935H();
        }
        m7499R(new C2354v7(this, D));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: Y */
    public final void mo12923Y() {
        mo12567h();
        mo12537x();
        zzm D = m7496D(true);
        mo12574t().mo12936J();
        m7499R(new C2398z7(this, D));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: Z */
    public final void mo12924Z() {
        mo12567h();
        mo12537x();
        if (!mo12920V()) {
            if (m7502f0()) {
                this.f4562c.mo12775g();
            } else if (!mo13112m().mo12468Q()) {
                mo12414I();
                List<ResolveInfo> queryIntentServices = mo12428c().getPackageManager().queryIntentServices(new Intent().setClassName(mo12428c(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices != null && queryIntentServices.size() > 0) {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    Context c = mo12428c();
                    mo12414I();
                    intent.setComponent(new ComponentName(c, "com.google.android.gms.measurement.AppMeasurementService"));
                    this.f4562c.mo12774d(intent);
                    return;
                }
                mo12427b().mo13096F().mo13130a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public final Boolean mo12925a0() {
        return this.f4564e;
    }

    @WorkerThread
    /* renamed from: b0 */
    public final void mo12926b0() {
        mo12567h();
        mo12537x();
        this.f4562c.mo12773b();
        try {
            C1640a.m4551b().mo11371c(mo12428c(), this.f4562c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f4563d = null;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: c0 */
    public final boolean mo12927c0() {
        mo12567h();
        mo12537x();
        return !m7502f0() || mo13110k().mo12952I0() >= 200900;
    }
}
