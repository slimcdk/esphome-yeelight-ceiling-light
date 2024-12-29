package p050j2;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C2563g;
import com.google.zxing.C2564h;
import com.google.zxing.C2565i;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C2548a;
import com.google.zxing.oned.C2578k;
import com.miot.service.connection.wifi.step.SmartConfigStep;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p030e2.C3148a;

/* renamed from: j2.e */
public final class C3276e extends C3272a {

    /* renamed from: i */
    private static final int[] f5275i = {1, 10, 34, 70, SmartConfigStep.MSG_RESEND_LAP_BIND_DEVICE};

    /* renamed from: j */
    private static final int[] f5276j = {4, 20, 48, 81};

    /* renamed from: k */
    private static final int[] f5277k = {0, 161, 961, 2015, 2715};

    /* renamed from: l */
    private static final int[] f5278l = {0, 336, 1036, 1516};

    /* renamed from: m */
    private static final int[] f5279m = {8, 6, 4, 3, 1};

    /* renamed from: n */
    private static final int[] f5280n = {2, 4, 6, 8};

    /* renamed from: o */
    private static final int[][] f5281o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g */
    private final List<C3275d> f5282g = new ArrayList();

    /* renamed from: h */
    private final List<C3275d> f5283h = new ArrayList();

    /* renamed from: q */
    private static void m8785q(Collection<C3275d> collection, C3275d dVar) {
        if (dVar != null) {
            boolean z = false;
            Iterator<C3275d> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C3275d next = it.next();
                if (next.mo23844b() == dVar.mo23844b()) {
                    next.mo23855e();
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
    private void m8786r(boolean r10, int r11) {
        /*
            r9 = this;
            int[] r0 = r9.mo23841l()
            int r0 = p030e2.C3148a.m8416d(r0)
            int[] r1 = r9.mo23839j()
            int r1 = p030e2.C3148a.m8416d(r1)
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
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r10
        L_0x0060:
            if (r3 == 0) goto L_0x0065
            r4 = r6
        L_0x0063:
            r5 = 1
            goto L_0x0095
        L_0x0065:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r10
        L_0x006a:
            r11 = -1
            if (r8 != r11) goto L_0x0081
            if (r10 == 0) goto L_0x0077
            if (r3 != 0) goto L_0x0072
            goto L_0x0095
        L_0x0072:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r10
        L_0x0077:
            if (r3 == 0) goto L_0x007c
            r4 = r6
            r2 = 1
            goto L_0x0095
        L_0x007c:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.getNotFoundInstance()
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
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r10
        L_0x0092:
            if (r3 != 0) goto L_0x00da
            r4 = r6
        L_0x0095:
            if (r4 == 0) goto L_0x00aa
            if (r7 != 0) goto L_0x00a5
            int[] r10 = r9.mo23841l()
            float[] r11 = r9.mo23842m()
            p050j2.C3272a.m8768n(r10, r11)
            goto L_0x00aa
        L_0x00a5:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r10
        L_0x00aa:
            if (r7 == 0) goto L_0x00b7
            int[] r10 = r9.mo23841l()
            float[] r11 = r9.mo23842m()
            p050j2.C3272a.m8767g(r10, r11)
        L_0x00b7:
            if (r2 == 0) goto L_0x00cc
            if (r5 != 0) goto L_0x00c7
            int[] r10 = r9.mo23839j()
            float[] r11 = r9.mo23842m()
            p050j2.C3272a.m8768n(r10, r11)
            goto L_0x00cc
        L_0x00c7:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r10
        L_0x00cc:
            if (r5 == 0) goto L_0x00d9
            int[] r10 = r9.mo23839j()
            float[] r11 = r9.mo23840k()
            p050j2.C3272a.m8767g(r10, r11)
        L_0x00d9:
            return
        L_0x00da:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r10
        L_0x00df:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.getNotFoundInstance()
            goto L_0x00e5
        L_0x00e4:
            throw r10
        L_0x00e5:
            goto L_0x00e4
        */
        throw new UnsupportedOperationException("Method not decompiled: p050j2.C3276e.m8786r(boolean, int):void");
    }

    /* renamed from: s */
    private static boolean m8787s(C3275d dVar, C3275d dVar2) {
        int a = (dVar.mo23843a() + (dVar2.mo23843a() * 16)) % 79;
        int c = (dVar.mo23854d().mo23850c() * 9) + dVar2.mo23854d().mo23850c();
        if (c > 72) {
            c--;
        }
        if (c > 8) {
            c--;
        }
        return a == c;
    }

    /* renamed from: t */
    private static C2563g m8788t(C3275d dVar, C3275d dVar2) {
        String valueOf = String.valueOf((((long) dVar.mo23844b()) * 4537077) + ((long) dVar2.mo23844b()));
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
        C2564h[] a = dVar.mo23854d().mo23848a();
        C2564h[] a2 = dVar2.mo23854d().mo23848a();
        return new C2563g(String.valueOf(sb.toString()), (byte[]) null, new C2564h[]{a[0], a[1], a2[0], a2[1]}, BarcodeFormat.RSS_14);
    }

    /* renamed from: u */
    private C3273b m8789u(C2548a aVar, C3274c cVar, boolean z) {
        C2548a aVar2 = aVar;
        boolean z2 = z;
        int[] h = mo23837h();
        h[0] = 0;
        h[1] = 0;
        h[2] = 0;
        h[3] = 0;
        h[4] = 0;
        h[5] = 0;
        h[6] = 0;
        h[7] = 0;
        int[] b = cVar.mo23849b();
        if (z2) {
            C2578k.m7050f(aVar2, b[0], h);
        } else {
            C2578k.m7049e(aVar2, b[1] + 1, h);
            int i = 0;
            for (int length = h.length - 1; i < length; length--) {
                int i2 = h[i];
                h[i] = h[length];
                h[length] = i2;
                i++;
            }
        }
        int i3 = z2 ? 16 : 15;
        float d = ((float) C3148a.m8416d(h)) / ((float) i3);
        int[] l = mo23841l();
        int[] j = mo23839j();
        float[] m = mo23842m();
        float[] k = mo23840k();
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
        m8786r(z2, i3);
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
                throw NotFoundException.getNotFoundInstance();
            }
            int i12 = (12 - i8) / 2;
            int i13 = f5279m[i12];
            return new C3273b((C3277f.m8795b(l, i13, false) * f5275i[i12]) + C3277f.m8795b(j, 9 - i13, true) + f5277k[i12], i11);
        } else if ((i10 & 1) != 0 || i10 > 10 || i10 < 4) {
            throw NotFoundException.getNotFoundInstance();
        } else {
            int i14 = (10 - i10) / 2;
            int i15 = f5280n[i14];
            return new C3273b((C3277f.m8795b(j, 9 - i15, false) * f5276j[i14]) + C3277f.m8795b(l, i15, true) + f5278l[i14], i11);
        }
    }

    /* renamed from: v */
    private C3275d m8790v(C2548a aVar, boolean z, int i, Map<DecodeHintType, ?> map) {
        try {
            int[] w = m8791w(aVar, 0, z);
            C3274c x = m8792x(aVar, i, z, w);
            C2565i iVar = map == null ? null : (C2565i) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
            if (iVar != null) {
                float f = ((float) (w[0] + w[1])) / 2.0f;
                if (z) {
                    f = ((float) (aVar.mo19481j() - 1)) - f;
                }
                iVar.foundPossibleResultPoint(new C2564h(f, (float) i));
            }
            C3273b u = m8789u(aVar, x, true);
            C3273b u2 = m8789u(aVar, x, false);
            return new C3275d((u.mo23844b() * 1597) + u2.mo23844b(), u.mo23843a() + (u2.mo23843a() * 4), x);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    /* renamed from: w */
    private int[] m8791w(C2548a aVar, int i, boolean z) {
        int[] i2 = mo23838i();
        i2[0] = 0;
        i2[1] = 0;
        i2[2] = 0;
        i2[3] = 0;
        int j = aVar.mo19481j();
        boolean z2 = false;
        while (i < j) {
            z2 = !aVar.mo19476f(i);
            if (z == z2) {
                break;
            }
            i++;
        }
        int i3 = i;
        int i4 = 0;
        while (i < j) {
            if (aVar.mo19476f(i) ^ z2) {
                i2[i4] = i2[i4] + 1;
            } else {
                if (i4 != 3) {
                    i4++;
                } else if (C3272a.m8769o(i2)) {
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
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: x */
    private C3274c m8792x(C2548a aVar, int i, boolean z, int[] iArr) {
        int i2;
        int i3;
        boolean f = aVar.mo19476f(iArr[0]);
        int i4 = iArr[0] - 1;
        while (i4 >= 0 && (aVar.mo19476f(i4) ^ f)) {
            i4--;
        }
        int i5 = i4 + 1;
        int[] i6 = mo23838i();
        System.arraycopy(i6, 0, i6, 1, i6.length - 1);
        i6[0] = iArr[0] - i5;
        int p = C3272a.m8770p(i6, f5281o);
        int i7 = iArr[1];
        if (z) {
            i2 = (aVar.mo19481j() - 1) - i7;
            i3 = (aVar.mo19481j() - 1) - i5;
        } else {
            i2 = i7;
            i3 = i5;
        }
        return new C3274c(p, new int[]{i5, iArr[1]}, i3, i2, i);
    }

    /* renamed from: b */
    public C2563g mo19556b(int i, C2548a aVar, Map<DecodeHintType, ?> map) {
        m8785q(this.f5282g, m8790v(aVar, false, i, map));
        aVar.mo19484q();
        m8785q(this.f5283h, m8790v(aVar, true, i, map));
        aVar.mo19484q();
        for (C3275d next : this.f5282g) {
            if (next.mo23853c() > 1) {
                for (C3275d next2 : this.f5283h) {
                    if (next2.mo23853c() > 1 && m8787s(next, next2)) {
                        return m8788t(next, next2);
                    }
                }
                continue;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public void reset() {
        this.f5282g.clear();
        this.f5283h.clear();
    }
}
