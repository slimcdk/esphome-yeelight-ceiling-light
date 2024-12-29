package org.eclipse.jetty.servlet;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletException;
import org.eclipse.jetty.server.handler.C9943d;
import org.eclipse.jetty.server.handler.C9947f;
import org.eclipse.jetty.server.handler.C9948g;
import org.eclipse.jetty.server.handler.C9950h;
import org.eclipse.jetty.util.LazyList;
import p136c6.C4025g;
import p208s4.C10352d;
import p208s4.C10357i;
import p208s4.C10360l;
import p234y5.C12076c;
import p234y5.C12084k;
import p239z5.C12175i;
import p239z5.C12176j;

/* renamed from: org.eclipse.jetty.servlet.c */
public class C9965c extends C9943d {

    /* renamed from: f0 */
    protected final List<C9967b> f18326f0;

    /* renamed from: g0 */
    protected Class<? extends C12084k> f18327g0;

    /* renamed from: h0 */
    protected C4025g f18328h0;

    /* renamed from: i0 */
    protected C12084k f18329i0;

    /* renamed from: j0 */
    protected C9968d f18330j0;

    /* renamed from: k0 */
    protected C9950h f18331k0;

    /* renamed from: l0 */
    protected int f18332l0;

    /* renamed from: m0 */
    protected Object f18333m0;

    /* renamed from: org.eclipse.jetty.servlet.c$a */
    public class C9966a extends C9943d.C9945b {
        public C9966a() {
            super();
        }

        /* renamed from: i */
        public <T extends C10352d> T mo40077i(Class<T> cls) {
            try {
                T t = (C10352d) cls.newInstance();
                for (int size = C9965c.this.f18326f0.size() - 1; size >= 0; size--) {
                    t = C9965c.this.f18326f0.get(size).mo40080b(t);
                }
                return t;
            } catch (InstantiationException e) {
                throw new ServletException((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new ServletException((Throwable) e2);
            }
        }

        /* renamed from: j */
        public <T extends C10357i> T mo40078j(Class<T> cls) {
            try {
                T t = (C10357i) cls.newInstance();
                for (int size = C9965c.this.f18326f0.size() - 1; size >= 0; size--) {
                    t = C9965c.this.f18326f0.get(size).mo40084f(t);
                }
                return t;
            } catch (InstantiationException e) {
                throw new ServletException((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new ServletException((Throwable) e2);
            }
        }
    }

    /* renamed from: org.eclipse.jetty.servlet.c$b */
    public interface C9967b {
        /* renamed from: a */
        void mo40079a(C10352d dVar);

        /* renamed from: b */
        <T extends C10352d> T mo40080b(T t);

        /* renamed from: c */
        void mo40081c(C9961a aVar);

        /* renamed from: d */
        void mo40082d(C10357i iVar);

        /* renamed from: e */
        void mo40083e(ServletHolder servletHolder);

        /* renamed from: f */
        <T extends C10357i> T mo40084f(T t);
    }

    public C9965c() {
        this((C12176j) null, (C4025g) null, (C12084k) null, (C9968d) null, (C9947f) null);
    }

    public C9965c(int i) {
        this((C12176j) null, (String) null, i);
    }

    public C9965c(C12176j jVar, C4025g gVar, C12084k kVar, C9968d dVar, C9947f fVar) {
        this(jVar, (String) null, gVar, kVar, dVar, fVar);
    }

    public C9965c(C12176j jVar, String str, int i) {
        this(jVar, str, (C4025g) null, (C12084k) null, (C9968d) null, (C9947f) null);
        this.f18332l0 = i;
    }

    public C9965c(C12176j jVar, String str, C4025g gVar, C12084k kVar, C9968d dVar, C9947f fVar) {
        super((C9943d.C9945b) null);
        this.f18326f0 = new ArrayList();
        this.f18327g0 = C12076c.class;
        this.f18239n = new C9966a();
        this.f18328h0 = gVar;
        this.f18329i0 = kVar;
        this.f18330j0 = dVar;
        if (fVar != null) {
            mo39930F1(fVar);
        }
        if (str != null) {
            mo39929E1(str);
        }
        if (jVar instanceof C9950h) {
            ((C9950h) jVar).mo39984S0(this);
        } else if (jVar instanceof C9948g) {
            ((C9948g) jVar).mo39980S0(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I1 */
    public void mo39933I1() {
        mo40073O1();
        mo40071M1();
        mo40072N1();
        C9950h hVar = this.f18330j0;
        C12084k kVar = this.f18329i0;
        if (kVar != null) {
            kVar.mo39984S0(hVar);
            hVar = this.f18329i0;
        }
        C4025g gVar = this.f18328h0;
        if (gVar != null) {
            gVar.mo39984S0(hVar);
            hVar = this.f18328h0;
        }
        this.f18331k0 = this;
        while (true) {
            C9950h hVar2 = this.f18331k0;
            if (hVar2 == hVar || !(hVar2.mo39983R0() instanceof C9950h)) {
                C9950h hVar3 = this.f18331k0;
            } else {
                this.f18331k0 = (C9950h) this.f18331k0.mo39983R0();
            }
        }
        C9950h hVar32 = this.f18331k0;
        if (hVar32 != hVar) {
            if (hVar32.mo39983R0() == null) {
                this.f18331k0.mo39984S0(hVar);
            } else {
                throw new IllegalStateException("!ScopedHandler");
            }
        }
        super.mo39933I1();
        C9968d dVar = this.f18330j0;
        if (dVar != null && dVar.mo36748n0()) {
            for (int size = this.f18326f0.size() - 1; size >= 0; size--) {
                C9967b bVar = this.f18326f0.get(size);
                if (this.f18330j0.mo40090f1() != null) {
                    for (C9961a c : this.f18330j0.mo40090f1()) {
                        bVar.mo40081c(c);
                    }
                }
                if (this.f18330j0.mo40095j1() != null) {
                    for (ServletHolder e : this.f18330j0.mo40095j1()) {
                        bVar.mo40083e(e);
                    }
                }
            }
            this.f18330j0.mo40096k1();
        }
    }

    /* renamed from: J1 */
    public void mo40068J1(ServletHolder servletHolder, String str) {
        mo40072N1().mo40086a1(servletHolder, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K1 */
    public void mo40069K1(C10352d dVar) {
        for (C9967b a : this.f18326f0) {
            a.mo40079a(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L1 */
    public void mo40070L1(C10357i iVar) {
        for (C9967b d : this.f18326f0) {
            d.mo40082d(iVar);
        }
    }

    /* renamed from: M1 */
    public C12084k mo40071M1() {
        if (this.f18329i0 == null && (this.f18332l0 & 2) != 0 && !mo36748n0()) {
            this.f18329i0 = mo40074P1();
        }
        return this.f18329i0;
    }

    /* renamed from: N1 */
    public C9968d mo40072N1() {
        if (this.f18330j0 == null && !mo36748n0()) {
            this.f18330j0 = mo40075Q1();
        }
        return this.f18330j0;
    }

    /* renamed from: O1 */
    public C4025g mo40073O1() {
        if (this.f18328h0 == null && (this.f18332l0 & 1) != 0 && !mo36748n0()) {
            this.f18328h0 = mo40076R1();
        }
        return this.f18328h0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P1 */
    public C12084k mo40074P1() {
        try {
            return (C12084k) this.f18327g0.newInstance();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q1 */
    public C9968d mo40075Q1() {
        return new C9968d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: R1 */
    public C4025g mo40076R1() {
        return new C4025g();
    }

    /* renamed from: f1 */
    public void mo39935f1(C10360l lVar, ServletContextEvent servletContextEvent) {
        try {
            if (LazyList.contains(this.f18333m0, lVar)) {
                mo39952v1().mo39966h(false);
            }
            super.mo39935f1(lVar, servletContextEvent);
        } finally {
            mo39952v1().mo39966h(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public void mo26548v0() {
        super.mo26548v0();
        List<C9967b> list = this.f18326f0;
        if (list != null) {
            list.clear();
        }
        C9950h hVar = this.f18331k0;
        if (hVar != null) {
            hVar.mo39984S0((C12175i) null);
        }
    }
}
