package com.squareup.haha.guava.collect;

import java.util.Iterator;

public abstract class ForwardingIterator<T> extends ForwardingObject implements Iterator<T> {
    /* access modifiers changed from: protected */
    public abstract Iterator<T> delegate();

    public boolean hasNext() {
        return delegate().hasNext();
    }

    public T next() {
        return delegate().next();
    }

    public void remove() {
        delegate().remove();
    }
}
