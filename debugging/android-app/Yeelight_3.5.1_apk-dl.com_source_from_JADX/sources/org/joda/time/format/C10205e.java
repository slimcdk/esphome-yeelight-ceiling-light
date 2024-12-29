package org.joda.time.format;

/* renamed from: org.joda.time.format.e */
public class C10205e {

    /* renamed from: a */
    private static final double f18908a = Math.log(10.0d);

    /* renamed from: a */
    public static void m25526a(StringBuffer stringBuffer, int i, int i2) {
        if (i < 0) {
            stringBuffer.append('-');
            if (i != Integer.MIN_VALUE) {
                i = -i;
            } else {
                while (i2 > 10) {
                    stringBuffer.append('0');
                    i2--;
                }
                stringBuffer.append("2147483648");
                return;
            }
        }
        if (i < 10) {
            while (i2 > 1) {
                stringBuffer.append('0');
                i2--;
            }
        } else if (i < 100) {
            while (i2 > 2) {
                stringBuffer.append('0');
                i2--;
            }
            int i3 = ((i + 1) * 13421772) >> 27;
            stringBuffer.append((char) (i3 + 48));
            i = (i - (i3 << 3)) - (i3 << 1);
        } else {
            int log = i < 1000 ? 3 : i < 10000 ? 4 : ((int) (Math.log((double) i) / f18908a)) + 1;
            while (i2 > log) {
                stringBuffer.append('0');
                i2--;
            }
            stringBuffer.append(Integer.toString(i));
            return;
        }
        stringBuffer.append((char) (i + 48));
    }

    /* renamed from: b */
    public static void m25527b(StringBuffer stringBuffer, int i) {
        if (i < 0) {
            stringBuffer.append('-');
            if (i != Integer.MIN_VALUE) {
                i = -i;
            } else {
                stringBuffer.append("2147483648");
                return;
            }
        }
        if (i >= 10) {
            if (i < 100) {
                int i2 = ((i + 1) * 13421772) >> 27;
                stringBuffer.append((char) (i2 + 48));
                i = (i - (i2 << 3)) - (i2 << 1);
            } else {
                stringBuffer.append(Integer.toString(i));
                return;
            }
        }
        stringBuffer.append((char) (i + 48));
    }

    /* renamed from: c */
    public static void m25528c(StringBuffer stringBuffer, long j) {
        int i = (int) j;
        if (((long) i) == j) {
            m25527b(stringBuffer, i);
        } else {
            stringBuffer.append(Long.toString(j));
        }
    }

    /* renamed from: d */
    public static int m25529d(long j) {
        if (j < 0) {
            if (j != Long.MIN_VALUE) {
                return m25529d(-j) + 1;
            }
            return 20;
        } else if (j < 10) {
            return 1;
        } else {
            if (j < 100) {
                return 2;
            }
            if (j < 1000) {
                return 3;
            }
            if (j < 10000) {
                return 4;
            }
            return 1 + ((int) (Math.log((double) j) / f18908a));
        }
    }

    /* renamed from: e */
    static String m25530e(String str, int i) {
        StringBuilder sb;
        int i2 = i + 32;
        String concat = str.length() <= i2 + 3 ? str : str.substring(0, i2).concat("...");
        if (i <= 0) {
            sb = new StringBuilder();
            sb.append("Invalid format: \"");
            sb.append(concat);
        } else if (i >= str.length()) {
            sb = new StringBuilder();
            sb.append("Invalid format: \"");
            sb.append(concat);
            sb.append("\" is too short");
            return sb.toString();
        } else {
            sb = new StringBuilder();
            sb.append("Invalid format: \"");
            sb.append(concat);
            sb.append("\" is malformed at \"");
            sb.append(concat.substring(i));
        }
        sb.append('\"');
        return sb.toString();
    }

    /* renamed from: f */
    static int m25531f(String str, int i) {
        int charAt = str.charAt(i) - '0';
        return (((charAt << 3) + (charAt << 1)) + str.charAt(i + 1)) - 48;
    }
}
