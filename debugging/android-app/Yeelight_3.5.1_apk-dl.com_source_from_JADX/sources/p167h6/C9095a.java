package p167h6;

import java.util.concurrent.atomic.AtomicLong;
import org.eclipse.jetty.util.C9977a;

/* renamed from: h6.a */
public class C9095a {

    /* renamed from: a */
    protected final AtomicLong f16764a = new AtomicLong();

    /* renamed from: b */
    protected final AtomicLong f16765b = new AtomicLong();

    /* renamed from: c */
    protected final AtomicLong f16766c = new AtomicLong();

    /* renamed from: a */
    public void mo37107a(long j) {
        long addAndGet = this.f16765b.addAndGet(j);
        if (j > 0) {
            this.f16766c.addAndGet(j);
        }
        C9977a.m24654a(this.f16764a, addAndGet);
    }

    /* renamed from: b */
    public void mo37108b() {
        mo37107a(-1);
    }

    /* renamed from: c */
    public long mo37109c() {
        return this.f16765b.get();
    }

    /* renamed from: d */
    public long mo37110d() {
        return this.f16764a.get();
    }

    /* renamed from: e */
    public long mo37111e() {
        return this.f16766c.get();
    }

    /* renamed from: f */
    public void mo37112f() {
        mo37107a(1);
    }

    /* renamed from: g */
    public void mo37113g() {
        mo37114h(0);
    }

    /* renamed from: h */
    public void mo37114h(long j) {
        this.f16764a.set(j);
        this.f16765b.set(j);
        this.f16766c.set(0);
    }
}
