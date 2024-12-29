package okhttp3;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* renamed from: okhttp3.v */
public final class C3548v {

    /* renamed from: d */
    private static final Pattern f5823d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e */
    private static final Pattern f5824e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    private final String f5825a;

    /* renamed from: b */
    private final String f5826b;
    @Nullable

    /* renamed from: c */
    private final String f5827c;

    private C3548v(String str, String str2, String str3, @Nullable String str4) {
        this.f5825a = str;
        this.f5826b = str2;
        this.f5827c = str4;
    }

    /* renamed from: c */
    public static C3548v m9871c(String str) {
        Matcher matcher = f5823d.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            Locale locale = Locale.US;
            String lowerCase = group.toLowerCase(locale);
            String lowerCase2 = matcher.group(2).toLowerCase(locale);
            String str2 = null;
            Matcher matcher2 = f5824e.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group2 = matcher2.group(1);
                    if (group2 != null && group2.equalsIgnoreCase("charset")) {
                        String group3 = matcher2.group(2);
                        if (group3 == null) {
                            group3 = matcher2.group(3);
                        } else if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                            group3 = group3.substring(1, group3.length() - 1);
                        }
                        if (str2 == null || group3.equalsIgnoreCase(str2)) {
                            str2 = group3;
                        } else {
                            throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group3 + "\" for: \"" + str + '\"');
                        }
                    }
                    end = matcher2.end();
                } else {
                    throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"');
                }
            }
            return new C3548v(str, lowerCase, lowerCase2, str2);
        }
        throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
    }

    @Nullable
    /* renamed from: d */
    public static C3548v m9872d(String str) {
        try {
            return m9871c(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public Charset mo24593a() {
        return mo24594b((Charset) null);
    }

    @Nullable
    /* renamed from: b */
    public Charset mo24594b(@Nullable Charset charset) {
        try {
            String str = this.f5827c;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    /* renamed from: e */
    public String mo24595e() {
        return this.f5826b;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof C3548v) && ((C3548v) obj).f5825a.equals(this.f5825a);
    }

    public int hashCode() {
        return this.f5825a.hashCode();
    }

    public String toString() {
        return this.f5825a;
    }
}
