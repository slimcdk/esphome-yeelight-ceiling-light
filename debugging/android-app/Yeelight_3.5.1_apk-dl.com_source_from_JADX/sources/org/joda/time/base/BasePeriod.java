package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.C10142a;
import org.joda.time.C10149c;
import org.joda.time.C10174f;
import org.joda.time.C10221h;
import org.joda.time.C10222i;
import org.joda.time.C10224k;
import org.joda.time.C10225l;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.C10179e;
import p153e7.C9008d;
import p153e7.C9018m;

public abstract class BasePeriod extends C3589f implements Serializable {
    private static final C10225l DUMMY_PERIOD = new C10144a();
    private static final long serialVersionUID = -2110953284060001145L;
    private final PeriodType iType;
    private final int[] iValues;

    /* renamed from: org.joda.time.base.BasePeriod$a */
    static class C10144a extends C3589f {
        C10144a() {
        }

        public PeriodType getPeriodType() {
            return PeriodType.time();
        }

        public int getValue(int i) {
            return 0;
        }
    }

    protected BasePeriod(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PeriodType periodType) {
        this.iType = checkPeriodType(periodType);
        this.iValues = setPeriodInternal(i, i2, i3, i4, i5, i6, i7, i8);
    }

    protected BasePeriod(long j) {
        this.iType = PeriodType.standard();
        int[] iArr = ISOChronology.getInstanceUTC().get(DUMMY_PERIOD, j);
        int[] iArr2 = new int[8];
        this.iValues = iArr2;
        System.arraycopy(iArr, 0, iArr2, 4, 4);
    }

    protected BasePeriod(long j, long j2, PeriodType periodType, C10142a aVar) {
        PeriodType checkPeriodType = checkPeriodType(periodType);
        C10142a b = C10149c.m25337b(aVar);
        this.iType = checkPeriodType;
        this.iValues = b.get(this, j, j2);
    }

    protected BasePeriod(long j, PeriodType periodType, C10142a aVar) {
        PeriodType checkPeriodType = checkPeriodType(periodType);
        C10142a b = C10149c.m25337b(aVar);
        this.iType = checkPeriodType;
        this.iValues = b.get((C10225l) this, j);
    }

    protected BasePeriod(Object obj, PeriodType periodType, C10142a aVar) {
        C9018m f = C9008d.m21502b().mo36874f(obj);
        PeriodType checkPeriodType = checkPeriodType(periodType == null ? f.mo36885h(obj) : periodType);
        this.iType = checkPeriodType;
        if (this instanceof C10174f) {
            this.iValues = new int[size()];
            f.mo36882e((C10174f) this, obj, C10149c.m25337b(aVar));
            return;
        }
        this.iValues = new MutablePeriod(obj, checkPeriodType, aVar).getValues();
    }

    protected BasePeriod(C10221h hVar, C10222i iVar, PeriodType periodType) {
        PeriodType checkPeriodType = checkPeriodType(periodType);
        long e = C10149c.m25340e(hVar);
        long g = C10149c.m25342g(iVar);
        long j = C10179e.m25394j(g, e);
        C10142a f = C10149c.m25341f(iVar);
        this.iType = checkPeriodType;
        this.iValues = f.get(this, j, g);
    }

    protected BasePeriod(C10222i iVar, C10221h hVar, PeriodType periodType) {
        PeriodType checkPeriodType = checkPeriodType(periodType);
        long g = C10149c.m25342g(iVar);
        long e = C10179e.m25389e(g, C10149c.m25340e(hVar));
        C10142a f = C10149c.m25341f(iVar);
        this.iType = checkPeriodType;
        this.iValues = f.get(this, g, e);
    }

    protected BasePeriod(C10222i iVar, C10222i iVar2, PeriodType periodType) {
        PeriodType checkPeriodType = checkPeriodType(periodType);
        if (iVar == null && iVar2 == null) {
            this.iType = checkPeriodType;
            this.iValues = new int[size()];
            return;
        }
        long g = C10149c.m25342g(iVar);
        long g2 = C10149c.m25342g(iVar2);
        C10142a h = C10149c.m25343h(iVar, iVar2);
        this.iType = checkPeriodType;
        this.iValues = h.get(this, g, g2);
    }

    protected BasePeriod(C10224k kVar, C10224k kVar2, PeriodType periodType) {
        if (kVar == null || kVar2 == null) {
            throw new IllegalArgumentException("ReadablePartial objects must not be null");
        } else if ((kVar instanceof C10148g) && (kVar2 instanceof C10148g) && kVar.getClass() == kVar2.getClass()) {
            PeriodType checkPeriodType = checkPeriodType(periodType);
            long localMillis = ((C10148g) kVar).getLocalMillis();
            long localMillis2 = ((C10148g) kVar2).getLocalMillis();
            C10142a b = C10149c.m25337b(kVar.getChronology());
            this.iType = checkPeriodType;
            this.iValues = b.get(this, localMillis, localMillis2);
        } else if (kVar.size() == kVar2.size()) {
            int i = 0;
            int size = kVar.size();
            while (i < size) {
                if (kVar.getFieldType(i) == kVar2.getFieldType(i)) {
                    i++;
                } else {
                    throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
                }
            }
            if (C10149c.m25348m(kVar)) {
                this.iType = checkPeriodType(periodType);
                C10142a withUTC = C10149c.m25337b(kVar.getChronology()).withUTC();
                this.iValues = withUTC.get(this, withUTC.set(kVar, 0), withUTC.set(kVar2, 0));
                return;
            }
            throw new IllegalArgumentException("ReadablePartial objects must be contiguous");
        } else {
            throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
        }
    }

    protected BasePeriod(int[] iArr, PeriodType periodType) {
        this.iType = periodType;
        this.iValues = iArr;
    }

    private void checkAndUpdate(DurationFieldType durationFieldType, int[] iArr, int i) {
        int indexOf = indexOf(durationFieldType);
        if (indexOf != -1) {
            iArr[indexOf] = i;
        } else if (i != 0) {
            throw new IllegalArgumentException("Period does not support field '" + durationFieldType.getName() + "'");
        }
    }

    private void setPeriodInternal(C10225l lVar) {
        int[] iArr = new int[size()];
        int size = lVar.size();
        for (int i = 0; i < size; i++) {
            checkAndUpdate(lVar.getFieldType(i), iArr, lVar.getValue(i));
        }
        setValues(iArr);
    }

    private int[] setPeriodInternal(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int[] iArr = new int[size()];
        checkAndUpdate(DurationFieldType.years(), iArr, i);
        checkAndUpdate(DurationFieldType.months(), iArr, i2);
        checkAndUpdate(DurationFieldType.weeks(), iArr, i3);
        checkAndUpdate(DurationFieldType.days(), iArr, i4);
        checkAndUpdate(DurationFieldType.hours(), iArr, i5);
        checkAndUpdate(DurationFieldType.minutes(), iArr, i6);
        checkAndUpdate(DurationFieldType.seconds(), iArr, i7);
        checkAndUpdate(DurationFieldType.millis(), iArr, i8);
        return iArr;
    }

    /* access modifiers changed from: protected */
    public void addField(DurationFieldType durationFieldType, int i) {
        addFieldInto(this.iValues, durationFieldType, i);
    }

    /* access modifiers changed from: protected */
    public void addFieldInto(int[] iArr, DurationFieldType durationFieldType, int i) {
        int indexOf = indexOf(durationFieldType);
        if (indexOf != -1) {
            iArr[indexOf] = C10179e.m25388d(iArr[indexOf], i);
        } else if (i != 0 || durationFieldType == null) {
            throw new IllegalArgumentException("Period does not support field '" + durationFieldType + "'");
        }
    }

    /* access modifiers changed from: protected */
    public void addPeriod(C10225l lVar) {
        if (lVar != null) {
            setValues(addPeriodInto(getValues(), lVar));
        }
    }

    /* access modifiers changed from: protected */
    public int[] addPeriodInto(int[] iArr, C10225l lVar) {
        int size = lVar.size();
        for (int i = 0; i < size; i++) {
            DurationFieldType fieldType = lVar.getFieldType(i);
            int value = lVar.getValue(i);
            if (value != 0) {
                int indexOf = indexOf(fieldType);
                if (indexOf != -1) {
                    iArr[indexOf] = C10179e.m25388d(getValue(indexOf), value);
                } else {
                    throw new IllegalArgumentException("Period does not support field '" + fieldType.getName() + "'");
                }
            }
        }
        return iArr;
    }

    /* access modifiers changed from: protected */
    public PeriodType checkPeriodType(PeriodType periodType) {
        return C10149c.m25345j(periodType);
    }

    public PeriodType getPeriodType() {
        return this.iType;
    }

    public int getValue(int i) {
        return this.iValues[i];
    }

    /* access modifiers changed from: protected */
    public void mergePeriod(C10225l lVar) {
        if (lVar != null) {
            setValues(mergePeriodInto(getValues(), lVar));
        }
    }

    /* access modifiers changed from: protected */
    public int[] mergePeriodInto(int[] iArr, C10225l lVar) {
        int size = lVar.size();
        for (int i = 0; i < size; i++) {
            checkAndUpdate(lVar.getFieldType(i), iArr, lVar.getValue(i));
        }
        return iArr;
    }

    /* access modifiers changed from: protected */
    public void setField(DurationFieldType durationFieldType, int i) {
        setFieldInto(this.iValues, durationFieldType, i);
    }

    /* access modifiers changed from: protected */
    public void setFieldInto(int[] iArr, DurationFieldType durationFieldType, int i) {
        int indexOf = indexOf(durationFieldType);
        if (indexOf != -1) {
            iArr[indexOf] = i;
        } else if (i != 0 || durationFieldType == null) {
            throw new IllegalArgumentException("Period does not support field '" + durationFieldType + "'");
        }
    }

    /* access modifiers changed from: protected */
    public void setPeriod(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        setValues(setPeriodInternal(i, i2, i3, i4, i5, i6, i7, i8));
    }

    /* access modifiers changed from: protected */
    public void setPeriod(C10225l lVar) {
        if (lVar == null) {
            setValues(new int[size()]);
        } else {
            setPeriodInternal(lVar);
        }
    }

    /* access modifiers changed from: protected */
    public void setValue(int i, int i2) {
        this.iValues[i] = i2;
    }

    /* access modifiers changed from: protected */
    public void setValues(int[] iArr) {
        int[] iArr2 = this.iValues;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
    }

    public Duration toDurationFrom(C10222i iVar) {
        long g = C10149c.m25342g(iVar);
        return new Duration(g, C10149c.m25341f(iVar).add((C10225l) this, g, 1));
    }

    public Duration toDurationTo(C10222i iVar) {
        long g = C10149c.m25342g(iVar);
        return new Duration(C10149c.m25341f(iVar).add((C10225l) this, g, -1), g);
    }
}
