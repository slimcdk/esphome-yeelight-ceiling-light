package com.google.android.gms.internal.measurement;

import com.miot.service.connection.wifi.step.SmartConfigStep;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.q7 */
final class C1269q7 extends C1301s7 {

    /* renamed from: d */
    private final byte[] f1552d;

    /* renamed from: e */
    private final int f1553e;

    /* renamed from: f */
    private int f1554f;

    C1269q7(byte[] bArr, int i, int i2) {
        super((C1285r7) null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.f1552d = bArr;
            this.f1554f = 0;
            this.f1553e = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
    }

    /* renamed from: E */
    public final void mo13086E(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, 0, this.f1552d, this.f1554f, i2);
            this.f1554f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f1554f), Integer.valueOf(this.f1553e), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: F */
    public final void mo13087F(String str) {
        int i = this.f1554f;
        try {
            int a = C1301s7.m2904a(str.length() * 3);
            int a2 = C1301s7.m2904a(str.length());
            if (a2 == a) {
                int i2 = i + a2;
                this.f1554f = i2;
                int b = C1049cb.m1775b(str, this.f1552d, i2, this.f1553e - i2);
                this.f1554f = i;
                mo13102u((b - i) - a2);
                this.f1554f = b;
                return;
            }
            mo13102u(C1049cb.m1776c(str));
            byte[] bArr = this.f1552d;
            int i3 = this.f1554f;
            this.f1554f = C1049cb.m1775b(str, bArr, i3, this.f1553e - i3);
        } catch (zzmz e) {
            this.f1554f = i;
            mo13346e(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzjh(e2);
        }
    }

    /* renamed from: g */
    public final int mo13088g() {
        return this.f1553e - this.f1554f;
    }

    /* renamed from: h */
    public final void mo13089h(byte b) {
        try {
            byte[] bArr = this.f1552d;
            int i = this.f1554f;
            this.f1554f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f1554f), Integer.valueOf(this.f1553e), 1}), e);
        }
    }

    /* renamed from: i */
    public final void mo13090i(int i, boolean z) {
        mo13102u(i << 3);
        mo13089h(z ? (byte) 1 : 0);
    }

    /* renamed from: j */
    public final void mo13091j(int i, zzjb zzjb) {
        mo13102u((i << 3) | 2);
        mo13102u(zzjb.zzd());
        zzjb.zzh(this);
    }

    /* renamed from: k */
    public final void mo13092k(int i, int i2) {
        mo13102u((i << 3) | 5);
        mo13093l(i2);
    }

    /* renamed from: l */
    public final void mo13093l(int i) {
        try {
            byte[] bArr = this.f1552d;
            int i2 = this.f1554f;
            int i3 = i2 + 1;
            this.f1554f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f1554f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f1554f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f1554f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f1554f), Integer.valueOf(this.f1553e), 1}), e);
        }
    }

    /* renamed from: m */
    public final void mo13094m(int i, long j) {
        mo13102u((i << 3) | 1);
        mo13095n(j);
    }

    /* renamed from: n */
    public final void mo13095n(long j) {
        try {
            byte[] bArr = this.f1552d;
            int i = this.f1554f;
            int i2 = i + 1;
            this.f1554f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f1554f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f1554f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f1554f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f1554f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f1554f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f1554f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f1554f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f1554f), Integer.valueOf(this.f1553e), 1}), e);
        }
    }

    /* renamed from: o */
    public final void mo13096o(int i, int i2) {
        mo13102u(i << 3);
        mo13097p(i2);
    }

    /* renamed from: p */
    public final void mo13097p(int i) {
        if (i >= 0) {
            mo13102u(i);
        } else {
            mo13104w((long) i);
        }
    }

    /* renamed from: q */
    public final void mo13098q(byte[] bArr, int i, int i2) {
        mo13086E(bArr, 0, i2);
    }

    /* renamed from: r */
    public final void mo13099r(int i, String str) {
        mo13102u((i << 3) | 2);
        mo13087F(str);
    }

    /* renamed from: s */
    public final void mo13100s(int i, int i2) {
        mo13102u((i << 3) | i2);
    }

    /* renamed from: t */
    public final void mo13101t(int i, int i2) {
        mo13102u(i << 3);
        mo13102u(i2);
    }

    /* renamed from: u */
    public final void mo13102u(int i) {
        while ((i & -128) != 0) {
            byte[] bArr = this.f1552d;
            int i2 = this.f1554f;
            this.f1554f = i2 + 1;
            bArr[i2] = (byte) ((i & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f1552d;
            int i3 = this.f1554f;
            this.f1554f = i3 + 1;
            bArr2[i3] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f1554f), Integer.valueOf(this.f1553e), 1}), e);
        }
    }

    /* renamed from: v */
    public final void mo13103v(int i, long j) {
        mo13102u(i << 3);
        mo13104w(j);
    }

    /* renamed from: w */
    public final void mo13104w(long j) {
        if (!C1301s7.f1598c || this.f1553e - this.f1554f < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f1552d;
                int i = this.f1554f;
                this.f1554f = i + 1;
                bArr[i] = (byte) ((((int) j) & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f1552d;
                int i2 = this.f1554f;
                this.f1554f = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f1554f), Integer.valueOf(this.f1553e), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f1552d;
                int i3 = this.f1554f;
                this.f1554f = i3 + 1;
                C1380xa.m3275s(bArr3, (long) i3, (byte) ((((int) j) & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f1552d;
            int i4 = this.f1554f;
            this.f1554f = i4 + 1;
            C1380xa.m3275s(bArr4, (long) i4, (byte) ((int) j));
        }
    }
}
