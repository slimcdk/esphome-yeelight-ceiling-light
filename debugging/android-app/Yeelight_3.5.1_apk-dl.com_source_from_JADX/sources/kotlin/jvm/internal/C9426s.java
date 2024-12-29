package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.1")
/* renamed from: kotlin.jvm.internal.s */
public final class C9426s implements C9418l {
    @NotNull

    /* renamed from: a */
    private final Class<?> f17310a;

    public C9426s(@NotNull Class<?> cls, @NotNull String str) {
        C9424q.m22996e(cls, "jClass");
        C9424q.m22996e(str, "moduleName");
        this.f17310a = cls;
    }

    @NotNull
    /* renamed from: a */
    public Class<?> mo38325a() {
        return this.f17310a;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof C9426s) && C9424q.m22992a(mo38325a(), ((C9426s) obj).mo38325a());
    }

    public int hashCode() {
        return mo38325a().hashCode();
    }

    @NotNull
    public String toString() {
        return mo38325a().toString() + " (Kotlin reflection is not available)";
    }
}
