package com.google.zxing.oned.rss.expanded.decoders;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.zxing.FormatException;
import com.google.zxing.common.C2548a;
import org.apache.commons.p194io.FilenameUtils;
import org.apache.commons.p194io.IOUtils;

/* renamed from: com.google.zxing.oned.rss.expanded.decoders.r */
final class C2602r {

    /* renamed from: a */
    private final C2548a f4423a;

    /* renamed from: b */
    private final CurrentParsingState f4424b = new CurrentParsingState();

    /* renamed from: c */
    private final StringBuilder f4425c = new StringBuilder();

    C2602r(C2548a aVar) {
        this.f4423a = aVar;
    }

    /* renamed from: b */
    private C2597m m7132b(int i) {
        char c;
        int f = mo19596f(i, 5);
        if (f == 15) {
            return new C2597m(i + 5, '$');
        }
        if (f >= 5 && f < 15) {
            return new C2597m(i + 5, (char) ((f + 48) - 5));
        }
        int f2 = mo19596f(i, 6);
        if (f2 >= 32 && f2 < 58) {
            return new C2597m(i + 6, (char) (f2 + 33));
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
        return new C2597m(i + 6, c);
    }

    /* renamed from: d */
    private C2597m m7133d(int i) {
        char c;
        int f = mo19596f(i, 5);
        if (f == 15) {
            return new C2597m(i + 5, '$');
        }
        if (f >= 5 && f < 15) {
            return new C2597m(i + 5, (char) ((f + 48) - 5));
        }
        int f2 = mo19596f(i, 7);
        if (f2 >= 64 && f2 < 90) {
            return new C2597m(i + 7, (char) (f2 + 1));
        }
        if (f2 >= 90 && f2 < 116) {
            return new C2597m(i + 7, (char) (f2 + 7));
        }
        switch (mo19596f(i, 8)) {
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
                throw FormatException.getFormatInstance();
        }
        return new C2597m(i + 8, c);
    }

    /* renamed from: e */
    private C2599o m7134e(int i) {
        int i2 = i + 7;
        if (i2 > this.f4423a.mo19481j()) {
            int f = mo19596f(i, 4);
            return f == 0 ? new C2599o(this.f4423a.mo19481j(), 10, 10) : new C2599o(this.f4423a.mo19481j(), f - 1, 10);
        }
        int f2 = mo19596f(i, 7) - 8;
        return new C2599o(i2, f2 / 11, f2 % 11);
    }

    /* renamed from: g */
    static int m7135g(C2548a aVar, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (aVar.mo19476f(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    /* renamed from: h */
    private boolean m7136h(int i) {
        int i2 = i + 3;
        if (i2 > this.f4423a.mo19481j()) {
            return false;
        }
        while (i < i2) {
            if (this.f4423a.mo19476f(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m7137i(int i) {
        int i2;
        if (i + 1 > this.f4423a.mo19481j()) {
            return false;
        }
        int i3 = 0;
        while (i3 < 5 && (i2 = i3 + i) < this.f4423a.mo19481j()) {
            if (i3 == 2) {
                if (!this.f4423a.mo19476f(i + 2)) {
                    return false;
                }
            } else if (this.f4423a.mo19476f(i2)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    /* renamed from: j */
    private boolean m7138j(int i) {
        int i2;
        if (i + 1 > this.f4423a.mo19481j()) {
            return false;
        }
        int i3 = 0;
        while (i3 < 4 && (i2 = i3 + i) < this.f4423a.mo19481j()) {
            if (this.f4423a.mo19476f(i2)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        r6 = mo19596f(r6, 6);
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m7139k(int r6) {
        /*
            r5 = this;
            int r0 = r6 + 5
            com.google.zxing.common.a r1 = r5.f4423a
            int r1 = r1.mo19481j()
            r2 = 0
            if (r0 <= r1) goto L_0x000c
            return r2
        L_0x000c:
            r0 = 5
            int r1 = r5.mo19596f(r6, r0)
            r3 = 1
            r4 = 16
            if (r1 < r0) goto L_0x0019
            if (r1 >= r4) goto L_0x0019
            return r3
        L_0x0019:
            int r0 = r6 + 6
            com.google.zxing.common.a r1 = r5.f4423a
            int r1 = r1.mo19481j()
            if (r0 <= r1) goto L_0x0024
            return r2
        L_0x0024:
            r0 = 6
            int r6 = r5.mo19596f(r6, r0)
            if (r6 < r4) goto L_0x0030
            r0 = 63
            if (r6 >= r0) goto L_0x0030
            return r3
        L_0x0030:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.rss.expanded.decoders.C2602r.m7139k(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        r5 = mo19596f(r5, 8);
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m7140l(int r5) {
        /*
            r4 = this;
            int r0 = r5 + 5
            com.google.zxing.common.a r1 = r4.f4423a
            int r1 = r1.mo19481j()
            r2 = 0
            if (r0 <= r1) goto L_0x000c
            return r2
        L_0x000c:
            r0 = 5
            int r1 = r4.mo19596f(r5, r0)
            r3 = 1
            if (r1 < r0) goto L_0x0019
            r0 = 16
            if (r1 >= r0) goto L_0x0019
            return r3
        L_0x0019:
            int r0 = r5 + 7
            com.google.zxing.common.a r1 = r4.f4423a
            int r1 = r1.mo19481j()
            if (r0 <= r1) goto L_0x0024
            return r2
        L_0x0024:
            r0 = 7
            int r0 = r4.mo19596f(r5, r0)
            r1 = 64
            if (r0 < r1) goto L_0x0032
            r1 = 116(0x74, float:1.63E-43)
            if (r0 >= r1) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r5 + 8
            com.google.zxing.common.a r1 = r4.f4423a
            int r1 = r1.mo19481j()
            if (r0 <= r1) goto L_0x003d
            return r2
        L_0x003d:
            r0 = 8
            int r5 = r4.mo19596f(r5, r0)
            r0 = 232(0xe8, float:3.25E-43)
            if (r5 < r0) goto L_0x004c
            r0 = 253(0xfd, float:3.55E-43)
            if (r5 >= r0) goto L_0x004c
            return r3
        L_0x004c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.rss.expanded.decoders.C2602r.m7140l(int):boolean");
    }

    /* renamed from: m */
    private boolean m7141m(int i) {
        if (i + 7 > this.f4423a.mo19481j()) {
            return i + 4 <= this.f4423a.mo19481j();
        }
        int i2 = i;
        while (true) {
            int i3 = i + 3;
            if (i2 >= i3) {
                return this.f4423a.mo19476f(i3);
            }
            if (this.f4423a.mo19476f(i2)) {
                return true;
            }
            i2++;
        }
    }

    /* renamed from: n */
    private C2596l m7142n() {
        while (m7139k(this.f4424b.mo19566a())) {
            C2597m b = m7132b(this.f4424b.mo19566a());
            this.f4424b.mo19573h(b.mo19593a());
            if (b.mo19585c()) {
                return new C2596l(new C2598n(this.f4424b.mo19566a(), this.f4425c.toString()), true);
            }
            this.f4425c.append(b.mo19584b());
        }
        if (m7136h(this.f4424b.mo19566a())) {
            this.f4424b.mo19567b(3);
            this.f4424b.mo19572g();
        } else if (m7137i(this.f4424b.mo19566a())) {
            if (this.f4424b.mo19566a() + 5 < this.f4423a.mo19481j()) {
                this.f4424b.mo19567b(5);
            } else {
                this.f4424b.mo19573h(this.f4423a.mo19481j());
            }
            this.f4424b.mo19571f();
        }
        return new C2596l(false);
    }

    /* renamed from: o */
    private C2598n m7143o() {
        C2596l n;
        boolean b;
        do {
            int a = this.f4424b.mo19566a();
            n = this.f4424b.mo19568c() ? m7142n() : this.f4424b.mo19569d() ? m7144p() : m7145q();
            b = n.mo19583b();
            if (!(a != this.f4424b.mo19566a()) && !b) {
                break;
            }
        } while (!b);
        return n.mo19582a();
    }

    /* renamed from: p */
    private C2596l m7144p() {
        while (m7140l(this.f4424b.mo19566a())) {
            C2597m d = m7133d(this.f4424b.mo19566a());
            this.f4424b.mo19573h(d.mo19593a());
            if (d.mo19585c()) {
                return new C2596l(new C2598n(this.f4424b.mo19566a(), this.f4425c.toString()), true);
            }
            this.f4425c.append(d.mo19584b());
        }
        if (m7136h(this.f4424b.mo19566a())) {
            this.f4424b.mo19567b(3);
            this.f4424b.mo19572g();
        } else if (m7137i(this.f4424b.mo19566a())) {
            if (this.f4424b.mo19566a() + 5 < this.f4423a.mo19481j()) {
                this.f4424b.mo19567b(5);
            } else {
                this.f4424b.mo19573h(this.f4423a.mo19481j());
            }
            this.f4424b.mo19570e();
        }
        return new C2596l(false);
    }

    /* renamed from: q */
    private C2596l m7145q() {
        while (m7141m(this.f4424b.mo19566a())) {
            C2599o e = m7134e(this.f4424b.mo19566a());
            this.f4424b.mo19573h(e.mo19593a());
            if (e.mo19591d()) {
                return new C2596l(e.mo19592e() ? new C2598n(this.f4424b.mo19566a(), this.f4425c.toString()) : new C2598n(this.f4424b.mo19566a(), this.f4425c.toString(), e.mo19590c()), true);
            }
            this.f4425c.append(e.mo19589b());
            if (e.mo19592e()) {
                return new C2596l(new C2598n(this.f4424b.mo19566a(), this.f4425c.toString()), true);
            }
            this.f4425c.append(e.mo19590c());
        }
        if (m7138j(this.f4424b.mo19566a())) {
            this.f4424b.mo19570e();
            this.f4424b.mo19567b(4);
        }
        return new C2596l(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo19594a(StringBuilder sb, int i) {
        String str = null;
        while (true) {
            C2598n c = mo19595c(i, str);
            String a = C2601q.m7129a(c.mo19586b());
            if (a != null) {
                sb.append(a);
            }
            String valueOf = c.mo19588d() ? String.valueOf(c.mo19587c()) : null;
            if (i == c.mo19593a()) {
                return sb.toString();
            }
            i = c.mo19593a();
            str = valueOf;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C2598n mo19595c(int i, String str) {
        this.f4425c.setLength(0);
        if (str != null) {
            this.f4425c.append(str);
        }
        this.f4424b.mo19573h(i);
        C2598n o = m7143o();
        return (o == null || !o.mo19588d()) ? new C2598n(this.f4424b.mo19566a(), this.f4425c.toString()) : new C2598n(this.f4424b.mo19566a(), this.f4425c.toString(), o.mo19587c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo19596f(int i, int i2) {
        return m7135g(this.f4423a, i, i2);
    }
}
