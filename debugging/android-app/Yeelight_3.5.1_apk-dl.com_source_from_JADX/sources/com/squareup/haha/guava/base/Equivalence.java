package com.squareup.haha.guava.base;

import javax.annotation.Nullable;

public abstract class Equivalence<T> {
    /* access modifiers changed from: protected */
    public abstract boolean doEquivalent$2838e5b1();

    /* access modifiers changed from: protected */
    public abstract int doHash$5d527804();

    public final boolean equivalent(@Nullable T t, @Nullable T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return doEquivalent$2838e5b1();
    }

    public final int hash(@Nullable T t) {
        if (t == null) {
            return 0;
        }
        return doHash$5d527804();
    }
}
