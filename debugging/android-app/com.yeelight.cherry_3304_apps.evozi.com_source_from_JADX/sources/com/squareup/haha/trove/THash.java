package com.squareup.haha.trove;

public abstract class THash implements Cloneable {
    private transient int _deadkeys;
    private transient int _free;
    private float _loadFactor;
    private int _maxSize;
    private transient int _size;

    public THash() {
        this(4, 0.8f);
    }

    private THash(int i, float f) {
        this._loadFactor = 0.8f;
        setUp(6);
    }

    private void computeMaxSize(int i) {
        this._maxSize = Math.min(i - 1, (int) (((float) i) * this._loadFactor));
        this._free = i - this._size;
        this._deadkeys = 0;
    }

    /* access modifiers changed from: protected */
    public abstract int capacity();

    public void clear() {
        this._size = 0;
        this._free = capacity();
        this._deadkeys = 0;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public final void ensureCapacity(int i) {
        if (i > this._maxSize - size()) {
            rehash(PrimeFinder.nextPrime(((int) (((float) i) + (((float) size()) / this._loadFactor))) + 2));
            computeMaxSize(capacity());
        }
    }

    public boolean isEmpty() {
        return this._size == 0;
    }

    /* access modifiers changed from: protected */
    public final void postInsertHook(boolean z) {
        if (z) {
            this._free--;
        } else {
            this._deadkeys--;
        }
        int i = this._size + 1;
        this._size = i;
        if (i > this._maxSize || this._free == 0) {
            rehash(PrimeFinder.nextPrime(capacity() << 1));
            computeMaxSize(capacity());
        }
    }

    /* access modifiers changed from: protected */
    public abstract void rehash(int i);

    /* access modifiers changed from: protected */
    public void removeAt(int i) {
        int i2 = this._size - 1;
        this._size = i2;
        int i3 = this._deadkeys + 1;
        this._deadkeys = i3;
        if (i3 > i2 && capacity() > 42) {
            rehash(PrimeFinder.nextPrime(((int) (((float) size()) / this._loadFactor)) + 2));
            computeMaxSize(capacity());
        }
    }

    /* access modifiers changed from: protected */
    public int setUp(int i) {
        int nextPrime = PrimeFinder.nextPrime(i);
        computeMaxSize(nextPrime);
        return nextPrime;
    }

    public int size() {
        return this._size;
    }

    public final void startCompactingOnRemove(boolean z) {
        int i = this._deadkeys;
        if (i < 0) {
            this._deadkeys = i + capacity();
            return;
        }
        throw new IllegalStateException("Unpaired stop/startCompactingOnRemove");
    }

    public final void stopCompactingOnRemove() {
        int i = this._deadkeys;
        if (i >= 0) {
            this._deadkeys = i - capacity();
            return;
        }
        throw new IllegalStateException("Unpaired stop/startCompactingOnRemove");
    }
}
