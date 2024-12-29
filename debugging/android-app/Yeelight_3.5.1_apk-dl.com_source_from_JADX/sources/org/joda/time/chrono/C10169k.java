package org.joda.time.chrono;

import java.util.Locale;

/* renamed from: org.joda.time.chrono.k */
final class C10169k extends C10161c {
    C10169k(BasicChronology basicChronology) {
        super(basicChronology, 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo41272a(String str, Locale locale) {
        return C10168j.m25362h(locale).mo41286r(str);
    }

    public String getAsShortText(int i, Locale locale) {
        return C10168j.m25362h(locale).mo41287s(i);
    }

    public String getAsText(int i, Locale locale) {
        return C10168j.m25362h(locale).mo41288t(i);
    }

    public int getMaximumShortTextLength(Locale locale) {
        return C10168j.m25362h(locale).mo41282m();
    }

    public int getMaximumTextLength(Locale locale) {
        return C10168j.m25362h(locale).mo41283n();
    }
}
