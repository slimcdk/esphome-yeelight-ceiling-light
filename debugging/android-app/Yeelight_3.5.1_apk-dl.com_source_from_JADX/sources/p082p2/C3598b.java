package p082p2;

import java.lang.reflect.Array;

/* renamed from: p2.b */
public final class C3598b {

    /* renamed from: a */
    private final byte[][] f6000a;

    /* renamed from: b */
    private final int f6001b;

    /* renamed from: c */
    private final int f6002c;

    public C3598b(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = i;
        iArr[0] = i2;
        this.f6000a = (byte[][]) Array.newInstance(byte.class, iArr);
        this.f6001b = i;
        this.f6002c = i2;
    }

    /* renamed from: a */
    public void mo25898a(byte b) {
        for (int i = 0; i < this.f6002c; i++) {
            for (int i2 = 0; i2 < this.f6001b; i2++) {
                this.f6000a[i][i2] = b;
            }
        }
    }

    /* renamed from: b */
    public byte mo25899b(int i, int i2) {
        return this.f6000a[i2][i];
    }

    /* renamed from: c */
    public byte[][] mo25900c() {
        return this.f6000a;
    }

    /* renamed from: d */
    public int mo25901d() {
        return this.f6002c;
    }

    /* renamed from: e */
    public int mo25902e() {
        return this.f6001b;
    }

    /* renamed from: f */
    public void mo25903f(int i, int i2, int i3) {
        this.f6000a[i2][i] = (byte) i3;
    }

    /* renamed from: g */
    public void mo25904g(int i, int i2, boolean z) {
        this.f6000a[i2][i] = z ? (byte) 1 : 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f6001b * 2 * this.f6002c) + 2);
        for (int i = 0; i < this.f6002c; i++) {
            for (int i2 = 0; i2 < this.f6001b; i2++) {
                byte b = this.f6000a[i][i2];
                sb.append(b != 0 ? b != 1 ? "  " : " 1" : " 0");
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
