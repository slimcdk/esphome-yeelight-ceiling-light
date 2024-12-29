package p164h.p211a.p212a.p216c;

import p164h.p211a.p212a.p228h.C11129m;
import p164h.p211a.p212a.p228h.C11137q;
import p164h.p211a.p212a.p228h.C11138r;
import p164h.p211a.p212a.p228h.C11139s;
import p164h.p211a.p212a.p228h.C11140t;

/* renamed from: h.a.a.c.b */
public class C10890b extends C10918r {

    /* renamed from: p */
    private final String f21082p;

    public C10890b(String str) {
        this.f21082p = str;
    }

    /* renamed from: b */
    public void mo34419b(C11129m mVar) {
        int i = this.f21253k;
        int i2 = this.f21254l;
        if (i != i2) {
            C11140t.m28947f(C11137q.m28925h(this.f21244b, i + 1, (i2 - i) - 1, this.f21082p), mVar, this.f21082p);
        }
    }

    /* renamed from: c */
    public void mo34420c(C11129m mVar, String str) {
        if (this.f21253k != this.f21254l) {
            if (str == null) {
                str = this.f21082p;
            }
            byte[] bArr = this.f21244b;
            int i = this.f21253k;
            C11140t.m28947f(C11137q.m28925h(bArr, i + 1, (this.f21254l - i) - 1, str), mVar, str);
        }
    }

    /* renamed from: d */
    public String mo34421d() {
        int i = this.f21251i;
        int i2 = this.f21255m;
        if (i == i2) {
            return null;
        }
        return C11137q.m28925h(this.f21244b, i, i2 - i, this.f21082p);
    }

    /* renamed from: e */
    public String mo34422e() {
        int i = this.f21251i;
        int i2 = this.f21252j;
        if (i == i2) {
            return null;
        }
        return C11139s.m28939e(this.f21244b, i, i2 - i);
    }

    /* renamed from: g */
    public String mo34423g() {
        int i = this.f21254l;
        int i2 = this.f21255m;
        if (i == i2) {
            return null;
        }
        return C11137q.m28925h(this.f21244b, i + 1, (i2 - i) - 1, this.f21082p);
    }

    /* renamed from: h */
    public String mo34424h() {
        int i = this.f21248f;
        int i2 = this.f21249g;
        if (i == i2) {
            return null;
        }
        return C11137q.m28925h(this.f21244b, i, i2 - i, this.f21082p);
    }

    /* renamed from: i */
    public String mo34425i() {
        int i = this.f21251i;
        int i2 = this.f21252j;
        if (i == i2) {
            return null;
        }
        return C11137q.m28925h(this.f21244b, i, i2 - i, this.f21082p);
    }

    /* renamed from: j */
    public String mo34426j() {
        int i = this.f21251i;
        int i2 = this.f21253k;
        if (i == i2) {
            return null;
        }
        return C11137q.m28925h(this.f21244b, i, i2 - i, this.f21082p);
    }

    /* renamed from: k */
    public int mo34427k() {
        int i = this.f21249g;
        int i2 = this.f21251i;
        if (i == i2) {
            return -1;
        }
        return C11138r.m28930d(this.f21244b, i + 1, (i2 - i) - 1, 10);
    }

    /* renamed from: l */
    public String mo34428l() {
        int i = this.f21253k;
        int i2 = this.f21254l;
        if (i == i2) {
            return null;
        }
        return C11137q.m28925h(this.f21244b, i + 1, (i2 - i) - 1, this.f21082p);
    }

    /* renamed from: n */
    public String mo34429n() {
        int i = this.f21246d;
        int i2 = this.f21247e;
        if (i == i2) {
            return null;
        }
        int i3 = i2 - i;
        if (i3 == 5) {
            byte[] bArr = this.f21244b;
            if (bArr[i] == 104 && bArr[i + 1] == 116 && bArr[i + 2] == 116 && bArr[i + 3] == 112) {
                return "http";
            }
        }
        if (i3 == 6) {
            byte[] bArr2 = this.f21244b;
            int i4 = this.f21246d;
            if (bArr2[i4] == 104 && bArr2[i4 + 1] == 116 && bArr2[i4 + 2] == 116 && bArr2[i4 + 3] == 112 && bArr2[i4 + 4] == 115) {
                return "https";
            }
        }
        byte[] bArr3 = this.f21244b;
        int i5 = this.f21246d;
        return C11137q.m28925h(bArr3, i5, (this.f21247e - i5) - 1, this.f21082p);
    }

    /* renamed from: o */
    public boolean mo34430o() {
        return this.f21254l > this.f21253k;
    }

    public String toString() {
        if (this.f21245c == null) {
            byte[] bArr = this.f21244b;
            int i = this.f21246d;
            this.f21245c = C11137q.m28925h(bArr, i, this.f21255m - i, this.f21082p);
        }
        return this.f21245c;
    }
}
