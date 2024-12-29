package com.google.android.gms.internal.wearable;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.wearable.t3 */
public final class C1513t3 {
    /* renamed from: a */
    public static int m3818a(int i, int i2, @NullableDecl String str) {
        String str2;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            str2 = C1518u3.m3824a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (i2 < 0) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            str2 = C1518u3.m3824a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(str2);
    }

    /* renamed from: b */
    public static void m3819b(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = m3820c(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = m3820c(i2, i3, "end index");
            } else {
                str = C1518u3.m3824a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* renamed from: c */
    private static String m3820c(int i, int i2, @NullableDecl String str) {
        if (i < 0) {
            return C1518u3.m3824a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return C1518u3.m3824a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
