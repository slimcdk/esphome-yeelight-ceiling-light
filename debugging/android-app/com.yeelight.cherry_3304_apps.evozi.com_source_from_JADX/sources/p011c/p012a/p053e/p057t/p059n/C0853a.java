package p011c.p012a.p053e.p057t.p059n;

/* renamed from: c.a.e.t.n.a */
public final class C0853a {

    /* renamed from: h */
    public static final C0853a f845h = new C0853a(4201, 4096, 1);

    /* renamed from: i */
    public static final C0853a f846i = new C0853a(1033, 1024, 1);

    /* renamed from: j */
    public static final C0853a f847j = new C0853a(67, 64, 1);

    /* renamed from: k */
    public static final C0853a f848k = new C0853a(19, 16, 1);

    /* renamed from: l */
    public static final C0853a f849l = new C0853a(285, 256, 0);

    /* renamed from: m */
    public static final C0853a f850m;

    /* renamed from: n */
    public static final C0853a f851n;

    /* renamed from: o */
    public static final C0853a f852o = f847j;

    /* renamed from: a */
    private final int[] f853a;

    /* renamed from: b */
    private final int[] f854b;

    /* renamed from: c */
    private final C0854b f855c;

    /* renamed from: d */
    private final C0854b f856d;

    /* renamed from: e */
    private final int f857e;

    /* renamed from: f */
    private final int f858f;

    /* renamed from: g */
    private final int f859g;

    static {
        C0853a aVar = new C0853a(301, 256, 1);
        f850m = aVar;
        f851n = aVar;
    }

    public C0853a(int i, int i2, int i3) {
        this.f858f = i;
        this.f857e = i2;
        this.f859g = i3;
        this.f853a = new int[i2];
        this.f854b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f853a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f854b[this.f853a[i6]] = i6;
        }
        this.f855c = new C0854b(this, new int[]{0});
        this.f856d = new C0854b(this, new int[]{1});
    }

    /* renamed from: a */
    static int m1267a(int i, int i2) {
        return i ^ i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0854b mo9100b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f855c;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C0854b(this, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo9101c(int i) {
        return this.f853a[i];
    }

    /* renamed from: d */
    public int mo9102d() {
        return this.f859g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C0854b mo9103e() {
        return this.f856d;
    }

    /* renamed from: f */
    public int mo9104f() {
        return this.f857e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C0854b mo9105g() {
        return this.f855c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo9106h(int i) {
        if (i != 0) {
            return this.f853a[(this.f857e - this.f854b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo9107i(int i) {
        if (i != 0) {
            return this.f854b[i];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo9108j(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f853a;
        int[] iArr2 = this.f854b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f857e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f858f) + ',' + this.f857e + ')';
    }
}
