package p164h.p165b.p166a.p240h.p252w;

import java.net.URI;
import java.net.URISyntaxException;

/* renamed from: h.b.a.h.w.f0 */
public class C11367f0 extends C11356a<URI> {
    /* renamed from: i */
    public URI mo36049f(String str) {
        if (str.equals("")) {
            return null;
        }
        try {
            return new URI(str);
        } catch (URISyntaxException e) {
            throw new C11391r(e.getMessage(), e);
        }
    }
}
