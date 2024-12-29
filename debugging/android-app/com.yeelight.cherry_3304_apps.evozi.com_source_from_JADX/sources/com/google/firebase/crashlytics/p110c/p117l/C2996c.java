package com.google.firebase.crashlytics.p110c.p117l;

import com.miot.service.connection.wifi.step.SmartConfigStep;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.firebase.crashlytics.c.l.c */
public final class C2996c implements Flushable {

    /* renamed from: a */
    private final byte[] f5828a;

    /* renamed from: b */
    private final int f5829b;

    /* renamed from: c */
    private int f5830c = 0;

    /* renamed from: d */
    private final OutputStream f5831d;

    /* renamed from: com.google.firebase.crashlytics.c.l.c$a */
    static class C2997a extends IOException {
        C2997a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private C2996c(OutputStream outputStream, byte[] bArr) {
        this.f5831d = outputStream;
        this.f5828a = bArr;
        this.f5829b = bArr.length;
    }

    /* renamed from: a */
    public static int m9220a(int i, boolean z) {
        return m9233o(i) + m9221b(z);
    }

    /* renamed from: b */
    public static int m9221b(boolean z) {
        return 1;
    }

    /* renamed from: c */
    public static int m9222c(int i, C2993a aVar) {
        return m9233o(i) + m9223d(aVar);
    }

    /* renamed from: d */
    public static int m9223d(C2993a aVar) {
        return m9229k(aVar.mo17363f()) + aVar.mo17363f();
    }

    /* renamed from: e */
    public static int m9224e(int i, int i2) {
        return m9233o(i) + m9225g(i2);
    }

    /* renamed from: g */
    public static int m9225g(int i) {
        return m9228j(i);
    }

    /* renamed from: h */
    public static int m9226h(int i, float f) {
        return m9233o(i) + m9227i(f);
    }

    /* renamed from: i */
    public static int m9227i(float f) {
        return 4;
    }

    /* renamed from: j */
    public static int m9228j(int i) {
        if (i >= 0) {
            return m9229k(i);
        }
        return 10;
    }

    /* renamed from: k */
    public static int m9229k(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: l */
    public static int m9230l(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: m */
    public static int m9231m(int i, int i2) {
        return m9233o(i) + m9232n(i2);
    }

    /* renamed from: n */
    public static int m9232n(int i) {
        return m9229k(m9238t(i));
    }

    /* renamed from: o */
    public static int m9233o(int i) {
        return m9229k(C2999e.m9297a(i, 0));
    }

    /* renamed from: p */
    public static int m9234p(int i, int i2) {
        return m9233o(i) + m9235q(i2);
    }

    /* renamed from: q */
    public static int m9235q(int i) {
        return m9229k(i);
    }

    /* renamed from: r */
    public static int m9236r(int i, long j) {
        return m9233o(i) + m9237s(j);
    }

    /* renamed from: s */
    public static int m9237s(long j) {
        return m9230l(j);
    }

    /* renamed from: t */
    public static int m9238t(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: u */
    public static C2996c m9239u(OutputStream outputStream) {
        return m9240v(outputStream, 4096);
    }

    /* renamed from: v */
    public static C2996c m9240v(OutputStream outputStream, int i) {
        return new C2996c(outputStream, new byte[i]);
    }

    /* renamed from: w */
    private void m9241w() {
        OutputStream outputStream = this.f5831d;
        if (outputStream != null) {
            outputStream.write(this.f5828a, 0, this.f5830c);
            this.f5830c = 0;
            return;
        }
        throw new C2997a();
    }

    /* renamed from: A */
    public void mo17368A(C2993a aVar) {
        mo17381R(aVar.mo17363f());
        mo17376J(aVar);
    }

    /* renamed from: B */
    public void mo17369B(int i, int i2) {
        mo17385W(i, 0);
        mo17370C(i2);
    }

    /* renamed from: C */
    public void mo17370C(int i) {
        mo17373F(i);
    }

    /* renamed from: D */
    public void mo17371D(int i, float f) {
        mo17385W(i, 5);
        mo17372E(f);
    }

    /* renamed from: E */
    public void mo17372E(float f) {
        mo17380Q(Float.floatToRawIntBits(f));
    }

    /* renamed from: F */
    public void mo17373F(int i) {
        if (i >= 0) {
            mo17381R(i);
        } else {
            mo17382S((long) i);
        }
    }

    /* renamed from: G */
    public void mo17374G(byte b) {
        if (this.f5830c == this.f5829b) {
            m9241w();
        }
        byte[] bArr = this.f5828a;
        int i = this.f5830c;
        this.f5830c = i + 1;
        bArr[i] = b;
    }

    /* renamed from: I */
    public void mo17375I(int i) {
        mo17374G((byte) i);
    }

    /* renamed from: J */
    public void mo17376J(C2993a aVar) {
        mo17377K(aVar, 0, aVar.mo17363f());
    }

    /* renamed from: K */
    public void mo17377K(C2993a aVar, int i, int i2) {
        int i3 = this.f5829b;
        int i4 = this.f5830c;
        if (i3 - i4 >= i2) {
            aVar.mo17360d(this.f5828a, i, i4, i2);
            this.f5830c += i2;
            return;
        }
        int i5 = i3 - i4;
        aVar.mo17360d(this.f5828a, i, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f5830c = this.f5829b;
        m9241w();
        if (i7 <= this.f5829b) {
            aVar.mo17360d(this.f5828a, i6, 0, i7);
            this.f5830c = i7;
            return;
        }
        InputStream e = aVar.mo17361e();
        long j = (long) i6;
        if (j == e.skip(j)) {
            while (i7 > 0) {
                int min = Math.min(i7, this.f5829b);
                int read = e.read(this.f5828a, 0, min);
                if (read == min) {
                    this.f5831d.write(this.f5828a, 0, read);
                    i7 -= read;
                } else {
                    throw new IllegalStateException("Read failed.");
                }
            }
            return;
        }
        throw new IllegalStateException("Skip failed.");
    }

    /* renamed from: L */
    public void mo17378L(byte[] bArr) {
        mo17379M(bArr, 0, bArr.length);
    }

    /* renamed from: M */
    public void mo17379M(byte[] bArr, int i, int i2) {
        int i3 = this.f5829b;
        int i4 = this.f5830c;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.f5828a, i4, i2);
            this.f5830c += i2;
            return;
        }
        int i5 = i3 - i4;
        System.arraycopy(bArr, i, this.f5828a, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f5830c = this.f5829b;
        m9241w();
        if (i7 <= this.f5829b) {
            System.arraycopy(bArr, i6, this.f5828a, 0, i7);
            this.f5830c = i7;
            return;
        }
        this.f5831d.write(bArr, i6, i7);
    }

    /* renamed from: Q */
    public void mo17380Q(int i) {
        mo17375I(i & 255);
        mo17375I((i >> 8) & 255);
        mo17375I((i >> 16) & 255);
        mo17375I((i >> 24) & 255);
    }

    /* renamed from: R */
    public void mo17381R(int i) {
        while ((i & -128) != 0) {
            mo17375I((i & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT) | 128);
            i >>>= 7;
        }
        mo17375I(i);
    }

    /* renamed from: S */
    public void mo17382S(long j) {
        while ((-128 & j) != 0) {
            mo17375I((((int) j) & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT) | 128);
            j >>>= 7;
        }
        mo17375I((int) j);
    }

    /* renamed from: T */
    public void mo17383T(int i, int i2) {
        mo17385W(i, 0);
        mo17384V(i2);
    }

    /* renamed from: V */
    public void mo17384V(int i) {
        mo17381R(m9238t(i));
    }

    /* renamed from: W */
    public void mo17385W(int i, int i2) {
        mo17381R(C2999e.m9297a(i, i2));
    }

    /* renamed from: X */
    public void mo17386X(int i, int i2) {
        mo17385W(i, 0);
        mo17387Z(i2);
    }

    /* renamed from: Z */
    public void mo17387Z(int i) {
        mo17381R(i);
    }

    /* renamed from: a0 */
    public void mo17388a0(int i, long j) {
        mo17385W(i, 0);
        mo17389b0(j);
    }

    /* renamed from: b0 */
    public void mo17389b0(long j) {
        mo17382S(j);
    }

    public void flush() {
        if (this.f5831d != null) {
            m9241w();
        }
    }

    /* renamed from: x */
    public void mo17391x(int i, boolean z) {
        mo17385W(i, 0);
        mo17392y(z);
    }

    /* renamed from: y */
    public void mo17392y(boolean z) {
        mo17375I(z ? 1 : 0);
    }

    /* renamed from: z */
    public void mo17393z(int i, C2993a aVar) {
        mo17385W(i, 2);
        mo17368A(aVar);
    }
}
