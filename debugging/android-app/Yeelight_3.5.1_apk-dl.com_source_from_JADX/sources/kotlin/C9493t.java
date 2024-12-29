package kotlin;

import kotlin.jvm.JvmName;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;

@JvmName(name = "UnsignedKt")
/* renamed from: kotlin.t */
public final class C9493t {
    @PublishedApi
    /* renamed from: a */
    public static final int m23107a(int i, int i2) {
        return C9424q.m22997f(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    @PublishedApi
    /* renamed from: b */
    public static final int m23108b(long j, long j2) {
        return C9424q.m22998g(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    @NotNull
    /* renamed from: c */
    public static final String m23109c(long j) {
        return m23110d(j, 10);
    }

    @NotNull
    /* renamed from: d */
    public static final String m23110d(long j, int i) {
        if (j >= 0) {
            String l = Long.toString(j, C9499b.m23120a(i));
            C9424q.m22995d(l, "toString(this, checkRadix(radix))");
            return l;
        }
        long j2 = (long) i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        String l2 = Long.toString(j3, C9499b.m23120a(i));
        C9424q.m22995d(l2, "toString(this, checkRadix(radix))");
        sb.append(l2);
        String l3 = Long.toString(j4, C9499b.m23120a(i));
        C9424q.m22995d(l3, "toString(this, checkRadix(radix))");
        sb.append(l3);
        return sb.toString();
    }
}
