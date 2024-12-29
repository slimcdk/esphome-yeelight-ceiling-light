package p164h.p165b.p166a.p240h.p243r.p247n;

import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: h.b.a.h.r.n.l */
public class C11305l extends C11296f0<URL> {
    public C11305l() {
    }

    public C11305l(URL url) {
        mo35846e(url);
    }

    /* renamed from: a */
    public String mo35841a() {
        return ((URL) mo35845b()).toString();
    }

    /* renamed from: d */
    public void mo35842d(String str) {
        try {
            mo35846e(new URL(str));
        } catch (MalformedURLException e) {
            throw new C11304k("Invalid URI: " + e.getMessage());
        }
    }
}
