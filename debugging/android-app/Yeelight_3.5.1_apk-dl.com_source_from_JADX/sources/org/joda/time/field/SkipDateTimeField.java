package org.joda.time.field;

import org.joda.time.C10142a;
import org.joda.time.C10143b;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

public final class SkipDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = -8869148464118507846L;
    private final C10142a iChronology;
    private transient int iMinValue;
    private final int iSkip;

    public SkipDateTimeField(C10142a aVar, C10143b bVar) {
        this(aVar, bVar, 0);
    }

    public SkipDateTimeField(C10142a aVar, C10143b bVar, int i) {
        super(bVar);
        this.iChronology = aVar;
        int minimumValue = super.getMinimumValue();
        if (minimumValue < i) {
            minimumValue--;
        } else if (minimumValue == i) {
            minimumValue = i + 1;
        }
        this.iMinValue = minimumValue;
        this.iSkip = i;
    }

    private Object readResolve() {
        return getType().getField(this.iChronology);
    }

    public int get(long j) {
        int i = super.get(j);
        return i <= this.iSkip ? i - 1 : i;
    }

    public int getMinimumValue() {
        return this.iMinValue;
    }

    public long set(long j, int i) {
        C10179e.m25396l(this, i, this.iMinValue, getMaximumValue());
        int i2 = this.iSkip;
        if (i <= i2) {
            if (i != i2) {
                i++;
            } else {
                throw new IllegalFieldValueException(DateTimeFieldType.year(), (Number) Integer.valueOf(i), (Number) null, (Number) null);
            }
        }
        return super.set(j, i);
    }
}
