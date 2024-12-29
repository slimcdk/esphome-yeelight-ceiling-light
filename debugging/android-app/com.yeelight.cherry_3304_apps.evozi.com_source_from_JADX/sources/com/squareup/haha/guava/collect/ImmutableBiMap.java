package com.squareup.haha.guava.collect;

public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements BiMap<K, V> {
    ImmutableBiMap() {
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m10635of() {
        return EmptyImmutableBiMap.INSTANCE;
    }

    public abstract ImmutableBiMap<V, K> inverse();
}
