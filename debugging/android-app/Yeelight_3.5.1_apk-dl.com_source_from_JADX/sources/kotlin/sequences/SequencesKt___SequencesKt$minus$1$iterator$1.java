package kotlin.sequences;

import kotlin.jvm.internal.C9424q;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.jetbrains.annotations.NotNull;
import p233y4.C12060l;

final class SequencesKt___SequencesKt$minus$1$iterator$1 extends Lambda implements C12060l<Object, Boolean> {
    final /* synthetic */ Object $element;
    final /* synthetic */ Ref$BooleanRef $removed;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SequencesKt___SequencesKt$minus$1$iterator$1(Ref$BooleanRef ref$BooleanRef, Object obj) {
        super(1);
        this.$removed = ref$BooleanRef;
        this.$element = obj;
    }

    @NotNull
    public final Boolean invoke(Object obj) {
        boolean z = true;
        if (!this.$removed.element && C9424q.m22992a(obj, this.$element)) {
            this.$removed.element = true;
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
