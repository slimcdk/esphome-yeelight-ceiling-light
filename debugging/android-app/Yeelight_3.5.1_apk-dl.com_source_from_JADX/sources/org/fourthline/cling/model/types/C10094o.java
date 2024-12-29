package org.fourthline.cling.model.types;

/* renamed from: org.fourthline.cling.model.types.o */
public class C10094o {

    /* renamed from: a */
    private C10105z f18619a;

    /* renamed from: b */
    private C10089j f18620b;

    public C10094o(C10105z zVar, C10089j jVar) {
        this.f18619a = zVar;
        this.f18620b = jVar;
    }

    /* renamed from: c */
    public static C10094o m25154c(String str) {
        String[] split = str.split("::");
        if (split.length == 2) {
            try {
                return new C10094o(C10105z.m25185b(split[0]), C10089j.m25135e(split[1]));
            } catch (Exception unused) {
                throw new InvalidValueException("Can't parse UDN: " + split[0]);
            }
        } else {
            throw new InvalidValueException("Can't parse UDN::DeviceType from: " + str);
        }
    }

    /* renamed from: a */
    public C10089j mo40627a() {
        return this.f18620b;
    }

    /* renamed from: b */
    public C10105z mo40628b() {
        return this.f18619a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C10094o)) {
            return false;
        }
        C10094o oVar = (C10094o) obj;
        return this.f18620b.equals(oVar.f18620b) && this.f18619a.equals(oVar.f18619a);
    }

    public int hashCode() {
        return (this.f18619a.hashCode() * 31) + this.f18620b.hashCode();
    }

    public String toString() {
        return mo40628b().toString() + "::" + mo40627a().toString();
    }
}
