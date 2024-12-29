package p051j4;

import android.os.Build;

/* renamed from: j4.u */
public class C9205u {
    /* renamed from: a */
    public static int m22204a(int i) {
        return Build.VERSION.SDK_INT >= 23 ? i | 67108864 : i;
    }

    /* renamed from: b */
    public static int m22205b(int i) {
        return Build.VERSION.SDK_INT >= 31 ? i | 33554432 : i;
    }
}
