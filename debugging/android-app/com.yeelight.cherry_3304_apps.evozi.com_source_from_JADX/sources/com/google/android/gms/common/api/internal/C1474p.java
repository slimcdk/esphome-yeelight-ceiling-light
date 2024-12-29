package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1393b;
import com.google.android.gms.common.api.C1507j;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p011c.p012a.p019b.p028b.p038e.C0620i;

/* renamed from: com.google.android.gms.common.api.internal.p */
public final class C1474p {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<BasePendingResult<?>, Boolean> f2782a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    private final Map<C0620i<?>, Boolean> f2783b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: c */
    private final void m3982c(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f2782a) {
            hashMap = new HashMap(this.f2782a);
        }
        synchronized (this.f2783b) {
            hashMap2 = new HashMap(this.f2783b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo10850o(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C0620i) entry2.getKey()).mo8669d(new C1393b(status));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo10998b(BasePendingResult<? extends C1507j> basePendingResult, boolean z) {
        this.f2782a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.mo10839b(new C1477q(this, basePendingResult));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo10999d() {
        return !this.f2782a.isEmpty() || !this.f2783b.isEmpty();
    }

    /* renamed from: e */
    public final void mo11000e() {
        m3982c(false, C1426e.f2630n);
    }

    /* renamed from: f */
    public final void mo11001f() {
        m3982c(true, C1479q1.f2802d);
    }
}
