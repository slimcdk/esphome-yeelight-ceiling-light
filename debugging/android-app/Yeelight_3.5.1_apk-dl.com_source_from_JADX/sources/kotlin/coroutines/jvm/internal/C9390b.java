package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.C9378a;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.coroutines.jvm.internal.b */
public final class C9390b implements C9378a<Object> {
    @NotNull

    /* renamed from: a */
    public static final C9390b f17273a = new C9390b();

    private C9390b() {
    }

    @NotNull
    public CoroutineContext getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public void resumeWith(@NotNull Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @NotNull
    public String toString() {
        return "This continuation is already complete";
    }
}
