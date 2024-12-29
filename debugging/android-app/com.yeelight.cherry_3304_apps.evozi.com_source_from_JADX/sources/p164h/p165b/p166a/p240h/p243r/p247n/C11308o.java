package p164h.p165b.p166a.p240h.p243r.p247n;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: h.b.a.h.r.n.o */
public class C11308o extends C11296f0<Integer> {

    /* renamed from: c */
    public static final Pattern f22437c = Pattern.compile(".*max-age\\s*=\\s*([0-9]+).*");

    public C11308o() {
        mo35846e(1800);
    }

    public C11308o(Integer num) {
        mo35846e(num);
    }

    /* renamed from: a */
    public String mo35841a() {
        return "max-age=" + ((Integer) mo35845b()).toString();
    }

    /* renamed from: d */
    public void mo35842d(String str) {
        Matcher matcher = f22437c.matcher(str.toLowerCase(Locale.ROOT));
        if (matcher.matches()) {
            mo35846e(Integer.valueOf(Integer.parseInt(matcher.group(1))));
            return;
        }
        throw new C11304k("Invalid cache-control value, can't parse max-age seconds: " + str);
    }
}
