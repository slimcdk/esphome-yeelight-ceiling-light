package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C1599s;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Array;
import java.util.Arrays;

@KeepForSdk
@VisibleForTesting
/* renamed from: com.google.android.gms.common.util.b */
public final class C1648b {
    @KeepForSdk
    /* renamed from: a */
    public static <T> T[] m4565a(T[]... tArr) {
        if (tArr.length == 0) {
            return (Object[]) Array.newInstance(tArr.getClass(), 0);
        }
        int i = 0;
        for (T[] length : tArr) {
            i += length.length;
        }
        T[] copyOf = Arrays.copyOf(tArr[0], i);
        int length2 = tArr[0].length;
        for (int i2 = 1; i2 < tArr.length; i2++) {
            T[] tArr2 = tArr[i2];
            System.arraycopy(tArr2, 0, copyOf, length2, tArr2.length);
            length2 += tArr2.length;
        }
        return copyOf;
    }

    @KeepForSdk
    /* renamed from: b */
    public static <T> boolean m4566b(T[] tArr, T t) {
        int length = tArr != null ? tArr.length : 0;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (C1599s.m4388a(tArr[i], t)) {
                break;
            } else {
                i++;
            }
        }
        return i >= 0;
    }

    @KeepForSdk
    /* renamed from: c */
    public static void m4567c(StringBuilder sb, double[] dArr) {
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(Double.toString(dArr[i]));
        }
    }

    @KeepForSdk
    /* renamed from: d */
    public static void m4568d(StringBuilder sb, float[] fArr) {
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(Float.toString(fArr[i]));
        }
    }

    @KeepForSdk
    /* renamed from: e */
    public static void m4569e(StringBuilder sb, int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(Integer.toString(iArr[i]));
        }
    }

    @KeepForSdk
    /* renamed from: f */
    public static void m4570f(StringBuilder sb, long[] jArr) {
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(Long.toString(jArr[i]));
        }
    }

    @KeepForSdk
    /* renamed from: g */
    public static <T> void m4571g(StringBuilder sb, T[] tArr) {
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(tArr[i].toString());
        }
    }

    @KeepForSdk
    /* renamed from: h */
    public static void m4572h(StringBuilder sb, boolean[] zArr) {
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(Boolean.toString(zArr[i]));
        }
    }

    @KeepForSdk
    /* renamed from: i */
    public static void m4573i(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append("\"");
            sb.append(strArr[i]);
            sb.append("\"");
        }
    }
}
