package org.joda.time.chrono;

import org.joda.time.C10142a;
import org.joda.time.C10143b;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.LenientDateTimeField;

public final class LenientChronology extends AssembledChronology {
    private static final long serialVersionUID = -3148237568046877177L;
    private transient C10142a iWithUTC;

    private LenientChronology(C10142a aVar) {
        super(aVar, (Object) null);
    }

    private final C10143b convertField(C10143b bVar) {
        return LenientDateTimeField.getInstance(bVar, getBase());
    }

    public static LenientChronology getInstance(C10142a aVar) {
        if (aVar != null) {
            return new LenientChronology(aVar);
        }
        throw new IllegalArgumentException("Must supply a chronology");
    }

    /* access modifiers changed from: protected */
    public void assemble(AssembledChronology.C10152a aVar) {
        aVar.f18746E = convertField(aVar.f18746E);
        aVar.f18747F = convertField(aVar.f18747F);
        aVar.f18748G = convertField(aVar.f18748G);
        aVar.f18749H = convertField(aVar.f18749H);
        aVar.f18750I = convertField(aVar.f18750I);
        aVar.f18774x = convertField(aVar.f18774x);
        aVar.f18775y = convertField(aVar.f18775y);
        aVar.f18776z = convertField(aVar.f18776z);
        aVar.f18745D = convertField(aVar.f18745D);
        aVar.f18742A = convertField(aVar.f18742A);
        aVar.f18743B = convertField(aVar.f18743B);
        aVar.f18744C = convertField(aVar.f18744C);
        aVar.f18763m = convertField(aVar.f18763m);
        aVar.f18764n = convertField(aVar.f18764n);
        aVar.f18765o = convertField(aVar.f18765o);
        aVar.f18766p = convertField(aVar.f18766p);
        aVar.f18767q = convertField(aVar.f18767q);
        aVar.f18768r = convertField(aVar.f18768r);
        aVar.f18769s = convertField(aVar.f18769s);
        aVar.f18771u = convertField(aVar.f18771u);
        aVar.f18770t = convertField(aVar.f18770t);
        aVar.f18772v = convertField(aVar.f18772v);
        aVar.f18773w = convertField(aVar.f18773w);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LenientChronology)) {
            return false;
        }
        return getBase().equals(((LenientChronology) obj).getBase());
    }

    public int hashCode() {
        return (getBase().hashCode() * 7) + 236548278;
    }

    public String toString() {
        return "LenientChronology[" + getBase().toString() + ']';
    }

    public C10142a withUTC() {
        if (this.iWithUTC == null) {
            if (getZone() == DateTimeZone.UTC) {
                this.iWithUTC = this;
            } else {
                this.iWithUTC = getInstance(getBase().withUTC());
            }
        }
        return this.iWithUTC;
    }

    public C10142a withZone(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        return dateTimeZone == DateTimeZone.UTC ? withUTC() : dateTimeZone == getZone() ? this : getInstance(getBase().withZone(dateTimeZone));
    }
}
