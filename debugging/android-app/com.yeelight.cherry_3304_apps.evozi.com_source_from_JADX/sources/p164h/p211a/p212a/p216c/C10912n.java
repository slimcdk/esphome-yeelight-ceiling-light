package p164h.p211a.p212a.p216c;

import java.io.IOException;
import p164h.p211a.p212a.p217d.C10929e;
import p164h.p211a.p212a.p217d.C10931f;
import p164h.p211a.p212a.p217d.C10935i;
import p164h.p211a.p212a.p217d.C10942n;
import p164h.p211a.p212a.p217d.C10943o;
import p164h.p211a.p212a.p217d.C10950t;
import p164h.p211a.p212a.p217d.p218u.C10953b;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.c.n */
public class C10912n implements C10921u {

    /* renamed from: w */
    private static final C11158c f21165w = C11156b.m29015a(C10912n.class);

    /* renamed from: a */
    private final C10913a f21166a;

    /* renamed from: b */
    private final C10935i f21167b;

    /* renamed from: c */
    private final C10942n f21168c;

    /* renamed from: d */
    private C10929e f21169d;

    /* renamed from: e */
    private C10929e f21170e;

    /* renamed from: f */
    private C10929e f21171f;

    /* renamed from: g */
    private C10931f.C10932a f21172g;

    /* renamed from: h */
    private final C10950t.C10951a f21173h;

    /* renamed from: i */
    private final C10950t.C10951a f21174i;

    /* renamed from: j */
    private String f21175j;

    /* renamed from: k */
    private int f21176k;

    /* renamed from: l */
    private boolean f21177l;

    /* renamed from: m */
    private boolean f21178m;

    /* renamed from: n */
    protected final C10950t f21179n = new C10950t();

    /* renamed from: o */
    protected int f21180o = -14;

    /* renamed from: p */
    protected byte f21181p;

    /* renamed from: q */
    protected int f21182q;

    /* renamed from: r */
    protected long f21183r;

    /* renamed from: s */
    protected long f21184s;

    /* renamed from: t */
    protected int f21185t;

    /* renamed from: u */
    protected int f21186u;

    /* renamed from: v */
    private boolean f21187v;

    /* renamed from: h.a.a.c.n$a */
    public static abstract class C10913a {
        /* renamed from: a */
        public abstract void mo34201a(C10929e eVar);

        /* renamed from: b */
        public abstract void mo34202b();

        /* renamed from: c */
        public abstract void mo34203c();

        /* renamed from: d */
        public abstract void mo34204d(long j);

        /* renamed from: e */
        public abstract void mo34205e(C10929e eVar, C10929e eVar2);

        /* renamed from: f */
        public abstract void mo34206f(C10929e eVar, C10929e eVar2, C10929e eVar3);

        /* renamed from: g */
        public abstract void mo34207g(C10929e eVar, int i, C10929e eVar2);
    }

    public C10912n(C10935i iVar, C10942n nVar, C10913a aVar) {
        this.f21167b = iVar;
        this.f21168c = nVar;
        this.f21166a = aVar;
        this.f21173h = new C10950t.C10951a();
        this.f21174i = new C10950t.C10951a();
    }

    /* renamed from: a */
    public boolean mo34513a() {
        return mo34527o(-14);
    }

    /* renamed from: b */
    public boolean mo34514b() {
        boolean z = mo34528p() > 0;
        while (!mo34517e() && (r3 = this.f21171f) != null && r3.length() > 0) {
            z |= mo34528p() > 0;
        }
        return z;
    }

    /* renamed from: c */
    public void mo34515c(boolean z) {
        this.f21178m = z;
        if (!z) {
            int i = this.f21180o;
            if (i == 0 || i == -14) {
                this.f21180o = 7;
            }
        }
    }

    /* renamed from: d */
    public void mo34516d() {
        C10929e eVar = this.f21170e;
        if (eVar != null && !eVar.mo34556F0() && this.f21170e.mo34571c0() == -1 && this.f21167b != null) {
            if (this.f21171f == this.f21170e) {
                this.f21171f = this.f21169d;
            }
            C10935i iVar = this.f21167b;
            if (iVar != null) {
                iVar.mo34627d(this.f21170e);
            }
            this.f21170e = null;
        }
        C10929e eVar2 = this.f21169d;
        if (eVar2 != null && !eVar2.mo34556F0() && this.f21169d.mo34571c0() == -1 && this.f21167b != null) {
            if (this.f21171f == this.f21169d) {
                this.f21171f = null;
            }
            this.f21167b.mo34627d(this.f21169d);
            this.f21169d = null;
        }
    }

    /* renamed from: e */
    public boolean mo34517e() {
        return mo34527o(0);
    }

    /* renamed from: f */
    public boolean mo34518f() {
        return this.f21178m;
    }

    /* renamed from: g */
    public int mo34519g() {
        C10950t tVar = this.f21179n;
        if (tVar != null && tVar.length() > 0) {
            return this.f21179n.length();
        }
        if (!this.f21168c.mo34365o()) {
            mo34528p();
            C10950t tVar2 = this.f21179n;
            if (tVar2 == null) {
                return 0;
            }
            return tVar2.length();
        } else if (this.f21180o <= 0) {
            return 0;
        } else {
            C10942n nVar = this.f21168c;
            return (!(nVar instanceof C10953b) || ((C10953b) nVar).mo34667z().available() <= 0) ? 0 : 1;
        }
    }

    /* renamed from: h */
    public C10929e mo34520h(long j) {
        if (this.f21179n.length() > 0) {
            return this.f21179n;
        }
        if (mo34524l() <= 0 || mo34527o(7)) {
            return null;
        }
        loop0:
        while (true) {
            try {
                mo34528p();
                while (this.f21179n.length() == 0 && !mo34527o(0) && !mo34527o(7) && this.f21168c != null && this.f21168c.isOpen()) {
                    if (!this.f21168c.mo34365o()) {
                        if (mo34528p() <= 0) {
                            if (!this.f21168c.mo34364n(j)) {
                                this.f21168c.close();
                                throw new C10943o("timeout");
                            }
                        }
                    }
                }
            } catch (IOException e) {
                this.f21168c.close();
                throw e;
            }
        }
        if (this.f21179n.length() > 0) {
            return this.f21179n;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo34521i() {
        C10929e eVar;
        C10929e eVar2;
        if (this.f21171f == null) {
            this.f21171f = mo34523k();
        }
        if (this.f21180o <= 0 || this.f21171f != (eVar = this.f21169d) || eVar == null || eVar.mo34556F0() || (eVar2 = this.f21170e) == null || !eVar2.mo34556F0()) {
            C10929e eVar3 = this.f21171f;
            C10929e eVar4 = this.f21169d;
            if (eVar3 == eVar4 && this.f21180o > 0 && eVar4.length() == 0 && ((this.f21177l || this.f21183r - this.f21184s > ((long) this.f21169d.capacity())) && !(this.f21170e == null && this.f21167b == null))) {
                if (this.f21170e == null) {
                    this.f21170e = this.f21167b.mo34624a();
                }
                this.f21171f = this.f21170e;
            }
            if (this.f21168c == null) {
                return -1;
            }
            if (this.f21171f == this.f21170e || this.f21180o > 0) {
                this.f21171f.mo34555D0();
            }
            if (this.f21171f.mo34558I0() == 0) {
                f21165w.mo35486b("HttpParser Full for {} ", this.f21168c);
                this.f21171f.clear();
                StringBuilder sb = new StringBuilder();
                sb.append("FULL ");
                sb.append(this.f21171f == this.f21170e ? "body" : "head");
                throw new C10896h(413, sb.toString());
            }
            try {
                return this.f21168c.mo34374w(this.f21171f);
            } catch (IOException e) {
                e = e;
                f21165w.mo35487c(e);
                if (!(e instanceof C10943o)) {
                    e = new C10943o((Throwable) e);
                }
                throw e;
            }
        } else {
            C10929e eVar5 = this.f21170e;
            this.f21171f = eVar5;
            return eVar5.length();
        }
    }

    /* renamed from: j */
    public long mo34522j() {
        return this.f21183r;
    }

    /* renamed from: k */
    public C10929e mo34523k() {
        if (this.f21169d == null) {
            C10929e c = this.f21167b.mo34626c();
            this.f21169d = c;
            this.f21173h.mo34661e(c);
            this.f21174i.mo34661e(this.f21169d);
        }
        return this.f21169d;
    }

    /* renamed from: l */
    public int mo34524l() {
        return this.f21180o;
    }

    /* renamed from: m */
    public boolean mo34525m() {
        return this.f21183r == -2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f21170e;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo34526n() {
        /*
            r1 = this;
            h.a.a.d.e r0 = r1.f21169d
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.mo34556F0()
            if (r0 != 0) goto L_0x0014
        L_0x000a:
            h.a.a.d.e r0 = r1.f21170e
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.mo34556F0()
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p216c.C10912n.mo34526n():boolean");
    }

    /* renamed from: o */
    public boolean mo34527o(int i) {
        return this.f21180o == i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01ba, code lost:
        r1.f21180o = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0352, code lost:
        if (r1.f21176k >= 200) goto L_0x0354;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x035e, code lost:
        if (r7 <= 0) goto L_0x0360;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0550, code lost:
        r1.f21175j = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x05cf, code lost:
        r1.f21180o = -9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0950, code lost:
        r3 = r1.f21171f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x012d, code lost:
        r1.f21182q = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0192, code lost:
        r1.f21180o = -5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0195, code lost:
        r1.f21180o = -2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x049d A[Catch:{ NumberFormatException -> 0x0364, h -> 0x0955 }] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x04a1 A[Catch:{ NumberFormatException -> 0x0364, h -> 0x0955 }] */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x04a7 A[Catch:{ NumberFormatException -> 0x0364, h -> 0x0955 }] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x04dd A[Catch:{ NumberFormatException -> 0x0364, h -> 0x0955 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066 A[Catch:{ h -> 0x0959 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0069 A[Catch:{ h -> 0x0959 }] */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x06ee A[Catch:{ NumberFormatException -> 0x0364, h -> 0x0955 }] */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0713 A[ADDED_TO_REGION, Catch:{ NumberFormatException -> 0x0364, h -> 0x0955 }] */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x0719 A[Catch:{ NumberFormatException -> 0x0364, h -> 0x0955 }] */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x072b A[Catch:{ NumberFormatException -> 0x0364, h -> 0x0955 }] */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x073a A[Catch:{ NumberFormatException -> 0x0364, h -> 0x0955 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c3 A[Catch:{ h -> 0x0959 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d7 A[Catch:{ h -> 0x0959 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f4 A[Catch:{ h -> 0x0959 }] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo34528p() {
        /*
            r16 = this;
            r1 = r16
            r2 = 7
            r3 = 0
            int r4 = r1.f21180o     // Catch:{ h -> 0x0959 }
            if (r4 != 0) goto L_0x0009
            return r3
        L_0x0009:
            h.a.a.d.e r4 = r1.f21171f     // Catch:{ h -> 0x0959 }
            if (r4 != 0) goto L_0x0013
            h.a.a.d.e r4 = r16.mo34523k()     // Catch:{ h -> 0x0959 }
            r1.f21171f = r4     // Catch:{ h -> 0x0959 }
        L_0x0013:
            int r4 = r1.f21180o     // Catch:{ h -> 0x0959 }
            r5 = 2
            r6 = 1
            if (r4 != r5) goto L_0x002b
            long r7 = r1.f21184s     // Catch:{ h -> 0x0959 }
            long r9 = r1.f21183r     // Catch:{ h -> 0x0959 }
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x002b
            r1.f21180o = r3     // Catch:{ h -> 0x0959 }
            h.a.a.c.n$a r4 = r1.f21166a     // Catch:{ h -> 0x0959 }
            long r7 = r1.f21184s     // Catch:{ h -> 0x0959 }
            r4.mo34204d(r7)     // Catch:{ h -> 0x0959 }
            return r6
        L_0x002b:
            h.a.a.d.e r4 = r1.f21171f     // Catch:{ h -> 0x0959 }
            int r4 = r4.length()     // Catch:{ h -> 0x0959 }
            r8 = -1
            if (r4 != 0) goto L_0x00e0
            int r4 = r16.mo34521i()     // Catch:{ IOException -> 0x0058 }
            h.a.a.h.y.c r9 = f21165w     // Catch:{ IOException -> 0x0055 }
            java.lang.String r10 = "filled {}/{}"
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x0055 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x0055 }
            r11[r3] = r12     // Catch:{ IOException -> 0x0055 }
            h.a.a.d.e r12 = r1.f21171f     // Catch:{ IOException -> 0x0055 }
            int r12 = r12.length()     // Catch:{ IOException -> 0x0055 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ IOException -> 0x0055 }
            r11[r6] = r12     // Catch:{ IOException -> 0x0055 }
            r9.mo35489e(r10, r11)     // Catch:{ IOException -> 0x0055 }
            r9 = 0
            goto L_0x0064
        L_0x0055:
            r0 = move-exception
            r9 = r0
            goto L_0x005b
        L_0x0058:
            r0 = move-exception
            r9 = r0
            r4 = -1
        L_0x005b:
            h.a.a.h.y.c r10 = f21165w     // Catch:{ h -> 0x0959 }
            java.lang.String r11 = r16.toString()     // Catch:{ h -> 0x0959 }
            r10.mo35493i(r11, r9)     // Catch:{ h -> 0x0959 }
        L_0x0064:
            if (r4 <= 0) goto L_0x0069
            r4 = 1
            goto L_0x00d9
        L_0x0069:
            if (r4 >= 0) goto L_0x00d8
            r1.f21178m = r3     // Catch:{ h -> 0x0959 }
            int r4 = r1.f21180o     // Catch:{ h -> 0x0959 }
            if (r4 <= 0) goto L_0x009d
            h.a.a.d.e r4 = r1.f21171f     // Catch:{ h -> 0x0959 }
            int r4 = r4.length()     // Catch:{ h -> 0x0959 }
            if (r4 <= 0) goto L_0x009d
            boolean r4 = r1.f21187v     // Catch:{ h -> 0x0959 }
            if (r4 != 0) goto L_0x009d
            h.a.a.d.e r4 = r1.f21171f     // Catch:{ h -> 0x0959 }
            h.a.a.d.e r5 = r1.f21171f     // Catch:{ h -> 0x0959 }
            int r5 = r5.length()     // Catch:{ h -> 0x0959 }
            h.a.a.d.e r4 = r4.get(r5)     // Catch:{ h -> 0x0959 }
            long r10 = r1.f21184s     // Catch:{ h -> 0x0959 }
            int r5 = r4.length()     // Catch:{ h -> 0x0959 }
            long r12 = (long) r5     // Catch:{ h -> 0x0959 }
            long r10 = r10 + r12
            r1.f21184s = r10     // Catch:{ h -> 0x0959 }
            h.a.a.d.t r5 = r1.f21179n     // Catch:{ h -> 0x0959 }
            r5.mo34661e(r4)     // Catch:{ h -> 0x0959 }
            h.a.a.c.n$a r5 = r1.f21166a     // Catch:{ h -> 0x0959 }
            r5.mo34201a(r4)     // Catch:{ h -> 0x0959 }
        L_0x009d:
            int r4 = r1.f21180o     // Catch:{ h -> 0x0959 }
            if (r4 == 0) goto L_0x00bf
            if (r4 == r6) goto L_0x00b8
            if (r4 == r2) goto L_0x00bf
            r1.f21180o = r3     // Catch:{ h -> 0x0959 }
            boolean r4 = r1.f21187v     // Catch:{ h -> 0x0959 }
            if (r4 != 0) goto L_0x00b0
            h.a.a.c.n$a r4 = r1.f21166a     // Catch:{ h -> 0x0959 }
            r4.mo34202b()     // Catch:{ h -> 0x0959 }
        L_0x00b0:
            h.a.a.c.n$a r4 = r1.f21166a     // Catch:{ h -> 0x0959 }
            long r5 = r1.f21184s     // Catch:{ h -> 0x0959 }
        L_0x00b4:
            r4.mo34204d(r5)     // Catch:{ h -> 0x0959 }
            goto L_0x00c1
        L_0x00b8:
            r1.f21180o = r3     // Catch:{ h -> 0x0959 }
            h.a.a.c.n$a r4 = r1.f21166a     // Catch:{ h -> 0x0959 }
            long r5 = r1.f21184s     // Catch:{ h -> 0x0959 }
            goto L_0x00b4
        L_0x00bf:
            r1.f21180o = r3     // Catch:{ h -> 0x0959 }
        L_0x00c1:
            if (r9 != 0) goto L_0x00d7
            boolean r4 = r16.mo34517e()     // Catch:{ h -> 0x0959 }
            if (r4 != 0) goto L_0x00d6
            boolean r4 = r16.mo34513a()     // Catch:{ h -> 0x0959 }
            if (r4 == 0) goto L_0x00d0
            goto L_0x00d6
        L_0x00d0:
            h.a.a.d.o r4 = new h.a.a.d.o     // Catch:{ h -> 0x0959 }
            r4.<init>()     // Catch:{ h -> 0x0959 }
            throw r4     // Catch:{ h -> 0x0959 }
        L_0x00d6:
            return r8
        L_0x00d7:
            throw r9     // Catch:{ h -> 0x0959 }
        L_0x00d8:
            r4 = 0
        L_0x00d9:
            h.a.a.d.e r9 = r1.f21171f     // Catch:{ h -> 0x0959 }
            int r9 = r9.length()     // Catch:{ h -> 0x0959 }
            goto L_0x00e2
        L_0x00e0:
            r9 = r4
            r4 = 0
        L_0x00e2:
            h.a.a.d.e r10 = r1.f21171f     // Catch:{ h -> 0x0959 }
            byte[] r10 = r10.mo34608e0()     // Catch:{ h -> 0x0959 }
            int r11 = r1.f21180o     // Catch:{ h -> 0x0959 }
        L_0x00ea:
            int r12 = r1.f21180o     // Catch:{ h -> 0x0959 }
            r2 = 13
            r5 = 32
            r13 = 10
            if (r12 >= 0) goto L_0x06e2
            int r12 = r9 + -1
            if (r9 <= 0) goto L_0x06e2
            int r9 = r1.f21180o     // Catch:{ h -> 0x0959 }
            if (r11 == r9) goto L_0x0101
            int r4 = r4 + 1
            int r9 = r1.f21180o     // Catch:{ h -> 0x0959 }
            r11 = r9
        L_0x0101:
            h.a.a.d.e r9 = r1.f21171f     // Catch:{ h -> 0x0959 }
            byte r9 = r9.get()     // Catch:{ h -> 0x0959 }
            byte r14 = r1.f21181p     // Catch:{ h -> 0x0959 }
            if (r14 != r2) goto L_0x0112
            if (r9 != r13) goto L_0x0112
            r1.f21181p = r13     // Catch:{ h -> 0x0959 }
        L_0x010f:
            r2 = -1
            goto L_0x06b7
        L_0x0112:
            r1.f21181p = r3     // Catch:{ h -> 0x0959 }
            int r14 = r1.f21180o     // Catch:{ h -> 0x0959 }
            java.lang.String r15 = "ISO-8859-1"
            r7 = -2
            r3 = 9
            r8 = -5
            switch(r14) {
                case -14: goto L_0x06cc;
                case -13: goto L_0x068f;
                case -12: goto L_0x0664;
                case -11: goto L_0x0600;
                case -10: goto L_0x05bb;
                case -9: goto L_0x0554;
                case -8: goto L_0x011f;
                case -7: goto L_0x011f;
                case -6: goto L_0x04ea;
                case -5: goto L_0x02e0;
                case -4: goto L_0x0276;
                case -3: goto L_0x0221;
                case -2: goto L_0x0198;
                case -1: goto L_0x0123;
                default: goto L_0x011f;
            }
        L_0x011f:
            r2 = -1
        L_0x0120:
            r3 = 0
            goto L_0x06b7
        L_0x0123:
            if (r9 == r3) goto L_0x0195
            if (r9 == r13) goto L_0x0131
            if (r9 == r2) goto L_0x0131
            if (r9 == r5) goto L_0x0195
            int r2 = r1.f21182q     // Catch:{ h -> 0x0955 }
        L_0x012d:
            int r2 = r2 + r6
            r1.f21182q = r2     // Catch:{ h -> 0x0955 }
            goto L_0x011f
        L_0x0131:
            int r2 = r1.f21182q     // Catch:{ h -> 0x0955 }
            if (r2 <= 0) goto L_0x0190
            h.a.a.d.t$a r2 = r1.f21174i     // Catch:{ h -> 0x0955 }
            int r2 = r2.length()     // Catch:{ h -> 0x0955 }
            if (r2 != 0) goto L_0x0152
            h.a.a.d.t$a r2 = r1.f21174i     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r3 = r3.mo34571c0()     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r5 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r5 = r5.mo34571c0()     // Catch:{ h -> 0x0955 }
            int r7 = r1.f21182q     // Catch:{ h -> 0x0955 }
            int r5 = r5 + r7
            r2.mo34660d(r3, r5)     // Catch:{ h -> 0x0955 }
            goto L_0x0190
        L_0x0152:
            java.lang.String r2 = r1.f21175j     // Catch:{ h -> 0x0955 }
            if (r2 != 0) goto L_0x015e
            h.a.a.d.t$a r2 = r1.f21174i     // Catch:{ h -> 0x0955 }
            java.lang.String r2 = r2.toString(r15)     // Catch:{ h -> 0x0955 }
            r1.f21175j = r2     // Catch:{ h -> 0x0955 }
        L_0x015e:
            h.a.a.d.t$a r2 = r1.f21174i     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r3 = r3.mo34571c0()     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r5 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r5 = r5.mo34571c0()     // Catch:{ h -> 0x0955 }
            int r7 = r1.f21182q     // Catch:{ h -> 0x0955 }
            int r5 = r5 + r7
            r2.mo34660d(r3, r5)     // Catch:{ h -> 0x0955 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ h -> 0x0955 }
            r2.<init>()     // Catch:{ h -> 0x0955 }
            java.lang.String r3 = r1.f21175j     // Catch:{ h -> 0x0955 }
            r2.append(r3)     // Catch:{ h -> 0x0955 }
            java.lang.String r3 = " "
            r2.append(r3)     // Catch:{ h -> 0x0955 }
            h.a.a.d.t$a r3 = r1.f21174i     // Catch:{ h -> 0x0955 }
            java.lang.String r3 = r3.toString(r15)     // Catch:{ h -> 0x0955 }
            r2.append(r3)     // Catch:{ h -> 0x0955 }
            java.lang.String r2 = r2.toString()     // Catch:{ h -> 0x0955 }
            r1.f21175j = r2     // Catch:{ h -> 0x0955 }
        L_0x0190:
            r1.f21181p = r9     // Catch:{ h -> 0x0955 }
        L_0x0192:
            r1.f21180o = r8     // Catch:{ h -> 0x0955 }
            goto L_0x011f
        L_0x0195:
            r1.f21180o = r7     // Catch:{ h -> 0x0955 }
            goto L_0x011f
        L_0x0198:
            if (r9 == r3) goto L_0x011f
            if (r9 == r13) goto L_0x01be
            if (r9 == r2) goto L_0x01be
            if (r9 == r5) goto L_0x011f
            int r2 = r1.f21182q     // Catch:{ h -> 0x0955 }
            r3 = -1
            if (r2 != r3) goto L_0x01aa
            h.a.a.d.e r2 = r1.f21171f     // Catch:{ h -> 0x0955 }
            r2.mo34593w0()     // Catch:{ h -> 0x0955 }
        L_0x01aa:
            h.a.a.d.e r2 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r2 = r2.getIndex()     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r3 = r3.mo34571c0()     // Catch:{ h -> 0x0955 }
            int r2 = r2 - r3
            r1.f21182q = r2     // Catch:{ h -> 0x0955 }
            r2 = -1
        L_0x01ba:
            r1.f21180o = r2     // Catch:{ h -> 0x0955 }
            goto L_0x011f
        L_0x01be:
            int r2 = r1.f21182q     // Catch:{ h -> 0x0955 }
            if (r2 <= 0) goto L_0x021d
            h.a.a.d.t$a r2 = r1.f21174i     // Catch:{ h -> 0x0955 }
            int r2 = r2.length()     // Catch:{ h -> 0x0955 }
            if (r2 != 0) goto L_0x01df
            h.a.a.d.t$a r2 = r1.f21174i     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r3 = r3.mo34571c0()     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r5 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r5 = r5.mo34571c0()     // Catch:{ h -> 0x0955 }
            int r7 = r1.f21182q     // Catch:{ h -> 0x0955 }
            int r5 = r5 + r7
            r2.mo34660d(r3, r5)     // Catch:{ h -> 0x0955 }
            goto L_0x021d
        L_0x01df:
            java.lang.String r2 = r1.f21175j     // Catch:{ h -> 0x0955 }
            if (r2 != 0) goto L_0x01eb
            h.a.a.d.t$a r2 = r1.f21174i     // Catch:{ h -> 0x0955 }
            java.lang.String r2 = r2.toString(r15)     // Catch:{ h -> 0x0955 }
            r1.f21175j = r2     // Catch:{ h -> 0x0955 }
        L_0x01eb:
            h.a.a.d.t$a r2 = r1.f21174i     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r3 = r3.mo34571c0()     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r5 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r5 = r5.mo34571c0()     // Catch:{ h -> 0x0955 }
            int r7 = r1.f21182q     // Catch:{ h -> 0x0955 }
            int r5 = r5 + r7
            r2.mo34660d(r3, r5)     // Catch:{ h -> 0x0955 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ h -> 0x0955 }
            r2.<init>()     // Catch:{ h -> 0x0955 }
            java.lang.String r3 = r1.f21175j     // Catch:{ h -> 0x0955 }
            r2.append(r3)     // Catch:{ h -> 0x0955 }
            java.lang.String r3 = " "
            r2.append(r3)     // Catch:{ h -> 0x0955 }
            h.a.a.d.t$a r3 = r1.f21174i     // Catch:{ h -> 0x0955 }
            java.lang.String r3 = r3.toString(r15)     // Catch:{ h -> 0x0955 }
            r2.append(r3)     // Catch:{ h -> 0x0955 }
            java.lang.String r2 = r2.toString()     // Catch:{ h -> 0x0955 }
            r1.f21175j = r2     // Catch:{ h -> 0x0955 }
        L_0x021d:
            r1.f21181p = r9     // Catch:{ h -> 0x0955 }
            goto L_0x0192
        L_0x0221:
            if (r9 == r3) goto L_0x0271
            if (r9 == r13) goto L_0x0255
            if (r9 == r2) goto L_0x0255
            if (r9 == r5) goto L_0x0271
            r2 = 58
            if (r9 == r2) goto L_0x0234
            r2 = 0
            r1.f21172g = r2     // Catch:{ h -> 0x0955 }
            int r2 = r1.f21182q     // Catch:{ h -> 0x0955 }
            goto L_0x012d
        L_0x0234:
            int r2 = r1.f21182q     // Catch:{ h -> 0x0955 }
            if (r2 <= 0) goto L_0x0250
            h.a.a.d.f$a r2 = r1.f21172g     // Catch:{ h -> 0x0955 }
            if (r2 != 0) goto L_0x0250
            h.a.a.d.t$a r2 = r1.f21173h     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r3 = r3.mo34571c0()     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r5 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r5 = r5.mo34571c0()     // Catch:{ h -> 0x0955 }
            int r8 = r1.f21182q     // Catch:{ h -> 0x0955 }
            int r5 = r5 + r8
            r2.mo34660d(r3, r5)     // Catch:{ h -> 0x0955 }
        L_0x0250:
            r2 = -1
            r1.f21182q = r2     // Catch:{ h -> 0x0955 }
            goto L_0x0195
        L_0x0255:
            int r2 = r1.f21182q     // Catch:{ h -> 0x0955 }
            if (r2 <= 0) goto L_0x026d
            h.a.a.d.t$a r2 = r1.f21173h     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r3 = r3.mo34571c0()     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r5 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r5 = r5.mo34571c0()     // Catch:{ h -> 0x0955 }
            int r7 = r1.f21182q     // Catch:{ h -> 0x0955 }
            int r5 = r5 + r7
            r2.mo34660d(r3, r5)     // Catch:{ h -> 0x0955 }
        L_0x026d:
            r1.f21181p = r9     // Catch:{ h -> 0x0955 }
            goto L_0x0192
        L_0x0271:
            r2 = -4
            r1.f21180o = r2     // Catch:{ h -> 0x0955 }
            goto L_0x011f
        L_0x0276:
            if (r9 == r3) goto L_0x011f
            if (r9 == r13) goto L_0x02c4
            if (r9 == r2) goto L_0x02c4
            if (r9 == r5) goto L_0x011f
            r2 = 58
            if (r9 == r2) goto L_0x02a3
            r2 = 0
            r1.f21172g = r2     // Catch:{ h -> 0x0955 }
            int r2 = r1.f21182q     // Catch:{ h -> 0x0955 }
            r3 = -1
            if (r2 != r3) goto L_0x028f
            h.a.a.d.e r2 = r1.f21171f     // Catch:{ h -> 0x0955 }
            r2.mo34593w0()     // Catch:{ h -> 0x0955 }
        L_0x028f:
            h.a.a.d.e r2 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r2 = r2.getIndex()     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r3 = r3.mo34571c0()     // Catch:{ h -> 0x0955 }
            int r2 = r2 - r3
            r1.f21182q = r2     // Catch:{ h -> 0x0955 }
            r2 = -3
            r1.f21180o = r2     // Catch:{ h -> 0x0955 }
            goto L_0x011f
        L_0x02a3:
            int r2 = r1.f21182q     // Catch:{ h -> 0x0955 }
            if (r2 <= 0) goto L_0x02bf
            h.a.a.d.f$a r2 = r1.f21172g     // Catch:{ h -> 0x0955 }
            if (r2 != 0) goto L_0x02bf
            h.a.a.d.t$a r2 = r1.f21173h     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r3 = r3.mo34571c0()     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r5 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r5 = r5.mo34571c0()     // Catch:{ h -> 0x0955 }
            int r8 = r1.f21182q     // Catch:{ h -> 0x0955 }
            int r5 = r5 + r8
            r2.mo34660d(r3, r5)     // Catch:{ h -> 0x0955 }
        L_0x02bf:
            r2 = -1
            r1.f21182q = r2     // Catch:{ h -> 0x0955 }
            goto L_0x0195
        L_0x02c4:
            int r2 = r1.f21182q     // Catch:{ h -> 0x0955 }
            if (r2 <= 0) goto L_0x02dc
            h.a.a.d.t$a r2 = r1.f21173h     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r3 = r3.mo34571c0()     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r5 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r5 = r5.mo34571c0()     // Catch:{ h -> 0x0955 }
            int r7 = r1.f21182q     // Catch:{ h -> 0x0955 }
            int r5 = r5 + r7
            r2.mo34660d(r3, r5)     // Catch:{ h -> 0x0955 }
        L_0x02dc:
            r1.f21181p = r9     // Catch:{ h -> 0x0955 }
            goto L_0x0192
        L_0x02e0:
            if (r9 == r3) goto L_0x04e4
            if (r9 == r5) goto L_0x04e4
            r3 = 58
            if (r9 == r3) goto L_0x04e4
            h.a.a.d.f$a r3 = r1.f21172g     // Catch:{ h -> 0x0955 }
            if (r3 != 0) goto L_0x0300
            h.a.a.d.t$a r3 = r1.f21173h     // Catch:{ h -> 0x0955 }
            int r3 = r3.length()     // Catch:{ h -> 0x0955 }
            if (r3 > 0) goto L_0x0300
            h.a.a.d.t$a r3 = r1.f21174i     // Catch:{ h -> 0x0955 }
            int r3 = r3.length()     // Catch:{ h -> 0x0955 }
            if (r3 > 0) goto L_0x0300
            java.lang.String r3 = r1.f21175j     // Catch:{ h -> 0x0955 }
            if (r3 == 0) goto L_0x03ff
        L_0x0300:
            h.a.a.d.f$a r3 = r1.f21172g     // Catch:{ h -> 0x0955 }
            if (r3 == 0) goto L_0x0308
            h.a.a.d.f$a r3 = r1.f21172g     // Catch:{ h -> 0x0955 }
        L_0x0306:
            r5 = 0
            goto L_0x0311
        L_0x0308:
            h.a.a.c.l r3 = p164h.p211a.p212a.p216c.C10910l.f21152d     // Catch:{ h -> 0x0955 }
            h.a.a.d.t$a r5 = r1.f21173h     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r3 = r3.mo34618h(r5)     // Catch:{ h -> 0x0955 }
            goto L_0x0306
        L_0x0311:
            r1.f21172g = r5     // Catch:{ h -> 0x0955 }
            java.lang.String r5 = r1.f21175j     // Catch:{ h -> 0x0955 }
            if (r5 != 0) goto L_0x031a
            h.a.a.d.t$a r5 = r1.f21174i     // Catch:{ h -> 0x0955 }
            goto L_0x0321
        L_0x031a:
            h.a.a.d.k r5 = new h.a.a.d.k     // Catch:{ h -> 0x0955 }
            java.lang.String r8 = r1.f21175j     // Catch:{ h -> 0x0955 }
            r5.<init>((java.lang.String) r8)     // Catch:{ h -> 0x0955 }
        L_0x0321:
            h.a.a.c.l r8 = p164h.p211a.p212a.p216c.C10910l.f21152d     // Catch:{ h -> 0x0955 }
            int r8 = r8.mo34616f(r3)     // Catch:{ h -> 0x0955 }
            if (r8 < 0) goto L_0x03e1
            if (r8 == r6) goto L_0x03a2
            r13 = -2
            r7 = 5
            if (r8 == r7) goto L_0x0373
            r7 = 12
            if (r8 == r7) goto L_0x0336
            goto L_0x03e1
        L_0x0336:
            long r7 = r1.f21183r     // Catch:{ h -> 0x0955 }
            int r15 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r15 == 0) goto L_0x03e1
            int r7 = r1.f21176k     // Catch:{ h -> 0x0955 }
            r8 = 304(0x130, float:4.26E-43)
            if (r7 == r8) goto L_0x03e1
            int r7 = r1.f21176k     // Catch:{ h -> 0x0955 }
            r8 = 204(0xcc, float:2.86E-43)
            if (r7 == r8) goto L_0x03e1
            int r7 = r1.f21176k     // Catch:{ h -> 0x0955 }
            r8 = 100
            if (r7 < r8) goto L_0x0354
            int r7 = r1.f21176k     // Catch:{ h -> 0x0955 }
            r8 = 200(0xc8, float:2.8E-43)
            if (r7 < r8) goto L_0x03e1
        L_0x0354:
            long r7 = p164h.p211a.p212a.p217d.C10934h.m27673i(r5)     // Catch:{ NumberFormatException -> 0x0364 }
            r1.f21183r = r7     // Catch:{ NumberFormatException -> 0x0364 }
            r13 = 0
            int r15 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r15 > 0) goto L_0x03e1
        L_0x0360:
            r1.f21183r = r13     // Catch:{ h -> 0x0955 }
            goto L_0x03e1
        L_0x0364:
            r0 = move-exception
            r2 = r0
            h.a.a.h.y.c r3 = f21165w     // Catch:{ h -> 0x0955 }
            r3.mo35488d(r2)     // Catch:{ h -> 0x0955 }
            h.a.a.c.h r2 = new h.a.a.c.h     // Catch:{ h -> 0x0955 }
            r3 = 400(0x190, float:5.6E-43)
            r2.<init>(r3)     // Catch:{ h -> 0x0955 }
            throw r2     // Catch:{ h -> 0x0955 }
        L_0x0373:
            h.a.a.c.k r7 = p164h.p211a.p212a.p216c.C10909k.f21149d     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r5 = r7.mo34618h(r5)     // Catch:{ h -> 0x0955 }
            h.a.a.c.k r7 = p164h.p211a.p212a.p216c.C10909k.f21149d     // Catch:{ h -> 0x0955 }
            int r7 = r7.mo34616f(r5)     // Catch:{ h -> 0x0955 }
            r8 = 2
            if (r8 != r7) goto L_0x0383
            goto L_0x0360
        L_0x0383:
            java.lang.String r7 = r5.toString(r15)     // Catch:{ h -> 0x0955 }
            java.lang.String r8 = "chunked"
            boolean r8 = r7.endsWith(r8)     // Catch:{ h -> 0x0955 }
            if (r8 == 0) goto L_0x0390
            goto L_0x0360
        L_0x0390:
            java.lang.String r8 = "chunked"
            int r7 = r7.indexOf(r8)     // Catch:{ h -> 0x0955 }
            if (r7 >= 0) goto L_0x0399
            goto L_0x03e1
        L_0x0399:
            h.a.a.c.h r2 = new h.a.a.c.h     // Catch:{ h -> 0x0955 }
            r3 = 400(0x190, float:5.6E-43)
            r4 = 0
            r2.<init>(r3, r4)     // Catch:{ h -> 0x0955 }
            throw r2     // Catch:{ h -> 0x0955 }
        L_0x03a2:
            h.a.a.c.k r7 = p164h.p211a.p212a.p216c.C10909k.f21149d     // Catch:{ h -> 0x0955 }
            int r7 = r7.mo34616f(r5)     // Catch:{ h -> 0x0955 }
            r8 = -1
            if (r7 == r8) goto L_0x03b8
            if (r7 == r6) goto L_0x03b4
            r8 = 5
            if (r7 == r8) goto L_0x03b1
            goto L_0x03e1
        L_0x03b1:
            r1.f21178m = r6     // Catch:{ h -> 0x0955 }
            goto L_0x03e1
        L_0x03b4:
            r7 = 0
            r1.f21178m = r7     // Catch:{ h -> 0x0955 }
            goto L_0x03e1
        L_0x03b8:
            java.lang.String r7 = r5.toString()     // Catch:{ h -> 0x0955 }
            java.lang.String r8 = ","
            java.lang.String[] r7 = r7.split(r8)     // Catch:{ h -> 0x0955 }
            int r8 = r7.length     // Catch:{ h -> 0x0955 }
            r13 = 0
        L_0x03c4:
            if (r13 >= r8) goto L_0x03e1
            r14 = r7[r13]     // Catch:{ h -> 0x0955 }
            h.a.a.c.k r15 = p164h.p211a.p212a.p216c.C10909k.f21149d     // Catch:{ h -> 0x0955 }
            java.lang.String r14 = r14.trim()     // Catch:{ h -> 0x0955 }
            int r14 = r15.mo34615e(r14)     // Catch:{ h -> 0x0955 }
            if (r14 == r6) goto L_0x03db
            r15 = 5
            if (r14 == r15) goto L_0x03d8
            goto L_0x03de
        L_0x03d8:
            r1.f21178m = r6     // Catch:{ h -> 0x0955 }
            goto L_0x03de
        L_0x03db:
            r14 = 0
            r1.f21178m = r14     // Catch:{ h -> 0x0955 }
        L_0x03de:
            int r13 = r13 + 1
            goto L_0x03c4
        L_0x03e1:
            h.a.a.c.n$a r7 = r1.f21166a     // Catch:{ h -> 0x0955 }
            r7.mo34205e(r3, r5)     // Catch:{ h -> 0x0955 }
            h.a.a.d.t$a r3 = r1.f21173h     // Catch:{ h -> 0x0955 }
            h.a.a.d.t$a r5 = r1.f21173h     // Catch:{ h -> 0x0955 }
            int r5 = r5.getIndex()     // Catch:{ h -> 0x0955 }
            r3.mo34575f0(r5)     // Catch:{ h -> 0x0955 }
            h.a.a.d.t$a r3 = r1.f21174i     // Catch:{ h -> 0x0955 }
            h.a.a.d.t$a r5 = r1.f21174i     // Catch:{ h -> 0x0955 }
            int r5 = r5.getIndex()     // Catch:{ h -> 0x0955 }
            r3.mo34575f0(r5)     // Catch:{ h -> 0x0955 }
            r3 = 0
            r1.f21175j = r3     // Catch:{ h -> 0x0955 }
        L_0x03ff:
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            r5 = -1
            r3.mo34573e1(r5)     // Catch:{ h -> 0x0955 }
            if (r9 == r2) goto L_0x0449
            r3 = 10
            if (r9 != r3) goto L_0x040c
            goto L_0x0449
        L_0x040c:
            r1.f21182q = r6     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r2 = r1.f21171f     // Catch:{ h -> 0x0955 }
            r2.mo34593w0()     // Catch:{ h -> 0x0955 }
            r2 = -4
            r1.f21180o = r2     // Catch:{ h -> 0x0955 }
            if (r10 == 0) goto L_0x011f
            h.a.a.c.l r2 = p164h.p211a.p212a.p216c.C10910l.f21152d     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r3 = r3.mo34571c0()     // Catch:{ h -> 0x0955 }
            int r5 = r12 + 1
            h.a.a.d.f$a r2 = r2.mo34614d(r10, r3, r5)     // Catch:{ h -> 0x0955 }
            r1.f21172g = r2     // Catch:{ h -> 0x0955 }
            if (r2 == 0) goto L_0x011f
            int r2 = r2.length()     // Catch:{ h -> 0x0955 }
            r1.f21182q = r2     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r2 = r1.f21171f     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r3 = r3.mo34571c0()     // Catch:{ h -> 0x0955 }
            int r5 = r1.f21182q     // Catch:{ h -> 0x0955 }
            int r3 = r3 + r5
            r2.mo34592v0(r3)     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r2 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r2 = r2.length()     // Catch:{ h -> 0x0955 }
            r9 = r2
            r2 = -1
            r3 = 0
            goto L_0x06b8
        L_0x0449:
            long r3 = r1.f21183r     // Catch:{ h -> 0x0955 }
            r7 = -3
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x0472
            int r3 = r1.f21176k     // Catch:{ h -> 0x0955 }
            if (r3 == 0) goto L_0x046d
            int r3 = r1.f21176k     // Catch:{ h -> 0x0955 }
            r4 = 304(0x130, float:4.26E-43)
            if (r3 == r4) goto L_0x046d
            int r3 = r1.f21176k     // Catch:{ h -> 0x0955 }
            r4 = 204(0xcc, float:2.86E-43)
            if (r3 == r4) goto L_0x046d
            int r3 = r1.f21176k     // Catch:{ h -> 0x0955 }
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 >= r4) goto L_0x0468
            goto L_0x046d
        L_0x0468:
            r3 = -1
            r1.f21183r = r3     // Catch:{ h -> 0x0955 }
            goto L_0x0472
        L_0x046d:
            r3 = 0
            r1.f21183r = r3     // Catch:{ h -> 0x0955 }
            goto L_0x0474
        L_0x0472:
            r3 = 0
        L_0x0474:
            r1.f21184s = r3     // Catch:{ h -> 0x0955 }
            r1.f21181p = r9     // Catch:{ h -> 0x0955 }
            if (r9 != r2) goto L_0x0494
            h.a.a.d.e r2 = r1.f21171f     // Catch:{ h -> 0x0955 }
            boolean r2 = r2.mo34556F0()     // Catch:{ h -> 0x0955 }
            if (r2 == 0) goto L_0x0494
            h.a.a.d.e r2 = r1.f21171f     // Catch:{ h -> 0x0955 }
            byte r2 = r2.peek()     // Catch:{ h -> 0x0955 }
            r3 = 10
            if (r2 != r3) goto L_0x0494
            h.a.a.d.e r2 = r1.f21171f     // Catch:{ h -> 0x0955 }
            byte r2 = r2.get()     // Catch:{ h -> 0x0955 }
            r1.f21181p = r2     // Catch:{ h -> 0x0955 }
        L_0x0494:
            long r2 = r1.f21183r     // Catch:{ h -> 0x0955 }
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x04a1
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x04a4
        L_0x04a1:
            long r2 = r1.f21183r     // Catch:{ h -> 0x0955 }
            int r2 = (int) r2     // Catch:{ h -> 0x0955 }
        L_0x04a4:
            r3 = -2
            if (r2 == r3) goto L_0x04dd
            r3 = -1
            if (r2 == r3) goto L_0x04d8
            if (r2 == 0) goto L_0x04b5
            r2 = 2
            r1.f21180o = r2     // Catch:{ h -> 0x0955 }
            h.a.a.c.n$a r2 = r1.f21166a     // Catch:{ h -> 0x0955 }
        L_0x04b1:
            r2.mo34203c()     // Catch:{ h -> 0x0955 }
            goto L_0x04e3
        L_0x04b5:
            h.a.a.c.n$a r2 = r1.f21166a     // Catch:{ h -> 0x0955 }
            r2.mo34203c()     // Catch:{ h -> 0x0955 }
            boolean r2 = r1.f21178m     // Catch:{ h -> 0x0955 }
            if (r2 != 0) goto L_0x04cd
            int r2 = r1.f21176k     // Catch:{ h -> 0x0955 }
            r3 = 100
            if (r2 < r3) goto L_0x04cb
            int r2 = r1.f21176k     // Catch:{ h -> 0x0955 }
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 >= r3) goto L_0x04cb
            goto L_0x04cd
        L_0x04cb:
            r2 = 7
            goto L_0x04ce
        L_0x04cd:
            r2 = 0
        L_0x04ce:
            r1.f21180o = r2     // Catch:{ h -> 0x0955 }
            h.a.a.c.n$a r2 = r1.f21166a     // Catch:{ h -> 0x0955 }
            long r3 = r1.f21184s     // Catch:{ h -> 0x0955 }
            r2.mo34204d(r3)     // Catch:{ h -> 0x0955 }
            return r6
        L_0x04d8:
            r1.f21180o = r6     // Catch:{ h -> 0x0955 }
            h.a.a.c.n$a r2 = r1.f21166a     // Catch:{ h -> 0x0955 }
            goto L_0x04b1
        L_0x04dd:
            r2 = 3
            r1.f21180o = r2     // Catch:{ h -> 0x0955 }
            h.a.a.c.n$a r2 = r1.f21166a     // Catch:{ h -> 0x0955 }
            goto L_0x04b1
        L_0x04e3:
            return r6
        L_0x04e4:
            r2 = -1
            r1.f21182q = r2     // Catch:{ h -> 0x0955 }
            r2 = -2
            goto L_0x01ba
        L_0x04ea:
            if (r9 == r2) goto L_0x04f0
            r2 = 10
            if (r9 != r2) goto L_0x011f
        L_0x04f0:
            int r2 = r1.f21176k     // Catch:{ h -> 0x0955 }
            if (r2 <= 0) goto L_0x050a
            h.a.a.c.n$a r2 = r1.f21166a     // Catch:{ h -> 0x0955 }
            h.a.a.d.f r3 = p164h.p211a.p212a.p216c.C10919s.f21257a     // Catch:{ h -> 0x0955 }
            h.a.a.d.t$a r5 = r1.f21173h     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r3 = r3.mo34618h(r5)     // Catch:{ h -> 0x0955 }
            int r5 = r1.f21176k     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r7 = r1.f21171f     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r7 = r7.mo34559J0()     // Catch:{ h -> 0x0955 }
            r2.mo34207g(r3, r5, r7)     // Catch:{ h -> 0x0955 }
            goto L_0x0526
        L_0x050a:
            h.a.a.c.n$a r2 = r1.f21166a     // Catch:{ h -> 0x0955 }
            h.a.a.d.f r3 = p164h.p211a.p212a.p216c.C10911m.f21163a     // Catch:{ h -> 0x0955 }
            h.a.a.d.t$a r5 = r1.f21173h     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r3 = r3.mo34618h(r5)     // Catch:{ h -> 0x0955 }
            h.a.a.d.t$a r5 = r1.f21174i     // Catch:{ h -> 0x0955 }
            h.a.a.d.f r7 = p164h.p211a.p212a.p216c.C10919s.f21257a     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r13 = r1.f21171f     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r13 = r13.mo34559J0()     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r7 = r7.mo34618h(r13)     // Catch:{ h -> 0x0955 }
            r2.mo34206f(r3, r5, r7)     // Catch:{ h -> 0x0955 }
            r3 = r7
        L_0x0526:
            r1.f21181p = r9     // Catch:{ h -> 0x0955 }
            h.a.a.d.f r2 = p164h.p211a.p212a.p216c.C10919s.f21257a     // Catch:{ h -> 0x0955 }
            int r2 = r2.mo34616f(r3)     // Catch:{ h -> 0x0955 }
            r3 = 11
            if (r2 < r3) goto L_0x0534
            r2 = 1
            goto L_0x0535
        L_0x0534:
            r2 = 0
        L_0x0535:
            r1.f21178m = r2     // Catch:{ h -> 0x0955 }
            r1.f21180o = r8     // Catch:{ h -> 0x0955 }
            h.a.a.d.t$a r2 = r1.f21173h     // Catch:{ h -> 0x0955 }
            h.a.a.d.t$a r3 = r1.f21173h     // Catch:{ h -> 0x0955 }
            int r3 = r3.getIndex()     // Catch:{ h -> 0x0955 }
            r2.mo34575f0(r3)     // Catch:{ h -> 0x0955 }
            h.a.a.d.t$a r2 = r1.f21174i     // Catch:{ h -> 0x0955 }
            h.a.a.d.t$a r3 = r1.f21174i     // Catch:{ h -> 0x0955 }
            int r3 = r3.getIndex()     // Catch:{ h -> 0x0955 }
            r2.mo34575f0(r3)     // Catch:{ h -> 0x0955 }
            r2 = 0
        L_0x0550:
            r1.f21175j = r2     // Catch:{ h -> 0x0955 }
            goto L_0x010f
        L_0x0554:
            if (r9 > r5) goto L_0x05b1
            if (r9 >= 0) goto L_0x0559
            goto L_0x05b1
        L_0x0559:
            if (r9 >= r5) goto L_0x011f
            int r2 = r1.f21176k     // Catch:{ h -> 0x0955 }
            if (r2 <= 0) goto L_0x058e
            h.a.a.c.n$a r2 = r1.f21166a     // Catch:{ h -> 0x0955 }
            h.a.a.d.f r3 = p164h.p211a.p212a.p216c.C10911m.f21163a     // Catch:{ h -> 0x0955 }
            h.a.a.d.t$a r5 = r1.f21173h     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r3 = r3.mo34618h(r5)     // Catch:{ h -> 0x0955 }
            int r5 = r1.f21176k     // Catch:{ h -> 0x0955 }
            r7 = 0
            r2.mo34207g(r3, r5, r7)     // Catch:{ h -> 0x0955 }
            r1.f21181p = r9     // Catch:{ h -> 0x0955 }
            r1.f21180o = r8     // Catch:{ h -> 0x0955 }
            h.a.a.d.t$a r2 = r1.f21173h     // Catch:{ h -> 0x0955 }
            h.a.a.d.t$a r3 = r1.f21173h     // Catch:{ h -> 0x0955 }
            int r3 = r3.getIndex()     // Catch:{ h -> 0x0955 }
            r2.mo34575f0(r3)     // Catch:{ h -> 0x0955 }
            h.a.a.d.t$a r2 = r1.f21174i     // Catch:{ h -> 0x0955 }
            h.a.a.d.t$a r3 = r1.f21174i     // Catch:{ h -> 0x0955 }
            int r3 = r3.getIndex()     // Catch:{ h -> 0x0955 }
            r2.mo34575f0(r3)     // Catch:{ h -> 0x0955 }
            r2 = 0
            r1.f21175j = r2     // Catch:{ h -> 0x0955 }
            goto L_0x011f
        L_0x058e:
            h.a.a.c.n$a r2 = r1.f21166a     // Catch:{ h -> 0x0955 }
            h.a.a.d.f r3 = p164h.p211a.p212a.p216c.C10911m.f21163a     // Catch:{ h -> 0x0955 }
            h.a.a.d.t$a r4 = r1.f21173h     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r3 = r3.mo34618h(r4)     // Catch:{ h -> 0x0955 }
            h.a.a.d.t$a r4 = r1.f21174i     // Catch:{ h -> 0x0955 }
            r5 = 0
            r2.mo34206f(r3, r4, r5)     // Catch:{ h -> 0x0955 }
            r2 = 0
            r1.f21178m = r2     // Catch:{ h -> 0x0955 }
            r2 = 7
            r1.f21180o = r2     // Catch:{ h -> 0x0955 }
            h.a.a.c.n$a r2 = r1.f21166a     // Catch:{ h -> 0x0955 }
            r2.mo34203c()     // Catch:{ h -> 0x0955 }
            h.a.a.c.n$a r2 = r1.f21166a     // Catch:{ h -> 0x0955 }
            long r3 = r1.f21184s     // Catch:{ h -> 0x0955 }
            r2.mo34204d(r3)     // Catch:{ h -> 0x0955 }
            return r6
        L_0x05b1:
            h.a.a.d.e r2 = r1.f21171f     // Catch:{ h -> 0x0955 }
            r2.mo34593w0()     // Catch:{ h -> 0x0955 }
            r2 = -6
            r1.f21180o = r2     // Catch:{ h -> 0x0955 }
            goto L_0x011f
        L_0x05bb:
            if (r9 != r5) goto L_0x05d5
            h.a.a.d.t$a r2 = r1.f21174i     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r3 = r3.mo34571c0()     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r5 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r5 = r5.getIndex()     // Catch:{ h -> 0x0955 }
            int r5 = r5 - r6
            r2.mo34660d(r3, r5)     // Catch:{ h -> 0x0955 }
        L_0x05cf:
            r2 = -9
            r1.f21180o = r2     // Catch:{ h -> 0x0955 }
            goto L_0x010f
        L_0x05d5:
            if (r9 >= r5) goto L_0x011f
            if (r9 < 0) goto L_0x011f
            h.a.a.c.n$a r2 = r1.f21166a     // Catch:{ h -> 0x0955 }
            h.a.a.d.f r3 = p164h.p211a.p212a.p216c.C10911m.f21163a     // Catch:{ h -> 0x0955 }
            h.a.a.d.t$a r4 = r1.f21173h     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r3 = r3.mo34618h(r4)     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r4 = r1.f21171f     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r4 = r4.mo34559J0()     // Catch:{ h -> 0x0955 }
            r5 = 0
            r2.mo34206f(r3, r4, r5)     // Catch:{ h -> 0x0955 }
            r2 = 0
            r1.f21178m = r2     // Catch:{ h -> 0x0955 }
            r2 = 7
            r1.f21180o = r2     // Catch:{ h -> 0x0955 }
            h.a.a.c.n$a r2 = r1.f21166a     // Catch:{ h -> 0x0955 }
            r2.mo34203c()     // Catch:{ h -> 0x0955 }
            h.a.a.c.n$a r2 = r1.f21166a     // Catch:{ h -> 0x0955 }
            long r3 = r1.f21184s     // Catch:{ h -> 0x0955 }
            r2.mo34204d(r3)     // Catch:{ h -> 0x0955 }
            return r6
        L_0x0600:
            if (r9 != r5) goto L_0x0615
            h.a.a.d.t$a r2 = r1.f21174i     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r3 = r3.mo34571c0()     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r5 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r5 = r5.getIndex()     // Catch:{ h -> 0x0955 }
            int r5 = r5 - r6
            r2.mo34660d(r3, r5)     // Catch:{ h -> 0x0955 }
            goto L_0x05cf
        L_0x0615:
            r2 = 48
            if (r9 < r2) goto L_0x062a
            r2 = 57
            if (r9 > r2) goto L_0x062a
            int r2 = r1.f21176k     // Catch:{ h -> 0x0955 }
            r3 = 10
            int r2 = r2 * 10
            int r9 = r9 + -48
            int r2 = r2 + r9
            r1.f21176k = r2     // Catch:{ h -> 0x0955 }
            goto L_0x010f
        L_0x062a:
            if (r9 >= r5) goto L_0x065b
            if (r9 < 0) goto L_0x065b
            h.a.a.c.n$a r2 = r1.f21166a     // Catch:{ h -> 0x0955 }
            h.a.a.d.f r3 = p164h.p211a.p212a.p216c.C10911m.f21163a     // Catch:{ h -> 0x0955 }
            h.a.a.d.t$a r5 = r1.f21173h     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r3 = r3.mo34618h(r5)     // Catch:{ h -> 0x0955 }
            int r5 = r1.f21176k     // Catch:{ h -> 0x0955 }
            r7 = 0
            r2.mo34207g(r3, r5, r7)     // Catch:{ h -> 0x0955 }
            r1.f21181p = r9     // Catch:{ h -> 0x0955 }
            r1.f21180o = r8     // Catch:{ h -> 0x0955 }
            h.a.a.d.t$a r2 = r1.f21173h     // Catch:{ h -> 0x0955 }
            h.a.a.d.t$a r3 = r1.f21173h     // Catch:{ h -> 0x0955 }
            int r3 = r3.getIndex()     // Catch:{ h -> 0x0955 }
            r2.mo34575f0(r3)     // Catch:{ h -> 0x0955 }
            h.a.a.d.t$a r2 = r1.f21174i     // Catch:{ h -> 0x0955 }
            h.a.a.d.t$a r3 = r1.f21174i     // Catch:{ h -> 0x0955 }
            int r3 = r3.getIndex()     // Catch:{ h -> 0x0955 }
            r2.mo34575f0(r3)     // Catch:{ h -> 0x0955 }
            r2 = 0
            goto L_0x0550
        L_0x065b:
            r2 = -10
            r1.f21180o = r2     // Catch:{ h -> 0x0955 }
            r2 = -1
            r1.f21176k = r2     // Catch:{ h -> 0x0955 }
            goto L_0x0120
        L_0x0664:
            r2 = -1
            if (r9 > r5) goto L_0x0676
            if (r9 >= 0) goto L_0x066a
            goto L_0x0676
        L_0x066a:
            if (r9 < r5) goto L_0x066e
            goto L_0x0120
        L_0x066e:
            h.a.a.c.h r2 = new h.a.a.c.h     // Catch:{ h -> 0x0955 }
            r3 = 400(0x190, float:5.6E-43)
            r2.<init>(r3)     // Catch:{ h -> 0x0955 }
            throw r2     // Catch:{ h -> 0x0955 }
        L_0x0676:
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            r3.mo34593w0()     // Catch:{ h -> 0x0955 }
            int r3 = r1.f21176k     // Catch:{ h -> 0x0955 }
            if (r3 < 0) goto L_0x0689
            r3 = -11
            r1.f21180o = r3     // Catch:{ h -> 0x0955 }
            int r9 = r9 + -48
            r1.f21176k = r9     // Catch:{ h -> 0x0955 }
            goto L_0x0120
        L_0x0689:
            r3 = -10
            r1.f21180o = r3     // Catch:{ h -> 0x0955 }
            goto L_0x0120
        L_0x068f:
            r2 = -1
            if (r9 != r5) goto L_0x06be
            h.a.a.d.t$a r3 = r1.f21173h     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r5 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r5 = r5.mo34571c0()     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r7 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r7 = r7.getIndex()     // Catch:{ h -> 0x0955 }
            int r7 = r7 - r6
            r3.mo34660d(r5, r7)     // Catch:{ h -> 0x0955 }
            h.a.a.d.f r3 = p164h.p211a.p212a.p216c.C10919s.f21257a     // Catch:{ h -> 0x0955 }
            h.a.a.d.t$a r5 = r1.f21173h     // Catch:{ h -> 0x0955 }
            h.a.a.d.f$a r3 = r3.mo34613c(r5)     // Catch:{ h -> 0x0955 }
            if (r3 != 0) goto L_0x06b0
            r3 = -1
            goto L_0x06b1
        L_0x06b0:
            r3 = 0
        L_0x06b1:
            r1.f21176k = r3     // Catch:{ h -> 0x0955 }
            r3 = -12
            r1.f21180o = r3     // Catch:{ h -> 0x0955 }
        L_0x06b7:
            r9 = r12
        L_0x06b8:
            r2 = 7
            r3 = 0
            r5 = 2
            r8 = -1
            goto L_0x00ea
        L_0x06be:
            if (r9 >= r5) goto L_0x0120
            if (r9 >= 0) goto L_0x06c4
            goto L_0x0120
        L_0x06c4:
            h.a.a.c.h r2 = new h.a.a.c.h     // Catch:{ h -> 0x0955 }
            r3 = 400(0x190, float:5.6E-43)
            r2.<init>(r3)     // Catch:{ h -> 0x0955 }
            throw r2     // Catch:{ h -> 0x0955 }
        L_0x06cc:
            r2 = -1
            r7 = -3
            r1.f21183r = r7     // Catch:{ h -> 0x0955 }
            r3 = 0
            r1.f21172g = r3     // Catch:{ h -> 0x0955 }
            if (r9 > r5) goto L_0x06d8
            if (r9 >= 0) goto L_0x06b7
        L_0x06d8:
            h.a.a.d.e r5 = r1.f21171f     // Catch:{ h -> 0x0955 }
            r5.mo34593w0()     // Catch:{ h -> 0x0955 }
            r5 = -13
            r1.f21180o = r5     // Catch:{ h -> 0x0955 }
            goto L_0x06b7
        L_0x06e2:
            int r3 = r1.f21176k     // Catch:{ h -> 0x0955 }
            if (r3 <= 0) goto L_0x0707
            boolean r3 = r1.f21187v     // Catch:{ h -> 0x0955 }
            if (r3 == 0) goto L_0x0707
            boolean r3 = r1.f21178m     // Catch:{ h -> 0x0955 }
            if (r3 != 0) goto L_0x06fd
            int r3 = r1.f21176k     // Catch:{ h -> 0x0955 }
            r7 = 100
            if (r3 < r7) goto L_0x06fb
            int r3 = r1.f21176k     // Catch:{ h -> 0x0955 }
            r7 = 200(0xc8, float:2.8E-43)
            if (r3 >= r7) goto L_0x06fb
            goto L_0x06fd
        L_0x06fb:
            r3 = 7
            goto L_0x06fe
        L_0x06fd:
            r3 = 0
        L_0x06fe:
            r1.f21180o = r3     // Catch:{ h -> 0x0955 }
            h.a.a.c.n$a r3 = r1.f21166a     // Catch:{ h -> 0x0955 }
            long r7 = r1.f21183r     // Catch:{ h -> 0x0955 }
            r3.mo34204d(r7)     // Catch:{ h -> 0x0955 }
        L_0x0707:
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r3 = r3.length()     // Catch:{ h -> 0x0955 }
            int r7 = r1.f21180o     // Catch:{ h -> 0x0955 }
        L_0x070f:
            int r8 = r1.f21180o     // Catch:{ h -> 0x0955 }
            if (r8 <= 0) goto L_0x0954
            if (r3 <= 0) goto L_0x0954
            int r8 = r1.f21180o     // Catch:{ h -> 0x0955 }
            if (r7 == r8) goto L_0x071d
            int r4 = r4 + 1
            int r7 = r1.f21180o     // Catch:{ h -> 0x0955 }
        L_0x071d:
            byte r8 = r1.f21181p     // Catch:{ h -> 0x0955 }
            if (r8 != r2) goto L_0x073a
            h.a.a.d.e r8 = r1.f21171f     // Catch:{ h -> 0x0955 }
            byte r8 = r8.peek()     // Catch:{ h -> 0x0955 }
            r9 = 10
            if (r8 != r9) goto L_0x073a
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            byte r3 = r3.get()     // Catch:{ h -> 0x0955 }
            r1.f21181p = r3     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
        L_0x0735:
            int r3 = r3.length()     // Catch:{ h -> 0x0955 }
            goto L_0x070f
        L_0x073a:
            r8 = 0
            r1.f21181p = r8     // Catch:{ h -> 0x0955 }
            int r9 = r1.f21180o     // Catch:{ h -> 0x0955 }
            switch(r9) {
                case 1: goto L_0x092f;
                case 2: goto L_0x08da;
                case 3: goto L_0x08ac;
                case 4: goto L_0x0801;
                case 5: goto L_0x07b8;
                case 6: goto L_0x0785;
                case 7: goto L_0x074c;
                default: goto L_0x0742;
            }     // Catch:{ h -> 0x0955 }
        L_0x0742:
            r8 = 48
            r9 = 2
        L_0x0745:
            r10 = 5
        L_0x0746:
            r11 = 10
        L_0x0748:
            r12 = 0
            goto L_0x0950
        L_0x074c:
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r3 = r3.length()     // Catch:{ h -> 0x0955 }
            r9 = 2
            if (r3 <= r9) goto L_0x075d
            r1.f21180o = r8     // Catch:{ h -> 0x0955 }
            h.a.a.d.n r3 = r1.f21168c     // Catch:{ h -> 0x0955 }
            r3.close()     // Catch:{ h -> 0x0955 }
            goto L_0x077f
        L_0x075d:
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r3 = r3.length()     // Catch:{ h -> 0x0955 }
            if (r3 <= 0) goto L_0x077f
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            byte r3 = r3.get()     // Catch:{ h -> 0x0955 }
            boolean r3 = java.lang.Character.isWhitespace(r3)     // Catch:{ h -> 0x0955 }
            if (r3 != 0) goto L_0x075d
            r3 = 0
            r1.f21180o = r3     // Catch:{ h -> 0x0959 }
            h.a.a.d.n r3 = r1.f21168c     // Catch:{ h -> 0x0955 }
            r3.close()     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            r3.clear()     // Catch:{ h -> 0x0955 }
            goto L_0x075d
        L_0x077f:
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            r3.clear()     // Catch:{ h -> 0x0955 }
            goto L_0x07c6
        L_0x0785:
            r9 = 2
            int r8 = r1.f21185t     // Catch:{ h -> 0x0955 }
            int r10 = r1.f21186u     // Catch:{ h -> 0x0955 }
            int r8 = r8 - r10
            if (r8 != 0) goto L_0x0791
            r3 = 3
            r1.f21180o = r3     // Catch:{ h -> 0x0955 }
            goto L_0x07c6
        L_0x0791:
            if (r3 <= r8) goto L_0x0794
            r3 = r8
        L_0x0794:
            h.a.a.d.e r2 = r1.f21171f     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r2 = r2.get(r3)     // Catch:{ h -> 0x0955 }
            long r3 = r1.f21184s     // Catch:{ h -> 0x0955 }
            int r5 = r2.length()     // Catch:{ h -> 0x0955 }
            long r7 = (long) r5     // Catch:{ h -> 0x0955 }
            long r3 = r3 + r7
            r1.f21184s = r3     // Catch:{ h -> 0x0955 }
            int r3 = r1.f21186u     // Catch:{ h -> 0x0955 }
            int r4 = r2.length()     // Catch:{ h -> 0x0955 }
            int r3 = r3 + r4
            r1.f21186u = r3     // Catch:{ h -> 0x0955 }
            h.a.a.d.t r3 = r1.f21179n     // Catch:{ h -> 0x0955 }
            r3.mo34661e(r2)     // Catch:{ h -> 0x0955 }
            h.a.a.c.n$a r3 = r1.f21166a     // Catch:{ h -> 0x0955 }
            r3.mo34201a(r2)     // Catch:{ h -> 0x0955 }
            return r6
        L_0x07b8:
            r9 = 2
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            byte r3 = r3.get()     // Catch:{ h -> 0x0955 }
            if (r3 == r2) goto L_0x07ca
            r8 = 10
            if (r3 != r8) goto L_0x07c6
            goto L_0x07ca
        L_0x07c6:
            r8 = 48
            goto L_0x0745
        L_0x07ca:
            r1.f21181p = r3     // Catch:{ h -> 0x0955 }
            int r8 = r1.f21185t     // Catch:{ h -> 0x0955 }
            if (r8 != 0) goto L_0x07fd
            if (r3 != r2) goto L_0x07ec
            h.a.a.d.e r2 = r1.f21171f     // Catch:{ h -> 0x0955 }
            boolean r2 = r2.mo34556F0()     // Catch:{ h -> 0x0955 }
            if (r2 == 0) goto L_0x07ec
            h.a.a.d.e r2 = r1.f21171f     // Catch:{ h -> 0x0955 }
            byte r2 = r2.peek()     // Catch:{ h -> 0x0955 }
            r3 = 10
            if (r2 != r3) goto L_0x07ec
            h.a.a.d.e r2 = r1.f21171f     // Catch:{ h -> 0x0955 }
            byte r2 = r2.get()     // Catch:{ h -> 0x0955 }
            r1.f21181p = r2     // Catch:{ h -> 0x0955 }
        L_0x07ec:
            boolean r2 = r1.f21178m     // Catch:{ h -> 0x0955 }
            if (r2 == 0) goto L_0x07f2
            r2 = 0
            goto L_0x07f3
        L_0x07f2:
            r2 = 7
        L_0x07f3:
            r1.f21180o = r2     // Catch:{ h -> 0x0955 }
            h.a.a.c.n$a r2 = r1.f21166a     // Catch:{ h -> 0x0955 }
            long r3 = r1.f21184s     // Catch:{ h -> 0x0955 }
            r2.mo34204d(r3)     // Catch:{ h -> 0x0955 }
            return r6
        L_0x07fd:
            r3 = 6
            r1.f21180o = r3     // Catch:{ h -> 0x0955 }
            goto L_0x07c6
        L_0x0801:
            r9 = 2
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            byte r3 = r3.get()     // Catch:{ h -> 0x0955 }
            if (r3 == r2) goto L_0x0871
            r8 = 10
            if (r3 != r8) goto L_0x080f
            goto L_0x0871
        L_0x080f:
            if (r3 <= r5) goto L_0x086a
            r8 = 59
            if (r3 != r8) goto L_0x0816
            goto L_0x086a
        L_0x0816:
            r8 = 48
            if (r3 < r8) goto L_0x0829
            r10 = 57
            if (r3 > r10) goto L_0x0829
            int r10 = r1.f21185t     // Catch:{ h -> 0x0955 }
            int r10 = r10 * 16
            int r3 = r3 + -48
            int r10 = r10 + r3
            r1.f21185t = r10     // Catch:{ h -> 0x0955 }
            goto L_0x0745
        L_0x0829:
            r10 = 97
            if (r3 < r10) goto L_0x083e
            r10 = 102(0x66, float:1.43E-43)
            if (r3 > r10) goto L_0x083e
            int r10 = r1.f21185t     // Catch:{ h -> 0x0955 }
            int r10 = r10 * 16
            int r3 = r3 + 10
            int r3 = r3 + -97
            int r10 = r10 + r3
            r1.f21185t = r10     // Catch:{ h -> 0x0955 }
            goto L_0x0745
        L_0x083e:
            r10 = 65
            if (r3 < r10) goto L_0x0853
            r10 = 70
            if (r3 > r10) goto L_0x0853
            int r10 = r1.f21185t     // Catch:{ h -> 0x0955 }
            int r10 = r10 * 16
            int r3 = r3 + 10
            int r3 = r3 + -65
            int r10 = r10 + r3
            r1.f21185t = r10     // Catch:{ h -> 0x0955 }
            goto L_0x0745
        L_0x0853:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ h -> 0x0955 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ h -> 0x0955 }
            r4.<init>()     // Catch:{ h -> 0x0955 }
            java.lang.String r5 = "bad chunk char: "
            r4.append(r5)     // Catch:{ h -> 0x0955 }
            r4.append(r3)     // Catch:{ h -> 0x0955 }
            java.lang.String r3 = r4.toString()     // Catch:{ h -> 0x0955 }
            r2.<init>(r3)     // Catch:{ h -> 0x0955 }
            throw r2     // Catch:{ h -> 0x0955 }
        L_0x086a:
            r8 = 48
            r10 = 5
            r1.f21180o = r10     // Catch:{ h -> 0x0955 }
            goto L_0x0746
        L_0x0871:
            r8 = 48
            r10 = 5
            r1.f21181p = r3     // Catch:{ h -> 0x0955 }
            int r11 = r1.f21185t     // Catch:{ h -> 0x0955 }
            if (r11 != 0) goto L_0x08a7
            if (r3 != r2) goto L_0x0896
            h.a.a.d.e r2 = r1.f21171f     // Catch:{ h -> 0x0955 }
            boolean r2 = r2.mo34556F0()     // Catch:{ h -> 0x0955 }
            if (r2 == 0) goto L_0x0896
            h.a.a.d.e r2 = r1.f21171f     // Catch:{ h -> 0x0955 }
            byte r2 = r2.peek()     // Catch:{ h -> 0x0955 }
            r3 = 10
            if (r2 != r3) goto L_0x0896
            h.a.a.d.e r2 = r1.f21171f     // Catch:{ h -> 0x0955 }
            byte r2 = r2.get()     // Catch:{ h -> 0x0955 }
            r1.f21181p = r2     // Catch:{ h -> 0x0955 }
        L_0x0896:
            boolean r2 = r1.f21178m     // Catch:{ h -> 0x0955 }
            if (r2 == 0) goto L_0x089c
            r2 = 0
            goto L_0x089d
        L_0x089c:
            r2 = 7
        L_0x089d:
            r1.f21180o = r2     // Catch:{ h -> 0x0955 }
            h.a.a.c.n$a r2 = r1.f21166a     // Catch:{ h -> 0x0955 }
            long r3 = r1.f21184s     // Catch:{ h -> 0x0955 }
            r2.mo34204d(r3)     // Catch:{ h -> 0x0955 }
            return r6
        L_0x08a7:
            r3 = 6
            r1.f21180o = r3     // Catch:{ h -> 0x0955 }
            goto L_0x0746
        L_0x08ac:
            r8 = 48
            r9 = 2
            r10 = 5
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            byte r3 = r3.peek()     // Catch:{ h -> 0x0955 }
            r11 = 10
            if (r3 == r2) goto L_0x08d0
            if (r3 != r11) goto L_0x08bd
            goto L_0x08d0
        L_0x08bd:
            if (r3 > r5) goto L_0x08c6
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            r3.get()     // Catch:{ h -> 0x0955 }
            goto L_0x0748
        L_0x08c6:
            r3 = 0
            r1.f21185t = r3     // Catch:{ h -> 0x0959 }
            r1.f21186u = r3     // Catch:{ h -> 0x0959 }
            r3 = 4
            r1.f21180o = r3     // Catch:{ h -> 0x0955 }
            goto L_0x0748
        L_0x08d0:
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            byte r3 = r3.get()     // Catch:{ h -> 0x0955 }
            r1.f21181p = r3     // Catch:{ h -> 0x0955 }
            goto L_0x0748
        L_0x08da:
            long r4 = r1.f21183r     // Catch:{ h -> 0x0955 }
            long r7 = r1.f21184s     // Catch:{ h -> 0x0955 }
            long r4 = r4 - r7
            r12 = 0
            int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x08f6
            boolean r2 = r1.f21178m     // Catch:{ h -> 0x0955 }
            if (r2 == 0) goto L_0x08eb
            r7 = 0
            goto L_0x08ec
        L_0x08eb:
            r7 = 7
        L_0x08ec:
            r1.f21180o = r7     // Catch:{ h -> 0x0955 }
            h.a.a.c.n$a r2 = r1.f21166a     // Catch:{ h -> 0x0955 }
            long r3 = r1.f21184s     // Catch:{ h -> 0x0955 }
            r2.mo34204d(r3)     // Catch:{ h -> 0x0955 }
            return r6
        L_0x08f6:
            long r7 = (long) r3     // Catch:{ h -> 0x0955 }
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x08fc
            int r3 = (int) r4     // Catch:{ h -> 0x0955 }
        L_0x08fc:
            h.a.a.d.e r2 = r1.f21171f     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r2 = r2.get(r3)     // Catch:{ h -> 0x0955 }
            long r3 = r1.f21184s     // Catch:{ h -> 0x0955 }
            int r5 = r2.length()     // Catch:{ h -> 0x0955 }
            long r7 = (long) r5     // Catch:{ h -> 0x0955 }
            long r3 = r3 + r7
            r1.f21184s = r3     // Catch:{ h -> 0x0955 }
            h.a.a.d.t r3 = r1.f21179n     // Catch:{ h -> 0x0955 }
            r3.mo34661e(r2)     // Catch:{ h -> 0x0955 }
            h.a.a.c.n$a r3 = r1.f21166a     // Catch:{ h -> 0x0955 }
            r3.mo34201a(r2)     // Catch:{ h -> 0x0955 }
            long r2 = r1.f21184s     // Catch:{ h -> 0x0955 }
            long r4 = r1.f21183r     // Catch:{ h -> 0x0955 }
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x092e
            boolean r2 = r1.f21178m     // Catch:{ h -> 0x0955 }
            if (r2 == 0) goto L_0x0924
            r7 = 0
            goto L_0x0925
        L_0x0924:
            r7 = 7
        L_0x0925:
            r1.f21180o = r7     // Catch:{ h -> 0x0955 }
            h.a.a.c.n$a r2 = r1.f21166a     // Catch:{ h -> 0x0955 }
            long r3 = r1.f21184s     // Catch:{ h -> 0x0955 }
            r2.mo34204d(r3)     // Catch:{ h -> 0x0955 }
        L_0x092e:
            return r6
        L_0x092f:
            h.a.a.d.e r2 = r1.f21171f     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            int r3 = r3.length()     // Catch:{ h -> 0x0955 }
            h.a.a.d.e r2 = r2.get(r3)     // Catch:{ h -> 0x0955 }
            long r3 = r1.f21184s     // Catch:{ h -> 0x0955 }
            int r5 = r2.length()     // Catch:{ h -> 0x0955 }
            long r7 = (long) r5     // Catch:{ h -> 0x0955 }
            long r3 = r3 + r7
            r1.f21184s = r3     // Catch:{ h -> 0x0955 }
            h.a.a.d.t r3 = r1.f21179n     // Catch:{ h -> 0x0955 }
            r3.mo34661e(r2)     // Catch:{ h -> 0x0955 }
            h.a.a.c.n$a r3 = r1.f21166a     // Catch:{ h -> 0x0955 }
            r3.mo34201a(r2)     // Catch:{ h -> 0x0955 }
            return r6
        L_0x0950:
            h.a.a.d.e r3 = r1.f21171f     // Catch:{ h -> 0x0955 }
            goto L_0x0735
        L_0x0954:
            return r4
        L_0x0955:
            r0 = move-exception
            r2 = r0
            r3 = 0
            goto L_0x095b
        L_0x0959:
            r0 = move-exception
            r2 = r0
        L_0x095b:
            r1.f21178m = r3
            r3 = 7
            r1.f21180o = r3
            goto L_0x0962
        L_0x0961:
            throw r2
        L_0x0962:
            goto L_0x0961
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p216c.C10912n.mo34528p():int");
    }

    /* renamed from: q */
    public void mo34529q(boolean z) {
        this.f21187v = z;
    }

    public void reset() {
        C10929e eVar;
        C10950t tVar = this.f21179n;
        tVar.mo34592v0(tVar.mo34562S0());
        this.f21180o = this.f21178m ? -14 : this.f21168c.mo34369s() ? 0 : 7;
        this.f21183r = -3;
        this.f21184s = 0;
        this.f21182q = 0;
        this.f21176k = 0;
        if (this.f21181p == 13 && (eVar = this.f21171f) != null && eVar.mo34556F0() && this.f21171f.peek() == 10) {
            this.f21181p = this.f21171f.get();
        }
        C10929e eVar2 = this.f21170e;
        if (eVar2 != null && eVar2.mo34556F0()) {
            C10929e eVar3 = this.f21169d;
            if (eVar3 == null) {
                mo34523k();
            } else {
                eVar3.mo34573e1(-1);
                this.f21169d.mo34555D0();
            }
            int I0 = this.f21169d.mo34558I0();
            if (I0 > this.f21170e.length()) {
                I0 = this.f21170e.length();
            }
            C10929e eVar4 = this.f21170e;
            eVar4.mo34582i(eVar4.getIndex(), I0);
            C10929e eVar5 = this.f21170e;
            eVar5.mo34591u0(this.f21169d.mo34567Z(eVar5.mo34582i(eVar5.getIndex(), I0)));
        }
        C10929e eVar6 = this.f21169d;
        if (eVar6 != null) {
            eVar6.mo34573e1(-1);
            this.f21169d.mo34555D0();
        }
        C10929e eVar7 = this.f21170e;
        if (eVar7 != null) {
            eVar7.mo34573e1(-1);
        }
        this.f21171f = this.f21169d;
        mo34516d();
    }

    public String toString() {
        return String.format("%s{s=%d,l=%d,c=%d}", new Object[]{C10912n.class.getSimpleName(), Integer.valueOf(this.f21180o), Integer.valueOf(this.f21182q), Long.valueOf(this.f21183r)});
    }
}
