package com.google.zxing.datamatrix.detector;

import com.google.zxing.C2564h;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C2549b;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.p194io.IOUtils;
import p026d2.C3131d;
import p026d2.C3133f;
import p030e2.C3148a;
import p030e2.C3149b;

public final class Detector {

    /* renamed from: a */
    private final C2549b f4337a;

    /* renamed from: b */
    private final C3149b f4338b;

    private static final class ResultPointsAndTransitionsComparator implements Serializable, Comparator<C2560b> {
        private ResultPointsAndTransitionsComparator() {
        }

        public int compare(C2560b bVar, C2560b bVar2) {
            return bVar.mo19532c() - bVar2.mo19532c();
        }
    }

    /* renamed from: com.google.zxing.datamatrix.detector.Detector$b */
    private static final class C2560b {

        /* renamed from: a */
        private final C2564h f4339a;

        /* renamed from: b */
        private final C2564h f4340b;

        /* renamed from: c */
        private final int f4341c;

        private C2560b(C2564h hVar, C2564h hVar2, int i) {
            this.f4339a = hVar;
            this.f4340b = hVar2;
            this.f4341c = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2564h mo19530a() {
            return this.f4339a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C2564h mo19531b() {
            return this.f4340b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo19532c() {
            return this.f4341c;
        }

        public String toString() {
            return this.f4339a + MiotCloudImpl.COOKIE_PATH + this.f4340b + IOUtils.DIR_SEPARATOR_UNIX + this.f4341c;
        }
    }

    public Detector(C2549b bVar) {
        this.f4337a = bVar;
        this.f4338b = new C3149b(bVar);
    }

    /* renamed from: a */
    private C2564h m6976a(C2564h hVar, C2564h hVar2, C2564h hVar3, C2564h hVar4, int i) {
        float f = (float) i;
        float d = ((float) m6978d(hVar, hVar2)) / f;
        float d2 = (float) m6978d(hVar3, hVar4);
        C2564h hVar5 = new C2564h(hVar4.mo19546c() + (((hVar4.mo19546c() - hVar3.mo19546c()) / d2) * d), hVar4.mo19547d() + (d * ((hVar4.mo19547d() - hVar3.mo19547d()) / d2)));
        float d3 = ((float) m6978d(hVar, hVar3)) / f;
        float d4 = (float) m6978d(hVar2, hVar4);
        C2564h hVar6 = new C2564h(hVar4.mo19546c() + (((hVar4.mo19546c() - hVar2.mo19546c()) / d4) * d3), hVar4.mo19547d() + (d3 * ((hVar4.mo19547d() - hVar2.mo19547d()) / d4)));
        if (m6980f(hVar5)) {
            return (m6980f(hVar6) && Math.abs(m6982h(hVar3, hVar5).mo19532c() - m6982h(hVar2, hVar5).mo19532c()) > Math.abs(m6982h(hVar3, hVar6).mo19532c() - m6982h(hVar2, hVar6).mo19532c())) ? hVar6 : hVar5;
        }
        if (m6980f(hVar6)) {
            return hVar6;
        }
        return null;
    }

    /* renamed from: b */
    private C2564h m6977b(C2564h hVar, C2564h hVar2, C2564h hVar3, C2564h hVar4, int i, int i2) {
        float d = ((float) m6978d(hVar, hVar2)) / ((float) i);
        float d2 = (float) m6978d(hVar3, hVar4);
        C2564h hVar5 = new C2564h(hVar4.mo19546c() + (((hVar4.mo19546c() - hVar3.mo19546c()) / d2) * d), hVar4.mo19547d() + (d * ((hVar4.mo19547d() - hVar3.mo19547d()) / d2)));
        float d3 = ((float) m6978d(hVar, hVar3)) / ((float) i2);
        float d4 = (float) m6978d(hVar2, hVar4);
        C2564h hVar6 = new C2564h(hVar4.mo19546c() + (((hVar4.mo19546c() - hVar2.mo19546c()) / d4) * d3), hVar4.mo19547d() + (d3 * ((hVar4.mo19547d() - hVar2.mo19547d()) / d4)));
        if (m6980f(hVar5)) {
            return (m6980f(hVar6) && Math.abs(i - m6982h(hVar3, hVar5).mo19532c()) + Math.abs(i2 - m6982h(hVar2, hVar5).mo19532c()) > Math.abs(i - m6982h(hVar3, hVar6).mo19532c()) + Math.abs(i2 - m6982h(hVar2, hVar6).mo19532c())) ? hVar6 : hVar5;
        }
        if (m6980f(hVar6)) {
            return hVar6;
        }
        return null;
    }

    /* renamed from: d */
    private static int m6978d(C2564h hVar, C2564h hVar2) {
        return C3148a.m8415c(C2564h.m7003b(hVar, hVar2));
    }

    /* renamed from: e */
    private static void m6979e(Map<C2564h, Integer> map, C2564h hVar) {
        Integer num = map.get(hVar);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        map.put(hVar, Integer.valueOf(i));
    }

    /* renamed from: f */
    private boolean m6980f(C2564h hVar) {
        return hVar.mo19546c() >= 0.0f && hVar.mo19546c() < ((float) this.f4337a.mo19501j()) && hVar.mo19547d() > 0.0f && hVar.mo19547d() < ((float) this.f4337a.mo19497g());
    }

    /* renamed from: g */
    private static C2549b m6981g(C2549b bVar, C2564h hVar, C2564h hVar2, C2564h hVar3, C2564h hVar4, int i, int i2) {
        float f = ((float) i) - 0.5f;
        float f2 = ((float) i2) - 0.5f;
        return C3133f.m8371b().mo23617c(bVar, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, hVar.mo19546c(), hVar.mo19547d(), hVar4.mo19546c(), hVar4.mo19547d(), hVar3.mo19546c(), hVar3.mo19547d(), hVar2.mo19546c(), hVar2.mo19547d());
    }

    /* renamed from: h */
    private C2560b m6982h(C2564h hVar, C2564h hVar2) {
        int c = (int) hVar.mo19546c();
        int d = (int) hVar.mo19547d();
        int c2 = (int) hVar2.mo19546c();
        int d2 = (int) hVar2.mo19547d();
        int i = 0;
        int i2 = 1;
        boolean z = Math.abs(d2 - d) > Math.abs(c2 - c);
        if (z) {
            int i3 = d;
            d = c;
            c = i3;
            int i4 = d2;
            d2 = c2;
            c2 = i4;
        }
        int abs = Math.abs(c2 - c);
        int abs2 = Math.abs(d2 - d);
        int i5 = (-abs) / 2;
        int i6 = d < d2 ? 1 : -1;
        if (c >= c2) {
            i2 = -1;
        }
        boolean d3 = this.f4337a.mo19493d(z ? d : c, z ? c : d);
        while (c != c2) {
            boolean d4 = this.f4337a.mo19493d(z ? d : c, z ? c : d);
            if (d4 != d3) {
                i++;
                d3 = d4;
            }
            i5 += abs2;
            if (i5 > 0) {
                if (d == d2) {
                    break;
                }
                d += i6;
                i5 -= abs;
            }
            c += i2;
        }
        return new C2560b(hVar, hVar2, i);
    }

    /* renamed from: c */
    public C3131d mo19527c() {
        C2564h hVar;
        C2549b bVar;
        C2564h[] c = this.f4338b.mo23638c();
        C2564h hVar2 = c[0];
        C2564h hVar3 = c[1];
        C2564h hVar4 = c[2];
        C2564h hVar5 = c[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(m6982h(hVar2, hVar3));
        arrayList.add(m6982h(hVar2, hVar4));
        arrayList.add(m6982h(hVar3, hVar5));
        arrayList.add(m6982h(hVar4, hVar5));
        C2564h hVar6 = null;
        Collections.sort(arrayList, new ResultPointsAndTransitionsComparator());
        C2560b bVar2 = (C2560b) arrayList.get(0);
        C2560b bVar3 = (C2560b) arrayList.get(1);
        HashMap hashMap = new HashMap();
        m6979e(hashMap, bVar2.mo19530a());
        m6979e(hashMap, bVar2.mo19531b());
        m6979e(hashMap, bVar3.mo19530a());
        m6979e(hashMap, bVar3.mo19531b());
        C2564h hVar7 = null;
        C2564h hVar8 = null;
        for (Map.Entry entry : hashMap.entrySet()) {
            C2564h hVar9 = (C2564h) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                hVar7 = hVar9;
            } else if (hVar6 == null) {
                hVar6 = hVar9;
            } else {
                hVar8 = hVar9;
            }
        }
        if (hVar6 == null || hVar7 == null || hVar8 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        C2564h[] hVarArr = {hVar6, hVar7, hVar8};
        C2564h.m7004e(hVarArr);
        C2564h hVar10 = hVarArr[0];
        C2564h hVar11 = hVarArr[1];
        C2564h hVar12 = hVarArr[2];
        C2564h hVar13 = !hashMap.containsKey(hVar2) ? hVar2 : !hashMap.containsKey(hVar3) ? hVar3 : !hashMap.containsKey(hVar4) ? hVar4 : hVar5;
        int c2 = m6982h(hVar12, hVar13).mo19532c();
        int c3 = m6982h(hVar10, hVar13).mo19532c();
        if ((c2 & 1) == 1) {
            c2++;
        }
        int i = c2 + 2;
        if ((c3 & 1) == 1) {
            c3++;
        }
        int i2 = c3 + 2;
        if (i * 4 >= i2 * 7 || i2 * 4 >= i * 7) {
            hVar = hVar12;
            C2564h b = m6977b(hVar11, hVar10, hVar12, hVar13, i, i2);
            if (b != null) {
                hVar13 = b;
            }
            int c4 = m6982h(hVar, hVar13).mo19532c();
            int c5 = m6982h(hVar10, hVar13).mo19532c();
            if ((c4 & 1) == 1) {
                c4++;
            }
            int i3 = c4;
            if ((c5 & 1) == 1) {
                c5++;
            }
            bVar = m6981g(this.f4337a, hVar, hVar11, hVar10, hVar13, i3, c5);
        } else {
            C2564h a = m6976a(hVar11, hVar10, hVar12, hVar13, Math.min(i2, i));
            if (a != null) {
                hVar13 = a;
            }
            int max = Math.max(m6982h(hVar12, hVar13).mo19532c(), m6982h(hVar10, hVar13).mo19532c()) + 1;
            if ((max & 1) == 1) {
                max++;
            }
            int i4 = max;
            bVar = m6981g(this.f4337a, hVar12, hVar11, hVar10, hVar13, i4, i4);
            hVar = hVar12;
        }
        return new C3131d(bVar, new C2564h[]{hVar, hVar11, hVar10, hVar13});
    }
}
