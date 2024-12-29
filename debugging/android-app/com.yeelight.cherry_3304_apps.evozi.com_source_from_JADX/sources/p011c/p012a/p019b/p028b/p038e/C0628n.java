package p011c.p012a.p019b.p028b.p038e;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: c.a.b.b.e.n */
final class C0628n<TResult, TContinuationResult> implements C0610b, C0614d, C0616e<TContinuationResult>, C0640z<TResult> {

    /* renamed from: a */
    private final Executor f321a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C0608a<TResult, C0619h<TContinuationResult>> f322b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C0613c0<TContinuationResult> f323c;

    public C0628n(@NonNull Executor executor, @NonNull C0608a<TResult, C0619h<TContinuationResult>> aVar, @NonNull C0613c0<TContinuationResult> c0Var) {
        this.f321a = executor;
        this.f322b = aVar;
        this.f323c = c0Var;
    }

    /* renamed from: a */
    public final void mo8664a(TContinuationResult tcontinuationresult) {
        this.f323c.mo8658s(tcontinuationresult);
    }

    /* renamed from: b */
    public final void mo8674b(@NonNull C0619h<TResult> hVar) {
        this.f321a.execute(new C0629o(this, hVar));
    }

    /* renamed from: c */
    public final void mo8637c() {
        this.f323c.mo8661v();
    }

    /* renamed from: d */
    public final void mo8662d(@NonNull Exception exc) {
        this.f323c.mo8657r(exc);
    }
}
