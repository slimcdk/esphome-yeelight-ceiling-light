package retrofit2;

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
import okhttp3.C3505a0;
import okhttp3.C3518c0;
import okhttp3.C3546t;
import okhttp3.C3552x;
import okhttp3.C9796e;
import retrofit2.C10312a;
import retrofit2.C10318b;
import retrofit2.C10319c;
import retrofit2.C3670l;

/* renamed from: retrofit2.k */
public final class C3667k {

    /* renamed from: a */
    private final Map<Method, C3670l<?, ?>> f6131a = new ConcurrentHashMap();

    /* renamed from: b */
    final C9796e.C9797a f6132b;

    /* renamed from: c */
    final C3546t f6133c;

    /* renamed from: d */
    final List<C10319c.C3638a> f6134d;

    /* renamed from: e */
    final List<C10318b.C3637a> f6135e;

    /* renamed from: f */
    final boolean f6136f;

    /* renamed from: retrofit2.k$a */
    class C3668a implements InvocationHandler {

        /* renamed from: a */
        private final C3660h f6137a = C3660h.m10430d();

        /* renamed from: b */
        final /* synthetic */ Class f6138b;

        C3668a(Class cls) {
            this.f6138b = cls;
        }

        public Object invoke(Object obj, Method method, @Nullable Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (this.f6137a.mo26005f(method)) {
                return this.f6137a.mo26004e(method, this.f6138b, obj, objArr);
            }
            C3670l<?, ?> f = C3667k.this.mo26049f(method);
            return f.mo26062a(new C3639f(f, objArr));
        }
    }

    /* renamed from: retrofit2.k$b */
    public static final class C3669b {

        /* renamed from: a */
        private final C3660h f6140a;
        @Nullable

        /* renamed from: b */
        private C9796e.C9797a f6141b;

        /* renamed from: c */
        private C3546t f6142c;

        /* renamed from: d */
        private final List<C10319c.C3638a> f6143d;

        /* renamed from: e */
        private final List<C10318b.C3637a> f6144e;
        @Nullable

        /* renamed from: f */
        private Executor f6145f;

        /* renamed from: g */
        private boolean f6146g;

        public C3669b() {
            this(C3660h.m10430d());
        }

        C3669b(C3660h hVar) {
            this.f6143d = new ArrayList();
            this.f6144e = new ArrayList();
            this.f6140a = hVar;
        }

        /* renamed from: a */
        public C3669b mo26057a(String str) {
            C3672m.m10495b(str, "baseUrl == null");
            C3546t r = C3546t.m9825r(str);
            if (r != null) {
                return mo26058b(r);
            }
            throw new IllegalArgumentException("Illegal URL: " + str);
        }

        /* renamed from: b */
        public C3669b mo26058b(C3546t tVar) {
            C3672m.m10495b(tVar, "baseUrl == null");
            List<String> s = tVar.mo24577s();
            if ("".equals(s.get(s.size() - 1))) {
                this.f6142c = tVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + tVar);
        }

        /* renamed from: c */
        public C3667k mo26059c() {
            if (this.f6142c != null) {
                C9796e.C9797a aVar = this.f6141b;
                if (aVar == null) {
                    aVar = new C3552x();
                }
                C9796e.C9797a aVar2 = aVar;
                Executor executor = this.f6145f;
                if (executor == null) {
                    executor = this.f6140a.mo26003b();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f6144e);
                arrayList.add(this.f6140a.mo26002a(executor2));
                ArrayList arrayList2 = new ArrayList(this.f6143d.size() + 1);
                arrayList2.add(new C10312a());
                arrayList2.addAll(this.f6143d);
                return new C3667k(aVar2, this.f6142c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.f6146g);
            }
            throw new IllegalStateException("Base URL required.");
        }

        /* renamed from: d */
        public C3669b mo26060d(C9796e.C9797a aVar) {
            this.f6141b = (C9796e.C9797a) C3672m.m10495b(aVar, "factory == null");
            return this;
        }

        /* renamed from: e */
        public C3669b mo26061e(C3552x xVar) {
            return mo26060d((C9796e.C9797a) C3672m.m10495b(xVar, "client == null"));
        }
    }

    C3667k(C9796e.C9797a aVar, C3546t tVar, List<C10319c.C3638a> list, List<C10318b.C3637a> list2, @Nullable Executor executor, boolean z) {
        this.f6132b = aVar;
        this.f6133c = tVar;
        this.f6134d = list;
        this.f6135e = list2;
        this.f6136f = z;
    }

    /* renamed from: e */
    private void m10459e(Class<?> cls) {
        C3660h d = C3660h.m10430d();
        for (Method method : cls.getDeclaredMethods()) {
            if (!d.mo26005f(method)) {
                mo26049f(method);
            }
        }
    }

    /* renamed from: a */
    public C3546t mo26045a() {
        return this.f6133c;
    }

    /* renamed from: b */
    public C10318b<?, ?> mo26046b(Type type, Annotation[] annotationArr) {
        return mo26050g((C10318b.C3637a) null, type, annotationArr);
    }

    /* renamed from: c */
    public C9796e.C9797a mo26047c() {
        return this.f6132b;
    }

    /* renamed from: d */
    public <T> T mo26048d(Class<T> cls) {
        C3672m.m10511r(cls);
        if (this.f6136f) {
            m10459e(cls);
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C3668a(cls));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C3670l<?, ?> mo26049f(Method method) {
        C3670l<?, ?> lVar;
        C3670l<?, ?> lVar2 = this.f6131a.get(method);
        if (lVar2 != null) {
            return lVar2;
        }
        synchronized (this.f6131a) {
            lVar = this.f6131a.get(method);
            if (lVar == null) {
                lVar = new C3670l.C3671a(this, method).mo26065a();
                this.f6131a.put(method, lVar);
            }
        }
        return lVar;
    }

    /* renamed from: g */
    public C10318b<?, ?> mo26050g(@Nullable C10318b.C3637a aVar, Type type, Annotation[] annotationArr) {
        C3672m.m10495b(type, "returnType == null");
        C3672m.m10495b(annotationArr, "annotations == null");
        int indexOf = this.f6135e.indexOf(aVar) + 1;
        int size = this.f6135e.size();
        for (int i = indexOf; i < size; i++) {
            C10318b<?, ?> a = this.f6135e.get(i).mo25980a(type, annotationArr, this);
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
                sb.append(this.f6135e.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f6135e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f6135e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: h */
    public <T> C10319c<T, C3505a0> mo26051h(@Nullable C10319c.C3638a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        C3672m.m10495b(type, "type == null");
        C3672m.m10495b(annotationArr, "parameterAnnotations == null");
        C3672m.m10495b(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f6134d.indexOf(aVar) + 1;
        int size = this.f6134d.size();
        for (int i = indexOf; i < size; i++) {
            C10319c<?, C3505a0> a = this.f6134d.get(i).mo25981a(type, annotationArr, annotationArr2, this);
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
                sb.append(this.f6134d.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f6134d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f6134d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: i */
    public <T> C10319c<C3518c0, T> mo26052i(@Nullable C10319c.C3638a aVar, Type type, Annotation[] annotationArr) {
        C3672m.m10495b(type, "type == null");
        C3672m.m10495b(annotationArr, "annotations == null");
        int indexOf = this.f6134d.indexOf(aVar) + 1;
        int size = this.f6134d.size();
        for (int i = indexOf; i < size; i++) {
            C10319c<C3518c0, ?> b = this.f6134d.get(i).mo25982b(type, annotationArr, this);
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
                sb.append(this.f6134d.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f6134d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f6134d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: j */
    public <T> C10319c<T, C3505a0> mo26053j(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return mo26051h((C10319c.C3638a) null, type, annotationArr, annotationArr2);
    }

    /* renamed from: k */
    public <T> C10319c<C3518c0, T> mo26054k(Type type, Annotation[] annotationArr) {
        return mo26052i((C10319c.C3638a) null, type, annotationArr);
    }

    /* renamed from: l */
    public <T> C10319c<T, String> mo26055l(Type type, Annotation[] annotationArr) {
        C3672m.m10495b(type, "type == null");
        C3672m.m10495b(annotationArr, "annotations == null");
        int size = this.f6134d.size();
        for (int i = 0; i < size; i++) {
            C10319c<?, String> c = this.f6134d.get(i).mo25983c(type, annotationArr, this);
            if (c != null) {
                return c;
            }
        }
        return C10312a.C10316d.f19385a;
    }
}
