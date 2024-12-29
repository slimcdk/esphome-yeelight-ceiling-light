package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.C9367s0;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.jvm.internal.k */
final class C9417k extends C9367s0 {
    @NotNull

    /* renamed from: a */
    private final short[] f17302a;

    /* renamed from: b */
    private int f17303b;

    public C9417k(@NotNull short[] sArr) {
        C9424q.m22996e(sArr, "array");
        this.f17302a = sArr;
    }

    /* renamed from: a */
    public short mo38206a() {
        try {
            short[] sArr = this.f17302a;
            int i = this.f17303b;
            this.f17303b = i + 1;
            return sArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f17303b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f17303b < this.f17302a.length;
    }
}
