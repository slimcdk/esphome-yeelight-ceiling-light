package com.google.zxing.qrcode.decoder;

import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.CharacterSetECI;
import com.miot.service.connection.wifi.step.SmartConfigStep;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Map;
import p026d2.C3128a;
import p026d2.C3136i;

/* renamed from: com.google.zxing.qrcode.decoder.c */
final class C2623c {

    /* renamed from: a */
    private static final char[] f4470a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ea A[LOOP:0: B:1:0x001d->B:59:0x00ea, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c9 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p026d2.C3129b m7253a(byte[] r17, com.google.zxing.qrcode.decoder.C2627g r18, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel r19, java.util.Map<com.google.zxing.DecodeHintType, ?> r20) {
        /*
            r0 = r18
            d2.a r7 = new d2.a
            r8 = r17
            r7.<init>(r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r1 = 50
            r9.<init>(r1)
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 1
            r10.<init>(r11)
            r1 = 0
            r2 = -1
            r13 = 0
            r14 = -1
            r15 = -1
            r16 = 0
        L_0x001d:
            int r1 = r7.mo23600a()     // Catch:{ IllegalArgumentException -> 0x00ed }
            r2 = 4
            if (r1 >= r2) goto L_0x0028
            com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.TERMINATOR     // Catch:{ IllegalArgumentException -> 0x00ed }
        L_0x0026:
            r6 = r1
            goto L_0x0031
        L_0x0028:
            int r1 = r7.mo23603d(r2)     // Catch:{ IllegalArgumentException -> 0x00ed }
            com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.forBits(r1)     // Catch:{ IllegalArgumentException -> 0x00ed }
            goto L_0x0026
        L_0x0031:
            com.google.zxing.qrcode.decoder.Mode r5 = com.google.zxing.qrcode.decoder.Mode.TERMINATOR     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r6 == r5) goto L_0x00c5
            com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.FNC1_FIRST_POSITION     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r6 == r1) goto L_0x00c1
            com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.FNC1_SECOND_POSITION     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r6 != r1) goto L_0x003f
            goto L_0x00c1
        L_0x003f:
            com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.STRUCTURED_APPEND     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r6 != r1) goto L_0x005e
            int r1 = r7.mo23600a()     // Catch:{ IllegalArgumentException -> 0x00ed }
            r2 = 16
            if (r1 < r2) goto L_0x0059
            r1 = 8
            int r2 = r7.mo23603d(r1)     // Catch:{ IllegalArgumentException -> 0x00ed }
            int r1 = r7.mo23603d(r1)     // Catch:{ IllegalArgumentException -> 0x00ed }
            r15 = r1
            r14 = r2
            goto L_0x00c5
        L_0x0059:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.getFormatInstance()     // Catch:{ IllegalArgumentException -> 0x00ed }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00ed }
        L_0x005e:
            com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.ECI     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r6 != r1) goto L_0x0073
            int r1 = m7259g(r7)     // Catch:{ IllegalArgumentException -> 0x00ed }
            com.google.zxing.common.CharacterSetECI r16 = com.google.zxing.common.CharacterSetECI.getCharacterSetECIByValue(r1)     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r16 == 0) goto L_0x006e
            goto L_0x00c5
        L_0x006e:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.getFormatInstance()     // Catch:{ IllegalArgumentException -> 0x00ed }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00ed }
        L_0x0073:
            com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.HANZI     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r6 != r1) goto L_0x0089
            int r1 = r7.mo23603d(r2)     // Catch:{ IllegalArgumentException -> 0x00ed }
            int r2 = r6.getCharacterCountBits(r0)     // Catch:{ IllegalArgumentException -> 0x00ed }
            int r2 = r7.mo23603d(r2)     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r1 != r11) goto L_0x00c5
            m7256d(r7, r9, r2)     // Catch:{ IllegalArgumentException -> 0x00ed }
            goto L_0x00c5
        L_0x0089:
            int r1 = r6.getCharacterCountBits(r0)     // Catch:{ IllegalArgumentException -> 0x00ed }
            int r3 = r7.mo23603d(r1)     // Catch:{ IllegalArgumentException -> 0x00ed }
            com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.NUMERIC     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r6 != r1) goto L_0x0099
            m7258f(r7, r9, r3)     // Catch:{ IllegalArgumentException -> 0x00ed }
            goto L_0x00c5
        L_0x0099:
            com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.ALPHANUMERIC     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r6 != r1) goto L_0x00a1
            m7254b(r7, r9, r3, r13)     // Catch:{ IllegalArgumentException -> 0x00ed }
            goto L_0x00c5
        L_0x00a1:
            com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.BYTE     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r6 != r1) goto L_0x00b2
            r1 = r7
            r2 = r9
            r4 = r16
            r11 = r5
            r5 = r10
            r12 = r6
            r6 = r20
            m7255c(r1, r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x00ed }
            goto L_0x00c7
        L_0x00b2:
            r11 = r5
            r12 = r6
            com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.KANJI     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r12 != r1) goto L_0x00bc
            m7257e(r7, r9, r3)     // Catch:{ IllegalArgumentException -> 0x00ed }
            goto L_0x00c7
        L_0x00bc:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.getFormatInstance()     // Catch:{ IllegalArgumentException -> 0x00ed }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00ed }
        L_0x00c1:
            r11 = r5
            r12 = r6
            r13 = 1
            goto L_0x00c7
        L_0x00c5:
            r11 = r5
            r12 = r6
        L_0x00c7:
            if (r12 != r11) goto L_0x00ea
            d2.b r7 = new d2.b
            java.lang.String r2 = r9.toString()
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x00d7
            r3 = 0
            goto L_0x00d8
        L_0x00d7:
            r3 = r10
        L_0x00d8:
            if (r19 != 0) goto L_0x00dc
            r4 = 0
            goto L_0x00e1
        L_0x00dc:
            java.lang.String r0 = r19.toString()
            r4 = r0
        L_0x00e1:
            r0 = r7
            r1 = r17
            r5 = r14
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        L_0x00ea:
            r11 = 1
            goto L_0x001d
        L_0x00ed:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.getFormatInstance()
            goto L_0x00f3
        L_0x00f2:
            throw r0
        L_0x00f3:
            goto L_0x00f2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.decoder.C2623c.m7253a(byte[], com.google.zxing.qrcode.decoder.g, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel, java.util.Map):d2.b");
    }

    /* renamed from: b */
    private static void m7254b(C3128a aVar, StringBuilder sb, int i, boolean z) {
        while (i > 1) {
            if (aVar.mo23600a() >= 11) {
                int d = aVar.mo23603d(11);
                sb.append(m7260h(d / 45));
                sb.append(m7260h(d % 45));
                i -= 2;
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        if (i == 1) {
            if (aVar.mo23600a() >= 6) {
                sb.append(m7260h(aVar.mo23603d(6)));
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        }
                    }
                    sb.setCharAt(length, 29);
                }
            }
        }
    }

    /* renamed from: c */
    private static void m7255c(C3128a aVar, StringBuilder sb, int i, CharacterSetECI characterSetECI, Collection<byte[]> collection, Map<DecodeHintType, ?> map) {
        if ((i << 3) <= aVar.mo23600a()) {
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) aVar.mo23603d(8);
            }
            try {
                sb.append(new String(bArr, characterSetECI == null ? C3136i.m8386a(bArr, map) : characterSetECI.name()));
                collection.add(bArr);
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.getFormatInstance();
            }
        } else {
            throw FormatException.getFormatInstance();
        }
    }

    /* renamed from: d */
    private static void m7256d(C3128a aVar, StringBuilder sb, int i) {
        if (i * 13 <= aVar.mo23600a()) {
            byte[] bArr = new byte[(i * 2)];
            int i2 = 0;
            while (i > 0) {
                int d = aVar.mo23603d(13);
                int i3 = (d % 96) | ((d / 96) << 8);
                int i4 = i3 + (i3 < 959 ? 41377 : 42657);
                bArr[i2] = (byte) (i4 >> 8);
                bArr[i2 + 1] = (byte) i4;
                i2 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "GB2312"));
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.getFormatInstance();
            }
        } else {
            throw FormatException.getFormatInstance();
        }
    }

    /* renamed from: e */
    private static void m7257e(C3128a aVar, StringBuilder sb, int i) {
        if (i * 13 <= aVar.mo23600a()) {
            byte[] bArr = new byte[(i * 2)];
            int i2 = 0;
            while (i > 0) {
                int d = aVar.mo23603d(13);
                int i3 = (d % 192) | ((d / 192) << 8);
                int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
                bArr[i2] = (byte) (i4 >> 8);
                bArr[i2 + 1] = (byte) i4;
                i2 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "SJIS"));
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.getFormatInstance();
            }
        } else {
            throw FormatException.getFormatInstance();
        }
    }

    /* renamed from: f */
    private static void m7258f(C3128a aVar, StringBuilder sb, int i) {
        while (i >= 3) {
            if (aVar.mo23600a() >= 10) {
                int d = aVar.mo23603d(10);
                if (d < 1000) {
                    sb.append(m7260h(d / 100));
                    sb.append(m7260h((d / 10) % 10));
                    sb.append(m7260h(d % 10));
                    i -= 3;
                } else {
                    throw FormatException.getFormatInstance();
                }
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        if (i == 2) {
            if (aVar.mo23600a() >= 7) {
                int d2 = aVar.mo23603d(7);
                if (d2 < 100) {
                    sb.append(m7260h(d2 / 10));
                    sb.append(m7260h(d2 % 10));
                    return;
                }
                throw FormatException.getFormatInstance();
            }
            throw FormatException.getFormatInstance();
        } else if (i != 1) {
        } else {
            if (aVar.mo23600a() >= 4) {
                int d3 = aVar.mo23603d(4);
                if (d3 < 10) {
                    sb.append(m7260h(d3));
                    return;
                }
                throw FormatException.getFormatInstance();
            }
            throw FormatException.getFormatInstance();
        }
    }

    /* renamed from: g */
    private static int m7259g(C3128a aVar) {
        int d = aVar.mo23603d(8);
        if ((d & 128) == 0) {
            return d & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT;
        }
        if ((d & 192) == 128) {
            return aVar.mo23603d(8) | ((d & 63) << 8);
        }
        if ((d & 224) == 192) {
            return aVar.mo23603d(16) | ((d & 31) << 16);
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: h */
    private static char m7260h(int i) {
        char[] cArr = f4470a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw FormatException.getFormatInstance();
    }
}
