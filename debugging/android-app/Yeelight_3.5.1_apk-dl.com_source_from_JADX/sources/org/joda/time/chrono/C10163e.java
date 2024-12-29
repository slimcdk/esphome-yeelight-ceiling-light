package org.joda.time.chrono;

import org.joda.time.C10172d;
import org.joda.time.C10224k;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.C10182h;

/* renamed from: org.joda.time.chrono.e */
final class C10163e extends C10182h {

    /* renamed from: d */
    private final BasicChronology f18807d;

    C10163e(BasicChronology basicChronology, C10172d dVar) {
        super(DateTimeFieldType.weekOfWeekyear(), dVar);
        this.f18807d = basicChronology;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo41271b(long j, int i) {
        if (i > 52) {
            return getMaximumValue(j);
        }
        return 52;
    }

    public int get(long j) {
        return this.f18807d.getWeekOfWeekyear(j);
    }

    public int getMaximumValue() {
        return 53;
    }

    public int getMaximumValue(long j) {
        return this.f18807d.getWeeksInYear(this.f18807d.getWeekyear(j));
    }

    public int getMaximumValue(C10224k kVar) {
        if (!kVar.isSupported(DateTimeFieldType.weekyear())) {
            return 53;
        }
        return this.f18807d.getWeeksInYear(kVar.get(DateTimeFieldType.weekyear()));
    }

    public int getMaximumValue(C10224k kVar, int[] iArr) {
        int size = kVar.size();
        for (int i = 0; i < size; i++) {
            if (kVar.getFieldType(i) == DateTimeFieldType.weekyear()) {
                return this.f18807d.getWeeksInYear(iArr[i]);
            }
        }
        return 53;
    }

    public int getMinimumValue() {
        return 1;
    }

    public C10172d getRangeDurationField() {
        return this.f18807d.weekyears();
    }

    public long remainder(long j) {
        return super.remainder(j + 259200000);
    }

    public long roundCeiling(long j) {
        return super.roundCeiling(j + 259200000) - 259200000;
    }

    public long roundFloor(long j) {
        return super.roundFloor(j + 259200000) - 259200000;
    }
}
