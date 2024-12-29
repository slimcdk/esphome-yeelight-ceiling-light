package p164h.p165b.p166a.p240h.p243r.p247n;

import p164h.p165b.p166a.p240h.p252w.C11399z;

/* renamed from: h.b.a.h.r.n.y */
public class C11318y extends C11296f0<C11399z> {
    public C11318y() {
    }

    public C11318y(C11399z zVar) {
        mo35846e(zVar);
    }

    /* renamed from: a */
    public String mo35841a() {
        return "\"" + ((C11399z) mo35845b()).toString() + "\"";
    }

    /* renamed from: d */
    public void mo35842d(String str) {
        try {
            if (!str.startsWith("\"")) {
                if (str.endsWith("\"")) {
                    throw new C11304k("Invalid SOAP action header, must be enclosed in doublequotes:" + str);
                }
            }
            mo35846e(C11399z.m29881g(str.substring(1, str.length() - 1)));
        } catch (RuntimeException e) {
            throw new C11304k("Invalid SOAP action header value, " + e.getMessage());
        }
    }
}
