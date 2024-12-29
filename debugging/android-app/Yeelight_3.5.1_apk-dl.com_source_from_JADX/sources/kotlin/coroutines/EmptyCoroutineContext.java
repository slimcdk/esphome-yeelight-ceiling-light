package kotlin.coroutines;

import java.io.Serializable;
import kotlin.SinceKotlin;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12064p;

@SinceKotlin(version = "1.3")
public final class EmptyCoroutineContext implements CoroutineContext, Serializable {
    @NotNull
    public static final EmptyCoroutineContext INSTANCE = new EmptyCoroutineContext();
    private static final long serialVersionUID = 0;

    private EmptyCoroutineContext() {
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    public <R> R fold(R r, @NotNull C12064p<? super R, ? super CoroutineContext.C9376a, ? extends R> pVar) {
        C9424q.m22996e(pVar, "operation");
        return r;
    }

    @Nullable
    public <E extends CoroutineContext.C9376a> E get(@NotNull CoroutineContext.C9377b<E> bVar) {
        C9424q.m22996e(bVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.C9377b<?> bVar) {
        C9424q.m22996e(bVar, "key");
        return this;
    }

    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        C9424q.m22996e(coroutineContext, "context");
        return coroutineContext;
    }

    @NotNull
    public String toString() {
        return "EmptyCoroutineContext";
    }
}
