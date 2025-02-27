package kotlin.text;

import kotlin.C9478s;
import kotlin.coroutines.C9378a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.C9484e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12064p;

@DebugMetadata(mo23966c = "kotlin.text.Regex$splitToSequence$1", mo23967f = "Regex.kt", mo23968i = {1, 1, 1}, mo23969l = {276, 284, 288}, mo23970m = "invokeSuspend", mo23971n = {"$this$sequence", "matcher", "splitCount"}, mo23972s = {"L$0", "L$1", "I$0"})
final class Regex$splitToSequence$1 extends RestrictedSuspendLambda implements C12064p<C9484e<? super String>, C9378a<? super C9478s>, Object> {
    final /* synthetic */ CharSequence $input;
    final /* synthetic */ int $limit;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Regex this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Regex$splitToSequence$1(Regex regex, CharSequence charSequence, int i, C9378a<? super Regex$splitToSequence$1> aVar) {
        super(2, aVar);
        this.this$0 = regex;
        this.$input = charSequence;
        this.$limit = i;
    }

    @NotNull
    public final C9378a<C9478s> create(@Nullable Object obj, @NotNull C9378a<?> aVar) {
        Regex$splitToSequence$1 regex$splitToSequence$1 = new Regex$splitToSequence$1(this.this$0, this.$input, this.$limit, aVar);
        regex$splitToSequence$1.L$0 = obj;
        return regex$splitToSequence$1;
    }

    @Nullable
    public final Object invoke(@NotNull C9484e<? super String> eVar, @Nullable C9378a<? super C9478s> aVar) {
        return ((Regex$splitToSequence$1) create(eVar, aVar)).invokeSuspend(C9478s.f17335a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x009e A[RETURN] */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C9388b.m22940b()
            int r1 = r10.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 == r5) goto L_0x0030
            if (r1 == r4) goto L_0x001f
            if (r1 != r3) goto L_0x0017
            kotlin.C9400h.m22954b(r11)
            goto L_0x009f
        L_0x0017:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x001f:
            int r1 = r10.I$0
            java.lang.Object r2 = r10.L$1
            java.util.regex.Matcher r2 = (java.util.regex.Matcher) r2
            java.lang.Object r6 = r10.L$0
            kotlin.sequences.e r6 = (kotlin.sequences.C9484e) r6
            kotlin.C9400h.m22954b(r11)
            r7 = r10
            r11 = r1
            r1 = r2
            goto L_0x0073
        L_0x0030:
            kotlin.C9400h.m22954b(r11)
            goto L_0x00b1
        L_0x0035:
            kotlin.C9400h.m22954b(r11)
            java.lang.Object r11 = r10.L$0
            kotlin.sequences.e r11 = (kotlin.sequences.C9484e) r11
            kotlin.text.Regex r1 = r10.this$0
            java.util.regex.Pattern r1 = r1.nativePattern
            java.lang.CharSequence r6 = r10.$input
            java.util.regex.Matcher r1 = r1.matcher(r6)
            int r6 = r10.$limit
            if (r6 == r5) goto L_0x00a2
            boolean r6 = r1.find()
            if (r6 != 0) goto L_0x0053
            goto L_0x00a2
        L_0x0053:
            r7 = r10
            r6 = r11
            r11 = 0
        L_0x0056:
            java.lang.CharSequence r8 = r7.$input
            int r9 = r1.start()
            java.lang.CharSequence r2 = r8.subSequence(r2, r9)
            java.lang.String r2 = r2.toString()
            r7.L$0 = r6
            r7.L$1 = r1
            r7.I$0 = r11
            r7.label = r4
            java.lang.Object r2 = r6.mo38431a(r2, r7)
            if (r2 != r0) goto L_0x0073
            return r0
        L_0x0073:
            int r2 = r1.end()
            int r11 = r11 + r5
            int r8 = r7.$limit
            int r8 = r8 - r5
            if (r11 == r8) goto L_0x0083
            boolean r8 = r1.find()
            if (r8 != 0) goto L_0x0056
        L_0x0083:
            java.lang.CharSequence r11 = r7.$input
            int r1 = r11.length()
            java.lang.CharSequence r11 = r11.subSequence(r2, r1)
            java.lang.String r11 = r11.toString()
            r1 = 0
            r7.L$0 = r1
            r7.L$1 = r1
            r7.label = r3
            java.lang.Object r11 = r6.mo38431a(r11, r7)
            if (r11 != r0) goto L_0x009f
            return r0
        L_0x009f:
            kotlin.s r11 = kotlin.C9478s.f17335a
            return r11
        L_0x00a2:
            java.lang.CharSequence r1 = r10.$input
            java.lang.String r1 = r1.toString()
            r10.label = r5
            java.lang.Object r11 = r11.mo38431a(r1, r10)
            if (r11 != r0) goto L_0x00b1
            return r0
        L_0x00b1:
            kotlin.s r11 = kotlin.C9478s.f17335a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex$splitToSequence$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
