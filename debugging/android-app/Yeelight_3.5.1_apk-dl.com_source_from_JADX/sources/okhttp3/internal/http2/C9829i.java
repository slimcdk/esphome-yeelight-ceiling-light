package okhttp3.internal.http2;

import androidx.core.internal.view.SupportMenu;
import java.util.Arrays;

/* renamed from: okhttp3.internal.http2.i */
public final class C9829i {

    /* renamed from: a */
    private int f17812a;

    /* renamed from: b */
    private final int[] f17813b = new int[10];

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39066a() {
        this.f17812a = 0;
        Arrays.fill(this.f17813b, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo39067b(int i) {
        return this.f17813b[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo39068c() {
        if ((this.f17812a & 2) != 0) {
            return this.f17813b[1];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo39069d() {
        return (this.f17812a & 128) != 0 ? this.f17813b[7] : SupportMenu.USER_MASK;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo39070e(int i) {
        return (this.f17812a & 16) != 0 ? this.f17813b[4] : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo39071f(int i) {
        return (this.f17812a & 32) != 0 ? this.f17813b[5] : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo39072g(int i) {
        return ((1 << i) & this.f17812a) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo39073h(C9829i iVar) {
        for (int i = 0; i < 10; i++) {
            if (iVar.mo39072g(i)) {
                mo39074i(i, iVar.mo39067b(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C9829i mo39074i(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f17813b;
            if (i < iArr.length) {
                this.f17812a = (1 << i) | this.f17812a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo39075j() {
        return Integer.bitCount(this.f17812a);
    }
}
