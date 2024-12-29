package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C0917i;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.z8 */
final class C1864z8 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f2830a;

    /* renamed from: b */
    final /* synthetic */ String f2831b;

    /* renamed from: c */
    final /* synthetic */ String f2832c;

    /* renamed from: d */
    final /* synthetic */ zzq f2833d;

    /* renamed from: e */
    final /* synthetic */ C1670j9 f2834e;

    C1864z8(C1670j9 j9Var, AtomicReference atomicReference, String str, String str2, String str3, zzq zzq) {
        this.f2834e = j9Var;
        this.f2830a = atomicReference;
        this.f2831b = str2;
        this.f2832c = str3;
        this.f2833d = zzq;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List z;
        synchronized (this.f2830a) {
            try {
                C1670j9 j9Var = this.f2834e;
                C1763r3 H = j9Var.f2204d;
                if (H == null) {
                    j9Var.f2143a.mo14228b().mo14035r().mo14696d("(legacy) Failed to get conditional properties; not connected to service", (Object) null, this.f2831b, this.f2832c);
                    this.f2830a.set(Collections.emptyList());
                    this.f2830a.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    C0917i.m1419j(this.f2833d);
                    atomicReference2 = this.f2830a;
                    z = H.mo14193W(this.f2831b, this.f2832c, this.f2833d);
                } else {
                    atomicReference2 = this.f2830a;
                    z = H.mo14208z((String) null, this.f2831b, this.f2832c);
                }
                atomicReference2.set(z);
                this.f2834e.m4342E();
                atomicReference = this.f2830a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f2834e.f2143a.mo14228b().mo14035r().mo14696d("(legacy) Failed to get conditional properties; remote exception", (Object) null, this.f2831b, e);
                    this.f2830a.set(Collections.emptyList());
                    atomicReference = this.f2830a;
                } catch (Throwable th) {
                    this.f2830a.notify();
                    throw th;
                }
            }
        }
    }
}
