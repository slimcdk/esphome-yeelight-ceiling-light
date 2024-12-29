package com.google.p107ar.core;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.ar.core.f0 */
final class C2638f0 extends LinkedHashMap<Long, AugmentedFace> {
    C2638f0(int i, float f, boolean z) {
        super(1, 0.75f, true);
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Map.Entry<Long, AugmentedFace> entry) {
        return size() > 10;
    }
}
