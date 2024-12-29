package p011c.p012a.p019b.p028b.p038e;

/* renamed from: c.a.b.b.e.s */
final class C0633s implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C0619h f333a;

    /* renamed from: b */
    private final /* synthetic */ C0632r f334b;

    C0633s(C0632r rVar, C0619h hVar) {
        this.f334b = rVar;
        this.f333a = hVar;
    }

    public final void run() {
        synchronized (this.f334b.f331b) {
            if (this.f334b.f332c != null) {
                this.f334b.f332c.mo8639b(this.f333a);
            }
        }
    }
}
