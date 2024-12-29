package kotlin.sequences;

import kotlin.jvm.internal.Lambda;
import org.apache.commons.p194io.FilenameUtils;
import p233y4.C12060l;

final class SequencesKt___SequencesKt$elementAt$1 extends Lambda implements C12060l<Integer, Object> {
    final /* synthetic */ int $index;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SequencesKt___SequencesKt$elementAt$1(int i) {
        super(1);
        this.$index = i;
    }

    public final Object invoke(int i) {
        throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + this.$index + FilenameUtils.EXTENSION_SEPARATOR);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
