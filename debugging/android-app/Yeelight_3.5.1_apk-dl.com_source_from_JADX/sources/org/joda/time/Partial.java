package org.joda.time;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.joda.time.base.C10147e;
import org.joda.time.field.C10175a;
import org.joda.time.field.C10179e;
import org.joda.time.format.C10199a;
import org.joda.time.format.C10206f;
import org.joda.time.format.DateTimeFormat;

public final class Partial extends C10147e implements Serializable {
    private static final long serialVersionUID = 12324121189002L;
    private final C10142a iChronology;
    private transient C10199a[] iFormatter;
    private final DateTimeFieldType[] iTypes;
    private final int[] iValues;

    public static class Property extends C10175a implements Serializable {
        private static final long serialVersionUID = 53278362873888L;
        private final int iFieldIndex;
        private final Partial iPartial;

        Property(Partial partial, int i) {
            this.iPartial = partial;
            this.iFieldIndex = i;
        }

        public Partial addToCopy(int i) {
            return new Partial(this.iPartial, getField().add(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), i));
        }

        public Partial addWrapFieldToCopy(int i) {
            return new Partial(this.iPartial, getField().addWrapField(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), i));
        }

        public int get() {
            return this.iPartial.getValue(this.iFieldIndex);
        }

        public C10143b getField() {
            return this.iPartial.getField(this.iFieldIndex);
        }

        public Partial getPartial() {
            return this.iPartial;
        }

        /* access modifiers changed from: protected */
        public C10224k getReadablePartial() {
            return this.iPartial;
        }

        public Partial setCopy(int i) {
            return new Partial(this.iPartial, getField().set(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), i));
        }

        public Partial setCopy(String str) {
            return setCopy(str, (Locale) null);
        }

        public Partial setCopy(String str, Locale locale) {
            return new Partial(this.iPartial, getField().set(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), str, locale));
        }

        public Partial withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public Partial withMinimumValue() {
            return setCopy(getMinimumValue());
        }
    }

    public Partial() {
        this((C10142a) null);
    }

    public Partial(DateTimeFieldType dateTimeFieldType, int i) {
        this(dateTimeFieldType, i, (C10142a) null);
    }

    public Partial(DateTimeFieldType dateTimeFieldType, int i, C10142a aVar) {
        C10142a withUTC = C10149c.m25337b(aVar).withUTC();
        this.iChronology = withUTC;
        if (dateTimeFieldType != null) {
            this.iTypes = new DateTimeFieldType[]{dateTimeFieldType};
            int[] iArr = {i};
            this.iValues = iArr;
            withUTC.validate(this, iArr);
            return;
        }
        throw new IllegalArgumentException("The field type must not be null");
    }

    Partial(Partial partial, int[] iArr) {
        this.iChronology = partial.iChronology;
        this.iTypes = partial.iTypes;
        this.iValues = iArr;
    }

    public Partial(C10142a aVar) {
        this.iChronology = C10149c.m25337b(aVar).withUTC();
        this.iTypes = new DateTimeFieldType[0];
        this.iValues = new int[0];
    }

    Partial(C10142a aVar, DateTimeFieldType[] dateTimeFieldTypeArr, int[] iArr) {
        this.iChronology = aVar;
        this.iTypes = dateTimeFieldTypeArr;
        this.iValues = iArr;
    }

    public Partial(C10224k kVar) {
        if (kVar != null) {
            this.iChronology = C10149c.m25337b(kVar.getChronology()).withUTC();
            this.iTypes = new DateTimeFieldType[kVar.size()];
            this.iValues = new int[kVar.size()];
            for (int i = 0; i < kVar.size(); i++) {
                this.iTypes[i] = kVar.getFieldType(i);
                this.iValues[i] = kVar.getValue(i);
            }
            return;
        }
        throw new IllegalArgumentException("The partial must not be null");
    }

    public Partial(DateTimeFieldType[] dateTimeFieldTypeArr, int[] iArr) {
        this(dateTimeFieldTypeArr, iArr, (C10142a) null);
    }

    public Partial(DateTimeFieldType[] dateTimeFieldTypeArr, int[] iArr, C10142a aVar) {
        C10142a withUTC = C10149c.m25337b(aVar).withUTC();
        this.iChronology = withUTC;
        if (dateTimeFieldTypeArr == null) {
            throw new IllegalArgumentException("Types array must not be null");
        } else if (iArr == null) {
            throw new IllegalArgumentException("Values array must not be null");
        } else if (iArr.length != dateTimeFieldTypeArr.length) {
            throw new IllegalArgumentException("Values array must be the same length as the types array");
        } else if (dateTimeFieldTypeArr.length == 0) {
            this.iTypes = dateTimeFieldTypeArr;
            this.iValues = iArr;
        } else {
            int i = 0;
            int i2 = 0;
            while (i2 < dateTimeFieldTypeArr.length) {
                if (dateTimeFieldTypeArr[i2] != null) {
                    i2++;
                } else {
                    throw new IllegalArgumentException("Types array must not contain null: index " + i2);
                }
            }
            C10172d dVar = null;
            while (i < dateTimeFieldTypeArr.length) {
                DateTimeFieldType dateTimeFieldType = dateTimeFieldTypeArr[i];
                C10172d field = dateTimeFieldType.getDurationType().getField(this.iChronology);
                if (i > 0) {
                    int compareTo = dVar.compareTo(field);
                    if (compareTo < 0 || (compareTo != 0 && !field.isSupported())) {
                        throw new IllegalArgumentException("Types array must be in order largest-smallest: " + dateTimeFieldTypeArr[i - 1].getName() + " < " + dateTimeFieldType.getName());
                    } else if (compareTo == 0) {
                        int i3 = i - 1;
                        if (dateTimeFieldTypeArr[i3].getRangeDurationType() == null) {
                            if (dateTimeFieldType.getRangeDurationType() == null) {
                                throw new IllegalArgumentException("Types array must not contain duplicate: " + dateTimeFieldType.getName());
                            }
                        } else if (dateTimeFieldType.getRangeDurationType() != null) {
                            C10172d field2 = dateTimeFieldTypeArr[i3].getRangeDurationType().getField(this.iChronology);
                            C10172d field3 = dateTimeFieldType.getRangeDurationType().getField(this.iChronology);
                            if (field2.compareTo(field3) < 0) {
                                throw new IllegalArgumentException("Types array must be in order largest-smallest: " + dateTimeFieldTypeArr[i3].getName() + " < " + dateTimeFieldType.getName());
                            } else if (field2.compareTo(field3) == 0) {
                                throw new IllegalArgumentException("Types array must not contain duplicate: " + dateTimeFieldType.getName());
                            }
                        } else {
                            throw new IllegalArgumentException("Types array must be in order largest-smallest: " + dateTimeFieldTypeArr[i3].getName() + " < " + dateTimeFieldType.getName());
                        }
                    } else {
                        continue;
                    }
                }
                i++;
                dVar = field;
            }
            this.iTypes = (DateTimeFieldType[]) dateTimeFieldTypeArr.clone();
            withUTC.validate(this, iArr);
            this.iValues = (int[]) iArr.clone();
        }
    }

    public C10142a getChronology() {
        return this.iChronology;
    }

    /* access modifiers changed from: protected */
    public C10143b getField(int i, C10142a aVar) {
        return this.iTypes[i].getField(aVar);
    }

    public DateTimeFieldType getFieldType(int i) {
        return this.iTypes[i];
    }

    public DateTimeFieldType[] getFieldTypes() {
        return (DateTimeFieldType[]) this.iTypes.clone();
    }

    public C10199a getFormatter() {
        C10199a[] aVarArr = this.iFormatter;
        if (aVarArr == null) {
            if (size() == 0) {
                return null;
            }
            aVarArr = new C10199a[2];
            try {
                ArrayList arrayList = new ArrayList(Arrays.asList(this.iTypes));
                aVarArr[0] = C10206f.m25541j(arrayList, true, false);
                if (arrayList.size() == 0) {
                    aVarArr[1] = aVarArr[0];
                }
            } catch (IllegalArgumentException unused) {
            }
            this.iFormatter = aVarArr;
        }
        return aVarArr[0];
    }

    public int getValue(int i) {
        return this.iValues[i];
    }

    public int[] getValues() {
        return (int[]) this.iValues.clone();
    }

    public boolean isMatch(C10222i iVar) {
        long g = C10149c.m25342g(iVar);
        C10142a f = C10149c.m25341f(iVar);
        int i = 0;
        while (true) {
            DateTimeFieldType[] dateTimeFieldTypeArr = this.iTypes;
            if (i >= dateTimeFieldTypeArr.length) {
                return true;
            }
            if (dateTimeFieldTypeArr[i].getField(f).get(g) != this.iValues[i]) {
                return false;
            }
            i++;
        }
    }

    public boolean isMatch(C10224k kVar) {
        if (kVar != null) {
            int i = 0;
            while (true) {
                DateTimeFieldType[] dateTimeFieldTypeArr = this.iTypes;
                if (i >= dateTimeFieldTypeArr.length) {
                    return true;
                }
                if (kVar.get(dateTimeFieldTypeArr[i]) != this.iValues[i]) {
                    return false;
                }
                i++;
            }
        } else {
            throw new IllegalArgumentException("The partial must not be null");
        }
    }

    public Partial minus(C10225l lVar) {
        return withPeriodAdded(lVar, -1);
    }

    public Partial plus(C10225l lVar) {
        return withPeriodAdded(lVar, 1);
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    public int size() {
        return this.iTypes.length;
    }

    public String toString() {
        C10199a[] aVarArr = this.iFormatter;
        if (aVarArr == null) {
            getFormatter();
            aVarArr = this.iFormatter;
            if (aVarArr == null) {
                return toStringList();
            }
        }
        C10199a aVar = aVarArr[1];
        return aVar == null ? toStringList() : aVar.mo41439k(this);
    }

    public String toString(String str) {
        return str == null ? toString() : DateTimeFormat.m25402b(str).mo41439k(this);
    }

    public String toString(String str, Locale locale) {
        return str == null ? toString() : DateTimeFormat.m25402b(str).mo41444t(locale).mo41439k(this);
    }

    public String toStringList() {
        int size = size();
        StringBuilder sb = new StringBuilder(size * 20);
        sb.append('[');
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(',');
                sb.append(' ');
            }
            sb.append(this.iTypes[i].getName());
            sb.append('=');
            sb.append(this.iValues[i]);
        }
        sb.append(']');
        return sb.toString();
    }

    public Partial with(DateTimeFieldType dateTimeFieldType, int i) {
        int i2;
        int compareTo;
        if (dateTimeFieldType != null) {
            int indexOf = indexOf(dateTimeFieldType);
            if (indexOf == -1) {
                int length = this.iTypes.length + 1;
                DateTimeFieldType[] dateTimeFieldTypeArr = new DateTimeFieldType[length];
                int[] iArr = new int[length];
                C10172d field = dateTimeFieldType.getDurationType().getField(this.iChronology);
                if (field.isSupported()) {
                    i2 = 0;
                    while (true) {
                        DateTimeFieldType[] dateTimeFieldTypeArr2 = this.iTypes;
                        if (i2 >= dateTimeFieldTypeArr2.length) {
                            break;
                        }
                        DateTimeFieldType dateTimeFieldType2 = dateTimeFieldTypeArr2[i2];
                        C10172d field2 = dateTimeFieldType2.getDurationType().getField(this.iChronology);
                        if (field2.isSupported() && ((compareTo = field.compareTo(field2)) > 0 || (compareTo == 0 && dateTimeFieldType.getRangeDurationType().getField(this.iChronology).compareTo(dateTimeFieldType2.getRangeDurationType().getField(this.iChronology)) > 0))) {
                            break;
                        }
                        i2++;
                    }
                } else {
                    i2 = 0;
                }
                System.arraycopy(this.iTypes, 0, dateTimeFieldTypeArr, 0, i2);
                System.arraycopy(this.iValues, 0, iArr, 0, i2);
                dateTimeFieldTypeArr[i2] = dateTimeFieldType;
                iArr[i2] = i;
                int i3 = i2 + 1;
                int i4 = (length - i2) - 1;
                System.arraycopy(this.iTypes, i2, dateTimeFieldTypeArr, i3, i4);
                System.arraycopy(this.iValues, i2, iArr, i3, i4);
                Partial partial = new Partial(this.iChronology, dateTimeFieldTypeArr, iArr);
                this.iChronology.validate(partial, iArr);
                return partial;
            } else if (i == getValue(indexOf)) {
                return this;
            } else {
                return new Partial(this, getField(indexOf).set(this, indexOf, getValues(), i));
            }
        } else {
            throw new IllegalArgumentException("The field type must not be null");
        }
    }

    public Partial withChronologyRetainFields(C10142a aVar) {
        C10142a withUTC = C10149c.m25337b(aVar).withUTC();
        if (withUTC == getChronology()) {
            return this;
        }
        Partial partial = new Partial(withUTC, this.iTypes, this.iValues);
        withUTC.validate(partial, this.iValues);
        return partial;
    }

    public Partial withField(DateTimeFieldType dateTimeFieldType, int i) {
        int indexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i == getValue(indexOfSupported)) {
            return this;
        }
        return new Partial(this, getField(indexOfSupported).set(this, indexOfSupported, getValues(), i));
    }

    public Partial withFieldAddWrapped(DurationFieldType durationFieldType, int i) {
        int indexOfSupported = indexOfSupported(durationFieldType);
        if (i == 0) {
            return this;
        }
        return new Partial(this, getField(indexOfSupported).addWrapPartial(this, indexOfSupported, getValues(), i));
    }

    public Partial withFieldAdded(DurationFieldType durationFieldType, int i) {
        int indexOfSupported = indexOfSupported(durationFieldType);
        if (i == 0) {
            return this;
        }
        return new Partial(this, getField(indexOfSupported).add(this, indexOfSupported, getValues(), i));
    }

    public Partial withPeriodAdded(C10225l lVar, int i) {
        if (lVar == null || i == 0) {
            return this;
        }
        int[] values = getValues();
        for (int i2 = 0; i2 < lVar.size(); i2++) {
            int indexOf = indexOf(lVar.getFieldType(i2));
            if (indexOf >= 0) {
                values = getField(indexOf).add(this, indexOf, values, C10179e.m25390f(lVar.getValue(i2), i));
            }
        }
        return new Partial(this, values);
    }

    public Partial without(DateTimeFieldType dateTimeFieldType) {
        int indexOf = indexOf(dateTimeFieldType);
        if (indexOf == -1) {
            return this;
        }
        int size = size() - 1;
        DateTimeFieldType[] dateTimeFieldTypeArr = new DateTimeFieldType[size];
        int size2 = size() - 1;
        int[] iArr = new int[size2];
        System.arraycopy(this.iTypes, 0, dateTimeFieldTypeArr, 0, indexOf);
        int i = indexOf + 1;
        System.arraycopy(this.iTypes, i, dateTimeFieldTypeArr, indexOf, size - indexOf);
        System.arraycopy(this.iValues, 0, iArr, 0, indexOf);
        System.arraycopy(this.iValues, i, iArr, indexOf, size2 - indexOf);
        Partial partial = new Partial(this.iChronology, dateTimeFieldTypeArr, iArr);
        this.iChronology.validate(partial, iArr);
        return partial;
    }
}
