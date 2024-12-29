package org.joda.time.p196tz;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: org.joda.time.tz.a */
public class C10230a implements C10231b {

    /* renamed from: a */
    private HashMap<Locale, Map<String, Map<String, Object>>> f19025a = m25729c();

    /* renamed from: c */
    private HashMap m25729c() {
        return new HashMap(7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ce, code lost:
        return null;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized java.lang.String[] m25730d(java.util.Locale r10, java.lang.String r11, java.lang.String r12) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            if (r10 == 0) goto L_0x00cd
            if (r11 == 0) goto L_0x00cd
            if (r12 != 0) goto L_0x000a
            goto L_0x00cd
        L_0x000a:
            java.util.HashMap<java.util.Locale, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>>> r1 = r9.f19025a     // Catch:{ all -> 0x00ca }
            java.lang.Object r1 = r1.get(r10)     // Catch:{ all -> 0x00ca }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x00ca }
            if (r1 != 0) goto L_0x001e
            java.util.HashMap<java.util.Locale, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>>> r1 = r9.f19025a     // Catch:{ all -> 0x00ca }
            java.util.HashMap r2 = r9.m25729c()     // Catch:{ all -> 0x00ca }
            r1.put(r10, r2)     // Catch:{ all -> 0x00ca }
            r1 = r2
        L_0x001e:
            java.lang.Object r2 = r1.get(r11)     // Catch:{ all -> 0x00ca }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ all -> 0x00ca }
            if (r2 != 0) goto L_0x00c2
            java.util.HashMap r2 = r9.m25729c()     // Catch:{ all -> 0x00ca }
            r1.put(r11, r2)     // Catch:{ all -> 0x00ca }
            java.util.Locale r1 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x00ca }
            java.text.DateFormatSymbols r1 = org.joda.time.C10149c.m25338c(r1)     // Catch:{ all -> 0x00ca }
            java.lang.String[][] r1 = r1.getZoneStrings()     // Catch:{ all -> 0x00ca }
            int r3 = r1.length     // Catch:{ all -> 0x00ca }
            r4 = 0
            r5 = 0
        L_0x003a:
            r6 = 5
            if (r5 >= r3) goto L_0x0050
            r7 = r1[r5]     // Catch:{ all -> 0x00ca }
            if (r7 == 0) goto L_0x004d
            int r8 = r7.length     // Catch:{ all -> 0x00ca }
            if (r8 != r6) goto L_0x004d
            r8 = r7[r4]     // Catch:{ all -> 0x00ca }
            boolean r8 = r11.equals(r8)     // Catch:{ all -> 0x00ca }
            if (r8 == 0) goto L_0x004d
            goto L_0x0051
        L_0x004d:
            int r5 = r5 + 1
            goto L_0x003a
        L_0x0050:
            r7 = r0
        L_0x0051:
            java.text.DateFormatSymbols r10 = org.joda.time.C10149c.m25338c(r10)     // Catch:{ all -> 0x00ca }
            java.lang.String[][] r10 = r10.getZoneStrings()     // Catch:{ all -> 0x00ca }
            int r1 = r10.length     // Catch:{ all -> 0x00ca }
            r3 = 0
        L_0x005b:
            if (r3 >= r1) goto L_0x0071
            r5 = r10[r3]     // Catch:{ all -> 0x00ca }
            if (r5 == 0) goto L_0x006e
            int r8 = r5.length     // Catch:{ all -> 0x00ca }
            if (r8 != r6) goto L_0x006e
            r8 = r5[r4]     // Catch:{ all -> 0x00ca }
            boolean r8 = r11.equals(r8)     // Catch:{ all -> 0x00ca }
            if (r8 == 0) goto L_0x006e
            r0 = r5
            goto L_0x0071
        L_0x006e:
            int r3 = r3 + 1
            goto L_0x005b
        L_0x0071:
            if (r7 == 0) goto L_0x00c2
            if (r0 == 0) goto L_0x00c2
            r10 = 2
            r11 = r7[r10]     // Catch:{ all -> 0x00ca }
            java.lang.String[] r1 = new java.lang.String[r10]     // Catch:{ all -> 0x00ca }
            r3 = r0[r10]     // Catch:{ all -> 0x00ca }
            r1[r4] = r3     // Catch:{ all -> 0x00ca }
            r3 = 1
            r5 = r0[r3]     // Catch:{ all -> 0x00ca }
            r1[r3] = r5     // Catch:{ all -> 0x00ca }
            r2.put(r11, r1)     // Catch:{ all -> 0x00ca }
            r11 = r7[r10]     // Catch:{ all -> 0x00ca }
            r1 = 4
            r5 = r7[r1]     // Catch:{ all -> 0x00ca }
            boolean r11 = r11.equals(r5)     // Catch:{ all -> 0x00ca }
            r5 = 3
            if (r11 == 0) goto L_0x00b3
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ca }
            r11.<init>()     // Catch:{ all -> 0x00ca }
            r6 = r7[r1]     // Catch:{ all -> 0x00ca }
            r11.append(r6)     // Catch:{ all -> 0x00ca }
            java.lang.String r6 = "-Summer"
            r11.append(r6)     // Catch:{ all -> 0x00ca }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00ca }
            java.lang.String[] r10 = new java.lang.String[r10]     // Catch:{ all -> 0x00ca }
            r1 = r0[r1]     // Catch:{ all -> 0x00ca }
            r10[r4] = r1     // Catch:{ all -> 0x00ca }
            r0 = r0[r5]     // Catch:{ all -> 0x00ca }
            r10[r3] = r0     // Catch:{ all -> 0x00ca }
            r2.put(r11, r10)     // Catch:{ all -> 0x00ca }
            goto L_0x00c2
        L_0x00b3:
            r11 = r7[r1]     // Catch:{ all -> 0x00ca }
            java.lang.String[] r10 = new java.lang.String[r10]     // Catch:{ all -> 0x00ca }
            r1 = r0[r1]     // Catch:{ all -> 0x00ca }
            r10[r4] = r1     // Catch:{ all -> 0x00ca }
            r0 = r0[r5]     // Catch:{ all -> 0x00ca }
            r10[r3] = r0     // Catch:{ all -> 0x00ca }
            r2.put(r11, r10)     // Catch:{ all -> 0x00ca }
        L_0x00c2:
            java.lang.Object r10 = r2.get(r12)     // Catch:{ all -> 0x00ca }
            java.lang.String[] r10 = (java.lang.String[]) r10     // Catch:{ all -> 0x00ca }
            monitor-exit(r9)
            return r10
        L_0x00ca:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L_0x00cd:
            monitor-exit(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.p196tz.C10230a.m25730d(java.util.Locale, java.lang.String, java.lang.String):java.lang.String[]");
    }

    /* renamed from: a */
    public String mo41522a(Locale locale, String str, String str2) {
        String[] d = m25730d(locale, str, str2);
        if (d == null) {
            return null;
        }
        return d[1];
    }

    /* renamed from: b */
    public String mo41523b(Locale locale, String str, String str2) {
        String[] d = m25730d(locale, str, str2);
        if (d == null) {
            return null;
        }
        return d[0];
    }
}
