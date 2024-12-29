package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import kotlin.C9478s;
import kotlin.coroutines.C9378a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.C9484e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12064p;

@DebugMetadata(mo23966c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", mo23967f = "SlidingWindow.kt", mo23968i = {0, 0, 0, 2, 2, 3, 3}, mo23969l = {34, 40, 49, 55, 58}, mo23970m = "invokeSuspend", mo23971n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, mo23972s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
final class SlidingWindowKt$windowedIterator$1 extends RestrictedSuspendLambda implements C12064p<C9484e<? super List<Object>>, C9378a<? super C9478s>, Object> {
    final /* synthetic */ Iterator<Object> $iterator;
    final /* synthetic */ boolean $partialWindows;
    final /* synthetic */ boolean $reuseBuffer;
    final /* synthetic */ int $size;
    final /* synthetic */ int $step;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SlidingWindowKt$windowedIterator$1(int i, int i2, Iterator<Object> it, boolean z, boolean z2, C9378a<? super SlidingWindowKt$windowedIterator$1> aVar) {
        super(2, aVar);
        this.$size = i;
        this.$step = i2;
        this.$iterator = it;
        this.$reuseBuffer = z;
        this.$partialWindows = z2;
    }

    @NotNull
    public final C9378a<C9478s> create(@Nullable Object obj, @NotNull C9378a<?> aVar) {
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1 = new SlidingWindowKt$windowedIterator$1(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, aVar);
        slidingWindowKt$windowedIterator$1.L$0 = obj;
        return slidingWindowKt$windowedIterator$1;
    }

    @Nullable
    public final Object invoke(@NotNull C9484e<? super List<Object>> eVar, @Nullable C9378a<? super C9478s> aVar) {
        return ((SlidingWindowKt$windowedIterator$1) create(eVar, aVar)).invokeSuspend(C9478s.f17335a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0125 A[SYNTHETIC] */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C9388b.m22940b()
            int r1 = r12.label
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L_0x005a
            if (r1 == r6) goto L_0x0046
            if (r1 == r5) goto L_0x0041
            if (r1 == r4) goto L_0x002f
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            goto L_0x0041
        L_0x0019:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0021:
            java.lang.Object r1 = r12.L$1
            kotlin.collections.n0 r1 = (kotlin.collections.C9356n0) r1
            java.lang.Object r4 = r12.L$0
            kotlin.sequences.e r4 = (kotlin.sequences.C9484e) r4
            kotlin.C9400h.m22954b(r13)
            r13 = r12
            goto L_0x014d
        L_0x002f:
            java.lang.Object r1 = r12.L$2
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r5 = r12.L$1
            kotlin.collections.n0 r5 = (kotlin.collections.C9356n0) r5
            java.lang.Object r8 = r12.L$0
            kotlin.sequences.e r8 = (kotlin.sequences.C9484e) r8
            kotlin.C9400h.m22954b(r13)
            r13 = r12
            goto L_0x011f
        L_0x0041:
            kotlin.C9400h.m22954b(r13)
            goto L_0x0169
        L_0x0046:
            int r1 = r12.I$0
            java.lang.Object r2 = r12.L$2
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r3 = r12.L$1
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r4 = r12.L$0
            kotlin.sequences.e r4 = (kotlin.sequences.C9484e) r4
            kotlin.C9400h.m22954b(r13)
            r13 = r12
            r8 = r1
            goto L_0x00a8
        L_0x005a:
            kotlin.C9400h.m22954b(r13)
            java.lang.Object r13 = r12.L$0
            kotlin.sequences.e r13 = (kotlin.sequences.C9484e) r13
            int r1 = r12.$size
            r8 = 1024(0x400, float:1.435E-42)
            int r1 = p125a5.C3979f.m11482b(r1, r8)
            int r8 = r12.$step
            int r9 = r12.$size
            int r8 = r8 - r9
            if (r8 < 0) goto L_0x00dc
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r1 = 0
            java.util.Iterator<java.lang.Object> r3 = r12.$iterator
            r4 = r13
            r13 = r12
            r11 = r3
            r3 = r2
            r2 = r11
        L_0x007d:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x00ba
            java.lang.Object r9 = r2.next()
            if (r1 <= 0) goto L_0x008c
            int r1 = r1 + -1
            goto L_0x007d
        L_0x008c:
            r3.add(r9)
            int r9 = r3.size()
            int r10 = r13.$size
            if (r9 != r10) goto L_0x007d
            r13.L$0 = r4
            r13.L$1 = r3
            r13.L$2 = r2
            r13.I$0 = r8
            r13.label = r6
            java.lang.Object r1 = r4.mo38431a(r3, r13)
            if (r1 != r0) goto L_0x00a8
            return r0
        L_0x00a8:
            boolean r1 = r13.$reuseBuffer
            if (r1 == 0) goto L_0x00b0
            r3.clear()
            goto L_0x00b8
        L_0x00b0:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r13.$size
            r1.<init>(r3)
            r3 = r1
        L_0x00b8:
            r1 = r8
            goto L_0x007d
        L_0x00ba:
            boolean r1 = r3.isEmpty()
            r1 = r1 ^ r6
            if (r1 == 0) goto L_0x0169
            boolean r1 = r13.$partialWindows
            if (r1 != 0) goto L_0x00cd
            int r1 = r3.size()
            int r2 = r13.$size
            if (r1 != r2) goto L_0x0169
        L_0x00cd:
            r13.L$0 = r7
            r13.L$1 = r7
            r13.L$2 = r7
            r13.label = r5
            java.lang.Object r13 = r4.mo38431a(r3, r13)
            if (r13 != r0) goto L_0x0169
            return r0
        L_0x00dc:
            kotlin.collections.n0 r5 = new kotlin.collections.n0
            r5.<init>(r1)
            java.util.Iterator<java.lang.Object> r1 = r12.$iterator
            r8 = r13
            r13 = r12
        L_0x00e5:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x0125
            java.lang.Object r9 = r1.next()
            r5.mo38196l(r9)
            boolean r9 = r5.mo38198n()
            if (r9 == 0) goto L_0x00e5
            int r9 = r5.size()
            int r10 = r13.$size
            if (r9 >= r10) goto L_0x0105
            kotlin.collections.n0 r5 = r5.mo38197m(r10)
            goto L_0x00e5
        L_0x0105:
            boolean r9 = r13.$reuseBuffer
            if (r9 == 0) goto L_0x010b
            r9 = r5
            goto L_0x0110
        L_0x010b:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r5)
        L_0x0110:
            r13.L$0 = r8
            r13.L$1 = r5
            r13.L$2 = r1
            r13.label = r4
            java.lang.Object r9 = r8.mo38431a(r9, r13)
            if (r9 != r0) goto L_0x011f
            return r0
        L_0x011f:
            int r9 = r13.$step
            r5.mo38199o(r9)
            goto L_0x00e5
        L_0x0125:
            boolean r1 = r13.$partialWindows
            if (r1 == 0) goto L_0x0169
            r1 = r5
            r4 = r8
        L_0x012b:
            int r5 = r1.size()
            int r8 = r13.$step
            if (r5 <= r8) goto L_0x0153
            boolean r5 = r13.$reuseBuffer
            if (r5 == 0) goto L_0x0139
            r5 = r1
            goto L_0x013e
        L_0x0139:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r1)
        L_0x013e:
            r13.L$0 = r4
            r13.L$1 = r1
            r13.L$2 = r7
            r13.label = r3
            java.lang.Object r5 = r4.mo38431a(r5, r13)
            if (r5 != r0) goto L_0x014d
            return r0
        L_0x014d:
            int r5 = r13.$step
            r1.mo38199o(r5)
            goto L_0x012b
        L_0x0153:
            boolean r3 = r1.isEmpty()
            r3 = r3 ^ r6
            if (r3 == 0) goto L_0x0169
            r13.L$0 = r7
            r13.L$1 = r7
            r13.L$2 = r7
            r13.label = r2
            java.lang.Object r13 = r4.mo38431a(r1, r13)
            if (r13 != r0) goto L_0x0169
            return r0
        L_0x0169:
            kotlin.s r13 = kotlin.C9478s.f17335a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.SlidingWindowKt$windowedIterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
