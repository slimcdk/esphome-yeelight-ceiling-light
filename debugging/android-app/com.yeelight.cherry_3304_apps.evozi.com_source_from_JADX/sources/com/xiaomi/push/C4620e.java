package com.xiaomi.push;

import java.io.IOException;

/* renamed from: com.xiaomi.push.e */
public abstract class C4620e {
    /* renamed from: a */
    public abstract int mo24930a();

    /* renamed from: a */
    public abstract C4620e mo24931a(C4524b bVar);

    /* renamed from: a */
    public C4620e mo24932a(byte[] bArr) {
        return mo24933a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public C4620e mo24933a(byte[] bArr, int i, int i2) {
        try {
            C4524b a = C4524b.m13374a(bArr, i, i2);
            mo24931a(a);
            a.mo24758a(0);
            return this;
        } catch (C4589d e) {
            throw e;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    /* renamed from: a */
    public abstract void mo24934a(C4554c cVar);

    /* renamed from: a */
    public void m13781a(byte[] bArr, int i, int i2) {
        try {
            C4554c a = C4554c.mo24813a(bArr, i, i2);
            mo24934a(a);
            a.mo24814b();
        } catch (IOException unused) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo24935a(C4524b bVar, int i) {
        return bVar.mo24758a(i);
    }

    /* renamed from: a */
    public byte[] m13783a() {
        int b = mo24936b();
        byte[] bArr = new byte[b];
        mo24933a(bArr, 0, b);
        return bArr;
    }

    /* renamed from: b */
    public abstract int mo24936b();
}
