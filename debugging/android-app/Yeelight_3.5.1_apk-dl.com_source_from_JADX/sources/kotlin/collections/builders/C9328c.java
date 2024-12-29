package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.collections.builders.c */
public final class C9328c<K, V> extends C9326a<Map.Entry<K, V>, K, V> {
    @NotNull

    /* renamed from: a */
    private final MapBuilder<K, V> f17256a;

    public C9328c(@NotNull MapBuilder<K, V> mapBuilder) {
        C9424q.m22996e(mapBuilder, "backing");
        this.f17256a = mapBuilder;
    }

    public boolean addAll(@NotNull Collection<? extends Map.Entry<K, V>> collection) {
        C9424q.m22996e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f17256a.clear();
    }

    public boolean containsAll(@NotNull Collection<? extends Object> collection) {
        C9424q.m22996e(collection, "elements");
        return this.f17256a.containsAllEntries$kotlin_stdlib(collection);
    }

    /* renamed from: e */
    public boolean mo38135e(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        C9424q.m22996e(entry, "element");
        return this.f17256a.containsEntry$kotlin_stdlib(entry);
    }

    /* renamed from: g */
    public boolean mo38136g(@NotNull Map.Entry entry) {
        C9424q.m22996e(entry, "element");
        return this.f17256a.removeEntry$kotlin_stdlib(entry);
    }

    public int getSize() {
        return this.f17256a.size();
    }

    public boolean isEmpty() {
        return this.f17256a.isEmpty();
    }

    @NotNull
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f17256a.entriesIterator$kotlin_stdlib();
    }

    /* renamed from: j */
    public boolean add(@NotNull Map.Entry<K, V> entry) {
        C9424q.m22996e(entry, "element");
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(@NotNull Collection<? extends Object> collection) {
        C9424q.m22996e(collection, "elements");
        this.f17256a.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    public boolean retainAll(@NotNull Collection<? extends Object> collection) {
        C9424q.m22996e(collection, "elements");
        this.f17256a.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
