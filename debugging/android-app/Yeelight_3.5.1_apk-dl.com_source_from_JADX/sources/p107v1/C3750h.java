package p107v1;

import com.google.gson.C2469e;
import com.google.gson.C2534q;
import com.google.gson.C2536r;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.C2537a;
import java.util.ArrayList;
import p119y1.C3918a;
import p122z1.C3929a;

/* renamed from: v1.h */
public final class C3750h extends C2534q<Object> {

    /* renamed from: b */
    public static final C2536r f6289b = new C3751a();

    /* renamed from: a */
    private final C2469e f6290a;

    /* renamed from: v1.h$a */
    static class C3751a implements C2536r {
        C3751a() {
        }

        /* renamed from: a */
        public <T> C2534q<T> mo19368a(C2469e eVar, C3918a<T> aVar) {
            if (aVar.mo26409c() == Object.class) {
                return new C3750h(eVar);
            }
            return null;
        }
    }

    /* renamed from: v1.h$b */
    static /* synthetic */ class C3752b {

        /* renamed from: a */
        static final /* synthetic */ int[] f6291a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6291a = r0
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6291a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6291a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f6291a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f6291a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f6291a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p107v1.C3750h.C3752b.<clinit>():void");
        }
    }

    C3750h(C2469e eVar) {
        this.f6290a = eVar;
    }

    /* renamed from: b */
    public Object mo19209b(C3929a aVar) {
        switch (C3752b.f6291a[aVar.mo26169N().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.mo26170a();
                while (aVar.mo26177n()) {
                    arrayList.add(mo19209b(aVar));
                }
                aVar.mo26173i();
                return arrayList;
            case 2:
                LinkedTreeMap linkedTreeMap = new LinkedTreeMap();
                aVar.mo26171c();
                while (aVar.mo26177n()) {
                    linkedTreeMap.put(aVar.mo26166D(), mo19209b(aVar));
                }
                aVar.mo26175k();
                return linkedTreeMap;
            case 3:
                return aVar.mo26168I();
            case 4:
                return Double.valueOf(aVar.mo26181z());
            case 5:
                return Boolean.valueOf(aVar.mo26180v());
            case 6:
                aVar.mo26167G();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: d */
    public void mo19210d(C2537a aVar, Object obj) {
        if (obj == null) {
            aVar.mo19434s();
            return;
        }
        C2534q<?> k = this.f6290a.mo19228k(obj.getClass());
        if (k instanceof C3750h) {
            aVar.mo19426f();
            aVar.mo19429k();
            return;
        }
        k.mo19210d(aVar, obj);
    }
}
