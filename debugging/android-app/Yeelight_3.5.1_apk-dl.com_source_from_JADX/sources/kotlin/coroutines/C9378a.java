package kotlin.coroutines;

import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(version = "1.3")
/* renamed from: kotlin.coroutines.a */
public interface C9378a<T> {
    @NotNull
    CoroutineContext getContext();

    void resumeWith(@NotNull Object obj);
}
