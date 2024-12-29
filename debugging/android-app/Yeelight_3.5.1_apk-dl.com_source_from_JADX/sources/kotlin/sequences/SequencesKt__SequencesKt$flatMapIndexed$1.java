package kotlin.sequences;

import java.util.Iterator;
import kotlin.C9400h;
import kotlin.C9478s;
import kotlin.coroutines.C9378a;
import kotlin.coroutines.jvm.internal.C9389a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12060l;
import p233y4.C12064p;

@DebugMetadata(mo23966c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", mo23967f = "Sequences.kt", mo23968i = {0, 0}, mo23969l = {332}, mo23970m = "invokeSuspend", mo23971n = {"$this$sequence", "index"}, mo23972s = {"L$0", "I$0"})
final class SequencesKt__SequencesKt$flatMapIndexed$1 extends RestrictedSuspendLambda implements C12064p<C9484e<Object>, C9378a<? super C9478s>, Object> {
    final /* synthetic */ C12060l<Object, Iterator<Object>> $iterator;
    final /* synthetic */ C9482c<Object> $source;
    final /* synthetic */ C12064p<Integer, Object, Object> $transform;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SequencesKt__SequencesKt$flatMapIndexed$1(C9482c<Object> cVar, C12064p<? super Integer, Object, Object> pVar, C12060l<Object, ? extends Iterator<Object>> lVar, C9378a<? super SequencesKt__SequencesKt$flatMapIndexed$1> aVar) {
        super(2, aVar);
        this.$source = cVar;
        this.$transform = pVar;
        this.$iterator = lVar;
    }

    @NotNull
    public final C9378a<C9478s> create(@Nullable Object obj, @NotNull C9378a<?> aVar) {
        SequencesKt__SequencesKt$flatMapIndexed$1 sequencesKt__SequencesKt$flatMapIndexed$1 = new SequencesKt__SequencesKt$flatMapIndexed$1(this.$source, this.$transform, this.$iterator, aVar);
        sequencesKt__SequencesKt$flatMapIndexed$1.L$0 = obj;
        return sequencesKt__SequencesKt$flatMapIndexed$1;
    }

    @Nullable
    public final Object invoke(@NotNull C9484e<Object> eVar, @Nullable C9378a<? super C9478s> aVar) {
        return ((SequencesKt__SequencesKt$flatMapIndexed$1) create(eVar, aVar)).invokeSuspend(C9478s.f17335a);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        C9484e eVar;
        Iterator<Object> it;
        int i;
        Object b = C9388b.m22940b();
        int i2 = this.label;
        if (i2 == 0) {
            C9400h.m22954b(obj);
            i = 0;
            it = this.$source.iterator();
            eVar = (C9484e) this.L$0;
        } else if (i2 == 1) {
            i = this.I$0;
            it = (Iterator) this.L$1;
            eVar = (C9484e) this.L$0;
            C9400h.m22954b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (it.hasNext()) {
            Object next = it.next();
            C12064p<Integer, Object, Object> pVar = this.$transform;
            int i3 = i + 1;
            if (i < 0) {
                C9366s.m22928i();
            }
            Object invoke = pVar.invoke(C9389a.m22941a(i), next);
            this.L$0 = eVar;
            this.L$1 = it;
            this.I$0 = i3;
            this.label = 1;
            if (eVar.mo38432b(this.$iterator.invoke(invoke), this) == b) {
                return b;
            }
            i = i3;
        }
        return C9478s.f17335a;
    }
}
