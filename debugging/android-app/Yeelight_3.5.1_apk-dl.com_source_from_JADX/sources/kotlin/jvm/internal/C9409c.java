package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.C9360p;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.jvm.internal.c */
final class C9409c extends C9360p {
    @NotNull

    /* renamed from: a */
    private final char[] f17290a;

    /* renamed from: b */
    private int f17291b;

    public C9409c(@NotNull char[] cArr) {
        C9424q.m22996e(cArr, "array");
        this.f17290a = cArr;
    }

    /* renamed from: a */
    public char mo38203a() {
        try {
            char[] cArr = this.f17290a;
            int i = this.f17291b;
            this.f17291b = i + 1;
            return cArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f17291b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f17291b < this.f17290a.length;
    }
}
