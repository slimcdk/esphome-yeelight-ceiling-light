package org.joda.time.field;

import org.joda.time.C10143b;

public class StrictDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = 3154803964207950910L;

    protected StrictDateTimeField(C10143b bVar) {
        super(bVar);
    }

    public static C10143b getInstance(C10143b bVar) {
        if (bVar == null) {
            return null;
        }
        if (bVar instanceof LenientDateTimeField) {
            bVar = ((LenientDateTimeField) bVar).getWrappedField();
        }
        return !bVar.isLenient() ? bVar : new StrictDateTimeField(bVar);
    }

    public final boolean isLenient() {
        return false;
    }

    public long set(long j, int i) {
        C10179e.m25396l(this, i, getMinimumValue(j), getMaximumValue(j));
        return super.set(j, i);
    }
}
