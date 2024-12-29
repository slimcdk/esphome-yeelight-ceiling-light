package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.C9316b0;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.jvm.internal.d */
final class C9410d extends C9316b0 {
    @NotNull

    /* renamed from: a */
    private final double[] f17292a;

    /* renamed from: b */
    private int f17293b;

    public C9410d(@NotNull double[] dArr) {
        C9424q.m22996e(dArr, "array");
        this.f17292a = dArr;
    }

    /* renamed from: a */
    public double mo38030a() {
        try {
            double[] dArr = this.f17292a;
            int i = this.f17293b;
            this.f17293b = i + 1;
            return dArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f17293b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f17293b < this.f17292a.length;
    }
}
