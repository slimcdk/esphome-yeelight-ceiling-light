package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C1872a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.x */
public final class C0859x {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map f843a = Collections.synchronizedMap(new WeakHashMap());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map f844b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: h */
    private final void m1153h(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f843a) {
            hashMap = new HashMap(this.f843a);
        }
        synchronized (this.f844b) {
            hashMap2 = new HashMap(this.f844b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo11882f(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C1872a) entry2.getKey()).mo14739d(new ApiException(status));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo12088c(BasePendingResult basePendingResult, boolean z) {
        this.f843a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.mo11875b(new C0851v(this, basePendingResult));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo12089d(C1872a aVar, boolean z) {
        this.f844b.put(aVar, Boolean.valueOf(z));
        aVar.mo14736a().mo14760c(new C0855w(this, aVar));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12090e(int r4, @androidx.annotation.Nullable java.lang.String r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "The connection to Google Play services was lost"
            r0.<init>(r1)
            r1 = 1
            if (r4 != r1) goto L_0x0010
            java.lang.String r4 = " due to service disconnection."
        L_0x000c:
            r0.append(r4)
            goto L_0x0016
        L_0x0010:
            r2 = 3
            if (r4 != r2) goto L_0x0016
            java.lang.String r4 = " due to dead object exception."
            goto L_0x000c
        L_0x0016:
            if (r5 == 0) goto L_0x0020
            java.lang.String r4 = " Last reason for disconnect: "
            r0.append(r4)
            r0.append(r5)
        L_0x0020:
            com.google.android.gms.common.api.Status r4 = new com.google.android.gms.common.api.Status
            r5 = 20
            java.lang.String r0 = r0.toString()
            r4.<init>((int) r5, (java.lang.String) r0)
            r3.m1153h(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0859x.mo12090e(int, java.lang.String):void");
    }

    /* renamed from: f */
    public final void mo12091f() {
        m1153h(false, C0778g.f613r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo12092g() {
        return !this.f843a.isEmpty() || !this.f844b.isEmpty();
    }
}
