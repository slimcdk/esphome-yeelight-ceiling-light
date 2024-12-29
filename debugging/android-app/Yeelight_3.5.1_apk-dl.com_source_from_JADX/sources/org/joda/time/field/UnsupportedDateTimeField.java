package org.joda.time.field;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import org.joda.time.C10143b;
import org.joda.time.C10172d;
import org.joda.time.C10224k;
import org.joda.time.DateTimeFieldType;

public final class UnsupportedDateTimeField extends C10143b implements Serializable {
    private static HashMap<DateTimeFieldType, UnsupportedDateTimeField> cCache = null;
    private static final long serialVersionUID = -1934618396111902255L;
    private final C10172d iDurationField;
    private final DateTimeFieldType iType;

    private UnsupportedDateTimeField(DateTimeFieldType dateTimeFieldType, C10172d dVar) {
        if (dateTimeFieldType == null || dVar == null) {
            throw new IllegalArgumentException();
        }
        this.iType = dateTimeFieldType;
        this.iDurationField = dVar;
    }

    public static synchronized UnsupportedDateTimeField getInstance(DateTimeFieldType dateTimeFieldType, C10172d dVar) {
        UnsupportedDateTimeField unsupportedDateTimeField;
        synchronized (UnsupportedDateTimeField.class) {
            HashMap<DateTimeFieldType, UnsupportedDateTimeField> hashMap = cCache;
            unsupportedDateTimeField = null;
            if (hashMap == null) {
                cCache = new HashMap<>(7);
            } else {
                UnsupportedDateTimeField unsupportedDateTimeField2 = hashMap.get(dateTimeFieldType);
                if (unsupportedDateTimeField2 == null || unsupportedDateTimeField2.getDurationField() == dVar) {
                    unsupportedDateTimeField = unsupportedDateTimeField2;
                }
            }
            if (unsupportedDateTimeField == null) {
                unsupportedDateTimeField = new UnsupportedDateTimeField(dateTimeFieldType, dVar);
                cCache.put(dateTimeFieldType, unsupportedDateTimeField);
            }
        }
        return unsupportedDateTimeField;
    }

    private Object readResolve() {
        return getInstance(this.iType, this.iDurationField);
    }

    private UnsupportedOperationException unsupported() {
        return new UnsupportedOperationException(this.iType + " field is unsupported");
    }

    public long add(long j, int i) {
        return getDurationField().add(j, i);
    }

    public long add(long j, long j2) {
        return getDurationField().add(j, j2);
    }

    public int[] add(C10224k kVar, int i, int[] iArr, int i2) {
        throw unsupported();
    }

    public long addWrapField(long j, int i) {
        throw unsupported();
    }

    public int[] addWrapField(C10224k kVar, int i, int[] iArr, int i2) {
        throw unsupported();
    }

    public int[] addWrapPartial(C10224k kVar, int i, int[] iArr, int i2) {
        throw unsupported();
    }

    public int get(long j) {
        throw unsupported();
    }

    public String getAsShortText(int i, Locale locale) {
        throw unsupported();
    }

    public String getAsShortText(long j) {
        throw unsupported();
    }

    public String getAsShortText(long j, Locale locale) {
        throw unsupported();
    }

    public String getAsShortText(C10224k kVar, int i, Locale locale) {
        throw unsupported();
    }

    public String getAsShortText(C10224k kVar, Locale locale) {
        throw unsupported();
    }

    public String getAsText(int i, Locale locale) {
        throw unsupported();
    }

    public String getAsText(long j) {
        throw unsupported();
    }

    public String getAsText(long j, Locale locale) {
        throw unsupported();
    }

    public String getAsText(C10224k kVar, int i, Locale locale) {
        throw unsupported();
    }

    public String getAsText(C10224k kVar, Locale locale) {
        throw unsupported();
    }

    public int getDifference(long j, long j2) {
        return getDurationField().getDifference(j, j2);
    }

    public long getDifferenceAsLong(long j, long j2) {
        return getDurationField().getDifferenceAsLong(j, j2);
    }

    public C10172d getDurationField() {
        return this.iDurationField;
    }

    public int getLeapAmount(long j) {
        throw unsupported();
    }

    public C10172d getLeapDurationField() {
        return null;
    }

    public int getMaximumShortTextLength(Locale locale) {
        throw unsupported();
    }

    public int getMaximumTextLength(Locale locale) {
        throw unsupported();
    }

    public int getMaximumValue() {
        throw unsupported();
    }

    public int getMaximumValue(long j) {
        throw unsupported();
    }

    public int getMaximumValue(C10224k kVar) {
        throw unsupported();
    }

    public int getMaximumValue(C10224k kVar, int[] iArr) {
        throw unsupported();
    }

    public int getMinimumValue() {
        throw unsupported();
    }

    public int getMinimumValue(long j) {
        throw unsupported();
    }

    public int getMinimumValue(C10224k kVar) {
        throw unsupported();
    }

    public int getMinimumValue(C10224k kVar, int[] iArr) {
        throw unsupported();
    }

    public String getName() {
        return this.iType.getName();
    }

    public C10172d getRangeDurationField() {
        return null;
    }

    public DateTimeFieldType getType() {
        return this.iType;
    }

    public boolean isLeap(long j) {
        throw unsupported();
    }

    public boolean isLenient() {
        return false;
    }

    public boolean isSupported() {
        return false;
    }

    public long remainder(long j) {
        throw unsupported();
    }

    public long roundCeiling(long j) {
        throw unsupported();
    }

    public long roundFloor(long j) {
        throw unsupported();
    }

    public long roundHalfCeiling(long j) {
        throw unsupported();
    }

    public long roundHalfEven(long j) {
        throw unsupported();
    }

    public long roundHalfFloor(long j) {
        throw unsupported();
    }

    public long set(long j, int i) {
        throw unsupported();
    }

    public long set(long j, String str) {
        throw unsupported();
    }

    public long set(long j, String str, Locale locale) {
        throw unsupported();
    }

    public int[] set(C10224k kVar, int i, int[] iArr, int i2) {
        throw unsupported();
    }

    public int[] set(C10224k kVar, int i, int[] iArr, String str, Locale locale) {
        throw unsupported();
    }

    public String toString() {
        return "UnsupportedDateTimeField";
    }
}
