package org.joda.time.field;

import org.joda.time.C10142a;
import org.joda.time.C10143b;

public class LenientDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = 8714085824173290599L;
    private final C10142a iBase;

    protected LenientDateTimeField(C10143b bVar, C10142a aVar) {
        super(bVar);
        this.iBase = aVar;
    }

    public static C10143b getInstance(C10143b bVar, C10142a aVar) {
        if (bVar == null) {
            return null;
        }
        if (bVar instanceof StrictDateTimeField) {
            bVar = ((StrictDateTimeField) bVar).getWrappedField();
        }
        return bVar.isLenient() ? bVar : new LenientDateTimeField(bVar, aVar);
    }

    public final boolean isLenient() {
        return true;
    }

    public long set(long j, int i) {
        return this.iBase.getZone().convertLocalToUTC(getType().getField(this.iBase.withUTC()).add(this.iBase.getZone().convertUTCToLocal(j), C10179e.m25394j((long) i, (long) get(j))), false, j);
    }
}
