package p107v1;

import com.google.gson.C2469e;
import com.google.gson.C2534q;
import com.google.gson.C2536r;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.stream.C2537a;
import com.google.gson.stream.JsonToken;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p119y1.C3918a;
import p122z1.C3929a;

/* renamed from: v1.a */
public final class C3737a<E> extends C2534q<Object> {

    /* renamed from: c */
    public static final C2536r f6264c = new C3738a();

    /* renamed from: a */
    private final Class<E> f6265a;

    /* renamed from: b */
    private final C2534q<E> f6266b;

    /* renamed from: v1.a$a */
    static class C3738a implements C2536r {
        C3738a() {
        }

        /* renamed from: a */
        public <T> C2534q<T> mo19368a(C2469e eVar, C3918a<T> aVar) {
            Type e = aVar.mo26410e();
            if (!(e instanceof GenericArrayType) && (!(e instanceof Class) || !((Class) e).isArray())) {
                return null;
            }
            Type g = C$Gson$Types.m6719g(e);
            return new C3737a(eVar, eVar.mo19229l(C3918a.m11208b(g)), C$Gson$Types.m6723k(g));
        }
    }

    public C3737a(C2469e eVar, C2534q<E> qVar, Class<E> cls) {
        this.f6266b = new C3765m(eVar, qVar, cls);
        this.f6265a = cls;
    }

    /* renamed from: b */
    public Object mo19209b(C3929a aVar) {
        if (aVar.mo26169N() == JsonToken.NULL) {
            aVar.mo26167G();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.mo26170a();
        while (aVar.mo26177n()) {
            arrayList.add(this.f6266b.mo19209b(aVar));
        }
        aVar.mo26173i();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f6265a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* renamed from: d */
    public void mo19210d(C2537a aVar, Object obj) {
        if (obj == null) {
            aVar.mo19434s();
            return;
        }
        aVar.mo19425d();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f6266b.mo19210d(aVar, Array.get(obj, i));
        }
        aVar.mo19428i();
    }
}
