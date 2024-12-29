package kotlin.collections;

import java.util.Collections;
import java.util.List;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.collections.r */
class C9364r {
    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    /* renamed from: a */
    public static <E> List<E> m22920a(@NotNull List<E> list) {
        C9424q.m22996e(list, "builder");
        return ((ListBuilder) list).build();
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    /* renamed from: b */
    public static <E> List<E> m22921b(int i) {
        return new ListBuilder(i);
    }

    @NotNull
    /* renamed from: c */
    public static <T> List<T> m22922c(T t) {
        List<T> singletonList = Collections.singletonList(t);
        C9424q.m22995d(singletonList, "singletonList(element)");
        return singletonList;
    }
}
