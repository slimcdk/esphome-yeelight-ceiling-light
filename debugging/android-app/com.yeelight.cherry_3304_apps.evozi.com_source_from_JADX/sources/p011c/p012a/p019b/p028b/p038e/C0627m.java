package p011c.p012a.p019b.p028b.p038e;

/* renamed from: c.a.b.b.e.m */
final class C0627m implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C0619h f319a;

    /* renamed from: b */
    private final /* synthetic */ C0626l f320b;

    C0627m(C0626l lVar, C0619h hVar) {
        this.f320b = lVar;
        this.f319a = hVar;
    }

    public final void run() {
        if (this.f319a.mo8652m()) {
            this.f320b.f318c.mo8661v();
            return;
        }
        try {
            this.f320b.f318c.mo8658s(this.f320b.f317b.mo8634a(this.f319a));
        } catch (C0617f e) {
            if (e.getCause() instanceof Exception) {
                this.f320b.f318c.mo8657r((Exception) e.getCause());
            } else {
                this.f320b.f318c.mo8657r(e);
            }
        } catch (Exception e2) {
            this.f320b.f318c.mo8657r(e2);
        }
    }
}
