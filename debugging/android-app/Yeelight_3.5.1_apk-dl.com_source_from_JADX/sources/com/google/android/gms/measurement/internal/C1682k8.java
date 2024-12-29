package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.internal.measurement.C1119h1;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.k8 */
final class C1682k8 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f2232a;

    /* renamed from: b */
    final /* synthetic */ String f2233b;

    /* renamed from: c */
    final /* synthetic */ zzq f2234c;

    /* renamed from: d */
    final /* synthetic */ boolean f2235d;

    /* renamed from: e */
    final /* synthetic */ C1119h1 f2236e;

    /* renamed from: f */
    final /* synthetic */ C1670j9 f2237f;

    C1682k8(C1670j9 j9Var, String str, String str2, zzq zzq, boolean z, C1119h1 h1Var) {
        this.f2237f = j9Var;
        this.f2232a = str;
        this.f2233b = str2;
        this.f2234c = zzq;
        this.f2235d = z;
        this.f2236e = h1Var;
    }

    public final void run() {
        Throwable th;
        Bundle bundle;
        RemoteException e;
        Bundle bundle2 = new Bundle();
        try {
            C1670j9 j9Var = this.f2237f;
            C1763r3 H = j9Var.f2204d;
            if (H == null) {
                j9Var.f2143a.mo14228b().mo14035r().mo14695c("Failed to get user properties; not connected to service", this.f2232a, this.f2233b);
                this.f2237f.f2143a.mo14382N().mo14649F(this.f2236e, bundle2);
                return;
            }
            C0917i.m1419j(this.f2234c);
            List<zzlo> l0 = H.mo14201l0(this.f2232a, this.f2233b, this.f2235d, this.f2234c);
            bundle = new Bundle();
            if (l0 != null) {
                for (zzlo zzlo : l0) {
                    String str = zzlo.f2863e;
                    if (str != null) {
                        bundle.putString(zzlo.f2860b, str);
                    } else {
                        Long l = zzlo.f2862d;
                        if (l != null) {
                            bundle.putLong(zzlo.f2860b, l.longValue());
                        } else {
                            Double d = zzlo.f2865g;
                            if (d != null) {
                                bundle.putDouble(zzlo.f2860b, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                this.f2237f.m4342E();
                this.f2237f.f2143a.mo14382N().mo14649F(this.f2236e, bundle);
            } catch (RemoteException e2) {
                e = e2;
                try {
                    this.f2237f.f2143a.mo14228b().mo14035r().mo14695c("Failed to get user properties; remote exception", this.f2232a, e);
                    this.f2237f.f2143a.mo14382N().mo14649F(this.f2236e, bundle);
                } catch (Throwable th2) {
                    th = th2;
                    bundle2 = bundle;
                    this.f2237f.f2143a.mo14382N().mo14649F(this.f2236e, bundle2);
                    throw th;
                }
            }
        } catch (RemoteException e3) {
            bundle = bundle2;
            e = e3;
            this.f2237f.f2143a.mo14228b().mo14035r().mo14695c("Failed to get user properties; remote exception", this.f2232a, e);
            this.f2237f.f2143a.mo14382N().mo14649F(this.f2236e, bundle);
        } catch (Throwable th3) {
            th = th3;
            this.f2237f.f2143a.mo14382N().mo14649F(this.f2236e, bundle2);
            throw th;
        }
    }
}
