package p164h.p165b.p166a.p240h.p243r.p247n;

/* renamed from: h.b.a.h.r.n.z */
public class C11319z extends C11296f0<String> {
    public C11319z() {
    }

    public C11319z(String str) {
        mo35846e(str);
    }

    /* renamed from: a */
    public String mo35841a() {
        return (String) mo35845b();
    }

    /* renamed from: d */
    public void mo35842d(String str) {
        if (str.startsWith("uuid:")) {
            mo35846e(str);
            return;
        }
        throw new C11304k("Invalid subscription ID header value, must start with 'uuid:': " + str);
    }
}
