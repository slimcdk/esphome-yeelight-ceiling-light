package org.fourthline.cling.model.types;

/* renamed from: org.fourthline.cling.model.types.p */
public class C10095p {

    /* renamed from: a */
    private C10105z f18621a;

    /* renamed from: b */
    private C10098s f18622b;

    public C10095p(C10105z zVar, C10098s sVar) {
        this.f18621a = zVar;
        this.f18622b = sVar;
    }

    /* renamed from: c */
    public static C10095p m25157c(String str) {
        String[] split = str.split("::");
        if (split.length == 2) {
            try {
                return new C10095p(C10105z.m25185b(split[0]), C10098s.m25165e(split[1]));
            } catch (Exception unused) {
                throw new InvalidValueException("Can't parse UDN: " + split[0]);
            }
        } else {
            throw new InvalidValueException("Can't parse UDN::ServiceType from: " + str);
        }
    }

    /* renamed from: a */
    public C10098s mo40632a() {
        return this.f18622b;
    }

    /* renamed from: b */
    public C10105z mo40633b() {
        return this.f18621a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C10095p)) {
            return false;
        }
        C10095p pVar = (C10095p) obj;
        return this.f18622b.equals(pVar.f18622b) && this.f18621a.equals(pVar.f18621a);
    }

    public int hashCode() {
        return (this.f18621a.hashCode() * 31) + this.f18622b.hashCode();
    }

    public String toString() {
        return mo40633b().toString() + "::" + mo40632a().toString();
    }
}
