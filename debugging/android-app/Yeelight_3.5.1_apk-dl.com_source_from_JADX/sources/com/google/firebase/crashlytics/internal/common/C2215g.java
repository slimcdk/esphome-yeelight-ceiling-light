package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.C1874c;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p065m0.C3333a;
import p065m0.C3339g;

/* renamed from: com.google.firebase.crashlytics.internal.common.g */
public class C2215g {

    /* renamed from: a */
    private final Executor f3540a;

    /* renamed from: b */
    private C3339g<Void> f3541b = C1874c.m4951e(null);

    /* renamed from: c */
    private final Object f3542c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ThreadLocal<Boolean> f3543d = new ThreadLocal<>();

    /* renamed from: com.google.firebase.crashlytics.internal.common.g$a */
    class C2216a implements Runnable {
        C2216a() {
        }

        public void run() {
            C2215g.this.f3543d.set(Boolean.TRUE);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.g$b */
    class C2217b implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ Runnable f3545a;

        C2217b(C2215g gVar, Runnable runnable) {
            this.f3545a = runnable;
        }

        /* renamed from: a */
        public Void call() {
            this.f3545a.run();
            return null;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.g$c */
    class C2218c implements C3333a<Void, T> {

        /* renamed from: a */
        final /* synthetic */ Callable f3546a;

        C2218c(C2215g gVar, Callable callable) {
            this.f3546a = callable;
        }

        /* renamed from: a */
        public T mo18508a(@NonNull C3339g<Void> gVar) {
            return this.f3546a.call();
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.g$d */
    class C2219d implements C3333a<T, Void> {
        C2219d(C2215g gVar) {
        }

        /* renamed from: b */
        public Void mo18508a(@NonNull C3339g<T> gVar) {
            return null;
        }
    }

    public C2215g(Executor executor) {
        this.f3540a = executor;
        executor.execute(new C2216a());
    }

    /* renamed from: d */
    private <T> C3339g<Void> m5607d(C3339g<T> gVar) {
        return gVar.mo14764g(this.f3540a, new C2219d(this));
    }

    /* renamed from: e */
    private boolean m5608e() {
        return Boolean.TRUE.equals(this.f3543d.get());
    }

    /* renamed from: f */
    private <T> C3333a<Void, T> m5609f(Callable<T> callable) {
        return new C2218c(this, callable);
    }

    /* renamed from: b */
    public void mo18539b() {
        if (!m5608e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    /* renamed from: c */
    public Executor mo18540c() {
        return this.f3540a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C3339g<Void> mo18541g(Runnable runnable) {
        return mo18542h(new C2217b(this, runnable));
    }

    /* renamed from: h */
    public <T> C3339g<T> mo18542h(Callable<T> callable) {
        C3339g<TContinuationResult> g;
        synchronized (this.f3542c) {
            g = this.f3541b.mo14764g(this.f3540a, m5609f(callable));
            this.f3541b = m5607d(g);
        }
        return g;
    }

    /* renamed from: i */
    public <T> C3339g<T> mo18543i(Callable<C3339g<T>> callable) {
        C3339g<TContinuationResult> i;
        synchronized (this.f3542c) {
            i = this.f3541b.mo14766i(this.f3540a, m5609f(callable));
            this.f3541b = m5607d(i);
        }
        return i;
    }
}
