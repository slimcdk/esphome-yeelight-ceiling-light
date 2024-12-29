package org.joda.time.chrono;

import org.joda.time.C10172d;
import org.joda.time.C10224k;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.C10182h;

/* renamed from: org.joda.time.chrono.b */
final class C10160b extends C10182h {

    /* renamed from: d */
    private final BasicChronology f18802d;

    C10160b(BasicChronology basicChronology, C10172d dVar) {
        super(DateTimeFieldType.dayOfYear(), dVar);
        this.f18802d = basicChronology;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo41271b(long j, int i) {
        int daysInYearMax = this.f18802d.getDaysInYearMax() - 1;
        return (i > daysInYearMax || i < 1) ? getMaximumValue(j) : daysInYearMax;
    }

    public int get(long j) {
        return this.f18802d.getDayOfYear(j);
    }

    public int getMaximumValue() {
        return this.f18802d.getDaysInYearMax();
    }

    public int getMaximumValue(long j) {
        return this.f18802d.getDaysInYear(this.f18802d.getYear(j));
    }

    public int getMaximumValue(C10224k kVar) {
        if (!kVar.isSupported(DateTimeFieldType.year())) {
            return this.f18802d.getDaysInYearMax();
        }
        return this.f18802d.getDaysInYear(kVar.get(DateTimeFieldType.year()));
    }

    public int getMaximumValue(C10224k kVar, int[] iArr) {
        int size = kVar.size();
        for (int i = 0; i < size; i++) {
            if (kVar.getFieldType(i) == DateTimeFieldType.year()) {
                return this.f18802d.getDaysInYear(iArr[i]);
            }
        }
        return this.f18802d.getDaysInYearMax();
    }

    public int getMinimumValue() {
        return 1;
    }

    public C10172d getRangeDurationField() {
        return this.f18802d.years();
    }
}
