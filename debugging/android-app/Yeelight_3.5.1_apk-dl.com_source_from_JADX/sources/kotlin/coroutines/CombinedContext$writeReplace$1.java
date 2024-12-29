package kotlin.coroutines;

import kotlin.C9478s;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C9424q;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import org.jetbrains.annotations.NotNull;
import p233y4.C12064p;

final class CombinedContext$writeReplace$1 extends Lambda implements C12064p<C9478s, CoroutineContext.C9376a, C9478s> {
    final /* synthetic */ CoroutineContext[] $elements;
    final /* synthetic */ Ref$IntRef $index;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CombinedContext$writeReplace$1(CoroutineContext[] coroutineContextArr, Ref$IntRef ref$IntRef) {
        super(2);
        this.$elements = coroutineContextArr;
        this.$index = ref$IntRef;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C9478s) obj, (CoroutineContext.C9376a) obj2);
        return C9478s.f17335a;
    }

    public final void invoke(@NotNull C9478s sVar, @NotNull CoroutineContext.C9376a aVar) {
        C9424q.m22996e(sVar, "<anonymous parameter 0>");
        C9424q.m22996e(aVar, "element");
        CoroutineContext[] coroutineContextArr = this.$elements;
        Ref$IntRef ref$IntRef = this.$index;
        int i = ref$IntRef.element;
        ref$IntRef.element = i + 1;
        coroutineContextArr[i] = aVar;
    }
}
