package kotlin.sequences;

import kotlin.C9478s;
import kotlin.coroutines.C9378a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12064p;
import p233y4.C12065q;

@DebugMetadata(mo23966c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", mo23967f = "_Sequences.kt", mo23968i = {0, 1, 1, 1}, mo23969l = {2314, 2319}, mo23970m = "invokeSuspend", mo23971n = {"$this$sequence", "$this$sequence", "accumulator", "index"}, mo23972s = {"L$0", "L$0", "L$1", "I$0"})
final class SequencesKt___SequencesKt$runningFoldIndexed$1 extends RestrictedSuspendLambda implements C12064p<C9484e<Object>, C9378a<? super C9478s>, Object> {
    final /* synthetic */ Object $initial;
    final /* synthetic */ C12065q<Integer, Object, Object, Object> $operation;
    final /* synthetic */ C9482c<Object> $this_runningFoldIndexed;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SequencesKt___SequencesKt$runningFoldIndexed$1(Object obj, C9482c<Object> cVar, C12065q<? super Integer, Object, Object, Object> qVar, C9378a<? super SequencesKt___SequencesKt$runningFoldIndexed$1> aVar) {
        super(2, aVar);
        this.$initial = obj;
        this.$this_runningFoldIndexed = cVar;
        this.$operation = qVar;
    }

    @NotNull
    public final C9378a<C9478s> create(@Nullable Object obj, @NotNull C9378a<?> aVar) {
        SequencesKt___SequencesKt$runningFoldIndexed$1 sequencesKt___SequencesKt$runningFoldIndexed$1 = new SequencesKt___SequencesKt$runningFoldIndexed$1(this.$initial, this.$this_runningFoldIndexed, this.$operation, aVar);
        sequencesKt___SequencesKt$runningFoldIndexed$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningFoldIndexed$1;
    }

    @Nullable
    public final Object invoke(@NotNull C9484e<Object> eVar, @Nullable C9378a<? super C9478s> aVar) {
        return ((SequencesKt___SequencesKt$runningFoldIndexed$1) create(eVar, aVar)).invokeSuspend(C9478s.f17335a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: kotlin.sequences.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0058  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C9388b.m22940b()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 == r3) goto L_0x0028
            if (r1 != r2) goto L_0x0020
            int r1 = r9.I$0
            java.lang.Object r3 = r9.L$2
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r4 = r9.L$1
            java.lang.Object r5 = r9.L$0
            kotlin.sequences.e r5 = (kotlin.sequences.C9484e) r5
            kotlin.C9400h.m22954b(r10)
            r10 = r1
            r1 = r4
            goto L_0x0051
        L_0x0020:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0028:
            java.lang.Object r1 = r9.L$0
            kotlin.sequences.e r1 = (kotlin.sequences.C9484e) r1
            kotlin.C9400h.m22954b(r10)
            goto L_0x0045
        L_0x0030:
            kotlin.C9400h.m22954b(r10)
            java.lang.Object r10 = r9.L$0
            r1 = r10
            kotlin.sequences.e r1 = (kotlin.sequences.C9484e) r1
            java.lang.Object r10 = r9.$initial
            r9.L$0 = r1
            r9.label = r3
            java.lang.Object r10 = r1.mo38431a(r10, r9)
            if (r10 != r0) goto L_0x0045
            return r0
        L_0x0045:
            r10 = 0
            java.lang.Object r3 = r9.$initial
            kotlin.sequences.c<java.lang.Object> r4 = r9.$this_runningFoldIndexed
            java.util.Iterator r4 = r4.iterator()
            r5 = r1
            r1 = r3
            r3 = r4
        L_0x0051:
            r4 = r9
        L_0x0052:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0081
            java.lang.Object r6 = r3.next()
            y4.q<java.lang.Integer, java.lang.Object, java.lang.Object, java.lang.Object> r7 = r4.$operation
            int r8 = r10 + 1
            if (r10 >= 0) goto L_0x0065
            kotlin.collections.C9366s.m22928i()
        L_0x0065:
            java.lang.Integer r10 = kotlin.coroutines.jvm.internal.C9389a.m22941a(r10)
            java.lang.Object r10 = r7.invoke(r10, r1, r6)
            r4.L$0 = r5
            r4.L$1 = r10
            r4.L$2 = r3
            r4.I$0 = r8
            r4.label = r2
            java.lang.Object r1 = r5.mo38431a(r10, r4)
            if (r1 != r0) goto L_0x007e
            return r0
        L_0x007e:
            r1 = r10
            r10 = r8
            goto L_0x0052
        L_0x0081:
            kotlin.s r10 = kotlin.C9478s.f17335a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
