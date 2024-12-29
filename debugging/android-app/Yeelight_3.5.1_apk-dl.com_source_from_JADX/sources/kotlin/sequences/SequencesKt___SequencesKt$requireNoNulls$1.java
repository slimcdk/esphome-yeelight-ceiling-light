package kotlin.sequences;

import kotlin.jvm.internal.Lambda;
import org.apache.commons.p194io.FilenameUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12060l;

final class SequencesKt___SequencesKt$requireNoNulls$1 extends Lambda implements C12060l<Object, Object> {
    final /* synthetic */ C9482c<Object> $this_requireNoNulls;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SequencesKt___SequencesKt$requireNoNulls$1(C9482c<Object> cVar) {
        super(1);
        this.$this_requireNoNulls = cVar;
    }

    @NotNull
    public final Object invoke(@Nullable Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalArgumentException("null element found in " + this.$this_requireNoNulls + FilenameUtils.EXTENSION_SEPARATOR);
    }
}
