package org.joda.time;

import com.xiaomi.mipush.sdk.Constants;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import org.apache.commons.p194io.FilenameUtils;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.field.C10179e;
import org.joda.time.format.C10199a;
import org.joda.time.format.C10205e;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.p196tz.C10230a;
import org.joda.time.p196tz.C10231b;
import org.joda.time.p196tz.C10232c;
import org.joda.time.p196tz.C10233d;
import org.joda.time.p196tz.C10236f;
import org.joda.time.p196tz.FixedDateTimeZone;
import org.slf4j.Marker;

public abstract class DateTimeZone implements Serializable {
    private static final int MAX_MILLIS = 86399999;
    public static final DateTimeZone UTC = new FixedDateTimeZone("UTC", "UTC", 0, 0);
    private static Set<String> cAvailableIDs = null;
    private static volatile DateTimeZone cDefault = null;
    private static C10231b cNameProvider = null;
    private static C10199a cOffsetFormatter = null;
    private static C10232c cProvider = null;
    private static Map<String, String> cZoneIdConversion = null;
    private static Map<String, SoftReference<DateTimeZone>> iFixedOffsetCache = null;
    private static final long serialVersionUID = 5546345482340108586L;
    private final String iID;

    private static final class Stub implements Serializable {
        private static final long serialVersionUID = -6471952376487863581L;
        private transient String iID;

        Stub(String str) {
            this.iID = str;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            this.iID = objectInputStream.readUTF();
        }

        private Object readResolve() {
            return DateTimeZone.forID(this.iID);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.writeUTF(this.iID);
        }
    }

    static {
        setProvider0((C10232c) null);
        setNameProvider0((C10231b) null);
    }

    protected DateTimeZone(String str) {
        if (str != null) {
            this.iID = str;
            return;
        }
        throw new IllegalArgumentException("Id must not be null");
    }

    private static synchronized DateTimeZone fixedOffsetZone(String str, int i) {
        DateTimeZone dateTimeZone;
        synchronized (DateTimeZone.class) {
            if (i == 0) {
                DateTimeZone dateTimeZone2 = UTC;
                return dateTimeZone2;
            }
            if (iFixedOffsetCache == null) {
                iFixedOffsetCache = new HashMap();
            }
            Reference reference = iFixedOffsetCache.get(str);
            if (reference != null && (dateTimeZone = (DateTimeZone) reference.get()) != null) {
                return dateTimeZone;
            }
            FixedDateTimeZone fixedDateTimeZone = new FixedDateTimeZone(str, (String) null, i, i);
            iFixedOffsetCache.put(str, new SoftReference(fixedDateTimeZone));
            return fixedDateTimeZone;
        }
    }

    @FromString
    public static DateTimeZone forID(String str) {
        if (str == null) {
            return getDefault();
        }
        if (str.equals("UTC")) {
            return UTC;
        }
        DateTimeZone a = cProvider.mo41524a(str);
        if (a != null) {
            return a;
        }
        if (str.startsWith(Marker.ANY_NON_NULL_MARKER) || str.startsWith(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
            int parseOffset = parseOffset(str);
            return ((long) parseOffset) == 0 ? UTC : fixedOffsetZone(printOffset(parseOffset), parseOffset);
        }
        throw new IllegalArgumentException("The datetime zone id '" + str + "' is not recognised");
    }

    public static DateTimeZone forOffsetHours(int i) {
        return forOffsetHoursMinutes(i, 0);
    }

    public static DateTimeZone forOffsetHoursMinutes(int i, int i2) {
        int i3;
        if (i == 0 && i2 == 0) {
            return UTC;
        }
        if (i < -23 || i > 23) {
            throw new IllegalArgumentException("Hours out of range: " + i);
        } else if (i2 < -59 || i2 > 59) {
            throw new IllegalArgumentException("Minutes out of range: " + i2);
        } else if (i <= 0 || i2 >= 0) {
            int i4 = i * 60;
            if (i4 < 0) {
                try {
                    i3 = i4 - Math.abs(i2);
                } catch (ArithmeticException unused) {
                    throw new IllegalArgumentException("Offset is too large");
                }
            } else {
                i3 = i4 + i2;
            }
            return forOffsetMillis(C10179e.m25390f(i3, 60000));
        } else {
            throw new IllegalArgumentException("Positive hours must not have negative minutes: " + i2);
        }
    }

    public static DateTimeZone forOffsetMillis(int i) {
        if (i >= -86399999 && i <= MAX_MILLIS) {
            return fixedOffsetZone(printOffset(i), i);
        }
        throw new IllegalArgumentException("Millis out of range: " + i);
    }

    public static DateTimeZone forTimeZone(TimeZone timeZone) {
        if (timeZone == null) {
            return getDefault();
        }
        String id = timeZone.getID();
        if (id.equals("UTC")) {
            return UTC;
        }
        DateTimeZone dateTimeZone = null;
        String convertedId = getConvertedId(id);
        if (convertedId != null) {
            dateTimeZone = cProvider.mo41524a(convertedId);
        }
        if (dateTimeZone == null) {
            dateTimeZone = cProvider.mo41524a(id);
        }
        if (dateTimeZone != null) {
            return dateTimeZone;
        }
        if (convertedId == null) {
            String id2 = timeZone.getID();
            if (id2.startsWith("GMT+") || id2.startsWith("GMT-")) {
                int parseOffset = parseOffset(id2.substring(3));
                return ((long) parseOffset) == 0 ? UTC : fixedOffsetZone(printOffset(parseOffset), parseOffset);
            }
        }
        throw new IllegalArgumentException("The datetime zone id '" + id + "' is not recognised");
    }

    public static Set<String> getAvailableIDs() {
        return cAvailableIDs;
    }

    private static synchronized String getConvertedId(String str) {
        String str2;
        synchronized (DateTimeZone.class) {
            Map map = cZoneIdConversion;
            if (map == null) {
                map = new HashMap();
                map.put("GMT", "UTC");
                map.put("WET", "WET");
                map.put("CET", "CET");
                map.put("MET", "CET");
                map.put("ECT", "CET");
                map.put("EET", "EET");
                map.put("MIT", "Pacific/Apia");
                map.put("HST", "Pacific/Honolulu");
                map.put("AST", "America/Anchorage");
                map.put("PST", "America/Los_Angeles");
                map.put("MST", "America/Denver");
                map.put("PNT", "America/Phoenix");
                map.put("CST", "America/Chicago");
                map.put("EST", "America/New_York");
                map.put("IET", "America/Indiana/Indianapolis");
                map.put("PRT", "America/Puerto_Rico");
                map.put("CNT", "America/St_Johns");
                map.put("AGT", "America/Argentina/Buenos_Aires");
                map.put("BET", "America/Sao_Paulo");
                map.put("ART", "Africa/Cairo");
                map.put("CAT", "Africa/Harare");
                map.put("EAT", "Africa/Addis_Ababa");
                map.put("NET", "Asia/Yerevan");
                map.put("PLT", "Asia/Karachi");
                map.put("IST", "Asia/Kolkata");
                map.put("BST", "Asia/Dhaka");
                map.put("VST", "Asia/Ho_Chi_Minh");
                map.put("CTT", "Asia/Shanghai");
                map.put("JST", "Asia/Tokyo");
                map.put("ACT", "Australia/Darwin");
                map.put("AET", "Australia/Sydney");
                map.put("SST", "Pacific/Guadalcanal");
                map.put("NST", "Pacific/Auckland");
                cZoneIdConversion = map;
            }
            str2 = (String) map.get(str);
        }
        return str2;
    }

    public static DateTimeZone getDefault() {
        DateTimeZone dateTimeZone = cDefault;
        if (dateTimeZone == null) {
            synchronized (DateTimeZone.class) {
                dateTimeZone = cDefault;
                if (dateTimeZone == null) {
                    dateTimeZone = null;
                    try {
                        String property = System.getProperty("user.timezone");
                        if (property != null) {
                            dateTimeZone = forID(property);
                        }
                    } catch (RuntimeException unused) {
                    }
                    if (dateTimeZone == null) {
                        try {
                            dateTimeZone = forTimeZone(TimeZone.getDefault());
                        } catch (IllegalArgumentException unused2) {
                        }
                    }
                    if (dateTimeZone == null) {
                        dateTimeZone = UTC;
                    }
                    cDefault = dateTimeZone;
                }
            }
        }
        return dateTimeZone;
    }

    private static C10231b getDefaultNameProvider() {
        C10231b bVar = null;
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
            if (property != null) {
                try {
                    bVar = (C10231b) Class.forName(property).newInstance();
                } catch (Exception e) {
                    Thread currentThread = Thread.currentThread();
                    currentThread.getThreadGroup().uncaughtException(currentThread, e);
                }
            }
        } catch (SecurityException unused) {
        }
        return bVar == null ? new C10230a() : bVar;
    }

    private static C10232c getDefaultProvider() {
        C10236f fVar = null;
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.Provider");
            if (property != null) {
                try {
                    fVar = (C10232c) Class.forName(property).newInstance();
                } catch (Exception e) {
                    Thread currentThread = Thread.currentThread();
                    currentThread.getThreadGroup().uncaughtException(currentThread, e);
                }
            }
        } catch (SecurityException unused) {
        }
        if (fVar == null) {
            try {
                fVar = new C10236f("org/joda/time/tz/data");
            } catch (Exception e2) {
                Thread currentThread2 = Thread.currentThread();
                currentThread2.getThreadGroup().uncaughtException(currentThread2, e2);
            }
        }
        return fVar == null ? new C10233d() : fVar;
    }

    public static C10231b getNameProvider() {
        return cNameProvider;
    }

    public static C10232c getProvider() {
        return cProvider;
    }

    private static synchronized C10199a offsetFormatter() {
        C10199a aVar;
        synchronized (DateTimeZone.class) {
            if (cOffsetFormatter == null) {
                cOffsetFormatter = new DateTimeFormatterBuilder().mo41384M((String) null, true, 2, 4).mo41396d0();
            }
            aVar = cOffsetFormatter;
        }
        return aVar;
    }

    private static int parseOffset(String str) {
        return -((int) offsetFormatter().mo41443s(new BaseChronology() {
            private static final long serialVersionUID = -3128740902654445468L;

            public DateTimeZone getZone() {
                return null;
            }

            public String toString() {
                return getClass().getName();
            }

            public C10142a withUTC() {
                return this;
            }

            public C10142a withZone(DateTimeZone dateTimeZone) {
                return this;
            }
        }).mo41437i(str));
    }

    private static String printOffset(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append('-');
            i = -i;
        }
        int i2 = i / 3600000;
        C10205e.m25526a(stringBuffer, i2, 2);
        int i3 = i - (i2 * 3600000);
        int i4 = i3 / 60000;
        stringBuffer.append(':');
        C10205e.m25526a(stringBuffer, i4, 2);
        int i5 = i3 - (i4 * 60000);
        if (i5 == 0) {
            return stringBuffer.toString();
        }
        int i6 = i5 / 1000;
        stringBuffer.append(':');
        C10205e.m25526a(stringBuffer, i6, 2);
        int i7 = i5 - (i6 * 1000);
        if (i7 == 0) {
            return stringBuffer.toString();
        }
        stringBuffer.append(FilenameUtils.EXTENSION_SEPARATOR);
        C10205e.m25526a(stringBuffer, i7, 3);
        return stringBuffer.toString();
    }

    public static void setDefault(DateTimeZone dateTimeZone) {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setDefault"));
        }
        if (dateTimeZone != null) {
            synchronized (DateTimeZone.class) {
                cDefault = dateTimeZone;
            }
            return;
        }
        throw new IllegalArgumentException("The datetime zone must not be null");
    }

    public static void setNameProvider(C10231b bVar) {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setNameProvider"));
        }
        setNameProvider0(bVar);
    }

    private static void setNameProvider0(C10231b bVar) {
        if (bVar == null) {
            bVar = getDefaultNameProvider();
        }
        cNameProvider = bVar;
    }

    public static void setProvider(C10232c cVar) {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setProvider"));
        }
        setProvider0(cVar);
    }

    private static void setProvider0(C10232c cVar) {
        if (cVar == null) {
            cVar = getDefaultProvider();
        }
        Set<String> b = cVar.mo41525b();
        if (b == null || b.size() == 0) {
            throw new IllegalArgumentException("The provider doesn't have any available ids");
        } else if (!b.contains("UTC")) {
            throw new IllegalArgumentException("The provider doesn't support UTC");
        } else if (UTC.equals(cVar.mo41524a("UTC"))) {
            cProvider = cVar;
            cAvailableIDs = b;
        } else {
            throw new IllegalArgumentException("Invalid UTC zone provided");
        }
    }

    public long adjustOffset(long j, boolean z) {
        long j2 = j - 10800000;
        long offset = (long) getOffset(j2);
        long offset2 = (long) getOffset(10800000 + j);
        if (offset <= offset2) {
            return j;
        }
        long j3 = offset - offset2;
        long nextTransition = nextTransition(j2);
        long j4 = nextTransition - j3;
        return (j < j4 || j >= nextTransition + j3) ? j : j - j4 >= j3 ? z ? j : j - j3 : z ? j + j3 : j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long convertLocalToUTC(long r12, boolean r14) {
        /*
            r11 = this;
            int r0 = r11.getOffset((long) r12)
            long r1 = (long) r0
            long r1 = r12 - r1
            int r3 = r11.getOffset((long) r1)
            if (r0 == r3) goto L_0x003d
            if (r14 != 0) goto L_0x0011
            if (r0 >= 0) goto L_0x003d
        L_0x0011:
            long r4 = r11.nextTransition(r1)
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r8 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r8 != 0) goto L_0x001f
            r4 = r6
        L_0x001f:
            long r1 = (long) r3
            long r1 = r12 - r1
            long r8 = r11.nextTransition(r1)
            int r10 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r10 != 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r6 = r8
        L_0x002c:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x003d
            if (r14 != 0) goto L_0x0033
            goto L_0x003e
        L_0x0033:
            org.joda.time.IllegalInstantException r14 = new org.joda.time.IllegalInstantException
            java.lang.String r0 = r11.getID()
            r14.<init>(r12, r0)
            throw r14
        L_0x003d:
            r0 = r3
        L_0x003e:
            long r0 = (long) r0
            long r2 = r12 - r0
            long r4 = r12 ^ r2
            r6 = 0
            int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r14 >= 0) goto L_0x0057
            long r12 = r12 ^ r0
            int r14 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r14 < 0) goto L_0x004f
            goto L_0x0057
        L_0x004f:
            java.lang.ArithmeticException r12 = new java.lang.ArithmeticException
            java.lang.String r13 = "Subtracting time zone offset caused overflow"
            r12.<init>(r13)
            throw r12
        L_0x0057:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.DateTimeZone.convertLocalToUTC(long, boolean):long");
    }

    public long convertLocalToUTC(long j, boolean z, long j2) {
        int offset = getOffset(j2);
        long j3 = j - ((long) offset);
        return getOffset(j3) == offset ? j3 : convertLocalToUTC(j, z);
    }

    public long convertUTCToLocal(long j) {
        long offset = (long) getOffset(j);
        long j2 = j + offset;
        if ((j ^ j2) >= 0 || (j ^ offset) < 0) {
            return j2;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    public abstract boolean equals(Object obj);

    @ToString
    public final String getID() {
        return this.iID;
    }

    public long getMillisKeepLocal(DateTimeZone dateTimeZone, long j) {
        if (dateTimeZone == null) {
            dateTimeZone = getDefault();
        }
        DateTimeZone dateTimeZone2 = dateTimeZone;
        return dateTimeZone2 == this ? j : dateTimeZone2.convertLocalToUTC(convertUTCToLocal(j), false, j);
    }

    public final String getName(long j) {
        return getName(j, (Locale) null);
    }

    public String getName(long j, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String nameKey = getNameKey(j);
        if (nameKey == null) {
            return this.iID;
        }
        String a = cNameProvider.mo41522a(locale, this.iID, nameKey);
        return a != null ? a : printOffset(getOffset(j));
    }

    public abstract String getNameKey(long j);

    public abstract int getOffset(long j);

    public final int getOffset(C10222i iVar) {
        return getOffset(iVar == null ? C10149c.m25336a() : iVar.getMillis());
    }

    public int getOffsetFromLocal(long j) {
        int offset = getOffset(j);
        long j2 = j - ((long) offset);
        int offset2 = getOffset(j2);
        if (offset != offset2) {
            return (offset - offset2 >= 0 || nextTransition(j2) == nextTransition(j - ((long) offset2))) ? offset2 : offset;
        }
        if (offset >= 0) {
            long previousTransition = previousTransition(j2);
            if (previousTransition < j2) {
                int offset3 = getOffset(previousTransition);
                if (j2 - previousTransition <= ((long) (offset3 - offset))) {
                    return offset3;
                }
            }
        }
    }

    public final String getShortName(long j) {
        return getShortName(j, (Locale) null);
    }

    public String getShortName(long j, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String nameKey = getNameKey(j);
        if (nameKey == null) {
            return this.iID;
        }
        String b = cNameProvider.mo41523b(locale, this.iID, nameKey);
        return b != null ? b : printOffset(getOffset(j));
    }

    public abstract int getStandardOffset(long j);

    public int hashCode() {
        return getID().hashCode() + 57;
    }

    public abstract boolean isFixed();

    public boolean isLocalDateTimeGap(LocalDateTime localDateTime) {
        if (isFixed()) {
            return false;
        }
        try {
            localDateTime.toDateTime(this);
            return false;
        } catch (IllegalInstantException unused) {
            return true;
        }
    }

    public boolean isStandardOffset(long j) {
        return getOffset(j) == getStandardOffset(j);
    }

    public abstract long nextTransition(long j);

    public abstract long previousTransition(long j);

    public String toString() {
        return getID();
    }

    public TimeZone toTimeZone() {
        return TimeZone.getTimeZone(this.iID);
    }

    /* access modifiers changed from: protected */
    public Object writeReplace() {
        return new Stub(this.iID);
    }
}
