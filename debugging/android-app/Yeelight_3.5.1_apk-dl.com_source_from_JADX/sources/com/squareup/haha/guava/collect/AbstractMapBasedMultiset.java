package com.squareup.haha.guava.collect;

import com.squareup.haha.guava.base.Ascii;
import com.squareup.haha.guava.collect.Multiset;
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
        Ascii.checkArgument(i > 0, "occurrences cannot be negative: %s", Integer.valueOf(i));
        throw null;
    }

    public void clear() {
        throw null;
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
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Multiset.Entry<E>> entryIterator() {
        throw null;
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
        throw null;
    }

    public final int setCount(@Nullable E e, int i) {
        Ascii.checkNonnegative(i, "count");
        throw null;
    }

    public int size() {
        return Ints.saturatedCast(this.size);
    }
}
