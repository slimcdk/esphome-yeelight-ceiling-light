package com.squareup.haha.guava.collect;

import com.squareup.haha.guava.base.Ascii;
import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.Nullable;

final class ComparatorOrdering<T> extends Ordering<T> implements Serializable {
    private Comparator<T> comparator;

    ComparatorOrdering(Comparator<T> comparator2) {
        this.comparator = (Comparator) Ascii.checkNotNull(comparator2);
    }

    public final int compare(T t, T t2) {
        return this.comparator.compare(t, t2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ComparatorOrdering) {
            return this.comparator.equals(((ComparatorOrdering) obj).comparator);
        }
        return false;
    }

    public final int hashCode() {
        return this.comparator.hashCode();
    }

    public final String toString() {
        return this.comparator.toString();
    }
}
