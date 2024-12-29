package com.squareup.haha.guava.collect;

import com.squareup.haha.guava.base.Ascii;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import javax.annotation.Nullable;

public abstract class ImmutableSortedMap<K, V> extends ImmutableSortedMapFauxverideShim<K, V> implements NavigableMap<K, V> {
    private static final Comparator<Comparable> NATURAL_ORDER;
    private transient ImmutableSortedMap<K, V> descendingMap;

    static {
        Ordering natural = Ordering.natural();
        NATURAL_ORDER = natural;
        new EmptyImmutableSortedMap(natural);
    }

    ImmutableSortedMap() {
    }

    ImmutableSortedMap(ImmutableSortedMap<K, V> immutableSortedMap) {
        this.descendingMap = immutableSortedMap;
    }

    /* access modifiers changed from: private */
    public ImmutableSortedMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
        Ascii.checkNotNull(k);
        Ascii.checkNotNull(k2);
        Ascii.checkArgument(comparator().compare(k, k2) <= 0, "expected fromKey <= toKey but %s > %s", k, k2);
        return headMap(k2).tailMap(k);
    }

    public Map.Entry<K, V> ceilingEntry(K k) {
        return tailMap(k).firstEntry();
    }

    public K ceilingKey(K k) {
        return Maps.keyOrNull(ceilingEntry(k));
    }

    public Comparator<? super K> comparator() {
        return navigableKeySet().comparator();
    }

    public boolean containsValue(@Nullable Object obj) {
        return values().contains(obj);
    }

    /* access modifiers changed from: package-private */
    public abstract ImmutableSortedMap<K, V> createDescendingMap();

    public /* bridge */ /* synthetic */ NavigableSet descendingKeySet() {
        return navigableKeySet().descendingSet();
    }

    public /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        ImmutableSortedMap<K, V> immutableSortedMap = this.descendingMap;
        if (immutableSortedMap != null) {
            return immutableSortedMap;
        }
        ImmutableSortedMap<K, V> createDescendingMap = createDescendingMap();
        this.descendingMap = createDescendingMap;
        return createDescendingMap;
    }

    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    public Map.Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().asList().get(0);
    }

    public K firstKey() {
        return navigableKeySet().first();
    }

    public Map.Entry<K, V> floorEntry(K k) {
        return headMap(k).lastEntry();
    }

    public K floorKey(K k) {
        return Maps.keyOrNull(floorEntry(k));
    }

    public /* bridge */ /* synthetic */ NavigableMap headMap(Object obj, boolean z) {
        return headMap(obj);
    }

    /* renamed from: headMap$166011c5 */
    public abstract ImmutableSortedMap<K, V> headMap(K k);

    public Map.Entry<K, V> higherEntry(K k) {
        return tailMap(k).firstEntry();
    }

    public K higherKey(K k) {
        return Maps.keyOrNull(higherEntry(k));
    }

    /* access modifiers changed from: package-private */
    public boolean isPartialView() {
        return navigableKeySet().isPartialView() || values().isPartialView();
    }

    public abstract ImmutableSortedSet<K> keySet();

    public Map.Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().asList().get(size() - 1);
    }

    public K lastKey() {
        return navigableKeySet().last();
    }

    public Map.Entry<K, V> lowerEntry(K k) {
        return headMap(k).lastEntry();
    }

    public K lowerKey(K k) {
        return Maps.keyOrNull(lowerEntry(k));
    }

    @Deprecated
    public final Map.Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Map.Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return values().size();
    }

    public /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    public /* bridge */ /* synthetic */ NavigableMap tailMap(Object obj, boolean z) {
        return tailMap(obj);
    }

    /* renamed from: tailMap$166011c5 */
    public abstract ImmutableSortedMap<K, V> tailMap(K k);

    public abstract ImmutableCollection<V> values();
}
