package org.joda.time.chrono;

import java.util.HashMap;
import java.util.Map;
import org.joda.time.C10142a;
import org.joda.time.C10143b;
import org.joda.time.C10220g;
import org.joda.time.C10222i;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.C10178d;
import org.joda.time.field.C10180f;
import org.joda.time.field.C10183i;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.field.SkipUndoDateTimeField;

public final class BuddhistChronology extends AssembledChronology {

    /* renamed from: BE */
    public static final int f18779BE = 1;
    private static final int BUDDHIST_OFFSET = 543;
    private static final C10143b ERA_FIELD = new C10162d("BE");
    private static final BuddhistChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);
    private static final Map<DateTimeZone, BuddhistChronology> cCache = new HashMap();
    private static final long serialVersionUID = -3474595157769370126L;

    private BuddhistChronology(C10142a aVar, Object obj) {
        super(aVar, obj);
    }

    public static BuddhistChronology getInstance() {
        return getInstance(DateTimeZone.getDefault());
    }

    public static synchronized BuddhistChronology getInstance(DateTimeZone dateTimeZone) {
        BuddhistChronology buddhistChronology;
        synchronized (BuddhistChronology.class) {
            if (dateTimeZone == null) {
                dateTimeZone = DateTimeZone.getDefault();
            }
            Map<DateTimeZone, BuddhistChronology> map = cCache;
            synchronized (map) {
                buddhistChronology = map.get(dateTimeZone);
                if (buddhistChronology == null) {
                    BuddhistChronology buddhistChronology2 = new BuddhistChronology(GJChronology.getInstance(dateTimeZone, (C10222i) null), (Object) null);
                    BuddhistChronology buddhistChronology3 = new BuddhistChronology(LimitChronology.getInstance(buddhistChronology2, new DateTime(1, 1, 1, 0, 0, 0, 0, (C10142a) buddhistChronology2), (C10220g) null), "");
                    map.put(dateTimeZone, buddhistChronology3);
                    buddhistChronology = buddhistChronology3;
                }
            }
        }
        return buddhistChronology;
    }

    public static BuddhistChronology getInstanceUTC() {
        return INSTANCE_UTC;
    }

    private Object readResolve() {
        C10142a base = getBase();
        return base == null ? getInstanceUTC() : getInstance(base.getZone());
    }

    /* access modifiers changed from: protected */
    public void assemble(AssembledChronology.C10152a aVar) {
        if (getParam() == null) {
            C10180f fVar = new C10180f(new SkipUndoDateTimeField(this, aVar.f18746E), BUDDHIST_OFFSET);
            aVar.f18746E = fVar;
            aVar.f18747F = new DelegatedDateTimeField(fVar, DateTimeFieldType.yearOfEra());
            aVar.f18743B = new C10180f(new SkipUndoDateTimeField(this, aVar.f18743B), BUDDHIST_OFFSET);
            C10178d dVar = new C10178d(new C10180f(aVar.f18747F, 99), DateTimeFieldType.centuryOfEra(), 100);
            aVar.f18749H = dVar;
            aVar.f18748G = new C10180f(new C10183i(dVar), DateTimeFieldType.yearOfCentury(), 1);
            aVar.f18744C = new C10180f(new C10183i(aVar.f18743B, DateTimeFieldType.weekyearOfCentury(), 100), DateTimeFieldType.weekyearOfCentury(), 1);
            aVar.f18750I = ERA_FIELD;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BuddhistChronology) {
            return getZone().equals(((BuddhistChronology) obj).getZone());
        }
        return false;
    }

    public int hashCode() {
        return 499287079 + getZone().hashCode();
    }

    public String toString() {
        DateTimeZone zone = getZone();
        if (zone == null) {
            return "BuddhistChronology";
        }
        return "BuddhistChronology" + '[' + zone.getID() + ']';
    }

    public C10142a withUTC() {
        return INSTANCE_UTC;
    }

    public C10142a withZone(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        return dateTimeZone == getZone() ? this : getInstance(dateTimeZone);
    }
}
