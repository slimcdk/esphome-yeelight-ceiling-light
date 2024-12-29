package p034f2;

/* renamed from: f2.a */
public final class C3161a {

    /* renamed from: h */
    public static final C3161a f5069h = new C3161a(4201, 4096, 1);

    /* renamed from: i */
    public static final C3161a f5070i = new C3161a(1033, 1024, 1);

    /* renamed from: j */
    public static final C3161a f5071j;

    /* renamed from: k */
    public static final C3161a f5072k = new C3161a(19, 16, 1);

    /* renamed from: l */
    public static final C3161a f5073l = new C3161a(285, 256, 0);

    /* renamed from: m */
    public static final C3161a f5074m;

    /* renamed from: n */
    public static final C3161a f5075n;

    /* renamed from: o */
    public static final C3161a f5076o;

    /* renamed from: a */
    private final int[] f5077a;

    /* renamed from: b */
    private final int[] f5078b;

    /* renamed from: c */
    private final C3162b f5079c;

    /* renamed from: d */
    private final C3162b f5080d;

    /* renamed from: e */
    private final int f5081e;

    /* renamed from: f */
    private final int f5082f;

    /* renamed from: g */
    private final int f5083g;

    static {
        C3161a aVar = new C3161a(67, 64, 1);
        f5071j = aVar;
        C3161a aVar2 = new C3161a(301, 256, 1);
        f5074m = aVar2;
        f5075n = aVar2;
        f5076o = aVar;
    }

    public C3161a(int i, int i2, int i3) {
        this.f5082f = i;
        this.f5081e = i2;
        this.f5083g = i3;
        this.f5077a = new int[i2];
        this.f5078b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f5077a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f5078b[this.f5077a[i6]] = i6;
        }
        this.f5079c = new C3162b(this, new int[]{0});
        this.f5080d = new C3162b(this, new int[]{1});
    }

    /* renamed from: a */
    static int m8484a(int i, int i2) {
        return i ^ i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C3162b mo23670b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f5079c;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C3162b(this, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo23671c(int i) {
        return this.f5077a[i];
    }

    /* renamed from: d */
    public int mo23672d() {
        return this.f5083g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C3162b mo23673e() {
        return this.f5080d;
    }

    /* renamed from: f */
    public int mo23674f() {
        return this.f5081e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C3162b mo23675g() {
        return this.f5079c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo23676h(int i) {
        if (i != 0) {
            return this.f5077a[(this.f5081e - this.f5078b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo23677i(int i) {
        if (i != 0) {
            return this.f5078b[i];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo23678j(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f5077a;
        int[] iArr2 = this.f5078b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f5081e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f5082f) + ',' + this.f5081e + ')';
    }
}
