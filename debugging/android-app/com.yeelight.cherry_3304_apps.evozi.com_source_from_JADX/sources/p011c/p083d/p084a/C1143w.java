package p011c.p083d.p084a;

import java.io.IOException;

/* renamed from: c.d.a.w */
public enum C1143w {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    

    /* renamed from: a */
    private final String f1871a;

    private C1143w(String str) {
        this.f1871a = str;
    }

    /* renamed from: a */
    public static C1143w m2844a(String str) {
        C1143w wVar = SPDY_3;
        C1143w wVar2 = HTTP_2;
        C1143w wVar3 = HTTP_1_1;
        C1143w wVar4 = HTTP_1_0;
        if (str.equals(wVar4.f1871a)) {
            return wVar4;
        }
        if (str.equals(wVar3.f1871a)) {
            return wVar3;
        }
        if (str.equals(wVar2.f1871a)) {
            return wVar2;
        }
        if (str.equals(wVar.f1871a)) {
            return wVar;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    public String toString() {
        return this.f1871a;
    }
}
