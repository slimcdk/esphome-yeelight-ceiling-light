package p164h.p165b.p166a.p240h.p243r.p247n;

import com.xiaomi.mipush.sdk.Constants;
import p164h.p257c.p259b.p260f.C11509b;

/* renamed from: h.b.a.h.r.n.j */
public class C11303j extends C11296f0<byte[]> {
    public C11303j() {
    }

    public C11303j(byte[] bArr) {
        mo35846e(bArr);
    }

    /* renamed from: a */
    public String mo35841a() {
        return C11509b.m30220b((byte[]) mo35845b(), Constants.COLON_SEPARATOR);
    }

    /* renamed from: d */
    public void mo35842d(String str) {
        byte[] g = C11509b.m30225g(str, Constants.COLON_SEPARATOR);
        mo35846e(g);
        if (g.length != 6) {
            throw new C11304k("Invalid MAC address: " + str);
        }
    }

    public String toString() {
        return "(" + C11303j.class.getSimpleName() + ") '" + mo35841a() + "'";
    }
}
