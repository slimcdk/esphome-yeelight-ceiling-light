package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.l3 */
final class C1873l3 extends C1924o3 {

    /* renamed from: e */
    private final int f3538e;

    /* renamed from: f */
    private final int f3539f;

    C1873l3(byte[] bArr, int i, int i2) {
        super(bArr);
        C1779f3.m5075l(i, i + i2, bArr.length);
        this.f3538e = i;
        this.f3539f = i2;
    }

    /* renamed from: c */
    public final byte mo11637c(int i) {
        int d = mo11638d();
        if (((d - (i + 1)) | i) >= 0) {
            return this.f3608d[this.f3538e + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(d);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* renamed from: d */
    public final int mo11638d() {
        return this.f3539f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final byte mo11646k(int i) {
        return this.f3608d[this.f3538e + i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final int mo11792r() {
        return this.f3538e;
    }
}
