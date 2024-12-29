package kotlin.collections;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.collections.c0 */
public final class C9333c0 implements ListIterator {
    @NotNull

    /* renamed from: a */
    public static final C9333c0 f17259a = new C9333c0();

    private C9333c0() {
    }

    @NotNull
    /* renamed from: a */
    public Void next() {
        throw new NoSuchElementException();
    }

    public /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    /* renamed from: b */
    public Void previous() {
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public int nextIndex() {
        return 0;
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
