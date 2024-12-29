package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.C10172d;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.C10182h;

/* renamed from: org.joda.time.chrono.h */
final class C10166h extends C10182h {

    /* renamed from: d */
    private final BasicChronology f18810d;

    C10166h(BasicChronology basicChronology, C10172d dVar) {
        super(DateTimeFieldType.dayOfWeek(), dVar);
        this.f18810d = basicChronology;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo41272a(String str, Locale locale) {
        return C10168j.m25362h(locale).mo41273c(str);
    }

    public int get(long j) {
        return this.f18810d.getDayOfWeek(j);
    }

    public String getAsShortText(int i, Locale locale) {
        return C10168j.m25362h(locale).mo41274d(i);
    }

    public String getAsText(int i, Locale locale) {
        return C10168j.m25362h(locale).mo41275e(i);
    }

    public int getMaximumShortTextLength(Locale locale) {
        return C10168j.m25362h(locale).mo41278i();
    }

    public int getMaximumTextLength(Locale locale) {
        return C10168j.m25362h(locale).mo41279j();
    }

    public int getMaximumValue() {
        return 7;
    }

    public int getMinimumValue() {
        return 1;
    }

    public C10172d getRangeDurationField() {
        return this.f18810d.weeks();
    }
}
