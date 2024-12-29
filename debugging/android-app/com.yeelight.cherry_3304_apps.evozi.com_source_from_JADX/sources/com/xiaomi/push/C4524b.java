package com.xiaomi.push;

import androidx.appcompat.widget.ActivityChooserView;
import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.io.InputStream;
import java.util.Vector;

/* renamed from: com.xiaomi.push.b */
public final class C4524b {

    /* renamed from: a */
    private int f8202a;

    /* renamed from: a */
    private final InputStream f8203a;

    /* renamed from: a */
    private final byte[] f8204a;

    /* renamed from: b */
    private int f8205b;

    /* renamed from: c */
    private int f8206c;

    /* renamed from: d */
    private int f8207d;

    /* renamed from: e */
    private int f8208e;

    /* renamed from: f */
    private int f8209f;

    /* renamed from: g */
    private int f8210g;

    /* renamed from: h */
    private int f8211h;

    /* renamed from: i */
    private int f8212i;

    private C4524b(InputStream inputStream) {
        this.f8209f = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f8211h = 64;
        this.f8212i = 67108864;
        this.f8204a = new byte[4096];
        this.f8202a = 0;
        this.f8206c = 0;
        this.f8203a = inputStream;
    }

    private C4524b(byte[] bArr, int i, int i2) {
        this.f8209f = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f8211h = 64;
        this.f8212i = 67108864;
        this.f8204a = bArr;
        this.f8202a = i2 + i;
        this.f8206c = i;
        this.f8203a = null;
    }

    /* renamed from: a */
    public static C4524b m13373a(InputStream inputStream) {
        return new C4524b(inputStream);
    }

    /* renamed from: a */
    public static C4524b m13374a(byte[] bArr, int i, int i2) {
        return new C4524b(bArr, i, i2);
    }

    /* renamed from: a */
    private boolean m13375a(boolean z) {
        int i = this.f8206c;
        int i2 = this.f8202a;
        if (i >= i2) {
            int i3 = this.f8208e;
            if (i3 + i2 != this.f8209f) {
                this.f8208e = i3 + i2;
                this.f8206c = 0;
                InputStream inputStream = this.f8203a;
                int read = inputStream == null ? -1 : inputStream.read(this.f8204a);
                this.f8202a = read;
                if (read == 0 || read < -1) {
                    throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + this.f8202a + "\nThe InputStream implementation is buggy.");
                } else if (read == -1) {
                    this.f8202a = 0;
                    if (!z) {
                        return false;
                    }
                    throw C4589d.m13680a();
                } else {
                    mo24760b();
                    int i4 = this.f8208e + this.f8202a + this.f8205b;
                    if (i4 <= this.f8212i && i4 >= 0) {
                        return true;
                    }
                    throw C4589d.m13687h();
                }
            } else if (!z) {
                return false;
            } else {
                throw C4589d.m13680a();
            }
        } else {
            throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
        }
    }

    /* renamed from: b */
    private void mo24760b() {
        int i = this.f8202a + this.f8205b;
        this.f8202a = i;
        int i2 = this.f8208e + i;
        int i3 = this.f8209f;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f8205b = i4;
            this.f8202a = i - i4;
            return;
        }
        this.f8205b = 0;
    }

    /* renamed from: a */
    public byte mo24757a() {
        if (this.f8206c == this.f8202a) {
            m13375a(true);
        }
        byte[] bArr = this.f8204a;
        int i = this.f8206c;
        this.f8206c = i + 1;
        return bArr[i];
    }

    /* renamed from: a */
    public int m13378a() {
        if (mo24760b()) {
            this.f8207d = 0;
            return 0;
        }
        int d = mo24764d();
        this.f8207d = d;
        if (d != 0) {
            return d;
        }
        throw C4589d.m13683d();
    }

    /* renamed from: a */
    public int mo24758a(int i) {
        if (i >= 0) {
            int i2 = i + this.f8208e + this.f8206c;
            int i3 = this.f8209f;
            if (i2 <= i3) {
                this.f8209f = i2;
                mo24760b();
                return i3;
            }
            throw C4589d.m13680a();
        }
        throw C4589d.m13681b();
    }

    /* renamed from: a */
    public long m13380a() {
        return mo24762c();
    }

    /* renamed from: a */
    public C4489a m13381a() {
        int d = mo24764d();
        int i = this.f8202a;
        int i2 = this.f8206c;
        if (d > i - i2 || d <= 0) {
            return C4489a.m13247a(mo24758a(d));
        }
        C4489a a = C4489a.m13248a(this.f8204a, i2, d);
        this.f8206c += d;
        return a;
    }

    /* renamed from: a */
    public String m13382a() {
        int d = mo24764d();
        if (d > this.f8202a - this.f8206c || d <= 0) {
            return new String(mo24758a(d), "UTF-8");
        }
        String str = new String(this.f8204a, this.f8206c, d, "UTF-8");
        this.f8206c += d;
        return str;
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: a */
    public void m13383a() {
        /*
            r1 = this;
        L_0x0000:
            int r0 = r1.mo24757a()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.mo24758a((int) r0)
            if (r0 != 0) goto L_0x0000
        L_0x000c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4524b.m13383a():void");
    }

    /* renamed from: a */
    public void m13384a(int i) {
        if (this.f8207d != i) {
            throw C4589d.m13684e();
        }
    }

    /* renamed from: a */
    public void mo24759a(C4620e eVar) {
        int d = mo24764d();
        if (this.f8210g < this.f8211h) {
            int a = mo24758a(d);
            this.f8210g++;
            eVar.mo24931a(this);
            mo24758a(0);
            this.f8210g--;
            mo24761b(a);
            return;
        }
        throw C4589d.m13686g();
    }

    /* renamed from: a */
    public boolean m13386a() {
        return mo24764d() != 0;
    }

    /* renamed from: a */
    public boolean m13387a(int i) {
        int a = C4659f.m14132a(i);
        if (a == 0) {
            mo24760b();
            return true;
        } else if (a == 1) {
            mo24764d();
            return true;
        } else if (a == 2) {
            mo24763c(mo24764d());
            return true;
        } else if (a == 3) {
            mo24757a();
            mo24758a(C4659f.m14133a(C4659f.m14134b(i), 4));
            return true;
        } else if (a == 4) {
            return false;
        } else {
            if (a == 5) {
                mo24765e();
                return true;
            }
            throw C4589d.m13685f();
        }
    }

    /* renamed from: a */
    public byte[] m13388a(int i) {
        if (i >= 0) {
            int i2 = this.f8208e;
            int i3 = this.f8206c;
            int i4 = i2 + i3 + i;
            int i5 = this.f8209f;
            if (i4 <= i5) {
                int i6 = this.f8202a;
                if (i <= i6 - i3) {
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.f8204a, i3, bArr, 0, i);
                    this.f8206c += i;
                    return bArr;
                } else if (i < 4096) {
                    byte[] bArr2 = new byte[i];
                    int i7 = i6 - i3;
                    System.arraycopy(this.f8204a, i3, bArr2, 0, i7);
                    this.f8206c = this.f8202a;
                    while (true) {
                        m13375a(true);
                        int i8 = i - i7;
                        int i9 = this.f8202a;
                        if (i8 > i9) {
                            System.arraycopy(this.f8204a, 0, bArr2, i7, i9);
                            int i10 = this.f8202a;
                            i7 += i10;
                            this.f8206c = i10;
                        } else {
                            System.arraycopy(this.f8204a, 0, bArr2, i7, i8);
                            this.f8206c = i8;
                            return bArr2;
                        }
                    }
                } else {
                    this.f8208e = i2 + i6;
                    this.f8206c = 0;
                    this.f8202a = 0;
                    int i11 = i6 - i3;
                    int i12 = i - i11;
                    Vector vector = new Vector();
                    while (i12 > 0) {
                        int min = Math.min(i12, 4096);
                        byte[] bArr3 = new byte[min];
                        int i13 = 0;
                        while (i13 < min) {
                            InputStream inputStream = this.f8203a;
                            int read = inputStream == null ? -1 : inputStream.read(bArr3, i13, min - i13);
                            if (read != -1) {
                                this.f8208e += read;
                                i13 += read;
                            } else {
                                throw C4589d.m13680a();
                            }
                        }
                        i12 -= min;
                        vector.addElement(bArr3);
                    }
                    byte[] bArr4 = new byte[i];
                    System.arraycopy(this.f8204a, i3, bArr4, 0, i11);
                    for (int i14 = 0; i14 < vector.size(); i14++) {
                        byte[] bArr5 = (byte[]) vector.elementAt(i14);
                        System.arraycopy(bArr5, 0, bArr4, i11, bArr5.length);
                        i11 += bArr5.length;
                    }
                    return bArr4;
                }
            } else {
                mo24763c((i5 - i2) - i3);
                throw C4589d.m13680a();
            }
        } else {
            throw C4589d.m13681b();
        }
    }

    /* renamed from: b */
    public int m13389b() {
        return mo24764d();
    }

    /* renamed from: b */
    public long m13390b() {
        return mo24762c();
    }

    /* renamed from: b */
    public void mo24761b(int i) {
        this.f8209f = i;
        mo24760b();
    }

    /* renamed from: b */
    public boolean m13392b() {
        return this.f8206c == this.f8202a && !m13375a(false);
    }

    /* renamed from: c */
    public int mo24762c() {
        return mo24764d();
    }

    /* renamed from: c */
    public long m13394c() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte a = mo24757a();
            j |= ((long) (a & Byte.MAX_VALUE)) << i;
            if ((a & 128) == 0) {
                return j;
            }
        }
        throw C4589d.m13682c();
    }

    /* renamed from: c */
    public void mo24763c(int i) {
        if (i >= 0) {
            int i2 = this.f8208e;
            int i3 = this.f8206c;
            int i4 = i2 + i3 + i;
            int i5 = this.f8209f;
            if (i4 <= i5) {
                int i6 = this.f8202a;
                if (i <= i6 - i3) {
                    this.f8206c = i3 + i;
                    return;
                }
                int i7 = i6 - i3;
                this.f8208e = i2 + i6;
                this.f8206c = 0;
                this.f8202a = 0;
                while (i7 < i) {
                    InputStream inputStream = this.f8203a;
                    int skip = inputStream == null ? -1 : (int) inputStream.skip((long) (i - i7));
                    if (skip > 0) {
                        i7 += skip;
                        this.f8208e += skip;
                    } else {
                        throw C4589d.m13680a();
                    }
                }
                return;
            }
            mo24763c((i5 - i2) - i3);
            throw C4589d.m13680a();
        }
        throw C4589d.m13681b();
    }

    /* renamed from: d */
    public int mo24764d() {
        int i;
        byte a = mo24757a();
        if (a >= 0) {
            return a;
        }
        byte b = a & Byte.MAX_VALUE;
        byte a2 = mo24757a();
        if (a2 >= 0) {
            i = a2 << 7;
        } else {
            b |= (a2 & Byte.MAX_VALUE) << 7;
            byte a3 = mo24757a();
            if (a3 >= 0) {
                i = a3 << ParameterInitDefType.IntVec4Init;
            } else {
                b |= (a3 & Byte.MAX_VALUE) << ParameterInitDefType.IntVec4Init;
                byte a4 = mo24757a();
                if (a4 >= 0) {
                    i = a4 << 21;
                } else {
                    byte b2 = b | ((a4 & Byte.MAX_VALUE) << 21);
                    byte a5 = mo24757a();
                    byte b3 = b2 | (a5 << 28);
                    if (a5 >= 0) {
                        return b3;
                    }
                    for (int i2 = 0; i2 < 5; i2++) {
                        if (mo24757a() >= 0) {
                            return b3;
                        }
                    }
                    throw C4589d.m13682c();
                }
            }
        }
        return b | i;
    }

    /* renamed from: d */
    public long m13397d() {
        byte a = mo24757a();
        byte a2 = mo24757a();
        return ((((long) a2) & 255) << 8) | (((long) a) & 255) | ((((long) mo24757a()) & 255) << 16) | ((((long) mo24757a()) & 255) << 24) | ((((long) mo24757a()) & 255) << 32) | ((((long) mo24757a()) & 255) << 40) | ((((long) mo24757a()) & 255) << 48) | ((((long) mo24757a()) & 255) << 56);
    }

    /* renamed from: e */
    public int mo24765e() {
        return (mo24757a() & 255) | ((mo24757a() & 255) << 8) | ((mo24757a() & 255) << ParameterInitDefType.ExternalSamplerInit) | ((mo24757a() & 255) << 24);
    }
}
