package kotlin.sequences;

import java.util.List;
import kotlin.C9400h;
import kotlin.C9478s;
import kotlin.coroutines.C9378a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12064p;

@DebugMetadata(mo23966c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", mo23967f = "Sequences.kt", mo23968i = {0, 0}, mo23969l = {145}, mo23970m = "invokeSuspend", mo23971n = {"$this$sequence", "buffer"}, mo23972s = {"L$0", "L$1"})
final class SequencesKt__SequencesKt$shuffled$1 extends RestrictedSuspendLambda implements C12064p<C9484e<Object>, C9378a<? super C9478s>, Object> {
    final /* synthetic */ Random $random;
    final /* synthetic */ C9482c<Object> $this_shuffled;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SequencesKt__SequencesKt$shuffled$1(C9482c<Object> cVar, Random random, C9378a<? super SequencesKt__SequencesKt$shuffled$1> aVar) {
        super(2, aVar);
        this.$this_shuffled = cVar;
        this.$random = random;
    }

    @NotNull
    public final C9378a<C9478s> create(@Nullable Object obj, @NotNull C9378a<?> aVar) {
        SequencesKt__SequencesKt$shuffled$1 sequencesKt__SequencesKt$shuffled$1 = new SequencesKt__SequencesKt$shuffled$1(this.$this_shuffled, this.$random, aVar);
        sequencesKt__SequencesKt$shuffled$1.L$0 = obj;
        return sequencesKt__SequencesKt$shuffled$1;
    }

    @Nullable
    public final Object invoke(@NotNull C9484e<Object> eVar, @Nullable C9378a<? super C9478s> aVar) {
        return ((SequencesKt__SequencesKt$shuffled$1) create(eVar, aVar)).invokeSuspend(C9478s.f17335a);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        C9484e eVar;
        List<Object> list;
        Object b = C9388b.m22940b();
        int i = this.label;
        if (i == 0) {
            C9400h.m22954b(obj);
            list = C9490j.m23104i(this.$this_shuffled);
            eVar = (C9484e) this.L$0;
        } else if (i == 1) {
            list = (List) this.L$1;
            eVar = (C9484e) this.L$0;
            C9400h.m22954b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (!list.isEmpty()) {
            int nextInt = this.$random.nextInt(list.size());
            Object l = C9372x.m22932l(list);
            if (nextInt < list.size()) {
                l = list.set(nextInt, l);
            }
            this.L$0 = eVar;
            this.L$1 = list;
            this.label = 1;
            if (eVar.mo38431a(l, this) == b) {
                return b;
            }
        }
        return C9478s.f17335a;
    }
}
