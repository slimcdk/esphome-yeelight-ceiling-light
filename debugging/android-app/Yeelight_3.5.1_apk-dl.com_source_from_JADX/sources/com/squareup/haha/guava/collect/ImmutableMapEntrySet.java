package com.squareup.haha.guava.collect;

import java.util.Map;
import javax.annotation.Nullable;

abstract class ImmutableMapEntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {
    public boolean contains(@Nullable Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = map().get(entry.getKey());
            return obj2 != null && obj2.equals(entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean isPartialView() {
        return map().isPartialView();
    }

    /* access modifiers changed from: package-private */
    public abstract ImmutableMap<K, V> map();

    public int size() {
        return map().size();
    }
}
