package com.squareup.haha.guava.collect;

import com.squareup.haha.guava.base.Ascii;
import com.squareup.haha.guava.base.Function;
import com.squareup.haha.guava.base.Predicate;
import com.squareup.haha.guava.base.Predicates;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import javax.annotation.Nullable;

public final class Iterators {
    private static UnmodifiableListIterator<Object> EMPTY_LIST_ITERATOR = new UnmodifiableListIterator<Object>() {
        public final boolean hasNext() {
            return false;
        }

        public final boolean hasPrevious() {
            return false;
        }

        public final Object next() {
            throw new NoSuchElementException();
        }

        public final int nextIndex() {
            return 0;
        }

        public final Object previous() {
            throw new NoSuchElementException();
        }

        public final int previousIndex() {
            return -1;
        }
    };
    private static final Iterator<Object> EMPTY_MODIFIABLE_ITERATOR = new Iterator<Object>() {
        public final boolean hasNext() {
            return false;
        }

        public final Object next() {
            throw new NoSuchElementException();
        }

        public final void remove() {
            Ascii.checkRemove(false);
        }
    };

    public static <T> boolean addAll(Collection<T> collection, Iterator<? extends T> it) {
        Ascii.checkNotNull(collection);
        Ascii.checkNotNull(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    static <T> ListIterator<T> cast(Iterator<T> it) {
        return (ListIterator) it;
    }

    static void clear(Iterator<?> it) {
        Ascii.checkNotNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static <T> Iterator<T> concat(final Iterator<? extends Iterator<? extends T>> it) {
        Ascii.checkNotNull(it);
        return new Iterator<T>() {
            private Iterator<? extends T> current = Iterators.emptyIterator();
            private Iterator<? extends T> removeFrom;

            public final boolean hasNext() {
                boolean hasNext;
                while (true) {
                    hasNext = ((Iterator) Ascii.checkNotNull(this.current)).hasNext();
                    if (hasNext || !it.hasNext()) {
                        return hasNext;
                    }
                    this.current = (Iterator) it.next();
                }
                return hasNext;
            }

            public final T next() {
                if (hasNext()) {
                    Iterator<? extends T> it = this.current;
                    this.removeFrom = it;
                    return it.next();
                }
                throw new NoSuchElementException();
            }

            public final void remove() {
                Ascii.checkRemove(this.removeFrom != null);
                this.removeFrom.remove();
                this.removeFrom = null;
            }
        };
    }

    public static boolean contains(Iterator<?> it, @Nullable Object obj) {
        Predicate equalTo = Predicates.equalTo(obj);
        if (equalTo != null) {
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (equalTo.apply(it.next())) {
                    break;
                } else {
                    i++;
                }
            }
            return i != -1;
        }
        throw new NullPointerException("predicate");
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0007  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean elementsEqual(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        /*
        L_0x0000:
            boolean r0 = r3.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x001d
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = com.squareup.haha.guava.base.Ascii.equal(r0, r2)
            if (r0 != 0) goto L_0x0000
            return r1
        L_0x001d:
            boolean r3 = r4.hasNext()
            if (r3 != 0) goto L_0x0025
            r3 = 1
            return r3
        L_0x0025:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.haha.guava.collect.Iterators.elementsEqual(java.util.Iterator, java.util.Iterator):boolean");
    }

    public static <T> UnmodifiableIterator<T> emptyIterator() {
        return EMPTY_LIST_ITERATOR;
    }

    static <T> Iterator<T> emptyModifiableIterator() {
        return EMPTY_MODIFIABLE_ITERATOR;
    }

    static <T> UnmodifiableListIterator<T> forArray(final T[] tArr, final int i, int i2, int i3) {
        Ascii.checkArgument(i2 >= 0);
        Ascii.checkPositionIndexes(i, i + i2, tArr.length);
        Ascii.checkPositionIndex(i3, i2);
        return i2 == 0 ? EMPTY_LIST_ITERATOR : new AbstractIndexedListIterator<T>(i2, i3) {
            /* access modifiers changed from: protected */
            public final T get(int i) {
                return tArr[i + i];
            }
        };
    }

    @Nullable
    public static <T> T getNext(Iterator<? extends T> it, @Nullable T t) {
        return it.hasNext() ? it.next() : t;
    }

    @Nullable
    static <T> T pollNext(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    public static boolean removeAll(Iterator<?> it, Collection<?> collection) {
        return removeIf(it, Predicates.m10634in(collection));
    }

    public static <T> boolean removeIf(Iterator<T> it, Predicate<? super T> predicate) {
        Ascii.checkNotNull(predicate);
        boolean z = false;
        while (it.hasNext()) {
            if (predicate.apply(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static <T> UnmodifiableIterator<T> singletonIterator(@Nullable final T t) {
        return new UnmodifiableIterator<T>() {
            private boolean done;

            public final boolean hasNext() {
                return !this.done;
            }

            public final T next() {
                if (!this.done) {
                    this.done = true;
                    return t;
                }
                throw new NoSuchElementException();
            }
        };
    }

    public static String toString(Iterator<?> it) {
        StringBuilder appendTo = Collections2.STANDARD_JOINER$5f22bbb7.appendTo(new StringBuilder("["), it);
        appendTo.append(']');
        return appendTo.toString();
    }

    public static <F, T> Iterator<T> transform(Iterator<F> it, final Function<? super F, ? extends T> function) {
        Ascii.checkNotNull(function);
        return new TransformedIterator<F, T>(it) {
            /* access modifiers changed from: package-private */
            public final T transform(F f) {
                return function.apply(f);
            }
        };
    }
}
