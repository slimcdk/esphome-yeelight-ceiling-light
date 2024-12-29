package p110w0;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p066m1.C3343c;
import p077o1.C3500a;
import p077o1.C3502b;

/* renamed from: w0.a0 */
final class C3868a0 extends C3867a {

    /* renamed from: a */
    private final Set<Class<?>> f6480a;

    /* renamed from: b */
    private final Set<Class<?>> f6481b;

    /* renamed from: c */
    private final Set<Class<?>> f6482c;

    /* renamed from: d */
    private final Set<Class<?>> f6483d;

    /* renamed from: e */
    private final Set<Class<?>> f6484e;

    /* renamed from: f */
    private final Set<Class<?>> f6485f;

    /* renamed from: g */
    private final C3873e f6486g;

    /* renamed from: w0.a0$a */
    private static class C3869a implements C3343c {

        /* renamed from: a */
        private final C3343c f6487a;

        public C3869a(Set<Class<?>> set, C3343c cVar) {
            this.f6487a = cVar;
        }
    }

    C3868a0(C3870d<?> dVar, C3873e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C3887q next : dVar.mo26338e()) {
            if (next.mo26369e()) {
                boolean g = next.mo26372g();
                Class<?> c = next.mo26367c();
                if (g) {
                    hashSet4.add(c);
                } else {
                    hashSet.add(c);
                }
            } else if (next.mo26368d()) {
                hashSet3.add(next.mo26367c());
            } else {
                boolean g2 = next.mo26372g();
                Class<?> c2 = next.mo26367c();
                if (g2) {
                    hashSet5.add(c2);
                } else {
                    hashSet2.add(c2);
                }
            }
        }
        if (!dVar.mo26341h().isEmpty()) {
            hashSet.add(C3343c.class);
        }
        this.f6480a = Collections.unmodifiableSet(hashSet);
        this.f6481b = Collections.unmodifiableSet(hashSet2);
        this.f6482c = Collections.unmodifiableSet(hashSet3);
        this.f6483d = Collections.unmodifiableSet(hashSet4);
        this.f6484e = Collections.unmodifiableSet(hashSet5);
        this.f6485f = dVar.mo26341h();
        this.f6486g = eVar;
    }

    /* renamed from: a */
    public <T> T mo26333a(Class<T> cls) {
        if (this.f6480a.contains(cls)) {
            T a = this.f6486g.mo26333a(cls);
            return !cls.equals(C3343c.class) ? a : new C3869a(this.f6485f, (C3343c) a);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    /* renamed from: b */
    public <T> C3502b<T> mo26335b(Class<T> cls) {
        if (this.f6481b.contains(cls)) {
            return this.f6486g.mo26335b(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    /* renamed from: c */
    public <T> C3502b<Set<T>> mo26336c(Class<T> cls) {
        if (this.f6484e.contains(cls)) {
            return this.f6486g.mo26336c(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }

    /* renamed from: d */
    public <T> Set<T> mo26334d(Class<T> cls) {
        if (this.f6483d.contains(cls)) {
            return this.f6486g.mo26334d(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    /* renamed from: e */
    public <T> C3500a<T> mo26337e(Class<T> cls) {
        if (this.f6482c.contains(cls)) {
            return this.f6486g.mo26337e(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", new Object[]{cls}));
    }
}
