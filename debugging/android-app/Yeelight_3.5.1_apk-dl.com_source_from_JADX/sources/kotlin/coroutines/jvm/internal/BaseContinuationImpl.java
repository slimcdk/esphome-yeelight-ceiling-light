package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.C9400h;
import kotlin.C9478s;
import kotlin.Result;
import kotlin.SinceKotlin;
import kotlin.coroutines.C9378a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
public abstract class BaseContinuationImpl implements C9378a<Object>, C9391c, Serializable {
    @Nullable
    private final C9378a<Object> completion;

    public BaseContinuationImpl(@Nullable C9378a<Object> aVar) {
        this.completion = aVar;
    }

    @NotNull
    public C9378a<C9478s> create(@Nullable Object obj, @NotNull C9378a<?> aVar) {
        C9424q.m22996e(aVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @NotNull
    public C9378a<C9478s> create(@NotNull C9378a<?> aVar) {
        C9424q.m22996e(aVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Nullable
    public C9391c getCallerFrame() {
        C9378a<Object> aVar = this.completion;
        if (aVar instanceof C9391c) {
            return (C9391c) aVar;
        }
        return null;
    }

    @Nullable
    public final C9378a<Object> getCompletion() {
        return this.completion;
    }

    @NotNull
    public abstract /* synthetic */ CoroutineContext getContext();

    @Nullable
    public StackTraceElement getStackTraceElement() {
        return C9392d.m22945d(this);
    }

    /* access modifiers changed from: protected */
    @Nullable
    public abstract Object invokeSuspend(@NotNull Object obj);

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
    }

    public final void resumeWith(@NotNull Object obj) {
        C9378a aVar = this;
        while (true) {
            C9393e.m22947b(aVar);
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) aVar;
            C9378a aVar2 = baseContinuationImpl.completion;
            C9424q.m22993b(aVar2);
            try {
                Object invokeSuspend = baseContinuationImpl.invokeSuspend(obj);
                if (invokeSuspend != C9388b.m22940b()) {
                    Result.C9301a aVar3 = Result.Companion;
                    obj = Result.m32001constructorimpl(invokeSuspend);
                    baseContinuationImpl.releaseIntercepted();
                    if (aVar2 instanceof BaseContinuationImpl) {
                        aVar = aVar2;
                    } else {
                        aVar2.resumeWith(obj);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                Result.C9301a aVar4 = Result.Companion;
                obj = Result.m32001constructorimpl(C9400h.m22953a(th));
            }
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }
}
