package org.joda.time.field;

import org.joda.time.C10143b;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/* renamed from: org.joda.time.field.e */
public class C10179e {
    /* renamed from: a */
    public static boolean m25385a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: b */
    public static int m25386b(int i, int i2, int i3) {
        if (i2 < i3) {
            int i4 = (i3 - i2) + 1;
            int i5 = i - i2;
            if (i5 >= 0) {
                return (i5 % i4) + i2;
            }
            int i6 = (-i5) % i4;
            return i6 == 0 ? i2 + 0 : (i4 - i6) + i2;
        }
        throw new IllegalArgumentException("MIN > MAX");
    }

    /* renamed from: c */
    public static int m25387c(int i, int i2, int i3, int i4) {
        return m25386b(i + i2, i3, i4);
    }

    /* renamed from: d */
    public static int m25388d(int i, int i2) {
        int i3 = i + i2;
        if ((i ^ i3) >= 0 || (i ^ i2) < 0) {
            return i3;
        }
        throw new ArithmeticException("The calculation caused an overflow: " + i + " + " + i2);
    }

    /* renamed from: e */
    public static long m25389e(long j, long j2) {
        long j3 = j + j2;
        if ((j ^ j3) >= 0 || (j ^ j2) < 0) {
            return j3;
        }
        throw new ArithmeticException("The calculation caused an overflow: " + j + " + " + j2);
    }

    /* renamed from: f */
    public static int m25390f(int i, int i2) {
        long j = ((long) i) * ((long) i2);
        if (j >= -2147483648L && j <= 2147483647L) {
            return (int) j;
        }
        throw new ArithmeticException("Multiplication overflows an int: " + i + " * " + i2);
    }

    /* renamed from: g */
    public static long m25391g(long j, int i) {
        if (i != -1) {
            if (i == 0) {
                return 0;
            }
            if (i == 1) {
                return j;
            }
            long j2 = (long) i;
            long j3 = j * j2;
            if (j3 / j2 == j) {
                return j3;
            }
            throw new ArithmeticException("Multiplication overflows a long: " + j + " * " + i);
        } else if (j != Long.MIN_VALUE) {
            return -j;
        } else {
            throw new ArithmeticException("Multiplication overflows a long: " + j + " * " + i);
        }
    }

    /* renamed from: h */
    public static long m25392h(long j, long j2) {
        if (j2 == 1) {
            return j;
        }
        if (j == 1) {
            return j2;
        }
        if (j == 0 || j2 == 0) {
            return 0;
        }
        long j3 = j * j2;
        if (j3 / j2 == j && ((j != Long.MIN_VALUE || j2 != -1) && (j2 != Long.MIN_VALUE || j != -1))) {
            return j3;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j + " * " + j2);
    }

    /* renamed from: i */
    public static int m25393i(int i) {
        if (i != Integer.MIN_VALUE) {
            return -i;
        }
        throw new ArithmeticException("Integer.MIN_VALUE cannot be negated");
    }

    /* renamed from: j */
    public static long m25394j(long j, long j2) {
        long j3 = j - j2;
        if ((j ^ j3) >= 0 || (j ^ j2) >= 0) {
            return j3;
        }
        throw new ArithmeticException("The calculation caused an overflow: " + j + " - " + j2);
    }

    /* renamed from: k */
    public static int m25395k(long j) {
        if (-2147483648L <= j && j <= 2147483647L) {
            return (int) j;
        }
        throw new ArithmeticException("Value cannot fit in an int: " + j);
    }

    /* renamed from: l */
    public static void m25396l(C10143b bVar, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new IllegalFieldValueException(bVar.getType(), (Number) Integer.valueOf(i), (Number) Integer.valueOf(i2), (Number) Integer.valueOf(i3));
        }
    }

    /* renamed from: m */
    public static void m25397m(DateTimeFieldType dateTimeFieldType, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new IllegalFieldValueException(dateTimeFieldType, (Number) Integer.valueOf(i), (Number) Integer.valueOf(i2), (Number) Integer.valueOf(i3));
        }
    }
}
