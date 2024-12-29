package p164h.p165b.p166a.p240h.p252w;

/* renamed from: h.b.a.h.w.s */
public class C11392s {

    /* renamed from: a */
    private C11365e0 f22645a;

    /* renamed from: b */
    private C11381l f22646b;

    public C11392s(C11365e0 e0Var, C11381l lVar) {
        this.f22645a = e0Var;
        this.f22646b = lVar;
    }

    /* renamed from: c */
    public static C11392s m29861c(String str) {
        String[] split = str.split("::");
        if (split.length == 2) {
            try {
                return new C11392s(C11365e0.m29787b(split[0]), C11381l.m29829e(split[1]));
            } catch (Exception unused) {
                throw new C11391r("Can't parse UDN: " + split[0]);
            }
        } else {
            throw new C11391r("Can't parse UDN::DeviceType from: " + str);
        }
    }

    /* renamed from: a */
    public C11381l mo36120a() {
        return this.f22646b;
    }

    /* renamed from: b */
    public C11365e0 mo36121b() {
        return this.f22645a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C11392s)) {
            return false;
        }
        C11392s sVar = (C11392s) obj;
        return this.f22646b.equals(sVar.f22646b) && this.f22645a.equals(sVar.f22645a);
    }

    public int hashCode() {
        return (this.f22645a.hashCode() * 31) + this.f22646b.hashCode();
    }

    public String toString() {
        return mo36121b().toString() + "::" + mo36120a().toString();
    }
}
