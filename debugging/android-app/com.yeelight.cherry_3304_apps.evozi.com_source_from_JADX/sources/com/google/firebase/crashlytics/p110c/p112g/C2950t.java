package com.google.firebase.crashlytics.p110c.p112g;

import com.google.firebase.crashlytics.p110c.C2857b;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.firebase.crashlytics.c.g.t */
public final class C2950t {

    /* renamed from: com.google.firebase.crashlytics.c.g.t$a */
    class C2951a implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ String f5734a;

        /* renamed from: b */
        final /* synthetic */ AtomicLong f5735b;

        /* renamed from: com.google.firebase.crashlytics.c.g.t$a$a */
        class C2952a extends C2876d {

            /* renamed from: a */
            final /* synthetic */ Runnable f5736a;

            C2952a(C2951a aVar, Runnable runnable) {
                this.f5736a = runnable;
            }

            /* renamed from: b */
            public void mo17164b() {
                this.f5736a.run();
            }
        }

        C2951a(String str, AtomicLong atomicLong) {
            this.f5734a = str;
            this.f5735b = atomicLong;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C2952a(this, runnable));
            newThread.setName(this.f5734a + this.f5735b.getAndIncrement());
            return newThread;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.t$b */
    class C2953b extends C2876d {

        /* renamed from: a */
        final /* synthetic */ String f5737a;

        /* renamed from: b */
        final /* synthetic */ ExecutorService f5738b;

        /* renamed from: c */
        final /* synthetic */ long f5739c;

        /* renamed from: d */
        final /* synthetic */ TimeUnit f5740d;

        C2953b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
            this.f5737a = str;
            this.f5738b = executorService;
            this.f5739c = j;
            this.f5740d = timeUnit;
        }

        /* renamed from: b */
        public void mo17164b() {
            try {
                C2857b f = C2857b.m8687f();
                f.mo17130b("Executing shutdown hook for " + this.f5737a);
                this.f5738b.shutdown();
                if (!this.f5738b.awaitTermination(this.f5739c, this.f5740d)) {
                    C2857b f2 = C2857b.m8687f();
                    f2.mo17130b(this.f5737a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    this.f5738b.shutdownNow();
                }
            } catch (InterruptedException unused) {
                C2857b.m8687f().mo17130b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{this.f5737a}));
                this.f5738b.shutdownNow();
            }
        }
    }

    /* renamed from: a */
    private static final void m9044a(String str, ExecutorService executorService) {
        m9045b(str, executorService, 2, TimeUnit.SECONDS);
    }

    /* renamed from: b */
    public static final void m9045b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        C2953b bVar = new C2953b(str, executorService, j, timeUnit);
        runtime.addShutdownHook(new Thread(bVar, "Crashlytics Shutdown Hook for " + str));
    }

    /* renamed from: c */
    public static ExecutorService m9046c(String str) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(m9047d(str));
        m9044a(str, newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    /* renamed from: d */
    public static final ThreadFactory m9047d(String str) {
        return new C2951a(str, new AtomicLong(1));
    }
}
