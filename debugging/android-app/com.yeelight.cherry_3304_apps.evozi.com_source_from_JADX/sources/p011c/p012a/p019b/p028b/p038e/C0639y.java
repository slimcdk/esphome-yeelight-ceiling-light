package p011c.p012a.p019b.p028b.p038e;

import java.util.concurrent.CancellationException;

/* renamed from: c.a.b.b.e.y */
final class C0639y implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C0619h f348a;

    /* renamed from: b */
    private final /* synthetic */ C0638x f349b;

    C0639y(C0638x xVar, C0619h hVar) {
        this.f349b = xVar;
        this.f348a = hVar;
    }

    public final void run() {
        try {
            C0619h a = this.f349b.f346b.mo8665a(this.f348a.mo8650k());
            if (a == null) {
                this.f349b.mo8662d(new NullPointerException("Continuation returned null"));
                return;
            }
            a.mo8645f(C0621j.f313b, this.f349b);
            a.mo8643d(C0621j.f313b, this.f349b);
            a.mo8640a(C0621j.f313b, this.f349b);
        } catch (C0617f e) {
            if (e.getCause() instanceof Exception) {
                this.f349b.mo8662d((Exception) e.getCause());
            } else {
                this.f349b.mo8662d(e);
            }
        } catch (CancellationException unused) {
            this.f349b.mo8637c();
        } catch (Exception e2) {
            this.f349b.mo8662d(e2);
        }
    }
}
