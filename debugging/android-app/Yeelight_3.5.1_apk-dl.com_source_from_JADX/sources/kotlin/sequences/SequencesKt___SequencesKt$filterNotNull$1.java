package kotlin.sequences;

import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12060l;

final class SequencesKt___SequencesKt$filterNotNull$1 extends Lambda implements C12060l<Object, Boolean> {
    public static final SequencesKt___SequencesKt$filterNotNull$1 INSTANCE = new SequencesKt___SequencesKt$filterNotNull$1();

    SequencesKt___SequencesKt$filterNotNull$1() {
        super(1);
    }

    @NotNull
    public final Boolean invoke(@Nullable Object obj) {
        return Boolean.valueOf(obj == null);
    }
}
