package p011c.p012a.p019b.p028b.p038e;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: c.a.b.b.e.l */
final class C0626l<TResult, TContinuationResult> implements C0640z<TResult> {

    /* renamed from: a */
    private final Executor f316a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C0608a<TResult, TContinuationResult> f317b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C0613c0<TContinuationResult> f318c;

    public C0626l(@NonNull Executor executor, @NonNull C0608a<TResult, TContinuationResult> aVar, @NonNull C0613c0<TContinuationResult> c0Var) {
        this.f316a = executor;
        this.f317b = aVar;
        this.f318c = c0Var;
    }

    /* renamed from: b */
    public final void mo8674b(@NonNull C0619h<TResult> hVar) {
        this.f316a.execute(new C0627m(this, hVar));
    }
}
