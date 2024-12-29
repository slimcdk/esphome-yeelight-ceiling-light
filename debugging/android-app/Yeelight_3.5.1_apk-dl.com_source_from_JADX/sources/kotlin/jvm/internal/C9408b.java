package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.C9358o;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.jvm.internal.b */
final class C9408b extends C9358o {
    @NotNull

    /* renamed from: a */
    private final byte[] f17288a;

    /* renamed from: b */
    private int f17289b;

    public C9408b(@NotNull byte[] bArr) {
        C9424q.m22996e(bArr, "array");
        this.f17288a = bArr;
    }

    /* renamed from: a */
    public byte mo38200a() {
        try {
            byte[] bArr = this.f17288a;
            int i = this.f17289b;
            this.f17289b = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f17289b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f17289b < this.f17288a.length;
    }
}
