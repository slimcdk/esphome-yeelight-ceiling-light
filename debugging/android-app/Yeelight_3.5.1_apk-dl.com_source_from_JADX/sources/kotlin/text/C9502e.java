package kotlin.text;

import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p125a5.C3975c;

/* renamed from: kotlin.text.e */
public final class C9502e {
    @NotNull

    /* renamed from: a */
    private final String f17354a;
    @NotNull

    /* renamed from: b */
    private final C3975c f17355b;

    public C9502e(@NotNull String str, @NotNull C3975c cVar) {
        C9424q.m22996e(str, "value");
        C9424q.m22996e(cVar, "range");
        this.f17354a = str;
        this.f17355b = cVar;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9502e)) {
            return false;
        }
        C9502e eVar = (C9502e) obj;
        return C9424q.m22992a(this.f17354a, eVar.f17354a) && C9424q.m22992a(this.f17355b, eVar.f17355b);
    }

    public int hashCode() {
        return (this.f17354a.hashCode() * 31) + this.f17355b.hashCode();
    }

    @NotNull
    public String toString() {
        return "MatchGroup(value=" + this.f17354a + ", range=" + this.f17355b + ')';
    }
}
