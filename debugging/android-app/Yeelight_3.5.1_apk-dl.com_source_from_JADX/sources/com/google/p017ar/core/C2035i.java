package com.google.p017ar.core;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.ar.core.i */
final class C2035i extends LinkedHashMap<Long, AugmentedFace> {
    C2035i(int i, float f, boolean z) {
        super(1, 0.75f, true);
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Map.Entry<Long, AugmentedFace> entry) {
        return size() > 10;
    }
}
