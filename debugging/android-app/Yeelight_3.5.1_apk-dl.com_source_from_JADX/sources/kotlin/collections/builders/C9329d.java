package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C9338f;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.collections.builders.d */
public final class C9329d<E> extends C9338f<E> {
    @NotNull

    /* renamed from: a */
    private final MapBuilder<E, ?> f17257a;

    public C9329d(@NotNull MapBuilder<E, ?> mapBuilder) {
        C9424q.m22996e(mapBuilder, "backing");
        this.f17257a = mapBuilder;
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(@NotNull Collection<? extends E> collection) {
        C9424q.m22996e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f17257a.clear();
    }

    public boolean contains(Object obj) {
        return this.f17257a.containsKey(obj);
    }

    public int getSize() {
        return this.f17257a.size();
    }

    public boolean isEmpty() {
        return this.f17257a.isEmpty();
    }

    @NotNull
    public Iterator<E> iterator() {
        return this.f17257a.keysIterator$kotlin_stdlib();
    }

    public boolean remove(Object obj) {
        return this.f17257a.removeKey$kotlin_stdlib(obj) >= 0;
    }

    public boolean removeAll(@NotNull Collection<? extends Object> collection) {
        C9424q.m22996e(collection, "elements");
        this.f17257a.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    public boolean retainAll(@NotNull Collection<? extends Object> collection) {
        C9424q.m22996e(collection, "elements");
        this.f17257a.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
