package p212t4;

import org.jetbrains.annotations.Nullable;

/* renamed from: t4.b */
class C10393b {
    /* renamed from: a */
    public static <T extends Comparable<?>> int m26326a(@Nullable T t, @Nullable T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }
}
