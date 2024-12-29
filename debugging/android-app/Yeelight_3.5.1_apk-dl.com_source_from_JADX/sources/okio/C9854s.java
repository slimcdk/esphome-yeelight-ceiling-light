package okio;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: okio.s */
public class C9854s {

    /* renamed from: d */
    public static final C9854s f17853d = new C9855a();

    /* renamed from: a */
    private boolean f17854a;

    /* renamed from: b */
    private long f17855b;

    /* renamed from: c */
    private long f17856c;

    /* renamed from: okio.s$a */
    class C9855a extends C9854s {
        C9855a() {
        }

        /* renamed from: d */
        public C9854s mo39088d(long j) {
            return this;
        }

        /* renamed from: f */
        public void mo39090f() {
        }

        /* renamed from: g */
        public C9854s mo39091g(long j, TimeUnit timeUnit) {
            return this;
        }
    }

    /* renamed from: a */
    public C9854s mo39085a() {
        this.f17854a = false;
        return this;
    }

    /* renamed from: b */
    public C9854s mo39086b() {
        this.f17856c = 0;
        return this;
    }

    /* renamed from: c */
    public long mo39087c() {
        if (this.f17854a) {
            return this.f17855b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* renamed from: d */
    public C9854s mo39088d(long j) {
        this.f17854a = true;
        this.f17855b = j;
        return this;
    }

    /* renamed from: e */
    public boolean mo39089e() {
        return this.f17854a;
    }

    /* renamed from: f */
    public void mo39090f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f17854a && this.f17855b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: g */
    public C9854s mo39091g(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0: " + j);
        } else if (timeUnit != null) {
            this.f17856c = timeUnit.toNanos(j);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    /* renamed from: h */
    public long mo39109h() {
        return this.f17856c;
    }
}
