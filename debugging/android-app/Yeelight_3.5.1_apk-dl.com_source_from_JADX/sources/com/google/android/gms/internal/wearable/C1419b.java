package com.google.android.gms.internal.wearable;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.wearable.b */
public final class C1419b extends C1424c {
    /* renamed from: a */
    public static List<Float> m3429a(float... fArr) {
        int length = fArr.length;
        return length == 0 ? Collections.emptyList() : new zzz(fArr, 0, length);
    }

    /* renamed from: b */
    static /* synthetic */ int m3430b(float[] fArr, float f, int i, int i2) {
        while (i < i2) {
            if (fArr[i] == f) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
