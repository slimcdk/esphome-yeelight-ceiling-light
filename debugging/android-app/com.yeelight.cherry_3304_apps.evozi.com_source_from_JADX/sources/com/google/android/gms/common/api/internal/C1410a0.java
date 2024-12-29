package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.internal.C1550d;
import com.google.android.gms.common.internal.C1582l;
import java.util.ArrayList;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.a0 */
final class C1410a0 extends C1442h0 {

    /* renamed from: b */
    private final Map<C1382a.C1390f, C1504z> f2605b;

    /* renamed from: c */
    final /* synthetic */ C1498x f2606c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1410a0(C1498x xVar, Map<C1382a.C1390f, C1504z> map) {
        super(xVar, (C1501y) null);
        this.f2606c = xVar;
        this.f2605b = map;
    }

    @GuardedBy("mLock")
    @WorkerThread
    /* renamed from: b */
    public final void mo10865b() {
        C1582l lVar = new C1582l(this.f2606c.f2832d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C1382a.C1390f next : this.f2605b.keySet()) {
            if (!next.mo10799m() || this.f2605b.get(next).f2860c) {
                arrayList2.add(next);
            } else {
                arrayList.add(next);
            }
        }
        int i = -1;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                i = lVar.mo11248b(this.f2606c.f2831c, (C1382a.C1390f) obj);
                if (i != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                i = lVar.mo11248b(this.f2606c.f2831c, (C1382a.C1390f) obj2);
                if (i == 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            this.f2606c.f2829a.mo11002i(new C1415b0(this, this.f2606c, new ConnectionResult(i, (PendingIntent) null)));
            return;
        }
        if (this.f2606c.f2841m && this.f2606c.f2839k != null) {
            this.f2606c.f2839k.connect();
        }
        for (C1382a.C1390f next2 : this.f2605b.keySet()) {
            C1550d.C1553c cVar = this.f2605b.get(next2);
            if (!next2.mo10799m() || lVar.mo11248b(this.f2606c.f2831c, next2) == 0) {
                next2.mo10796h(cVar);
            } else {
                this.f2606c.f2829a.mo11002i(new C1419c0(this, this.f2606c, cVar));
            }
        }
    }
}
