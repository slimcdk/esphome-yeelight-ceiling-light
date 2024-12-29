package com.squareup.haha.guava.collect;

import com.squareup.haha.guava.base.Ascii;
import java.io.Serializable;

final class ReverseNaturalOrdering extends Ordering<Comparable> implements Serializable {
    static final ReverseNaturalOrdering INSTANCE = new ReverseNaturalOrdering();

    private ReverseNaturalOrdering() {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Ascii.checkNotNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final <S extends Comparable> Ordering<S> reverse() {
        return NaturalOrdering.INSTANCE;
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
