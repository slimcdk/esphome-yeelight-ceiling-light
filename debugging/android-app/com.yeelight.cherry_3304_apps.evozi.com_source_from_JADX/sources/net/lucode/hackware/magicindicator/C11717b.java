package net.lucode.hackware.magicindicator;

import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* renamed from: net.lucode.hackware.magicindicator.b */
public class C11717b {

    /* renamed from: a */
    private SparseBooleanArray f23054a = new SparseBooleanArray();

    /* renamed from: b */
    private SparseArray<Float> f23055b = new SparseArray<>();

    /* renamed from: c */
    private int f23056c;

    /* renamed from: d */
    private int f23057d;

    /* renamed from: e */
    private int f23058e;

    /* renamed from: f */
    private float f23059f;

    /* renamed from: g */
    private int f23060g;

    /* renamed from: h */
    private boolean f23061h;

    /* renamed from: i */
    private C11718a f23062i;

    /* renamed from: net.lucode.hackware.magicindicator.b$a */
    public interface C11718a {
        /* renamed from: a */
        void mo36818a(int i, int i2);

        /* renamed from: b */
        void mo36819b(int i, int i2, float f, boolean z);

        /* renamed from: c */
        void mo36820c(int i, int i2);

        /* renamed from: d */
        void mo36821d(int i, int i2, float f, boolean z);
    }

    /* renamed from: a */
    private void m30399a(int i) {
        C11718a aVar = this.f23062i;
        if (aVar != null) {
            aVar.mo36818a(i, this.f23056c);
        }
        this.f23054a.put(i, true);
    }

    /* renamed from: b */
    private void m30400b(int i, float f, boolean z, boolean z2) {
        if (this.f23061h || i == this.f23057d || this.f23060g == 1 || z2) {
            C11718a aVar = this.f23062i;
            if (aVar != null) {
                aVar.mo36819b(i, this.f23056c, f, z);
            }
            this.f23055b.put(i, Float.valueOf(1.0f - f));
        }
    }

    /* renamed from: c */
    private void m30401c(int i, float f, boolean z, boolean z2) {
        if (!(this.f23061h || i == this.f23058e || this.f23060g == 1)) {
            int i2 = this.f23057d;
            if ((!(i == i2 - 1 || i == i2 + 1) || this.f23055b.get(i, Float.valueOf(0.0f)).floatValue() == 1.0f) && !z2) {
                return;
            }
        }
        C11718a aVar = this.f23062i;
        if (aVar != null) {
            aVar.mo36821d(i, this.f23056c, f, z);
        }
        this.f23055b.put(i, Float.valueOf(f));
    }

    /* renamed from: d */
    private void m30402d(int i) {
        C11718a aVar = this.f23062i;
        if (aVar != null) {
            aVar.mo36820c(i, this.f23056c);
        }
        this.f23054a.put(i, false);
    }

    /* renamed from: e */
    public int mo36809e() {
        return this.f23057d;
    }

    /* renamed from: f */
    public int mo36810f() {
        return this.f23060g;
    }

    /* renamed from: g */
    public int mo36811g() {
        return this.f23056c;
    }

    /* renamed from: h */
    public void mo36812h(int i) {
        this.f23060g = i;
    }

    /* renamed from: i */
    public void mo36813i(int i, float f, int i2) {
        boolean z;
        float f2 = ((float) i) + f;
        boolean z2 = this.f23059f <= f2;
        if (this.f23060g == 0) {
            for (int i3 = 0; i3 < this.f23056c; i3++) {
                if (i3 != this.f23057d) {
                    if (!this.f23054a.get(i3)) {
                        m30399a(i3);
                    }
                    if (this.f23055b.get(i3, Float.valueOf(0.0f)).floatValue() != 1.0f) {
                        m30401c(i3, 1.0f, false, true);
                    }
                }
            }
            m30400b(this.f23057d, 1.0f, false, true);
            m30402d(this.f23057d);
        } else if (f2 != this.f23059f) {
            int i4 = i + 1;
            if (f != 0.0f || !z2) {
                z = true;
            } else {
                i4 = i - 1;
                z = false;
            }
            for (int i5 = 0; i5 < this.f23056c; i5++) {
                if (!(i5 == i || i5 == i4 || this.f23055b.get(i5, Float.valueOf(0.0f)).floatValue() == 1.0f)) {
                    m30401c(i5, 1.0f, z2, true);
                }
            }
            if (!z) {
                float f3 = 1.0f - f;
                m30401c(i4, f3, true, false);
                m30400b(i, f3, true, false);
            } else if (z2) {
                m30401c(i, f, true, false);
                m30400b(i4, f, true, false);
            } else {
                float f4 = 1.0f - f;
                m30401c(i4, f4, false, false);
                m30400b(i, f4, false, false);
            }
        } else {
            return;
        }
        this.f23059f = f2;
    }

    /* renamed from: j */
    public void mo36814j(int i) {
        this.f23058e = this.f23057d;
        this.f23057d = i;
        m30402d(i);
        for (int i2 = 0; i2 < this.f23056c; i2++) {
            if (i2 != this.f23057d && !this.f23054a.get(i2)) {
                m30399a(i2);
            }
        }
    }

    /* renamed from: k */
    public void mo36815k(C11718a aVar) {
        this.f23062i = aVar;
    }

    /* renamed from: l */
    public void mo36816l(boolean z) {
        this.f23061h = z;
    }

    /* renamed from: m */
    public void mo36817m(int i) {
        this.f23056c = i;
        this.f23054a.clear();
        this.f23055b.clear();
    }
}
