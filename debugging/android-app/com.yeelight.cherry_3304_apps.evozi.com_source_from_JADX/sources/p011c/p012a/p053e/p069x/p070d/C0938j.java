package p011c.p012a.p053e.p069x.p070d;

import java.lang.reflect.Array;
import java.util.ArrayList;
import p011c.p012a.p053e.C0817d;
import p011c.p012a.p053e.C0820g;
import p011c.p012a.p053e.C0823j;
import p011c.p012a.p053e.C0829p;
import p011c.p012a.p053e.p057t.C0840b;
import p011c.p012a.p053e.p057t.C0843e;
import p011c.p012a.p053e.p069x.C0924a;
import p011c.p012a.p053e.p069x.p070d.p071k.C0939a;

/* renamed from: c.a.e.x.d.j */
public final class C0938j {

    /* renamed from: a */
    private static final C0939a f1067a = new C0939a();

    /* renamed from: a */
    private static C0929c m1641a(C0936h hVar) {
        int[] j;
        if (hVar == null || (j = hVar.mo9274j()) == null) {
            return null;
        }
        int p = m1656p(j);
        int i = 0;
        int i2 = 0;
        for (int i3 : j) {
            i2 += p - i3;
            if (i3 > 0) {
                break;
            }
        }
        C0930d[] d = hVar.mo9268d();
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
        return hVar.mo9265a().mo9236a(i2, i, hVar.mo9275k());
    }

    /* renamed from: b */
    private static void m1642b(C0934f fVar, C0928b[][] bVarArr) {
        int[] a = bVarArr[0][1].mo9234a();
        int j = (fVar.mo9256j() * fVar.mo9258l()) - m1658r(fVar.mo9257k());
        if (a.length == 0) {
            if (j <= 0 || j > 928) {
                throw C0823j.m1126a();
            }
            bVarArr[0][1].mo9235b(j);
        } else if (a[0] != j) {
            bVarArr[0][1].mo9235b(j);
        }
    }

    /* renamed from: c */
    private static int m1643c(C0840b bVar, int i, int i2, boolean z, int i3, int i4) {
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
                if (z != bVar.mo9059d(i6, i4)) {
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
    private static boolean m1644d(int i, int i2, int i3) {
        return i2 + -2 <= i && i <= i3 + 2;
    }

    /* renamed from: e */
    private static int m1645e(int[] iArr, int[] iArr2, int i) {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return f1067a.mo9276a(iArr, i, iArr2);
        }
        throw C0817d.m1112a();
    }

    /* renamed from: f */
    private static C0928b[][] m1646f(C0934f fVar) {
        int c;
        int l = fVar.mo9258l();
        int[] iArr = new int[2];
        iArr[1] = fVar.mo9256j() + 2;
        iArr[0] = l;
        C0928b[][] bVarArr = (C0928b[][]) Array.newInstance(C0928b.class, iArr);
        for (int i = 0; i < bVarArr.length; i++) {
            for (int i2 = 0; i2 < bVarArr[i].length; i2++) {
                bVarArr[i][i2] = new C0928b();
            }
        }
        int i3 = 0;
        for (C0935g gVar : fVar.mo9261o()) {
            if (gVar != null) {
                for (C0930d dVar : gVar.mo9268d()) {
                    if (dVar != null && (c = dVar.mo9247c()) >= 0 && c < bVarArr.length) {
                        bVarArr[c][i3].mo9235b(dVar.mo9249e());
                    }
                }
            }
            i3++;
        }
        return bVarArr;
    }

    /* renamed from: g */
    private static C0843e m1647g(C0934f fVar) {
        C0928b[][] f = m1646f(fVar);
        m1642b(fVar, f);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[(fVar.mo9258l() * fVar.mo9256j())];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < fVar.mo9258l(); i++) {
            int i2 = 0;
            while (i2 < fVar.mo9256j()) {
                int i3 = i2 + 1;
                int[] a = f[i][i3].mo9234a();
                int j = (fVar.mo9256j() * i) + i2;
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
        return m1648h(fVar.mo9257k(), iArr, C0924a.m1559b(arrayList), C0924a.m1559b(arrayList3), iArr2);
    }

    /* renamed from: h */
    private static C0843e m1648h(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) {
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
                    return m1650j(iArr, i, iArr2);
                } catch (C0817d unused) {
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
                                    throw C0817d.m1112a();
                                }
                            }
                        }
                        i2 = i3;
                    } else {
                        throw C0817d.m1112a();
                    }
                }
            } else {
                throw C0817d.m1112a();
            }
        }
    }

    /* renamed from: i */
    public static C0843e m1649i(C0840b bVar, C0829p pVar, C0829p pVar2, C0829p pVar3, C0829p pVar4, int i, int i2) {
        C0935g gVar;
        int i3;
        int i4;
        int i5;
        C0936h hVar = null;
        C0936h hVar2 = null;
        C0934f fVar = null;
        C0929c cVar = new C0929c(bVar, pVar, pVar2, pVar3, pVar4);
        int i6 = 0;
        while (true) {
            if (i6 >= 2) {
                break;
            }
            if (pVar != null) {
                hVar = m1659s(bVar, cVar, pVar, true, i, i2);
            }
            if (pVar3 != null) {
                hVar2 = m1659s(bVar, cVar, pVar3, false, i, i2);
            }
            fVar = m1662v(hVar, hVar2);
            if (fVar == null) {
                throw C0823j.m1126a();
            } else if (i6 != 0 || fVar.mo9259m() == null || (fVar.mo9259m().mo9242h() >= cVar.mo9242h() && fVar.mo9259m().mo9240f() <= cVar.mo9240f())) {
                fVar.mo9262p(cVar);
            } else {
                cVar = fVar.mo9259m();
                i6++;
            }
        }
        fVar.mo9262p(cVar);
        int j = fVar.mo9256j() + 1;
        fVar.mo9263q(0, hVar);
        fVar.mo9263q(j, hVar2);
        boolean z = hVar != null;
        int i7 = i;
        int i8 = i2;
        for (int i9 = 1; i9 <= j; i9++) {
            int i10 = z ? i9 : j - i9;
            if (fVar.mo9260n(i10) == null) {
                if (i10 == 0 || i10 == j) {
                    gVar = new C0936h(cVar, i10 == 0);
                } else {
                    gVar = new C0935g(cVar);
                }
                fVar.mo9263q(i10, gVar);
                int i11 = -1;
                int h = cVar.mo9242h();
                int i12 = -1;
                while (h <= cVar.mo9240f()) {
                    int t = m1660t(fVar, i10, h, z);
                    if (t >= 0 && t <= cVar.mo9239e()) {
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
                    C0930d k = m1651k(bVar, cVar.mo9241g(), cVar.mo9239e(), z, i5, i13, i7, i8);
                    i3 = i13;
                    if (k != null) {
                        gVar.mo9270f(i3, k);
                        i7 = Math.min(i7, k.mo9250f());
                        i8 = Math.max(i8, k.mo9250f());
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
        return m1647g(fVar);
    }

    /* renamed from: j */
    private static C0843e m1650j(int[] iArr, int i, int[] iArr2) {
        if (iArr.length != 0) {
            int i2 = 1 << (i + 1);
            int e = m1645e(iArr, iArr2, i2);
            m1663w(iArr, i2);
            C0843e b = C0931e.m1600b(iArr, String.valueOf(i));
            b.mo9089k(Integer.valueOf(e));
            b.mo9088j(Integer.valueOf(iArr2.length));
            return b;
        }
        throw C0820g.m1114a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r7 = p011c.p012a.p053e.p069x.p070d.C0937i.m1639d(r7);
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p011c.p012a.p053e.p069x.p070d.C0930d m1651k(p011c.p012a.p053e.p057t.C0840b r7, int r8, int r9, boolean r10, int r11, int r12, int r13, int r14) {
        /*
            int r11 = m1643c(r7, r8, r9, r10, r11, r12)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            int[] r7 = m1657q(r0, r1, r2, r3, r4, r5)
            r8 = 0
            if (r7 != 0) goto L_0x0012
            return r8
        L_0x0012:
            int r9 = p011c.p012a.p053e.p057t.p058m.C0851a.m1262d(r7)
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
            boolean r9 = m1644d(r9, r13, r14)
            if (r9 != 0) goto L_0x0040
            return r8
        L_0x0040:
            int r7 = p011c.p012a.p053e.p069x.p070d.C0937i.m1639d(r7)
            int r9 = p011c.p012a.p053e.p069x.C0924a.m1558a(r7)
            r12 = -1
            if (r9 != r12) goto L_0x004c
            return r8
        L_0x004c:
            c.a.e.x.d.d r8 = new c.a.e.x.d.d
            int r7 = m1654n(r7)
            r8.<init>(r11, r10, r7, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p053e.p069x.p070d.C0938j.m1651k(c.a.e.t.b, int, int, boolean, int, int, int, int):c.a.e.x.d.d");
    }

    /* renamed from: l */
    private static C0927a m1652l(C0936h hVar, C0936h hVar2) {
        C0927a i;
        C0927a i2;
        if (hVar == null || (i = hVar.mo9273i()) == null) {
            if (hVar2 == null) {
                return null;
            }
            return hVar2.mo9273i();
        } else if (hVar2 == null || (i2 = hVar2.mo9273i()) == null || i.mo9229a() == i2.mo9229a() || i.mo9230b() == i2.mo9230b() || i.mo9231c() == i2.mo9231c()) {
            return i;
        } else {
            return null;
        }
    }

    /* renamed from: m */
    private static int[] m1653m(int i) {
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
    private static int m1654n(int i) {
        return m1655o(m1653m(i));
    }

    /* renamed from: o */
    private static int m1655o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    /* renamed from: p */
    private static int m1656p(int[] iArr) {
        int i = -1;
        for (int max : iArr) {
            i = Math.max(i, max);
        }
        return i;
    }

    /* renamed from: q */
    private static int[] m1657q(C0840b bVar, int i, int i2, boolean z, int i3, int i4) {
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
            } else if (bVar.mo9059d(i3, i4) == z2) {
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
    private static int m1658r(int i) {
        return 2 << i;
    }

    /* renamed from: s */
    private static C0936h m1659s(C0840b bVar, C0929c cVar, C0829p pVar, boolean z, int i, int i2) {
        boolean z2 = z;
        C0936h hVar = new C0936h(cVar, z2);
        int i3 = 0;
        while (i3 < 2) {
            int i4 = i3 == 0 ? 1 : -1;
            int c = (int) pVar.mo9020c();
            int d = (int) pVar.mo9021d();
            while (d <= cVar.mo9240f() && d >= cVar.mo9242h()) {
                C0930d k = m1651k(bVar, 0, bVar.mo9067m(), z, c, d, i, i2);
                if (k != null) {
                    hVar.mo9270f(d, k);
                    c = z2 ? k.mo9248d() : k.mo9246b();
                }
                d += i4;
            }
            i3++;
        }
        return hVar;
    }

    /* renamed from: t */
    private static int m1660t(C0934f fVar, int i, int i2, boolean z) {
        int i3 = z ? 1 : -1;
        C0930d dVar = null;
        int i4 = i - i3;
        if (m1661u(fVar, i4)) {
            dVar = fVar.mo9260n(i4).mo9266b(i2);
        }
        if (dVar != null) {
            return z ? dVar.mo9246b() : dVar.mo9248d();
        }
        C0930d c = fVar.mo9260n(i).mo9267c(i2);
        if (c != null) {
            return z ? c.mo9248d() : c.mo9246b();
        }
        if (m1661u(fVar, i4)) {
            c = fVar.mo9260n(i4).mo9267c(i2);
        }
        if (c != null) {
            return z ? c.mo9246b() : c.mo9248d();
        }
        int i5 = 0;
        while (true) {
            i -= i3;
            if (m1661u(fVar, i)) {
                for (C0930d dVar2 : fVar.mo9260n(i).mo9268d()) {
                    if (dVar2 != null) {
                        return (z ? dVar2.mo9246b() : dVar2.mo9248d()) + (i3 * i5 * (dVar2.mo9246b() - dVar2.mo9248d()));
                    }
                }
                i5++;
            } else {
                C0929c m = fVar.mo9259m();
                return z ? m.mo9241g() : m.mo9239e();
            }
        }
    }

    /* renamed from: u */
    private static boolean m1661u(C0934f fVar, int i) {
        return i >= 0 && i <= fVar.mo9256j() + 1;
    }

    /* renamed from: v */
    private static C0934f m1662v(C0936h hVar, C0936h hVar2) {
        C0927a l;
        if ((hVar == null && hVar2 == null) || (l = m1652l(hVar, hVar2)) == null) {
            return null;
        }
        return new C0934f(l, C0929c.m1579l(m1641a(hVar), m1641a(hVar2)));
    }

    /* renamed from: w */
    private static void m1663w(int[] iArr, int i) {
        if (iArr.length >= 4) {
            int i2 = iArr[0];
            if (i2 > iArr.length) {
                throw C0820g.m1114a();
            } else if (i2 != 0) {
            } else {
                if (i < iArr.length) {
                    iArr[0] = iArr.length - i;
                    return;
                }
                throw C0820g.m1114a();
            }
        } else {
            throw C0820g.m1114a();
        }
    }
}
