package p011c.p083d.p084a.p085d0;

/* renamed from: c.d.a.d0.f */
public abstract class C1015f implements Runnable {

    /* renamed from: a */
    protected final String f1322a;

    public C1015f(String str, Object... objArr) {
        this.f1322a = String.format(str, objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo9465b();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f1322a);
        try {
            mo9465b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
