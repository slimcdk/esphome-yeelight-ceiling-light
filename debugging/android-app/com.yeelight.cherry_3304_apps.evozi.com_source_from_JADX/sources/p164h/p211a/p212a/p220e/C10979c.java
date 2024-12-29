package p164h.p211a.p212a.p220e;

import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import p164h.p211a.p212a.p216c.C10922v;
import p164h.p211a.p212a.p222f.C11010b;
import p164h.p211a.p212a.p222f.C11028f;
import p164h.p211a.p212a.p222f.C11037n;
import p164h.p211a.p212a.p222f.C11039o;
import p164h.p211a.p212a.p222f.C11046u;
import p164h.p211a.p212a.p228h.C11133p;
import p164h.p211a.p212a.p228h.C11138r;
import p164h.p211a.p212a.p228h.p233x.C11146b;

/* renamed from: h.a.a.e.c */
public class C10979c extends C10987k {

    /* renamed from: v */
    private final List<C10978b> f21450v = new CopyOnWriteArrayList();

    /* renamed from: w */
    private final Set<String> f21451w = new CopyOnWriteArraySet();

    /* renamed from: x */
    private final C10922v f21452x = new C10922v();

    /* renamed from: y */
    private boolean f21453y = true;

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public boolean mo34726P0(String str, C11037n nVar, C11039o oVar, Object obj) {
        if (obj == null) {
            return true;
        }
        C10984h hVar = (C10984h) obj;
        if (hVar.mo34750f()) {
            return false;
        }
        C10992n c = hVar.mo34747c();
        if (c == null || c == C10992n.None) {
            return true;
        }
        C11028f n = C11010b.m28113o().mo34842n();
        if (c == C10992n.Integral) {
            if (n.mo34784J(nVar)) {
                return true;
            }
            if (n.mo34793S() > 0) {
                String str2 = n.mo34812g0() + "://" + nVar.mo33972q() + Constants.COLON_SEPARATOR + n.mo34793S() + nVar.mo33929v();
                if (nVar.mo33928t() != null) {
                    str2 = str2 + "?" + nVar.mo33928t();
                }
                oVar.mo33889k(0);
                oVar.mo33937n(str2);
            } else {
                oVar.mo33931c(403, "!Integral");
            }
            nVar.mo34969o0(true);
            return false;
        } else if (c != C10992n.Confidential) {
            throw new IllegalArgumentException("Invalid dataConstraint value: " + c);
        } else if (n.mo34782B(nVar)) {
            return true;
        } else {
            if (n.mo34820y() > 0) {
                String str3 = n.mo34791R() + "://" + nVar.mo33972q() + Constants.COLON_SEPARATOR + n.mo34820y() + nVar.mo33929v();
                if (nVar.mo33928t() != null) {
                    str3 = str3 + "?" + nVar.mo33928t();
                }
                oVar.mo33889k(0);
                oVar.mo33937n(str3);
            } else {
                oVar.mo33931c(403, "!Confidential");
            }
            nVar.mo34969o0(true);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q0 */
    public boolean mo34727Q0(String str, C11037n nVar, C11039o oVar, Object obj, C11046u uVar) {
        if (obj == null) {
            return true;
        }
        C10984h hVar = (C10984h) obj;
        if (!hVar.mo34749e()) {
            return true;
        }
        if (hVar.mo34748d() && nVar.mo34919A() != null) {
            return true;
        }
        for (String b : hVar.mo34746b()) {
            if (uVar.mo35042b(b, (C11046u.C11047a) null)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W0 */
    public boolean mo34728W0(C11037n nVar, C11039o oVar, Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C10984h) obj).mo34749e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y0 */
    public Object mo34729Y0(String str, C11037n nVar) {
        Map map = (Map) this.f21452x.mo34543d(str);
        if (map == null) {
            return null;
        }
        String m = nVar.mo33923m();
        C10984h hVar = (C10984h) map.get(m);
        if (hVar != null) {
            return hVar;
        }
        ArrayList<C10984h> arrayList = new ArrayList<>();
        C10984h hVar2 = (C10984h) map.get((Object) null);
        if (hVar2 != null) {
            arrayList.add(hVar2);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && ((String) entry.getKey()).contains(".omission")) {
                if (!(m + ".omission").equals(entry.getKey())) {
                    arrayList.add(entry.getValue());
                }
            }
        }
        if (arrayList.size() == 1) {
            return (C10984h) arrayList.get(0);
        }
        C10984h hVar3 = new C10984h();
        hVar3.mo34754j(C10992n.None);
        for (C10984h a : arrayList) {
            hVar3.mo34745a(a);
        }
        return hVar3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a1 */
    public void mo34730a1(C10984h hVar, C10978b bVar) {
        bVar.mo34722a().mo35254a();
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b1 */
    public void mo34731b1(C10978b bVar) {
        Map map = (Map) this.f21452x.get(bVar.mo34725d());
        if (map == null) {
            map = new C11133p();
            this.f21452x.put(bVar.mo34725d(), map);
        }
        C10984h hVar = (C10984h) map.get((Object) null);
        if (hVar != null && hVar.mo34750f()) {
            return;
        }
        if (bVar.mo34724c() == null || bVar.mo34724c().length <= 0) {
            String b = bVar.mo34723b();
            C10984h hVar2 = (C10984h) map.get(b);
            if (hVar2 == null) {
                hVar2 = new C10984h();
                map.put(b, hVar2);
                if (hVar != null) {
                    hVar2.mo34745a(hVar);
                }
            }
            if (!hVar2.mo34750f()) {
                mo34730a1(hVar2, bVar);
                throw null;
            }
            return;
        }
        mo34732c1(bVar, map);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c1 */
    public void mo34732c1(C10978b bVar, Map<String, C10984h> map) {
        String[] c = bVar.mo34724c();
        if (c.length > 0) {
            String str = c[0];
            C10984h hVar = map.get(str + ".omission");
            if (hVar == null) {
                hVar = new C10984h();
                map.put(str + ".omission", hVar);
            }
            mo34730a1(hVar, bVar);
            throw null;
        }
    }

    /* renamed from: k0 */
    public void mo34187k0(Appendable appendable, String str) {
        mo35048E0(appendable);
        C11146b.m28976B0(appendable, str, Collections.singleton(mo34716A()), Collections.singleton(mo34719j()), Collections.singleton(mo34761T0()), Collections.singleton(this.f21451w), this.f21452x.entrySet(), mo35460G0(), C11138r.m28927a(mo34903n()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public void mo34262p0() {
        this.f21452x.clear();
        List<C10978b> list = this.f21450v;
        if (list != null) {
            for (C10978b b1 : list) {
                mo34731b1(b1);
            }
        }
        super.mo34262p0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public void mo34263q0() {
        this.f21452x.clear();
        this.f21450v.clear();
        this.f21451w.clear();
        super.mo34263q0();
    }
}
