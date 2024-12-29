package com.google.firebase.crashlytics.p110c.p114i;

import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.p110c.C2857b;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.firebase.crashlytics.c.i.d */
final class C2978d {

    /* renamed from: a */
    private static final Pattern f5789a = Pattern.compile("\\s*(\\p{XDigit}+)-\\s*(\\p{XDigit}+)\\s+(.{4})\\s+\\p{XDigit}+\\s+.+\\s+\\d+\\s+(.*)");

    @Nullable
    /* renamed from: a */
    static C2977c m9147a(String str) {
        Matcher matcher = f5789a.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        try {
            long longValue = Long.valueOf(matcher.group(1), 16).longValue();
            return new C2977c(longValue, Long.valueOf(matcher.group(2), 16).longValue() - longValue, matcher.group(3), matcher.group(4));
        } catch (Exception unused) {
            C2857b f = C2857b.m8687f();
            f.mo17130b("Could not parse map entry: " + str);
            return null;
        }
    }
}
