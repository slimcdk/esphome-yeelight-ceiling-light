package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.jvm.internal.g */
final class C9413g<T> implements Iterator<T> {
    @NotNull

    /* renamed from: a */
    private final T[] f17298a;

    /* renamed from: b */
    private int f17299b;

    public C9413g(@NotNull T[] tArr) {
        C9424q.m22996e(tArr, "array");
        this.f17298a = tArr;
    }

    public boolean hasNext() {
        return this.f17299b < this.f17298a.length;
    }

    public T next() {
        try {
            T[] tArr = this.f17298a;
            int i = this.f17299b;
            this.f17299b = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f17299b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
