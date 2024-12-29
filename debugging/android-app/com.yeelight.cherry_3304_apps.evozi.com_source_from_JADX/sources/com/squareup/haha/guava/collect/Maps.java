package com.squareup.haha.guava.collect;

import androidx.appcompat.widget.ActivityChooserView;
import com.squareup.haha.guava.base.Ascii;
import com.squareup.haha.guava.base.Function;
import com.squareup.haha.guava.base.Joiner$MapJoiner;
import com.squareup.haha.guava.base.Predicate;
import com.squareup.haha.guava.base.Predicates;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.Nullable;

public final class Maps {
    private static Joiner$MapJoiner STANDARD_JOINER = Collections2.STANDARD_JOINER$5f22bbb7.withKeyValueSeparator("=");

    static abstract class AbstractFilteredMap<K, V> extends ImprovedAbstractMap<K, V> {
        private Predicate<? super Map.Entry<K, V>> predicate;
        private Map<K, V> unfiltered;

        private boolean apply(@Nullable Object obj, @Nullable V v) {
            return this.predicate.apply(Maps.immutableEntry(obj, v));
        }

        public boolean containsKey(Object obj) {
            return this.unfiltered.containsKey(obj) && apply(obj, this.unfiltered.get(obj));
        }

        /* access modifiers changed from: package-private */
        public final Collection<V> createValues() {
            return new FilteredMapValues(this, this.unfiltered, this.predicate);
        }

        public V get(Object obj) {
            V v = this.unfiltered.get(obj);
            if (v == null || !apply(obj, v)) {
                return null;
            }
            return v;
        }

        public boolean isEmpty() {
            return entrySet().isEmpty();
        }

        public V put(K k, V v) {
            Ascii.checkArgument(apply(k, v));
            return this.unfiltered.put(k, v);
        }

        public void putAll(Map<? extends K, ? extends V> map) {
            for (Map.Entry next : map.entrySet()) {
                Ascii.checkArgument(apply(next.getKey(), next.getValue()));
            }
            this.unfiltered.putAll(map);
        }

        public V remove(Object obj) {
            if (containsKey(obj)) {
                return this.unfiltered.remove(obj);
            }
            return null;
        }
    }

    static abstract class DescendingMap<K, V> extends ForwardingMap<K, V> implements NavigableMap<K, V> {
        private transient Comparator<? super K> comparator;
        private transient Set<Map.Entry<K, V>> entrySet;
        private transient NavigableSet<K> navigableKeySet;

        DescendingMap() {
        }

        public Map.Entry<K, V> ceilingEntry(K k) {
            return delegate().floorEntry(k);
        }

        public K ceilingKey(K k) {
            return delegate().floorKey(k);
        }

        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator2 = this.comparator;
            if (comparator2 != null) {
                return comparator2;
            }
            Comparator comparator3 = delegate().comparator();
            if (comparator3 == null) {
                comparator3 = Ordering.natural();
            }
            Ordering reverse = Ordering.from(comparator3).reverse();
            this.comparator = reverse;
            return reverse;
        }

        /* access modifiers changed from: protected */
        public final Map<K, V> delegate() {
            return delegate();
        }

        public NavigableSet<K> descendingKeySet() {
            return delegate().navigableKeySet();
        }

        public NavigableMap<K, V> descendingMap() {
            return delegate();
        }

        /* access modifiers changed from: package-private */
        public abstract Iterator<Map.Entry<K, V>> entryIterator();

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.entrySet;
            if (set != null) {
                return set;
            }
            C38821 r0 = new EntrySet<K, V>() {
                public final Iterator<Map.Entry<K, V>> iterator() {
                    return DescendingMap.this.entryIterator();
                }

                /* access modifiers changed from: package-private */
                public final Map<K, V> map() {
                    return DescendingMap.this;
                }
            };
            this.entrySet = r0;
            return r0;
        }

        public Map.Entry<K, V> firstEntry() {
            return delegate().lastEntry();
        }

        public K firstKey() {
            return delegate().lastKey();
        }

        public Map.Entry<K, V> floorEntry(K k) {
            return delegate().ceilingEntry(k);
        }

        public K floorKey(K k) {
            return delegate().ceilingKey(k);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: forward */
        public abstract NavigableMap<K, V> delegate();

        public NavigableMap<K, V> headMap(K k, boolean z) {
            return delegate().tailMap(k, z).descendingMap();
        }

        public SortedMap<K, V> headMap(K k) {
            return headMap(k, false);
        }

        public Map.Entry<K, V> higherEntry(K k) {
            return delegate().lowerEntry(k);
        }

        public K higherKey(K k) {
            return delegate().lowerKey(k);
        }

        public Set<K> keySet() {
            return navigableKeySet();
        }

        public Map.Entry<K, V> lastEntry() {
            return delegate().firstEntry();
        }

        public K lastKey() {
            return delegate().firstKey();
        }

        public Map.Entry<K, V> lowerEntry(K k) {
            return delegate().higherEntry(k);
        }

        public K lowerKey(K k) {
            return delegate().higherKey(k);
        }

        public NavigableSet<K> navigableKeySet() {
            NavigableSet<K> navigableSet = this.navigableKeySet;
            if (navigableSet != null) {
                return navigableSet;
            }
            NavigableKeySet navigableKeySet2 = new NavigableKeySet(this);
            this.navigableKeySet = navigableKeySet2;
            return navigableKeySet2;
        }

        public Map.Entry<K, V> pollFirstEntry() {
            return delegate().pollLastEntry();
        }

        public Map.Entry<K, V> pollLastEntry() {
            return delegate().pollFirstEntry();
        }

        public NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
            return delegate().subMap(k2, z2, k, z).descendingMap();
        }

        public SortedMap<K, V> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        public NavigableMap<K, V> tailMap(K k, boolean z) {
            return delegate().headMap(k, z).descendingMap();
        }

        public SortedMap<K, V> tailMap(K k) {
            return tailMap(k, true);
        }

        public String toString() {
            return Maps.toStringImpl(this);
        }

        public Collection<V> values() {
            return new Values(this);
        }
    }

    enum EntryFunction implements Function<Map.Entry<?, ?>, Object> {
        KEY {
            public final /* bridge */ /* synthetic */ Object apply(Object obj) {
                return ((Map.Entry) obj).getKey();
            }
        },
        VALUE {
            public final /* bridge */ /* synthetic */ Object apply(Object obj) {
                return ((Map.Entry) obj).getValue();
            }
        };

        static {
            KEY = new EntryFunction("KEY", 0) {
                public final /* bridge */ /* synthetic */ Object apply(Object obj) {
                    return ((Map.Entry) obj).getKey();
                }
            };
            VALUE = new EntryFunction("VALUE", 1) {
                public final /* bridge */ /* synthetic */ Object apply(Object obj) {
                    return ((Map.Entry) obj).getValue();
                }
            };
        }
    }

    static abstract class EntrySet<K, V> extends Sets$ImprovedAbstractSet<Map.Entry<K, V>> {
        EntrySet() {
        }

        public void clear() {
            map().clear();
        }

        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object safeGet = Maps.safeGet(map(), key);
                return Ascii.equal(safeGet, entry.getValue()) && (safeGet != null || map().containsKey(key));
            }
        }

        public boolean isEmpty() {
            return map().isEmpty();
        }

        /* access modifiers changed from: package-private */
        public abstract Map<K, V> map();

        public boolean remove(Object obj) {
            if (contains(obj)) {
                return map().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) Ascii.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                return Ascii.removeAllImpl((Set<?>) this, collection.iterator());
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) Ascii.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet(Maps.capacity(collection.size()));
                for (Object next : collection) {
                    if (contains(next)) {
                        hashSet.add(((Map.Entry) next).getKey());
                    }
                }
                return map().keySet().retainAll(hashSet);
            }
        }

        public int size() {
            return map().size();
        }
    }

    static final class FilteredMapValues<K, V> extends Values<K, V> {
        private Predicate<? super Map.Entry<K, V>> predicate;
        private Map<K, V> unfiltered;

        FilteredMapValues(Map<K, V> map, Map<K, V> map2, Predicate<? super Map.Entry<K, V>> predicate2) {
            super(map);
            this.unfiltered = map2;
            this.predicate = predicate2;
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [com.squareup.haha.guava.base.Predicate<? super V>, com.squareup.haha.guava.base.Predicate] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean removeIf(com.squareup.haha.guava.base.Predicate<? super V> r3) {
            /*
                r2 = this;
                java.util.Map<K, V> r0 = r2.unfiltered
                java.util.Set r0 = r0.entrySet()
                com.squareup.haha.guava.base.Predicate<? super java.util.Map$Entry<K, V>> r1 = r2.predicate
                com.squareup.haha.guava.base.Predicate r3 = com.squareup.haha.guava.collect.Maps.valuePredicateOnEntries(r3)
                com.squareup.haha.guava.base.Predicate r3 = com.squareup.haha.guava.base.Predicates.and(r1, r3)
                boolean r1 = r0 instanceof java.util.RandomAccess
                if (r1 == 0) goto L_0x0025
                boolean r1 = r0 instanceof java.util.List
                if (r1 == 0) goto L_0x0025
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r3 = com.squareup.haha.guava.base.Ascii.checkNotNull(r3)
                com.squareup.haha.guava.base.Predicate r3 = (com.squareup.haha.guava.base.Predicate) r3
                boolean r3 = com.squareup.haha.guava.base.Ascii.removeIfFromRandomAccessList(r0, r3)
                return r3
            L_0x0025:
                java.util.Iterator r0 = r0.iterator()
                boolean r3 = com.squareup.haha.guava.collect.Iterators.removeIf(r0, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.haha.guava.collect.Maps.FilteredMapValues.removeIf(com.squareup.haha.guava.base.Predicate):boolean");
        }

        public final boolean remove(Object obj) {
            T t;
            Set<Map.Entry<K, V>> entrySet = this.unfiltered.entrySet();
            Predicate<? super Map.Entry<K, V>> and = Predicates.and(this.predicate, Maps.valuePredicateOnEntries(Predicates.equalTo(obj)));
            Ascii.checkNotNull(and);
            Iterator<T> it = entrySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (and.apply(t)) {
                    it.remove();
                    break;
                }
            }
            return t != null;
        }

        public final boolean removeAll(Collection<?> collection) {
            return removeIf(Predicates.m10634in(collection));
        }

        public final boolean retainAll(Collection<?> collection) {
            return removeIf(Predicates.not(Predicates.m10634in(collection)));
        }

        public final Object[] toArray() {
            return Ascii.newArrayList(iterator()).toArray();
        }

        public final <T> T[] toArray(T[] tArr) {
            return Ascii.newArrayList(iterator()).toArray(tArr);
        }
    }

    static abstract class ImprovedAbstractMap<K, V> extends AbstractMap<K, V> {
        private transient Set<Map.Entry<K, V>> entrySet;
        private transient Set<K> keySet;
        private transient Collection<V> values;

        ImprovedAbstractMap() {
        }

        /* access modifiers changed from: package-private */
        public abstract Set<Map.Entry<K, V>> createEntrySet();

        /* access modifiers changed from: package-private */
        public Set<K> createKeySet() {
            return new KeySet(this);
        }

        /* access modifiers changed from: package-private */
        public Collection<V> createValues() {
            return new Values(this);
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.entrySet;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> createEntrySet = createEntrySet();
            this.entrySet = createEntrySet;
            return createEntrySet;
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

    static class KeySet<K, V> extends Sets$ImprovedAbstractSet<K> {
        final Map<K, V> map;

        KeySet(Map<K, V> map2) {
            this.map = (Map) Ascii.checkNotNull(map2);
        }

        public void clear() {
            map().clear();
        }

        public boolean contains(Object obj) {
            return map().containsKey(obj);
        }

        public boolean isEmpty() {
            return map().isEmpty();
        }

        public Iterator<K> iterator() {
            return Maps.keyIterator(map().entrySet().iterator());
        }

        /* access modifiers changed from: package-private */
        public Map<K, V> map() {
            return this.map;
        }

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            map().remove(obj);
            return true;
        }

        public int size() {
            return map().size();
        }
    }

    static class NavigableKeySet<K, V> extends SortedKeySet<K, V> implements NavigableSet<K> {
        NavigableKeySet(NavigableMap<K, V> navigableMap) {
            super(navigableMap);
        }

        public final K ceiling(K k) {
            return ((NavigableMap) this.map).ceilingKey(k);
        }

        public final Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        public final NavigableSet<K> descendingSet() {
            return ((NavigableMap) this.map).descendingKeySet();
        }

        public final K floor(K k) {
            return ((NavigableMap) this.map).floorKey(k);
        }

        public final NavigableSet<K> headSet(K k, boolean z) {
            return ((NavigableMap) this.map).headMap(k, z).navigableKeySet();
        }

        public final SortedSet<K> headSet(K k) {
            return headSet(k, false);
        }

        public final K higher(K k) {
            return ((NavigableMap) this.map).higherKey(k);
        }

        public final K lower(K k) {
            return ((NavigableMap) this.map).lowerKey(k);
        }

        public final K pollFirst() {
            return Maps.keyOrNull(((NavigableMap) this.map).pollFirstEntry());
        }

        public final K pollLast() {
            return Maps.keyOrNull(((NavigableMap) this.map).pollLastEntry());
        }

        public final NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return ((NavigableMap) this.map).subMap(k, z, k2, z2).navigableKeySet();
        }

        public final SortedSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        public final NavigableSet<K> tailSet(K k, boolean z) {
            return ((NavigableMap) this.map).tailMap(k, z).navigableKeySet();
        }

        public final SortedSet<K> tailSet(K k) {
            return tailSet(k, true);
        }
    }

    static class SortedKeySet<K, V> extends KeySet<K, V> implements SortedSet<K> {
        SortedKeySet(SortedMap<K, V> sortedMap) {
            super(sortedMap);
        }

        public Comparator<? super K> comparator() {
            return map().comparator();
        }

        public K first() {
            return map().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new SortedKeySet(map().headMap(k));
        }

        public K last() {
            return map().lastKey();
        }

        /* access modifiers changed from: package-private */
        public SortedMap<K, V> map() {
            return (SortedMap) super.map();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new SortedKeySet(map().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new SortedKeySet(map().tailMap(k));
        }
    }

    static class Values<K, V> extends AbstractCollection<V> {
        private Map<K, V> map;

        Values(Map<K, V> map2) {
            this.map = (Map) Ascii.checkNotNull(map2);
        }

        public void clear() {
            this.map.clear();
        }

        public boolean contains(@Nullable Object obj) {
            return this.map.containsValue(obj);
        }

        public boolean isEmpty() {
            return this.map.isEmpty();
        }

        public Iterator<V> iterator() {
            return Maps.valueIterator(this.map.entrySet().iterator());
        }

        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry next : this.map.entrySet()) {
                    if (Ascii.equal(obj, next.getValue())) {
                        this.map.remove(next.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) Ascii.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry next : this.map.entrySet()) {
                    if (collection.contains(next.getValue())) {
                        hashSet.add(next.getKey());
                    }
                }
                return this.map.keySet().removeAll(hashSet);
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) Ascii.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry next : this.map.entrySet()) {
                    if (collection.contains(next.getValue())) {
                        hashSet.add(next.getKey());
                    }
                }
                return this.map.keySet().retainAll(hashSet);
            }
        }

        public int size() {
            return this.map.size();
        }
    }

    public static int capacity(int i) {
        if (i >= 3) {
            return i < 1073741824 ? i + (i / 3) : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        Ascii.checkNonnegative(i, "expectedSize");
        return i + 1;
    }

    static boolean equalsImpl(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <K, V> Map.Entry<K, V> immutableEntry(@Nullable K k, @Nullable V v) {
        return new ImmutableEntry(k, v);
    }

    static <K, V> Iterator<K> keyIterator(Iterator<Map.Entry<K, V>> it) {
        return Iterators.transform(it, EntryFunction.KEY);
    }

    @Nullable
    static <K> K keyOrNull(@Nullable Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<>();
    }

    static boolean safeContainsKey(Map<?, ?> map, Object obj) {
        Ascii.checkNotNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static <V> V safeGet(Map<?, V> map, @Nullable Object obj) {
        Ascii.checkNotNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static <V> V safeRemove(Map<?, V> map, Object obj) {
        Ascii.checkNotNull(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static String toStringImpl(Map<?, ?> map) {
        StringBuilder newStringBuilderForCollection = Collections2.newStringBuilderForCollection(map.size());
        newStringBuilderForCollection.append('{');
        STANDARD_JOINER.appendTo(newStringBuilderForCollection, map.entrySet().iterator());
        newStringBuilderForCollection.append('}');
        return newStringBuilderForCollection.toString();
    }

    static <K, V> UnmodifiableIterator<V> valueIterator(final UnmodifiableIterator<Map.Entry<K, V>> unmodifiableIterator) {
        return new UnmodifiableIterator<V>() {
            public final boolean hasNext() {
                return unmodifiableIterator.hasNext();
            }

            public final V next() {
                return ((Map.Entry) unmodifiableIterator.next()).getValue();
            }
        };
    }

    static <K, V> Iterator<V> valueIterator(Iterator<Map.Entry<K, V>> it) {
        return Iterators.transform(it, EntryFunction.VALUE);
    }

    static <V> Predicate<Map.Entry<?, V>> valuePredicateOnEntries(Predicate<? super V> predicate) {
        return Predicates.compose(predicate, EntryFunction.VALUE);
    }
}
