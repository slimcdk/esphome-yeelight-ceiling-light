package com.google.android.gms.internal.wearable;

import com.miot.service.connection.wifi.step.SmartConfigStep;

/* renamed from: com.google.android.gms.internal.wearable.v */
final class C1519v extends C1527x {

    /* renamed from: d */
    private final byte[] f1862d;

    /* renamed from: e */
    private final int f1863e;

    /* renamed from: f */
    private int f1864f;

    C1519v(byte[] bArr, int i, int i2) {
        super((C1514u) null);
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.f1862d = bArr;
            this.f1864f = 0;
            this.f1863e = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
    }

    /* renamed from: E */
    public final void mo13807E(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, 0, this.f1862d, this.f1864f, i2);
            this.f1864f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzba(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f1864f), Integer.valueOf(this.f1863e), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: F */
    public final void mo13808F(String str) {
        int i = this.f1864f;
        try {
            int A = C1527x.m3873A(str.length() * 3);
            int A2 = C1527x.m3873A(str.length());
            if (A2 == A) {
                int i2 = i + A2;
                this.f1864f = i2;
                int d = C1428c3.m3496d(str, this.f1862d, i2, this.f1863e - i2);
                this.f1864f = i;
                mo13820r((d - i) - A2);
                this.f1864f = d;
                return;
            }
            mo13820r(C1428c3.m3495c(str));
            byte[] bArr = this.f1862d;
            int i3 = this.f1864f;
            this.f1864f = C1428c3.m3496d(str, bArr, i3, this.f1863e - i3);
        } catch (zzek e) {
            this.f1864f = i;
            mo13837d(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzba(e2);
        }
    }

    /* renamed from: g */
    public final void mo13809g(int i, int i2) {
        mo13820r((i << 3) | i2);
    }

    /* renamed from: h */
    public final void mo13810h(int i, int i2) {
        mo13820r(i << 3);
        mo13819q(i2);
    }

    /* renamed from: i */
    public final void mo13811i(int i, int i2) {
        mo13820r(i << 3);
        mo13820r(i2);
    }

    /* renamed from: j */
    public final void mo13812j(int i, int i2) {
        mo13820r((i << 3) | 5);
        mo13821s(i2);
    }

    /* renamed from: k */
    public final void mo13813k(int i, long j) {
        mo13820r(i << 3);
        mo13822t(j);
    }

    /* renamed from: l */
    public final void mo13814l(int i, long j) {
        mo13820r((i << 3) | 1);
        mo13823u(j);
    }

    /* renamed from: m */
    public final void mo13815m(int i, boolean z) {
        mo13820r(i << 3);
        mo13818p(z ? (byte) 1 : 0);
    }

    /* renamed from: n */
    public final void mo13816n(int i, String str) {
        mo13820r((i << 3) | 2);
        mo13808F(str);
    }

    /* renamed from: o */
    public final void mo13817o(int i, zzau zzau) {
        mo13820r((i << 3) | 2);
        mo13820r(zzau.zzc());
        zzau.zzg(this);
    }

    /* renamed from: p */
    public final void mo13818p(byte b) {
        try {
            byte[] bArr = this.f1862d;
            int i = this.f1864f;
            this.f1864f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzba(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f1864f), Integer.valueOf(this.f1863e), 1}), e);
        }
    }

    /* renamed from: q */
    public final void mo13819q(int i) {
        if (i >= 0) {
            mo13820r(i);
        } else {
            mo13822t((long) i);
        }
    }

    /* renamed from: r */
    public final void mo13820r(int i) {
        if (C1527x.f1870c) {
            int i2 = C1449h.f1782a;
        }
        while ((i & -128) != 0) {
            byte[] bArr = this.f1862d;
            int i3 = this.f1864f;
            this.f1864f = i3 + 1;
            bArr[i3] = (byte) ((i & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f1862d;
            int i4 = this.f1864f;
            this.f1864f = i4 + 1;
            bArr2[i4] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzba(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f1864f), Integer.valueOf(this.f1863e), 1}), e);
        }
    }

    /* renamed from: s */
    public final void mo13821s(int i) {
        try {
            byte[] bArr = this.f1862d;
            int i2 = this.f1864f;
            int i3 = i2 + 1;
            this.f1864f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f1864f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f1864f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f1864f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzba(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f1864f), Integer.valueOf(this.f1863e), 1}), e);
        }
    }

    /* renamed from: t */
    public final void mo13822t(long j) {
        if (!C1527x.f1870c || this.f1863e - this.f1864f < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f1862d;
                int i = this.f1864f;
                this.f1864f = i + 1;
                bArr[i] = (byte) ((((int) j) & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f1862d;
                int i2 = this.f1864f;
                this.f1864f = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new zzba(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f1864f), Integer.valueOf(this.f1863e), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f1862d;
                int i3 = this.f1864f;
                this.f1864f = i3 + 1;
                C1534y2.m3997u(bArr3, (long) i3, (byte) ((((int) j) & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f1862d;
            int i4 = this.f1864f;
            this.f1864f = i4 + 1;
            C1534y2.m3997u(bArr4, (long) i4, (byte) ((int) j));
        }
    }

    /* renamed from: u */
    public final void mo13823u(long j) {
        try {
            byte[] bArr = this.f1862d;
            int i = this.f1864f;
            int i2 = i + 1;
            this.f1864f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f1864f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f1864f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f1864f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f1864f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f1864f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f1864f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f1864f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzba(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f1864f), Integer.valueOf(this.f1863e), 1}), e);
        }
    }

    /* renamed from: v */
    public final void mo13824v(byte[] bArr, int i, int i2) {
        mo13807E(bArr, 0, i2);
    }

    /* renamed from: w */
    public final int mo13825w() {
        return this.f1863e - this.f1864f;
    }
}
