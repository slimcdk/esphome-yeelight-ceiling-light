package p135c5;

import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* renamed from: c5.b */
public class C4011b {

    /* renamed from: a */
    private SparseBooleanArray f6775a = new SparseBooleanArray();

    /* renamed from: b */
    private SparseArray<Float> f6776b = new SparseArray<>();

    /* renamed from: c */
    private int f6777c;

    /* renamed from: d */
    private int f6778d;

    /* renamed from: e */
    private int f6779e;

    /* renamed from: f */
    private float f6780f;

    /* renamed from: g */
    private int f6781g;

    /* renamed from: h */
    private boolean f6782h;

    /* renamed from: i */
    private C4012a f6783i;

    /* renamed from: c5.b$a */
    public interface C4012a {
        /* renamed from: a */
        void mo26615a(int i, int i2);

        /* renamed from: b */
        void mo26616b(int i, int i2, float f, boolean z);

        /* renamed from: c */
        void mo26617c(int i, int i2);

        /* renamed from: d */
        void mo26618d(int i, int i2, float f, boolean z);
    }

    /* renamed from: a */
    private void m11656a(int i) {
        C4012a aVar = this.f6783i;
        if (aVar != null) {
            aVar.mo26615a(i, this.f6777c);
        }
        this.f6775a.put(i, true);
    }

    /* renamed from: b */
    private void m11657b(int i, float f, boolean z, boolean z2) {
        if (this.f6782h || i == this.f6778d || this.f6781g == 1 || z2) {
            C4012a aVar = this.f6783i;
            if (aVar != null) {
                aVar.mo26616b(i, this.f6777c, f, z);
            }
            this.f6776b.put(i, Float.valueOf(1.0f - f));
        }
    }

    /* renamed from: c */
    private void m11658c(int i, float f, boolean z, boolean z2) {
        if (!(this.f6782h || i == this.f6779e || this.f6781g == 1)) {
            int i2 = this.f6778d;
            if ((!(i == i2 - 1 || i == i2 + 1) || this.f6776b.get(i, Float.valueOf(0.0f)).floatValue() == 1.0f) && !z2) {
                return;
            }
        }
        C4012a aVar = this.f6783i;
        if (aVar != null) {
            aVar.mo26618d(i, this.f6777c, f, z);
        }
        this.f6776b.put(i, Float.valueOf(f));
    }

    /* renamed from: d */
    private void m11659d(int i) {
        C4012a aVar = this.f6783i;
        if (aVar != null) {
            aVar.mo26617c(i, this.f6777c);
        }
        this.f6775a.put(i, false);
    }

    /* renamed from: e */
    public int mo26606e() {
        return this.f6778d;
    }

    /* renamed from: f */
    public int mo26607f() {
        return this.f6781g;
    }

    /* renamed from: g */
    public int mo26608g() {
        return this.f6777c;
    }

    /* renamed from: h */
    public void mo26609h(int i) {
        this.f6781g = i;
    }

    /* renamed from: i */
    public void mo26610i(int i, float f, int i2) {
        boolean z;
        float f2 = ((float) i) + f;
        float f3 = this.f6780f;
        boolean z2 = f3 <= f2;
        if (this.f6781g == 0) {
            for (int i3 = 0; i3 < this.f6777c; i3++) {
                if (i3 != this.f6778d) {
                    if (!this.f6775a.get(i3)) {
                        m11656a(i3);
                    }
                    if (this.f6776b.get(i3, Float.valueOf(0.0f)).floatValue() != 1.0f) {
                        m11658c(i3, 1.0f, false, true);
                    }
                }
            }
            m11657b(this.f6778d, 1.0f, false, true);
            m11659d(this.f6778d);
        } else if (f2 != f3) {
            int i4 = i + 1;
            if (f != 0.0f || !z2) {
                z = true;
            } else {
                i4 = i - 1;
                z = false;
            }
            for (int i5 = 0; i5 < this.f6777c; i5++) {
                if (!(i5 == i || i5 == i4 || this.f6776b.get(i5, Float.valueOf(0.0f)).floatValue() == 1.0f)) {
                    m11658c(i5, 1.0f, z2, true);
                }
            }
            if (!z) {
                float f4 = 1.0f - f;
                m11658c(i4, f4, true, false);
                m11657b(i, f4, true, false);
            } else if (z2) {
                m11658c(i, f, true, false);
                m11657b(i4, f, true, false);
            } else {
                float f5 = 1.0f - f;
                m11658c(i4, f5, false, false);
                m11657b(i, f5, false, false);
            }
        } else {
            return;
        }
        this.f6780f = f2;
    }

    /* renamed from: j */
    public void mo26611j(int i) {
        this.f6779e = this.f6778d;
        this.f6778d = i;
        m11659d(i);
        for (int i2 = 0; i2 < this.f6777c; i2++) {
            if (i2 != this.f6778d && !this.f6775a.get(i2)) {
                m11656a(i2);
            }
        }
    }

    /* renamed from: k */
    public void mo26612k(C4012a aVar) {
        this.f6783i = aVar;
    }

    /* renamed from: l */
    public void mo26613l(boolean z) {
        this.f6782h = z;
    }

    /* renamed from: m */
    public void mo26614m(int i) {
        this.f6777c = i;
        this.f6775a.clear();
        this.f6776b.clear();
    }
}
