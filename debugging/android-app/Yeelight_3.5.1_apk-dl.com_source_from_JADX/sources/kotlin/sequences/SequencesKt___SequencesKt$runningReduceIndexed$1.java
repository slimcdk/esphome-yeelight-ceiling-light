package kotlin.sequences;

import kotlin.C9478s;
import kotlin.coroutines.C9378a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12064p;
import p233y4.C12065q;

@DebugMetadata(mo23966c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1", mo23967f = "_Sequences.kt", mo23968i = {0, 0, 0, 1, 1, 1, 1}, mo23969l = {2373, 2377}, mo23970m = "invokeSuspend", mo23971n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator", "index"}, mo23972s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0"})
final class SequencesKt___SequencesKt$runningReduceIndexed$1 extends RestrictedSuspendLambda implements C12064p<C9484e<Object>, C9378a<? super C9478s>, Object> {
    final /* synthetic */ C12065q<Integer, Object, Object, Object> $operation;
    final /* synthetic */ C9482c<Object> $this_runningReduceIndexed;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SequencesKt___SequencesKt$runningReduceIndexed$1(C9482c<Object> cVar, C12065q<? super Integer, Object, Object, Object> qVar, C9378a<? super SequencesKt___SequencesKt$runningReduceIndexed$1> aVar) {
        super(2, aVar);
        this.$this_runningReduceIndexed = cVar;
        this.$operation = qVar;
    }

    @NotNull
    public final C9378a<C9478s> create(@Nullable Object obj, @NotNull C9378a<?> aVar) {
        SequencesKt___SequencesKt$runningReduceIndexed$1 sequencesKt___SequencesKt$runningReduceIndexed$1 = new SequencesKt___SequencesKt$runningReduceIndexed$1(this.$this_runningReduceIndexed, this.$operation, aVar);
        sequencesKt___SequencesKt$runningReduceIndexed$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningReduceIndexed$1;
    }

    @Nullable
    public final Object invoke(@NotNull C9484e<Object> eVar, @Nullable C9378a<? super C9478s> aVar) {
        return ((SequencesKt___SequencesKt$runningReduceIndexed$1) create(eVar, aVar)).invokeSuspend(C9478s.f17335a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: kotlin.sequences.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0066  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C9388b.m22940b()
            int r1 = r10.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0038
            if (r1 == r3) goto L_0x002a
            if (r1 != r2) goto L_0x0022
            int r1 = r10.I$0
            java.lang.Object r3 = r10.L$2
            java.lang.Object r4 = r10.L$1
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r10.L$0
            kotlin.sequences.e r5 = (kotlin.sequences.C9484e) r5
            kotlin.C9400h.m22954b(r11)
            r11 = r10
            r9 = r3
            r3 = r1
            r1 = r9
            goto L_0x0060
        L_0x0022:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x002a:
            java.lang.Object r1 = r10.L$2
            java.lang.Object r4 = r10.L$1
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r10.L$0
            kotlin.sequences.e r5 = (kotlin.sequences.C9484e) r5
            kotlin.C9400h.m22954b(r11)
            goto L_0x005f
        L_0x0038:
            kotlin.C9400h.m22954b(r11)
            java.lang.Object r11 = r10.L$0
            r5 = r11
            kotlin.sequences.e r5 = (kotlin.sequences.C9484e) r5
            kotlin.sequences.c<java.lang.Object> r11 = r10.$this_runningReduceIndexed
            java.util.Iterator r4 = r11.iterator()
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x008f
            java.lang.Object r1 = r4.next()
            r10.L$0 = r5
            r10.L$1 = r4
            r10.L$2 = r1
            r10.label = r3
            java.lang.Object r11 = r5.mo38431a(r1, r10)
            if (r11 != r0) goto L_0x005f
            return r0
        L_0x005f:
            r11 = r10
        L_0x0060:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x008f
            y4.q<java.lang.Integer, java.lang.Object, java.lang.Object, java.lang.Object> r6 = r11.$operation
            int r7 = r3 + 1
            if (r3 >= 0) goto L_0x006f
            kotlin.collections.C9366s.m22928i()
        L_0x006f:
            java.lang.Integer r3 = kotlin.coroutines.jvm.internal.C9389a.m22941a(r3)
            java.lang.Object r8 = r4.next()
            java.lang.Object r3 = r6.invoke(r3, r1, r8)
            r11.L$0 = r5
            r11.L$1 = r4
            r11.L$2 = r3
            r11.I$0 = r7
            r11.label = r2
            java.lang.Object r1 = r5.mo38431a(r3, r11)
            if (r1 != r0) goto L_0x008c
            return r0
        L_0x008c:
            r1 = r3
            r3 = r7
            goto L_0x0060
        L_0x008f:
            kotlin.s r11 = kotlin.C9478s.f17335a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
