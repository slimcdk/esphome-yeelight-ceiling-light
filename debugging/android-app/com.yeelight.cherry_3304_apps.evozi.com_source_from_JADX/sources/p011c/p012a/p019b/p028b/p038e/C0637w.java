package p011c.p012a.p019b.p028b.p038e;

/* renamed from: c.a.b.b.e.w */
final class C0637w implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C0619h f343a;

    /* renamed from: b */
    private final /* synthetic */ C0636v f344b;

    C0637w(C0636v vVar, C0619h hVar) {
        this.f344b = vVar;
        this.f343a = hVar;
    }

    public final void run() {
        synchronized (this.f344b.f341b) {
            if (this.f344b.f342c != null) {
                this.f344b.f342c.mo8664a(this.f343a.mo8650k());
            }
        }
    }
}
