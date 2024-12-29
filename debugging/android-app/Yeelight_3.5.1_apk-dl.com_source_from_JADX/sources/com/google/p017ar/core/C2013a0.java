package com.google.p017ar.core;

import java.util.Map;

/* renamed from: com.google.ar.core.a0 */
final class C2013a0 {

    /* renamed from: a */
    private final Map<Long, AugmentedFace> f3164a = new C2035i(1, 0.75f, true);

    C2013a0() {
    }

    /* renamed from: a */
    public final synchronized AugmentedFace mo16632a(long j, Session session) {
        AugmentedFace augmentedFace;
        augmentedFace = this.f3164a.get(Long.valueOf(j));
        if (augmentedFace == null) {
            augmentedFace = new AugmentedFace(j, session);
            this.f3164a.put(Long.valueOf(j), augmentedFace);
        }
        return augmentedFace;
    }
}
