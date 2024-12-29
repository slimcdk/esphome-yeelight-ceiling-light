package p232y3;

/* renamed from: y3.e */
public class C12041e {

    /* renamed from: a */
    private boolean f22083a;

    /* renamed from: b */
    private int f22084b;

    /* renamed from: c */
    private int f22085c;

    public C12041e(int i, int i2) {
        this.f22084b = i;
        this.f22085c = i2;
        this.f22083a = i2 > 0;
    }

    /* renamed from: a */
    public int mo42677a() {
        return this.f22085c;
    }

    /* renamed from: b */
    public int mo42678b() {
        return this.f22084b;
    }

    /* renamed from: c */
    public boolean mo42679c() {
        return this.f22083a;
    }

    /* renamed from: d */
    public boolean mo42680d(boolean z) {
        boolean z2 = this.f22083a != z;
        this.f22083a = z;
        return z2;
    }

    /* renamed from: e */
    public boolean mo42681e(int i) {
        boolean z = this.f22083a;
        int i2 = this.f22085c;
        this.f22085c = i;
        boolean z2 = i > 0;
        this.f22083a = z2;
        return (z2 == z && i == i2) ? false : true;
    }

    /* renamed from: f */
    public boolean mo42682f(int i) {
        int i2 = this.f22084b;
        this.f22084b = i;
        return i != i2;
    }
}
