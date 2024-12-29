package p011c.p012a.p019b.p028b.p038e;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* renamed from: c.a.b.b.e.h */
public abstract class C0619h<TResult> {
    @NonNull
    /* renamed from: a */
    public C0619h<TResult> mo8640a(@NonNull Executor executor, @NonNull C0610b bVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    @NonNull
    /* renamed from: b */
    public C0619h<TResult> mo8641b(@NonNull C0612c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    /* renamed from: c */
    public C0619h<TResult> mo8642c(@NonNull Executor executor, @NonNull C0612c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    /* renamed from: d */
    public abstract C0619h<TResult> mo8643d(@NonNull Executor executor, @NonNull C0614d dVar);

    @NonNull
    /* renamed from: e */
    public abstract C0619h<TResult> mo8644e(@NonNull C0616e<? super TResult> eVar);

    @NonNull
    /* renamed from: f */
    public abstract C0619h<TResult> mo8645f(@NonNull Executor executor, @NonNull C0616e<? super TResult> eVar);

    @NonNull
    /* renamed from: g */
    public <TContinuationResult> C0619h<TContinuationResult> mo8646g(@NonNull C0608a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    /* renamed from: h */
    public <TContinuationResult> C0619h<TContinuationResult> mo8647h(@NonNull Executor executor, @NonNull C0608a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    /* renamed from: i */
    public <TContinuationResult> C0619h<TContinuationResult> mo8648i(@NonNull Executor executor, @NonNull C0608a<TResult, C0619h<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @Nullable
    /* renamed from: j */
    public abstract Exception mo8649j();

    @Nullable
    /* renamed from: k */
    public abstract TResult mo8650k();

    @Nullable
    /* renamed from: l */
    public abstract <X extends Throwable> TResult mo8651l(@NonNull Class<X> cls);

    /* renamed from: m */
    public abstract boolean mo8652m();

    /* renamed from: n */
    public abstract boolean mo8653n();

    /* renamed from: o */
    public abstract boolean mo8654o();

    @NonNull
    /* renamed from: p */
    public <TContinuationResult> C0619h<TContinuationResult> mo8655p(@NonNull C0618g<TResult, TContinuationResult> gVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    @NonNull
    /* renamed from: q */
    public <TContinuationResult> C0619h<TContinuationResult> mo8656q(@NonNull Executor executor, @NonNull C0618g<TResult, TContinuationResult> gVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
