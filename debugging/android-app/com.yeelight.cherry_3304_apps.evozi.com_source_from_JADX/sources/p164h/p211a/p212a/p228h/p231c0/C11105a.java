package p164h.p211a.p212a.p228h.p231c0;

import java.util.concurrent.atomic.AtomicLong;
import p164h.p211a.p212a.p228h.C11094a;

/* renamed from: h.a.a.h.c0.a */
public class C11105a {

    /* renamed from: a */
    protected final AtomicLong f21951a = new AtomicLong();

    /* renamed from: b */
    protected final AtomicLong f21952b = new AtomicLong();

    /* renamed from: c */
    protected final AtomicLong f21953c = new AtomicLong();

    /* renamed from: a */
    public void mo35287a(long j) {
        long addAndGet = this.f21952b.addAndGet(j);
        if (j > 0) {
            this.f21953c.addAndGet(j);
        }
        C11094a.m28754a(this.f21951a, addAndGet);
    }

    /* renamed from: b */
    public void mo35288b() {
        mo35287a(-1);
    }

    /* renamed from: c */
    public void mo35289c() {
        mo35287a(1);
    }
}
