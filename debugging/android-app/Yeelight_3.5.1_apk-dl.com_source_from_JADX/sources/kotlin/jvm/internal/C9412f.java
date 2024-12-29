package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.C9339f0;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.jvm.internal.f */
final class C9412f extends C9339f0 {
    @NotNull

    /* renamed from: a */
    private final int[] f17296a;

    /* renamed from: b */
    private int f17297b;

    public C9412f(@NotNull int[] iArr) {
        C9424q.m22996e(iArr, "array");
        this.f17296a = iArr;
    }

    /* renamed from: a */
    public int mo26532a() {
        try {
            int[] iArr = this.f17296a;
            int i = this.f17297b;
            this.f17297b = i + 1;
            return iArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f17297b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f17297b < this.f17296a.length;
    }
}
