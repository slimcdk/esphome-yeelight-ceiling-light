package p011c.p012a.p019b.p028b.p032c.p035c;

import androidx.annotation.NonNull;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: c.a.b.b.c.c.c */
final class C0577c implements C0576b {
    private C0577c() {
    }

    @NonNull
    /* renamed from: a */
    public final ScheduledExecutorService mo8552a(int i, ThreadFactory threadFactory, int i2) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadFactory));
    }
}
