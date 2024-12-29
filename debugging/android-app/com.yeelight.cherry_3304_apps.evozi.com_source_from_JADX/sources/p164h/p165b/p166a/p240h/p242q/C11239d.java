package p164h.p165b.p166a.p240h.p242q;

import java.beans.PropertyChangeSupport;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p164h.p165b.p166a.p240h.C11215e;
import p164h.p165b.p166a.p240h.C11217g;
import p164h.p165b.p166a.p240h.C11218h;
import p164h.p165b.p166a.p240h.C11221k;
import p164h.p165b.p166a.p240h.p243r.C11252j;
import p164h.p165b.p166a.p240h.p248s.C11332l;
import p164h.p165b.p166a.p240h.p248s.C11334n;
import p164h.p165b.p166a.p240h.p251v.C11355d;
import p164h.p165b.p166a.p240h.p252w.C11369g0;

/* renamed from: h.b.a.h.q.d */
public abstract class C11239d extends C11237b<C11334n> {
    protected C11239d(C11334n nVar, int i) {
        super(nVar, i);
        new PropertyChangeSupport(this);
    }

    /* renamed from: R */
    public synchronized void mo35737R(C11236a aVar, C11252j jVar) {
        mo35610S(aVar, jVar);
    }

    /* renamed from: S */
    public abstract void mo35610S(C11236a aVar, C11252j jVar);

    /* renamed from: T */
    public synchronized void mo35738T() {
        mo35608a();
    }

    /* renamed from: U */
    public abstract void mo35611U(int i);

    /* renamed from: V */
    public synchronized void mo35739V(C11252j jVar) {
        mo35612W(jVar);
    }

    /* renamed from: W */
    public abstract void mo35612W(C11252j jVar);

    /* renamed from: X */
    public synchronized List<URL> mo35740X(List<C11218h> list, C11217g gVar) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C11218h eVar : list) {
            arrayList.add(new C11215e(eVar, gVar.mo35654i(mo35723N())).mo35643c());
        }
        return arrayList;
    }

    /* renamed from: Y */
    public synchronized URL mo35741Y() {
        return ((C11332l) ((C11334n) mo35723N()).mo35983d()).mo35970N(((C11334n) mo35723N()).mo35978p());
    }

    /* renamed from: Z */
    public abstract void mo35613Z(C11221k kVar);

    /* renamed from: a0 */
    public synchronized void mo35742a0(C11369g0 g0Var, Collection<C11355d> collection) {
        if (this.f22339e != null) {
            if (this.f22339e.mo36099c().equals(Long.valueOf(this.f22339e.mo36067a().mo36106a())) && g0Var.mo36099c().longValue() == 1) {
                System.err.println("TODO: HANDLE ROLLOVER");
                return;
            } else if (this.f22339e.mo36099c().longValue() < g0Var.mo36099c().longValue()) {
                int longValue = (int) (g0Var.mo36099c().longValue() - (this.f22339e.mo36099c().longValue() + 1));
                if (longValue != 0) {
                    mo35611U(longValue);
                }
            } else {
                return;
            }
        }
        this.f22339e = g0Var;
        for (C11355d next : collection) {
            this.f22340f.put(next.mo36040d().mo35994b(), next);
        }
        mo35609c();
    }

    public String toString() {
        return "(SID: " + mo35724O() + ") " + mo35723N();
    }
}
