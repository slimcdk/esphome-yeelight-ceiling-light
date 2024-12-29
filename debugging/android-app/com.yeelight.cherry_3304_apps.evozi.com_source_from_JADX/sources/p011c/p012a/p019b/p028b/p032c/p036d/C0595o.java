package p011c.p012a.p019b.p028b.p032c.p036d;

/* renamed from: c.a.b.b.c.d.o */
public final class C0595o implements Cloneable {

    /* renamed from: d */
    private static final C0596p f270d = new C0596p();

    /* renamed from: a */
    private int[] f271a;

    /* renamed from: b */
    private C0596p[] f272b;

    /* renamed from: c */
    private int f273c;

    C0595o() {
        this(10);
    }

    private C0595o(int i) {
        int a = m432a(i);
        this.f271a = new int[a];
        this.f272b = new C0596p[a];
        this.f273c = 0;
    }

    /* renamed from: a */
    private static int m432a(int i) {
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        return i2 / 4;
    }

    /* renamed from: j */
    private final int m433j(int i) {
        int i2 = this.f273c - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.f271a[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }

    /* renamed from: b */
    public final boolean mo8603b() {
        return this.f273c == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo8604c() {
        return this.f273c;
    }

    public final /* synthetic */ Object clone() {
        int i = this.f273c;
        C0595o oVar = new C0595o(i);
        System.arraycopy(this.f271a, 0, oVar.f271a, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            C0596p[] pVarArr = this.f272b;
            if (pVarArr[i2] != null) {
                oVar.f272b[i2] = (C0596p) pVarArr[i2].clone();
            }
        }
        oVar.f273c = i;
        return oVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo8606d(int i, C0596p pVar) {
        int j = m433j(i);
        if (j >= 0) {
            this.f272b[j] = pVar;
            return;
        }
        int i2 = j ^ -1;
        if (i2 < this.f273c) {
            C0596p[] pVarArr = this.f272b;
            if (pVarArr[i2] == f270d) {
                this.f271a[i2] = i;
                pVarArr[i2] = pVar;
                return;
            }
        }
        int i3 = this.f273c;
        if (i3 >= this.f271a.length) {
            int a = m432a(i3 + 1);
            int[] iArr = new int[a];
            C0596p[] pVarArr2 = new C0596p[a];
            int[] iArr2 = this.f271a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            C0596p[] pVarArr3 = this.f272b;
            System.arraycopy(pVarArr3, 0, pVarArr2, 0, pVarArr3.length);
            this.f271a = iArr;
            this.f272b = pVarArr2;
        }
        int i4 = this.f273c;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f271a;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            C0596p[] pVarArr4 = this.f272b;
            System.arraycopy(pVarArr4, i2, pVarArr4, i5, this.f273c - i2);
        }
        this.f271a[i2] = i;
        this.f272b[i2] = pVar;
        this.f273c++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C0596p mo8607e(int i) {
        int j = m433j(i);
        if (j < 0) {
            return null;
        }
        C0596p[] pVarArr = this.f272b;
        if (pVarArr[j] == f270d) {
            return null;
        }
        return pVarArr[j];
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0595o)) {
            return false;
        }
        C0595o oVar = (C0595o) obj;
        int i = this.f273c;
        if (i != oVar.f273c) {
            return false;
        }
        int[] iArr = this.f271a;
        int[] iArr2 = oVar.f271a;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                z = true;
                break;
            } else if (iArr[i2] != iArr2[i2]) {
                z = false;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            C0596p[] pVarArr = this.f272b;
            C0596p[] pVarArr2 = oVar.f272b;
            int i3 = this.f273c;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!pVarArr[i4].equals(pVarArr2[i4])) {
                    z2 = false;
                    break;
                } else {
                    i4++;
                }
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C0596p mo8609f(int i) {
        return this.f272b[i];
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.f273c; i2++) {
            i = (((i * 31) + this.f271a[i2]) * 31) + this.f272b[i2].hashCode();
        }
        return i;
    }
}
