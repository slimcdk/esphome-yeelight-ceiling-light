package com.squareup.haha.trove;

public abstract class TDoubleHash extends TPrimitiveHash implements TDoubleHashingStrategy {
    private transient double[] _set;

    public Object clone() {
        TDoubleHash tDoubleHash = (TDoubleHash) super.clone();
        tDoubleHash._set = (double[]) this._set.clone();
        return tDoubleHash;
    }

    /* access modifiers changed from: protected */
    public final void removeAt(int i) {
        this._set[i] = 0.0d;
        super.removeAt(i);
    }

    /* access modifiers changed from: protected */
    public final int setUp(int i) {
        int up = super.setUp(i);
        this._set = new double[up];
        return up;
    }
}
