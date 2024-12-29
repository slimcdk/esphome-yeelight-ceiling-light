package com.squareup.haha.guava.base;

import javax.annotation.Nullable;

public abstract class Converter<A, B> implements Function<A, B> {
    private final boolean handleNullAutomatically;

    @Deprecated
    @Nullable
    public final B apply(@Nullable A a) {
        if (!this.handleNullAutomatically) {
            return doForward$7713a341();
        }
        if (a == null) {
            return null;
        }
        return Ascii.checkNotNull(doForward$7713a341());
    }

    /* access modifiers changed from: protected */
    public abstract B doForward$7713a341();

    public boolean equals(@Nullable Object obj) {
        return super.equals(obj);
    }
}
