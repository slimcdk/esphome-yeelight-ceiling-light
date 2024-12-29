package p163g7;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import com.miot.service.connection.wifi.step.SmartConfigStep;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Objects;

/* renamed from: g7.a */
public class C9087a {

    /* renamed from: a */
    private static final byte[] f16729a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b */
    private static final byte[] f16730b = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, ParameterInitDefType.IntVec3Init, ParameterInitDefType.IntVec4Init, ParameterInitDefType.CubemapSamplerInit, ParameterInitDefType.ExternalSamplerInit, ParameterInitDefType.DoubleInit, ParameterInitDefType.DoubleVec2Init, ParameterInitDefType.DoubleVec3Init, ParameterInitDefType.DoubleVec4Init, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: c */
    private static final byte[] f16731c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: d */
    private static final byte[] f16732d = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, ParameterInitDefType.IntVec3Init, ParameterInitDefType.IntVec4Init, ParameterInitDefType.CubemapSamplerInit, ParameterInitDefType.ExternalSamplerInit, ParameterInitDefType.DoubleInit, ParameterInitDefType.DoubleVec2Init, ParameterInitDefType.DoubleVec3Init, ParameterInitDefType.DoubleVec4Init, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: e */
    private static final byte[] f16733e = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    /* renamed from: f */
    private static final byte[] f16734f = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, ParameterInitDefType.IntVec3Init, ParameterInitDefType.IntVec4Init, ParameterInitDefType.CubemapSamplerInit, ParameterInitDefType.ExternalSamplerInit, ParameterInitDefType.DoubleInit, ParameterInitDefType.DoubleVec2Init, ParameterInitDefType.DoubleVec3Init, ParameterInitDefType.DoubleVec4Init, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: g7.a$a */
    public static class C9088a extends FilterOutputStream {

        /* renamed from: a */
        private boolean f16735a;

        /* renamed from: b */
        private int f16736b;

        /* renamed from: c */
        private byte[] f16737c;

        /* renamed from: d */
        private int f16738d;

        /* renamed from: e */
        private int f16739e;

        /* renamed from: f */
        private boolean f16740f;

        /* renamed from: g */
        private byte[] f16741g;

        /* renamed from: h */
        private boolean f16742h;

        /* renamed from: i */
        private int f16743i;

        /* renamed from: j */
        private byte[] f16744j;

        public C9088a(OutputStream outputStream, int i) {
            super(outputStream);
            boolean z = true;
            this.f16740f = (i & 8) != 0;
            z = (i & 1) == 0 ? false : z;
            this.f16735a = z;
            int i2 = z ? 3 : 4;
            this.f16738d = i2;
            this.f16737c = new byte[i2];
            this.f16736b = 0;
            this.f16739e = 0;
            this.f16742h = false;
            this.f16741g = new byte[4];
            this.f16743i = i;
            this.f16744j = C9087a.m21791o(i);
        }

        /* renamed from: a */
        public void mo37077a() {
            int i = this.f16736b;
            if (i <= 0) {
                return;
            }
            if (this.f16735a) {
                this.out.write(C9087a.m21786j(this.f16741g, this.f16737c, i, this.f16743i));
                this.f16736b = 0;
                return;
            }
            throw new IOException("Base64 input not properly padded.");
        }

        public void close() {
            mo37077a();
            super.close();
            this.f16737c = null;
            this.out = null;
        }

        public void write(int i) {
            if (this.f16742h) {
                this.out.write(i);
                return;
            }
            if (this.f16735a) {
                byte[] bArr = this.f16737c;
                int i2 = this.f16736b;
                int i3 = i2 + 1;
                this.f16736b = i3;
                bArr[i2] = (byte) i;
                int i4 = this.f16738d;
                if (i3 >= i4) {
                    this.out.write(C9087a.m21786j(this.f16741g, bArr, i4, this.f16743i));
                    int i5 = this.f16739e + 4;
                    this.f16739e = i5;
                    if (this.f16740f && i5 >= 76) {
                        this.out.write(10);
                        this.f16739e = 0;
                    }
                } else {
                    return;
                }
            } else {
                byte[] bArr2 = this.f16744j;
                int i6 = i & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT;
                if (bArr2[i6] > -5) {
                    byte[] bArr3 = this.f16737c;
                    int i7 = this.f16736b;
                    int i8 = i7 + 1;
                    this.f16736b = i8;
                    bArr3[i7] = (byte) i;
                    if (i8 >= this.f16738d) {
                        this.out.write(this.f16741g, 0, C9087a.m21783g(bArr3, 0, this.f16741g, 0, this.f16743i));
                    } else {
                        return;
                    }
                } else if (bArr2[i6] != -5) {
                    throw new IOException("Invalid character in Base64 data.");
                } else {
                    return;
                }
            }
            this.f16736b = 0;
        }

        public void write(byte[] bArr, int i, int i2) {
            if (this.f16742h) {
                this.out.write(bArr, i, i2);
                return;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                write(bArr[i + i3]);
            }
        }
    }

    /* renamed from: d */
    public static byte[] m21780d(String str) {
        return m21781e(str, 0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|(3:16|17|(8:18|19|20|21|(3:22|23|(1:25)(1:64))|26|27|28))|29|30|31|32) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:15|16|17|(8:18|19|20|21|(3:22|23|(1:25)(1:64))|26|27|28)|29|30|31|32) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:53|54|55|56|57|58|59|60) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x005c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x005f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0089 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x008c */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m21781e(java.lang.String r5, int r6) {
        /*
            java.lang.String r0 = "Input string was null."
            java.util.Objects.requireNonNull(r5, r0)
            java.lang.String r0 = "US-ASCII"
            byte[] r5 = r5.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x000c }
            goto L_0x0010
        L_0x000c:
            byte[] r5 = r5.getBytes()
        L_0x0010:
            int r0 = r5.length
            r1 = 0
            byte[] r5 = m21782f(r5, r1, r0, r6)
            r0 = 4
            r6 = r6 & r0
            r2 = 1
            if (r6 == 0) goto L_0x001d
            r6 = 1
            goto L_0x001e
        L_0x001d:
            r6 = 0
        L_0x001e:
            if (r5 == 0) goto L_0x0090
            int r3 = r5.length
            if (r3 < r0) goto L_0x0090
            if (r6 != 0) goto L_0x0090
            byte r6 = r5[r1]
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r0 = r5[r2]
            int r0 = r0 << 8
            r2 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r2
            r6 = r6 | r0
            r0 = 35615(0x8b1f, float:4.9907E-41)
            if (r0 != r6) goto L_0x0090
            r6 = 2048(0x800, float:2.87E-42)
            byte[] r6 = new byte[r6]
            r0 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x007b, all -> 0x0077 }
            r2.<init>()     // Catch:{ IOException -> 0x007b, all -> 0x0077 }
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0072, all -> 0x006d }
            r3.<init>(r5)     // Catch:{ IOException -> 0x0072, all -> 0x006d }
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x006a, all -> 0x0067 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x006a, all -> 0x0067 }
        L_0x004b:
            int r0 = r4.read(r6)     // Catch:{ IOException -> 0x0065, all -> 0x0063 }
            if (r0 < 0) goto L_0x0055
            r2.write(r6, r1, r0)     // Catch:{ IOException -> 0x0065, all -> 0x0063 }
            goto L_0x004b
        L_0x0055:
            byte[] r5 = r2.toByteArray()     // Catch:{ IOException -> 0x0065, all -> 0x0063 }
            r2.close()     // Catch:{ Exception -> 0x005c }
        L_0x005c:
            r4.close()     // Catch:{ Exception -> 0x005f }
        L_0x005f:
            r3.close()     // Catch:{ Exception -> 0x0090 }
            goto L_0x0090
        L_0x0063:
            r5 = move-exception
            goto L_0x0070
        L_0x0065:
            r6 = move-exception
            goto L_0x0075
        L_0x0067:
            r5 = move-exception
            r4 = r0
            goto L_0x0070
        L_0x006a:
            r6 = move-exception
            r4 = r0
            goto L_0x0075
        L_0x006d:
            r5 = move-exception
            r3 = r0
            r4 = r3
        L_0x0070:
            r0 = r2
            goto L_0x0086
        L_0x0072:
            r6 = move-exception
            r3 = r0
            r4 = r3
        L_0x0075:
            r0 = r2
            goto L_0x007e
        L_0x0077:
            r5 = move-exception
            r3 = r0
            r4 = r3
            goto L_0x0086
        L_0x007b:
            r6 = move-exception
            r3 = r0
            r4 = r3
        L_0x007e:
            r6.printStackTrace()     // Catch:{ all -> 0x0085 }
            r0.close()     // Catch:{ Exception -> 0x005c }
            goto L_0x005c
        L_0x0085:
            r5 = move-exception
        L_0x0086:
            r0.close()     // Catch:{ Exception -> 0x0089 }
        L_0x0089:
            r4.close()     // Catch:{ Exception -> 0x008c }
        L_0x008c:
            r3.close()     // Catch:{ Exception -> 0x008f }
        L_0x008f:
            throw r5
        L_0x0090:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g7.C9087a.m21781e(java.lang.String, int):byte[]");
    }

    /* renamed from: f */
    public static byte[] m21782f(byte[] bArr, int i, int i2, int i3) {
        int i4;
        Objects.requireNonNull(bArr, "Cannot decode null source array.");
        if (i < 0 || (i4 = i + i2) > bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        } else if (i2 == 0) {
            return new byte[0];
        } else {
            if (i2 >= 4) {
                byte[] o = m21791o(i3);
                byte[] bArr2 = new byte[((i2 * 3) / 4)];
                byte[] bArr3 = new byte[4];
                int i5 = 0;
                int i6 = 0;
                while (i < i4) {
                    byte b = o[bArr[i] & 255];
                    if (b >= -5) {
                        if (b >= -1) {
                            int i7 = i5 + 1;
                            bArr3[i5] = bArr[i];
                            if (i7 > 3) {
                                i6 += m21783g(bArr3, 0, bArr2, i6, i3);
                                if (bArr[i] == 61) {
                                    break;
                                }
                                i5 = 0;
                            } else {
                                i5 = i7;
                            }
                        }
                        i++;
                    } else {
                        throw new IOException(String.format("Bad Base64 input character decimal %d in array position %d", new Object[]{Integer.valueOf(bArr[i] & 255), Integer.valueOf(i)}));
                    }
                }
                byte[] bArr4 = new byte[i6];
                System.arraycopy(bArr2, 0, bArr4, 0, i6);
                return bArr4;
            }
            throw new IllegalArgumentException("Base64-encoded string must have at least four characters, but length specified was " + i2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static int m21783g(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        int i5;
        Objects.requireNonNull(bArr, "Source array was null.");
        Objects.requireNonNull(bArr2, "Destination array was null.");
        if (i < 0 || (i4 = i + 3) >= bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i)}));
        } else if (i2 < 0 || (i5 = i2 + 2) >= bArr2.length) {
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", new Object[]{Integer.valueOf(bArr2.length), Integer.valueOf(i2)}));
        } else {
            byte[] o = m21791o(i3);
            int i6 = i + 2;
            if (bArr[i6] == 61) {
                bArr2[i2] = (byte) ((((o[bArr[i + 1]] & 255) << 12) | ((o[bArr[i]] & 255) << ParameterInitDefType.DoubleVec2Init)) >>> 16);
                return 1;
            } else if (bArr[i4] == 61) {
                int i7 = (o[bArr[i]] & 255) << ParameterInitDefType.DoubleVec2Init;
                int i8 = ((o[bArr[i6]] & 255) << 6) | ((o[bArr[i + 1]] & 255) << 12) | i7;
                bArr2[i2] = (byte) (i8 >>> 16);
                bArr2[i2 + 1] = (byte) (i8 >>> 8);
                return 2;
            } else {
                int i9 = (o[bArr[i]] & 255) << ParameterInitDefType.DoubleVec2Init;
                byte b = (o[bArr[i4]] & 255) | ((o[bArr[i + 1]] & 255) << 12) | i9 | ((o[bArr[i6]] & 255) << 6);
                bArr2[i2] = (byte) (b >> ParameterInitDefType.ExternalSamplerInit);
                bArr2[i2 + 1] = (byte) (b >> 8);
                bArr2[i5] = (byte) b;
                return 3;
            }
        }
    }

    /* renamed from: h */
    public static byte[] m21784h(byte[] bArr) {
        return m21787k(bArr).getBytes();
    }

    /* renamed from: i */
    private static byte[] m21785i(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        byte[] n = m21790n(i4);
        int i5 = 0;
        int i6 = (i2 > 0 ? (bArr[i] << 24) >>> 8 : 0) | (i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0);
        if (i2 > 2) {
            i5 = (bArr[i + 2] << 24) >>> 24;
        }
        int i7 = i6 | i5;
        if (i2 == 1) {
            bArr2[i3] = n[i7 >>> 18];
            bArr2[i3 + 1] = n[(i7 >>> 12) & 63];
            bArr2[i3 + 2] = 61;
            bArr2[i3 + 3] = 61;
            return bArr2;
        } else if (i2 == 2) {
            bArr2[i3] = n[i7 >>> 18];
            bArr2[i3 + 1] = n[(i7 >>> 12) & 63];
            bArr2[i3 + 2] = n[(i7 >>> 6) & 63];
            bArr2[i3 + 3] = 61;
            return bArr2;
        } else if (i2 != 3) {
            return bArr2;
        } else {
            bArr2[i3] = n[i7 >>> 18];
            bArr2[i3 + 1] = n[(i7 >>> 12) & 63];
            bArr2[i3 + 2] = n[(i7 >>> 6) & 63];
            bArr2[i3 + 3] = n[i7 & 63];
            return bArr2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static byte[] m21786j(byte[] bArr, byte[] bArr2, int i, int i2) {
        m21785i(bArr2, 0, i, bArr, 0, i2);
        return bArr;
    }

    /* renamed from: k */
    public static String m21787k(byte[] bArr) {
        try {
            return m21788l(bArr, 0, bArr.length, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: l */
    public static String m21788l(byte[] bArr, int i, int i2, int i3) {
        byte[] m = m21789m(bArr, i, i2, i3);
        try {
            return new String(m, "US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new String(m);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX WARNING: type inference failed for: r2v16, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: type inference failed for: r2v21 */
    /* JADX WARNING: type inference failed for: r2v22 */
    /* JADX WARNING: type inference failed for: r2v23 */
    /* JADX WARNING: Can't wrap try/catch for region: R(12:12|13|14|15|16|17|18|19|20|21|22|24) */
    /* JADX WARNING: Can't wrap try/catch for region: R(17:7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:30|31|44|45|46|47|(2:48|49)|50) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0034 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x005e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x0061 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m21789m(byte[] r18, int r19, int r20, int r21) {
        /*
            r0 = r18
            r7 = r19
            r8 = r20
            java.lang.String r1 = "Cannot serialize a null array."
            java.util.Objects.requireNonNull(r0, r1)
            if (r7 < 0) goto L_0x010d
            if (r8 < 0) goto L_0x00f6
            int r1 = r7 + r8
            int r2 = r0.length
            r9 = 1
            if (r1 > r2) goto L_0x00d2
            r1 = r21 & 2
            if (r1 == 0) goto L_0x0065
            r1 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0054, all -> 0x0050 }
            r2.<init>()     // Catch:{ IOException -> 0x0054, all -> 0x0050 }
            g7.a$a r3 = new g7.a$a     // Catch:{ IOException -> 0x004b, all -> 0x0048 }
            r4 = r21 | 1
            r3.<init>(r2, r4)     // Catch:{ IOException -> 0x004b, all -> 0x0048 }
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x0045, all -> 0x0043 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0045, all -> 0x0043 }
            r4.write(r0, r7, r8)     // Catch:{ IOException -> 0x0041, all -> 0x003f }
            r4.close()     // Catch:{ IOException -> 0x0041, all -> 0x003f }
            r4.close()     // Catch:{ Exception -> 0x0034 }
        L_0x0034:
            r3.close()     // Catch:{ Exception -> 0x0037 }
        L_0x0037:
            r2.close()     // Catch:{ Exception -> 0x003a }
        L_0x003a:
            byte[] r0 = r2.toByteArray()
            return r0
        L_0x003f:
            r0 = move-exception
            goto L_0x005a
        L_0x0041:
            r0 = move-exception
            goto L_0x004e
        L_0x0043:
            r0 = move-exception
            goto L_0x005b
        L_0x0045:
            r0 = move-exception
            r4 = r1
            goto L_0x004e
        L_0x0048:
            r0 = move-exception
            r3 = r1
            goto L_0x005b
        L_0x004b:
            r0 = move-exception
            r3 = r1
            r4 = r3
        L_0x004e:
            r1 = r2
            goto L_0x0057
        L_0x0050:
            r0 = move-exception
            r2 = r1
            r3 = r2
            goto L_0x005b
        L_0x0054:
            r0 = move-exception
            r3 = r1
            r4 = r3
        L_0x0057:
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = move-exception
            r2 = r1
        L_0x005a:
            r1 = r4
        L_0x005b:
            r1.close()     // Catch:{ Exception -> 0x005e }
        L_0x005e:
            r3.close()     // Catch:{ Exception -> 0x0061 }
        L_0x0061:
            r2.close()     // Catch:{ Exception -> 0x0064 }
        L_0x0064:
            throw r0
        L_0x0065:
            r1 = r21 & 8
            if (r1 == 0) goto L_0x006b
            r11 = 1
            goto L_0x006c
        L_0x006b:
            r11 = 0
        L_0x006c:
            int r1 = r8 / 3
            r12 = 4
            int r1 = r1 * 4
            int r2 = r8 % 3
            if (r2 <= 0) goto L_0x0077
            r2 = 4
            goto L_0x0078
        L_0x0077:
            r2 = 0
        L_0x0078:
            int r1 = r1 + r2
            if (r11 == 0) goto L_0x007e
            int r2 = r1 / 76
            int r1 = r1 + r2
        L_0x007e:
            r13 = r1
            byte[] r14 = new byte[r13]
            int r15 = r8 + -2
            r6 = 0
            r16 = 0
            r17 = 0
        L_0x0088:
            if (r6 >= r15) goto L_0x00b2
            int r2 = r6 + r7
            r3 = 3
            r1 = r18
            r4 = r14
            r5 = r16
            r10 = r6
            r6 = r21
            m21785i(r1, r2, r3, r4, r5, r6)
            int r1 = r17 + 4
            if (r11 == 0) goto L_0x00ab
            r2 = 76
            if (r1 < r2) goto L_0x00ab
            int r1 = r16 + 4
            r2 = 10
            r14[r1] = r2
            int r16 = r16 + 1
            r17 = 0
            goto L_0x00ad
        L_0x00ab:
            r17 = r1
        L_0x00ad:
            int r6 = r10 + 3
            int r16 = r16 + 4
            goto L_0x0088
        L_0x00b2:
            r10 = r6
            if (r10 >= r8) goto L_0x00c5
            int r2 = r10 + r7
            int r3 = r8 - r10
            r1 = r18
            r4 = r14
            r5 = r16
            r6 = r21
            m21785i(r1, r2, r3, r4, r5, r6)
            int r16 = r16 + 4
        L_0x00c5:
            r0 = r16
            int r13 = r13 - r9
            if (r0 > r13) goto L_0x00d1
            byte[] r1 = new byte[r0]
            r2 = 0
            java.lang.System.arraycopy(r14, r2, r1, r2, r0)
            return r1
        L_0x00d1:
            return r14
        L_0x00d2:
            r2 = 0
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r19)
            r3[r2] = r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r3[r9] = r2
            int r0 = r0.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 2
            r3[r2] = r0
            java.lang.String r0 = "Cannot have offset of %d and length of %d with array of length %d"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r1.<init>(r0)
            throw r1
        L_0x00f6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot have length offset: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x010d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot have negative offset: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            goto L_0x0125
        L_0x0124:
            throw r0
        L_0x0125:
            goto L_0x0124
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g7.C9087a.m21789m(byte[], int, int, int):byte[]");
    }

    /* renamed from: n */
    private static final byte[] m21790n(int i) {
        return (i & 16) == 16 ? f16731c : (i & 32) == 32 ? f16733e : f16729a;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final byte[] m21791o(int i) {
        return (i & 16) == 16 ? f16732d : (i & 32) == 32 ? f16734f : f16730b;
    }
}
