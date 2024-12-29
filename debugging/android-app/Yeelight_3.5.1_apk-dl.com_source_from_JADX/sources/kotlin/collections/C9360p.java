package kotlin.collections;

import java.util.Iterator;

/* renamed from: kotlin.collections.p */
public abstract class C9360p implements Iterator<Character> {
    /* renamed from: a */
    public abstract char mo38203a();

    public /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(mo38203a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
