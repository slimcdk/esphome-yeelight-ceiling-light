package p011c.p012a.p019b.p028b.p038e;

import java.util.concurrent.Callable;

/* renamed from: c.a.b.b.e.d0 */
final class C0615d0 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C0613c0 f309a;

    /* renamed from: b */
    private final /* synthetic */ Callable f310b;

    C0615d0(C0613c0 c0Var, Callable callable) {
        this.f309a = c0Var;
        this.f310b = callable;
    }

    public final void run() {
        try {
            this.f309a.mo8658s(this.f310b.call());
        } catch (Exception e) {
            this.f309a.mo8657r(e);
        }
    }
}
