package com.yeelight.yeelib.utils;

import java.util.Calendar;

/* renamed from: com.yeelight.yeelib.utils.j */
public class C10544j {
    /* renamed from: a */
    public static int[] m25743a(int i, int i2) {
        int[] iArr = {i, i2};
        Calendar instance = Calendar.getInstance();
        instance.set(11, i);
        instance.set(12, i2);
        instance.add(12, 30);
        iArr[0] = instance.get(11);
        iArr[1] = instance.get(12);
        return iArr;
    }

    /* renamed from: b */
    public static boolean[] m25744b(boolean[] zArr, boolean z) {
        boolean[] zArr2 = new boolean[7];
        if (!z) {
            return zArr;
        }
        for (int i = 0; i < zArr.length; i++) {
            if (i == zArr.length - 1) {
                zArr2[0] = zArr[i];
            } else {
                zArr2[i + 1] = zArr[i];
            }
        }
        return zArr2;
    }

    /* renamed from: c */
    public static int[] m25745c(int i, int i2) {
        int[] iArr = {i, i2};
        Calendar instance = Calendar.getInstance();
        instance.set(11, i);
        instance.set(12, i2);
        instance.add(12, -30);
        iArr[0] = instance.get(11);
        iArr[1] = instance.get(12);
        return iArr;
    }

    /* renamed from: d */
    public static boolean[] m25746d(boolean[] zArr, boolean z) {
        boolean[] zArr2 = new boolean[7];
        if (!z) {
            return zArr;
        }
        for (int i = 0; i < zArr.length; i++) {
            if (i == 0) {
                zArr2[zArr.length - 1] = zArr[i];
            } else {
                zArr2[i - 1] = zArr[i];
            }
        }
        return zArr2;
    }

    /* renamed from: e */
    public static boolean[] m25747e(String str) {
        boolean[] zArr = new boolean[7];
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            zArr[i] = charArray[i] == '1';
        }
        return zArr;
    }
}
