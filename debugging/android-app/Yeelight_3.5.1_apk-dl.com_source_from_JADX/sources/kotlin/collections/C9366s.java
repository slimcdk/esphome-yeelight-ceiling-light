package kotlin.collections;

import java.util.Collection;
import java.util.List;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import p125a5.C3975c;

/* renamed from: kotlin.collections.s */
class C9366s extends C9364r {
    @NotNull
    /* renamed from: d */
    public static <T> List<T> m22923d() {
        return EmptyList.INSTANCE;
    }

    @NotNull
    /* renamed from: e */
    public static C3975c m22924e(@NotNull Collection<?> collection) {
        C9424q.m22996e(collection, "<this>");
        return new C3975c(0, collection.size() - 1);
    }

    /* renamed from: f */
    public static final <T> int m22925f(@NotNull List<? extends T> list) {
        C9424q.m22996e(list, "<this>");
        return list.size() - 1;
    }

    @NotNull
    /* renamed from: g */
    public static <T> List<T> m22926g(@NotNull T... tArr) {
        C9424q.m22996e(tArr, "elements");
        return tArr.length > 0 ? C9349k.m22878b(tArr) : m22923d();
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: h */
    public static void m22927h() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: i */
    public static void m22928i() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
