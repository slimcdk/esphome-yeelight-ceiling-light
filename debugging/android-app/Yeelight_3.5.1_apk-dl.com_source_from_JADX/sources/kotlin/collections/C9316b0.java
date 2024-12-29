package kotlin.collections;

import java.util.Iterator;

/* renamed from: kotlin.collections.b0 */
public abstract class C9316b0 implements Iterator<Double> {
    /* renamed from: a */
    public abstract double mo38030a();

    public /* bridge */ /* synthetic */ Object next() {
        return Double.valueOf(mo38030a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
