package p011c.p083d.p084a.p085d0.p087n;

import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p011c.p083d.p084a.C0988a0;
import p011c.p083d.p084a.C1130q;
import p011c.p083d.p084a.C1143w;
import p011c.p083d.p084a.C1144x;
import p011c.p083d.p084a.C1150z;
import p011c.p083d.p084a.p085d0.C1024k;
import p011c.p083d.p084a.p085d0.p086m.C1027a;
import p011c.p083d.p084a.p085d0.p086m.C1031d;
import p011c.p083d.p084a.p085d0.p086m.C1043e;
import p011c.p083d.p084a.p085d0.p086m.C1048f;
import p163g.C10843m;
import p163g.C4411f;
import p163g.C4415s;

/* renamed from: c.d.a.d0.n.d */
public final class C1078d implements C1105s {

    /* renamed from: d */
    private static final List<C4411f> f1543d = C1024k.m2098i(C4411f.m12868h("connection"), C4411f.m12868h("host"), C4411f.m12868h("keep-alive"), C4411f.m12868h("proxy-connection"), C4411f.m12868h("transfer-encoding"));

    /* renamed from: e */
    private static final List<C4411f> f1544e = C1024k.m2098i(C4411f.m12868h("connection"), C4411f.m12868h("host"), C4411f.m12868h("keep-alive"), C4411f.m12868h("proxy-connection"), C4411f.m12868h("te"), C4411f.m12868h("transfer-encoding"), C4411f.m12868h("encoding"), C4411f.m12868h("upgrade"));

    /* renamed from: a */
    private final C1090h f1545a;

    /* renamed from: b */
    private final C1031d f1546b;

    /* renamed from: c */
    private C1043e f1547c;

    public C1078d(C1090h hVar, C1031d dVar) {
        this.f1545a = hVar;
        this.f1546b = dVar;
    }

    /* renamed from: j */
    private static boolean m2408j(C1143w wVar, C4411f fVar) {
        List<C4411f> list;
        if (wVar == C1143w.SPDY_3) {
            list = f1543d;
        } else if (wVar == C1143w.HTTP_2) {
            list = f1544e;
        } else {
            throw new AssertionError(wVar);
        }
        return list.contains(fVar);
    }

    /* renamed from: k */
    private static String m2409k(String str, String str2) {
        return str + 0 + str2;
    }

    /* renamed from: l */
    public static C1150z.C1152b m2410l(List<C1048f> list, C1143w wVar) {
        C1130q.C1132b bVar = new C1130q.C1132b();
        bVar.mo9757h(C1096k.f1612e, wVar.toString());
        int size = list.size();
        String str = null;
        String str2 = "HTTP/1.1";
        for (int i = 0; i < size; i++) {
            C4411f fVar = list.get(i).f1459a;
            String v = list.get(i).f1460b.mo24303v();
            int i2 = 0;
            while (i2 < v.length()) {
                int indexOf = v.indexOf(0, i2);
                if (indexOf == -1) {
                    indexOf = v.length();
                }
                String substring = v.substring(i2, indexOf);
                if (fVar.equals(C1048f.f1452d)) {
                    str = substring;
                } else if (fVar.equals(C1048f.f1458j)) {
                    str2 = substring;
                } else if (!m2408j(wVar, fVar)) {
                    bVar.mo9752b(fVar.mo24303v(), substring);
                }
                i2 = indexOf + 1;
            }
        }
        if (str != null) {
            C1104r a = C1104r.m2567a(str2 + " " + str);
            C1150z.C1152b bVar2 = new C1150z.C1152b();
            bVar2.mo9884x(wVar);
            bVar2.mo9877q(a.f1633b);
            bVar2.mo9881u(a.f1634c);
            bVar2.mo9880t(bVar.mo9755e());
            return bVar2;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    /* renamed from: m */
    public static List<C1048f> m2411m(C1144x xVar, C1143w wVar, String str) {
        C1048f fVar;
        C1130q i = xVar.mo9836i();
        ArrayList arrayList = new ArrayList(i.mo9748g() + 10);
        arrayList.add(new C1048f(C1048f.f1453e, xVar.mo9840m()));
        arrayList.add(new C1048f(C1048f.f1454f, C1100n.m2545c(xVar.mo9838k())));
        String g = C1024k.m2096g(xVar.mo9838k());
        if (C1143w.SPDY_3 == wVar) {
            arrayList.add(new C1048f(C1048f.f1458j, str));
            fVar = new C1048f(C1048f.f1457i, g);
        } else if (C1143w.HTTP_2 == wVar) {
            fVar = new C1048f(C1048f.f1456h, g);
        } else {
            throw new AssertionError();
        }
        arrayList.add(fVar);
        arrayList.add(new C1048f(C1048f.f1455g, xVar.mo9838k().mo9761E()));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int g2 = i.mo9748g();
        for (int i2 = 0; i2 < g2; i2++) {
            C4411f h = C4411f.m12868h(i.mo9746d(i2).toLowerCase(Locale.US));
            String h2 = i.mo9749h(i2);
            if (!m2408j(wVar, h) && !h.equals(C1048f.f1453e) && !h.equals(C1048f.f1454f) && !h.equals(C1048f.f1455g) && !h.equals(C1048f.f1456h) && !h.equals(C1048f.f1457i) && !h.equals(C1048f.f1458j)) {
                if (linkedHashSet.add(h)) {
                    arrayList.add(new C1048f(h, h2));
                } else {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList.size()) {
                            break;
                        } else if (((C1048f) arrayList.get(i3)).f1459a.equals(h)) {
                            arrayList.set(i3, new C1048f(h, m2409k(((C1048f) arrayList.get(i3)).f1460b.mo24303v(), h2)));
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo9597a() {
        this.f1547c.mo9532q().close();
    }

    /* renamed from: b */
    public C4415s mo9598b(C1144x xVar, long j) {
        return this.f1547c.mo9532q();
    }

    /* renamed from: c */
    public void mo9599c() {
    }

    /* renamed from: d */
    public void mo9600d(C1144x xVar) {
        if (this.f1547c == null) {
            this.f1545a.mo9632I();
            boolean w = this.f1545a.mo9640w();
            String d = C1100n.m2546d(this.f1545a.mo9636n().mo9695k());
            C1031d dVar = this.f1546b;
            C1043e c0 = dVar.mo9516c0(m2411m(xVar, dVar.mo9513X(), d), w, true);
            this.f1547c = c0;
            c0.mo9536u().mo24317g((long) this.f1545a.f1578a.mo9828w(), TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: e */
    public void mo9601e(C1090h hVar) {
        C1043e eVar = this.f1547c;
        if (eVar != null) {
            eVar.mo9528l(C1027a.CANCEL);
        }
    }

    /* renamed from: f */
    public void mo9602f(C1101o oVar) {
        oVar.mo9651b(this.f1547c.mo9532q());
    }

    /* renamed from: g */
    public C1150z.C1152b mo9603g() {
        return m2410l(this.f1547c.mo9531p(), this.f1546b.mo9513X());
    }

    /* renamed from: h */
    public boolean mo9604h() {
        return true;
    }

    /* renamed from: i */
    public C0988a0 mo9605i(C1150z zVar) {
        return new C1098l(zVar.mo9865s(), C10843m.m27009d(this.f1547c.mo9533r()));
    }
}
