package org.joda.time;

import java.io.Serializable;
import java.util.Comparator;
import p153e7.C9008d;
import p153e7.C9013h;

public class DateTimeComparator implements Comparator<Object>, Serializable {
    private static final DateTimeComparator ALL_INSTANCE = new DateTimeComparator((DateTimeFieldType) null, (DateTimeFieldType) null);
    private static final DateTimeComparator DATE_INSTANCE = new DateTimeComparator(DateTimeFieldType.dayOfYear(), (DateTimeFieldType) null);
    private static final DateTimeComparator TIME_INSTANCE = new DateTimeComparator((DateTimeFieldType) null, DateTimeFieldType.dayOfYear());
    private static final long serialVersionUID = -6097339773320178364L;
    private final DateTimeFieldType iLowerLimit;
    private final DateTimeFieldType iUpperLimit;

    protected DateTimeComparator(DateTimeFieldType dateTimeFieldType, DateTimeFieldType dateTimeFieldType2) {
        this.iLowerLimit = dateTimeFieldType;
        this.iUpperLimit = dateTimeFieldType2;
    }

    public static DateTimeComparator getDateOnlyInstance() {
        return DATE_INSTANCE;
    }

    public static DateTimeComparator getInstance() {
        return ALL_INSTANCE;
    }

    public static DateTimeComparator getInstance(DateTimeFieldType dateTimeFieldType) {
        return getInstance(dateTimeFieldType, (DateTimeFieldType) null);
    }

    public static DateTimeComparator getInstance(DateTimeFieldType dateTimeFieldType, DateTimeFieldType dateTimeFieldType2) {
        return (dateTimeFieldType == null && dateTimeFieldType2 == null) ? ALL_INSTANCE : (dateTimeFieldType == DateTimeFieldType.dayOfYear() && dateTimeFieldType2 == null) ? DATE_INSTANCE : (dateTimeFieldType == null && dateTimeFieldType2 == DateTimeFieldType.dayOfYear()) ? TIME_INSTANCE : new DateTimeComparator(dateTimeFieldType, dateTimeFieldType2);
    }

    public static DateTimeComparator getTimeOnlyInstance() {
        return TIME_INSTANCE;
    }

    private Object readResolve() {
        return getInstance(this.iLowerLimit, this.iUpperLimit);
    }

    public int compare(Object obj, Object obj2) {
        C9013h c = C9008d.m21502b().mo36871c(obj);
        C10142a a = c.mo36861a(obj, (C10142a) null);
        long d = c.mo36864d(obj, a);
        C9013h c2 = C9008d.m21502b().mo36871c(obj2);
        C10142a a2 = c2.mo36861a(obj2, (C10142a) null);
        long d2 = c2.mo36864d(obj2, a2);
        DateTimeFieldType dateTimeFieldType = this.iLowerLimit;
        if (dateTimeFieldType != null) {
            d = dateTimeFieldType.getField(a).roundFloor(d);
            d2 = this.iLowerLimit.getField(a2).roundFloor(d2);
        }
        DateTimeFieldType dateTimeFieldType2 = this.iUpperLimit;
        if (dateTimeFieldType2 != null) {
            d = dateTimeFieldType2.getField(a).remainder(d);
            d2 = this.iUpperLimit.getField(a2).remainder(d2);
        }
        if (d < d2) {
            return -1;
        }
        return d > d2 ? 1 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        r0 = r3.iUpperLimit;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof org.joda.time.DateTimeComparator
            r1 = 0
            if (r0 == 0) goto L_0x0034
            org.joda.time.DateTimeComparator r4 = (org.joda.time.DateTimeComparator) r4
            org.joda.time.DateTimeFieldType r0 = r3.iLowerLimit
            org.joda.time.DateTimeFieldType r2 = r4.getLowerLimit()
            if (r0 == r2) goto L_0x001d
            org.joda.time.DateTimeFieldType r0 = r3.iLowerLimit
            if (r0 == 0) goto L_0x0034
            org.joda.time.DateTimeFieldType r2 = r4.getLowerLimit()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0034
        L_0x001d:
            org.joda.time.DateTimeFieldType r0 = r3.iUpperLimit
            org.joda.time.DateTimeFieldType r2 = r4.getUpperLimit()
            if (r0 == r2) goto L_0x0033
            org.joda.time.DateTimeFieldType r0 = r3.iUpperLimit
            if (r0 == 0) goto L_0x0034
            org.joda.time.DateTimeFieldType r4 = r4.getUpperLimit()
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0034
        L_0x0033:
            r1 = 1
        L_0x0034:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.DateTimeComparator.equals(java.lang.Object):boolean");
    }

    public DateTimeFieldType getLowerLimit() {
        return this.iLowerLimit;
    }

    public DateTimeFieldType getUpperLimit() {
        return this.iUpperLimit;
    }

    public int hashCode() {
        DateTimeFieldType dateTimeFieldType = this.iLowerLimit;
        int i = 0;
        int hashCode = dateTimeFieldType == null ? 0 : dateTimeFieldType.hashCode();
        DateTimeFieldType dateTimeFieldType2 = this.iUpperLimit;
        if (dateTimeFieldType2 != null) {
            i = dateTimeFieldType2.hashCode();
        }
        return hashCode + (i * 123);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        if (r1 == null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r1 == null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r5 = this;
            org.joda.time.DateTimeFieldType r0 = r5.iLowerLimit
            org.joda.time.DateTimeFieldType r1 = r5.iUpperLimit
            java.lang.String r2 = "]"
            java.lang.String r3 = "DateTimeComparator["
            java.lang.String r4 = ""
            if (r0 != r1) goto L_0x0028
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            org.joda.time.DateTimeFieldType r1 = r5.iLowerLimit
            if (r1 != 0) goto L_0x0019
            goto L_0x001d
        L_0x0019:
            java.lang.String r4 = r1.getName()
        L_0x001d:
            r0.append(r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0028:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            org.joda.time.DateTimeFieldType r1 = r5.iLowerLimit
            if (r1 != 0) goto L_0x0036
            r1 = r4
            goto L_0x003a
        L_0x0036:
            java.lang.String r1 = r1.getName()
        L_0x003a:
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            org.joda.time.DateTimeFieldType r1 = r5.iUpperLimit
            if (r1 != 0) goto L_0x0019
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.DateTimeComparator.toString():java.lang.String");
    }
}
