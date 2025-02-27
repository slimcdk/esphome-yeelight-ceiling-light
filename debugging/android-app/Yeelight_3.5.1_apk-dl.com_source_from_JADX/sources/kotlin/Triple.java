package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Triple<A, B, C> implements Serializable {
    private final A first;
    private final B second;
    private final C third;

    public Triple(A a, B b, C c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }

    public static /* synthetic */ Triple copy$default(Triple triple, A a, B b, C c, int i, Object obj) {
        if ((i & 1) != 0) {
            a = triple.first;
        }
        if ((i & 2) != 0) {
            b = triple.second;
        }
        if ((i & 4) != 0) {
            c = triple.third;
        }
        return triple.copy(a, b, c);
    }

    public final A component1() {
        return this.first;
    }

    public final B component2() {
        return this.second;
    }

    public final C component3() {
        return this.third;
    }

    @NotNull
    public final Triple<A, B, C> copy(A a, B b, C c) {
        return new Triple<>(a, b, c);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        return C9424q.m22992a(this.first, triple.first) && C9424q.m22992a(this.second, triple.second) && C9424q.m22992a(this.third, triple.third);
    }

    public final A getFirst() {
        return this.first;
    }

    public final B getSecond() {
        return this.second;
    }

    public final C getThird() {
        return this.third;
    }

    public int hashCode() {
        A a = this.first;
        int i = 0;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.second;
        int hashCode2 = (hashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.third;
        if (c != null) {
            i = c.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public String toString() {
        return '(' + this.first + ", " + this.second + ", " + this.third + ')';
    }
}
