package androidx.constraintlayout.solver.widgets;

public class Rectangle {
    public int height;
    public int width;

    /* renamed from: x */
    public int f19x;

    /* renamed from: y */
    public int f20y;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r3 = r2.f20y;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean contains(int r3, int r4) {
        /*
            r2 = this;
            int r0 = r2.f19x
            if (r3 < r0) goto L_0x0014
            int r1 = r2.width
            int r0 = r0 + r1
            if (r3 >= r0) goto L_0x0014
            int r3 = r2.f20y
            if (r4 < r3) goto L_0x0014
            int r0 = r2.height
            int r3 = r3 + r0
            if (r4 >= r3) goto L_0x0014
            r3 = 1
            goto L_0x0015
        L_0x0014:
            r3 = 0
        L_0x0015:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.Rectangle.contains(int, int):boolean");
    }

    public int getCenterX() {
        return (this.f19x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.f20y + this.height) / 2;
    }

    /* access modifiers changed from: package-private */
    public void grow(int i, int i2) {
        this.f19x -= i;
        this.f20y -= i2;
        this.width += i * 2;
        this.height += i2 * 2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r0 = r3.f20y;
        r1 = r4.f20y;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean intersects(androidx.constraintlayout.solver.widgets.Rectangle r4) {
        /*
            r3 = this;
            int r0 = r3.f19x
            int r1 = r4.f19x
            if (r0 < r1) goto L_0x0018
            int r2 = r4.width
            int r1 = r1 + r2
            if (r0 >= r1) goto L_0x0018
            int r0 = r3.f20y
            int r1 = r4.f20y
            if (r0 < r1) goto L_0x0018
            int r4 = r4.height
            int r1 = r1 + r4
            if (r0 >= r1) goto L_0x0018
            r4 = 1
            goto L_0x0019
        L_0x0018:
            r4 = 0
        L_0x0019:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.Rectangle.intersects(androidx.constraintlayout.solver.widgets.Rectangle):boolean");
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        this.f19x = i;
        this.f20y = i2;
        this.width = i3;
        this.height = i4;
    }
}
