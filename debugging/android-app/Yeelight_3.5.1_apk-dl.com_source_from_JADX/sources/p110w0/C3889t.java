package p110w0;

import p077o1.C3502b;

/* renamed from: w0.t */
public class C3889t<T> implements C3502b<T> {

    /* renamed from: c */
    private static final Object f6523c = new Object();

    /* renamed from: a */
    private volatile Object f6524a = f6523c;

    /* renamed from: b */
    private volatile C3502b<T> f6525b;

    public C3889t(C3502b<T> bVar) {
        this.f6525b = bVar;
    }

    public T get() {
        T t = this.f6524a;
        T t2 = f6523c;
        if (t == t2) {
            synchronized (this) {
                t = this.f6524a;
                if (t == t2) {
                    t = this.f6525b.get();
                    this.f6524a = t;
                    this.f6525b = null;
                }
            }
        }
        return t;
    }
}
