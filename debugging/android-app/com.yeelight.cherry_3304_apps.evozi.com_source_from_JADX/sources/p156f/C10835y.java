package p156f;

import java.io.IOException;

/* renamed from: f.y */
public enum C10835y {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: a */
    private final String f20899a;

    private C10835y(String str) {
        this.f20899a = str;
    }

    /* renamed from: a */
    public static C10835y m26973a(String str) {
        C10835y yVar = QUIC;
        C10835y yVar2 = SPDY_3;
        C10835y yVar3 = HTTP_2;
        C10835y yVar4 = H2_PRIOR_KNOWLEDGE;
        C10835y yVar5 = HTTP_1_1;
        C10835y yVar6 = HTTP_1_0;
        if (str.equals(yVar6.f20899a)) {
            return yVar6;
        }
        if (str.equals(yVar5.f20899a)) {
            return yVar5;
        }
        if (str.equals(yVar4.f20899a)) {
            return yVar4;
        }
        if (str.equals(yVar3.f20899a)) {
            return yVar3;
        }
        if (str.equals(yVar2.f20899a)) {
            return yVar2;
        }
        if (str.equals(yVar.f20899a)) {
            return yVar;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    public String toString() {
        return this.f20899a;
    }
}
