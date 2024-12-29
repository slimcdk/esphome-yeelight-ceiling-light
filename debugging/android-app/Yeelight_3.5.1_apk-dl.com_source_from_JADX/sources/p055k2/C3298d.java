package p055k2;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C2563g;
import com.google.zxing.C2564h;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C2548a;
import com.google.zxing.oned.C2578k;
import com.google.zxing.oned.rss.expanded.decoders.C2594j;
import com.miot.bluetooth.BluetoothConstants;
import com.miot.service.connection.wifi.step.SmartConfigStep;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p030e2.C3148a;
import p050j2.C3272a;
import p050j2.C3273b;
import p050j2.C3274c;
import p050j2.C3277f;

/* renamed from: k2.d */
public final class C3298d extends C3272a {

    /* renamed from: k */
    private static final int[] f5321k = {7, 5, 4, 3, 1};

    /* renamed from: l */
    private static final int[] f5322l = {4, 20, 52, 104, 204};

    /* renamed from: m */
    private static final int[] f5323m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n */
    private static final int[][] f5324n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o */
    private static final int[][] f5325o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, BluetoothConstants.GATT_ERROR, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, BluetoothConstants.MSG_READ_RSSI, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, SmartConfigStep.MSG_CONNECT_BLE_TIME_OUT, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, SmartConfigStep.MSG_RESEND_LAP_BIND_DEVICE, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p */
    private static final int[][] f5326p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g */
    private final List<C3296b> f5327g = new ArrayList(11);

    /* renamed from: h */
    private final List<C3297c> f5328h = new ArrayList();

    /* renamed from: i */
    private final int[] f5329i = new int[2];

    /* renamed from: j */
    private boolean f5330j;

    /* renamed from: A */
    private static boolean m8878A(Iterable<C3296b> iterable, Iterable<C3297c> iterable2) {
        boolean z;
        boolean z2;
        Iterator<C3297c> it = iterable2.iterator();
        do {
            z = false;
            if (it.hasNext()) {
                C3297c next = it.next();
                Iterator<C3296b> it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = true;
                        continue;
                        break;
                    }
                    C3296b next2 = it2.next();
                    Iterator<C3296b> it3 = next.mo23915a().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (next2.equals(it3.next())) {
                                z2 = true;
                                continue;
                                break;
                            }
                        } else {
                            z2 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z2) {
                        continue;
                        break;
                    }
                }
            } else {
                return false;
            }
        } while (!z);
        return true;
    }

    /* renamed from: B */
    private static boolean m8879B(List<C3296b> list) {
        boolean z;
        for (int[] iArr : f5326p) {
            if (list.size() <= iArr.length) {
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        z = true;
                        break;
                    } else if (list.get(i).mo23908b().mo23850c() != iArr[i]) {
                        z = false;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    private C3274c m8880C(C2548a aVar, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.f5329i[0] - 1;
            while (i5 >= 0 && !aVar.mo19476f(i5)) {
                i5--;
            }
            int i6 = i5 + 1;
            int[] iArr = this.f5329i;
            i4 = iArr[0] - i6;
            i2 = iArr[1];
            i3 = i6;
        } else {
            int[] iArr2 = this.f5329i;
            int i7 = iArr2[0];
            int i8 = aVar.mo19480i(iArr2[1] + 1);
            i2 = i8;
            i3 = i7;
            i4 = i8 - this.f5329i[1];
        }
        int[] i9 = mo23838i();
        System.arraycopy(i9, 0, i9, 1, i9.length - 1);
        i9[0] = i4;
        try {
            return new C3274c(C3272a.m8770p(i9, f5324n), new int[]{i3, i2}, i3, i2, i);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    /* renamed from: D */
    private static void m8881D(List<C3296b> list, List<C3297c> list2) {
        boolean z;
        Iterator<C3297c> it = list2.iterator();
        while (it.hasNext()) {
            C3297c next = it.next();
            if (next.mo23915a().size() != list.size()) {
                Iterator<C3296b> it2 = next.mo23915a().iterator();
                while (true) {
                    z = false;
                    boolean z2 = true;
                    if (!it2.hasNext()) {
                        z = true;
                        break;
                    }
                    C3296b next2 = it2.next();
                    Iterator<C3296b> it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (next2.equals(it3.next())) {
                                continue;
                                break;
                            }
                        } else {
                            z2 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z2) {
                        break;
                    }
                }
                if (z) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: F */
    private static void m8882F(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    /* renamed from: G */
    private void m8883G(int i, boolean z) {
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= this.f5328h.size()) {
                break;
            }
            C3297c cVar = this.f5328h.get(i2);
            if (cVar.mo23916b() > i) {
                z2 = cVar.mo23917c(this.f5327g);
                break;
            } else {
                z3 = cVar.mo23917c(this.f5327g);
                i2++;
            }
        }
        if (!z2 && !z3 && !m8878A(this.f5327g, this.f5328h)) {
            this.f5328h.add(i2, new C3297c(this.f5327g, i, z));
            m8881D(this.f5327g, this.f5328h);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8884q(int r11) {
        /*
            r10 = this;
            int[] r0 = r10.mo23841l()
            int r0 = p030e2.C3148a.m8416d(r0)
            int[] r1 = r10.mo23839j()
            int r1 = p030e2.C3148a.m8416d(r1)
            r2 = 4
            r3 = 13
            r4 = 0
            r5 = 1
            if (r0 <= r3) goto L_0x001a
            r6 = 0
            r7 = 1
            goto L_0x0020
        L_0x001a:
            if (r0 >= r2) goto L_0x001e
            r6 = 1
            goto L_0x001f
        L_0x001e:
            r6 = 0
        L_0x001f:
            r7 = 0
        L_0x0020:
            if (r1 <= r3) goto L_0x0025
            r2 = 0
            r3 = 1
            goto L_0x002b
        L_0x0025:
            if (r1 >= r2) goto L_0x0029
            r2 = 1
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            r3 = 0
        L_0x002b:
            int r8 = r0 + r1
            int r8 = r8 - r11
            r11 = r0 & 1
            if (r11 != r5) goto L_0x0034
            r11 = 1
            goto L_0x0035
        L_0x0034:
            r11 = 0
        L_0x0035:
            r9 = r1 & 1
            if (r9 != 0) goto L_0x003a
            r4 = 1
        L_0x003a:
            if (r8 != r5) goto L_0x0052
            if (r11 == 0) goto L_0x0048
            if (r4 != 0) goto L_0x0043
            r5 = r6
        L_0x0041:
            r7 = 1
            goto L_0x007d
        L_0x0043:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r11
        L_0x0048:
            if (r4 == 0) goto L_0x004d
            r5 = r6
        L_0x004b:
            r3 = 1
            goto L_0x007d
        L_0x004d:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r11
        L_0x0052:
            r9 = -1
            if (r8 != r9) goto L_0x0069
            if (r11 == 0) goto L_0x005f
            if (r4 != 0) goto L_0x005a
            goto L_0x007d
        L_0x005a:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r11
        L_0x005f:
            if (r4 == 0) goto L_0x0064
            r5 = r6
            r2 = 1
            goto L_0x007d
        L_0x0064:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r11
        L_0x0069:
            if (r8 != 0) goto L_0x00c7
            if (r11 == 0) goto L_0x007a
            if (r4 == 0) goto L_0x0075
            if (r0 >= r1) goto L_0x0072
            goto L_0x004b
        L_0x0072:
            r5 = r6
            r2 = 1
            goto L_0x0041
        L_0x0075:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r11
        L_0x007a:
            if (r4 != 0) goto L_0x00c2
            r5 = r6
        L_0x007d:
            if (r5 == 0) goto L_0x0092
            if (r7 != 0) goto L_0x008d
            int[] r11 = r10.mo23841l()
            float[] r0 = r10.mo23842m()
            p050j2.C3272a.m8768n(r11, r0)
            goto L_0x0092
        L_0x008d:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r11
        L_0x0092:
            if (r7 == 0) goto L_0x009f
            int[] r11 = r10.mo23841l()
            float[] r0 = r10.mo23842m()
            p050j2.C3272a.m8767g(r11, r0)
        L_0x009f:
            if (r2 == 0) goto L_0x00b4
            if (r3 != 0) goto L_0x00af
            int[] r11 = r10.mo23839j()
            float[] r0 = r10.mo23842m()
            p050j2.C3272a.m8768n(r11, r0)
            goto L_0x00b4
        L_0x00af:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r11
        L_0x00b4:
            if (r3 == 0) goto L_0x00c1
            int[] r11 = r10.mo23839j()
            float[] r0 = r10.mo23840k()
            p050j2.C3272a.m8767g(r11, r0)
        L_0x00c1:
            return
        L_0x00c2:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r11
        L_0x00c7:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.getNotFoundInstance()
            goto L_0x00cd
        L_0x00cc:
            throw r11
        L_0x00cd:
            goto L_0x00cc
        */
        throw new UnsupportedOperationException("Method not decompiled: p055k2.C3298d.m8884q(int):void");
    }

    /* renamed from: r */
    private boolean m8885r() {
        C3296b bVar = this.f5327g.get(0);
        C3273b c = bVar.mo23909c();
        C3273b d = bVar.mo23910d();
        if (d == null) {
            return false;
        }
        int a = d.mo23843a();
        int i = 2;
        for (int i2 = 1; i2 < this.f5327g.size(); i2++) {
            C3296b bVar2 = this.f5327g.get(i2);
            a += bVar2.mo23909c().mo23843a();
            i++;
            C3273b d2 = bVar2.mo23910d();
            if (d2 != null) {
                a += d2.mo23843a();
                i++;
            }
        }
        return ((i + -4) * 211) + (a % 211) == c.mo23844b();
    }

    /* renamed from: s */
    private List<C3296b> m8886s(List<C3297c> list, int i) {
        while (i < this.f5328h.size()) {
            C3297c cVar = this.f5328h.get(i);
            this.f5327g.clear();
            for (C3297c a : list) {
                this.f5327g.addAll(a.mo23915a());
            }
            this.f5327g.addAll(cVar.mo23915a());
            if (!m8879B(this.f5327g)) {
                i++;
            } else if (m8885r()) {
                return this.f5327g;
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                arrayList.add(cVar);
                try {
                    return m8886s(arrayList, i + 1);
                } catch (NotFoundException unused) {
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: t */
    private List<C3296b> m8887t(boolean z) {
        List<C3296b> list = null;
        if (this.f5328h.size() > 25) {
            this.f5328h.clear();
            return null;
        }
        this.f5327g.clear();
        if (z) {
            Collections.reverse(this.f5328h);
        }
        try {
            list = m8886s(new ArrayList(), 0);
        } catch (NotFoundException unused) {
        }
        if (z) {
            Collections.reverse(this.f5328h);
        }
        return list;
    }

    /* renamed from: u */
    static C2563g m8888u(List<C3296b> list) {
        String d = C2594j.m7112a(C3295a.m8868a(list)).mo19576d();
        C2564h[] a = list.get(0).mo23908b().mo23848a();
        C2564h[] a2 = list.get(list.size() - 1).mo23908b().mo23848a();
        return new C2563g(d, (byte[]) null, new C2564h[]{a[0], a[1], a2[0], a2[1]}, BarcodeFormat.RSS_EXPANDED);
    }

    /* renamed from: x */
    private void m8889x(C2548a aVar, List<C3296b> list, int i) {
        int[] i2 = mo23838i();
        i2[0] = 0;
        i2[1] = 0;
        i2[2] = 0;
        i2[3] = 0;
        int j = aVar.mo19481j();
        if (i < 0) {
            i = list.isEmpty() ? 0 : list.get(list.size() - 1).mo23908b().mo23849b()[1];
        }
        boolean z = list.size() % 2 != 0;
        if (this.f5330j) {
            z = !z;
        }
        boolean z2 = false;
        while (i < j) {
            z2 = !aVar.mo19476f(i);
            if (!z2) {
                break;
            }
            i++;
        }
        boolean z3 = z2;
        int i3 = 0;
        int i4 = i;
        while (i < j) {
            if (aVar.mo19476f(i) ^ z3) {
                i2[i3] = i2[i3] + 1;
            } else {
                if (i3 == 3) {
                    if (z) {
                        m8882F(i2);
                    }
                    if (C3272a.m8769o(i2)) {
                        int[] iArr = this.f5329i;
                        iArr[0] = i4;
                        iArr[1] = i;
                        return;
                    }
                    if (z) {
                        m8882F(i2);
                    }
                    i4 += i2[0] + i2[1];
                    i2[0] = i2[2];
                    i2[1] = i2[3];
                    i2[2] = 0;
                    i2[3] = 0;
                    i3--;
                } else {
                    i3++;
                }
                i2[i3] = 1;
                z3 = !z3;
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: y */
    private static int m8890y(C2548a aVar, int i) {
        return aVar.mo19476f(i) ? aVar.mo19478h(aVar.mo19480i(i)) : aVar.mo19480i(aVar.mo19478h(i));
    }

    /* renamed from: z */
    private static boolean m8891z(C3274c cVar, boolean z, boolean z2) {
        return cVar.mo23850c() != 0 || !z || !z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public C3296b mo23921E(C2548a aVar, List<C3296b> list, int i) {
        C3274c C;
        C3273b bVar;
        boolean z = list.size() % 2 == 0;
        if (this.f5330j) {
            z = !z;
        }
        int i2 = -1;
        boolean z2 = true;
        do {
            m8889x(aVar, list, i2);
            C = m8880C(aVar, i, z);
            if (C == null) {
                i2 = m8890y(aVar, this.f5329i[0]);
                continue;
            } else {
                z2 = false;
                continue;
            }
        } while (z2);
        C3273b v = mo23922v(aVar, C, z, true);
        if (list.isEmpty() || !list.get(list.size() - 1).mo23912f()) {
            try {
                bVar = mo23922v(aVar, C, z, false);
            } catch (NotFoundException unused) {
                bVar = null;
            }
            return new C3296b(v, bVar, C, true);
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: b */
    public C2563g mo19556b(int i, C2548a aVar, Map<DecodeHintType, ?> map) {
        this.f5327g.clear();
        this.f5330j = false;
        try {
            return m8888u(mo23923w(i, aVar));
        } catch (NotFoundException unused) {
            this.f5327g.clear();
            this.f5330j = true;
            return m8888u(mo23923w(i, aVar));
        }
    }

    public void reset() {
        this.f5327g.clear();
        this.f5328h.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public C3273b mo23922v(C2548a aVar, C3274c cVar, boolean z, boolean z2) {
        C2548a aVar2 = aVar;
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
            C2578k.m7049e(aVar2, b[1], h);
            int i = 0;
            for (int length = h.length - 1; i < length; length--) {
                int i2 = h[i];
                h[i] = h[length];
                h[length] = i2;
                i++;
            }
        }
        float d = ((float) C3148a.m8416d(h)) / 17.0f;
        float f = ((float) (cVar.mo23849b()[1] - cVar.mo23849b()[0])) / 15.0f;
        if (Math.abs(d - f) / f <= 0.3f) {
            int[] l = mo23841l();
            int[] j = mo23839j();
            float[] m = mo23842m();
            float[] k = mo23840k();
            for (int i3 = 0; i3 < h.length; i3++) {
                float f2 = (((float) h[i3]) * 1.0f) / d;
                int i4 = (int) (0.5f + f2);
                if (i4 <= 0) {
                    if (f2 >= 0.3f) {
                        i4 = 1;
                    } else {
                        throw NotFoundException.getNotFoundInstance();
                    }
                } else if (i4 > 8) {
                    if (f2 <= 8.7f) {
                        i4 = 8;
                    } else {
                        throw NotFoundException.getNotFoundInstance();
                    }
                }
                int i5 = i3 / 2;
                if ((i3 & 1) == 0) {
                    l[i5] = i4;
                    m[i5] = f2 - ((float) i4);
                } else {
                    j[i5] = i4;
                    k[i5] = f2 - ((float) i4);
                }
            }
            m8884q(17);
            int c = (((cVar.mo23850c() * 4) + (z ? 0 : 2)) + (z2 ^ true ? 1 : 0)) - 1;
            int i6 = 0;
            int i7 = 0;
            for (int length2 = l.length - 1; length2 >= 0; length2--) {
                if (m8891z(cVar, z, z2)) {
                    i6 += l[length2] * f5325o[c][length2 * 2];
                }
                i7 += l[length2];
            }
            int i8 = 0;
            for (int length3 = j.length - 1; length3 >= 0; length3--) {
                if (m8891z(cVar, z, z2)) {
                    i8 += j[length3] * f5325o[c][(length3 * 2) + 1];
                }
            }
            int i9 = i6 + i8;
            if ((i7 & 1) != 0 || i7 > 13 || i7 < 4) {
                throw NotFoundException.getNotFoundInstance();
            }
            int i10 = (13 - i7) / 2;
            int i11 = f5321k[i10];
            return new C3273b((C3277f.m8795b(l, i11, true) * f5322l[i10]) + C3277f.m8795b(j, 9 - i11, false) + f5323m[i10], i9);
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public List<C3296b> mo23923w(int i, C2548a aVar) {
        while (true) {
            try {
                this.f5327g.add(mo23921E(aVar, this.f5327g, i));
            } catch (NotFoundException e) {
                if (this.f5327g.isEmpty()) {
                    throw e;
                } else if (m8885r()) {
                    return this.f5327g;
                } else {
                    boolean z = !this.f5328h.isEmpty();
                    m8883G(i, false);
                    if (z) {
                        List<C3296b> t = m8887t(false);
                        if (t != null) {
                            return t;
                        }
                        List<C3296b> t2 = m8887t(true);
                        if (t2 != null) {
                            return t2;
                        }
                    }
                    throw NotFoundException.getNotFoundInstance();
                }
            }
        }
    }
}
