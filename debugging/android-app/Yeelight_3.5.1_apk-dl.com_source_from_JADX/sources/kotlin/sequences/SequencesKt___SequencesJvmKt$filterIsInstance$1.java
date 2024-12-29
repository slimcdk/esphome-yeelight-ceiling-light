package kotlin.sequences;

import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12060l;

final class SequencesKt___SequencesJvmKt$filterIsInstance$1 extends Lambda implements C12060l<Object, Boolean> {
    final /* synthetic */ Class<Object> $klass;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SequencesKt___SequencesJvmKt$filterIsInstance$1(Class<Object> cls) {
        super(1);
        this.$klass = cls;
    }

    @NotNull
    public final Boolean invoke(@Nullable Object obj) {
        return Boolean.valueOf(this.$klass.isInstance(obj));
    }
}
