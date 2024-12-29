package p065m0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* renamed from: m0.g */
public abstract class C3339g<TResult> {
    @NonNull
    /* renamed from: a */
    public C3339g<TResult> mo14758a(@NonNull Executor executor, @NonNull C3334b bVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    @NonNull
    /* renamed from: b */
    public C3339g<TResult> mo14759b(@NonNull Executor executor, @NonNull C3335c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    /* renamed from: c */
    public C3339g<TResult> mo14760c(@NonNull C3335c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    /* renamed from: d */
    public abstract C3339g<TResult> mo14761d(@NonNull Executor executor, @NonNull C3336d dVar);

    @NonNull
    /* renamed from: e */
    public abstract C3339g<TResult> mo14762e(@NonNull Executor executor, @NonNull C3337e<? super TResult> eVar);

    @NonNull
    /* renamed from: f */
    public abstract C3339g<TResult> mo14763f(@NonNull C3337e<? super TResult> eVar);

    @NonNull
    /* renamed from: g */
    public <TContinuationResult> C3339g<TContinuationResult> mo14764g(@NonNull Executor executor, @NonNull C3333a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    /* renamed from: h */
    public <TContinuationResult> C3339g<TContinuationResult> mo14765h(@NonNull C3333a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    /* renamed from: i */
    public <TContinuationResult> C3339g<TContinuationResult> mo14766i(@NonNull Executor executor, @NonNull C3333a<TResult, C3339g<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @Nullable
    /* renamed from: j */
    public abstract Exception mo14767j();

    /* renamed from: k */
    public abstract TResult mo14768k();

    /* renamed from: l */
    public abstract boolean mo14769l();

    /* renamed from: m */
    public abstract boolean mo14770m();

    /* renamed from: n */
    public abstract boolean mo14771n();

    @NonNull
    /* renamed from: o */
    public <TContinuationResult> C3339g<TContinuationResult> mo14772o(@NonNull Executor executor, @NonNull C3338f<TResult, TContinuationResult> fVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    @NonNull
    /* renamed from: p */
    public <TContinuationResult> C3339g<TContinuationResult> mo14773p(@NonNull C3338f<TResult, TContinuationResult> fVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
