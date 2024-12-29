package okhttp3;

import androidx.core.location.LocationRequestCompat;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import p056k5.C3300c;
import p073n5.C9730d;

/* renamed from: okhttp3.l */
public final class C3535l {

    /* renamed from: j */
    private static final Pattern f5771j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    private static final Pattern f5772k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    private static final Pattern f5773l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    private static final Pattern f5774m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    private final String f5775a;

    /* renamed from: b */
    private final String f5776b;

    /* renamed from: c */
    private final long f5777c;

    /* renamed from: d */
    private final String f5778d;

    /* renamed from: e */
    private final String f5779e;

    /* renamed from: f */
    private final boolean f5780f;

    /* renamed from: g */
    private final boolean f5781g;

    /* renamed from: h */
    private final boolean f5782h;

    /* renamed from: i */
    private final boolean f5783i;

    private C3535l(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f5775a = str;
        this.f5776b = str2;
        this.f5777c = j;
        this.f5778d = str3;
        this.f5779e = str4;
        this.f5780f = z;
        this.f5781g = z2;
        this.f5783i = z3;
        this.f5782h = z4;
    }

    /* renamed from: a */
    private static int m9746a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != 9) || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: b */
    private static boolean m9747b(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !C3300c.m8915I(str);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x010e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010f  */
    @javax.annotation.Nullable
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static okhttp3.C3535l m9748d(long r23, okhttp3.C3546t r25, java.lang.String r26) {
        /*
            r0 = r26
            int r1 = r26.length()
            r2 = 0
            r3 = 59
            int r4 = p056k5.C3300c.m8928m(r0, r2, r1, r3)
            r5 = 61
            int r6 = p056k5.C3300c.m8928m(r0, r2, r4, r5)
            r7 = 0
            if (r6 != r4) goto L_0x0017
            return r7
        L_0x0017:
            java.lang.String r9 = p056k5.C3300c.m8914H(r0, r2, r6)
            boolean r8 = r9.isEmpty()
            if (r8 != 0) goto L_0x0135
            int r8 = p056k5.C3300c.m8938w(r9)
            r10 = -1
            if (r8 == r10) goto L_0x002a
            goto L_0x0135
        L_0x002a:
            r8 = 1
            int r6 = r6 + r8
            java.lang.String r6 = p056k5.C3300c.m8914H(r0, r6, r4)
            int r11 = p056k5.C3300c.m8938w(r6)
            if (r11 == r10) goto L_0x0037
            return r7
        L_0x0037:
            int r4 = r4 + r8
            r10 = -1
            r12 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r8 = r7
            r14 = r8
            r19 = r10
            r21 = r12
            r15 = 0
            r16 = 0
            r17 = 1
            r18 = 0
        L_0x004c:
            if (r4 >= r1) goto L_0x00ba
            int r7 = p056k5.C3300c.m8928m(r0, r4, r1, r3)
            int r3 = p056k5.C3300c.m8928m(r0, r4, r7, r5)
            java.lang.String r4 = p056k5.C3300c.m8914H(r0, r4, r3)
            if (r3 >= r7) goto L_0x0063
            int r3 = r3 + 1
            java.lang.String r3 = p056k5.C3300c.m8914H(r0, r3, r7)
            goto L_0x0065
        L_0x0063:
            java.lang.String r3 = ""
        L_0x0065:
            java.lang.String r5 = "expires"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0076
            int r4 = r3.length()     // Catch:{ IllegalArgumentException -> 0x00b2 }
            long r21 = m9752h(r3, r2, r4)     // Catch:{ IllegalArgumentException -> 0x00b2 }
            goto L_0x0082
        L_0x0076:
            java.lang.String r5 = "max-age"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0085
            long r19 = m9753i(r3)     // Catch:{  }
        L_0x0082:
            r18 = 1
            goto L_0x00b2
        L_0x0085:
            java.lang.String r5 = "domain"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0094
            java.lang.String r14 = m9751g(r3)     // Catch:{ IllegalArgumentException -> 0x00b2 }
            r17 = 0
            goto L_0x00b2
        L_0x0094:
            java.lang.String r5 = "path"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x009e
            r8 = r3
            goto L_0x00b2
        L_0x009e:
            java.lang.String r3 = "secure"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x00a8
            r15 = 1
            goto L_0x00b2
        L_0x00a8:
            java.lang.String r3 = "httponly"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x00b2
            r16 = 1
        L_0x00b2:
            int r4 = r7 + 1
            r3 = 59
            r5 = 61
            r7 = 0
            goto L_0x004c
        L_0x00ba:
            r0 = -9223372036854775808
            int r3 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x00c2
        L_0x00c0:
            r11 = r0
            goto L_0x00e7
        L_0x00c2:
            int r0 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00e5
            r0 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r3 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x00d4
            r0 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 * r0
            goto L_0x00d9
        L_0x00d4:
            r19 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x00d9:
            long r0 = r23 + r19
            int r3 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r3 < 0) goto L_0x00e3
            int r3 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x00c0
        L_0x00e3:
            r11 = r12
            goto L_0x00e7
        L_0x00e5:
            r11 = r21
        L_0x00e7:
            java.lang.String r0 = r25.mo24573m()
            if (r14 != 0) goto L_0x00f0
            r13 = r0
            r1 = 0
            goto L_0x00fa
        L_0x00f0:
            boolean r1 = m9747b(r0, r14)
            if (r1 != 0) goto L_0x00f8
            r1 = 0
            return r1
        L_0x00f8:
            r1 = 0
            r13 = r14
        L_0x00fa:
            int r0 = r0.length()
            int r3 = r13.length()
            if (r0 == r3) goto L_0x010f
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.m23658c()
            java.lang.String r0 = r0.mo39076d(r13)
            if (r0 != 0) goto L_0x010f
            return r1
        L_0x010f:
            java.lang.String r0 = "/"
            if (r8 == 0) goto L_0x011c
            boolean r1 = r8.startsWith(r0)
            if (r1 != 0) goto L_0x011a
            goto L_0x011c
        L_0x011a:
            r14 = r8
            goto L_0x012d
        L_0x011c:
            java.lang.String r1 = r25.mo24568h()
            r3 = 47
            int r3 = r1.lastIndexOf(r3)
            if (r3 == 0) goto L_0x012c
            java.lang.String r0 = r1.substring(r2, r3)
        L_0x012c:
            r14 = r0
        L_0x012d:
            okhttp3.l r0 = new okhttp3.l
            r8 = r0
            r10 = r6
            r8.<init>(r9, r10, r11, r13, r14, r15, r16, r17, r18)
            return r0
        L_0x0135:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C3535l.m9748d(long, okhttp3.t, java.lang.String):okhttp3.l");
    }

    @Nullable
    /* renamed from: e */
    public static C3535l m9749e(C3546t tVar, String str) {
        return m9748d(System.currentTimeMillis(), tVar, str);
    }

    /* renamed from: f */
    public static List<C3535l> m9750f(C3546t tVar, C3544s sVar) {
        List<String> j = sVar.mo24551j("Set-Cookie");
        int size = j.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C3535l e = m9749e(tVar, j.get(i));
            if (e != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(e);
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    /* renamed from: g */
    private static String m9751g(String str) {
        if (!str.endsWith(".")) {
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            String c = C3300c.m8918c(str);
            if (c != null) {
                return c;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    private static long m9752h(String str, int i, int i2) {
        int a = m9746a(str, i, i2, false);
        Matcher matcher = f5774m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (a < i2) {
            int a2 = m9746a(str, a + 1, i2, true);
            matcher.region(a, a2);
            if (i4 == -1 && matcher.usePattern(f5774m).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i7 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
            } else if (i5 != -1 || !matcher.usePattern(f5773l).matches()) {
                if (i6 == -1) {
                    Pattern pattern = f5772k;
                    if (matcher.usePattern(pattern).matches()) {
                        i6 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(f5771j).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                }
            } else {
                i5 = Integer.parseInt(matcher.group(1));
            }
            a = m9746a(str, a2 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException();
        } else if (i6 == -1) {
            throw new IllegalArgumentException();
        } else if (i5 < 1 || i5 > 31) {
            throw new IllegalArgumentException();
        } else if (i4 < 0 || i4 > 23) {
            throw new IllegalArgumentException();
        } else if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        } else if (i8 < 0 || i8 > 59) {
            throw new IllegalArgumentException();
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(C3300c.f5336e);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, i6 - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i7);
            gregorianCalendar.set(13, i8);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    /* renamed from: i */
    private static long m9753i(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e) {
            if (!str.matches("-?\\d+")) {
                throw e;
            } else if (str.startsWith(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
                return Long.MIN_VALUE;
            } else {
                return LocationRequestCompat.PASSIVE_INTERVAL;
            }
        }
    }

    /* renamed from: c */
    public String mo24504c() {
        return this.f5775a;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C3535l)) {
            return false;
        }
        C3535l lVar = (C3535l) obj;
        return lVar.f5775a.equals(this.f5775a) && lVar.f5776b.equals(this.f5776b) && lVar.f5778d.equals(this.f5778d) && lVar.f5779e.equals(this.f5779e) && lVar.f5777c == this.f5777c && lVar.f5780f == this.f5780f && lVar.f5781g == this.f5781g && lVar.f5782h == this.f5782h && lVar.f5783i == this.f5783i;
    }

    public int hashCode() {
        long j = this.f5777c;
        return ((((((((((((((((527 + this.f5775a.hashCode()) * 31) + this.f5776b.hashCode()) * 31) + this.f5778d.hashCode()) * 31) + this.f5779e.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.f5780f ^ true ? 1 : 0)) * 31) + (this.f5781g ^ true ? 1 : 0)) * 31) + (this.f5782h ^ true ? 1 : 0)) * 31) + (this.f5783i ^ true ? 1 : 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public String mo24507j(boolean z) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5775a);
        sb.append('=');
        sb.append(this.f5776b);
        if (this.f5782h) {
            if (this.f5777c == Long.MIN_VALUE) {
                str = "; max-age=0";
            } else {
                sb.append("; expires=");
                str = C9730d.m23352a(new Date(this.f5777c));
            }
            sb.append(str);
        }
        if (!this.f5783i) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.f5778d);
        }
        sb.append("; path=");
        sb.append(this.f5779e);
        if (this.f5780f) {
            sb.append("; secure");
        }
        if (this.f5781g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    /* renamed from: k */
    public String mo24508k() {
        return this.f5776b;
    }

    public String toString() {
        return mo24507j(false);
    }
}
