package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.c8 */
final class C2138c8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f3999a;

    /* renamed from: b */
    private final /* synthetic */ boolean f4000b;

    /* renamed from: c */
    private final /* synthetic */ zzaq f4001c;

    /* renamed from: d */
    private final /* synthetic */ zzm f4002d;

    /* renamed from: e */
    private final /* synthetic */ String f4003e;

    /* renamed from: f */
    private final /* synthetic */ C2310r7 f4004f;

    C2138c8(C2310r7 r7Var, boolean z, boolean z2, zzaq zzaq, zzm zzm, String str) {
        this.f4004f = r7Var;
        this.f3999a = z;
        this.f4000b = z2;
        this.f4001c = zzaq;
        this.f4002d = zzm;
        this.f4003e = str;
    }

    public final void run() {
        C2273o3 k0 = this.f4004f.f4563d;
        if (k0 == null) {
            this.f4004f.mo12427b().mo13096F().mo13130a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f3999a) {
            this.f4004f.mo12913M(k0, this.f4000b ? null : this.f4001c, this.f4002d);
        } else {
            try {
                if (TextUtils.isEmpty(this.f4003e)) {
                    k0.mo12667K0(this.f4001c, this.f4002d);
                } else {
                    k0.mo12679x(this.f4001c, this.f4003e, this.f4004f.mo12427b().mo13105P());
                }
            } catch (RemoteException e) {
                this.f4004f.mo12427b().mo13096F().mo13131b("Failed to send event to the service", e);
            }
        }
        this.f4004f.m7501e0();
    }
}
