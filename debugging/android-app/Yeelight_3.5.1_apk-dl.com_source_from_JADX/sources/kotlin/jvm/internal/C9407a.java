package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.C9355n;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.jvm.internal.a */
final class C9407a extends C9355n {
    @NotNull

    /* renamed from: a */
    private final boolean[] f17286a;

    /* renamed from: b */
    private int f17287b;

    public C9407a(@NotNull boolean[] zArr) {
        C9424q.m22996e(zArr, "array");
        this.f17286a = zArr;
    }

    /* renamed from: a */
    public boolean mo38193a() {
        try {
            boolean[] zArr = this.f17286a;
            int i = this.f17287b;
            this.f17287b = i + 1;
            return zArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f17287b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f17287b < this.f17286a.length;
    }
}
