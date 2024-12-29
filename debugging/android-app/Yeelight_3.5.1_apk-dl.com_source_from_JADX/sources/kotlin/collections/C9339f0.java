package kotlin.collections;

import java.util.Iterator;

/* renamed from: kotlin.collections.f0 */
public abstract class C9339f0 implements Iterator<Integer> {
    /* renamed from: a */
    public abstract int mo26532a();

    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(mo26532a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
