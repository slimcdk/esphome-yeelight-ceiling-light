package com.google.p107ar.core;

import java.util.Map;

/* renamed from: com.google.ar.core.g0 */
final class C2640g0 {

    /* renamed from: a */
    private final Map<Long, AugmentedFace> f5105a = new C2638f0(1, 0.75f, true);

    C2640g0() {
    }

    /* renamed from: a */
    public final synchronized AugmentedFace mo15189a(long j, Session session) {
        AugmentedFace augmentedFace;
        augmentedFace = this.f5105a.get(Long.valueOf(j));
        if (augmentedFace == null) {
            augmentedFace = new AugmentedFace(j, session);
            this.f5105a.put(Long.valueOf(j), augmentedFace);
        }
        return augmentedFace;
    }
}
