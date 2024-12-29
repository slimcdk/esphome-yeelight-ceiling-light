package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C9334d;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.collections.builders.e */
public final class C9330e<V> extends C9334d<V> {
    @NotNull

    /* renamed from: a */
    private final MapBuilder<?, V> f17258a;

    public C9330e(@NotNull MapBuilder<?, V> mapBuilder) {
        C9424q.m22996e(mapBuilder, "backing");
        this.f17258a = mapBuilder;
    }

    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(@NotNull Collection<? extends V> collection) {
        C9424q.m22996e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public int mo38156b() {
        return this.f17258a.size();
    }

    public void clear() {
        this.f17258a.clear();
    }

    public boolean contains(Object obj) {
        return this.f17258a.containsValue(obj);
    }

    public boolean isEmpty() {
        return this.f17258a.isEmpty();
    }

    @NotNull
    public Iterator<V> iterator() {
        return this.f17258a.valuesIterator$kotlin_stdlib();
    }

    public boolean remove(Object obj) {
        return this.f17258a.removeValue$kotlin_stdlib(obj);
    }

    public boolean removeAll(@NotNull Collection<? extends Object> collection) {
        C9424q.m22996e(collection, "elements");
        this.f17258a.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    public boolean retainAll(@NotNull Collection<? extends Object> collection) {
        C9424q.m22996e(collection, "elements");
        this.f17258a.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
