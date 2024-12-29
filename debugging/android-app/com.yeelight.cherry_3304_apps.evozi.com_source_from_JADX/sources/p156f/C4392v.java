package p156f;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* renamed from: f.v */
public final class C4392v {

    /* renamed from: d */
    private static final Pattern f7850d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e */
    private static final Pattern f7851e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    private final String f7852a;

    /* renamed from: b */
    private final String f7853b;
    @Nullable

    /* renamed from: c */
    private final String f7854c;

    private C4392v(String str, String str2, String str3, @Nullable String str4) {
        this.f7852a = str;
        this.f7853b = str2;
        this.f7854c = str4;
    }

    /* renamed from: c */
    public static C4392v m12670c(String str) {
        Matcher matcher = f7850d.matcher(str);
        if (matcher.lookingAt()) {
            String lowerCase = matcher.group(1).toLowerCase(Locale.US);
            String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
            String str2 = null;
            Matcher matcher2 = f7851e.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group = matcher2.group(1);
                    if (group != null && group.equalsIgnoreCase("charset")) {
                        String group2 = matcher2.group(2);
                        if (group2 == null) {
                            group2 = matcher2.group(3);
                        } else if (group2.startsWith("'") && group2.endsWith("'") && group2.length() > 2) {
                            group2 = group2.substring(1, group2.length() - 1);
                        }
                        if (str2 == null || group2.equalsIgnoreCase(str2)) {
                            str2 = group2;
                        } else {
                            throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group2 + "\" for: \"" + str + '\"');
                        }
                    }
                    end = matcher2.end();
                } else {
                    throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"');
                }
            }
            return new C4392v(str, lowerCase, lowerCase2, str2);
        }
        throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
    }

    @Nullable
    /* renamed from: d */
    public static C4392v m12671d(String str) {
        try {
            return m12670c(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public Charset mo24134a() {
        return mo24135b((Charset) null);
    }

    @Nullable
    /* renamed from: b */
    public Charset mo24135b(@Nullable Charset charset) {
        try {
            return this.f7854c != null ? Charset.forName(this.f7854c) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    /* renamed from: e */
    public String mo24136e() {
        return this.f7853b;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof C4392v) && ((C4392v) obj).f7852a.equals(this.f7852a);
    }

    public int hashCode() {
        return this.f7852a.hashCode();
    }

    public String toString() {
        return this.f7852a;
    }
}
