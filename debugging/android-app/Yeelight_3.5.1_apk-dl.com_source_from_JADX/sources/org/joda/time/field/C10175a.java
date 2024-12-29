package org.joda.time.field;

import java.util.Locale;
import org.joda.time.C10143b;
import org.joda.time.C10172d;
import org.joda.time.C10222i;
import org.joda.time.C10224k;
import org.joda.time.DateTimeFieldType;

/* renamed from: org.joda.time.field.a */
public abstract class C10175a {
    protected C10175a() {
    }

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
        throw new IllegalArgumentException("The instant must not be null");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10175a)) {
            return false;
        }
        C10175a aVar = (C10175a) obj;
        return get() == aVar.get() && getFieldType() == aVar.getFieldType() && C10179e.m25385a(getReadablePartial().getChronology(), aVar.getReadablePartial().getChronology());
    }

    public abstract int get();

    public String getAsShortText() {
        return getAsShortText((Locale) null);
    }

    public String getAsShortText(Locale locale) {
        return getField().getAsShortText(getReadablePartial(), get(), locale);
    }

    public String getAsString() {
        return Integer.toString(get());
    }

    public String getAsText() {
        return getAsText((Locale) null);
    }

    public String getAsText(Locale locale) {
        return getField().getAsText(getReadablePartial(), get(), locale);
    }

    public C10172d getDurationField() {
        return getField().getDurationField();
    }

    public abstract C10143b getField();

    public DateTimeFieldType getFieldType() {
        return getField().getType();
    }

    public int getMaximumShortTextLength(Locale locale) {
        return getField().getMaximumShortTextLength(locale);
    }

    public int getMaximumTextLength(Locale locale) {
        return getField().getMaximumTextLength(locale);
    }

    public int getMaximumValue() {
        return getField().getMaximumValue(getReadablePartial());
    }

    public int getMaximumValueOverall() {
        return getField().getMaximumValue();
    }

    public int getMinimumValue() {
        return getField().getMinimumValue(getReadablePartial());
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

    /* access modifiers changed from: protected */
    public abstract C10224k getReadablePartial();

    public int hashCode() {
        return ((((247 + get()) * 13) + getFieldType().hashCode()) * 13) + getReadablePartial().getChronology().hashCode();
    }

    public String toString() {
        return "Property[" + getName() + "]";
    }
}
