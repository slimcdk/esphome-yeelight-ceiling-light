package p011c.p012a.p019b.p028b.p038e;

/* renamed from: c.a.b.b.e.u */
final class C0635u implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C0619h f338a;

    /* renamed from: b */
    private final /* synthetic */ C0634t f339b;

    C0635u(C0634t tVar, C0619h hVar) {
        this.f339b = tVar;
        this.f338a = hVar;
    }

    public final void run() {
        synchronized (this.f339b.f336b) {
            if (this.f339b.f337c != null) {
                this.f339b.f337c.mo8662d(this.f338a.mo8649j());
            }
        }
    }
}
