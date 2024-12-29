package com.squareup.haha.guava.collect;

import java.io.Serializable;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class ImmutableMap<K, V> implements Serializable, Map<K, V> {
    private transient ImmutableSet<Map.Entry<K, V>> entrySet;
    private transient ImmutableSet<K> keySet;
    private transient ImmutableCollection<V> values;

    ImmutableMap() {
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m7505of() {
        return ImmutableBiMap.m11816of();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(@Nullable Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(@Nullable Object obj) {
        return values().contains(obj);
    }

    /* access modifiers changed from: package-private */
    public abstract ImmutableSet<Map.Entry<K, V>> createEntrySet();

    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> createEntrySet = createEntrySet();
        this.entrySet = createEntrySet;
        return createEntrySet;
    }

    public boolean equals(@Nullable Object obj) {
        return Maps.equalsImpl(this, obj);
    }

    public abstract V get(@Nullable Object obj);

    public int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean isPartialView();

    public ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.keySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableMapKeySet immutableMapKeySet = new ImmutableMapKeySet(this);
        this.keySet = immutableMapKeySet;
        return immutableMapKeySet;
    }

    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return Maps.toStringImpl(this);
    }

    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.values;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableMapValues immutableMapValues = new ImmutableMapValues(this);
        this.values = immutableMapValues;
        return immutableMapValues;
    }
}
