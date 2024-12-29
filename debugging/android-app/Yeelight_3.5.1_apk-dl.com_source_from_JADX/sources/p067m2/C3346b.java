package p067m2;

/* renamed from: m2.b */
public final class C3346b {

    /* renamed from: f */
    public static final C3346b f5435f = new C3346b(929, 3);

    /* renamed from: a */
    private final int[] f5436a;

    /* renamed from: b */
    private final int[] f5437b;

    /* renamed from: c */
    private final C3347c f5438c;

    /* renamed from: d */
    private final C3347c f5439d;

    /* renamed from: e */
    private final int f5440e;

    private C3346b(int i, int i2) {
        this.f5440e = i;
        this.f5436a = new int[i];
        this.f5437b = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f5436a[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.f5437b[this.f5436a[i5]] = i5;
        }
        this.f5438c = new C3347c(this, new int[]{0});
        this.f5439d = new C3347c(this, new int[]{1});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo24072a(int i, int i2) {
        return (i + i2) % this.f5440e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C3347c mo24073b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f5438c;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C3347c(this, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo24074c(int i) {
        return this.f5436a[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C3347c mo24075d() {
        return this.f5439d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo24076e() {
        return this.f5440e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C3347c mo24077f() {
        return this.f5438c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo24078g(int i) {
        if (i != 0) {
            return this.f5436a[(this.f5440e - this.f5437b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo24079h(int i) {
        if (i != 0) {
            return this.f5437b[i];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo24080i(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f5436a;
        int[] iArr2 = this.f5437b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f5440e - 1)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo24081j(int i, int i2) {
        int i3 = this.f5440e;
        return ((i + i3) - i2) % i3;
    }
}
