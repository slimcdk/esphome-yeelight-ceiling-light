package p011c.p012a.p053e.p057t;

import java.util.Arrays;
import org.apache.commons.p271io.FilenameUtils;

/* renamed from: c.a.e.t.a */
public final class C0839a implements Cloneable {

    /* renamed from: a */
    private int[] f771a;

    /* renamed from: b */
    private int f772b;

    public C0839a() {
        this.f772b = 0;
        this.f771a = new int[1];
    }

    public C0839a(int i) {
        this.f772b = i;
        this.f771a = m1183q(i);
    }

    C0839a(int[] iArr, int i) {
        this.f771a = iArr;
        this.f772b = i;
    }

    /* renamed from: e */
    private void m1182e(int i) {
        if (i > (this.f771a.length << 5)) {
            int[] q = m1183q(i);
            int[] iArr = this.f771a;
            System.arraycopy(iArr, 0, q, 0, iArr.length);
            this.f771a = q;
        }
    }

    /* renamed from: q */
    private static int[] m1183q(int i) {
        return new int[((i + 31) / 32)];
    }

    /* renamed from: a */
    public void mo9035a(boolean z) {
        m1182e(this.f772b + 1);
        if (z) {
            int[] iArr = this.f771a;
            int i = this.f772b;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f772b++;
    }

    /* renamed from: b */
    public void mo9036b(C0839a aVar) {
        int i = aVar.f772b;
        m1182e(this.f772b + i);
        for (int i2 = 0; i2 < i; i2++) {
            mo9035a(aVar.mo9042f(i2));
        }
    }

    /* renamed from: c */
    public void mo9037c(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        m1182e(this.f772b + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            mo9035a(z);
            i2--;
        }
    }

    public void clear() {
        int length = this.f771a.length;
        for (int i = 0; i < length; i++) {
            this.f771a[i] = 0;
        }
    }

    /* renamed from: d */
    public C0839a clone() {
        return new C0839a((int[]) this.f771a.clone(), this.f772b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0839a)) {
            return false;
        }
        C0839a aVar = (C0839a) obj;
        return this.f772b == aVar.f772b && Arrays.equals(this.f771a, aVar.f771a);
    }

    /* renamed from: f */
    public boolean mo9042f(int i) {
        return ((1 << (i & 31)) & this.f771a[i / 32]) != 0;
    }

    public int hashCode() {
        return (this.f772b * 31) + Arrays.hashCode(this.f771a);
    }

    /* renamed from: j */
    public int[] mo9044j() {
        return this.f771a;
    }

    /* renamed from: k */
    public int mo9045k(int i) {
        int i2 = this.f772b;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (((1 << (i & 31)) - 1) ^ -1) & this.f771a[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f771a;
            if (i3 == iArr.length) {
                return this.f772b;
            }
            i4 = iArr[i3];
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f772b;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    /* renamed from: l */
    public int mo9046l(int i) {
        int i2 = this.f772b;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (((1 << (i & 31)) - 1) ^ -1) & (this.f771a[i3] ^ -1);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f771a;
            if (i3 == iArr.length) {
                return this.f772b;
            }
            i4 = iArr[i3] ^ -1;
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f772b;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    /* renamed from: m */
    public int mo9047m() {
        return this.f772b;
    }

    /* renamed from: o */
    public int mo9048o() {
        return (this.f772b + 7) / 8;
    }

    /* renamed from: p */
    public boolean mo9049p(int i, int i2, boolean z) {
        if (i2 < i || i < 0 || i2 > this.f772b) {
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
                int i10 = this.f771a[i6] & i9;
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

    /* renamed from: r */
    public void mo9050r() {
        int[] iArr = new int[this.f771a.length];
        int i = (this.f772b - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = (long) this.f771a[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & 65535) << 16) | ((j5 >> 16) & 65535));
        }
        int i4 = this.f772b;
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
        this.f771a = iArr;
    }

    /* renamed from: s */
    public void mo9051s(int i) {
        int[] iArr = this.f771a;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* renamed from: t */
    public void mo9052t(int i, int i2) {
        this.f771a[i / 32] = i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.f772b);
        for (int i = 0; i < this.f772b; i++) {
            if ((i & 7) == 0) {
                sb.append(' ');
            }
            sb.append(mo9042f(i) ? 'X' : FilenameUtils.EXTENSION_SEPARATOR);
        }
        return sb.toString();
    }

    /* renamed from: u */
    public void mo9054u(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < 8; i6++) {
                if (mo9042f(i)) {
                    i5 |= 1 << (7 - i6);
                }
                i++;
            }
            bArr[i2 + i4] = (byte) i5;
        }
    }

    /* renamed from: v */
    public void mo9055v(C0839a aVar) {
        if (this.f772b == aVar.f772b) {
            int i = 0;
            while (true) {
                int[] iArr = this.f771a;
                if (i < iArr.length) {
                    iArr[i] = iArr[i] ^ aVar.f771a[i];
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
