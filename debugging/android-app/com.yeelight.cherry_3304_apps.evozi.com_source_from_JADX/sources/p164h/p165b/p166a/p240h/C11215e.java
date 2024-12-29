package p164h.p165b.p166a.p240h;

import java.net.InetAddress;
import java.net.URL;

/* renamed from: h.b.a.h.e */
public class C11215e {

    /* renamed from: a */
    protected final C11218h f22291a;

    /* renamed from: b */
    protected final String f22292b;

    /* renamed from: c */
    protected final URL f22293c;

    public C11215e(C11218h hVar, String str) {
        this.f22291a = hVar;
        this.f22292b = str;
        this.f22293c = m29261a(hVar.mo35663a(), hVar.mo35665c(), str);
    }

    /* renamed from: a */
    private static URL m29261a(InetAddress inetAddress, int i, String str) {
        try {
            return new URL("http", inetAddress.getHostAddress(), i, str);
        } catch (Exception e) {
            throw new IllegalArgumentException("Address, port, and URI can not be converted to URL", e);
        }
    }

    /* renamed from: b */
    public C11218h mo35642b() {
        return this.f22291a;
    }

    /* renamed from: c */
    public URL mo35643c() {
        return this.f22293c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11215e.class != obj.getClass()) {
            return false;
        }
        C11215e eVar = (C11215e) obj;
        return this.f22291a.equals(eVar.f22291a) && this.f22292b.equals(eVar.f22292b);
    }

    public int hashCode() {
        return (this.f22291a.hashCode() * 31) + this.f22292b.hashCode();
    }
}
