package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C1992sc;

/* renamed from: com.google.android.gms.measurement.internal.k8 */
final class C2233k8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f4277a;

    /* renamed from: b */
    private final /* synthetic */ String f4278b;

    /* renamed from: c */
    private final /* synthetic */ boolean f4279c;

    /* renamed from: d */
    private final /* synthetic */ zzm f4280d;

    /* renamed from: e */
    private final /* synthetic */ C1992sc f4281e;

    /* renamed from: f */
    private final /* synthetic */ C2310r7 f4282f;

    C2233k8(C2310r7 r7Var, String str, String str2, boolean z, zzm zzm, C1992sc scVar) {
        this.f4282f = r7Var;
        this.f4277a = str;
        this.f4278b = str2;
        this.f4279c = z;
        this.f4280d = zzm;
        this.f4281e = scVar;
    }

    public final void run() {
        Bundle bundle = new Bundle();
        try {
            C2273o3 k0 = this.f4282f.f4563d;
            if (k0 == null) {
                this.f4282f.mo12427b().mo13096F().mo13132c("Failed to get user properties; not connected to service", this.f4277a, this.f4278b);
            } else {
                bundle = C2323s9.m7551C(k0.mo12671U(this.f4277a, this.f4278b, this.f4279c, this.f4280d));
                this.f4282f.m7501e0();
            }
        } catch (RemoteException e) {
            this.f4282f.mo12427b().mo13096F().mo13132c("Failed to get user properties; remote exception", this.f4277a, e);
        } catch (Throwable th) {
            this.f4282f.mo13110k().mo12960P(this.f4281e, bundle);
            throw th;
        }
        this.f4282f.mo13110k().mo12960P(this.f4281e, bundle);
    }
}
