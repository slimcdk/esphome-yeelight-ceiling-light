package p040h0;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: h0.h */
final class C3237h implements C3235f {
    /* synthetic */ C3237h(C3236g gVar) {
    }

    /* renamed from: a */
    public final ExecutorService mo23791a(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* renamed from: b */
    public final ExecutorService mo23792b(ThreadFactory threadFactory, int i) {
        return mo23791a(1, threadFactory, 1);
    }
}
