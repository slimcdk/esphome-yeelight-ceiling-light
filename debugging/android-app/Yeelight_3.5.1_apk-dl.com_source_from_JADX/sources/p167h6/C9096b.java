package p167h6;

import java.util.concurrent.atomic.AtomicLong;
import org.eclipse.jetty.util.C9977a;

/* renamed from: h6.b */
public class C9096b {

    /* renamed from: a */
    protected final AtomicLong f16767a = new AtomicLong();

    /* renamed from: b */
    protected final AtomicLong f16768b = new AtomicLong();

    /* renamed from: c */
    protected final AtomicLong f16769c = new AtomicLong();

    /* renamed from: d */
    protected final AtomicLong f16770d = new AtomicLong();

    /* renamed from: a */
    public long mo37115a() {
        return this.f16767a.get();
    }

    /* renamed from: b */
    public double mo37116b() {
        double d = (double) this.f16768b.get();
        double d2 = (double) this.f16769c.get();
        Double.isNaN(d);
        Double.isNaN(d2);
        return d / d2;
    }

    /* renamed from: c */
    public double mo37117c() {
        return Math.sqrt(mo37119e());
    }

    /* renamed from: d */
    public long mo37118d() {
        return this.f16768b.get();
    }

    /* renamed from: e */
    public double mo37119e() {
        long j = this.f16770d.get();
        long j2 = this.f16769c.get();
        if (j2 <= 1) {
            return 0.0d;
        }
        double d = (double) j;
        Double.isNaN(d);
        double d2 = (double) (j2 - 1);
        Double.isNaN(d2);
        return (d / 100.0d) / d2;
    }

    /* renamed from: f */
    public void mo37120f() {
        this.f16767a.set(0);
        this.f16768b.set(0);
        this.f16769c.set(0);
        this.f16770d.set(0);
    }

    /* renamed from: g */
    public void mo37121g(long j) {
        long addAndGet = this.f16768b.addAndGet(j);
        long incrementAndGet = this.f16769c.incrementAndGet();
        if (incrementAndGet > 1) {
            long j2 = (10 * j) - ((addAndGet * 10) / incrementAndGet);
            this.f16770d.addAndGet(j2 * j2);
        }
        C9977a.m24654a(this.f16767a, j);
    }
}
