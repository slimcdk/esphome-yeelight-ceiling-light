package kotlin.sequences;

import java.util.Iterator;
import kotlin.C9400h;
import kotlin.C9478s;
import kotlin.coroutines.C9378a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12064p;

@DebugMetadata(mo23966c = "kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2", mo23967f = "_Sequences.kt", mo23968i = {0, 0, 0}, mo23969l = {2864}, mo23970m = "invokeSuspend", mo23971n = {"$this$result", "iterator", "next"}, mo23972s = {"L$0", "L$1", "L$2"})
final class SequencesKt___SequencesKt$zipWithNext$2 extends RestrictedSuspendLambda implements C12064p<C9484e<Object>, C9378a<? super C9478s>, Object> {
    final /* synthetic */ C9482c<Object> $this_zipWithNext;
    final /* synthetic */ C12064p<Object, Object, Object> $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SequencesKt___SequencesKt$zipWithNext$2(C9482c<Object> cVar, C12064p<Object, Object, Object> pVar, C9378a<? super SequencesKt___SequencesKt$zipWithNext$2> aVar) {
        super(2, aVar);
        this.$this_zipWithNext = cVar;
        this.$transform = pVar;
    }

    @NotNull
    public final C9378a<C9478s> create(@Nullable Object obj, @NotNull C9378a<?> aVar) {
        SequencesKt___SequencesKt$zipWithNext$2 sequencesKt___SequencesKt$zipWithNext$2 = new SequencesKt___SequencesKt$zipWithNext$2(this.$this_zipWithNext, this.$transform, aVar);
        sequencesKt___SequencesKt$zipWithNext$2.L$0 = obj;
        return sequencesKt___SequencesKt$zipWithNext$2;
    }

    @Nullable
    public final Object invoke(@NotNull C9484e<Object> eVar, @Nullable C9378a<? super C9478s> aVar) {
        return ((SequencesKt___SequencesKt$zipWithNext$2) create(eVar, aVar)).invokeSuspend(C9478s.f17335a);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object obj2;
        C9484e eVar;
        Iterator<Object> it;
        Object b = C9388b.m22940b();
        int i = this.label;
        if (i == 0) {
            C9400h.m22954b(obj);
            C9484e eVar2 = (C9484e) this.L$0;
            Iterator<Object> it2 = this.$this_zipWithNext.iterator();
            if (!it2.hasNext()) {
                return C9478s.f17335a;
            }
            eVar = eVar2;
            obj2 = it2.next();
            it = it2;
        } else if (i == 1) {
            Object obj3 = this.L$2;
            it = (Iterator) this.L$1;
            eVar = (C9484e) this.L$0;
            C9400h.m22954b(obj);
            obj2 = obj3;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (it.hasNext()) {
            Object next = it.next();
            Object invoke = this.$transform.invoke(obj2, next);
            this.L$0 = eVar;
            this.L$1 = it;
            this.L$2 = next;
            this.label = 1;
            if (eVar.mo38431a(invoke, this) == b) {
                return b;
            }
            obj2 = next;
        }
        return C9478s.f17335a;
    }
}
