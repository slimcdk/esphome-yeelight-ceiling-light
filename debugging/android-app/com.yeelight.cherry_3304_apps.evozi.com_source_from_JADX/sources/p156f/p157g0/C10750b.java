package p156f.p157g0;

/* renamed from: f.g0.b */
public abstract class C10750b implements Runnable {

    /* renamed from: a */
    protected final String f20629a;

    public C10750b(String str, Object... objArr) {
        this.f20629a = C4345c.m12371r(str, objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo24189j();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f20629a);
        try {
            mo24189j();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
