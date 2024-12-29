package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C9421n;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class EmptySet implements Set, Serializable {
    @NotNull
    public static final EmptySet INSTANCE = new EmptySet();
    private static final long serialVersionUID = 3406603774387020532L;

    private EmptySet() {
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(Void voidR) {
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
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public int getSize() {
        return 0;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    @NotNull
    public Iterator iterator() {
        return C9333c0.f17259a;
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

    public final /* bridge */ int size() {
        return getSize();
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
