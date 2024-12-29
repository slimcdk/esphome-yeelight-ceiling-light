package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.collections.C9311b;
import kotlin.collections.C9336e;
import kotlin.collections.C9340g;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ListBuilder<E> extends C9336e<E> implements List<E>, RandomAccess {
    /* access modifiers changed from: private */
    @NotNull
    public E[] array;
    @Nullable
    private final ListBuilder<E> backing;
    private boolean isReadOnly;
    /* access modifiers changed from: private */
    public int length;
    /* access modifiers changed from: private */
    public int offset;
    @Nullable
    private final ListBuilder<E> root;

    /* renamed from: kotlin.collections.builders.ListBuilder$a */
    private static final class C9317a<E> implements ListIterator<E> {
        @NotNull

        /* renamed from: a */
        private final ListBuilder<E> f17248a;

        /* renamed from: b */
        private int f17249b;

        /* renamed from: c */
        private int f17250c = -1;

        public C9317a(@NotNull ListBuilder<E> listBuilder, int i) {
            C9424q.m22996e(listBuilder, "list");
            this.f17248a = listBuilder;
            this.f17249b = i;
        }

        public void add(E e) {
            ListBuilder<E> listBuilder = this.f17248a;
            int i = this.f17249b;
            this.f17249b = i + 1;
            listBuilder.add(i, e);
            this.f17250c = -1;
        }

        public boolean hasNext() {
            return this.f17249b < this.f17248a.length;
        }

        public boolean hasPrevious() {
            return this.f17249b > 0;
        }

        public E next() {
            if (this.f17249b < this.f17248a.length) {
                int i = this.f17249b;
                this.f17249b = i + 1;
                this.f17250c = i;
                return this.f17248a.array[this.f17248a.offset + this.f17250c];
            }
            throw new NoSuchElementException();
        }

        public int nextIndex() {
            return this.f17249b;
        }

        public E previous() {
            int i = this.f17249b;
            if (i > 0) {
                int i2 = i - 1;
                this.f17249b = i2;
                this.f17250c = i2;
                return this.f17248a.array[this.f17248a.offset + this.f17250c];
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return this.f17249b - 1;
        }

        public void remove() {
            int i = this.f17250c;
            if (i != -1) {
                this.f17248a.remove(i);
                this.f17249b = this.f17250c;
                this.f17250c = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        public void set(E e) {
            int i = this.f17250c;
            if (i != -1) {
                this.f17248a.set(i, e);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    public ListBuilder() {
        this(10);
    }

    public ListBuilder(int i) {
        this(C9327b.m22842d(i), 0, 0, false, (ListBuilder) null, (ListBuilder) null);
    }

    private ListBuilder(E[] eArr, int i, int i2, boolean z, ListBuilder<E> listBuilder, ListBuilder<E> listBuilder2) {
        this.array = eArr;
        this.offset = i;
        this.length = i2;
        this.isReadOnly = z;
        this.backing = listBuilder;
        this.root = listBuilder2;
    }

    private final void addAllInternal(int i, Collection<? extends E> collection, int i2) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            listBuilder.addAllInternal(i, collection, i2);
            this.array = this.backing.array;
            this.length += i2;
            return;
        }
        insertAtInternal(i, i2);
        Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.array[i + i3] = it.next();
        }
    }

    private final void addAtInternal(int i, E e) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            listBuilder.addAtInternal(i, e);
            this.array = this.backing.array;
            this.length++;
            return;
        }
        insertAtInternal(i, 1);
        this.array[i] = e;
    }

    private final void checkIsMutable() {
        if (isEffectivelyReadOnly()) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean contentEquals(List<?> list) {
        return C9327b.m22846h(this.array, this.offset, this.length, list);
    }

    private final void ensureCapacity(int i) {
        if (this.backing != null) {
            throw new IllegalStateException();
        } else if (i >= 0) {
            E[] eArr = this.array;
            if (i > eArr.length) {
                this.array = C9327b.m22843e(this.array, C9340g.f17262a.mo38189a(eArr.length, i));
            }
        } else {
            throw new OutOfMemoryError();
        }
    }

    private final void ensureExtraCapacity(int i) {
        ensureCapacity(this.length + i);
    }

    private final void insertAtInternal(int i, int i2) {
        ensureExtraCapacity(i2);
        E[] eArr = this.array;
        T[] unused = C9349k.m22879c(eArr, eArr, i + i2, i, this.offset + this.length);
        this.length += i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.root;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean isEffectivelyReadOnly() {
        /*
            r1 = this;
            boolean r0 = r1.isReadOnly
            if (r0 != 0) goto L_0x000f
            kotlin.collections.builders.ListBuilder<E> r0 = r1.root
            if (r0 == 0) goto L_0x000d
            boolean r0 = r0.isReadOnly
            if (r0 == 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r0 = 0
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.ListBuilder.isEffectivelyReadOnly():boolean");
    }

    private final E removeAtInternal(int i) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            this.length--;
            return listBuilder.removeAtInternal(i);
        }
        E[] eArr = this.array;
        E e = eArr[i];
        T[] unused = C9349k.m22879c(eArr, eArr, i, i + 1, this.offset + this.length);
        C9327b.m22844f(this.array, (this.offset + this.length) - 1);
        this.length--;
        return e;
    }

    private final void removeRangeInternal(int i, int i2) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            listBuilder.removeRangeInternal(i, i2);
        } else {
            E[] eArr = this.array;
            T[] unused = C9349k.m22879c(eArr, eArr, i, i + i2, this.length);
            E[] eArr2 = this.array;
            int i3 = this.length;
            C9327b.m22845g(eArr2, i3 - i2, i3);
        }
        this.length -= i2;
    }

    private final int retainOrRemoveAllInternal(int i, int i2, Collection<? extends E> collection, boolean z) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            int retainOrRemoveAllInternal = listBuilder.retainOrRemoveAllInternal(i, i2, collection, z);
            this.length -= retainOrRemoveAllInternal;
            return retainOrRemoveAllInternal;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.array[i5]) == z) {
                E[] eArr = this.array;
                i3++;
                eArr[i4 + i] = eArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        E[] eArr2 = this.array;
        T[] unused = C9349k.m22879c(eArr2, eArr2, i + i4, i2 + i, this.length);
        E[] eArr3 = this.array;
        int i7 = this.length;
        C9327b.m22845g(eArr3, i7 - i6, i7);
        this.length -= i6;
        return i6;
    }

    private final Object writeReplace() {
        if (isEffectivelyReadOnly()) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    public void add(int i, E e) {
        checkIsMutable();
        C9311b.f17241a.mo38015b(i, this.length);
        addAtInternal(this.offset + i, e);
    }

    public boolean add(E e) {
        checkIsMutable();
        addAtInternal(this.offset + this.length, e);
        return true;
    }

    public boolean addAll(int i, @NotNull Collection<? extends E> collection) {
        C9424q.m22996e(collection, "elements");
        checkIsMutable();
        C9311b.f17241a.mo38015b(i, this.length);
        int size = collection.size();
        addAllInternal(this.offset + i, collection, size);
        return size > 0;
    }

    public boolean addAll(@NotNull Collection<? extends E> collection) {
        C9424q.m22996e(collection, "elements");
        checkIsMutable();
        int size = collection.size();
        addAllInternal(this.offset + this.length, collection, size);
        return size > 0;
    }

    @NotNull
    public final List<E> build() {
        if (this.backing == null) {
            checkIsMutable();
            this.isReadOnly = true;
            return this;
        }
        throw new IllegalStateException();
    }

    public void clear() {
        checkIsMutable();
        removeRangeInternal(this.offset, this.length);
    }

    public boolean equals(@Nullable Object obj) {
        return obj == this || ((obj instanceof List) && contentEquals((List) obj));
    }

    public E get(int i) {
        C9311b.f17241a.mo38014a(i, this.length);
        return this.array[this.offset + i];
    }

    public int getSize() {
        return this.length;
    }

    public int hashCode() {
        return C9327b.m22847i(this.array, this.offset, this.length);
    }

    public int indexOf(Object obj) {
        for (int i = 0; i < this.length; i++) {
            if (C9424q.m22992a(this.array[this.offset + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    @NotNull
    public Iterator<E> iterator() {
        return new C9317a(this, 0);
    }

    public int lastIndexOf(Object obj) {
        for (int i = this.length - 1; i >= 0; i--) {
            if (C9424q.m22992a(this.array[this.offset + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @NotNull
    public ListIterator<E> listIterator() {
        return new C9317a(this, 0);
    }

    @NotNull
    public ListIterator<E> listIterator(int i) {
        C9311b.f17241a.mo38015b(i, this.length);
        return new C9317a(this, i);
    }

    public boolean remove(Object obj) {
        checkIsMutable();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        return indexOf >= 0;
    }

    public boolean removeAll(@NotNull Collection<? extends Object> collection) {
        C9424q.m22996e(collection, "elements");
        checkIsMutable();
        return retainOrRemoveAllInternal(this.offset, this.length, collection, false) > 0;
    }

    public E removeAt(int i) {
        checkIsMutable();
        C9311b.f17241a.mo38014a(i, this.length);
        return removeAtInternal(this.offset + i);
    }

    public boolean retainAll(@NotNull Collection<? extends Object> collection) {
        C9424q.m22996e(collection, "elements");
        checkIsMutable();
        return retainOrRemoveAllInternal(this.offset, this.length, collection, true) > 0;
    }

    public E set(int i, E e) {
        checkIsMutable();
        C9311b.f17241a.mo38014a(i, this.length);
        E[] eArr = this.array;
        int i2 = this.offset;
        E e2 = eArr[i2 + i];
        eArr[i2 + i] = e;
        return e2;
    }

    @NotNull
    public List<E> subList(int i, int i2) {
        C9311b.f17241a.mo38016c(i, i2, this.length);
        E[] eArr = this.array;
        int i3 = this.offset + i;
        int i4 = i2 - i;
        boolean z = this.isReadOnly;
        ListBuilder<E> listBuilder = this.root;
        return new ListBuilder(eArr, i3, i4, z, this, listBuilder == null ? this : listBuilder);
    }

    @NotNull
    public Object[] toArray() {
        E[] eArr = this.array;
        int i = this.offset;
        Object[] d = C9349k.m22880d(eArr, i, this.length + i);
        C9424q.m22994c(d, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return d;
    }

    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        C9424q.m22996e(tArr, "destination");
        int length2 = tArr.length;
        int i = this.length;
        if (length2 < i) {
            E[] eArr = this.array;
            int i2 = this.offset;
            T[] copyOfRange = Arrays.copyOfRange(eArr, i2, i + i2, tArr.getClass());
            C9424q.m22995d(copyOfRange, "copyOfRange(array, offse…h, destination.javaClass)");
            return copyOfRange;
        }
        E[] eArr2 = this.array;
        C9424q.m22994c(eArr2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.builders.ListBuilder.toArray>");
        int i3 = this.offset;
        T[] unused = C9349k.m22879c(eArr2, tArr, 0, i3, this.length + i3);
        int length3 = tArr.length;
        int i4 = this.length;
        if (length3 > i4) {
            tArr[i4] = null;
        }
        return tArr;
    }

    @NotNull
    public String toString() {
        return C9327b.m22848j(this.array, this.offset, this.length);
    }
}
