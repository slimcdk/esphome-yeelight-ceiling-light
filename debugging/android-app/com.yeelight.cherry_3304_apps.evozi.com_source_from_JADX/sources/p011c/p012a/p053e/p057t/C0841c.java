package p011c.p012a.p053e.p057t;

/* renamed from: c.a.e.t.c */
public final class C0841c {

    /* renamed from: a */
    private final byte[] f777a;

    /* renamed from: b */
    private int f778b;

    /* renamed from: c */
    private int f779c;

    public C0841c(byte[] bArr) {
        this.f777a = bArr;
    }

    /* renamed from: a */
    public int mo9074a() {
        return ((this.f777a.length - this.f778b) * 8) - this.f779c;
    }

    /* renamed from: b */
    public int mo9075b() {
        return this.f779c;
    }

    /* renamed from: c */
    public int mo9076c() {
        return this.f778b;
    }

    /* renamed from: d */
    public int mo9077d(int i) {
        if (i <= 0 || i > 32 || i > mo9074a()) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        int i2 = this.f779c;
        byte b = 0;
        if (i2 > 0) {
            int i3 = 8 - i2;
            int i4 = i < i3 ? i : i3;
            int i5 = i3 - i4;
            byte[] bArr = this.f777a;
            int i6 = this.f778b;
            int i7 = (((255 >> (8 - i4)) << i5) & bArr[i6]) >> i5;
            i -= i4;
            int i8 = this.f779c + i4;
            this.f779c = i8;
            if (i8 == 8) {
                this.f779c = 0;
                this.f778b = i6 + 1;
            }
            b = i7;
        }
        if (i <= 0) {
            return b;
        }
        while (i >= 8) {
            int i9 = b << 8;
            byte[] bArr2 = this.f777a;
            int i10 = this.f778b;
            b = (bArr2[i10] & 255) | i9;
            this.f778b = i10 + 1;
            i -= 8;
        }
        if (i <= 0) {
            return b;
        }
        int i11 = 8 - i;
        int i12 = (b << i) | ((((255 >> i11) << i11) & this.f777a[this.f778b]) >> i11);
        this.f779c += i;
        return i12;
    }
}
