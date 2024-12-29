package p051j4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: j4.h */
public class C9190h {
    /* renamed from: a */
    public static String m22141a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        return simpleDateFormat.format(new Date());
    }

    /* renamed from: b */
    public static int[] m22142b(int i, int i2) {
        int[] iArr = {i, i2};
        Calendar instance = Calendar.getInstance();
        instance.set(11, i);
        instance.set(12, i2);
        instance.add(12, 30);
        iArr[0] = instance.get(11);
        iArr[1] = instance.get(12);
        return iArr;
    }

    /* renamed from: c */
    public static boolean[] m22143c(boolean[] zArr, boolean z) {
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

    /* renamed from: d */
    public static int[] m22144d(int i, int i2) {
        int[] iArr = {i, i2};
        Calendar instance = Calendar.getInstance();
        instance.set(11, i);
        instance.set(12, i2);
        instance.add(12, -30);
        iArr[0] = instance.get(11);
        iArr[1] = instance.get(12);
        return iArr;
    }

    /* renamed from: e */
    public static boolean[] m22145e(boolean[] zArr, boolean z) {
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

    /* renamed from: f */
    public static boolean[] m22146f(String str) {
        boolean[] zArr = new boolean[7];
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            zArr[i] = charArray[i] == '1';
        }
        return zArr;
    }
}
