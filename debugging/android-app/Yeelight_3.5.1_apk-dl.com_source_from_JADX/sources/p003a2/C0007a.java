package p003a2;

import java.util.Objects;

/* renamed from: a2.a */
public final class C0007a {

    /* renamed from: a */
    private final int f1a;

    /* renamed from: b */
    private final int f2b;

    /* renamed from: c */
    private final int f3c;

    public C0007a(int i, int i2, int i3) {
        this.f1a = i;
        this.f2b = i2;
        this.f3c = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0007a)) {
            return false;
        }
        C0007a aVar = (C0007a) obj;
        return this.f1a == aVar.f1a && this.f2b == aVar.f2b && this.f3c == aVar.f3c;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f1a), Integer.valueOf(this.f2b), Integer.valueOf(this.f3c)});
    }

    public final String toString() {
        return String.format("%d.%d.%d", new Object[]{Integer.valueOf(this.f1a), Integer.valueOf(this.f2b), Integer.valueOf(this.f3c)});
    }
}
