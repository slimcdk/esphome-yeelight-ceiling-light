package p011c.p012a.p019b.p028b.p038e;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C1609u;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: c.a.b.b.e.c0 */
final class C0613c0<TResult> extends C0619h<TResult> {

    /* renamed from: a */
    private final Object f303a = new Object();

    /* renamed from: b */
    private final C0609a0<TResult> f304b = new C0609a0<>();
    @GuardedBy("mLock")

    /* renamed from: c */
    private boolean f305c;

    /* renamed from: d */
    private volatile boolean f306d;
    @GuardedBy("mLock")

    /* renamed from: e */
    private TResult f307e;
    @GuardedBy("mLock")

    /* renamed from: f */
    private Exception f308f;

    C0613c0() {
    }

    @GuardedBy("mLock")
    /* renamed from: w */
    private final void m483w() {
        C1609u.m4479o(this.f305c, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    /* renamed from: x */
    private final void m484x() {
        C1609u.m4479o(!this.f305c, "Task is already complete");
    }

    @GuardedBy("mLock")
    /* renamed from: y */
    private final void m485y() {
        if (this.f306d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: z */
    private final void m486z() {
        synchronized (this.f303a) {
            if (this.f305c) {
                this.f304b.mo8635a(this);
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public final C0619h<TResult> mo8640a(@NonNull Executor executor, @NonNull C0610b bVar) {
        this.f304b.mo8636b(new C0630p(executor, bVar));
        m486z();
        return this;
    }

    @NonNull
    /* renamed from: b */
    public final C0619h<TResult> mo8641b(@NonNull C0612c<TResult> cVar) {
        mo8642c(C0621j.f312a, cVar);
        return this;
    }

    @NonNull
    /* renamed from: c */
    public final C0619h<TResult> mo8642c(@NonNull Executor executor, @NonNull C0612c<TResult> cVar) {
        this.f304b.mo8636b(new C0632r(executor, cVar));
        m486z();
        return this;
    }

    @NonNull
    /* renamed from: d */
    public final C0619h<TResult> mo8643d(@NonNull Executor executor, @NonNull C0614d dVar) {
        this.f304b.mo8636b(new C0634t(executor, dVar));
        m486z();
        return this;
    }

    @NonNull
    /* renamed from: e */
    public final C0619h<TResult> mo8644e(@NonNull C0616e<? super TResult> eVar) {
        mo8645f(C0621j.f312a, eVar);
        return this;
    }

    @NonNull
    /* renamed from: f */
    public final C0619h<TResult> mo8645f(@NonNull Executor executor, @NonNull C0616e<? super TResult> eVar) {
        this.f304b.mo8636b(new C0636v(executor, eVar));
        m486z();
        return this;
    }

    @NonNull
    /* renamed from: g */
    public final <TContinuationResult> C0619h<TContinuationResult> mo8646g(@NonNull C0608a<TResult, TContinuationResult> aVar) {
        return mo8647h(C0621j.f312a, aVar);
    }

    @NonNull
    /* renamed from: h */
    public final <TContinuationResult> C0619h<TContinuationResult> mo8647h(@NonNull Executor executor, @NonNull C0608a<TResult, TContinuationResult> aVar) {
        C0613c0 c0Var = new C0613c0();
        this.f304b.mo8636b(new C0626l(executor, aVar, c0Var));
        m486z();
        return c0Var;
    }

    @NonNull
    /* renamed from: i */
    public final <TContinuationResult> C0619h<TContinuationResult> mo8648i(@NonNull Executor executor, @NonNull C0608a<TResult, C0619h<TContinuationResult>> aVar) {
        C0613c0 c0Var = new C0613c0();
        this.f304b.mo8636b(new C0628n(executor, aVar, c0Var));
        m486z();
        return c0Var;
    }

    @Nullable
    /* renamed from: j */
    public final Exception mo8649j() {
        Exception exc;
        synchronized (this.f303a) {
            exc = this.f308f;
        }
        return exc;
    }

    /* renamed from: k */
    public final TResult mo8650k() {
        TResult tresult;
        synchronized (this.f303a) {
            m483w();
            m485y();
            if (this.f308f == null) {
                tresult = this.f307e;
            } else {
                throw new C0617f(this.f308f);
            }
        }
        return tresult;
    }

    /* renamed from: l */
    public final <X extends Throwable> TResult mo8651l(@NonNull Class<X> cls) {
        TResult tresult;
        synchronized (this.f303a) {
            m483w();
            m485y();
            if (cls.isInstance(this.f308f)) {
                throw ((Throwable) cls.cast(this.f308f));
            } else if (this.f308f == null) {
                tresult = this.f307e;
            } else {
                throw new C0617f(this.f308f);
            }
        }
        return tresult;
    }

    /* renamed from: m */
    public final boolean mo8652m() {
        return this.f306d;
    }

    /* renamed from: n */
    public final boolean mo8653n() {
        boolean z;
        synchronized (this.f303a) {
            z = this.f305c;
        }
        return z;
    }

    /* renamed from: o */
    public final boolean mo8654o() {
        boolean z;
        synchronized (this.f303a) {
            z = this.f305c && !this.f306d && this.f308f == null;
        }
        return z;
    }

    @NonNull
    /* renamed from: p */
    public final <TContinuationResult> C0619h<TContinuationResult> mo8655p(@NonNull C0618g<TResult, TContinuationResult> gVar) {
        return mo8656q(C0621j.f312a, gVar);
    }

    @NonNull
    /* renamed from: q */
    public final <TContinuationResult> C0619h<TContinuationResult> mo8656q(Executor executor, C0618g<TResult, TContinuationResult> gVar) {
        C0613c0 c0Var = new C0613c0();
        this.f304b.mo8636b(new C0638x(executor, gVar, c0Var));
        m486z();
        return c0Var;
    }

    /* renamed from: r */
    public final void mo8657r(@NonNull Exception exc) {
        C1609u.m4476l(exc, "Exception must not be null");
        synchronized (this.f303a) {
            m484x();
            this.f305c = true;
            this.f308f = exc;
        }
        this.f304b.mo8635a(this);
    }

    /* renamed from: s */
    public final void mo8658s(TResult tresult) {
        synchronized (this.f303a) {
            m484x();
            this.f305c = true;
            this.f307e = tresult;
        }
        this.f304b.mo8635a(this);
    }

    /* renamed from: t */
    public final boolean mo8659t(@NonNull Exception exc) {
        C1609u.m4476l(exc, "Exception must not be null");
        synchronized (this.f303a) {
            if (this.f305c) {
                return false;
            }
            this.f305c = true;
            this.f308f = exc;
            this.f304b.mo8635a(this);
            return true;
        }
    }

    /* renamed from: u */
    public final boolean mo8660u(TResult tresult) {
        synchronized (this.f303a) {
            if (this.f305c) {
                return false;
            }
            this.f305c = true;
            this.f307e = tresult;
            this.f304b.mo8635a(this);
            return true;
        }
    }

    /* renamed from: v */
    public final boolean mo8661v() {
        synchronized (this.f303a) {
            if (this.f305c) {
                return false;
            }
            this.f305c = true;
            this.f306d = true;
            this.f304b.mo8635a(this);
            return true;
        }
    }
}
