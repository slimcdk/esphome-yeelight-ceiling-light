package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C0917i;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.b9 */
final class C1566b9 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f1954a;

    /* renamed from: b */
    final /* synthetic */ String f1955b;

    /* renamed from: c */
    final /* synthetic */ String f1956c;

    /* renamed from: d */
    final /* synthetic */ zzq f1957d;

    /* renamed from: e */
    final /* synthetic */ boolean f1958e;

    /* renamed from: f */
    final /* synthetic */ C1670j9 f1959f;

    C1566b9(C1670j9 j9Var, AtomicReference atomicReference, String str, String str2, String str3, zzq zzq, boolean z) {
        this.f1959f = j9Var;
        this.f1954a = atomicReference;
        this.f1955b = str2;
        this.f1956c = str3;
        this.f1957d = zzq;
        this.f1958e = z;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List l;
        synchronized (this.f1954a) {
            try {
                C1670j9 j9Var = this.f1959f;
                C1763r3 H = j9Var.f2204d;
                if (H == null) {
                    j9Var.f2143a.mo14228b().mo14035r().mo14696d("(legacy) Failed to get user properties; not connected to service", (Object) null, this.f1955b, this.f1956c);
                    this.f1954a.set(Collections.emptyList());
                    this.f1954a.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    C0917i.m1419j(this.f1957d);
                    atomicReference2 = this.f1954a;
                    l = H.mo14201l0(this.f1955b, this.f1956c, this.f1958e, this.f1957d);
                } else {
                    atomicReference2 = this.f1954a;
                    l = H.mo14200l((String) null, this.f1955b, this.f1956c, this.f1958e);
                }
                atomicReference2.set(l);
                this.f1959f.m4342E();
                atomicReference = this.f1954a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f1959f.f2143a.mo14228b().mo14035r().mo14696d("(legacy) Failed to get user properties; remote exception", (Object) null, this.f1955b, e);
                    this.f1954a.set(Collections.emptyList());
                    atomicReference = this.f1954a;
                } catch (Throwable th) {
                    this.f1954a.notify();
                    throw th;
                }
            }
        }
    }
}
