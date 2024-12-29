package p011c.p012a.p053e.p073y.p076d;

import java.lang.reflect.Array;

/* renamed from: c.a.e.y.d.b */
public final class C0975b {

    /* renamed from: a */
    private final byte[][] f1162a;

    /* renamed from: b */
    private final int f1163b;

    /* renamed from: c */
    private final int f1164c;

    public C0975b(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = i;
        iArr[0] = i2;
        this.f1162a = (byte[][]) Array.newInstance(byte.class, iArr);
        this.f1163b = i;
        this.f1164c = i2;
    }

    /* renamed from: a */
    public void mo9354a(byte b) {
        for (int i = 0; i < this.f1164c; i++) {
            for (int i2 = 0; i2 < this.f1163b; i2++) {
                this.f1162a[i][i2] = b;
            }
        }
    }

    /* renamed from: b */
    public byte mo9355b(int i, int i2) {
        return this.f1162a[i2][i];
    }

    /* renamed from: c */
    public byte[][] mo9356c() {
        return this.f1162a;
    }

    /* renamed from: d */
    public int mo9357d() {
        return this.f1164c;
    }

    /* renamed from: e */
    public int mo9358e() {
        return this.f1163b;
    }

    /* renamed from: f */
    public void mo9359f(int i, int i2, int i3) {
        this.f1162a[i2][i] = (byte) i3;
    }

    /* renamed from: g */
    public void mo9360g(int i, int i2, boolean z) {
        this.f1162a[i2][i] = z ? (byte) 1 : 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f1163b * 2 * this.f1164c) + 2);
        for (int i = 0; i < this.f1164c; i++) {
            for (int i2 = 0; i2 < this.f1163b; i2++) {
                byte b = this.f1162a[i][i2];
                sb.append(b != 0 ? b != 1 ? "  " : " 1" : " 0");
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
