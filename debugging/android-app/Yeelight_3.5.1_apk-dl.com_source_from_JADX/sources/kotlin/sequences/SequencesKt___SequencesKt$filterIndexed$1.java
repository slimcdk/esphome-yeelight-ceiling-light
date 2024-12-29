package kotlin.sequences;

import kotlin.collections.C9337e0;
import kotlin.jvm.internal.C9424q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12060l;
import p233y4.C12064p;

final class SequencesKt___SequencesKt$filterIndexed$1 extends Lambda implements C12060l<C9337e0<Object>, Boolean> {
    final /* synthetic */ C12064p<Integer, Object, Boolean> $predicate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SequencesKt___SequencesKt$filterIndexed$1(C12064p<? super Integer, Object, Boolean> pVar) {
        super(1);
        this.$predicate = pVar;
    }

    @NotNull
    public final Boolean invoke(@NotNull C9337e0<Object> e0Var) {
        C9424q.m22996e(e0Var, "it");
        return this.$predicate.invoke(Integer.valueOf(e0Var.mo38181a()), e0Var.mo38182b());
    }
}
