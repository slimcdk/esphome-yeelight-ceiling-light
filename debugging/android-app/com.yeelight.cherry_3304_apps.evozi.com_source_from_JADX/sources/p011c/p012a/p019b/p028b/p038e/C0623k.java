package p011c.p012a.p019b.p028b.p038e;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C1609u;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: c.a.b.b.e.k */
public final class C0623k {

    /* renamed from: c.a.b.b.e.k$a */
    private static final class C0624a implements C0625b {

        /* renamed from: a */
        private final CountDownLatch f315a;

        private C0624a() {
            this.f315a = new CountDownLatch(1);
        }

        /* synthetic */ C0624a(C0615d0 d0Var) {
            this();
        }

        /* renamed from: a */
        public final void mo8664a(Object obj) {
            this.f315a.countDown();
        }

        /* renamed from: b */
        public final void mo8672b() {
            this.f315a.await();
        }

        /* renamed from: c */
        public final void mo8637c() {
            this.f315a.countDown();
        }

        /* renamed from: d */
        public final void mo8662d(@NonNull Exception exc) {
            this.f315a.countDown();
        }

        /* renamed from: e */
        public final boolean mo8673e(long j, TimeUnit timeUnit) {
            return this.f315a.await(j, timeUnit);
        }
    }

    /* renamed from: c.a.b.b.e.k$b */
    interface C0625b extends C0610b, C0614d, C0616e<Object> {
    }

    /* renamed from: a */
    public static <TResult> TResult m534a(@NonNull C0619h<TResult> hVar) {
        C1609u.m4473i();
        C1609u.m4476l(hVar, "Task must not be null");
        if (hVar.mo8653n()) {
            return m540g(hVar);
        }
        C0624a aVar = new C0624a((C0615d0) null);
        m539f(hVar, aVar);
        aVar.mo8672b();
        return m540g(hVar);
    }

    /* renamed from: b */
    public static <TResult> TResult m535b(@NonNull C0619h<TResult> hVar, long j, @NonNull TimeUnit timeUnit) {
        C1609u.m4473i();
        C1609u.m4476l(hVar, "Task must not be null");
        C1609u.m4476l(timeUnit, "TimeUnit must not be null");
        if (hVar.mo8653n()) {
            return m540g(hVar);
        }
        C0624a aVar = new C0624a((C0615d0) null);
        m539f(hVar, aVar);
        if (aVar.mo8673e(j, timeUnit)) {
            return m540g(hVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* renamed from: c */
    public static <TResult> C0619h<TResult> m536c(@NonNull Executor executor, @NonNull Callable<TResult> callable) {
        C1609u.m4476l(executor, "Executor must not be null");
        C1609u.m4476l(callable, "Callback must not be null");
        C0613c0 c0Var = new C0613c0();
        executor.execute(new C0615d0(c0Var, callable));
        return c0Var;
    }

    /* renamed from: d */
    public static <TResult> C0619h<TResult> m537d(@NonNull Exception exc) {
        C0613c0 c0Var = new C0613c0();
        c0Var.mo8657r(exc);
        return c0Var;
    }

    /* renamed from: e */
    public static <TResult> C0619h<TResult> m538e(TResult tresult) {
        C0613c0 c0Var = new C0613c0();
        c0Var.mo8658s(tresult);
        return c0Var;
    }

    /* renamed from: f */
    private static void m539f(C0619h<?> hVar, C0625b bVar) {
        hVar.mo8645f(C0621j.f313b, bVar);
        hVar.mo8643d(C0621j.f313b, bVar);
        hVar.mo8640a(C0621j.f313b, bVar);
    }

    /* renamed from: g */
    private static <TResult> TResult m540g(C0619h<TResult> hVar) {
        if (hVar.mo8654o()) {
            return hVar.mo8650k();
        }
        if (hVar.mo8652m()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(hVar.mo8649j());
    }
}
