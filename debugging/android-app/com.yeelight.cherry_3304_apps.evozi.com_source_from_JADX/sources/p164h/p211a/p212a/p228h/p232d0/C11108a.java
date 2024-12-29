package p164h.p211a.p212a.p228h.p232d0;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p164h.p211a.p212a.p228h.p233x.C11145a;
import p164h.p211a.p212a.p228h.p233x.C11153e;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.h.d0.a */
public class C11108a extends C11145a implements C11114d, C11153e {

    /* renamed from: f */
    private static final C11158c f21960f = C11156b.m29015a(C11108a.class);

    /* renamed from: e */
    private final ExecutorService f21961e;

    public C11108a() {
        this(new ThreadPoolExecutor(256, 256, 60, TimeUnit.SECONDS, new LinkedBlockingQueue()));
    }

    public C11108a(ExecutorService executorService) {
        this.f21961e = executorService;
    }

    /* renamed from: e0 */
    public boolean mo35291e0(Runnable runnable) {
        try {
            this.f21961e.execute(runnable);
            return true;
        } catch (RejectedExecutionException e) {
            f21960f.mo35495k(e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public void mo34263q0() {
        super.mo34263q0();
        this.f21961e.shutdownNow();
    }

    /* renamed from: v */
    public boolean mo35292v() {
        ExecutorService executorService = this.f21961e;
        if (!(executorService instanceof ThreadPoolExecutor)) {
            return false;
        }
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
        return threadPoolExecutor.getPoolSize() == threadPoolExecutor.getMaximumPoolSize() && threadPoolExecutor.getQueue().size() >= threadPoolExecutor.getPoolSize() - threadPoolExecutor.getActiveCount();
    }
}
