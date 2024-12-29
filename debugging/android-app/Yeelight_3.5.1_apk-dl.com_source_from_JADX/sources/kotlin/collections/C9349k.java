package kotlin.collections;

import java.util.Arrays;
import java.util.List;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.collections.k */
class C9349k extends C9347j {
    @NotNull
    /* renamed from: b */
    public static final <T> List<T> m22878b(@NotNull T[] tArr) {
        C9424q.m22996e(tArr, "<this>");
        List<T> a = C9353m.m22889a(tArr);
        C9424q.m22995d(a, "asList(this)");
        return a;
    }

    @NotNull
    @SinceKotlin(version = "1.3")
    /* renamed from: c */
    public static <T> T[] m22879c(@NotNull T[] tArr, @NotNull T[] tArr2, int i, int i2, int i3) {
        C9424q.m22996e(tArr, "<this>");
        C9424q.m22996e(tArr2, "destination");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    @JvmName(name = "copyOfRange")
    /* renamed from: d */
    public static <T> T[] m22880d(@NotNull T[] tArr, int i, int i2) {
        C9424q.m22996e(tArr, "<this>");
        C9345i.m22872a(i2, tArr.length);
        T[] copyOfRange = Arrays.copyOfRange(tArr, i, i2);
        C9424q.m22995d(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    /* renamed from: e */
    public static void m22881e(@NotNull int[] iArr, int i, int i2, int i3) {
        C9424q.m22996e(iArr, "<this>");
        Arrays.fill(iArr, i2, i3, i);
    }

    /* renamed from: f */
    public static final <T> void m22882f(@NotNull T[] tArr, T t, int i, int i2) {
        C9424q.m22996e(tArr, "<this>");
        Arrays.fill(tArr, i, i2, t);
    }
}
