package p011c.p012a.p019b.p028b.p038e;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: c.a.b.b.e.t */
final class C0634t<TResult> implements C0640z<TResult> {

    /* renamed from: a */
    private final Executor f335a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f336b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c */
    public C0614d f337c;

    public C0634t(@NonNull Executor executor, @NonNull C0614d dVar) {
        this.f335a = executor;
        this.f337c = dVar;
    }

    /* renamed from: b */
    public final void mo8674b(@NonNull C0619h<TResult> hVar) {
        if (!hVar.mo8654o() && !hVar.mo8652m()) {
            synchronized (this.f336b) {
                if (this.f337c != null) {
                    this.f335a.execute(new C0635u(this, hVar));
                }
            }
        }
    }
}
