package kotlin.sequences;

import kotlin.C9478s;
import kotlin.jvm.internal.Lambda;
import p233y4.C12064p;

final class SequencesKt___SequencesKt$onEachIndexed$1 extends Lambda implements C12064p<Integer, Object, Object> {
    final /* synthetic */ C12064p<Integer, Object, C9478s> $action;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SequencesKt___SequencesKt$onEachIndexed$1(C12064p<? super Integer, Object, C9478s> pVar) {
        super(2);
        this.$action = pVar;
    }

    public final Object invoke(int i, Object obj) {
        this.$action.invoke(Integer.valueOf(i), obj);
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), obj2);
    }
}
