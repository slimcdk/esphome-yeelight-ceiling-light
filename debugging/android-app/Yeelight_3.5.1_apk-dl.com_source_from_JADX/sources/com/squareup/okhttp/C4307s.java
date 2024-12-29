package com.squareup.okhttp;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.squareup.okhttp.s */
public final class C4307s {

    /* renamed from: d */
    private static final Pattern f7016d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e */
    private static final Pattern f7017e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    private final String f7018a;

    /* renamed from: b */
    private final String f7019b;

    /* renamed from: c */
    private final String f7020c;

    private C4307s(String str, String str2, String str3, String str4) {
        this.f7018a = str;
        this.f7019b = str2;
        this.f7020c = str4;
    }

    /* renamed from: c */
    public static C4307s m12062c(String str) {
        Matcher matcher = f7016d.matcher(str);
        if (!matcher.lookingAt()) {
            return null;
        }
        String group = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = group.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f7017e.matcher(str);
        String str2 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            String group2 = matcher2.group(1);
            if (group2 != null && group2.equalsIgnoreCase("charset")) {
                String group3 = matcher2.group(2) != null ? matcher2.group(2) : matcher2.group(3);
                if (str2 == null || group3.equalsIgnoreCase(str2)) {
                    str2 = group3;
                } else {
                    throw new IllegalArgumentException("Multiple different charsets: " + str);
                }
            }
        }
        return new C4307s(str, lowerCase, lowerCase2, str2);
    }

    /* renamed from: a */
    public Charset mo27973a() {
        String str = this.f7020c;
        if (str != null) {
            return Charset.forName(str);
        }
        return null;
    }

    /* renamed from: b */
    public Charset mo27974b(Charset charset) {
        String str = this.f7020c;
        return str != null ? Charset.forName(str) : charset;
    }

    /* renamed from: d */
    public String mo27975d() {
        return this.f7019b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4307s) && ((C4307s) obj).f7018a.equals(this.f7018a);
    }

    public int hashCode() {
        return this.f7018a.hashCode();
    }

    public String toString() {
        return this.f7018a;
    }
}
