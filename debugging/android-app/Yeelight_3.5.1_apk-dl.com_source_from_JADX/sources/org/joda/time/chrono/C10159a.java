package org.joda.time.chrono;

import org.joda.time.C10172d;
import org.joda.time.C10224k;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.C10182h;

/* renamed from: org.joda.time.chrono.a */
final class C10159a extends C10182h {

    /* renamed from: d */
    private final BasicChronology f18801d;

    C10159a(BasicChronology basicChronology, C10172d dVar) {
        super(DateTimeFieldType.dayOfMonth(), dVar);
        this.f18801d = basicChronology;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo41271b(long j, int i) {
        return this.f18801d.getDaysInMonthMaxForSet(j, i);
    }

    public int get(long j) {
        return this.f18801d.getDayOfMonth(j);
    }

    public int getMaximumValue() {
        return this.f18801d.getDaysInMonthMax();
    }

    public int getMaximumValue(long j) {
        return this.f18801d.getDaysInMonthMax(j);
    }

    public int getMaximumValue(C10224k kVar) {
        if (!kVar.isSupported(DateTimeFieldType.monthOfYear())) {
            return getMaximumValue();
        }
        int i = kVar.get(DateTimeFieldType.monthOfYear());
        if (!kVar.isSupported(DateTimeFieldType.year())) {
            return this.f18801d.getDaysInMonthMax(i);
        }
        return this.f18801d.getDaysInYearMonth(kVar.get(DateTimeFieldType.year()), i);
    }

    public int getMaximumValue(C10224k kVar, int[] iArr) {
        int size = kVar.size();
        for (int i = 0; i < size; i++) {
            if (kVar.getFieldType(i) == DateTimeFieldType.monthOfYear()) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < size; i3++) {
                    if (kVar.getFieldType(i3) == DateTimeFieldType.year()) {
                        return this.f18801d.getDaysInYearMonth(iArr[i3], i2);
                    }
                }
                return this.f18801d.getDaysInMonthMax(i2);
            }
        }
        return getMaximumValue();
    }

    public int getMinimumValue() {
        return 1;
    }

    public C10172d getRangeDurationField() {
        return this.f18801d.months();
    }
}
