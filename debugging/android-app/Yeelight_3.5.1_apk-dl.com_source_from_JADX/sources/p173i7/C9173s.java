package p173i7;

import com.squareup.okhttp.C4302q;
import com.squareup.okhttp.C4310u;
import com.squareup.okhttp.C4315w;
import com.squareup.okhttp.C4321y;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import p173i7.C9136d;
import p173i7.C9138e;

/* renamed from: i7.s */
public final class C9173s {

    /* renamed from: a */
    private final Map<Method, C9148k<?>> f16985a;

    /* renamed from: b */
    private final C4310u f16986b;

    /* renamed from: c */
    private final C9130a f16987c;

    /* renamed from: d */
    private final List<C9138e.C9139a> f16988d;

    /* renamed from: e */
    private final List<C9136d.C9137a> f16989e;

    /* renamed from: f */
    private final boolean f16990f;

    /* renamed from: i7.s$a */
    class C9174a implements InvocationHandler {

        /* renamed from: a */
        private final C9153m f16991a = C9153m.m21994c();

        /* renamed from: b */
        final /* synthetic */ Class f16992b;

        C9174a(Class cls) {
            this.f16992b = cls;
        }

        public Object invoke(Object obj, Method method, Object... objArr) {
            return method.getDeclaringClass() == Object.class ? method.invoke(this, objArr) : this.f16991a.mo37235e(method) ? this.f16991a.mo37234d(method, this.f16992b, obj, objArr) : C9173s.this.mo37256f(method).mo37229d(objArr);
        }
    }

    /* renamed from: i7.s$b */
    public static final class C9175b {

        /* renamed from: a */
        private C4310u f16994a;

        /* renamed from: b */
        private C9130a f16995b;

        /* renamed from: c */
        private List<C9138e.C9139a> f16996c = new ArrayList();

        /* renamed from: d */
        private List<C9136d.C9137a> f16997d = new ArrayList();

        /* renamed from: e */
        private Executor f16998e;

        /* renamed from: f */
        private boolean f16999f;

        /* renamed from: i7.s$b$a */
        class C9176a implements C9130a {

            /* renamed from: a */
            final /* synthetic */ C4302q f17000a;

            C9176a(C9175b bVar, C4302q qVar) {
                this.f17000a = qVar;
            }

            /* renamed from: a */
            public C4302q mo37218a() {
                return this.f17000a;
            }
        }

        public C9175b() {
            this.f16996c.add(new C9131b());
        }

        /* renamed from: a */
        public C9175b mo37261a(C9136d.C9137a aVar) {
            this.f16997d.add(C9177t.m22060a(aVar, "factory == null"));
            return this;
        }

        /* renamed from: b */
        public C9175b mo37262b(C9138e.C9139a aVar) {
            this.f16996c.add(C9177t.m22060a(aVar, "converterFactory == null"));
            return this;
        }

        /* renamed from: c */
        public C9175b mo37263c(C4302q qVar) {
            C9177t.m22060a(qVar, "baseUrl == null");
            return mo37264d(new C9176a(this, qVar));
        }

        /* renamed from: d */
        public C9175b mo37264d(C9130a aVar) {
            this.f16995b = (C9130a) C9177t.m22060a(aVar, "baseUrl == null");
            return this;
        }

        /* renamed from: e */
        public C9175b mo37265e(String str) {
            C9177t.m22060a(str, "baseUrl == null");
            C4302q u = C4302q.m12014u(str);
            if (u != null) {
                return mo37263c(u);
            }
            throw new IllegalArgumentException("Illegal URL: " + str);
        }

        /* renamed from: f */
        public C9173s mo37266f() {
            if (this.f16995b != null) {
                C4310u uVar = this.f16994a;
                if (uVar == null) {
                    uVar = new C4310u();
                }
                C4310u uVar2 = uVar;
                ArrayList arrayList = new ArrayList(this.f16997d);
                arrayList.add(C9153m.m21994c().mo37233a(this.f16998e));
                return new C9173s(uVar2, this.f16995b, new ArrayList(this.f16996c), arrayList, this.f16998e, this.f16999f, (C9174a) null);
            }
            throw new IllegalStateException("Base URL required.");
        }

        /* renamed from: g */
        public C9175b mo37267g(C4310u uVar) {
            this.f16994a = (C4310u) C9177t.m22060a(uVar, "client == null");
            return this;
        }
    }

    private C9173s(C4310u uVar, C9130a aVar, List<C9138e.C9139a> list, List<C9136d.C9137a> list2, Executor executor, boolean z) {
        this.f16985a = new LinkedHashMap();
        this.f16986b = uVar;
        this.f16987c = aVar;
        this.f16988d = list;
        this.f16989e = list2;
        this.f16990f = z;
    }

    /* synthetic */ C9173s(C4310u uVar, C9130a aVar, List list, List list2, Executor executor, boolean z, C9174a aVar2) {
        this(uVar, aVar, list, list2, executor, z);
    }

    /* renamed from: e */
    private void m22043e(Class<?> cls) {
        C9153m c = C9153m.m21994c();
        for (Method method : cls.getDeclaredMethods()) {
            if (!c.mo37235e(method)) {
                mo37256f(method);
            }
        }
    }

    /* renamed from: a */
    public C9130a mo37252a() {
        return this.f16987c;
    }

    /* renamed from: b */
    public C9136d<?> mo37253b(Type type, Annotation[] annotationArr) {
        return mo37257g((C9136d.C9137a) null, type, annotationArr);
    }

    /* renamed from: c */
    public C4310u mo37254c() {
        return this.f16986b;
    }

    /* renamed from: d */
    public <T> T mo37255d(Class<T> cls) {
        C9177t.m22070k(cls);
        if (this.f16990f) {
            m22043e(cls);
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C9174a(cls));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C9148k<?> mo37256f(Method method) {
        C9148k<?> kVar;
        synchronized (this.f16985a) {
            kVar = this.f16985a.get(method);
            if (kVar == null) {
                kVar = C9148k.m21975a(this, method);
                this.f16985a.put(method, kVar);
            }
        }
        return kVar;
    }

    /* renamed from: g */
    public C9136d<?> mo37257g(C9136d.C9137a aVar, Type type, Annotation[] annotationArr) {
        C9177t.m22060a(type, "returnType == null");
        C9177t.m22060a(annotationArr, "annotations == null");
        int indexOf = this.f16989e.indexOf(aVar) + 1;
        int size = this.f16989e.size();
        for (int i = indexOf; i < size; i++) {
            C9136d<?> dVar = this.f16989e.get(i).get(type, annotationArr, this);
            if (dVar != null) {
                return dVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(". Tried:");
        int size2 = this.f16989e.size();
        for (int i2 = indexOf; i2 < size2; i2++) {
            sb.append("\n * ");
            sb.append(this.f16989e.get(i2).getClass().getName());
        }
        if (aVar != null) {
            sb.append("\nSkipped:");
            for (int i3 = 0; i3 < indexOf; i3++) {
                sb.append("\n * ");
                sb.append(this.f16989e.get(i3).getClass().getName());
            }
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: h */
    public <T> C9138e<T, C4315w> mo37258h(Type type, Annotation[] annotationArr) {
        C9177t.m22060a(type, "type == null");
        C9177t.m22060a(annotationArr, "annotations == null");
        int size = this.f16988d.size();
        for (int i = 0; i < size; i++) {
            C9138e<?, C4315w> requestBody = this.f16988d.get(i).toRequestBody(type, annotationArr);
            if (requestBody != null) {
                return requestBody;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(". Tried:");
        for (C9138e.C9139a aVar : this.f16988d) {
            sb.append("\n * ");
            sb.append(aVar.getClass().getName());
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: i */
    public <T> C9138e<C4321y, T> mo37259i(Type type, Annotation[] annotationArr) {
        C9177t.m22060a(type, "type == null");
        C9177t.m22060a(annotationArr, "annotations == null");
        int size = this.f16988d.size();
        for (int i = 0; i < size; i++) {
            C9138e<C4321y, ?> fromResponseBody = this.f16988d.get(i).fromResponseBody(type, annotationArr);
            if (fromResponseBody != null) {
                return fromResponseBody;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(". Tried:");
        for (C9138e.C9139a aVar : this.f16988d) {
            sb.append("\n * ");
            sb.append(aVar.getClass().getName());
        }
        throw new IllegalArgumentException(sb.toString());
    }
}
