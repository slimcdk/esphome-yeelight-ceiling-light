package kotlin.collections;

import java.util.AbstractList;
import kotlin.SinceKotlin;

@SinceKotlin(version = "1.1")
/* renamed from: kotlin.collections.e */
public abstract class C9336e<E> extends AbstractList<E> {
    protected C9336e() {
    }

    public abstract void add(int i, E e);

    public abstract int getSize();

    public final /* bridge */ E remove(int i) {
        return removeAt(i);
    }

    public abstract E removeAt(int i);

    public abstract E set(int i, E e);

    public final /* bridge */ int size() {
        return getSize();
    }
}
