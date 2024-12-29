package com.google.android.gms.measurement.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C1609u;

/* renamed from: com.google.android.gms.measurement.internal.j7 */
public final class C2221j7 {
    @Nullable
    /* renamed from: a */
    public static String m7167a(String str, String[] strArr, String[] strArr2) {
        C1609u.m4475k(strArr);
        C1609u.m4475k(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) ? true : str == null ? false : str.equals(str2)) {
                return strArr2[i];
            }
        }
        return null;
    }
}
