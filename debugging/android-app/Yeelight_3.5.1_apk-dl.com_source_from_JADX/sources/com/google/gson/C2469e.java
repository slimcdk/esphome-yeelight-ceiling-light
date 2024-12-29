package com.google.gson;

import com.google.gson.internal.C2497b;
import com.google.gson.internal.C2512c;
import com.google.gson.internal.C2518h;
import com.google.gson.internal.C2519i;
import com.google.gson.stream.C2537a;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p107v1.C3737a;
import p107v1.C3739b;
import p107v1.C3741c;
import p107v1.C3743d;
import p107v1.C3748g;
import p107v1.C3750h;
import p107v1.C3753i;
import p107v1.C3757j;
import p107v1.C3759k;
import p107v1.C3766n;
import p119y1.C3918a;
import p122z1.C3929a;

/* renamed from: com.google.gson.e */
public final class C2469e {

    /* renamed from: n */
    private static final C3918a<?> f4165n = C3918a.m11207a(Object.class);

    /* renamed from: a */
    private final ThreadLocal<Map<C3918a<?>, C2475f<?>>> f4166a;

    /* renamed from: b */
    private final Map<C3918a<?>, C2534q<?>> f4167b;

    /* renamed from: c */
    private final C2497b f4168c;

    /* renamed from: d */
    private final C3743d f4169d;

    /* renamed from: e */
    final List<C2536r> f4170e;

    /* renamed from: f */
    final Map<Type, C2477g<?>> f4171f;

    /* renamed from: g */
    final boolean f4172g;

    /* renamed from: h */
    final boolean f4173h;

    /* renamed from: i */
    final boolean f4174i;

    /* renamed from: j */
    final boolean f4175j;

    /* renamed from: k */
    final boolean f4176k;

    /* renamed from: l */
    final List<C2536r> f4177l;

    /* renamed from: m */
    final List<C2536r> f4178m;

    /* renamed from: com.google.gson.e$a */
    class C2470a extends C2534q<Number> {
        C2470a(C2469e eVar) {
        }

        /* renamed from: e */
        public Double mo19209b(C3929a aVar) {
            if (aVar.mo26169N() != JsonToken.NULL) {
                return Double.valueOf(aVar.mo26181z());
            }
            aVar.mo26167G();
            return null;
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, Number number) {
            if (number == null) {
                aVar.mo19434s();
                return;
            }
            C2469e.m6664d(number.doubleValue());
            aVar.mo19421P(number);
        }
    }

    /* renamed from: com.google.gson.e$b */
    class C2471b extends C2534q<Number> {
        C2471b(C2469e eVar) {
        }

        /* renamed from: e */
        public Float mo19209b(C3929a aVar) {
            if (aVar.mo26169N() != JsonToken.NULL) {
                return Float.valueOf((float) aVar.mo26181z());
            }
            aVar.mo26167G();
            return null;
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, Number number) {
            if (number == null) {
                aVar.mo19434s();
                return;
            }
            C2469e.m6664d((double) number.floatValue());
            aVar.mo19421P(number);
        }
    }

    /* renamed from: com.google.gson.e$c */
    static class C2472c extends C2534q<Number> {
        C2472c() {
        }

        /* renamed from: e */
        public Number mo19209b(C3929a aVar) {
            if (aVar.mo26169N() != JsonToken.NULL) {
                return Long.valueOf(aVar.mo26165B());
            }
            aVar.mo26167G();
            return null;
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, Number number) {
            if (number == null) {
                aVar.mo19434s();
            } else {
                aVar.mo19422T(number.toString());
            }
        }
    }

    /* renamed from: com.google.gson.e$d */
    static class C2473d extends C2534q<AtomicLong> {

        /* renamed from: a */
        final /* synthetic */ C2534q f4179a;

        C2473d(C2534q qVar) {
            this.f4179a = qVar;
        }

        /* renamed from: e */
        public AtomicLong mo19209b(C3929a aVar) {
            return new AtomicLong(((Number) this.f4179a.mo19209b(aVar)).longValue());
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, AtomicLong atomicLong) {
            this.f4179a.mo19210d(aVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* renamed from: com.google.gson.e$e */
    static class C2474e extends C2534q<AtomicLongArray> {

        /* renamed from: a */
        final /* synthetic */ C2534q f4180a;

        C2474e(C2534q qVar) {
            this.f4180a = qVar;
        }

        /* renamed from: e */
        public AtomicLongArray mo19209b(C3929a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.mo26170a();
            while (aVar.mo26177n()) {
                arrayList.add(Long.valueOf(((Number) this.f4180a.mo19209b(aVar)).longValue()));
            }
            aVar.mo26173i();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i = 0; i < size; i++) {
                atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
            }
            return atomicLongArray;
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, AtomicLongArray atomicLongArray) {
            aVar.mo19425d();
            int length = atomicLongArray.length();
            for (int i = 0; i < length; i++) {
                this.f4180a.mo19210d(aVar, Long.valueOf(atomicLongArray.get(i)));
            }
            aVar.mo19428i();
        }
    }

    /* renamed from: com.google.gson.e$f */
    static class C2475f<T> extends C2534q<T> {

        /* renamed from: a */
        private C2534q<T> f4181a;

        C2475f() {
        }

        /* renamed from: b */
        public T mo19209b(C3929a aVar) {
            C2534q<T> qVar = this.f4181a;
            if (qVar != null) {
                return qVar.mo19209b(aVar);
            }
            throw new IllegalStateException();
        }

        /* renamed from: d */
        public void mo19210d(C2537a aVar, T t) {
            C2534q<T> qVar = this.f4181a;
            if (qVar != null) {
                qVar.mo19210d(aVar, t);
                return;
            }
            throw new IllegalStateException();
        }

        /* renamed from: e */
        public void mo19251e(C2534q<T> qVar) {
            if (this.f4181a == null) {
                this.f4181a = qVar;
                return;
            }
            throw new AssertionError();
        }
    }

    public C2469e() {
        this(C2512c.f4245g, FieldNamingPolicy.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, LongSerializationPolicy.DEFAULT, (String) null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    C2469e(C2512c cVar, C2468d dVar, Map<Type, C2477g<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, LongSerializationPolicy longSerializationPolicy, String str, int i, int i2, List<C2536r> list, List<C2536r> list2, List<C2536r> list3) {
        C2512c cVar2 = cVar;
        boolean z8 = z7;
        this.f4166a = new ThreadLocal<>();
        this.f4167b = new ConcurrentHashMap();
        this.f4171f = map;
        C2497b bVar = new C2497b(map);
        this.f4168c = bVar;
        this.f4172g = z;
        this.f4173h = z3;
        this.f4174i = z4;
        this.f4175j = z5;
        this.f4176k = z6;
        this.f4177l = list;
        this.f4178m = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C3766n.f6351Y);
        arrayList.add(C3750h.f6289b);
        arrayList.add(cVar);
        arrayList.addAll(list3);
        arrayList.add(C3766n.f6330D);
        arrayList.add(C3766n.f6365m);
        arrayList.add(C3766n.f6359g);
        arrayList.add(C3766n.f6361i);
        arrayList.add(C3766n.f6363k);
        C2534q<Number> n = m6667n(longSerializationPolicy);
        arrayList.add(C3766n.m10725b(Long.TYPE, Long.class, n));
        arrayList.add(C3766n.m10725b(Double.TYPE, Double.class, m6665e(z8)));
        arrayList.add(C3766n.m10725b(Float.TYPE, Float.class, m6666f(z8)));
        arrayList.add(C3766n.f6376x);
        arrayList.add(C3766n.f6367o);
        arrayList.add(C3766n.f6369q);
        arrayList.add(C3766n.m10724a(AtomicLong.class, m6662b(n)));
        arrayList.add(C3766n.m10724a(AtomicLongArray.class, m6663c(n)));
        arrayList.add(C3766n.f6371s);
        arrayList.add(C3766n.f6378z);
        arrayList.add(C3766n.f6332F);
        arrayList.add(C3766n.f6334H);
        arrayList.add(C3766n.m10724a(BigDecimal.class, C3766n.f6328B));
        arrayList.add(C3766n.m10724a(BigInteger.class, C3766n.f6329C));
        arrayList.add(C3766n.f6336J);
        arrayList.add(C3766n.f6338L);
        arrayList.add(C3766n.f6342P);
        arrayList.add(C3766n.f6344R);
        arrayList.add(C3766n.f6349W);
        arrayList.add(C3766n.f6340N);
        arrayList.add(C3766n.f6356d);
        arrayList.add(C3741c.f6270b);
        arrayList.add(C3766n.f6347U);
        arrayList.add(C3759k.f6310b);
        arrayList.add(C3757j.f6308b);
        arrayList.add(C3766n.f6345S);
        arrayList.add(C3737a.f6264c);
        arrayList.add(C3766n.f6354b);
        arrayList.add(new C3739b(bVar));
        boolean z9 = z2;
        arrayList.add(new C3748g(bVar, z2));
        C3743d dVar2 = new C3743d(bVar);
        this.f4169d = dVar2;
        arrayList.add(dVar2);
        arrayList.add(C3766n.f6352Z);
        C2468d dVar3 = dVar;
        arrayList.add(new C3753i(bVar, dVar, cVar, dVar2));
        this.f4170e = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    private static void m6661a(Object obj, C3929a aVar) {
        if (obj != null) {
            try {
                if (aVar.mo26169N() != JsonToken.END_DOCUMENT) {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException((Throwable) e);
            } catch (IOException e2) {
                throw new JsonIOException((Throwable) e2);
            }
        }
    }

    /* renamed from: b */
    private static C2534q<AtomicLong> m6662b(C2534q<Number> qVar) {
        return new C2473d(qVar).mo19413a();
    }

    /* renamed from: c */
    private static C2534q<AtomicLongArray> m6663c(C2534q<Number> qVar) {
        return new C2474e(qVar).mo19413a();
    }

    /* renamed from: d */
    static void m6664d(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: e */
    private C2534q<Number> m6665e(boolean z) {
        return z ? C3766n.f6374v : new C2470a(this);
    }

    /* renamed from: f */
    private C2534q<Number> m6666f(boolean z) {
        return z ? C3766n.f6373u : new C2471b(this);
    }

    /* renamed from: n */
    private static C2534q<Number> m6667n(LongSerializationPolicy longSerializationPolicy) {
        return longSerializationPolicy == LongSerializationPolicy.DEFAULT ? C3766n.f6372t : new C2472c();
    }

    /* renamed from: g */
    public <T> T mo19224g(Reader reader, Type type) {
        C3929a o = mo19231o(reader);
        T j = mo19227j(o, type);
        m6661a(j, o);
        return j;
    }

    /* renamed from: h */
    public <T> T mo19225h(String str, Class<T> cls) {
        return C2518h.m6797c(cls).cast(mo19226i(str, cls));
    }

    /* renamed from: i */
    public <T> T mo19226i(String str, Type type) {
        if (str == null) {
            return null;
        }
        return mo19224g(new StringReader(str), type);
    }

    /* renamed from: j */
    public <T> T mo19227j(C3929a aVar, Type type) {
        boolean p = aVar.mo26426p();
        aVar.mo26424c0(true);
        try {
            aVar.mo26169N();
            T b = mo19229l(C3918a.m11208b(type)).mo19209b(aVar);
            aVar.mo26424c0(p);
            return b;
        } catch (EOFException e) {
            if (1 != 0) {
                aVar.mo26424c0(p);
                return null;
            }
            throw new JsonSyntaxException((Throwable) e);
        } catch (IllegalStateException e2) {
            throw new JsonSyntaxException((Throwable) e2);
        } catch (IOException e3) {
            throw new JsonSyntaxException((Throwable) e3);
        } catch (AssertionError e4) {
            throw new AssertionError("AssertionError (GSON 2.8.5): " + e4.getMessage(), e4);
        } catch (Throwable th) {
            aVar.mo26424c0(p);
            throw th;
        }
    }

    /* renamed from: k */
    public <T> C2534q<T> mo19228k(Class<T> cls) {
        return mo19229l(C3918a.m11207a(cls));
    }

    /* renamed from: l */
    public <T> C2534q<T> mo19229l(C3918a<T> aVar) {
        C2534q<T> qVar = this.f4167b.get(aVar == null ? f4165n : aVar);
        if (qVar != null) {
            return qVar;
        }
        Map map = this.f4166a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap();
            this.f4166a.set(map);
            z = true;
        }
        C2475f fVar = (C2475f) map.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            C2475f fVar2 = new C2475f();
            map.put(aVar, fVar2);
            for (C2536r a : this.f4170e) {
                C2534q<T> a2 = a.mo19368a(this, aVar);
                if (a2 != null) {
                    fVar2.mo19251e(a2);
                    this.f4167b.put(aVar, a2);
                    return a2;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.5) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.f4166a.remove();
            }
        }
    }

    /* renamed from: m */
    public <T> C2534q<T> mo19230m(C2536r rVar, C3918a<T> aVar) {
        if (!this.f4170e.contains(rVar)) {
            rVar = this.f4169d;
        }
        boolean z = false;
        for (C2536r next : this.f4170e) {
            if (z) {
                C2534q<T> a = next.mo19368a(this, aVar);
                if (a != null) {
                    return a;
                }
            } else if (next == rVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    /* renamed from: o */
    public C3929a mo19231o(Reader reader) {
        C3929a aVar = new C3929a(reader);
        aVar.mo26424c0(this.f4176k);
        return aVar;
    }

    /* renamed from: p */
    public C2537a mo19232p(Writer writer) {
        if (this.f4173h) {
            writer.write(")]}'\n");
        }
        C2537a aVar = new C2537a(writer);
        if (this.f4175j) {
            aVar.mo19416E("  ");
        }
        aVar.mo19418H(this.f4172g);
        return aVar;
    }

    /* renamed from: q */
    public String mo19233q(C2528k kVar) {
        StringWriter stringWriter = new StringWriter();
        mo19238u(kVar, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: r */
    public String mo19234r(Object obj) {
        return obj == null ? mo19233q(C2529l.f4270a) : mo19235s(obj, obj.getClass());
    }

    /* renamed from: s */
    public String mo19235s(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        mo19240w(obj, type, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: t */
    public void mo19236t(C2528k kVar, C2537a aVar) {
        boolean n = aVar.mo19432n();
        aVar.mo19417G(true);
        boolean m = aVar.mo19431m();
        aVar.mo19415D(this.f4174i);
        boolean l = aVar.mo19430l();
        aVar.mo19418H(this.f4172g);
        try {
            C2519i.m6799b(kVar, aVar);
            aVar.mo19417G(n);
            aVar.mo19415D(m);
            aVar.mo19418H(l);
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        } catch (AssertionError e2) {
            throw new AssertionError("AssertionError (GSON 2.8.5): " + e2.getMessage(), e2);
        } catch (Throwable th) {
            aVar.mo19417G(n);
            aVar.mo19415D(m);
            aVar.mo19418H(l);
            throw th;
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f4172g + ",factories:" + this.f4170e + ",instanceCreators:" + this.f4168c + "}";
    }

    /* renamed from: u */
    public void mo19238u(C2528k kVar, Appendable appendable) {
        try {
            mo19236t(kVar, mo19232p(C2519i.m6800c(appendable)));
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }

    /* renamed from: v */
    public void mo19239v(Object obj, Type type, C2537a aVar) {
        C2534q<?> l = mo19229l(C3918a.m11208b(type));
        boolean n = aVar.mo19432n();
        aVar.mo19417G(true);
        boolean m = aVar.mo19431m();
        aVar.mo19415D(this.f4174i);
        boolean l2 = aVar.mo19430l();
        aVar.mo19418H(this.f4172g);
        try {
            l.mo19210d(aVar, obj);
            aVar.mo19417G(n);
            aVar.mo19415D(m);
            aVar.mo19418H(l2);
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        } catch (AssertionError e2) {
            throw new AssertionError("AssertionError (GSON 2.8.5): " + e2.getMessage(), e2);
        } catch (Throwable th) {
            aVar.mo19417G(n);
            aVar.mo19415D(m);
            aVar.mo19418H(l2);
            throw th;
        }
    }

    /* renamed from: w */
    public void mo19240w(Object obj, Type type, Appendable appendable) {
        try {
            mo19239v(obj, type, mo19232p(C2519i.m6800c(appendable)));
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }
}
