package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.internal.measurement.C1119h1;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.measurement.internal.a9 */
final class C1553a9 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f1929a;

    /* renamed from: b */
    final /* synthetic */ String f1930b;

    /* renamed from: c */
    final /* synthetic */ zzq f1931c;

    /* renamed from: d */
    final /* synthetic */ C1119h1 f1932d;

    /* renamed from: e */
    final /* synthetic */ C1670j9 f1933e;

    C1553a9(C1670j9 j9Var, String str, String str2, zzq zzq, C1119h1 h1Var) {
        this.f1933e = j9Var;
        this.f1929a = str;
        this.f1930b = str2;
        this.f1931c = zzq;
        this.f1932d = h1Var;
    }

    public final void run() {
        ArrayList arrayList = new ArrayList();
        try {
            C1670j9 j9Var = this.f1933e;
            C1763r3 H = j9Var.f2204d;
            if (H == null) {
                j9Var.f2143a.mo14228b().mo14035r().mo14695c("Failed to get conditional properties; not connected to service", this.f1929a, this.f1930b);
            } else {
                C0917i.m1419j(this.f1931c);
                arrayList = C1854ya.m4844v(H.mo14193W(this.f1929a, this.f1930b, this.f1931c));
                this.f1933e.m4342E();
            }
        } catch (RemoteException e) {
            this.f1933e.f2143a.mo14228b().mo14035r().mo14696d("Failed to get conditional properties; remote exception", this.f1929a, this.f1930b, e);
        } catch (Throwable th) {
            this.f1933e.f2143a.mo14382N().mo14648E(this.f1932d, arrayList);
            throw th;
        }
        this.f1933e.f2143a.mo14382N().mo14648E(this.f1932d, arrayList);
    }
}
