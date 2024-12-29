package p011c.p012a.p019b.p028b.p038e;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: c.a.b.b.e.p */
final class C0630p<TResult> implements C0640z<TResult> {

    /* renamed from: a */
    private final Executor f326a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f327b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c */
    public C0610b f328c;

    public C0630p(@NonNull Executor executor, @NonNull C0610b bVar) {
        this.f326a = executor;
        this.f328c = bVar;
    }

    /* renamed from: b */
    public final void mo8674b(@NonNull C0619h hVar) {
        if (hVar.mo8652m()) {
            synchronized (this.f327b) {
                if (this.f328c != null) {
                    this.f326a.execute(new C0631q(this));
                }
            }
        }
    }
}
