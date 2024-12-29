package p107v1;

import com.google.gson.C2468d;
import com.google.gson.C2469e;
import com.google.gson.C2534q;
import com.google.gson.C2536r;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.C2497b;
import com.google.gson.internal.C2512c;
import com.google.gson.internal.C2516f;
import com.google.gson.internal.C2518h;
import com.google.gson.stream.C2537a;
import com.google.gson.stream.JsonToken;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p115x1.C3901b;
import p119y1.C3918a;
import p122z1.C3929a;

/* renamed from: v1.i */
public final class C3753i implements C2536r {

    /* renamed from: a */
    private final C2497b f6292a;

    /* renamed from: b */
    private final C2468d f6293b;

    /* renamed from: c */
    private final C2512c f6294c;

    /* renamed from: d */
    private final C3743d f6295d;

    /* renamed from: e */
    private final C3901b f6296e = C3901b.m11147a();

    /* renamed from: v1.i$a */
    class C3754a extends C3756c {

        /* renamed from: d */
        final /* synthetic */ Field f6297d;

        /* renamed from: e */
        final /* synthetic */ boolean f6298e;

        /* renamed from: f */
        final /* synthetic */ C2534q f6299f;

        /* renamed from: g */
        final /* synthetic */ C2469e f6300g;

        /* renamed from: h */
        final /* synthetic */ C3918a f6301h;

        /* renamed from: i */
        final /* synthetic */ boolean f6302i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3754a(C3753i iVar, String str, boolean z, boolean z2, Field field, boolean z3, C2534q qVar, C2469e eVar, C3918a aVar, boolean z4) {
            super(str, z, z2);
            this.f6297d = field;
            this.f6298e = z3;
            this.f6299f = qVar;
            this.f6300g = eVar;
            this.f6301h = aVar;
            this.f6302i = z4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo26191a(C3929a aVar, Object obj) {
            Object b = this.f6299f.mo19209b(aVar);
            if (b != null || !this.f6302i) {
                this.f6297d.set(obj, b);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo26192b(C2537a aVar, Object obj) {
            (this.f6298e ? this.f6299f : new C3765m(this.f6300g, this.f6299f, this.f6301h.mo26410e())).mo19210d(aVar, this.f6297d.get(obj));
        }

        /* renamed from: c */
        public boolean mo26193c(Object obj) {
            return this.f6306b && this.f6297d.get(obj) != obj;
        }
    }

    /* renamed from: v1.i$b */
    public static final class C3755b<T> extends C2534q<T> {

        /* renamed from: a */
        private final C2516f<T> f6303a;

        /* renamed from: b */
        private final Map<String, C3756c> f6304b;

        C3755b(C2516f<T> fVar, Map<String, C3756c> map) {
            this.f6303a = fVar;
            this.f6304b = map;
        }

        /* renamed from: b */
        public T mo19209b(C3929a aVar) {
            if (aVar.mo26169N() == JsonToken.NULL) {
                aVar.mo26167G();
                return null;
            }
            T a = this.f6303a.mo19367a();
            try {
                aVar.mo26171c();
                while (aVar.mo26177n()) {
                    C3756c cVar = this.f6304b.get(aVar.mo26166D());
                    if (cVar != null) {
                        if (cVar.f6307c) {
                            cVar.mo26191a(aVar, a);
                        }
                    }
                    aVar.mo26174j0();
                }
                aVar.mo26175k();
                return a;
            } catch (IllegalStateException e) {
                throw new JsonSyntaxException((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        /* renamed from: d */
        public void mo19210d(C2537a aVar, T t) {
            if (t == null) {
                aVar.mo19434s();
                return;
            }
            aVar.mo19426f();
            try {
                for (C3756c next : this.f6304b.values()) {
                    if (next.mo26193c(t)) {
                        aVar.mo19433p(next.f6305a);
                        next.mo26192b(aVar, t);
                    }
                }
                aVar.mo19429k();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: v1.i$c */
    static abstract class C3756c {

        /* renamed from: a */
        final String f6305a;

        /* renamed from: b */
        final boolean f6306b;

        /* renamed from: c */
        final boolean f6307c;

        protected C3756c(String str, boolean z, boolean z2) {
            this.f6305a = str;
            this.f6306b = z;
            this.f6307c = z2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo26191a(C3929a aVar, Object obj);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract void mo26192b(C2537a aVar, Object obj);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract boolean mo26193c(Object obj);
    }

    public C3753i(C2497b bVar, C2468d dVar, C2512c cVar, C3743d dVar2) {
        this.f6292a = bVar;
        this.f6293b = dVar;
        this.f6294c = cVar;
        this.f6295d = dVar2;
    }

    /* renamed from: b */
    private C3756c m10692b(C2469e eVar, Field field, String str, C3918a<?> aVar, boolean z, boolean z2) {
        C2469e eVar2 = eVar;
        C3918a<?> aVar2 = aVar;
        boolean b = C2518h.m6796b(aVar.mo26409c());
        Field field2 = field;
        JsonAdapter jsonAdapter = (JsonAdapter) field.getAnnotation(JsonAdapter.class);
        C2534q<?> b2 = jsonAdapter != null ? this.f6295d.mo26163b(this.f6292a, eVar, aVar2, jsonAdapter) : null;
        boolean z3 = b2 != null;
        if (b2 == null) {
            b2 = eVar.mo19229l(aVar2);
        }
        return new C3754a(this, str, z, z2, field, z3, b2, eVar, aVar, b);
    }

    /* renamed from: d */
    static boolean m10693d(Field field, boolean z, C2512c cVar) {
        return !cVar.mo19370c(field.getType(), z) && !cVar.mo19372f(field, z);
    }

    /* renamed from: e */
    private Map<String, C3756c> m10694e(C2469e eVar, C3918a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type e = aVar.mo26410e();
        C3918a<?> aVar2 = aVar;
        Class<? super Object> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean c = mo26190c(field, true);
                boolean c2 = mo26190c(field, z);
                if (c || c2) {
                    this.f6296e.mo26384b(field);
                    Type p = C$Gson$Types.m6728p(aVar2.mo26410e(), cls2, field.getGenericType());
                    List<String> f = m10695f(field);
                    int size = f.size();
                    C3756c cVar = null;
                    int i2 = 0;
                    while (i2 < size) {
                        String str = f.get(i2);
                        boolean z2 = i2 != 0 ? false : c;
                        String str2 = str;
                        int i3 = i2;
                        C3756c cVar2 = cVar;
                        int i4 = size;
                        List<String> list = f;
                        Field field2 = field;
                        cVar = cVar2 == null ? (C3756c) linkedHashMap.put(str2, m10692b(eVar, field, str2, C3918a.m11208b(p), z2, c2)) : cVar2;
                        i2 = i3 + 1;
                        c = z2;
                        f = list;
                        size = i4;
                        field = field2;
                    }
                    C3756c cVar3 = cVar;
                    if (cVar3 != null) {
                        throw new IllegalArgumentException(e + " declares multiple JSON fields named " + cVar3.f6305a);
                    }
                }
                i++;
                z = false;
            }
            aVar2 = C3918a.m11208b(C$Gson$Types.m6728p(aVar2.mo26410e(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.mo26409c();
        }
        return linkedHashMap;
    }

    /* renamed from: f */
    private List<String> m10695f(Field field) {
        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
        if (serializedName == null) {
            return Collections.singletonList(this.f6293b.translateName(field));
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
    public <T> C2534q<T> mo19368a(C2469e eVar, C3918a<T> aVar) {
        Class<? super T> c = aVar.mo26409c();
        if (!Object.class.isAssignableFrom(c)) {
            return null;
        }
        return new C3755b(this.f6292a.mo19365a(aVar), m10694e(eVar, aVar, c));
    }

    /* renamed from: c */
    public boolean mo26190c(Field field, boolean z) {
        return m10693d(field, z, this.f6294c);
    }
}
