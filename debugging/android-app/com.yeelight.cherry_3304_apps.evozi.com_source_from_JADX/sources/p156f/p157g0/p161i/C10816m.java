package p156f.p157g0.p161i;

import androidx.core.internal.view.SupportMenu;
import java.util.Arrays;

/* renamed from: f.g0.i.m */
public final class C10816m {

    /* renamed from: a */
    private int f20859a;

    /* renamed from: b */
    private final int[] f20860b = new int[10];

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo34121a() {
        this.f20859a = 0;
        Arrays.fill(this.f20860b, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo34122b(int i) {
        return this.f20860b[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo34123c() {
        if ((this.f20859a & 2) != 0) {
            return this.f20860b[1];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo34124d() {
        return (this.f20859a & 128) != 0 ? this.f20860b[7] : SupportMenu.USER_MASK;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo34125e(int i) {
        return (this.f20859a & 16) != 0 ? this.f20860b[4] : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo34126f(int i) {
        return (this.f20859a & 32) != 0 ? this.f20860b[5] : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo34127g(int i) {
        return ((1 << i) & this.f20859a) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo34128h(C10816m mVar) {
        for (int i = 0; i < 10; i++) {
            if (mVar.mo34127g(i)) {
                mo34129i(i, mVar.mo34122b(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C10816m mo34129i(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f20860b;
            if (i < iArr.length) {
                this.f20859a = (1 << i) | this.f20859a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo34130j() {
        return Integer.bitCount(this.f20859a);
    }
}
