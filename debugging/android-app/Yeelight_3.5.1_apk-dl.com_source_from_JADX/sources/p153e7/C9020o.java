package p153e7;

import org.joda.time.C10142a;
import org.joda.time.C10149c;
import org.joda.time.C10222i;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.ISOChronology;

/* renamed from: e7.o */
class C9020o extends C9005a implements C9013h, C9017l {

    /* renamed from: a */
    static final C9020o f16530a = new C9020o();

    protected C9020o() {
    }

    /* renamed from: a */
    public C10142a mo36861a(Object obj, C10142a aVar) {
        return aVar == null ? C10149c.m25337b(((C10222i) obj).getChronology()) : aVar;
    }

    /* renamed from: b */
    public C10142a mo36862b(Object obj, DateTimeZone dateTimeZone) {
        C10142a chronology = ((C10222i) obj).getChronology();
        if (chronology == null) {
            return ISOChronology.getInstance(dateTimeZone);
        }
        if (chronology.getZone() == dateTimeZone) {
            return chronology;
        }
        C10142a withZone = chronology.withZone(dateTimeZone);
        return withZone == null ? ISOChronology.getInstance(dateTimeZone) : withZone;
    }

    /* renamed from: d */
    public long mo36864d(Object obj, C10142a aVar) {
        return ((C10222i) obj).getMillis();
    }

    /* renamed from: g */
    public Class<?> mo36869g() {
        return C10222i.class;
    }
}
