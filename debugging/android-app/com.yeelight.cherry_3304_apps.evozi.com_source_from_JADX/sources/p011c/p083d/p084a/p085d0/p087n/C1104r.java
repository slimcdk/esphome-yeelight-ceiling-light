package p011c.p083d.p084a.p085d0.p087n;

import java.net.ProtocolException;
import p011c.p083d.p084a.C1143w;

/* renamed from: c.d.a.d0.n.r */
public final class C1104r {

    /* renamed from: a */
    public final C1143w f1632a;

    /* renamed from: b */
    public final int f1633b;

    /* renamed from: c */
    public final String f1634c;

    public C1104r(C1143w wVar, int i, String str) {
        this.f1632a = wVar;
        this.f1633b = i;
        this.f1634c = str;
    }

    /* renamed from: a */
    public static C1104r m2567a(String str) {
        C1143w wVar;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                wVar = C1143w.HTTP_1_0;
            } else if (charAt == 1) {
                wVar = C1143w.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else if (str.startsWith("ICY ")) {
            wVar = C1143w.HTTP_1_0;
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (str.length() <= i2) {
                    str2 = "";
                } else if (str.charAt(i2) == ' ') {
                    str2 = str.substring(i + 4);
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                return new C1104r(wVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1632a == C1143w.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f1633b);
        if (this.f1634c != null) {
            sb.append(' ');
            sb.append(this.f1634c);
        }
        return sb.toString();
    }
}
