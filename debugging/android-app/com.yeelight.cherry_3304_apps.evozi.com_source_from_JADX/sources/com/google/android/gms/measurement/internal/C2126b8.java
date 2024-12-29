package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C1992sc;

/* renamed from: com.google.android.gms.measurement.internal.b8 */
final class C2126b8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzaq f3972a;

    /* renamed from: b */
    private final /* synthetic */ String f3973b;

    /* renamed from: c */
    private final /* synthetic */ C1992sc f3974c;

    /* renamed from: d */
    private final /* synthetic */ C2310r7 f3975d;

    C2126b8(C2310r7 r7Var, zzaq zzaq, String str, C1992sc scVar) {
        this.f3975d = r7Var;
        this.f3972a = zzaq;
        this.f3973b = str;
        this.f3974c = scVar;
    }

    public final void run() {
        byte[] bArr = null;
        try {
            C2273o3 k0 = this.f3975d.f4563d;
            if (k0 == null) {
                this.f3975d.mo12427b().mo13096F().mo13130a("Discarding data. Failed to send event to service to bundle");
            } else {
                bArr = k0.mo12675k(this.f3972a, this.f3973b);
                this.f3975d.m7501e0();
            }
        } catch (RemoteException e) {
            this.f3975d.mo12427b().mo13096F().mo13131b("Failed to send event to the service to bundle", e);
        } catch (Throwable th) {
            this.f3975d.mo13110k().mo12964T(this.f3974c, bArr);
            throw th;
        }
        this.f3975d.mo13110k().mo12964T(this.f3974c, bArr);
    }
}
