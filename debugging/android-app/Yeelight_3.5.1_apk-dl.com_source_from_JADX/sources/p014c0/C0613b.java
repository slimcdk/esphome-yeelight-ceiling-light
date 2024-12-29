package p014c0;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C0914h;
import com.google.android.gms.common.util.VisibleForTesting;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Array;
import java.util.Arrays;

@KeepForSdk
@VisibleForTesting
/* renamed from: c0.b */
public final class C0613b {
    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static <T> T[] m187a(@NonNull T[]... tArr) {
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
            int length3 = tArr2.length;
            System.arraycopy(tArr2, 0, copyOf, length2, length3);
            length2 += length3;
        }
        return copyOf;
    }

    @KeepForSdk
    /* renamed from: b */
    public static boolean m188b(@NonNull int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    /* renamed from: c */
    public static <T> boolean m189c(@NonNull T[] tArr, @NonNull T t) {
        int length = tArr != null ? tArr.length : 0;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (!C0914h.m1402a(tArr[i], t)) {
                i++;
            } else if (i >= 0) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    /* renamed from: d */
    public static void m190d(@NonNull StringBuilder sb, @NonNull double[] dArr) {
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(Double.toString(dArr[i]));
        }
    }

    @KeepForSdk
    /* renamed from: e */
    public static void m191e(@NonNull StringBuilder sb, @NonNull float[] fArr) {
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(Float.toString(fArr[i]));
        }
    }

    @KeepForSdk
    /* renamed from: f */
    public static void m192f(@NonNull StringBuilder sb, @NonNull int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(Integer.toString(iArr[i]));
        }
    }

    @KeepForSdk
    /* renamed from: g */
    public static void m193g(@NonNull StringBuilder sb, @NonNull long[] jArr) {
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(Long.toString(jArr[i]));
        }
    }

    @KeepForSdk
    /* renamed from: h */
    public static <T> void m194h(@NonNull StringBuilder sb, @NonNull T[] tArr) {
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(tArr[i]);
        }
    }

    @KeepForSdk
    /* renamed from: i */
    public static void m195i(@NonNull StringBuilder sb, @NonNull boolean[] zArr) {
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(Boolean.toString(zArr[i]));
        }
    }

    @KeepForSdk
    /* renamed from: j */
    public static void m196j(@NonNull StringBuilder sb, @NonNull String[] strArr) {
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
