package kotlin.collections;

import java.util.Iterator;

/* renamed from: kotlin.collections.d0 */
public abstract class C9335d0 implements Iterator<Float> {
    /* renamed from: a */
    public abstract float mo38176a();

    public /* bridge */ /* synthetic */ Object next() {
        return Float.valueOf(mo38176a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
