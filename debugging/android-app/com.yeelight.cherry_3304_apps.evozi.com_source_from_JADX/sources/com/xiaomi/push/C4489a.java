package com.xiaomi.push;

/* renamed from: com.xiaomi.push.a */
public final class C4489a {

    /* renamed from: a */
    public static final C4489a f8138a = new C4489a(new byte[0]);

    /* renamed from: a */
    private volatile int f8139a = 0;

    /* renamed from: a */
    private final byte[] f8140a;

    private C4489a(byte[] bArr) {
        this.f8140a = bArr;
    }

    /* renamed from: a */
    public static C4489a m13247a(byte[] bArr) {
        return m13248a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static C4489a m13248a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C4489a(bArr2);
    }

    /* renamed from: a */
    public int mo24722a() {
        return this.f8140a.length;
    }

    /* renamed from: a */
    public byte[] m13250a() {
        byte[] bArr = this.f8140a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4489a)) {
            return false;
        }
        byte[] bArr = this.f8140a;
        int length = bArr.length;
        byte[] bArr2 = ((C4489a) obj).f8140a;
        if (length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.f8139a;
        if (i == 0) {
            int i2 = r1;
            for (byte b : this.f8140a) {
                i2 = (i2 * 31) + b;
            }
            i = i2 == 0 ? 1 : i2;
            this.f8139a = i;
        }
        return i;
    }
}
