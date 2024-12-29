package p011c.p083d.p084a.p085d0.p086m;

import java.util.Arrays;

/* renamed from: c.d.a.d0.m.o */
public final class C1068o {

    /* renamed from: a */
    private int f1515a;

    /* renamed from: b */
    private int f1516b;

    /* renamed from: c */
    private int f1517c;

    /* renamed from: d */
    private final int[] f1518d = new int[10];

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9581a() {
        this.f1517c = 0;
        this.f1516b = 0;
        this.f1515a = 0;
        Arrays.fill(this.f1518d, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo9582b(int i) {
        int i2 = mo9587g(i) ? 2 : 0;
        return mo9590j(i) ? i2 | 1 : i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo9583c(int i) {
        return this.f1518d[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo9584d() {
        if ((this.f1515a & 2) != 0) {
            return this.f1518d[1];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo9585e(int i) {
        return (this.f1515a & 128) != 0 ? this.f1518d[7] : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo9586f(int i) {
        return (this.f1515a & 32) != 0 ? this.f1518d[5] : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo9587g(int i) {
        return ((1 << i) & this.f1517c) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo9588h(int i) {
        return ((1 << i) & this.f1515a) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo9589i(C1068o oVar) {
        for (int i = 0; i < 10; i++) {
            if (oVar.mo9588h(i)) {
                mo9591k(i, oVar.mo9582b(i), oVar.mo9583c(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo9590j(int i) {
        return ((1 << i) & this.f1516b) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C1068o mo9591k(int i, int i2, int i3) {
        if (i >= this.f1518d.length) {
            return this;
        }
        int i4 = 1 << i;
        this.f1515a |= i4;
        this.f1516b = (i2 & 1) != 0 ? this.f1516b | i4 : this.f1516b & (i4 ^ -1);
        this.f1517c = (i2 & 2) != 0 ? this.f1517c | i4 : this.f1517c & (i4 ^ -1);
        this.f1518d[i] = i3;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo9592l() {
        return Integer.bitCount(this.f1515a);
    }
}
