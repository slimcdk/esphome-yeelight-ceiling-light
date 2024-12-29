package p011c.p012a.p019b.p020a.p021i.p024u.p025j;

import p011c.p012a.p019b.p020a.p021i.C0481h;
import p011c.p012a.p019b.p020a.p021i.C0487l;

/* renamed from: c.a.b.a.i.u.j.b */
final class C0513b extends C0533i {

    /* renamed from: a */
    private final long f152a;

    /* renamed from: b */
    private final C0487l f153b;

    /* renamed from: c */
    private final C0481h f154c;

    C0513b(long j, C0487l lVar, C0481h hVar) {
        this.f152a = j;
        if (lVar != null) {
            this.f153b = lVar;
            if (hVar != null) {
                this.f154c = hVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    /* renamed from: b */
    public C0481h mo8499b() {
        return this.f154c;
    }

    /* renamed from: c */
    public long mo8500c() {
        return this.f152a;
    }

    /* renamed from: d */
    public C0487l mo8501d() {
        return this.f153b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0533i)) {
            return false;
        }
        C0533i iVar = (C0533i) obj;
        return this.f152a == iVar.mo8500c() && this.f153b.equals(iVar.mo8501d()) && this.f154c.equals(iVar.mo8499b());
    }

    public int hashCode() {
        long j = this.f152a;
        return this.f154c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f153b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f152a + ", transportContext=" + this.f153b + ", event=" + this.f154c + "}";
    }
}
