package org.joda.time.format;

import java.util.LinkedHashMap;
import java.util.Map;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class DateTimeFormat {

    /* renamed from: a */
    private static final Map<String, C10199a> f18849a = new LinkedHashMap<String, C10199a>(7) {
        private static final long serialVersionUID = 23;

        /* access modifiers changed from: protected */
        public boolean removeEldestEntry(Map.Entry<String, C10199a> entry) {
            return size() > 500;
        }
    };

    /* renamed from: a */
    private static C10199a m25401a(String str) {
        C10199a aVar;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Invalid pattern specification");
        }
        Map<String, C10199a> map = f18849a;
        synchronized (map) {
            aVar = map.get(str);
            if (aVar == null) {
                DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
                m25404d(dateTimeFormatterBuilder, str);
                aVar = dateTimeFormatterBuilder.mo41396d0();
                map.put(str, aVar);
            }
        }
        return aVar;
    }

    /* renamed from: b */
    public static C10199a m25402b(String str) {
        return m25401a(str);
    }

    /* renamed from: c */
    private static boolean m25403c(String str) {
        int length = str.length();
        if (length > 0) {
            switch (str.charAt(0)) {
                case 'C':
                case 'D':
                case 'F':
                case 'H':
                case 'K':
                case 'S':
                case 'W':
                case 'Y':
                case 'c':
                case 'd':
                case 'e':
                case 'h':
                case 'k':
                case 'm':
                case 's':
                case 'w':
                case 'x':
                case 'y':
                    break;
                case 'M':
                    if (length <= 2) {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    /* renamed from: d */
    private static void m25404d(DateTimeFormatterBuilder dateTimeFormatterBuilder, String str) {
        boolean z;
        String str2;
        boolean z2;
        int length = str.length();
        int[] iArr = new int[1];
        int i = 0;
        while (i < length) {
            iArr[0] = i;
            String e = m25405e(str, iArr);
            int i2 = iArr[0];
            int length2 = e.length();
            if (length2 != 0) {
                char charAt = e.charAt(0);
                if (charAt == '\'') {
                    String substring = e.substring(1);
                    if (substring.length() == 1) {
                        dateTimeFormatterBuilder.mo41416x(substring.charAt(0));
                    } else {
                        dateTimeFormatterBuilder.mo41417y(new String(substring));
                    }
                } else if (charAt == 'K') {
                    dateTimeFormatterBuilder.mo41415w(length2);
                } else if (charAt != 'M') {
                    if (charAt == 'S') {
                        dateTimeFormatterBuilder.mo41412t(length2, length2);
                    } else if (charAt == 'a') {
                        dateTimeFormatterBuilder.mo41413u();
                    } else if (charAt == 'h') {
                        dateTimeFormatterBuilder.mo41400h(length2);
                    } else if (charAt == 'k') {
                        dateTimeFormatterBuilder.mo41399g(length2);
                    } else if (charAt == 'm') {
                        dateTimeFormatterBuilder.mo41372A(length2);
                    } else if (charAt == 's') {
                        dateTimeFormatterBuilder.mo41377F(length2);
                    } else if (charAt == 'G') {
                        dateTimeFormatterBuilder.mo41407o();
                    } else if (charAt != 'H') {
                        if (charAt != 'Y') {
                            if (charAt == 'Z') {
                                if (length2 == 1) {
                                    str2 = null;
                                    z2 = false;
                                } else if (length2 == 2) {
                                    str2 = null;
                                    z2 = true;
                                } else {
                                    dateTimeFormatterBuilder.mo41381J();
                                }
                                dateTimeFormatterBuilder.mo41383L(str2, "Z", z2, 2, 2);
                            } else if (charAt == 'd') {
                                dateTimeFormatterBuilder.mo41401i(length2);
                            } else if (charAt != 'e') {
                                switch (charAt) {
                                    case 'C':
                                        dateTimeFormatterBuilder.mo41398f(length2, length2);
                                        continue;
                                    case 'D':
                                        dateTimeFormatterBuilder.mo41405m(length2);
                                        continue;
                                    case 'E':
                                        if (length2 < 4) {
                                            dateTimeFormatterBuilder.mo41403k();
                                            break;
                                        } else {
                                            dateTimeFormatterBuilder.mo41404l();
                                            continue;
                                        }
                                    default:
                                        switch (charAt) {
                                            case 'w':
                                                dateTimeFormatterBuilder.mo41388R(length2);
                                                continue;
                                            case 'x':
                                            case 'y':
                                                break;
                                            case 'z':
                                                if (length2 < 4) {
                                                    dateTimeFormatterBuilder.mo41385N((Map<String, DateTimeZone>) null);
                                                    break;
                                                } else {
                                                    dateTimeFormatterBuilder.mo41382K();
                                                    continue;
                                                    continue;
                                                }
                                            default:
                                                throw new IllegalArgumentException("Illegal pattern component: " + e);
                                        }
                                }
                            } else {
                                dateTimeFormatterBuilder.mo41402j(length2);
                            }
                        }
                        if (length2 == 2) {
                            if (i2 + 1 < length) {
                                iArr[0] = iArr[0] + 1;
                                z = !m25403c(m25405e(str, iArr));
                                iArr[0] = iArr[0] - 1;
                            } else {
                                z = true;
                            }
                            if (charAt != 'x') {
                                dateTimeFormatterBuilder.mo41387P(new DateTime().getYear() - 30, z);
                            } else {
                                dateTimeFormatterBuilder.mo41386O(new DateTime().getWeekyear() - 30, z);
                            }
                        } else {
                            int i3 = 9;
                            if (i2 + 1 < length) {
                                iArr[0] = iArr[0] + 1;
                                if (m25403c(m25405e(str, iArr))) {
                                    i3 = length2;
                                }
                                iArr[0] = iArr[0] - 1;
                            }
                            if (charAt == 'Y') {
                                dateTimeFormatterBuilder.mo41391U(length2, i3);
                            } else if (charAt == 'x') {
                                dateTimeFormatterBuilder.mo41389S(length2, i3);
                            } else if (charAt == 'y') {
                                dateTimeFormatterBuilder.mo41390T(length2, i3);
                            }
                        }
                    } else {
                        dateTimeFormatterBuilder.mo41414v(length2);
                    }
                } else if (length2 < 3) {
                    dateTimeFormatterBuilder.mo41373B(length2);
                } else if (length2 >= 4) {
                    dateTimeFormatterBuilder.mo41375D();
                } else {
                    dateTimeFormatterBuilder.mo41374C();
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    private static String m25405e(String str, int[] iArr) {
        StringBuilder sb = new StringBuilder();
        int i = iArr[0];
        int length = str.length();
        char charAt = str.charAt(i);
        if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
            sb.append(charAt);
            while (true) {
                int i2 = i + 1;
                if (i2 >= length || str.charAt(i2) != charAt) {
                    break;
                }
                sb.append(charAt);
                i = i2;
            }
        } else {
            sb.append('\'');
            boolean z = false;
            while (true) {
                if (i >= length) {
                    break;
                }
                char charAt2 = str.charAt(i);
                if (charAt2 == '\'') {
                    int i3 = i + 1;
                    if (i3 >= length || str.charAt(i3) != '\'') {
                        z = !z;
                    } else {
                        sb.append(charAt2);
                        i = i3;
                    }
                } else if (z || ((charAt2 < 'A' || charAt2 > 'Z') && (charAt2 < 'a' || charAt2 > 'z'))) {
                    sb.append(charAt2);
                }
                i++;
            }
            i--;
        }
        iArr[0] = i;
        return sb.toString();
    }
}
