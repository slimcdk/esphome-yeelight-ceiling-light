package com.google.zxing.qrcode.decoder;

import androidx.appcompat.widget.ActivityChooserView;
import com.google.zxing.FormatException;
import com.google.zxing.common.C2549b;
import com.miot.service.connection.wifi.step.SmartConfigStep;

/* renamed from: com.google.zxing.qrcode.decoder.g */
public final class C2627g {

    /* renamed from: e */
    private static final int[] f4476e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: f */
    private static final C2627g[] f4477f = m7270b();

    /* renamed from: a */
    private final int f4478a;

    /* renamed from: b */
    private final int[] f4479b;

    /* renamed from: c */
    private final C2629b[] f4480c;

    /* renamed from: d */
    private final int f4481d;

    /* renamed from: com.google.zxing.qrcode.decoder.g$a */
    public static final class C2628a {

        /* renamed from: a */
        private final int f4482a;

        /* renamed from: b */
        private final int f4483b;

        C2628a(int i, int i2) {
            this.f4482a = i;
            this.f4483b = i2;
        }

        /* renamed from: a */
        public int mo19670a() {
            return this.f4482a;
        }

        /* renamed from: b */
        public int mo19671b() {
            return this.f4483b;
        }
    }

    /* renamed from: com.google.zxing.qrcode.decoder.g$b */
    public static final class C2629b {

        /* renamed from: a */
        private final int f4484a;

        /* renamed from: b */
        private final C2628a[] f4485b;

        C2629b(int i, C2628a... aVarArr) {
            this.f4484a = i;
            this.f4485b = aVarArr;
        }

        /* renamed from: a */
        public C2628a[] mo19672a() {
            return this.f4485b;
        }

        /* renamed from: b */
        public int mo19673b() {
            return this.f4484a;
        }

        /* renamed from: c */
        public int mo19674c() {
            int i = 0;
            for (C2628a a : this.f4485b) {
                i += a.mo19670a();
            }
            return i;
        }

        /* renamed from: d */
        public int mo19675d() {
            return this.f4484a * mo19674c();
        }
    }

    private C2627g(int i, int[] iArr, C2629b... bVarArr) {
        this.f4478a = i;
        this.f4479b = iArr;
        this.f4480c = bVarArr;
        int b = bVarArr[0].mo19673b();
        int i2 = 0;
        for (C2628a aVar : bVarArr[0].mo19672a()) {
            i2 += aVar.mo19670a() * (aVar.mo19671b() + b);
        }
        this.f4481d = i2;
    }

    /* renamed from: b */
    private static C2627g[] m7270b() {
        return new C2627g[]{new C2627g(1, new int[0], new C2629b(7, new C2628a(1, 19)), new C2629b(10, new C2628a(1, 16)), new C2629b(13, new C2628a(1, 13)), new C2629b(17, new C2628a(1, 9))), new C2627g(2, new int[]{6, 18}, new C2629b(10, new C2628a(1, 34)), new C2629b(16, new C2628a(1, 28)), new C2629b(22, new C2628a(1, 22)), new C2629b(28, new C2628a(1, 16))), new C2627g(3, new int[]{6, 22}, new C2629b(15, new C2628a(1, 55)), new C2629b(26, new C2628a(1, 44)), new C2629b(18, new C2628a(2, 17)), new C2629b(22, new C2628a(2, 13))), new C2627g(4, new int[]{6, 26}, new C2629b(20, new C2628a(1, 80)), new C2629b(18, new C2628a(2, 32)), new C2629b(26, new C2628a(2, 24)), new C2629b(16, new C2628a(4, 9))), new C2627g(5, new int[]{6, 30}, new C2629b(26, new C2628a(1, 108)), new C2629b(24, new C2628a(2, 43)), new C2629b(18, new C2628a(2, 15), new C2628a(2, 16)), new C2629b(22, new C2628a(2, 11), new C2628a(2, 12))), new C2627g(6, new int[]{6, 34}, new C2629b(18, new C2628a(2, 68)), new C2629b(16, new C2628a(4, 27)), new C2629b(24, new C2628a(4, 19)), new C2629b(28, new C2628a(4, 15))), new C2627g(7, new int[]{6, 22, 38}, new C2629b(20, new C2628a(2, 78)), new C2629b(18, new C2628a(4, 31)), new C2629b(18, new C2628a(2, 14), new C2628a(4, 15)), new C2629b(26, new C2628a(4, 13), new C2628a(1, 14))), new C2627g(8, new int[]{6, 24, 42}, new C2629b(24, new C2628a(2, 97)), new C2629b(22, new C2628a(2, 38), new C2628a(2, 39)), new C2629b(22, new C2628a(4, 18), new C2628a(2, 19)), new C2629b(26, new C2628a(4, 14), new C2628a(2, 15))), new C2627g(9, new int[]{6, 26, 46}, new C2629b(30, new C2628a(2, 116)), new C2629b(22, new C2628a(3, 36), new C2628a(2, 37)), new C2629b(20, new C2628a(4, 16), new C2628a(4, 17)), new C2629b(24, new C2628a(4, 12), new C2628a(4, 13))), new C2627g(10, new int[]{6, 28, 50}, new C2629b(18, new C2628a(2, 68), new C2628a(2, 69)), new C2629b(26, new C2628a(4, 43), new C2628a(1, 44)), new C2629b(24, new C2628a(6, 19), new C2628a(2, 20)), new C2629b(28, new C2628a(6, 15), new C2628a(2, 16))), new C2627g(11, new int[]{6, 30, 54}, new C2629b(20, new C2628a(4, 81)), new C2629b(30, new C2628a(1, 50), new C2628a(4, 51)), new C2629b(28, new C2628a(4, 22), new C2628a(4, 23)), new C2629b(24, new C2628a(3, 12), new C2628a(8, 13))), new C2627g(12, new int[]{6, 32, 58}, new C2629b(24, new C2628a(2, 92), new C2628a(2, 93)), new C2629b(22, new C2628a(6, 36), new C2628a(2, 37)), new C2629b(26, new C2628a(4, 20), new C2628a(6, 21)), new C2629b(28, new C2628a(7, 14), new C2628a(4, 15))), new C2627g(13, new int[]{6, 34, 62}, new C2629b(26, new C2628a(4, 107)), new C2629b(22, new C2628a(8, 37), new C2628a(1, 38)), new C2629b(24, new C2628a(8, 20), new C2628a(4, 21)), new C2629b(22, new C2628a(12, 11), new C2628a(4, 12))), new C2627g(14, new int[]{6, 26, 46, 66}, new C2629b(30, new C2628a(3, 115), new C2628a(1, 116)), new C2629b(24, new C2628a(4, 40), new C2628a(5, 41)), new C2629b(20, new C2628a(11, 16), new C2628a(5, 17)), new C2629b(24, new C2628a(11, 12), new C2628a(5, 13))), new C2627g(15, new int[]{6, 26, 48, 70}, new C2629b(22, new C2628a(5, 87), new C2628a(1, 88)), new C2629b(24, new C2628a(5, 41), new C2628a(5, 42)), new C2629b(30, new C2628a(5, 24), new C2628a(7, 25)), new C2629b(24, new C2628a(11, 12), new C2628a(7, 13))), new C2627g(16, new int[]{6, 26, 50, 74}, new C2629b(24, new C2628a(5, 98), new C2628a(1, 99)), new C2629b(28, new C2628a(7, 45), new C2628a(3, 46)), new C2629b(24, new C2628a(15, 19), new C2628a(2, 20)), new C2629b(30, new C2628a(3, 15), new C2628a(13, 16))), new C2627g(17, new int[]{6, 30, 54, 78}, new C2629b(28, new C2628a(1, 107), new C2628a(5, 108)), new C2629b(28, new C2628a(10, 46), new C2628a(1, 47)), new C2629b(28, new C2628a(1, 22), new C2628a(15, 23)), new C2629b(28, new C2628a(2, 14), new C2628a(17, 15))), new C2627g(18, new int[]{6, 30, 56, 82}, new C2629b(30, new C2628a(5, 120), new C2628a(1, 121)), new C2629b(26, new C2628a(9, 43), new C2628a(4, 44)), new C2629b(28, new C2628a(17, 22), new C2628a(1, 23)), new C2629b(28, new C2628a(2, 14), new C2628a(19, 15))), new C2627g(19, new int[]{6, 30, 58, 86}, new C2629b(28, new C2628a(3, 113), new C2628a(4, 114)), new C2629b(26, new C2628a(3, 44), new C2628a(11, 45)), new C2629b(26, new C2628a(17, 21), new C2628a(4, 22)), new C2629b(26, new C2628a(9, 13), new C2628a(16, 14))), new C2627g(20, new int[]{6, 34, 62, 90}, new C2629b(28, new C2628a(3, 107), new C2628a(5, 108)), new C2629b(26, new C2628a(3, 41), new C2628a(13, 42)), new C2629b(30, new C2628a(15, 24), new C2628a(5, 25)), new C2629b(28, new C2628a(15, 15), new C2628a(10, 16))), new C2627g(21, new int[]{6, 28, 50, 72, 94}, new C2629b(28, new C2628a(4, 116), new C2628a(4, 117)), new C2629b(26, new C2628a(17, 42)), new C2629b(28, new C2628a(17, 22), new C2628a(6, 23)), new C2629b(30, new C2628a(19, 16), new C2628a(6, 17))), new C2627g(22, new int[]{6, 26, 50, 74, 98}, new C2629b(28, new C2628a(2, 111), new C2628a(7, 112)), new C2629b(28, new C2628a(17, 46)), new C2629b(30, new C2628a(7, 24), new C2628a(16, 25)), new C2629b(24, new C2628a(34, 13))), new C2627g(23, new int[]{6, 30, 54, 78, 102}, new C2629b(30, new C2628a(4, 121), new C2628a(5, 122)), new C2629b(28, new C2628a(4, 47), new C2628a(14, 48)), new C2629b(30, new C2628a(11, 24), new C2628a(14, 25)), new C2629b(30, new C2628a(16, 15), new C2628a(14, 16))), new C2627g(24, new int[]{6, 28, 54, 80, 106}, new C2629b(30, new C2628a(6, 117), new C2628a(4, 118)), new C2629b(28, new C2628a(6, 45), new C2628a(14, 46)), new C2629b(30, new C2628a(11, 24), new C2628a(16, 25)), new C2629b(30, new C2628a(30, 16), new C2628a(2, 17))), new C2627g(25, new int[]{6, 32, 58, 84, 110}, new C2629b(26, new C2628a(8, 106), new C2628a(4, 107)), new C2629b(28, new C2628a(8, 47), new C2628a(13, 48)), new C2629b(30, new C2628a(7, 24), new C2628a(22, 25)), new C2629b(30, new C2628a(22, 15), new C2628a(13, 16))), new C2627g(26, new int[]{6, 30, 58, 86, 114}, new C2629b(28, new C2628a(10, 114), new C2628a(2, 115)), new C2629b(28, new C2628a(19, 46), new C2628a(4, 47)), new C2629b(28, new C2628a(28, 22), new C2628a(6, 23)), new C2629b(30, new C2628a(33, 16), new C2628a(4, 17))), new C2627g(27, new int[]{6, 34, 62, 90, 118}, new C2629b(30, new C2628a(8, 122), new C2628a(4, 123)), new C2629b(28, new C2628a(22, 45), new C2628a(3, 46)), new C2629b(30, new C2628a(8, 23), new C2628a(26, 24)), new C2629b(30, new C2628a(12, 15), new C2628a(28, 16))), new C2627g(28, new int[]{6, 26, 50, 74, 98, 122}, new C2629b(30, new C2628a(3, 117), new C2628a(10, 118)), new C2629b(28, new C2628a(3, 45), new C2628a(23, 46)), new C2629b(30, new C2628a(4, 24), new C2628a(31, 25)), new C2629b(30, new C2628a(11, 15), new C2628a(31, 16))), new C2627g(29, new int[]{6, 30, 54, 78, 102, SmartConfigStep.MSG_RESEND_LAP_BIND_DEVICE}, new C2629b(30, new C2628a(7, 116), new C2628a(7, 117)), new C2629b(28, new C2628a(21, 45), new C2628a(7, 46)), new C2629b(30, new C2628a(1, 23), new C2628a(37, 24)), new C2629b(30, new C2628a(19, 15), new C2628a(26, 16))), new C2627g(30, new int[]{6, 26, 52, 78, 104, 130}, new C2629b(30, new C2628a(5, 115), new C2628a(10, 116)), new C2629b(28, new C2628a(19, 47), new C2628a(10, 48)), new C2629b(30, new C2628a(15, 24), new C2628a(25, 25)), new C2629b(30, new C2628a(23, 15), new C2628a(25, 16))), new C2627g(31, new int[]{6, 30, 56, 82, 108, 134}, new C2629b(30, new C2628a(13, 115), new C2628a(3, 116)), new C2629b(28, new C2628a(2, 46), new C2628a(29, 47)), new C2629b(30, new C2628a(42, 24), new C2628a(1, 25)), new C2629b(30, new C2628a(23, 15), new C2628a(28, 16))), new C2627g(32, new int[]{6, 34, 60, 86, 112, 138}, new C2629b(30, new C2628a(17, 115)), new C2629b(28, new C2628a(10, 46), new C2628a(23, 47)), new C2629b(30, new C2628a(10, 24), new C2628a(35, 25)), new C2629b(30, new C2628a(19, 15), new C2628a(35, 16))), new C2627g(33, new int[]{6, 30, 58, 86, 114, 142}, new C2629b(30, new C2628a(17, 115), new C2628a(1, 116)), new C2629b(28, new C2628a(14, 46), new C2628a(21, 47)), new C2629b(30, new C2628a(29, 24), new C2628a(19, 25)), new C2629b(30, new C2628a(11, 15), new C2628a(46, 16))), new C2627g(34, new int[]{6, 34, 62, 90, 118, 146}, new C2629b(30, new C2628a(13, 115), new C2628a(6, 116)), new C2629b(28, new C2628a(14, 46), new C2628a(23, 47)), new C2629b(30, new C2628a(44, 24), new C2628a(7, 25)), new C2629b(30, new C2628a(59, 16), new C2628a(1, 17))), new C2627g(35, new int[]{6, 30, 54, 78, 102, SmartConfigStep.MSG_RESEND_LAP_BIND_DEVICE, 150}, new C2629b(30, new C2628a(12, 121), new C2628a(7, 122)), new C2629b(28, new C2628a(12, 47), new C2628a(26, 48)), new C2629b(30, new C2628a(39, 24), new C2628a(14, 25)), new C2629b(30, new C2628a(22, 15), new C2628a(41, 16))), new C2627g(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new C2629b(30, new C2628a(6, 121), new C2628a(14, 122)), new C2629b(28, new C2628a(6, 47), new C2628a(34, 48)), new C2629b(30, new C2628a(46, 24), new C2628a(10, 25)), new C2629b(30, new C2628a(2, 15), new C2628a(64, 16))), new C2627g(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new C2629b(30, new C2628a(17, 122), new C2628a(4, 123)), new C2629b(28, new C2628a(29, 46), new C2628a(14, 47)), new C2629b(30, new C2628a(49, 24), new C2628a(10, 25)), new C2629b(30, new C2628a(24, 15), new C2628a(46, 16))), new C2627g(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new C2629b(30, new C2628a(4, 122), new C2628a(18, 123)), new C2629b(28, new C2628a(13, 46), new C2628a(32, 47)), new C2629b(30, new C2628a(48, 24), new C2628a(14, 25)), new C2629b(30, new C2628a(42, 15), new C2628a(32, 16))), new C2627g(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new C2629b(30, new C2628a(20, 117), new C2628a(4, 118)), new C2629b(28, new C2628a(40, 47), new C2628a(7, 48)), new C2629b(30, new C2628a(43, 24), new C2628a(22, 25)), new C2629b(30, new C2628a(10, 15), new C2628a(67, 16))), new C2627g(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new C2629b(30, new C2628a(19, 118), new C2628a(6, 119)), new C2629b(28, new C2628a(18, 47), new C2628a(31, 48)), new C2629b(30, new C2628a(34, 24), new C2628a(34, 25)), new C2629b(30, new C2628a(20, 15), new C2628a(61, 16)))};
    }

    /* renamed from: c */
    static C2627g m7271c(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        while (true) {
            int[] iArr = f4476e;
            if (i2 < iArr.length) {
                int i5 = iArr[i2];
                if (i5 == i) {
                    return m7273i(i2 + 7);
                }
                int e = C2625e.m7266e(i, i5);
                if (e < i4) {
                    i3 = i2 + 7;
                    i4 = e;
                }
                i2++;
            } else if (i4 <= 3) {
                return m7273i(i3);
            } else {
                return null;
            }
        }
    }

    /* renamed from: g */
    public static C2627g m7272g(int i) {
        if (i % 4 == 1) {
            try {
                return m7273i((i - 17) / 4);
            } catch (IllegalArgumentException unused) {
                throw FormatException.getFormatInstance();
            }
        } else {
            throw FormatException.getFormatInstance();
        }
    }

    /* renamed from: i */
    public static C2627g m7273i(int i) {
        if (i > 0 && i <= 40) {
            return f4477f[i - 1];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2549b mo19663a() {
        int e = mo19665e();
        C2549b bVar = new C2549b(e);
        bVar.mo19504p(0, 0, 9, 9);
        int i = e - 8;
        bVar.mo19504p(i, 0, 8, 9);
        bVar.mo19504p(0, i, 9, 8);
        int length = this.f4479b.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = this.f4479b[i2] - 2;
            for (int i4 = 0; i4 < length; i4++) {
                if (!((i2 == 0 && (i4 == 0 || i4 == length - 1)) || (i2 == length - 1 && i4 == 0))) {
                    bVar.mo19504p(this.f4479b[i4] - 2, i3, 5, 5);
                }
            }
        }
        int i5 = e - 17;
        bVar.mo19504p(6, 9, 1, i5);
        bVar.mo19504p(9, 6, i5, 1);
        if (this.f4478a > 6) {
            int i6 = e - 11;
            bVar.mo19504p(i6, 0, 3, 6);
            bVar.mo19504p(0, i6, 6, 3);
        }
        return bVar;
    }

    /* renamed from: d */
    public int[] mo19664d() {
        return this.f4479b;
    }

    /* renamed from: e */
    public int mo19665e() {
        return (this.f4478a * 4) + 17;
    }

    /* renamed from: f */
    public C2629b mo19666f(ErrorCorrectionLevel errorCorrectionLevel) {
        return this.f4480c[errorCorrectionLevel.ordinal()];
    }

    /* renamed from: h */
    public int mo19667h() {
        return this.f4481d;
    }

    /* renamed from: j */
    public int mo19668j() {
        return this.f4478a;
    }

    public String toString() {
        return String.valueOf(this.f4478a);
    }
}
