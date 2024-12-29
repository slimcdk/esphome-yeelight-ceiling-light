package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C9338f;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;

public final class SetBuilder<E> extends C9338f<E> implements Set<E> {
    @NotNull
    private final MapBuilder<E, ?> backing;

    public SetBuilder() {
        this(new MapBuilder());
    }

    public SetBuilder(int i) {
        this(new MapBuilder(i));
    }

    public SetBuilder(@NotNull MapBuilder<E, ?> mapBuilder) {
        C9424q.m22996e(mapBuilder, "backing");
        this.backing = mapBuilder;
    }

    private final Object writeReplace() {
        if (this.backing.isReadOnly$kotlin_stdlib()) {
            return new SerializedCollection(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    public boolean add(E e) {
        return this.backing.addKey$kotlin_stdlib(e) >= 0;
    }

    public boolean addAll(@NotNull Collection<? extends E> collection) {
        C9424q.m22996e(collection, "elements");
        this.backing.checkIsMutable$kotlin_stdlib();
        return super.addAll(collection);
    }

    @NotNull
    public final Set<E> build() {
        this.backing.build();
        return this;
    }

    public void clear() {
        this.backing.clear();
    }

    public boolean contains(Object obj) {
        return this.backing.containsKey(obj);
    }

    public int getSize() {
        return this.backing.size();
    }

    public boolean isEmpty() {
        return this.backing.isEmpty();
    }

    @NotNull
    public Iterator<E> iterator() {
        return this.backing.keysIterator$kotlin_stdlib();
    }

    public boolean remove(Object obj) {
        return this.backing.removeKey$kotlin_stdlib(obj) >= 0;
    }

    public boolean removeAll(@NotNull Collection<? extends Object> collection) {
        C9424q.m22996e(collection, "elements");
        this.backing.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    public boolean retainAll(@NotNull Collection<? extends Object> collection) {
        C9424q.m22996e(collection, "elements");
        this.backing.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
