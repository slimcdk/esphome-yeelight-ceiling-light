package kotlin.collections.builders;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.collections.builders.b */
public final class C9327b {
    @NotNull
    /* renamed from: d */
    public static final <E> E[] m22842d(int i) {
        if (i >= 0) {
            return new Object[i];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    @NotNull
    /* renamed from: e */
    public static final <T> T[] m22843e(@NotNull T[] tArr, int i) {
        C9424q.m22996e(tArr, "<this>");
        T[] copyOf = Arrays.copyOf(tArr, i);
        C9424q.m22995d(copyOf, "copyOf(this, newSize)");
        C9424q.m22994c(copyOf, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.builders.ListBuilderKt.copyOfUninitializedElements>");
        return copyOf;
    }

    /* renamed from: f */
    public static final <E> void m22844f(@NotNull E[] eArr, int i) {
        C9424q.m22996e(eArr, "<this>");
        eArr[i] = null;
    }

    /* renamed from: g */
    public static final <E> void m22845g(@NotNull E[] eArr, int i, int i2) {
        C9424q.m22996e(eArr, "<this>");
        while (i < i2) {
            m22844f(eArr, i);
            i++;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final <T> boolean m22846h(T[] tArr, int i, int i2, List<?> list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!C9424q.m22992a(tArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final <T> int m22847i(T[] tArr, int i, int i2) {
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            T t = tArr[i + i4];
            i3 = (i3 * 31) + (t != null ? t.hashCode() : 0);
        }
        return i3;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final <T> String m22848j(T[] tArr, int i, int i2) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(tArr[i + i3]);
        }
        sb.append("]");
        String sb2 = sb.toString();
        C9424q.m22995d(sb2, "sb.toString()");
        return sb2;
    }
}
