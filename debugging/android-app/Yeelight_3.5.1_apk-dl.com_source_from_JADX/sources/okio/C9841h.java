package okio;

/* renamed from: okio.h */
public abstract class C9841h implements C9853r {

    /* renamed from: a */
    private final C9853r f17830a;

    public C9841h(C9853r rVar) {
        if (rVar != null) {
            this.f17830a = rVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: R0 */
    public long mo24477R0(C3564c cVar, long j) {
        return this.f17830a.mo24477R0(cVar, j);
    }

    /* renamed from: a */
    public final C9853r mo39083a() {
        return this.f17830a;
    }

    public void close() {
        this.f17830a.close();
    }

    /* renamed from: j */
    public C9854s mo24479j() {
        return this.f17830a.mo24479j();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f17830a.toString() + ")";
    }
}
