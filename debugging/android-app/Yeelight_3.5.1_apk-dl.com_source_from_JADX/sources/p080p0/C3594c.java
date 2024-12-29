package p080p0;

/* renamed from: p0.c */
class C3594c {

    /* renamed from: a */
    private boolean f5992a;

    /* renamed from: b */
    private long f5993b;

    /* renamed from: c */
    private long f5994c;

    /* renamed from: d */
    private long f5995d;

    C3594c() {
    }

    /* renamed from: a */
    public synchronized long mo25890a() {
        if (this.f5992a) {
            this.f5994c = System.currentTimeMillis() - this.f5993b;
        }
        return this.f5994c;
    }

    /* renamed from: b */
    public synchronized void mo25891b() {
        if (this.f5992a) {
            this.f5993b = System.currentTimeMillis();
        } else {
            this.f5993b = 0;
        }
        this.f5995d = 0;
        this.f5994c = 0;
    }

    /* renamed from: c */
    public synchronized void mo25892c() {
        this.f5993b = System.currentTimeMillis();
        this.f5992a = true;
    }

    /* renamed from: d */
    public synchronized long mo25893d() {
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        this.f5995d = currentTimeMillis;
        j = currentTimeMillis - this.f5993b;
        this.f5994c = j;
        this.f5992a = false;
        return j;
    }

    public String toString() {
        return String.valueOf(mo25890a());
    }
}
