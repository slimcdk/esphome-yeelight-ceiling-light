package com.squareup.haha.trove;

public final class TLongHashSet extends TLongHash {

    final class HashProcedure implements TLongProcedure {

        /* renamed from: h */
        int f6875h;

        HashProcedure() {
        }

        public final boolean execute(long j) {
            this.f6875h += TLongHashSet.this._hashingStrategy.computeHashCode(j);
            return true;
        }
    }

    public final boolean add(long j) {
        int insertionIndex = insertionIndex(j);
        boolean z = false;
        if (insertionIndex < 0) {
            return false;
        }
        byte[] bArr = this._states;
        byte b = bArr[insertionIndex];
        this._set[insertionIndex] = j;
        bArr[insertionIndex] = 1;
        if (b == 0) {
            z = true;
        }
        postInsertHook(z);
        return true;
    }

    public final void clear() {
        super.clear();
        long[] jArr = this._set;
        byte[] bArr = this._states;
        int length = jArr.length;
        while (true) {
            int i = length - 1;
            if (length > 0) {
                jArr[i] = 0;
                bArr[i] = 0;
                length = i;
            } else {
                return;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TLongHashSet)) {
            return false;
        }
        final TLongHashSet tLongHashSet = (TLongHashSet) obj;
        if (tLongHashSet.size() != size()) {
            return false;
        }
        return forEach(new TLongProcedure(this) {
            public final boolean execute(long j) {
                return tLongHashSet.contains(j);
            }
        });
    }

    public final int hashCode() {
        HashProcedure hashProcedure = new HashProcedure();
        forEach(hashProcedure);
        return hashProcedure.f6875h;
    }

    /* access modifiers changed from: protected */
    public final void rehash(int i) {
        long[] jArr = this._set;
        int length = jArr.length;
        byte[] bArr = this._states;
        this._set = new long[i];
        this._states = new byte[i];
        while (true) {
            int i2 = length - 1;
            if (length > 0) {
                if (bArr[i2] == 1) {
                    long j = jArr[i2];
                    int insertionIndex = insertionIndex(j);
                    this._set[insertionIndex] = j;
                    this._states[insertionIndex] = 1;
                }
                length = i2;
            } else {
                return;
            }
        }
    }
}
