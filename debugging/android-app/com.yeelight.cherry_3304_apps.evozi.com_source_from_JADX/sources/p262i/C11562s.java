package p262i;

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
import p011c.p083d.p084a.C0988a0;
import p011c.p083d.p084a.C1133r;
import p011c.p083d.p084a.C1141v;
import p011c.p083d.p084a.C1147y;
import p262i.C11525d;
import p262i.C11527e;

/* renamed from: i.s */
public final class C11562s {

    /* renamed from: a */
    private final Map<Method, C11537k<?>> f22973a;

    /* renamed from: b */
    private final C1141v f22974b;

    /* renamed from: c */
    private final C11519a f22975c;

    /* renamed from: d */
    private final List<C11527e.C11528a> f22976d;

    /* renamed from: e */
    private final List<C11525d.C11526a> f22977e;

    /* renamed from: f */
    private final boolean f22978f;

    /* renamed from: i.s$a */
    class C11563a implements InvocationHandler {

        /* renamed from: a */
        private final C11542m f22979a = C11542m.m30286c();

        /* renamed from: b */
        final /* synthetic */ Class f22980b;

        C11563a(Class cls) {
            this.f22980b = cls;
        }

        public Object invoke(Object obj, Method method, Object... objArr) {
            return method.getDeclaringClass() == Object.class ? method.invoke(this, objArr) : this.f22979a.mo36459e(method) ? this.f22979a.mo36458d(method, this.f22980b, obj, objArr) : C11562s.this.mo36480f(method).mo36453d(objArr);
        }
    }

    /* renamed from: i.s$b */
    public static final class C11564b {

        /* renamed from: a */
        private C1141v f22982a;

        /* renamed from: b */
        private C11519a f22983b;

        /* renamed from: c */
        private List<C11527e.C11528a> f22984c = new ArrayList();

        /* renamed from: d */
        private List<C11525d.C11526a> f22985d = new ArrayList();

        /* renamed from: e */
        private Executor f22986e;

        /* renamed from: f */
        private boolean f22987f;

        /* renamed from: i.s$b$a */
        class C11565a implements C11519a {

            /* renamed from: a */
            final /* synthetic */ C1133r f22988a;

            C11565a(C11564b bVar, C1133r rVar) {
                this.f22988a = rVar;
            }

            /* renamed from: a */
            public C1133r mo36442a() {
                return this.f22988a;
            }
        }

        public C11564b() {
            this.f22984c.add(new C11520b());
        }

        /* renamed from: a */
        public C11564b mo36485a(C11525d.C11526a aVar) {
            List<C11525d.C11526a> list = this.f22985d;
            C11566t.m30352a(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: b */
        public C11564b mo36486b(C11527e.C11528a aVar) {
            List<C11527e.C11528a> list = this.f22984c;
            C11566t.m30352a(aVar, "converterFactory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: c */
        public C11564b mo36487c(C1133r rVar) {
            C11566t.m30352a(rVar, "baseUrl == null");
            mo36489e(new C11565a(this, rVar));
            return this;
        }

        /* renamed from: d */
        public C11564b mo36488d(String str) {
            C11566t.m30352a(str, "baseUrl == null");
            C1133r u = C1133r.m2734u(str);
            if (u != null) {
                mo36487c(u);
                return this;
            }
            throw new IllegalArgumentException("Illegal URL: " + str);
        }

        /* renamed from: e */
        public C11564b mo36489e(C11519a aVar) {
            C11566t.m30352a(aVar, "baseUrl == null");
            this.f22983b = aVar;
            return this;
        }

        /* renamed from: f */
        public C11562s mo36490f() {
            if (this.f22983b != null) {
                C1141v vVar = this.f22982a;
                if (vVar == null) {
                    vVar = new C1141v();
                }
                C1141v vVar2 = vVar;
                ArrayList arrayList = new ArrayList(this.f22985d);
                arrayList.add(C11542m.m30286c().mo36457a(this.f22986e));
                return new C11562s(vVar2, this.f22983b, new ArrayList(this.f22984c), arrayList, this.f22986e, this.f22987f, (C11563a) null);
            }
            throw new IllegalStateException("Base URL required.");
        }

        /* renamed from: g */
        public C11564b mo36491g(C1141v vVar) {
            C11566t.m30352a(vVar, "client == null");
            this.f22982a = vVar;
            return this;
        }
    }

    private C11562s(C1141v vVar, C11519a aVar, List<C11527e.C11528a> list, List<C11525d.C11526a> list2, Executor executor, boolean z) {
        this.f22973a = new LinkedHashMap();
        this.f22974b = vVar;
        this.f22975c = aVar;
        this.f22976d = list;
        this.f22977e = list2;
        this.f22978f = z;
    }

    /* synthetic */ C11562s(C1141v vVar, C11519a aVar, List list, List list2, Executor executor, boolean z, C11563a aVar2) {
        this(vVar, aVar, list, list2, executor, z);
    }

    /* renamed from: e */
    private void m30335e(Class<?> cls) {
        C11542m c = C11542m.m30286c();
        for (Method method : cls.getDeclaredMethods()) {
            if (!c.mo36459e(method)) {
                mo36480f(method);
            }
        }
    }

    /* renamed from: a */
    public C11519a mo36476a() {
        return this.f22975c;
    }

    /* renamed from: b */
    public C11525d<?> mo36477b(Type type, Annotation[] annotationArr) {
        return mo36481g((C11525d.C11526a) null, type, annotationArr);
    }

    /* renamed from: c */
    public C1141v mo36478c() {
        return this.f22974b;
    }

    /* renamed from: d */
    public <T> T mo36479d(Class<T> cls) {
        C11566t.m30362k(cls);
        if (this.f22978f) {
            m30335e(cls);
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C11563a(cls));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C11537k<?> mo36480f(Method method) {
        C11537k<?> kVar;
        synchronized (this.f22973a) {
            kVar = this.f22973a.get(method);
            if (kVar == null) {
                kVar = C11537k.m30267a(this, method);
                this.f22973a.put(method, kVar);
            }
        }
        return kVar;
    }

    /* renamed from: g */
    public C11525d<?> mo36481g(C11525d.C11526a aVar, Type type, Annotation[] annotationArr) {
        C11566t.m30352a(type, "returnType == null");
        C11566t.m30352a(annotationArr, "annotations == null");
        int indexOf = this.f22977e.indexOf(aVar) + 1;
        int size = this.f22977e.size();
        for (int i = indexOf; i < size; i++) {
            C11525d<?> dVar = this.f22977e.get(i).get(type, annotationArr, this);
            if (dVar != null) {
                return dVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(". Tried:");
        int size2 = this.f22977e.size();
        for (int i2 = indexOf; i2 < size2; i2++) {
            sb.append("\n * ");
            sb.append(this.f22977e.get(i2).getClass().getName());
        }
        if (aVar != null) {
            sb.append("\nSkipped:");
            for (int i3 = 0; i3 < indexOf; i3++) {
                sb.append("\n * ");
                sb.append(this.f22977e.get(i3).getClass().getName());
            }
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: h */
    public <T> C11527e<T, C1147y> mo36482h(Type type, Annotation[] annotationArr) {
        C11566t.m30352a(type, "type == null");
        C11566t.m30352a(annotationArr, "annotations == null");
        int size = this.f22976d.size();
        for (int i = 0; i < size; i++) {
            C11527e<?, C1147y> requestBody = this.f22976d.get(i).toRequestBody(type, annotationArr);
            if (requestBody != null) {
                return requestBody;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(". Tried:");
        for (C11527e.C11528a aVar : this.f22976d) {
            sb.append("\n * ");
            sb.append(aVar.getClass().getName());
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: i */
    public <T> C11527e<C0988a0, T> mo36483i(Type type, Annotation[] annotationArr) {
        C11566t.m30352a(type, "type == null");
        C11566t.m30352a(annotationArr, "annotations == null");
        int size = this.f22976d.size();
        for (int i = 0; i < size; i++) {
            C11527e<C0988a0, ?> fromResponseBody = this.f22976d.get(i).fromResponseBody(type, annotationArr);
            if (fromResponseBody != null) {
                return fromResponseBody;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(". Tried:");
        for (C11527e.C11528a aVar : this.f22976d) {
            sb.append("\n * ");
            sb.append(aVar.getClass().getName());
        }
        throw new IllegalArgumentException(sb.toString());
    }
}
