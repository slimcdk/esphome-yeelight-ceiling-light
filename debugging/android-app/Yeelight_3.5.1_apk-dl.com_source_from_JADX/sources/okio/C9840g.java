package okio;

/* renamed from: okio.g */
public abstract class C9840g implements C9852q {

    /* renamed from: a */
    private final C9852q f17829a;

    public C9840g(C9852q qVar) {
        if (qVar != null) {
            this.f17829a = qVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void close() {
        this.f17829a.close();
    }

    public void flush() {
        this.f17829a.flush();
    }

    /* renamed from: j */
    public C9854s mo24475j() {
        return this.f17829a.mo24475j();
    }

    /* renamed from: q0 */
    public void mo24476q0(C3564c cVar, long j) {
        this.f17829a.mo24476q0(cVar, j);
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f17829a.toString() + ")";
    }
}
