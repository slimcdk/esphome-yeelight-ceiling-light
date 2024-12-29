package org.joda.time.p196tz;

import java.util.Collections;
import java.util.Set;
import org.joda.time.DateTimeZone;

/* renamed from: org.joda.time.tz.d */
public final class C10233d implements C10232c {
    /* renamed from: a */
    public DateTimeZone mo41524a(String str) {
        if ("UTC".equalsIgnoreCase(str)) {
            return DateTimeZone.UTC;
        }
        return null;
    }

    /* renamed from: b */
    public Set<String> mo41525b() {
        return Collections.singleton("UTC");
    }
}
