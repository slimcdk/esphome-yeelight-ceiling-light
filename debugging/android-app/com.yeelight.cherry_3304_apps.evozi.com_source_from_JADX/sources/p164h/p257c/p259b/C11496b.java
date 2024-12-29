package p164h.p257c.p259b;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: h.c.b.b */
public abstract class C11496b<E> implements Iterator<E> {

    /* renamed from: a */
    final Iterator<E> f22850a;

    /* renamed from: b */
    int f22851b = 0;

    /* renamed from: c */
    boolean f22852c = false;

    public C11496b(Collection<E> collection) {
        this.f22850a = new CopyOnWriteArrayList(collection).iterator();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo36332a(int i);

    public boolean hasNext() {
        return this.f22850a.hasNext();
    }

    public E next() {
        this.f22852c = false;
        this.f22851b++;
        return this.f22850a.next();
    }

    public void remove() {
        int i = this.f22851b;
        if (i == 0) {
            throw new IllegalStateException("Call next() first");
        } else if (!this.f22852c) {
            mo36332a(i - 1);
            this.f22852c = true;
        } else {
            throw new IllegalStateException("Already removed current, call next()");
        }
    }
}
