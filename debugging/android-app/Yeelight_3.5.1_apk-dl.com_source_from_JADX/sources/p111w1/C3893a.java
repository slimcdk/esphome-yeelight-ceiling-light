package p111w1;

import java.util.TimeZone;

/* renamed from: w1.a */
public class C3893a {

    /* renamed from: a */
    private static final TimeZone f6532a = TimeZone.getTimeZone("UTC");

    /* renamed from: a */
    private static boolean m11089a(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    /* renamed from: b */
    private static int m11090b(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cf A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01b4 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date m11091c(java.lang.String r17, java.text.ParsePosition r18) {
        /*
            r1 = r17
            r2 = r18
            int r0 = r18.getIndex()     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            int r3 = r0 + 4
            int r0 = m11092d(r1, r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            r4 = 45
            boolean r5 = m11089a(r1, r3, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            if (r5 == 0) goto L_0x0018
            int r3 = r3 + 1
        L_0x0018:
            int r5 = r3 + 2
            int r3 = m11092d(r1, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            boolean r6 = m11089a(r1, r5, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            if (r6 == 0) goto L_0x0026
            int r5 = r5 + 1
        L_0x0026:
            int r6 = r5 + 2
            int r5 = m11092d(r1, r5, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            r7 = 84
            boolean r7 = m11089a(r1, r6, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            r8 = 1
            if (r7 != 0) goto L_0x0049
            int r9 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            if (r9 > r6) goto L_0x0049
            java.util.GregorianCalendar r4 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            int r3 = r3 - r8
            r4.<init>(r0, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            r2.setIndex(r6)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            java.util.Date r0 = r4.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            return r0
        L_0x0049:
            r9 = 43
            r10 = 90
            r12 = 2
            if (r7 == 0) goto L_0x00c5
            int r6 = r6 + 1
            int r7 = r6 + 2
            int r6 = m11092d(r1, r6, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            r13 = 58
            boolean r14 = m11089a(r1, r7, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            if (r14 == 0) goto L_0x0062
            int r7 = r7 + 1
        L_0x0062:
            int r14 = r7 + 2
            int r7 = m11092d(r1, r7, r14)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            boolean r13 = m11089a(r1, r14, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            if (r13 == 0) goto L_0x0070
            int r14 = r14 + 1
        L_0x0070:
            int r13 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            if (r13 <= r14) goto L_0x00c0
            char r13 = r1.charAt(r14)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            if (r13 == r10) goto L_0x00c0
            if (r13 == r9) goto L_0x00c0
            if (r13 == r4) goto L_0x00c0
            int r13 = r14 + 2
            int r14 = m11092d(r1, r14, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            r15 = 59
            if (r14 <= r15) goto L_0x0090
            r15 = 63
            if (r14 >= r15) goto L_0x0090
            r14 = 59
        L_0x0090:
            r15 = 46
            boolean r15 = m11089a(r1, r13, r15)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            if (r15 == 0) goto L_0x00bb
            int r13 = r13 + 1
            int r15 = r13 + 1
            int r15 = m11090b(r1, r15)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            int r11 = r13 + 3
            int r11 = java.lang.Math.min(r15, r11)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            int r16 = m11092d(r1, r13, r11)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            int r11 = r11 - r13
            if (r11 == r8) goto L_0x00b3
            if (r11 == r12) goto L_0x00b0
            goto L_0x00b5
        L_0x00b0:
            int r16 = r16 * 10
            goto L_0x00b5
        L_0x00b3:
            int r16 = r16 * 100
        L_0x00b5:
            r11 = r7
            r13 = r16
            r7 = r6
            r6 = r15
            goto L_0x00c9
        L_0x00bb:
            r11 = r7
            r7 = r6
            r6 = r13
            r13 = 0
            goto L_0x00c9
        L_0x00c0:
            r11 = r7
            r13 = 0
            r7 = r6
            r6 = r14
            goto L_0x00c8
        L_0x00c5:
            r7 = 0
            r11 = 0
            r13 = 0
        L_0x00c8:
            r14 = 0
        L_0x00c9:
            int r15 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            if (r15 <= r6) goto L_0x01b4
            char r15 = r1.charAt(r6)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            r12 = 5
            if (r15 != r10) goto L_0x00db
            java.util.TimeZone r4 = f6532a     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            int r6 = r6 + r8
            goto L_0x0183
        L_0x00db:
            if (r15 == r9) goto L_0x00fc
            if (r15 != r4) goto L_0x00e0
            goto L_0x00fc
        L_0x00e0:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            java.lang.String r4 = "Invalid time zone indicator '"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            r3.append(r15)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
        L_0x00fc:
            java.lang.String r4 = r1.substring(r6)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            int r9 = r4.length()     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            if (r9 < r12) goto L_0x0107
            goto L_0x0118
        L_0x0107:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            r9.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            r9.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            java.lang.String r4 = "00"
            r9.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            java.lang.String r4 = r9.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
        L_0x0118:
            int r9 = r4.length()     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            int r6 = r6 + r9
            java.lang.String r9 = "+0000"
            boolean r9 = r9.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            if (r9 != 0) goto L_0x0181
            java.lang.String r9 = "+00:00"
            boolean r9 = r9.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            if (r9 == 0) goto L_0x012e
            goto L_0x0181
        L_0x012e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            r9.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            java.lang.String r10 = "GMT"
            r9.append(r10)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            r9.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            java.lang.String r4 = r9.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            java.util.TimeZone r9 = java.util.TimeZone.getTimeZone(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            java.lang.String r10 = r9.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            boolean r15 = r10.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            if (r15 != 0) goto L_0x017f
            java.lang.String r15 = ":"
            java.lang.String r12 = ""
            java.lang.String r10 = r10.replace(r15, r12)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            boolean r10 = r10.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            if (r10 == 0) goto L_0x015c
            goto L_0x017f
        L_0x015c:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            java.lang.String r5 = "Mismatching time zone indicator: "
            r3.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            java.lang.String r4 = " given, resolves to "
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            java.lang.String r4 = r9.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
        L_0x017f:
            r4 = r9
            goto L_0x0183
        L_0x0181:
            java.util.TimeZone r4 = f6532a     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
        L_0x0183:
            java.util.GregorianCalendar r9 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            r9.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            r4 = 0
            r9.setLenient(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            r9.set(r8, r0)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            int r3 = r3 - r8
            r0 = 2
            r9.set(r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            r0 = 5
            r9.set(r0, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            r0 = 11
            r9.set(r0, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            r0 = 12
            r9.set(r0, r11)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            r0 = 13
            r9.set(r0, r14)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            r0 = 14
            r9.set(r0, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            r2.setIndex(r6)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            java.util.Date r0 = r9.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            return r0
        L_0x01b4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01c0, NumberFormatException -> 0x01be, IllegalArgumentException -> 0x01bc }
        L_0x01bc:
            r0 = move-exception
            goto L_0x01c1
        L_0x01be:
            r0 = move-exception
            goto L_0x01c1
        L_0x01c0:
            r0 = move-exception
        L_0x01c1:
            if (r1 != 0) goto L_0x01c5
            r1 = 0
            goto L_0x01d9
        L_0x01c5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 34
            r3.append(r4)
            r3.append(r1)
            r3.append(r4)
            java.lang.String r1 = r3.toString()
        L_0x01d9:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x01e5
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0203
        L_0x01e5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "("
            r3.append(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x0203:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to parse date ["
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = "]: "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            int r2 = r18.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p111w1.C3893a.m11091c(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    /* renamed from: d */
    private static int m11092d(String str, int i, int i2) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit >= 0) {
                i3 = -digit;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
        } else {
            i4 = i;
            i3 = 0;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 >= 0) {
                i3 = (i3 * 10) - digit2;
                i4 = i5;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
        }
        return -i3;
    }
}
