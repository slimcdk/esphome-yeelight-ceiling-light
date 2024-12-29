package kotlin;

import kotlin.jvm.internal.C9422o;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import p233y4.C12049a;

/* renamed from: kotlin.f */
class C9398f {
    @NotNull
    /* renamed from: a */
    public static <T> C9396d<T> m22952a(@NotNull C12049a<? extends T> aVar) {
        C9424q.m22996e(aVar, "initializer");
        return new SynchronizedLazyImpl(aVar, (Object) null, 2, (C9422o) null);
    }
}
