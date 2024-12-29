package kotlin.sequences;

import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p233y4.C12049a;

final class SequencesKt__SequencesKt$generateSequence$2 extends Lambda implements C12049a<T> {
    final /* synthetic */ T $seed;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SequencesKt__SequencesKt$generateSequence$2(T t) {
        super(0);
        this.$seed = t;
    }

    @Nullable
    public final T invoke() {
        return this.$seed;
    }
}
