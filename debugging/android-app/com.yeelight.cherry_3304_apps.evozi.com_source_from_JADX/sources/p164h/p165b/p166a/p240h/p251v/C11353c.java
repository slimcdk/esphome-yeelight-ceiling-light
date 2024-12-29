package p164h.p165b.p166a.p240h.p251v;

import p164h.p165b.p166a.p240h.C11210a;
import p164h.p165b.p166a.p240h.C11220j;
import p164h.p165b.p166a.p240h.p248s.C11328h;
import p164h.p165b.p166a.p240h.p248s.C11336p;

/* renamed from: h.b.a.h.v.c */
public abstract class C11353c {

    /* renamed from: h.b.a.h.v.c$a */
    class C11354a implements C11210a {

        /* renamed from: a */
        Object f22534a;

        /* renamed from: b */
        final /* synthetic */ Object f22535b;

        /* renamed from: c */
        final /* synthetic */ C11336p f22536c;

        C11354a(Object obj, C11336p pVar) {
            this.f22535b = obj;
            this.f22536c = pVar;
        }

        /* renamed from: a */
        public void mo35614a(C11220j jVar) {
            this.f22534a = C11353c.this.mo36035b(this.f22535b);
            if (((C11328h) this.f22536c.mo35995c()).mo35953t(this.f22534a)) {
                this.f22534a = this.f22534a.toString();
            }
        }
    }

    /* renamed from: a */
    public abstract Class<?> mo36034a();

    /* renamed from: b */
    public abstract Object mo36035b(Object obj);

    /* renamed from: c */
    public C11355d mo36039c(C11336p<C11328h> pVar, Object obj) {
        C11354a aVar = new C11354a(obj, pVar);
        pVar.mo35995c().mo35950q().mo35618d(aVar);
        return new C11355d(pVar, aVar.f22534a);
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }
}
