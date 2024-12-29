package kotlin.collections;

import java.util.Iterator;

/* renamed from: kotlin.collections.o */
public abstract class C9358o implements Iterator<Byte> {
    /* renamed from: a */
    public abstract byte mo38200a();

    public /* bridge */ /* synthetic */ Object next() {
        return Byte.valueOf(mo38200a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
