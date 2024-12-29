package org.joda.time.field;

import java.io.Serializable;
import java.util.Locale;
import org.joda.time.C10143b;
import org.joda.time.C10172d;
import org.joda.time.C10224k;
import org.joda.time.DateTimeFieldType;

public class DelegatedDateTimeField extends C10143b implements Serializable {
    private static final long serialVersionUID = -4730164440214502503L;
    private final C10143b iField;
    private final DateTimeFieldType iType;

    public DelegatedDateTimeField(C10143b bVar) {
        this(bVar, (DateTimeFieldType) null);
    }

    public DelegatedDateTimeField(C10143b bVar, DateTimeFieldType dateTimeFieldType) {
        if (bVar != null) {
            this.iField = bVar;
            this.iType = dateTimeFieldType == null ? bVar.getType() : dateTimeFieldType;
            return;
        }
        throw new IllegalArgumentException("The field must not be null");
    }

    public long add(long j, int i) {
        return this.iField.add(j, i);
    }

    public long add(long j, long j2) {
        return this.iField.add(j, j2);
    }

    public int[] add(C10224k kVar, int i, int[] iArr, int i2) {
        return this.iField.add(kVar, i, iArr, i2);
    }

    public long addWrapField(long j, int i) {
        return this.iField.addWrapField(j, i);
    }

    public int[] addWrapField(C10224k kVar, int i, int[] iArr, int i2) {
        return this.iField.addWrapField(kVar, i, iArr, i2);
    }

    public int[] addWrapPartial(C10224k kVar, int i, int[] iArr, int i2) {
        return this.iField.addWrapPartial(kVar, i, iArr, i2);
    }

    public int get(long j) {
        return this.iField.get(j);
    }

    public String getAsShortText(int i, Locale locale) {
        return this.iField.getAsShortText(i, locale);
    }

    public String getAsShortText(long j) {
        return this.iField.getAsShortText(j);
    }

    public String getAsShortText(long j, Locale locale) {
        return this.iField.getAsShortText(j, locale);
    }

    public String getAsShortText(C10224k kVar, int i, Locale locale) {
        return this.iField.getAsShortText(kVar, i, locale);
    }

    public String getAsShortText(C10224k kVar, Locale locale) {
        return this.iField.getAsShortText(kVar, locale);
    }

    public String getAsText(int i, Locale locale) {
        return this.iField.getAsText(i, locale);
    }

    public String getAsText(long j) {
        return this.iField.getAsText(j);
    }

    public String getAsText(long j, Locale locale) {
        return this.iField.getAsText(j, locale);
    }

    public String getAsText(C10224k kVar, int i, Locale locale) {
        return this.iField.getAsText(kVar, i, locale);
    }

    public String getAsText(C10224k kVar, Locale locale) {
        return this.iField.getAsText(kVar, locale);
    }

    public int getDifference(long j, long j2) {
        return this.iField.getDifference(j, j2);
    }

    public long getDifferenceAsLong(long j, long j2) {
        return this.iField.getDifferenceAsLong(j, j2);
    }

    public C10172d getDurationField() {
        return this.iField.getDurationField();
    }

    public int getLeapAmount(long j) {
        return this.iField.getLeapAmount(j);
    }

    public C10172d getLeapDurationField() {
        return this.iField.getLeapDurationField();
    }

    public int getMaximumShortTextLength(Locale locale) {
        return this.iField.getMaximumShortTextLength(locale);
    }

    public int getMaximumTextLength(Locale locale) {
        return this.iField.getMaximumTextLength(locale);
    }

    public int getMaximumValue() {
        return this.iField.getMaximumValue();
    }

    public int getMaximumValue(long j) {
        return this.iField.getMaximumValue(j);
    }

    public int getMaximumValue(C10224k kVar) {
        return this.iField.getMaximumValue(kVar);
    }

    public int getMaximumValue(C10224k kVar, int[] iArr) {
        return this.iField.getMaximumValue(kVar, iArr);
    }

    public int getMinimumValue() {
        return this.iField.getMinimumValue();
    }

    public int getMinimumValue(long j) {
        return this.iField.getMinimumValue(j);
    }

    public int getMinimumValue(C10224k kVar) {
        return this.iField.getMinimumValue(kVar);
    }

    public int getMinimumValue(C10224k kVar, int[] iArr) {
        return this.iField.getMinimumValue(kVar, iArr);
    }

    public String getName() {
        return this.iType.getName();
    }

    public C10172d getRangeDurationField() {
        return this.iField.getRangeDurationField();
    }

    public DateTimeFieldType getType() {
        return this.iType;
    }

    public final C10143b getWrappedField() {
        return this.iField;
    }

    public boolean isLeap(long j) {
        return this.iField.isLeap(j);
    }

    public boolean isLenient() {
        return this.iField.isLenient();
    }

    public boolean isSupported() {
        return this.iField.isSupported();
    }

    public long remainder(long j) {
        return this.iField.remainder(j);
    }

    public long roundCeiling(long j) {
        return this.iField.roundCeiling(j);
    }

    public long roundFloor(long j) {
        return this.iField.roundFloor(j);
    }

    public long roundHalfCeiling(long j) {
        return this.iField.roundHalfCeiling(j);
    }

    public long roundHalfEven(long j) {
        return this.iField.roundHalfEven(j);
    }

    public long roundHalfFloor(long j) {
        return this.iField.roundHalfFloor(j);
    }

    public long set(long j, int i) {
        return this.iField.set(j, i);
    }

    public long set(long j, String str) {
        return this.iField.set(j, str);
    }

    public long set(long j, String str, Locale locale) {
        return this.iField.set(j, str, locale);
    }

    public int[] set(C10224k kVar, int i, int[] iArr, int i2) {
        return this.iField.set(kVar, i, iArr, i2);
    }

    public int[] set(C10224k kVar, int i, int[] iArr, String str, Locale locale) {
        return this.iField.set(kVar, i, iArr, str, locale);
    }

    public String toString() {
        return "DateTimeField[" + getName() + ']';
    }
}
