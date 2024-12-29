package p011c.p012a.p019b.p028b.p038e;

/* renamed from: c.a.b.b.e.o */
final class C0629o implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C0619h f324a;

    /* renamed from: b */
    private final /* synthetic */ C0628n f325b;

    C0629o(C0628n nVar, C0619h hVar) {
        this.f325b = nVar;
        this.f324a = hVar;
    }

    public final void run() {
        try {
            C0619h hVar = (C0619h) this.f325b.f322b.mo8634a(this.f324a);
            if (hVar == null) {
                this.f325b.mo8662d(new NullPointerException("Continuation returned null"));
                return;
            }
            hVar.mo8645f(C0621j.f313b, this.f325b);
            hVar.mo8643d(C0621j.f313b, this.f325b);
            hVar.mo8640a(C0621j.f313b, this.f325b);
        } catch (C0617f e) {
            if (e.getCause() instanceof Exception) {
                this.f325b.f323c.mo8657r((Exception) e.getCause());
            } else {
                this.f325b.f323c.mo8657r(e);
            }
        } catch (Exception e2) {
            this.f325b.f323c.mo8657r(e2);
        }
    }
}
