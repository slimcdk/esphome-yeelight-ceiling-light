package p153e7;

import androidx.core.location.LocationRequestCompat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.joda.time.C10142a;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/* renamed from: e7.b */
final class C9006b extends C9005a implements C9013h, C9017l {

    /* renamed from: a */
    static final C9006b f16515a = new C9006b();

    protected C9006b() {
    }

    /* renamed from: a */
    public C10142a mo36861a(Object obj, C10142a aVar) {
        DateTimeZone dateTimeZone;
        if (aVar != null) {
            return aVar;
        }
        Calendar calendar = (Calendar) obj;
        try {
            dateTimeZone = DateTimeZone.forTimeZone(calendar.getTimeZone());
        } catch (IllegalArgumentException unused) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        return mo36862b(calendar, dateTimeZone);
    }

    /* renamed from: b */
    public C10142a mo36862b(Object obj, DateTimeZone dateTimeZone) {
        if (obj.getClass().getName().endsWith(".BuddhistCalendar")) {
            return BuddhistChronology.getInstance(dateTimeZone);
        }
        if (!(obj instanceof GregorianCalendar)) {
            return ISOChronology.getInstance(dateTimeZone);
        }
        long time = ((GregorianCalendar) obj).getGregorianChange().getTime();
        return time == Long.MIN_VALUE ? GregorianChronology.getInstance(dateTimeZone) : time == LocationRequestCompat.PASSIVE_INTERVAL ? JulianChronology.getInstance(dateTimeZone) : GJChronology.getInstance(dateTimeZone, time, 4);
    }

    /* renamed from: d */
    public long mo36864d(Object obj, C10142a aVar) {
        return ((Calendar) obj).getTime().getTime();
    }

    /* renamed from: g */
    public Class<?> mo36869g() {
        return Calendar.class;
    }
}
