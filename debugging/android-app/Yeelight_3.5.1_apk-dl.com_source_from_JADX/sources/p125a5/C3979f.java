package p125a5;

import org.jetbrains.annotations.NotNull;

/* renamed from: a5.f */
class C3979f extends C3978e {
    /* renamed from: a */
    public static int m11481a(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* renamed from: b */
    public static int m11482b(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    @NotNull
    /* renamed from: c */
    public static C3972a m11483c(int i, int i2) {
        return C3972a.f6716d.mo26531a(i, i2, -1);
    }

    @NotNull
    /* renamed from: d */
    public static C3975c m11484d(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? C3975c.f6724e.mo26537a() : new C3975c(i, i2 - 1);
    }
}
