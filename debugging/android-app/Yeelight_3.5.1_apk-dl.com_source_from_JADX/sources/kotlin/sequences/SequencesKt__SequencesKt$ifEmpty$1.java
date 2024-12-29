package kotlin.sequences;

import java.util.Iterator;
import kotlin.C9400h;
import kotlin.C9478s;
import kotlin.coroutines.C9378a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12049a;
import p233y4.C12064p;

@DebugMetadata(mo23966c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", mo23967f = "Sequences.kt", mo23968i = {}, mo23969l = {69, 71}, mo23970m = "invokeSuspend", mo23971n = {}, mo23972s = {})
final class SequencesKt__SequencesKt$ifEmpty$1 extends RestrictedSuspendLambda implements C12064p<C9484e<Object>, C9378a<? super C9478s>, Object> {
    final /* synthetic */ C12049a<C9482c<Object>> $defaultValue;
    final /* synthetic */ C9482c<Object> $this_ifEmpty;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SequencesKt__SequencesKt$ifEmpty$1(C9482c<Object> cVar, C12049a<? extends C9482c<Object>> aVar, C9378a<? super SequencesKt__SequencesKt$ifEmpty$1> aVar2) {
        super(2, aVar2);
        this.$this_ifEmpty = cVar;
        this.$defaultValue = aVar;
    }

    @NotNull
    public final C9378a<C9478s> create(@Nullable Object obj, @NotNull C9378a<?> aVar) {
        SequencesKt__SequencesKt$ifEmpty$1 sequencesKt__SequencesKt$ifEmpty$1 = new SequencesKt__SequencesKt$ifEmpty$1(this.$this_ifEmpty, this.$defaultValue, aVar);
        sequencesKt__SequencesKt$ifEmpty$1.L$0 = obj;
        return sequencesKt__SequencesKt$ifEmpty$1;
    }

    @Nullable
    public final Object invoke(@NotNull C9484e<Object> eVar, @Nullable C9378a<? super C9478s> aVar) {
        return ((SequencesKt__SequencesKt$ifEmpty$1) create(eVar, aVar)).invokeSuspend(C9478s.f17335a);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object b = C9388b.m22940b();
        int i = this.label;
        if (i == 0) {
            C9400h.m22954b(obj);
            C9484e eVar = (C9484e) this.L$0;
            Iterator<Object> it = this.$this_ifEmpty.iterator();
            if (it.hasNext()) {
                this.label = 1;
                if (eVar.mo38432b(it, this) == b) {
                    return b;
                }
            } else {
                this.label = 2;
                if (eVar.mo38437c(this.$defaultValue.invoke(), this) == b) {
                    return b;
                }
            }
        } else if (i == 1 || i == 2) {
            C9400h.m22954b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C9478s.f17335a;
    }
}
