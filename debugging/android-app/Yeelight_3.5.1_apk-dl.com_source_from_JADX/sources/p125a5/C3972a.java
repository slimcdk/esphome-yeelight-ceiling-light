package p125a5;

import kotlin.collections.C9339f0;
import kotlin.jvm.internal.C9422o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p216u4.C10533c;

/* renamed from: a5.a */
public class C3972a implements Iterable<Integer> {
    @NotNull

    /* renamed from: d */
    public static final C3973a f6716d = new C3973a((C9422o) null);

    /* renamed from: a */
    private final int f6717a;

    /* renamed from: b */
    private final int f6718b;

    /* renamed from: c */
    private final int f6719c;

    /* renamed from: a5.a$a */
    public static final class C3973a {
        private C3973a() {
        }

        public /* synthetic */ C3973a(C9422o oVar) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final C3972a mo26531a(int i, int i2, int i3) {
            return new C3972a(i, i2, i3);
        }
    }

    public C3972a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f6717a = i;
            this.f6718b = C10533c.m26885b(i, i2, i3);
            this.f6719c = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* renamed from: b */
    public final int mo26522b() {
        return this.f6717a;
    }

    /* renamed from: e */
    public final int mo26523e() {
        return this.f6718b;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C3972a) {
            if (!isEmpty() || !((C3972a) obj).isEmpty()) {
                C3972a aVar = (C3972a) obj;
                if (!(this.f6717a == aVar.f6717a && this.f6718b == aVar.f6718b && this.f6719c == aVar.f6719c)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final int mo26525g() {
        return this.f6719c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f6717a * 31) + this.f6718b) * 31) + this.f6719c;
    }

    public boolean isEmpty() {
        if (this.f6719c > 0) {
            if (this.f6717a > this.f6718b) {
                return true;
            }
        } else if (this.f6717a < this.f6718b) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: j */
    public C9339f0 iterator() {
        return new C3974b(this.f6717a, this.f6718b, this.f6719c);
    }

    @NotNull
    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f6719c > 0) {
            sb = new StringBuilder();
            sb.append(this.f6717a);
            sb.append("..");
            sb.append(this.f6718b);
            sb.append(" step ");
            i = this.f6719c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f6717a);
            sb.append(" downTo ");
            sb.append(this.f6718b);
            sb.append(" step ");
            i = -this.f6719c;
        }
        sb.append(i);
        return sb.toString();
    }
}
