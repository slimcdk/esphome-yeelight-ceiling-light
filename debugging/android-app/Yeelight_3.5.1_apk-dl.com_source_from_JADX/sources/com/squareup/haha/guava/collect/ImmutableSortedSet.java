package com.squareup.haha.guava.collect;

import com.squareup.haha.guava.base.Ascii;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

public abstract class ImmutableSortedSet<E> extends ImmutableSortedSetFauxverideShim<E> implements SortedIterable, NavigableSet<E> {
    private static final ImmutableSortedSet<Comparable> NATURAL_EMPTY_SET;
    private static final Comparator<Comparable> NATURAL_ORDER;
    final transient Comparator<? super E> comparator;
    private transient ImmutableSortedSet<E> descendingSet;

    static {
        Ordering natural = Ordering.natural();
        NATURAL_ORDER = natural;
        NATURAL_EMPTY_SET = new EmptyImmutableSortedSet(natural);
    }

    ImmutableSortedSet(Comparator<? super E> comparator2) {
        this.comparator = comparator2;
    }

    static <E> ImmutableSortedSet<E> emptySet(Comparator<? super E> comparator2) {
        return NATURAL_ORDER.equals(comparator2) ? NATURAL_EMPTY_SET : new EmptyImmutableSortedSet(comparator2);
    }

    public E ceiling(E e) {
        return Ascii.getFirst(tailSet(e, true), null);
    }

    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    /* access modifiers changed from: package-private */
    public ImmutableSortedSet<E> createDescendingSet() {
        return new DescendingImmutableSortedSet(this);
    }

    public abstract UnmodifiableIterator<E> descendingIterator();

    public ImmutableSortedSet<E> descendingSet() {
        ImmutableSortedSet<E> immutableSortedSet = this.descendingSet;
        if (immutableSortedSet != null) {
            return immutableSortedSet;
        }
        ImmutableSortedSet<E> createDescendingSet = createDescendingSet();
        this.descendingSet = createDescendingSet;
        createDescendingSet.descendingSet = this;
        return createDescendingSet;
    }

    public E first() {
        return iterator().next();
    }

    public E floor(E e) {
        return Iterators.getNext(headSet(e, true).descendingIterator(), null);
    }

    public final ImmutableSortedSet<E> headSet(E e, boolean z) {
        return headSetImpl(Ascii.checkNotNull(e), z);
    }

    public /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    /* access modifiers changed from: package-private */
    public abstract ImmutableSortedSet<E> headSetImpl(E e, boolean z);

    public E higher(E e) {
        return Ascii.getFirst(tailSet(e, false), null);
    }

    public abstract UnmodifiableIterator<E> iterator();

    public E last() {
        return descendingIterator().next();
    }

    public E lower(E e) {
        return Iterators.getNext(headSet(e, false).descendingIterator(), null);
    }

    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    public final ImmutableSortedSet<E> subSet(E e, boolean z, E e2, boolean z2) {
        Ascii.checkNotNull(e);
        Ascii.checkNotNull(e2);
        Ascii.checkArgument(this.comparator.compare(e, e2) <= 0);
        return subSetImpl(e, z, e2, z2);
    }

    public /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    /* access modifiers changed from: package-private */
    public abstract ImmutableSortedSet<E> subSetImpl(E e, boolean z, E e2, boolean z2);

    public final ImmutableSortedSet<E> tailSet(E e, boolean z) {
        return tailSetImpl(Ascii.checkNotNull(e), z);
    }

    public /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    /* access modifiers changed from: package-private */
    public abstract ImmutableSortedSet<E> tailSetImpl(E e, boolean z);
}
