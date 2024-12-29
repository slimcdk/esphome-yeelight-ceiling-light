package com.google.zxing.common;

import java.util.Arrays;
import org.apache.commons.p194io.FilenameUtils;

/* renamed from: com.google.zxing.common.a */
public final class C2548a implements Cloneable {

    /* renamed from: a */
    private int[] f4305a;

    /* renamed from: b */
    private int f4306b;

    public C2548a() {
        this.f4306b = 0;
        this.f4305a = new int[1];
    }

    public C2548a(int i) {
        this.f4306b = i;
        this.f4305a = m6903p(i);
    }

    C2548a(int[] iArr, int i) {
        this.f4305a = iArr;
        this.f4306b = i;
    }

    /* renamed from: e */
    private void m6902e(int i) {
        if (i > (this.f4305a.length << 5)) {
            int[] p = m6903p(i);
            int[] iArr = this.f4305a;
            System.arraycopy(iArr, 0, p, 0, iArr.length);
            this.f4305a = p;
        }
    }

    /* renamed from: p */
    private static int[] m6903p(int i) {
        return new int[((i + 31) / 32)];
    }

    /* renamed from: a */
    public void mo19469a(boolean z) {
        m6902e(this.f4306b + 1);
        if (z) {
            int[] iArr = this.f4305a;
            int i = this.f4306b;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f4306b++;
    }

    /* renamed from: b */
    public void mo19470b(C2548a aVar) {
        int i = aVar.f4306b;
        m6902e(this.f4306b + i);
        for (int i2 = 0; i2 < i; i2++) {
            mo19469a(aVar.mo19476f(i2));
        }
    }

    /* renamed from: c */
    public void mo19471c(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        m6902e(this.f4306b + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            mo19469a(z);
            i2--;
        }
    }

    public void clear() {
        int length = this.f4305a.length;
        for (int i = 0; i < length; i++) {
            this.f4305a[i] = 0;
        }
    }

    /* renamed from: d */
    public C2548a clone() {
        return new C2548a((int[]) this.f4305a.clone(), this.f4306b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2548a)) {
            return false;
        }
        C2548a aVar = (C2548a) obj;
        return this.f4306b == aVar.f4306b && Arrays.equals(this.f4305a, aVar.f4305a);
    }

    /* renamed from: f */
    public boolean mo19476f(int i) {
        return ((1 << (i & 31)) & this.f4305a[i / 32]) != 0;
    }

    /* renamed from: g */
    public int[] mo19477g() {
        return this.f4305a;
    }

    /* renamed from: h */
    public int mo19478h(int i) {
        int i2 = this.f4306b;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (((1 << (i & 31)) - 1) ^ -1) & this.f4305a[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f4305a;
            if (i3 == iArr.length) {
                return this.f4306b;
            }
            i4 = iArr[i3];
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f4306b;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    public int hashCode() {
        return (this.f4306b * 31) + Arrays.hashCode(this.f4305a);
    }

    /* renamed from: i */
    public int mo19480i(int i) {
        int i2 = this.f4306b;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (((1 << (i & 31)) - 1) ^ -1) & (this.f4305a[i3] ^ -1);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f4305a;
            if (i3 == iArr.length) {
                return this.f4306b;
            }
            i4 = iArr[i3] ^ -1;
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f4306b;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    /* renamed from: j */
    public int mo19481j() {
        return this.f4306b;
    }

    /* renamed from: k */
    public int mo19482k() {
        return (this.f4306b + 7) / 8;
    }

    /* renamed from: o */
    public boolean mo19483o(int i, int i2, boolean z) {
        if (i2 < i || i < 0 || i2 > this.f4306b) {
            throw new IllegalArgumentException();
        } else if (i2 == i) {
            return true;
        } else {
            int i3 = i2 - 1;
            int i4 = i / 32;
            int i5 = i3 / 32;
            int i6 = i4;
            while (i6 <= i5) {
                int i7 = 31;
                int i8 = i6 > i4 ? 0 : i & 31;
                if (i6 >= i5) {
                    i7 = 31 & i3;
                }
                int i9 = (2 << i7) - (1 << i8);
                int i10 = this.f4305a[i6] & i9;
                if (!z) {
                    i9 = 0;
                }
                if (i10 != i9) {
                    return false;
                }
                i6++;
            }
            return true;
        }
    }

    /* renamed from: q */
    public void mo19484q() {
        int[] iArr = new int[this.f4305a.length];
        int i = (this.f4306b - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = (long) this.f4305a[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & 65535) << 16) | ((j5 >> 16) & 65535));
        }
        int i4 = this.f4306b;
        int i5 = i2 << 5;
        if (i4 != i5) {
            int i6 = i5 - i4;
            int i7 = iArr[0] >>> i6;
            for (int i8 = 1; i8 < i2; i8++) {
                int i9 = iArr[i8];
                iArr[i8 - 1] = i7 | (i9 << (32 - i6));
                i7 = i9 >>> i6;
            }
            iArr[i2 - 1] = i7;
        }
        this.f4305a = iArr;
    }

    /* renamed from: r */
    public void mo19485r(int i) {
        int[] iArr = this.f4305a;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* renamed from: s */
    public void mo19486s(int i, int i2) {
        this.f4305a[i / 32] = i2;
    }

    /* renamed from: t */
    public void mo19487t(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < 8; i6++) {
                if (mo19476f(i)) {
                    i5 |= 1 << (7 - i6);
                }
                i++;
            }
            bArr[i2 + i4] = (byte) i5;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.f4306b);
        for (int i = 0; i < this.f4306b; i++) {
            if ((i & 7) == 0) {
                sb.append(' ');
            }
            sb.append(mo19476f(i) ? 'X' : FilenameUtils.EXTENSION_SEPARATOR);
        }
        return sb.toString();
    }

    /* renamed from: u */
    public void mo19489u(C2548a aVar) {
        if (this.f4306b == aVar.f4306b) {
            int i = 0;
            while (true) {
                int[] iArr = this.f4305a;
                if (i < iArr.length) {
                    iArr[i] = iArr[i] ^ aVar.f4305a[i];
                    i++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Sizes don't match");
        }
    }
}
