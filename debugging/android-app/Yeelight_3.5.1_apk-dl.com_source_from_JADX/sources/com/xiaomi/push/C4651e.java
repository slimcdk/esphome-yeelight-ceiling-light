package com.xiaomi.push;

import java.io.IOException;

/* renamed from: com.xiaomi.push.e */
public abstract class C4651e {
    /* renamed from: a */
    public abstract int mo28924a();

    /* renamed from: a */
    public abstract C4651e mo28926a(C4538b bVar);

    /* renamed from: a */
    public C4651e mo29024a(byte[] bArr) {
        return mo29025a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public C4651e mo29025a(byte[] bArr, int i, int i2) {
        try {
            C4538b a = C4538b.m12925a(bArr, i, i2);
            mo28926a(a);
            a.mo28759a(0);
            return this;
        } catch (C4608d e) {
            throw e;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    /* renamed from: a */
    public abstract void mo28929a(C4572c cVar);

    /* renamed from: a */
    public void m13621a(byte[] bArr, int i, int i2) {
        try {
            C4572c a = C4572c.mo28814a(bArr, i, i2);
            mo28929a(a);
            a.mo28815b();
        } catch (IOException unused) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo29026a(C4538b bVar, int i) {
        return bVar.mo28759a(i);
    }

    /* renamed from: a */
    public byte[] m13623a() {
        int b = mo28930b();
        byte[] bArr = new byte[b];
        mo29025a(bArr, 0, b);
        return bArr;
    }

    /* renamed from: b */
    public abstract int mo28930b();
}
