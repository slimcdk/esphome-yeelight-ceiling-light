package com.miot.service.common.crypto;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import com.miot.service.connection.wifi.step.SmartConfigStep;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Serializable;

public class Base64Coder {
    public static final int DECODE = 0;
    public static final int DONT_BREAK_LINES = 8;
    public static final int ENCODE = 1;
    private static final byte EQUALS_SIGN = 61;
    private static final byte EQUALS_SIGN_ENC = -1;
    public static final int GZIP = 2;
    private static final int MAX_LINE_LENGTH = 76;
    private static final byte NEW_LINE = 10;
    public static final int NO_OPTIONS = 0;
    public static final int ORDERED = 32;
    private static final String PREFERRED_ENCODING = "UTF-8";
    public static final int URL_SAFE = 16;
    private static final byte WHITE_SPACE_ENC = -5;
    private static final byte[] _ORDERED_ALPHABET = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
    private static final byte[] _ORDERED_DECODABET;
    private static final byte[] _STANDARD_ALPHABET = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] _STANDARD_DECODABET;
    private static final byte[] _URL_SAFE_ALPHABET = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final byte[] _URL_SAFE_DECODABET;

    public static class InputStream extends FilterInputStream {
        private byte[] alphabet;
        private boolean breakLines;
        private byte[] buffer;
        private int bufferLength;
        private byte[] decodabet;
        private boolean encode;
        private int lineLength;
        private int numSigBytes;
        private int options;
        private int position;

        public InputStream(java.io.InputStream inputStream) {
            this(inputStream, 0);
        }

        public InputStream(java.io.InputStream inputStream, int i) {
            super(inputStream);
            boolean z = true;
            this.breakLines = (i & 8) != 8;
            z = (i & 1) != 1 ? false : z;
            this.encode = z;
            int i2 = z ? 4 : 3;
            this.bufferLength = i2;
            this.buffer = new byte[i2];
            this.position = -1;
            this.lineLength = 0;
            this.options = i;
            this.alphabet = Base64Coder.getAlphabet(i);
            this.decodabet = Base64Coder.getDecodabet(i);
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0051 A[LOOP:1: B:19:0x003b->B:25:0x0051, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0057 A[EDGE_INSN: B:58:0x0057->B:26:0x0057 ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int read() {
            /*
                r10 = this;
                int r0 = r10.position
                r1 = -1
                r2 = 0
                if (r0 >= 0) goto L_0x0071
                boolean r0 = r10.encode
                r3 = 4
                if (r0 == 0) goto L_0x0038
                r0 = 3
                byte[] r4 = new byte[r0]
                r5 = 0
                r6 = 0
            L_0x0010:
                if (r5 >= r0) goto L_0x0027
                java.io.InputStream r7 = r10.in     // Catch:{ IOException -> 0x0020 }
                int r7 = r7.read()     // Catch:{ IOException -> 0x0020 }
                if (r7 < 0) goto L_0x0023
                byte r7 = (byte) r7     // Catch:{ IOException -> 0x0020 }
                r4[r5] = r7     // Catch:{ IOException -> 0x0020 }
                int r6 = r6 + 1
                goto L_0x0023
            L_0x0020:
                r7 = move-exception
                if (r5 == 0) goto L_0x0026
            L_0x0023:
                int r5 = r5 + 1
                goto L_0x0010
            L_0x0026:
                throw r7
            L_0x0027:
                if (r6 <= 0) goto L_0x0037
                r5 = 0
                byte[] r7 = r10.buffer
                r8 = 0
                int r9 = r10.options
                byte[] unused = com.miot.service.common.crypto.Base64Coder.encode3to4(r4, r5, r6, r7, r8, r9)
                r10.position = r2
                r10.numSigBytes = r3
                goto L_0x0071
            L_0x0037:
                return r1
            L_0x0038:
                byte[] r0 = new byte[r3]
                r4 = 0
            L_0x003b:
                if (r4 >= r3) goto L_0x0057
            L_0x003d:
                java.io.InputStream r5 = r10.in
                int r5 = r5.read()
                if (r5 < 0) goto L_0x004e
                byte[] r6 = r10.decodabet
                r7 = r5 & 127(0x7f, float:1.78E-43)
                byte r6 = r6[r7]
                r7 = -5
                if (r6 <= r7) goto L_0x003d
            L_0x004e:
                if (r5 >= 0) goto L_0x0051
                goto L_0x0057
            L_0x0051:
                byte r5 = (byte) r5
                r0[r4] = r5
                int r4 = r4 + 1
                goto L_0x003b
            L_0x0057:
                if (r4 != r3) goto L_0x0066
                byte[] r3 = r10.buffer
                int r4 = r10.options
                int r0 = com.miot.service.common.crypto.Base64Coder.decode4to3(r0, r2, r3, r2, r4)
                r10.numSigBytes = r0
                r10.position = r2
                goto L_0x0071
            L_0x0066:
                if (r4 != 0) goto L_0x0069
                return r1
            L_0x0069:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "Improperly padded Base64Coder input."
                r0.<init>(r1)
                throw r0
            L_0x0071:
                int r0 = r10.position
                if (r0 < 0) goto L_0x00a6
                int r3 = r10.numSigBytes
                if (r0 < r3) goto L_0x007a
                return r1
            L_0x007a:
                boolean r0 = r10.encode
                if (r0 == 0) goto L_0x008d
                boolean r0 = r10.breakLines
                if (r0 == 0) goto L_0x008d
                int r0 = r10.lineLength
                r3 = 76
                if (r0 < r3) goto L_0x008d
                r10.lineLength = r2
                r0 = 10
                return r0
            L_0x008d:
                int r0 = r10.lineLength
                int r0 = r0 + 1
                r10.lineLength = r0
                byte[] r0 = r10.buffer
                int r2 = r10.position
                int r3 = r2 + 1
                r10.position = r3
                byte r0 = r0[r2]
                int r2 = r10.bufferLength
                if (r3 < r2) goto L_0x00a3
                r10.position = r1
            L_0x00a3:
                r0 = r0 & 255(0xff, float:3.57E-43)
                return r0
            L_0x00a6:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "Error in Base64Coder code reading stream."
                r0.<init>(r1)
                goto L_0x00af
            L_0x00ae:
                throw r0
            L_0x00af:
                goto L_0x00ae
            */
            throw new UnsupportedOperationException("Method not decompiled: com.miot.service.common.crypto.Base64Coder.InputStream.read():int");
        }

        public int read(byte[] bArr, int i, int i2) {
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                int read = read();
                if (read >= 0) {
                    bArr[i + i3] = (byte) read;
                    i3++;
                } else if (i3 == 0) {
                    return -1;
                }
            }
            return i3;
        }
    }

    public static class OutputStream extends FilterOutputStream {
        private byte[] alphabet;

        /* renamed from: b4 */
        private byte[] f6700b4;
        private boolean breakLines;
        private byte[] buffer;
        private int bufferLength;
        private byte[] decodabet;
        private boolean encode;
        private int lineLength;
        private int options;
        private int position;
        private boolean suspendEncoding;

        public OutputStream(java.io.OutputStream outputStream) {
            this(outputStream, 1);
        }

        public OutputStream(java.io.OutputStream outputStream, int i) {
            super(outputStream);
            boolean z = true;
            this.breakLines = (i & 8) != 8;
            z = (i & 1) != 1 ? false : z;
            this.encode = z;
            int i2 = z ? 3 : 4;
            this.bufferLength = i2;
            this.buffer = new byte[i2];
            this.position = 0;
            this.lineLength = 0;
            this.suspendEncoding = false;
            this.f6700b4 = new byte[4];
            this.options = i;
            this.alphabet = Base64Coder.getAlphabet(i);
            this.decodabet = Base64Coder.getDecodabet(i);
        }

        public void close() {
            flushBase64();
            super.close();
            this.buffer = null;
            this.out = null;
        }

        public void flushBase64() {
            int i = this.position;
            if (i <= 0) {
                return;
            }
            if (this.encode) {
                this.out.write(Base64Coder.encode3to4(this.f6700b4, this.buffer, i, this.options));
                this.position = 0;
                return;
            }
            throw new IOException("Base64Coder input not properly padded.");
        }

        public void resumeEncoding() {
            this.suspendEncoding = false;
        }

        public void suspendEncoding() {
            flushBase64();
            this.suspendEncoding = true;
        }

        public void write(int i) {
            if (this.suspendEncoding) {
                this.out.write(i);
                return;
            }
            if (this.encode) {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                int i3 = i2 + 1;
                this.position = i3;
                bArr[i2] = (byte) i;
                int i4 = this.bufferLength;
                if (i3 >= i4) {
                    this.out.write(Base64Coder.encode3to4(this.f6700b4, bArr, i4, this.options));
                    int i5 = this.lineLength + 4;
                    this.lineLength = i5;
                    if (this.breakLines && i5 >= 76) {
                        this.out.write(10);
                        this.lineLength = 0;
                    }
                } else {
                    return;
                }
            } else {
                byte[] bArr2 = this.decodabet;
                int i6 = i & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT;
                if (bArr2[i6] > -5) {
                    byte[] bArr3 = this.buffer;
                    int i7 = this.position;
                    int i8 = i7 + 1;
                    this.position = i8;
                    bArr3[i7] = (byte) i;
                    if (i8 >= this.bufferLength) {
                        this.out.write(this.f6700b4, 0, Base64Coder.decode4to3(bArr3, 0, this.f6700b4, 0, this.options));
                    } else {
                        return;
                    }
                } else if (bArr2[i6] != -5) {
                    throw new IOException("Invalid character in Base64Coder data.");
                } else {
                    return;
                }
            }
            this.position = 0;
        }

        public void write(byte[] bArr, int i, int i2) {
            if (this.suspendEncoding) {
                this.out.write(bArr, i, i2);
                return;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                write(bArr[i + i3]);
            }
        }
    }

    static {
        byte[] bArr = new byte[SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT];
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
        bArr[43] = 62;
        bArr[44] = -9;
        bArr[45] = -9;
        bArr[46] = -9;
        bArr[47] = 63;
        bArr[48] = 52;
        bArr[49] = 53;
        bArr[50] = 54;
        bArr[51] = 55;
        bArr[52] = 56;
        bArr[53] = 57;
        bArr[54] = 58;
        bArr[55] = 59;
        bArr[56] = 60;
        bArr[57] = 61;
        bArr[58] = -9;
        bArr[59] = -9;
        bArr[60] = -9;
        bArr[61] = -1;
        bArr[62] = -9;
        bArr[63] = -9;
        bArr[64] = -9;
        bArr[65] = 0;
        bArr[66] = 1;
        bArr[67] = 2;
        bArr[68] = 3;
        bArr[69] = 4;
        bArr[70] = 5;
        bArr[71] = 6;
        bArr[72] = 7;
        bArr[73] = 8;
        bArr[74] = 9;
        bArr[75] = 10;
        bArr[76] = 11;
        bArr[77] = 12;
        bArr[78] = 13;
        bArr[79] = 14;
        bArr[80] = 15;
        bArr[81] = 16;
        bArr[82] = 17;
        bArr[83] = 18;
        bArr[84] = 19;
        bArr[85] = 20;
        bArr[86] = 21;
        bArr[87] = 22;
        bArr[88] = 23;
        bArr[89] = 24;
        bArr[90] = 25;
        bArr[91] = -9;
        bArr[92] = -9;
        bArr[93] = -9;
        bArr[94] = -9;
        bArr[95] = -9;
        bArr[96] = -9;
        bArr[97] = 26;
        bArr[98] = 27;
        bArr[99] = 28;
        bArr[100] = 29;
        bArr[101] = 30;
        bArr[102] = 31;
        bArr[103] = 32;
        bArr[104] = 33;
        bArr[105] = 34;
        bArr[106] = 35;
        bArr[107] = 36;
        bArr[108] = 37;
        bArr[109] = 38;
        bArr[110] = 39;
        bArr[111] = 40;
        bArr[112] = 41;
        bArr[113] = 42;
        bArr[114] = 43;
        bArr[115] = 44;
        bArr[116] = 45;
        bArr[117] = 46;
        bArr[118] = 47;
        bArr[119] = 48;
        bArr[120] = 49;
        bArr[121] = 50;
        bArr[122] = 51;
        bArr[123] = -9;
        bArr[124] = -9;
        bArr[125] = -9;
        bArr[126] = -9;
        _STANDARD_DECODABET = bArr;
        byte[] bArr2 = new byte[SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT];
        // fill-array-data instruction
        bArr2[0] = -9;
        bArr2[1] = -9;
        bArr2[2] = -9;
        bArr2[3] = -9;
        bArr2[4] = -9;
        bArr2[5] = -9;
        bArr2[6] = -9;
        bArr2[7] = -9;
        bArr2[8] = -9;
        bArr2[9] = -5;
        bArr2[10] = -5;
        bArr2[11] = -9;
        bArr2[12] = -9;
        bArr2[13] = -5;
        bArr2[14] = -9;
        bArr2[15] = -9;
        bArr2[16] = -9;
        bArr2[17] = -9;
        bArr2[18] = -9;
        bArr2[19] = -9;
        bArr2[20] = -9;
        bArr2[21] = -9;
        bArr2[22] = -9;
        bArr2[23] = -9;
        bArr2[24] = -9;
        bArr2[25] = -9;
        bArr2[26] = -9;
        bArr2[27] = -9;
        bArr2[28] = -9;
        bArr2[29] = -9;
        bArr2[30] = -9;
        bArr2[31] = -9;
        bArr2[32] = -5;
        bArr2[33] = -9;
        bArr2[34] = -9;
        bArr2[35] = -9;
        bArr2[36] = -9;
        bArr2[37] = -9;
        bArr2[38] = -9;
        bArr2[39] = -9;
        bArr2[40] = -9;
        bArr2[41] = -9;
        bArr2[42] = -9;
        bArr2[43] = -9;
        bArr2[44] = -9;
        bArr2[45] = 62;
        bArr2[46] = -9;
        bArr2[47] = -9;
        bArr2[48] = 52;
        bArr2[49] = 53;
        bArr2[50] = 54;
        bArr2[51] = 55;
        bArr2[52] = 56;
        bArr2[53] = 57;
        bArr2[54] = 58;
        bArr2[55] = 59;
        bArr2[56] = 60;
        bArr2[57] = 61;
        bArr2[58] = -9;
        bArr2[59] = -9;
        bArr2[60] = -9;
        bArr2[61] = -1;
        bArr2[62] = -9;
        bArr2[63] = -9;
        bArr2[64] = -9;
        bArr2[65] = 0;
        bArr2[66] = 1;
        bArr2[67] = 2;
        bArr2[68] = 3;
        bArr2[69] = 4;
        bArr2[70] = 5;
        bArr2[71] = 6;
        bArr2[72] = 7;
        bArr2[73] = 8;
        bArr2[74] = 9;
        bArr2[75] = 10;
        bArr2[76] = 11;
        bArr2[77] = 12;
        bArr2[78] = 13;
        bArr2[79] = 14;
        bArr2[80] = 15;
        bArr2[81] = 16;
        bArr2[82] = 17;
        bArr2[83] = 18;
        bArr2[84] = 19;
        bArr2[85] = 20;
        bArr2[86] = 21;
        bArr2[87] = 22;
        bArr2[88] = 23;
        bArr2[89] = 24;
        bArr2[90] = 25;
        bArr2[91] = -9;
        bArr2[92] = -9;
        bArr2[93] = -9;
        bArr2[94] = -9;
        bArr2[95] = 63;
        bArr2[96] = -9;
        bArr2[97] = 26;
        bArr2[98] = 27;
        bArr2[99] = 28;
        bArr2[100] = 29;
        bArr2[101] = 30;
        bArr2[102] = 31;
        bArr2[103] = 32;
        bArr2[104] = 33;
        bArr2[105] = 34;
        bArr2[106] = 35;
        bArr2[107] = 36;
        bArr2[108] = 37;
        bArr2[109] = 38;
        bArr2[110] = 39;
        bArr2[111] = 40;
        bArr2[112] = 41;
        bArr2[113] = 42;
        bArr2[114] = 43;
        bArr2[115] = 44;
        bArr2[116] = 45;
        bArr2[117] = 46;
        bArr2[118] = 47;
        bArr2[119] = 48;
        bArr2[120] = 49;
        bArr2[121] = 50;
        bArr2[122] = 51;
        bArr2[123] = -9;
        bArr2[124] = -9;
        bArr2[125] = -9;
        bArr2[126] = -9;
        _URL_SAFE_DECODABET = bArr2;
        byte[] bArr3 = new byte[SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT];
        // fill-array-data instruction
        bArr3[0] = -9;
        bArr3[1] = -9;
        bArr3[2] = -9;
        bArr3[3] = -9;
        bArr3[4] = -9;
        bArr3[5] = -9;
        bArr3[6] = -9;
        bArr3[7] = -9;
        bArr3[8] = -9;
        bArr3[9] = -5;
        bArr3[10] = -5;
        bArr3[11] = -9;
        bArr3[12] = -9;
        bArr3[13] = -5;
        bArr3[14] = -9;
        bArr3[15] = -9;
        bArr3[16] = -9;
        bArr3[17] = -9;
        bArr3[18] = -9;
        bArr3[19] = -9;
        bArr3[20] = -9;
        bArr3[21] = -9;
        bArr3[22] = -9;
        bArr3[23] = -9;
        bArr3[24] = -9;
        bArr3[25] = -9;
        bArr3[26] = -9;
        bArr3[27] = -9;
        bArr3[28] = -9;
        bArr3[29] = -9;
        bArr3[30] = -9;
        bArr3[31] = -9;
        bArr3[32] = -5;
        bArr3[33] = -9;
        bArr3[34] = -9;
        bArr3[35] = -9;
        bArr3[36] = -9;
        bArr3[37] = -9;
        bArr3[38] = -9;
        bArr3[39] = -9;
        bArr3[40] = -9;
        bArr3[41] = -9;
        bArr3[42] = -9;
        bArr3[43] = -9;
        bArr3[44] = -9;
        bArr3[45] = 0;
        bArr3[46] = -9;
        bArr3[47] = -9;
        bArr3[48] = 1;
        bArr3[49] = 2;
        bArr3[50] = 3;
        bArr3[51] = 4;
        bArr3[52] = 5;
        bArr3[53] = 6;
        bArr3[54] = 7;
        bArr3[55] = 8;
        bArr3[56] = 9;
        bArr3[57] = 10;
        bArr3[58] = -9;
        bArr3[59] = -9;
        bArr3[60] = -9;
        bArr3[61] = -1;
        bArr3[62] = -9;
        bArr3[63] = -9;
        bArr3[64] = -9;
        bArr3[65] = 11;
        bArr3[66] = 12;
        bArr3[67] = 13;
        bArr3[68] = 14;
        bArr3[69] = 15;
        bArr3[70] = 16;
        bArr3[71] = 17;
        bArr3[72] = 18;
        bArr3[73] = 19;
        bArr3[74] = 20;
        bArr3[75] = 21;
        bArr3[76] = 22;
        bArr3[77] = 23;
        bArr3[78] = 24;
        bArr3[79] = 25;
        bArr3[80] = 26;
        bArr3[81] = 27;
        bArr3[82] = 28;
        bArr3[83] = 29;
        bArr3[84] = 30;
        bArr3[85] = 31;
        bArr3[86] = 32;
        bArr3[87] = 33;
        bArr3[88] = 34;
        bArr3[89] = 35;
        bArr3[90] = 36;
        bArr3[91] = -9;
        bArr3[92] = -9;
        bArr3[93] = -9;
        bArr3[94] = -9;
        bArr3[95] = 37;
        bArr3[96] = -9;
        bArr3[97] = 38;
        bArr3[98] = 39;
        bArr3[99] = 40;
        bArr3[100] = 41;
        bArr3[101] = 42;
        bArr3[102] = 43;
        bArr3[103] = 44;
        bArr3[104] = 45;
        bArr3[105] = 46;
        bArr3[106] = 47;
        bArr3[107] = 48;
        bArr3[108] = 49;
        bArr3[109] = 50;
        bArr3[110] = 51;
        bArr3[111] = 52;
        bArr3[112] = 53;
        bArr3[113] = 54;
        bArr3[114] = 55;
        bArr3[115] = 56;
        bArr3[116] = 57;
        bArr3[117] = 58;
        bArr3[118] = 59;
        bArr3[119] = 60;
        bArr3[120] = 61;
        bArr3[121] = 62;
        bArr3[122] = 63;
        bArr3[123] = -9;
        bArr3[124] = -9;
        bArr3[125] = -9;
        bArr3[126] = -9;
        _ORDERED_DECODABET = bArr3;
    }

    private Base64Coder() {
    }

    public static byte[] decode(String str) {
        return decode(str, 0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|(8:14|15|16|17|(3:18|19|(1:21)(1:57))|22|23|24)|25|26|(2:27|28)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:29|36|43|44|45|46|47|48|49) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0052 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x006c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x006f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] decode(java.lang.String r5, int r6) {
        /*
            java.lang.String r0 = "UTF-8"
            byte[] r5 = r5.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x0007 }
            goto L_0x000b
        L_0x0007:
            byte[] r5 = r5.getBytes()
        L_0x000b:
            int r0 = r5.length
            r1 = 0
            byte[] r5 = decode(r5, r1, r0, r6)
            if (r5 == 0) goto L_0x0079
            int r6 = r5.length
            r0 = 4
            if (r6 < r0) goto L_0x0079
            byte r6 = r5[r1]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r0 = 1
            byte r0 = r5[r0]
            int r0 = r0 << 8
            r2 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r2
            r6 = r6 | r0
            r0 = 35615(0x8b1f, float:4.9907E-41)
            if (r0 != r6) goto L_0x0079
            r6 = 2048(0x800, float:2.87E-42)
            byte[] r6 = new byte[r6]
            r0 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0073, all -> 0x0066 }
            r2.<init>()     // Catch:{ IOException -> 0x0073, all -> 0x0066 }
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0062, all -> 0x005d }
            r3.<init>(r5)     // Catch:{ IOException -> 0x0062, all -> 0x005d }
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
        L_0x003e:
            int r0 = r4.read(r6)     // Catch:{ IOException -> 0x0064, all -> 0x0056 }
            if (r0 < 0) goto L_0x0048
            r2.write(r6, r1, r0)     // Catch:{ IOException -> 0x0064, all -> 0x0056 }
            goto L_0x003e
        L_0x0048:
            byte[] r5 = r2.toByteArray()     // Catch:{ IOException -> 0x0064, all -> 0x0056 }
            r2.close()     // Catch:{ Exception -> 0x004f }
        L_0x004f:
            r4.close()     // Catch:{ Exception -> 0x0052 }
        L_0x0052:
            r3.close()     // Catch:{ Exception -> 0x0079 }
            goto L_0x0079
        L_0x0056:
            r5 = move-exception
            goto L_0x0060
        L_0x0058:
            r5 = move-exception
            r4 = r0
            goto L_0x0060
        L_0x005b:
            r4 = r0
            goto L_0x0064
        L_0x005d:
            r5 = move-exception
            r3 = r0
            r4 = r3
        L_0x0060:
            r0 = r2
            goto L_0x0069
        L_0x0062:
            r3 = r0
            r4 = r3
        L_0x0064:
            r0 = r2
            goto L_0x0075
        L_0x0066:
            r5 = move-exception
            r3 = r0
            r4 = r3
        L_0x0069:
            r0.close()     // Catch:{ Exception -> 0x006c }
        L_0x006c:
            r4.close()     // Catch:{ Exception -> 0x006f }
        L_0x006f:
            r3.close()     // Catch:{ Exception -> 0x0072 }
        L_0x0072:
            throw r5
        L_0x0073:
            r3 = r0
            r4 = r3
        L_0x0075:
            r0.close()     // Catch:{ Exception -> 0x004f }
            goto L_0x004f
        L_0x0079:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.service.common.crypto.Base64Coder.decode(java.lang.String, int):byte[]");
    }

    public static byte[] decode(byte[] bArr, int i, int i2, int i3) {
        byte[] decodabet = getDecodabet(i3);
        byte[] bArr2 = new byte[((i2 * 3) / 4)];
        byte[] bArr3 = new byte[4];
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        while (i4 < i + i2) {
            byte b = (byte) (bArr[i4] & Byte.MAX_VALUE);
            byte b2 = decodabet[b];
            if (b2 >= -5) {
                if (b2 >= -1) {
                    int i7 = i5 + 1;
                    bArr3[i5] = b;
                    if (i7 > 3) {
                        i6 += decode4to3(bArr3, 0, bArr2, i6, i3);
                        if (b == 61) {
                            break;
                        }
                        i5 = 0;
                    } else {
                        i5 = i7;
                    }
                }
                i4++;
            } else {
                PrintStream printStream = System.err;
                printStream.println("Bad Base64Coder input character at " + i4 + ": " + bArr[i4] + "(decimal)");
                return null;
            }
        }
        byte[] bArr4 = new byte[i6];
        System.arraycopy(bArr2, 0, bArr4, 0, i6);
        return bArr4;
    }

    /* access modifiers changed from: private */
    public static int decode4to3(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        byte[] decodabet = getDecodabet(i3);
        int i4 = i + 2;
        if (bArr[i4] == 61) {
            bArr2[i2] = (byte) ((((decodabet[bArr[i + 1]] & EQUALS_SIGN_ENC) << 12) | ((decodabet[bArr[i]] & EQUALS_SIGN_ENC) << ParameterInitDefType.DoubleVec2Init)) >>> 16);
            return 1;
        }
        int i5 = i + 3;
        if (bArr[i5] == 61) {
            int i6 = (decodabet[bArr[i]] & EQUALS_SIGN_ENC) << ParameterInitDefType.DoubleVec2Init;
            int i7 = ((decodabet[bArr[i4]] & EQUALS_SIGN_ENC) << 6) | ((decodabet[bArr[i + 1]] & EQUALS_SIGN_ENC) << 12) | i6;
            bArr2[i2] = (byte) (i7 >>> 16);
            bArr2[i2 + 1] = (byte) (i7 >>> 8);
            return 2;
        }
        try {
            byte b = ((decodabet[bArr[i]] & EQUALS_SIGN_ENC) << ParameterInitDefType.DoubleVec2Init) | ((decodabet[bArr[i + 1]] & EQUALS_SIGN_ENC) << 12) | ((decodabet[bArr[i4]] & EQUALS_SIGN_ENC) << 6) | (decodabet[bArr[i5]] & EQUALS_SIGN_ENC);
            bArr2[i2] = (byte) (b >> ParameterInitDefType.ExternalSamplerInit);
            bArr2[i2 + 1] = (byte) (b >> 8);
            bArr2[i2 + 2] = (byte) b;
            return 3;
        } catch (Exception unused) {
            PrintStream printStream = System.out;
            printStream.println("" + bArr[i] + ": " + decodabet[bArr[i]]);
            PrintStream printStream2 = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("");
            int i8 = i + 1;
            sb.append(bArr[i8]);
            sb.append(": ");
            sb.append(decodabet[bArr[i8]]);
            printStream2.println(sb.toString());
            PrintStream printStream3 = System.out;
            printStream3.println("" + bArr[i4] + ": " + decodabet[bArr[i4]]);
            PrintStream printStream4 = System.out;
            printStream4.println("" + bArr[i5] + ": " + decodabet[bArr[i5]]);
            return -1;
        }
    }

    public static void decodeFileToFile(String str, String str2) {
        byte[] decodeFromFile = decodeFromFile(str);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(str2));
            try {
                bufferedOutputStream2.write(decodeFromFile);
            } catch (IOException e) {
                e = e;
                bufferedOutputStream = bufferedOutputStream2;
                try {
                    e.printStackTrace();
                    bufferedOutputStream.close();
                } catch (Throwable th) {
                    th = th;
                    try {
                        bufferedOutputStream.close();
                    } catch (Exception unused) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = bufferedOutputStream2;
                bufferedOutputStream.close();
                throw th;
            }
            try {
                bufferedOutputStream2.close();
            } catch (Exception unused2) {
            }
        } catch (IOException e2) {
            e = e2;
            e.printStackTrace();
            bufferedOutputStream.close();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.FilterInputStream, byte[]] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.io.FilterInputStream] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] decodeFromFile(java.lang.String r7) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0067 }
            r1.<init>(r7)     // Catch:{ IOException -> 0x0067 }
            long r2 = r1.length()     // Catch:{ IOException -> 0x0067 }
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0034
            java.io.PrintStream r2 = java.lang.System.err     // Catch:{ IOException -> 0x0067 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0067 }
            r3.<init>()     // Catch:{ IOException -> 0x0067 }
            java.lang.String r4 = "File is too big for this convenience method ("
            r3.append(r4)     // Catch:{ IOException -> 0x0067 }
            long r4 = r1.length()     // Catch:{ IOException -> 0x0067 }
            r3.append(r4)     // Catch:{ IOException -> 0x0067 }
            java.lang.String r1 = " bytes)."
            r3.append(r1)     // Catch:{ IOException -> 0x0067 }
            java.lang.String r1 = r3.toString()     // Catch:{ IOException -> 0x0067 }
            r2.println(r1)     // Catch:{ IOException -> 0x0067 }
            r0.close()     // Catch:{ Exception -> 0x0033 }
        L_0x0033:
            return r0
        L_0x0034:
            long r2 = r1.length()     // Catch:{ IOException -> 0x0067 }
            int r3 = (int) r2     // Catch:{ IOException -> 0x0067 }
            byte[] r2 = new byte[r3]     // Catch:{ IOException -> 0x0067 }
            com.miot.service.common.crypto.Base64Coder$InputStream r3 = new com.miot.service.common.crypto.Base64Coder$InputStream     // Catch:{ IOException -> 0x0067 }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0067 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0067 }
            r5.<init>(r1)     // Catch:{ IOException -> 0x0067 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0067 }
            r1 = 0
            r3.<init>(r4, r1)     // Catch:{ IOException -> 0x0067 }
            r4 = 0
        L_0x004c:
            r5 = 4096(0x1000, float:5.74E-42)
            int r5 = r3.read(r2, r4, r5)     // Catch:{ IOException -> 0x0062, all -> 0x005f }
            if (r5 < 0) goto L_0x0056
            int r4 = r4 + r5
            goto L_0x004c
        L_0x0056:
            byte[] r0 = new byte[r4]     // Catch:{ IOException -> 0x0062, all -> 0x005f }
            java.lang.System.arraycopy(r2, r1, r0, r1, r4)     // Catch:{ IOException -> 0x0062, all -> 0x005f }
            r3.close()     // Catch:{ Exception -> 0x0082 }
            goto L_0x0082
        L_0x005f:
            r7 = move-exception
            r0 = r3
            goto L_0x0083
        L_0x0062:
            r1 = r0
            r0 = r3
            goto L_0x0068
        L_0x0065:
            r7 = move-exception
            goto L_0x0083
        L_0x0067:
            r1 = r0
        L_0x0068:
            java.io.PrintStream r2 = java.lang.System.err     // Catch:{ all -> 0x0065 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0065 }
            r3.<init>()     // Catch:{ all -> 0x0065 }
            java.lang.String r4 = "Error decoding from file "
            r3.append(r4)     // Catch:{ all -> 0x0065 }
            r3.append(r7)     // Catch:{ all -> 0x0065 }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x0065 }
            r2.println(r7)     // Catch:{ all -> 0x0065 }
            r0.close()     // Catch:{ Exception -> 0x0081 }
        L_0x0081:
            r0 = r1
        L_0x0082:
            return r0
        L_0x0083:
            r0.close()     // Catch:{ Exception -> 0x0086 }
        L_0x0086:
            goto L_0x0088
        L_0x0087:
            throw r7
        L_0x0088:
            goto L_0x0087
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.service.common.crypto.Base64Coder.decodeFromFile(java.lang.String):byte[]");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean decodeToFile(java.lang.String r4, java.lang.String r5) {
        /*
            r0 = 0
            r1 = 0
            com.miot.service.common.crypto.Base64Coder$OutputStream r2 = new com.miot.service.common.crypto.Base64Coder$OutputStream     // Catch:{ IOException -> 0x0024, all -> 0x001f }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0024, all -> 0x001f }
            r3.<init>(r5)     // Catch:{ IOException -> 0x0024, all -> 0x001f }
            r2.<init>(r3, r0)     // Catch:{ IOException -> 0x0024, all -> 0x001f }
            java.lang.String r5 = "UTF-8"
            byte[] r4 = r4.getBytes(r5)     // Catch:{ IOException -> 0x001d, all -> 0x001a }
            r2.write(r4)     // Catch:{ IOException -> 0x001d, all -> 0x001a }
            r0 = 1
            r2.close()     // Catch:{ Exception -> 0x0027 }
            goto L_0x0027
        L_0x001a:
            r4 = move-exception
            r1 = r2
            goto L_0x0020
        L_0x001d:
            r1 = r2
            goto L_0x0024
        L_0x001f:
            r4 = move-exception
        L_0x0020:
            r1.close()     // Catch:{ Exception -> 0x0023 }
        L_0x0023:
            throw r4
        L_0x0024:
            r1.close()     // Catch:{ Exception -> 0x0027 }
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.service.common.crypto.Base64Coder.decodeToFile(java.lang.String, java.lang.String):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.io.ObjectInputStream} */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.io.ObjectInputStream] */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|(3:1|2|(4:3|4|5|6))|7|8|9|10|28) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0041 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0016 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object decodeToObject(java.lang.String r4) {
        /*
            byte[] r4 = decode(r4)
            r0 = 0
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0035, ClassNotFoundException -> 0x002e, all -> 0x0029 }
            r1.<init>(r4)     // Catch:{ IOException -> 0x0035, ClassNotFoundException -> 0x002e, all -> 0x0029 }
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0026, ClassNotFoundException -> 0x0023, all -> 0x001e }
            r4.<init>(r1)     // Catch:{ IOException -> 0x0026, ClassNotFoundException -> 0x0023, all -> 0x001e }
            java.lang.Object r0 = r4.readObject()     // Catch:{ IOException -> 0x001c, ClassNotFoundException -> 0x001a }
        L_0x0013:
            r1.close()     // Catch:{ Exception -> 0x0016 }
        L_0x0016:
            r4.close()     // Catch:{ Exception -> 0x003c }
            goto L_0x003c
        L_0x001a:
            r2 = move-exception
            goto L_0x0031
        L_0x001c:
            r2 = move-exception
            goto L_0x0038
        L_0x001e:
            r4 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
            goto L_0x003e
        L_0x0023:
            r2 = move-exception
            r4 = r0
            goto L_0x0031
        L_0x0026:
            r2 = move-exception
            r4 = r0
            goto L_0x0038
        L_0x0029:
            r4 = move-exception
            r1 = r0
            r0 = r4
            r4 = r1
            goto L_0x003e
        L_0x002e:
            r2 = move-exception
            r4 = r0
            r1 = r4
        L_0x0031:
            r2.printStackTrace()     // Catch:{ all -> 0x003d }
            goto L_0x0013
        L_0x0035:
            r2 = move-exception
            r4 = r0
            r1 = r4
        L_0x0038:
            r2.printStackTrace()     // Catch:{ all -> 0x003d }
            goto L_0x0013
        L_0x003c:
            return r0
        L_0x003d:
            r0 = move-exception
        L_0x003e:
            r1.close()     // Catch:{ Exception -> 0x0041 }
        L_0x0041:
            r4.close()     // Catch:{ Exception -> 0x0044 }
        L_0x0044:
            goto L_0x0046
        L_0x0045:
            throw r0
        L_0x0046:
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.service.common.crypto.Base64Coder.decodeToObject(java.lang.String):java.lang.Object");
    }

    public static String encode(byte[] bArr) {
        return encodeBytes(bArr);
    }

    /* access modifiers changed from: private */
    public static byte[] encode3to4(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        byte[] alphabet = getAlphabet(i4);
        int i5 = 0;
        int i6 = (i2 > 0 ? (bArr[i] << 24) >>> 8 : 0) | (i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0);
        if (i2 > 2) {
            i5 = (bArr[i + 2] << 24) >>> 24;
        }
        int i7 = i6 | i5;
        if (i2 == 1) {
            bArr2[i3] = alphabet[i7 >>> 18];
            bArr2[i3 + 1] = alphabet[(i7 >>> 12) & 63];
            bArr2[i3 + 2] = EQUALS_SIGN;
            bArr2[i3 + 3] = EQUALS_SIGN;
            return bArr2;
        } else if (i2 == 2) {
            bArr2[i3] = alphabet[i7 >>> 18];
            bArr2[i3 + 1] = alphabet[(i7 >>> 12) & 63];
            bArr2[i3 + 2] = alphabet[(i7 >>> 6) & 63];
            bArr2[i3 + 3] = EQUALS_SIGN;
            return bArr2;
        } else if (i2 != 3) {
            return bArr2;
        } else {
            bArr2[i3] = alphabet[i7 >>> 18];
            bArr2[i3 + 1] = alphabet[(i7 >>> 12) & 63];
            bArr2[i3 + 2] = alphabet[(i7 >>> 6) & 63];
            bArr2[i3 + 3] = alphabet[i7 & 63];
            return bArr2;
        }
    }

    /* access modifiers changed from: private */
    public static byte[] encode3to4(byte[] bArr, byte[] bArr2, int i, int i2) {
        encode3to4(bArr2, 0, i, bArr, 0, i2);
        return bArr;
    }

    public static String encodeBytes(byte[] bArr) {
        return encodeBytes(bArr, 0, bArr.length, 8);
    }

    public static String encodeBytes(byte[] bArr, int i) {
        return encodeBytes(bArr, 0, bArr.length, i);
    }

    public static String encodeBytes(byte[] bArr, int i, int i2) {
        return encodeBytes(bArr, i, i2, 8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.miot.service.common.crypto.Base64Coder$OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: com.miot.service.common.crypto.Base64Coder$OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: com.miot.service.common.crypto.Base64Coder$OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: com.miot.service.common.crypto.Base64Coder$OutputStream} */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:10|11|12|13|14|15|16|17|18|19|20) */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:26|27|37|38|39|40|41|42|43|44|45) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:47|48|49|50|51|52|53|54|55) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0031 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0060 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0063 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x006c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x006f */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String encodeBytes(byte[] r19, int r20, int r21, int r22) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22 & 8
            r3 = r22 & 2
            java.lang.String r8 = "UTF-8"
            r9 = 1
            r10 = 2
            if (r3 != r10) goto L_0x0073
            r2 = 0
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0056, all -> 0x0052 }
            r3.<init>()     // Catch:{ IOException -> 0x0056, all -> 0x0052 }
            com.miot.service.common.crypto.Base64Coder$OutputStream r4 = new com.miot.service.common.crypto.Base64Coder$OutputStream     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            r5 = r22 | 1
            r4.<init>(r3, r5)     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            java.util.zip.GZIPOutputStream r5 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x0049, all -> 0x0047 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x0049, all -> 0x0047 }
            r11 = r19
            r5.write(r11, r0, r1)     // Catch:{ IOException -> 0x0045 }
            r5.close()     // Catch:{ IOException -> 0x0045 }
            r5.close()     // Catch:{ Exception -> 0x002b }
        L_0x002b:
            r4.close()     // Catch:{ Exception -> 0x002e }
        L_0x002e:
            r3.close()     // Catch:{ Exception -> 0x0031 }
        L_0x0031:
            java.lang.String r0 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x003b }
            byte[] r1 = r3.toByteArray()     // Catch:{ UnsupportedEncodingException -> 0x003b }
            r0.<init>(r1, r8)     // Catch:{ UnsupportedEncodingException -> 0x003b }
            return r0
        L_0x003b:
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r3.toByteArray()
            r0.<init>(r1)
            return r0
        L_0x0045:
            r0 = move-exception
            goto L_0x005a
        L_0x0047:
            r0 = move-exception
            goto L_0x0069
        L_0x0049:
            r0 = move-exception
            r5 = r2
            goto L_0x005a
        L_0x004c:
            r0 = move-exception
            r4 = r2
            goto L_0x0069
        L_0x004f:
            r0 = move-exception
            r4 = r2
            goto L_0x0059
        L_0x0052:
            r0 = move-exception
            r3 = r2
            r4 = r3
            goto L_0x0069
        L_0x0056:
            r0 = move-exception
            r3 = r2
            r4 = r3
        L_0x0059:
            r5 = r4
        L_0x005a:
            r0.printStackTrace()     // Catch:{ all -> 0x0067 }
            r5.close()     // Catch:{ Exception -> 0x0060 }
        L_0x0060:
            r4.close()     // Catch:{ Exception -> 0x0063 }
        L_0x0063:
            r3.close()     // Catch:{ Exception -> 0x0066 }
        L_0x0066:
            return r2
        L_0x0067:
            r0 = move-exception
            r2 = r5
        L_0x0069:
            r2.close()     // Catch:{ Exception -> 0x006c }
        L_0x006c:
            r4.close()     // Catch:{ Exception -> 0x006f }
        L_0x006f:
            r3.close()     // Catch:{ Exception -> 0x0072 }
        L_0x0072:
            throw r0
        L_0x0073:
            r11 = r19
            if (r2 != 0) goto L_0x0079
            r13 = 1
            goto L_0x007a
        L_0x0079:
            r13 = 0
        L_0x007a:
            int r2 = r1 * 4
            int r2 = r2 / 3
            int r3 = r1 % 3
            r14 = 4
            if (r3 <= 0) goto L_0x0085
            r3 = 4
            goto L_0x0086
        L_0x0085:
            r3 = 0
        L_0x0086:
            int r3 = r3 + r2
            r15 = 76
            if (r13 == 0) goto L_0x008d
            int r2 = r2 / r15
            goto L_0x008e
        L_0x008d:
            r2 = 0
        L_0x008e:
            int r3 = r3 + r2
            byte[] r7 = new byte[r3]
            int r6 = r1 + -2
            r5 = 0
            r16 = 0
            r17 = 0
        L_0x0098:
            if (r5 >= r6) goto L_0x00c7
            int r3 = r5 + r0
            r4 = 3
            r2 = r19
            r12 = r5
            r5 = r7
            r18 = r6
            r6 = r16
            r10 = r7
            r7 = r22
            encode3to4(r2, r3, r4, r5, r6, r7)
            int r2 = r17 + 4
            if (r13 == 0) goto L_0x00bc
            if (r2 != r15) goto L_0x00bc
            int r2 = r16 + 4
            r3 = 10
            r10[r2] = r3
            int r16 = r16 + 1
            r17 = 0
            goto L_0x00be
        L_0x00bc:
            r17 = r2
        L_0x00be:
            int r5 = r12 + 3
            int r16 = r16 + 4
            r7 = r10
            r6 = r18
            r10 = 2
            goto L_0x0098
        L_0x00c7:
            r12 = r5
            r10 = r7
            if (r12 >= r1) goto L_0x00f4
            int r2 = r12 + r0
            int r6 = r1 - r12
            r0 = r19
            r1 = r2
            r2 = r6
            r3 = r10
            r4 = r16
            r5 = r22
            encode3to4(r0, r1, r2, r3, r4, r5)
            r0 = 16
            r1 = r22 & 16
            if (r1 != r0) goto L_0x00f2
            if (r6 == 0) goto L_0x00ef
            if (r6 == r9) goto L_0x00ec
            r0 = 2
            if (r6 == r0) goto L_0x00e9
            goto L_0x00f4
        L_0x00e9:
            int r16 = r16 + 3
            goto L_0x00f4
        L_0x00ec:
            int r16 = r16 + 2
            goto L_0x00f4
        L_0x00ef:
            int r16 = r16 + 1
            goto L_0x00f4
        L_0x00f2:
            int r16 = r16 + 4
        L_0x00f4:
            r0 = r16
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x00fd }
            r2 = 0
            r1.<init>(r10, r2, r0, r8)     // Catch:{ UnsupportedEncodingException -> 0x00fe }
            return r1
        L_0x00fd:
            r2 = 0
        L_0x00fe:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r10, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.service.common.crypto.Base64Coder.encodeBytes(byte[], int, int, int):java.lang.String");
    }

    public static void encodeFileToFile(String str, String str2) {
        String encodeFromFile = encodeFromFile(str);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(str2));
            try {
                bufferedOutputStream2.write(encodeFromFile.getBytes("US-ASCII"));
            } catch (IOException e) {
                e = e;
                bufferedOutputStream = bufferedOutputStream2;
                try {
                    e.printStackTrace();
                    bufferedOutputStream.close();
                } catch (Throwable th) {
                    th = th;
                    try {
                        bufferedOutputStream.close();
                    } catch (Exception unused) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = bufferedOutputStream2;
                bufferedOutputStream.close();
                throw th;
            }
            try {
                bufferedOutputStream2.close();
            } catch (Exception unused2) {
            }
        } catch (IOException e2) {
            e = e2;
            e.printStackTrace();
            bufferedOutputStream.close();
        }
    }

    public static String encodeFromFile(String str) {
        return encodeFromFile(str, 1);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:20|21|22|23|32) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        java.lang.System.err.println("Error encoding from file " + r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0063, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String encodeFromFile(java.lang.String r6, int r7) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0047, all -> 0x0045 }
            r1.<init>(r6)     // Catch:{ IOException -> 0x0047, all -> 0x0045 }
            long r2 = r1.length()     // Catch:{ IOException -> 0x0047, all -> 0x0045 }
            double r2 = (double) r2
            r4 = 4608983858650965606(0x3ff6666666666666, double:1.4)
            java.lang.Double.isNaN(r2)
            double r2 = r2 * r4
            int r2 = (int) r2
            r3 = 40
            int r2 = java.lang.Math.max(r2, r3)     // Catch:{ IOException -> 0x0047, all -> 0x0045 }
            byte[] r2 = new byte[r2]     // Catch:{ IOException -> 0x0047, all -> 0x0045 }
            com.miot.service.common.crypto.Base64Coder$InputStream r3 = new com.miot.service.common.crypto.Base64Coder$InputStream     // Catch:{ IOException -> 0x0047, all -> 0x0045 }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0047, all -> 0x0045 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0047, all -> 0x0045 }
            r5.<init>(r1)     // Catch:{ IOException -> 0x0047, all -> 0x0045 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0047, all -> 0x0045 }
            r3.<init>(r4, r7)     // Catch:{ IOException -> 0x0047, all -> 0x0045 }
            r7 = 0
            r1 = 0
        L_0x002f:
            r4 = 4096(0x1000, float:5.74E-42)
            int r4 = r3.read(r2, r1, r4)     // Catch:{ IOException -> 0x0048 }
            if (r4 < 0) goto L_0x0039
            int r1 = r1 + r4
            goto L_0x002f
        L_0x0039:
            java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x0048 }
            java.lang.String r5 = "UTF-8"
            r4.<init>(r2, r7, r1, r5)     // Catch:{ IOException -> 0x0048 }
            r3.close()     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            r0 = r4
            goto L_0x0061
        L_0x0045:
            r6 = move-exception
            goto L_0x0064
        L_0x0047:
            r3 = r0
        L_0x0048:
            java.io.PrintStream r7 = java.lang.System.err     // Catch:{ all -> 0x0062 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0062 }
            r1.<init>()     // Catch:{ all -> 0x0062 }
            java.lang.String r2 = "Error encoding from file "
            r1.append(r2)     // Catch:{ all -> 0x0062 }
            r1.append(r6)     // Catch:{ all -> 0x0062 }
            java.lang.String r6 = r1.toString()     // Catch:{ all -> 0x0062 }
            r7.println(r6)     // Catch:{ all -> 0x0062 }
            r3.close()     // Catch:{ Exception -> 0x0061 }
        L_0x0061:
            return r0
        L_0x0062:
            r6 = move-exception
            r0 = r3
        L_0x0064:
            r0.close()     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            goto L_0x0069
        L_0x0068:
            throw r6
        L_0x0069:
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.service.common.crypto.Base64Coder.encodeFromFile(java.lang.String, int):java.lang.String");
    }

    public static String encodeObject(Serializable serializable) {
        return encodeObject(serializable, 0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:11|60|61|62|63|64|65|66|67|68) */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:46|47|48|49|50|51|52|53|54|55|56) */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:17|18|19|20|21|22|23|24|25|26|27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004d, code lost:
        return new java.lang.String(r2.toByteArray());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x002f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0032 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0035 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0038 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x0070 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x0073 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x0076 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x007f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x0082 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x0085 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String encodeObject(java.io.Serializable r4, int r5) {
        /*
            r0 = r5 & 2
            r1 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0065, all -> 0x0060 }
            r2.<init>()     // Catch:{ IOException -> 0x0065, all -> 0x0060 }
            com.miot.service.common.crypto.Base64Coder$OutputStream r3 = new com.miot.service.common.crypto.Base64Coder$OutputStream     // Catch:{ IOException -> 0x005b, all -> 0x0057 }
            r5 = r5 | 1
            r3.<init>(r2, r5)     // Catch:{ IOException -> 0x005b, all -> 0x0057 }
            r5 = 2
            if (r0 != r5) goto L_0x0023
            java.util.zip.GZIPOutputStream r5 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x0053, all -> 0x0050 }
            r5.<init>(r3)     // Catch:{ IOException -> 0x0053, all -> 0x0050 }
            java.io.ObjectOutputStream r0 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0020, all -> 0x001d }
            r0.<init>(r5)     // Catch:{ IOException -> 0x0020, all -> 0x001d }
            goto L_0x0029
        L_0x001d:
            r4 = move-exception
            goto L_0x007c
        L_0x0020:
            r4 = move-exception
            r0 = r1
            goto L_0x006a
        L_0x0023:
            java.io.ObjectOutputStream r0 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0053, all -> 0x0050 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0053, all -> 0x0050 }
            r5 = r1
        L_0x0029:
            r0.writeObject(r4)     // Catch:{ IOException -> 0x004e }
            r0.close()     // Catch:{ Exception -> 0x002f }
        L_0x002f:
            r5.close()     // Catch:{ Exception -> 0x0032 }
        L_0x0032:
            r3.close()     // Catch:{ Exception -> 0x0035 }
        L_0x0035:
            r2.close()     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            java.lang.String r4 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0044 }
            byte[] r5 = r2.toByteArray()     // Catch:{ UnsupportedEncodingException -> 0x0044 }
            java.lang.String r0 = "UTF-8"
            r4.<init>(r5, r0)     // Catch:{ UnsupportedEncodingException -> 0x0044 }
            return r4
        L_0x0044:
            java.lang.String r4 = new java.lang.String
            byte[] r5 = r2.toByteArray()
            r4.<init>(r5)
            return r4
        L_0x004e:
            r4 = move-exception
            goto L_0x006a
        L_0x0050:
            r4 = move-exception
            r5 = r1
            goto L_0x007c
        L_0x0053:
            r4 = move-exception
            r5 = r1
            r0 = r5
            goto L_0x006a
        L_0x0057:
            r4 = move-exception
            r5 = r1
            r3 = r5
            goto L_0x007c
        L_0x005b:
            r4 = move-exception
            r5 = r1
            r0 = r5
            r3 = r0
            goto L_0x006a
        L_0x0060:
            r4 = move-exception
            r5 = r1
            r2 = r5
            r3 = r2
            goto L_0x007c
        L_0x0065:
            r4 = move-exception
            r5 = r1
            r0 = r5
            r2 = r0
            r3 = r2
        L_0x006a:
            r4.printStackTrace()     // Catch:{ all -> 0x007a }
            r0.close()     // Catch:{ Exception -> 0x0070 }
        L_0x0070:
            r5.close()     // Catch:{ Exception -> 0x0073 }
        L_0x0073:
            r3.close()     // Catch:{ Exception -> 0x0076 }
        L_0x0076:
            r2.close()     // Catch:{ Exception -> 0x0079 }
        L_0x0079:
            return r1
        L_0x007a:
            r4 = move-exception
            r1 = r0
        L_0x007c:
            r1.close()     // Catch:{ Exception -> 0x007f }
        L_0x007f:
            r5.close()     // Catch:{ Exception -> 0x0082 }
        L_0x0082:
            r3.close()     // Catch:{ Exception -> 0x0085 }
        L_0x0085:
            r2.close()     // Catch:{ Exception -> 0x0088 }
        L_0x0088:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.service.common.crypto.Base64Coder.encodeObject(java.io.Serializable, int):java.lang.String");
    }

    public static boolean encodeToFile(byte[] bArr, String str) {
        boolean z = true;
        OutputStream outputStream = null;
        try {
            OutputStream outputStream2 = new OutputStream(new FileOutputStream(str), 1);
            try {
                outputStream2.write(bArr);
                try {
                    outputStream2.close();
                } catch (Exception unused) {
                }
            } catch (IOException unused2) {
                outputStream = outputStream2;
                z = false;
                outputStream.close();
                return z;
            } catch (Throwable th) {
                th = th;
                outputStream = outputStream2;
                try {
                    outputStream.close();
                } catch (Exception unused3) {
                }
                throw th;
            }
        } catch (IOException unused4) {
            z = false;
            outputStream.close();
            return z;
        } catch (Throwable th2) {
            th = th2;
            outputStream.close();
            throw th;
        }
        return z;
    }

    /* access modifiers changed from: private */
    public static final byte[] getAlphabet(int i) {
        return (i & 16) == 16 ? _URL_SAFE_ALPHABET : (i & 32) == 32 ? _ORDERED_ALPHABET : _STANDARD_ALPHABET;
    }

    /* access modifiers changed from: private */
    public static final byte[] getDecodabet(int i) {
        return (i & 16) == 16 ? _URL_SAFE_DECODABET : (i & 32) == 32 ? _ORDERED_DECODABET : _STANDARD_DECODABET;
    }

    public static void main(String[] strArr) {
        String str;
        if (strArr.length < 3) {
            str = "Not enough arguments.";
        } else {
            String str2 = strArr[0];
            String str3 = strArr[1];
            String str4 = strArr[2];
            if (str2.equals("-e")) {
                encodeFileToFile(str3, str4);
                return;
            } else if (str2.equals("-d")) {
                decodeFileToFile(str3, str4);
                return;
            } else {
                str = "Unknown flag: " + str2;
            }
        }
        usage(str);
    }

    private static void usage(String str) {
        System.err.println(str);
        System.err.println("Usage: java Base64Coder -e|-d inputfile outputfile");
    }
}
