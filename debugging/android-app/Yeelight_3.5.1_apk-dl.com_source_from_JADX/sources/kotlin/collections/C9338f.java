package kotlin.collections;

import java.util.AbstractSet;
import kotlin.SinceKotlin;

@SinceKotlin(version = "1.1")
/* renamed from: kotlin.collections.f */
public abstract class C9338f<E> extends AbstractSet<E> {
    protected C9338f() {
    }

    public abstract boolean add(E e);

    public abstract int getSize();

    public final /* bridge */ int size() {
        return getSize();
    }
}
