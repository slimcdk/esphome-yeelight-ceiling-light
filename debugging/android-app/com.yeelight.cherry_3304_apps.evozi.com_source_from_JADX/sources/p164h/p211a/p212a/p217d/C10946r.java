package p164h.p211a.p212a.p217d;

import com.xiaomi.mipush.sdk.Constants;
import p164h.p211a.p212a.p217d.C10935i;

/* renamed from: h.a.a.d.r */
public class C10946r extends C10925b {

    /* renamed from: f */
    private final ThreadLocal<C10948b> f21331f = new C10947a(this);

    /* renamed from: h.a.a.d.r$a */
    class C10947a extends ThreadLocal<C10948b> {
        C10947a(C10946r rVar) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C10948b initialValue() {
            return new C10948b();
        }
    }

    /* renamed from: h.a.a.d.r$b */
    protected static class C10948b {

        /* renamed from: a */
        C10929e f21332a;

        /* renamed from: b */
        C10929e f21333b;

        /* renamed from: c */
        C10929e f21334c;

        protected C10948b() {
        }
    }

    public C10946r(C10935i.C10936a aVar, int i, C10935i.C10936a aVar2, int i2, C10935i.C10936a aVar3) {
        super(aVar, i, aVar2, i2, aVar3);
    }

    /* renamed from: a */
    public C10929e mo34624a() {
        C10948b bVar = this.f21331f.get();
        C10929e eVar = bVar.f21332a;
        if (eVar != null) {
            bVar.f21332a = null;
            return eVar;
        }
        C10929e eVar2 = bVar.f21334c;
        if (eVar2 == null || !mo34598g(eVar2)) {
            return mo34600i();
        }
        C10929e eVar3 = bVar.f21334c;
        bVar.f21334c = null;
        return eVar3;
    }

    /* renamed from: b */
    public C10929e mo34625b(int i) {
        C10948b bVar = this.f21331f.get();
        C10929e eVar = bVar.f21334c;
        if (eVar == null || eVar.capacity() != i) {
            return mo34601j(i);
        }
        C10929e eVar2 = bVar.f21334c;
        bVar.f21334c = null;
        return eVar2;
    }

    /* renamed from: c */
    public C10929e mo34626c() {
        C10948b bVar = this.f21331f.get();
        C10929e eVar = bVar.f21333b;
        if (eVar != null) {
            bVar.f21333b = null;
            return eVar;
        }
        C10929e eVar2 = bVar.f21334c;
        if (eVar2 == null || !mo34599h(eVar2)) {
            return mo34602k();
        }
        C10929e eVar3 = bVar.f21334c;
        bVar.f21334c = null;
        return eVar3;
    }

    /* renamed from: d */
    public void mo34627d(C10929e eVar) {
        eVar.clear();
        if (!eVar.mo34583j0() && !eVar.mo34588r0()) {
            C10948b bVar = this.f21331f.get();
            if (bVar.f21333b == null && mo34599h(eVar)) {
                bVar.f21333b = eVar;
            } else if (bVar.f21332a != null || !mo34598g(eVar)) {
                bVar.f21334c = eVar;
            } else {
                bVar.f21332a = eVar;
            }
        }
    }

    public String toString() {
        return "{{" + mo34597f() + Constants.ACCEPT_TIME_SEPARATOR_SP + mo34596e() + "}}";
    }
}
