package p011c.p012a.p046d;

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
import p011c.p012a.p046d.p047x.C0696c;
import p011c.p012a.p046d.p047x.C0711d;
import p011c.p012a.p046d.p047x.C0726k;
import p011c.p012a.p046d.p047x.C0727l;
import p011c.p012a.p046d.p047x.p048n.C0735a;
import p011c.p012a.p046d.p047x.p048n.C0737b;
import p011c.p012a.p046d.p047x.p048n.C0739c;
import p011c.p012a.p046d.p047x.p048n.C0741d;
import p011c.p012a.p046d.p047x.p048n.C0746g;
import p011c.p012a.p046d.p047x.p048n.C0748h;
import p011c.p012a.p046d.p047x.p048n.C0751i;
import p011c.p012a.p046d.p047x.p048n.C0755j;
import p011c.p012a.p046d.p047x.p048n.C0757k;
import p011c.p012a.p046d.p047x.p048n.C0764n;
import p011c.p012a.p046d.p051y.C0808a;
import p011c.p012a.p046d.p052z.C0809a;
import p011c.p012a.p046d.p052z.C0811b;
import p011c.p012a.p046d.p052z.C0812c;
import p011c.p012a.p046d.p052z.C0813d;

/* renamed from: c.a.d.f */
public final class C0664f {

    /* renamed from: k */
    private static final C0808a<?> f383k = C0808a.m1032a(Object.class);

    /* renamed from: a */
    private final ThreadLocal<Map<C0808a<?>, C0670f<?>>> f384a;

    /* renamed from: b */
    private final Map<C0808a<?>, C0688v<?>> f385b;

    /* renamed from: c */
    private final C0696c f386c;

    /* renamed from: d */
    private final C0741d f387d;

    /* renamed from: e */
    final List<C0690w> f388e;

    /* renamed from: f */
    final boolean f389f;

    /* renamed from: g */
    final boolean f390g;

    /* renamed from: h */
    final boolean f391h;

    /* renamed from: i */
    final boolean f392i;

    /* renamed from: j */
    final boolean f393j;

    /* renamed from: c.a.d.f$a */
    class C0665a extends C0688v<Number> {
        C0665a(C0664f fVar) {
        }

        /* renamed from: e */
        public Double mo8694b(C0809a aVar) {
            if (aVar.mo8861V() != C0811b.NULL) {
                return Double.valueOf(aVar.mo8855I());
            }
            aVar.mo8859Q();
            return null;
        }

        /* renamed from: f */
        public void mo8695d(C0812c cVar, Number number) {
            if (number == null) {
                cVar.mo8874D();
                return;
            }
            C0664f.m617d(number.doubleValue());
            cVar.mo8877W(number);
        }
    }

    /* renamed from: c.a.d.f$b */
    class C0666b extends C0688v<Number> {
        C0666b(C0664f fVar) {
        }

        /* renamed from: e */
        public Float mo8694b(C0809a aVar) {
            if (aVar.mo8861V() != C0811b.NULL) {
                return Float.valueOf((float) aVar.mo8855I());
            }
            aVar.mo8859Q();
            return null;
        }

        /* renamed from: f */
        public void mo8695d(C0812c cVar, Number number) {
            if (number == null) {
                cVar.mo8874D();
                return;
            }
            C0664f.m617d((double) number.floatValue());
            cVar.mo8877W(number);
        }
    }

    /* renamed from: c.a.d.f$c */
    static class C0667c extends C0688v<Number> {
        C0667c() {
        }

        /* renamed from: e */
        public Number mo8694b(C0809a aVar) {
            if (aVar.mo8861V() != C0811b.NULL) {
                return Long.valueOf(aVar.mo8857K());
            }
            aVar.mo8859Q();
            return null;
        }

        /* renamed from: f */
        public void mo8695d(C0812c cVar, Number number) {
            if (number == null) {
                cVar.mo8874D();
            } else {
                cVar.mo8878X(number.toString());
            }
        }
    }

    /* renamed from: c.a.d.f$d */
    static class C0668d extends C0688v<AtomicLong> {

        /* renamed from: a */
        final /* synthetic */ C0688v f394a;

        C0668d(C0688v vVar) {
            this.f394a = vVar;
        }

        /* renamed from: e */
        public AtomicLong mo8694b(C0809a aVar) {
            return new AtomicLong(((Number) this.f394a.mo8694b(aVar)).longValue());
        }

        /* renamed from: f */
        public void mo8695d(C0812c cVar, AtomicLong atomicLong) {
            this.f394a.mo8695d(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* renamed from: c.a.d.f$e */
    static class C0669e extends C0688v<AtomicLongArray> {

        /* renamed from: a */
        final /* synthetic */ C0688v f395a;

        C0669e(C0688v vVar) {
            this.f395a = vVar;
        }

        /* renamed from: e */
        public AtomicLongArray mo8694b(C0809a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.mo8862a();
            while (aVar.mo8870t()) {
                arrayList.add(Long.valueOf(((Number) this.f395a.mo8694b(aVar)).longValue()));
            }
            aVar.mo8865j();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i = 0; i < size; i++) {
                atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
            }
            return atomicLongArray;
        }

        /* renamed from: f */
        public void mo8695d(C0812c cVar, AtomicLongArray atomicLongArray) {
            cVar.mo8883g();
            int length = atomicLongArray.length();
            for (int i = 0; i < length; i++) {
                this.f395a.mo8695d(cVar, Long.valueOf(atomicLongArray.get(i)));
            }
            cVar.mo8885j();
        }
    }

    /* renamed from: c.a.d.f$f */
    static class C0670f<T> extends C0688v<T> {

        /* renamed from: a */
        private C0688v<T> f396a;

        C0670f() {
        }

        /* renamed from: b */
        public T mo8694b(C0809a aVar) {
            C0688v<T> vVar = this.f396a;
            if (vVar != null) {
                return vVar.mo8694b(aVar);
            }
            throw new IllegalStateException();
        }

        /* renamed from: d */
        public void mo8695d(C0812c cVar, T t) {
            C0688v<T> vVar = this.f396a;
            if (vVar != null) {
                vVar.mo8695d(cVar, t);
                return;
            }
            throw new IllegalStateException();
        }

        /* renamed from: e */
        public void mo8729e(C0688v<T> vVar) {
            if (this.f396a == null) {
                this.f396a = vVar;
                return;
            }
            throw new AssertionError();
        }
    }

    public C0664f() {
        this(C0711d.f440g, C0656d.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, C0685u.DEFAULT, (String) null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    C0664f(C0711d dVar, C0663e eVar, Map<Type, C0672h<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C0685u uVar, String str, int i, int i2, List<C0690w> list, List<C0690w> list2, List<C0690w> list3) {
        C0711d dVar2 = dVar;
        boolean z8 = z7;
        this.f384a = new ThreadLocal<>();
        this.f385b = new ConcurrentHashMap();
        Map<Type, C0672h<?>> map2 = map;
        this.f386c = new C0696c(map);
        this.f389f = z;
        this.f390g = z3;
        this.f391h = z4;
        this.f392i = z5;
        this.f393j = z6;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C0764n.f574Y);
        arrayList.add(C0748h.f512b);
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(C0764n.f553D);
        arrayList.add(C0764n.f588m);
        arrayList.add(C0764n.f582g);
        arrayList.add(C0764n.f584i);
        arrayList.add(C0764n.f586k);
        C0688v<Number> n = m620n(uVar);
        arrayList.add(C0764n.m889c(Long.TYPE, Long.class, n));
        arrayList.add(C0764n.m889c(Double.TYPE, Double.class, m618e(z8)));
        arrayList.add(C0764n.m889c(Float.TYPE, Float.class, m619f(z8)));
        arrayList.add(C0764n.f599x);
        arrayList.add(C0764n.f590o);
        arrayList.add(C0764n.f592q);
        arrayList.add(C0764n.m888b(AtomicLong.class, m615b(n)));
        arrayList.add(C0764n.m888b(AtomicLongArray.class, m616c(n)));
        arrayList.add(C0764n.f594s);
        arrayList.add(C0764n.f601z);
        arrayList.add(C0764n.f555F);
        arrayList.add(C0764n.f557H);
        arrayList.add(C0764n.m888b(BigDecimal.class, C0764n.f551B));
        arrayList.add(C0764n.m888b(BigInteger.class, C0764n.f552C));
        arrayList.add(C0764n.f559J);
        arrayList.add(C0764n.f561L);
        arrayList.add(C0764n.f565P);
        arrayList.add(C0764n.f567R);
        arrayList.add(C0764n.f572W);
        arrayList.add(C0764n.f563N);
        arrayList.add(C0764n.f579d);
        arrayList.add(C0739c.f493b);
        arrayList.add(C0764n.f570U);
        arrayList.add(C0757k.f533b);
        arrayList.add(C0755j.f531b);
        arrayList.add(C0764n.f568S);
        arrayList.add(C0735a.f487c);
        arrayList.add(C0764n.f577b);
        arrayList.add(new C0737b(this.f386c));
        boolean z9 = z2;
        arrayList.add(new C0746g(this.f386c, z2));
        C0741d dVar3 = new C0741d(this.f386c);
        this.f387d = dVar3;
        arrayList.add(dVar3);
        arrayList.add(C0764n.f575Z);
        C0663e eVar2 = eVar;
        arrayList.add(new C0751i(this.f386c, eVar, dVar, this.f387d));
        this.f388e = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    private static void m614a(Object obj, C0809a aVar) {
        if (obj != null) {
            try {
                if (aVar.mo8861V() != C0811b.END_DOCUMENT) {
                    throw new C0677m("JSON document was not fully consumed.");
                }
            } catch (C0813d e) {
                throw new C0684t((Throwable) e);
            } catch (IOException e2) {
                throw new C0677m((Throwable) e2);
            }
        }
    }

    /* renamed from: b */
    private static C0688v<AtomicLong> m615b(C0688v<Number> vVar) {
        return new C0668d(vVar).mo8769a();
    }

    /* renamed from: c */
    private static C0688v<AtomicLongArray> m616c(C0688v<Number> vVar) {
        return new C0669e(vVar).mo8769a();
    }

    /* renamed from: d */
    static void m617d(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: e */
    private C0688v<Number> m618e(boolean z) {
        return z ? C0764n.f597v : new C0665a(this);
    }

    /* renamed from: f */
    private C0688v<Number> m619f(boolean z) {
        return z ? C0764n.f596u : new C0666b(this);
    }

    /* renamed from: n */
    private static C0688v<Number> m620n(C0685u uVar) {
        return uVar == C0685u.DEFAULT ? C0764n.f595t : new C0667c();
    }

    /* renamed from: g */
    public <T> T mo8702g(C0809a aVar, Type type) {
        boolean u = aVar.mo8975u();
        aVar.mo8973b0(true);
        try {
            aVar.mo8861V();
            T b = mo8706k(C0808a.m1033b(type)).mo8694b(aVar);
            aVar.mo8973b0(u);
            return b;
        } catch (EOFException e) {
            if (1 != 0) {
                aVar.mo8973b0(u);
                return null;
            }
            throw new C0684t((Throwable) e);
        } catch (IllegalStateException e2) {
            throw new C0684t((Throwable) e2);
        } catch (IOException e3) {
            throw new C0684t((Throwable) e3);
        } catch (AssertionError e4) {
            throw new AssertionError("AssertionError (GSON 2.8.5): " + e4.getMessage(), e4);
        } catch (Throwable th) {
            aVar.mo8973b0(u);
            throw th;
        }
    }

    /* renamed from: h */
    public <T> T mo8703h(Reader reader, Type type) {
        C0809a o = mo8709o(reader);
        T g = mo8702g(o, type);
        m614a(g, o);
        return g;
    }

    /* renamed from: i */
    public <T> T mo8704i(String str, Class<T> cls) {
        return C0726k.m783c(cls).cast(mo8705j(str, cls));
    }

    /* renamed from: j */
    public <T> T mo8705j(String str, Type type) {
        if (str == null) {
            return null;
        }
        return mo8703h(new StringReader(str), type);
    }

    /* renamed from: k */
    public <T> C0688v<T> mo8706k(C0808a<T> aVar) {
        C0688v<T> vVar = this.f385b.get(aVar == null ? f383k : aVar);
        if (vVar != null) {
            return vVar;
        }
        Map map = this.f384a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap();
            this.f384a.set(map);
            z = true;
        }
        C0670f fVar = (C0670f) map.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            C0670f fVar2 = new C0670f();
            map.put(aVar, fVar2);
            for (C0690w a : this.f388e) {
                C0688v<T> a2 = a.mo8771a(this, aVar);
                if (a2 != null) {
                    fVar2.mo8729e(a2);
                    this.f385b.put(aVar, a2);
                    return a2;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.5) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.f384a.remove();
            }
        }
    }

    /* renamed from: l */
    public <T> C0688v<T> mo8707l(Class<T> cls) {
        return mo8706k(C0808a.m1032a(cls));
    }

    /* renamed from: m */
    public <T> C0688v<T> mo8708m(C0690w wVar, C0808a<T> aVar) {
        if (!this.f388e.contains(wVar)) {
            wVar = this.f387d;
        }
        boolean z = false;
        for (C0690w next : this.f388e) {
            if (z) {
                C0688v<T> a = next.mo8771a(this, aVar);
                if (a != null) {
                    return a;
                }
            } else if (next == wVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    /* renamed from: o */
    public C0809a mo8709o(Reader reader) {
        C0809a aVar = new C0809a(reader);
        aVar.mo8973b0(this.f393j);
        return aVar;
    }

    /* renamed from: p */
    public C0812c mo8710p(Writer writer) {
        if (this.f390g) {
            writer.write(")]}'\n");
        }
        C0812c cVar = new C0812c(writer);
        if (this.f392i) {
            cVar.mo8977M("  ");
        }
        cVar.mo8979R(this.f389f);
        return cVar;
    }

    /* renamed from: q */
    public String mo8711q(C0676l lVar) {
        StringWriter stringWriter = new StringWriter();
        mo8716u(lVar, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: r */
    public String mo8712r(Object obj) {
        return obj == null ? mo8711q(C0678n.f414a) : mo8713s(obj, obj.getClass());
    }

    /* renamed from: s */
    public String mo8713s(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        mo8718w(obj, type, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: t */
    public void mo8714t(C0676l lVar, C0812c cVar) {
        boolean t = cVar.mo8982t();
        cVar.mo8978Q(true);
        boolean s = cVar.mo8981s();
        cVar.mo8976L(this.f391h);
        boolean o = cVar.mo8980o();
        cVar.mo8979R(this.f389f);
        try {
            C0727l.m785b(lVar, cVar);
            cVar.mo8978Q(t);
            cVar.mo8976L(s);
            cVar.mo8979R(o);
        } catch (IOException e) {
            throw new C0677m((Throwable) e);
        } catch (AssertionError e2) {
            throw new AssertionError("AssertionError (GSON 2.8.5): " + e2.getMessage(), e2);
        } catch (Throwable th) {
            cVar.mo8978Q(t);
            cVar.mo8976L(s);
            cVar.mo8979R(o);
            throw th;
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f389f + ",factories:" + this.f388e + ",instanceCreators:" + this.f386c + "}";
    }

    /* renamed from: u */
    public void mo8716u(C0676l lVar, Appendable appendable) {
        try {
            mo8714t(lVar, mo8710p(C0727l.m786c(appendable)));
        } catch (IOException e) {
            throw new C0677m((Throwable) e);
        }
    }

    /* renamed from: v */
    public void mo8717v(Object obj, Type type, C0812c cVar) {
        C0688v<?> k = mo8706k(C0808a.m1033b(type));
        boolean t = cVar.mo8982t();
        cVar.mo8978Q(true);
        boolean s = cVar.mo8981s();
        cVar.mo8976L(this.f391h);
        boolean o = cVar.mo8980o();
        cVar.mo8979R(this.f389f);
        try {
            k.mo8695d(cVar, obj);
            cVar.mo8978Q(t);
            cVar.mo8976L(s);
            cVar.mo8979R(o);
        } catch (IOException e) {
            throw new C0677m((Throwable) e);
        } catch (AssertionError e2) {
            throw new AssertionError("AssertionError (GSON 2.8.5): " + e2.getMessage(), e2);
        } catch (Throwable th) {
            cVar.mo8978Q(t);
            cVar.mo8976L(s);
            cVar.mo8979R(o);
            throw th;
        }
    }

    /* renamed from: w */
    public void mo8718w(Object obj, Type type, Appendable appendable) {
        try {
            mo8717v(obj, type, mo8710p(C0727l.m786c(appendable)));
        } catch (IOException e) {
            throw new C0677m((Throwable) e);
        }
    }
}
