package p164h.p165b.p166a.p240h.p243r.p247n;

import p164h.p165b.p166a.p240h.p252w.C11365e0;

/* renamed from: h.b.a.h.r.n.e0 */
public class C11294e0 extends C11296f0<C11365e0> {
    public C11294e0() {
    }

    public C11294e0(C11365e0 e0Var) {
        mo35846e(e0Var);
    }

    /* renamed from: a */
    public String mo35841a() {
        return ((C11365e0) mo35845b()).toString() + "::upnp:rootdevice";
    }

    /* renamed from: d */
    public void mo35842d(String str) {
        if (!str.startsWith("uuid:") || !str.endsWith("::upnp:rootdevice")) {
            throw new C11304k("Invalid root device USN header value, must start with 'uuid:' and end with '::upnp:rootdevice' but is '" + str + "'");
        }
        mo35846e(new C11365e0(str.substring(5, str.length() - 17)));
    }
}
