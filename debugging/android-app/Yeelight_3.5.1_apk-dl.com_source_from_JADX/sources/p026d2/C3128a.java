package p026d2;

/* renamed from: d2.a */
public final class C3128a {

    /* renamed from: a */
    private final byte[] f5007a;

    /* renamed from: b */
    private int f5008b;

    /* renamed from: c */
    private int f5009c;

    public C3128a(byte[] bArr) {
        this.f5007a = bArr;
    }

    /* renamed from: a */
    public int mo23600a() {
        return ((this.f5007a.length - this.f5008b) * 8) - this.f5009c;
    }

    /* renamed from: b */
    public int mo23601b() {
        return this.f5009c;
    }

    /* renamed from: c */
    public int mo23602c() {
        return this.f5008b;
    }

    /* renamed from: d */
    public int mo23603d(int i) {
        if (i <= 0 || i > 32 || i > mo23600a()) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        int i2 = this.f5009c;
        byte b = 0;
        if (i2 > 0) {
            int i3 = 8 - i2;
            int i4 = i < i3 ? i : i3;
            int i5 = i3 - i4;
            byte[] bArr = this.f5007a;
            int i6 = this.f5008b;
            int i7 = (((255 >> (8 - i4)) << i5) & bArr[i6]) >> i5;
            i -= i4;
            int i8 = i2 + i4;
            this.f5009c = i8;
            if (i8 == 8) {
                this.f5009c = 0;
                this.f5008b = i6 + 1;
            }
            b = i7;
        }
        if (i <= 0) {
            return b;
        }
        while (i >= 8) {
            int i9 = b << 8;
            byte[] bArr2 = this.f5007a;
            int i10 = this.f5008b;
            b = (bArr2[i10] & 255) | i9;
            this.f5008b = i10 + 1;
            i -= 8;
        }
        if (i <= 0) {
            return b;
        }
        int i11 = 8 - i;
        int i12 = (b << i) | ((((255 >> i11) << i11) & this.f5007a[this.f5008b]) >> i11);
        this.f5009c += i;
        return i12;
    }
}
