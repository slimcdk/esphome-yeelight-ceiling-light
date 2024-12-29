package p164h.p165b.p166a.p240h.p243r.p247n;

import p164h.p165b.p166a.p240h.p252w.C11365e0;

/* renamed from: h.b.a.h.r.n.d0 */
public class C11292d0 extends C11296f0<C11365e0> {
    public C11292d0() {
    }

    public C11292d0(C11365e0 e0Var) {
        mo35846e(e0Var);
    }

    /* renamed from: a */
    public String mo35841a() {
        return ((C11365e0) mo35845b()).toString();
    }

    /* renamed from: d */
    public void mo35842d(String str) {
        if (!str.startsWith("uuid:")) {
            throw new C11304k("Invalid UDA header value, must start with 'uuid:': " + str);
        } else if (!str.contains("::urn")) {
            mo35846e(new C11365e0(str.substring(5)));
        } else {
            throw new C11304k("Invalid UDA header value, must not contain '::urn': " + str);
        }
    }
}
