package p011c.p012a.p046d.p047x.p048n;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p011c.p012a.p046d.C0663e;
import p011c.p012a.p046d.C0664f;
import p011c.p012a.p046d.C0684t;
import p011c.p012a.p046d.C0688v;
import p011c.p012a.p046d.C0690w;
import p011c.p012a.p046d.p047x.C0692b;
import p011c.p012a.p046d.p047x.C0696c;
import p011c.p012a.p046d.p047x.C0711d;
import p011c.p012a.p046d.p047x.C0724i;
import p011c.p012a.p046d.p047x.C0726k;
import p011c.p012a.p046d.p047x.p050o.C0806b;
import p011c.p012a.p046d.p051y.C0808a;
import p011c.p012a.p046d.p052z.C0809a;
import p011c.p012a.p046d.p052z.C0811b;
import p011c.p012a.p046d.p052z.C0812c;

/* renamed from: c.a.d.x.n.i */
public final class C0751i implements C0690w {

    /* renamed from: a */
    private final C0696c f515a;

    /* renamed from: b */
    private final C0663e f516b;

    /* renamed from: c */
    private final C0711d f517c;

    /* renamed from: d */
    private final C0741d f518d;

    /* renamed from: e */
    private final C0806b f519e = C0806b.m1026a();

    /* renamed from: c.a.d.x.n.i$a */
    class C0752a extends C0754c {

        /* renamed from: d */
        final /* synthetic */ Field f520d;

        /* renamed from: e */
        final /* synthetic */ boolean f521e;

        /* renamed from: f */
        final /* synthetic */ C0688v f522f;

        /* renamed from: g */
        final /* synthetic */ C0664f f523g;

        /* renamed from: h */
        final /* synthetic */ C0808a f524h;

        /* renamed from: i */
        final /* synthetic */ boolean f525i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0752a(C0751i iVar, String str, boolean z, boolean z2, Field field, boolean z3, C0688v vVar, C0664f fVar, C0808a aVar, boolean z4) {
            super(str, z, z2);
            this.f520d = field;
            this.f521e = z3;
            this.f522f = vVar;
            this.f523g = fVar;
            this.f524h = aVar;
            this.f525i = z4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo8894a(C0809a aVar, Object obj) {
            Object b = this.f522f.mo8694b(aVar);
            if (b != null || !this.f525i) {
                this.f520d.set(obj, b);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo8895b(C0812c cVar, Object obj) {
            (this.f521e ? this.f522f : new C0763m(this.f523g, this.f522f, this.f524h.mo8968e())).mo8695d(cVar, this.f520d.get(obj));
        }

        /* renamed from: c */
        public boolean mo8896c(Object obj) {
            return this.f529b && this.f520d.get(obj) != obj;
        }
    }

    /* renamed from: c.a.d.x.n.i$b */
    public static final class C0753b<T> extends C0688v<T> {

        /* renamed from: a */
        private final C0724i<T> f526a;

        /* renamed from: b */
        private final Map<String, C0754c> f527b;

        C0753b(C0724i<T> iVar, Map<String, C0754c> map) {
            this.f526a = iVar;
            this.f527b = map;
        }

        /* renamed from: b */
        public T mo8694b(C0809a aVar) {
            if (aVar.mo8861V() == C0811b.NULL) {
                aVar.mo8859Q();
                return null;
            }
            T a = this.f526a.mo8789a();
            try {
                aVar.mo8863b();
                while (aVar.mo8870t()) {
                    C0754c cVar = this.f527b.get(aVar.mo8858L());
                    if (cVar != null) {
                        if (cVar.f530c) {
                            cVar.mo8894a(aVar, a);
                        }
                    }
                    aVar.mo8866j0();
                }
                aVar.mo8867n();
                return a;
            } catch (IllegalStateException e) {
                throw new C0684t((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        /* renamed from: d */
        public void mo8695d(C0812c cVar, T t) {
            if (t == null) {
                cVar.mo8874D();
                return;
            }
            cVar.mo8884h();
            try {
                for (C0754c next : this.f527b.values()) {
                    if (next.mo8896c(t)) {
                        cVar.mo8887u(next.f528a);
                        next.mo8895b(cVar, t);
                    }
                }
                cVar.mo8886n();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: c.a.d.x.n.i$c */
    static abstract class C0754c {

        /* renamed from: a */
        final String f528a;

        /* renamed from: b */
        final boolean f529b;

        /* renamed from: c */
        final boolean f530c;

        protected C0754c(String str, boolean z, boolean z2) {
            this.f528a = str;
            this.f529b = z;
            this.f530c = z2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo8894a(C0809a aVar, Object obj);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract void mo8895b(C0812c cVar, Object obj);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract boolean mo8896c(Object obj);
    }

    public C0751i(C0696c cVar, C0663e eVar, C0711d dVar, C0741d dVar2) {
        this.f515a = cVar;
        this.f516b = eVar;
        this.f517c = dVar;
        this.f518d = dVar2;
    }

    /* renamed from: b */
    private C0754c m855b(C0664f fVar, Field field, String str, C0808a<?> aVar, boolean z, boolean z2) {
        C0664f fVar2 = fVar;
        C0808a<?> aVar2 = aVar;
        boolean b = C0726k.m782b(aVar.mo8967c());
        Field field2 = field;
        JsonAdapter jsonAdapter = (JsonAdapter) field.getAnnotation(JsonAdapter.class);
        C0688v<?> b2 = jsonAdapter != null ? this.f518d.mo8853b(this.f515a, fVar, aVar2, jsonAdapter) : null;
        boolean z3 = b2 != null;
        if (b2 == null) {
            b2 = fVar.mo8706k(aVar2);
        }
        return new C0752a(this, str, z, z2, field, z3, b2, fVar, aVar, b);
    }

    /* renamed from: d */
    static boolean m856d(Field field, boolean z, C0711d dVar) {
        return !dVar.mo8791c(field.getType(), z) && !dVar.mo8793f(field, z);
    }

    /* renamed from: e */
    private Map<String, C0754c> m857e(C0664f fVar, C0808a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type e = aVar.mo8968e();
        C0808a<?> aVar2 = aVar;
        Class<? super Object> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean c = mo8893c(field, true);
                boolean c2 = mo8893c(field, z);
                if (c || c2) {
                    this.f519e.mo8965b(field);
                    Type p = C0692b.m716p(aVar2.mo8968e(), cls2, field.getGenericType());
                    List<String> f = m858f(field);
                    int size = f.size();
                    C0754c cVar = null;
                    int i2 = 0;
                    while (i2 < size) {
                        String str = f.get(i2);
                        boolean z2 = i2 != 0 ? false : c;
                        String str2 = str;
                        int i3 = i2;
                        C0754c cVar2 = cVar;
                        int i4 = size;
                        List<String> list = f;
                        Field field2 = field;
                        cVar = cVar2 == null ? (C0754c) linkedHashMap.put(str2, m855b(fVar, field, str2, C0808a.m1033b(p), z2, c2)) : cVar2;
                        i2 = i3 + 1;
                        c = z2;
                        f = list;
                        size = i4;
                        field = field2;
                    }
                    C0754c cVar3 = cVar;
                    if (cVar3 != null) {
                        throw new IllegalArgumentException(e + " declares multiple JSON fields named " + cVar3.f528a);
                    }
                }
                i++;
                z = false;
            }
            aVar2 = C0808a.m1033b(C0692b.m716p(aVar2.mo8968e(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.mo8967c();
        }
        return linkedHashMap;
    }

    /* renamed from: f */
    private List<String> m858f(Field field) {
        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
        if (serializedName == null) {
            return Collections.singletonList(this.f516b.mo8701a(field));
        }
        String value = serializedName.value();
        String[] alternate = serializedName.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String add : alternate) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: a */
    public <T> C0688v<T> mo8771a(C0664f fVar, C0808a<T> aVar) {
        Class<? super T> c = aVar.mo8967c();
        if (!Object.class.isAssignableFrom(c)) {
            return null;
        }
        return new C0753b(this.f515a.mo8787a(aVar), m857e(fVar, aVar, c));
    }

    /* renamed from: c */
    public boolean mo8893c(Field field, boolean z) {
        return m856d(field, z, this.f517c);
    }
}
