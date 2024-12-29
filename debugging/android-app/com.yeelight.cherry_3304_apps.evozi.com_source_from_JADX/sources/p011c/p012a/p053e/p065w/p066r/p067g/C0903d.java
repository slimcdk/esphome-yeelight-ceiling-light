package p011c.p012a.p053e.p065w.p066r.p067g;

import com.miot.bluetooth.BluetoothConstants;
import com.miot.service.connection.wifi.step.SmartConfigStep;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p011c.p012a.p053e.C0814a;
import p011c.p012a.p053e.C0818e;
import p011c.p012a.p053e.C0823j;
import p011c.p012a.p053e.C0827n;
import p011c.p012a.p053e.C0829p;
import p011c.p012a.p053e.p057t.C0839a;
import p011c.p012a.p053e.p057t.p058m.C0851a;
import p011c.p012a.p053e.p065w.C0887k;
import p011c.p012a.p053e.p065w.p066r.C0894a;
import p011c.p012a.p053e.p065w.p066r.C0895b;
import p011c.p012a.p053e.p065w.p066r.C0896c;
import p011c.p012a.p053e.p065w.p066r.C0899f;
import p011c.p012a.p053e.p065w.p066r.p067g.p068e.C0913j;

/* renamed from: c.a.e.w.r.g.d */
public final class C0903d extends C0894a {

    /* renamed from: k */
    private static final int[] f987k = {7, 5, 4, 3, 1};

    /* renamed from: l */
    private static final int[] f988l = {4, 20, 52, 104, 204};

    /* renamed from: m */
    private static final int[] f989m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n */
    private static final int[][] f990n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o */
    private static final int[][] f991o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, BluetoothConstants.GATT_ERROR, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, SmartConfigStep.MSG_RECONNECT_DEVICE_AP, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, SmartConfigStep.MSG_UPDATE_CHECKOUT, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, BluetoothConstants.MSG_READ_RSSI, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, SmartConfigStep.MSG_CONNECT_BLE_TIME_OUT, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, SmartConfigStep.MSG_RESEND_LAP_BIND_DEVICE, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, SmartConfigStep.MSG_GET_DEVICE_MODEL}, new int[]{161, 61, 183, SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p */
    private static final int[][] f992p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g */
    private final List<C0901b> f993g = new ArrayList(11);

    /* renamed from: h */
    private final List<C0902c> f994h = new ArrayList();

    /* renamed from: i */
    private final int[] f995i = new int[2];

    /* renamed from: j */
    private boolean f996j;

    /* renamed from: A */
    private static boolean m1477A(Iterable<C0901b> iterable, Iterable<C0902c> iterable2) {
        boolean z;
        boolean z2;
        Iterator<C0902c> it = iterable2.iterator();
        do {
            z = false;
            if (it.hasNext()) {
                C0902c next = it.next();
                Iterator<C0901b> it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = true;
                        continue;
                        break;
                    }
                    C0901b next2 = it2.next();
                    Iterator<C0901b> it3 = next.mo9185a().iterator();
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
    private static boolean m1478B(List<C0901b> list) {
        boolean z;
        for (int[] iArr : f992p) {
            if (list.size() <= iArr.length) {
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        z = true;
                        break;
                    } else if (list.get(i).mo9178b().mo9172c() != iArr[i]) {
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
    private C0896c m1479C(C0839a aVar, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.f995i[0] - 1;
            while (i5 >= 0 && !aVar.mo9042f(i5)) {
                i5--;
            }
            int i6 = i5 + 1;
            int[] iArr = this.f995i;
            i4 = iArr[0] - i6;
            i2 = iArr[1];
            i3 = i6;
        } else {
            int[] iArr2 = this.f995i;
            int i7 = iArr2[0];
            int l = aVar.mo9046l(iArr2[1] + 1);
            i2 = l;
            i3 = i7;
            i4 = l - this.f995i[1];
        }
        int[] i8 = mo9160i();
        System.arraycopy(i8, 0, i8, 1, i8.length - 1);
        i8[0] = i4;
        try {
            return new C0896c(C0894a.m1441p(i8, f990n), new int[]{i3, i2}, i3, i2, i);
        } catch (C0823j unused) {
            return null;
        }
    }

    /* renamed from: D */
    private static void m1480D(List<C0901b> list, List<C0902c> list2) {
        boolean z;
        Iterator<C0902c> it = list2.iterator();
        while (it.hasNext()) {
            C0902c next = it.next();
            if (next.mo9185a().size() != list.size()) {
                Iterator<C0901b> it2 = next.mo9185a().iterator();
                while (true) {
                    z = false;
                    boolean z2 = true;
                    if (!it2.hasNext()) {
                        z = true;
                        break;
                    }
                    C0901b next2 = it2.next();
                    Iterator<C0901b> it3 = list.iterator();
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
    private static void m1481F(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    /* renamed from: G */
    private void m1482G(int i, boolean z) {
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= this.f994h.size()) {
                break;
            }
            C0902c cVar = this.f994h.get(i2);
            if (cVar.mo9186b() > i) {
                z2 = cVar.mo9187c(this.f993g);
                break;
            } else {
                z3 = cVar.mo9187c(this.f993g);
                i2++;
            }
        }
        if (!z2 && !z3 && !m1477A(this.f993g, this.f994h)) {
            this.f994h.add(i2, new C0902c(this.f993g, i, z));
            m1480D(this.f993g, this.f994h);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1483q(int r11) {
        /*
            r10 = this;
            int[] r0 = r10.mo9163l()
            int r0 = p011c.p012a.p053e.p057t.p058m.C0851a.m1262d(r0)
            int[] r1 = r10.mo9161j()
            int r1 = p011c.p012a.p053e.p057t.p058m.C0851a.m1262d(r1)
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
            c.a.e.j r11 = p011c.p012a.p053e.C0823j.m1126a()
            throw r11
        L_0x0048:
            if (r4 == 0) goto L_0x004d
            r5 = r6
        L_0x004b:
            r3 = 1
            goto L_0x007d
        L_0x004d:
            c.a.e.j r11 = p011c.p012a.p053e.C0823j.m1126a()
            throw r11
        L_0x0052:
            r9 = -1
            if (r8 != r9) goto L_0x0069
            if (r11 == 0) goto L_0x005f
            if (r4 != 0) goto L_0x005a
            goto L_0x007d
        L_0x005a:
            c.a.e.j r11 = p011c.p012a.p053e.C0823j.m1126a()
            throw r11
        L_0x005f:
            if (r4 == 0) goto L_0x0064
            r5 = r6
            r2 = 1
            goto L_0x007d
        L_0x0064:
            c.a.e.j r11 = p011c.p012a.p053e.C0823j.m1126a()
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
            c.a.e.j r11 = p011c.p012a.p053e.C0823j.m1126a()
            throw r11
        L_0x007a:
            if (r4 != 0) goto L_0x00c2
            r5 = r6
        L_0x007d:
            if (r5 == 0) goto L_0x0092
            if (r7 != 0) goto L_0x008d
            int[] r11 = r10.mo9163l()
            float[] r0 = r10.mo9164m()
            p011c.p012a.p053e.p065w.p066r.C0894a.m1439n(r11, r0)
            goto L_0x0092
        L_0x008d:
            c.a.e.j r11 = p011c.p012a.p053e.C0823j.m1126a()
            throw r11
        L_0x0092:
            if (r7 == 0) goto L_0x009f
            int[] r11 = r10.mo9163l()
            float[] r0 = r10.mo9164m()
            p011c.p012a.p053e.p065w.p066r.C0894a.m1438g(r11, r0)
        L_0x009f:
            if (r2 == 0) goto L_0x00b4
            if (r3 != 0) goto L_0x00af
            int[] r11 = r10.mo9161j()
            float[] r0 = r10.mo9164m()
            p011c.p012a.p053e.p065w.p066r.C0894a.m1439n(r11, r0)
            goto L_0x00b4
        L_0x00af:
            c.a.e.j r11 = p011c.p012a.p053e.C0823j.m1126a()
            throw r11
        L_0x00b4:
            if (r3 == 0) goto L_0x00c1
            int[] r11 = r10.mo9161j()
            float[] r0 = r10.mo9162k()
            p011c.p012a.p053e.p065w.p066r.C0894a.m1438g(r11, r0)
        L_0x00c1:
            return
        L_0x00c2:
            c.a.e.j r11 = p011c.p012a.p053e.C0823j.m1126a()
            throw r11
        L_0x00c7:
            c.a.e.j r11 = p011c.p012a.p053e.C0823j.m1126a()
            goto L_0x00cd
        L_0x00cc:
            throw r11
        L_0x00cd:
            goto L_0x00cc
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p053e.p065w.p066r.p067g.C0903d.m1483q(int):void");
    }

    /* renamed from: r */
    private boolean m1484r() {
        C0901b bVar = this.f993g.get(0);
        C0895b c = bVar.mo9179c();
        C0895b d = bVar.mo9180d();
        if (d == null) {
            return false;
        }
        int a = d.mo9165a();
        int i = 2;
        for (int i2 = 1; i2 < this.f993g.size(); i2++) {
            C0901b bVar2 = this.f993g.get(i2);
            a += bVar2.mo9179c().mo9165a();
            i++;
            C0895b d2 = bVar2.mo9180d();
            if (d2 != null) {
                a += d2.mo9165a();
                i++;
            }
        }
        return ((i + -4) * 211) + (a % 211) == c.mo9166b();
    }

    /* renamed from: s */
    private List<C0901b> m1485s(List<C0902c> list, int i) {
        while (i < this.f994h.size()) {
            C0902c cVar = this.f994h.get(i);
            this.f993g.clear();
            for (C0902c a : list) {
                this.f993g.addAll(a.mo9185a());
            }
            this.f993g.addAll(cVar.mo9185a());
            if (!m1478B(this.f993g)) {
                i++;
            } else if (m1484r()) {
                return this.f993g;
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                arrayList.add(cVar);
                try {
                    return m1485s(arrayList, i + 1);
                } catch (C0823j unused) {
                }
            }
        }
        throw C0823j.m1126a();
    }

    /* renamed from: t */
    private List<C0901b> m1486t(boolean z) {
        List<C0901b> list = null;
        if (this.f994h.size() > 25) {
            this.f994h.clear();
            return null;
        }
        this.f993g.clear();
        if (z) {
            Collections.reverse(this.f994h);
        }
        try {
            list = m1485s(new ArrayList(), 0);
        } catch (C0823j unused) {
        }
        if (z) {
            Collections.reverse(this.f994h);
        }
        return list;
    }

    /* renamed from: u */
    static C0827n m1487u(List<C0901b> list) {
        String d = C0913j.m1513a(C0900a.m1467a(list)).mo9196d();
        C0829p[] a = list.get(0).mo9178b().mo9170a();
        C0829p[] a2 = list.get(list.size() - 1).mo9178b().mo9170a();
        return new C0827n(d, (byte[]) null, new C0829p[]{a[0], a[1], a2[0], a2[1]}, C0814a.RSS_EXPANDED);
    }

    /* renamed from: x */
    private void m1488x(C0839a aVar, List<C0901b> list, int i) {
        int[] i2 = mo9160i();
        i2[0] = 0;
        i2[1] = 0;
        i2[2] = 0;
        i2[3] = 0;
        int m = aVar.mo9047m();
        if (i < 0) {
            i = list.isEmpty() ? 0 : list.get(list.size() - 1).mo9178b().mo9171b()[1];
        }
        boolean z = list.size() % 2 != 0;
        if (this.f996j) {
            z = !z;
        }
        boolean z2 = false;
        while (i < m) {
            z2 = !aVar.mo9042f(i);
            if (!z2) {
                break;
            }
            i++;
        }
        boolean z3 = z2;
        int i3 = 0;
        int i4 = i;
        while (i < m) {
            if (aVar.mo9042f(i) ^ z3) {
                i2[i3] = i2[i3] + 1;
            } else {
                if (i3 == 3) {
                    if (z) {
                        m1481F(i2);
                    }
                    if (C0894a.m1440o(i2)) {
                        int[] iArr = this.f995i;
                        iArr[0] = i4;
                        iArr[1] = i;
                        return;
                    }
                    if (z) {
                        m1481F(i2);
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
        throw C0823j.m1126a();
    }

    /* renamed from: y */
    private static int m1489y(C0839a aVar, int i) {
        return aVar.mo9042f(i) ? aVar.mo9045k(aVar.mo9046l(i)) : aVar.mo9046l(aVar.mo9045k(i));
    }

    /* renamed from: z */
    private static boolean m1490z(C0896c cVar, boolean z, boolean z2) {
        return cVar.mo9172c() != 0 || !z || !z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public C0901b mo9191E(C0839a aVar, List<C0901b> list, int i) {
        C0896c C;
        C0895b bVar;
        boolean z = list.size() % 2 == 0;
        if (this.f996j) {
            z = !z;
        }
        int i2 = -1;
        boolean z2 = true;
        do {
            m1488x(aVar, list, i2);
            C = m1479C(aVar, i, z);
            if (C == null) {
                i2 = m1489y(aVar, this.f995i[0]);
                continue;
            } else {
                z2 = false;
                continue;
            }
        } while (z2);
        C0895b v = mo9192v(aVar, C, z, true);
        if (list.isEmpty() || !list.get(list.size() - 1).mo9182f()) {
            try {
                bVar = mo9192v(aVar, C, z, false);
            } catch (C0823j unused) {
                bVar = null;
            }
            return new C0901b(v, bVar, C, true);
        }
        throw C0823j.m1126a();
    }

    /* renamed from: b */
    public C0827n mo9149b(int i, C0839a aVar, Map<C0818e, ?> map) {
        this.f993g.clear();
        this.f996j = false;
        try {
            return m1487u(mo9193w(i, aVar));
        } catch (C0823j unused) {
            this.f993g.clear();
            this.f996j = true;
            return m1487u(mo9193w(i, aVar));
        }
    }

    public void reset() {
        this.f993g.clear();
        this.f994h.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public C0895b mo9192v(C0839a aVar, C0896c cVar, boolean z, boolean z2) {
        C0839a aVar2 = aVar;
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
            C0887k.m1401e(aVar2, b[1], h);
            int i = 0;
            for (int length = h.length - 1; i < length; length--) {
                int i2 = h[i];
                h[i] = h[length];
                h[length] = i2;
                i++;
            }
        }
        float d = ((float) C0851a.m1262d(h)) / 17.0f;
        float f = ((float) (cVar.mo9171b()[1] - cVar.mo9171b()[0])) / 15.0f;
        if (Math.abs(d - f) / f <= 0.3f) {
            int[] l = mo9163l();
            int[] j = mo9161j();
            float[] m = mo9164m();
            float[] k = mo9162k();
            for (int i3 = 0; i3 < h.length; i3++) {
                float f2 = (((float) h[i3]) * 1.0f) / d;
                int i4 = (int) (0.5f + f2);
                if (i4 <= 0) {
                    if (f2 >= 0.3f) {
                        i4 = 1;
                    } else {
                        throw C0823j.m1126a();
                    }
                } else if (i4 > 8) {
                    if (f2 <= 8.7f) {
                        i4 = 8;
                    } else {
                        throw C0823j.m1126a();
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
            m1483q(17);
            int c = (((cVar.mo9172c() * 4) + (z ? 0 : 2)) + (z2 ^ true ? 1 : 0)) - 1;
            int i6 = 0;
            int i7 = 0;
            for (int length2 = l.length - 1; length2 >= 0; length2--) {
                if (m1490z(cVar, z, z2)) {
                    i6 += l[length2] * f991o[c][length2 * 2];
                }
                i7 += l[length2];
            }
            int i8 = 0;
            for (int length3 = j.length - 1; length3 >= 0; length3--) {
                if (m1490z(cVar, z, z2)) {
                    i8 += j[length3] * f991o[c][(length3 * 2) + 1];
                }
            }
            int i9 = i6 + i8;
            if ((i7 & 1) != 0 || i7 > 13 || i7 < 4) {
                throw C0823j.m1126a();
            }
            int i10 = (13 - i7) / 2;
            int i11 = f987k[i10];
            return new C0895b((C0899f.m1466b(l, i11, true) * f988l[i10]) + C0899f.m1466b(j, 9 - i11, false) + f989m[i10], i9);
        }
        throw C0823j.m1126a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public List<C0901b> mo9193w(int i, C0839a aVar) {
        while (true) {
            try {
                this.f993g.add(mo9191E(aVar, this.f993g, i));
            } catch (C0823j e) {
                if (this.f993g.isEmpty()) {
                    throw e;
                } else if (m1484r()) {
                    return this.f993g;
                } else {
                    boolean z = !this.f994h.isEmpty();
                    m1482G(i, false);
                    if (z) {
                        List<C0901b> t = m1486t(false);
                        if (t != null) {
                            return t;
                        }
                        List<C0901b> t2 = m1486t(true);
                        if (t2 != null) {
                            return t2;
                        }
                    }
                    throw C0823j.m1126a();
                }
            }
        }
    }
}
