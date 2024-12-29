package p014c0;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.p017ar.schemas.sceneform.ParameterInitDefType;

@ShowFirstParty
@KeepForSdk
/* renamed from: c0.j */
public class C0621j {

    /* renamed from: a */
    private static final char[] f236a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    private static final char[] f237b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static String m218a(@NonNull byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length + length)];
        int i = 0;
        for (byte b : bArr) {
            byte b2 = b & 255;
            int i2 = i + 1;
            char[] cArr2 = f237b;
            cArr[i] = cArr2[b2 >>> 4];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & ParameterInitDefType.CubemapSamplerInit];
        }
        return new String(cArr);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public static String m219b(@NonNull byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        int i = 0;
        while (i < length && (!z || i != length - 1 || (bArr[i] & 255) != 0)) {
            char[] cArr = f236a;
            sb.append(cArr[(bArr[i] & 240) >>> 4]);
            sb.append(cArr[bArr[i] & ParameterInitDefType.CubemapSamplerInit]);
            i++;
        }
        return sb.toString();
    }
}
