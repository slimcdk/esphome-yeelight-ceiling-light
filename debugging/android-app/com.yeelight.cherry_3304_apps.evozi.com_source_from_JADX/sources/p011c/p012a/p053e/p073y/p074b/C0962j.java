package p011c.p012a.p053e.p073y.p074b;

import androidx.appcompat.widget.ActivityChooserView;
import com.miot.service.connection.wifi.step.SmartConfigStep;
import p011c.p012a.p053e.C0820g;
import p011c.p012a.p053e.p057t.C0840b;

/* renamed from: c.a.e.y.b.j */
public final class C0962j {

    /* renamed from: e */
    private static final int[] f1126e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: f */
    private static final C0962j[] f1127f = m1742b();

    /* renamed from: a */
    private final int f1128a;

    /* renamed from: b */
    private final int[] f1129b;

    /* renamed from: c */
    private final C0964b[] f1130c;

    /* renamed from: d */
    private final int f1131d;

    /* renamed from: c.a.e.y.b.j$a */
    public static final class C0963a {

        /* renamed from: a */
        private final int f1132a;

        /* renamed from: b */
        private final int f1133b;

        C0963a(int i, int i2) {
            this.f1132a = i;
            this.f1133b = i2;
        }

        /* renamed from: a */
        public int mo9326a() {
            return this.f1132a;
        }

        /* renamed from: b */
        public int mo9327b() {
            return this.f1133b;
        }
    }

    /* renamed from: c.a.e.y.b.j$b */
    public static final class C0964b {

        /* renamed from: a */
        private final int f1134a;

        /* renamed from: b */
        private final C0963a[] f1135b;

        C0964b(int i, C0963a... aVarArr) {
            this.f1134a = i;
            this.f1135b = aVarArr;
        }

        /* renamed from: a */
        public C0963a[] mo9328a() {
            return this.f1135b;
        }

        /* renamed from: b */
        public int mo9329b() {
            return this.f1134a;
        }

        /* renamed from: c */
        public int mo9330c() {
            int i = 0;
            for (C0963a a : this.f1135b) {
                i += a.mo9326a();
            }
            return i;
        }

        /* renamed from: d */
        public int mo9331d() {
            return this.f1134a * mo9330c();
        }
    }

    private C0962j(int i, int[] iArr, C0964b... bVarArr) {
        this.f1128a = i;
        this.f1129b = iArr;
        this.f1130c = bVarArr;
        int b = bVarArr[0].mo9329b();
        int i2 = 0;
        for (C0963a aVar : bVarArr[0].mo9328a()) {
            i2 += aVar.mo9326a() * (aVar.mo9327b() + b);
        }
        this.f1131d = i2;
    }

    /* renamed from: b */
    private static C0962j[] m1742b() {
        return new C0962j[]{new C0962j(1, new int[0], new C0964b(7, new C0963a(1, 19)), new C0964b(10, new C0963a(1, 16)), new C0964b(13, new C0963a(1, 13)), new C0964b(17, new C0963a(1, 9))), new C0962j(2, new int[]{6, 18}, new C0964b(10, new C0963a(1, 34)), new C0964b(16, new C0963a(1, 28)), new C0964b(22, new C0963a(1, 22)), new C0964b(28, new C0963a(1, 16))), new C0962j(3, new int[]{6, 22}, new C0964b(15, new C0963a(1, 55)), new C0964b(26, new C0963a(1, 44)), new C0964b(18, new C0963a(2, 17)), new C0964b(22, new C0963a(2, 13))), new C0962j(4, new int[]{6, 26}, new C0964b(20, new C0963a(1, 80)), new C0964b(18, new C0963a(2, 32)), new C0964b(26, new C0963a(2, 24)), new C0964b(16, new C0963a(4, 9))), new C0962j(5, new int[]{6, 30}, new C0964b(26, new C0963a(1, 108)), new C0964b(24, new C0963a(2, 43)), new C0964b(18, new C0963a(2, 15), new C0963a(2, 16)), new C0964b(22, new C0963a(2, 11), new C0963a(2, 12))), new C0962j(6, new int[]{6, 34}, new C0964b(18, new C0963a(2, 68)), new C0964b(16, new C0963a(4, 27)), new C0964b(24, new C0963a(4, 19)), new C0964b(28, new C0963a(4, 15))), new C0962j(7, new int[]{6, 22, 38}, new C0964b(20, new C0963a(2, 78)), new C0964b(18, new C0963a(4, 31)), new C0964b(18, new C0963a(2, 14), new C0963a(4, 15)), new C0964b(26, new C0963a(4, 13), new C0963a(1, 14))), new C0962j(8, new int[]{6, 24, 42}, new C0964b(24, new C0963a(2, 97)), new C0964b(22, new C0963a(2, 38), new C0963a(2, 39)), new C0964b(22, new C0963a(4, 18), new C0963a(2, 19)), new C0964b(26, new C0963a(4, 14), new C0963a(2, 15))), new C0962j(9, new int[]{6, 26, 46}, new C0964b(30, new C0963a(2, 116)), new C0964b(22, new C0963a(3, 36), new C0963a(2, 37)), new C0964b(20, new C0963a(4, 16), new C0963a(4, 17)), new C0964b(24, new C0963a(4, 12), new C0963a(4, 13))), new C0962j(10, new int[]{6, 28, 50}, new C0964b(18, new C0963a(2, 68), new C0963a(2, 69)), new C0964b(26, new C0963a(4, 43), new C0963a(1, 44)), new C0964b(24, new C0963a(6, 19), new C0963a(2, 20)), new C0964b(28, new C0963a(6, 15), new C0963a(2, 16))), new C0962j(11, new int[]{6, 30, 54}, new C0964b(20, new C0963a(4, 81)), new C0964b(30, new C0963a(1, 50), new C0963a(4, 51)), new C0964b(28, new C0963a(4, 22), new C0963a(4, 23)), new C0964b(24, new C0963a(3, 12), new C0963a(8, 13))), new C0962j(12, new int[]{6, 32, 58}, new C0964b(24, new C0963a(2, 92), new C0963a(2, 93)), new C0964b(22, new C0963a(6, 36), new C0963a(2, 37)), new C0964b(26, new C0963a(4, 20), new C0963a(6, 21)), new C0964b(28, new C0963a(7, 14), new C0963a(4, 15))), new C0962j(13, new int[]{6, 34, 62}, new C0964b(26, new C0963a(4, 107)), new C0964b(22, new C0963a(8, 37), new C0963a(1, 38)), new C0964b(24, new C0963a(8, 20), new C0963a(4, 21)), new C0964b(22, new C0963a(12, 11), new C0963a(4, 12))), new C0962j(14, new int[]{6, 26, 46, 66}, new C0964b(30, new C0963a(3, 115), new C0963a(1, 116)), new C0964b(24, new C0963a(4, 40), new C0963a(5, 41)), new C0964b(20, new C0963a(11, 16), new C0963a(5, 17)), new C0964b(24, new C0963a(11, 12), new C0963a(5, 13))), new C0962j(15, new int[]{6, 26, 48, 70}, new C0964b(22, new C0963a(5, 87), new C0963a(1, 88)), new C0964b(24, new C0963a(5, 41), new C0963a(5, 42)), new C0964b(30, new C0963a(5, 24), new C0963a(7, 25)), new C0964b(24, new C0963a(11, 12), new C0963a(7, 13))), new C0962j(16, new int[]{6, 26, 50, 74}, new C0964b(24, new C0963a(5, 98), new C0963a(1, 99)), new C0964b(28, new C0963a(7, 45), new C0963a(3, 46)), new C0964b(24, new C0963a(15, 19), new C0963a(2, 20)), new C0964b(30, new C0963a(3, 15), new C0963a(13, 16))), new C0962j(17, new int[]{6, 30, 54, 78}, new C0964b(28, new C0963a(1, 107), new C0963a(5, 108)), new C0964b(28, new C0963a(10, 46), new C0963a(1, 47)), new C0964b(28, new C0963a(1, 22), new C0963a(15, 23)), new C0964b(28, new C0963a(2, 14), new C0963a(17, 15))), new C0962j(18, new int[]{6, 30, 56, 82}, new C0964b(30, new C0963a(5, 120), new C0963a(1, SmartConfigStep.MSG_GEN_REFRES_UI)), new C0964b(26, new C0963a(9, 43), new C0963a(4, 44)), new C0964b(28, new C0963a(17, 22), new C0963a(1, 23)), new C0964b(28, new C0963a(2, 14), new C0963a(19, 15))), new C0962j(19, new int[]{6, 30, 58, 86}, new C0964b(28, new C0963a(3, 113), new C0963a(4, 114)), new C0964b(26, new C0963a(3, 44), new C0963a(11, 45)), new C0964b(26, new C0963a(17, 21), new C0963a(4, 22)), new C0964b(26, new C0963a(9, 13), new C0963a(16, 14))), new C0962j(20, new int[]{6, 34, 62, 90}, new C0964b(28, new C0963a(3, 107), new C0963a(5, 108)), new C0964b(26, new C0963a(3, 41), new C0963a(13, 42)), new C0964b(30, new C0963a(15, 24), new C0963a(5, 25)), new C0964b(28, new C0963a(15, 15), new C0963a(10, 16))), new C0962j(21, new int[]{6, 28, 50, 72, 94}, new C0964b(28, new C0963a(4, 116), new C0963a(4, 117)), new C0964b(26, new C0963a(17, 42)), new C0964b(28, new C0963a(17, 22), new C0963a(6, 23)), new C0964b(30, new C0963a(19, 16), new C0963a(6, 17))), new C0962j(22, new int[]{6, 26, 50, 74, 98}, new C0964b(28, new C0963a(2, 111), new C0963a(7, 112)), new C0964b(28, new C0963a(17, 46)), new C0964b(30, new C0963a(7, 24), new C0963a(16, 25)), new C0964b(24, new C0963a(34, 13))), new C0962j(23, new int[]{6, 30, 54, 78, 102}, new C0964b(30, new C0963a(4, SmartConfigStep.MSG_GEN_REFRES_UI), new C0963a(5, SmartConfigStep.MSG_UPDATE_CHECKOUT)), new C0964b(28, new C0963a(4, 47), new C0963a(14, 48)), new C0964b(30, new C0963a(11, 24), new C0963a(14, 25)), new C0964b(30, new C0963a(16, 15), new C0963a(14, 16))), new C0962j(24, new int[]{6, 28, 54, 80, 106}, new C0964b(30, new C0963a(6, 117), new C0963a(4, 118)), new C0964b(28, new C0963a(6, 45), new C0963a(14, 46)), new C0964b(30, new C0963a(11, 24), new C0963a(16, 25)), new C0964b(30, new C0963a(30, 16), new C0963a(2, 17))), new C0962j(25, new int[]{6, 32, 58, 84, 110}, new C0964b(26, new C0963a(8, 106), new C0963a(4, 107)), new C0964b(28, new C0963a(8, 47), new C0963a(13, 48)), new C0964b(30, new C0963a(7, 24), new C0963a(22, 25)), new C0964b(30, new C0963a(22, 15), new C0963a(13, 16))), new C0962j(26, new int[]{6, 30, 58, 86, 114}, new C0964b(28, new C0963a(10, 114), new C0963a(2, 115)), new C0964b(28, new C0963a(19, 46), new C0963a(4, 47)), new C0964b(28, new C0963a(28, 22), new C0963a(6, 23)), new C0964b(30, new C0963a(33, 16), new C0963a(4, 17))), new C0962j(27, new int[]{6, 34, 62, 90, 118}, new C0964b(30, new C0963a(8, SmartConfigStep.MSG_UPDATE_CHECKOUT), new C0963a(4, SmartConfigStep.MSG_RECONNECT_DEVICE_AP)), new C0964b(28, new C0963a(22, 45), new C0963a(3, 46)), new C0964b(30, new C0963a(8, 23), new C0963a(26, 24)), new C0964b(30, new C0963a(12, 15), new C0963a(28, 16))), new C0962j(28, new int[]{6, 26, 50, 74, 98, SmartConfigStep.MSG_UPDATE_CHECKOUT}, new C0964b(30, new C0963a(3, 117), new C0963a(10, 118)), new C0964b(28, new C0963a(3, 45), new C0963a(23, 46)), new C0964b(30, new C0963a(4, 24), new C0963a(31, 25)), new C0964b(30, new C0963a(11, 15), new C0963a(31, 16))), new C0962j(29, new int[]{6, 30, 54, 78, 102, SmartConfigStep.MSG_RESEND_LAP_BIND_DEVICE}, new C0964b(30, new C0963a(7, 116), new C0963a(7, 117)), new C0964b(28, new C0963a(21, 45), new C0963a(7, 46)), new C0964b(30, new C0963a(1, 23), new C0963a(37, 24)), new C0964b(30, new C0963a(19, 15), new C0963a(26, 16))), new C0962j(30, new int[]{6, 26, 52, 78, 104, 130}, new C0964b(30, new C0963a(5, 115), new C0963a(10, 116)), new C0964b(28, new C0963a(19, 47), new C0963a(10, 48)), new C0964b(30, new C0963a(15, 24), new C0963a(25, 25)), new C0964b(30, new C0963a(23, 15), new C0963a(25, 16))), new C0962j(31, new int[]{6, 30, 56, 82, 108, 134}, new C0964b(30, new C0963a(13, 115), new C0963a(3, 116)), new C0964b(28, new C0963a(2, 46), new C0963a(29, 47)), new C0964b(30, new C0963a(42, 24), new C0963a(1, 25)), new C0964b(30, new C0963a(23, 15), new C0963a(28, 16))), new C0962j(32, new int[]{6, 34, 60, 86, 112, 138}, new C0964b(30, new C0963a(17, 115)), new C0964b(28, new C0963a(10, 46), new C0963a(23, 47)), new C0964b(30, new C0963a(10, 24), new C0963a(35, 25)), new C0964b(30, new C0963a(19, 15), new C0963a(35, 16))), new C0962j(33, new int[]{6, 30, 58, 86, 114, 142}, new C0964b(30, new C0963a(17, 115), new C0963a(1, 116)), new C0964b(28, new C0963a(14, 46), new C0963a(21, 47)), new C0964b(30, new C0963a(29, 24), new C0963a(19, 25)), new C0964b(30, new C0963a(11, 15), new C0963a(46, 16))), new C0962j(34, new int[]{6, 34, 62, 90, 118, 146}, new C0964b(30, new C0963a(13, 115), new C0963a(6, 116)), new C0964b(28, new C0963a(14, 46), new C0963a(23, 47)), new C0964b(30, new C0963a(44, 24), new C0963a(7, 25)), new C0964b(30, new C0963a(59, 16), new C0963a(1, 17))), new C0962j(35, new int[]{6, 30, 54, 78, 102, SmartConfigStep.MSG_RESEND_LAP_BIND_DEVICE, 150}, new C0964b(30, new C0963a(12, SmartConfigStep.MSG_GEN_REFRES_UI), new C0963a(7, SmartConfigStep.MSG_UPDATE_CHECKOUT)), new C0964b(28, new C0963a(12, 47), new C0963a(26, 48)), new C0964b(30, new C0963a(39, 24), new C0963a(14, 25)), new C0964b(30, new C0963a(22, 15), new C0963a(41, 16))), new C0962j(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new C0964b(30, new C0963a(6, SmartConfigStep.MSG_GEN_REFRES_UI), new C0963a(14, SmartConfigStep.MSG_UPDATE_CHECKOUT)), new C0964b(28, new C0963a(6, 47), new C0963a(34, 48)), new C0964b(30, new C0963a(46, 24), new C0963a(10, 25)), new C0964b(30, new C0963a(2, 15), new C0963a(64, 16))), new C0962j(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new C0964b(30, new C0963a(17, SmartConfigStep.MSG_UPDATE_CHECKOUT), new C0963a(4, SmartConfigStep.MSG_RECONNECT_DEVICE_AP)), new C0964b(28, new C0963a(29, 46), new C0963a(14, 47)), new C0964b(30, new C0963a(49, 24), new C0963a(10, 25)), new C0964b(30, new C0963a(24, 15), new C0963a(46, 16))), new C0962j(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new C0964b(30, new C0963a(4, SmartConfigStep.MSG_UPDATE_CHECKOUT), new C0963a(18, SmartConfigStep.MSG_RECONNECT_DEVICE_AP)), new C0964b(28, new C0963a(13, 46), new C0963a(32, 47)), new C0964b(30, new C0963a(48, 24), new C0963a(14, 25)), new C0964b(30, new C0963a(42, 15), new C0963a(32, 16))), new C0962j(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new C0964b(30, new C0963a(20, 117), new C0963a(4, 118)), new C0964b(28, new C0963a(40, 47), new C0963a(7, 48)), new C0964b(30, new C0963a(43, 24), new C0963a(22, 25)), new C0964b(30, new C0963a(10, 15), new C0963a(67, 16))), new C0962j(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new C0964b(30, new C0963a(19, 118), new C0963a(6, 119)), new C0964b(28, new C0963a(18, 47), new C0963a(31, 48)), new C0964b(30, new C0963a(34, 24), new C0963a(34, 25)), new C0964b(30, new C0963a(20, 15), new C0963a(61, 16)))};
    }

    /* renamed from: c */
    static C0962j m1743c(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        while (true) {
            int[] iArr = f1126e;
            if (i2 < iArr.length) {
                int i5 = iArr[i2];
                if (i5 == i) {
                    return m1745i(i2 + 7);
                }
                int e = C0959g.m1735e(i, i5);
                if (e < i4) {
                    i3 = i2 + 7;
                    i4 = e;
                }
                i2++;
            } else if (i4 <= 3) {
                return m1745i(i3);
            } else {
                return null;
            }
        }
    }

    /* renamed from: g */
    public static C0962j m1744g(int i) {
        if (i % 4 == 1) {
            try {
                return m1745i((i - 17) / 4);
            } catch (IllegalArgumentException unused) {
                throw C0820g.m1114a();
            }
        } else {
            throw C0820g.m1114a();
        }
    }

    /* renamed from: i */
    public static C0962j m1745i(int i) {
        if (i > 0 && i <= 40) {
            return f1127f[i - 1];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0840b mo9319a() {
        int e = mo9321e();
        C0840b bVar = new C0840b(e);
        bVar.mo9070q(0, 0, 9, 9);
        int i = e - 8;
        bVar.mo9070q(i, 0, 8, 9);
        bVar.mo9070q(0, i, 9, 8);
        int length = this.f1129b.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = this.f1129b[i2] - 2;
            for (int i4 = 0; i4 < length; i4++) {
                if (!((i2 == 0 && (i4 == 0 || i4 == length - 1)) || (i2 == length - 1 && i4 == 0))) {
                    bVar.mo9070q(this.f1129b[i4] - 2, i3, 5, 5);
                }
            }
        }
        int i5 = e - 17;
        bVar.mo9070q(6, 9, 1, i5);
        bVar.mo9070q(9, 6, i5, 1);
        if (this.f1128a > 6) {
            int i6 = e - 11;
            bVar.mo9070q(i6, 0, 3, 6);
            bVar.mo9070q(0, i6, 6, 3);
        }
        return bVar;
    }

    /* renamed from: d */
    public int[] mo9320d() {
        return this.f1129b;
    }

    /* renamed from: e */
    public int mo9321e() {
        return (this.f1128a * 4) + 17;
    }

    /* renamed from: f */
    public C0964b mo9322f(C0958f fVar) {
        return this.f1130c[fVar.ordinal()];
    }

    /* renamed from: h */
    public int mo9323h() {
        return this.f1131d;
    }

    /* renamed from: j */
    public int mo9324j() {
        return this.f1128a;
    }

    public String toString() {
        return String.valueOf(this.f1128a);
    }
}
