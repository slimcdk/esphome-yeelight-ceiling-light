package com.xiaomi.push;

import androidx.appcompat.widget.ActivityChooserView;
import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.io.InputStream;
import java.util.Vector;

/* renamed from: com.xiaomi.push.b */
public final class C4538b {

    /* renamed from: a */
    private int f7608a;

    /* renamed from: a */
    private final InputStream f7609a;

    /* renamed from: a */
    private final byte[] f7610a;

    /* renamed from: b */
    private int f7611b;

    /* renamed from: c */
    private int f7612c;

    /* renamed from: d */
    private int f7613d;

    /* renamed from: e */
    private int f7614e;

    /* renamed from: f */
    private int f7615f;

    /* renamed from: g */
    private int f7616g;

    /* renamed from: h */
    private int f7617h;

    /* renamed from: i */
    private int f7618i;

    private C4538b(InputStream inputStream) {
        this.f7615f = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f7617h = 64;
        this.f7618i = 67108864;
        this.f7610a = new byte[4096];
        this.f7608a = 0;
        this.f7612c = 0;
        this.f7609a = inputStream;
    }

    private C4538b(byte[] bArr, int i, int i2) {
        this.f7615f = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f7617h = 64;
        this.f7618i = 67108864;
        this.f7610a = bArr;
        this.f7608a = i2 + i;
        this.f7612c = i;
        this.f7609a = null;
    }

    /* renamed from: a */
    public static C4538b m12924a(InputStream inputStream) {
        return new C4538b(inputStream);
    }

    /* renamed from: a */
    public static C4538b m12925a(byte[] bArr, int i, int i2) {
        return new C4538b(bArr, i, i2);
    }

    /* renamed from: a */
    private boolean m12926a(boolean z) {
        int i = this.f7612c;
        int i2 = this.f7608a;
        if (i >= i2) {
            int i3 = this.f7614e;
            if (i3 + i2 != this.f7615f) {
                this.f7614e = i3 + i2;
                this.f7612c = 0;
                InputStream inputStream = this.f7609a;
                int read = inputStream == null ? -1 : inputStream.read(this.f7610a);
                this.f7608a = read;
                if (read == 0 || read < -1) {
                    throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + this.f7608a + "\nThe InputStream implementation is buggy.");
                } else if (read == -1) {
                    this.f7608a = 0;
                    if (!z) {
                        return false;
                    }
                    throw C4608d.m13270a();
                } else {
                    mo28761b();
                    int i4 = this.f7614e + this.f7608a + this.f7611b;
                    if (i4 <= this.f7618i && i4 >= 0) {
                        return true;
                    }
                    throw C4608d.m13277h();
                }
            } else if (!z) {
                return false;
            } else {
                throw C4608d.m13270a();
            }
        } else {
            throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
        }
    }

    /* renamed from: b */
    private void mo28761b() {
        int i = this.f7608a + this.f7611b;
        this.f7608a = i;
        int i2 = this.f7614e + i;
        int i3 = this.f7615f;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f7611b = i4;
            this.f7608a = i - i4;
            return;
        }
        this.f7611b = 0;
    }

    /* renamed from: a */
    public byte mo28758a() {
        if (this.f7612c == this.f7608a) {
            m12926a(true);
        }
        byte[] bArr = this.f7610a;
        int i = this.f7612c;
        this.f7612c = i + 1;
        return bArr[i];
    }

    /* renamed from: a */
    public int m12929a() {
        if (mo28761b()) {
            this.f7613d = 0;
            return 0;
        }
        int d = mo28765d();
        this.f7613d = d;
        if (d != 0) {
            return d;
        }
        throw C4608d.m13273d();
    }

    /* renamed from: a */
    public int mo28759a(int i) {
        if (i >= 0) {
            int i2 = i + this.f7614e + this.f7612c;
            int i3 = this.f7615f;
            if (i2 <= i3) {
                this.f7615f = i2;
                mo28761b();
                return i3;
            }
            throw C4608d.m13270a();
        }
        throw C4608d.m13271b();
    }

    /* renamed from: a */
    public long m12931a() {
        return mo28763c();
    }

    /* renamed from: a */
    public C4504a m12932a() {
        int d = mo28765d();
        int i = this.f7608a;
        int i2 = this.f7612c;
        if (d > i - i2 || d <= 0) {
            return C4504a.m12825a(mo28759a(d));
        }
        C4504a a = C4504a.m12826a(this.f7610a, i2, d);
        this.f7612c += d;
        return a;
    }

    /* renamed from: a */
    public String m12933a() {
        int d = mo28765d();
        int i = this.f7608a;
        int i2 = this.f7612c;
        if (d > i - i2 || d <= 0) {
            return new String(mo28759a(d), "UTF-8");
        }
        String str = new String(this.f7610a, i2, d, "UTF-8");
        this.f7612c += d;
        return str;
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: a */
    public void m12934a() {
        /*
            r1 = this;
        L_0x0000:
            int r0 = r1.mo28758a()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.mo28759a((int) r0)
            if (r0 != 0) goto L_0x0000
        L_0x000c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4538b.m12934a():void");
    }

    /* renamed from: a */
    public void m12935a(int i) {
        if (this.f7613d != i) {
            throw C4608d.m13274e();
        }
    }

    /* renamed from: a */
    public void mo28760a(C4651e eVar) {
        int d = mo28765d();
        if (this.f7616g < this.f7617h) {
            int a = mo28759a(d);
            this.f7616g++;
            eVar.mo28926a(this);
            mo28759a(0);
            this.f7616g--;
            mo28762b(a);
            return;
        }
        throw C4608d.m13276g();
    }

    /* renamed from: a */
    public boolean m12937a() {
        return mo28765d() != 0;
    }

    /* renamed from: a */
    public boolean m12938a(int i) {
        int a = C4680f.m13773a(i);
        if (a == 0) {
            mo28761b();
            return true;
        } else if (a == 1) {
            mo28765d();
            return true;
        } else if (a == 2) {
            mo28764c(mo28765d());
            return true;
        } else if (a == 3) {
            mo28758a();
            mo28759a(C4680f.m13774a(C4680f.m13775b(i), 4));
            return true;
        } else if (a == 4) {
            return false;
        } else {
            if (a == 5) {
                mo28766e();
                return true;
            }
            throw C4608d.m13275f();
        }
    }

    /* renamed from: a */
    public byte[] m12939a(int i) {
        if (i >= 0) {
            int i2 = this.f7614e;
            int i3 = this.f7612c;
            int i4 = i2 + i3 + i;
            int i5 = this.f7615f;
            if (i4 <= i5) {
                int i6 = this.f7608a;
                if (i <= i6 - i3) {
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.f7610a, i3, bArr, 0, i);
                    this.f7612c += i;
                    return bArr;
                } else if (i < 4096) {
                    byte[] bArr2 = new byte[i];
                    int i7 = i6 - i3;
                    System.arraycopy(this.f7610a, i3, bArr2, 0, i7);
                    this.f7612c = this.f7608a;
                    while (true) {
                        m12926a(true);
                        int i8 = i - i7;
                        int i9 = this.f7608a;
                        if (i8 > i9) {
                            System.arraycopy(this.f7610a, 0, bArr2, i7, i9);
                            int i10 = this.f7608a;
                            i7 += i10;
                            this.f7612c = i10;
                        } else {
                            System.arraycopy(this.f7610a, 0, bArr2, i7, i8);
                            this.f7612c = i8;
                            return bArr2;
                        }
                    }
                } else {
                    this.f7614e = i2 + i6;
                    this.f7612c = 0;
                    this.f7608a = 0;
                    int i11 = i6 - i3;
                    int i12 = i - i11;
                    Vector vector = new Vector();
                    while (i12 > 0) {
                        int min = Math.min(i12, 4096);
                        byte[] bArr3 = new byte[min];
                        int i13 = 0;
                        while (i13 < min) {
                            InputStream inputStream = this.f7609a;
                            int read = inputStream == null ? -1 : inputStream.read(bArr3, i13, min - i13);
                            if (read != -1) {
                                this.f7614e += read;
                                i13 += read;
                            } else {
                                throw C4608d.m13270a();
                            }
                        }
                        i12 -= min;
                        vector.addElement(bArr3);
                    }
                    byte[] bArr4 = new byte[i];
                    System.arraycopy(this.f7610a, i3, bArr4, 0, i11);
                    for (int i14 = 0; i14 < vector.size(); i14++) {
                        byte[] bArr5 = (byte[]) vector.elementAt(i14);
                        System.arraycopy(bArr5, 0, bArr4, i11, bArr5.length);
                        i11 += bArr5.length;
                    }
                    return bArr4;
                }
            } else {
                mo28764c((i5 - i2) - i3);
                throw C4608d.m13270a();
            }
        } else {
            throw C4608d.m13271b();
        }
    }

    /* renamed from: b */
    public int m12940b() {
        return mo28765d();
    }

    /* renamed from: b */
    public long m12941b() {
        return mo28763c();
    }

    /* renamed from: b */
    public void mo28762b(int i) {
        this.f7615f = i;
        mo28761b();
    }

    /* renamed from: b */
    public boolean m12943b() {
        return this.f7612c == this.f7608a && !m12926a(false);
    }

    /* renamed from: c */
    public int mo28763c() {
        return mo28765d();
    }

    /* renamed from: c */
    public long m12945c() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte a = mo28758a();
            j |= ((long) (a & Byte.MAX_VALUE)) << i;
            if ((a & 128) == 0) {
                return j;
            }
        }
        throw C4608d.m13272c();
    }

    /* renamed from: c */
    public void mo28764c(int i) {
        if (i >= 0) {
            int i2 = this.f7614e;
            int i3 = this.f7612c;
            int i4 = i2 + i3 + i;
            int i5 = this.f7615f;
            if (i4 <= i5) {
                int i6 = this.f7608a;
                if (i <= i6 - i3) {
                    this.f7612c = i3 + i;
                    return;
                }
                int i7 = i6 - i3;
                this.f7614e = i2 + i6;
                this.f7612c = 0;
                this.f7608a = 0;
                while (i7 < i) {
                    InputStream inputStream = this.f7609a;
                    int skip = inputStream == null ? -1 : (int) inputStream.skip((long) (i - i7));
                    if (skip > 0) {
                        i7 += skip;
                        this.f7614e += skip;
                    } else {
                        throw C4608d.m13270a();
                    }
                }
                return;
            }
            mo28764c((i5 - i2) - i3);
            throw C4608d.m13270a();
        }
        throw C4608d.m13271b();
    }

    /* renamed from: d */
    public int mo28765d() {
        int i;
        byte a = mo28758a();
        if (a >= 0) {
            return a;
        }
        byte b = a & Byte.MAX_VALUE;
        byte a2 = mo28758a();
        if (a2 >= 0) {
            i = a2 << 7;
        } else {
            b |= (a2 & Byte.MAX_VALUE) << 7;
            byte a3 = mo28758a();
            if (a3 >= 0) {
                i = a3 << ParameterInitDefType.IntVec4Init;
            } else {
                b |= (a3 & Byte.MAX_VALUE) << ParameterInitDefType.IntVec4Init;
                byte a4 = mo28758a();
                if (a4 >= 0) {
                    i = a4 << 21;
                } else {
                    byte b2 = b | ((a4 & Byte.MAX_VALUE) << 21);
                    byte a5 = mo28758a();
                    byte b3 = b2 | (a5 << 28);
                    if (a5 >= 0) {
                        return b3;
                    }
                    for (int i2 = 0; i2 < 5; i2++) {
                        if (mo28758a() >= 0) {
                            return b3;
                        }
                    }
                    throw C4608d.m13272c();
                }
            }
        }
        return b | i;
    }

    /* renamed from: d */
    public long m12948d() {
        byte a = mo28758a();
        byte a2 = mo28758a();
        return ((((long) a2) & 255) << 8) | (((long) a) & 255) | ((((long) mo28758a()) & 255) << 16) | ((((long) mo28758a()) & 255) << 24) | ((((long) mo28758a()) & 255) << 32) | ((((long) mo28758a()) & 255) << 40) | ((((long) mo28758a()) & 255) << 48) | ((((long) mo28758a()) & 255) << 56);
    }

    /* renamed from: e */
    public int mo28766e() {
        return (mo28758a() & 255) | ((mo28758a() & 255) << 8) | ((mo28758a() & 255) << ParameterInitDefType.ExternalSamplerInit) | ((mo28758a() & 255) << 24);
    }
}
