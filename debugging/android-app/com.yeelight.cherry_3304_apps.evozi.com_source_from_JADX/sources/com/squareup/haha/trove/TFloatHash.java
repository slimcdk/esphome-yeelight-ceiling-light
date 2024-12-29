package com.squareup.haha.trove;

public abstract class TFloatHash extends TPrimitiveHash implements TDoubleHashingStrategy {
    private transient float[] _set;

    public Object clone() {
        TFloatHash tFloatHash = (TFloatHash) super.clone();
        tFloatHash._set = (float[]) this._set.clone();
        return tFloatHash;
    }

    /* access modifiers changed from: protected */
    public final void removeAt(int i) {
        this._set[i] = 0.0f;
        super.removeAt(i);
    }

    /* access modifiers changed from: protected */
    public final int setUp(int i) {
        int up = super.setUp(i);
        this._set = new float[up];
        return up;
    }
}
