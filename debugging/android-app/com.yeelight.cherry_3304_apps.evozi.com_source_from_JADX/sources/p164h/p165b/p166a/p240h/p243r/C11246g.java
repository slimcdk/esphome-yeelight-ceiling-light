package p164h.p165b.p166a.p240h.p243r;

import p164h.p165b.p166a.p240h.p243r.C11248h;
import p164h.p165b.p166a.p240h.p243r.p247n.C11291d;
import p164h.p165b.p166a.p240h.p243r.p247n.C11296f0;
import p164h.p257c.p259b.C11497c;

/* renamed from: h.b.a.h.r.g */
public abstract class C11246g<O extends C11248h> {

    /* renamed from: a */
    private int f22354a = 1;

    /* renamed from: b */
    private int f22355b = 0;

    /* renamed from: c */
    private O f22356c;

    /* renamed from: d */
    private C11245f f22357d = new C11245f();

    /* renamed from: e */
    private Object f22358e;

    /* renamed from: f */
    private C11247a f22359f = C11247a.STRING;

    /* renamed from: h.b.a.h.r.g$a */
    public enum C11247a {
        STRING,
        BYTES
    }

    protected C11246g(C11246g<O> gVar) {
        this.f22356c = gVar.mo35776k();
        this.f22357d = gVar.mo35747j();
        this.f22358e = gVar.mo35771e();
        this.f22359f = gVar.mo35773g();
        this.f22354a = gVar.mo35777l();
        this.f22355b = gVar.mo35778m();
    }

    protected C11246g(O o) {
        this.f22356c = o;
    }

    protected C11246g(O o, C11247a aVar, Object obj) {
        this.f22356c = o;
        this.f22359f = aVar;
        this.f22358e = obj;
    }

    /* renamed from: a */
    public boolean mo35768a() {
        return mo35779n() && mo35773g().equals(C11247a.STRING) && mo35770c().length() > 0;
    }

    /* renamed from: b */
    public void mo35769b(String str) {
        this.f22359f = C11247a.STRING;
        this.f22358e = str;
    }

    /* renamed from: c */
    public String mo35770c() {
        try {
            if (!mo35779n()) {
                return null;
            }
            if (!mo35773g().equals(C11247a.STRING)) {
                return new String((byte[]) mo35771e(), "UTF-8");
            }
            String str = (String) mo35771e();
            return str.charAt(0) == 65279 ? str.substring(1) : str;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: e */
    public Object mo35771e() {
        return this.f22358e;
    }

    /* renamed from: f */
    public byte[] mo35772f() {
        try {
            if (!mo35779n()) {
                return null;
            }
            return mo35773g().equals(C11247a.STRING) ? mo35770c().getBytes() : (byte[]) mo35771e();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    public C11247a mo35773g() {
        return this.f22359f;
    }

    /* renamed from: h */
    public String mo35774h() {
        C11291d i = mo35775i();
        if (i != null) {
            return ((C11497c) i.mo35845b()).mo36398b().get("charset");
        }
        return null;
    }

    /* renamed from: i */
    public C11291d mo35775i() {
        return (C11291d) mo35747j().mo35764q(C11296f0.C11297a.CONTENT_TYPE, C11291d.class);
    }

    /* renamed from: j */
    public C11245f mo35747j() {
        return this.f22357d;
    }

    /* renamed from: k */
    public O mo35776k() {
        return this.f22356c;
    }

    /* renamed from: l */
    public int mo35777l() {
        return this.f22354a;
    }

    /* renamed from: m */
    public int mo35778m() {
        return this.f22355b;
    }

    /* renamed from: n */
    public boolean mo35779n() {
        return mo35771e() != null;
    }

    /* renamed from: o */
    public boolean mo35780o() {
        return mo35747j().mo35762p(C11296f0.C11297a.HOST) != null;
    }

    /* renamed from: p */
    public boolean mo35781p() {
        C11291d i = mo35775i();
        return i == null || i.mo35843f();
    }

    /* renamed from: q */
    public boolean mo35782q() {
        C11291d i = mo35775i();
        return i != null && i.mo35844g();
    }

    /* renamed from: r */
    public void mo35783r(C11247a aVar, Object obj) {
        this.f22359f = aVar;
        this.f22358e = obj;
    }

    /* renamed from: s */
    public void mo35784s(byte[] bArr) {
        mo35783r(C11247a.STRING, new String(bArr, mo35774h() != null ? mo35774h() : "UTF-8"));
    }

    /* renamed from: t */
    public void mo35785t(C11245f fVar) {
        this.f22357d = fVar;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") " + mo35776k().toString();
    }
}
