package com.xiaomi.push;

/* renamed from: com.xiaomi.push.jn */
public class C4821jn extends C4823jp {

    /* renamed from: a */
    private int f9310a;

    /* renamed from: a */
    private C4802ix f9311a;

    public C4821jn(int i) {
        this.f9311a = new C4802ix(i);
    }

    /* renamed from: a */
    public int mo29876a(byte[] bArr, int i, int i2) {
        byte[] a = this.f9311a.mo29847a();
        if (i2 > this.f9311a.mo29847a() - this.f9310a) {
            i2 = this.f9311a.mo29847a() - this.f9310a;
        }
        if (i2 > 0) {
            System.arraycopy(a, this.f9310a, bArr, i, i2);
            this.f9310a += i2;
        }
        return i2;
    }

    /* renamed from: a */
    public void m14976a(byte[] bArr, int i, int i2) {
        this.f9311a.write(bArr, i, i2);
    }

    /* renamed from: a_ */
    public int mo29877a_() {
        return this.f9311a.size();
    }
}
