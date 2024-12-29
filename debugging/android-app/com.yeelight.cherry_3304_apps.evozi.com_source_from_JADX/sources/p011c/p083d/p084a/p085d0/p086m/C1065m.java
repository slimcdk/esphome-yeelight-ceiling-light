package p011c.p083d.p084a.p085d0.p086m;

import java.util.concurrent.CountDownLatch;

/* renamed from: c.d.a.d0.m.m */
public final class C1065m {

    /* renamed from: a */
    private final CountDownLatch f1511a = new CountDownLatch(1);

    /* renamed from: b */
    private long f1512b = -1;

    /* renamed from: c */
    private long f1513c = -1;

    C1065m() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9574a() {
        if (this.f1513c == -1) {
            long j = this.f1512b;
            if (j != -1) {
                this.f1513c = j - 1;
                this.f1511a.countDown();
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9575b() {
        if (this.f1513c != -1 || this.f1512b == -1) {
            throw new IllegalStateException();
        }
        this.f1513c = System.nanoTime();
        this.f1511a.countDown();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9576c() {
        if (this.f1512b == -1) {
            this.f1512b = System.nanoTime();
            return;
        }
        throw new IllegalStateException();
    }
}
