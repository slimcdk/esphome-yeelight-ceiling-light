package com.xiaomi.push;

/* renamed from: com.xiaomi.push.jp */
public abstract class C4823jp {
    /* renamed from: a */
    public int mo29878a() {
        return 0;
    }

    /* renamed from: a */
    public abstract int mo29876a(byte[] bArr, int i, int i2);

    /* renamed from: a */
    public void mo29879a(int i) {
    }

    /* renamed from: a */
    public abstract void m14989a(byte[] bArr, int i, int i2);

    /* renamed from: a */
    public byte[] m14990a() {
        return null;
    }

    /* renamed from: b */
    public int mo29881b() {
        return -1;
    }

    /* renamed from: b */
    public int mo29882b(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int a = mo29876a(bArr, i + i3, i2 - i3);
            if (a > 0) {
                i3 += a;
            } else {
                throw new C4824jq("Cannot read. Remote side has closed. Tried to read " + i2 + " bytes, but only got " + i3 + " bytes.");
            }
        }
        return i3;
    }
}
