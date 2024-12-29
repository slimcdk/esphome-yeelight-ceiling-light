package p075o;

import java.util.Objects;
import p035g.C3188i;
import p035g.C3198o;

/* renamed from: o.b */
final class C3386b extends C3399k {

    /* renamed from: a */
    private final long f5511a;

    /* renamed from: b */
    private final C3198o f5512b;

    /* renamed from: c */
    private final C3188i f5513c;

    C3386b(long j, C3198o oVar, C3188i iVar) {
        this.f5511a = j;
        Objects.requireNonNull(oVar, "Null transportContext");
        this.f5512b = oVar;
        Objects.requireNonNull(iVar, "Null event");
        this.f5513c = iVar;
    }

    /* renamed from: b */
    public C3188i mo24172b() {
        return this.f5513c;
    }

    /* renamed from: c */
    public long mo24173c() {
        return this.f5511a;
    }

    /* renamed from: d */
    public C3198o mo24174d() {
        return this.f5512b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3399k)) {
            return false;
        }
        C3399k kVar = (C3399k) obj;
        return this.f5511a == kVar.mo24173c() && this.f5512b.equals(kVar.mo24174d()) && this.f5513c.equals(kVar.mo24172b());
    }

    public int hashCode() {
        long j = this.f5511a;
        return this.f5513c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f5512b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f5511a + ", transportContext=" + this.f5512b + ", event=" + this.f5513c + "}";
    }
}
