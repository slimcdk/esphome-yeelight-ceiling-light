package p164h.p257c.p259b.p260f;

import androidx.core.view.InputDeviceCompat;
import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import com.miot.service.connection.wifi.step.SmartConfigStep;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: h.c.b.f.a */
public class C11507a {

    /* renamed from: a */
    private static final byte[] f22858a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b */
    private static final byte[] f22859b = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, ParameterInitDefType.IntVec3Init, ParameterInitDefType.IntVec4Init, ParameterInitDefType.CubemapSamplerInit, ParameterInitDefType.ExternalSamplerInit, ParameterInitDefType.DoubleInit, ParameterInitDefType.DoubleVec2Init, ParameterInitDefType.DoubleVec3Init, ParameterInitDefType.DoubleVec4Init, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: c */
    private static final byte[] f22860c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: d */
    private static final byte[] f22861d = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, ParameterInitDefType.IntVec3Init, ParameterInitDefType.IntVec4Init, ParameterInitDefType.CubemapSamplerInit, ParameterInitDefType.ExternalSamplerInit, ParameterInitDefType.DoubleInit, ParameterInitDefType.DoubleVec2Init, ParameterInitDefType.DoubleVec3Init, ParameterInitDefType.DoubleVec4Init, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: e */
    private static final byte[] f22862e = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    /* renamed from: f */
    private static final byte[] f22863f;

    /* renamed from: h.c.b.f.a$a */
    public static class C11508a extends FilterOutputStream {

        /* renamed from: a */
        private boolean f22864a;

        /* renamed from: b */
        private int f22865b;

        /* renamed from: c */
        private byte[] f22866c;

        /* renamed from: d */
        private int f22867d;

        /* renamed from: e */
        private int f22868e;

        /* renamed from: f */
        private boolean f22869f;

        /* renamed from: g */
        private byte[] f22870g;

        /* renamed from: h */
        private boolean f22871h;

        /* renamed from: i */
        private int f22872i;

        /* renamed from: j */
        private byte[] f22873j;

        public C11508a(OutputStream outputStream, int i) {
            super(outputStream);
            boolean z = true;
            this.f22869f = (i & 8) != 0;
            z = (i & 1) == 0 ? false : z;
            this.f22864a = z;
            int i2 = z ? 3 : 4;
            this.f22867d = i2;
            this.f22866c = new byte[i2];
            this.f22865b = 0;
            this.f22868e = 0;
            this.f22871h = false;
            this.f22870g = new byte[4];
            this.f22872i = i;
            this.f22873j = C11507a.m30217o(i);
        }

        /* renamed from: a */
        public void mo36407a() {
            int i = this.f22865b;
            if (i <= 0) {
                return;
            }
            if (this.f22864a) {
                OutputStream outputStream = this.out;
                byte[] bArr = this.f22870g;
                byte[] unused = C11507a.m30212j(bArr, this.f22866c, i, this.f22872i);
                outputStream.write(bArr);
                this.f22865b = 0;
                return;
            }
            throw new IOException("Base64 input not properly padded.");
        }

        public void close() {
            mo36407a();
            super.close();
            this.f22866c = null;
            this.out = null;
        }

        public void write(int i) {
            if (this.f22871h) {
                this.out.write(i);
                return;
            }
            if (this.f22864a) {
                byte[] bArr = this.f22866c;
                int i2 = this.f22865b;
                int i3 = i2 + 1;
                this.f22865b = i3;
                bArr[i2] = (byte) i;
                int i4 = this.f22867d;
                if (i3 >= i4) {
                    OutputStream outputStream = this.out;
                    byte[] bArr2 = this.f22870g;
                    byte[] unused = C11507a.m30212j(bArr2, bArr, i4, this.f22872i);
                    outputStream.write(bArr2);
                    int i5 = this.f22868e + 4;
                    this.f22868e = i5;
                    if (this.f22869f && i5 >= 76) {
                        this.out.write(10);
                        this.f22868e = 0;
                    }
                } else {
                    return;
                }
            } else {
                byte[] bArr3 = this.f22873j;
                int i6 = i & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT;
                if (bArr3[i6] > -5) {
                    byte[] bArr4 = this.f22866c;
                    int i7 = this.f22865b;
                    int i8 = i7 + 1;
                    this.f22865b = i8;
                    bArr4[i7] = (byte) i;
                    if (i8 >= this.f22867d) {
                        this.out.write(this.f22870g, 0, C11507a.m30209g(bArr4, 0, this.f22870g, 0, this.f22872i));
                    } else {
                        return;
                    }
                } else if (bArr3[i6] != -5) {
                    throw new IOException("Invalid character in Base64 data.");
                } else {
                    return;
                }
            }
            this.f22865b = 0;
        }

        public void write(byte[] bArr, int i, int i2) {
            if (this.f22871h) {
                this.out.write(bArr, i, i2);
                return;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                write(bArr[i + i3]);
            }
        }
    }

    static {
        byte[] bArr = new byte[InputDeviceCompat.SOURCE_KEYBOARD];
        // fill-array-data instruction
        bArr[0] = -9;
        bArr[1] = -9;
        bArr[2] = -9;
        bArr[3] = -9;
        bArr[4] = -9;
        bArr[5] = -9;
        bArr[6] = -9;
        bArr[7] = -9;
        bArr[8] = -9;
        bArr[9] = -5;
        bArr[10] = -5;
        bArr[11] = -9;
        bArr[12] = -9;
        bArr[13] = -5;
        bArr[14] = -9;
        bArr[15] = -9;
        bArr[16] = -9;
        bArr[17] = -9;
        bArr[18] = -9;
        bArr[19] = -9;
        bArr[20] = -9;
        bArr[21] = -9;
        bArr[22] = -9;
        bArr[23] = -9;
        bArr[24] = -9;
        bArr[25] = -9;
        bArr[26] = -9;
        bArr[27] = -9;
        bArr[28] = -9;
        bArr[29] = -9;
        bArr[30] = -9;
        bArr[31] = -9;
        bArr[32] = -5;
        bArr[33] = -9;
        bArr[34] = -9;
        bArr[35] = -9;
        bArr[36] = -9;
        bArr[37] = -9;
        bArr[38] = -9;
        bArr[39] = -9;
        bArr[40] = -9;
        bArr[41] = -9;
        bArr[42] = -9;
        bArr[43] = -9;
        bArr[44] = -9;
        bArr[45] = 0;
        bArr[46] = -9;
        bArr[47] = -9;
        bArr[48] = 1;
        bArr[49] = 2;
        bArr[50] = 3;
        bArr[51] = 4;
        bArr[52] = 5;
        bArr[53] = 6;
        bArr[54] = 7;
        bArr[55] = 8;
        bArr[56] = 9;
        bArr[57] = 10;
        bArr[58] = -9;
        bArr[59] = -9;
        bArr[60] = -9;
        bArr[61] = -1;
        bArr[62] = -9;
        bArr[63] = -9;
        bArr[64] = -9;
        bArr[65] = 11;
        bArr[66] = 12;
        bArr[67] = 13;
        bArr[68] = 14;
        bArr[69] = 15;
        bArr[70] = 16;
        bArr[71] = 17;
        bArr[72] = 18;
        bArr[73] = 19;
        bArr[74] = 20;
        bArr[75] = 21;
        bArr[76] = 22;
        bArr[77] = 23;
        bArr[78] = 24;
        bArr[79] = 25;
        bArr[80] = 26;
        bArr[81] = 27;
        bArr[82] = 28;
        bArr[83] = 29;
        bArr[84] = 30;
        bArr[85] = 31;
        bArr[86] = 32;
        bArr[87] = 33;
        bArr[88] = 34;
        bArr[89] = 35;
        bArr[90] = 36;
        bArr[91] = -9;
        bArr[92] = -9;
        bArr[93] = -9;
        bArr[94] = -9;
        bArr[95] = 37;
        bArr[96] = -9;
        bArr[97] = 38;
        bArr[98] = 39;
        bArr[99] = 40;
        bArr[100] = 41;
        bArr[101] = 42;
        bArr[102] = 43;
        bArr[103] = 44;
        bArr[104] = 45;
        bArr[105] = 46;
        bArr[106] = 47;
        bArr[107] = 48;
        bArr[108] = 49;
        bArr[109] = 50;
        bArr[110] = 51;
        bArr[111] = 52;
        bArr[112] = 53;
        bArr[113] = 54;
        bArr[114] = 55;
        bArr[115] = 56;
        bArr[116] = 57;
        bArr[117] = 58;
        bArr[118] = 59;
        bArr[119] = 60;
        bArr[120] = 61;
        bArr[121] = 62;
        bArr[122] = 63;
        bArr[123] = -9;
        bArr[124] = -9;
        bArr[125] = -9;
        bArr[126] = -9;
        bArr[127] = -9;
        bArr[128] = -9;
        bArr[129] = -9;
        bArr[130] = -9;
        bArr[131] = -9;
        bArr[132] = -9;
        bArr[133] = -9;
        bArr[134] = -9;
        bArr[135] = -9;
        bArr[136] = -9;
        bArr[137] = -9;
        bArr[138] = -9;
        bArr[139] = -9;
        bArr[140] = -9;
        bArr[141] = -9;
        bArr[142] = -9;
        bArr[143] = -9;
        bArr[144] = -9;
        bArr[145] = -9;
        bArr[146] = -9;
        bArr[147] = -9;
        bArr[148] = -9;
        bArr[149] = -9;
        bArr[150] = -9;
        bArr[151] = -9;
        bArr[152] = -9;
        bArr[153] = -9;
        bArr[154] = -9;
        bArr[155] = -9;
        bArr[156] = -9;
        bArr[157] = -9;
        bArr[158] = -9;
        bArr[159] = -9;
        bArr[160] = -9;
        bArr[161] = -9;
        bArr[162] = -9;
        bArr[163] = -9;
        bArr[164] = -9;
        bArr[165] = -9;
        bArr[166] = -9;
        bArr[167] = -9;
        bArr[168] = -9;
        bArr[169] = -9;
        bArr[170] = -9;
        bArr[171] = -9;
        bArr[172] = -9;
        bArr[173] = -9;
        bArr[174] = -9;
        bArr[175] = -9;
        bArr[176] = -9;
        bArr[177] = -9;
        bArr[178] = -9;
        bArr[179] = -9;
        bArr[180] = -9;
        bArr[181] = -9;
        bArr[182] = -9;
        bArr[183] = -9;
        bArr[184] = -9;
        bArr[185] = -9;
        bArr[186] = -9;
        bArr[187] = -9;
        bArr[188] = -9;
        bArr[189] = -9;
        bArr[190] = -9;
        bArr[191] = -9;
        bArr[192] = -9;
        bArr[193] = -9;
        bArr[194] = -9;
        bArr[195] = -9;
        bArr[196] = -9;
        bArr[197] = -9;
        bArr[198] = -9;
        bArr[199] = -9;
        bArr[200] = -9;
        bArr[201] = -9;
        bArr[202] = -9;
        bArr[203] = -9;
        bArr[204] = -9;
        bArr[205] = -9;
        bArr[206] = -9;
        bArr[207] = -9;
        bArr[208] = -9;
        bArr[209] = -9;
        bArr[210] = -9;
        bArr[211] = -9;
        bArr[212] = -9;
        bArr[213] = -9;
        bArr[214] = -9;
        bArr[215] = -9;
        bArr[216] = -9;
        bArr[217] = -9;
        bArr[218] = -9;
        bArr[219] = -9;
        bArr[220] = -9;
        bArr[221] = -9;
        bArr[222] = -9;
        bArr[223] = -9;
        bArr[224] = -9;
        bArr[225] = -9;
        bArr[226] = -9;
        bArr[227] = -9;
        bArr[228] = -9;
        bArr[229] = -9;
        bArr[230] = -9;
        bArr[231] = -9;
        bArr[232] = -9;
        bArr[233] = -9;
        bArr[234] = -9;
        bArr[235] = -9;
        bArr[236] = -9;
        bArr[237] = -9;
        bArr[238] = -9;
        bArr[239] = -9;
        bArr[240] = -9;
        bArr[241] = -9;
        bArr[242] = -9;
        bArr[243] = -9;
        bArr[244] = -9;
        bArr[245] = -9;
        bArr[246] = -9;
        bArr[247] = -9;
        bArr[248] = -9;
        bArr[249] = -9;
        bArr[250] = -9;
        bArr[251] = -9;
        bArr[252] = -9;
        bArr[253] = -9;
        bArr[254] = -9;
        bArr[255] = -9;
        bArr[256] = -9;
        f22863f = bArr;
    }

    /* renamed from: d */
    public static byte[] m30206d(String str) {
        return m30207e(str, 0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:16|17|18|19|20|(6:21|22|(3:23|24|(1:26)(1:67))|27|28|29)|30|31|32|33) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:16|(5:17|18|19|20|(6:21|22|(3:23|24|(1:26)(1:67))|27|28|29))|30|31|32|33) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:54|55|56|57|58|59|60|61) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0059 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x005c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0086 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0089 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m30207e(java.lang.String r5, int r6) {
        /*
            if (r5 == 0) goto L_0x008e
            java.lang.String r0 = "US-ASCII"
            byte[] r5 = r5.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x0009 }
            goto L_0x000d
        L_0x0009:
            byte[] r5 = r5.getBytes()
        L_0x000d:
            int r0 = r5.length
            r1 = 0
            byte[] r5 = m30208f(r5, r1, r0, r6)
            r0 = 4
            r6 = r6 & r0
            r2 = 1
            if (r6 == 0) goto L_0x001a
            r6 = 1
            goto L_0x001b
        L_0x001a:
            r6 = 0
        L_0x001b:
            if (r5 == 0) goto L_0x008d
            int r3 = r5.length
            if (r3 < r0) goto L_0x008d
            if (r6 != 0) goto L_0x008d
            byte r6 = r5[r1]
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r0 = r5[r2]
            int r0 = r0 << 8
            r2 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r2
            r6 = r6 | r0
            r0 = 35615(0x8b1f, float:4.9907E-41)
            if (r0 != r6) goto L_0x008d
            r6 = 2048(0x800, float:2.87E-42)
            byte[] r6 = new byte[r6]
            r0 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0078, all -> 0x0074 }
            r2.<init>()     // Catch:{ IOException -> 0x0078, all -> 0x0074 }
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x006f, all -> 0x006a }
            r3.<init>(r5)     // Catch:{ IOException -> 0x006f, all -> 0x006a }
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
        L_0x0048:
            int r0 = r4.read(r6)     // Catch:{ IOException -> 0x0062, all -> 0x0060 }
            if (r0 < 0) goto L_0x0052
            r2.write(r6, r1, r0)     // Catch:{ IOException -> 0x0062, all -> 0x0060 }
            goto L_0x0048
        L_0x0052:
            byte[] r5 = r2.toByteArray()     // Catch:{ IOException -> 0x0062, all -> 0x0060 }
            r2.close()     // Catch:{ Exception -> 0x0059 }
        L_0x0059:
            r4.close()     // Catch:{ Exception -> 0x005c }
        L_0x005c:
            r3.close()     // Catch:{ Exception -> 0x008d }
            goto L_0x008d
        L_0x0060:
            r5 = move-exception
            goto L_0x006d
        L_0x0062:
            r6 = move-exception
            goto L_0x0072
        L_0x0064:
            r5 = move-exception
            r4 = r0
            goto L_0x006d
        L_0x0067:
            r6 = move-exception
            r4 = r0
            goto L_0x0072
        L_0x006a:
            r5 = move-exception
            r3 = r0
            r4 = r3
        L_0x006d:
            r0 = r2
            goto L_0x0083
        L_0x006f:
            r6 = move-exception
            r3 = r0
            r4 = r3
        L_0x0072:
            r0 = r2
            goto L_0x007b
        L_0x0074:
            r5 = move-exception
            r3 = r0
            r4 = r3
            goto L_0x0083
        L_0x0078:
            r6 = move-exception
            r3 = r0
            r4 = r3
        L_0x007b:
            r6.printStackTrace()     // Catch:{ all -> 0x0082 }
            r0.close()     // Catch:{ Exception -> 0x0059 }
            goto L_0x0059
        L_0x0082:
            r5 = move-exception
        L_0x0083:
            r0.close()     // Catch:{ Exception -> 0x0086 }
        L_0x0086:
            r4.close()     // Catch:{ Exception -> 0x0089 }
        L_0x0089:
            r3.close()     // Catch:{ Exception -> 0x008c }
        L_0x008c:
            throw r5
        L_0x008d:
            return r5
        L_0x008e:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "Input string was null."
            r5.<init>(r6)
            goto L_0x0097
        L_0x0096:
            throw r5
        L_0x0097:
            goto L_0x0096
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p257c.p259b.p260f.C11507a.m30207e(java.lang.String, int):byte[]");
    }

    /* renamed from: f */
    public static byte[] m30208f(byte[] bArr, int i, int i2, int i3) {
        int i4;
        if (bArr == null) {
            throw new NullPointerException("Cannot decode null source array.");
        } else if (i < 0 || (i4 = i + i2) > bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        } else if (i2 == 0) {
            return new byte[0];
        } else {
            if (i2 >= 4) {
                byte[] o = m30217o(i3);
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
                                i6 += m30209g(bArr3, 0, bArr2, i6, i3);
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
    public static int m30209g(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        int i5;
        if (bArr == null) {
            throw new NullPointerException("Source array was null.");
        } else if (bArr2 == null) {
            throw new NullPointerException("Destination array was null.");
        } else if (i < 0 || (i4 = i + 3) >= bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i)}));
        } else if (i2 < 0 || (i5 = i2 + 2) >= bArr2.length) {
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", new Object[]{Integer.valueOf(bArr2.length), Integer.valueOf(i2)}));
        } else {
            byte[] o = m30217o(i3);
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
    public static byte[] m30210h(byte[] bArr) {
        return m30213k(bArr).getBytes();
    }

    /* renamed from: i */
    private static byte[] m30211i(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        byte[] n = m30216n(i4);
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
    public static byte[] m30212j(byte[] bArr, byte[] bArr2, int i, int i2) {
        m30211i(bArr2, 0, i, bArr, 0, i2);
        return bArr;
    }

    /* renamed from: k */
    public static String m30213k(byte[] bArr) {
        try {
            return m30214l(bArr, 0, bArr.length, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: l */
    public static String m30214l(byte[] bArr, int i, int i2, int i3) {
        byte[] m = m30215m(bArr, i, i2, i3);
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
    /* JADX WARNING: Can't wrap try/catch for region: R(12:13|14|15|16|17|18|19|20|21|22|23|25) */
    /* JADX WARNING: Can't wrap try/catch for region: R(17:8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|25) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:31|32|45|46|47|48|49|50|51) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0031 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0034 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x005b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x005e */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m30215m(byte[] r18, int r19, int r20, int r21) {
        /*
            r0 = r18
            r7 = r19
            r8 = r20
            if (r0 == 0) goto L_0x0121
            if (r7 < 0) goto L_0x010a
            if (r8 < 0) goto L_0x00f3
            int r1 = r7 + r8
            int r2 = r0.length
            r9 = 1
            if (r1 > r2) goto L_0x00cf
            r1 = r21 & 2
            if (r1 == 0) goto L_0x0062
            r1 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0051, all -> 0x004d }
            r2.<init>()     // Catch:{ IOException -> 0x0051, all -> 0x004d }
            h.c.b.f.a$a r3 = new h.c.b.f.a$a     // Catch:{ IOException -> 0x0048, all -> 0x0045 }
            r4 = r21 | 1
            r3.<init>(r2, r4)     // Catch:{ IOException -> 0x0048, all -> 0x0045 }
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x0042, all -> 0x0040 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0042, all -> 0x0040 }
            r4.write(r0, r7, r8)     // Catch:{ IOException -> 0x003e, all -> 0x003c }
            r4.close()     // Catch:{ IOException -> 0x003e, all -> 0x003c }
            r4.close()     // Catch:{ Exception -> 0x0031 }
        L_0x0031:
            r3.close()     // Catch:{ Exception -> 0x0034 }
        L_0x0034:
            r2.close()     // Catch:{ Exception -> 0x0037 }
        L_0x0037:
            byte[] r0 = r2.toByteArray()
            return r0
        L_0x003c:
            r0 = move-exception
            goto L_0x0057
        L_0x003e:
            r0 = move-exception
            goto L_0x004b
        L_0x0040:
            r0 = move-exception
            goto L_0x0058
        L_0x0042:
            r0 = move-exception
            r4 = r1
            goto L_0x004b
        L_0x0045:
            r0 = move-exception
            r3 = r1
            goto L_0x0058
        L_0x0048:
            r0 = move-exception
            r3 = r1
            r4 = r3
        L_0x004b:
            r1 = r2
            goto L_0x0054
        L_0x004d:
            r0 = move-exception
            r2 = r1
            r3 = r2
            goto L_0x0058
        L_0x0051:
            r0 = move-exception
            r3 = r1
            r4 = r3
        L_0x0054:
            throw r0     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            r2 = r1
        L_0x0057:
            r1 = r4
        L_0x0058:
            r1.close()     // Catch:{ Exception -> 0x005b }
        L_0x005b:
            r3.close()     // Catch:{ Exception -> 0x005e }
        L_0x005e:
            r2.close()     // Catch:{ Exception -> 0x0061 }
        L_0x0061:
            throw r0
        L_0x0062:
            r1 = r21 & 8
            if (r1 == 0) goto L_0x0068
            r11 = 1
            goto L_0x0069
        L_0x0068:
            r11 = 0
        L_0x0069:
            int r1 = r8 / 3
            r12 = 4
            int r1 = r1 * 4
            int r2 = r8 % 3
            if (r2 <= 0) goto L_0x0074
            r2 = 4
            goto L_0x0075
        L_0x0074:
            r2 = 0
        L_0x0075:
            int r1 = r1 + r2
            if (r11 == 0) goto L_0x007b
            int r2 = r1 / 76
            int r1 = r1 + r2
        L_0x007b:
            r13 = r1
            byte[] r14 = new byte[r13]
            int r15 = r8 + -2
            r6 = 0
            r16 = 0
            r17 = 0
        L_0x0085:
            if (r6 >= r15) goto L_0x00af
            int r2 = r6 + r7
            r3 = 3
            r1 = r18
            r4 = r14
            r5 = r16
            r10 = r6
            r6 = r21
            m30211i(r1, r2, r3, r4, r5, r6)
            int r1 = r17 + 4
            if (r11 == 0) goto L_0x00a8
            r2 = 76
            if (r1 < r2) goto L_0x00a8
            int r1 = r16 + 4
            r2 = 10
            r14[r1] = r2
            int r16 = r16 + 1
            r17 = 0
            goto L_0x00aa
        L_0x00a8:
            r17 = r1
        L_0x00aa:
            int r6 = r10 + 3
            int r16 = r16 + 4
            goto L_0x0085
        L_0x00af:
            r10 = r6
            if (r10 >= r8) goto L_0x00c2
            int r2 = r10 + r7
            int r3 = r8 - r10
            r1 = r18
            r4 = r14
            r5 = r16
            r6 = r21
            m30211i(r1, r2, r3, r4, r5, r6)
            int r16 = r16 + 4
        L_0x00c2:
            r0 = r16
            int r13 = r13 - r9
            if (r0 > r13) goto L_0x00ce
            byte[] r1 = new byte[r0]
            r2 = 0
            java.lang.System.arraycopy(r14, r2, r1, r2, r0)
            return r1
        L_0x00ce:
            return r14
        L_0x00cf:
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
        L_0x00f3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot have length offset: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x010a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot have negative offset: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0121:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Cannot serialize a null array."
            r0.<init>(r1)
            goto L_0x012a
        L_0x0129:
            throw r0
        L_0x012a:
            goto L_0x0129
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p257c.p259b.p260f.C11507a.m30215m(byte[], int, int, int):byte[]");
    }

    /* renamed from: n */
    private static final byte[] m30216n(int i) {
        return (i & 16) == 16 ? f22860c : (i & 32) == 32 ? f22862e : f22858a;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final byte[] m30217o(int i) {
        return (i & 16) == 16 ? f22861d : (i & 32) == 32 ? f22863f : f22859b;
    }
}
