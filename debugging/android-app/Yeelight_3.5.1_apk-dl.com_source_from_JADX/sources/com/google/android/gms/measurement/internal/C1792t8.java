package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C1119h1;

/* renamed from: com.google.android.gms.measurement.internal.t8 */
final class C1792t8 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzaw f2693a;

    /* renamed from: b */
    final /* synthetic */ String f2694b;

    /* renamed from: c */
    final /* synthetic */ C1119h1 f2695c;

    /* renamed from: d */
    final /* synthetic */ C1670j9 f2696d;

    C1792t8(C1670j9 j9Var, zzaw zzaw, String str, C1119h1 h1Var) {
        this.f2696d = j9Var;
        this.f2693a = zzaw;
        this.f2694b = str;
        this.f2695c = h1Var;
    }

    public final void run() {
        byte[] bArr = null;
        try {
            C1670j9 j9Var = this.f2696d;
            C1763r3 H = j9Var.f2204d;
            if (H == null) {
                j9Var.f2143a.mo14228b().mo14035r().mo14693a("Discarding data. Failed to send event to service to bundle");
            } else {
                bArr = H.mo14204q(this.f2693a, this.f2694b);
                this.f2696d.m4342E();
            }
        } catch (RemoteException e) {
            this.f2696d.f2143a.mo14228b().mo14035r().mo14694b("Failed to send event to the service to bundle", e);
        } catch (Throwable th) {
            this.f2696d.f2143a.mo14382N().mo14650G(this.f2695c, bArr);
            throw th;
        }
        this.f2696d.f2143a.mo14382N().mo14650G(this.f2695c, bArr);
    }
}
