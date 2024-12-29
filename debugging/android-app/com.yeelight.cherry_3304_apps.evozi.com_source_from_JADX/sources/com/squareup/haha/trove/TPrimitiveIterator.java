package com.squareup.haha.trove;

import java.util.ConcurrentModificationException;

abstract class TPrimitiveIterator extends TIterator {
    private TPrimitiveHash _hash;

    /* access modifiers changed from: protected */
    public final int nextIndex() {
        int i;
        if (this._expectedSize == this._hash.size()) {
            byte[] bArr = this._hash._states;
            int i2 = this._index;
            while (true) {
                i = i2 - 1;
                if (i2 <= 0 || bArr[i] == 1) {
                    return i;
                }
                i2 = i;
            }
            return i;
        }
        throw new ConcurrentModificationException();
    }
}
