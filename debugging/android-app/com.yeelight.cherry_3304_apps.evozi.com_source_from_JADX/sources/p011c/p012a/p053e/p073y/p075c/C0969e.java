package p011c.p012a.p053e.p073y.p075c;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import p011c.p012a.p053e.C0818e;
import p011c.p012a.p053e.C0823j;
import p011c.p012a.p053e.C0829p;
import p011c.p012a.p053e.C0830q;
import p011c.p012a.p053e.p057t.C0840b;

/* renamed from: c.a.e.y.c.e */
public class C0969e {

    /* renamed from: a */
    private final C0840b f1150a;

    /* renamed from: b */
    private final List<C0968d> f1151b = new ArrayList();

    /* renamed from: c */
    private boolean f1152c;

    /* renamed from: d */
    private final int[] f1153d = new int[5];

    /* renamed from: e */
    private final C0830q f1154e;

    /* renamed from: c.a.e.y.c.e$b */
    private static final class C0971b implements Serializable, Comparator<C0968d> {

        /* renamed from: a */
        private final float f1155a;

        private C0971b(float f) {
            this.f1155a = f;
        }

        /* renamed from: a */
        public int compare(C0968d dVar, C0968d dVar2) {
            if (dVar2.mo9341h() != dVar.mo9341h()) {
                return dVar2.mo9341h() - dVar.mo9341h();
            }
            float abs = Math.abs(dVar2.mo9342i() - this.f1155a);
            float abs2 = Math.abs(dVar.mo9342i() - this.f1155a);
            if (abs < abs2) {
                return 1;
            }
            return abs == abs2 ? 0 : -1;
        }
    }

    /* renamed from: c.a.e.y.c.e$c */
    private static final class C0972c implements Serializable, Comparator<C0968d> {

        /* renamed from: a */
        private final float f1156a;

        private C0972c(float f) {
            this.f1156a = f;
        }

        /* renamed from: a */
        public int compare(C0968d dVar, C0968d dVar2) {
            float abs = Math.abs(dVar2.mo9342i() - this.f1156a);
            float abs2 = Math.abs(dVar.mo9342i() - this.f1156a);
            if (abs < abs2) {
                return -1;
            }
            return abs == abs2 ? 0 : 1;
        }
    }

    public C0969e(C0840b bVar, C0830q qVar) {
        this.f1150a = bVar;
        this.f1154e = qVar;
    }

    /* renamed from: a */
    private static float m1779a(int[] iArr, int i) {
        return ((float) ((i - iArr[4]) - iArr[3])) - (((float) iArr[2]) / 2.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b7 A[LOOP:4: B:41:0x00a2->B:49:0x00b7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bf A[ADDED_TO_REGION, EDGE_INSN: B:87:0x00bf->B:50:0x00bf ?: BREAK  
    EDGE_INSN: B:88:0x00bf->B:50:0x00bf ?: BREAK  
    EDGE_INSN: B:89:0x00bf->B:50:0x00bf ?: BREAK  
    EDGE_INSN: B:90:0x00bf->B:50:0x00bf ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00df A[LOOP:5: B:55:0x00ca->B:63:0x00df, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e7 A[EDGE_INSN: B:91:0x00e7->B:64:0x00e7 ?: BREAK  
    EDGE_INSN: B:92:0x00e7->B:64:0x00e7 ?: BREAK  
    EDGE_INSN: B:93:0x00e7->B:64:0x00e7 ?: BREAK  
    EDGE_INSN: B:94:0x00e7->B:64:0x00e7 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x010a A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1780b(int r17, int r18, int r19, int r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int[] r4 = r16.m1785h()
            r5 = 0
            r6 = 0
        L_0x000e:
            r7 = 2
            r8 = 1
            if (r1 < r6) goto L_0x0028
            if (r2 < r6) goto L_0x0028
            c.a.e.t.b r9 = r0.f1150a
            int r10 = r2 - r6
            int r11 = r1 - r6
            boolean r9 = r9.mo9059d(r10, r11)
            if (r9 == 0) goto L_0x0028
            r9 = r4[r7]
            int r9 = r9 + r8
            r4[r7] = r9
            int r6 = r6 + 1
            goto L_0x000e
        L_0x0028:
            if (r1 < r6) goto L_0x010b
            if (r2 >= r6) goto L_0x002e
            goto L_0x010b
        L_0x002e:
            if (r1 < r6) goto L_0x004a
            if (r2 < r6) goto L_0x004a
            c.a.e.t.b r9 = r0.f1150a
            int r10 = r2 - r6
            int r11 = r1 - r6
            boolean r9 = r9.mo9059d(r10, r11)
            if (r9 != 0) goto L_0x004a
            r9 = r4[r8]
            if (r9 > r3) goto L_0x004a
            r9 = r4[r8]
            int r9 = r9 + r8
            r4[r8] = r9
            int r6 = r6 + 1
            goto L_0x002e
        L_0x004a:
            if (r1 < r6) goto L_0x010b
            if (r2 < r6) goto L_0x010b
            r9 = r4[r8]
            if (r9 <= r3) goto L_0x0054
            goto L_0x010b
        L_0x0054:
            if (r1 < r6) goto L_0x0070
            if (r2 < r6) goto L_0x0070
            c.a.e.t.b r9 = r0.f1150a
            int r10 = r2 - r6
            int r11 = r1 - r6
            boolean r9 = r9.mo9059d(r10, r11)
            if (r9 == 0) goto L_0x0070
            r9 = r4[r5]
            if (r9 > r3) goto L_0x0070
            r9 = r4[r5]
            int r9 = r9 + r8
            r4[r5] = r9
            int r6 = r6 + 1
            goto L_0x0054
        L_0x0070:
            r6 = r4[r5]
            if (r6 <= r3) goto L_0x0075
            return r5
        L_0x0075:
            c.a.e.t.b r6 = r0.f1150a
            int r6 = r6.mo9064j()
            c.a.e.t.b r9 = r0.f1150a
            int r9 = r9.mo9067m()
            r10 = 1
        L_0x0082:
            int r11 = r1 + r10
            if (r11 >= r6) goto L_0x009a
            int r12 = r2 + r10
            if (r12 >= r9) goto L_0x009a
            c.a.e.t.b r13 = r0.f1150a
            boolean r12 = r13.mo9059d(r12, r11)
            if (r12 == 0) goto L_0x009a
            r11 = r4[r7]
            int r11 = r11 + r8
            r4[r7] = r11
            int r10 = r10 + 1
            goto L_0x0082
        L_0x009a:
            if (r11 >= r6) goto L_0x010b
            int r11 = r2 + r10
            if (r11 < r9) goto L_0x00a2
            goto L_0x010b
        L_0x00a2:
            int r11 = r1 + r10
            r12 = 3
            if (r11 >= r6) goto L_0x00bf
            int r13 = r2 + r10
            if (r13 >= r9) goto L_0x00bf
            c.a.e.t.b r14 = r0.f1150a
            boolean r13 = r14.mo9059d(r13, r11)
            if (r13 != 0) goto L_0x00bf
            r13 = r4[r12]
            if (r13 >= r3) goto L_0x00bf
            r11 = r4[r12]
            int r11 = r11 + r8
            r4[r12] = r11
            int r10 = r10 + 1
            goto L_0x00a2
        L_0x00bf:
            if (r11 >= r6) goto L_0x010b
            int r11 = r2 + r10
            if (r11 >= r9) goto L_0x010b
            r11 = r4[r12]
            if (r11 < r3) goto L_0x00ca
            goto L_0x010b
        L_0x00ca:
            int r11 = r1 + r10
            r13 = 4
            if (r11 >= r6) goto L_0x00e7
            int r14 = r2 + r10
            if (r14 >= r9) goto L_0x00e7
            c.a.e.t.b r15 = r0.f1150a
            boolean r11 = r15.mo9059d(r14, r11)
            if (r11 == 0) goto L_0x00e7
            r11 = r4[r13]
            if (r11 >= r3) goto L_0x00e7
            r11 = r4[r13]
            int r11 = r11 + r8
            r4[r13] = r11
            int r10 = r10 + 1
            goto L_0x00ca
        L_0x00e7:
            r1 = r4[r13]
            if (r1 < r3) goto L_0x00ec
            return r5
        L_0x00ec:
            r1 = r4[r5]
            r2 = r4[r8]
            int r1 = r1 + r2
            r2 = r4[r7]
            int r1 = r1 + r2
            r2 = r4[r12]
            int r1 = r1 + r2
            r2 = r4[r13]
            int r1 = r1 + r2
            int r1 = r1 - r20
            int r1 = java.lang.Math.abs(r1)
            int r2 = r20 * 2
            if (r1 >= r2) goto L_0x010b
            boolean r1 = m1784g(r4)
            if (r1 == 0) goto L_0x010b
            return r8
        L_0x010b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p053e.p073y.p075c.C0969e.m1780b(int, int, int, int):boolean");
    }

    /* renamed from: c */
    private float m1781c(int i, int i2, int i3, int i4) {
        C0840b bVar = this.f1150a;
        int m = bVar.mo9067m();
        int[] h = m1785h();
        int i5 = i;
        while (i5 >= 0 && bVar.mo9059d(i5, i2)) {
            h[2] = h[2] + 1;
            i5--;
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !bVar.mo9059d(i5, i2) && h[1] <= i3) {
            h[1] = h[1] + 1;
            i5--;
        }
        if (i5 >= 0 && h[1] <= i3) {
            while (i5 >= 0 && bVar.mo9059d(i5, i2) && h[0] <= i3) {
                h[0] = h[0] + 1;
                i5--;
            }
            if (h[0] > i3) {
                return Float.NaN;
            }
            int i6 = i + 1;
            while (i6 < m && bVar.mo9059d(i6, i2)) {
                h[2] = h[2] + 1;
                i6++;
            }
            if (i6 == m) {
                return Float.NaN;
            }
            while (i6 < m && !bVar.mo9059d(i6, i2) && h[3] < i3) {
                h[3] = h[3] + 1;
                i6++;
            }
            if (i6 != m && h[3] < i3) {
                while (i6 < m && bVar.mo9059d(i6, i2) && h[4] < i3) {
                    h[4] = h[4] + 1;
                    i6++;
                }
                if (h[4] < i3 && Math.abs(((((h[0] + h[1]) + h[2]) + h[3]) + h[4]) - i4) * 5 < i4 && m1784g(h)) {
                    return m1779a(h, i6);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: d */
    private float m1782d(int i, int i2, int i3, int i4) {
        C0840b bVar = this.f1150a;
        int j = bVar.mo9064j();
        int[] h = m1785h();
        int i5 = i;
        while (i5 >= 0 && bVar.mo9059d(i2, i5)) {
            h[2] = h[2] + 1;
            i5--;
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !bVar.mo9059d(i2, i5) && h[1] <= i3) {
            h[1] = h[1] + 1;
            i5--;
        }
        if (i5 >= 0 && h[1] <= i3) {
            while (i5 >= 0 && bVar.mo9059d(i2, i5) && h[0] <= i3) {
                h[0] = h[0] + 1;
                i5--;
            }
            if (h[0] > i3) {
                return Float.NaN;
            }
            int i6 = i + 1;
            while (i6 < j && bVar.mo9059d(i2, i6)) {
                h[2] = h[2] + 1;
                i6++;
            }
            if (i6 == j) {
                return Float.NaN;
            }
            while (i6 < j && !bVar.mo9059d(i2, i6) && h[3] < i3) {
                h[3] = h[3] + 1;
                i6++;
            }
            if (i6 != j && h[3] < i3) {
                while (i6 < j && bVar.mo9059d(i2, i6) && h[4] < i3) {
                    h[4] = h[4] + 1;
                    i6++;
                }
                if (h[4] < i3 && Math.abs(((((h[0] + h[1]) + h[2]) + h[3]) + h[4]) - i4) * 5 < i4 * 2 && m1784g(h)) {
                    return m1779a(h, i6);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: f */
    private int m1783f() {
        if (this.f1151b.size() <= 1) {
            return 0;
        }
        C0968d dVar = null;
        for (C0968d next : this.f1151b) {
            if (next.mo9341h() >= 2) {
                if (dVar == null) {
                    dVar = next;
                } else {
                    this.f1152c = true;
                    return ((int) (Math.abs(dVar.mo9020c() - next.mo9020c()) - Math.abs(dVar.mo9021d() - next.mo9021d()))) / 2;
                }
            }
        }
        return 0;
    }

    /* renamed from: g */
    protected static boolean m1784g(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = ((float) i) / 7.0f;
        float f2 = f / 2.0f;
        return Math.abs(f - ((float) iArr[0])) < f2 && Math.abs(f - ((float) iArr[1])) < f2 && Math.abs((f * 3.0f) - ((float) iArr[2])) < 3.0f * f2 && Math.abs(f - ((float) iArr[3])) < f2 && Math.abs(f - ((float) iArr[4])) < f2;
    }

    /* renamed from: h */
    private int[] m1785h() {
        int[] iArr = this.f1153d;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        return iArr;
    }

    /* renamed from: j */
    private boolean m1786j() {
        int size = this.f1151b.size();
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        for (C0968d next : this.f1151b) {
            if (next.mo9341h() >= 2) {
                i++;
                f2 += next.mo9342i();
            }
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / ((float) size);
        for (C0968d i2 : this.f1151b) {
            f += Math.abs(i2.mo9342i() - f3);
        }
        return f <= f2 * 0.05f;
    }

    /* renamed from: k */
    private C0968d[] m1787k() {
        int size = this.f1151b.size();
        if (size >= 3) {
            float f = 0.0f;
            if (size > 3) {
                float f2 = 0.0f;
                float f3 = 0.0f;
                for (C0968d i : this.f1151b) {
                    float i2 = i.mo9342i();
                    f2 += i2;
                    f3 += i2 * i2;
                }
                float f4 = (float) size;
                float f5 = f2 / f4;
                float sqrt = (float) Math.sqrt((double) ((f3 / f4) - (f5 * f5)));
                Collections.sort(this.f1151b, new C0972c(f5));
                float max = Math.max(0.2f * f5, sqrt);
                int i3 = 0;
                while (i3 < this.f1151b.size() && this.f1151b.size() > 3) {
                    if (Math.abs(this.f1151b.get(i3).mo9342i() - f5) > max) {
                        this.f1151b.remove(i3);
                        i3--;
                    }
                    i3++;
                }
            }
            if (this.f1151b.size() > 3) {
                for (C0968d i4 : this.f1151b) {
                    f += i4.mo9342i();
                }
                Collections.sort(this.f1151b, new C0971b(f / ((float) this.f1151b.size())));
                List<C0968d> list = this.f1151b;
                list.subList(3, list.size()).clear();
            }
            return new C0968d[]{this.f1151b.get(0), this.f1151b.get(1), this.f1151b.get(2)};
        }
        throw C0823j.m1126a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C0973f mo9343e(Map<C0818e, ?> map) {
        boolean z = map != null && map.containsKey(C0818e.TRY_HARDER);
        boolean z2 = map != null && map.containsKey(C0818e.PURE_BARCODE);
        int j = this.f1150a.mo9064j();
        int m = this.f1150a.mo9067m();
        int i = (j * 3) / 228;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        int i2 = i - 1;
        boolean z3 = false;
        while (i2 < j && !z3) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            int i3 = 0;
            int i4 = 0;
            while (i3 < m) {
                if (this.f1150a.mo9059d(i3, i2)) {
                    if ((i4 & 1) == 1) {
                        i4++;
                    }
                    iArr[i4] = iArr[i4] + 1;
                } else if ((i4 & 1) != 0) {
                    iArr[i4] = iArr[i4] + 1;
                } else if (i4 == 4) {
                    if (!m1784g(iArr)) {
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[3];
                        iArr[2] = iArr[4];
                        iArr[3] = 1;
                        iArr[4] = 0;
                    } else if (mo9344i(iArr, i2, i3, z2)) {
                        if (this.f1152c) {
                            z3 = m1786j();
                        } else {
                            int f = m1783f();
                            if (f > iArr[2]) {
                                i2 += (f - iArr[2]) - 2;
                                i3 = m - 1;
                            }
                        }
                        iArr[0] = 0;
                        iArr[1] = 0;
                        iArr[2] = 0;
                        iArr[3] = 0;
                        iArr[4] = 0;
                        i = 2;
                        i4 = 0;
                    } else {
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[3];
                        iArr[2] = iArr[4];
                        iArr[3] = 1;
                        iArr[4] = 0;
                    }
                    i4 = 3;
                } else {
                    i4++;
                    iArr[i4] = iArr[i4] + 1;
                }
                i3++;
            }
            if (m1784g(iArr) && mo9344i(iArr, i2, m, z2)) {
                i = iArr[0];
                if (this.f1152c) {
                    z3 = m1786j();
                }
            }
            i2 += i;
        }
        C0968d[] k = m1787k();
        C0829p.m1144e(k);
        return new C0973f(k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo9344i(int[] iArr, int i, int i2, boolean z) {
        boolean z2 = false;
        int i3 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a = (int) m1779a(iArr, i2);
        float d = m1782d(i, a, iArr[2], i3);
        if (!Float.isNaN(d)) {
            int i4 = (int) d;
            float c = m1781c(a, i4, iArr[2], i3);
            if (!Float.isNaN(c) && (!z || m1780b(i4, (int) c, iArr[2], i3))) {
                float f = ((float) i3) / 7.0f;
                int i5 = 0;
                while (true) {
                    if (i5 >= this.f1151b.size()) {
                        break;
                    }
                    C0968d dVar = this.f1151b.get(i5);
                    if (dVar.mo9339f(f, d, c)) {
                        this.f1151b.set(i5, dVar.mo9340g(d, c, f));
                        z2 = true;
                        break;
                    }
                    i5++;
                }
                if (!z2) {
                    C0968d dVar2 = new C0968d(c, d, f);
                    this.f1151b.add(dVar2);
                    C0830q qVar = this.f1154e;
                    if (qVar != null) {
                        qVar.foundPossibleResultPoint(dVar2);
                    }
                }
                return true;
            }
        }
        return false;
    }
}
