package kotlin.coroutines.intrinsics;

import kotlin.C9400h;
import kotlin.coroutines.C9378a;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12060l;

/* renamed from: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1 */
public final class C9385x96e8297a extends RestrictedContinuationImpl {
    final /* synthetic */ C12060l<C9378a<Object>, Object> $block;
    private int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9385x96e8297a(C9378a<Object> aVar, C12060l<? super C9378a<Object>, ? extends Object> lVar) {
        super(aVar);
        this.$block = lVar;
        C9424q.m22994c(aVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    /* access modifiers changed from: protected */
    @Nullable
    public Object invokeSuspend(@NotNull Object obj) {
        int i = this.label;
        if (i == 0) {
            this.label = 1;
            C9400h.m22954b(obj);
            return this.$block.invoke(this);
        } else if (i == 1) {
            this.label = 2;
            C9400h.m22954b(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}