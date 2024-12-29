package com.squareup.haha.trove;

import androidx.appcompat.widget.ActivityChooserView;

public abstract class TObjectHash<T> extends THash implements TObjectHashingStrategy<T> {
    public static final NULL NULL = new NULL();
    public static final Object REMOVED = new Object();
    protected final TObjectHashingStrategy<T> _hashingStrategy = this;
    protected transient Object[] _set;

    static class NULL {
        NULL() {
        }
    }

    /* access modifiers changed from: protected */
    public final int capacity() {
        return this._set.length;
    }

    public TObjectHash<T> clone() {
        TObjectHash<T> tObjectHash = (TObjectHash) super.clone();
        tObjectHash._set = (Object[]) this._set.clone();
        return tObjectHash;
    }

    public final int computeHashCode(T t) {
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }

    public boolean contains(Object obj) {
        return index(obj) >= 0;
    }

    public final boolean equals(T t, T t2) {
        return t != null ? t.equals(t2) : t2 == null;
    }

    public final boolean forEach(TObjectProcedure<T> tObjectProcedure) {
        Object[] objArr = this._set;
        int length = objArr.length;
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                return true;
            }
            if (objArr[i] != null && objArr[i] != REMOVED && !tObjectProcedure.execute(objArr[i])) {
                return false;
            }
            length = i;
        }
    }

    /* access modifiers changed from: protected */
    public final int index(T t) {
        Object[] objArr = this._set;
        int length = objArr.length;
        int computeHashCode = this._hashingStrategy.computeHashCode(t) & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int i = computeHashCode % length;
        Object obj = objArr[i];
        if (obj != null && (obj == REMOVED || !this._hashingStrategy.equals(obj, t))) {
            int i2 = (computeHashCode % (length - 2)) + 1;
            while (true) {
                i -= i2;
                if (i < 0) {
                    i += length;
                }
                obj = objArr[i];
                if (obj == null || (obj != REMOVED && this._hashingStrategy.equals(obj, t))) {
                    break;
                }
            }
        }
        if (obj == null) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int insertionIndex(T r9) {
        /*
            r8 = this;
            java.lang.Object[] r0 = r8._set
            int r1 = r0.length
            com.squareup.haha.trove.TObjectHashingStrategy<T> r2 = r8._hashingStrategy
            int r2 = r2.computeHashCode(r9)
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2 & r3
            int r3 = r2 % r1
            r4 = r0[r3]
            if (r4 != 0) goto L_0x0014
            return r3
        L_0x0014:
            java.lang.Object r5 = REMOVED
            if (r4 == r5) goto L_0x0024
            com.squareup.haha.trove.TObjectHashingStrategy<T> r6 = r8._hashingStrategy
            boolean r6 = r6.equals(r4, r9)
            if (r6 == 0) goto L_0x0024
        L_0x0020:
            int r9 = -r3
            int r9 = r9 + -1
            return r9
        L_0x0024:
            int r6 = r1 + -2
            int r2 = r2 % r6
            int r2 = r2 + 1
            r6 = -1
            if (r4 != r5) goto L_0x002e
            r4 = r3
            goto L_0x002f
        L_0x002e:
            r4 = -1
        L_0x002f:
            int r3 = r3 - r2
            if (r3 >= 0) goto L_0x0033
            int r3 = r3 + r1
        L_0x0033:
            r5 = r0[r3]
            if (r4 != r6) goto L_0x003c
            java.lang.Object r7 = REMOVED
            if (r5 != r7) goto L_0x003c
            r4 = r3
        L_0x003c:
            if (r5 == 0) goto L_0x004a
            java.lang.Object r7 = REMOVED
            if (r5 == r7) goto L_0x004a
            com.squareup.haha.trove.TObjectHashingStrategy<T> r7 = r8._hashingStrategy
            boolean r7 = r7.equals(r5, r9)
            if (r7 == 0) goto L_0x002f
        L_0x004a:
            java.lang.Object r7 = REMOVED
            if (r5 != r7) goto L_0x0063
        L_0x004e:
            if (r5 == 0) goto L_0x0063
            java.lang.Object r7 = REMOVED
            if (r5 == r7) goto L_0x005c
            com.squareup.haha.trove.TObjectHashingStrategy<T> r7 = r8._hashingStrategy
            boolean r7 = r7.equals(r5, r9)
            if (r7 != 0) goto L_0x0063
        L_0x005c:
            int r3 = r3 - r2
            if (r3 >= 0) goto L_0x0060
            int r3 = r3 + r1
        L_0x0060:
            r5 = r0[r3]
            goto L_0x004e
        L_0x0063:
            if (r5 == 0) goto L_0x006a
            java.lang.Object r9 = REMOVED
            if (r5 == r9) goto L_0x006a
            goto L_0x0020
        L_0x006a:
            if (r4 != r6) goto L_0x006d
            return r3
        L_0x006d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.haha.trove.TObjectHash.insertionIndex(java.lang.Object):int");
    }

    /* access modifiers changed from: protected */
    public void removeAt(int i) {
        this._set[i] = REMOVED;
        super.removeAt(i);
    }

    /* access modifiers changed from: protected */
    public int setUp(int i) {
        int up = super.setUp(i);
        this._set = new Object[up];
        return up;
    }

    /* access modifiers changed from: protected */
    public final void throwObjectContractViolation(Object obj, Object obj2) {
        String str;
        StringBuilder sb = new StringBuilder("Equal objects must have equal hashcodes. During rehashing, Trove discovered that the following two objects claim to be equal (as in java.lang.Object.equals() or TObjectHashingStrategy.equals()) but their hashCodes (or those calculated by your TObjectHashingStrategy) are not equal.This violates the general contract of java.lang.Object.hashCode().  See bullet point two in that method's documentation. object #1 =");
        sb.append(obj);
        String str2 = "";
        if (obj == null) {
            str = str2;
        } else {
            str = " (" + obj.getClass() + ")";
        }
        sb.append(str);
        sb.append(", hashCode=");
        sb.append(this._hashingStrategy.computeHashCode(obj));
        sb.append("; object #2 =");
        sb.append(obj2);
        if (obj2 != null) {
            str2 = " (" + obj2.getClass() + ")";
        }
        sb.append(str2);
        sb.append(", hashCode=");
        sb.append(this._hashingStrategy.computeHashCode(obj2));
        throw new IllegalArgumentException(sb.toString());
    }
}
