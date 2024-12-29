package org.joda.time;

import org.joda.convert.FromString;
import org.joda.time.base.BasePeriod;
import org.joda.time.field.C10179e;
import org.joda.time.format.C10208g;
import org.joda.time.format.C10209h;

public class MutablePeriod extends BasePeriod implements C10174f, Cloneable {
    private static final long serialVersionUID = 3436451121567212165L;

    public MutablePeriod() {
        super(0, (PeriodType) null, (C10142a) null);
    }

    public MutablePeriod(int i, int i2, int i3, int i4) {
        super(0, 0, 0, 0, i, i2, i3, i4, PeriodType.standard());
    }

    public MutablePeriod(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        super(i, i2, i3, i4, i5, i6, i7, i8, PeriodType.standard());
    }

    public MutablePeriod(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PeriodType periodType) {
        super(i, i2, i3, i4, i5, i6, i7, i8, periodType);
    }

    public MutablePeriod(long j) {
        super(j);
    }

    public MutablePeriod(long j, long j2) {
        super(j, j2, (PeriodType) null, (C10142a) null);
    }

    public MutablePeriod(long j, long j2, PeriodType periodType) {
        super(j, j2, periodType, (C10142a) null);
    }

    public MutablePeriod(long j, long j2, PeriodType periodType, C10142a aVar) {
        super(j, j2, periodType, aVar);
    }

    public MutablePeriod(long j, long j2, C10142a aVar) {
        super(j, j2, (PeriodType) null, aVar);
    }

    public MutablePeriod(long j, PeriodType periodType) {
        super(j, periodType, (C10142a) null);
    }

    public MutablePeriod(long j, PeriodType periodType, C10142a aVar) {
        super(j, periodType, aVar);
    }

    public MutablePeriod(long j, C10142a aVar) {
        super(j, (PeriodType) null, aVar);
    }

    public MutablePeriod(Object obj) {
        super(obj, (PeriodType) null, (C10142a) null);
    }

    public MutablePeriod(Object obj, PeriodType periodType) {
        super(obj, periodType, (C10142a) null);
    }

    public MutablePeriod(Object obj, PeriodType periodType, C10142a aVar) {
        super(obj, periodType, aVar);
    }

    public MutablePeriod(Object obj, C10142a aVar) {
        super(obj, (PeriodType) null, aVar);
    }

    public MutablePeriod(PeriodType periodType) {
        super(0, periodType, (C10142a) null);
    }

    public MutablePeriod(C10221h hVar, C10222i iVar) {
        super(hVar, iVar, (PeriodType) null);
    }

    public MutablePeriod(C10221h hVar, C10222i iVar, PeriodType periodType) {
        super(hVar, iVar, periodType);
    }

    public MutablePeriod(C10222i iVar, C10221h hVar) {
        super(iVar, hVar, (PeriodType) null);
    }

    public MutablePeriod(C10222i iVar, C10221h hVar, PeriodType periodType) {
        super(iVar, hVar, periodType);
    }

    public MutablePeriod(C10222i iVar, C10222i iVar2) {
        super(iVar, iVar2, (PeriodType) null);
    }

    public MutablePeriod(C10222i iVar, C10222i iVar2, PeriodType periodType) {
        super(iVar, iVar2, periodType);
    }

    @FromString
    public static MutablePeriod parse(String str) {
        return parse(str, C10208g.m25627a());
    }

    public static MutablePeriod parse(String str, C10209h hVar) {
        return hVar.mo41469h(str).toMutablePeriod();
    }

    public void add(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i;
        int i10 = i2;
        int i11 = i3;
        int i12 = i4;
        int i13 = i5;
        setPeriod(C10179e.m25388d(getYears(), i), C10179e.m25388d(getMonths(), i2), C10179e.m25388d(getWeeks(), i3), C10179e.m25388d(getDays(), i4), C10179e.m25388d(getHours(), i5), C10179e.m25388d(getMinutes(), i6), C10179e.m25388d(getSeconds(), i7), C10179e.m25388d(getMillis(), i8));
    }

    public void add(long j) {
        add((C10225l) new Period(j, getPeriodType()));
    }

    public void add(long j, C10142a aVar) {
        add((C10225l) new Period(j, getPeriodType(), aVar));
    }

    public void add(DurationFieldType durationFieldType, int i) {
        super.addField(durationFieldType, i);
    }

    public void add(C10221h hVar) {
        if (hVar != null) {
            add((C10225l) new Period(hVar.getMillis(), getPeriodType()));
        }
    }

    public void add(C10223j jVar) {
        if (jVar != null) {
            add((C10225l) jVar.toPeriod(getPeriodType()));
        }
    }

    public void add(C10225l lVar) {
        super.addPeriod(lVar);
    }

    public void addDays(int i) {
        super.addField(DurationFieldType.days(), i);
    }

    public void addHours(int i) {
        super.addField(DurationFieldType.hours(), i);
    }

    public void addMillis(int i) {
        super.addField(DurationFieldType.millis(), i);
    }

    public void addMinutes(int i) {
        super.addField(DurationFieldType.minutes(), i);
    }

    public void addMonths(int i) {
        super.addField(DurationFieldType.months(), i);
    }

    public void addSeconds(int i) {
        super.addField(DurationFieldType.seconds(), i);
    }

    public void addWeeks(int i) {
        super.addField(DurationFieldType.weeks(), i);
    }

    public void addYears(int i) {
        super.addField(DurationFieldType.years(), i);
    }

    public void clear() {
        super.setValues(new int[size()]);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    public MutablePeriod copy() {
        return (MutablePeriod) clone();
    }

    public int getDays() {
        return getPeriodType().getIndexedField(this, PeriodType.DAY_INDEX);
    }

    public int getHours() {
        return getPeriodType().getIndexedField(this, PeriodType.HOUR_INDEX);
    }

    public int getMillis() {
        return getPeriodType().getIndexedField(this, PeriodType.MILLI_INDEX);
    }

    public int getMinutes() {
        return getPeriodType().getIndexedField(this, PeriodType.MINUTE_INDEX);
    }

    public int getMonths() {
        return getPeriodType().getIndexedField(this, PeriodType.MONTH_INDEX);
    }

    public int getSeconds() {
        return getPeriodType().getIndexedField(this, PeriodType.SECOND_INDEX);
    }

    public int getWeeks() {
        return getPeriodType().getIndexedField(this, PeriodType.WEEK_INDEX);
    }

    public int getYears() {
        return getPeriodType().getIndexedField(this, PeriodType.YEAR_INDEX);
    }

    public void mergePeriod(C10225l lVar) {
        super.mergePeriod(lVar);
    }

    public void set(DurationFieldType durationFieldType, int i) {
        super.setField(durationFieldType, i);
    }

    public void setDays(int i) {
        super.setField(DurationFieldType.days(), i);
    }

    public void setHours(int i) {
        super.setField(DurationFieldType.hours(), i);
    }

    public void setMillis(int i) {
        super.setField(DurationFieldType.millis(), i);
    }

    public void setMinutes(int i) {
        super.setField(DurationFieldType.minutes(), i);
    }

    public void setMonths(int i) {
        super.setField(DurationFieldType.months(), i);
    }

    public void setPeriod(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        super.setPeriod(i, i2, i3, i4, i5, i6, i7, i8);
    }

    public void setPeriod(long j) {
        setPeriod(j, (C10142a) null);
    }

    public void setPeriod(long j, long j2) {
        setPeriod(j, j2, (C10142a) null);
    }

    public void setPeriod(long j, long j2, C10142a aVar) {
        setValues(C10149c.m25337b(aVar).get(this, j, j2));
    }

    public void setPeriod(long j, C10142a aVar) {
        setValues(C10149c.m25337b(aVar).get((C10225l) this, j));
    }

    public void setPeriod(C10221h hVar) {
        setPeriod(hVar, (C10142a) null);
    }

    public void setPeriod(C10221h hVar, C10142a aVar) {
        setPeriod(C10149c.m25340e(hVar), aVar);
    }

    public void setPeriod(C10222i iVar, C10222i iVar2) {
        if (iVar == iVar2) {
            setPeriod(0);
            return;
        }
        setPeriod(C10149c.m25342g(iVar), C10149c.m25342g(iVar2), C10149c.m25343h(iVar, iVar2));
    }

    public void setPeriod(C10223j jVar) {
        if (jVar == null) {
            setPeriod(0);
            return;
        }
        setPeriod(jVar.getStartMillis(), jVar.getEndMillis(), C10149c.m25337b(jVar.getChronology()));
    }

    public void setPeriod(C10225l lVar) {
        super.setPeriod(lVar);
    }

    public void setSeconds(int i) {
        super.setField(DurationFieldType.seconds(), i);
    }

    public void setValue(int i, int i2) {
        super.setValue(i, i2);
    }

    public void setWeeks(int i) {
        super.setField(DurationFieldType.weeks(), i);
    }

    public void setYears(int i) {
        super.setField(DurationFieldType.years(), i);
    }
}
