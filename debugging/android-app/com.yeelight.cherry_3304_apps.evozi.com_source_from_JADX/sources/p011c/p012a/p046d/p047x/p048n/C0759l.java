package p011c.p012a.p046d.p047x.p048n;

import p011c.p012a.p046d.C0664f;
import p011c.p012a.p046d.C0674j;
import p011c.p012a.p046d.C0675k;
import p011c.p012a.p046d.C0676l;
import p011c.p012a.p046d.C0682r;
import p011c.p012a.p046d.C0683s;
import p011c.p012a.p046d.C0688v;
import p011c.p012a.p046d.C0690w;
import p011c.p012a.p046d.p047x.C0691a;
import p011c.p012a.p046d.p047x.C0727l;
import p011c.p012a.p046d.p051y.C0808a;
import p011c.p012a.p046d.p052z.C0809a;
import p011c.p012a.p046d.p052z.C0812c;

/* renamed from: c.a.d.x.n.l */
public final class C0759l<T> extends C0688v<T> {

    /* renamed from: a */
    private final C0683s<T> f535a;

    /* renamed from: b */
    private final C0675k<T> f536b;

    /* renamed from: c */
    final C0664f f537c;

    /* renamed from: d */
    private final C0808a<T> f538d;

    /* renamed from: e */
    private final C0690w f539e;

    /* renamed from: f */
    private final C0759l<T>.b f540f = new C0761b();

    /* renamed from: g */
    private C0688v<T> f541g;

    /* renamed from: c.a.d.x.n.l$b */
    private final class C0761b implements C0682r, C0674j {
        private C0761b(C0759l lVar) {
        }
    }

    /* renamed from: c.a.d.x.n.l$c */
    private static final class C0762c implements C0690w {

        /* renamed from: a */
        private final C0808a<?> f542a;

        /* renamed from: b */
        private final boolean f543b;

        /* renamed from: c */
        private final Class<?> f544c;

        /* renamed from: d */
        private final C0683s<?> f545d;

        /* renamed from: e */
        private final C0675k<?> f546e;

        C0762c(Object obj, C0808a<?> aVar, boolean z, Class<?> cls) {
            C0675k<?> kVar = null;
            this.f545d = obj instanceof C0683s ? (C0683s) obj : null;
            kVar = obj instanceof C0675k ? (C0675k) obj : kVar;
            this.f546e = kVar;
            C0691a.m699a((this.f545d == null && kVar == null) ? false : true);
            this.f542a = aVar;
            this.f543b = z;
            this.f544c = cls;
        }

        /* renamed from: a */
        public <T> C0688v<T> mo8771a(C0664f fVar, C0808a<T> aVar) {
            C0808a<?> aVar2 = this.f542a;
            if (aVar2 != null ? aVar2.equals(aVar) || (this.f543b && this.f542a.mo8968e() == aVar.mo8967c()) : this.f544c.isAssignableFrom(aVar.mo8967c())) {
                return new C0759l(this.f545d, this.f546e, fVar, aVar, this);
            }
            return null;
        }
    }

    public C0759l(C0683s<T> sVar, C0675k<T> kVar, C0664f fVar, C0808a<T> aVar, C0690w wVar) {
        this.f535a = sVar;
        this.f536b = kVar;
        this.f537c = fVar;
        this.f538d = aVar;
        this.f539e = wVar;
    }

    /* renamed from: e */
    private C0688v<T> m879e() {
        C0688v<T> vVar = this.f541g;
        if (vVar != null) {
            return vVar;
        }
        C0688v<T> m = this.f537c.mo8708m(this.f539e, this.f538d);
        this.f541g = m;
        return m;
    }

    /* renamed from: f */
    public static C0690w m880f(C0808a<?> aVar, Object obj) {
        return new C0762c(obj, aVar, aVar.mo8968e() == aVar.mo8967c(), (Class<?>) null);
    }

    /* renamed from: b */
    public T mo8694b(C0809a aVar) {
        if (this.f536b == null) {
            return m879e().mo8694b(aVar);
        }
        C0676l a = C0727l.m784a(aVar);
        if (a.mo8743g()) {
            return null;
        }
        return this.f536b.mo8738a(a, this.f538d.mo8968e(), this.f540f);
    }

    /* renamed from: d */
    public void mo8695d(C0812c cVar, T t) {
        C0683s<T> sVar = this.f535a;
        if (sVar == null) {
            m879e().mo8695d(cVar, t);
        } else if (t == null) {
            cVar.mo8874D();
        } else {
            C0727l.m785b(sVar.mo8768a(t, this.f538d.mo8968e(), this.f540f), cVar);
        }
    }
}
