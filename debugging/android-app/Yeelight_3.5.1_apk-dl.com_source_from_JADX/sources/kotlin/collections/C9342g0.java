package kotlin.collections;

import java.util.Iterator;

/* renamed from: kotlin.collections.g0 */
public abstract class C9342g0 implements Iterator<Long> {
    /* renamed from: a */
    public abstract long mo38190a();

    public /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(mo38190a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
