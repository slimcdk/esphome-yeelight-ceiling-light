package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.d */
public final class C2825d<T> {

    /* renamed from: a */
    private final Set<Class<? super T>> f5448a;

    /* renamed from: b */
    private final Set<C2843n> f5449b;

    /* renamed from: c */
    private final int f5450c;

    /* renamed from: d */
    private final int f5451d;

    /* renamed from: e */
    private final C2833g<T> f5452e;

    /* renamed from: f */
    private final Set<Class<?>> f5453f;

    /* renamed from: com.google.firebase.components.d$b */
    public static class C2827b<T> {

        /* renamed from: a */
        private final Set<Class<? super T>> f5454a;

        /* renamed from: b */
        private final Set<C2843n> f5455b;

        /* renamed from: c */
        private int f5456c;

        /* renamed from: d */
        private int f5457d;

        /* renamed from: e */
        private C2833g<T> f5458e;

        /* renamed from: f */
        private Set<Class<?>> f5459f;

        @SafeVarargs
        private C2827b(Class<T> cls, Class<? super T>... clsArr) {
            this.f5454a = new HashSet();
            this.f5455b = new HashSet();
            this.f5456c = 0;
            this.f5457d = 0;
            this.f5459f = new HashSet();
            C2850u.m8661c(cls, "Null interface");
            this.f5454a.add(cls);
            for (Class<? super T> c : clsArr) {
                C2850u.m8661c(c, "Null interface");
            }
            Collections.addAll(this.f5454a, clsArr);
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public C2827b<T> m8602g() {
            this.f5457d = 1;
            return this;
        }

        /* renamed from: h */
        private C2827b<T> m8603h(int i) {
            C2850u.m8662d(this.f5456c == 0, "Instantiation type has already been set.");
            this.f5456c = i;
            return this;
        }

        /* renamed from: i */
        private void m8604i(Class<?> cls) {
            C2850u.m8659a(!this.f5454a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* renamed from: b */
        public C2827b<T> mo17084b(C2843n nVar) {
            C2850u.m8661c(nVar, "Null dependency");
            m8604i(nVar.mo17104a());
            this.f5455b.add(nVar);
            return this;
        }

        /* renamed from: c */
        public C2827b<T> mo17085c() {
            m8603h(1);
            return this;
        }

        /* renamed from: d */
        public C2825d<T> mo17086d() {
            C2850u.m8662d(this.f5458e != null, "Missing required property: factory.");
            return new C2825d(new HashSet(this.f5454a), new HashSet(this.f5455b), this.f5456c, this.f5457d, this.f5458e, this.f5459f);
        }

        /* renamed from: e */
        public C2827b<T> mo17087e() {
            m8603h(2);
            return this;
        }

        /* renamed from: f */
        public C2827b<T> mo17088f(C2833g<T> gVar) {
            C2850u.m8661c(gVar, "Null factory");
            this.f5458e = gVar;
            return this;
        }
    }

    private C2825d(Set<Class<? super T>> set, Set<C2843n> set2, int i, int i2, C2833g<T> gVar, Set<Class<?>> set3) {
        this.f5448a = Collections.unmodifiableSet(set);
        this.f5449b = Collections.unmodifiableSet(set2);
        this.f5450c = i;
        this.f5451d = i2;
        this.f5452e = gVar;
        this.f5453f = Collections.unmodifiableSet(set3);
    }

    /* renamed from: a */
    public static <T> C2827b<T> m8587a(Class<T> cls) {
        return new C2827b<>(cls, new Class[0]);
    }

    @SafeVarargs
    /* renamed from: b */
    public static <T> C2827b<T> m8588b(Class<T> cls, Class<? super T>... clsArr) {
        return new C2827b<>(cls, clsArr);
    }

    /* renamed from: g */
    public static <T> C2825d<T> m8589g(T t, Class<T> cls) {
        C2827b<T> h = m8590h(cls);
        h.mo17088f(C2824c.m8585b(t));
        return h.mo17086d();
    }

    /* renamed from: h */
    public static <T> C2827b<T> m8590h(Class<T> cls) {
        C2827b<T> a = m8587a(cls);
        C2827b unused = a.m8602g();
        return a;
    }

    /* renamed from: l */
    static /* synthetic */ Object m8591l(Object obj, C2828e eVar) {
        return obj;
    }

    /* renamed from: m */
    static /* synthetic */ Object m8592m(Object obj, C2828e eVar) {
        return obj;
    }

    @SafeVarargs
    /* renamed from: n */
    public static <T> C2825d<T> m8593n(T t, Class<T> cls, Class<? super T>... clsArr) {
        C2827b<T> b = m8588b(cls, clsArr);
        b.mo17088f(C2823b.m8583b(t));
        return b.mo17086d();
    }

    /* renamed from: c */
    public Set<C2843n> mo17076c() {
        return this.f5449b;
    }

    /* renamed from: d */
    public C2833g<T> mo17077d() {
        return this.f5452e;
    }

    /* renamed from: e */
    public Set<Class<? super T>> mo17078e() {
        return this.f5448a;
    }

    /* renamed from: f */
    public Set<Class<?>> mo17079f() {
        return this.f5453f;
    }

    /* renamed from: i */
    public boolean mo17080i() {
        return this.f5450c == 1;
    }

    /* renamed from: j */
    public boolean mo17081j() {
        return this.f5450c == 2;
    }

    /* renamed from: k */
    public boolean mo17082k() {
        return this.f5451d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f5448a.toArray()) + ">{" + this.f5450c + ", type=" + this.f5451d + ", deps=" + Arrays.toString(this.f5449b.toArray()) + "}";
    }
}
