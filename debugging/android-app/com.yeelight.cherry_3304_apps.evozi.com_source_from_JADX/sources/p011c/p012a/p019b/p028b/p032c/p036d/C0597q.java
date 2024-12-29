package p011c.p012a.p019b.p028b.p032c.p036d;

import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: c.a.b.b.c.d.q */
public final class C0597q {

    /* renamed from: a */
    protected static final Charset f277a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final Object f278b = new Object();

    static {
        Charset.forName("ISO-8859-1");
    }

    /* renamed from: a */
    public static boolean m444a(float[] fArr, float[] fArr2) {
        return (fArr == null || fArr.length == 0) ? fArr2 == null || fArr2.length == 0 : Arrays.equals(fArr, fArr2);
    }

    /* renamed from: b */
    public static boolean m445b(long[] jArr, long[] jArr2) {
        return (jArr == null || jArr.length == 0) ? jArr2 == null || jArr2.length == 0 : Arrays.equals(jArr, jArr2);
    }

    /* renamed from: c */
    public static boolean m446c(Object[] objArr, Object[] objArr2) {
        int length = objArr == null ? 0 : objArr.length;
        int length2 = objArr2 == null ? 0 : objArr2.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length || objArr[i] != null) {
                while (i2 < length2 && objArr2[i2] == null) {
                    i2++;
                }
                boolean z = i >= length;
                boolean z2 = i2 >= length2;
                if (z && z2) {
                    return true;
                }
                if (z != z2 || !objArr[i].equals(objArr2[i2])) {
                    return false;
                }
                i++;
                i2++;
            } else {
                i++;
            }
        }
    }

    /* renamed from: d */
    public static int m447d(float[] fArr) {
        if (fArr == null || fArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(fArr);
    }

    /* renamed from: e */
    public static int m448e(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(jArr);
    }

    /* renamed from: f */
    public static int m449f(Object[] objArr) {
        int length = objArr == null ? 0 : objArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            if (obj != null) {
                i = (i * 31) + obj.hashCode();
            }
        }
        return i;
    }

    /* renamed from: g */
    public static void m450g(C0593m mVar, C0593m mVar2) {
        C0595o oVar = mVar.f268b;
        if (oVar != null) {
            mVar2.f268b = (C0595o) oVar.clone();
        }
    }
}
