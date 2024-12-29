package p011c.p012a.p053e.p073y.p076d;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;
import p011c.p012a.p053e.C0819f;
import p011c.p012a.p053e.C0831r;
import p011c.p012a.p053e.p057t.C0839a;
import p011c.p012a.p053e.p057t.C0842d;
import p011c.p012a.p053e.p057t.p059n.C0853a;
import p011c.p012a.p053e.p057t.p059n.C0856d;
import p011c.p012a.p053e.p073y.p074b.C0958f;
import p011c.p012a.p053e.p073y.p074b.C0960h;
import p011c.p012a.p053e.p073y.p074b.C0962j;

/* renamed from: c.a.e.y.d.c */
public final class C0976c {

    /* renamed from: a */
    private static final int[] f1165a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: c.a.e.y.d.c$a */
    static /* synthetic */ class C0977a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1166a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                c.a.e.y.b.h[] r0 = p011c.p012a.p053e.p073y.p074b.C0960h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1166a = r0
                c.a.e.y.b.h r1 = p011c.p012a.p053e.p073y.p074b.C0960h.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1166a     // Catch:{ NoSuchFieldError -> 0x001d }
                c.a.e.y.b.h r1 = p011c.p012a.p053e.p073y.p074b.C0960h.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1166a     // Catch:{ NoSuchFieldError -> 0x0028 }
                c.a.e.y.b.h r1 = p011c.p012a.p053e.p073y.p074b.C0960h.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1166a     // Catch:{ NoSuchFieldError -> 0x0033 }
                c.a.e.y.b.h r1 = p011c.p012a.p053e.p073y.p074b.C0960h.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p053e.p073y.p076d.C0976c.C0977a.<clinit>():void");
        }
    }

    /* renamed from: a */
    static void m1804a(String str, C0839a aVar, String str2) {
        try {
            for (byte c : str.getBytes(str2)) {
                aVar.mo9037c(c, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new C0831r((Throwable) e);
        }
    }

    /* renamed from: b */
    static void m1805b(CharSequence charSequence, C0839a aVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int p = m1819p(charSequence.charAt(i));
            if (p != -1) {
                int i2 = i + 1;
                if (i2 < length) {
                    int p2 = m1819p(charSequence.charAt(i2));
                    if (p2 != -1) {
                        aVar.mo9037c((p * 45) + p2, 11);
                        i += 2;
                    } else {
                        throw new C0831r();
                    }
                } else {
                    aVar.mo9037c(p, 6);
                    i = i2;
                }
            } else {
                throw new C0831r();
            }
        }
    }

    /* renamed from: c */
    static void m1806c(String str, C0960h hVar, C0839a aVar, String str2) {
        int i = C0977a.f1166a[hVar.ordinal()];
        if (i == 1) {
            m1811h(str, aVar);
        } else if (i == 2) {
            m1805b(str, aVar);
        } else if (i == 3) {
            m1804a(str, aVar, str2);
        } else if (i == 4) {
            m1808e(str, aVar);
        } else {
            throw new C0831r("Invalid mode: " + hVar);
        }
    }

    /* renamed from: d */
    private static void m1807d(C0842d dVar, C0839a aVar) {
        aVar.mo9037c(C0960h.ECI.mo9316b(), 4);
        aVar.mo9037c(dVar.mo9078c(), 8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035 A[LOOP:0: B:4:0x0008->B:17:0x0035, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m1808e(java.lang.String r6, p011c.p012a.p053e.p057t.C0839a r7) {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x004d }
            int r0 = r6.length
            r1 = 0
        L_0x0008:
            if (r1 >= r0) goto L_0x004c
            byte r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            byte r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L_0x0024
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L_0x0024
        L_0x0022:
            int r2 = r2 - r3
            goto L_0x0033
        L_0x0024:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L_0x0032
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L_0x0032
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L_0x0022
        L_0x0032:
            r2 = -1
        L_0x0033:
            if (r2 == r4) goto L_0x0044
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.mo9037c(r3, r2)
            int r1 = r1 + 2
            goto L_0x0008
        L_0x0044:
            c.a.e.r r6 = new c.a.e.r
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>((java.lang.String) r7)
            throw r6
        L_0x004c:
            return
        L_0x004d:
            r6 = move-exception
            c.a.e.r r7 = new c.a.e.r
            r7.<init>((java.lang.Throwable) r6)
            goto L_0x0055
        L_0x0054:
            throw r7
        L_0x0055:
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p053e.p073y.p076d.C0976c.m1808e(java.lang.String, c.a.e.t.a):void");
    }

    /* renamed from: f */
    static void m1809f(int i, C0962j jVar, C0960h hVar, C0839a aVar) {
        int c = hVar.mo9317c(jVar);
        int i2 = 1 << c;
        if (i < i2) {
            aVar.mo9037c(i, c);
            return;
        }
        throw new C0831r(i + " is bigger than " + (i2 - 1));
    }

    /* renamed from: g */
    static void m1810g(C0960h hVar, C0839a aVar) {
        aVar.mo9037c(hVar.mo9316b(), 4);
    }

    /* renamed from: h */
    static void m1811h(CharSequence charSequence, C0839a aVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                aVar.mo9037c((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    aVar.mo9037c((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    aVar.mo9037c(charAt, 4);
                }
            }
        }
    }

    /* renamed from: i */
    private static int m1812i(C0960h hVar, C0839a aVar, C0839a aVar2, C0962j jVar) {
        return aVar.mo9047m() + hVar.mo9317c(jVar) + aVar2.mo9047m();
    }

    /* renamed from: j */
    private static int m1813j(C0975b bVar) {
        return C0978d.m1826a(bVar) + C0978d.m1828c(bVar) + C0978d.m1829d(bVar) + C0978d.m1830e(bVar);
    }

    /* renamed from: k */
    private static int m1814k(C0839a aVar, C0958f fVar, C0962j jVar, C0975b bVar) {
        int i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            C0979e.m1834a(aVar, fVar, jVar, i3, bVar);
            int j = m1813j(bVar);
            if (j < i) {
                i2 = i3;
                i = j;
            }
        }
        return i2;
    }

    /* renamed from: l */
    private static C0960h m1815l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && m1822s(str)) {
            return C0960h.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else if (m1819p(charAt) == -1) {
                return C0960h.BYTE;
            } else {
                z = true;
            }
        }
        return z ? C0960h.ALPHANUMERIC : z2 ? C0960h.NUMERIC : C0960h.BYTE;
    }

    /* renamed from: m */
    private static C0962j m1816m(int i, C0958f fVar) {
        for (int i2 = 1; i2 <= 40; i2++) {
            C0962j i3 = C0962j.m1745i(i2);
            if (m1825v(i, i3, fVar)) {
                return i3;
            }
        }
        throw new C0831r("Data too big");
    }

    /* renamed from: n */
    public static C0980f m1817n(String str, C0958f fVar, Map<C0819f, ?> map) {
        C0962j jVar;
        C0842d a;
        String obj = (map == null || !map.containsKey(C0819f.CHARACTER_SET)) ? "ISO-8859-1" : map.get(C0819f.CHARACTER_SET).toString();
        C0960h l = m1815l(str, obj);
        C0839a aVar = new C0839a();
        if (l == C0960h.BYTE && !"ISO-8859-1".equals(obj) && (a = C0842d.m1219a(obj)) != null) {
            m1807d(a, aVar);
        }
        m1810g(l, aVar);
        C0839a aVar2 = new C0839a();
        m1806c(str, l, aVar2, obj);
        if (map == null || !map.containsKey(C0819f.QR_VERSION)) {
            jVar = m1823t(fVar, l, aVar, aVar2);
        } else {
            jVar = C0962j.m1745i(Integer.parseInt(map.get(C0819f.QR_VERSION).toString()));
            if (!m1825v(m1812i(l, aVar, aVar2, jVar), jVar, fVar)) {
                throw new C0831r("Data too big for requested version");
            }
        }
        C0839a aVar3 = new C0839a();
        aVar3.mo9036b(aVar);
        m1809f(l == C0960h.BYTE ? aVar2.mo9048o() : str.length(), jVar, l, aVar3);
        aVar3.mo9036b(aVar2);
        C0962j.C0964b f = jVar.mo9322f(fVar);
        int h = jVar.mo9323h() - f.mo9331d();
        m1824u(h, aVar3);
        C0839a r = m1821r(aVar3, jVar.mo9323h(), h, f.mo9330c());
        C0980f fVar2 = new C0980f();
        fVar2.mo9363c(fVar);
        fVar2.mo9366f(l);
        fVar2.mo9367g(jVar);
        int e = jVar.mo9321e();
        C0975b bVar = new C0975b(e, e);
        int k = m1814k(r, fVar, jVar, bVar);
        fVar2.mo9364d(k);
        C0979e.m1834a(r, fVar, jVar, k, bVar);
        fVar2.mo9365e(bVar);
        return fVar2;
    }

    /* renamed from: o */
    static byte[] m1818o(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[(length + i)];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new C0856d(C0853a.f849l).mo9122b(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    /* renamed from: p */
    static int m1819p(int i) {
        int[] iArr = f1165a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    /* renamed from: q */
    static void m1820q(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        if (i4 < i3) {
            int i5 = i % i3;
            int i6 = i3 - i5;
            int i7 = i / i3;
            int i8 = i7 + 1;
            int i9 = i2 / i3;
            int i10 = i9 + 1;
            int i11 = i7 - i9;
            int i12 = i8 - i10;
            if (i11 != i12) {
                throw new C0831r("EC bytes mismatch");
            } else if (i3 != i6 + i5) {
                throw new C0831r("RS blocks mismatch");
            } else if (i != ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
                throw new C0831r("Total bytes mismatch");
            } else if (i4 < i6) {
                iArr[0] = i9;
                iArr2[0] = i11;
            } else {
                iArr[0] = i10;
                iArr2[0] = i12;
            }
        } else {
            throw new C0831r("Block ID too large");
        }
    }

    /* renamed from: r */
    static C0839a m1821r(C0839a aVar, int i, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (aVar.mo9048o() == i5) {
            ArrayList<C0974a> arrayList = new ArrayList<>(i6);
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                m1820q(i, i2, i3, i10, iArr, iArr2);
                int i11 = iArr[0];
                byte[] bArr = new byte[i11];
                aVar.mo9054u(i7 << 3, bArr, 0, i11);
                byte[] o = m1818o(bArr, iArr2[0]);
                arrayList.add(new C0974a(bArr, o));
                i8 = Math.max(i8, i11);
                i9 = Math.max(i9, o.length);
                i7 += iArr[0];
            }
            if (i5 == i7) {
                C0839a aVar2 = new C0839a();
                for (int i12 = 0; i12 < i8; i12++) {
                    for (C0974a a : arrayList) {
                        byte[] a2 = a.mo9352a();
                        if (i12 < a2.length) {
                            aVar2.mo9037c(a2[i12], 8);
                        }
                    }
                }
                for (int i13 = 0; i13 < i9; i13++) {
                    for (C0974a b : arrayList) {
                        byte[] b2 = b.mo9353b();
                        if (i13 < b2.length) {
                            aVar2.mo9037c(b2[i13], 8);
                        }
                    }
                }
                if (i4 == aVar2.mo9048o()) {
                    return aVar2;
                }
                throw new C0831r("Interleaving error: " + i4 + " and " + aVar2.mo9048o() + " differ.");
            }
            throw new C0831r("Data bytes does not match offset");
        }
        throw new C0831r("Number of bits and data bytes does not match");
    }

    /* renamed from: s */
    private static boolean m1822s(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                byte b = bytes[i] & 255;
                if ((b < 129 || b > 159) && (b < 224 || b > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    /* renamed from: t */
    private static C0962j m1823t(C0958f fVar, C0960h hVar, C0839a aVar, C0839a aVar2) {
        return m1816m(m1812i(hVar, aVar, aVar2, m1816m(m1812i(hVar, aVar, aVar2, C0962j.m1745i(1)), fVar)), fVar);
    }

    /* renamed from: u */
    static void m1824u(int i, C0839a aVar) {
        int i2 = i << 3;
        if (aVar.mo9047m() <= i2) {
            for (int i3 = 0; i3 < 4 && aVar.mo9047m() < i2; i3++) {
                aVar.mo9035a(false);
            }
            int m = aVar.mo9047m() & 7;
            if (m > 0) {
                while (m < 8) {
                    aVar.mo9035a(false);
                    m++;
                }
            }
            int o = i - aVar.mo9048o();
            for (int i4 = 0; i4 < o; i4++) {
                aVar.mo9037c((i4 & 1) == 0 ? 236 : 17, 8);
            }
            if (aVar.mo9047m() != i2) {
                throw new C0831r("Bits size does not equal capacity");
            }
            return;
        }
        throw new C0831r("data bits cannot fit in the QR Code" + aVar.mo9047m() + " > " + i2);
    }

    /* renamed from: v */
    private static boolean m1825v(int i, C0962j jVar, C0958f fVar) {
        return jVar.mo9323h() - jVar.mo9322f(fVar).mo9331d() >= (i + 7) / 8;
    }
}
