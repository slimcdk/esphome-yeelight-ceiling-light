package kotlin.collections;

import java.util.Set;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.collections.p0 */
class C9361p0 {
    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    /* renamed from: a */
    public static <E> Set<E> m22904a(@NotNull Set<E> set) {
        C9424q.m22996e(set, "builder");
        return ((SetBuilder) set).build();
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    /* renamed from: b */
    public static <E> Set<E> m22905b(int i) {
        return new SetBuilder(i);
    }
}
