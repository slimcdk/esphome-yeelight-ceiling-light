package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;
import com.miot.bluetooth.BluetoothConstants;

/* renamed from: com.google.zxing.datamatrix.decoder.d */
public final class C2555d {

    /* renamed from: h */
    private static final C2555d[] f4325h = m6963a();

    /* renamed from: a */
    private final int f4326a;

    /* renamed from: b */
    private final int f4327b;

    /* renamed from: c */
    private final int f4328c;

    /* renamed from: d */
    private final int f4329d;

    /* renamed from: e */
    private final int f4330e;

    /* renamed from: f */
    private final C2558c f4331f;

    /* renamed from: g */
    private final int f4332g;

    /* renamed from: com.google.zxing.datamatrix.decoder.d$b */
    static final class C2557b {

        /* renamed from: a */
        private final int f4333a;

        /* renamed from: b */
        private final int f4334b;

        private C2557b(int i, int i2) {
            this.f4333a = i;
            this.f4334b = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo19523a() {
            return this.f4333a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo19524b() {
            return this.f4334b;
        }
    }

    /* renamed from: com.google.zxing.datamatrix.decoder.d$c */
    static final class C2558c {

        /* renamed from: a */
        private final int f4335a;

        /* renamed from: b */
        private final C2557b[] f4336b;

        private C2558c(int i, C2557b bVar) {
            this.f4335a = i;
            this.f4336b = new C2557b[]{bVar};
        }

        private C2558c(int i, C2557b bVar, C2557b bVar2) {
            this.f4335a = i;
            this.f4336b = new C2557b[]{bVar, bVar2};
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2557b[] mo19525a() {
            return this.f4336b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo19526b() {
            return this.f4335a;
        }
    }

    private C2555d(int i, int i2, int i3, int i4, int i5, C2558c cVar) {
        this.f4326a = i;
        this.f4327b = i2;
        this.f4328c = i3;
        this.f4329d = i4;
        this.f4330e = i5;
        this.f4331f = cVar;
        int b = cVar.mo19526b();
        int i6 = 0;
        for (C2557b bVar : cVar.mo19525a()) {
            i6 += bVar.mo19523a() * (bVar.mo19524b() + b);
        }
        this.f4332g = i6;
    }

    /* renamed from: a */
    private static C2555d[] m6963a() {
        return new C2555d[]{new C2555d(1, 10, 10, 8, 8, new C2558c(5, new C2557b(1, 3))), new C2555d(2, 12, 12, 10, 10, new C2558c(7, new C2557b(1, 5))), new C2555d(3, 14, 14, 12, 12, new C2558c(10, new C2557b(1, 8))), new C2555d(4, 16, 16, 14, 14, new C2558c(12, new C2557b(1, 12))), new C2555d(5, 18, 18, 16, 16, new C2558c(14, new C2557b(1, 18))), new C2555d(6, 20, 20, 18, 18, new C2558c(18, new C2557b(1, 22))), new C2555d(7, 22, 22, 20, 20, new C2558c(20, new C2557b(1, 30))), new C2555d(8, 24, 24, 22, 22, new C2558c(24, new C2557b(1, 36))), new C2555d(9, 26, 26, 24, 24, new C2558c(28, new C2557b(1, 44))), new C2555d(10, 32, 32, 14, 14, new C2558c(36, new C2557b(1, 62))), new C2555d(11, 36, 36, 16, 16, new C2558c(42, new C2557b(1, 86))), new C2555d(12, 40, 40, 18, 18, new C2558c(48, new C2557b(1, 114))), new C2555d(13, 44, 44, 20, 20, new C2558c(56, new C2557b(1, BluetoothConstants.MSG_READ_RSSI))), new C2555d(14, 48, 48, 22, 22, new C2558c(68, new C2557b(1, 174))), new C2555d(15, 52, 52, 24, 24, new C2558c(42, new C2557b(2, 102))), new C2555d(16, 64, 64, 14, 14, new C2558c(56, new C2557b(2, 140))), new C2555d(17, 72, 72, 16, 16, new C2558c(36, new C2557b(4, 92))), new C2555d(18, 80, 80, 18, 18, new C2558c(48, new C2557b(4, 114))), new C2555d(19, 88, 88, 20, 20, new C2558c(56, new C2557b(4, BluetoothConstants.MSG_READ_RSSI))), new C2555d(20, 96, 96, 22, 22, new C2558c(68, new C2557b(4, 174))), new C2555d(21, 104, 104, 24, 24, new C2558c(56, new C2557b(6, 136))), new C2555d(22, 120, 120, 18, 18, new C2558c(68, new C2557b(6, 175))), new C2555d(23, 132, 132, 20, 20, new C2558c(62, new C2557b(8, 163))), new C2555d(24, BluetoothConstants.MSG_READ_RSSI, BluetoothConstants.MSG_READ_RSSI, 22, 22, new C2558c(62, new C2557b(8, 156), new C2557b(2, 155))), new C2555d(25, 8, 18, 6, 16, new C2558c(7, new C2557b(1, 5))), new C2555d(26, 8, 32, 6, 14, new C2558c(11, new C2557b(1, 10))), new C2555d(27, 12, 26, 10, 24, new C2558c(14, new C2557b(1, 16))), new C2555d(28, 12, 36, 10, 16, new C2558c(18, new C2557b(1, 22))), new C2555d(29, 16, 36, 14, 16, new C2558c(24, new C2557b(1, 32))), new C2555d(30, 16, 48, 14, 22, new C2558c(28, new C2557b(1, 49)))};
    }

    /* renamed from: h */
    public static C2555d m6964h(int i, int i2) {
        if ((i & 1) == 0 && (i2 & 1) == 0) {
            for (C2555d dVar : f4325h) {
                if (dVar.f4327b == i && dVar.f4328c == i2) {
                    return dVar;
                }
            }
            throw FormatException.getFormatInstance();
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: b */
    public int mo19515b() {
        return this.f4330e;
    }

    /* renamed from: c */
    public int mo19516c() {
        return this.f4329d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C2558c mo19517d() {
        return this.f4331f;
    }

    /* renamed from: e */
    public int mo19518e() {
        return this.f4328c;
    }

    /* renamed from: f */
    public int mo19519f() {
        return this.f4327b;
    }

    /* renamed from: g */
    public int mo19520g() {
        return this.f4332g;
    }

    /* renamed from: i */
    public int mo19521i() {
        return this.f4326a;
    }

    public String toString() {
        return String.valueOf(this.f4326a);
    }
}
