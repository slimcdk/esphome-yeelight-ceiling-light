package com.squareup.haha.guava.collect;

import com.squareup.haha.guava.base.Ascii;
import com.squareup.haha.guava.collect.Maps;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.Nullable;

abstract class AbstractMapBasedMultimap<K, V> extends AbstractMultimap<K, V> implements Serializable {
    /* access modifiers changed from: private */
    public transient Map<K, Collection<V>> map;
    private transient int totalSize;

    class AsMap extends Maps.ImprovedAbstractMap<K, Collection<V>> {
        final transient Map<K, Collection<V>> submap;

        class AsMapEntries extends Maps.EntrySet<K, Collection<V>> {
            AsMapEntries() {
            }

            public final boolean contains(Object obj) {
                return Collections2.safeContains(AsMap.this.submap.entrySet(), obj);
            }

            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new AsMapIterator();
            }

            /* access modifiers changed from: package-private */
            public final Map<K, Collection<V>> map() {
                return AsMap.this;
            }

            public final boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                AbstractMapBasedMultimap.access$400(AbstractMapBasedMultimap.this, ((Map.Entry) obj).getKey());
                return true;
            }
        }

        class AsMapIterator implements Iterator<Map.Entry<K, Collection<V>>> {
            private Collection<V> collection;
            private Iterator<Map.Entry<K, Collection<V>>> delegateIterator = AsMap.this.submap.entrySet().iterator();

            AsMapIterator() {
            }

            public final boolean hasNext() {
                return this.delegateIterator.hasNext();
            }

            public final /* bridge */ /* synthetic */ Object next() {
                Map.Entry next = this.delegateIterator.next();
                this.collection = (Collection) next.getValue();
                AsMap asMap = AsMap.this;
                Object key = next.getKey();
                return Maps.immutableEntry(key, AbstractMapBasedMultimap.this.wrapCollection(key, (Collection) next.getValue()));
            }

            public final void remove() {
                this.delegateIterator.remove();
                AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, this.collection.size());
                this.collection.clear();
            }
        }

        AsMap(Map<K, Collection<V>> map) {
            this.submap = map;
        }

        public void clear() {
            if (this.submap == AbstractMapBasedMultimap.this.map) {
                AbstractMapBasedMultimap.this.clear();
            } else {
                Iterators.clear(new AsMapIterator());
            }
        }

        public boolean containsKey(Object obj) {
            return Maps.safeContainsKey(this.submap, obj);
        }

        /* access modifiers changed from: protected */
        public final Set<Map.Entry<K, Collection<V>>> createEntrySet() {
            return new AsMapEntries();
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || this.submap.equals(obj);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            Collection collection = (Collection) Maps.safeGet(this.submap, obj);
            if (collection == null) {
                return null;
            }
            return AbstractMapBasedMultimap.this.wrapCollection(obj, collection);
        }

        public int hashCode() {
            return this.submap.hashCode();
        }

        public Set<K> keySet() {
            return AbstractMapBasedMultimap.this.keySet();
        }

        public /* bridge */ /* synthetic */ Object remove(Object obj) {
            Collection remove = this.submap.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection createCollection = AbstractMapBasedMultimap.this.createCollection();
            createCollection.addAll(remove);
            AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, remove.size());
            remove.clear();
            return createCollection;
        }

        public int size() {
            return this.submap.size();
        }

        public String toString() {
            return this.submap.toString();
        }
    }

    abstract class Itr<T> implements Iterator<T> {
        private Collection<V> collection = null;
        private K key = null;
        private Iterator<Map.Entry<K, Collection<V>>> keyIterator;
        private Iterator<V> valueIterator = Iterators.emptyModifiableIterator();

        Itr() {
            this.keyIterator = AbstractMapBasedMultimap.this.map.entrySet().iterator();
        }

        public boolean hasNext() {
            return this.keyIterator.hasNext() || this.valueIterator.hasNext();
        }

        public T next() {
            if (!this.valueIterator.hasNext()) {
                Map.Entry next = this.keyIterator.next();
                this.key = next.getKey();
                Collection<V> collection2 = (Collection) next.getValue();
                this.collection = collection2;
                this.valueIterator = collection2.iterator();
            }
            return output(this.key, this.valueIterator.next());
        }

        /* access modifiers changed from: package-private */
        public abstract T output(K k, V v);

        public void remove() {
            this.valueIterator.remove();
            if (this.collection.isEmpty()) {
                this.keyIterator.remove();
            }
            AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
        }
    }

    class KeySet extends Maps.KeySet<K, Collection<V>> {
        KeySet(Map<K, Collection<V>> map) {
            super(map);
        }

        public void clear() {
            Iterators.clear(iterator());
        }

        public boolean containsAll(Collection<?> collection) {
            return map().keySet().containsAll(collection);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || map().keySet().equals(obj);
        }

        public int hashCode() {
            return map().keySet().hashCode();
        }

        public Iterator<K> iterator() {
            final Iterator it = map().entrySet().iterator();
            return new Iterator<K>() {
                private Map.Entry<K, Collection<V>> entry;

                public final boolean hasNext() {
                    return it.hasNext();
                }

                public final K next() {
                    Map.Entry<K, Collection<V>> entry2 = (Map.Entry) it.next();
                    this.entry = entry2;
                    return entry2.getKey();
                }

                public final void remove() {
                    Ascii.checkRemove(this.entry != null);
                    Collection value = this.entry.getValue();
                    it.remove();
                    AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, value.size());
                    value.clear();
                }
            };
        }

        public boolean remove(Object obj) {
            int i;
            Collection collection = (Collection) map().remove(obj);
            if (collection != null) {
                i = collection.size();
                collection.clear();
                AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, i);
            } else {
                i = 0;
            }
            return i > 0;
        }
    }

    class RandomAccessWrappedList extends WrappedList implements RandomAccess {
        RandomAccessWrappedList(AbstractMapBasedMultimap abstractMapBasedMultimap, @Nullable Object obj, List list, @Nullable WrappedCollection wrappedCollection) {
            super(obj, list, wrappedCollection);
        }
    }

    class SortedAsMap extends AsMap implements SortedMap {
        private SortedSet<K> sortedKeySet;

        SortedAsMap(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        /* access modifiers changed from: private */
        public SortedSet<K> createKeySet() {
            return new SortedKeySet((SortedMap) this.submap);
        }

        public final Comparator<? super K> comparator() {
            return ((SortedMap) this.submap).comparator();
        }

        public final K firstKey() {
            return ((SortedMap) this.submap).firstKey();
        }

        public final SortedMap<K, Collection<V>> headMap(K k) {
            return new SortedAsMap(((SortedMap) this.submap).headMap(k));
        }

        public final /* bridge */ /* synthetic */ Set keySet() {
            SortedSet<K> sortedSet = this.sortedKeySet;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> createKeySet = createKeySet();
            this.sortedKeySet = createKeySet;
            return createKeySet;
        }

        public final K lastKey() {
            return ((SortedMap) this.submap).lastKey();
        }

        public final SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new SortedAsMap(((SortedMap) this.submap).subMap(k, k2));
        }

        public final SortedMap<K, Collection<V>> tailMap(K k) {
            return new SortedAsMap(((SortedMap) this.submap).tailMap(k));
        }
    }

    class SortedKeySet extends KeySet implements SortedSet {
        SortedKeySet(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public final Comparator<? super K> comparator() {
            return ((SortedMap) super.map()).comparator();
        }

        public final K first() {
            return ((SortedMap) super.map()).firstKey();
        }

        public final SortedSet<K> headSet(K k) {
            return new SortedKeySet(((SortedMap) super.map()).headMap(k));
        }

        public final K last() {
            return ((SortedMap) super.map()).lastKey();
        }

        public final SortedSet<K> subSet(K k, K k2) {
            return new SortedKeySet(((SortedMap) super.map()).subMap(k, k2));
        }

        public final SortedSet<K> tailSet(K k) {
            return new SortedKeySet(((SortedMap) super.map()).tailMap(k));
        }
    }

    class WrappedCollection extends AbstractCollection<V> {
        final WrappedCollection ancestor;
        private Collection<V> ancestorDelegate;
        Collection<V> delegate;
        final K key;

        class WrappedIterator implements Iterator<V> {
            final Iterator<V> delegateIterator;
            private Collection<V> originalDelegate = WrappedCollection.this.delegate;

            WrappedIterator() {
                this.delegateIterator = AbstractMapBasedMultimap.access$100(AbstractMapBasedMultimap.this, WrappedCollection.this.delegate);
            }

            WrappedIterator(Iterator<V> it) {
                this.delegateIterator = it;
            }

            public boolean hasNext() {
                validateIterator();
                return this.delegateIterator.hasNext();
            }

            public V next() {
                validateIterator();
                return this.delegateIterator.next();
            }

            public void remove() {
                this.delegateIterator.remove();
                AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
                WrappedCollection.this.removeIfEmpty();
            }

            /* access modifiers changed from: package-private */
            public final void validateIterator() {
                WrappedCollection.this.refreshIfEmpty();
                if (WrappedCollection.this.delegate != this.originalDelegate) {
                    throw new ConcurrentModificationException();
                }
            }
        }

        WrappedCollection(Object obj, @Nullable Collection collection, WrappedCollection wrappedCollection) {
            this.key = obj;
            this.delegate = collection;
            this.ancestor = wrappedCollection;
            this.ancestorDelegate = wrappedCollection == null ? null : wrappedCollection.delegate;
        }

        public boolean add(V v) {
            refreshIfEmpty();
            boolean isEmpty = this.delegate.isEmpty();
            boolean add = this.delegate.add(v);
            if (add) {
                AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap.this);
                if (isEmpty) {
                    addToMap();
                }
            }
            return add;
        }

        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.delegate.addAll(collection);
            if (addAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.delegate.size() - size);
                if (size == 0) {
                    addToMap();
                }
            }
            return addAll;
        }

        /* access modifiers changed from: package-private */
        public final void addToMap() {
            WrappedCollection wrappedCollection = this.ancestor;
            if (wrappedCollection != null) {
                wrappedCollection.addToMap();
            } else {
                AbstractMapBasedMultimap.this.map.put(this.key, this.delegate);
            }
        }

        public void clear() {
            int size = size();
            if (size != 0) {
                this.delegate.clear();
                AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, size);
                removeIfEmpty();
            }
        }

        public boolean contains(Object obj) {
            refreshIfEmpty();
            return this.delegate.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            refreshIfEmpty();
            return this.delegate.containsAll(collection);
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            refreshIfEmpty();
            return this.delegate.equals(obj);
        }

        public int hashCode() {
            refreshIfEmpty();
            return this.delegate.hashCode();
        }

        public Iterator<V> iterator() {
            refreshIfEmpty();
            return new WrappedIterator();
        }

        /* access modifiers changed from: package-private */
        public final void refreshIfEmpty() {
            Collection<V> collection;
            WrappedCollection wrappedCollection = this.ancestor;
            if (wrappedCollection != null) {
                wrappedCollection.refreshIfEmpty();
                if (this.ancestor.delegate != this.ancestorDelegate) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.delegate.isEmpty() && (collection = (Collection) AbstractMapBasedMultimap.this.map.get(this.key)) != null) {
                this.delegate = collection;
            }
        }

        public boolean remove(Object obj) {
            refreshIfEmpty();
            boolean remove = this.delegate.remove(obj);
            if (remove) {
                AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
                removeIfEmpty();
            }
            return remove;
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.delegate.removeAll(collection);
            if (removeAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.delegate.size() - size);
                removeIfEmpty();
            }
            return removeAll;
        }

        /* access modifiers changed from: package-private */
        public final void removeIfEmpty() {
            WrappedCollection wrappedCollection = this.ancestor;
            if (wrappedCollection != null) {
                wrappedCollection.removeIfEmpty();
            } else if (this.delegate.isEmpty()) {
                AbstractMapBasedMultimap.this.map.remove(this.key);
            }
        }

        public boolean retainAll(Collection<?> collection) {
            Ascii.checkNotNull(collection);
            int size = size();
            boolean retainAll = this.delegate.retainAll(collection);
            if (retainAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.delegate.size() - size);
                removeIfEmpty();
            }
            return retainAll;
        }

        public int size() {
            refreshIfEmpty();
            return this.delegate.size();
        }

        public String toString() {
            refreshIfEmpty();
            return this.delegate.toString();
        }
    }

    class WrappedList extends WrappedCollection implements List {

        class WrappedListIterator extends WrappedCollection.WrappedIterator implements ListIterator {
            WrappedListIterator() {
                super();
            }

            public WrappedListIterator(int i) {
                super(WrappedList.this.getListDelegate().listIterator(i));
            }

            private ListIterator<V> getDelegateListIterator() {
                validateIterator();
                return (ListIterator) this.delegateIterator;
            }

            public final void add(V v) {
                boolean isEmpty = WrappedList.this.isEmpty();
                getDelegateListIterator().add(v);
                AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap.this);
                if (isEmpty) {
                    WrappedList.this.addToMap();
                }
            }

            public final boolean hasPrevious() {
                return getDelegateListIterator().hasPrevious();
            }

            public final int nextIndex() {
                return getDelegateListIterator().nextIndex();
            }

            public final V previous() {
                return getDelegateListIterator().previous();
            }

            public final int previousIndex() {
                return getDelegateListIterator().previousIndex();
            }

            public final void set(V v) {
                getDelegateListIterator().set(v);
            }
        }

        WrappedList(Object obj, @Nullable List list, WrappedCollection wrappedCollection) {
            super(obj, list, wrappedCollection);
        }

        public void add(int i, V v) {
            refreshIfEmpty();
            boolean isEmpty = this.delegate.isEmpty();
            getListDelegate().add(i, v);
            AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap.this);
            if (isEmpty) {
                addToMap();
            }
        }

        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = getListDelegate().addAll(i, collection);
            if (addAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.delegate.size() - size);
                if (size == 0) {
                    addToMap();
                }
            }
            return addAll;
        }

        public V get(int i) {
            refreshIfEmpty();
            return getListDelegate().get(i);
        }

        /* access modifiers changed from: package-private */
        public final List<V> getListDelegate() {
            return (List) this.delegate;
        }

        public int indexOf(Object obj) {
            refreshIfEmpty();
            return getListDelegate().indexOf(obj);
        }

        public int lastIndexOf(Object obj) {
            refreshIfEmpty();
            return getListDelegate().lastIndexOf(obj);
        }

        public ListIterator<V> listIterator() {
            refreshIfEmpty();
            return new WrappedListIterator();
        }

        public ListIterator<V> listIterator(int i) {
            refreshIfEmpty();
            return new WrappedListIterator(i);
        }

        public V remove(int i) {
            refreshIfEmpty();
            V remove = getListDelegate().remove(i);
            AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
            removeIfEmpty();
            return remove;
        }

        public V set(int i, V v) {
            refreshIfEmpty();
            return getListDelegate().set(i, v);
        }

        public List<V> subList(int i, int i2) {
            refreshIfEmpty();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            K k = this.key;
            List subList = getListDelegate().subList(i, i2);
            WrappedCollection wrappedCollection = this.ancestor;
            if (wrappedCollection == null) {
                wrappedCollection = this;
            }
            return abstractMapBasedMultimap.wrapList(k, subList, wrappedCollection);
        }
    }

    class WrappedSet extends WrappedCollection implements Set {
        WrappedSet(K k, @Nullable Set<V> set) {
            super(k, set, (WrappedCollection) null);
        }

        public final boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAllImpl = Ascii.removeAllImpl((Set<?>) (Set) this.delegate, collection);
            if (removeAllImpl) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.delegate.size() - size);
                removeIfEmpty();
            }
            return removeAllImpl;
        }
    }

    class WrappedSortedSet extends WrappedCollection implements SortedSet {
        WrappedSortedSet(Object obj, @Nullable SortedSet sortedSet, WrappedCollection wrappedCollection) {
            super(obj, sortedSet, wrappedCollection);
        }

        private SortedSet<V> getSortedSetDelegate() {
            return (SortedSet) this.delegate;
        }

        public final Comparator<? super V> comparator() {
            return getSortedSetDelegate().comparator();
        }

        public final V first() {
            refreshIfEmpty();
            return getSortedSetDelegate().first();
        }

        public final SortedSet<V> headSet(V v) {
            refreshIfEmpty();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            K k = this.key;
            SortedSet headSet = getSortedSetDelegate().headSet(v);
            WrappedCollection wrappedCollection = this.ancestor;
            if (wrappedCollection == null) {
                wrappedCollection = this;
            }
            return new WrappedSortedSet(k, headSet, wrappedCollection);
        }

        public final V last() {
            refreshIfEmpty();
            return getSortedSetDelegate().last();
        }

        public final SortedSet<V> subSet(V v, V v2) {
            refreshIfEmpty();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            K k = this.key;
            SortedSet subSet = getSortedSetDelegate().subSet(v, v2);
            WrappedCollection wrappedCollection = this.ancestor;
            if (wrappedCollection == null) {
                wrappedCollection = this;
            }
            return new WrappedSortedSet(k, subSet, wrappedCollection);
        }

        public final SortedSet<V> tailSet(V v) {
            refreshIfEmpty();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            K k = this.key;
            SortedSet tailSet = getSortedSetDelegate().tailSet(v);
            WrappedCollection wrappedCollection = this.ancestor;
            if (wrappedCollection == null) {
                wrappedCollection = this;
            }
            return new WrappedSortedSet(k, tailSet, wrappedCollection);
        }
    }

    protected AbstractMapBasedMultimap(Map<K, Collection<V>> map2) {
        Ascii.checkArgument(map2.isEmpty());
        this.map = map2;
    }

    static /* synthetic */ Iterator access$100(AbstractMapBasedMultimap abstractMapBasedMultimap, Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    static /* synthetic */ int access$208(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i = abstractMapBasedMultimap.totalSize;
        abstractMapBasedMultimap.totalSize = i + 1;
        return i;
    }

    static /* synthetic */ int access$210(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i = abstractMapBasedMultimap.totalSize;
        abstractMapBasedMultimap.totalSize = i - 1;
        return i;
    }

    static /* synthetic */ int access$212(AbstractMapBasedMultimap abstractMapBasedMultimap, int i) {
        int i2 = abstractMapBasedMultimap.totalSize + i;
        abstractMapBasedMultimap.totalSize = i2;
        return i2;
    }

    static /* synthetic */ int access$220(AbstractMapBasedMultimap abstractMapBasedMultimap, int i) {
        int i2 = abstractMapBasedMultimap.totalSize - i;
        abstractMapBasedMultimap.totalSize = i2;
        return i2;
    }

    static /* synthetic */ int access$400(AbstractMapBasedMultimap abstractMapBasedMultimap, Object obj) {
        Collection collection = (Collection) Maps.safeRemove(abstractMapBasedMultimap.map, obj);
        if (collection == null) {
            return 0;
        }
        int size = collection.size();
        collection.clear();
        abstractMapBasedMultimap.totalSize -= size;
        return size;
    }

    /* access modifiers changed from: private */
    public List wrapList(@Nullable Object obj, List list, @Nullable WrappedCollection wrappedCollection) {
        return list instanceof RandomAccess ? new RandomAccessWrappedList(this, obj, list, wrappedCollection) : new WrappedList(obj, list, wrappedCollection);
    }

    public void clear() {
        for (Collection<V> clear : this.map.values()) {
            clear.clear();
        }
        this.map.clear();
        this.totalSize = 0;
    }

    /* access modifiers changed from: package-private */
    public final Map<K, Collection<V>> createAsMap() {
        return this.map instanceof SortedMap ? new SortedAsMap((SortedMap) this.map) : new AsMap(this.map);
    }

    /* access modifiers changed from: package-private */
    public abstract Collection<V> createCollection();

    /* access modifiers changed from: package-private */
    public final Set<K> createKeySet() {
        return this.map instanceof SortedMap ? new SortedKeySet((SortedMap) this.map) : new KeySet(this.map);
    }

    public Collection<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<K, V>> entryIterator() {
        return new Itr(this) {
            /* access modifiers changed from: package-private */
            public final /* bridge */ /* synthetic */ Object output(Object obj, Object obj2) {
                return Maps.immutableEntry(obj, obj2);
            }
        };
    }

    public Collection<V> get(@Nullable K k) {
        Collection collection = this.map.get(k);
        if (collection == null) {
            collection = createCollection();
        }
        return wrapCollection(k, collection);
    }

    public boolean put(@Nullable K k, @Nullable V v) {
        Collection collection = this.map.get(k);
        if (collection == null) {
            Collection createCollection = createCollection();
            if (createCollection.add(v)) {
                this.totalSize++;
                this.map.put(k, createCollection);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.totalSize++;
            return true;
        }
    }

    public int size() {
        return this.totalSize;
    }

    /* access modifiers changed from: package-private */
    public final Iterator<V> valueIterator() {
        return new Itr(this) {
            /* access modifiers changed from: package-private */
            public final V output(K k, V v) {
                return v;
            }
        };
    }

    public Collection<V> values() {
        return super.values();
    }

    /* access modifiers changed from: package-private */
    public final Collection<V> wrapCollection(@Nullable K k, Collection<V> collection) {
        return collection instanceof SortedSet ? new WrappedSortedSet(k, (SortedSet) collection, (WrappedCollection) null) : collection instanceof Set ? new WrappedSet(k, (Set) collection) : collection instanceof List ? wrapList(k, (List) collection, (WrappedCollection) null) : new WrappedCollection(k, collection, (WrappedCollection) null);
    }
}
