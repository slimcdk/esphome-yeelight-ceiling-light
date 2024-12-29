package p164h.p165b.p166a.p240h.p243r.p247n;

import p164h.p165b.p166a.p240h.p252w.C11394u;

/* renamed from: h.b.a.h.r.n.q */
public class C11310q extends C11296f0<C11394u> {
    public C11310q() {
    }

    public C11310q(C11394u uVar) {
        mo35846e(uVar);
    }

    /* renamed from: a */
    public String mo35841a() {
        return ((C11394u) mo35845b()).mo36130a();
    }

    /* renamed from: d */
    public void mo35842d(String str) {
        C11394u[] values = C11394u.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            C11394u uVar = values[i];
            if (str.equals(uVar.mo36130a())) {
                mo35846e(uVar);
                break;
            }
            i++;
        }
        if (mo35845b() == null) {
            throw new C11304k("Invalid NTS header value: " + str);
        }
    }
}
