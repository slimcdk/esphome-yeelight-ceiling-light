package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.p107ar.schemas.sceneform.ParameterInitDefType;

@ShowFirstParty
@KeepForSdk
/* renamed from: com.google.android.gms.common.util.j */
public class C1656j {

    /* renamed from: a */
    private static final char[] f3174a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    private static final char[] f3175b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @KeepForSdk
    /* renamed from: a */
    public static String m4596a(byte[] bArr) {
        char[] cArr = new char[(bArr.length << 1)];
        int i = 0;
        for (byte b : bArr) {
            byte b2 = b & 255;
            int i2 = i + 1;
            char[] cArr2 = f3175b;
            cArr[i] = cArr2[b2 >>> 4];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & ParameterInitDefType.CubemapSamplerInit];
        }
        return new String(cArr);
    }

    @KeepForSdk
    /* renamed from: b */
    public static String m4597b(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length << 1);
        int i = 0;
        while (i < length && (!z || i != length - 1 || (bArr[i] & 255) != 0)) {
            sb.append(f3174a[(bArr[i] & 240) >>> 4]);
            sb.append(f3174a[bArr[i] & ParameterInitDefType.CubemapSamplerInit]);
            i++;
        }
        return sb.toString();
    }
}
