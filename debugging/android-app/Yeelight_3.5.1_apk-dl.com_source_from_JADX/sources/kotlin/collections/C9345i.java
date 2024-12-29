package kotlin.collections;

import kotlin.SinceKotlin;

/* renamed from: kotlin.collections.i */
class C9345i {
    @SinceKotlin(version = "1.3")
    /* renamed from: a */
    public static final void m22872a(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
        }
    }
}
