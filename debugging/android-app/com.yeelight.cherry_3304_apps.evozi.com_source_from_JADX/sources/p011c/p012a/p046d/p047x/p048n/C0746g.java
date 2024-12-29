package p011c.p012a.p046d.p047x.p048n;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import p011c.p012a.p046d.C0664f;
import p011c.p012a.p046d.C0676l;
import p011c.p012a.p046d.C0681q;
import p011c.p012a.p046d.C0684t;
import p011c.p012a.p046d.C0688v;
import p011c.p012a.p046d.C0690w;
import p011c.p012a.p046d.p047x.C0692b;
import p011c.p012a.p046d.p047x.C0696c;
import p011c.p012a.p046d.p047x.C0714f;
import p011c.p012a.p046d.p047x.C0724i;
import p011c.p012a.p046d.p047x.C0727l;
import p011c.p012a.p046d.p051y.C0808a;
import p011c.p012a.p046d.p052z.C0809a;
import p011c.p012a.p046d.p052z.C0811b;
import p011c.p012a.p046d.p052z.C0812c;

/* renamed from: c.a.d.x.n.g */
public final class C0746g implements C0690w {

    /* renamed from: a */
    private final C0696c f506a;

    /* renamed from: b */
    final boolean f507b;

    /* renamed from: c.a.d.x.n.g$a */
    private final class C0747a<K, V> extends C0688v<Map<K, V>> {

        /* renamed from: a */
        private final C0688v<K> f508a;

        /* renamed from: b */
        private final C0688v<V> f509b;

        /* renamed from: c */
        private final C0724i<? extends Map<K, V>> f510c;

        public C0747a(C0664f fVar, Type type, C0688v<K> vVar, Type type2, C0688v<V> vVar2, C0724i<? extends Map<K, V>> iVar) {
            this.f508a = new C0763m(fVar, vVar, type);
            this.f509b = new C0763m(fVar, vVar2, type2);
            this.f510c = iVar;
        }

        /* renamed from: e */
        private String m847e(C0676l lVar) {
            if (lVar.mo8745i()) {
                C0681q e = lVar.mo8741e();
                if (e.mo8765s()) {
                    return String.valueOf(e.mo8762o());
                }
                if (e.mo8764q()) {
                    return Boolean.toString(e.mo8757j());
                }
                if (e.mo8766v()) {
                    return e.mo8763p();
                }
                throw new AssertionError();
            } else if (lVar.mo8743g()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: f */
        public Map<K, V> mo8694b(C0809a aVar) {
            C0811b V = aVar.mo8861V();
            if (V == C0811b.NULL) {
                aVar.mo8859Q();
                return null;
            }
            Map<K, V> map = (Map) this.f510c.mo8789a();
            if (V == C0811b.BEGIN_ARRAY) {
                aVar.mo8862a();
                while (aVar.mo8870t()) {
                    aVar.mo8862a();
                    K b = this.f508a.mo8694b(aVar);
                    if (map.put(b, this.f509b.mo8694b(aVar)) == null) {
                        aVar.mo8865j();
                    } else {
                        throw new C0684t("duplicate key: " + b);
                    }
                }
                aVar.mo8865j();
            } else {
                aVar.mo8863b();
                while (aVar.mo8870t()) {
                    C0714f.f454a.mo8794a(aVar);
                    K b2 = this.f508a.mo8694b(aVar);
                    if (map.put(b2, this.f509b.mo8694b(aVar)) != null) {
                        throw new C0684t("duplicate key: " + b2);
                    }
                }
                aVar.mo8867n();
            }
            return map;
        }

        /* renamed from: g */
        public void mo8695d(C0812c cVar, Map<K, V> map) {
            if (map == null) {
                cVar.mo8874D();
            } else if (!C0746g.this.f507b) {
                cVar.mo8884h();
                for (Map.Entry next : map.entrySet()) {
                    cVar.mo8887u(String.valueOf(next.getKey()));
                    this.f509b.mo8695d(cVar, next.getValue());
                }
                cVar.mo8886n();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry next2 : map.entrySet()) {
                    C0676l c = this.f508a.mo8770c(next2.getKey());
                    arrayList.add(c);
                    arrayList2.add(next2.getValue());
                    z |= c.mo8742f() || c.mo8744h();
                }
                if (z) {
                    cVar.mo8883g();
                    int size = arrayList.size();
                    while (i < size) {
                        cVar.mo8883g();
                        C0727l.m785b((C0676l) arrayList.get(i), cVar);
                        this.f509b.mo8695d(cVar, arrayList2.get(i));
                        cVar.mo8885j();
                        i++;
                    }
                    cVar.mo8885j();
                    return;
                }
                cVar.mo8884h();
                int size2 = arrayList.size();
                while (i < size2) {
                    cVar.mo8887u(m847e((C0676l) arrayList.get(i)));
                    this.f509b.mo8695d(cVar, arrayList2.get(i));
                    i++;
                }
                cVar.mo8886n();
            }
        }
    }

    public C0746g(C0696c cVar, boolean z) {
        this.f506a = cVar;
        this.f507b = z;
    }

    /* renamed from: b */
    private C0688v<?> m845b(C0664f fVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? C0764n.f581f : fVar.mo8706k(C0808a.m1033b(type));
    }

    /* renamed from: a */
    public <T> C0688v<T> mo8771a(C0664f fVar, C0808a<T> aVar) {
        Type e = aVar.mo8968e();
        if (!Map.class.isAssignableFrom(aVar.mo8967c())) {
            return null;
        }
        Type[] j = C0692b.m710j(e, C0692b.m711k(e));
        return new C0747a(fVar, j[0], m845b(fVar, j[0]), j[1], fVar.mo8706k(C0808a.m1033b(j[1])), this.f506a.mo8787a(aVar));
    }
}
