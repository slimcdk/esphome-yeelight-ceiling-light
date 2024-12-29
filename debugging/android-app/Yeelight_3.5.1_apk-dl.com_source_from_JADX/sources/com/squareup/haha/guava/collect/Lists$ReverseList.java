package com.squareup.haha.guava.collect;

import com.squareup.haha.guava.base.Ascii;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import javax.annotation.Nullable;

public class Lists$ReverseList<T> extends AbstractList<T> {
    public final List<T> forwardList;

    public Lists$ReverseList(List<T> list) {
        this.forwardList = (List) Ascii.checkNotNull(list);
    }

    private int reverseIndex(int i) {
        int size = size();
        Ascii.checkElementIndex(i, size);
        return (size - 1) - i;
    }

    /* access modifiers changed from: private */
    public int reversePosition(int i) {
        int size = size();
        Ascii.checkPositionIndex(i, size);
        return size - i;
    }

    public void add(int i, @Nullable T t) {
        this.forwardList.add(reversePosition(i), t);
    }

    public void clear() {
        this.forwardList.clear();
    }

    public T get(int i) {
        return this.forwardList.get(reverseIndex(i));
    }

    public Iterator<T> iterator() {
        return listIterator();
    }

    public ListIterator<T> listIterator(int i) {
        final ListIterator<T> listIterator = this.forwardList.listIterator(reversePosition(i));
        return new ListIterator<T>() {
            private boolean canRemoveOrSet;

            public final void add(T t) {
                listIterator.add(t);
                listIterator.previous();
                this.canRemoveOrSet = false;
            }

            public final boolean hasNext() {
                return listIterator.hasPrevious();
            }

            public final boolean hasPrevious() {
                return listIterator.hasNext();
            }

            public final T next() {
                if (hasNext()) {
                    this.canRemoveOrSet = true;
                    return listIterator.previous();
                }
                throw new NoSuchElementException();
            }

            public final int nextIndex() {
                return Lists$ReverseList.this.reversePosition(listIterator.nextIndex());
            }

            public final T previous() {
                if (hasPrevious()) {
                    this.canRemoveOrSet = true;
                    return listIterator.next();
                }
                throw new NoSuchElementException();
            }

            public final int previousIndex() {
                return nextIndex() - 1;
            }

            public final void remove() {
                Ascii.checkRemove(this.canRemoveOrSet);
                listIterator.remove();
                this.canRemoveOrSet = false;
            }

            public final void set(T t) {
                Ascii.checkState(this.canRemoveOrSet);
                listIterator.set(t);
            }
        };
    }

    public T remove(int i) {
        return this.forwardList.remove(reverseIndex(i));
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        subList(i, i2).clear();
    }

    public T set(int i, @Nullable T t) {
        return this.forwardList.set(reverseIndex(i), t);
    }

    public int size() {
        return this.forwardList.size();
    }

    public List<T> subList(int i, int i2) {
        Ascii.checkPositionIndexes(i, i2, size());
        return Ascii.reverse(this.forwardList.subList(reversePosition(i2), reversePosition(i)));
    }
}
