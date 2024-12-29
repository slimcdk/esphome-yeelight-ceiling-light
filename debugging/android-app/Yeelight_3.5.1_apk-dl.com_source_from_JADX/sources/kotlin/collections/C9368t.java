package kotlin.collections;

import java.util.Collection;
import kotlin.PublishedApi;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.collections.t */
class C9368t extends C9366s {
    @PublishedApi
    /* renamed from: j */
    public static <T> int m22930j(@NotNull Iterable<? extends T> iterable, int i) {
        C9424q.m22996e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
