package kotlin.collections;

import java.util.Iterator;

/* renamed from: kotlin.collections.s0 */
public abstract class C9367s0 implements Iterator<Short> {
    /* renamed from: a */
    public abstract short mo38206a();

    public /* bridge */ /* synthetic */ Object next() {
        return Short.valueOf(mo38206a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
