package kotlin.random;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.random.d */
public final class C9452d {
    @NotNull
    /* renamed from: a */
    public static final String m23069a(@NotNull Object obj, @NotNull Object obj2) {
        C9424q.m22996e(obj, TypedValues.TransitionType.S_FROM);
        C9424q.m22996e(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    /* renamed from: b */
    public static final void m23070b(double d, double d2) {
        if (!(d2 > d)) {
            throw new IllegalArgumentException(m23069a(Double.valueOf(d), Double.valueOf(d2)).toString());
        }
    }

    /* renamed from: c */
    public static final void m23071c(int i, int i2) {
        if (!(i2 > i)) {
            throw new IllegalArgumentException(m23069a(Integer.valueOf(i), Integer.valueOf(i2)).toString());
        }
    }

    /* renamed from: d */
    public static final void m23072d(long j, long j2) {
        if (!(j2 > j)) {
            throw new IllegalArgumentException(m23069a(Long.valueOf(j), Long.valueOf(j2)).toString());
        }
    }

    /* renamed from: e */
    public static final int m23073e(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    /* renamed from: f */
    public static final int m23074f(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }
}
