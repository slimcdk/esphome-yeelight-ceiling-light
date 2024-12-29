package p164h.p211a.p212a.p220e.p221o;

import java.io.PrintWriter;
import p154d.p155b.C10732r;
import p154d.p155b.C10734t;
import p154d.p155b.p204f0.C10711e;
import p164h.p211a.p212a.p220e.C10982f;
import p164h.p211a.p212a.p220e.C10990l;
import p164h.p211a.p212a.p222f.C11018d;
import p164h.p211a.p212a.p228h.C11121i;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.e.o.c */
public class C10995c implements C11018d.C11023e {

    /* renamed from: c */
    private static final C11158c f21484c = C11156b.m29015a(C10995c.class);

    /* renamed from: d */
    static final C10711e f21485d = new C10996a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static C10732r f21486e = new C10997b();

    /* renamed from: a */
    protected final C11005f f21487a;

    /* renamed from: b */
    private Object f21488b;

    /* renamed from: h.a.a.e.o.c$a */
    static class C10996a implements C10711e {
        C10996a() {
        }

        /* renamed from: a */
        public void mo33930a(String str, long j) {
        }

        /* renamed from: b */
        public void mo33884b() {
        }

        /* renamed from: c */
        public void mo33931c(int i, String str) {
        }

        /* renamed from: d */
        public void mo33932d(String str, String str2) {
        }

        /* renamed from: e */
        public void mo33933e(int i) {
        }

        /* renamed from: f */
        public String mo33934f(String str) {
            return null;
        }

        /* renamed from: g */
        public boolean mo33885g() {
            return true;
        }

        /* renamed from: h */
        public void mo33886h(String str) {
        }

        /* renamed from: i */
        public PrintWriter mo33887i() {
            return C11121i.m28877g();
        }

        /* renamed from: j */
        public C10732r mo33888j() {
            return C10995c.f21486e;
        }

        /* renamed from: k */
        public void mo33889k(int i) {
        }

        /* renamed from: l */
        public void mo33935l(String str, String str2) {
        }

        /* renamed from: m */
        public void mo33936m(int i) {
        }

        /* renamed from: n */
        public void mo33937n(String str) {
        }
    }

    /* renamed from: h.a.a.e.o.c$b */
    static class C10997b extends C10732r {
        C10997b() {
        }

        public void write(int i) {
        }
    }

    public C10995c(C11005f fVar) {
        if (fVar != null) {
            this.f21487a = fVar;
            return;
        }
        throw new NullPointerException("No Authenticator");
    }

    /* renamed from: e */
    public static boolean m28014e(C10711e eVar) {
        return eVar == f21485d;
    }

    /* renamed from: J */
    public C11018d mo34771J(C10734t tVar) {
        try {
            C11018d a = this.f21487a.mo34712a(tVar, f21485d, true);
            if (a != null && (a instanceof C11018d.C11025g) && !(a instanceof C11018d.C11024f)) {
                C10982f j = this.f21487a.mo34779e().mo34744j();
                if (j != null) {
                    this.f21488b = j.mo34736d(((C11018d.C11025g) a).mo34765a());
                }
                return a;
            }
        } catch (C10990l e) {
            f21484c.mo35487c(e);
        }
        return this;
    }

    /* renamed from: d */
    public Object mo34772d() {
        return this.f21488b;
    }
}
