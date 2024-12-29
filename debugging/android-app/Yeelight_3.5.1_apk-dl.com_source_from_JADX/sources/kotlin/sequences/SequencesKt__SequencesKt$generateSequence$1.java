package kotlin.sequences;

import kotlin.jvm.internal.C9424q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12049a;
import p233y4.C12060l;

final class SequencesKt__SequencesKt$generateSequence$1 extends Lambda implements C12060l<Object, Object> {
    final /* synthetic */ C12049a<Object> $nextFunction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SequencesKt__SequencesKt$generateSequence$1(C12049a<Object> aVar) {
        super(1);
        this.$nextFunction = aVar;
    }

    @Nullable
    public final Object invoke(@NotNull Object obj) {
        C9424q.m22996e(obj, "it");
        return this.$nextFunction.invoke();
    }
}
