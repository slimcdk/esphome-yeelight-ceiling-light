package p011c.p012a.p019b.p028b.p038e;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: c.a.b.b.e.x */
final class C0638x<TResult, TContinuationResult> implements C0610b, C0614d, C0616e<TContinuationResult>, C0640z<TResult> {

    /* renamed from: a */
    private final Executor f345a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C0618g<TResult, TContinuationResult> f346b;

    /* renamed from: c */
    private final C0613c0<TContinuationResult> f347c;

    public C0638x(@NonNull Executor executor, @NonNull C0618g<TResult, TContinuationResult> gVar, @NonNull C0613c0<TContinuationResult> c0Var) {
        this.f345a = executor;
        this.f346b = gVar;
        this.f347c = c0Var;
    }

    /* renamed from: a */
    public final void mo8664a(TContinuationResult tcontinuationresult) {
        this.f347c.mo8658s(tcontinuationresult);
    }

    /* renamed from: b */
    public final void mo8674b(@NonNull C0619h<TResult> hVar) {
        this.f345a.execute(new C0639y(this, hVar));
    }

    /* renamed from: c */
    public final void mo8637c() {
        this.f347c.mo8661v();
    }

    /* renamed from: d */
    public final void mo8662d(@NonNull Exception exc) {
        this.f347c.mo8657r(exc);
    }
}
