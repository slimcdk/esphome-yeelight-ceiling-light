package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C1426e;
import com.google.android.gms.common.internal.C1584m;
import java.util.Collections;

/* renamed from: com.google.android.gms.common.api.internal.z0 */
final class C1505z0 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ConnectionResult f2861a;

    /* renamed from: b */
    private final /* synthetic */ C1426e.C1429c f2862b;

    C1505z0(C1426e.C1429c cVar, ConnectionResult connectionResult) {
        this.f2862b = cVar;
        this.f2861a = connectionResult;
    }

    public final void run() {
        if (this.f2861a.mo10749V()) {
            boolean unused = this.f2862b.f2666e = true;
            if (this.f2862b.f2662a.mo10803r()) {
                this.f2862b.m3814g();
                return;
            }
            try {
                this.f2862b.f2662a.mo10792d((C1584m) null, Collections.emptySet());
            } catch (SecurityException unused2) {
                ((C1426e.C1427a) C1426e.this.f2642i.get(this.f2862b.f2663b)).mo10838f(new ConnectionResult(10));
            }
        } else {
            ((C1426e.C1427a) C1426e.this.f2642i.get(this.f2862b.f2663b)).mo10838f(this.f2861a);
        }
    }
}
