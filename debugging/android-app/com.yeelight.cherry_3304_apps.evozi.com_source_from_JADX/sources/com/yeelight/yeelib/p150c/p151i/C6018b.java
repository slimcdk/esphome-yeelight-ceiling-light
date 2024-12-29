package com.yeelight.yeelib.p150c.p151i;

import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p153g.C9827a;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p186e.C9767b;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.yeelight.yeelib.c.i.b */
public class C6018b {

    /* renamed from: a */
    private boolean f12736a;

    /* renamed from: b */
    private boolean f12737b;

    /* renamed from: c */
    private int f12738c;

    /* renamed from: d */
    private int f12739d;

    /* renamed from: e */
    private int f12740e;

    /* renamed from: f */
    private boolean f12741f;

    /* renamed from: g */
    private C9827a f12742g;

    /* renamed from: h */
    protected List<C9767b> f12743h = new CopyOnWriteArrayList();

    /* renamed from: i */
    private C6024e.C6028d f12744i;

    /* renamed from: a */
    public int mo27596a() {
        return this.f12738c;
    }

    /* renamed from: b */
    public int mo27597b() {
        return this.f12740e;
    }

    /* renamed from: c */
    public int mo27598c() {
        return this.f12739d;
    }

    /* renamed from: d */
    public C9827a mo27599d() {
        return this.f12742g;
    }

    /* renamed from: e */
    public C6024e.C6028d mo27600e() {
        return this.f12744i;
    }

    /* renamed from: f */
    public boolean mo27601f() {
        return this.f12737b;
    }

    /* renamed from: g */
    public boolean mo27602g() {
        return this.f12741f;
    }

    /* renamed from: h */
    public boolean mo27603h() {
        return this.f12736a;
    }

    /* renamed from: i */
    public void mo27604i(C9767b bVar) {
        if (!this.f12743h.contains(bVar)) {
            this.f12743h.add(bVar);
        }
    }

    /* renamed from: j */
    public void mo27605j(boolean z) {
        this.f12737b = z;
        for (C9767b p : this.f12743h) {
            p.mo26189p(z ? 2097152 : 4194304, this);
        }
    }

    /* renamed from: k */
    public void mo27606k(int i) {
        this.f12738c = i;
        mo27612q(C6024e.C6028d.DEVICE_MODE_SUNSHINE);
        for (C9767b p : this.f12743h) {
            p.mo26189p(8, this);
        }
    }

    /* renamed from: l */
    public void mo27607l(int i) {
        this.f12740e = i;
        mo27612q(C6024e.C6028d.DEVICE_MODE_COLOR);
        for (C9767b p : this.f12743h) {
            p.mo26189p(16, this);
        }
    }

    /* renamed from: m */
    public void mo27608m(int i) {
        this.f12739d = i;
        mo27612q(C6024e.C6028d.DEVICE_MODE_SUNSHINE);
        for (C9767b p : this.f12743h) {
            p.mo26189p(32, this);
        }
    }

    /* renamed from: n */
    public void mo27609n(C9827a aVar) {
        this.f12742g = aVar;
        for (C9767b p : this.f12743h) {
            p.mo26189p(128, this);
        }
    }

    /* renamed from: o */
    public void mo27610o(boolean z) {
        this.f12741f = z;
        for (C9767b p : this.f12743h) {
            p.mo26189p(262144, this);
        }
    }

    /* renamed from: p */
    public void mo27611p(boolean z) {
        this.f12736a = z;
        for (C9767b p : this.f12743h) {
            p.mo26189p(z ? 524288 : 1048576, this);
        }
    }

    /* renamed from: q */
    public void mo27612q(C6024e.C6028d dVar) {
        this.f12744i = dVar;
    }

    /* renamed from: r */
    public boolean mo27613r(C9856y yVar) {
        if (yVar.mo31893y()) {
            mo27606k(yVar.mo31874f());
            return false;
        } else if (yVar.mo31853B()) {
            mo27606k(yVar.mo31874f());
            mo27607l(yVar.mo31875g());
            return false;
        } else if (yVar.mo31855D()) {
            mo27606k(yVar.mo31874f());
            mo27608m(yVar.mo31876h());
            return false;
        } else if (!yVar.mo31890v()) {
            return true;
        } else {
            mo27609n(yVar.mo31871c());
            return false;
        }
    }

    /* renamed from: s */
    public void mo27614s(C9767b bVar) {
        if (bVar == null) {
            this.f12743h.clear();
        } else {
            this.f12743h.remove(bVar);
        }
    }
}
