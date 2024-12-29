package kotlin.collections;

import java.util.Iterator;

/* renamed from: kotlin.collections.n */
public abstract class C9355n implements Iterator<Boolean> {
    /* renamed from: a */
    public abstract boolean mo38193a();

    public /* bridge */ /* synthetic */ Object next() {
        return Boolean.valueOf(mo38193a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
