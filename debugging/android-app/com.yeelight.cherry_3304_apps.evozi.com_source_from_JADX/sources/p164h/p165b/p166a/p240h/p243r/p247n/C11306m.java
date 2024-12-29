package p164h.p165b.p166a.p240h.p243r.p247n;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: h.b.a.h.r.n.m */
public class C11306m extends C11296f0<String> {

    /* renamed from: d */
    public static final Pattern f22433d = Pattern.compile("\"(.+?)\"(;.+?)??");

    /* renamed from: e */
    public static final Pattern f22434e = Pattern.compile(";\\s?ns\\s?=\\s?([0-9]{2})");

    /* renamed from: c */
    public String f22435c;

    public C11306m() {
    }

    public C11306m(String str) {
        mo35846e(str);
    }

    /* renamed from: a */
    public String mo35841a() {
        if (mo35845b() == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\"");
        sb.append((String) mo35845b());
        sb.append("\"");
        if (mo35851f() != null) {
            sb.append("; ns=");
            sb.append(mo35851f());
        }
        return sb.toString();
    }

    /* renamed from: d */
    public void mo35842d(String str) {
        Matcher matcher = f22433d.matcher(str);
        if (matcher.matches()) {
            mo35846e(matcher.group(1));
            if (matcher.group(2) != null) {
                Matcher matcher2 = f22434e.matcher(matcher.group(2));
                if (matcher2.matches()) {
                    mo35852g(matcher2.group(1));
                    return;
                }
                throw new C11304k("Invalid namespace in MAN header value: " + str);
            }
            return;
        }
        throw new C11304k("Invalid MAN header value: " + str);
    }

    /* renamed from: f */
    public String mo35851f() {
        return this.f22435c;
    }

    /* renamed from: g */
    public void mo35852g(String str) {
        this.f22435c = str;
    }
}
