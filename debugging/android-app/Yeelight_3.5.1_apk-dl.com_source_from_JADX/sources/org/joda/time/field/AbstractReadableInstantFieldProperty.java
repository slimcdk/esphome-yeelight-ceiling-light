package org.joda.time.field;

import java.io.Serializable;
import java.util.Locale;
import org.joda.time.C10142a;
import org.joda.time.C10143b;
import org.joda.time.C10149c;
import org.joda.time.C10172d;
import org.joda.time.C10222i;
import org.joda.time.C10224k;
import org.joda.time.DateTimeFieldType;
import org.joda.time.Interval;

public abstract class AbstractReadableInstantFieldProperty implements Serializable {
    private static final long serialVersionUID = 1971226328211649661L;

    public int compareTo(C10222i iVar) {
        if (iVar != null) {
            int i = get();
            int i2 = iVar.get(getFieldType());
            if (i < i2) {
                return -1;
            }
            return i > i2 ? 1 : 0;
        }
        throw new IllegalArgumentException("The instant must not be null");
    }

    public int compareTo(C10224k kVar) {
        if (kVar != null) {
            int i = get();
            int i2 = kVar.get(getFieldType());
            if (i < i2) {
                return -1;
            }
            return i > i2 ? 1 : 0;
        }
        throw new IllegalArgumentException("The partial must not be null");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractReadableInstantFieldProperty)) {
            return false;
        }
        AbstractReadableInstantFieldProperty abstractReadableInstantFieldProperty = (AbstractReadableInstantFieldProperty) obj;
        return get() == abstractReadableInstantFieldProperty.get() && getFieldType().equals(abstractReadableInstantFieldProperty.getFieldType()) && C10179e.m25385a(getChronology(), abstractReadableInstantFieldProperty.getChronology());
    }

    public int get() {
        return getField().get(getMillis());
    }

    public String getAsShortText() {
        return getAsShortText((Locale) null);
    }

    public String getAsShortText(Locale locale) {
        return getField().getAsShortText(getMillis(), locale);
    }

    public String getAsString() {
        return Integer.toString(get());
    }

    public String getAsText() {
        return getAsText((Locale) null);
    }

    public String getAsText(Locale locale) {
        return getField().getAsText(getMillis(), locale);
    }

    /* access modifiers changed from: protected */
    public C10142a getChronology() {
        throw new UnsupportedOperationException("The method getChronology() was added in v1.4 and needs to be implemented by subclasses of AbstractReadableInstantFieldProperty");
    }

    public int getDifference(C10222i iVar) {
        return iVar == null ? getField().getDifference(getMillis(), C10149c.m25336a()) : getField().getDifference(getMillis(), iVar.getMillis());
    }

    public long getDifferenceAsLong(C10222i iVar) {
        return iVar == null ? getField().getDifferenceAsLong(getMillis(), C10149c.m25336a()) : getField().getDifferenceAsLong(getMillis(), iVar.getMillis());
    }

    public C10172d getDurationField() {
        return getField().getDurationField();
    }

    public abstract C10143b getField();

    public DateTimeFieldType getFieldType() {
        return getField().getType();
    }

    public int getLeapAmount() {
        return getField().getLeapAmount(getMillis());
    }

    public C10172d getLeapDurationField() {
        return getField().getLeapDurationField();
    }

    public int getMaximumShortTextLength(Locale locale) {
        return getField().getMaximumShortTextLength(locale);
    }

    public int getMaximumTextLength(Locale locale) {
        return getField().getMaximumTextLength(locale);
    }

    public int getMaximumValue() {
        return getField().getMaximumValue(getMillis());
    }

    public int getMaximumValueOverall() {
        return getField().getMaximumValue();
    }

    /* access modifiers changed from: protected */
    public abstract long getMillis();

    public int getMinimumValue() {
        return getField().getMinimumValue(getMillis());
    }

    public int getMinimumValueOverall() {
        return getField().getMinimumValue();
    }

    public String getName() {
        return getField().getName();
    }

    public C10172d getRangeDurationField() {
        return getField().getRangeDurationField();
    }

    public int hashCode() {
        return (get() * 17) + getFieldType().hashCode() + getChronology().hashCode();
    }

    public boolean isLeap() {
        return getField().isLeap(getMillis());
    }

    public long remainder() {
        return getField().remainder(getMillis());
    }

    public Interval toInterval() {
        C10143b field = getField();
        long roundFloor = field.roundFloor(getMillis());
        return new Interval(roundFloor, field.add(roundFloor, 1));
    }

    public String toString() {
        return "Property[" + getName() + "]";
    }
}
