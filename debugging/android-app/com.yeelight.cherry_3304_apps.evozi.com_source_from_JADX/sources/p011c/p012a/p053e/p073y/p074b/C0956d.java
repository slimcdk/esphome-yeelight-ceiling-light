package p011c.p012a.p053e.p073y.p074b;

import com.miot.service.connection.wifi.step.SmartConfigStep;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Map;
import p011c.p012a.p053e.C0818e;
import p011c.p012a.p053e.C0820g;
import p011c.p012a.p053e.p057t.C0841c;
import p011c.p012a.p053e.p057t.C0842d;
import p011c.p012a.p053e.p057t.C0850l;

/* renamed from: c.a.e.y.b.d */
final class C0956d {

    /* renamed from: a */
    private static final char[] f1100a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e7 A[LOOP:0: B:1:0x001e->B:60:0x00e7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c6 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p011c.p012a.p053e.p057t.C0843e m1720a(byte[] r17, p011c.p012a.p053e.p073y.p074b.C0962j r18, p011c.p012a.p053e.p073y.p074b.C0958f r19, java.util.Map<p011c.p012a.p053e.C0818e, ?> r20) {
        /*
            r0 = r18
            c.a.e.t.c r7 = new c.a.e.t.c
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
            r12 = 0
            r16 = r12
            r13 = 0
            r14 = -1
            r15 = -1
        L_0x001e:
            int r1 = r7.mo9074a()     // Catch:{ IllegalArgumentException -> 0x00ea }
            r2 = 4
            if (r1 >= r2) goto L_0x0029
            c.a.e.y.b.h r1 = p011c.p012a.p053e.p073y.p074b.C0960h.TERMINATOR     // Catch:{ IllegalArgumentException -> 0x00ea }
        L_0x0027:
            r6 = r1
            goto L_0x0032
        L_0x0029:
            int r1 = r7.mo9077d(r2)     // Catch:{ IllegalArgumentException -> 0x00ea }
            c.a.e.y.b.h r1 = p011c.p012a.p053e.p073y.p074b.C0960h.m1738a(r1)     // Catch:{ IllegalArgumentException -> 0x00ea }
            goto L_0x0027
        L_0x0032:
            c.a.e.y.b.h r1 = p011c.p012a.p053e.p073y.p074b.C0960h.TERMINATOR     // Catch:{ IllegalArgumentException -> 0x00ea }
            if (r6 == r1) goto L_0x0058
            c.a.e.y.b.h r1 = p011c.p012a.p053e.p073y.p074b.C0960h.FNC1_FIRST_POSITION     // Catch:{ IllegalArgumentException -> 0x00ea }
            if (r6 == r1) goto L_0x00c0
            c.a.e.y.b.h r1 = p011c.p012a.p053e.p073y.p074b.C0960h.FNC1_SECOND_POSITION     // Catch:{ IllegalArgumentException -> 0x00ea }
            if (r6 != r1) goto L_0x0040
            goto L_0x00c0
        L_0x0040:
            c.a.e.y.b.h r1 = p011c.p012a.p053e.p073y.p074b.C0960h.STRUCTURED_APPEND     // Catch:{ IllegalArgumentException -> 0x00ea }
            if (r6 != r1) goto L_0x0060
            int r1 = r7.mo9074a()     // Catch:{ IllegalArgumentException -> 0x00ea }
            r2 = 16
            if (r1 < r2) goto L_0x005b
            r1 = 8
            int r2 = r7.mo9077d(r1)     // Catch:{ IllegalArgumentException -> 0x00ea }
            int r1 = r7.mo9077d(r1)     // Catch:{ IllegalArgumentException -> 0x00ea }
            r15 = r1
            r14 = r2
        L_0x0058:
            r11 = r6
            goto L_0x00c2
        L_0x005b:
            c.a.e.g r0 = p011c.p012a.p053e.C0820g.m1114a()     // Catch:{ IllegalArgumentException -> 0x00ea }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00ea }
        L_0x0060:
            c.a.e.y.b.h r1 = p011c.p012a.p053e.p073y.p074b.C0960h.ECI     // Catch:{ IllegalArgumentException -> 0x00ea }
            if (r6 != r1) goto L_0x0074
            int r1 = m1726g(r7)     // Catch:{ IllegalArgumentException -> 0x00ea }
            c.a.e.t.d r16 = p011c.p012a.p053e.p057t.C0842d.m1220b(r1)     // Catch:{ IllegalArgumentException -> 0x00ea }
            if (r16 == 0) goto L_0x006f
            goto L_0x0058
        L_0x006f:
            c.a.e.g r0 = p011c.p012a.p053e.C0820g.m1114a()     // Catch:{ IllegalArgumentException -> 0x00ea }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00ea }
        L_0x0074:
            c.a.e.y.b.h r1 = p011c.p012a.p053e.p073y.p074b.C0960h.HANZI     // Catch:{ IllegalArgumentException -> 0x00ea }
            if (r6 != r1) goto L_0x008a
            int r1 = r7.mo9077d(r2)     // Catch:{ IllegalArgumentException -> 0x00ea }
            int r2 = r6.mo9317c(r0)     // Catch:{ IllegalArgumentException -> 0x00ea }
            int r2 = r7.mo9077d(r2)     // Catch:{ IllegalArgumentException -> 0x00ea }
            if (r1 != r11) goto L_0x0058
            m1723d(r7, r9, r2)     // Catch:{ IllegalArgumentException -> 0x00ea }
            goto L_0x0058
        L_0x008a:
            int r1 = r6.mo9317c(r0)     // Catch:{ IllegalArgumentException -> 0x00ea }
            int r3 = r7.mo9077d(r1)     // Catch:{ IllegalArgumentException -> 0x00ea }
            c.a.e.y.b.h r1 = p011c.p012a.p053e.p073y.p074b.C0960h.NUMERIC     // Catch:{ IllegalArgumentException -> 0x00ea }
            if (r6 != r1) goto L_0x009a
            m1725f(r7, r9, r3)     // Catch:{ IllegalArgumentException -> 0x00ea }
            goto L_0x0058
        L_0x009a:
            c.a.e.y.b.h r1 = p011c.p012a.p053e.p073y.p074b.C0960h.ALPHANUMERIC     // Catch:{ IllegalArgumentException -> 0x00ea }
            if (r6 != r1) goto L_0x00a2
            m1721b(r7, r9, r3, r13)     // Catch:{ IllegalArgumentException -> 0x00ea }
            goto L_0x0058
        L_0x00a2:
            c.a.e.y.b.h r1 = p011c.p012a.p053e.p073y.p074b.C0960h.BYTE     // Catch:{ IllegalArgumentException -> 0x00ea }
            if (r6 != r1) goto L_0x00b2
            r1 = r7
            r2 = r9
            r4 = r16
            r5 = r10
            r11 = r6
            r6 = r20
            m1722c(r1, r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x00ea }
            goto L_0x00c2
        L_0x00b2:
            r11 = r6
            c.a.e.y.b.h r1 = p011c.p012a.p053e.p073y.p074b.C0960h.KANJI     // Catch:{ IllegalArgumentException -> 0x00ea }
            if (r11 != r1) goto L_0x00bb
            m1724e(r7, r9, r3)     // Catch:{ IllegalArgumentException -> 0x00ea }
            goto L_0x00c2
        L_0x00bb:
            c.a.e.g r0 = p011c.p012a.p053e.C0820g.m1114a()     // Catch:{ IllegalArgumentException -> 0x00ea }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00ea }
        L_0x00c0:
            r11 = r6
            r13 = 1
        L_0x00c2:
            c.a.e.y.b.h r1 = p011c.p012a.p053e.p073y.p074b.C0960h.TERMINATOR     // Catch:{ IllegalArgumentException -> 0x00ea }
            if (r11 != r1) goto L_0x00e7
            c.a.e.t.e r7 = new c.a.e.t.e
            java.lang.String r2 = r9.toString()
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x00d4
            r3 = r12
            goto L_0x00d5
        L_0x00d4:
            r3 = r10
        L_0x00d5:
            if (r19 != 0) goto L_0x00d9
            r4 = r12
            goto L_0x00de
        L_0x00d9:
            java.lang.String r0 = r19.toString()
            r4 = r0
        L_0x00de:
            r0 = r7
            r1 = r17
            r5 = r14
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        L_0x00e7:
            r11 = 1
            goto L_0x001e
        L_0x00ea:
            c.a.e.g r0 = p011c.p012a.p053e.C0820g.m1114a()
            goto L_0x00f0
        L_0x00ef:
            throw r0
        L_0x00f0:
            goto L_0x00ef
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p053e.p073y.p074b.C0956d.m1720a(byte[], c.a.e.y.b.j, c.a.e.y.b.f, java.util.Map):c.a.e.t.e");
    }

    /* renamed from: b */
    private static void m1721b(C0841c cVar, StringBuilder sb, int i, boolean z) {
        while (i > 1) {
            if (cVar.mo9074a() >= 11) {
                int d = cVar.mo9077d(11);
                sb.append(m1727h(d / 45));
                sb.append(m1727h(d % 45));
                i -= 2;
            } else {
                throw C0820g.m1114a();
            }
        }
        if (i == 1) {
            if (cVar.mo9074a() >= 6) {
                sb.append(m1727h(cVar.mo9077d(6)));
            } else {
                throw C0820g.m1114a();
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
    private static void m1722c(C0841c cVar, StringBuilder sb, int i, C0842d dVar, Collection<byte[]> collection, Map<C0818e, ?> map) {
        if ((i << 3) <= cVar.mo9074a()) {
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) cVar.mo9077d(8);
            }
            try {
                sb.append(new String(bArr, dVar == null ? C0850l.m1258a(bArr, map) : dVar.name()));
                collection.add(bArr);
            } catch (UnsupportedEncodingException unused) {
                throw C0820g.m1114a();
            }
        } else {
            throw C0820g.m1114a();
        }
    }

    /* renamed from: d */
    private static void m1723d(C0841c cVar, StringBuilder sb, int i) {
        if (i * 13 <= cVar.mo9074a()) {
            byte[] bArr = new byte[(i * 2)];
            int i2 = 0;
            while (i > 0) {
                int d = cVar.mo9077d(13);
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
                throw C0820g.m1114a();
            }
        } else {
            throw C0820g.m1114a();
        }
    }

    /* renamed from: e */
    private static void m1724e(C0841c cVar, StringBuilder sb, int i) {
        if (i * 13 <= cVar.mo9074a()) {
            byte[] bArr = new byte[(i * 2)];
            int i2 = 0;
            while (i > 0) {
                int d = cVar.mo9077d(13);
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
                throw C0820g.m1114a();
            }
        } else {
            throw C0820g.m1114a();
        }
    }

    /* renamed from: f */
    private static void m1725f(C0841c cVar, StringBuilder sb, int i) {
        while (i >= 3) {
            if (cVar.mo9074a() >= 10) {
                int d = cVar.mo9077d(10);
                if (d < 1000) {
                    sb.append(m1727h(d / 100));
                    sb.append(m1727h((d / 10) % 10));
                    sb.append(m1727h(d % 10));
                    i -= 3;
                } else {
                    throw C0820g.m1114a();
                }
            } else {
                throw C0820g.m1114a();
            }
        }
        if (i == 2) {
            if (cVar.mo9074a() >= 7) {
                int d2 = cVar.mo9077d(7);
                if (d2 < 100) {
                    sb.append(m1727h(d2 / 10));
                    sb.append(m1727h(d2 % 10));
                    return;
                }
                throw C0820g.m1114a();
            }
            throw C0820g.m1114a();
        } else if (i != 1) {
        } else {
            if (cVar.mo9074a() >= 4) {
                int d3 = cVar.mo9077d(4);
                if (d3 < 10) {
                    sb.append(m1727h(d3));
                    return;
                }
                throw C0820g.m1114a();
            }
            throw C0820g.m1114a();
        }
    }

    /* renamed from: g */
    private static int m1726g(C0841c cVar) {
        int d = cVar.mo9077d(8);
        if ((d & 128) == 0) {
            return d & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT;
        }
        if ((d & 192) == 128) {
            return cVar.mo9077d(8) | ((d & 63) << 8);
        }
        if ((d & 224) == 192) {
            return cVar.mo9077d(16) | ((d & 31) << 16);
        }
        throw C0820g.m1114a();
    }

    /* renamed from: h */
    private static char m1727h(int i) {
        char[] cArr = f1100a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw C0820g.m1114a();
    }
}
