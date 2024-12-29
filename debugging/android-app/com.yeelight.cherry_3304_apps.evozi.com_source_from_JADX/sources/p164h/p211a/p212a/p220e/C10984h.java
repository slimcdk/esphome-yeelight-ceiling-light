package p164h.p211a.p212a.p220e;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: h.a.a.e.h */
public class C10984h {

    /* renamed from: a */
    private boolean f21454a;

    /* renamed from: b */
    private boolean f21455b;

    /* renamed from: c */
    private boolean f21456c;

    /* renamed from: d */
    private C10992n f21457d;

    /* renamed from: e */
    private final Set<String> f21458e = new CopyOnWriteArraySet();

    /* renamed from: a */
    public void mo34745a(C10984h hVar) {
        if (hVar.f21456c) {
            mo34753i(true);
        } else if (!hVar.f21455b) {
            mo34752h(true);
        } else if (hVar.f21454a) {
            mo34751g(true);
        } else if (!this.f21454a) {
            for (String add : hVar.f21458e) {
                this.f21458e.add(add);
            }
        }
        mo34754j(hVar.f21457d);
    }

    /* renamed from: b */
    public Set<String> mo34746b() {
        return this.f21458e;
    }

    /* renamed from: c */
    public C10992n mo34747c() {
        return this.f21457d;
    }

    /* renamed from: d */
    public boolean mo34748d() {
        return this.f21454a;
    }

    /* renamed from: e */
    public boolean mo34749e() {
        return this.f21455b;
    }

    /* renamed from: f */
    public boolean mo34750f() {
        return this.f21456c;
    }

    /* renamed from: g */
    public void mo34751g(boolean z) {
        this.f21454a = z;
        if (z) {
            this.f21455b = true;
            this.f21458e.clear();
        }
    }

    /* renamed from: h */
    public void mo34752h(boolean z) {
        this.f21455b = z;
        if (!z) {
            this.f21456c = false;
            this.f21458e.clear();
            this.f21454a = false;
        }
    }

    /* renamed from: i */
    public void mo34753i(boolean z) {
        this.f21456c = z;
        if (z) {
            this.f21455b = true;
            this.f21457d = null;
            this.f21454a = false;
            this.f21458e.clear();
        }
    }

    /* renamed from: j */
    public void mo34754j(C10992n nVar) {
        if (nVar != null) {
            C10992n nVar2 = this.f21457d;
            if (nVar2 != null) {
                nVar = nVar2.mo34768a(nVar);
            }
            this.f21457d = nVar;
            return;
        }
        throw new NullPointerException("Null UserDataConstraint");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{RoleInfo");
        String str = "";
        sb.append(this.f21456c ? ",F" : str);
        if (this.f21455b) {
            str = ",C";
        }
        sb.append(str);
        sb.append(this.f21454a ? ",*" : this.f21458e);
        sb.append("}");
        return sb.toString();
    }
}
