package p163g;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: g.u */
public class C4417u {

    /* renamed from: d */
    public static final C4417u f7967d = new C4418a();

    /* renamed from: a */
    private boolean f7968a;

    /* renamed from: b */
    private long f7969b;

    /* renamed from: c */
    private long f7970c;

    /* renamed from: g.u$a */
    class C4418a extends C4417u {
        C4418a() {
        }

        /* renamed from: d */
        public C4417u mo24314d(long j) {
            return this;
        }

        /* renamed from: f */
        public void mo24316f() {
        }

        /* renamed from: g */
        public C4417u mo24317g(long j, TimeUnit timeUnit) {
            return this;
        }
    }

    /* renamed from: a */
    public C4417u mo24311a() {
        this.f7968a = false;
        return this;
    }

    /* renamed from: b */
    public C4417u mo24312b() {
        this.f7970c = 0;
        return this;
    }

    /* renamed from: c */
    public long mo24313c() {
        if (this.f7968a) {
            return this.f7969b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* renamed from: d */
    public C4417u mo24314d(long j) {
        this.f7968a = true;
        this.f7969b = j;
        return this;
    }

    /* renamed from: e */
    public boolean mo24315e() {
        return this.f7968a;
    }

    /* renamed from: f */
    public void mo24316f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f7968a && this.f7969b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: g */
    public C4417u mo24317g(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0: " + j);
        } else if (timeUnit != null) {
            this.f7970c = timeUnit.toNanos(j);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    /* renamed from: h */
    public long mo24318h() {
        return this.f7970c;
    }
}
