package com.squareup.haha.guava.collect;

import com.squareup.haha.guava.collect.Maps;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.Nullable;

abstract class AbstractNavigableMap<K, V> extends AbstractMap<K, V> implements NavigableMap<K, V> {

    final class DescendingMap extends Maps.DescendingMap<K, V> {
        private DescendingMap() {
        }

        /* synthetic */ DescendingMap(AbstractNavigableMap abstractNavigableMap, byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        public final Iterator<Map.Entry<K, V>> entryIterator() {
            return AbstractNavigableMap.this.descendingEntryIterator();
        }

        /* access modifiers changed from: package-private */
        public final NavigableMap<K, V> forward() {
            return AbstractNavigableMap.this;
        }
    }

    @Nullable
    public Map.Entry<K, V> ceilingEntry(K k) {
        return tailMap(k, true).firstEntry();
    }

    public K ceilingKey(K k) {
        return Maps.keyOrNull(ceilingEntry(k));
    }

    /* access modifiers changed from: package-private */
    public abstract Iterator<Map.Entry<K, V>> descendingEntryIterator();

    public NavigableSet<K> descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    public NavigableMap<K, V> descendingMap() {
        return new DescendingMap(this, (byte) 0);
    }

    /* access modifiers changed from: package-private */
    public abstract Iterator<Map.Entry<K, V>> entryIterator();

    public Set<Map.Entry<K, V>> entrySet() {
        return new Maps.EntrySet<K, V>() {
            public final Iterator<Map.Entry<K, V>> iterator() {
                return AbstractNavigableMap.this.entryIterator();
            }

            /* access modifiers changed from: package-private */
            public final Map<K, V> map() {
                return AbstractNavigableMap.this;
            }
        };
    }

    @Nullable
    public Map.Entry<K, V> firstEntry() {
        return (Map.Entry) Iterators.getNext(entryIterator(), null);
    }

    public K firstKey() {
        Map.Entry firstEntry = firstEntry();
        if (firstEntry != null) {
            return firstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Nullable
    public Map.Entry<K, V> floorEntry(K k) {
        return headMap(k, true).lastEntry();
    }

    public K floorKey(K k) {
        return Maps.keyOrNull(floorEntry(k));
    }

    public SortedMap<K, V> headMap(K k) {
        return headMap(k, false);
    }

    @Nullable
    public Map.Entry<K, V> higherEntry(K k) {
        return tailMap(k, false).firstEntry();
    }

    public K higherKey(K k) {
        return Maps.keyOrNull(higherEntry(k));
    }

    public Set<K> keySet() {
        return navigableKeySet();
    }

    @Nullable
    public Map.Entry<K, V> lastEntry() {
        return (Map.Entry) Iterators.getNext(descendingEntryIterator(), null);
    }

    public K lastKey() {
        Map.Entry lastEntry = lastEntry();
        if (lastEntry != null) {
            return lastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Nullable
    public Map.Entry<K, V> lowerEntry(K k) {
        return headMap(k, false).lastEntry();
    }

    public K lowerKey(K k) {
        return Maps.keyOrNull(lowerEntry(k));
    }

    public NavigableSet<K> navigableKeySet() {
        return new Maps.NavigableKeySet(this);
    }

    @Nullable
    public Map.Entry<K, V> pollFirstEntry() {
        return (Map.Entry) Iterators.pollNext(entryIterator());
    }

    @Nullable
    public Map.Entry<K, V> pollLastEntry() {
        return (Map.Entry) Iterators.pollNext(descendingEntryIterator());
    }

    public SortedMap<K, V> subMap(K k, K k2) {
        return subMap(k, true, k2, false);
    }

    public SortedMap<K, V> tailMap(K k) {
        return tailMap(k, true);
    }
}
