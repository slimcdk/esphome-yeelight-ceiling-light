package p011c.p083d.p084a;

import p011c.p083d.p084a.p085d0.C1024k;

/* renamed from: c.d.a.h */
public final class C1118h {

    /* renamed from: a */
    private final String f1660a;

    /* renamed from: b */
    private final String f1661b;

    public C1118h(String str, String str2) {
        this.f1660a = str;
        this.f1661b = str2;
    }

    /* renamed from: a */
    public String mo9684a() {
        return this.f1661b;
    }

    /* renamed from: b */
    public String mo9685b() {
        return this.f1660a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1118h) {
            C1118h hVar = (C1118h) obj;
            return C1024k.m2095f(this.f1660a, hVar.f1660a) && C1024k.m2095f(this.f1661b, hVar.f1661b);
        }
    }

    public int hashCode() {
        String str = this.f1661b;
        int i = 0;
        int hashCode = (899 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1660a;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return this.f1660a + " realm=\"" + this.f1661b + "\"";
    }
}
