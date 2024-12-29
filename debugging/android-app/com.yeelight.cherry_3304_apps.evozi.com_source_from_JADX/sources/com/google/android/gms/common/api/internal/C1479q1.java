package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.C1507j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.q1 */
public final class C1479q1 {

    /* renamed from: d */
    public static final Status f2802d = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: e */
    private static final BasePendingResult<?>[] f2803e = new BasePendingResult[0];
    @VisibleForTesting

    /* renamed from: a */
    final Set<BasePendingResult<?>> f2804a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b */
    private final C1488t1 f2805b = new C1482r1(this);

    /* renamed from: c */
    private final Map<C1382a.C1385c<?>, C1382a.C1390f> f2806c;

    public C1479q1(Map<C1382a.C1385c<?>, C1382a.C1390f> map) {
        this.f2806c = map;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.common.api.k, com.google.android.gms.common.api.internal.r1, com.google.android.gms.common.api.internal.t1, com.google.android.gms.common.api.q] */
    /* renamed from: a */
    public final void mo11008a() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f2804a.toArray(f2803e)) {
            ? r5 = 0;
            basePendingResult.mo10849m(r5);
            if (basePendingResult.mo10851p() != null) {
                basePendingResult.mo10848j(r5);
                IBinder s = this.f2806c.get(((C1418c) basePendingResult).mo10891u()).mo10804s();
                if (basePendingResult.mo10846h()) {
                    basePendingResult.mo10849m(new C1485s1(basePendingResult, r5, s, r5));
                } else {
                    if (s == null || !s.isBinderAlive()) {
                        basePendingResult.mo10849m(r5);
                    } else {
                        C1485s1 s1Var = new C1485s1(basePendingResult, r5, s, r5);
                        basePendingResult.mo10849m(s1Var);
                        try {
                            s.linkToDeath(s1Var, 0);
                        } catch (RemoteException unused) {
                        }
                    }
                    basePendingResult.mo10843d();
                    r5.mo11033a(basePendingResult.mo10851p().intValue());
                }
            } else if (!basePendingResult.mo10852q()) {
            }
            this.f2804a.remove(basePendingResult);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11009b(BasePendingResult<? extends C1507j> basePendingResult) {
        this.f2804a.add(basePendingResult);
        basePendingResult.mo10849m(this.f2805b);
    }

    /* renamed from: c */
    public final void mo11010c() {
        for (BasePendingResult o : (BasePendingResult[]) this.f2804a.toArray(f2803e)) {
            o.mo10850o(f2802d);
        }
    }
}
