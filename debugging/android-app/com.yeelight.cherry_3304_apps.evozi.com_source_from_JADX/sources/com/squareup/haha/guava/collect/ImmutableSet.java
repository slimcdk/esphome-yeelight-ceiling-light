package com.squareup.haha.guava.collect;

import com.squareup.haha.guava.base.Ascii;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    ImmutableSet() {
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m10640of() {
        return EmptyImmutableSet.INSTANCE;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableSet) || !isHashCodeFast() || !((ImmutableSet) obj).isHashCodeFast() || hashCode() == obj.hashCode()) {
            return Ascii.equalsImpl(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return Ascii.hashCodeImpl(this);
    }

    /* access modifiers changed from: package-private */
    public boolean isHashCodeFast() {
        return false;
    }

    public abstract UnmodifiableIterator<E> iterator();
}
