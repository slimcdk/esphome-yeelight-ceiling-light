package com.xiaomi.push;

/* renamed from: com.xiaomi.push.a */
public final class C4504a {

    /* renamed from: a */
    public static final C4504a f7531a = new C4504a(new byte[0]);

    /* renamed from: a */
    private volatile int f7532a = 0;

    /* renamed from: a */
    private final byte[] f7533a;

    private C4504a(byte[] bArr) {
        this.f7533a = bArr;
    }

    /* renamed from: a */
    public static C4504a m12825a(byte[] bArr) {
        return m12826a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static C4504a m12826a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C4504a(bArr2);
    }

    /* renamed from: a */
    public int mo28729a() {
        return this.f7533a.length;
    }

    /* renamed from: a */
    public byte[] m12828a() {
        byte[] bArr = this.f7533a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4504a)) {
            return false;
        }
        byte[] bArr = this.f7533a;
        int length = bArr.length;
        byte[] bArr2 = ((C4504a) obj).f7533a;
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
        int i = this.f7532a;
        if (i == 0) {
            int i2 = r1;
            for (byte b : this.f7533a) {
                i2 = (i2 * 31) + b;
            }
            i = i2 == 0 ? 1 : i2;
            this.f7532a = i;
        }
        return i;
    }
}
