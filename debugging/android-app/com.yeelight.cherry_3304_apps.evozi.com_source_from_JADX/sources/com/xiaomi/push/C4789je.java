package com.xiaomi.push;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: com.xiaomi.push.je */
public class C4789je extends C4794ji {

    /* renamed from: a */
    private static final C4799jn f9804a = new C4799jn();

    /* renamed from: a */
    protected int f9805a;

    /* renamed from: a */
    protected boolean f9806a = false;

    /* renamed from: a */
    private byte[] f9807a = new byte[1];

    /* renamed from: b */
    protected boolean f9808b = true;

    /* renamed from: b */
    private byte[] f9809b = new byte[2];

    /* renamed from: c */
    protected boolean f9810c = false;

    /* renamed from: c */
    private byte[] f9811c = new byte[4];

    /* renamed from: d */
    private byte[] f9812d = new byte[8];

    /* renamed from: e */
    private byte[] f9813e = new byte[1];

    /* renamed from: f */
    private byte[] f9814f = new byte[2];

    /* renamed from: g */
    private byte[] f9815g = new byte[4];

    /* renamed from: h */
    private byte[] f9816h = new byte[8];

    /* renamed from: com.xiaomi.push.je$a */
    public static class C4790a implements C4796jk {

        /* renamed from: a */
        protected int f9817a;

        /* renamed from: a */
        protected boolean f9818a;

        /* renamed from: b */
        protected boolean f9819b;

        public C4790a() {
            this(false, true);
        }

        public C4790a(boolean z, boolean z2) {
            this(z, z2, 0);
        }

        public C4790a(boolean z, boolean z2, int i) {
            this.f9818a = false;
            this.f9819b = true;
            this.f9818a = z;
            this.f9819b = z2;
            this.f9817a = i;
        }

        /* renamed from: a */
        public C4794ji mo25839a(C4805js jsVar) {
            C4789je jeVar = new C4789je(jsVar, this.f9818a, this.f9819b);
            int i = this.f9817a;
            if (i != 0) {
                jeVar.mo25829b(i);
            }
            return jeVar;
        }
    }

    public C4789je(C4805js jsVar, boolean z, boolean z2) {
        super(jsVar);
        this.f9806a = z;
        this.f9808b = z2;
    }

    /* renamed from: a */
    private int m15253a(byte[] bArr, int i, int i2) {
        mo25831c(i2);
        return this.f9828a.mo25848b(bArr, i, i2);
    }

    /* renamed from: a */
    public byte mo25816a() {
        if (this.f9828a.mo25847b() >= 1) {
            byte b = this.f9828a.mo25844a()[this.f9828a.mo25844a()];
            this.f9828a.mo25845a(1);
            return b;
        }
        m15253a(this.f9813e, 0, 1);
        return this.f9813e[0];
    }

    /* renamed from: a */
    public double m15255a() {
        return Double.longBitsToDouble(mo25816a());
    }

    /* renamed from: a */
    public int m15256a() {
        byte[] bArr = this.f9815g;
        int i = 0;
        if (this.f9828a.mo25847b() >= 4) {
            bArr = this.f9828a.mo25844a();
            i = this.f9828a.mo25844a();
            this.f9828a.mo25845a(4);
        } else {
            m15253a(this.f9815g, 0, 4);
        }
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << ParameterInitDefType.ExternalSamplerInit) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: a */
    public long m15257a() {
        byte[] bArr = this.f9816h;
        int i = 0;
        if (this.f9828a.mo25847b() >= 8) {
            bArr = this.f9828a.mo25844a();
            i = this.f9828a.mo25844a();
            this.f9828a.mo25845a(8);
        } else {
            m15253a(this.f9816h, 0, 8);
        }
        return ((long) (bArr[i + 7] & 255)) | (((long) (bArr[i] & 255)) << 56) | (((long) (bArr[i + 1] & 255)) << 48) | (((long) (bArr[i + 2] & 255)) << 40) | (((long) (bArr[i + 3] & 255)) << 32) | (((long) (bArr[i + 4] & 255)) << 24) | (((long) (bArr[i + 5] & 255)) << 16) | (((long) (bArr[i + 6] & 255)) << 8);
    }

    /* renamed from: a */
    public C4791jf m15258a() {
        byte a = mo25816a();
        return new C4791jf("", a, a == 0 ? 0 : mo25816a());
    }

    /* renamed from: a */
    public C4792jg m15259a() {
        return new C4792jg(mo25816a(), mo25816a());
    }

    /* renamed from: a */
    public C4793jh m15260a() {
        return new C4793jh(mo25816a(), mo25816a(), mo25816a());
    }

    /* renamed from: a */
    public C4798jm m15261a() {
        return new C4798jm(mo25816a(), mo25816a());
    }

    /* renamed from: a */
    public C4799jn m15262a() {
        return f9804a;
    }

    /* renamed from: a */
    public String m15263a() {
        int a = mo25816a();
        if (this.f9828a.mo25847b() < a) {
            return mo25817a(a);
        }
        try {
            String str = new String(this.f9828a.mo25844a(), this.f9828a.mo25844a(), a, "UTF-8");
            this.f9828a.mo25845a(a);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new C4787jc("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    /* renamed from: a */
    public String mo25817a(int i) {
        try {
            mo25831c(i);
            byte[] bArr = new byte[i];
            this.f9828a.mo25848b(bArr, 0, i);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new C4787jc("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    /* renamed from: a */
    public ByteBuffer m15265a() {
        int a = mo25816a();
        mo25831c(a);
        if (this.f9828a.mo25847b() >= a) {
            ByteBuffer wrap = ByteBuffer.wrap(this.f9828a.mo25844a(), this.f9828a.mo25844a(), a);
            this.f9828a.mo25845a(a);
            return wrap;
        }
        byte[] bArr = new byte[a];
        this.f9828a.mo25848b(bArr, 0, a);
        return ByteBuffer.wrap(bArr);
    }

    /* renamed from: a */
    public short m15266a() {
        byte[] bArr = this.f9814f;
        int i = 0;
        if (this.f9828a.mo25847b() >= 2) {
            bArr = this.f9828a.mo25844a();
            i = this.f9828a.mo25844a();
            this.f9828a.mo25845a(2);
        } else {
            m15253a(this.f9814f, 0, 2);
        }
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: a */
    public void m15267a() {
    }

    /* renamed from: a */
    public void mo25818a(byte b) {
        byte[] bArr = this.f9807a;
        bArr[0] = b;
        this.f9828a.mo25842a(bArr, 0, 1);
    }

    /* renamed from: a */
    public void m15269a(int i) {
        byte[] bArr = this.f9811c;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        this.f9828a.mo25842a(bArr, 0, 4);
    }

    /* renamed from: a */
    public void mo25819a(long j) {
        byte[] bArr = this.f9812d;
        bArr[0] = (byte) ((int) ((j >> 56) & 255));
        bArr[1] = (byte) ((int) ((j >> 48) & 255));
        bArr[2] = (byte) ((int) ((j >> 40) & 255));
        bArr[3] = (byte) ((int) ((j >> 32) & 255));
        bArr[4] = (byte) ((int) ((j >> 24) & 255));
        bArr[5] = (byte) ((int) ((j >> 16) & 255));
        bArr[6] = (byte) ((int) ((j >> 8) & 255));
        bArr[7] = (byte) ((int) (j & 255));
        this.f9828a.mo25842a(bArr, 0, 8);
    }

    /* renamed from: a */
    public void mo25820a(C4791jf jfVar) {
        mo25818a(jfVar.f9820a);
        mo25826a(jfVar.f9822a);
    }

    /* renamed from: a */
    public void mo25821a(C4792jg jgVar) {
        mo25818a(jgVar.f9823a);
        mo25817a(jgVar.f9824a);
    }

    /* renamed from: a */
    public void mo25822a(C4793jh jhVar) {
        mo25818a(jhVar.f9825a);
        mo25818a(jhVar.f9827b);
        mo25817a(jhVar.f9826a);
    }

    /* renamed from: a */
    public void mo25823a(C4799jn jnVar) {
    }

    /* renamed from: a */
    public void mo25824a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            mo25817a(bytes.length);
            this.f9828a.mo25842a(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new C4787jc("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    /* renamed from: a */
    public void mo25825a(ByteBuffer byteBuffer) {
        int limit = (byteBuffer.limit() - byteBuffer.position()) - byteBuffer.arrayOffset();
        mo25817a(limit);
        this.f9828a.mo25842a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), limit);
    }

    /* renamed from: a */
    public void mo25826a(short s) {
        byte[] bArr = this.f9809b;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        this.f9828a.mo25842a(bArr, 0, 2);
    }

    /* renamed from: a */
    public void mo25827a(boolean z) {
        mo25818a(z ? (byte) 1 : 0);
    }

    /* renamed from: a */
    public boolean m15279a() {
        return mo25816a() == 1;
    }

    /* renamed from: b */
    public void mo25828b() {
    }

    /* renamed from: b */
    public void mo25829b(int i) {
        this.f9805a = i;
        this.f9810c = true;
    }

    /* renamed from: c */
    public void mo25830c() {
        mo25818a((byte) 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo25831c(int i) {
        if (i < 0) {
            throw new C4787jc("Negative length: " + i);
        } else if (this.f9810c) {
            int i2 = this.f9805a - i;
            this.f9805a = i2;
            if (i2 < 0) {
                throw new C4787jc("Message length exceeded: " + i);
            }
        }
    }

    /* renamed from: d */
    public void mo25832d() {
    }

    /* renamed from: e */
    public void mo25833e() {
    }

    /* renamed from: f */
    public void mo25834f() {
    }

    /* renamed from: g */
    public void mo25835g() {
    }

    /* renamed from: h */
    public void mo25836h() {
    }

    /* renamed from: i */
    public void mo25837i() {
    }

    /* renamed from: j */
    public void mo25838j() {
    }
}
