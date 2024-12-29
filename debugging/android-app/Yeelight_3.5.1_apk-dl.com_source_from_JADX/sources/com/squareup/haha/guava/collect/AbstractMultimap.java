package com.squareup.haha.guava.collect;

import com.squareup.haha.guava.base.Ascii;
import com.squareup.haha.guava.collect.Maps;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

abstract class AbstractMultimap<K, V> implements Multimap<K, V> {
    private transient Map<K, Collection<V>> asMap;
    private transient Collection<Map.Entry<K, V>> entries;
    private transient Set<K> keySet;
    private transient Collection<V> values;

    class EntrySet extends Entries implements Set {
        private EntrySet(AbstractMultimap abstractMultimap) {
            super(abstractMultimap, (byte) 0);
        }

        /* synthetic */ EntrySet(AbstractMultimap abstractMultimap, byte b) {
            this(abstractMultimap);
        }

        public final boolean equals(@Nullable Object obj) {
            return Ascii.equalsImpl(this, obj);
        }

        public final int hashCode() {
            return Ascii.hashCodeImpl(this);
        }
    }

    class Values extends AbstractCollection<V> {
        Values() {
        }

        public final void clear() {
            AbstractMultimap.this.clear();
        }

        public final boolean contains(@Nullable Object obj) {
            return AbstractMultimap.this.containsValue(obj);
        }

        public final Iterator<V> iterator() {
            return AbstractMultimap.this.valueIterator();
        }

        public final int size() {
            return AbstractMultimap.this.size();
        }
    }

    class Entries extends Multimaps$Entries<K, V> {
        private Entries() {
        }

        /* synthetic */ Entries(AbstractMultimap abstractMultimap, byte b) {
            this();
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractMultimap.this.entryIterator();
        }

        /* access modifiers changed from: package-private */
        public final Multimap<K, V> multimap() {
            return AbstractMultimap.this;
        }
    }

    AbstractMultimap() {
    }

    public Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.asMap;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> createAsMap = createAsMap();
        this.asMap = createAsMap;
        return createAsMap;
    }

    public boolean containsEntry(@Nullable Object obj, @Nullable Object obj2) {
        Collection collection = (Collection) asMap().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean containsValue(@Nullable Object obj) {
        for (Collection contains : asMap().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public abstract Map<K, Collection<V>> createAsMap();

    /* access modifiers changed from: package-private */
    public Collection<Map.Entry<K, V>> createEntries() {
        return this instanceof SetMultimap ? new EntrySet(this, (byte) 0) : new Entries(this, (byte) 0);
    }

    /* access modifiers changed from: package-private */
    public Set<K> createKeySet() {
        return new Maps.KeySet(asMap());
    }

    /* access modifiers changed from: package-private */
    public Collection<V> createValues() {
        return new Values();
    }

    public Collection<Map.Entry<K, V>> entries() {
        Collection<Map.Entry<K, V>> collection = this.entries;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> createEntries = createEntries();
        this.entries = createEntries;
        return createEntries;
    }

    /* access modifiers changed from: package-private */
    public abstract Iterator<Map.Entry<K, V>> entryIterator();

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Multimap) {
            return asMap().equals(((Multimap) obj).asMap());
        }
        return false;
    }

    public int hashCode() {
        return asMap().hashCode();
    }

    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        Set<K> createKeySet = createKeySet();
        this.keySet = createKeySet;
        return createKeySet;
    }

    public boolean put(@Nullable K k, @Nullable V v) {
        return get(k).add(v);
    }

    public boolean remove(@Nullable Object obj, @Nullable Object obj2) {
        Collection collection = (Collection) asMap().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return asMap().toString();
    }

    /* access modifiers changed from: package-private */
    public Iterator<V> valueIterator() {
        return Maps.valueIterator(entries().iterator());
    }

    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        Collection<V> createValues = createValues();
        this.values = createValues;
        return createValues;
    }
}
