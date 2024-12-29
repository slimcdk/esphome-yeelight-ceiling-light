package p164h.p165b.p166a.p240h.p243r.p247n;

import p164h.p165b.p166a.p240h.p252w.C11365e0;
import p164h.p165b.p166a.p240h.p252w.C11393t;
import p164h.p165b.p166a.p240h.p252w.C11397x;

/* renamed from: h.b.a.h.r.n.x */
public class C11317x extends C11296f0<C11393t> {
    public C11317x() {
    }

    public C11317x(C11365e0 e0Var, C11397x xVar) {
        mo35846e(new C11393t(e0Var, xVar));
    }

    /* renamed from: a */
    public String mo35841a() {
        return ((C11393t) mo35845b()).toString();
    }

    /* renamed from: d */
    public void mo35842d(String str) {
        try {
            mo35846e(C11393t.m29864c(str));
        } catch (Exception e) {
            throw new C11304k("Invalid service USN header value, " + e.getMessage());
        }
    }
}
