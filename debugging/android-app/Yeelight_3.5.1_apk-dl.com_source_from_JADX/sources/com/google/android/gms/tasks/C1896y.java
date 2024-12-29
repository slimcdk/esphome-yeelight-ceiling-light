package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0917i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import p065m0.C3333a;
import p065m0.C3334b;
import p065m0.C3335c;
import p065m0.C3336d;
import p065m0.C3337e;
import p065m0.C3338f;
import p065m0.C3339g;

/* renamed from: com.google.android.gms.tasks.y */
final class C1896y<TResult> extends C3339g<TResult> {

    /* renamed from: a */
    private final Object f2955a = new Object();

    /* renamed from: b */
    private final C1893v f2956b = new C1893v();
    @GuardedBy("mLock")

    /* renamed from: c */
    private boolean f2957c;

    /* renamed from: d */
    private volatile boolean f2958d;
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: e */
    private Object f2959e;
    @GuardedBy("mLock")

    /* renamed from: f */
    private Exception f2960f;

    C1896y() {
    }

    @GuardedBy("mLock")
    /* renamed from: v */
    private final void m4994v() {
        C0917i.m1424o(this.f2957c, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    /* renamed from: w */
    private final void m4995w() {
        if (this.f2958d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    @GuardedBy("mLock")
    /* renamed from: x */
    private final void m4996x() {
        if (this.f2957c) {
            throw DuplicateTaskCompletionException.m4941of(this);
        }
    }

    /* renamed from: y */
    private final void m4997y() {
        synchronized (this.f2955a) {
            if (this.f2957c) {
                this.f2956b.mo14755b(this);
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public final C3339g<TResult> mo14758a(@NonNull Executor executor, @NonNull C3334b bVar) {
        this.f2956b.mo14754a(new C1883l(executor, bVar));
        m4997y();
        return this;
    }

    @NonNull
    /* renamed from: b */
    public final C3339g<TResult> mo14759b(@NonNull Executor executor, @NonNull C3335c<TResult> cVar) {
        this.f2956b.mo14754a(new C1885n(executor, cVar));
        m4997y();
        return this;
    }

    @NonNull
    /* renamed from: c */
    public final C3339g<TResult> mo14760c(@NonNull C3335c<TResult> cVar) {
        this.f2956b.mo14754a(new C1885n(C1873b.f2906a, cVar));
        m4997y();
        return this;
    }

    @NonNull
    /* renamed from: d */
    public final C3339g<TResult> mo14761d(@NonNull Executor executor, @NonNull C3336d dVar) {
        this.f2956b.mo14754a(new C1887p(executor, dVar));
        m4997y();
        return this;
    }

    @NonNull
    /* renamed from: e */
    public final C3339g<TResult> mo14762e(@NonNull Executor executor, @NonNull C3337e<? super TResult> eVar) {
        this.f2956b.mo14754a(new C1889r(executor, eVar));
        m4997y();
        return this;
    }

    @NonNull
    /* renamed from: f */
    public final C3339g<TResult> mo14763f(@NonNull C3337e<? super TResult> eVar) {
        mo14762e(C1873b.f2906a, eVar);
        return this;
    }

    @NonNull
    /* renamed from: g */
    public final <TContinuationResult> C3339g<TContinuationResult> mo14764g(@NonNull Executor executor, @NonNull C3333a<TResult, TContinuationResult> aVar) {
        C1896y yVar = new C1896y();
        this.f2956b.mo14754a(new C1879h(executor, aVar, yVar));
        m4997y();
        return yVar;
    }

    @NonNull
    /* renamed from: h */
    public final <TContinuationResult> C3339g<TContinuationResult> mo14765h(@NonNull C3333a<TResult, TContinuationResult> aVar) {
        return mo14764g(C1873b.f2906a, aVar);
    }

    @NonNull
    /* renamed from: i */
    public final <TContinuationResult> C3339g<TContinuationResult> mo14766i(@NonNull Executor executor, @NonNull C3333a<TResult, C3339g<TContinuationResult>> aVar) {
        C1896y yVar = new C1896y();
        this.f2956b.mo14754a(new C1881j(executor, aVar, yVar));
        m4997y();
        return yVar;
    }

    @Nullable
    /* renamed from: j */
    public final Exception mo14767j() {
        Exception exc;
        synchronized (this.f2955a) {
            exc = this.f2960f;
        }
        return exc;
    }

    /* renamed from: k */
    public final TResult mo14768k() {
        TResult tresult;
        synchronized (this.f2955a) {
            m4994v();
            m4995w();
            Exception exc = this.f2960f;
            if (exc == null) {
                tresult = this.f2959e;
            } else {
                throw new RuntimeExecutionException(exc);
            }
        }
        return tresult;
    }

    /* renamed from: l */
    public final boolean mo14769l() {
        return this.f2958d;
    }

    /* renamed from: m */
    public final boolean mo14770m() {
        boolean z;
        synchronized (this.f2955a) {
            z = this.f2957c;
        }
        return z;
    }

    /* renamed from: n */
    public final boolean mo14771n() {
        boolean z;
        synchronized (this.f2955a) {
            z = false;
            if (this.f2957c && !this.f2958d && this.f2960f == null) {
                z = true;
            }
        }
        return z;
    }

    @NonNull
    /* renamed from: o */
    public final <TContinuationResult> C3339g<TContinuationResult> mo14772o(Executor executor, C3338f<TResult, TContinuationResult> fVar) {
        C1896y yVar = new C1896y();
        this.f2956b.mo14754a(new C1891t(executor, fVar, yVar));
        m4997y();
        return yVar;
    }

    @NonNull
    /* renamed from: p */
    public final <TContinuationResult> C3339g<TContinuationResult> mo14773p(@NonNull C3338f<TResult, TContinuationResult> fVar) {
        Executor executor = C1873b.f2906a;
        C1896y yVar = new C1896y();
        this.f2956b.mo14754a(new C1891t(executor, fVar, yVar));
        m4997y();
        return yVar;
    }

    /* renamed from: q */
    public final void mo14774q(@NonNull Exception exc) {
        C0917i.m1420k(exc, "Exception must not be null");
        synchronized (this.f2955a) {
            m4996x();
            this.f2957c = true;
            this.f2960f = exc;
        }
        this.f2956b.mo14755b(this);
    }

    /* renamed from: r */
    public final void mo14775r(@Nullable Object obj) {
        synchronized (this.f2955a) {
            m4996x();
            this.f2957c = true;
            this.f2959e = obj;
        }
        this.f2956b.mo14755b(this);
    }

    /* renamed from: s */
    public final boolean mo14776s() {
        synchronized (this.f2955a) {
            if (this.f2957c) {
                return false;
            }
            this.f2957c = true;
            this.f2958d = true;
            this.f2956b.mo14755b(this);
            return true;
        }
    }

    /* renamed from: t */
    public final boolean mo14777t(@NonNull Exception exc) {
        C0917i.m1420k(exc, "Exception must not be null");
        synchronized (this.f2955a) {
            if (this.f2957c) {
                return false;
            }
            this.f2957c = true;
            this.f2960f = exc;
            this.f2956b.mo14755b(this);
            return true;
        }
    }

    /* renamed from: u */
    public final boolean mo14778u(@Nullable Object obj) {
        synchronized (this.f2955a) {
            if (this.f2957c) {
                return false;
            }
            this.f2957c = true;
            this.f2959e = obj;
            this.f2956b.mo14755b(this);
            return true;
        }
    }
}
