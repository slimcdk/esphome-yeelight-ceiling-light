package p156f.p157g0.p160g;

import java.util.List;
import p156f.C10833u;
import p156f.C4318a0;
import p156f.C4332c0;
import p156f.C4338e;
import p156f.C4374i;
import p156f.C4381p;
import p156f.p157g0.p159f.C10763g;
import p156f.p157g0.p159f.C4357c;

/* renamed from: f.g0.g.g */
public final class C10773g implements C10833u.C10834a {

    /* renamed from: a */
    private final List<C10833u> f20675a;

    /* renamed from: b */
    private final C10763g f20676b;

    /* renamed from: c */
    private final C10768c f20677c;

    /* renamed from: d */
    private final C4357c f20678d;

    /* renamed from: e */
    private final int f20679e;

    /* renamed from: f */
    private final C4318a0 f20680f;

    /* renamed from: g */
    private final C4338e f20681g;

    /* renamed from: h */
    private final C4381p f20682h;

    /* renamed from: i */
    private final int f20683i;

    /* renamed from: j */
    private final int f20684j;

    /* renamed from: k */
    private final int f20685k;

    /* renamed from: l */
    private int f20686l;

    public C10773g(List<C10833u> list, C10763g gVar, C10768c cVar, C4357c cVar2, int i, C4318a0 a0Var, C4338e eVar, C4381p pVar, int i2, int i3, int i4) {
        this.f20675a = list;
        this.f20678d = cVar2;
        this.f20676b = gVar;
        this.f20677c = cVar;
        this.f20679e = i;
        this.f20680f = a0Var;
        this.f20681g = eVar;
        this.f20682h = pVar;
        this.f20683i = i2;
        this.f20684j = i3;
        this.f20685k = i4;
    }

    /* renamed from: a */
    public C4318a0 mo34023a() {
        return this.f20680f;
    }

    /* renamed from: b */
    public int mo34024b() {
        return this.f20684j;
    }

    /* renamed from: c */
    public int mo34025c() {
        return this.f20685k;
    }

    /* renamed from: d */
    public C4332c0 mo34026d(C4318a0 a0Var) {
        return mo34032j(a0Var, this.f20676b, this.f20677c, this.f20678d);
    }

    /* renamed from: e */
    public int mo34027e() {
        return this.f20683i;
    }

    /* renamed from: f */
    public C4338e mo34028f() {
        return this.f20681g;
    }

    /* renamed from: g */
    public C4374i mo34029g() {
        return this.f20678d;
    }

    /* renamed from: h */
    public C4381p mo34030h() {
        return this.f20682h;
    }

    /* renamed from: i */
    public C10768c mo34031i() {
        return this.f20677c;
    }

    /* renamed from: j */
    public C4332c0 mo34032j(C4318a0 a0Var, C10763g gVar, C10768c cVar, C4357c cVar2) {
        if (this.f20679e < this.f20675a.size()) {
            this.f20686l++;
            if (this.f20677c != null && !this.f20678d.mo23977s(a0Var.mo23815i())) {
                throw new IllegalStateException("network interceptor " + this.f20675a.get(this.f20679e - 1) + " must retain the same host and port");
            } else if (this.f20677c == null || this.f20686l <= 1) {
                C10773g gVar2 = new C10773g(this.f20675a, gVar, cVar, cVar2, this.f20679e + 1, a0Var, this.f20681g, this.f20682h, this.f20683i, this.f20684j, this.f20685k);
                C10833u uVar = this.f20675a.get(this.f20679e);
                C4332c0 a = uVar.mo31916a(gVar2);
                if (cVar != null && this.f20679e + 1 < this.f20675a.size() && gVar2.f20686l != 1) {
                    throw new IllegalStateException("network interceptor " + uVar + " must call proceed() exactly once");
                } else if (a == null) {
                    throw new NullPointerException("interceptor " + uVar + " returned null");
                } else if (a.mo23857a() != null) {
                    return a;
                } else {
                    throw new IllegalStateException("interceptor " + uVar + " returned a response with no body");
                }
            } else {
                throw new IllegalStateException("network interceptor " + this.f20675a.get(this.f20679e - 1) + " must call proceed() exactly once");
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: k */
    public C10763g mo34033k() {
        return this.f20676b;
    }
}
