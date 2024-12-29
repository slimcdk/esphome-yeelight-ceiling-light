package kotlin.sequences;

import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12049a;
import p233y4.C12060l;

class SequencesKt__SequencesKt extends C9488h {
    @NotNull
    @LowPriorityInOverloadResolution
    /* renamed from: c */
    public static <T> C9482c<T> m23079c(@Nullable T t, @NotNull C12060l<? super T, ? extends T> lVar) {
        C9424q.m22996e(lVar, "nextFunction");
        return t == null ? C9479a.f17336a : new C9480b(new SequencesKt__SequencesKt$generateSequence$2(t), lVar);
    }

    @NotNull
    /* renamed from: d */
    public static <T> C9482c<T> m23080d(@NotNull C12049a<? extends T> aVar, @NotNull C12060l<? super T, ? extends T> lVar) {
        C9424q.m22996e(aVar, "seedFunction");
        C9424q.m22996e(lVar, "nextFunction");
        return new C9480b(aVar, lVar);
    }
}
