package org.joda.time.field;

import java.util.Locale;
import org.joda.time.C10143b;
import org.joda.time.C10172d;
import org.joda.time.C10224k;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/* renamed from: org.joda.time.field.b */
public abstract class C10176b extends C10143b {

    /* renamed from: a */
    private final DateTimeFieldType f18834a;

    protected C10176b(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            this.f18834a = dateTimeFieldType;
            return;
        }
        throw new IllegalArgumentException("The type must not be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo41272a(String str, Locale locale) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new IllegalFieldValueException(getType(), str);
        }
    }

    public long add(long j, int i) {
        return getDurationField().add(j, i);
    }

    public long add(long j, long j2) {
        return getDurationField().add(j, j2);
    }

    public int[] add(C10224k kVar, int i, int[] iArr, int i2) {
        if (i2 == 0) {
            return iArr;
        }
        C10143b bVar = null;
        while (true) {
            if (i2 <= 0) {
                break;
            }
            int maximumValue = getMaximumValue(kVar, iArr);
            long j = (long) (iArr[i] + i2);
            if (j <= ((long) maximumValue)) {
                iArr[i] = (int) j;
                break;
            }
            if (bVar == null) {
                if (i != 0) {
                    bVar = kVar.getField(i - 1);
                    if (getRangeDurationField().getType() != bVar.getDurationField().getType()) {
                        throw new IllegalArgumentException("Fields invalid for add");
                    }
                } else {
                    throw new IllegalArgumentException("Maximum value exceeded for add");
                }
            }
            i2 -= (maximumValue + 1) - iArr[i];
            iArr = bVar.add(kVar, i - 1, iArr, 1);
            iArr[i] = getMinimumValue(kVar, iArr);
        }
        while (true) {
            if (i2 >= 0) {
                break;
            }
            int minimumValue = getMinimumValue(kVar, iArr);
            long j2 = (long) (iArr[i] + i2);
            if (j2 >= ((long) minimumValue)) {
                iArr[i] = (int) j2;
                break;
            }
            if (bVar == null) {
                if (i != 0) {
                    bVar = kVar.getField(i - 1);
                    if (getRangeDurationField().getType() != bVar.getDurationField().getType()) {
                        throw new IllegalArgumentException("Fields invalid for add");
                    }
                } else {
                    throw new IllegalArgumentException("Maximum value exceeded for add");
                }
            }
            i2 -= (minimumValue - 1) - iArr[i];
            iArr = bVar.add(kVar, i - 1, iArr, -1);
            iArr[i] = getMaximumValue(kVar, iArr);
        }
        return set(kVar, i, iArr, iArr[i]);
    }

    public long addWrapField(long j, int i) {
        return set(j, C10179e.m25387c(get(j), i, getMinimumValue(j), getMaximumValue(j)));
    }

    public int[] addWrapField(C10224k kVar, int i, int[] iArr, int i2) {
        return set(kVar, i, iArr, C10179e.m25387c(iArr[i], i2, getMinimumValue(kVar), getMaximumValue(kVar)));
    }

    public int[] addWrapPartial(C10224k kVar, int i, int[] iArr, int i2) {
        if (i2 == 0) {
            return iArr;
        }
        C10143b bVar = null;
        while (true) {
            if (i2 <= 0) {
                break;
            }
            int maximumValue = getMaximumValue(kVar, iArr);
            long j = (long) (iArr[i] + i2);
            if (j <= ((long) maximumValue)) {
                iArr[i] = (int) j;
                break;
            }
            if (bVar == null) {
                if (i == 0) {
                    i2 -= (maximumValue + 1) - iArr[i];
                    iArr[i] = getMinimumValue(kVar, iArr);
                } else {
                    bVar = kVar.getField(i - 1);
                    if (getRangeDurationField().getType() != bVar.getDurationField().getType()) {
                        throw new IllegalArgumentException("Fields invalid for add");
                    }
                }
            }
            i2 -= (maximumValue + 1) - iArr[i];
            iArr = bVar.addWrapPartial(kVar, i - 1, iArr, 1);
            iArr[i] = getMinimumValue(kVar, iArr);
        }
        while (true) {
            if (i2 >= 0) {
                break;
            }
            int minimumValue = getMinimumValue(kVar, iArr);
            long j2 = (long) (iArr[i] + i2);
            if (j2 >= ((long) minimumValue)) {
                iArr[i] = (int) j2;
                break;
            }
            if (bVar == null) {
                if (i == 0) {
                    r12 = i2 - ((minimumValue - 1) - iArr[i]);
                    iArr[i] = getMaximumValue(kVar, iArr);
                } else {
                    bVar = kVar.getField(i - 1);
                    if (getRangeDurationField().getType() != bVar.getDurationField().getType()) {
                        throw new IllegalArgumentException("Fields invalid for add");
                    }
                }
            }
            r12 = i2 - ((minimumValue - 1) - iArr[i]);
            iArr = bVar.addWrapPartial(kVar, i - 1, iArr, -1);
            iArr[i] = getMaximumValue(kVar, iArr);
        }
        return set(kVar, i, iArr, iArr[i]);
    }

    public String getAsShortText(int i, Locale locale) {
        return getAsText(i, locale);
    }

    public final String getAsShortText(long j) {
        return getAsShortText(j, (Locale) null);
    }

    public String getAsShortText(long j, Locale locale) {
        return getAsShortText(get(j), locale);
    }

    public String getAsShortText(C10224k kVar, int i, Locale locale) {
        return getAsShortText(i, locale);
    }

    public final String getAsShortText(C10224k kVar, Locale locale) {
        return getAsShortText(kVar, kVar.get(getType()), locale);
    }

    public String getAsText(int i, Locale locale) {
        return Integer.toString(i);
    }

    public final String getAsText(long j) {
        return getAsText(j, (Locale) null);
    }

    public String getAsText(long j, Locale locale) {
        return getAsText(get(j), locale);
    }

    public String getAsText(C10224k kVar, int i, Locale locale) {
        return getAsText(i, locale);
    }

    public final String getAsText(C10224k kVar, Locale locale) {
        return getAsText(kVar, kVar.get(getType()), locale);
    }

    public int getDifference(long j, long j2) {
        return getDurationField().getDifference(j, j2);
    }

    public long getDifferenceAsLong(long j, long j2) {
        return getDurationField().getDifferenceAsLong(j, j2);
    }

    public int getLeapAmount(long j) {
        return 0;
    }

    public C10172d getLeapDurationField() {
        return null;
    }

    public int getMaximumShortTextLength(Locale locale) {
        return getMaximumTextLength(locale);
    }

    public int getMaximumTextLength(Locale locale) {
        int maximumValue = getMaximumValue();
        if (maximumValue >= 0) {
            if (maximumValue < 10) {
                return 1;
            }
            if (maximumValue < 100) {
                return 2;
            }
            if (maximumValue < 1000) {
                return 3;
            }
        }
        return Integer.toString(maximumValue).length();
    }

    public int getMaximumValue(long j) {
        return getMaximumValue();
    }

    public int getMaximumValue(C10224k kVar) {
        return getMaximumValue();
    }

    public int getMaximumValue(C10224k kVar, int[] iArr) {
        return getMaximumValue(kVar);
    }

    public int getMinimumValue(long j) {
        return getMinimumValue();
    }

    public int getMinimumValue(C10224k kVar) {
        return getMinimumValue();
    }

    public int getMinimumValue(C10224k kVar, int[] iArr) {
        return getMinimumValue(kVar);
    }

    public final String getName() {
        return this.f18834a.getName();
    }

    public final DateTimeFieldType getType() {
        return this.f18834a;
    }

    public boolean isLeap(long j) {
        return false;
    }

    public final boolean isSupported() {
        return true;
    }

    public long remainder(long j) {
        return j - roundFloor(j);
    }

    public long roundCeiling(long j) {
        long roundFloor = roundFloor(j);
        return roundFloor != j ? add(roundFloor, 1) : j;
    }

    public long roundHalfCeiling(long j) {
        long roundFloor = roundFloor(j);
        long roundCeiling = roundCeiling(j);
        return roundCeiling - j <= j - roundFloor ? roundCeiling : roundFloor;
    }

    public long roundHalfEven(long j) {
        long roundFloor = roundFloor(j);
        long roundCeiling = roundCeiling(j);
        long j2 = j - roundFloor;
        long j3 = roundCeiling - j;
        return j2 < j3 ? roundFloor : (j3 >= j2 && (get(roundCeiling) & 1) != 0) ? roundFloor : roundCeiling;
    }

    public long roundHalfFloor(long j) {
        long roundFloor = roundFloor(j);
        long roundCeiling = roundCeiling(j);
        return j - roundFloor <= roundCeiling - j ? roundFloor : roundCeiling;
    }

    public final long set(long j, String str) {
        return set(j, str, (Locale) null);
    }

    public long set(long j, String str, Locale locale) {
        return set(j, mo41272a(str, locale));
    }

    public int[] set(C10224k kVar, int i, int[] iArr, int i2) {
        C10179e.m25396l(this, i2, getMinimumValue(kVar, iArr), getMaximumValue(kVar, iArr));
        iArr[i] = i2;
        while (true) {
            i++;
            if (i >= kVar.size()) {
                return iArr;
            }
            C10143b field = kVar.getField(i);
            if (iArr[i] > field.getMaximumValue(kVar, iArr)) {
                iArr[i] = field.getMaximumValue(kVar, iArr);
            }
            if (iArr[i] < field.getMinimumValue(kVar, iArr)) {
                iArr[i] = field.getMinimumValue(kVar, iArr);
            }
        }
    }

    public int[] set(C10224k kVar, int i, int[] iArr, String str, Locale locale) {
        return set(kVar, i, iArr, mo41272a(str, locale));
    }

    public String toString() {
        return "DateTimeField[" + getName() + ']';
    }
}
