package com.xiaomi.push;

/* renamed from: com.xiaomi.push.js */
public abstract class C4805js {
    /* renamed from: a */
    public int mo25844a() {
        return 0;
    }

    /* renamed from: a */
    public abstract int mo25842a(byte[] bArr, int i, int i2);

    /* renamed from: a */
    public void mo25845a(int i) {
    }

    /* renamed from: a */
    public abstract void m15352a(byte[] bArr, int i, int i2);

    /* renamed from: a */
    public byte[] m15353a() {
        return null;
    }

    /* renamed from: b */
    public int mo25847b() {
        return -1;
    }

    /* renamed from: b */
    public int mo25848b(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int a = mo25842a(bArr, i + i3, i2 - i3);
            if (a > 0) {
                i3 += a;
            } else {
                throw new C4806jt("Cannot read. Remote side has closed. Tried to read " + i2 + " bytes, but only got " + i3 + " bytes.");
            }
        }
        return i3;
    }
}
