package com.google.android.gms.internal.measurement;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;

/* renamed from: com.google.android.gms.internal.measurement.ya */
final class C1395ya {
    /* renamed from: a */
    static /* bridge */ /* synthetic */ void m3360a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m3364e(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m3364e(b3) || m3364e(b4)) {
            throw zzkm.zzc();
        }
        byte b5 = ((b & 7) << ParameterInitDefType.DoubleVec2Init) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m3361b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!m3364e(b2)) {
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
            if (!m3364e(b3)) {
                cArr[i] = (char) (((b & ParameterInitDefType.CubemapSamplerInit) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw zzkm.zzc();
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ void m3362c(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m3364e(b2)) {
            throw zzkm.zzc();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* renamed from: d */
    static /* bridge */ /* synthetic */ boolean m3363d(byte b) {
        return b >= 0;
    }

    /* renamed from: e */
    private static boolean m3364e(byte b) {
        return b > -65;
    }
}
