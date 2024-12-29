package p013c;

/* renamed from: c.a */
public class C0610a extends C0611b {

    /* renamed from: a */
    private double[] f229a;

    /* renamed from: b */
    private int f230b;

    public C0610a(int i) {
        this.f230b = i;
        double[] dArr = this.f229a;
        if (dArr == null || dArr.length != (i * 2) + 15) {
            this.f229a = new double[((i * 2) + 15)];
        }
        mo11027h(i, this.f229a);
    }

    /* renamed from: j */
    public void mo11019j(double[] dArr) {
        int length = dArr.length;
        int i = this.f230b;
        if (length == i) {
            mo11025f(i, dArr, this.f229a);
            return;
        }
        throw new IllegalArgumentException("The length of data can not match that of the wavetable");
    }
}
