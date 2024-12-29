package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C1992sc;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.measurement.internal.i8 */
final class C2210i8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f4200a;

    /* renamed from: b */
    private final /* synthetic */ String f4201b;

    /* renamed from: c */
    private final /* synthetic */ zzm f4202c;

    /* renamed from: d */
    private final /* synthetic */ C1992sc f4203d;

    /* renamed from: e */
    private final /* synthetic */ C2310r7 f4204e;

    C2210i8(C2310r7 r7Var, String str, String str2, zzm zzm, C1992sc scVar) {
        this.f4204e = r7Var;
        this.f4200a = str;
        this.f4201b = str2;
        this.f4202c = zzm;
        this.f4203d = scVar;
    }

    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            C2273o3 k0 = this.f4204e.f4563d;
            if (k0 == null) {
                this.f4204e.mo12427b().mo13096F().mo13132c("Failed to get conditional properties; not connected to service", this.f4200a, this.f4201b);
            } else {
                arrayList = C2323s9.m7573p0(k0.mo12668N(this.f4200a, this.f4201b, this.f4202c));
                this.f4204e.m7501e0();
            }
        } catch (RemoteException e) {
            this.f4204e.mo12427b().mo13096F().mo13133d("Failed to get conditional properties; remote exception", this.f4200a, this.f4201b, e);
        } catch (Throwable th) {
            this.f4204e.mo13110k().mo12962R(this.f4203d, arrayList);
            throw th;
        }
        this.f4204e.mo13110k().mo12962R(this.f4203d, arrayList);
    }
}
