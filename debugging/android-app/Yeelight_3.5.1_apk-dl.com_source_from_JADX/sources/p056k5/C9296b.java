package p056k5;

/* renamed from: k5.b */
public abstract class C9296b implements Runnable {

    /* renamed from: a */
    protected final String f17220a;

    public C9296b(String str, Object... objArr) {
        this.f17220a = C3300c.m8932q(str, objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo24648c();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f17220a);
        try {
            mo24648c();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
