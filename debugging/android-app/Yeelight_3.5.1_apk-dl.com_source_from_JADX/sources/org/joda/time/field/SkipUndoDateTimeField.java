package org.joda.time.field;

import org.joda.time.C10142a;
import org.joda.time.C10143b;

public final class SkipUndoDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = -5875876968979L;
    private final C10142a iChronology;
    private transient int iMinValue;
    private final int iSkip;

    public SkipUndoDateTimeField(C10142a aVar, C10143b bVar) {
        this(aVar, bVar, 0);
    }

    public SkipUndoDateTimeField(C10142a aVar, C10143b bVar, int i) {
        super(bVar);
        this.iChronology = aVar;
        int minimumValue = super.getMinimumValue();
        if (minimumValue < i) {
            minimumValue++;
        } else if (minimumValue == i + 1) {
            this.iMinValue = i;
            this.iSkip = i;
        }
        this.iMinValue = minimumValue;
        this.iSkip = i;
    }

    private Object readResolve() {
        return getType().getField(this.iChronology);
    }

    public int get(long j) {
        int i = super.get(j);
        return i < this.iSkip ? i + 1 : i;
    }

    public int getMinimumValue() {
        return this.iMinValue;
    }

    public long set(long j, int i) {
        C10179e.m25396l(this, i, this.iMinValue, getMaximumValue());
        if (i <= this.iSkip) {
            i--;
        }
        return super.set(j, i);
    }
}
