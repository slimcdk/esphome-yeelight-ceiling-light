package p011c.p012a.p053e.p060u.p062c;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.p271io.IOUtils;
import p011c.p012a.p053e.C0823j;
import p011c.p012a.p053e.C0829p;
import p011c.p012a.p053e.p057t.C0840b;
import p011c.p012a.p053e.p057t.C0845g;
import p011c.p012a.p053e.p057t.C0847i;
import p011c.p012a.p053e.p057t.p058m.C0851a;
import p011c.p012a.p053e.p057t.p058m.C0852b;

/* renamed from: c.a.e.u.c.a */
public final class C0869a {

    /* renamed from: a */
    private final C0840b f899a;

    /* renamed from: b */
    private final C0852b f900b;

    /* renamed from: c.a.e.u.c.a$b */
    private static final class C0871b {

        /* renamed from: a */
        private final C0829p f901a;

        /* renamed from: b */
        private final C0829p f902b;

        /* renamed from: c */
        private final int f903c;

        private C0871b(C0829p pVar, C0829p pVar2, int i) {
            this.f901a = pVar;
            this.f902b = pVar2;
            this.f903c = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0829p mo9141a() {
            return this.f901a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0829p mo9142b() {
            return this.f902b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo9143c() {
            return this.f903c;
        }

        public String toString() {
            return this.f901a + MiotCloudImpl.COOKIE_PATH + this.f902b + IOUtils.DIR_SEPARATOR_UNIX + this.f903c;
        }
    }

    /* renamed from: c.a.e.u.c.a$c */
    private static final class C0872c implements Serializable, Comparator<C0871b> {
        private C0872c() {
        }

        /* renamed from: a */
        public int compare(C0871b bVar, C0871b bVar2) {
            return bVar.mo9143c() - bVar2.mo9143c();
        }
    }

    public C0869a(C0840b bVar) {
        this.f899a = bVar;
        this.f900b = new C0852b(bVar);
    }

    /* renamed from: a */
    private C0829p m1333a(C0829p pVar, C0829p pVar2, C0829p pVar3, C0829p pVar4, int i) {
        float f = (float) i;
        float d = ((float) m1335d(pVar, pVar2)) / f;
        float d2 = (float) m1335d(pVar3, pVar4);
        C0829p pVar5 = new C0829p(pVar4.mo9020c() + (((pVar4.mo9020c() - pVar3.mo9020c()) / d2) * d), pVar4.mo9021d() + (d * ((pVar4.mo9021d() - pVar3.mo9021d()) / d2)));
        float d3 = ((float) m1335d(pVar, pVar3)) / f;
        float d4 = (float) m1335d(pVar2, pVar4);
        C0829p pVar6 = new C0829p(pVar4.mo9020c() + (((pVar4.mo9020c() - pVar2.mo9020c()) / d4) * d3), pVar4.mo9021d() + (d3 * ((pVar4.mo9021d() - pVar2.mo9021d()) / d4)));
        if (m1337f(pVar5)) {
            return (m1337f(pVar6) && Math.abs(m1339h(pVar3, pVar5).mo9143c() - m1339h(pVar2, pVar5).mo9143c()) > Math.abs(m1339h(pVar3, pVar6).mo9143c() - m1339h(pVar2, pVar6).mo9143c())) ? pVar6 : pVar5;
        }
        if (m1337f(pVar6)) {
            return pVar6;
        }
        return null;
    }

    /* renamed from: b */
    private C0829p m1334b(C0829p pVar, C0829p pVar2, C0829p pVar3, C0829p pVar4, int i, int i2) {
        float d = ((float) m1335d(pVar, pVar2)) / ((float) i);
        float d2 = (float) m1335d(pVar3, pVar4);
        C0829p pVar5 = new C0829p(pVar4.mo9020c() + (((pVar4.mo9020c() - pVar3.mo9020c()) / d2) * d), pVar4.mo9021d() + (d * ((pVar4.mo9021d() - pVar3.mo9021d()) / d2)));
        float d3 = ((float) m1335d(pVar, pVar3)) / ((float) i2);
        float d4 = (float) m1335d(pVar2, pVar4);
        C0829p pVar6 = new C0829p(pVar4.mo9020c() + (((pVar4.mo9020c() - pVar2.mo9020c()) / d4) * d3), pVar4.mo9021d() + (d3 * ((pVar4.mo9021d() - pVar2.mo9021d()) / d4)));
        if (m1337f(pVar5)) {
            return (m1337f(pVar6) && Math.abs(i - m1339h(pVar3, pVar5).mo9143c()) + Math.abs(i2 - m1339h(pVar2, pVar5).mo9143c()) > Math.abs(i - m1339h(pVar3, pVar6).mo9143c()) + Math.abs(i2 - m1339h(pVar2, pVar6).mo9143c())) ? pVar6 : pVar5;
        }
        if (m1337f(pVar6)) {
            return pVar6;
        }
        return null;
    }

    /* renamed from: d */
    private static int m1335d(C0829p pVar, C0829p pVar2) {
        return C0851a.m1261c(C0829p.m1143b(pVar, pVar2));
    }

    /* renamed from: e */
    private static void m1336e(Map<C0829p, Integer> map, C0829p pVar) {
        Integer num = map.get(pVar);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        map.put(pVar, Integer.valueOf(i));
    }

    /* renamed from: f */
    private boolean m1337f(C0829p pVar) {
        return pVar.mo9020c() >= 0.0f && pVar.mo9020c() < ((float) this.f899a.mo9067m()) && pVar.mo9021d() > 0.0f && pVar.mo9021d() < ((float) this.f899a.mo9064j());
    }

    /* renamed from: g */
    private static C0840b m1338g(C0840b bVar, C0829p pVar, C0829p pVar2, C0829p pVar3, C0829p pVar4, int i, int i2) {
        float f = ((float) i) - 0.5f;
        float f2 = ((float) i2) - 0.5f;
        return C0847i.m1244b().mo9092c(bVar, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, pVar.mo9020c(), pVar.mo9021d(), pVar4.mo9020c(), pVar4.mo9021d(), pVar3.mo9020c(), pVar3.mo9021d(), pVar2.mo9020c(), pVar2.mo9021d());
    }

    /* renamed from: h */
    private C0871b m1339h(C0829p pVar, C0829p pVar2) {
        int c = (int) pVar.mo9020c();
        int d = (int) pVar.mo9021d();
        int c2 = (int) pVar2.mo9020c();
        int d2 = (int) pVar2.mo9021d();
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
        boolean d3 = this.f899a.mo9059d(z ? d : c, z ? c : d);
        while (c != c2) {
            boolean d4 = this.f899a.mo9059d(z ? d : c, z ? c : d);
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
        return new C0871b(pVar, pVar2, i);
    }

    /* renamed from: c */
    public C0845g mo9140c() {
        C0829p pVar;
        C0840b bVar;
        C0829p[] c = this.f900b.mo9099c();
        C0829p pVar2 = c[0];
        C0829p pVar3 = c[1];
        C0829p pVar4 = c[2];
        C0829p pVar5 = c[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(m1339h(pVar2, pVar3));
        arrayList.add(m1339h(pVar2, pVar4));
        arrayList.add(m1339h(pVar3, pVar5));
        arrayList.add(m1339h(pVar4, pVar5));
        C0829p pVar6 = null;
        Collections.sort(arrayList, new C0872c());
        C0871b bVar2 = (C0871b) arrayList.get(0);
        C0871b bVar3 = (C0871b) arrayList.get(1);
        HashMap hashMap = new HashMap();
        m1336e(hashMap, bVar2.mo9141a());
        m1336e(hashMap, bVar2.mo9142b());
        m1336e(hashMap, bVar3.mo9141a());
        m1336e(hashMap, bVar3.mo9142b());
        C0829p pVar7 = null;
        C0829p pVar8 = null;
        for (Map.Entry entry : hashMap.entrySet()) {
            C0829p pVar9 = (C0829p) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                pVar7 = pVar9;
            } else if (pVar6 == null) {
                pVar6 = pVar9;
            } else {
                pVar8 = pVar9;
            }
        }
        if (pVar6 == null || pVar7 == null || pVar8 == null) {
            throw C0823j.m1126a();
        }
        C0829p[] pVarArr = {pVar6, pVar7, pVar8};
        C0829p.m1144e(pVarArr);
        C0829p pVar10 = pVarArr[0];
        C0829p pVar11 = pVarArr[1];
        C0829p pVar12 = pVarArr[2];
        C0829p pVar13 = !hashMap.containsKey(pVar2) ? pVar2 : !hashMap.containsKey(pVar3) ? pVar3 : !hashMap.containsKey(pVar4) ? pVar4 : pVar5;
        int c2 = m1339h(pVar12, pVar13).mo9143c();
        int c3 = m1339h(pVar10, pVar13).mo9143c();
        if ((c2 & 1) == 1) {
            c2++;
        }
        int i = c2 + 2;
        if ((c3 & 1) == 1) {
            c3++;
        }
        int i2 = c3 + 2;
        if (i * 4 >= i2 * 7 || i2 * 4 >= i * 7) {
            pVar = pVar12;
            C0829p b = m1334b(pVar11, pVar10, pVar12, pVar13, i, i2);
            if (b != null) {
                pVar13 = b;
            }
            int c4 = m1339h(pVar, pVar13).mo9143c();
            int c5 = m1339h(pVar10, pVar13).mo9143c();
            if ((c4 & 1) == 1) {
                c4++;
            }
            int i3 = c4;
            if ((c5 & 1) == 1) {
                c5++;
            }
            bVar = m1338g(this.f899a, pVar, pVar11, pVar10, pVar13, i3, c5);
        } else {
            C0829p a = m1333a(pVar11, pVar10, pVar12, pVar13, Math.min(i2, i));
            if (a != null) {
                pVar13 = a;
            }
            int max = Math.max(m1339h(pVar12, pVar13).mo9143c(), m1339h(pVar10, pVar13).mo9143c()) + 1;
            if ((max & 1) == 1) {
                max++;
            }
            int i4 = max;
            bVar = m1338g(this.f899a, pVar12, pVar11, pVar10, pVar13, i4, i4);
            pVar = pVar12;
        }
        return new C0845g(bVar, new C0829p[]{pVar, pVar11, pVar10, pVar13});
    }
}
