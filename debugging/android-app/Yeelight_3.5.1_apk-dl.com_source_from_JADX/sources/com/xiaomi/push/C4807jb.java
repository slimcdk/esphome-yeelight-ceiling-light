package com.xiaomi.push;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: com.xiaomi.push.jb */
public class C4807jb extends C4812jf {

    /* renamed from: a */
    private static final C4817jk f9273a = new C4817jk();

    /* renamed from: a */
    protected int f9274a;

    /* renamed from: a */
    protected boolean f9275a = false;

    /* renamed from: a */
    private byte[] f9276a = new byte[1];

    /* renamed from: b */
    protected boolean f9277b = true;

    /* renamed from: b */
    private byte[] f9278b = new byte[2];

    /* renamed from: c */
    protected boolean f9279c = false;

    /* renamed from: c */
    private byte[] f9280c = new byte[4];

    /* renamed from: d */
    private byte[] f9281d = new byte[8];

    /* renamed from: e */
    private byte[] f9282e = new byte[1];

    /* renamed from: f */
    private byte[] f9283f = new byte[2];

    /* renamed from: g */
    private byte[] f9284g = new byte[4];

    /* renamed from: h */
    private byte[] f9285h = new byte[8];

    /* renamed from: com.xiaomi.push.jb$a */
    public static class C4808a implements C4814jh {

        /* renamed from: a */
        protected int f9286a;

        /* renamed from: a */
        protected boolean f9287a;

        /* renamed from: b */
        protected boolean f9288b;

        public C4808a() {
            this(false, true);
        }

        public C4808a(boolean z, boolean z2) {
            this(z, z2, 0);
        }

        public C4808a(boolean z, boolean z2, int i) {
            this.f9287a = false;
            this.f9288b = true;
            this.f9287a = z;
            this.f9288b = z2;
            this.f9286a = i;
        }

        /* renamed from: a */
        public C4812jf mo29873a(C4823jp jpVar) {
            C4807jb jbVar = new C4807jb(jpVar, this.f9287a, this.f9288b);
            int i = this.f9286a;
            if (i != 0) {
                jbVar.mo29863b(i);
            }
            return jbVar;
        }
    }

    public C4807jb(C4823jp jpVar, boolean z, boolean z2) {
        super(jpVar);
        this.f9275a = z;
        this.f9277b = z2;
    }

    /* renamed from: a */
    private int m14890a(byte[] bArr, int i, int i2) {
        mo29865c(i2);
        return this.f9297a.mo29882b(bArr, i, i2);
    }

    /* renamed from: a */
    public byte mo29850a() {
        if (this.f9297a.mo29881b() >= 1) {
            byte b = this.f9297a.mo29878a()[this.f9297a.mo29878a()];
            this.f9297a.mo29879a(1);
            return b;
        }
        m14890a(this.f9282e, 0, 1);
        return this.f9282e[0];
    }

    /* renamed from: a */
    public double m14892a() {
        return Double.longBitsToDouble(mo29850a());
    }

    /* renamed from: a */
    public int m14893a() {
        byte[] bArr = this.f9284g;
        int i = 0;
        if (this.f9297a.mo29881b() >= 4) {
            bArr = this.f9297a.mo29878a();
            i = this.f9297a.mo29878a();
            this.f9297a.mo29879a(4);
        } else {
            m14890a(this.f9284g, 0, 4);
        }
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << ParameterInitDefType.ExternalSamplerInit) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: a */
    public long m14894a() {
        byte[] bArr = this.f9285h;
        int i = 0;
        if (this.f9297a.mo29881b() >= 8) {
            bArr = this.f9297a.mo29878a();
            i = this.f9297a.mo29878a();
            this.f9297a.mo29879a(8);
        } else {
            m14890a(this.f9285h, 0, 8);
        }
        return ((long) (bArr[i + 7] & 255)) | (((long) (bArr[i] & 255)) << 56) | (((long) (bArr[i + 1] & 255)) << 48) | (((long) (bArr[i + 2] & 255)) << 40) | (((long) (bArr[i + 3] & 255)) << 32) | (((long) (bArr[i + 4] & 255)) << 24) | (((long) (bArr[i + 5] & 255)) << 16) | (((long) (bArr[i + 6] & 255)) << 8);
    }

    /* renamed from: a */
    public C4809jc m14895a() {
        byte a = mo29850a();
        return new C4809jc("", a, a == 0 ? 0 : mo29850a());
    }

    /* renamed from: a */
    public C4810jd m14896a() {
        return new C4810jd(mo29850a(), mo29850a());
    }

    /* renamed from: a */
    public C4811je m14897a() {
        return new C4811je(mo29850a(), mo29850a(), mo29850a());
    }

    /* renamed from: a */
    public C4816jj m14898a() {
        return new C4816jj(mo29850a(), mo29850a());
    }

    /* renamed from: a */
    public C4817jk m14899a() {
        return f9273a;
    }

    /* renamed from: a */
    public String m14900a() {
        int a = mo29850a();
        if (this.f9297a.mo29881b() < a) {
            return mo29851a(a);
        }
        try {
            String str = new String(this.f9297a.mo29878a(), this.f9297a.mo29878a(), a, "UTF-8");
            this.f9297a.mo29879a(a);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new C4804iz("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    /* renamed from: a */
    public String mo29851a(int i) {
        try {
            mo29865c(i);
            byte[] bArr = new byte[i];
            this.f9297a.mo29882b(bArr, 0, i);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new C4804iz("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    /* renamed from: a */
    public ByteBuffer m14902a() {
        int a = mo29850a();
        mo29865c(a);
        if (this.f9297a.mo29881b() >= a) {
            ByteBuffer wrap = ByteBuffer.wrap(this.f9297a.mo29878a(), this.f9297a.mo29878a(), a);
            this.f9297a.mo29879a(a);
            return wrap;
        }
        byte[] bArr = new byte[a];
        this.f9297a.mo29882b(bArr, 0, a);
        return ByteBuffer.wrap(bArr);
    }

    /* renamed from: a */
    public short m14903a() {
        byte[] bArr = this.f9283f;
        int i = 0;
        if (this.f9297a.mo29881b() >= 2) {
            bArr = this.f9297a.mo29878a();
            i = this.f9297a.mo29878a();
            this.f9297a.mo29879a(2);
        } else {
            m14890a(this.f9283f, 0, 2);
        }
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: a */
    public void m14904a() {
    }

    /* renamed from: a */
    public void mo29852a(byte b) {
        byte[] bArr = this.f9276a;
        bArr[0] = b;
        this.f9297a.mo29876a(bArr, 0, 1);
    }

    /* renamed from: a */
    public void m14906a(int i) {
        byte[] bArr = this.f9280c;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        this.f9297a.mo29876a(bArr, 0, 4);
    }

    /* renamed from: a */
    public void mo29853a(long j) {
        byte[] bArr = this.f9281d;
        bArr[0] = (byte) ((int) ((j >> 56) & 255));
        bArr[1] = (byte) ((int) ((j >> 48) & 255));
        bArr[2] = (byte) ((int) ((j >> 40) & 255));
        bArr[3] = (byte) ((int) ((j >> 32) & 255));
        bArr[4] = (byte) ((int) ((j >> 24) & 255));
        bArr[5] = (byte) ((int) ((j >> 16) & 255));
        bArr[6] = (byte) ((int) ((j >> 8) & 255));
        bArr[7] = (byte) ((int) (j & 255));
        this.f9297a.mo29876a(bArr, 0, 8);
    }

    /* renamed from: a */
    public void mo29854a(C4809jc jcVar) {
        mo29852a(jcVar.f9289a);
        mo29860a(jcVar.f9291a);
    }

    /* renamed from: a */
    public void mo29855a(C4810jd jdVar) {
        mo29852a(jdVar.f9292a);
        mo29851a(jdVar.f9293a);
    }

    /* renamed from: a */
    public void mo29856a(C4811je jeVar) {
        mo29852a(jeVar.f9294a);
        mo29852a(jeVar.f9296b);
        mo29851a(jeVar.f9295a);
    }

    /* renamed from: a */
    public void mo29857a(C4817jk jkVar) {
    }

    /* renamed from: a */
    public void mo29858a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            mo29851a(bytes.length);
            this.f9297a.mo29876a(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new C4804iz("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    /* renamed from: a */
    public void mo29859a(ByteBuffer byteBuffer) {
        int limit = (byteBuffer.limit() - byteBuffer.position()) - byteBuffer.arrayOffset();
        mo29851a(limit);
        this.f9297a.mo29876a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), limit);
    }

    /* renamed from: a */
    public void mo29860a(short s) {
        byte[] bArr = this.f9278b;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        this.f9297a.mo29876a(bArr, 0, 2);
    }

    /* renamed from: a */
    public void mo29861a(boolean z) {
        mo29852a(z ? (byte) 1 : 0);
    }

    /* renamed from: a */
    public boolean m14916a() {
        return mo29850a() == 1;
    }

    /* renamed from: b */
    public void mo29862b() {
    }

    /* renamed from: b */
    public void mo29863b(int i) {
        this.f9274a = i;
        this.f9279c = true;
    }

    /* renamed from: c */
    public void mo29864c() {
        mo29852a((byte) 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo29865c(int i) {
        if (i < 0) {
            throw new C4804iz("Negative length: " + i);
        } else if (this.f9279c) {
            int i2 = this.f9274a - i;
            this.f9274a = i2;
            if (i2 < 0) {
                throw new C4804iz("Message length exceeded: " + i);
            }
        }
    }

    /* renamed from: d */
    public void mo29866d() {
    }

    /* renamed from: e */
    public void mo29867e() {
    }

    /* renamed from: f */
    public void mo29868f() {
    }

    /* renamed from: g */
    public void mo29869g() {
    }

    /* renamed from: h */
    public void mo29870h() {
    }

    /* renamed from: i */
    public void mo29871i() {
    }

    /* renamed from: j */
    public void mo29872j() {
    }
}
