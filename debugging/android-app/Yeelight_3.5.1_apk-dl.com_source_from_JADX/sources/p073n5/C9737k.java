package p073n5;

import java.net.ProtocolException;
import okhttp3.Protocol;

/* renamed from: n5.k */
public final class C9737k {

    /* renamed from: a */
    public final Protocol f17565a;

    /* renamed from: b */
    public final int f17566b;

    /* renamed from: c */
    public final String f17567c;

    public C9737k(Protocol protocol, int i, String str) {
        this.f17565a = protocol;
        this.f17566b = i;
        this.f17567c = str;
    }

    /* renamed from: a */
    public static C9737k m23399a(String str) {
        Protocol protocol;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                protocol = Protocol.HTTP_1_0;
            } else if (charAt == 1) {
                protocol = Protocol.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else if (str.startsWith("ICY ")) {
            protocol = Protocol.HTTP_1_0;
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
                return new C9737k(protocol, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17565a == Protocol.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f17566b);
        if (this.f17567c != null) {
            sb.append(' ');
            sb.append(this.f17567c);
        }
        return sb.toString();
    }
}
