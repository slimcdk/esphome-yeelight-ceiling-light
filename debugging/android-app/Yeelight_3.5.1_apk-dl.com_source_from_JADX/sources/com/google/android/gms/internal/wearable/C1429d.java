package com.google.android.gms.internal.wearable;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.wearable.d */
public final class C1429d {
    /* renamed from: a */
    public static List<Long> m3499a(long... jArr) {
        int length = jArr.length;
        return length == 0 ? Collections.emptyList() : new zzac(jArr, 0, length);
    }

    /* renamed from: b */
    static /* synthetic */ int m3500b(long[] jArr, long j, int i, int i2) {
        while (i < i2) {
            if (jArr[i] == j) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
