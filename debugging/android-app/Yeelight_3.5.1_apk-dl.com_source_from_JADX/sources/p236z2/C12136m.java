package p236z2;

import java.util.Arrays;

/* renamed from: z2.m */
public final class C12136m {

    /* renamed from: a */
    private int f22297a;

    /* renamed from: b */
    private int f22298b;

    /* renamed from: c */
    private int f22299c;

    /* renamed from: d */
    private final int[] f22300d = new int[10];

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo42900a() {
        this.f22299c = 0;
        this.f22298b = 0;
        this.f22297a = 0;
        Arrays.fill(this.f22300d, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo42901b(int i) {
        int i2 = mo42906g(i) ? 2 : 0;
        return mo42909j(i) ? i2 | 1 : i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo42902c(int i) {
        return this.f22300d[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo42903d() {
        if ((this.f22297a & 2) != 0) {
            return this.f22300d[1];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo42904e(int i) {
        return (this.f22297a & 128) != 0 ? this.f22300d[7] : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo42905f(int i) {
        return (this.f22297a & 32) != 0 ? this.f22300d[5] : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo42906g(int i) {
        return ((1 << i) & this.f22299c) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo42907h(int i) {
        return ((1 << i) & this.f22297a) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo42908i(C12136m mVar) {
        for (int i = 0; i < 10; i++) {
            if (mVar.mo42907h(i)) {
                mo42910k(i, mVar.mo42901b(i), mVar.mo42902c(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo42909j(int i) {
        return ((1 << i) & this.f22298b) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C12136m mo42910k(int i, int i2, int i3) {
        int[] iArr = this.f22300d;
        if (i >= iArr.length) {
            return this;
        }
        int i4 = 1 << i;
        this.f22297a |= i4;
        this.f22298b = (i2 & 1) != 0 ? this.f22298b | i4 : this.f22298b & (i4 ^ -1);
        this.f22299c = (i2 & 2) != 0 ? this.f22299c | i4 : this.f22299c & (i4 ^ -1);
        iArr[i] = i3;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo42911l() {
        return Integer.bitCount(this.f22297a);
    }
}
