package com.xiaomi.push;

/* renamed from: com.xiaomi.push.jq */
public class C4803jq extends C4805js {

    /* renamed from: a */
    private int f9841a;

    /* renamed from: a */
    private C4785ja f9842a;

    public C4803jq(int i) {
        this.f9842a = new C4785ja(i);
    }

    /* renamed from: a */
    public int mo25842a(byte[] bArr, int i, int i2) {
        byte[] a = this.f9842a.mo25813a();
        if (i2 > this.f9842a.mo25813a() - this.f9841a) {
            i2 = this.f9842a.mo25813a() - this.f9841a;
        }
        if (i2 > 0) {
            System.arraycopy(a, this.f9841a, bArr, i, i2);
            this.f9841a += i2;
        }
        return i2;
    }

    /* renamed from: a */
    public void m15339a(byte[] bArr, int i, int i2) {
        this.f9842a.write(bArr, i, i2);
    }

    /* renamed from: a_ */
    public int mo25843a_() {
        return this.f9842a.size();
    }
}
