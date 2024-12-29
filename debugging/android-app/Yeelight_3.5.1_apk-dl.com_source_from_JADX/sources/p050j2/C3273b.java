package p050j2;

/* renamed from: j2.b */
public class C3273b {

    /* renamed from: a */
    private final int f5268a;

    /* renamed from: b */
    private final int f5269b;

    public C3273b(int i, int i2) {
        this.f5268a = i;
        this.f5269b = i2;
    }

    /* renamed from: a */
    public final int mo23843a() {
        return this.f5269b;
    }

    /* renamed from: b */
    public final int mo23844b() {
        return this.f5268a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3273b)) {
            return false;
        }
        C3273b bVar = (C3273b) obj;
        return this.f5268a == bVar.f5268a && this.f5269b == bVar.f5269b;
    }

    public final int hashCode() {
        return this.f5268a ^ this.f5269b;
    }

    public final String toString() {
        return this.f5268a + "(" + this.f5269b + ')';
    }
}
