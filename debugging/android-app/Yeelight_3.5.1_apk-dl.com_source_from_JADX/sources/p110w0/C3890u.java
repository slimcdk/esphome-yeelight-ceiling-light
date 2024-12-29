package p110w0;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p077o1.C3502b;

/* renamed from: w0.u */
class C3890u<T> implements C3502b<Set<T>> {

    /* renamed from: a */
    private volatile Set<C3502b<T>> f6526a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: b */
    private volatile Set<T> f6527b = null;

    C3890u(Collection<C3502b<T>> collection) {
        this.f6526a.addAll(collection);
    }

    /* renamed from: b */
    static C3890u<?> m11071b(Collection<C3502b<?>> collection) {
        return new C3890u<>((Set) collection);
    }

    /* renamed from: d */
    private synchronized void m11072d() {
        for (C3502b<T> bVar : this.f6526a) {
            this.f6527b.add(bVar.get());
        }
        this.f6526a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo26377a(C3502b<T> bVar) {
        Set set;
        T t;
        if (this.f6527b == null) {
            set = this.f6526a;
            t = bVar;
        } else {
            set = this.f6527b;
            t = bVar.get();
        }
        set.add(t);
    }

    /* renamed from: c */
    public Set<T> get() {
        if (this.f6527b == null) {
            synchronized (this) {
                if (this.f6527b == null) {
                    this.f6527b = Collections.newSetFromMap(new ConcurrentHashMap());
                    m11072d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f6527b);
    }
}
