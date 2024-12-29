package com.xiaomi.push;

import android.content.Context;
import com.google.p017ar.schemas.sceneform.ParameterInitDefType;

/* renamed from: com.xiaomi.push.ai */
public class C4513ai {

    /* renamed from: a */
    static final char[] f7547a = "0123456789ABCDEF".toCharArray();

    /* renamed from: a */
    public static String m12850a(byte[] bArr, int i, int i2) {
        StringBuilder sb = new StringBuilder(i2 * 2);
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = bArr[i + i3] & 255;
            char[] cArr = f7547a;
            sb.append(cArr[b >> 4]);
            sb.append(cArr[b & ParameterInitDefType.CubemapSamplerInit]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m12851a(Context context) {
        return C4512ah.f7546a;
    }
}
