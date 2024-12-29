package p011c.p012a.p053e.p069x.p070d.p071k;

/* renamed from: c.a.e.x.d.k.b */
public final class C0940b {

    /* renamed from: f */
    public static final C0940b f1069f = new C0940b(929, 3);

    /* renamed from: a */
    private final int[] f1070a;

    /* renamed from: b */
    private final int[] f1071b;

    /* renamed from: c */
    private final C0941c f1072c;

    /* renamed from: d */
    private final C0941c f1073d;

    /* renamed from: e */
    private final int f1074e;

    private C0940b(int i, int i2) {
        this.f1074e = i;
        this.f1070a = new int[i];
        this.f1071b = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f1070a[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.f1071b[this.f1070a[i5]] = i5;
        }
        this.f1072c = new C0941c(this, new int[]{0});
        this.f1073d = new C0941c(this, new int[]{1});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo9277a(int i, int i2) {
        return (i + i2) % this.f1074e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0941c mo9278b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f1072c;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C0941c(this, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo9279c(int i) {
        return this.f1070a[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0941c mo9280d() {
        return this.f1073d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo9281e() {
        return this.f1074e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C0941c mo9282f() {
        return this.f1072c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo9283g(int i) {
        if (i != 0) {
            return this.f1070a[(this.f1074e - this.f1071b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo9284h(int i) {
        if (i != 0) {
            return this.f1071b[i];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo9285i(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f1070a;
        int[] iArr2 = this.f1071b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f1074e - 1)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo9286j(int i, int i2) {
        int i3 = this.f1074e;
        return ((i + i3) - i2) % i3;
    }
}
