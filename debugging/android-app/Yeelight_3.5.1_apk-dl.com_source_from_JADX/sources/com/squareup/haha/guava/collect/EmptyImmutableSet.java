package com.squareup.haha.guava.collect;

import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

final class EmptyImmutableSet extends ImmutableSet<Object> {
    static final EmptyImmutableSet INSTANCE = new EmptyImmutableSet();

    private EmptyImmutableSet() {
    }

    public final ImmutableList<Object> asList() {
        return ImmutableList.m7502of();
    }

    public final boolean contains(@Nullable Object obj) {
        return false;
    }

    public final boolean containsAll(Collection<?> collection) {
        return collection.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public final int copyIntoArray(Object[] objArr, int i) {
        return i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean isHashCodeFast() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean isPartialView() {
        return false;
    }

    public final UnmodifiableIterator<Object> iterator() {
        return Iterators.emptyIterator();
    }

    public final int size() {
        return 0;
    }

    public final String toString() {
        return "[]";
    }
}
