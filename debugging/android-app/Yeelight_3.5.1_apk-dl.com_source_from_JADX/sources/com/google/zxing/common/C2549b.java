package com.google.zxing.common;

import java.util.Arrays;
import org.apache.commons.p194io.IOUtils;

/* renamed from: com.google.zxing.common.b */
public final class C2549b implements Cloneable {

    /* renamed from: a */
    private final int f4307a;

    /* renamed from: b */
    private final int f4308b;

    /* renamed from: c */
    private final int f4309c;

    /* renamed from: d */
    private final int[] f4310d;

    public C2549b(int i) {
        this(i, i);
    }

    public C2549b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f4307a = i;
        this.f4308b = i2;
        int i3 = (i + 31) / 32;
        this.f4309c = i3;
        this.f4310d = new int[(i3 * i2)];
    }

    private C2549b(int i, int i2, int i3, int[] iArr) {
        this.f4307a = i;
        this.f4308b = i2;
        this.f4309c = i3;
        this.f4310d = iArr;
    }

    /* renamed from: a */
    private String m6920a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f4308b * (this.f4307a + 1));
        for (int i = 0; i < this.f4308b; i++) {
            for (int i2 = 0; i2 < this.f4307a; i2++) {
                sb.append(mo19493d(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public C2549b clone() {
        return new C2549b(this.f4307a, this.f4308b, this.f4309c, (int[]) this.f4310d.clone());
    }

    /* renamed from: c */
    public void mo19491c(int i, int i2) {
        int i3 = (i2 * this.f4309c) + (i / 32);
        int[] iArr = this.f4310d;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    /* renamed from: d */
    public boolean mo19493d(int i, int i2) {
        return ((this.f4310d[(i2 * this.f4309c) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    /* renamed from: e */
    public int[] mo19494e() {
        int length = this.f4310d.length - 1;
        while (length >= 0 && this.f4310d[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.f4309c;
        int i2 = length / i;
        int i3 = (length % i) << 5;
        int i4 = 31;
        while ((this.f4310d[length] >>> i4) == 0) {
            i4--;
        }
        return new int[]{i3 + i4, i2};
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2549b)) {
            return false;
        }
        C2549b bVar = (C2549b) obj;
        return this.f4307a == bVar.f4307a && this.f4308b == bVar.f4308b && this.f4309c == bVar.f4309c && Arrays.equals(this.f4310d, bVar.f4310d);
    }

    /* renamed from: f */
    public int[] mo19496f() {
        int i = this.f4307a;
        int i2 = this.f4308b;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < this.f4308b; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.f4309c;
                if (i6 >= i7) {
                    break;
                }
                int i8 = this.f4310d[(i7 * i5) + i6];
                if (i8 != 0) {
                    if (i5 < i2) {
                        i2 = i5;
                    }
                    if (i5 > i4) {
                        i4 = i5;
                    }
                    int i9 = i6 << 5;
                    if (i9 < i) {
                        int i10 = 0;
                        while ((i8 << (31 - i10)) == 0) {
                            i10++;
                        }
                        int i11 = i10 + i9;
                        if (i11 < i) {
                            i = i11;
                        }
                    }
                    if (i9 + 31 > i3) {
                        int i12 = 31;
                        while ((i8 >>> i12) == 0) {
                            i12--;
                        }
                        int i13 = i9 + i12;
                        if (i13 > i3) {
                            i3 = i13;
                        }
                    }
                }
                i6++;
            }
        }
        if (i3 < i || i4 < i2) {
            return null;
        }
        return new int[]{i, i2, (i3 - i) + 1, (i4 - i2) + 1};
    }

    /* renamed from: g */
    public int mo19497g() {
        return this.f4308b;
    }

    /* renamed from: h */
    public C2548a mo19498h(int i, C2548a aVar) {
        if (aVar == null || aVar.mo19481j() < this.f4307a) {
            aVar = new C2548a(this.f4307a);
        } else {
            aVar.clear();
        }
        int i2 = i * this.f4309c;
        for (int i3 = 0; i3 < this.f4309c; i3++) {
            aVar.mo19486s(i3 << 5, this.f4310d[i2 + i3]);
        }
        return aVar;
    }

    public int hashCode() {
        int i = this.f4307a;
        return (((((((i * 31) + i) * 31) + this.f4308b) * 31) + this.f4309c) * 31) + Arrays.hashCode(this.f4310d);
    }

    /* renamed from: i */
    public int[] mo19500i() {
        int[] iArr;
        int i = 0;
        while (true) {
            iArr = this.f4310d;
            if (i < iArr.length && iArr[i] == 0) {
                i++;
            }
        }
        if (i == iArr.length) {
            return null;
        }
        int i2 = this.f4309c;
        int i3 = i / i2;
        int i4 = (i % i2) << 5;
        int i5 = iArr[i];
        int i6 = 0;
        while ((i5 << (31 - i6)) == 0) {
            i6++;
        }
        return new int[]{i4 + i6, i3};
    }

    /* renamed from: j */
    public int mo19501j() {
        return this.f4307a;
    }

    /* renamed from: k */
    public void mo19502k() {
        int j = mo19501j();
        int g = mo19497g();
        C2548a aVar = new C2548a(j);
        C2548a aVar2 = new C2548a(j);
        for (int i = 0; i < (g + 1) / 2; i++) {
            aVar = mo19498h(i, aVar);
            int i2 = (g - 1) - i;
            aVar2 = mo19498h(i2, aVar2);
            aVar.mo19484q();
            aVar2.mo19484q();
            mo19505q(i, aVar2);
            mo19505q(i2, aVar);
        }
    }

    /* renamed from: o */
    public void mo19503o(int i, int i2) {
        int i3 = (i2 * this.f4309c) + (i / 32);
        int[] iArr = this.f4310d;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    /* renamed from: p */
    public void mo19504p(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.f4308b || i5 > this.f4307a) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.f4309c * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.f4310d;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    /* renamed from: q */
    public void mo19505q(int i, C2548a aVar) {
        int[] g = aVar.mo19477g();
        int[] iArr = this.f4310d;
        int i2 = this.f4309c;
        System.arraycopy(g, 0, iArr, i * i2, i2);
    }

    /* renamed from: r */
    public String mo19506r(String str, String str2) {
        return m6920a(str, str2, IOUtils.LINE_SEPARATOR_UNIX);
    }

    public String toString() {
        return mo19506r("X ", "  ");
    }
}
