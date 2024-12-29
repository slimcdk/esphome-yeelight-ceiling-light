package p164h.p211a.p212a.p216c;

import java.io.IOException;
import p164h.p211a.p212a.p217d.C10929e;
import p164h.p211a.p212a.p217d.C10935i;
import p164h.p211a.p212a.p217d.C10938k;
import p164h.p211a.p212a.p217d.C10942n;
import p164h.p211a.p212a.p217d.C10943o;
import p164h.p211a.p212a.p217d.C10950t;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.c.a */
public abstract class C10889a implements C10891c {

    /* renamed from: t */
    private static final C11158c f21062t = C11156b.m29015a(C10889a.class);

    /* renamed from: a */
    protected final C10935i f21063a;

    /* renamed from: b */
    protected final C10942n f21064b;

    /* renamed from: c */
    protected int f21065c = 0;

    /* renamed from: d */
    protected int f21066d = 0;

    /* renamed from: e */
    protected int f21067e = 11;

    /* renamed from: f */
    protected C10929e f21068f;

    /* renamed from: g */
    protected C10929e f21069g;

    /* renamed from: h */
    protected String f21070h;

    /* renamed from: i */
    protected long f21071i = 0;

    /* renamed from: j */
    protected long f21072j = -3;

    /* renamed from: k */
    protected boolean f21073k = false;

    /* renamed from: l */
    protected boolean f21074l = false;

    /* renamed from: m */
    protected boolean f21075m = false;

    /* renamed from: n */
    protected Boolean f21076n = null;

    /* renamed from: o */
    protected C10929e f21077o;

    /* renamed from: p */
    protected C10929e f21078p;

    /* renamed from: q */
    protected C10929e f21079q;

    /* renamed from: r */
    protected C10929e f21080r;

    /* renamed from: s */
    private boolean f21081s;

    public C10889a(C10935i iVar, C10942n nVar) {
        this.f21063a = iVar;
        this.f21064b = nVar;
    }

    /* renamed from: A */
    public boolean mo34388A(int i) {
        return this.f21065c == i;
    }

    /* renamed from: B */
    public boolean mo34389B() {
        return this.f21071i > 0;
    }

    /* renamed from: C */
    public abstract int mo34390C();

    /* renamed from: D */
    public void mo34391D(String str, String str2) {
        this.f21069g = (str == null || "GET".equals(str)) ? C10911m.f21164b : C10911m.f21163a.mo34617g(str);
        this.f21070h = str2;
        if (this.f21067e == 9) {
            this.f21075m = true;
        }
    }

    /* renamed from: a */
    public boolean mo34392a() {
        return this.f21065c == 0 && this.f21069g == null && this.f21066d == 0;
    }

    /* renamed from: b */
    public void mo34393b() {
        if (this.f21065c < 3) {
            this.f21073k = false;
            this.f21076n = null;
            this.f21071i = 0;
            this.f21072j = -3;
            this.f21079q = null;
            C10929e eVar = this.f21078p;
            if (eVar != null) {
                eVar.clear();
                return;
            }
            return;
        }
        throw new IllegalStateException("Flushed");
    }

    /* renamed from: c */
    public void mo34394c(boolean z) {
        this.f21076n = Boolean.valueOf(z);
    }

    public void complete() {
        if (this.f21065c != 0) {
            long j = this.f21072j;
            if (j >= 0 && j != this.f21071i && !this.f21074l) {
                if (f21062t.mo35485a()) {
                    C11158c cVar = f21062t;
                    cVar.mo35489e("ContentLength written==" + this.f21071i + " != contentLength==" + this.f21072j, new Object[0]);
                }
                this.f21076n = Boolean.FALSE;
                return;
            }
            return;
        }
        throw new IllegalStateException("State==HEADER");
    }

    /* renamed from: d */
    public void mo34396d() {
        C10929e eVar = this.f21078p;
        if (eVar != null && eVar.length() == 0) {
            this.f21063a.mo34627d(this.f21078p);
            this.f21078p = null;
        }
        C10929e eVar2 = this.f21077o;
        if (eVar2 != null && eVar2.length() == 0) {
            this.f21063a.mo34627d(this.f21077o);
            this.f21077o = null;
        }
    }

    /* renamed from: e */
    public boolean mo34397e() {
        return this.f21065c == 4;
    }

    /* renamed from: f */
    public boolean mo34398f() {
        Boolean bool = this.f21076n;
        return bool != null ? bool.booleanValue() : mo34418z() || this.f21067e > 10;
    }

    /* renamed from: g */
    public boolean mo34399g() {
        return this.f21065c != 0;
    }

    /* renamed from: h */
    public void mo34400h(int i) {
        if (this.f21065c == 0) {
            this.f21067e = i;
            if (i == 9 && this.f21069g != null) {
                this.f21075m = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("STATE!=START " + this.f21065c);
    }

    /* renamed from: i */
    public boolean mo34401i() {
        long j = this.f21072j;
        return j >= 0 && this.f21071i >= j;
    }

    /* renamed from: j */
    public abstract int mo34402j();

    /* renamed from: k */
    public void mo34403k(int i, String str) {
        if (this.f21065c == 0) {
            this.f21069g = null;
            this.f21066d = i;
            if (str != null) {
                int length = str.length();
                if (length > 1024) {
                    length = 1024;
                }
                this.f21068f = new C10938k(length);
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = str.charAt(i2);
                    if (charAt == 13 || charAt == 10) {
                        this.f21068f.mo34560Q0((byte) 32);
                    } else {
                        this.f21068f.mo34560Q0((byte) charAt);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("STATE!=START");
    }

    /* renamed from: l */
    public abstract void mo34404l(C10897i iVar, boolean z);

    /* renamed from: m */
    public void mo34405m(int i, String str, String str2, boolean z) {
        if (z) {
            this.f21076n = Boolean.FALSE;
        }
        if (mo34399g()) {
            f21062t.mo35489e("sendError on committed: {} {}", Integer.valueOf(i), str);
            return;
        }
        f21062t.mo35489e("sendError: {} {}", Integer.valueOf(i), str);
        mo34403k(i, str);
        if (str2 != null) {
            mo34404l((C10897i) null, false);
            mo34432o(new C10950t(new C10938k(str2)), true);
        } else {
            mo34404l((C10897i) null, true);
        }
        complete();
    }

    /* renamed from: n */
    public void mo34406n(boolean z) {
        this.f21074l = z;
    }

    /* renamed from: p */
    public void mo34407p(C10929e eVar) {
        this.f21080r = eVar;
    }

    /* renamed from: q */
    public void mo34408q(boolean z) {
        this.f21081s = z;
    }

    /* renamed from: r */
    public void mo34409r(long j) {
        if (j < 0) {
            j = -3;
        }
        this.f21072j = j;
    }

    public void reset() {
        this.f21065c = 0;
        this.f21066d = 0;
        this.f21067e = 11;
        this.f21068f = null;
        this.f21073k = false;
        this.f21074l = false;
        this.f21075m = false;
        this.f21076n = null;
        this.f21071i = 0;
        this.f21072j = -3;
        this.f21080r = null;
        this.f21079q = null;
        this.f21069g = null;
    }

    /* renamed from: s */
    public void mo34411s(long j) {
        if (this.f21064b.mo34365o()) {
            try {
                mo34402j();
            } catch (IOException e) {
                this.f21064b.close();
                throw e;
            }
        } else if (this.f21064b.mo34373v(j)) {
            mo34402j();
        } else {
            this.f21064b.close();
            throw new C10943o("timeout");
        }
    }

    /* renamed from: t */
    public void mo34412t() {
        C10929e eVar;
        if (this.f21075m) {
            eVar = this.f21078p;
            if (eVar == null) {
                return;
            }
        } else {
            this.f21071i += (long) this.f21078p.length();
            if (this.f21074l) {
                eVar = this.f21078p;
            } else {
                return;
            }
        }
        eVar.clear();
    }

    /* renamed from: u */
    public void mo34413u(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = j + currentTimeMillis;
        C10929e eVar = this.f21079q;
        C10929e eVar2 = this.f21078p;
        if ((eVar != null && eVar.length() > 0) || ((eVar2 != null && eVar2.length() > 0) || mo34416x())) {
            mo34402j();
            while (currentTimeMillis < j2) {
                if (((eVar != null && eVar.length() > 0) || (eVar2 != null && eVar2.length() > 0)) && this.f21064b.isOpen() && !this.f21064b.mo34368r()) {
                    mo34411s(j2 - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: v */
    public boolean mo34414v() {
        return this.f21081s;
    }

    /* renamed from: w */
    public C10929e mo34415w() {
        return this.f21078p;
    }

    /* renamed from: x */
    public boolean mo34416x() {
        C10929e eVar = this.f21078p;
        if (eVar == null || eVar.mo34558I0() != 0) {
            C10929e eVar2 = this.f21079q;
            return eVar2 != null && eVar2.length() > 0;
        }
        if (this.f21078p.length() == 0 && !this.f21078p.mo34588r0()) {
            this.f21078p.mo34555D0();
        }
        return this.f21078p.mo34558I0() == 0;
    }

    /* renamed from: y */
    public boolean mo34417y() {
        return this.f21064b.isOpen();
    }

    /* renamed from: z */
    public abstract boolean mo34418z();
}
