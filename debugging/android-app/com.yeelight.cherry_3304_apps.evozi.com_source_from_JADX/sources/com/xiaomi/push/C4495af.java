package com.xiaomi.push;

import android.content.Context;
import com.google.p107ar.schemas.sceneform.ParameterInitDefType;

/* renamed from: com.xiaomi.push.af */
public class C4495af {

    /* renamed from: a */
    static final char[] f8152a = "0123456789ABCDEF".toCharArray();

    /* renamed from: a */
    public static String m13263a(byte[] bArr, int i, int i2) {
        StringBuilder sb = new StringBuilder(i2 * 2);
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = bArr[i + i3] & 255;
            sb.append(f8152a[b >> 4]);
            sb.append(f8152a[b & ParameterInitDefType.CubemapSamplerInit]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m13264a(Context context) {
        return C4494ae.f8151a;
    }
}
