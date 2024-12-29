package com.squareup.haha.guava.collect;

import java.util.Map;
import javax.annotation.Nullable;

final class EmptyImmutableBiMap extends ImmutableBiMap<Object, Object> {
    static final EmptyImmutableBiMap INSTANCE = new EmptyImmutableBiMap();

    private EmptyImmutableBiMap() {
    }

    /* access modifiers changed from: package-private */
    public final ImmutableSet<Map.Entry<Object, Object>> createEntrySet() {
        throw new AssertionError("should never be called");
    }

    public final ImmutableSet<Map.Entry<Object, Object>> entrySet() {
        return ImmutableSet.m7506of();
    }

    public final Object get(@Nullable Object obj) {
        return null;
    }

    public final ImmutableBiMap<Object, Object> inverse() {
        return this;
    }

    public final boolean isEmpty() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean isPartialView() {
        return false;
    }

    public final ImmutableSet<Object> keySet() {
        return ImmutableSet.m7506of();
    }

    public final int size() {
        return 0;
    }
}
