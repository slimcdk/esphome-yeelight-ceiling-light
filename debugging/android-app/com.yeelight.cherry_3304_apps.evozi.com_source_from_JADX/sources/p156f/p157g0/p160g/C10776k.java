package p156f.p157g0.p160g;

import java.net.ProtocolException;
import p156f.C10835y;

/* renamed from: f.g0.g.k */
public final class C10776k {

    /* renamed from: a */
    public final C10835y f20691a;

    /* renamed from: b */
    public final int f20692b;

    /* renamed from: c */
    public final String f20693c;

    public C10776k(C10835y yVar, int i, String str) {
        this.f20691a = yVar;
        this.f20692b = i;
        this.f20693c = str;
    }

    /* renamed from: a */
    public static C10776k m26729a(String str) {
        C10835y yVar;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                yVar = C10835y.HTTP_1_0;
            } else if (charAt == 1) {
                yVar = C10835y.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else if (str.startsWith("ICY ")) {
            yVar = C10835y.HTTP_1_0;
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
                return new C10776k(yVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20691a == C10835y.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f20692b);
        if (this.f20693c != null) {
            sb.append(' ');
            sb.append(this.f20693c);
        }
        return sb.toString();
    }
}
