package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.C9421n;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(version = "1.1")
public abstract class AbstractCollection<E> implements Collection<E> {
    protected AbstractCollection() {
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public abstract int mo37904b();

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(E e) {
        if (isEmpty()) {
            return false;
        }
        for (Object a : this) {
            if (C9424q.m22992a(a, e)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(@NotNull Collection<? extends Object> collection) {
        C9424q.m22996e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo37904b();
    }

    @NotNull
    public Object[] toArray() {
        return C9421n.m22990a(this);
    }

    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        C9424q.m22996e(tArr, "array");
        T[] b = C9421n.m22991b(this, tArr);
        C9424q.m22994c(b, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.CollectionsKt__CollectionsJVMKt.copyToArrayImpl>");
        return b;
    }

    @NotNull
    public String toString() {
        return C9309a0.m22811q(this, ", ", "[", "]", 0, (CharSequence) null, new AbstractCollection$toString$1(this), 24, (Object) null);
    }
}
