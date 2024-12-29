package com.squareup.haha.guava.collect;

import com.squareup.haha.guava.base.Ascii;
import com.squareup.haha.guava.collect.Multiset;
import com.squareup.haha.guava.collect.Multisets;
import com.squareup.haha.guava.primitives.Ints;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

abstract class AbstractMapBasedMultiset<E> extends AbstractMultiset<E> implements Serializable {
    private transient long size;

    class MapBasedMultisetIterator implements Iterator<E> {
        private boolean canRemove;
        private Map.Entry<E, Count> currentEntry;
        private Iterator<Map.Entry<E, Count>> entryIterator;
        private int occurrencesLeft;

        MapBasedMultisetIterator() {
            this.entryIterator = AbstractMapBasedMultiset.access$000(AbstractMapBasedMultiset.this).entrySet().iterator();
        }

        public final boolean hasNext() {
            return this.occurrencesLeft > 0 || this.entryIterator.hasNext();
        }

        public final E next() {
            if (this.occurrencesLeft == 0) {
                Map.Entry<E, Count> next = this.entryIterator.next();
                this.currentEntry = next;
                this.occurrencesLeft = next.getValue().value;
            }
            this.occurrencesLeft--;
            this.canRemove = true;
            return this.currentEntry.getKey();
        }

        public final void remove() {
            Ascii.checkRemove(this.canRemove);
            if (this.currentEntry.getValue().value > 0) {
                if (this.currentEntry.getValue().addAndGet(-1) == 0) {
                    this.entryIterator.remove();
                }
                AbstractMapBasedMultiset.access$110(AbstractMapBasedMultiset.this);
                this.canRemove = false;
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    static /* synthetic */ Map access$000(AbstractMapBasedMultiset abstractMapBasedMultiset) {
        return null;
    }

    static /* synthetic */ long access$110(AbstractMapBasedMultiset abstractMapBasedMultiset) {
        long j = abstractMapBasedMultiset.size;
        abstractMapBasedMultiset.size = j - 1;
        return j;
    }

    static /* synthetic */ long access$122(AbstractMapBasedMultiset abstractMapBasedMultiset, long j) {
        long j2 = abstractMapBasedMultiset.size - j;
        abstractMapBasedMultiset.size = j2;
        return j2;
    }

    private static int getAndSet(Count count, int i) {
        if (count == null) {
            return 0;
        }
        return count.getAndSet(i);
    }

    public final int add(@Nullable E e, int i) {
        if (i == 0) {
            return count(e);
        }
        int i2 = 0;
        Ascii.checkArgument(i > 0, "occurrences cannot be negative: %s", Integer.valueOf(i));
        Map map = null;
        Count count = (Count) map.get(e);
        if (count == null) {
            map.put(e, new Count(i));
        } else {
            int i3 = count.value;
            long j = ((long) i3) + ((long) i);
            Ascii.checkArgument(j <= 2147483647L, "too many occurrences: %s", Long.valueOf(j));
            count.value += i;
            i2 = i3;
        }
        this.size += (long) i;
        return i2;
    }

    public void clear() {
        Map map = null;
        for (Count count : map.values()) {
            count.value = 0;
        }
        map.clear();
        this.size = 0;
    }

    public final int count(@Nullable Object obj) {
        Count count = (Count) Maps.safeGet((Map) null, obj);
        if (count == null) {
            return 0;
        }
        return count.value;
    }

    /* access modifiers changed from: package-private */
    public final int distinctElements() {
        Map map = null;
        return map.size();
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Multiset.Entry<E>> entryIterator() {
        Map map = null;
        final Iterator it = map.entrySet().iterator();
        return new Iterator<Multiset.Entry<E>>() {
            private Map.Entry<E, Count> toRemove;

            public final boolean hasNext() {
                return it.hasNext();
            }

            public final /* bridge */ /* synthetic */ Object next() {
                final Map.Entry<E, Count> entry = (Map.Entry) it.next();
                this.toRemove = entry;
                return new Multisets.AbstractEntry<E>() {
                    public final int getCount() {
                        Count count;
                        Count count2 = (Count) entry.getValue();
                        if ((count2 == null || count2.value == 0) && (count = (Count) AbstractMapBasedMultiset.access$000(AbstractMapBasedMultiset.this).get(getElement())) != null) {
                            return count.value;
                        }
                        if (count2 == null) {
                            return 0;
                        }
                        return count2.value;
                    }

                    public final E getElement() {
                        return entry.getKey();
                    }
                };
            }

            public final void remove() {
                Ascii.checkRemove(this.toRemove != null);
                AbstractMapBasedMultiset.access$122(AbstractMapBasedMultiset.this, (long) this.toRemove.getValue().getAndSet(0));
                it.remove();
                this.toRemove = null;
            }
        };
    }

    public final Set<Multiset.Entry<E>> entrySet() {
        return super.entrySet();
    }

    public Iterator<E> iterator() {
        return new MapBasedMultisetIterator();
    }

    public final int remove(@Nullable Object obj, int i) {
        if (i == 0) {
            return count(obj);
        }
        Ascii.checkArgument(i > 0, "occurrences cannot be negative: %s", Integer.valueOf(i));
        Map map = null;
        Count count = (Count) map.get(obj);
        if (count == null) {
            return 0;
        }
        int i2 = count.value;
        if (i2 <= i) {
            map.remove(obj);
            i = i2;
        }
        count.addAndGet(-i);
        this.size -= (long) i;
        return i2;
    }

    public final int setCount(@Nullable E e, int i) {
        int i2;
        Ascii.checkNonnegative(i, "count");
        Map map = null;
        if (i == 0) {
            i2 = getAndSet((Count) map.remove(e), i);
        } else {
            Count count = (Count) map.get(e);
            int andSet = getAndSet(count, i);
            if (count == null) {
                map.put(e, new Count(i));
            }
            i2 = andSet;
        }
        this.size += (long) (i - i2);
        return i2;
    }

    public int size() {
        return Ints.saturatedCast(this.size);
    }
}
