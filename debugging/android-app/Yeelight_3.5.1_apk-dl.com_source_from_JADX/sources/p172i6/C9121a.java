package p172i6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p147d6.C8941a;
import p152e6.C9001b;
import p152e6.C9003c;

/* renamed from: i6.a */
public class C9121a extends C8941a implements C9127d {

    /* renamed from: f */
    private static final C9003c f16865f = C9001b.m21450a(C9121a.class);

    /* renamed from: e */
    private final ExecutorService f16866e;

    public C9121a() {
        this(new ThreadPoolExecutor(256, 256, 60, TimeUnit.SECONDS, new LinkedBlockingQueue()));
    }

    public C9121a(ExecutorService executorService) {
        this.f16866e = executorService;
    }

    /* renamed from: h0 */
    public boolean mo37186h0(Runnable runnable) {
        try {
            this.f16866e.execute(runnable);
            return true;
        } catch (RejectedExecutionException e) {
            f16865f.mo36856j(e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public void mo26548v0() {
        super.mo26548v0();
        this.f16866e.shutdownNow();
    }

    /* renamed from: x */
    public boolean mo37187x() {
        ExecutorService executorService = this.f16866e;
        if (!(executorService instanceof ThreadPoolExecutor)) {
            return false;
        }
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
        return threadPoolExecutor.getPoolSize() == threadPoolExecutor.getMaximumPoolSize() && threadPoolExecutor.getQueue().size() >= threadPoolExecutor.getPoolSize() - threadPoolExecutor.getActiveCount();
    }
}
