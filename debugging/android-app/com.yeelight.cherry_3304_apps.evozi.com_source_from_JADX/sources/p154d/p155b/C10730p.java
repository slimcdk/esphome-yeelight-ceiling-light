package p154d.p155b;

/* renamed from: d.b.p */
public class C10730p extends Exception {

    /* renamed from: a */
    private Throwable f20613a;

    public C10730p() {
    }

    public C10730p(String str) {
        super(str);
    }

    public C10730p(String str, Throwable th) {
        super(str, th);
        this.f20613a = th;
    }

    public C10730p(Throwable th) {
        super(th);
        this.f20613a = th;
    }

    /* renamed from: a */
    public Throwable mo33963a() {
        return this.f20613a;
    }
}
