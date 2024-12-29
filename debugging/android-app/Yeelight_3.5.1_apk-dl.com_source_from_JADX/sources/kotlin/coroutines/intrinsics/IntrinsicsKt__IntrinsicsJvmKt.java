package kotlin.coroutines.intrinsics;

import kotlin.C9478s;
import kotlin.SinceKotlin;
import kotlin.coroutines.C9378a;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.C9393e;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import p233y4.C12064p;

class IntrinsicsKt__IntrinsicsJvmKt {
    @NotNull
    @SinceKotlin(version = "1.3")
    /* renamed from: a */
    public static <R, T> C9378a<C9478s> m22937a(@NotNull C12064p<? super R, ? super C9378a<? super T>, ? extends Object> pVar, R r, @NotNull C9378a<? super T> aVar) {
        C9424q.m22996e(pVar, "<this>");
        C9424q.m22996e(aVar, "completion");
        C9378a<? super T> a = C9393e.m22946a(aVar);
        if (pVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) pVar).create(r, a);
        }
        CoroutineContext context = a.getContext();
        return context == EmptyCoroutineContext.INSTANCE ? new C9383xa50de662(a, pVar, r) : new C9384xa50de663(a, context, pVar, r);
    }
}
