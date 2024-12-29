package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.h8 */
final class C2198h8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f4169a;

    /* renamed from: b */
    private final /* synthetic */ String f4170b;

    /* renamed from: c */
    private final /* synthetic */ String f4171c;

    /* renamed from: d */
    private final /* synthetic */ String f4172d;

    /* renamed from: e */
    private final /* synthetic */ boolean f4173e;

    /* renamed from: f */
    private final /* synthetic */ zzm f4174f;

    /* renamed from: g */
    private final /* synthetic */ C2310r7 f4175g;

    C2198h8(C2310r7 r7Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z, zzm zzm) {
        this.f4175g = r7Var;
        this.f4169a = atomicReference;
        this.f4170b = str;
        this.f4171c = str2;
        this.f4172d = str3;
        this.f4173e = z;
        this.f4174f = zzm;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List<zzkn> y;
        synchronized (this.f4169a) {
            try {
                C2273o3 k0 = this.f4175g.f4563d;
                if (k0 == null) {
                    this.f4175g.mo12427b().mo13096F().mo13133d("(legacy) Failed to get user properties; not connected to service", C2361w3.m7696w(this.f4170b), this.f4171c, this.f4172d);
                    this.f4169a.set(Collections.emptyList());
                    this.f4169a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f4170b)) {
                    atomicReference2 = this.f4169a;
                    y = k0.mo12671U(this.f4171c, this.f4172d, this.f4173e, this.f4174f);
                } else {
                    atomicReference2 = this.f4169a;
                    y = k0.mo12680y(this.f4170b, this.f4171c, this.f4172d, this.f4173e);
                }
                atomicReference2.set(y);
                this.f4175g.m7501e0();
                atomicReference = this.f4169a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f4175g.mo12427b().mo13096F().mo13133d("(legacy) Failed to get user properties; remote exception", C2361w3.m7696w(this.f4170b), this.f4171c, e);
                    this.f4169a.set(Collections.emptyList());
                    atomicReference = this.f4169a;
                } catch (Throwable th) {
                    this.f4169a.notify();
                    throw th;
                }
            }
        }
    }
}
