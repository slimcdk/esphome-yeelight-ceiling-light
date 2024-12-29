package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.g8 */
final class C2186g8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f4135a;

    /* renamed from: b */
    private final /* synthetic */ boolean f4136b;

    /* renamed from: c */
    private final /* synthetic */ zzy f4137c;

    /* renamed from: d */
    private final /* synthetic */ zzm f4138d;

    /* renamed from: e */
    private final /* synthetic */ zzy f4139e;

    /* renamed from: f */
    private final /* synthetic */ C2310r7 f4140f;

    C2186g8(C2310r7 r7Var, boolean z, boolean z2, zzy zzy, zzm zzm, zzy zzy2) {
        this.f4140f = r7Var;
        this.f4135a = z;
        this.f4136b = z2;
        this.f4137c = zzy;
        this.f4138d = zzm;
        this.f4139e = zzy2;
    }

    public final void run() {
        C2273o3 k0 = this.f4140f.f4563d;
        if (k0 == null) {
            this.f4140f.mo12427b().mo13096F().mo13130a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f4135a) {
            this.f4140f.mo12913M(k0, this.f4136b ? null : this.f4137c, this.f4138d);
        } else {
            try {
                if (TextUtils.isEmpty(this.f4139e.f4799a)) {
                    k0.mo12681z(this.f4137c, this.f4138d);
                } else {
                    k0.mo12670S(this.f4137c);
                }
            } catch (RemoteException e) {
                this.f4140f.mo12427b().mo13096F().mo13131b("Failed to send conditional user property to the service", e);
            }
        }
        this.f4140f.m7501e0();
    }
}
