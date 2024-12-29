package com.squareup.haha.guava.collect;

import java.util.Map;
import javax.annotation.Nullable;

final class ImmutableMapValues<K, V> extends ImmutableCollection<V> {
    private final ImmutableMap<K, V> map;

    ImmutableMapValues(ImmutableMap<K, V> immutableMap) {
        this.map = immutableMap;
    }

    public final boolean contains(@Nullable Object obj) {
        return obj != null && Iterators.contains(iterator(), obj);
    }

    /* access modifiers changed from: package-private */
    public final ImmutableList<V> createAsList() {
        final ImmutableList<Map.Entry<K, V>> asList = this.map.entrySet().asList();
        return new ImmutableAsList<V>() {
            /* access modifiers changed from: package-private */
            public final ImmutableCollection<V> delegateCollection() {
                return ImmutableMapValues.this;
            }

            public final V get(int i) {
                return ((Map.Entry) asList.get(i)).getValue();
            }
        };
    }

    /* access modifiers changed from: package-private */
    public final boolean isPartialView() {
        return true;
    }

    public final UnmodifiableIterator<V> iterator() {
        return Maps.valueIterator(this.map.entrySet().iterator());
    }

    public final int size() {
        return this.map.size();
    }
}
