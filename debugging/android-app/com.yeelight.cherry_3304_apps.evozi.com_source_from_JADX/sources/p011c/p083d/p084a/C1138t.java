package p011c.p083d.p084a;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: c.d.a.t */
public final class C1138t {

    /* renamed from: d */
    private static final Pattern f1820d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e */
    private static final Pattern f1821e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    private final String f1822a;

    /* renamed from: b */
    private final String f1823b;

    /* renamed from: c */
    private final String f1824c;

    private C1138t(String str, String str2, String str3, String str4) {
        this.f1822a = str;
        this.f1823b = str2;
        this.f1824c = str4;
    }

    /* renamed from: c */
    public static C1138t m2782c(String str) {
        Matcher matcher = f1820d.matcher(str);
        if (!matcher.lookingAt()) {
            return null;
        }
        String lowerCase = matcher.group(1).toLowerCase(Locale.US);
        String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
        Matcher matcher2 = f1821e.matcher(str);
        String str2 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            String group = matcher2.group(1);
            if (group != null && group.equalsIgnoreCase("charset")) {
                String group2 = matcher2.group(2) != null ? matcher2.group(2) : matcher2.group(3);
                if (str2 == null || group2.equalsIgnoreCase(str2)) {
                    str2 = group2;
                } else {
                    throw new IllegalArgumentException("Multiple different charsets: " + str);
                }
            }
        }
        return new C1138t(str, lowerCase, lowerCase2, str2);
    }

    /* renamed from: a */
    public Charset mo9787a() {
        String str = this.f1824c;
        if (str != null) {
            return Charset.forName(str);
        }
        return null;
    }

    /* renamed from: b */
    public Charset mo9788b(Charset charset) {
        String str = this.f1824c;
        return str != null ? Charset.forName(str) : charset;
    }

    /* renamed from: d */
    public String mo9789d() {
        return this.f1823b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1138t) && ((C1138t) obj).f1822a.equals(this.f1822a);
    }

    public int hashCode() {
        return this.f1822a.hashCode();
    }

    public String toString() {
        return this.f1822a;
    }
}
