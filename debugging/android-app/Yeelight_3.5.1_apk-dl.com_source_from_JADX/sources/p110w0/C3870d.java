package p110w0;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: w0.d */
public final class C3870d<T> {

    /* renamed from: a */
    private final Set<Class<? super T>> f6488a;

    /* renamed from: b */
    private final Set<C3887q> f6489b;

    /* renamed from: c */
    private final int f6490c;

    /* renamed from: d */
    private final int f6491d;

    /* renamed from: e */
    private final C3878h<T> f6492e;

    /* renamed from: f */
    private final Set<Class<?>> f6493f;

    /* renamed from: w0.d$b */
    public static class C3872b<T> {

        /* renamed from: a */
        private final Set<Class<? super T>> f6494a;

        /* renamed from: b */
        private final Set<C3887q> f6495b;

        /* renamed from: c */
        private int f6496c;

        /* renamed from: d */
        private int f6497d;

        /* renamed from: e */
        private C3878h<T> f6498e;

        /* renamed from: f */
        private Set<Class<?>> f6499f;

        @SafeVarargs
        private C3872b(Class<T> cls, Class<? super T>... clsArr) {
            HashSet hashSet = new HashSet();
            this.f6494a = hashSet;
            this.f6495b = new HashSet();
            this.f6496c = 0;
            this.f6497d = 0;
            this.f6499f = new HashSet();
            C3892z.m11087c(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> c : clsArr) {
                C3892z.m11087c(c, "Null interface");
            }
            Collections.addAll(this.f6494a, clsArr);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public C3872b<T> m10997f() {
            this.f6497d = 1;
            return this;
        }

        /* renamed from: g */
        private C3872b<T> m10998g(int i) {
            C3892z.m11088d(this.f6496c == 0, "Instantiation type has already been set.");
            this.f6496c = i;
            return this;
        }

        /* renamed from: h */
        private void m10999h(Class<?> cls) {
            C3892z.m11085a(!this.f6494a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* renamed from: b */
        public C3872b<T> mo26346b(C3887q qVar) {
            C3892z.m11087c(qVar, "Null dependency");
            m10999h(qVar.mo26367c());
            this.f6495b.add(qVar);
            return this;
        }

        /* renamed from: c */
        public C3870d<T> mo26347c() {
            C3892z.m11088d(this.f6498e != null, "Missing required property: factory.");
            return new C3870d(new HashSet(this.f6494a), new HashSet(this.f6495b), this.f6496c, this.f6497d, this.f6498e, this.f6499f);
        }

        /* renamed from: d */
        public C3872b<T> mo26348d() {
            return m10998g(2);
        }

        /* renamed from: e */
        public C3872b<T> mo26349e(C3878h<T> hVar) {
            this.f6498e = (C3878h) C3892z.m11087c(hVar, "Null factory");
            return this;
        }
    }

    private C3870d(Set<Class<? super T>> set, Set<C3887q> set2, int i, int i2, C3878h<T> hVar, Set<Class<?>> set3) {
        this.f6488a = Collections.unmodifiableSet(set);
        this.f6489b = Collections.unmodifiableSet(set2);
        this.f6490c = i;
        this.f6491d = i2;
        this.f6492e = hVar;
        this.f6493f = Collections.unmodifiableSet(set3);
    }

    /* renamed from: c */
    public static <T> C3872b<T> m10982c(Class<T> cls) {
        return new C3872b<>(cls, new Class[0]);
    }

    @SafeVarargs
    /* renamed from: d */
    public static <T> C3872b<T> m10983d(Class<T> cls, Class<? super T>... clsArr) {
        return new C3872b<>(cls, clsArr);
    }

    /* renamed from: i */
    public static <T> C3870d<T> m10984i(T t, Class<T> cls) {
        return m10985j(cls).mo26349e(new C10554b(t)).mo26347c();
    }

    /* renamed from: j */
    public static <T> C3872b<T> m10985j(Class<T> cls) {
        return m10982c(cls).m10997f();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ Object m10986n(Object obj, C3873e eVar) {
        return obj;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ Object m10987o(Object obj, C3873e eVar) {
        return obj;
    }

    @SafeVarargs
    /* renamed from: p */
    public static <T> C3870d<T> m10988p(T t, Class<T> cls, Class<? super T>... clsArr) {
        return m10983d(cls, clsArr).mo26349e(new C10555c(t)).mo26347c();
    }

    /* renamed from: e */
    public Set<C3887q> mo26338e() {
        return this.f6489b;
    }

    /* renamed from: f */
    public C3878h<T> mo26339f() {
        return this.f6492e;
    }

    /* renamed from: g */
    public Set<Class<? super T>> mo26340g() {
        return this.f6488a;
    }

    /* renamed from: h */
    public Set<Class<?>> mo26341h() {
        return this.f6493f;
    }

    /* renamed from: k */
    public boolean mo26342k() {
        return this.f6490c == 1;
    }

    /* renamed from: l */
    public boolean mo26343l() {
        return this.f6490c == 2;
    }

    /* renamed from: m */
    public boolean mo26344m() {
        return this.f6491d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f6488a.toArray()) + ">{" + this.f6490c + ", type=" + this.f6491d + ", deps=" + Arrays.toString(this.f6489b.toArray()) + "}";
    }
}
