package org.joda.time.chrono;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.C10142a;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.C10178d;
import org.joda.time.field.C10183i;

public final class ISOChronology extends AssembledChronology {
    private static final int FAST_CACHE_SIZE = 64;
    private static final ISOChronology INSTANCE_UTC;
    private static final Map<DateTimeZone, ISOChronology> cCache;
    private static final ISOChronology[] cFastCache = new ISOChronology[64];
    private static final long serialVersionUID = -6212696554273812441L;

    private static final class Stub implements Serializable {
        private static final long serialVersionUID = -6212696554273812441L;
        private transient DateTimeZone iZone;

        Stub(DateTimeZone dateTimeZone) {
            this.iZone = dateTimeZone;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            this.iZone = (DateTimeZone) objectInputStream.readObject();
        }

        private Object readResolve() {
            return ISOChronology.getInstance(this.iZone);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.writeObject(this.iZone);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        cCache = hashMap;
        ISOChronology iSOChronology = new ISOChronology(GregorianChronology.getInstanceUTC());
        INSTANCE_UTC = iSOChronology;
        hashMap.put(DateTimeZone.UTC, iSOChronology);
    }

    private ISOChronology(C10142a aVar) {
        super(aVar, (Object) null);
    }

    public static ISOChronology getInstance() {
        return getInstance(DateTimeZone.getDefault());
    }

    public static ISOChronology getInstance(DateTimeZone dateTimeZone) {
        ISOChronology iSOChronology;
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        int identityHashCode = System.identityHashCode(dateTimeZone) & 63;
        ISOChronology[] iSOChronologyArr = cFastCache;
        ISOChronology iSOChronology2 = iSOChronologyArr[identityHashCode];
        if (iSOChronology2 != null && iSOChronology2.getZone() == dateTimeZone) {
            return iSOChronology2;
        }
        Map<DateTimeZone, ISOChronology> map = cCache;
        synchronized (map) {
            iSOChronology = map.get(dateTimeZone);
            if (iSOChronology == null) {
                iSOChronology = new ISOChronology(ZonedChronology.getInstance(INSTANCE_UTC, dateTimeZone));
                map.put(dateTimeZone, iSOChronology);
            }
        }
        iSOChronologyArr[identityHashCode] = iSOChronology;
        return iSOChronology;
    }

    public static ISOChronology getInstanceUTC() {
        return INSTANCE_UTC;
    }

    private Object writeReplace() {
        return new Stub(getZone());
    }

    /* access modifiers changed from: protected */
    public void assemble(AssembledChronology.C10152a aVar) {
        if (getBase().getZone() == DateTimeZone.UTC) {
            C10178d dVar = new C10178d(C10171m.f18831c, DateTimeFieldType.centuryOfEra(), 100);
            aVar.f18749H = dVar;
            aVar.f18748G = new C10183i(dVar, DateTimeFieldType.yearOfCentury());
            aVar.f18744C = new C10183i((C10178d) aVar.f18749H, DateTimeFieldType.weekyearOfCentury());
            aVar.f18761k = aVar.f18749H.getDurationField();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ISOChronology) {
            return getZone().equals(((ISOChronology) obj).getZone());
        }
        return false;
    }

    public int hashCode() {
        return 800855 + getZone().hashCode();
    }

    public String toString() {
        DateTimeZone zone = getZone();
        if (zone == null) {
            return "ISOChronology";
        }
        return "ISOChronology" + '[' + zone.getID() + ']';
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
