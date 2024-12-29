package com.xiaomi.push;

/* renamed from: com.xiaomi.push.jo */
public final class C4822jo extends C4823jp {

    /* renamed from: a */
    private int f9312a;

    /* renamed from: a */
    private byte[] f9313a;

    /* renamed from: b */
    private int f9314b;

    /* renamed from: a */
    public int mo29878a() {
        return this.f9312a;
    }

    /* renamed from: a */
    public int mo29876a(byte[] bArr, int i, int i2) {
        int b = mo29881b();
        if (i2 > b) {
            i2 = b;
        }
        if (i2 > 0) {
            System.arraycopy(this.f9313a, this.f9312a, bArr, i, i2);
            mo29879a(i2);
        }
        return i2;
    }

    /* renamed from: a */
    public void mo29879a(int i) {
        this.f9312a += i;
    }

    /* renamed from: a */
    public void mo29880a(byte[] bArr) {
        mo29882b(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public void m14982a(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    /* renamed from: a */
    public byte[] m14983a() {
        return this.f9313a;
    }

    /* renamed from: b */
    public int mo29881b() {
        return this.f9314b - this.f9312a;
    }

    /* renamed from: b */
    public void mo29882b(byte[] bArr, int i, int i2) {
        this.f9313a = bArr;
        this.f9312a = i;
        this.f9314b = i + i2;
    }
}
