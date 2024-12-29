package p107v1;

import com.google.gson.C2469e;
import com.google.gson.C2534q;
import com.google.gson.C2536r;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.C2497b;
import com.google.gson.internal.C2516f;
import com.google.gson.stream.C2537a;
import com.google.gson.stream.JsonToken;
import java.lang.reflect.Type;
import java.util.Collection;
import p119y1.C3918a;
import p122z1.C3929a;

/* renamed from: v1.b */
public final class C3739b implements C2536r {

    /* renamed from: a */
    private final C2497b f6267a;

    /* renamed from: v1.b$a */
    private static final class C3740a<E> extends C2534q<Collection<E>> {

        /* renamed from: a */
        private final C2534q<E> f6268a;

        /* renamed from: b */
        private final C2516f<? extends Collection<E>> f6269b;

        public C3740a(C2469e eVar, Type type, C2534q<E> qVar, C2516f<? extends Collection<E>> fVar) {
            this.f6268a = new C3765m(eVar, qVar, type);
            this.f6269b = fVar;
        }

        /* renamed from: e */
        public Collection<E> mo19209b(C3929a aVar) {
            if (aVar.mo26169N() == JsonToken.NULL) {
                aVar.mo26167G();
                return null;
            }
            Collection<E> collection = (Collection) this.f6269b.mo19367a();
            aVar.mo26170a();
            while (aVar.mo26177n()) {
                collection.add(this.f6268a.mo19209b(aVar));
            }
            aVar.mo26173i();
            return collection;
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, Collection<E> collection) {
            if (collection == null) {
                aVar.mo19434s();
                return;
            }
            aVar.mo19425d();
            for (E d : collection) {
                this.f6268a.mo19210d(aVar, d);
            }
            aVar.mo19428i();
        }
    }

    public C3739b(C2497b bVar) {
        this.f6267a = bVar;
    }

    /* renamed from: a */
    public <T> C2534q<T> mo19368a(C2469e eVar, C3918a<T> aVar) {
        Type e = aVar.mo26410e();
        Class<? super T> c = aVar.mo26409c();
        if (!Collection.class.isAssignableFrom(c)) {
            return null;
        }
        Type h = C$Gson$Types.m6720h(e, c);
        return new C3740a(eVar, h, eVar.mo19229l(C3918a.m11208b(h)), this.f6267a.mo19365a(aVar));
    }
}
