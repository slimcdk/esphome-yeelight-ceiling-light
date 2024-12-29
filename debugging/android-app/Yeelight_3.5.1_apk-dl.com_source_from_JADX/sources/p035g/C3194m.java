package p035g;

import java.util.concurrent.Executor;
import p052k.C3285a;

/* renamed from: g.m */
class C3194m implements Executor {

    /* renamed from: a */
    private final Executor f5157a;

    /* renamed from: g.m$a */
    static class C3195a implements Runnable {

        /* renamed from: a */
        private final Runnable f5158a;

        C3195a(Runnable runnable) {
            this.f5158a = runnable;
        }

        public void run() {
            try {
                this.f5158a.run();
            } catch (Exception e) {
                C3285a.m8856d("Executor", "Background execution failure.", e);
            }
        }
    }

    C3194m(Executor executor) {
        this.f5157a = executor;
    }

    public void execute(Runnable runnable) {
        this.f5157a.execute(new C3195a(runnable));
    }
}
