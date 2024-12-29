package p011c.p012a.p046d.p047x.p048n;

import java.lang.reflect.Type;
import java.util.Collection;
import p011c.p012a.p046d.C0664f;
import p011c.p012a.p046d.C0688v;
import p011c.p012a.p046d.C0690w;
import p011c.p012a.p046d.p047x.C0692b;
import p011c.p012a.p046d.p047x.C0696c;
import p011c.p012a.p046d.p047x.C0724i;
import p011c.p012a.p046d.p051y.C0808a;
import p011c.p012a.p046d.p052z.C0809a;
import p011c.p012a.p046d.p052z.C0811b;
import p011c.p012a.p046d.p052z.C0812c;

/* renamed from: c.a.d.x.n.b */
public final class C0737b implements C0690w {

    /* renamed from: a */
    private final C0696c f490a;

    /* renamed from: c.a.d.x.n.b$a */
    private static final class C0738a<E> extends C0688v<Collection<E>> {

        /* renamed from: a */
        private final C0688v<E> f491a;

        /* renamed from: b */
        private final C0724i<? extends Collection<E>> f492b;

        public C0738a(C0664f fVar, Type type, C0688v<E> vVar, C0724i<? extends Collection<E>> iVar) {
            this.f491a = new C0763m(fVar, vVar, type);
            this.f492b = iVar;
        }

        /* renamed from: e */
        public Collection<E> mo8694b(C0809a aVar) {
            if (aVar.mo8861V() == C0811b.NULL) {
                aVar.mo8859Q();
                return null;
            }
            Collection<E> collection = (Collection) this.f492b.mo8789a();
            aVar.mo8862a();
            while (aVar.mo8870t()) {
                collection.add(this.f491a.mo8694b(aVar));
            }
            aVar.mo8865j();
            return collection;
        }

        /* renamed from: f */
        public void mo8695d(C0812c cVar, Collection<E> collection) {
            if (collection == null) {
                cVar.mo8874D();
                return;
            }
            cVar.mo8883g();
            for (E d : collection) {
                this.f491a.mo8695d(cVar, d);
            }
            cVar.mo8885j();
        }
    }

    public C0737b(C0696c cVar) {
        this.f490a = cVar;
    }

    /* renamed from: a */
    public <T> C0688v<T> mo8771a(C0664f fVar, C0808a<T> aVar) {
        Type e = aVar.mo8968e();
        Class<? super T> c = aVar.mo8967c();
        if (!Collection.class.isAssignableFrom(c)) {
            return null;
        }
        Type h = C0692b.m708h(e, c);
        return new C0738a(fVar, h, fVar.mo8706k(C0808a.m1033b(h)), this.f490a.mo8787a(aVar));
    }
}
