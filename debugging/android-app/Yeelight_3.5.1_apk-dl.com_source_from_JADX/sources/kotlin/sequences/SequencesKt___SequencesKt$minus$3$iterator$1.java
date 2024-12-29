package kotlin.sequences;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12060l;

final class SequencesKt___SequencesKt$minus$3$iterator$1 extends Lambda implements C12060l<Object, Boolean> {
    final /* synthetic */ Collection<Object> $other;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SequencesKt___SequencesKt$minus$3$iterator$1(Collection<Object> collection) {
        super(1);
        this.$other = collection;
    }

    @NotNull
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(this.$other.contains(obj));
    }
}
