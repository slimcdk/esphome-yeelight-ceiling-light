package p173j;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import p156f.C4322b0;
import p156f.C4336d0;
import p156f.C4338e;
import p156f.C4390t;
import p156f.C4396x;
import p173j.C11567a;
import p173j.C11573c;
import p173j.C11575e;
import p173j.C4480n;

/* renamed from: j.m */
public final class C4477m {

    /* renamed from: a */
    private final Map<Method, C4480n<?, ?>> f8072a = new ConcurrentHashMap();

    /* renamed from: b */
    final C4338e.C4339a f8073b;

    /* renamed from: c */
    final C4390t f8074c;

    /* renamed from: d */
    final List<C11575e.C4448a> f8075d;

    /* renamed from: e */
    final List<C11573c.C4447a> f8076e;

    /* renamed from: f */
    final boolean f8077f;

    /* renamed from: j.m$a */
    class C4478a implements InvocationHandler {

        /* renamed from: a */
        private final C4470j f8078a = C4470j.m13165d();

        /* renamed from: b */
        final /* synthetic */ Class f8079b;

        C4478a(Class cls) {
            this.f8079b = cls;
        }

        public Object invoke(Object obj, Method method, @Nullable Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (this.f8078a.mo24551f(method)) {
                return this.f8078a.mo24550e(method, this.f8079b, obj, objArr);
            }
            C4480n<?, ?> f = C4477m.this.mo24571f(method);
            return f.mo24584a(new C4449h(f, objArr));
        }
    }

    /* renamed from: j.m$b */
    public static final class C4479b {

        /* renamed from: a */
        private final C4470j f8081a;
        @Nullable

        /* renamed from: b */
        private C4338e.C4339a f8082b;

        /* renamed from: c */
        private C4390t f8083c;

        /* renamed from: d */
        private final List<C11575e.C4448a> f8084d;

        /* renamed from: e */
        private final List<C11573c.C4447a> f8085e;
        @Nullable

        /* renamed from: f */
        private Executor f8086f;

        /* renamed from: g */
        private boolean f8087g;

        public C4479b() {
            this(C4470j.m13165d());
        }

        C4479b(C4470j jVar) {
            this.f8084d = new ArrayList();
            this.f8085e = new ArrayList();
            this.f8081a = jVar;
        }

        /* renamed from: a */
        public C4479b mo24579a(String str) {
            C4482o.m13230b(str, "baseUrl == null");
            C4390t r = C4390t.m12624r(str);
            if (r != null) {
                mo24580b(r);
                return this;
            }
            throw new IllegalArgumentException("Illegal URL: " + str);
        }

        /* renamed from: b */
        public C4479b mo24580b(C4390t tVar) {
            C4482o.m13230b(tVar, "baseUrl == null");
            List<String> s = tVar.mo24118s();
            if ("".equals(s.get(s.size() - 1))) {
                this.f8083c = tVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + tVar);
        }

        /* renamed from: c */
        public C4477m mo24581c() {
            if (this.f8083c != null) {
                C4338e.C4339a aVar = this.f8082b;
                if (aVar == null) {
                    aVar = new C4396x();
                }
                C4338e.C4339a aVar2 = aVar;
                Executor executor = this.f8086f;
                if (executor == null) {
                    executor = this.f8081a.mo24549b();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f8085e);
                arrayList.add(this.f8081a.mo24548a(executor2));
                ArrayList arrayList2 = new ArrayList(this.f8084d.size() + 1);
                arrayList2.add(new C11567a());
                arrayList2.addAll(this.f8084d);
                return new C4477m(aVar2, this.f8083c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.f8087g);
            }
            throw new IllegalStateException("Base URL required.");
        }

        /* renamed from: d */
        public C4479b mo24582d(C4338e.C4339a aVar) {
            C4482o.m13230b(aVar, "factory == null");
            this.f8082b = aVar;
            return this;
        }

        /* renamed from: e */
        public C4479b mo24583e(C4396x xVar) {
            C4482o.m13230b(xVar, "client == null");
            mo24582d(xVar);
            return this;
        }
    }

    C4477m(C4338e.C4339a aVar, C4390t tVar, List<C11575e.C4448a> list, List<C11573c.C4447a> list2, @Nullable Executor executor, boolean z) {
        this.f8073b = aVar;
        this.f8074c = tVar;
        this.f8075d = list;
        this.f8076e = list2;
        this.f8077f = z;
    }

    /* renamed from: e */
    private void m13194e(Class<?> cls) {
        C4470j d = C4470j.m13165d();
        for (Method method : cls.getDeclaredMethods()) {
            if (!d.mo24551f(method)) {
                mo24571f(method);
            }
        }
    }

    /* renamed from: a */
    public C4390t mo24567a() {
        return this.f8074c;
    }

    /* renamed from: b */
    public C11573c<?, ?> mo24568b(Type type, Annotation[] annotationArr) {
        return mo24572g((C11573c.C4447a) null, type, annotationArr);
    }

    /* renamed from: c */
    public C4338e.C4339a mo24569c() {
        return this.f8073b;
    }

    /* renamed from: d */
    public <T> T mo24570d(Class<T> cls) {
        C4482o.m13246r(cls);
        if (this.f8077f) {
            m13194e(cls);
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C4478a(cls));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C4480n<?, ?> mo24571f(Method method) {
        C4480n<?, ?> nVar;
        C4480n<?, ?> nVar2 = this.f8072a.get(method);
        if (nVar2 != null) {
            return nVar2;
        }
        synchronized (this.f8072a) {
            nVar = this.f8072a.get(method);
            if (nVar == null) {
                nVar = new C4480n.C4481a(this, method).mo24587a();
                this.f8072a.put(method, nVar);
            }
        }
        return nVar;
    }

    /* renamed from: g */
    public C11573c<?, ?> mo24572g(@Nullable C11573c.C4447a aVar, Type type, Annotation[] annotationArr) {
        C4482o.m13230b(type, "returnType == null");
        C4482o.m13230b(annotationArr, "annotations == null");
        int indexOf = this.f8076e.indexOf(aVar) + 1;
        int size = this.f8076e.size();
        for (int i = indexOf; i < size; i++) {
            C11573c<?, ?> a = this.f8076e.get(i).mo24529a(type, annotationArr, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f8076e.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f8076e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f8076e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: h */
    public <T> C11575e<T, C4322b0> mo24573h(@Nullable C11575e.C4448a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        C4482o.m13230b(type, "type == null");
        C4482o.m13230b(annotationArr, "parameterAnnotations == null");
        C4482o.m13230b(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f8075d.indexOf(aVar) + 1;
        int size = this.f8075d.size();
        for (int i = indexOf; i < size; i++) {
            C11575e<?, C4322b0> a = this.f8075d.get(i).mo24530a(type, annotationArr, annotationArr2, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f8075d.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f8075d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f8075d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: i */
    public <T> C11575e<C4336d0, T> mo24574i(@Nullable C11575e.C4448a aVar, Type type, Annotation[] annotationArr) {
        C4482o.m13230b(type, "type == null");
        C4482o.m13230b(annotationArr, "annotations == null");
        int indexOf = this.f8075d.indexOf(aVar) + 1;
        int size = this.f8075d.size();
        for (int i = indexOf; i < size; i++) {
            C11575e<C4336d0, ?> b = this.f8075d.get(i).mo24531b(type, annotationArr, this);
            if (b != null) {
                return b;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f8075d.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f8075d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f8075d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: j */
    public <T> C11575e<T, C4322b0> mo24575j(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return mo24573h((C11575e.C4448a) null, type, annotationArr, annotationArr2);
    }

    /* renamed from: k */
    public <T> C11575e<C4336d0, T> mo24576k(Type type, Annotation[] annotationArr) {
        return mo24574i((C11575e.C4448a) null, type, annotationArr);
    }

    /* renamed from: l */
    public <T> C11575e<T, String> mo24577l(Type type, Annotation[] annotationArr) {
        C4482o.m13230b(type, "type == null");
        C4482o.m13230b(annotationArr, "annotations == null");
        int size = this.f8075d.size();
        for (int i = 0; i < size; i++) {
            C11575e<?, String> c = this.f8075d.get(i).mo24532c(type, annotationArr, this);
            if (c != null) {
                return c;
            }
        }
        return C11567a.C11571d.f22992a;
    }
}
