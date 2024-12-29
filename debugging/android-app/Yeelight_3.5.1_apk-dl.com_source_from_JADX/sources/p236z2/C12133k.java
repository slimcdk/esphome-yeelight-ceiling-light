package p236z2;

import java.util.concurrent.CountDownLatch;

/* renamed from: z2.k */
public final class C12133k {

    /* renamed from: a */
    private final CountDownLatch f22293a = new CountDownLatch(1);

    /* renamed from: b */
    private long f22294b = -1;

    /* renamed from: c */
    private long f22295c = -1;

    C12133k() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo42893a() {
        if (this.f22295c == -1) {
            long j = this.f22294b;
            if (j != -1) {
                this.f22295c = j - 1;
                this.f22293a.countDown();
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo42894b() {
        if (this.f22295c != -1 || this.f22294b == -1) {
            throw new IllegalStateException();
        }
        this.f22295c = System.nanoTime();
        this.f22293a.countDown();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo42895c() {
        if (this.f22294b == -1) {
            this.f22294b = System.nanoTime();
            return;
        }
        throw new IllegalStateException();
    }
}
