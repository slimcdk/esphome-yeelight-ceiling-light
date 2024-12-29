package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C1992sc;

/* renamed from: com.google.android.gms.measurement.internal.w7 */
final class C2365w7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzm f4692a;

    /* renamed from: b */
    private final /* synthetic */ C1992sc f4693b;

    /* renamed from: c */
    private final /* synthetic */ C2310r7 f4694c;

    C2365w7(C2310r7 r7Var, zzm zzm, C1992sc scVar) {
        this.f4694c = r7Var;
        this.f4692a = zzm;
        this.f4693b = scVar;
    }

    public final void run() {
        String str = null;
        try {
            C2273o3 k0 = this.f4694c.f4563d;
            if (k0 == null) {
                this.f4694c.mo12427b().mo13096F().mo13130a("Failed to get app instance id");
            } else {
                str = k0.mo12677u0(this.f4692a);
                if (str != null) {
                    this.f4694c.mo12570p().mo12706O(str);
                    this.f4694c.mo13111l().f4229l.mo12870b(str);
                }
                this.f4694c.m7501e0();
            }
        } catch (RemoteException e) {
            this.f4694c.mo12427b().mo13096F().mo13131b("Failed to get app instance id", e);
        } catch (Throwable th) {
            this.f4694c.mo13110k().mo12961Q(this.f4693b, (String) null);
            throw th;
        }
        this.f4694c.mo13110k().mo12961Q(this.f4693b, str);
    }
}
