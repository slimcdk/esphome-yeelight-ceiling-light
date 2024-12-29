package kotlin.sequences;

import kotlin.C9478s;
import kotlin.jvm.internal.Lambda;
import p233y4.C12060l;

final class SequencesKt___SequencesKt$onEach$1 extends Lambda implements C12060l<Object, Object> {
    final /* synthetic */ C12060l<Object, C9478s> $action;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SequencesKt___SequencesKt$onEach$1(C12060l<Object, C9478s> lVar) {
        super(1);
        this.$action = lVar;
    }

    public final Object invoke(Object obj) {
        this.$action.invoke(obj);
        return obj;
    }
}
