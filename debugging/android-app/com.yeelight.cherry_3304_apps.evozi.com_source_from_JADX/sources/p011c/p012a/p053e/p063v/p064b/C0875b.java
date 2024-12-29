package p011c.p012a.p053e.p063v.p064b;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import com.miot.bluetooth.BluetoothConstants;
import java.text.DecimalFormat;
import java.util.List;
import p011c.p012a.p053e.p057t.C0843e;

/* renamed from: c.a.e.v.b.b */
final class C0875b {

    /* renamed from: a */
    private static final String[] f908a = {"\nABCDEFGHIJKLMNOPQRSTUVWXYZ￺\u001c\u001d\u001e￻ ￼\"#$%&'()*+,-./0123456789:￱￲￳￴￸", "`abcdefghijklmnopqrstuvwxyz￺\u001c\u001d\u001e￻{￼}~;<=>?[\\]^_ ,./:@!|￼￵￶￼￰￲￳￴￷", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ￺\u001c\u001d\u001eÛÜÝÞßª¬±²³µ¹º¼½¾￷ ￹￳￴￸", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú￺\u001c\u001d\u001e￻ûüýþÿ¡¨«¯°´·¸»¿￷ ￲￹￴￸", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a￺￼￼\u001b￻\u001c\u001d\u001e\u001f ¢£¤¥¦§©­®¶￷ ￲￳￹￸", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};

    /* renamed from: a */
    static C0843e m1348a(byte[] bArr, int i) {
        String str;
        StringBuilder sb;
        int i2;
        StringBuilder sb2 = new StringBuilder(BluetoothConstants.MSG_READ_RSSI);
        if (i == 2 || i == 3) {
            int i3 = 0;
            if (i == 2) {
                str = new DecimalFormat("0000000000".substring(0, m1354g(bArr))).format((long) m1353f(bArr));
            } else {
                str = m1355h(bArr);
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String format = decimalFormat.format((long) m1350c(bArr));
            String format2 = decimalFormat.format((long) m1356i(bArr));
            sb2.append(m1352e(bArr, 10, 84));
            if (sb2.toString().startsWith("[)>\u001e01\u001d")) {
                i3 = 9;
                sb = new StringBuilder();
            } else {
                sb = new StringBuilder();
            }
            sb.append(str);
            sb.append(29);
            sb.append(format);
            sb.append(29);
            sb.append(format2);
            sb.append(29);
            sb2.insert(i3, sb.toString());
        } else {
            if (i == 4) {
                i2 = 93;
            } else if (i == 5) {
                i2 = 77;
            }
            sb2.append(m1352e(bArr, 1, i2));
        }
        return new C0843e(bArr, sb2.toString(), (List<byte[]>) null, String.valueOf(i));
    }

    /* renamed from: b */
    private static int m1349b(int i, byte[] bArr) {
        int i2 = i - 1;
        return ((1 << (5 - (i2 % 6))) & bArr[i2 / 6]) == 0 ? 0 : 1;
    }

    /* renamed from: c */
    private static int m1350c(byte[] bArr) {
        return m1351d(bArr, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38});
    }

    /* renamed from: d */
    private static int m1351d(byte[] bArr, byte[] bArr2) {
        if (bArr2.length != 0) {
            int i = 0;
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                i += m1349b(bArr2[i2], bArr) << ((bArr2.length - i2) - 1);
            }
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0055, code lost:
        r6 = r4;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
        r7 = r5 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0061, code lost:
        if (r5 != 0) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0063, code lost:
        r4 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
        r3 = r3 + 1;
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0050, code lost:
        r5 = -1;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m1352e(byte[] r12, int r13, int r14) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = -1
            r3 = r13
            r4 = 0
            r5 = -1
            r6 = 0
        L_0x000b:
            int r7 = r13 + r14
            r8 = 1
            if (r3 >= r7) goto L_0x0067
            java.lang.String[] r7 = f908a
            r7 = r7[r4]
            byte r9 = r12[r3]
            char r7 = r7.charAt(r9)
            switch(r7) {
                case 65520: goto L_0x0058;
                case 65521: goto L_0x0058;
                case 65522: goto L_0x0058;
                case 65523: goto L_0x0058;
                case 65524: goto L_0x0058;
                case 65525: goto L_0x0054;
                case 65526: goto L_0x0052;
                case 65527: goto L_0x004f;
                case 65528: goto L_0x004d;
                case 65529: goto L_0x0050;
                case 65530: goto L_0x001d;
                case 65531: goto L_0x0021;
                default: goto L_0x001d;
            }
        L_0x001d:
            r0.append(r7)
            goto L_0x005f
        L_0x0021:
            int r3 = r3 + 1
            byte r7 = r12[r3]
            int r7 = r7 << 24
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r9 = r9 << 18
            int r7 = r7 + r9
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r9 = r9 << 12
            int r7 = r7 + r9
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r9 = r9 << 6
            int r7 = r7 + r9
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r7 = r7 + r9
            java.text.DecimalFormat r9 = new java.text.DecimalFormat
            java.lang.String r10 = "000000000"
            r9.<init>(r10)
            long r10 = (long) r7
            java.lang.String r7 = r9.format(r10)
            r0.append(r7)
            goto L_0x005f
        L_0x004d:
            r4 = 1
            goto L_0x0050
        L_0x004f:
            r4 = 0
        L_0x0050:
            r5 = -1
            goto L_0x005f
        L_0x0052:
            r5 = 3
            goto L_0x0055
        L_0x0054:
            r5 = 2
        L_0x0055:
            r6 = r4
            r4 = 0
            goto L_0x005f
        L_0x0058:
            r5 = 65520(0xfff0, float:9.1813E-41)
            int r7 = r7 - r5
            r6 = r4
            r4 = r7
            r5 = 1
        L_0x005f:
            int r7 = r5 + -1
            if (r5 != 0) goto L_0x0064
            r4 = r6
        L_0x0064:
            int r3 = r3 + r8
            r5 = r7
            goto L_0x000b
        L_0x0067:
            int r12 = r0.length()
            if (r12 <= 0) goto L_0x0084
            int r12 = r0.length()
            int r12 = r12 - r8
            char r12 = r0.charAt(r12)
            r13 = 65532(0xfffc, float:9.183E-41)
            if (r12 != r13) goto L_0x0084
            int r12 = r0.length()
            int r12 = r12 - r8
            r0.setLength(r12)
            goto L_0x0067
        L_0x0084:
            java.lang.String r12 = r0.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p053e.p063v.p064b.C0875b.m1352e(byte[], int, int):java.lang.String");
    }

    /* renamed from: f */
    private static int m1353f(byte[] bArr) {
        return m1351d(bArr, new byte[]{33, 34, 35, 36, 25, 26, 27, 28, 29, 30, ParameterInitDefType.DoubleVec3Init, ParameterInitDefType.DoubleVec4Init, 21, 22, 23, 24, ParameterInitDefType.IntVec3Init, ParameterInitDefType.IntVec4Init, ParameterInitDefType.CubemapSamplerInit, ParameterInitDefType.ExternalSamplerInit, ParameterInitDefType.DoubleInit, ParameterInitDefType.DoubleVec2Init, 7, 8, 9, 10, 11, 12, 1, 2});
    }

    /* renamed from: g */
    private static int m1354g(byte[] bArr) {
        return m1351d(bArr, new byte[]{39, 40, 41, 42, 31, 32});
    }

    /* renamed from: h */
    private static String m1355h(byte[] bArr) {
        return String.valueOf(new char[]{f908a[0].charAt(m1351d(bArr, new byte[]{39, 40, 41, 42, 31, 32})), f908a[0].charAt(m1351d(bArr, new byte[]{33, 34, 35, 36, 25, 26})), f908a[0].charAt(m1351d(bArr, new byte[]{27, 28, 29, 30, ParameterInitDefType.DoubleVec3Init, ParameterInitDefType.DoubleVec4Init})), f908a[0].charAt(m1351d(bArr, new byte[]{21, 22, 23, 24, ParameterInitDefType.IntVec3Init, ParameterInitDefType.IntVec4Init})), f908a[0].charAt(m1351d(bArr, new byte[]{ParameterInitDefType.CubemapSamplerInit, ParameterInitDefType.ExternalSamplerInit, ParameterInitDefType.DoubleInit, ParameterInitDefType.DoubleVec2Init, 7, 8})), f908a[0].charAt(m1351d(bArr, new byte[]{9, 10, 11, 12, 1, 2}))});
    }

    /* renamed from: i */
    private static int m1356i(byte[] bArr) {
        return m1351d(bArr, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52});
    }
}
