package p011c.p012a.p053e.p073y.p074b;

import androidx.appcompat.widget.ActivityChooserView;

/* renamed from: c.a.e.y.b.g */
final class C0959g {

    /* renamed from: c */
    private static final int[][] f1109c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a */
    private final C0958f f1110a;

    /* renamed from: b */
    private final byte f1111b;

    private C0959g(int i) {
        this.f1110a = C0958f.m1731a((i >> 3) & 3);
        this.f1111b = (byte) (i & 7);
    }

    /* renamed from: a */
    static C0959g m1733a(int i, int i2) {
        C0959g b = m1734b(i, i2);
        return b != null ? b : m1734b(i ^ 21522, i2 ^ 21522);
    }

    /* renamed from: b */
    private static C0959g m1734b(int i, int i2) {
        int e;
        int i3 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int i4 = 0;
        for (int[] iArr : f1109c) {
            int i5 = iArr[0];
            if (i5 == i || i5 == i2) {
                return new C0959g(iArr[1]);
            }
            int e2 = m1735e(i, i5);
            if (e2 < i3) {
                i4 = iArr[1];
                i3 = e2;
            }
            if (i != i2 && (e = m1735e(i2, i5)) < i3) {
                i4 = iArr[1];
                i3 = e;
            }
        }
        if (i3 <= 3) {
            return new C0959g(i4);
        }
        return null;
    }

    /* renamed from: e */
    static int m1735e(int i, int i2) {
        return Integer.bitCount(i ^ i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public byte mo9312c() {
        return this.f1111b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0958f mo9313d() {
        return this.f1110a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0959g)) {
            return false;
        }
        C0959g gVar = (C0959g) obj;
        return this.f1110a == gVar.f1110a && this.f1111b == gVar.f1111b;
    }

    public int hashCode() {
        return (this.f1110a.ordinal() << 3) | this.f1111b;
    }
}
