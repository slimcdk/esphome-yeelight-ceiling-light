package kotlin.collections;

import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.collections.e0 */
public final class C9337e0<T> {

    /* renamed from: a */
    private final int f17260a;

    /* renamed from: b */
    private final T f17261b;

    /* renamed from: a */
    public final int mo38181a() {
        return this.f17260a;
    }

    /* renamed from: b */
    public final T mo38182b() {
        return this.f17261b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9337e0)) {
            return false;
        }
        C9337e0 e0Var = (C9337e0) obj;
        return this.f17260a == e0Var.f17260a && C9424q.m22992a(this.f17261b, e0Var.f17261b);
    }

    public int hashCode() {
        int i = this.f17260a * 31;
        T t = this.f17261b;
        return i + (t == null ? 0 : t.hashCode());
    }

    @NotNull
    public String toString() {
        return "IndexedValue(index=" + this.f17260a + ", value=" + this.f17261b + ')';
    }
}
