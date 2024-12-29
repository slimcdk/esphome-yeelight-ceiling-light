package kotlin.coroutines;

import kotlin.coroutines.C9379b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C9424q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12064p;

final class CoroutineContext$plus$1 extends Lambda implements C12064p<CoroutineContext, CoroutineContext.C9376a, CoroutineContext> {
    public static final CoroutineContext$plus$1 INSTANCE = new CoroutineContext$plus$1();

    CoroutineContext$plus$1() {
        super(2);
    }

    @NotNull
    public final CoroutineContext invoke(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext.C9376a aVar) {
        CombinedContext combinedContext;
        C9424q.m22996e(coroutineContext, "acc");
        C9424q.m22996e(aVar, "element");
        CoroutineContext minusKey = coroutineContext.minusKey(aVar.getKey());
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        if (minusKey == emptyCoroutineContext) {
            return aVar;
        }
        C9379b.C9380a aVar2 = C9379b.f17271L;
        C9379b bVar = (C9379b) minusKey.get(aVar2);
        if (bVar == null) {
            combinedContext = new CombinedContext(minusKey, aVar);
        } else {
            CoroutineContext minusKey2 = minusKey.minusKey(aVar2);
            if (minusKey2 == emptyCoroutineContext) {
                return new CombinedContext(aVar, bVar);
            }
            combinedContext = new CombinedContext(new CombinedContext(minusKey2, aVar), bVar);
        }
        return combinedContext;
    }
}
