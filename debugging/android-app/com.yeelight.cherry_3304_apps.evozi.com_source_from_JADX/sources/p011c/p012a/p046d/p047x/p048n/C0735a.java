package p011c.p012a.p046d.p047x.p048n;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p011c.p012a.p046d.C0664f;
import p011c.p012a.p046d.C0688v;
import p011c.p012a.p046d.C0690w;
import p011c.p012a.p046d.p047x.C0692b;
import p011c.p012a.p046d.p051y.C0808a;
import p011c.p012a.p046d.p052z.C0809a;
import p011c.p012a.p046d.p052z.C0811b;
import p011c.p012a.p046d.p052z.C0812c;

/* renamed from: c.a.d.x.n.a */
public final class C0735a<E> extends C0688v<Object> {

    /* renamed from: c */
    public static final C0690w f487c = new C0736a();

    /* renamed from: a */
    private final Class<E> f488a;

    /* renamed from: b */
    private final C0688v<E> f489b;

    /* renamed from: c.a.d.x.n.a$a */
    static class C0736a implements C0690w {
        C0736a() {
        }

        /* renamed from: a */
        public <T> C0688v<T> mo8771a(C0664f fVar, C0808a<T> aVar) {
            Type e = aVar.mo8968e();
            if (!(e instanceof GenericArrayType) && (!(e instanceof Class) || !((Class) e).isArray())) {
                return null;
            }
            Type g = C0692b.m707g(e);
            return new C0735a(fVar, fVar.mo8706k(C0808a.m1033b(g)), C0692b.m711k(g));
        }
    }

    public C0735a(C0664f fVar, C0688v<E> vVar, Class<E> cls) {
        this.f489b = new C0763m(fVar, vVar, cls);
        this.f488a = cls;
    }

    /* renamed from: b */
    public Object mo8694b(C0809a aVar) {
        if (aVar.mo8861V() == C0811b.NULL) {
            aVar.mo8859Q();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.mo8862a();
        while (aVar.mo8870t()) {
            arrayList.add(this.f489b.mo8694b(aVar));
        }
        aVar.mo8865j();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f488a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* renamed from: d */
    public void mo8695d(C0812c cVar, Object obj) {
        if (obj == null) {
            cVar.mo8874D();
            return;
        }
        cVar.mo8883g();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f489b.mo8695d(cVar, Array.get(obj, i));
        }
        cVar.mo8885j();
    }
}
