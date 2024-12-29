package com.google.firebase.crashlytics.p110c.p112g;

import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p011c.p012a.p019b.p028b.p038e.C0608a;
import p011c.p012a.p019b.p028b.p038e.C0619h;
import p011c.p012a.p019b.p028b.p038e.C0623k;

/* renamed from: com.google.firebase.crashlytics.c.g.i */
class C2893i {

    /* renamed from: a */
    private final ExecutorService f5579a;

    /* renamed from: b */
    private C0619h<Void> f5580b = C0623k.m538e(null);

    /* renamed from: c */
    private final Object f5581c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ThreadLocal<Boolean> f5582d = new ThreadLocal<>();

    /* renamed from: com.google.firebase.crashlytics.c.g.i$a */
    class C2894a implements Runnable {
        C2894a() {
        }

        public void run() {
            C2893i.this.f5582d.set(Boolean.TRUE);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.i$b */
    class C2895b implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ Runnable f5584a;

        C2895b(C2893i iVar, Runnable runnable) {
            this.f5584a = runnable;
        }

        /* renamed from: a */
        public Void call() {
            this.f5584a.run();
            return null;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.i$c */
    class C2896c implements C0608a<Void, T> {

        /* renamed from: a */
        final /* synthetic */ Callable f5585a;

        C2896c(C2893i iVar, Callable callable) {
            this.f5585a = callable;
        }

        /* renamed from: a */
        public T mo8634a(@NonNull C0619h<Void> hVar) {
            return this.f5585a.call();
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.i$d */
    class C2897d implements C0608a<T, Void> {
        C2897d(C2893i iVar) {
        }

        /* renamed from: b */
        public Void mo8634a(@NonNull C0619h<T> hVar) {
            return null;
        }
    }

    public C2893i(ExecutorService executorService) {
        this.f5579a = executorService;
        executorService.submit(new C2894a());
    }

    /* renamed from: d */
    private <T> C0619h<Void> m8846d(C0619h<T> hVar) {
        return hVar.mo8647h(this.f5579a, new C2897d(this));
    }

    /* renamed from: e */
    private boolean m8847e() {
        return Boolean.TRUE.equals(this.f5582d.get());
    }

    /* renamed from: f */
    private <T> C0608a<Void, T> m8848f(Callable<T> callable) {
        return new C2896c(this, callable);
    }

    /* renamed from: b */
    public void mo17193b() {
        if (!m8847e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    /* renamed from: c */
    public Executor mo17194c() {
        return this.f5579a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C0619h<Void> mo17195g(Runnable runnable) {
        return mo17196h(new C2895b(this, runnable));
    }

    /* renamed from: h */
    public <T> C0619h<T> mo17196h(Callable<T> callable) {
        C0619h<TContinuationResult> h;
        synchronized (this.f5581c) {
            h = this.f5580b.mo8647h(this.f5579a, m8848f(callable));
            this.f5580b = m8846d(h);
        }
        return h;
    }

    /* renamed from: i */
    public <T> C0619h<T> mo17197i(Callable<C0619h<T>> callable) {
        C0619h<TContinuationResult> i;
        synchronized (this.f5581c) {
            i = this.f5580b.mo8648i(this.f5579a, m8848f(callable));
            this.f5580b = m8846d(i);
        }
        return i;
    }
}
