package p164h.p165b.p166a.p240h.p243r.p246m;

import java.util.ArrayList;
import java.util.List;
import p164h.p165b.p166a.p240h.p243r.C11243d;
import p164h.p165b.p166a.p240h.p243r.p247n.C11296f0;
import p164h.p165b.p166a.p240h.p243r.p247n.C11301h;
import p164h.p165b.p166a.p240h.p243r.p247n.C11309p;
import p164h.p165b.p166a.p240h.p243r.p247n.C11310q;
import p164h.p165b.p166a.p240h.p243r.p247n.C11319z;
import p164h.p165b.p166a.p240h.p248s.C11334n;
import p164h.p165b.p166a.p240h.p251v.C11355d;
import p164h.p165b.p166a.p240h.p252w.C11369g0;
import p164h.p165b.p166a.p240h.p252w.C11394u;

/* renamed from: h.b.a.h.r.m.a */
public class C11275a extends C11243d {

    /* renamed from: h */
    private final List<C11355d> f22394h = new ArrayList();

    /* renamed from: i */
    private final C11334n f22395i;

    public C11275a(C11243d dVar, C11334n nVar) {
        super(dVar);
        this.f22395i = nVar;
    }

    /* renamed from: A */
    public List<C11355d> mo35824A() {
        return this.f22394h;
    }

    /* renamed from: B */
    public String mo35825B() {
        C11319z zVar = (C11319z) mo35747j().mo35764q(C11296f0.C11297a.SID, C11319z.class);
        if (zVar != null) {
            return (String) zVar.mo35845b();
        }
        return null;
    }

    /* renamed from: C */
    public boolean mo35826C() {
        C11309p pVar = (C11309p) mo35747j().mo35764q(C11296f0.C11297a.NT, C11309p.class);
        C11310q qVar = (C11310q) mo35747j().mo35764q(C11296f0.C11297a.NTS, C11310q.class);
        return (pVar == null || pVar.mo35845b() == null || qVar == null || !((C11394u) qVar.mo35845b()).equals(C11394u.PROPCHANGE)) ? false : true;
    }

    public String toString() {
        return super.toString() + " SEQUENCE: " + mo35827y().mo36099c();
    }

    /* renamed from: y */
    public C11369g0 mo35827y() {
        C11301h hVar = (C11301h) mo35747j().mo35764q(C11296f0.C11297a.SEQ, C11301h.class);
        if (hVar != null) {
            return (C11369g0) hVar.mo35845b();
        }
        return null;
    }

    /* renamed from: z */
    public C11334n mo35828z() {
        return this.f22395i;
    }
}
