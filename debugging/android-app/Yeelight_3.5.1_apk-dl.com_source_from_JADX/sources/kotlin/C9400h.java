package kotlin;

import kotlin.Result;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.h */
public final class C9400h {
    @NotNull
    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: a */
    public static final Object m22953a(@NotNull Throwable th) {
        C9424q.m22996e(th, "exception");
        return new Result.Failure(th);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: b */
    public static final void m22954b(@NotNull Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
    }
}
