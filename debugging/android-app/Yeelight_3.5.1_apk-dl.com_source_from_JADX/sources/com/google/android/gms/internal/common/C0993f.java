package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* renamed from: com.google.android.gms.internal.common.f */
public final class C0993f {
    @CanIgnoreReturnValue
    /* renamed from: a */
    static Object[] m1650a(Object[] objArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            if (objArr[i2] != null) {
                i2++;
            } else {
                throw new NullPointerException("at index " + i2);
            }
        }
        return objArr;
    }
}
