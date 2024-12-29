package p011c.p012a.p019b.p028b.p038e;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: c.a.b.b.e.v */
final class C0636v<TResult> implements C0640z<TResult> {

    /* renamed from: a */
    private final Executor f340a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f341b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c */
    public C0616e<? super TResult> f342c;

    public C0636v(@NonNull Executor executor, @NonNull C0616e<? super TResult> eVar) {
        this.f340a = executor;
        this.f342c = eVar;
    }

    /* renamed from: b */
    public final void mo8674b(@NonNull C0619h<TResult> hVar) {
        if (hVar.mo8654o()) {
            synchronized (this.f341b) {
                if (this.f342c != null) {
                    this.f340a.execute(new C0637w(this, hVar));
                }
            }
        }
    }
}
