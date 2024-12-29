package com.google.zxing;

import androidx.core.view.ViewCompat;

/* renamed from: com.google.zxing.e */
public final class C2561e extends C2547c {

    /* renamed from: c */
    private final byte[] f4342c;

    /* renamed from: d */
    private final int f4343d;

    /* renamed from: e */
    private final int f4344e;

    /* renamed from: f */
    private final int f4345f;

    /* renamed from: g */
    private final int f4346g;

    public C2561e(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 > i || i4 + i6 > i2) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f4342c = bArr;
        this.f4343d = i;
        this.f4344e = i2;
        this.f4345f = i3;
        this.f4346g = i4;
        if (z) {
            m6987j(i5, i6);
        }
    }

    /* renamed from: j */
    private void m6987j(int i, int i2) {
        byte[] bArr = this.f4342c;
        int i3 = (this.f4346g * this.f4343d) + this.f4345f;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = (i / 2) + i3;
            int i6 = (i3 + i) - 1;
            int i7 = i3;
            while (i7 < i5) {
                byte b = bArr[i7];
                bArr[i7] = bArr[i6];
                bArr[i6] = b;
                i7++;
                i6--;
            }
            i4++;
            i3 += this.f4343d;
        }
    }

    /* renamed from: b */
    public byte[] mo19462b() {
        int d = mo19464d();
        int a = mo19461a();
        int i = this.f4343d;
        if (d == i && a == this.f4344e) {
            return this.f4342c;
        }
        int i2 = d * a;
        byte[] bArr = new byte[i2];
        int i3 = (this.f4346g * i) + this.f4345f;
        if (d == i) {
            System.arraycopy(this.f4342c, i3, bArr, 0, i2);
            return bArr;
        }
        for (int i4 = 0; i4 < a; i4++) {
            System.arraycopy(this.f4342c, i3, bArr, i4 * d, d);
            i3 += this.f4343d;
        }
        return bArr;
    }

    /* renamed from: c */
    public byte[] mo19463c(int i, byte[] bArr) {
        if (i < 0 || i >= mo19461a()) {
            throw new IllegalArgumentException("Requested row is outside the image: " + i);
        }
        int d = mo19464d();
        if (bArr == null || bArr.length < d) {
            bArr = new byte[d];
        }
        System.arraycopy(this.f4342c, ((i + this.f4346g) * this.f4343d) + this.f4345f, bArr, 0, d);
        return bArr;
    }

    /* renamed from: g */
    public int mo19534g() {
        return mo19461a() / 2;
    }

    /* renamed from: h */
    public int mo19535h() {
        return mo19464d() / 2;
    }

    /* renamed from: i */
    public int[] mo19536i() {
        int d = mo19464d() / 2;
        int a = mo19461a() / 2;
        int[] iArr = new int[(d * a)];
        byte[] bArr = this.f4342c;
        int i = (this.f4346g * this.f4343d) + this.f4345f;
        for (int i2 = 0; i2 < a; i2++) {
            int i3 = i2 * d;
            for (int i4 = 0; i4 < d; i4++) {
                iArr[i3 + i4] = ((bArr[(i4 << 1) + i] & 255) * 65793) | ViewCompat.MEASURED_STATE_MASK;
            }
            i += this.f4343d << 1;
        }
        return iArr;
    }
}
