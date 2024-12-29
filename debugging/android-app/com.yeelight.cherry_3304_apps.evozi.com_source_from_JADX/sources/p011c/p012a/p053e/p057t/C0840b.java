package p011c.p012a.p053e.p057t;

import java.util.Arrays;
import org.apache.commons.p271io.IOUtils;

/* renamed from: c.a.e.t.b */
public final class C0840b implements Cloneable {

    /* renamed from: a */
    private final int f773a;

    /* renamed from: b */
    private final int f774b;

    /* renamed from: c */
    private final int f775c;

    /* renamed from: d */
    private final int[] f776d;

    public C0840b(int i) {
        this(i, i);
    }

    public C0840b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f773a = i;
        this.f774b = i2;
        int i3 = (i + 31) / 32;
        this.f775c = i3;
        this.f776d = new int[(i3 * i2)];
    }

    private C0840b(int i, int i2, int i3, int[] iArr) {
        this.f773a = i;
        this.f774b = i2;
        this.f775c = i3;
        this.f776d = iArr;
    }

    /* renamed from: a */
    private String m1200a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f774b * (this.f773a + 1));
        for (int i = 0; i < this.f774b; i++) {
            for (int i2 = 0; i2 < this.f773a; i2++) {
                sb.append(mo9059d(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public C0840b clone() {
        return new C0840b(this.f773a, this.f774b, this.f775c, (int[]) this.f776d.clone());
    }

    /* renamed from: c */
    public void mo9057c(int i, int i2) {
        int i3 = (i2 * this.f775c) + (i / 32);
        int[] iArr = this.f776d;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    /* renamed from: d */
    public boolean mo9059d(int i, int i2) {
        return ((this.f776d[(i2 * this.f775c) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    /* renamed from: e */
    public int[] mo9060e() {
        int length = this.f776d.length - 1;
        while (length >= 0 && this.f776d[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.f775c;
        int i2 = length / i;
        int i3 = (length % i) << 5;
        int i4 = 31;
        while ((this.f776d[length] >>> i4) == 0) {
            i4--;
        }
        return new int[]{i3 + i4, i2};
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0840b)) {
            return false;
        }
        C0840b bVar = (C0840b) obj;
        return this.f773a == bVar.f773a && this.f774b == bVar.f774b && this.f775c == bVar.f775c && Arrays.equals(this.f776d, bVar.f776d);
    }

    /* renamed from: f */
    public int[] mo9062f() {
        int i = this.f773a;
        int i2 = this.f774b;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < this.f774b; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.f775c;
                if (i6 >= i7) {
                    break;
                }
                int i8 = this.f776d[(i7 * i5) + i6];
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

    public int hashCode() {
        int i = this.f773a;
        return (((((((i * 31) + i) * 31) + this.f774b) * 31) + this.f775c) * 31) + Arrays.hashCode(this.f776d);
    }

    /* renamed from: j */
    public int mo9064j() {
        return this.f774b;
    }

    /* renamed from: k */
    public C0839a mo9065k(int i, C0839a aVar) {
        if (aVar == null || aVar.mo9047m() < this.f773a) {
            aVar = new C0839a(this.f773a);
        } else {
            aVar.clear();
        }
        int i2 = i * this.f775c;
        for (int i3 = 0; i3 < this.f775c; i3++) {
            aVar.mo9052t(i3 << 5, this.f776d[i2 + i3]);
        }
        return aVar;
    }

    /* renamed from: l */
    public int[] mo9066l() {
        int i = 0;
        while (true) {
            int[] iArr = this.f776d;
            if (i >= iArr.length || iArr[i] != 0) {
                int[] iArr2 = this.f776d;
            } else {
                i++;
            }
        }
        int[] iArr22 = this.f776d;
        if (i == iArr22.length) {
            return null;
        }
        int i2 = this.f775c;
        int i3 = i / i2;
        int i4 = (i % i2) << 5;
        int i5 = iArr22[i];
        int i6 = 0;
        while ((i5 << (31 - i6)) == 0) {
            i6++;
        }
        return new int[]{i4 + i6, i3};
    }

    /* renamed from: m */
    public int mo9067m() {
        return this.f773a;
    }

    /* renamed from: o */
    public void mo9068o() {
        int m = mo9067m();
        int j = mo9064j();
        C0839a aVar = new C0839a(m);
        C0839a aVar2 = new C0839a(m);
        for (int i = 0; i < (j + 1) / 2; i++) {
            aVar = mo9065k(i, aVar);
            int i2 = (j - 1) - i;
            aVar2 = mo9065k(i2, aVar2);
            aVar.mo9050r();
            aVar2.mo9050r();
            mo9071r(i, aVar2);
            mo9071r(i2, aVar);
        }
    }

    /* renamed from: p */
    public void mo9069p(int i, int i2) {
        int i3 = (i2 * this.f775c) + (i / 32);
        int[] iArr = this.f776d;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    /* renamed from: q */
    public void mo9070q(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.f774b || i5 > this.f773a) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.f775c * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.f776d;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    /* renamed from: r */
    public void mo9071r(int i, C0839a aVar) {
        int[] j = aVar.mo9044j();
        int[] iArr = this.f776d;
        int i2 = this.f775c;
        System.arraycopy(j, 0, iArr, i * i2, i2);
    }

    /* renamed from: s */
    public String mo9072s(String str, String str2) {
        return m1200a(str, str2, IOUtils.LINE_SEPARATOR_UNIX);
    }

    public String toString() {
        return mo9072s("X ", "  ");
    }
}
