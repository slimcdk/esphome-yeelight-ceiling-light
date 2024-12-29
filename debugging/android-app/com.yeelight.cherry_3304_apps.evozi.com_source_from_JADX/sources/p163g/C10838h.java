package p163g;

/* renamed from: g.h */
public abstract class C10838h implements C4415s {

    /* renamed from: a */
    private final C4415s f20904a;

    public C10838h(C4415s sVar) {
        if (sVar != null) {
            this.f20904a = sVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void close() {
        this.f20904a.close();
    }

    /* renamed from: f */
    public C4417u mo9440f() {
        return this.f20904a.mo9440f();
    }

    public void flush() {
        this.f20904a.flush();
    }

    /* renamed from: p0 */
    public void mo9442p0(C4406c cVar, long j) {
        this.f20904a.mo9442p0(cVar, j);
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f20904a.toString() + ")";
    }
}
