package kotlin.coroutines.intrinsics;

import kotlin.C9400h;
import kotlin.coroutines.C9378a;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.internal.C9424q;
import kotlin.jvm.internal.C9429v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12060l;

/* renamed from: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1 */
public final class C9381xa50de660 extends RestrictedContinuationImpl {
    final /* synthetic */ C12060l $this_createCoroutineUnintercepted$inlined;
    private int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9381xa50de660(C9378a aVar, C12060l lVar) {
        super(aVar);
        this.$this_createCoroutineUnintercepted$inlined = lVar;
        C9424q.m22994c(aVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    /* access modifiers changed from: protected */
    @Nullable
    public Object invokeSuspend(@NotNull Object obj) {
        int i = this.label;
        if (i == 0) {
            this.label = 1;
            C9400h.m22954b(obj);
            C9424q.m22994c(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-0>, kotlin.Any?>");
            return ((C12060l) C9429v.m23034a(this.$this_createCoroutineUnintercepted$inlined, 1)).invoke(this);
        } else if (i == 1) {
            this.label = 2;
            C9400h.m22954b(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
