package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class LongSparseArray<E> implements Cloneable {
    private static final Object DELETED = new Object();
    private boolean mGarbage;
    private long[] mKeys;
    private int mSize;
    private Object[] mValues;

    public LongSparseArray() {
        this(10);
    }

    public LongSparseArray(int i) {
        this.mGarbage = false;
        if (i == 0) {
            this.mKeys = ContainerHelpers.EMPTY_LONGS;
            this.mValues = ContainerHelpers.EMPTY_OBJECTS;
        } else {
            int idealLongArraySize = ContainerHelpers.idealLongArraySize(i);
            this.mKeys = new long[idealLongArraySize];
            this.mValues = new Object[idealLongArraySize];
        }
        this.mSize = 0;
    }

    /* renamed from: gc */
    private void m2gc() {
        int i = this.mSize;
        long[] jArr = this.mKeys;
        Object[] objArr = this.mValues;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != DELETED) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.mGarbage = false;
        this.mSize = i2;
    }

    public void append(long j, E e) {
        int i = this.mSize;
        if (i == 0 || j > this.mKeys[i - 1]) {
            if (this.mGarbage && this.mSize >= this.mKeys.length) {
                m2gc();
            }
            int i2 = this.mSize;
            if (i2 >= this.mKeys.length) {
                int idealLongArraySize = ContainerHelpers.idealLongArraySize(i2 + 1);
                long[] jArr = new long[idealLongArraySize];
                Object[] objArr = new Object[idealLongArraySize];
                long[] jArr2 = this.mKeys;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.mValues;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.mKeys = jArr;
                this.mValues = objArr;
            }
            this.mKeys[i2] = j;
            this.mValues[i2] = e;
            this.mSize = i2 + 1;
            return;
        }
        put(j, e);
    }

    public void clear() {
        int i = this.mSize;
        Object[] objArr = this.mValues;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.mSize = 0;
        this.mGarbage = false;
    }

    public LongSparseArray<E> clone() {
        try {
            LongSparseArray<E> longSparseArray = (LongSparseArray) super.clone();
            longSparseArray.mKeys = (long[]) this.mKeys.clone();
            longSparseArray.mValues = (Object[]) this.mValues.clone();
            return longSparseArray;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public boolean containsKey(long j) {
        return indexOfKey(j) >= 0;
    }

    public boolean containsValue(E e) {
        return indexOfValue(e) >= 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.mValues;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void delete(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.mKeys
            int r1 = r2.mSize
            int r3 = androidx.collection.ContainerHelpers.binarySearch((long[]) r0, (int) r1, (long) r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.mValues
            r0 = r4[r3]
            java.lang.Object r1 = DELETED
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.mGarbage = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSparseArray.delete(long):void");
    }

    @Nullable
    public E get(long j) {
        return get(j, (Object) null);
    }

    public E get(long j, E e) {
        int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, j);
        if (binarySearch >= 0) {
            E[] eArr = this.mValues;
            if (eArr[binarySearch] != DELETED) {
                return eArr[binarySearch];
            }
        }
        return e;
    }

    public int indexOfKey(long j) {
        if (this.mGarbage) {
            m2gc();
        }
        return ContainerHelpers.binarySearch(this.mKeys, this.mSize, j);
    }

    public int indexOfValue(E e) {
        if (this.mGarbage) {
            m2gc();
        }
        for (int i = 0; i < this.mSize; i++) {
            if (this.mValues[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public long keyAt(int i) {
        if (this.mGarbage) {
            m2gc();
        }
        return this.mKeys[i];
    }

    public void put(long j, E e) {
        int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, j);
        if (binarySearch >= 0) {
            this.mValues[binarySearch] = e;
            return;
        }
        int i = binarySearch ^ -1;
        if (i < this.mSize) {
            Object[] objArr = this.mValues;
            if (objArr[i] == DELETED) {
                this.mKeys[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.mGarbage && this.mSize >= this.mKeys.length) {
            m2gc();
            i = ContainerHelpers.binarySearch(this.mKeys, this.mSize, j) ^ -1;
        }
        int i2 = this.mSize;
        if (i2 >= this.mKeys.length) {
            int idealLongArraySize = ContainerHelpers.idealLongArraySize(i2 + 1);
            long[] jArr = new long[idealLongArraySize];
            Object[] objArr2 = new Object[idealLongArraySize];
            long[] jArr2 = this.mKeys;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.mValues;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.mKeys = jArr;
            this.mValues = objArr2;
        }
        int i3 = this.mSize;
        if (i3 - i != 0) {
            long[] jArr3 = this.mKeys;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.mValues;
            System.arraycopy(objArr4, i, objArr4, i4, this.mSize - i);
        }
        this.mKeys[i] = j;
        this.mValues[i] = e;
        this.mSize++;
    }

    public void putAll(@NonNull LongSparseArray<? extends E> longSparseArray) {
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            put(longSparseArray.keyAt(i), longSparseArray.valueAt(i));
        }
    }

    public void remove(long j) {
        delete(j);
    }

    public void removeAt(int i) {
        Object[] objArr = this.mValues;
        Object obj = objArr[i];
        Object obj2 = DELETED;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.mGarbage = true;
        }
    }

    public void setValueAt(int i, E e) {
        if (this.mGarbage) {
            m2gc();
        }
        this.mValues[i] = e;
    }

    public int size() {
        if (this.mGarbage) {
            m2gc();
        }
        return this.mSize;
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.mSize * 28);
        sb.append('{');
        for (int i = 0; i < this.mSize; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(keyAt(i));
            sb.append('=');
            Object valueAt = valueAt(i);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public E valueAt(int i) {
        if (this.mGarbage) {
            m2gc();
        }
        return this.mValues[i];
    }
}
