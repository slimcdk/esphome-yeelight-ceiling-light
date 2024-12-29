package kotlin.sequences;

import kotlin.C9478s;
import kotlin.coroutines.C9378a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12064p;

@DebugMetadata(mo23966c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", mo23967f = "_Sequences.kt", mo23968i = {0, 1, 1}, mo23969l = {2286, 2290}, mo23970m = "invokeSuspend", mo23971n = {"$this$sequence", "$this$sequence", "accumulator"}, mo23972s = {"L$0", "L$0", "L$1"})
final class SequencesKt___SequencesKt$runningFold$1 extends RestrictedSuspendLambda implements C12064p<C9484e<Object>, C9378a<? super C9478s>, Object> {
    final /* synthetic */ Object $initial;
    final /* synthetic */ C12064p<Object, Object, Object> $operation;
    final /* synthetic */ C9482c<Object> $this_runningFold;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SequencesKt___SequencesKt$runningFold$1(Object obj, C9482c<Object> cVar, C12064p<Object, Object, Object> pVar, C9378a<? super SequencesKt___SequencesKt$runningFold$1> aVar) {
        super(2, aVar);
        this.$initial = obj;
        this.$this_runningFold = cVar;
        this.$operation = pVar;
    }

    @NotNull
    public final C9378a<C9478s> create(@Nullable Object obj, @NotNull C9378a<?> aVar) {
        SequencesKt___SequencesKt$runningFold$1 sequencesKt___SequencesKt$runningFold$1 = new SequencesKt___SequencesKt$runningFold$1(this.$initial, this.$this_runningFold, this.$operation, aVar);
        sequencesKt___SequencesKt$runningFold$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningFold$1;
    }

    @Nullable
    public final Object invoke(@NotNull C9484e<Object> eVar, @Nullable C9378a<? super C9478s> aVar) {
        return ((SequencesKt___SequencesKt$runningFold$1) create(eVar, aVar)).invokeSuspend(C9478s.f17335a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: kotlin.sequences.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0053  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C9388b.m22940b()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 == r3) goto L_0x0025
            if (r1 != r2) goto L_0x001d
            java.lang.Object r1 = r7.L$2
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r7.L$1
            java.lang.Object r4 = r7.L$0
            kotlin.sequences.e r4 = (kotlin.sequences.C9484e) r4
            kotlin.C9400h.m22954b(r8)
            r8 = r3
            goto L_0x004c
        L_0x001d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0025:
            java.lang.Object r1 = r7.L$0
            kotlin.sequences.e r1 = (kotlin.sequences.C9484e) r1
            kotlin.C9400h.m22954b(r8)
            goto L_0x0042
        L_0x002d:
            kotlin.C9400h.m22954b(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            kotlin.sequences.e r1 = (kotlin.sequences.C9484e) r1
            java.lang.Object r8 = r7.$initial
            r7.L$0 = r1
            r7.label = r3
            java.lang.Object r8 = r1.mo38431a(r8, r7)
            if (r8 != r0) goto L_0x0042
            return r0
        L_0x0042:
            java.lang.Object r8 = r7.$initial
            kotlin.sequences.c<java.lang.Object> r3 = r7.$this_runningFold
            java.util.Iterator r3 = r3.iterator()
            r4 = r1
            r1 = r3
        L_0x004c:
            r3 = r7
        L_0x004d:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x006c
            java.lang.Object r5 = r1.next()
            y4.p<java.lang.Object, java.lang.Object, java.lang.Object> r6 = r3.$operation
            java.lang.Object r8 = r6.invoke(r8, r5)
            r3.L$0 = r4
            r3.L$1 = r8
            r3.L$2 = r1
            r3.label = r2
            java.lang.Object r5 = r4.mo38431a(r8, r3)
            if (r5 != r0) goto L_0x004d
            return r0
        L_0x006c:
            kotlin.s r8 = kotlin.C9478s.f17335a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningFold$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
