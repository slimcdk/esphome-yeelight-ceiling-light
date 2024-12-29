package p226w6;

import org.fourthline.cling.model.C10012a;
import org.fourthline.cling.model.C10022j;
import org.fourthline.cling.model.meta.C10071f;
import p214t6.C10404d;

/* renamed from: w6.c */
public abstract class C11957c {

    /* renamed from: w6.c$a */
    class C11958a implements C10012a {

        /* renamed from: a */
        Object f21844a;

        /* renamed from: b */
        final /* synthetic */ Object f21845b;

        /* renamed from: c */
        final /* synthetic */ C10071f f21846c;

        C11958a(Object obj, C10071f fVar) {
            this.f21845b = obj;
            this.f21846c = fVar;
        }

        /* renamed from: a */
        public void mo38964a(C10022j jVar) {
            this.f21844a = C11957c.this.mo42503b(this.f21845b);
            if (((C10404d) this.f21846c.mo40544c()).mo42078t(this.f21844a)) {
                this.f21844a = this.f21844a.toString();
            }
        }
    }

    /* renamed from: a */
    public abstract Class<?> mo42502a();

    /* renamed from: b */
    public abstract Object mo42503b(Object obj);

    /* renamed from: c */
    public C11959d mo42507c(C10071f<C10404d> fVar, Object obj) {
        C11958a aVar = new C11958a(obj, fVar);
        fVar.mo40544c().mo42075q().mo40323d(aVar);
        return new C11959d(fVar, aVar.f21844a);
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }
}
