package com.google.gson.internal;

import com.google.gson.C2477g;
import com.google.gson.JsonIOException;
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
import p115x1.C3901b;
import p119y1.C3918a;

/* renamed from: com.google.gson.internal.b */
public final class C2497b {

    /* renamed from: a */
    private final Map<Type, C2477g<?>> f4234a;

    /* renamed from: b */
    private final C3901b f4235b = C3901b.m11147a();

    /* renamed from: com.google.gson.internal.b$a */
    class C2498a implements C2516f<T> {
        C2498a(C2497b bVar) {
        }

        /* renamed from: a */
        public T mo19367a() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: com.google.gson.internal.b$b */
    class C2499b implements C2516f<T> {
        C2499b(C2497b bVar) {
        }

        /* renamed from: a */
        public T mo19367a() {
            return new TreeMap();
        }
    }

    /* renamed from: com.google.gson.internal.b$c */
    class C2500c implements C2516f<T> {
        C2500c(C2497b bVar) {
        }

        /* renamed from: a */
        public T mo19367a() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: com.google.gson.internal.b$d */
    class C2501d implements C2516f<T> {
        C2501d(C2497b bVar) {
        }

        /* renamed from: a */
        public T mo19367a() {
            return new LinkedTreeMap();
        }
    }

    /* renamed from: com.google.gson.internal.b$e */
    class C2502e implements C2516f<T> {

        /* renamed from: a */
        private final C2522j f4236a = C2522j.m6802b();

        /* renamed from: b */
        final /* synthetic */ Class f4237b;

        /* renamed from: c */
        final /* synthetic */ Type f4238c;

        C2502e(C2497b bVar, Class cls, Type type) {
            this.f4237b = cls;
            this.f4238c = type;
        }

        /* renamed from: a */
        public T mo19367a() {
            try {
                return this.f4236a.mo19381c(this.f4237b);
            } catch (Exception e) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f4238c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e);
            }
        }
    }

    /* renamed from: com.google.gson.internal.b$f */
    class C2503f implements C2516f<T> {

        /* renamed from: a */
        final /* synthetic */ C2477g f4239a;

        /* renamed from: b */
        final /* synthetic */ Type f4240b;

        C2503f(C2497b bVar, C2477g gVar, Type type) {
            this.f4239a = gVar;
            this.f4240b = type;
        }

        /* renamed from: a */
        public T mo19367a() {
            return this.f4239a.mo19255a(this.f4240b);
        }
    }

    /* renamed from: com.google.gson.internal.b$g */
    class C2504g implements C2516f<T> {

        /* renamed from: a */
        final /* synthetic */ C2477g f4241a;

        /* renamed from: b */
        final /* synthetic */ Type f4242b;

        C2504g(C2497b bVar, C2477g gVar, Type type) {
            this.f4241a = gVar;
            this.f4242b = type;
        }

        /* renamed from: a */
        public T mo19367a() {
            return this.f4241a.mo19255a(this.f4242b);
        }
    }

    /* renamed from: com.google.gson.internal.b$h */
    class C2505h implements C2516f<T> {

        /* renamed from: a */
        final /* synthetic */ Constructor f4243a;

        C2505h(C2497b bVar, Constructor constructor) {
            this.f4243a = constructor;
        }

        /* renamed from: a */
        public T mo19367a() {
            try {
                return this.f4243a.newInstance((Object[]) null);
            } catch (InstantiationException e) {
                throw new RuntimeException("Failed to invoke " + this.f4243a + " with no args", e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to invoke " + this.f4243a + " with no args", e2.getTargetException());
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }
    }

    /* renamed from: com.google.gson.internal.b$i */
    class C2506i implements C2516f<T> {
        C2506i(C2497b bVar) {
        }

        /* renamed from: a */
        public T mo19367a() {
            return new TreeSet();
        }
    }

    /* renamed from: com.google.gson.internal.b$j */
    class C2507j implements C2516f<T> {

        /* renamed from: a */
        final /* synthetic */ Type f4244a;

        C2507j(C2497b bVar, Type type) {
            this.f4244a = type;
        }

        /* renamed from: a */
        public T mo19367a() {
            Type type = this.f4244a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new JsonIOException("Invalid EnumSet type: " + this.f4244a.toString());
            }
            throw new JsonIOException("Invalid EnumSet type: " + this.f4244a.toString());
        }
    }

    /* renamed from: com.google.gson.internal.b$k */
    class C2508k implements C2516f<T> {
        C2508k(C2497b bVar) {
        }

        /* renamed from: a */
        public T mo19367a() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: com.google.gson.internal.b$l */
    class C2509l implements C2516f<T> {
        C2509l(C2497b bVar) {
        }

        /* renamed from: a */
        public T mo19367a() {
            return new ArrayDeque();
        }
    }

    /* renamed from: com.google.gson.internal.b$m */
    class C2510m implements C2516f<T> {
        C2510m(C2497b bVar) {
        }

        /* renamed from: a */
        public T mo19367a() {
            return new ArrayList();
        }
    }

    /* renamed from: com.google.gson.internal.b$n */
    class C2511n implements C2516f<T> {
        C2511n(C2497b bVar) {
        }

        /* renamed from: a */
        public T mo19367a() {
            return new ConcurrentSkipListMap();
        }
    }

    public C2497b(Map<Type, C2477g<?>> map) {
        this.f4234a = map;
    }

    /* renamed from: b */
    private <T> C2516f<T> m6751b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f4235b.mo26384b(declaredConstructor);
            }
            return new C2505h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private <T> C2516f<T> m6752c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new C2506i(this) : EnumSet.class.isAssignableFrom(cls) ? new C2507j(this, type) : Set.class.isAssignableFrom(cls) ? new C2508k(this) : Queue.class.isAssignableFrom(cls) ? new C2509l(this) : new C2510m(this);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new C2511n(this) : ConcurrentMap.class.isAssignableFrom(cls) ? new C2498a(this) : SortedMap.class.isAssignableFrom(cls) ? new C2499b(this) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(C3918a.m11208b(((ParameterizedType) type).getActualTypeArguments()[0]).mo26409c())) ? new C2501d(this) : new C2500c(this);
        }
        return null;
    }

    /* renamed from: d */
    private <T> C2516f<T> m6753d(Type type, Class<? super T> cls) {
        return new C2502e(this, cls, type);
    }

    /* renamed from: a */
    public <T> C2516f<T> mo19365a(C3918a<T> aVar) {
        Type e = aVar.mo26410e();
        Class<? super T> c = aVar.mo26409c();
        C2477g gVar = this.f4234a.get(e);
        if (gVar != null) {
            return new C2503f(this, gVar, e);
        }
        C2477g gVar2 = this.f4234a.get(c);
        if (gVar2 != null) {
            return new C2504g(this, gVar2, e);
        }
        C2516f<T> b = m6751b(c);
        if (b != null) {
            return b;
        }
        C2516f<T> c2 = m6752c(e, c);
        return c2 != null ? c2 : m6753d(e, c);
    }

    public String toString() {
        return this.f4234a.toString();
    }
}
