package p164h.p211a.p212a.p217d;

import p164h.p211a.p212a.p217d.C10935i;
import p164h.p211a.p212a.p217d.p219v.C10956c;
import p164h.p211a.p212a.p217d.p219v.C10957d;

/* renamed from: h.a.a.d.b */
public abstract class C10925b implements C10935i {

    /* renamed from: a */
    protected final C10935i.C10936a f21300a;

    /* renamed from: b */
    protected final int f21301b;

    /* renamed from: c */
    protected final C10935i.C10936a f21302c;

    /* renamed from: d */
    protected final int f21303d;

    /* renamed from: e */
    protected final C10935i.C10936a f21304e;

    /* renamed from: h.a.a.d.b$a */
    static /* synthetic */ class C10926a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21305a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                h.a.a.d.i$a[] r0 = p164h.p211a.p212a.p217d.C10935i.C10936a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21305a = r0
                h.a.a.d.i$a r1 = p164h.p211a.p212a.p217d.C10935i.C10936a.BYTE_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21305a     // Catch:{ NoSuchFieldError -> 0x001d }
                h.a.a.d.i$a r1 = p164h.p211a.p212a.p217d.C10935i.C10936a.DIRECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f21305a     // Catch:{ NoSuchFieldError -> 0x0028 }
                h.a.a.d.i$a r1 = p164h.p211a.p212a.p217d.C10935i.C10936a.INDIRECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p217d.C10925b.C10926a.<clinit>():void");
        }
    }

    public C10925b(C10935i.C10936a aVar, int i, C10935i.C10936a aVar2, int i2, C10935i.C10936a aVar3) {
        this.f21300a = aVar;
        this.f21301b = i;
        this.f21302c = aVar2;
        this.f21303d = i2;
        this.f21304e = aVar3;
    }

    /* renamed from: e */
    public int mo34596e() {
        return this.f21303d;
    }

    /* renamed from: f */
    public int mo34597f() {
        return this.f21301b;
    }

    /* renamed from: g */
    public final boolean mo34598g(C10929e eVar) {
        if (eVar.capacity() != this.f21303d) {
            return false;
        }
        int i = C10926a.f21305a[this.f21302c.ordinal()];
        if (i == 1) {
            return (eVar instanceof C10938k) && !(eVar instanceof C10957d);
        }
        if (i == 2) {
            return eVar instanceof C10956c;
        }
        if (i != 3) {
            return false;
        }
        return eVar instanceof C10957d;
    }

    /* renamed from: h */
    public final boolean mo34599h(C10929e eVar) {
        if (eVar.capacity() != this.f21301b) {
            return false;
        }
        int i = C10926a.f21305a[this.f21300a.ordinal()];
        if (i == 1) {
            return (eVar instanceof C10938k) && !(eVar instanceof C10957d);
        }
        if (i == 2) {
            return eVar instanceof C10956c;
        }
        if (i != 3) {
            return false;
        }
        return eVar instanceof C10957d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C10929e mo34600i() {
        int i = C10926a.f21305a[this.f21302c.ordinal()];
        if (i == 1) {
            return new C10938k(this.f21303d);
        }
        if (i == 2) {
            return new C10956c(this.f21303d);
        }
        if (i == 3) {
            return new C10957d(this.f21303d);
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C10929e mo34601j(int i) {
        int i2 = C10926a.f21305a[this.f21304e.ordinal()];
        if (i2 == 1) {
            return new C10938k(i);
        }
        if (i2 == 2) {
            return new C10956c(i);
        }
        if (i2 == 3) {
            return new C10957d(i);
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final C10929e mo34602k() {
        int i = C10926a.f21305a[this.f21300a.ordinal()];
        if (i == 1) {
            return new C10938k(this.f21301b);
        }
        if (i == 2) {
            return new C10956c(this.f21301b);
        }
        if (i == 3) {
            return new C10957d(this.f21301b);
        }
        throw new IllegalStateException();
    }
}
