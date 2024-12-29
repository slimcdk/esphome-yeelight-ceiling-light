package p107v1;

import com.google.gson.C2469e;
import com.google.gson.C2479i;
import com.google.gson.C2527j;
import com.google.gson.C2528k;
import com.google.gson.C2532o;
import com.google.gson.C2533p;
import com.google.gson.C2534q;
import com.google.gson.C2536r;
import com.google.gson.internal.C2496a;
import com.google.gson.internal.C2519i;
import com.google.gson.stream.C2537a;
import p119y1.C3918a;
import p122z1.C3929a;

/* renamed from: v1.l */
public final class C3761l<T> extends C2534q<T> {

    /* renamed from: a */
    private final C2533p<T> f6312a;

    /* renamed from: b */
    private final C2527j<T> f6313b;

    /* renamed from: c */
    final C2469e f6314c;

    /* renamed from: d */
    private final C3918a<T> f6315d;

    /* renamed from: e */
    private final C2536r f6316e;

    /* renamed from: f */
    private final C3761l<T>.b f6317f = new C3763b();

    /* renamed from: g */
    private C2534q<T> f6318g;

    /* renamed from: v1.l$b */
    private final class C3763b implements C2532o, C2479i {
        private C3763b(C3761l lVar) {
        }
    }

    /* renamed from: v1.l$c */
    private static final class C3764c implements C2536r {

        /* renamed from: a */
        private final C3918a<?> f6319a;

        /* renamed from: b */
        private final boolean f6320b;

        /* renamed from: c */
        private final Class<?> f6321c;

        /* renamed from: d */
        private final C2533p<?> f6322d;

        /* renamed from: e */
        private final C2527j<?> f6323e;

        C3764c(Object obj, C3918a<?> aVar, boolean z, Class<?> cls) {
            C2527j<?> jVar = null;
            C2533p<?> pVar = obj instanceof C2533p ? (C2533p) obj : null;
            this.f6322d = pVar;
            jVar = obj instanceof C2527j ? (C2527j) obj : jVar;
            this.f6323e = jVar;
            C2496a.m6749a((pVar == null && jVar == null) ? false : true);
            this.f6319a = aVar;
            this.f6320b = z;
            this.f6321c = cls;
        }

        /* renamed from: a */
        public <T> C2534q<T> mo19368a(C2469e eVar, C3918a<T> aVar) {
            C3918a<?> aVar2 = this.f6319a;
            if (aVar2 != null ? aVar2.equals(aVar) || (this.f6320b && this.f6319a.mo26410e() == aVar.mo26409c()) : this.f6321c.isAssignableFrom(aVar.mo26409c())) {
                return new C3761l(this.f6322d, this.f6323e, eVar, aVar, this);
            }
            return null;
        }
    }

    public C3761l(C2533p<T> pVar, C2527j<T> jVar, C2469e eVar, C3918a<T> aVar, C2536r rVar) {
        this.f6312a = pVar;
        this.f6313b = jVar;
        this.f6314c = eVar;
        this.f6315d = aVar;
        this.f6316e = rVar;
    }

    /* renamed from: e */
    private C2534q<T> m10716e() {
        C2534q<T> qVar = this.f6318g;
        if (qVar != null) {
            return qVar;
        }
        C2534q<T> m = this.f6314c.mo19230m(this.f6316e, this.f6315d);
        this.f6318g = m;
        return m;
    }

    /* renamed from: f */
    public static C2536r m10717f(C3918a<?> aVar, Object obj) {
        return new C3764c(obj, aVar, aVar.mo26410e() == aVar.mo26409c(), (Class<?>) null);
    }

    /* renamed from: b */
    public T mo19209b(C3929a aVar) {
        if (this.f6313b == null) {
            return m10716e().mo19209b(aVar);
        }
        C2528k a = C2519i.m6798a(aVar);
        if (a.mo19387l()) {
            return null;
        }
        return this.f6313b.mo19382a(a, this.f6315d.mo26410e(), this.f6317f);
    }

    /* renamed from: d */
    public void mo19210d(C2537a aVar, T t) {
        C2533p<T> pVar = this.f6312a;
        if (pVar == null) {
            m10716e().mo19210d(aVar, t);
        } else if (t == null) {
            aVar.mo19434s();
        } else {
            C2519i.m6799b(pVar.mo19412a(t, this.f6315d.mo26410e(), this.f6317f), aVar);
        }
    }
}
