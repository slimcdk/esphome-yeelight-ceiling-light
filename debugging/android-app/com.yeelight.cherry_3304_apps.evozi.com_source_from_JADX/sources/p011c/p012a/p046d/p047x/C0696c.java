package p011c.p012a.p046d.p047x;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import p011c.p012a.p046d.C0672h;
import p011c.p012a.p046d.C0677m;
import p011c.p012a.p046d.p047x.p050o.C0806b;
import p011c.p012a.p046d.p051y.C0808a;

/* renamed from: c.a.d.x.c */
public final class C0696c {

    /* renamed from: a */
    private final Map<Type, C0672h<?>> f429a;

    /* renamed from: b */
    private final C0806b f430b = C0806b.m1026a();

    /* renamed from: c.a.d.x.c$a */
    class C0697a implements C0724i<T> {
        C0697a(C0696c cVar) {
        }

        /* renamed from: a */
        public T mo8789a() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: c.a.d.x.c$b */
    class C0698b implements C0724i<T> {
        C0698b(C0696c cVar) {
        }

        /* renamed from: a */
        public T mo8789a() {
            return new TreeMap();
        }
    }

    /* renamed from: c.a.d.x.c$c */
    class C0699c implements C0724i<T> {
        C0699c(C0696c cVar) {
        }

        /* renamed from: a */
        public T mo8789a() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: c.a.d.x.c$d */
    class C0700d implements C0724i<T> {
        C0700d(C0696c cVar) {
        }

        /* renamed from: a */
        public T mo8789a() {
            return new C0716h();
        }
    }

    /* renamed from: c.a.d.x.c$e */
    class C0701e implements C0724i<T> {

        /* renamed from: a */
        private final C0730m f431a = C0730m.m788b();

        /* renamed from: b */
        final /* synthetic */ Class f432b;

        /* renamed from: c */
        final /* synthetic */ Type f433c;

        C0701e(C0696c cVar, Class cls, Type type) {
            this.f432b = cls;
            this.f433c = type;
        }

        /* renamed from: a */
        public T mo8789a() {
            try {
                return this.f431a.mo8848c(this.f432b);
            } catch (Exception e) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f433c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e);
            }
        }
    }

    /* renamed from: c.a.d.x.c$f */
    class C0702f implements C0724i<T> {

        /* renamed from: a */
        final /* synthetic */ C0672h f434a;

        /* renamed from: b */
        final /* synthetic */ Type f435b;

        C0702f(C0696c cVar, C0672h hVar, Type type) {
            this.f434a = hVar;
            this.f435b = type;
        }

        /* renamed from: a */
        public T mo8789a() {
            return this.f434a.mo8733a(this.f435b);
        }
    }

    /* renamed from: c.a.d.x.c$g */
    class C0703g implements C0724i<T> {

        /* renamed from: a */
        final /* synthetic */ C0672h f436a;

        /* renamed from: b */
        final /* synthetic */ Type f437b;

        C0703g(C0696c cVar, C0672h hVar, Type type) {
            this.f436a = hVar;
            this.f437b = type;
        }

        /* renamed from: a */
        public T mo8789a() {
            return this.f436a.mo8733a(this.f437b);
        }
    }

    /* renamed from: c.a.d.x.c$h */
    class C0704h implements C0724i<T> {

        /* renamed from: a */
        final /* synthetic */ Constructor f438a;

        C0704h(C0696c cVar, Constructor constructor) {
            this.f438a = constructor;
        }

        /* renamed from: a */
        public T mo8789a() {
            try {
                return this.f438a.newInstance((Object[]) null);
            } catch (InstantiationException e) {
                throw new RuntimeException("Failed to invoke " + this.f438a + " with no args", e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to invoke " + this.f438a + " with no args", e2.getTargetException());
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }
    }

    /* renamed from: c.a.d.x.c$i */
    class C0705i implements C0724i<T> {
        C0705i(C0696c cVar) {
        }

        /* renamed from: a */
        public T mo8789a() {
            return new TreeSet();
        }
    }

    /* renamed from: c.a.d.x.c$j */
    class C0706j implements C0724i<T> {

        /* renamed from: a */
        final /* synthetic */ Type f439a;

        C0706j(C0696c cVar, Type type) {
            this.f439a = type;
        }

        /* renamed from: a */
        public T mo8789a() {
            Type type = this.f439a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new C0677m("Invalid EnumSet type: " + this.f439a.toString());
            }
            throw new C0677m("Invalid EnumSet type: " + this.f439a.toString());
        }
    }

    /* renamed from: c.a.d.x.c$k */
    class C0707k implements C0724i<T> {
        C0707k(C0696c cVar) {
        }

        /* renamed from: a */
        public T mo8789a() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: c.a.d.x.c$l */
    class C0708l implements C0724i<T> {
        C0708l(C0696c cVar) {
        }

        /* renamed from: a */
        public T mo8789a() {
            return new ArrayDeque();
        }
    }

    /* renamed from: c.a.d.x.c$m */
    class C0709m implements C0724i<T> {
        C0709m(C0696c cVar) {
        }

        /* renamed from: a */
        public T mo8789a() {
            return new ArrayList();
        }
    }

    /* renamed from: c.a.d.x.c$n */
    class C0710n implements C0724i<T> {
        C0710n(C0696c cVar) {
        }

        /* renamed from: a */
        public T mo8789a() {
            return new ConcurrentSkipListMap();
        }
    }

    public C0696c(Map<Type, C0672h<?>> map) {
        this.f429a = map;
    }

    /* renamed from: b */
    private <T> C0724i<T> m722b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f430b.mo8965b(declaredConstructor);
            }
            return new C0704h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private <T> C0724i<T> m723c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new C0705i(this) : EnumSet.class.isAssignableFrom(cls) ? new C0706j(this, type) : Set.class.isAssignableFrom(cls) ? new C0707k(this) : Queue.class.isAssignableFrom(cls) ? new C0708l(this) : new C0709m(this);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new C0710n(this) : ConcurrentMap.class.isAssignableFrom(cls) ? new C0697a(this) : SortedMap.class.isAssignableFrom(cls) ? new C0698b(this) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(C0808a.m1033b(((ParameterizedType) type).getActualTypeArguments()[0]).mo8967c())) ? new C0700d(this) : new C0699c(this);
        }
        return null;
    }

    /* renamed from: d */
    private <T> C0724i<T> m724d(Type type, Class<? super T> cls) {
        return new C0701e(this, cls, type);
    }

    /* renamed from: a */
    public <T> C0724i<T> mo8787a(C0808a<T> aVar) {
        Type e = aVar.mo8968e();
        Class<? super T> c = aVar.mo8967c();
        C0672h hVar = this.f429a.get(e);
        if (hVar != null) {
            return new C0702f(this, hVar, e);
        }
        C0672h hVar2 = this.f429a.get(c);
        if (hVar2 != null) {
            return new C0703g(this, hVar2, e);
        }
        C0724i<T> b = m722b(c);
        if (b != null) {
            return b;
        }
        C0724i<T> c2 = m723c(e, c);
        return c2 != null ? c2 : m724d(e, c);
    }

    public String toString() {
        return this.f429a.toString();
    }
}
