package com.squareup.haha.guava.collect;

import com.squareup.haha.guava.base.Ascii;
import java.util.Map;
import javax.annotation.Nullable;

abstract class AbstractMapEntry<K, V> implements Map.Entry<K, V> {
    AbstractMapEntry() {
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return Ascii.equal(getKey(), entry.getKey()) && Ascii.equal(getValue(), entry.getValue());
        }
    }

    public abstract K getKey();

    public abstract V getValue();

    public int hashCode() {
        Object key = getKey();
        Object value = getValue();
        int i = 0;
        int hashCode = key == null ? 0 : key.hashCode();
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    public V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return getKey() + "=" + getValue();
    }
}
