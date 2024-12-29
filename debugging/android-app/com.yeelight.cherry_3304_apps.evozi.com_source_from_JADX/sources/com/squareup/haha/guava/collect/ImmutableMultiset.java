package com.squareup.haha.guava.collect;

import com.squareup.haha.guava.base.Ascii;
import com.squareup.haha.guava.collect.Multiset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.Nullable;

public abstract class ImmutableMultiset<E> extends ImmutableCollection<E> implements Multiset<E> {
    private transient ImmutableSet<Multiset.Entry<E>> entrySet;

    final class EntrySet extends ImmutableSet<Multiset.Entry<E>> {
        private EntrySet() {
        }

        /* synthetic */ EntrySet(ImmutableMultiset immutableMultiset, byte b) {
            this();
        }

        public final boolean contains(Object obj) {
            if (obj instanceof Multiset.Entry) {
                Multiset.Entry entry = (Multiset.Entry) obj;
                if (entry.getCount() > 0 && ImmutableMultiset.this.count(entry.getElement()) == entry.getCount()) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final ImmutableList<Multiset.Entry<E>> createAsList() {
            return new ImmutableAsList<Multiset.Entry<E>>() {
                /* access modifiers changed from: package-private */
                public final ImmutableCollection<Multiset.Entry<E>> delegateCollection() {
                    return EntrySet.this;
                }

                public final /* bridge */ /* synthetic */ Object get(int i) {
                    return ImmutableMultiset.this.getEntry(i);
                }
            };
        }

        public final int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        /* access modifiers changed from: package-private */
        public final boolean isPartialView() {
            return ImmutableMultiset.this.isPartialView();
        }

        public final UnmodifiableIterator<Multiset.Entry<E>> iterator() {
            return asList().iterator();
        }

        public final int size() {
            return ImmutableMultiset.this.elementSet().size();
        }
    }

    static {
        new RegularImmutableMultiset(ImmutableMap.m10639of(), 0);
    }

    ImmutableMultiset() {
    }

    /* access modifiers changed from: private */
    public ImmutableSet<Multiset.Entry<E>> entrySet() {
        ImmutableSet<Multiset.Entry<E>> immutableSet = this.entrySet;
        if (immutableSet == null) {
            immutableSet = isEmpty() ? ImmutableSet.m10640of() : new EntrySet(this, (byte) 0);
            this.entrySet = immutableSet;
        }
        return immutableSet;
    }

    @Deprecated
    public final int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    public boolean contains(@Nullable Object obj) {
        return count(obj) > 0;
    }

    public boolean containsAll(Collection<?> collection) {
        return elementSet().containsAll(collection);
    }

    /* access modifiers changed from: package-private */
    public final int copyIntoArray(Object[] objArr, int i) {
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Multiset.Entry entry = (Multiset.Entry) it.next();
            Arrays.fill(objArr, i, entry.getCount() + i, entry.getElement());
            i += entry.getCount();
        }
        return i;
    }

    public boolean equals(@Nullable Object obj) {
        return Multisets.equalsImpl(this, obj);
    }

    /* access modifiers changed from: package-private */
    public abstract Multiset.Entry<E> getEntry(int i);

    public int hashCode() {
        return Ascii.hashCodeImpl(entrySet());
    }

    public final UnmodifiableIterator<E> iterator() {
        final UnmodifiableIterator it = entrySet().iterator();
        return new UnmodifiableIterator<E>(this) {
            private E element;
            private int remaining;

            public final boolean hasNext() {
                return this.remaining > 0 || it.hasNext();
            }

            public final E next() {
                if (this.remaining <= 0) {
                    Multiset.Entry entry = (Multiset.Entry) it.next();
                    this.element = entry.getElement();
                    this.remaining = entry.getCount();
                }
                this.remaining--;
                return this.element;
            }
        };
    }

    @Deprecated
    public final int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final int setCount(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean setCount(E e, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return entrySet().toString();
    }
}
