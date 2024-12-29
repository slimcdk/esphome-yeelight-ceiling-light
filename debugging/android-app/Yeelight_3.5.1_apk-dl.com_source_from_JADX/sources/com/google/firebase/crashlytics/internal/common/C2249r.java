package com.google.firebase.crashlytics.internal.common;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p118y0.C3916f;

/* renamed from: com.google.firebase.crashlytics.internal.common.r */
public final class C2249r {

    /* renamed from: com.google.firebase.crashlytics.internal.common.r$a */
    class C2250a implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ String f3637a;

        /* renamed from: b */
        final /* synthetic */ AtomicLong f3638b;

        /* renamed from: com.google.firebase.crashlytics.internal.common.r$a$a */
        class C2251a extends C2207c {

            /* renamed from: a */
            final /* synthetic */ Runnable f3639a;

            C2251a(C2250a aVar, Runnable runnable) {
                this.f3639a = runnable;
            }

            /* renamed from: b */
            public void mo18530b() {
                this.f3639a.run();
            }
        }

        C2250a(String str, AtomicLong atomicLong) {
            this.f3637a = str;
            this.f3638b = atomicLong;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C2251a(this, runnable));
            newThread.setName(this.f3637a + this.f3638b.getAndIncrement());
            return newThread;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.r$b */
    class C2252b extends C2207c {

        /* renamed from: a */
        final /* synthetic */ String f3640a;

        /* renamed from: b */
        final /* synthetic */ ExecutorService f3641b;

        /* renamed from: c */
        final /* synthetic */ long f3642c;

        /* renamed from: d */
        final /* synthetic */ TimeUnit f3643d;

        C2252b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
            this.f3640a = str;
            this.f3641b = executorService;
            this.f3642c = j;
            this.f3643d = timeUnit;
        }

        /* renamed from: b */
        public void mo18530b() {
            try {
                C3916f f = C3916f.m11190f();
                f.mo26399b("Executing shutdown hook for " + this.f3640a);
                this.f3641b.shutdown();
                if (!this.f3641b.awaitTermination(this.f3642c, this.f3643d)) {
                    C3916f f2 = C3916f.m11190f();
                    f2.mo26399b(this.f3640a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    this.f3641b.shutdownNow();
                }
            } catch (InterruptedException unused) {
                C3916f.m11190f().mo26399b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{this.f3640a}));
                this.f3641b.shutdownNow();
            }
        }
    }

    /* renamed from: a */
    private static void m5757a(String str, ExecutorService executorService) {
        m5758b(str, executorService, 2, TimeUnit.SECONDS);
    }

    /* renamed from: b */
    private static void m5758b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        C2252b bVar = new C2252b(str, executorService, j, timeUnit);
        runtime.addShutdownHook(new Thread(bVar, "Crashlytics Shutdown Hook for " + str));
    }

    /* renamed from: c */
    public static ExecutorService m5759c(String str) {
        ExecutorService e = m5761e(m5760d(str), new ThreadPoolExecutor.DiscardPolicy());
        m5757a(str, e);
        return e;
    }

    /* renamed from: d */
    public static ThreadFactory m5760d(String str) {
        return new C2250a(str, new AtomicLong(1));
    }

    /* renamed from: e */
    private static ExecutorService m5761e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
