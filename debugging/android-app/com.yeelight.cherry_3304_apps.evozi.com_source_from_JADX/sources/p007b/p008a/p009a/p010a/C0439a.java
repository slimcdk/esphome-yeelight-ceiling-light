package p007b.p008a.p009a.p010a;

/* renamed from: b.a.a.a.a */
public class C0439a extends C0440b {

    /* renamed from: a */
    private double[] f41a;

    /* renamed from: b */
    private int f42b;

    public C0439a(int i) {
        this.f42b = i;
        double[] dArr = this.f41a;
        if (dArr == null || dArr.length != (i * 2) + 15) {
            this.f41a = new double[((this.f42b * 2) + 15)];
        }
        mo8329h(this.f42b, this.f41a);
    }

    /* renamed from: j */
    public void mo8321j(double[] dArr) {
        int length = dArr.length;
        int i = this.f42b;
        if (length == i) {
            mo8327f(i, dArr, this.f41a);
            return;
        }
        throw new IllegalArgumentException("The length of data can not match that of the wavetable");
    }
}
