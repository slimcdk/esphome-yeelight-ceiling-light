package p164h.p211a.p212a.p227g;

import java.util.ArrayList;
import java.util.List;
import p154d.p155b.C10704e;
import p154d.p155b.C10725k;
import p154d.p155b.C10728n;
import p154d.p155b.C10729o;
import p154d.p155b.C10730p;
import p164h.p211a.p212a.p220e.C10979c;
import p164h.p211a.p212a.p220e.C10987k;
import p164h.p211a.p212a.p222f.C11032i;
import p164h.p211a.p212a.p222f.C11033j;
import p164h.p211a.p212a.p222f.p224w.C11052c;
import p164h.p211a.p212a.p222f.p224w.C11056e;
import p164h.p211a.p212a.p222f.p224w.C11057f;
import p164h.p211a.p212a.p222f.p224w.C11059g;
import p164h.p211a.p212a.p222f.p226y.C11073g;
import p164h.p211a.p212a.p228h.C11126j;

/* renamed from: h.a.a.g.d */
public class C11082d extends C11052c {

    /* renamed from: U */
    protected final List<C11084b> f21847U;

    /* renamed from: V */
    protected Class<? extends C10987k> f21848V;

    /* renamed from: W */
    protected C11073g f21849W;

    /* renamed from: X */
    protected C10987k f21850X;

    /* renamed from: Y */
    protected C11085e f21851Y;

    /* renamed from: Z */
    protected C11059g f21852Z;

    /* renamed from: a0 */
    protected int f21853a0;

    /* renamed from: b0 */
    protected Object f21854b0;

    /* renamed from: h.a.a.g.d$a */
    public class C11083a extends C11052c.C11054b {
        public C11083a() {
            super();
        }

        /* renamed from: i */
        public <T extends C10704e> T mo35201i(Class<T> cls) {
            try {
                T t = (C10704e) cls.newInstance();
                for (int size = C11082d.this.f21847U.size() - 1; size >= 0; size--) {
                    t = C11082d.this.f21847U.get(size).mo35203a(t);
                }
                return t;
            } catch (InstantiationException e) {
                throw new C10730p((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new C10730p((Throwable) e2);
            }
        }

        /* renamed from: j */
        public <T extends C10725k> T mo35202j(Class<T> cls) {
            try {
                T t = (C10725k) cls.newInstance();
                for (int size = C11082d.this.f21847U.size() - 1; size >= 0; size--) {
                    t = C11082d.this.f21847U.get(size).mo35204b(t);
                }
                return t;
            } catch (InstantiationException e) {
                throw new C10730p((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new C10730p((Throwable) e2);
            }
        }
    }

    /* renamed from: h.a.a.g.d$b */
    public interface C11084b {
        /* renamed from: a */
        <T extends C10704e> T mo35203a(T t);

        /* renamed from: b */
        <T extends C10725k> T mo35204b(T t);

        /* renamed from: c */
        void mo35205c(C11074a aVar);

        /* renamed from: d */
        void mo35206d(C10725k kVar);

        /* renamed from: e */
        void mo35207e(C10704e eVar);

        /* renamed from: f */
        void mo35208f(C11088f fVar);
    }

    public C11082d() {
        this((C11033j) null, (C11073g) null, (C10987k) null, (C11085e) null, (C11056e) null);
    }

    public C11082d(int i) {
        this((C11033j) null, (String) null, i);
    }

    public C11082d(C11033j jVar, C11073g gVar, C10987k kVar, C11085e eVar, C11056e eVar2) {
        this(jVar, (String) null, gVar, kVar, eVar, eVar2);
    }

    public C11082d(C11033j jVar, String str, int i) {
        this(jVar, str, (C11073g) null, (C10987k) null, (C11085e) null, (C11056e) null);
        this.f21853a0 = i;
    }

    public C11082d(C11033j jVar, String str, C11073g gVar, C10987k kVar, C11085e eVar, C11056e eVar2) {
        super((C11052c.C11054b) null);
        this.f21847U = new ArrayList();
        this.f21848V = C10979c.class;
        this.f21726n = new C11083a();
        this.f21849W = gVar;
        this.f21850X = kVar;
        this.f21851Y = eVar;
        if (eVar2 != null) {
            mo35074t1(eVar2);
        }
        if (str != null) {
            mo35073s1(str);
        }
        if (jVar instanceof C11059g) {
            ((C11059g) jVar).mo35098N0(this);
        } else if (jVar instanceof C11057f) {
            ((C11057f) jVar).mo35095N0(this);
        }
    }

    /* renamed from: A1 */
    public C10987k mo35192A1() {
        if (this.f21850X == null && (this.f21853a0 & 2) != 0 && !mo35452j0()) {
            this.f21850X = mo35195D1();
        }
        return this.f21850X;
    }

    /* renamed from: B1 */
    public C11085e mo35193B1() {
        if (this.f21851Y == null && !mo35452j0()) {
            this.f21851Y = mo35196E1();
        }
        return this.f21851Y;
    }

    /* renamed from: C1 */
    public C11073g mo35194C1() {
        if (this.f21849W == null && (this.f21853a0 & 1) != 0 && !mo35452j0()) {
            this.f21849W = mo35197F1();
        }
        return this.f21849W;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D1 */
    public C10987k mo35195D1() {
        try {
            return (C10987k) this.f21848V.newInstance();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E1 */
    public C11085e mo35196E1() {
        return new C11085e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: F1 */
    public C11073g mo35197F1() {
        return new C11073g();
    }

    /* renamed from: Z0 */
    public void mo35056Z0(C10729o oVar, C10728n nVar) {
        try {
            if (C11126j.m28883f(this.f21854b0, oVar)) {
                mo35069n1().mo35084h(false);
            }
            super.mo35056Z0(oVar, nVar);
        } finally {
            mo35069n1().mo35084h(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public void mo34263q0() {
        super.mo34263q0();
        List<C11084b> list = this.f21847U;
        if (list != null) {
            list.clear();
        }
        C11059g gVar = this.f21852Z;
        if (gVar != null) {
            gVar.mo35098N0((C11032i) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w1 */
    public void mo35078w1() {
        mo35194C1();
        mo35192A1();
        mo35193B1();
        C11059g gVar = this.f21851Y;
        C10987k kVar = this.f21850X;
        if (kVar != null) {
            kVar.mo35098N0(gVar);
            gVar = this.f21850X;
        }
        C11073g gVar2 = this.f21849W;
        if (gVar2 != null) {
            gVar2.mo35098N0(gVar);
            gVar = this.f21849W;
        }
        this.f21852Z = this;
        while (true) {
            C11059g gVar3 = this.f21852Z;
            if (gVar3 == gVar || !(gVar3.mo35097M0() instanceof C11059g)) {
                C11059g gVar4 = this.f21852Z;
            } else {
                this.f21852Z = (C11059g) this.f21852Z.mo35097M0();
            }
        }
        C11059g gVar42 = this.f21852Z;
        if (gVar42 != gVar) {
            if (gVar42.mo35097M0() == null) {
                this.f21852Z.mo35098N0(gVar);
            } else {
                throw new IllegalStateException("!ScopedHandler");
            }
        }
        super.mo35078w1();
        C11085e eVar = this.f21851Y;
        if (eVar != null && eVar.mo35452j0()) {
            for (int size = this.f21847U.size() - 1; size >= 0; size--) {
                C11084b bVar = this.f21847U.get(size);
                if (this.f21851Y.mo35213Z0() != null) {
                    for (C11074a c : this.f21851Y.mo35213Z0()) {
                        bVar.mo35205c(c);
                    }
                }
                if (this.f21851Y.mo35217d1() != null) {
                    for (C11088f f : this.f21851Y.mo35217d1()) {
                        bVar.mo35208f(f);
                    }
                }
            }
            this.f21851Y.mo35218e1();
        }
    }

    /* renamed from: x1 */
    public void mo35198x1(C11088f fVar, String str) {
        mo35193B1().mo35209U0(fVar, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y1 */
    public void mo35199y1(C10704e eVar) {
        for (C11084b e : this.f21847U) {
            e.mo35207e(eVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z1 */
    public void mo35200z1(C10725k kVar) {
        for (C11084b d : this.f21847U) {
            d.mo35206d(kVar);
        }
    }
}
