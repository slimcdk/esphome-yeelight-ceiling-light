package p011c.p012a.p046d.p047x.p048n;

import java.util.ArrayList;
import p011c.p012a.p046d.C0664f;
import p011c.p012a.p046d.C0688v;
import p011c.p012a.p046d.C0690w;
import p011c.p012a.p046d.p047x.C0716h;
import p011c.p012a.p046d.p051y.C0808a;
import p011c.p012a.p046d.p052z.C0809a;
import p011c.p012a.p046d.p052z.C0812c;

/* renamed from: c.a.d.x.n.h */
public final class C0748h extends C0688v<Object> {

    /* renamed from: b */
    public static final C0690w f512b = new C0749a();

    /* renamed from: a */
    private final C0664f f513a;

    /* renamed from: c.a.d.x.n.h$a */
    static class C0749a implements C0690w {
        C0749a() {
        }

        /* renamed from: a */
        public <T> C0688v<T> mo8771a(C0664f fVar, C0808a<T> aVar) {
            if (aVar.mo8967c() == Object.class) {
                return new C0748h(fVar);
            }
            return null;
        }
    }

    /* renamed from: c.a.d.x.n.h$b */
    static /* synthetic */ class C0750b {

        /* renamed from: a */
        static final /* synthetic */ int[] f514a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                c.a.d.z.b[] r0 = p011c.p012a.p046d.p052z.C0811b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f514a = r0
                c.a.d.z.b r1 = p011c.p012a.p046d.p052z.C0811b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f514a     // Catch:{ NoSuchFieldError -> 0x001d }
                c.a.d.z.b r1 = p011c.p012a.p046d.p052z.C0811b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f514a     // Catch:{ NoSuchFieldError -> 0x0028 }
                c.a.d.z.b r1 = p011c.p012a.p046d.p052z.C0811b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f514a     // Catch:{ NoSuchFieldError -> 0x0033 }
                c.a.d.z.b r1 = p011c.p012a.p046d.p052z.C0811b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f514a     // Catch:{ NoSuchFieldError -> 0x003e }
                c.a.d.z.b r1 = p011c.p012a.p046d.p052z.C0811b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f514a     // Catch:{ NoSuchFieldError -> 0x0049 }
                c.a.d.z.b r1 = p011c.p012a.p046d.p052z.C0811b.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p046d.p047x.p048n.C0748h.C0750b.<clinit>():void");
        }
    }

    C0748h(C0664f fVar) {
        this.f513a = fVar;
    }

    /* renamed from: b */
    public Object mo8694b(C0809a aVar) {
        switch (C0750b.f514a[aVar.mo8861V().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.mo8862a();
                while (aVar.mo8870t()) {
                    arrayList.add(mo8694b(aVar));
                }
                aVar.mo8865j();
                return arrayList;
            case 2:
                C0716h hVar = new C0716h();
                aVar.mo8863b();
                while (aVar.mo8870t()) {
                    hVar.put(aVar.mo8858L(), mo8694b(aVar));
                }
                aVar.mo8867n();
                return hVar;
            case 3:
                return aVar.mo8860S();
            case 4:
                return Double.valueOf(aVar.mo8855I());
            case 5:
                return Boolean.valueOf(aVar.mo8854F());
            case 6:
                aVar.mo8859Q();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: d */
    public void mo8695d(C0812c cVar, Object obj) {
        if (obj == null) {
            cVar.mo8874D();
            return;
        }
        C0688v<?> l = this.f513a.mo8707l(obj.getClass());
        if (l instanceof C0748h) {
            cVar.mo8884h();
            cVar.mo8886n();
            return;
        }
        l.mo8695d(cVar, obj);
    }
}
