package com.xiaomi.push;

/* renamed from: com.xiaomi.push.jr */
public final class C4804jr extends C4805js {

    /* renamed from: a */
    private int f9843a;

    /* renamed from: a */
    private byte[] f9844a;

    /* renamed from: b */
    private int f9845b;

    /* renamed from: a */
    public int mo25844a() {
        return this.f9843a;
    }

    /* renamed from: a */
    public int mo25842a(byte[] bArr, int i, int i2) {
        int b = mo25847b();
        if (i2 > b) {
            i2 = b;
        }
        if (i2 > 0) {
            System.arraycopy(this.f9844a, this.f9843a, bArr, i, i2);
            mo25845a(i2);
        }
        return i2;
    }

    /* renamed from: a */
    public void mo25845a(int i) {
        this.f9843a += i;
    }

    /* renamed from: a */
    public void mo25846a(byte[] bArr) {
        mo25848b(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public void m15345a(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    /* renamed from: a */
    public byte[] m15346a() {
        return this.f9844a;
    }

    /* renamed from: b */
    public int mo25847b() {
        return this.f9845b - this.f9843a;
    }

    /* renamed from: b */
    public void mo25848b(byte[] bArr, int i, int i2) {
        this.f9844a = bArr;
        this.f9843a = i;
        this.f9845b = i + i2;
    }
}
