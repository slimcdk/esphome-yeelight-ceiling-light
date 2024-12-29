package com.google.android.gms.internal.wearable;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;

/* renamed from: com.google.android.gms.internal.wearable.z2 */
final class C1538z2 {
    /* renamed from: a */
    static /* synthetic */ boolean m4015a(byte b) {
        return b >= 0;
    }

    /* renamed from: b */
    static /* synthetic */ void m4016b(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m4019e(b2)) {
            throw zzcc.zzg();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* renamed from: c */
    static /* synthetic */ void m4017c(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!m4019e(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!m4019e(b3)) {
                cArr[i] = (char) (((b & ParameterInitDefType.CubemapSamplerInit) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw zzcc.zzg();
    }

    /* renamed from: d */
    static /* synthetic */ void m4018d(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m4019e(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m4019e(b3) || m4019e(b4)) {
            throw zzcc.zzg();
        }
        byte b5 = ((b & 7) << ParameterInitDefType.DoubleVec2Init) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }

    /* renamed from: e */
    private static boolean m4019e(byte b) {
        return b > -65;
    }
}
