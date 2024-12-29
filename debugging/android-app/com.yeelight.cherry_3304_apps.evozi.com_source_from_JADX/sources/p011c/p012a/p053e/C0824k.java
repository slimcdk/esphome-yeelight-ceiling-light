package p011c.p012a.p053e;

import androidx.core.view.ViewCompat;

/* renamed from: c.a.e.k */
public final class C0824k extends C0821h {

    /* renamed from: c */
    private final byte[] f719c;

    /* renamed from: d */
    private final int f720d;

    /* renamed from: e */
    private final int f721e;

    /* renamed from: f */
    private final int f722f;

    /* renamed from: g */
    private final int f723g;

    public C0824k(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 > i || i4 + i6 > i2) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f719c = bArr;
        this.f720d = i;
        this.f721e = i2;
        this.f722f = i3;
        this.f723g = i4;
        if (z) {
            m1127j(i5, i6);
        }
    }

    /* renamed from: j */
    private void m1127j(int i, int i2) {
        byte[] bArr = this.f719c;
        int i3 = (this.f723g * this.f720d) + this.f722f;
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
            i3 += this.f720d;
        }
    }

    /* renamed from: b */
    public byte[] mo8997b() {
        int d = mo8999d();
        int a = mo8996a();
        if (d == this.f720d && a == this.f721e) {
            return this.f719c;
        }
        int i = d * a;
        byte[] bArr = new byte[i];
        int i2 = this.f723g;
        int i3 = this.f720d;
        int i4 = (i2 * i3) + this.f722f;
        if (d == i3) {
            System.arraycopy(this.f719c, i4, bArr, 0, i);
            return bArr;
        }
        for (int i5 = 0; i5 < a; i5++) {
            System.arraycopy(this.f719c, i4, bArr, i5 * d, d);
            i4 += this.f720d;
        }
        return bArr;
    }

    /* renamed from: c */
    public byte[] mo8998c(int i, byte[] bArr) {
        if (i < 0 || i >= mo8996a()) {
            throw new IllegalArgumentException("Requested row is outside the image: " + i);
        }
        int d = mo8999d();
        if (bArr == null || bArr.length < d) {
            bArr = new byte[d];
        }
        System.arraycopy(this.f719c, ((i + this.f723g) * this.f720d) + this.f722f, bArr, 0, d);
        return bArr;
    }

    /* renamed from: g */
    public int mo9007g() {
        return mo8996a() / 2;
    }

    /* renamed from: h */
    public int mo9008h() {
        return mo8999d() / 2;
    }

    /* renamed from: i */
    public int[] mo9009i() {
        int d = mo8999d() / 2;
        int a = mo8996a() / 2;
        int[] iArr = new int[(d * a)];
        byte[] bArr = this.f719c;
        int i = (this.f723g * this.f720d) + this.f722f;
        for (int i2 = 0; i2 < a; i2++) {
            int i3 = i2 * d;
            for (int i4 = 0; i4 < d; i4++) {
                iArr[i3 + i4] = ((bArr[(i4 << 1) + i] & 255) * 65793) | ViewCompat.MEASURED_STATE_MASK;
            }
            i += this.f720d << 1;
        }
        return iArr;
    }
}
