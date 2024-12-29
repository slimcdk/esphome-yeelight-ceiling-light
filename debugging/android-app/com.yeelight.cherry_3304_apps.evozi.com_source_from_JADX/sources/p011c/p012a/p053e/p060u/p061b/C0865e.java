package p011c.p012a.p053e.p060u.p061b;

import com.miot.bluetooth.BluetoothConstants;
import p011c.p012a.p053e.C0820g;

/* renamed from: c.a.e.u.b.e */
public final class C0865e {

    /* renamed from: h */
    private static final C0865e[] f887h = m1320a();

    /* renamed from: a */
    private final int f888a;

    /* renamed from: b */
    private final int f889b;

    /* renamed from: c */
    private final int f890c;

    /* renamed from: d */
    private final int f891d;

    /* renamed from: e */
    private final int f892e;

    /* renamed from: f */
    private final C0868c f893f;

    /* renamed from: g */
    private final int f894g;

    /* renamed from: c.a.e.u.b.e$b */
    static final class C0867b {

        /* renamed from: a */
        private final int f895a;

        /* renamed from: b */
        private final int f896b;

        private C0867b(int i, int i2) {
            this.f895a = i;
            this.f896b = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo9136a() {
            return this.f895a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo9137b() {
            return this.f896b;
        }
    }

    /* renamed from: c.a.e.u.b.e$c */
    static final class C0868c {

        /* renamed from: a */
        private final int f897a;

        /* renamed from: b */
        private final C0867b[] f898b;

        private C0868c(int i, C0867b bVar) {
            this.f897a = i;
            this.f898b = new C0867b[]{bVar};
        }

        private C0868c(int i, C0867b bVar, C0867b bVar2) {
            this.f897a = i;
            this.f898b = new C0867b[]{bVar, bVar2};
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0867b[] mo9138a() {
            return this.f898b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo9139b() {
            return this.f897a;
        }
    }

    private C0865e(int i, int i2, int i3, int i4, int i5, C0868c cVar) {
        this.f888a = i;
        this.f889b = i2;
        this.f890c = i3;
        this.f891d = i4;
        this.f892e = i5;
        this.f893f = cVar;
        int b = cVar.mo9139b();
        int i6 = 0;
        for (C0867b bVar : cVar.mo9138a()) {
            i6 += bVar.mo9136a() * (bVar.mo9137b() + b);
        }
        this.f894g = i6;
    }

    /* renamed from: a */
    private static C0865e[] m1320a() {
        return new C0865e[]{new C0865e(1, 10, 10, 8, 8, new C0868c(5, new C0867b(1, 3))), new C0865e(2, 12, 12, 10, 10, new C0868c(7, new C0867b(1, 5))), new C0865e(3, 14, 14, 12, 12, new C0868c(10, new C0867b(1, 8))), new C0865e(4, 16, 16, 14, 14, new C0868c(12, new C0867b(1, 12))), new C0865e(5, 18, 18, 16, 16, new C0868c(14, new C0867b(1, 18))), new C0865e(6, 20, 20, 18, 18, new C0868c(18, new C0867b(1, 22))), new C0865e(7, 22, 22, 20, 20, new C0868c(20, new C0867b(1, 30))), new C0865e(8, 24, 24, 22, 22, new C0868c(24, new C0867b(1, 36))), new C0865e(9, 26, 26, 24, 24, new C0868c(28, new C0867b(1, 44))), new C0865e(10, 32, 32, 14, 14, new C0868c(36, new C0867b(1, 62))), new C0865e(11, 36, 36, 16, 16, new C0868c(42, new C0867b(1, 86))), new C0865e(12, 40, 40, 18, 18, new C0868c(48, new C0867b(1, 114))), new C0865e(13, 44, 44, 20, 20, new C0868c(56, new C0867b(1, BluetoothConstants.MSG_READ_RSSI))), new C0865e(14, 48, 48, 22, 22, new C0868c(68, new C0867b(1, 174))), new C0865e(15, 52, 52, 24, 24, new C0868c(42, new C0867b(2, 102))), new C0865e(16, 64, 64, 14, 14, new C0868c(56, new C0867b(2, 140))), new C0865e(17, 72, 72, 16, 16, new C0868c(36, new C0867b(4, 92))), new C0865e(18, 80, 80, 18, 18, new C0868c(48, new C0867b(4, 114))), new C0865e(19, 88, 88, 20, 20, new C0868c(56, new C0867b(4, BluetoothConstants.MSG_READ_RSSI))), new C0865e(20, 96, 96, 22, 22, new C0868c(68, new C0867b(4, 174))), new C0865e(21, 104, 104, 24, 24, new C0868c(56, new C0867b(6, 136))), new C0865e(22, 120, 120, 18, 18, new C0868c(68, new C0867b(6, 175))), new C0865e(23, 132, 132, 20, 20, new C0868c(62, new C0867b(8, 163))), new C0865e(24, BluetoothConstants.MSG_READ_RSSI, BluetoothConstants.MSG_READ_RSSI, 22, 22, new C0868c(62, new C0867b(8, 156), new C0867b(2, 155))), new C0865e(25, 8, 18, 6, 16, new C0868c(7, new C0867b(1, 5))), new C0865e(26, 8, 32, 6, 14, new C0868c(11, new C0867b(1, 10))), new C0865e(27, 12, 26, 10, 24, new C0868c(14, new C0867b(1, 16))), new C0865e(28, 12, 36, 10, 16, new C0868c(18, new C0867b(1, 22))), new C0865e(29, 16, 36, 14, 16, new C0868c(24, new C0867b(1, 32))), new C0865e(30, 16, 48, 14, 22, new C0868c(28, new C0867b(1, 49)))};
    }

    /* renamed from: h */
    public static C0865e m1321h(int i, int i2) {
        if ((i & 1) == 0 && (i2 & 1) == 0) {
            for (C0865e eVar : f887h) {
                if (eVar.f889b == i && eVar.f890c == i2) {
                    return eVar;
                }
            }
            throw C0820g.m1114a();
        }
        throw C0820g.m1114a();
    }

    /* renamed from: b */
    public int mo9128b() {
        return this.f892e;
    }

    /* renamed from: c */
    public int mo9129c() {
        return this.f891d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0868c mo9130d() {
        return this.f893f;
    }

    /* renamed from: e */
    public int mo9131e() {
        return this.f890c;
    }

    /* renamed from: f */
    public int mo9132f() {
        return this.f889b;
    }

    /* renamed from: g */
    public int mo9133g() {
        return this.f894g;
    }

    /* renamed from: i */
    public int mo9134i() {
        return this.f888a;
    }

    public String toString() {
        return String.valueOf(this.f888a);
    }
}
