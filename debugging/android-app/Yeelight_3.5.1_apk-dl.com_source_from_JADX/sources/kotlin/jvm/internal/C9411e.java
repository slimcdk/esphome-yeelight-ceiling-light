package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.C9335d0;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.jvm.internal.e */
final class C9411e extends C9335d0 {
    @NotNull

    /* renamed from: a */
    private final float[] f17294a;

    /* renamed from: b */
    private int f17295b;

    public C9411e(@NotNull float[] fArr) {
        C9424q.m22996e(fArr, "array");
        this.f17294a = fArr;
    }

    /* renamed from: a */
    public float mo38176a() {
        try {
            float[] fArr = this.f17294a;
            int i = this.f17295b;
            this.f17295b = i + 1;
            return fArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f17295b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f17295b < this.f17294a.length;
    }
}
