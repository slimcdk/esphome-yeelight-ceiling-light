package com.squareup.haha.guava.collect;

import com.squareup.haha.guava.base.Ascii;
import javax.annotation.Nullable;

final class RegularImmutableList<E> extends ImmutableList<E> {
    private final transient Object[] array;
    private final transient int offset;
    private final transient int size;

    RegularImmutableList(Object[] objArr) {
        this(objArr, 0, objArr.length);
    }

    private RegularImmutableList(Object[] objArr, int i, int i2) {
        this.offset = i;
        this.size = i2;
        this.array = objArr;
    }

    /* access modifiers changed from: package-private */
    public final int copyIntoArray(Object[] objArr, int i) {
        System.arraycopy(this.array, this.offset, objArr, i, this.size);
        return i + this.size;
    }

    public final E get(int i) {
        Ascii.checkElementIndex(i, this.size);
        return this.array[i + this.offset];
    }

    public final int indexOf(@Nullable Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int i = 0; i < this.size; i++) {
            if (this.array[this.offset + i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final boolean isPartialView() {
        return this.size != this.array.length;
    }

    public final int lastIndexOf(@Nullable Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int i = this.size - 1; i >= 0; i--) {
            if (this.array[this.offset + i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    public final UnmodifiableListIterator<E> listIterator(int i) {
        return Iterators.forArray(this.array, this.offset, this.size, i);
    }

    public final int size() {
        return this.size;
    }

    /* access modifiers changed from: package-private */
    public final ImmutableList<E> subListUnchecked(int i, int i2) {
        return new RegularImmutableList(this.array, this.offset + i, i2 - i);
    }
}
