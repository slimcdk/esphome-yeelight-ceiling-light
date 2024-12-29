package p011c.p012a.p053e.p065w.p066r;

import com.miot.service.connection.wifi.step.SmartConfigStep;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p011c.p012a.p053e.C0814a;
import p011c.p012a.p053e.C0818e;
import p011c.p012a.p053e.C0823j;
import p011c.p012a.p053e.C0827n;
import p011c.p012a.p053e.C0829p;
import p011c.p012a.p053e.C0830q;
import p011c.p012a.p053e.p057t.C0839a;
import p011c.p012a.p053e.p057t.p058m.C0851a;
import p011c.p012a.p053e.p065w.C0887k;

/* renamed from: c.a.e.w.r.e */
public final class C0898e extends C0894a {

    /* renamed from: i */
    private static final int[] f972i = {1, 10, 34, 70, SmartConfigStep.MSG_RESEND_LAP_BIND_DEVICE};

    /* renamed from: j */
    private static final int[] f973j = {4, 20, 48, 81};

    /* renamed from: k */
    private static final int[] f974k = {0, 161, 961, 2015, 2715};

    /* renamed from: l */
    private static final int[] f975l = {0, 336, 1036, 1516};

    /* renamed from: m */
    private static final int[] f976m = {8, 6, 4, 3, 1};

    /* renamed from: n */
    private static final int[] f977n = {2, 4, 6, 8};

    /* renamed from: o */
    private static final int[][] f978o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g */
    private final List<C0897d> f979g = new ArrayList();

    /* renamed from: h */
    private final List<C0897d> f980h = new ArrayList();

    /* renamed from: q */
    private static void m1456q(Collection<C0897d> collection, C0897d dVar) {
        if (dVar != null) {
            boolean z = false;
            Iterator<C0897d> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0897d next = it.next();
                if (next.mo9166b() == dVar.mo9166b()) {
                    next.mo9177e();
                    z = true;
                    break;
                }
            }
            if (!z) {
                collection.add(dVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r1 < 4) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        if (r1 < 4) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
        r5 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1457r(boolean r10, int r11) {
        /*
            r9 = this;
            int[] r0 = r9.mo9163l()
            int r0 = p011c.p012a.p053e.p057t.p058m.C0851a.m1262d(r0)
            int[] r1 = r9.mo9161j()
            int r1 = p011c.p012a.p053e.p057t.p058m.C0851a.m1262d(r1)
            r2 = 4
            r3 = 0
            r4 = 1
            if (r10 == 0) goto L_0x0028
            r5 = 12
            if (r0 <= r5) goto L_0x001c
            r6 = 0
            r7 = 1
            goto L_0x0022
        L_0x001c:
            if (r0 >= r2) goto L_0x0020
            r6 = 1
            goto L_0x0021
        L_0x0020:
            r6 = 0
        L_0x0021:
            r7 = 0
        L_0x0022:
            if (r1 <= r5) goto L_0x0025
            goto L_0x003a
        L_0x0025:
            if (r1 >= r2) goto L_0x0041
            goto L_0x003f
        L_0x0028:
            r5 = 11
            if (r0 <= r5) goto L_0x002f
            r6 = 0
            r7 = 1
            goto L_0x0036
        L_0x002f:
            r5 = 5
            if (r0 >= r5) goto L_0x0034
            r6 = 1
            goto L_0x0035
        L_0x0034:
            r6 = 0
        L_0x0035:
            r7 = 0
        L_0x0036:
            r5 = 10
            if (r1 <= r5) goto L_0x003d
        L_0x003a:
            r2 = 0
            r5 = 1
            goto L_0x0043
        L_0x003d:
            if (r1 >= r2) goto L_0x0041
        L_0x003f:
            r2 = 1
            goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            r5 = 0
        L_0x0043:
            int r8 = r0 + r1
            int r8 = r8 - r11
            r11 = r0 & 1
            if (r11 != r10) goto L_0x004c
            r10 = 1
            goto L_0x004d
        L_0x004c:
            r10 = 0
        L_0x004d:
            r11 = r1 & 1
            if (r11 != r4) goto L_0x0052
            r3 = 1
        L_0x0052:
            if (r8 != r4) goto L_0x006a
            if (r10 == 0) goto L_0x0060
            if (r3 != 0) goto L_0x005b
            r4 = r6
        L_0x0059:
            r7 = 1
            goto L_0x0095
        L_0x005b:
            c.a.e.j r10 = p011c.p012a.p053e.C0823j.m1126a()
            throw r10
        L_0x0060:
            if (r3 == 0) goto L_0x0065
            r4 = r6
        L_0x0063:
            r5 = 1
            goto L_0x0095
        L_0x0065:
            c.a.e.j r10 = p011c.p012a.p053e.C0823j.m1126a()
            throw r10
        L_0x006a:
            r11 = -1
            if (r8 != r11) goto L_0x0081
            if (r10 == 0) goto L_0x0077
            if (r3 != 0) goto L_0x0072
            goto L_0x0095
        L_0x0072:
            c.a.e.j r10 = p011c.p012a.p053e.C0823j.m1126a()
            throw r10
        L_0x0077:
            if (r3 == 0) goto L_0x007c
            r4 = r6
            r2 = 1
            goto L_0x0095
        L_0x007c:
            c.a.e.j r10 = p011c.p012a.p053e.C0823j.m1126a()
            throw r10
        L_0x0081:
            if (r8 != 0) goto L_0x00df
            if (r10 == 0) goto L_0x0092
            if (r3 == 0) goto L_0x008d
            if (r0 >= r1) goto L_0x008a
            goto L_0x0063
        L_0x008a:
            r4 = r6
            r2 = 1
            goto L_0x0059
        L_0x008d:
            c.a.e.j r10 = p011c.p012a.p053e.C0823j.m1126a()
            throw r10
        L_0x0092:
            if (r3 != 0) goto L_0x00da
            r4 = r6
        L_0x0095:
            if (r4 == 0) goto L_0x00aa
            if (r7 != 0) goto L_0x00a5
            int[] r10 = r9.mo9163l()
            float[] r11 = r9.mo9164m()
            p011c.p012a.p053e.p065w.p066r.C0894a.m1439n(r10, r11)
            goto L_0x00aa
        L_0x00a5:
            c.a.e.j r10 = p011c.p012a.p053e.C0823j.m1126a()
            throw r10
        L_0x00aa:
            if (r7 == 0) goto L_0x00b7
            int[] r10 = r9.mo9163l()
            float[] r11 = r9.mo9164m()
            p011c.p012a.p053e.p065w.p066r.C0894a.m1438g(r10, r11)
        L_0x00b7:
            if (r2 == 0) goto L_0x00cc
            if (r5 != 0) goto L_0x00c7
            int[] r10 = r9.mo9161j()
            float[] r11 = r9.mo9164m()
            p011c.p012a.p053e.p065w.p066r.C0894a.m1439n(r10, r11)
            goto L_0x00cc
        L_0x00c7:
            c.a.e.j r10 = p011c.p012a.p053e.C0823j.m1126a()
            throw r10
        L_0x00cc:
            if (r5 == 0) goto L_0x00d9
            int[] r10 = r9.mo9161j()
            float[] r11 = r9.mo9162k()
            p011c.p012a.p053e.p065w.p066r.C0894a.m1438g(r10, r11)
        L_0x00d9:
            return
        L_0x00da:
            c.a.e.j r10 = p011c.p012a.p053e.C0823j.m1126a()
            throw r10
        L_0x00df:
            c.a.e.j r10 = p011c.p012a.p053e.C0823j.m1126a()
            goto L_0x00e5
        L_0x00e4:
            throw r10
        L_0x00e5:
            goto L_0x00e4
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p053e.p065w.p066r.C0898e.m1457r(boolean, int):void");
    }

    /* renamed from: s */
    private static boolean m1458s(C0897d dVar, C0897d dVar2) {
        int a = (dVar.mo9165a() + (dVar2.mo9165a() * 16)) % 79;
        int c = (dVar.mo9176d().mo9172c() * 9) + dVar2.mo9176d().mo9172c();
        if (c > 72) {
            c--;
        }
        if (c > 8) {
            c--;
        }
        return a == c;
    }

    /* renamed from: t */
    private static C0827n m1459t(C0897d dVar, C0897d dVar2) {
        String valueOf = String.valueOf((((long) dVar.mo9166b()) * 4537077) + ((long) dVar2.mo9166b()));
        StringBuilder sb = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(valueOf);
        int i = 0;
        for (int i2 = 0; i2 < 13; i2++) {
            int charAt = sb.charAt(i2) - '0';
            if ((i2 & 1) == 0) {
                charAt *= 3;
            }
            i += charAt;
        }
        int i3 = 10 - (i % 10);
        if (i3 == 10) {
            i3 = 0;
        }
        sb.append(i3);
        C0829p[] a = dVar.mo9176d().mo9170a();
        C0829p[] a2 = dVar2.mo9176d().mo9170a();
        return new C0827n(String.valueOf(sb.toString()), (byte[]) null, new C0829p[]{a[0], a[1], a2[0], a2[1]}, C0814a.RSS_14);
    }

    /* renamed from: u */
    private C0895b m1460u(C0839a aVar, C0896c cVar, boolean z) {
        C0839a aVar2 = aVar;
        boolean z2 = z;
        int[] h = mo9159h();
        h[0] = 0;
        h[1] = 0;
        h[2] = 0;
        h[3] = 0;
        h[4] = 0;
        h[5] = 0;
        h[6] = 0;
        h[7] = 0;
        int[] b = cVar.mo9171b();
        if (z2) {
            C0887k.m1402f(aVar2, b[0], h);
        } else {
            C0887k.m1401e(aVar2, b[1] + 1, h);
            int i = 0;
            for (int length = h.length - 1; i < length; length--) {
                int i2 = h[i];
                h[i] = h[length];
                h[length] = i2;
                i++;
            }
        }
        int i3 = z2 ? 16 : 15;
        float d = ((float) C0851a.m1262d(h)) / ((float) i3);
        int[] l = mo9163l();
        int[] j = mo9161j();
        float[] m = mo9164m();
        float[] k = mo9162k();
        for (int i4 = 0; i4 < h.length; i4++) {
            float f = ((float) h[i4]) / d;
            int i5 = (int) (0.5f + f);
            if (i5 <= 0) {
                i5 = 1;
            } else if (i5 > 8) {
                i5 = 8;
            }
            int i6 = i4 / 2;
            if ((i4 & 1) == 0) {
                l[i6] = i5;
                m[i6] = f - ((float) i5);
            } else {
                j[i6] = i5;
                k[i6] = f - ((float) i5);
            }
        }
        m1457r(z2, i3);
        int i7 = 0;
        int i8 = 0;
        for (int length2 = l.length - 1; length2 >= 0; length2--) {
            i7 = (i7 * 9) + l[length2];
            i8 += l[length2];
        }
        int i9 = 0;
        int i10 = 0;
        for (int length3 = j.length - 1; length3 >= 0; length3--) {
            i9 = (i9 * 9) + j[length3];
            i10 += j[length3];
        }
        int i11 = i7 + (i9 * 3);
        if (z2) {
            if ((i8 & 1) != 0 || i8 > 12 || i8 < 4) {
                throw C0823j.m1126a();
            }
            int i12 = (12 - i8) / 2;
            int i13 = f976m[i12];
            return new C0895b((C0899f.m1466b(l, i13, false) * f972i[i12]) + C0899f.m1466b(j, 9 - i13, true) + f974k[i12], i11);
        } else if ((i10 & 1) != 0 || i10 > 10 || i10 < 4) {
            throw C0823j.m1126a();
        } else {
            int i14 = (10 - i10) / 2;
            int i15 = f977n[i14];
            return new C0895b((C0899f.m1466b(j, 9 - i15, false) * f973j[i14]) + C0899f.m1466b(l, i15, true) + f975l[i14], i11);
        }
    }

    /* renamed from: v */
    private C0897d m1461v(C0839a aVar, boolean z, int i, Map<C0818e, ?> map) {
        try {
            int[] w = m1462w(aVar, 0, z);
            C0896c x = m1463x(aVar, i, z, w);
            C0830q qVar = map == null ? null : (C0830q) map.get(C0818e.NEED_RESULT_POINT_CALLBACK);
            if (qVar != null) {
                float f = ((float) (w[0] + w[1])) / 2.0f;
                if (z) {
                    f = ((float) (aVar.mo9047m() - 1)) - f;
                }
                qVar.foundPossibleResultPoint(new C0829p(f, (float) i));
            }
            C0895b u = m1460u(aVar, x, true);
            C0895b u2 = m1460u(aVar, x, false);
            return new C0897d((u.mo9166b() * 1597) + u2.mo9166b(), u.mo9165a() + (u2.mo9165a() * 4), x);
        } catch (C0823j unused) {
            return null;
        }
    }

    /* renamed from: w */
    private int[] m1462w(C0839a aVar, int i, boolean z) {
        int[] i2 = mo9160i();
        i2[0] = 0;
        i2[1] = 0;
        i2[2] = 0;
        i2[3] = 0;
        int m = aVar.mo9047m();
        boolean z2 = false;
        while (i < m) {
            z2 = !aVar.mo9042f(i);
            if (z == z2) {
                break;
            }
            i++;
        }
        int i3 = i;
        int i4 = 0;
        while (i < m) {
            if (aVar.mo9042f(i) ^ z2) {
                i2[i4] = i2[i4] + 1;
            } else {
                if (i4 != 3) {
                    i4++;
                } else if (C0894a.m1440o(i2)) {
                    return new int[]{i3, i};
                } else {
                    i3 += i2[0] + i2[1];
                    i2[0] = i2[2];
                    i2[1] = i2[3];
                    i2[2] = 0;
                    i2[3] = 0;
                    i4--;
                }
                i2[i4] = 1;
                z2 = !z2;
            }
            i++;
        }
        throw C0823j.m1126a();
    }

    /* renamed from: x */
    private C0896c m1463x(C0839a aVar, int i, boolean z, int[] iArr) {
        int i2;
        int i3;
        boolean f = aVar.mo9042f(iArr[0]);
        int i4 = iArr[0] - 1;
        while (i4 >= 0 && (aVar.mo9042f(i4) ^ f)) {
            i4--;
        }
        int i5 = i4 + 1;
        int[] i6 = mo9160i();
        System.arraycopy(i6, 0, i6, 1, i6.length - 1);
        i6[0] = iArr[0] - i5;
        int p = C0894a.m1441p(i6, f978o);
        int i7 = iArr[1];
        if (z) {
            i2 = (aVar.mo9047m() - 1) - i7;
            i3 = (aVar.mo9047m() - 1) - i5;
        } else {
            i2 = i7;
            i3 = i5;
        }
        return new C0896c(p, new int[]{i5, iArr[1]}, i3, i2, i);
    }

    /* renamed from: b */
    public C0827n mo9149b(int i, C0839a aVar, Map<C0818e, ?> map) {
        m1456q(this.f979g, m1461v(aVar, false, i, map));
        aVar.mo9050r();
        m1456q(this.f980h, m1461v(aVar, true, i, map));
        aVar.mo9050r();
        for (C0897d next : this.f979g) {
            if (next.mo9175c() > 1) {
                for (C0897d next2 : this.f980h) {
                    if (next2.mo9175c() > 1 && m1458s(next, next2)) {
                        return m1459t(next, next2);
                    }
                }
                continue;
            }
        }
        throw C0823j.m1126a();
    }

    public void reset() {
        this.f979g.clear();
        this.f980h.clear();
    }
}
