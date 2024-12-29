package org.joda.time.base;

import org.joda.time.C10142a;
import org.joda.time.C10143b;
import org.joda.time.C10149c;
import org.joda.time.C10222i;
import org.joda.time.C10224k;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.field.C10179e;
import org.joda.time.format.C10199a;

/* renamed from: org.joda.time.base.e */
public abstract class C10147e implements C10224k, Comparable<C10224k> {
    protected C10147e() {
    }

    public int compareTo(C10224k kVar) {
        if (this == kVar) {
            return 0;
        }
        if (size() == kVar.size()) {
            int size = size();
            int i = 0;
            while (i < size) {
                if (getFieldType(i) == kVar.getFieldType(i)) {
                    i++;
                } else {
                    throw new ClassCastException("ReadablePartial objects must have matching field types");
                }
            }
            int size2 = size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (getValue(i2) > kVar.getValue(i2)) {
                    return 1;
                }
                if (getValue(i2) < kVar.getValue(i2)) {
                    return -1;
                }
            }
            return 0;
        }
        throw new ClassCastException("ReadablePartial objects must have matching field types");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10224k)) {
            return false;
        }
        C10224k kVar = (C10224k) obj;
        if (size() != kVar.size()) {
            return false;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (getValue(i) != kVar.getValue(i) || getFieldType(i) != kVar.getFieldType(i)) {
                return false;
            }
        }
        return C10179e.m25385a(getChronology(), kVar.getChronology());
    }

    public int get(DateTimeFieldType dateTimeFieldType) {
        return getValue(indexOfSupported(dateTimeFieldType));
    }

    public C10143b getField(int i) {
        return getField(i, getChronology());
    }

    /* access modifiers changed from: protected */
    public abstract C10143b getField(int i, C10142a aVar);

    public DateTimeFieldType getFieldType(int i) {
        return getField(i, getChronology()).getType();
    }

    public DateTimeFieldType[] getFieldTypes() {
        int size = size();
        DateTimeFieldType[] dateTimeFieldTypeArr = new DateTimeFieldType[size];
        for (int i = 0; i < size; i++) {
            dateTimeFieldTypeArr[i] = getFieldType(i);
        }
        return dateTimeFieldTypeArr;
    }

    public C10143b[] getFields() {
        int size = size();
        C10143b[] bVarArr = new C10143b[size];
        for (int i = 0; i < size; i++) {
            bVarArr[i] = getField(i);
        }
        return bVarArr;
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
        int i = 157;
        for (int i2 = 0; i2 < size; i2++) {
            i = (((i * 23) + getValue(i2)) * 23) + getFieldType(i2).hashCode();
        }
        return i + getChronology().hashCode();
    }

    public int indexOf(DateTimeFieldType dateTimeFieldType) {
        int size = size();
        for (int i = 0; i < size; i++) {
            if (getFieldType(i) == dateTimeFieldType) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public int indexOf(DurationFieldType durationFieldType) {
        int size = size();
        for (int i = 0; i < size; i++) {
            if (getFieldType(i).getDurationType() == durationFieldType) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public int indexOfSupported(DateTimeFieldType dateTimeFieldType) {
        int indexOf = indexOf(dateTimeFieldType);
        if (indexOf != -1) {
            return indexOf;
        }
        throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
    }

    /* access modifiers changed from: protected */
    public int indexOfSupported(DurationFieldType durationFieldType) {
        int indexOf = indexOf(durationFieldType);
        if (indexOf != -1) {
            return indexOf;
        }
        throw new IllegalArgumentException("Field '" + durationFieldType + "' is not supported");
    }

    public boolean isAfter(C10224k kVar) {
        if (kVar != null) {
            return compareTo(kVar) > 0;
        }
        throw new IllegalArgumentException("Partial cannot be null");
    }

    public boolean isBefore(C10224k kVar) {
        if (kVar != null) {
            return compareTo(kVar) < 0;
        }
        throw new IllegalArgumentException("Partial cannot be null");
    }

    public boolean isEqual(C10224k kVar) {
        if (kVar != null) {
            return compareTo(kVar) == 0;
        }
        throw new IllegalArgumentException("Partial cannot be null");
    }

    public boolean isSupported(DateTimeFieldType dateTimeFieldType) {
        return indexOf(dateTimeFieldType) != -1;
    }

    public DateTime toDateTime(C10222i iVar) {
        C10142a f = C10149c.m25341f(iVar);
        return new DateTime(f.set(this, C10149c.m25342g(iVar)), f);
    }

    public String toString(C10199a aVar) {
        return aVar == null ? toString() : aVar.mo41439k(this);
    }
}
