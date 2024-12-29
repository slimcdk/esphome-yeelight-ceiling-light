package com.google.flatbuffers;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.nio.ByteBuffer;

public abstract class Utf8 {
    private static Utf8 DEFAULT;

    /* renamed from: com.google.flatbuffers.Utf8$a */
    static class C2453a {
        /* renamed from: a */
        static void m6646a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
            if (m6652g(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m6652g(b3) || m6652g(b4)) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            byte b5 = ((b & 7) << ParameterInitDefType.DoubleVec2Init) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
            cArr[i] = (char) ((b5 >>> 10) + 55232);
            cArr[i + 1] = (char) ((b5 & 1023) + 56320);
        }

        /* renamed from: b */
        static void m6647b(byte b, byte b2, byte b3, char[] cArr, int i) {
            if (m6652g(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m6652g(b3)))) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            cArr[i] = (char) (((b & ParameterInitDefType.CubemapSamplerInit) << 12) | ((b2 & 63) << 6) | (b3 & 63));
        }

        /* renamed from: c */
        static void m6648c(byte b, byte b2, char[] cArr, int i) {
            if (b < -62) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            } else if (!m6652g(b2)) {
                cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
            } else {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
        }

        /* renamed from: d */
        static boolean m6649d(byte b) {
            return b >= 0;
        }

        /* renamed from: e */
        static boolean m6650e(byte b) {
            return b < -32;
        }

        /* renamed from: f */
        static boolean m6651f(byte b) {
            return b < -16;
        }

        /* renamed from: g */
        private static boolean m6652g(byte b) {
            return b > -65;
        }
    }

    public static Utf8 getDefault() {
        if (DEFAULT == null) {
            DEFAULT = new Utf8Safe();
        }
        return DEFAULT;
    }

    public static void setDefault(Utf8 utf8) {
        DEFAULT = utf8;
    }

    public abstract String decodeUtf8(ByteBuffer byteBuffer, int i, int i2);

    public abstract void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int encodedLength(CharSequence charSequence);
}
