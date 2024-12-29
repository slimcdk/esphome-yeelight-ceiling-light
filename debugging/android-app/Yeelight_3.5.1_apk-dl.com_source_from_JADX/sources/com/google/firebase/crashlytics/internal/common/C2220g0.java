package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.C1872a;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p065m0.C3333a;
import p065m0.C3339g;

/* renamed from: com.google.firebase.crashlytics.internal.common.g0 */
public final class C2220g0 {

    /* renamed from: a */
    private static final ExecutorService f3547a = C2249r.m5759c("awaitEvenIfOnMainThread task continuation executor");

    /* renamed from: com.google.firebase.crashlytics.internal.common.g0$a */
    class C2221a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Callable f3548a;

        /* renamed from: b */
        final /* synthetic */ C1872a f3549b;

        /* renamed from: com.google.firebase.crashlytics.internal.common.g0$a$a */
        class C2222a implements C3333a<T, Void> {
            C2222a() {
            }

            /* renamed from: b */
            public Void mo18508a(@NonNull C3339g<T> gVar) {
                if (gVar.mo14771n()) {
                    C2221a.this.f3549b.mo14738c(gVar.mo14768k());
                    return null;
                }
                C2221a.this.f3549b.mo14737b(gVar.mo14767j());
                return null;
            }
        }

        C2221a(Callable callable, C1872a aVar) {
            this.f3548a = callable;
            this.f3549b = aVar;
        }

        public void run() {
            try {
                ((C3339g) this.f3548a.call()).mo14765h(new C2222a());
            } catch (Exception e) {
                this.f3549b.mo14737b(e);
            }
        }
    }

    /* renamed from: d */
    public static <T> T m5622d(C3339g<T> gVar) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        gVar.mo14764g(f3547a, new C2214f0(countDownLatch));
        countDownLatch.await(4, TimeUnit.SECONDS);
        if (gVar.mo14771n()) {
            return gVar.mo14768k();
        }
        if (gVar.mo14769l()) {
            throw new CancellationException("Task is already canceled");
        } else if (gVar.mo14770m()) {
            throw new IllegalStateException(gVar.mo14767j());
        } else {
            throw new TimeoutException();
        }
    }

    /* renamed from: e */
    public static <T> C3339g<T> m5623e(Executor executor, Callable<C3339g<T>> callable) {
        C1872a aVar = new C1872a();
        executor.execute(new C2221a(callable, aVar));
        return aVar.mo14736a();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ Void m5625g(C1872a aVar, C3339g gVar) {
        if (gVar.mo14771n()) {
            aVar.mo14740e(gVar.mo14768k());
            return null;
        }
        Exception j = gVar.mo14767j();
        Objects.requireNonNull(j);
        aVar.mo14739d(j);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ Void m5626h(C1872a aVar, C3339g gVar) {
        if (gVar.mo14771n()) {
            aVar.mo14740e(gVar.mo14768k());
            return null;
        }
        Exception j = gVar.mo14767j();
        Objects.requireNonNull(j);
        aVar.mo14739d(j);
        return null;
    }

    /* renamed from: i */
    public static <T> C3339g<T> m5627i(Executor executor, C3339g<T> gVar, C3339g<T> gVar2) {
        C1872a aVar = new C1872a();
        C2210d0 d0Var = new C2210d0(aVar);
        gVar.mo14764g(executor, d0Var);
        gVar2.mo14764g(executor, d0Var);
        return aVar.mo14736a();
    }

    /* renamed from: j */
    public static <T> C3339g<T> m5628j(C3339g<T> gVar, C3339g<T> gVar2) {
        C1872a aVar = new C1872a();
        C2212e0 e0Var = new C2212e0(aVar);
        gVar.mo14765h(e0Var);
        gVar2.mo14765h(e0Var);
        return aVar.mo14736a();
    }
}
