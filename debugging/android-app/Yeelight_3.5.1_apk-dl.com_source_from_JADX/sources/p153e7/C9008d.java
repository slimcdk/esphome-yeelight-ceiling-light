package p153e7;

/* renamed from: e7.d */
public final class C9008d {

    /* renamed from: f */
    private static C9008d f16516f;

    /* renamed from: a */
    private C9009e f16517a;

    /* renamed from: b */
    private C9009e f16518b;

    /* renamed from: c */
    private C9009e f16519c;

    /* renamed from: d */
    private C9009e f16520d;

    /* renamed from: e */
    private C9009e f16521e;

    protected C9008d() {
        C9020o oVar = C9020o.f16530a;
        C9024s sVar = C9024s.f16534a;
        C9006b bVar = C9006b.f16515a;
        C9011f fVar = C9011f.f16526a;
        C9015j jVar = C9015j.f16527a;
        C9016k kVar = C9016k.f16528a;
        this.f16517a = new C9009e(new C9007c[]{oVar, sVar, bVar, fVar, jVar, kVar});
        this.f16518b = new C9009e(new C9007c[]{C9022q.f16532a, oVar, sVar, bVar, fVar, jVar, kVar});
        C9019n nVar = C9019n.f16529a;
        C9021p pVar = C9021p.f16531a;
        this.f16519c = new C9009e(new C9007c[]{nVar, pVar, sVar, jVar, kVar});
        this.f16520d = new C9009e(new C9007c[]{nVar, C9023r.f16533a, pVar, sVar, kVar});
        this.f16521e = new C9009e(new C9007c[]{pVar, sVar, kVar});
    }

    /* renamed from: b */
    public static C9008d m21502b() {
        if (f16516f == null) {
            f16516f = new C9008d();
        }
        return f16516f;
    }

    /* renamed from: a */
    public C9012g mo36870a(Object obj) {
        C9012g gVar = (C9012g) this.f16519c.mo36877b(obj == null ? null : obj.getClass());
        if (gVar != null) {
            return gVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No duration converter found for type: ");
        sb.append(obj == null ? "null" : obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    public C9013h mo36871c(Object obj) {
        C9013h hVar = (C9013h) this.f16517a.mo36877b(obj == null ? null : obj.getClass());
        if (hVar != null) {
            return hVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No instant converter found for type: ");
        sb.append(obj == null ? "null" : obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: d */
    public C9014i mo36872d(Object obj) {
        C9014i iVar = (C9014i) this.f16521e.mo36877b(obj == null ? null : obj.getClass());
        if (iVar != null) {
            return iVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No interval converter found for type: ");
        sb.append(obj == null ? "null" : obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    public C9017l mo36873e(Object obj) {
        C9017l lVar = (C9017l) this.f16518b.mo36877b(obj == null ? null : obj.getClass());
        if (lVar != null) {
            return lVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No partial converter found for type: ");
        sb.append(obj == null ? "null" : obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: f */
    public C9018m mo36874f(Object obj) {
        C9018m mVar = (C9018m) this.f16520d.mo36877b(obj == null ? null : obj.getClass());
        if (mVar != null) {
            return mVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No period converter found for type: ");
        sb.append(obj == null ? "null" : obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public String toString() {
        return "ConverterManager[" + this.f16517a.mo36878d() + " instant," + this.f16518b.mo36878d() + " partial," + this.f16519c.mo36878d() + " duration," + this.f16520d.mo36878d() + " period," + this.f16521e.mo36878d() + " interval]";
    }
}
