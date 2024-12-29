package org.joda.time;

import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.joda.time.chrono.ISOChronology;

/* renamed from: org.joda.time.c */
public class C10149c {

    /* renamed from: a */
    private static final C10151b f18739a;

    /* renamed from: b */
    private static volatile C10150a f18740b;

    /* renamed from: c */
    private static volatile Map<String, DateTimeZone> f18741c;

    /* renamed from: org.joda.time.c$a */
    public interface C10150a {
        long getMillis();
    }

    /* renamed from: org.joda.time.c$b */
    static class C10151b implements C10150a {
        C10151b() {
        }

        public long getMillis() {
            return System.currentTimeMillis();
        }
    }

    static {
        C10151b bVar = new C10151b();
        f18739a = bVar;
        f18740b = bVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        DateTimeZone dateTimeZone = DateTimeZone.UTC;
        linkedHashMap.put("UT", dateTimeZone);
        linkedHashMap.put("UTC", dateTimeZone);
        linkedHashMap.put("GMT", dateTimeZone);
        m25349n(linkedHashMap, "EST", "America/New_York");
        m25349n(linkedHashMap, "EDT", "America/New_York");
        m25349n(linkedHashMap, "CST", "America/Chicago");
        m25349n(linkedHashMap, "CDT", "America/Chicago");
        m25349n(linkedHashMap, "MST", "America/Denver");
        m25349n(linkedHashMap, "MDT", "America/Denver");
        m25349n(linkedHashMap, "PST", "America/Los_Angeles");
        m25349n(linkedHashMap, "PDT", "America/Los_Angeles");
        f18741c = Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: a */
    public static final long m25336a() {
        return f18740b.getMillis();
    }

    /* renamed from: b */
    public static final C10142a m25337b(C10142a aVar) {
        return aVar == null ? ISOChronology.getInstance() : aVar;
    }

    /* renamed from: c */
    public static final DateFormatSymbols m25338c(Locale locale) {
        try {
            return (DateFormatSymbols) DateFormatSymbols.class.getMethod("getInstance", new Class[]{Locale.class}).invoke((Object) null, new Object[]{locale});
        } catch (Exception unused) {
            return new DateFormatSymbols(locale);
        }
    }

    /* renamed from: d */
    public static final Map<String, DateTimeZone> m25339d() {
        return f18741c;
    }

    /* renamed from: e */
    public static final long m25340e(C10221h hVar) {
        if (hVar == null) {
            return 0;
        }
        return hVar.getMillis();
    }

    /* renamed from: f */
    public static final C10142a m25341f(C10222i iVar) {
        if (iVar == null) {
            return ISOChronology.getInstance();
        }
        C10142a chronology = iVar.getChronology();
        return chronology == null ? ISOChronology.getInstance() : chronology;
    }

    /* renamed from: g */
    public static final long m25342g(C10222i iVar) {
        return iVar == null ? m25336a() : iVar.getMillis();
    }

    /* renamed from: h */
    public static final C10142a m25343h(C10222i iVar, C10222i iVar2) {
        C10142a chronology = iVar != null ? iVar.getChronology() : iVar2 != null ? iVar2.getChronology() : null;
        return chronology == null ? ISOChronology.getInstance() : chronology;
    }

    /* renamed from: i */
    public static final C10142a m25344i(C10223j jVar) {
        if (jVar == null) {
            return ISOChronology.getInstance();
        }
        C10142a chronology = jVar.getChronology();
        return chronology == null ? ISOChronology.getInstance() : chronology;
    }

    /* renamed from: j */
    public static final PeriodType m25345j(PeriodType periodType) {
        return periodType == null ? PeriodType.standard() : periodType;
    }

    /* renamed from: k */
    public static final C10223j m25346k(C10223j jVar) {
        if (jVar != null) {
            return jVar;
        }
        long a = m25336a();
        return new Interval(a, a);
    }

    /* renamed from: l */
    public static final DateTimeZone m25347l(DateTimeZone dateTimeZone) {
        return dateTimeZone == null ? DateTimeZone.getDefault() : dateTimeZone;
    }

    /* renamed from: m */
    public static final boolean m25348m(C10224k kVar) {
        if (kVar != null) {
            DurationFieldType durationFieldType = null;
            for (int i = 0; i < kVar.size(); i++) {
                C10143b field = kVar.getField(i);
                if (i > 0 && field.getRangeDurationField().getType() != durationFieldType) {
                    return false;
                }
                durationFieldType = field.getDurationField().getType();
            }
            return true;
        }
        throw new IllegalArgumentException("Partial must not be null");
    }

    /* renamed from: n */
    private static void m25349n(Map<String, DateTimeZone> map, String str, String str2) {
        try {
            map.put(str, DateTimeZone.forID(str2));
        } catch (RuntimeException unused) {
        }
    }
}
