package org.fourthline.cling.model.message.header;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: org.fourthline.cling.model.message.header.l */
public class C10051l extends UpnpHeader<String> {

    /* renamed from: d */
    public static final Pattern f18543d = Pattern.compile("\"(.+?)\"(;.+?)??");

    /* renamed from: e */
    public static final Pattern f18544e = Pattern.compile(";\\s?ns\\s?=\\s?([0-9]{2})");

    /* renamed from: c */
    public String f18545c;

    public C10051l() {
    }

    public C10051l(String str) {
        mo40451e(str);
    }

    /* renamed from: a */
    public String mo40448a() {
        if (mo40449b() == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\"");
        sb.append((String) mo40449b());
        sb.append("\"");
        if (mo40458f() != null) {
            sb.append("; ns=");
            sb.append(mo40458f());
        }
        return sb.toString();
    }

    /* renamed from: d */
    public void mo40450d(String str) {
        Matcher matcher = f18543d.matcher(str);
        if (matcher.matches()) {
            mo40451e(matcher.group(1));
            if (matcher.group(2) != null) {
                Matcher matcher2 = f18544e.matcher(matcher.group(2));
                if (matcher2.matches()) {
                    mo40459g(matcher2.group(1));
                    return;
                }
                throw new InvalidHeaderException("Invalid namespace in MAN header value: " + str);
            }
            return;
        }
        throw new InvalidHeaderException("Invalid MAN header value: " + str);
    }

    /* renamed from: f */
    public String mo40458f() {
        return this.f18545c;
    }

    /* renamed from: g */
    public void mo40459g(String str) {
        this.f18545c = str;
    }
}
