package p011c.p012a.p019b.p028b.p038e;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: c.a.b.b.e.r */
final class C0632r<TResult> implements C0640z<TResult> {

    /* renamed from: a */
    private final Executor f330a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f331b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c */
    public C0612c<TResult> f332c;

    public C0632r(@NonNull Executor executor, @NonNull C0612c<TResult> cVar) {
        this.f330a = executor;
        this.f332c = cVar;
    }

    /* renamed from: b */
    public final void mo8674b(@NonNull C0619h<TResult> hVar) {
        synchronized (this.f331b) {
            if (this.f332c != null) {
                this.f330a.execute(new C0633s(this, hVar));
            }
        }
    }
}
