package p011c.p012a.p019b.p028b.p032c.p036d;

import java.util.Arrays;

/* renamed from: c.a.b.b.c.d.i */
public final class C0589i extends C0593m<C0589i> {

    /* renamed from: c */
    public byte[] f244c = C0602v.f285d;

    /* renamed from: d */
    public String f245d = "";

    /* renamed from: e */
    public double f246e = 0.0d;

    /* renamed from: f */
    public float f247f = 0.0f;

    /* renamed from: g */
    public long f248g = 0;

    /* renamed from: h */
    public int f249h = 0;

    /* renamed from: i */
    public int f250i = 0;

    /* renamed from: j */
    public boolean f251j = false;

    /* renamed from: k */
    public C0587g[] f252k = C0587g.m369i();

    /* renamed from: l */
    public C0588h[] f253l = C0588h.m374j();

    /* renamed from: m */
    public String[] f254m = C0602v.f284c;

    /* renamed from: n */
    public long[] f255n = C0602v.f282a;

    /* renamed from: o */
    public float[] f256o = C0602v.f283b;

    /* renamed from: p */
    public long f257p = 0;

    public C0589i() {
        this.f268b = null;
        this.f279a = -1;
    }

    /* renamed from: a */
    public final /* synthetic */ C0599s mo8561a(C0590j jVar) {
        while (true) {
            int n = jVar.mo8583n();
            boolean z = true;
            switch (n) {
                case 0:
                    return this;
                case 10:
                    this.f244c = jVar.mo8573b();
                    break;
                case 18:
                    this.f245d = jVar.mo8574c();
                    break;
                case 25:
                    this.f246e = Double.longBitsToDouble(jVar.mo8587r());
                    break;
                case 37:
                    this.f247f = Float.intBitsToFloat(jVar.mo8586q());
                    break;
                case 40:
                    this.f248g = jVar.mo8585p();
                    break;
                case 48:
                    this.f249h = jVar.mo8584o();
                    break;
                case 56:
                    int o = jVar.mo8584o();
                    this.f250i = (-(o & 1)) ^ (o >>> 1);
                    break;
                case 64:
                    if (jVar.mo8584o() == 0) {
                        z = false;
                    }
                    this.f251j = z;
                    break;
                case 74:
                    int a = C0602v.m464a(jVar, 74);
                    C0587g[] gVarArr = this.f252k;
                    int length = gVarArr == null ? 0 : gVarArr.length;
                    int i = a + length;
                    C0587g[] gVarArr2 = new C0587g[i];
                    if (length != 0) {
                        System.arraycopy(this.f252k, 0, gVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        gVarArr2[length] = new C0587g();
                        jVar.mo8575e(gVarArr2[length]);
                        jVar.mo8583n();
                        length++;
                    }
                    gVarArr2[length] = new C0587g();
                    jVar.mo8575e(gVarArr2[length]);
                    this.f252k = gVarArr2;
                    break;
                case 82:
                    int a2 = C0602v.m464a(jVar, 82);
                    C0588h[] hVarArr = this.f253l;
                    int length2 = hVarArr == null ? 0 : hVarArr.length;
                    int i2 = a2 + length2;
                    C0588h[] hVarArr2 = new C0588h[i2];
                    if (length2 != 0) {
                        System.arraycopy(this.f253l, 0, hVarArr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        hVarArr2[length2] = new C0588h();
                        jVar.mo8575e(hVarArr2[length2]);
                        jVar.mo8583n();
                        length2++;
                    }
                    hVarArr2[length2] = new C0588h();
                    jVar.mo8575e(hVarArr2[length2]);
                    this.f253l = hVarArr2;
                    break;
                case 90:
                    int a3 = C0602v.m464a(jVar, 90);
                    String[] strArr = this.f254m;
                    int length3 = strArr == null ? 0 : strArr.length;
                    int i3 = a3 + length3;
                    String[] strArr2 = new String[i3];
                    if (length3 != 0) {
                        System.arraycopy(this.f254m, 0, strArr2, 0, length3);
                    }
                    while (length3 < i3 - 1) {
                        strArr2[length3] = jVar.mo8574c();
                        jVar.mo8583n();
                        length3++;
                    }
                    strArr2[length3] = jVar.mo8574c();
                    this.f254m = strArr2;
                    break;
                case 96:
                    int a4 = C0602v.m464a(jVar, 96);
                    long[] jArr = this.f255n;
                    int length4 = jArr == null ? 0 : jArr.length;
                    int i4 = a4 + length4;
                    long[] jArr2 = new long[i4];
                    if (length4 != 0) {
                        System.arraycopy(this.f255n, 0, jArr2, 0, length4);
                    }
                    while (true) {
                        int i5 = i4 - 1;
                        long p = jVar.mo8585p();
                        if (length4 >= i5) {
                            jArr2[length4] = p;
                            this.f255n = jArr2;
                            break;
                        } else {
                            jArr2[length4] = p;
                            jVar.mo8583n();
                            length4++;
                        }
                    }
                case 98:
                    int j = jVar.mo8580j(jVar.mo8584o());
                    int a5 = jVar.mo8572a();
                    int i6 = 0;
                    while (jVar.mo8588t() > 0) {
                        jVar.mo8585p();
                        i6++;
                    }
                    jVar.mo8582l(a5);
                    long[] jArr3 = this.f255n;
                    int length5 = jArr3 == null ? 0 : jArr3.length;
                    int i7 = i6 + length5;
                    long[] jArr4 = new long[i7];
                    if (length5 != 0) {
                        System.arraycopy(this.f255n, 0, jArr4, 0, length5);
                    }
                    while (length5 < i7) {
                        jArr4[length5] = jVar.mo8585p();
                        length5++;
                    }
                    this.f255n = jArr4;
                    jVar.mo8581k(j);
                    break;
                case 104:
                    this.f257p = jVar.mo8585p();
                    break;
                case 114:
                    int o2 = jVar.mo8584o();
                    int j2 = jVar.mo8580j(o2);
                    int i8 = o2 / 4;
                    float[] fArr = this.f256o;
                    int length6 = fArr == null ? 0 : fArr.length;
                    int i9 = i8 + length6;
                    float[] fArr2 = new float[i9];
                    if (length6 != 0) {
                        System.arraycopy(this.f256o, 0, fArr2, 0, length6);
                    }
                    while (length6 < i9) {
                        fArr2[length6] = Float.intBitsToFloat(jVar.mo8586q());
                        length6++;
                    }
                    this.f256o = fArr2;
                    jVar.mo8581k(j2);
                    break;
                case 117:
                    int a6 = C0602v.m464a(jVar, 117);
                    float[] fArr3 = this.f256o;
                    int length7 = fArr3 == null ? 0 : fArr3.length;
                    int i10 = a6 + length7;
                    float[] fArr4 = new float[i10];
                    if (length7 != 0) {
                        System.arraycopy(this.f256o, 0, fArr4, 0, length7);
                    }
                    while (length7 < i10 - 1) {
                        fArr4[length7] = Float.intBitsToFloat(jVar.mo8586q());
                        jVar.mo8583n();
                        length7++;
                    }
                    fArr4[length7] = Float.intBitsToFloat(jVar.mo8586q());
                    this.f256o = fArr4;
                    break;
                default:
                    if (super.mo8602h(jVar, n)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
    }

    /* renamed from: c */
    public final void mo8562c(C0591k kVar) {
        if (!Arrays.equals(this.f244c, C0602v.f285d)) {
            byte[] bArr = this.f244c;
            kVar.mo8597r(1, 2);
            kVar.mo8598w(bArr.length);
            kVar.mo8595o(bArr);
        }
        String str = this.f245d;
        if (str != null && !str.equals("")) {
            kVar.mo8593f(2, this.f245d);
        }
        if (Double.doubleToLongBits(this.f246e) != Double.doubleToLongBits(0.0d)) {
            double d = this.f246e;
            kVar.mo8597r(3, 1);
            kVar.mo8594n(Double.doubleToLongBits(d));
        }
        if (Float.floatToIntBits(this.f247f) != Float.floatToIntBits(0.0f)) {
            kVar.mo8590c(4, this.f247f);
        }
        long j = this.f248g;
        if (j != 0) {
            kVar.mo8591d(5, j);
        }
        int i = this.f249h;
        if (i != 0) {
            kVar.mo8596p(6, i);
        }
        int i2 = this.f250i;
        int i3 = 0;
        if (i2 != 0) {
            kVar.mo8597r(7, 0);
            kVar.mo8598w(C0591k.m416y(i2));
        }
        boolean z = this.f251j;
        if (z) {
            kVar.mo8597r(8, 0);
            kVar.mo8589b(z ? (byte) 1 : 0);
        }
        C0587g[] gVarArr = this.f252k;
        if (gVarArr != null && gVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                C0587g[] gVarArr2 = this.f252k;
                if (i4 >= gVarArr2.length) {
                    break;
                }
                C0587g gVar = gVarArr2[i4];
                if (gVar != null) {
                    kVar.mo8592e(9, gVar);
                }
                i4++;
            }
        }
        C0588h[] hVarArr = this.f253l;
        if (hVarArr != null && hVarArr.length > 0) {
            int i5 = 0;
            while (true) {
                C0588h[] hVarArr2 = this.f253l;
                if (i5 >= hVarArr2.length) {
                    break;
                }
                C0588h hVar = hVarArr2[i5];
                if (hVar != null) {
                    kVar.mo8592e(10, hVar);
                }
                i5++;
            }
        }
        String[] strArr = this.f254m;
        if (strArr != null && strArr.length > 0) {
            int i6 = 0;
            while (true) {
                String[] strArr2 = this.f254m;
                if (i6 >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[i6];
                if (str2 != null) {
                    kVar.mo8593f(11, str2);
                }
                i6++;
            }
        }
        long[] jArr = this.f255n;
        if (jArr != null && jArr.length > 0) {
            int i7 = 0;
            while (true) {
                long[] jArr2 = this.f255n;
                if (i7 >= jArr2.length) {
                    break;
                }
                kVar.mo8591d(12, jArr2[i7]);
                i7++;
            }
        }
        long j2 = this.f257p;
        if (j2 != 0) {
            kVar.mo8591d(13, j2);
        }
        float[] fArr = this.f256o;
        if (fArr != null && fArr.length > 0) {
            while (true) {
                float[] fArr2 = this.f256o;
                if (i3 >= fArr2.length) {
                    break;
                }
                kVar.mo8590c(14, fArr2[i3]);
                i3++;
            }
        }
        super.mo8562c(kVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo8563e() {
        long[] jArr;
        int e = super.mo8563e();
        if (!Arrays.equals(this.f244c, C0602v.f285d)) {
            byte[] bArr = this.f244c;
            e += C0591k.m414v(1) + C0591k.m415x(bArr.length) + bArr.length;
        }
        String str = this.f245d;
        if (str != null && !str.equals("")) {
            e += C0591k.m407k(2, this.f245d);
        }
        if (Double.doubleToLongBits(this.f246e) != Double.doubleToLongBits(0.0d)) {
            e += C0591k.m414v(3) + 8;
        }
        if (Float.floatToIntBits(this.f247f) != Float.floatToIntBits(0.0f)) {
            e += C0591k.m414v(4) + 4;
        }
        long j = this.f248g;
        if (j != 0) {
            e += C0591k.m405i(5, j);
        }
        int i = this.f249h;
        if (i != 0) {
            e += C0591k.m410q(6, i);
        }
        int i2 = this.f250i;
        if (i2 != 0) {
            e += C0591k.m414v(7) + C0591k.m415x(C0591k.m416y(i2));
        }
        if (this.f251j) {
            e += C0591k.m414v(8) + 1;
        }
        C0587g[] gVarArr = this.f252k;
        int i3 = 0;
        if (gVarArr != null && gVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                C0587g[] gVarArr2 = this.f252k;
                if (i4 >= gVarArr2.length) {
                    break;
                }
                C0587g gVar = gVarArr2[i4];
                if (gVar != null) {
                    e += C0591k.m406j(9, gVar);
                }
                i4++;
            }
        }
        C0588h[] hVarArr = this.f253l;
        if (hVarArr != null && hVarArr.length > 0) {
            int i5 = 0;
            while (true) {
                C0588h[] hVarArr2 = this.f253l;
                if (i5 >= hVarArr2.length) {
                    break;
                }
                C0588h hVar = hVarArr2[i5];
                if (hVar != null) {
                    e += C0591k.m406j(10, hVar);
                }
                i5++;
            }
        }
        String[] strArr = this.f254m;
        if (strArr != null && strArr.length > 0) {
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                String[] strArr2 = this.f254m;
                if (i6 >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[i6];
                if (str2 != null) {
                    i8++;
                    i7 += C0591k.m411s(str2);
                }
                i6++;
            }
            e = e + i7 + (i8 * 1);
        }
        long[] jArr2 = this.f255n;
        if (jArr2 != null && jArr2.length > 0) {
            int i9 = 0;
            while (true) {
                jArr = this.f255n;
                if (i3 >= jArr.length) {
                    break;
                }
                long j2 = jArr[i3];
                i9 += (j2 & -128) == 0 ? 1 : (j2 & -16384) == 0 ? 2 : (j2 & -2097152) == 0 ? 3 : (j2 & -268435456) == 0 ? 4 : (j2 & -34359738368L) == 0 ? 5 : (j2 & -4398046511104L) == 0 ? 6 : (j2 & -562949953421312L) == 0 ? 7 : (j2 & -72057594037927936L) == 0 ? 8 : (j2 & Long.MIN_VALUE) == 0 ? 9 : 10;
                i3++;
            }
            e = e + i9 + (jArr.length * 1);
        }
        long j3 = this.f257p;
        if (j3 != 0) {
            e += C0591k.m405i(13, j3);
        }
        float[] fArr = this.f256o;
        return (fArr == null || fArr.length <= 0) ? e : e + (fArr.length * 4) + (fArr.length * 1);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0589i)) {
            return false;
        }
        C0589i iVar = (C0589i) obj;
        if (!Arrays.equals(this.f244c, iVar.f244c)) {
            return false;
        }
        String str = this.f245d;
        if (str == null) {
            if (iVar.f245d != null) {
                return false;
            }
        } else if (!str.equals(iVar.f245d)) {
            return false;
        }
        if (Double.doubleToLongBits(this.f246e) != Double.doubleToLongBits(iVar.f246e) || Float.floatToIntBits(this.f247f) != Float.floatToIntBits(iVar.f247f) || this.f248g != iVar.f248g || this.f249h != iVar.f249h || this.f250i != iVar.f250i || this.f251j != iVar.f251j || !C0597q.m446c(this.f252k, iVar.f252k) || !C0597q.m446c(this.f253l, iVar.f253l) || !C0597q.m446c(this.f254m, iVar.f254m) || !C0597q.m445b(this.f255n, iVar.f255n) || !C0597q.m444a(this.f256o, iVar.f256o) || this.f257p != iVar.f257p) {
            return false;
        }
        C0595o oVar = this.f268b;
        if (oVar != null && !oVar.mo8603b()) {
            return this.f268b.equals(iVar.f268b);
        }
        C0595o oVar2 = iVar.f268b;
        return oVar2 == null || oVar2.mo8603b();
    }

    public final int hashCode() {
        int hashCode = (((C0589i.class.getName().hashCode() + 527) * 31) + Arrays.hashCode(this.f244c)) * 31;
        String str = this.f245d;
        int i = 0;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f246e);
        long j = this.f248g;
        int floatToIntBits = (((((((((((hashCode + hashCode2) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + Float.floatToIntBits(this.f247f)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f249h) * 31) + this.f250i) * 31;
        int i2 = this.f251j ? 1231 : 1237;
        long j2 = this.f257p;
        int f = (((((((((((((floatToIntBits + i2) * 31) + C0597q.m449f(this.f252k)) * 31) + C0597q.m449f(this.f253l)) * 31) + C0597q.m449f(this.f254m)) * 31) + C0597q.m448e(this.f255n)) * 31) + C0597q.m447d(this.f256o)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        C0595o oVar = this.f268b;
        if (oVar != null && !oVar.mo8603b()) {
            i = this.f268b.hashCode();
        }
        return f + i;
    }
}
