package p164h.p165b.p166a.p240h.p243r.p247n;

import java.util.Locale;

/* renamed from: h.b.a.h.r.n.t */
public class C11313t extends C11296f0<String> {
    public C11313t() {
        mo35846e("upnp:rootdevice");
    }

    /* renamed from: a */
    public String mo35841a() {
        return (String) mo35845b();
    }

    /* renamed from: d */
    public void mo35842d(String str) {
        if (!str.toLowerCase(Locale.ROOT).equals(mo35845b())) {
            throw new C11304k("Invalid root device NT header value: " + str);
        }
    }
}
