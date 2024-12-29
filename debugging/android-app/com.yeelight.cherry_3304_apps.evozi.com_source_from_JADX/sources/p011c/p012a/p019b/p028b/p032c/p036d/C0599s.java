package p011c.p012a.p019b.p028b.p032c.p036d;

import java.io.IOException;

/* renamed from: c.a.b.b.c.d.s */
public abstract class C0599s {

    /* renamed from: a */
    protected volatile int f279a = -1;

    /* renamed from: b */
    public static final <T extends C0599s> T m454b(T t, byte[] bArr, int i, int i2) {
        try {
            C0590j d = C0590j.m381d(bArr, 0, i2);
            t.mo8561a(d);
            d.mo8577g(0);
            return t;
        } catch (C0598r e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    /* renamed from: d */
    public static final byte[] m455d(C0599s sVar) {
        int g = sVar.mo8617g();
        byte[] bArr = new byte[g];
        try {
            C0591k m = C0591k.m409m(bArr, 0, g);
            sVar.mo8562c(m);
            m.mo8599z();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* renamed from: a */
    public abstract C0599s mo8561a(C0590j jVar);

    /* renamed from: c */
    public void mo8562c(C0591k kVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo8563e() {
        return 0;
    }

    /* renamed from: f */
    public C0599s clone() {
        return (C0599s) super.clone();
    }

    /* renamed from: g */
    public final int mo8617g() {
        int e = mo8563e();
        this.f279a = e;
        return e;
    }

    public String toString() {
        return C0600t.m462b(this);
    }
}
