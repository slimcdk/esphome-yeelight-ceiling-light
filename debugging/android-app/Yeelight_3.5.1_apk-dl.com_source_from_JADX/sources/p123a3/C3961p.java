package p123a3;

import com.squareup.okhttp.Protocol;
import java.net.ProtocolException;

/* renamed from: a3.p */
public final class C3961p {

    /* renamed from: a */
    public final Protocol f6687a;

    /* renamed from: b */
    public final int f6688b;

    /* renamed from: c */
    public final String f6689c;

    public C3961p(Protocol protocol, int i, String str) {
        this.f6687a = protocol;
        this.f6688b = i;
        this.f6689c = str;
    }

    /* renamed from: a */
    public static C3961p m11421a(String str) {
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
                return new C3961p(protocol, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6687a == Protocol.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f6688b);
        if (this.f6689c != null) {
            sb.append(' ');
            sb.append(this.f6689c);
        }
        return sb.toString();
    }
}
