package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.C9342g0;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.jvm.internal.j */
final class C9416j extends C9342g0 {
    @NotNull

    /* renamed from: a */
    private final long[] f17300a;

    /* renamed from: b */
    private int f17301b;

    public C9416j(@NotNull long[] jArr) {
        C9424q.m22996e(jArr, "array");
        this.f17300a = jArr;
    }

    /* renamed from: a */
    public long mo38190a() {
        try {
            long[] jArr = this.f17300a;
            int i = this.f17301b;
            this.f17301b = i + 1;
            return jArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f17301b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f17301b < this.f17300a.length;
    }
}
