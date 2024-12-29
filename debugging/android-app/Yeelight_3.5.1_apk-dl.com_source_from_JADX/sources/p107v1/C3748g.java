package p107v1;

import com.google.gson.C2469e;
import com.google.gson.C2528k;
import com.google.gson.C2531n;
import com.google.gson.C2534q;
import com.google.gson.C2536r;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.C2497b;
import com.google.gson.internal.C2515e;
import com.google.gson.internal.C2516f;
import com.google.gson.internal.C2519i;
import com.google.gson.stream.C2537a;
import com.google.gson.stream.JsonToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import p119y1.C3918a;
import p122z1.C3929a;

/* renamed from: v1.g */
public final class C3748g implements C2536r {

    /* renamed from: a */
    private final C2497b f6283a;

    /* renamed from: b */
    final boolean f6284b;

    /* renamed from: v1.g$a */
    private final class C3749a<K, V> extends C2534q<Map<K, V>> {

        /* renamed from: a */
        private final C2534q<K> f6285a;

        /* renamed from: b */
        private final C2534q<V> f6286b;

        /* renamed from: c */
        private final C2516f<? extends Map<K, V>> f6287c;

        public C3749a(C2469e eVar, Type type, C2534q<K> qVar, Type type2, C2534q<V> qVar2, C2516f<? extends Map<K, V>> fVar) {
            this.f6285a = new C3765m(eVar, qVar, type);
            this.f6286b = new C3765m(eVar, qVar2, type2);
            this.f6287c = fVar;
        }

        /* renamed from: e */
        private String m10684e(C2528k kVar) {
            if (kVar.mo19389n()) {
                C2531n g = kVar.mo19385g();
                if (g.mo19399A()) {
                    return String.valueOf(g.mo19409w());
                }
                if (g.mo19411y()) {
                    return Boolean.toString(g.mo19404o());
                }
                if (g.mo19400C()) {
                    return g.mo19410x();
                }
                throw new AssertionError();
            } else if (kVar.mo19387l()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: f */
        public Map<K, V> mo19209b(C3929a aVar) {
            JsonToken N = aVar.mo26169N();
            if (N == JsonToken.NULL) {
                aVar.mo26167G();
                return null;
            }
            Map<K, V> map = (Map) this.f6287c.mo19367a();
            if (N == JsonToken.BEGIN_ARRAY) {
                aVar.mo26170a();
                while (aVar.mo26177n()) {
                    aVar.mo26170a();
                    K b = this.f6285a.mo19209b(aVar);
                    if (map.put(b, this.f6286b.mo19209b(aVar)) == null) {
                        aVar.mo26173i();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + b);
                    }
                }
                aVar.mo26173i();
            } else {
                aVar.mo26171c();
                while (aVar.mo26177n()) {
                    C2515e.f4259a.mo19373a(aVar);
                    K b2 = this.f6285a.mo19209b(aVar);
                    if (map.put(b2, this.f6286b.mo19209b(aVar)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + b2);
                    }
                }
                aVar.mo26175k();
            }
            return map;
        }

        /* renamed from: g */
        public void mo19210d(C2537a aVar, Map<K, V> map) {
            if (map == null) {
                aVar.mo19434s();
            } else if (!C3748g.this.f6284b) {
                aVar.mo19426f();
                for (Map.Entry next : map.entrySet()) {
                    aVar.mo19433p(String.valueOf(next.getKey()));
                    this.f6286b.mo19210d(aVar, next.getValue());
                }
                aVar.mo19429k();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry next2 : map.entrySet()) {
                    C2528k c = this.f6285a.mo19414c(next2.getKey());
                    arrayList.add(c);
                    arrayList2.add(next2.getValue());
                    z |= c.mo19386j() || c.mo19388m();
                }
                if (z) {
                    aVar.mo19425d();
                    int size = arrayList.size();
                    while (i < size) {
                        aVar.mo19425d();
                        C2519i.m6799b((C2528k) arrayList.get(i), aVar);
                        this.f6286b.mo19210d(aVar, arrayList2.get(i));
                        aVar.mo19428i();
                        i++;
                    }
                    aVar.mo19428i();
                    return;
                }
                aVar.mo19426f();
                int size2 = arrayList.size();
                while (i < size2) {
                    aVar.mo19433p(m10684e((C2528k) arrayList.get(i)));
                    this.f6286b.mo19210d(aVar, arrayList2.get(i));
                    i++;
                }
                aVar.mo19429k();
            }
        }
    }

    public C3748g(C2497b bVar, boolean z) {
        this.f6283a = bVar;
        this.f6284b = z;
    }

    /* renamed from: b */
    private C2534q<?> m10682b(C2469e eVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? C3766n.f6358f : eVar.mo19229l(C3918a.m11208b(type));
    }

    /* renamed from: a */
    public <T> C2534q<T> mo19368a(C2469e eVar, C3918a<T> aVar) {
        Type e = aVar.mo26410e();
        if (!Map.class.isAssignableFrom(aVar.mo26409c())) {
            return null;
        }
        Type[] j = C$Gson$Types.m6722j(e, C$Gson$Types.m6723k(e));
        return new C3749a(eVar, j[0], m10682b(eVar, j[0]), j[1], eVar.mo19229l(C3918a.m11208b(j[1])), this.f6283a.mo19365a(aVar));
    }
}
