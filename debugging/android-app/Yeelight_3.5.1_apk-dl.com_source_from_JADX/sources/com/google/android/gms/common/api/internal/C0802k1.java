package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C0911g;

/* renamed from: com.google.android.gms.common.api.internal.k1 */
final class C0802k1 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ConnectionResult f681a;

    /* renamed from: b */
    final /* synthetic */ C0807l1 f682b;

    C0802k1(C0807l1 l1Var, ConnectionResult connectionResult) {
        this.f682b = l1Var;
        this.f681a = connectionResult;
    }

    public final void run() {
        C0807l1 l1Var = this.f682b;
        C0785h1 h1Var = (C0785h1) l1Var.f699f.f628l.get(l1Var.f695b);
        if (h1Var != null) {
            if (this.f681a.mo11756f0()) {
                this.f682b.f698e = true;
                if (this.f682b.f694a.mo11845q()) {
                    this.f682b.m942h();
                    return;
                }
                try {
                    C0807l1 l1Var2 = this.f682b;
                    l1Var2.f694a.mo11831c((C0911g) null, l1Var2.f694a.mo11830b());
                } catch (SecurityException unused) {
                    this.f682b.f694a.disconnect("Failed to get service from broker.");
                    h1Var.mo11981H(new ConnectionResult(10), (Exception) null);
                }
            } else {
                h1Var.mo11981H(this.f681a, (Exception) null);
            }
        }
    }
}
