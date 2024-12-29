package p011c.p012a.p053e.p065w.p066r;

/* renamed from: c.a.e.w.r.b */
public class C0895b {

    /* renamed from: a */
    private final int f965a;

    /* renamed from: b */
    private final int f966b;

    public C0895b(int i, int i2) {
        this.f965a = i;
        this.f966b = i2;
    }

    /* renamed from: a */
    public final int mo9165a() {
        return this.f966b;
    }

    /* renamed from: b */
    public final int mo9166b() {
        return this.f965a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0895b)) {
            return false;
        }
        C0895b bVar = (C0895b) obj;
        return this.f965a == bVar.f965a && this.f966b == bVar.f966b;
    }

    public final int hashCode() {
        return this.f965a ^ this.f966b;
    }

    public final String toString() {
        return this.f965a + "(" + this.f966b + ')';
    }
}
