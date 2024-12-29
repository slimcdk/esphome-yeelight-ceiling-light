package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.q2 */
public final class C0833q2 {

    /* renamed from: c */
    public static final Status f762c = new Status(8, "The connection to Google Play services was lost");
    @VisibleForTesting

    /* renamed from: a */
    final Set f763a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b */
    private final C0829p2 f764b = new C0829p2(this);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12062a(BasePendingResult basePendingResult) {
        this.f763a.add(basePendingResult);
        basePendingResult.mo11888p(this.f764b);
    }

    /* renamed from: b */
    public final void mo12063b() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f763a.toArray(new BasePendingResult[0])) {
            basePendingResult.mo11888p((C0829p2) null);
            if (basePendingResult.mo11887o()) {
                this.f763a.remove(basePendingResult);
            }
        }
    }
}
