package kotlin.coroutines;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12064p;

@SinceKotlin(version = "1.3")
public interface CoroutineContext {

    public static final class DefaultImpls {
        @NotNull
        /* renamed from: a */
        public static CoroutineContext m22934a(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext coroutineContext2) {
            C9424q.m22996e(coroutineContext2, "context");
            return coroutineContext2 == EmptyCoroutineContext.INSTANCE ? coroutineContext : (CoroutineContext) coroutineContext2.fold(coroutineContext, CoroutineContext$plus$1.INSTANCE);
        }
    }

    /* renamed from: kotlin.coroutines.CoroutineContext$a */
    public interface C9376a extends CoroutineContext {
        @Nullable
        <E extends C9376a> E get(@NotNull C9377b<E> bVar);

        @NotNull
        C9377b<?> getKey();
    }

    /* renamed from: kotlin.coroutines.CoroutineContext$b */
    public interface C9377b<E extends C9376a> {
    }

    <R> R fold(R r, @NotNull C12064p<? super R, ? super C9376a, ? extends R> pVar);

    @Nullable
    <E extends C9376a> E get(@NotNull C9377b<E> bVar);

    @NotNull
    CoroutineContext minusKey(@NotNull C9377b<?> bVar);

    @NotNull
    CoroutineContext plus(@NotNull CoroutineContext coroutineContext);
}
