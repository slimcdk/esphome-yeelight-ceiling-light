package p011c.p012a.p053e.p065w.p066r.p067g.p068e;

import androidx.recyclerview.widget.ItemTouchHelper;
import org.apache.commons.p271io.FilenameUtils;
import org.apache.commons.p271io.IOUtils;
import p011c.p012a.p053e.C0820g;
import p011c.p012a.p053e.p057t.C0839a;

/* renamed from: c.a.e.w.r.g.e.s */
final class C0923s {

    /* renamed from: a */
    private final C0839a f1021a;

    /* renamed from: b */
    private final C0916m f1022b = new C0916m();

    /* renamed from: c */
    private final StringBuilder f1023c = new StringBuilder();

    C0923s(C0839a aVar) {
        this.f1021a = aVar;
    }

    /* renamed from: b */
    private C0918n m1541b(int i) {
        char c;
        int f = mo9224f(i, 5);
        if (f == 15) {
            return new C0918n(i + 5, '$');
        }
        if (f >= 5 && f < 15) {
            return new C0918n(i + 5, (char) ((f + 48) - 5));
        }
        int f2 = mo9224f(i, 6);
        if (f2 >= 32 && f2 < 58) {
            return new C0918n(i + 6, (char) (f2 + 33));
        }
        switch (f2) {
            case 58:
                c = '*';
                break;
            case 59:
                c = ',';
                break;
            case 60:
                c = '-';
                break;
            case 61:
                c = FilenameUtils.EXTENSION_SEPARATOR;
                break;
            case 62:
                c = IOUtils.DIR_SEPARATOR_UNIX;
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: " + f2);
        }
        return new C0918n(i + 6, c);
    }

    /* renamed from: d */
    private C0918n m1542d(int i) {
        char c;
        int f = mo9224f(i, 5);
        if (f == 15) {
            return new C0918n(i + 5, '$');
        }
        if (f >= 5 && f < 15) {
            return new C0918n(i + 5, (char) ((f + 48) - 5));
        }
        int f2 = mo9224f(i, 7);
        if (f2 >= 64 && f2 < 90) {
            return new C0918n(i + 7, (char) (f2 + 1));
        }
        if (f2 >= 90 && f2 < 116) {
            return new C0918n(i + 7, (char) (f2 + 7));
        }
        switch (mo9224f(i, 8)) {
            case 232:
                c = '!';
                break;
            case 233:
                c = '\"';
                break;
            case 234:
                c = '%';
                break;
            case 235:
                c = '&';
                break;
            case 236:
                c = '\'';
                break;
            case 237:
                c = '(';
                break;
            case 238:
                c = ')';
                break;
            case 239:
                c = '*';
                break;
            case 240:
                c = '+';
                break;
            case 241:
                c = ',';
                break;
            case 242:
                c = '-';
                break;
            case 243:
                c = FilenameUtils.EXTENSION_SEPARATOR;
                break;
            case 244:
                c = IOUtils.DIR_SEPARATOR_UNIX;
                break;
            case 245:
                c = ':';
                break;
            case 246:
                c = ';';
                break;
            case 247:
                c = '<';
                break;
            case 248:
                c = '=';
                break;
            case 249:
                c = '>';
                break;
            case ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION:
                c = '?';
                break;
            case 251:
                c = '_';
                break;
            case 252:
                c = ' ';
                break;
            default:
                throw C0820g.m1114a();
        }
        return new C0918n(i + 8, c);
    }

    /* renamed from: e */
    private C0920p m1543e(int i) {
        int i2 = i + 7;
        if (i2 > this.f1021a.mo9047m()) {
            int f = mo9224f(i, 4);
            return f == 0 ? new C0920p(this.f1021a.mo9047m(), 10, 10) : new C0920p(this.f1021a.mo9047m(), f - 1, 10);
        }
        int f2 = mo9224f(i, 7) - 8;
        return new C0920p(i2, f2 / 11, f2 % 11);
    }

    /* renamed from: g */
    static int m1544g(C0839a aVar, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (aVar.mo9042f(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    /* renamed from: h */
    private boolean m1545h(int i) {
        int i2 = i + 3;
        if (i2 > this.f1021a.mo9047m()) {
            return false;
        }
        while (i < i2) {
            if (this.f1021a.mo9042f(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m1546i(int i) {
        int i2;
        if (i + 1 > this.f1021a.mo9047m()) {
            return false;
        }
        int i3 = 0;
        while (i3 < 5 && (i2 = i3 + i) < this.f1021a.mo9047m()) {
            if (i3 == 2) {
                if (!this.f1021a.mo9042f(i + 2)) {
                    return false;
                }
            } else if (this.f1021a.mo9042f(i2)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    /* renamed from: j */
    private boolean m1547j(int i) {
        int i2;
        if (i + 1 > this.f1021a.mo9047m()) {
            return false;
        }
        int i3 = 0;
        while (i3 < 4 && (i2 = i3 + i) < this.f1021a.mo9047m()) {
            if (this.f1021a.mo9042f(i2)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        r6 = mo9224f(r6, 6);
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1548k(int r6) {
        /*
            r5 = this;
            int r0 = r6 + 5
            c.a.e.t.a r1 = r5.f1021a
            int r1 = r1.mo9047m()
            r2 = 0
            if (r0 <= r1) goto L_0x000c
            return r2
        L_0x000c:
            r0 = 5
            int r1 = r5.mo9224f(r6, r0)
            r3 = 1
            r4 = 16
            if (r1 < r0) goto L_0x0019
            if (r1 >= r4) goto L_0x0019
            return r3
        L_0x0019:
            int r0 = r6 + 6
            c.a.e.t.a r1 = r5.f1021a
            int r1 = r1.mo9047m()
            if (r0 <= r1) goto L_0x0024
            return r2
        L_0x0024:
            r0 = 6
            int r6 = r5.mo9224f(r6, r0)
            if (r6 < r4) goto L_0x0030
            r0 = 63
            if (r6 >= r0) goto L_0x0030
            return r3
        L_0x0030:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p053e.p065w.p066r.p067g.p068e.C0923s.m1548k(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        r5 = mo9224f(r5, 8);
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1549l(int r5) {
        /*
            r4 = this;
            int r0 = r5 + 5
            c.a.e.t.a r1 = r4.f1021a
            int r1 = r1.mo9047m()
            r2 = 0
            if (r0 <= r1) goto L_0x000c
            return r2
        L_0x000c:
            r0 = 5
            int r1 = r4.mo9224f(r5, r0)
            r3 = 1
            if (r1 < r0) goto L_0x0019
            r0 = 16
            if (r1 >= r0) goto L_0x0019
            return r3
        L_0x0019:
            int r0 = r5 + 7
            c.a.e.t.a r1 = r4.f1021a
            int r1 = r1.mo9047m()
            if (r0 <= r1) goto L_0x0024
            return r2
        L_0x0024:
            r0 = 7
            int r0 = r4.mo9224f(r5, r0)
            r1 = 64
            if (r0 < r1) goto L_0x0032
            r1 = 116(0x74, float:1.63E-43)
            if (r0 >= r1) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r5 + 8
            c.a.e.t.a r1 = r4.f1021a
            int r1 = r1.mo9047m()
            if (r0 <= r1) goto L_0x003d
            return r2
        L_0x003d:
            r0 = 8
            int r5 = r4.mo9224f(r5, r0)
            r0 = 232(0xe8, float:3.25E-43)
            if (r5 < r0) goto L_0x004c
            r0 = 253(0xfd, float:3.55E-43)
            if (r5 >= r0) goto L_0x004c
            return r3
        L_0x004c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p053e.p065w.p066r.p067g.p068e.C0923s.m1549l(int):boolean");
    }

    /* renamed from: m */
    private boolean m1550m(int i) {
        if (i + 7 > this.f1021a.mo9047m()) {
            return i + 4 <= this.f1021a.mo9047m();
        }
        int i2 = i;
        while (true) {
            int i3 = i + 3;
            if (i2 >= i3) {
                return this.f1021a.mo9042f(i3);
            }
            if (this.f1021a.mo9042f(i2)) {
                return true;
            }
            i2++;
        }
    }

    /* renamed from: n */
    private C0915l m1551n() {
        while (m1548k(this.f1022b.mo9204a())) {
            C0918n b = m1541b(this.f1022b.mo9204a());
            this.f1022b.mo9211h(b.mo9221a());
            if (b.mo9213c()) {
                return new C0915l(new C0919o(this.f1022b.mo9204a(), this.f1023c.toString()), true);
            }
            this.f1023c.append(b.mo9212b());
        }
        if (m1545h(this.f1022b.mo9204a())) {
            this.f1022b.mo9205b(3);
            this.f1022b.mo9210g();
        } else if (m1546i(this.f1022b.mo9204a())) {
            if (this.f1022b.mo9204a() + 5 < this.f1021a.mo9047m()) {
                this.f1022b.mo9205b(5);
            } else {
                this.f1022b.mo9211h(this.f1021a.mo9047m());
            }
            this.f1022b.mo9209f();
        }
        return new C0915l(false);
    }

    /* renamed from: o */
    private C0919o m1552o() {
        C0915l n;
        boolean b;
        do {
            int a = this.f1022b.mo9204a();
            n = this.f1022b.mo9206c() ? m1551n() : this.f1022b.mo9207d() ? m1553p() : m1554q();
            b = n.mo9203b();
            if (!(a != this.f1022b.mo9204a()) && !b) {
                break;
            }
        } while (!b);
        return n.mo9202a();
    }

    /* renamed from: p */
    private C0915l m1553p() {
        while (m1549l(this.f1022b.mo9204a())) {
            C0918n d = m1542d(this.f1022b.mo9204a());
            this.f1022b.mo9211h(d.mo9221a());
            if (d.mo9213c()) {
                return new C0915l(new C0919o(this.f1022b.mo9204a(), this.f1023c.toString()), true);
            }
            this.f1023c.append(d.mo9212b());
        }
        if (m1545h(this.f1022b.mo9204a())) {
            this.f1022b.mo9205b(3);
            this.f1022b.mo9210g();
        } else if (m1546i(this.f1022b.mo9204a())) {
            if (this.f1022b.mo9204a() + 5 < this.f1021a.mo9047m()) {
                this.f1022b.mo9205b(5);
            } else {
                this.f1022b.mo9211h(this.f1021a.mo9047m());
            }
            this.f1022b.mo9208e();
        }
        return new C0915l(false);
    }

    /* renamed from: q */
    private C0915l m1554q() {
        while (m1550m(this.f1022b.mo9204a())) {
            C0920p e = m1543e(this.f1022b.mo9204a());
            this.f1022b.mo9211h(e.mo9221a());
            if (e.mo9219d()) {
                return new C0915l(e.mo9220e() ? new C0919o(this.f1022b.mo9204a(), this.f1023c.toString()) : new C0919o(this.f1022b.mo9204a(), this.f1023c.toString(), e.mo9218c()), true);
            }
            this.f1023c.append(e.mo9217b());
            if (e.mo9220e()) {
                return new C0915l(new C0919o(this.f1022b.mo9204a(), this.f1023c.toString()), true);
            }
            this.f1023c.append(e.mo9218c());
        }
        if (m1547j(this.f1022b.mo9204a())) {
            this.f1022b.mo9208e();
            this.f1022b.mo9205b(4);
        }
        return new C0915l(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo9222a(StringBuilder sb, int i) {
        String str = null;
        while (true) {
            C0919o c = mo9223c(i, str);
            String a = C0922r.m1538a(c.mo9214b());
            if (a != null) {
                sb.append(a);
            }
            String valueOf = c.mo9216d() ? String.valueOf(c.mo9215c()) : null;
            if (i == c.mo9221a()) {
                return sb.toString();
            }
            i = c.mo9221a();
            str = valueOf;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0919o mo9223c(int i, String str) {
        this.f1023c.setLength(0);
        if (str != null) {
            this.f1023c.append(str);
        }
        this.f1022b.mo9211h(i);
        C0919o o = m1552o();
        return (o == null || !o.mo9216d()) ? new C0919o(this.f1022b.mo9204a(), this.f1023c.toString()) : new C0919o(this.f1022b.mo9204a(), this.f1023c.toString(), o.mo9215c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo9224f(int i, int i2) {
        return m1544g(this.f1021a, i, i2);
    }
}
