package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.C9421n;
import kotlin.jvm.internal.C9424q;
import org.apache.commons.p194io.FilenameUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class EmptyList implements List, Serializable, RandomAccess {
    @NotNull
    public static final EmptyList INSTANCE = new EmptyList();
    private static final long serialVersionUID = -7390468764508069838L;

    private EmptyList() {
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void add(int i, Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return contains((Void) obj);
    }

    public boolean contains(@NotNull Void voidR) {
        C9424q.m22996e(voidR, "element");
        return false;
    }

    public boolean containsAll(@NotNull Collection collection) {
        C9424q.m22996e(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    @NotNull
    public Void get(int i) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + FilenameUtils.EXTENSION_SEPARATOR);
    }

    public int getSize() {
        return 0;
    }

    public int hashCode() {
        return 1;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return indexOf((Void) obj);
    }

    public int indexOf(@NotNull Void voidR) {
        C9424q.m22996e(voidR, "element");
        return -1;
    }

    public boolean isEmpty() {
        return true;
    }

    @NotNull
    public Iterator iterator() {
        return C9333c0.f17259a;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return lastIndexOf((Void) obj);
    }

    public int lastIndexOf(@NotNull Void voidR) {
        C9424q.m22996e(voidR, "element");
        return -1;
    }

    @NotNull
    public ListIterator listIterator() {
        return C9333c0.f17259a;
    }

    @NotNull
    public ListIterator listIterator(int i) {
        if (i == 0) {
            return C9333c0.f17259a;
        }
        throw new IndexOutOfBoundsException("Index: " + i);
    }

    public Void remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Void set(int i, Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    @NotNull
    public List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2);
    }

    public Object[] toArray() {
        return C9421n.m22990a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        C9424q.m22996e(tArr, "array");
        return C9421n.m22991b(this, tArr);
    }

    @NotNull
    public String toString() {
        return "[]";
    }
}
