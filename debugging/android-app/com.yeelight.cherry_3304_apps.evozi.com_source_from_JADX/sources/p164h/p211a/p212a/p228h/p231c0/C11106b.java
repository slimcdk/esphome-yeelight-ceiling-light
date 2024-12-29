package p164h.p211a.p212a.p228h.p231c0;

import java.util.concurrent.atomic.AtomicLong;
import p164h.p211a.p212a.p228h.C11094a;

/* renamed from: h.a.a.h.c0.b */
public class C11106b {

    /* renamed from: a */
    protected final AtomicLong f21954a = new AtomicLong();

    /* renamed from: b */
    protected final AtomicLong f21955b = new AtomicLong();

    /* renamed from: c */
    protected final AtomicLong f21956c = new AtomicLong();

    /* renamed from: d */
    protected final AtomicLong f21957d = new AtomicLong();

    /* renamed from: a */
    public void mo35290a(long j) {
        long addAndGet = this.f21955b.addAndGet(j);
        long incrementAndGet = this.f21956c.incrementAndGet();
        if (incrementAndGet > 1) {
            long j2 = (10 * j) - ((addAndGet * 10) / incrementAndGet);
            this.f21957d.addAndGet(j2 * j2);
        }
        C11094a.m28754a(this.f21954a, j);
    }
}
