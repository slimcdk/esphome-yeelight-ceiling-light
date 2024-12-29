package com.squareup.haha.guava.collect;

import java.util.Map;
import javax.annotation.Nullable;

final class ImmutableMapKeySet<K, V> extends ImmutableSet<K> {
    private final ImmutableMap<K, V> map;

    ImmutableMapKeySet(ImmutableMap<K, V> immutableMap) {
        this.map = immutableMap;
    }

    public final boolean contains(@Nullable Object obj) {
        return this.map.containsKey(obj);
    }

    /* access modifiers changed from: package-private */
    public final ImmutableList<K> createAsList() {
        final ImmutableList<Map.Entry<K, V>> asList = this.map.entrySet().asList();
        return new ImmutableAsList<K>() {
            /* access modifiers changed from: package-private */
            public final ImmutableCollection<K> delegateCollection() {
                return ImmutableMapKeySet.this;
            }

            public final K get(int i) {
                return ((Map.Entry) asList.get(i)).getKey();
            }
        };
    }

    /* access modifiers changed from: package-private */
    public final boolean isPartialView() {
        return true;
    }

    public final UnmodifiableIterator<K> iterator() {
        return asList().iterator();
    }

    public final int size() {
        return this.map.size();
    }
}
