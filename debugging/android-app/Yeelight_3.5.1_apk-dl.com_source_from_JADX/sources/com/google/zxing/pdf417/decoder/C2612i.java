package com.google.zxing.pdf417.decoder;

import com.google.zxing.C2564h;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C2549b;
import java.lang.reflect.Array;
import java.util.ArrayList;
import p026d2.C3129b;
import p062l2.C3314a;
import p067m2.C3345a;

/* renamed from: com.google.zxing.pdf417.decoder.i */
public final class C2612i {

    /* renamed from: a */
    private static final C3345a f4459a = new C3345a();

    /* renamed from: a */
    private static C2606c m7220a(C2610g gVar) {
        int[] j;
        if (gVar == null || (j = gVar.mo19642j()) == null) {
            return null;
        }
        int p = m7235p(j);
        int i = 0;
        int i2 = 0;
        for (int i3 : j) {
            i2 += p - i3;
            if (i3 > 0) {
                break;
            }
        }
        C2607d[] d = gVar.mo19636d();
        int i4 = 0;
        while (i2 > 0 && d[i4] == null) {
            i2--;
            i4++;
        }
        for (int length = j.length - 1; length >= 0; length--) {
            i += p - j[length];
            if (j[length] > 0) {
                break;
            }
        }
        int length2 = d.length - 1;
        while (i > 0 && d[length2] == null) {
            i--;
            length2--;
        }
        return gVar.mo19633a().mo19604a(i2, i, gVar.mo19643k());
    }

    /* renamed from: b */
    private static void m7221b(C2608e eVar, C2605b[][] bVarArr) {
        int[] a = bVarArr[0][1].mo19602a();
        int j = (eVar.mo19624j() * eVar.mo19626l()) - m7237r(eVar.mo19625k());
        if (a.length == 0) {
            if (j <= 0 || j > 928) {
                throw NotFoundException.getNotFoundInstance();
            }
            bVarArr[0][1].mo19603b(j);
        } else if (a[0] != j) {
            bVarArr[0][1].mo19603b(j);
        }
    }

    /* renamed from: c */
    private static int m7222c(C2549b bVar, int i, int i2, boolean z, int i3, int i4) {
        int i5 = z ? -1 : 1;
        int i6 = i3;
        for (int i7 = 0; i7 < 2; i7++) {
            while (true) {
                if (!z) {
                    if (i6 >= i2) {
                        continue;
                        break;
                    }
                } else if (i6 < i) {
                    continue;
                    break;
                }
                if (z != bVar.mo19493d(i6, i4)) {
                    continue;
                    break;
                } else if (Math.abs(i3 - i6) > 2) {
                    return i3;
                } else {
                    i6 += i5;
                }
            }
            i5 = -i5;
            z = !z;
        }
        return i6;
    }

    /* renamed from: d */
    private static boolean m7223d(int i, int i2, int i3) {
        return i2 + -2 <= i && i <= i3 + 2;
    }

    /* renamed from: e */
    private static int m7224e(int[] iArr, int[] iArr2, int i) {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return f4459a.mo24071a(iArr, i, iArr2);
        }
        throw ChecksumException.getChecksumInstance();
    }

    /* renamed from: f */
    private static C2605b[][] m7225f(C2608e eVar) {
        int c;
        int l = eVar.mo19626l();
        int[] iArr = new int[2];
        iArr[1] = eVar.mo19624j() + 2;
        iArr[0] = l;
        C2605b[][] bVarArr = (C2605b[][]) Array.newInstance(C2605b.class, iArr);
        for (int i = 0; i < bVarArr.length; i++) {
            for (int i2 = 0; i2 < bVarArr[i].length; i2++) {
                bVarArr[i][i2] = new C2605b();
            }
        }
        int i3 = 0;
        for (C2609f fVar : eVar.mo19629o()) {
            if (fVar != null) {
                for (C2607d dVar : fVar.mo19636d()) {
                    if (dVar != null && (c = dVar.mo19615c()) >= 0 && c < bVarArr.length) {
                        bVarArr[c][i3].mo19603b(dVar.mo19617e());
                    }
                }
            }
            i3++;
        }
        return bVarArr;
    }

    /* renamed from: g */
    private static C3129b m7226g(C2608e eVar) {
        C2605b[][] f = m7225f(eVar);
        m7221b(eVar, f);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[(eVar.mo19626l() * eVar.mo19624j())];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < eVar.mo19626l(); i++) {
            int i2 = 0;
            while (i2 < eVar.mo19624j()) {
                int i3 = i2 + 1;
                int[] a = f[i][i3].mo19602a();
                int j = (eVar.mo19624j() * i) + i2;
                if (a.length == 0) {
                    arrayList.add(Integer.valueOf(j));
                } else if (a.length == 1) {
                    iArr[j] = a[0];
                } else {
                    arrayList3.add(Integer.valueOf(j));
                    arrayList2.add(a);
                }
                i2 = i3;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = (int[]) arrayList2.get(i4);
        }
        return m7227h(eVar.mo19625k(), iArr, C3314a.m9007b(arrayList), C3314a.m9007b(arrayList3), iArr2);
    }

    /* renamed from: h */
    private static C3129b m7227h(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i2 = 100;
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr[iArr3[i4]] = iArr4[i4][iArr5[i4]];
                }
                try {
                    return m7229j(iArr, i, iArr2);
                } catch (ChecksumException unused) {
                    if (length != 0) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                break;
                            } else if (iArr5[i5] < iArr4[i5].length - 1) {
                                iArr5[i5] = iArr5[i5] + 1;
                                break;
                            } else {
                                iArr5[i5] = 0;
                                if (i5 != length - 1) {
                                    i5++;
                                } else {
                                    throw ChecksumException.getChecksumInstance();
                                }
                            }
                        }
                        i2 = i3;
                    } else {
                        throw ChecksumException.getChecksumInstance();
                    }
                }
            } else {
                throw ChecksumException.getChecksumInstance();
            }
        }
    }

    /* renamed from: i */
    public static C3129b m7228i(C2549b bVar, C2564h hVar, C2564h hVar2, C2564h hVar3, C2564h hVar4, int i, int i2) {
        C2609f fVar;
        int i3;
        int i4;
        int i5;
        C2610g gVar = null;
        C2610g gVar2 = null;
        C2608e eVar = null;
        C2606c cVar = new C2606c(bVar, hVar, hVar2, hVar3, hVar4);
        int i6 = 0;
        while (true) {
            if (i6 >= 2) {
                break;
            }
            if (hVar != null) {
                gVar = m7238s(bVar, cVar, hVar, true, i, i2);
            }
            if (hVar3 != null) {
                gVar2 = m7238s(bVar, cVar, hVar3, false, i, i2);
            }
            eVar = m7241v(gVar, gVar2);
            if (eVar == null) {
                throw NotFoundException.getNotFoundInstance();
            } else if (i6 != 0 || eVar.mo19627m() == null || (eVar.mo19627m().mo19610h() >= cVar.mo19610h() && eVar.mo19627m().mo19608f() <= cVar.mo19608f())) {
                eVar.mo19630p(cVar);
            } else {
                cVar = eVar.mo19627m();
                i6++;
            }
        }
        eVar.mo19630p(cVar);
        int j = eVar.mo19624j() + 1;
        eVar.mo19631q(0, gVar);
        eVar.mo19631q(j, gVar2);
        boolean z = gVar != null;
        int i7 = i;
        int i8 = i2;
        for (int i9 = 1; i9 <= j; i9++) {
            int i10 = z ? i9 : j - i9;
            if (eVar.mo19628n(i10) == null) {
                if (i10 == 0 || i10 == j) {
                    fVar = new C2610g(cVar, i10 == 0);
                } else {
                    fVar = new C2609f(cVar);
                }
                eVar.mo19631q(i10, fVar);
                int i11 = -1;
                int h = cVar.mo19610h();
                int i12 = -1;
                while (h <= cVar.mo19608f()) {
                    int t = m7239t(eVar, i10, h, z);
                    if (t >= 0 && t <= cVar.mo19607e()) {
                        i5 = t;
                    } else if (i12 != i11) {
                        i5 = i12;
                    } else {
                        i4 = i12;
                        i3 = h;
                        i12 = i4;
                        h = i3 + 1;
                        i11 = -1;
                    }
                    i4 = i12;
                    int i13 = h;
                    C2607d k = m7230k(bVar, cVar.mo19609g(), cVar.mo19607e(), z, i5, i13, i7, i8);
                    i3 = i13;
                    if (k != null) {
                        fVar.mo19638f(i3, k);
                        i7 = Math.min(i7, k.mo19618f());
                        i8 = Math.max(i8, k.mo19618f());
                        i12 = i5;
                        h = i3 + 1;
                        i11 = -1;
                    }
                    i12 = i4;
                    h = i3 + 1;
                    i11 = -1;
                }
            }
        }
        return m7226g(eVar);
    }

    /* renamed from: j */
    private static C3129b m7229j(int[] iArr, int i, int[] iArr2) {
        if (iArr.length != 0) {
            int i2 = 1 << (i + 1);
            int e = m7224e(iArr, iArr2, i2);
            m7242w(iArr, i2);
            C3129b b = DecodedBitStreamParser.m7150b(iArr, String.valueOf(i));
            b.mo23614k(Integer.valueOf(e));
            b.mo23613j(Integer.valueOf(iArr2.length));
            return b;
        }
        throw FormatException.getFormatInstance();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r7 = com.google.zxing.pdf417.decoder.C2611h.m7218d(r7);
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.zxing.pdf417.decoder.C2607d m7230k(com.google.zxing.common.C2549b r7, int r8, int r9, boolean r10, int r11, int r12, int r13, int r14) {
        /*
            int r11 = m7222c(r7, r8, r9, r10, r11, r12)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            int[] r7 = m7236q(r0, r1, r2, r3, r4, r5)
            r8 = 0
            if (r7 != 0) goto L_0x0012
            return r8
        L_0x0012:
            int r9 = p030e2.C3148a.m8416d(r7)
            if (r10 == 0) goto L_0x001b
            int r10 = r11 + r9
            goto L_0x0039
        L_0x001b:
            r10 = 0
        L_0x001c:
            int r12 = r7.length
            int r12 = r12 / 2
            if (r10 >= r12) goto L_0x0034
            r12 = r7[r10]
            int r0 = r7.length
            int r0 = r0 + -1
            int r0 = r0 - r10
            r0 = r7[r0]
            r7[r10] = r0
            int r0 = r7.length
            int r0 = r0 + -1
            int r0 = r0 - r10
            r7[r0] = r12
            int r10 = r10 + 1
            goto L_0x001c
        L_0x0034:
            int r10 = r11 - r9
            r6 = r11
            r11 = r10
            r10 = r6
        L_0x0039:
            boolean r9 = m7223d(r9, r13, r14)
            if (r9 != 0) goto L_0x0040
            return r8
        L_0x0040:
            int r7 = com.google.zxing.pdf417.decoder.C2611h.m7218d(r7)
            int r9 = p062l2.C3314a.m9006a(r7)
            r12 = -1
            if (r9 != r12) goto L_0x004c
            return r8
        L_0x004c:
            com.google.zxing.pdf417.decoder.d r8 = new com.google.zxing.pdf417.decoder.d
            int r7 = m7233n(r7)
            r8.<init>(r11, r10, r7, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.C2612i.m7230k(com.google.zxing.common.b, int, int, boolean, int, int, int, int):com.google.zxing.pdf417.decoder.d");
    }

    /* renamed from: l */
    private static C2604a m7231l(C2610g gVar, C2610g gVar2) {
        C2604a i;
        C2604a i2;
        if (gVar == null || (i = gVar.mo19641i()) == null) {
            if (gVar2 == null) {
                return null;
            }
            return gVar2.mo19641i();
        } else if (gVar2 == null || (i2 = gVar2.mo19641i()) == null || i.mo19597a() == i2.mo19597a() || i.mo19598b() == i2.mo19598b() || i.mo19599c() == i2.mo19599c()) {
            return i;
        } else {
            return null;
        }
    }

    /* renamed from: m */
    private static int[] m7232m(int i) {
        int[] iArr = new int[8];
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i & 1;
            if (i4 != i2) {
                i3--;
                if (i3 < 0) {
                    return iArr;
                }
                i2 = i4;
            }
            iArr[i3] = iArr[i3] + 1;
            i >>= 1;
        }
    }

    /* renamed from: n */
    private static int m7233n(int i) {
        return m7234o(m7232m(i));
    }

    /* renamed from: o */
    private static int m7234o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    /* renamed from: p */
    private static int m7235p(int[] iArr) {
        int i = -1;
        for (int max : iArr) {
            i = Math.max(i, max);
        }
        return i;
    }

    /* renamed from: q */
    private static int[] m7236q(C2549b bVar, int i, int i2, boolean z, int i3, int i4) {
        int[] iArr = new int[8];
        int i5 = z ? 1 : -1;
        int i6 = 0;
        boolean z2 = z;
        while (true) {
            if (!z) {
                if (i3 < i) {
                    break;
                }
            } else if (i3 >= i2) {
                break;
            }
            if (i6 >= 8) {
                break;
            } else if (bVar.mo19493d(i3, i4) == z2) {
                iArr[i6] = iArr[i6] + 1;
                i3 += i5;
            } else {
                i6++;
                z2 = !z2;
            }
        }
        if (i6 != 8) {
            if (z) {
                i = i2;
            }
            if (!(i3 == i && i6 == 7)) {
                return null;
            }
        }
        return iArr;
    }

    /* renamed from: r */
    private static int m7237r(int i) {
        return 2 << i;
    }

    /* renamed from: s */
    private static C2610g m7238s(C2549b bVar, C2606c cVar, C2564h hVar, boolean z, int i, int i2) {
        boolean z2 = z;
        C2610g gVar = new C2610g(cVar, z2);
        int i3 = 0;
        while (i3 < 2) {
            int i4 = i3 == 0 ? 1 : -1;
            int c = (int) hVar.mo19546c();
            int d = (int) hVar.mo19547d();
            while (d <= cVar.mo19608f() && d >= cVar.mo19610h()) {
                C2607d k = m7230k(bVar, 0, bVar.mo19501j(), z, c, d, i, i2);
                if (k != null) {
                    gVar.mo19638f(d, k);
                    c = z2 ? k.mo19616d() : k.mo19614b();
                }
                d += i4;
            }
            i3++;
        }
        return gVar;
    }

    /* renamed from: t */
    private static int m7239t(C2608e eVar, int i, int i2, boolean z) {
        int i3 = z ? 1 : -1;
        C2607d dVar = null;
        int i4 = i - i3;
        if (m7240u(eVar, i4)) {
            dVar = eVar.mo19628n(i4).mo19634b(i2);
        }
        if (dVar != null) {
            return z ? dVar.mo19614b() : dVar.mo19616d();
        }
        C2607d c = eVar.mo19628n(i).mo19635c(i2);
        if (c != null) {
            return z ? c.mo19616d() : c.mo19614b();
        }
        if (m7240u(eVar, i4)) {
            c = eVar.mo19628n(i4).mo19635c(i2);
        }
        if (c != null) {
            return z ? c.mo19614b() : c.mo19616d();
        }
        int i5 = 0;
        while (true) {
            i -= i3;
            if (m7240u(eVar, i)) {
                for (C2607d dVar2 : eVar.mo19628n(i).mo19636d()) {
                    if (dVar2 != null) {
                        return (z ? dVar2.mo19614b() : dVar2.mo19616d()) + (i3 * i5 * (dVar2.mo19614b() - dVar2.mo19616d()));
                    }
                }
                i5++;
            } else {
                C2606c m = eVar.mo19627m();
                return z ? m.mo19609g() : m.mo19607e();
            }
        }
    }

    /* renamed from: u */
    private static boolean m7240u(C2608e eVar, int i) {
        return i >= 0 && i <= eVar.mo19624j() + 1;
    }

    /* renamed from: v */
    private static C2608e m7241v(C2610g gVar, C2610g gVar2) {
        C2604a l;
        if ((gVar == null && gVar2 == null) || (l = m7231l(gVar, gVar2)) == null) {
            return null;
        }
        return new C2608e(l, C2606c.m7165l(m7220a(gVar), m7220a(gVar2)));
    }

    /* renamed from: w */
    private static void m7242w(int[] iArr, int i) {
        if (iArr.length >= 4) {
            int i2 = iArr[0];
            if (i2 > iArr.length) {
                throw FormatException.getFormatInstance();
            } else if (i2 != 0) {
            } else {
                if (i < iArr.length) {
                    iArr[0] = iArr.length - i;
                    return;
                }
                throw FormatException.getFormatInstance();
            }
        } else {
            throw FormatException.getFormatInstance();
        }
    }
}
