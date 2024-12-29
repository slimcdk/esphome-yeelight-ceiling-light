package p164h.p165b.p166a.p240h.p252w;

/* renamed from: h.b.a.h.w.t */
public class C11393t {

    /* renamed from: a */
    private C11365e0 f22647a;

    /* renamed from: b */
    private C11397x f22648b;

    public C11393t(C11365e0 e0Var, C11397x xVar) {
        this.f22647a = e0Var;
        this.f22648b = xVar;
    }

    /* renamed from: c */
    public static C11393t m29864c(String str) {
        String[] split = str.split("::");
        if (split.length == 2) {
            try {
                return new C11393t(C11365e0.m29787b(split[0]), C11397x.m29873e(split[1]));
            } catch (Exception unused) {
                throw new C11391r("Can't parse UDN: " + split[0]);
            }
        } else {
            throw new C11391r("Can't parse UDN::ServiceType from: " + str);
        }
    }

    /* renamed from: a */
    public C11397x mo36125a() {
        return this.f22648b;
    }

    /* renamed from: b */
    public C11365e0 mo36126b() {
        return this.f22647a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C11393t)) {
            return false;
        }
        C11393t tVar = (C11393t) obj;
        return this.f22648b.equals(tVar.f22648b) && this.f22647a.equals(tVar.f22647a);
    }

    public int hashCode() {
        return (this.f22647a.hashCode() * 31) + this.f22648b.hashCode();
    }

    public String toString() {
        return mo36126b().toString() + "::" + mo36125a().toString();
    }
}
