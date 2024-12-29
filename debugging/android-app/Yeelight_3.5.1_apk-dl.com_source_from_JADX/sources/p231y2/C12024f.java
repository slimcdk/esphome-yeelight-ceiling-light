package p231y2;

/* renamed from: y2.f */
public abstract class C12024f implements Runnable {

    /* renamed from: a */
    protected final String f22044a;

    public C12024f(String str, Object... objArr) {
        this.f22044a = String.format(str, objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo27856c();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f22044a);
        try {
            mo27856c();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
