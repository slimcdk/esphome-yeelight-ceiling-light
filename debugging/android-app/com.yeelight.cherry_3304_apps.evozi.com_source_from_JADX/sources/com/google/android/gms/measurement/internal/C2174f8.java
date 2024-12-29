package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.f8 */
final class C2174f8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f4118a;

    /* renamed from: b */
    private final /* synthetic */ String f4119b;

    /* renamed from: c */
    private final /* synthetic */ String f4120c;

    /* renamed from: d */
    private final /* synthetic */ String f4121d;

    /* renamed from: e */
    private final /* synthetic */ zzm f4122e;

    /* renamed from: f */
    private final /* synthetic */ C2310r7 f4123f;

    C2174f8(C2310r7 r7Var, AtomicReference atomicReference, String str, String str2, String str3, zzm zzm) {
        this.f4123f = r7Var;
        this.f4118a = atomicReference;
        this.f4119b = str;
        this.f4120c = str2;
        this.f4121d = str3;
        this.f4122e = zzm;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List<zzy> Z;
        synchronized (this.f4118a) {
            try {
                C2273o3 k0 = this.f4123f.f4563d;
                if (k0 == null) {
                    this.f4123f.mo12427b().mo13096F().mo13133d("(legacy) Failed to get conditional properties; not connected to service", C2361w3.m7696w(this.f4119b), this.f4120c, this.f4121d);
                    this.f4118a.set(Collections.emptyList());
                    this.f4118a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f4119b)) {
                    atomicReference2 = this.f4118a;
                    Z = k0.mo12668N(this.f4120c, this.f4121d, this.f4122e);
                } else {
                    atomicReference2 = this.f4118a;
                    Z = k0.mo12673Z(this.f4119b, this.f4120c, this.f4121d);
                }
                atomicReference2.set(Z);
                this.f4123f.m7501e0();
                atomicReference = this.f4118a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f4123f.mo12427b().mo13096F().mo13133d("(legacy) Failed to get conditional properties; remote exception", C2361w3.m7696w(this.f4119b), this.f4120c, e);
                    this.f4118a.set(Collections.emptyList());
                    atomicReference = this.f4118a;
                } catch (Throwable th) {
                    this.f4118a.notify();
                    throw th;
                }
            }
        }
    }
}
