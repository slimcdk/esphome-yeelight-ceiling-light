package org.joda.time.base;

import org.joda.convert.ToString;
import org.joda.time.C10225l;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.format.C10208g;
import org.joda.time.format.C10209h;

/* renamed from: org.joda.time.base.f */
public abstract class C3589f implements C10225l {
    protected C3589f() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10225l)) {
            return false;
        }
        C10225l lVar = (C10225l) obj;
        if (size() != lVar.size()) {
            return false;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (getValue(i) != lVar.getValue(i) || getFieldType(i) != lVar.getFieldType(i)) {
                return false;
            }
        }
        return true;
    }

    public int get(DurationFieldType durationFieldType) {
        int indexOf = indexOf(durationFieldType);
        if (indexOf == -1) {
            return 0;
        }
        return getValue(indexOf);
    }

    public DurationFieldType getFieldType(int i) {
        return getPeriodType().getFieldType(i);
    }

    public DurationFieldType[] getFieldTypes() {
        int size = size();
        DurationFieldType[] durationFieldTypeArr = new DurationFieldType[size];
        for (int i = 0; i < size; i++) {
            durationFieldTypeArr[i] = getFieldType(i);
        }
        return durationFieldTypeArr;
    }

    public int[] getValues() {
        int size = size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = getValue(i);
        }
        return iArr;
    }

    public int hashCode() {
        int size = size();
        int i = 17;
        for (int i2 = 0; i2 < size; i2++) {
            i = (((i * 27) + getValue(i2)) * 27) + getFieldType(i2).hashCode();
        }
        return i;
    }

    public int indexOf(DurationFieldType durationFieldType) {
        return getPeriodType().indexOf(durationFieldType);
    }

    public boolean isSupported(DurationFieldType durationFieldType) {
        return getPeriodType().isSupported(durationFieldType);
    }

    public int size() {
        return getPeriodType().size();
    }

    public MutablePeriod toMutablePeriod() {
        return new MutablePeriod((Object) this);
    }

    public Period toPeriod() {
        return new Period((Object) this);
    }

    @ToString
    public String toString() {
        return C10208g.m25627a().mo41470i(this);
    }

    public String toString(C10209h hVar) {
        return hVar == null ? toString() : hVar.mo41470i(this);
    }
}
