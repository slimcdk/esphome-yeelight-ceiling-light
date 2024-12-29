package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.internal.C0897c;
import java.util.ArrayList;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import p109w.C3859s;

/* renamed from: com.google.android.gms.common.api.internal.i0 */
final class C0789i0 extends C0827p0 {

    /* renamed from: b */
    private final Map f657b;

    /* renamed from: c */
    final /* synthetic */ C0831q0 f658c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0789i0(C0831q0 q0Var, Map map) {
        super(q0Var, (C0822o0) null);
        this.f658c = q0Var;
        this.f657b = map;
    }

    @GuardedBy("mLock")
    @WorkerThread
    /* renamed from: b */
    public final void mo12002b() {
        C3859s sVar = new C3859s(this.f658c.f744d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C0722a.C0730f fVar : this.f657b.keySet()) {
            if (!fVar.mo11839i() || ((C0774f0) this.f657b.get(fVar)).f609c) {
                arrayList2.add(fVar);
            } else {
                arrayList.add(fVar);
            }
        }
        int i = -1;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i2 < size) {
                i = sVar.mo26329b(this.f658c.f743c, (C0722a.C0730f) arrayList.get(i2));
                i2++;
                if (i != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i2 < size2) {
                i = sVar.mo26329b(this.f658c.f743c, (C0722a.C0730f) arrayList2.get(i2));
                i2++;
                if (i == 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            ConnectionResult connectionResult = new ConnectionResult(i, (PendingIntent) null);
            C0831q0 q0Var = this.f658c;
            q0Var.f741a.mo12105o(new C0779g0(this, q0Var, connectionResult));
            return;
        }
        C0831q0 q0Var2 = this.f658c;
        if (q0Var2.f753m && q0Var2.f751k != null) {
            q0Var2.f751k.mo14720r();
        }
        for (C0722a.C0730f fVar2 : this.f657b.keySet()) {
            C0897c.C0900c cVar = (C0897c.C0900c) this.f657b.get(fVar2);
            if (!fVar2.mo11839i() || sVar.mo26329b(this.f658c.f743c, fVar2) == 0) {
                fVar2.mo11836f(cVar);
            } else {
                C0831q0 q0Var3 = this.f658c;
                q0Var3.f741a.mo12105o(new C0784h0(this, q0Var3, cVar));
            }
        }
    }
}
