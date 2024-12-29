package p163g;

/* renamed from: g.i */
public abstract class C10839i implements C4416t {

    /* renamed from: a */
    private final C4416t f20905a;

    public C10839i(C4416t tVar) {
        if (tVar != null) {
            this.f20905a = tVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: P0 */
    public long mo9541P0(C4406c cVar, long j) {
        return this.f20905a.mo9541P0(cVar, j);
    }

    /* renamed from: a */
    public final C4416t mo34164a() {
        return this.f20905a;
    }

    public void close() {
        this.f20905a.close();
    }

    /* renamed from: f */
    public C4417u mo9542f() {
        return this.f20905a.mo9542f();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f20905a.toString() + ")";
    }
}
