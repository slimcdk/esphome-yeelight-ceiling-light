package org.eclipse.jetty.http;

import java.io.IOException;
import org.eclipse.jetty.p195io.Buffers;
import org.eclipse.jetty.p195io.EofException;
import org.eclipse.jetty.p195io.bio.C9922b;
import p152e6.C9001b;
import p152e6.C9003c;
import p225w5.C11940d;
import p225w5.C11942e;
import p225w5.C11950k;
import p225w5.C11952m;

/* renamed from: org.eclipse.jetty.http.m */
public class C9910m implements C9917s {

    /* renamed from: w */
    private static final C9003c f18099w = C9001b.m21450a(C9910m.class);

    /* renamed from: a */
    private final C9911a f18100a;

    /* renamed from: b */
    private final Buffers f18101b;

    /* renamed from: c */
    private final C11950k f18102c;

    /* renamed from: d */
    private C11940d f18103d;

    /* renamed from: e */
    private C11940d f18104e;

    /* renamed from: f */
    private C11940d f18105f;

    /* renamed from: g */
    private C11942e.C11943a f18106g;

    /* renamed from: h */
    private final C11952m.C11953a f18107h;

    /* renamed from: i */
    private final C11952m.C11953a f18108i;

    /* renamed from: j */
    private String f18109j;

    /* renamed from: k */
    private int f18110k;

    /* renamed from: l */
    private boolean f18111l;

    /* renamed from: m */
    private boolean f18112m;

    /* renamed from: n */
    protected final C11952m f18113n = new C11952m();

    /* renamed from: o */
    protected int f18114o = -14;

    /* renamed from: p */
    protected byte f18115p;

    /* renamed from: q */
    protected int f18116q;

    /* renamed from: r */
    protected long f18117r;

    /* renamed from: s */
    protected long f18118s;

    /* renamed from: t */
    protected int f18119t;

    /* renamed from: u */
    protected int f18120u;

    /* renamed from: v */
    private boolean f18121v;

    /* renamed from: org.eclipse.jetty.http.m$a */
    public static abstract class C9911a {
        /* renamed from: a */
        public abstract void mo39532a(C11940d dVar);

        /* renamed from: b */
        public abstract void mo39533b();

        /* renamed from: c */
        public abstract void mo39534c();

        /* renamed from: d */
        public abstract void mo39535d(long j);

        /* renamed from: e */
        public abstract void mo39536e(C11940d dVar, C11940d dVar2);

        /* renamed from: f */
        public abstract void mo39537f(C11940d dVar, C11940d dVar2, C11940d dVar3);

        /* renamed from: g */
        public abstract void mo39538g(C11940d dVar, int i, C11940d dVar2);
    }

    public C9910m(Buffers buffers, C11950k kVar, C9911a aVar) {
        this.f18101b = buffers;
        this.f18102c = kVar;
        this.f18100a = aVar;
        this.f18107h = new C11952m.C11953a();
        this.f18108i = new C11952m.C11953a();
    }

    /* renamed from: a */
    public boolean mo39835a() {
        return mo39849o(-14);
    }

    /* renamed from: b */
    public boolean mo39836b() {
        boolean z = mo39850p() > 0;
        while (!mo39839e() && (r3 = this.f18105f) != null && r3.length() > 0) {
            z |= mo39850p() > 0;
        }
        return z;
    }

    /* renamed from: c */
    public void mo39837c(boolean z) {
        this.f18112m = z;
        if (!z) {
            int i = this.f18114o;
            if (i == 0 || i == -14) {
                this.f18114o = 7;
            }
        }
    }

    /* renamed from: d */
    public void mo39838d() {
        Buffers buffers;
        Buffers buffers2;
        C11940d dVar = this.f18104e;
        if (dVar != null && !dVar.mo42408J0() && this.f18104e.mo42424d0() == -1 && (buffers2 = this.f18101b) != null) {
            C11940d dVar2 = this.f18105f;
            C11940d dVar3 = this.f18104e;
            if (dVar2 == dVar3) {
                this.f18105f = this.f18103d;
            }
            if (buffers2 != null) {
                buffers2.mo39862b(dVar3);
            }
            this.f18104e = null;
        }
        C11940d dVar4 = this.f18103d;
        if (dVar4 != null && !dVar4.mo42408J0() && this.f18103d.mo42424d0() == -1 && (buffers = this.f18101b) != null) {
            C11940d dVar5 = this.f18105f;
            C11940d dVar6 = this.f18103d;
            if (dVar5 == dVar6) {
                this.f18105f = null;
            }
            buffers.mo39862b(dVar6);
            this.f18103d = null;
        }
    }

    /* renamed from: e */
    public boolean mo39839e() {
        return mo39849o(0);
    }

    /* renamed from: f */
    public boolean mo39840f() {
        return this.f18112m;
    }

    /* renamed from: g */
    public int mo39841g() {
        C11952m mVar = this.f18113n;
        if (mVar != null && mVar.length() > 0) {
            return this.f18113n.length();
        }
        if (!this.f18102c.mo39666o()) {
            mo39850p();
            C11952m mVar2 = this.f18113n;
            if (mVar2 == null) {
                return 0;
            }
            return mVar2.length();
        } else if (this.f18114o <= 0) {
            return 0;
        } else {
            C11950k kVar = this.f18102c;
            return (!(kVar instanceof C9922b) || ((C9922b) kVar).mo39876B().available() <= 0) ? 0 : 1;
        }
    }

    /* renamed from: h */
    public C11940d mo39842h(long j) {
        if (this.f18113n.length() > 0) {
            return this.f18113n;
        }
        if (mo39846l() <= 0 || mo39849o(7)) {
            return null;
        }
        loop0:
        while (true) {
            try {
                mo39850p();
                while (this.f18113n.length() == 0 && !mo39849o(0) && !mo39849o(7) && (r2 = this.f18102c) != null && r2.isOpen()) {
                    if (!this.f18102c.mo39666o()) {
                        if (mo39850p() <= 0) {
                            if (!this.f18102c.mo39665n(j)) {
                                this.f18102c.close();
                                throw new EofException("timeout");
                            }
                        }
                    }
                }
            } catch (IOException e) {
                this.f18102c.close();
                throw e;
            }
        }
        if (this.f18113n.length() > 0) {
            return this.f18113n;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo39843i() {
        C11940d dVar;
        C11940d dVar2;
        C11940d dVar3;
        if (this.f18105f == null) {
            this.f18105f = mo39845k();
        }
        if (this.f18114o <= 0 || this.f18105f != (dVar2 = this.f18103d) || dVar2 == null || dVar2.mo42408J0() || (dVar3 = this.f18104e) == null || !dVar3.mo42408J0()) {
            C11940d dVar4 = this.f18105f;
            C11940d dVar5 = this.f18103d;
            if (dVar4 == dVar5 && this.f18114o > 0 && dVar5.length() == 0 && ((this.f18111l || this.f18117r - this.f18118s > ((long) this.f18103d.capacity())) && !((dVar = this.f18104e) == null && this.f18101b == null))) {
                if (dVar == null) {
                    this.f18104e = this.f18101b.mo39861a();
                }
                this.f18105f = this.f18104e;
            }
            if (this.f18102c == null) {
                return -1;
            }
            C11940d dVar6 = this.f18105f;
            if (dVar6 == this.f18104e || this.f18114o > 0) {
                dVar6.mo42407H0();
            }
            if (this.f18105f.mo42410M0() == 0) {
                f18099w.mo36847b("HttpParser Full for {} ", this.f18102c);
                this.f18105f.clear();
                StringBuilder sb = new StringBuilder();
                sb.append("FULL ");
                sb.append(this.f18105f == this.f18104e ? "body" : "head");
                throw new HttpException(413, sb.toString());
            }
            try {
                return this.f18102c.mo26552z(this.f18105f);
            } catch (IOException e) {
                e = e;
                f18099w.mo36848c(e);
                if (!(e instanceof EofException)) {
                    e = new EofException((Throwable) e);
                }
                throw e;
            }
        } else {
            C11940d dVar7 = this.f18104e;
            this.f18105f = dVar7;
            return dVar7.length();
        }
    }

    /* renamed from: j */
    public long mo39844j() {
        return this.f18117r;
    }

    /* renamed from: k */
    public C11940d mo39845k() {
        if (this.f18103d == null) {
            C11940d d = this.f18101b.mo39864d();
            this.f18103d = d;
            this.f18107h.mo42496e(d);
            this.f18108i.mo42496e(this.f18103d);
        }
        return this.f18103d;
    }

    /* renamed from: l */
    public int mo39846l() {
        return this.f18114o;
    }

    /* renamed from: m */
    public boolean mo39847m() {
        return this.f18117r == -2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f18104e;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo39848n() {
        /*
            r1 = this;
            w5.d r0 = r1.f18103d
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.mo42408J0()
            if (r0 != 0) goto L_0x0014
        L_0x000a:
            w5.d r0 = r1.f18104e
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.mo42408J0()
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.http.C9910m.mo39848n():boolean");
    }

    /* renamed from: o */
    public boolean mo39849o(int i) {
        return this.f18114o == i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0355, code lost:
        if (r7 <= 0) goto L_0x0357;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0537, code lost:
        r1.f18109j = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x05b4, code lost:
        r1.f18114o = -9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x06c7, code lost:
        r3 = r1.f18110k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x06c9, code lost:
        if (r3 <= 0) goto L_0x06e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x06cd, code lost:
        if (r1.f18121v == false) goto L_0x06e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x06d1, code lost:
        if (r1.f18112m != false) goto L_0x06de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x06d5, code lost:
        if (r3 < 100) goto L_0x06dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x06d9, code lost:
        if (r3 >= 200) goto L_0x06dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x06dc, code lost:
        r3 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x06de, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x06df, code lost:
        r1.f18114o = r3;
        r1.f18100a.mo39535d(r1.f18117r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x06e8, code lost:
        r3 = r1.f18105f.length();
        r7 = r1.f18114o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x06f0, code lost:
        r8 = r1.f18114o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x06f2, code lost:
        if (r8 <= 0) goto L_0x092c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x06f4, code lost:
        if (r3 <= 0) goto L_0x092c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x06f6, code lost:
        if (r7 == r8) goto L_0x06fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x06f8, code lost:
        r4 = r4 + 1;
        r7 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x06fd, code lost:
        if (r1.f18115p != 13) goto L_0x0718;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0707, code lost:
        if (r1.f18105f.peek() != 10) goto L_0x0718;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0709, code lost:
        r1.f18115p = r1.f18105f.get();
        r3 = r1.f18105f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0713, code lost:
        r3 = r3.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0718, code lost:
        r1.f18115p = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x071d, code lost:
        switch(r1.f18114o) {
            case 1: goto L_0x0909;
            case 2: goto L_0x08b8;
            case 3: goto L_0x088a;
            case 4: goto L_0x07df;
            case 5: goto L_0x0796;
            case 6: goto L_0x0763;
            case 7: goto L_0x072a;
            default: goto L_0x0720;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0731, code lost:
        if (r1.f18105f.length() <= 2) goto L_0x073b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0733, code lost:
        r1.f18114o = 0;
        r1.f18102c.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0741, code lost:
        if (r1.f18105f.length() <= 0) goto L_0x075d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x074d, code lost:
        if (java.lang.Character.isWhitespace(r1.f18105f.get()) != false) goto L_0x073b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x074f, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:?, code lost:
        r1.f18114o = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:?, code lost:
        r1.f18102c.close();
        r1.f18105f.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x075d, code lost:
        r1.f18105f.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0763, code lost:
        r8 = r1.f18119t - r1.f18120u;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0769, code lost:
        if (r8 != 0) goto L_0x076f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x076b, code lost:
        r1.f18114o = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x076f, code lost:
        if (r3 <= r8) goto L_0x0772;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0771, code lost:
        r3 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0772, code lost:
        r2 = r1.f18105f.get(r3);
        r1.f18118s += (long) r2.length();
        r1.f18120u += r2.length();
        r1.f18113n.mo42496e(r2);
        r1.f18100a.mo39532a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0795, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0796, code lost:
        r3 = r1.f18105f.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x079d, code lost:
        if (r3 == 13) goto L_0x07a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x07a1, code lost:
        if (r3 != 10) goto L_0x07a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x07a8, code lost:
        r1.f18115p = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x07ac, code lost:
        if (r1.f18119t != 0) goto L_0x07db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x07ae, code lost:
        if (r3 != 13) goto L_0x07ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x07b6, code lost:
        if (r1.f18105f.mo42408J0() == false) goto L_0x07ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x07c0, code lost:
        if (r1.f18105f.peek() != 10) goto L_0x07ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x07c2, code lost:
        r1.f18115p = r1.f18105f.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x07cc, code lost:
        if (r1.f18112m == false) goto L_0x07d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x07ce, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x07d0, code lost:
        r2 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x07d1, code lost:
        r1.f18114o = r2;
        r1.f18100a.mo39535d(r1.f18118s);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x07da, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x07db, code lost:
        r1.f18114o = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x07df, code lost:
        r3 = r1.f18105f.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x07e6, code lost:
        if (r3 == 13) goto L_0x084f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x07ea, code lost:
        if (r3 != 10) goto L_0x07ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x07ed, code lost:
        if (r3 <= 32) goto L_0x0848;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x07f1, code lost:
        if (r3 != 59) goto L_0x07f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x07f6, code lost:
        if (r3 < 48) goto L_0x0807;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x07fa, code lost:
        if (r3 > 57) goto L_0x0807;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x07fc, code lost:
        r1.f18119t = (r1.f18119t * 16) + (r3 - 48);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0809, code lost:
        if (r3 < 97) goto L_0x081c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x080d, code lost:
        if (r3 > 102) goto L_0x081c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x080f, code lost:
        r1.f18119t = (r1.f18119t * 16) + ((r3 + 10) - 97);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x081e, code lost:
        if (r3 < 65) goto L_0x0831;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0822, code lost:
        if (r3 > 70) goto L_0x0831;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0824, code lost:
        r1.f18119t = (r1.f18119t * 16) + ((r3 + 10) - 65);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0847, code lost:
        throw new java.io.IOException("bad chunk char: " + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0848, code lost:
        r1.f18114o = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x084f, code lost:
        r1.f18115p = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0856, code lost:
        if (r1.f18119t != 0) goto L_0x0885;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0858, code lost:
        if (r3 != 13) goto L_0x0874;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0860, code lost:
        if (r1.f18105f.mo42408J0() == false) goto L_0x0874;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x086a, code lost:
        if (r1.f18105f.peek() != 10) goto L_0x0874;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x086c, code lost:
        r1.f18115p = r1.f18105f.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0876, code lost:
        if (r1.f18112m == false) goto L_0x087a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0878, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x087a, code lost:
        r2 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x087b, code lost:
        r1.f18114o = r2;
        r1.f18100a.mo39535d(r1.f18118s);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0884, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0885, code lost:
        r1.f18114o = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x088a, code lost:
        r3 = r1.f18105f.peek();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0896, code lost:
        if (r3 == 13) goto L_0x08ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0898, code lost:
        if (r3 != 10) goto L_0x089b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x089b, code lost:
        if (r3 > 32) goto L_0x08a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x089d, code lost:
        r1.f18105f.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x08a4, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:?, code lost:
        r1.f18119t = 0;
        r1.f18120u = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:?, code lost:
        r1.f18114o = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x08ae, code lost:
        r1.f18115p = r1.f18105f.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x08b8, code lost:
        r4 = r1.f18117r;
        r7 = r1.f18118s;
        r4 = r4 - r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x08c1, code lost:
        if (r4 != 0) goto L_0x08d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x08c5, code lost:
        if (r1.f18112m == false) goto L_0x08c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x08c7, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x08c9, code lost:
        r2 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x08ca, code lost:
        r1.f18114o = r2;
        r1.f18100a.mo39535d(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x08d1, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x08d5, code lost:
        if (((long) r3) <= r4) goto L_0x08d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x08d7, code lost:
        r3 = (int) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x08d8, code lost:
        r2 = r1.f18105f.get(r3);
        r1.f18118s += (long) r2.length();
        r1.f18113n.mo42496e(r2);
        r1.f18100a.mo39532a(r2);
        r2 = r1.f18118s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x08f8, code lost:
        if (r2 != r1.f18117r) goto L_0x0908;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x08fc, code lost:
        if (r1.f18112m == false) goto L_0x0900;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x08fe, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0900, code lost:
        r7 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0901, code lost:
        r1.f18114o = r7;
        r1.f18100a.mo39535d(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0908, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0909, code lost:
        r2 = r1.f18105f;
        r2 = r2.get(r2.length());
        r1.f18118s += (long) r2.length();
        r1.f18113n.mo42496e(r2);
        r1.f18100a.mo39532a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0927, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0928, code lost:
        r3 = r1.f18105f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x092c, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0118, code lost:
        r12 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0127, code lost:
        r1.f18116q = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x018f, code lost:
        r1.f18114o = -2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x03fa A[Catch:{ NumberFormatException -> 0x035b, HttpException -> 0x092d }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0442 A[Catch:{ NumberFormatException -> 0x035b, HttpException -> 0x092d }] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0488 A[Catch:{ NumberFormatException -> 0x035b, HttpException -> 0x092d }] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x048c A[Catch:{ NumberFormatException -> 0x035b, HttpException -> 0x092d }] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0490 A[Catch:{ NumberFormatException -> 0x035b, HttpException -> 0x092d }] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x04c4 A[Catch:{ NumberFormatException -> 0x035b, HttpException -> 0x092d }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0064 A[Catch:{ HttpException -> 0x0931 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0067 A[Catch:{ HttpException -> 0x0931 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bf A[Catch:{ HttpException -> 0x0931 }] */
    /* JADX WARNING: Removed duplicated region for block: B:527:0x06c7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:532:0x043a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d3 A[Catch:{ HttpException -> 0x0931 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f0 A[Catch:{ HttpException -> 0x0931 }] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo39850p() {
        /*
            r16 = this;
            r1 = r16
            r2 = 7
            r3 = 0
            int r4 = r1.f18114o     // Catch:{ HttpException -> 0x0931 }
            if (r4 != 0) goto L_0x0009
            return r3
        L_0x0009:
            w5.d r4 = r1.f18105f     // Catch:{ HttpException -> 0x0931 }
            if (r4 != 0) goto L_0x0013
            w5.d r4 = r16.mo39845k()     // Catch:{ HttpException -> 0x0931 }
            r1.f18105f = r4     // Catch:{ HttpException -> 0x0931 }
        L_0x0013:
            int r4 = r1.f18114o     // Catch:{ HttpException -> 0x0931 }
            r5 = 2
            r6 = 1
            if (r4 != r5) goto L_0x0029
            long r7 = r1.f18118s     // Catch:{ HttpException -> 0x0931 }
            long r9 = r1.f18117r     // Catch:{ HttpException -> 0x0931 }
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x0029
            r1.f18114o = r3     // Catch:{ HttpException -> 0x0931 }
            org.eclipse.jetty.http.m$a r4 = r1.f18100a     // Catch:{ HttpException -> 0x0931 }
            r4.mo39535d(r7)     // Catch:{ HttpException -> 0x0931 }
            return r6
        L_0x0029:
            w5.d r4 = r1.f18105f     // Catch:{ HttpException -> 0x0931 }
            int r4 = r4.length()     // Catch:{ HttpException -> 0x0931 }
            r8 = -1
            if (r4 != 0) goto L_0x00dc
            int r4 = r16.mo39843i()     // Catch:{ IOException -> 0x0056 }
            e6.c r9 = f18099w     // Catch:{ IOException -> 0x0053 }
            java.lang.String r10 = "filled {}/{}"
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x0053 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x0053 }
            r11[r3] = r12     // Catch:{ IOException -> 0x0053 }
            w5.d r12 = r1.f18105f     // Catch:{ IOException -> 0x0053 }
            int r12 = r12.length()     // Catch:{ IOException -> 0x0053 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ IOException -> 0x0053 }
            r11[r6] = r12     // Catch:{ IOException -> 0x0053 }
            r9.mo36850e(r10, r11)     // Catch:{ IOException -> 0x0053 }
            r9 = 0
            goto L_0x0062
        L_0x0053:
            r0 = move-exception
            r9 = r0
            goto L_0x0059
        L_0x0056:
            r0 = move-exception
            r9 = r0
            r4 = -1
        L_0x0059:
            e6.c r10 = f18099w     // Catch:{ HttpException -> 0x0931 }
            java.lang.String r11 = r16.toString()     // Catch:{ HttpException -> 0x0931 }
            r10.mo36854h(r11, r9)     // Catch:{ HttpException -> 0x0931 }
        L_0x0062:
            if (r4 <= 0) goto L_0x0067
            r4 = 1
            goto L_0x00d5
        L_0x0067:
            if (r4 >= 0) goto L_0x00d4
            r1.f18112m = r3     // Catch:{ HttpException -> 0x0931 }
            int r4 = r1.f18114o     // Catch:{ HttpException -> 0x0931 }
            if (r4 <= 0) goto L_0x0099
            w5.d r4 = r1.f18105f     // Catch:{ HttpException -> 0x0931 }
            int r4 = r4.length()     // Catch:{ HttpException -> 0x0931 }
            if (r4 <= 0) goto L_0x0099
            boolean r4 = r1.f18121v     // Catch:{ HttpException -> 0x0931 }
            if (r4 != 0) goto L_0x0099
            w5.d r4 = r1.f18105f     // Catch:{ HttpException -> 0x0931 }
            int r5 = r4.length()     // Catch:{ HttpException -> 0x0931 }
            w5.d r4 = r4.get(r5)     // Catch:{ HttpException -> 0x0931 }
            long r10 = r1.f18118s     // Catch:{ HttpException -> 0x0931 }
            int r5 = r4.length()     // Catch:{ HttpException -> 0x0931 }
            long r12 = (long) r5     // Catch:{ HttpException -> 0x0931 }
            long r10 = r10 + r12
            r1.f18118s = r10     // Catch:{ HttpException -> 0x0931 }
            w5.m r5 = r1.f18113n     // Catch:{ HttpException -> 0x0931 }
            r5.mo42496e(r4)     // Catch:{ HttpException -> 0x0931 }
            org.eclipse.jetty.http.m$a r5 = r1.f18100a     // Catch:{ HttpException -> 0x0931 }
            r5.mo39532a(r4)     // Catch:{ HttpException -> 0x0931 }
        L_0x0099:
            int r4 = r1.f18114o     // Catch:{ HttpException -> 0x0931 }
            if (r4 == 0) goto L_0x00bb
            if (r4 == r6) goto L_0x00b4
            if (r4 == r2) goto L_0x00bb
            r1.f18114o = r3     // Catch:{ HttpException -> 0x0931 }
            boolean r4 = r1.f18121v     // Catch:{ HttpException -> 0x0931 }
            if (r4 != 0) goto L_0x00ac
            org.eclipse.jetty.http.m$a r4 = r1.f18100a     // Catch:{ HttpException -> 0x0931 }
            r4.mo39533b()     // Catch:{ HttpException -> 0x0931 }
        L_0x00ac:
            org.eclipse.jetty.http.m$a r4 = r1.f18100a     // Catch:{ HttpException -> 0x0931 }
            long r5 = r1.f18118s     // Catch:{ HttpException -> 0x0931 }
        L_0x00b0:
            r4.mo39535d(r5)     // Catch:{ HttpException -> 0x0931 }
            goto L_0x00bd
        L_0x00b4:
            r1.f18114o = r3     // Catch:{ HttpException -> 0x0931 }
            org.eclipse.jetty.http.m$a r4 = r1.f18100a     // Catch:{ HttpException -> 0x0931 }
            long r5 = r1.f18118s     // Catch:{ HttpException -> 0x0931 }
            goto L_0x00b0
        L_0x00bb:
            r1.f18114o = r3     // Catch:{ HttpException -> 0x0931 }
        L_0x00bd:
            if (r9 != 0) goto L_0x00d3
            boolean r4 = r16.mo39839e()     // Catch:{ HttpException -> 0x0931 }
            if (r4 != 0) goto L_0x00d2
            boolean r4 = r16.mo39835a()     // Catch:{ HttpException -> 0x0931 }
            if (r4 == 0) goto L_0x00cc
            goto L_0x00d2
        L_0x00cc:
            org.eclipse.jetty.io.EofException r4 = new org.eclipse.jetty.io.EofException     // Catch:{ HttpException -> 0x0931 }
            r4.<init>()     // Catch:{ HttpException -> 0x0931 }
            throw r4     // Catch:{ HttpException -> 0x0931 }
        L_0x00d2:
            return r8
        L_0x00d3:
            throw r9     // Catch:{ HttpException -> 0x0931 }
        L_0x00d4:
            r4 = 0
        L_0x00d5:
            w5.d r9 = r1.f18105f     // Catch:{ HttpException -> 0x0931 }
            int r9 = r9.length()     // Catch:{ HttpException -> 0x0931 }
            goto L_0x00de
        L_0x00dc:
            r9 = r4
            r4 = 0
        L_0x00de:
            w5.d r10 = r1.f18105f     // Catch:{ HttpException -> 0x0931 }
            byte[] r10 = r10.mo42451g0()     // Catch:{ HttpException -> 0x0931 }
            int r11 = r1.f18114o     // Catch:{ HttpException -> 0x0931 }
        L_0x00e6:
            int r12 = r1.f18114o     // Catch:{ HttpException -> 0x0931 }
            r2 = 13
            r5 = 32
            r13 = 10
            if (r12 >= 0) goto L_0x06c7
            int r14 = r9 + -1
            if (r9 <= 0) goto L_0x06c7
            if (r11 == r12) goto L_0x00f9
            int r4 = r4 + 1
            r11 = r12
        L_0x00f9:
            w5.d r9 = r1.f18105f     // Catch:{ HttpException -> 0x0931 }
            byte r9 = r9.get()     // Catch:{ HttpException -> 0x0931 }
            byte r12 = r1.f18115p     // Catch:{ HttpException -> 0x0931 }
            if (r12 != r2) goto L_0x010b
            if (r9 != r13) goto L_0x010b
            r1.f18115p = r13     // Catch:{ HttpException -> 0x0931 }
            r12 = r14
        L_0x0108:
            r2 = -1
            goto L_0x069b
        L_0x010b:
            r1.f18115p = r3     // Catch:{ HttpException -> 0x0931 }
            int r12 = r1.f18114o     // Catch:{ HttpException -> 0x0931 }
            java.lang.String r15 = "ISO-8859-1"
            r7 = -2
            r3 = 9
            r8 = -5
            switch(r12) {
                case -14: goto L_0x06b0;
                case -13: goto L_0x0672;
                case -12: goto L_0x0646;
                case -11: goto L_0x05e5;
                case -10: goto L_0x059f;
                case -9: goto L_0x053b;
                case -8: goto L_0x0118;
                case -7: goto L_0x0118;
                case -6: goto L_0x04d4;
                case -5: goto L_0x02da;
                case -4: goto L_0x0270;
                case -3: goto L_0x021b;
                case -2: goto L_0x0192;
                case -1: goto L_0x011d;
                default: goto L_0x0118;
            }
        L_0x0118:
            r12 = r14
        L_0x0119:
            r2 = -1
        L_0x011a:
            r3 = 0
            goto L_0x069b
        L_0x011d:
            if (r9 == r3) goto L_0x018f
            if (r9 == r13) goto L_0x012b
            if (r9 == r2) goto L_0x012b
            if (r9 == r5) goto L_0x018f
            int r2 = r1.f18116q     // Catch:{ HttpException -> 0x092d }
        L_0x0127:
            int r2 = r2 + r6
            r1.f18116q = r2     // Catch:{ HttpException -> 0x092d }
            goto L_0x0118
        L_0x012b:
            int r2 = r1.f18116q     // Catch:{ HttpException -> 0x092d }
            if (r2 <= 0) goto L_0x018a
            w5.m$a r2 = r1.f18108i     // Catch:{ HttpException -> 0x092d }
            int r2 = r2.length()     // Catch:{ HttpException -> 0x092d }
            if (r2 != 0) goto L_0x014c
            w5.m$a r2 = r1.f18108i     // Catch:{ HttpException -> 0x092d }
            w5.d r3 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r3 = r3.mo42424d0()     // Catch:{ HttpException -> 0x092d }
            w5.d r5 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r5 = r5.mo42424d0()     // Catch:{ HttpException -> 0x092d }
            int r7 = r1.f18116q     // Catch:{ HttpException -> 0x092d }
            int r5 = r5 + r7
            r2.mo42495d(r3, r5)     // Catch:{ HttpException -> 0x092d }
            goto L_0x018a
        L_0x014c:
            java.lang.String r2 = r1.f18109j     // Catch:{ HttpException -> 0x092d }
            if (r2 != 0) goto L_0x0158
            w5.m$a r2 = r1.f18108i     // Catch:{ HttpException -> 0x092d }
            java.lang.String r2 = r2.toString(r15)     // Catch:{ HttpException -> 0x092d }
            r1.f18109j = r2     // Catch:{ HttpException -> 0x092d }
        L_0x0158:
            w5.m$a r2 = r1.f18108i     // Catch:{ HttpException -> 0x092d }
            w5.d r3 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r3 = r3.mo42424d0()     // Catch:{ HttpException -> 0x092d }
            w5.d r5 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r5 = r5.mo42424d0()     // Catch:{ HttpException -> 0x092d }
            int r7 = r1.f18116q     // Catch:{ HttpException -> 0x092d }
            int r5 = r5 + r7
            r2.mo42495d(r3, r5)     // Catch:{ HttpException -> 0x092d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ HttpException -> 0x092d }
            r2.<init>()     // Catch:{ HttpException -> 0x092d }
            java.lang.String r3 = r1.f18109j     // Catch:{ HttpException -> 0x092d }
            r2.append(r3)     // Catch:{ HttpException -> 0x092d }
            java.lang.String r3 = " "
            r2.append(r3)     // Catch:{ HttpException -> 0x092d }
            w5.m$a r3 = r1.f18108i     // Catch:{ HttpException -> 0x092d }
            java.lang.String r3 = r3.toString(r15)     // Catch:{ HttpException -> 0x092d }
            r2.append(r3)     // Catch:{ HttpException -> 0x092d }
            java.lang.String r2 = r2.toString()     // Catch:{ HttpException -> 0x092d }
            r1.f18109j = r2     // Catch:{ HttpException -> 0x092d }
        L_0x018a:
            r1.f18115p = r9     // Catch:{ HttpException -> 0x092d }
        L_0x018c:
            r1.f18114o = r8     // Catch:{ HttpException -> 0x092d }
            goto L_0x0118
        L_0x018f:
            r1.f18114o = r7     // Catch:{ HttpException -> 0x092d }
            goto L_0x0118
        L_0x0192:
            if (r9 == r3) goto L_0x0118
            if (r9 == r13) goto L_0x01b8
            if (r9 == r2) goto L_0x01b8
            if (r9 == r5) goto L_0x0118
            int r2 = r1.f18116q     // Catch:{ HttpException -> 0x092d }
            r3 = -1
            if (r2 != r3) goto L_0x01a4
            w5.d r2 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            r2.mo42443w0()     // Catch:{ HttpException -> 0x092d }
        L_0x01a4:
            w5.d r2 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r2 = r2.mo42409L0()     // Catch:{ HttpException -> 0x092d }
            w5.d r3 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r3 = r3.mo42424d0()     // Catch:{ HttpException -> 0x092d }
            int r2 = r2 - r3
            r1.f18116q = r2     // Catch:{ HttpException -> 0x092d }
            r2 = -1
            r1.f18114o = r2     // Catch:{ HttpException -> 0x092d }
            goto L_0x0118
        L_0x01b8:
            int r2 = r1.f18116q     // Catch:{ HttpException -> 0x092d }
            if (r2 <= 0) goto L_0x0217
            w5.m$a r2 = r1.f18108i     // Catch:{ HttpException -> 0x092d }
            int r2 = r2.length()     // Catch:{ HttpException -> 0x092d }
            if (r2 != 0) goto L_0x01d9
            w5.m$a r2 = r1.f18108i     // Catch:{ HttpException -> 0x092d }
            w5.d r3 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r3 = r3.mo42424d0()     // Catch:{ HttpException -> 0x092d }
            w5.d r5 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r5 = r5.mo42424d0()     // Catch:{ HttpException -> 0x092d }
            int r7 = r1.f18116q     // Catch:{ HttpException -> 0x092d }
            int r5 = r5 + r7
            r2.mo42495d(r3, r5)     // Catch:{ HttpException -> 0x092d }
            goto L_0x0217
        L_0x01d9:
            java.lang.String r2 = r1.f18109j     // Catch:{ HttpException -> 0x092d }
            if (r2 != 0) goto L_0x01e5
            w5.m$a r2 = r1.f18108i     // Catch:{ HttpException -> 0x092d }
            java.lang.String r2 = r2.toString(r15)     // Catch:{ HttpException -> 0x092d }
            r1.f18109j = r2     // Catch:{ HttpException -> 0x092d }
        L_0x01e5:
            w5.m$a r2 = r1.f18108i     // Catch:{ HttpException -> 0x092d }
            w5.d r3 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r3 = r3.mo42424d0()     // Catch:{ HttpException -> 0x092d }
            w5.d r5 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r5 = r5.mo42424d0()     // Catch:{ HttpException -> 0x092d }
            int r7 = r1.f18116q     // Catch:{ HttpException -> 0x092d }
            int r5 = r5 + r7
            r2.mo42495d(r3, r5)     // Catch:{ HttpException -> 0x092d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ HttpException -> 0x092d }
            r2.<init>()     // Catch:{ HttpException -> 0x092d }
            java.lang.String r3 = r1.f18109j     // Catch:{ HttpException -> 0x092d }
            r2.append(r3)     // Catch:{ HttpException -> 0x092d }
            java.lang.String r3 = " "
            r2.append(r3)     // Catch:{ HttpException -> 0x092d }
            w5.m$a r3 = r1.f18108i     // Catch:{ HttpException -> 0x092d }
            java.lang.String r3 = r3.toString(r15)     // Catch:{ HttpException -> 0x092d }
            r2.append(r3)     // Catch:{ HttpException -> 0x092d }
            java.lang.String r2 = r2.toString()     // Catch:{ HttpException -> 0x092d }
            r1.f18109j = r2     // Catch:{ HttpException -> 0x092d }
        L_0x0217:
            r1.f18115p = r9     // Catch:{ HttpException -> 0x092d }
            goto L_0x018c
        L_0x021b:
            if (r9 == r3) goto L_0x026b
            if (r9 == r13) goto L_0x024f
            if (r9 == r2) goto L_0x024f
            if (r9 == r5) goto L_0x026b
            r2 = 58
            if (r9 == r2) goto L_0x022e
            r2 = 0
            r1.f18106g = r2     // Catch:{ HttpException -> 0x092d }
            int r2 = r1.f18116q     // Catch:{ HttpException -> 0x092d }
            goto L_0x0127
        L_0x022e:
            int r2 = r1.f18116q     // Catch:{ HttpException -> 0x092d }
            if (r2 <= 0) goto L_0x024a
            w5.e$a r2 = r1.f18106g     // Catch:{ HttpException -> 0x092d }
            if (r2 != 0) goto L_0x024a
            w5.m$a r2 = r1.f18107h     // Catch:{ HttpException -> 0x092d }
            w5.d r3 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r3 = r3.mo42424d0()     // Catch:{ HttpException -> 0x092d }
            w5.d r5 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r5 = r5.mo42424d0()     // Catch:{ HttpException -> 0x092d }
            int r8 = r1.f18116q     // Catch:{ HttpException -> 0x092d }
            int r5 = r5 + r8
            r2.mo42495d(r3, r5)     // Catch:{ HttpException -> 0x092d }
        L_0x024a:
            r2 = -1
            r1.f18116q = r2     // Catch:{ HttpException -> 0x092d }
            goto L_0x018f
        L_0x024f:
            int r2 = r1.f18116q     // Catch:{ HttpException -> 0x092d }
            if (r2 <= 0) goto L_0x0267
            w5.m$a r2 = r1.f18107h     // Catch:{ HttpException -> 0x092d }
            w5.d r3 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r3 = r3.mo42424d0()     // Catch:{ HttpException -> 0x092d }
            w5.d r5 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r5 = r5.mo42424d0()     // Catch:{ HttpException -> 0x092d }
            int r7 = r1.f18116q     // Catch:{ HttpException -> 0x092d }
            int r5 = r5 + r7
            r2.mo42495d(r3, r5)     // Catch:{ HttpException -> 0x092d }
        L_0x0267:
            r1.f18115p = r9     // Catch:{ HttpException -> 0x092d }
            goto L_0x018c
        L_0x026b:
            r2 = -4
            r1.f18114o = r2     // Catch:{ HttpException -> 0x092d }
            goto L_0x0118
        L_0x0270:
            if (r9 == r3) goto L_0x0118
            if (r9 == r13) goto L_0x02be
            if (r9 == r2) goto L_0x02be
            if (r9 == r5) goto L_0x0118
            r2 = 58
            if (r9 == r2) goto L_0x029d
            r2 = 0
            r1.f18106g = r2     // Catch:{ HttpException -> 0x092d }
            int r2 = r1.f18116q     // Catch:{ HttpException -> 0x092d }
            r3 = -1
            if (r2 != r3) goto L_0x0289
            w5.d r2 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            r2.mo42443w0()     // Catch:{ HttpException -> 0x092d }
        L_0x0289:
            w5.d r2 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r2 = r2.mo42409L0()     // Catch:{ HttpException -> 0x092d }
            w5.d r3 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r3 = r3.mo42424d0()     // Catch:{ HttpException -> 0x092d }
            int r2 = r2 - r3
            r1.f18116q = r2     // Catch:{ HttpException -> 0x092d }
            r2 = -3
            r1.f18114o = r2     // Catch:{ HttpException -> 0x092d }
            goto L_0x0118
        L_0x029d:
            int r2 = r1.f18116q     // Catch:{ HttpException -> 0x092d }
            if (r2 <= 0) goto L_0x02b9
            w5.e$a r2 = r1.f18106g     // Catch:{ HttpException -> 0x092d }
            if (r2 != 0) goto L_0x02b9
            w5.m$a r2 = r1.f18107h     // Catch:{ HttpException -> 0x092d }
            w5.d r3 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r3 = r3.mo42424d0()     // Catch:{ HttpException -> 0x092d }
            w5.d r5 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r5 = r5.mo42424d0()     // Catch:{ HttpException -> 0x092d }
            int r8 = r1.f18116q     // Catch:{ HttpException -> 0x092d }
            int r5 = r5 + r8
            r2.mo42495d(r3, r5)     // Catch:{ HttpException -> 0x092d }
        L_0x02b9:
            r2 = -1
            r1.f18116q = r2     // Catch:{ HttpException -> 0x092d }
            goto L_0x018f
        L_0x02be:
            int r2 = r1.f18116q     // Catch:{ HttpException -> 0x092d }
            if (r2 <= 0) goto L_0x02d6
            w5.m$a r2 = r1.f18107h     // Catch:{ HttpException -> 0x092d }
            w5.d r3 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r3 = r3.mo42424d0()     // Catch:{ HttpException -> 0x092d }
            w5.d r5 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r5 = r5.mo42424d0()     // Catch:{ HttpException -> 0x092d }
            int r7 = r1.f18116q     // Catch:{ HttpException -> 0x092d }
            int r5 = r5 + r7
            r2.mo42495d(r3, r5)     // Catch:{ HttpException -> 0x092d }
        L_0x02d6:
            r1.f18115p = r9     // Catch:{ HttpException -> 0x092d }
            goto L_0x018c
        L_0x02da:
            if (r9 == r3) goto L_0x04cb
            if (r9 == r5) goto L_0x04cb
            r3 = 58
            if (r9 == r3) goto L_0x04cb
            w5.e$a r3 = r1.f18106g     // Catch:{ HttpException -> 0x092d }
            if (r3 != 0) goto L_0x02fe
            w5.m$a r3 = r1.f18107h     // Catch:{ HttpException -> 0x092d }
            int r3 = r3.length()     // Catch:{ HttpException -> 0x092d }
            if (r3 > 0) goto L_0x02fe
            w5.m$a r3 = r1.f18108i     // Catch:{ HttpException -> 0x092d }
            int r3 = r3.length()     // Catch:{ HttpException -> 0x092d }
            if (r3 > 0) goto L_0x02fe
            java.lang.String r3 = r1.f18109j     // Catch:{ HttpException -> 0x092d }
            if (r3 == 0) goto L_0x02fb
            goto L_0x02fe
        L_0x02fb:
            r12 = r14
            goto L_0x03f2
        L_0x02fe:
            w5.e$a r3 = r1.f18106g     // Catch:{ HttpException -> 0x092d }
            if (r3 == 0) goto L_0x0304
        L_0x0302:
            r5 = 0
            goto L_0x030d
        L_0x0304:
            org.eclipse.jetty.http.k r3 = org.eclipse.jetty.http.C9908k.f18084d     // Catch:{ HttpException -> 0x092d }
            w5.m$a r5 = r1.f18107h     // Catch:{ HttpException -> 0x092d }
            w5.d r3 = r3.mo42461h(r5)     // Catch:{ HttpException -> 0x092d }
            goto L_0x0302
        L_0x030d:
            r1.f18106g = r5     // Catch:{ HttpException -> 0x092d }
            java.lang.String r5 = r1.f18109j     // Catch:{ HttpException -> 0x092d }
            if (r5 != 0) goto L_0x0316
            w5.m$a r5 = r1.f18108i     // Catch:{ HttpException -> 0x092d }
            goto L_0x031d
        L_0x0316:
            w5.h r5 = new w5.h     // Catch:{ HttpException -> 0x092d }
            java.lang.String r8 = r1.f18109j     // Catch:{ HttpException -> 0x092d }
            r5.<init>((java.lang.String) r8)     // Catch:{ HttpException -> 0x092d }
        L_0x031d:
            org.eclipse.jetty.http.k r8 = org.eclipse.jetty.http.C9908k.f18084d     // Catch:{ HttpException -> 0x092d }
            int r8 = r8.mo42459f(r3)     // Catch:{ HttpException -> 0x092d }
            if (r8 < 0) goto L_0x03d7
            if (r8 == r6) goto L_0x0397
            r12 = r14
            r13 = -2
            r7 = 5
            if (r8 == r7) goto L_0x036a
            r7 = 12
            if (r8 == r7) goto L_0x0333
            goto L_0x03d8
        L_0x0333:
            long r7 = r1.f18117r     // Catch:{ HttpException -> 0x092d }
            int r15 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r15 == 0) goto L_0x03d8
            int r7 = r1.f18110k     // Catch:{ HttpException -> 0x092d }
            r8 = 304(0x130, float:4.26E-43)
            if (r7 == r8) goto L_0x03d8
            r8 = 204(0xcc, float:2.86E-43)
            if (r7 == r8) goto L_0x03d8
            r8 = 100
            if (r7 < r8) goto L_0x034b
            r8 = 200(0xc8, float:2.8E-43)
            if (r7 < r8) goto L_0x03d8
        L_0x034b:
            long r7 = p225w5.C11945g.m30571i(r5)     // Catch:{ NumberFormatException -> 0x035b }
            r1.f18117r = r7     // Catch:{ NumberFormatException -> 0x035b }
            r13 = 0
            int r15 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r15 > 0) goto L_0x03d8
        L_0x0357:
            r1.f18117r = r13     // Catch:{ HttpException -> 0x092d }
            goto L_0x03d8
        L_0x035b:
            r0 = move-exception
            r2 = r0
            e6.c r3 = f18099w     // Catch:{ HttpException -> 0x092d }
            r3.mo36849d(r2)     // Catch:{ HttpException -> 0x092d }
            org.eclipse.jetty.http.HttpException r2 = new org.eclipse.jetty.http.HttpException     // Catch:{ HttpException -> 0x092d }
            r3 = 400(0x190, float:5.6E-43)
            r2.<init>(r3)     // Catch:{ HttpException -> 0x092d }
            throw r2     // Catch:{ HttpException -> 0x092d }
        L_0x036a:
            org.eclipse.jetty.http.j r7 = org.eclipse.jetty.http.C9907j.f18080d     // Catch:{ HttpException -> 0x092d }
            w5.d r5 = r7.mo42461h(r5)     // Catch:{ HttpException -> 0x092d }
            int r7 = r7.mo42459f(r5)     // Catch:{ HttpException -> 0x092d }
            r8 = 2
            if (r8 != r7) goto L_0x0378
            goto L_0x0357
        L_0x0378:
            java.lang.String r7 = r5.toString(r15)     // Catch:{ HttpException -> 0x092d }
            java.lang.String r8 = "chunked"
            boolean r8 = r7.endsWith(r8)     // Catch:{ HttpException -> 0x092d }
            if (r8 == 0) goto L_0x0385
            goto L_0x0357
        L_0x0385:
            java.lang.String r8 = "chunked"
            int r7 = r7.indexOf(r8)     // Catch:{ HttpException -> 0x092d }
            if (r7 >= 0) goto L_0x038e
            goto L_0x03d8
        L_0x038e:
            org.eclipse.jetty.http.HttpException r2 = new org.eclipse.jetty.http.HttpException     // Catch:{ HttpException -> 0x092d }
            r3 = 400(0x190, float:5.6E-43)
            r4 = 0
            r2.<init>(r3, r4)     // Catch:{ HttpException -> 0x092d }
            throw r2     // Catch:{ HttpException -> 0x092d }
        L_0x0397:
            r12 = r14
            org.eclipse.jetty.http.j r7 = org.eclipse.jetty.http.C9907j.f18080d     // Catch:{ HttpException -> 0x092d }
            int r7 = r7.mo42459f(r5)     // Catch:{ HttpException -> 0x092d }
            r8 = -1
            if (r7 == r8) goto L_0x03ae
            if (r7 == r6) goto L_0x03aa
            r8 = 5
            if (r7 == r8) goto L_0x03a7
            goto L_0x03d8
        L_0x03a7:
            r1.f18112m = r6     // Catch:{ HttpException -> 0x092d }
            goto L_0x03d8
        L_0x03aa:
            r7 = 0
            r1.f18112m = r7     // Catch:{ HttpException -> 0x092d }
            goto L_0x03d8
        L_0x03ae:
            java.lang.String r7 = r5.toString()     // Catch:{ HttpException -> 0x092d }
            java.lang.String r8 = ","
            java.lang.String[] r7 = r7.split(r8)     // Catch:{ HttpException -> 0x092d }
            int r8 = r7.length     // Catch:{ HttpException -> 0x092d }
            r13 = 0
        L_0x03ba:
            if (r13 >= r8) goto L_0x03d8
            r14 = r7[r13]     // Catch:{ HttpException -> 0x092d }
            org.eclipse.jetty.http.j r15 = org.eclipse.jetty.http.C9907j.f18080d     // Catch:{ HttpException -> 0x092d }
            java.lang.String r14 = r14.trim()     // Catch:{ HttpException -> 0x092d }
            int r14 = r15.mo42458e(r14)     // Catch:{ HttpException -> 0x092d }
            if (r14 == r6) goto L_0x03d1
            r15 = 5
            if (r14 == r15) goto L_0x03ce
            goto L_0x03d4
        L_0x03ce:
            r1.f18112m = r6     // Catch:{ HttpException -> 0x092d }
            goto L_0x03d4
        L_0x03d1:
            r14 = 0
            r1.f18112m = r14     // Catch:{ HttpException -> 0x092d }
        L_0x03d4:
            int r13 = r13 + 1
            goto L_0x03ba
        L_0x03d7:
            r12 = r14
        L_0x03d8:
            org.eclipse.jetty.http.m$a r7 = r1.f18100a     // Catch:{ HttpException -> 0x092d }
            r7.mo39536e(r3, r5)     // Catch:{ HttpException -> 0x092d }
            w5.m$a r3 = r1.f18107h     // Catch:{ HttpException -> 0x092d }
            int r5 = r3.mo42409L0()     // Catch:{ HttpException -> 0x092d }
            r3.mo42430h0(r5)     // Catch:{ HttpException -> 0x092d }
            w5.m$a r3 = r1.f18108i     // Catch:{ HttpException -> 0x092d }
            int r5 = r3.mo42409L0()     // Catch:{ HttpException -> 0x092d }
            r3.mo42430h0(r5)     // Catch:{ HttpException -> 0x092d }
            r3 = 0
            r1.f18109j = r3     // Catch:{ HttpException -> 0x092d }
        L_0x03f2:
            w5.d r3 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            r5 = -1
            r3.mo42427g1(r5)     // Catch:{ HttpException -> 0x092d }
            if (r9 == r2) goto L_0x043a
            r3 = 10
            if (r9 != r3) goto L_0x03ff
            goto L_0x043a
        L_0x03ff:
            r1.f18116q = r6     // Catch:{ HttpException -> 0x092d }
            w5.d r2 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            r2.mo42443w0()     // Catch:{ HttpException -> 0x092d }
            r2 = -4
            r1.f18114o = r2     // Catch:{ HttpException -> 0x092d }
            if (r10 == 0) goto L_0x0119
            org.eclipse.jetty.http.k r2 = org.eclipse.jetty.http.C9908k.f18084d     // Catch:{ HttpException -> 0x092d }
            w5.d r3 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r3 = r3.mo42424d0()     // Catch:{ HttpException -> 0x092d }
            int r14 = r12 + 1
            w5.e$a r2 = r2.mo42457d(r10, r3, r14)     // Catch:{ HttpException -> 0x092d }
            r1.f18106g = r2     // Catch:{ HttpException -> 0x092d }
            if (r2 == 0) goto L_0x0119
            int r2 = r2.length()     // Catch:{ HttpException -> 0x092d }
            r1.f18116q = r2     // Catch:{ HttpException -> 0x092d }
            w5.d r2 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r3 = r2.mo42424d0()     // Catch:{ HttpException -> 0x092d }
            int r5 = r1.f18116q     // Catch:{ HttpException -> 0x092d }
            int r3 = r3 + r5
            r2.mo42442v0(r3)     // Catch:{ HttpException -> 0x092d }
            w5.d r2 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r2 = r2.length()     // Catch:{ HttpException -> 0x092d }
            r9 = r2
            r2 = -1
            r3 = 0
            goto L_0x069c
        L_0x043a:
            long r3 = r1.f18117r     // Catch:{ HttpException -> 0x092d }
            r7 = -3
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x045d
            int r3 = r1.f18110k     // Catch:{ HttpException -> 0x092d }
            if (r3 == 0) goto L_0x0458
            r4 = 304(0x130, float:4.26E-43)
            if (r3 == r4) goto L_0x0458
            r4 = 204(0xcc, float:2.86E-43)
            if (r3 == r4) goto L_0x0458
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 >= r4) goto L_0x0453
            goto L_0x0458
        L_0x0453:
            r3 = -1
            r1.f18117r = r3     // Catch:{ HttpException -> 0x092d }
            goto L_0x045d
        L_0x0458:
            r3 = 0
            r1.f18117r = r3     // Catch:{ HttpException -> 0x092d }
            goto L_0x045f
        L_0x045d:
            r3 = 0
        L_0x045f:
            r1.f18118s = r3     // Catch:{ HttpException -> 0x092d }
            r1.f18115p = r9     // Catch:{ HttpException -> 0x092d }
            if (r9 != r2) goto L_0x047f
            w5.d r2 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            boolean r2 = r2.mo42408J0()     // Catch:{ HttpException -> 0x092d }
            if (r2 == 0) goto L_0x047f
            w5.d r2 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            byte r2 = r2.peek()     // Catch:{ HttpException -> 0x092d }
            r3 = 10
            if (r2 != r3) goto L_0x047f
            w5.d r2 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            byte r2 = r2.get()     // Catch:{ HttpException -> 0x092d }
            r1.f18115p = r2     // Catch:{ HttpException -> 0x092d }
        L_0x047f:
            long r2 = r1.f18117r     // Catch:{ HttpException -> 0x092d }
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x048c
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x048d
        L_0x048c:
            int r2 = (int) r2     // Catch:{ HttpException -> 0x092d }
        L_0x048d:
            r3 = -2
            if (r2 == r3) goto L_0x04c4
            r3 = -1
            if (r2 == r3) goto L_0x04bf
            if (r2 == 0) goto L_0x049e
            r2 = 2
            r1.f18114o = r2     // Catch:{ HttpException -> 0x092d }
            org.eclipse.jetty.http.m$a r2 = r1.f18100a     // Catch:{ HttpException -> 0x092d }
        L_0x049a:
            r2.mo39534c()     // Catch:{ HttpException -> 0x092d }
            goto L_0x04ca
        L_0x049e:
            org.eclipse.jetty.http.m$a r2 = r1.f18100a     // Catch:{ HttpException -> 0x092d }
            r2.mo39534c()     // Catch:{ HttpException -> 0x092d }
            boolean r2 = r1.f18112m     // Catch:{ HttpException -> 0x092d }
            if (r2 != 0) goto L_0x04b4
            int r2 = r1.f18110k     // Catch:{ HttpException -> 0x092d }
            r3 = 100
            if (r2 < r3) goto L_0x04b2
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 >= r3) goto L_0x04b2
            goto L_0x04b4
        L_0x04b2:
            r2 = 7
            goto L_0x04b5
        L_0x04b4:
            r2 = 0
        L_0x04b5:
            r1.f18114o = r2     // Catch:{ HttpException -> 0x092d }
            org.eclipse.jetty.http.m$a r2 = r1.f18100a     // Catch:{ HttpException -> 0x092d }
            long r3 = r1.f18118s     // Catch:{ HttpException -> 0x092d }
            r2.mo39535d(r3)     // Catch:{ HttpException -> 0x092d }
            return r6
        L_0x04bf:
            r1.f18114o = r6     // Catch:{ HttpException -> 0x092d }
            org.eclipse.jetty.http.m$a r2 = r1.f18100a     // Catch:{ HttpException -> 0x092d }
            goto L_0x049a
        L_0x04c4:
            r2 = 3
            r1.f18114o = r2     // Catch:{ HttpException -> 0x092d }
            org.eclipse.jetty.http.m$a r2 = r1.f18100a     // Catch:{ HttpException -> 0x092d }
            goto L_0x049a
        L_0x04ca:
            return r6
        L_0x04cb:
            r12 = r14
            r2 = -1
            r1.f18116q = r2     // Catch:{ HttpException -> 0x092d }
            r2 = -2
            r1.f18114o = r2     // Catch:{ HttpException -> 0x092d }
            goto L_0x0119
        L_0x04d4:
            r12 = r14
            if (r9 == r2) goto L_0x04db
            r2 = 10
            if (r9 != r2) goto L_0x0119
        L_0x04db:
            int r2 = r1.f18110k     // Catch:{ HttpException -> 0x092d }
            if (r2 <= 0) goto L_0x04f5
            org.eclipse.jetty.http.m$a r2 = r1.f18100a     // Catch:{ HttpException -> 0x092d }
            w5.e r3 = org.eclipse.jetty.http.C9915q.f18140a     // Catch:{ HttpException -> 0x092d }
            w5.m$a r5 = r1.f18107h     // Catch:{ HttpException -> 0x092d }
            w5.d r3 = r3.mo42461h(r5)     // Catch:{ HttpException -> 0x092d }
            int r5 = r1.f18110k     // Catch:{ HttpException -> 0x092d }
            w5.d r7 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            w5.d r7 = r7.mo42412N0()     // Catch:{ HttpException -> 0x092d }
            r2.mo39538g(r3, r5, r7)     // Catch:{ HttpException -> 0x092d }
            goto L_0x0511
        L_0x04f5:
            org.eclipse.jetty.http.m$a r2 = r1.f18100a     // Catch:{ HttpException -> 0x092d }
            w5.e r3 = org.eclipse.jetty.http.C9909l.f18097a     // Catch:{ HttpException -> 0x092d }
            w5.m$a r5 = r1.f18107h     // Catch:{ HttpException -> 0x092d }
            w5.d r3 = r3.mo42461h(r5)     // Catch:{ HttpException -> 0x092d }
            w5.m$a r5 = r1.f18108i     // Catch:{ HttpException -> 0x092d }
            w5.e r7 = org.eclipse.jetty.http.C9915q.f18140a     // Catch:{ HttpException -> 0x092d }
            w5.d r13 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            w5.d r13 = r13.mo42412N0()     // Catch:{ HttpException -> 0x092d }
            w5.d r7 = r7.mo42461h(r13)     // Catch:{ HttpException -> 0x092d }
            r2.mo39537f(r3, r5, r7)     // Catch:{ HttpException -> 0x092d }
            r3 = r7
        L_0x0511:
            r1.f18115p = r9     // Catch:{ HttpException -> 0x092d }
            w5.e r2 = org.eclipse.jetty.http.C9915q.f18140a     // Catch:{ HttpException -> 0x092d }
            int r2 = r2.mo42459f(r3)     // Catch:{ HttpException -> 0x092d }
            r3 = 11
            if (r2 < r3) goto L_0x051f
            r2 = 1
            goto L_0x0520
        L_0x051f:
            r2 = 0
        L_0x0520:
            r1.f18112m = r2     // Catch:{ HttpException -> 0x092d }
            r1.f18114o = r8     // Catch:{ HttpException -> 0x092d }
            w5.m$a r2 = r1.f18107h     // Catch:{ HttpException -> 0x092d }
            int r3 = r2.mo42409L0()     // Catch:{ HttpException -> 0x092d }
            r2.mo42430h0(r3)     // Catch:{ HttpException -> 0x092d }
            w5.m$a r2 = r1.f18108i     // Catch:{ HttpException -> 0x092d }
            int r3 = r2.mo42409L0()     // Catch:{ HttpException -> 0x092d }
            r2.mo42430h0(r3)     // Catch:{ HttpException -> 0x092d }
            r2 = 0
        L_0x0537:
            r1.f18109j = r2     // Catch:{ HttpException -> 0x092d }
            goto L_0x0108
        L_0x053b:
            r12 = r14
            if (r9 > r5) goto L_0x0595
            if (r9 >= 0) goto L_0x0541
            goto L_0x0595
        L_0x0541:
            if (r9 >= r5) goto L_0x0119
            int r2 = r1.f18110k     // Catch:{ HttpException -> 0x092d }
            if (r2 <= 0) goto L_0x0572
            org.eclipse.jetty.http.m$a r2 = r1.f18100a     // Catch:{ HttpException -> 0x092d }
            w5.e r3 = org.eclipse.jetty.http.C9909l.f18097a     // Catch:{ HttpException -> 0x092d }
            w5.m$a r5 = r1.f18107h     // Catch:{ HttpException -> 0x092d }
            w5.d r3 = r3.mo42461h(r5)     // Catch:{ HttpException -> 0x092d }
            int r5 = r1.f18110k     // Catch:{ HttpException -> 0x092d }
            r7 = 0
            r2.mo39538g(r3, r5, r7)     // Catch:{ HttpException -> 0x092d }
            r1.f18115p = r9     // Catch:{ HttpException -> 0x092d }
            r1.f18114o = r8     // Catch:{ HttpException -> 0x092d }
            w5.m$a r2 = r1.f18107h     // Catch:{ HttpException -> 0x092d }
            int r3 = r2.mo42409L0()     // Catch:{ HttpException -> 0x092d }
            r2.mo42430h0(r3)     // Catch:{ HttpException -> 0x092d }
            w5.m$a r2 = r1.f18108i     // Catch:{ HttpException -> 0x092d }
            int r3 = r2.mo42409L0()     // Catch:{ HttpException -> 0x092d }
            r2.mo42430h0(r3)     // Catch:{ HttpException -> 0x092d }
            r2 = 0
            r1.f18109j = r2     // Catch:{ HttpException -> 0x092d }
            goto L_0x0119
        L_0x0572:
            org.eclipse.jetty.http.m$a r2 = r1.f18100a     // Catch:{ HttpException -> 0x092d }
            w5.e r3 = org.eclipse.jetty.http.C9909l.f18097a     // Catch:{ HttpException -> 0x092d }
            w5.m$a r4 = r1.f18107h     // Catch:{ HttpException -> 0x092d }
            w5.d r3 = r3.mo42461h(r4)     // Catch:{ HttpException -> 0x092d }
            w5.m$a r4 = r1.f18108i     // Catch:{ HttpException -> 0x092d }
            r5 = 0
            r2.mo39537f(r3, r4, r5)     // Catch:{ HttpException -> 0x092d }
            r2 = 0
            r1.f18112m = r2     // Catch:{ HttpException -> 0x092d }
            r2 = 7
            r1.f18114o = r2     // Catch:{ HttpException -> 0x092d }
            org.eclipse.jetty.http.m$a r2 = r1.f18100a     // Catch:{ HttpException -> 0x092d }
            r2.mo39534c()     // Catch:{ HttpException -> 0x092d }
            org.eclipse.jetty.http.m$a r2 = r1.f18100a     // Catch:{ HttpException -> 0x092d }
            long r3 = r1.f18118s     // Catch:{ HttpException -> 0x092d }
            r2.mo39535d(r3)     // Catch:{ HttpException -> 0x092d }
            return r6
        L_0x0595:
            w5.d r2 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            r2.mo42443w0()     // Catch:{ HttpException -> 0x092d }
            r2 = -6
            r1.f18114o = r2     // Catch:{ HttpException -> 0x092d }
            goto L_0x0119
        L_0x059f:
            r12 = r14
            if (r9 != r5) goto L_0x05ba
            w5.m$a r2 = r1.f18108i     // Catch:{ HttpException -> 0x092d }
            w5.d r3 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r3 = r3.mo42424d0()     // Catch:{ HttpException -> 0x092d }
            w5.d r5 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r5 = r5.mo42409L0()     // Catch:{ HttpException -> 0x092d }
            int r5 = r5 - r6
            r2.mo42495d(r3, r5)     // Catch:{ HttpException -> 0x092d }
        L_0x05b4:
            r2 = -9
            r1.f18114o = r2     // Catch:{ HttpException -> 0x092d }
            goto L_0x0108
        L_0x05ba:
            if (r9 >= r5) goto L_0x0119
            if (r9 < 0) goto L_0x0119
            org.eclipse.jetty.http.m$a r2 = r1.f18100a     // Catch:{ HttpException -> 0x092d }
            w5.e r3 = org.eclipse.jetty.http.C9909l.f18097a     // Catch:{ HttpException -> 0x092d }
            w5.m$a r4 = r1.f18107h     // Catch:{ HttpException -> 0x092d }
            w5.d r3 = r3.mo42461h(r4)     // Catch:{ HttpException -> 0x092d }
            w5.d r4 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            w5.d r4 = r4.mo42412N0()     // Catch:{ HttpException -> 0x092d }
            r5 = 0
            r2.mo39537f(r3, r4, r5)     // Catch:{ HttpException -> 0x092d }
            r2 = 0
            r1.f18112m = r2     // Catch:{ HttpException -> 0x092d }
            r2 = 7
            r1.f18114o = r2     // Catch:{ HttpException -> 0x092d }
            org.eclipse.jetty.http.m$a r2 = r1.f18100a     // Catch:{ HttpException -> 0x092d }
            r2.mo39534c()     // Catch:{ HttpException -> 0x092d }
            org.eclipse.jetty.http.m$a r2 = r1.f18100a     // Catch:{ HttpException -> 0x092d }
            long r3 = r1.f18118s     // Catch:{ HttpException -> 0x092d }
            r2.mo39535d(r3)     // Catch:{ HttpException -> 0x092d }
            return r6
        L_0x05e5:
            r12 = r14
            if (r9 != r5) goto L_0x05fb
            w5.m$a r2 = r1.f18108i     // Catch:{ HttpException -> 0x092d }
            w5.d r3 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r3 = r3.mo42424d0()     // Catch:{ HttpException -> 0x092d }
            w5.d r5 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r5 = r5.mo42409L0()     // Catch:{ HttpException -> 0x092d }
            int r5 = r5 - r6
            r2.mo42495d(r3, r5)     // Catch:{ HttpException -> 0x092d }
            goto L_0x05b4
        L_0x05fb:
            r2 = 48
            if (r9 < r2) goto L_0x0610
            r2 = 57
            if (r9 > r2) goto L_0x0610
            int r2 = r1.f18110k     // Catch:{ HttpException -> 0x092d }
            r3 = 10
            int r2 = r2 * 10
            int r9 = r9 + -48
            int r2 = r2 + r9
            r1.f18110k = r2     // Catch:{ HttpException -> 0x092d }
            goto L_0x0108
        L_0x0610:
            if (r9 >= r5) goto L_0x063d
            if (r9 < 0) goto L_0x063d
            org.eclipse.jetty.http.m$a r2 = r1.f18100a     // Catch:{ HttpException -> 0x092d }
            w5.e r3 = org.eclipse.jetty.http.C9909l.f18097a     // Catch:{ HttpException -> 0x092d }
            w5.m$a r5 = r1.f18107h     // Catch:{ HttpException -> 0x092d }
            w5.d r3 = r3.mo42461h(r5)     // Catch:{ HttpException -> 0x092d }
            int r5 = r1.f18110k     // Catch:{ HttpException -> 0x092d }
            r7 = 0
            r2.mo39538g(r3, r5, r7)     // Catch:{ HttpException -> 0x092d }
            r1.f18115p = r9     // Catch:{ HttpException -> 0x092d }
            r1.f18114o = r8     // Catch:{ HttpException -> 0x092d }
            w5.m$a r2 = r1.f18107h     // Catch:{ HttpException -> 0x092d }
            int r3 = r2.mo42409L0()     // Catch:{ HttpException -> 0x092d }
            r2.mo42430h0(r3)     // Catch:{ HttpException -> 0x092d }
            w5.m$a r2 = r1.f18108i     // Catch:{ HttpException -> 0x092d }
            int r3 = r2.mo42409L0()     // Catch:{ HttpException -> 0x092d }
            r2.mo42430h0(r3)     // Catch:{ HttpException -> 0x092d }
            r2 = 0
            goto L_0x0537
        L_0x063d:
            r2 = -10
            r1.f18114o = r2     // Catch:{ HttpException -> 0x092d }
            r2 = -1
            r1.f18110k = r2     // Catch:{ HttpException -> 0x092d }
            goto L_0x011a
        L_0x0646:
            r12 = r14
            r2 = -1
            if (r9 > r5) goto L_0x0659
            if (r9 >= 0) goto L_0x064d
            goto L_0x0659
        L_0x064d:
            if (r9 < r5) goto L_0x0651
            goto L_0x011a
        L_0x0651:
            org.eclipse.jetty.http.HttpException r2 = new org.eclipse.jetty.http.HttpException     // Catch:{ HttpException -> 0x092d }
            r3 = 400(0x190, float:5.6E-43)
            r2.<init>(r3)     // Catch:{ HttpException -> 0x092d }
            throw r2     // Catch:{ HttpException -> 0x092d }
        L_0x0659:
            w5.d r3 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            r3.mo42443w0()     // Catch:{ HttpException -> 0x092d }
            int r3 = r1.f18110k     // Catch:{ HttpException -> 0x092d }
            if (r3 < 0) goto L_0x066c
            r3 = -11
            r1.f18114o = r3     // Catch:{ HttpException -> 0x092d }
            int r9 = r9 + -48
            r1.f18110k = r9     // Catch:{ HttpException -> 0x092d }
            goto L_0x011a
        L_0x066c:
            r3 = -10
            r1.f18114o = r3     // Catch:{ HttpException -> 0x092d }
            goto L_0x011a
        L_0x0672:
            r12 = r14
            r2 = -1
            if (r9 != r5) goto L_0x06a2
            w5.m$a r3 = r1.f18107h     // Catch:{ HttpException -> 0x092d }
            w5.d r5 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r5 = r5.mo42424d0()     // Catch:{ HttpException -> 0x092d }
            w5.d r7 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r7 = r7.mo42409L0()     // Catch:{ HttpException -> 0x092d }
            int r7 = r7 - r6
            r3.mo42495d(r5, r7)     // Catch:{ HttpException -> 0x092d }
            w5.e r3 = org.eclipse.jetty.http.C9915q.f18140a     // Catch:{ HttpException -> 0x092d }
            w5.m$a r5 = r1.f18107h     // Catch:{ HttpException -> 0x092d }
            w5.e$a r3 = r3.mo42456c(r5)     // Catch:{ HttpException -> 0x092d }
            if (r3 != 0) goto L_0x0694
            r3 = -1
            goto L_0x0695
        L_0x0694:
            r3 = 0
        L_0x0695:
            r1.f18110k = r3     // Catch:{ HttpException -> 0x092d }
            r3 = -12
            r1.f18114o = r3     // Catch:{ HttpException -> 0x092d }
        L_0x069b:
            r9 = r12
        L_0x069c:
            r2 = 7
            r3 = 0
            r5 = 2
            r8 = -1
            goto L_0x00e6
        L_0x06a2:
            if (r9 >= r5) goto L_0x011a
            if (r9 >= 0) goto L_0x06a8
            goto L_0x011a
        L_0x06a8:
            org.eclipse.jetty.http.HttpException r2 = new org.eclipse.jetty.http.HttpException     // Catch:{ HttpException -> 0x092d }
            r3 = 400(0x190, float:5.6E-43)
            r2.<init>(r3)     // Catch:{ HttpException -> 0x092d }
            throw r2     // Catch:{ HttpException -> 0x092d }
        L_0x06b0:
            r12 = r14
            r2 = -1
            r7 = -3
            r1.f18117r = r7     // Catch:{ HttpException -> 0x092d }
            r3 = 0
            r1.f18106g = r3     // Catch:{ HttpException -> 0x092d }
            if (r9 > r5) goto L_0x06bd
            if (r9 >= 0) goto L_0x069b
        L_0x06bd:
            w5.d r5 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            r5.mo42443w0()     // Catch:{ HttpException -> 0x092d }
            r5 = -13
            r1.f18114o = r5     // Catch:{ HttpException -> 0x092d }
            goto L_0x069b
        L_0x06c7:
            int r3 = r1.f18110k     // Catch:{ HttpException -> 0x092d }
            if (r3 <= 0) goto L_0x06e8
            boolean r7 = r1.f18121v     // Catch:{ HttpException -> 0x092d }
            if (r7 == 0) goto L_0x06e8
            boolean r7 = r1.f18112m     // Catch:{ HttpException -> 0x092d }
            if (r7 != 0) goto L_0x06de
            r7 = 100
            if (r3 < r7) goto L_0x06dc
            r7 = 200(0xc8, float:2.8E-43)
            if (r3 >= r7) goto L_0x06dc
            goto L_0x06de
        L_0x06dc:
            r3 = 7
            goto L_0x06df
        L_0x06de:
            r3 = 0
        L_0x06df:
            r1.f18114o = r3     // Catch:{ HttpException -> 0x092d }
            org.eclipse.jetty.http.m$a r3 = r1.f18100a     // Catch:{ HttpException -> 0x092d }
            long r7 = r1.f18117r     // Catch:{ HttpException -> 0x092d }
            r3.mo39535d(r7)     // Catch:{ HttpException -> 0x092d }
        L_0x06e8:
            w5.d r3 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r3 = r3.length()     // Catch:{ HttpException -> 0x092d }
            int r7 = r1.f18114o     // Catch:{ HttpException -> 0x092d }
        L_0x06f0:
            int r8 = r1.f18114o     // Catch:{ HttpException -> 0x092d }
            if (r8 <= 0) goto L_0x092c
            if (r3 <= 0) goto L_0x092c
            if (r7 == r8) goto L_0x06fb
            int r4 = r4 + 1
            r7 = r8
        L_0x06fb:
            byte r8 = r1.f18115p     // Catch:{ HttpException -> 0x092d }
            if (r8 != r2) goto L_0x0718
            w5.d r8 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            byte r8 = r8.peek()     // Catch:{ HttpException -> 0x092d }
            r9 = 10
            if (r8 != r9) goto L_0x0718
            w5.d r3 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            byte r3 = r3.get()     // Catch:{ HttpException -> 0x092d }
            r1.f18115p = r3     // Catch:{ HttpException -> 0x092d }
            w5.d r3 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
        L_0x0713:
            int r3 = r3.length()     // Catch:{ HttpException -> 0x092d }
            goto L_0x06f0
        L_0x0718:
            r8 = 0
            r1.f18115p = r8     // Catch:{ HttpException -> 0x092d }
            int r9 = r1.f18114o     // Catch:{ HttpException -> 0x092d }
            switch(r9) {
                case 1: goto L_0x0909;
                case 2: goto L_0x08b8;
                case 3: goto L_0x088a;
                case 4: goto L_0x07df;
                case 5: goto L_0x0796;
                case 6: goto L_0x0763;
                case 7: goto L_0x072a;
                default: goto L_0x0720;
            }     // Catch:{ HttpException -> 0x092d }
        L_0x0720:
            r8 = 48
            r9 = 2
        L_0x0723:
            r10 = 5
        L_0x0724:
            r11 = 10
        L_0x0726:
            r12 = 0
            goto L_0x0928
        L_0x072a:
            w5.d r3 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r3 = r3.length()     // Catch:{ HttpException -> 0x092d }
            r9 = 2
            if (r3 <= r9) goto L_0x073b
            r1.f18114o = r8     // Catch:{ HttpException -> 0x092d }
            w5.k r3 = r1.f18102c     // Catch:{ HttpException -> 0x092d }
            r3.close()     // Catch:{ HttpException -> 0x092d }
            goto L_0x075d
        L_0x073b:
            w5.d r3 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r3 = r3.length()     // Catch:{ HttpException -> 0x092d }
            if (r3 <= 0) goto L_0x075d
            w5.d r3 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            byte r3 = r3.get()     // Catch:{ HttpException -> 0x092d }
            boolean r3 = java.lang.Character.isWhitespace(r3)     // Catch:{ HttpException -> 0x092d }
            if (r3 != 0) goto L_0x073b
            r3 = 0
            r1.f18114o = r3     // Catch:{ HttpException -> 0x0931 }
            w5.k r3 = r1.f18102c     // Catch:{ HttpException -> 0x092d }
            r3.close()     // Catch:{ HttpException -> 0x092d }
            w5.d r3 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            r3.clear()     // Catch:{ HttpException -> 0x092d }
            goto L_0x073b
        L_0x075d:
            w5.d r3 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            r3.clear()     // Catch:{ HttpException -> 0x092d }
            goto L_0x07a4
        L_0x0763:
            r9 = 2
            int r8 = r1.f18119t     // Catch:{ HttpException -> 0x092d }
            int r10 = r1.f18120u     // Catch:{ HttpException -> 0x092d }
            int r8 = r8 - r10
            if (r8 != 0) goto L_0x076f
            r3 = 3
            r1.f18114o = r3     // Catch:{ HttpException -> 0x092d }
            goto L_0x07a4
        L_0x076f:
            if (r3 <= r8) goto L_0x0772
            r3 = r8
        L_0x0772:
            w5.d r2 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            w5.d r2 = r2.get(r3)     // Catch:{ HttpException -> 0x092d }
            long r3 = r1.f18118s     // Catch:{ HttpException -> 0x092d }
            int r5 = r2.length()     // Catch:{ HttpException -> 0x092d }
            long r7 = (long) r5     // Catch:{ HttpException -> 0x092d }
            long r3 = r3 + r7
            r1.f18118s = r3     // Catch:{ HttpException -> 0x092d }
            int r3 = r1.f18120u     // Catch:{ HttpException -> 0x092d }
            int r4 = r2.length()     // Catch:{ HttpException -> 0x092d }
            int r3 = r3 + r4
            r1.f18120u = r3     // Catch:{ HttpException -> 0x092d }
            w5.m r3 = r1.f18113n     // Catch:{ HttpException -> 0x092d }
            r3.mo42496e(r2)     // Catch:{ HttpException -> 0x092d }
            org.eclipse.jetty.http.m$a r3 = r1.f18100a     // Catch:{ HttpException -> 0x092d }
            r3.mo39532a(r2)     // Catch:{ HttpException -> 0x092d }
            return r6
        L_0x0796:
            r9 = 2
            w5.d r3 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            byte r3 = r3.get()     // Catch:{ HttpException -> 0x092d }
            if (r3 == r2) goto L_0x07a8
            r8 = 10
            if (r3 != r8) goto L_0x07a4
            goto L_0x07a8
        L_0x07a4:
            r8 = 48
            goto L_0x0723
        L_0x07a8:
            r1.f18115p = r3     // Catch:{ HttpException -> 0x092d }
            int r8 = r1.f18119t     // Catch:{ HttpException -> 0x092d }
            if (r8 != 0) goto L_0x07db
            if (r3 != r2) goto L_0x07ca
            w5.d r2 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            boolean r2 = r2.mo42408J0()     // Catch:{ HttpException -> 0x092d }
            if (r2 == 0) goto L_0x07ca
            w5.d r2 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            byte r2 = r2.peek()     // Catch:{ HttpException -> 0x092d }
            r3 = 10
            if (r2 != r3) goto L_0x07ca
            w5.d r2 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            byte r2 = r2.get()     // Catch:{ HttpException -> 0x092d }
            r1.f18115p = r2     // Catch:{ HttpException -> 0x092d }
        L_0x07ca:
            boolean r2 = r1.f18112m     // Catch:{ HttpException -> 0x092d }
            if (r2 == 0) goto L_0x07d0
            r2 = 0
            goto L_0x07d1
        L_0x07d0:
            r2 = 7
        L_0x07d1:
            r1.f18114o = r2     // Catch:{ HttpException -> 0x092d }
            org.eclipse.jetty.http.m$a r2 = r1.f18100a     // Catch:{ HttpException -> 0x092d }
            long r3 = r1.f18118s     // Catch:{ HttpException -> 0x092d }
            r2.mo39535d(r3)     // Catch:{ HttpException -> 0x092d }
            return r6
        L_0x07db:
            r3 = 6
            r1.f18114o = r3     // Catch:{ HttpException -> 0x092d }
            goto L_0x07a4
        L_0x07df:
            r9 = 2
            w5.d r3 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            byte r3 = r3.get()     // Catch:{ HttpException -> 0x092d }
            if (r3 == r2) goto L_0x084f
            r8 = 10
            if (r3 != r8) goto L_0x07ed
            goto L_0x084f
        L_0x07ed:
            if (r3 <= r5) goto L_0x0848
            r8 = 59
            if (r3 != r8) goto L_0x07f4
            goto L_0x0848
        L_0x07f4:
            r8 = 48
            if (r3 < r8) goto L_0x0807
            r10 = 57
            if (r3 > r10) goto L_0x0807
            int r10 = r1.f18119t     // Catch:{ HttpException -> 0x092d }
            int r10 = r10 * 16
            int r3 = r3 + -48
            int r10 = r10 + r3
            r1.f18119t = r10     // Catch:{ HttpException -> 0x092d }
            goto L_0x0723
        L_0x0807:
            r10 = 97
            if (r3 < r10) goto L_0x081c
            r10 = 102(0x66, float:1.43E-43)
            if (r3 > r10) goto L_0x081c
            int r10 = r1.f18119t     // Catch:{ HttpException -> 0x092d }
            int r10 = r10 * 16
            int r3 = r3 + 10
            int r3 = r3 + -97
            int r10 = r10 + r3
            r1.f18119t = r10     // Catch:{ HttpException -> 0x092d }
            goto L_0x0723
        L_0x081c:
            r10 = 65
            if (r3 < r10) goto L_0x0831
            r10 = 70
            if (r3 > r10) goto L_0x0831
            int r10 = r1.f18119t     // Catch:{ HttpException -> 0x092d }
            int r10 = r10 * 16
            int r3 = r3 + 10
            int r3 = r3 + -65
            int r10 = r10 + r3
            r1.f18119t = r10     // Catch:{ HttpException -> 0x092d }
            goto L_0x0723
        L_0x0831:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ HttpException -> 0x092d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ HttpException -> 0x092d }
            r4.<init>()     // Catch:{ HttpException -> 0x092d }
            java.lang.String r5 = "bad chunk char: "
            r4.append(r5)     // Catch:{ HttpException -> 0x092d }
            r4.append(r3)     // Catch:{ HttpException -> 0x092d }
            java.lang.String r3 = r4.toString()     // Catch:{ HttpException -> 0x092d }
            r2.<init>(r3)     // Catch:{ HttpException -> 0x092d }
            throw r2     // Catch:{ HttpException -> 0x092d }
        L_0x0848:
            r8 = 48
            r10 = 5
            r1.f18114o = r10     // Catch:{ HttpException -> 0x092d }
            goto L_0x0724
        L_0x084f:
            r8 = 48
            r10 = 5
            r1.f18115p = r3     // Catch:{ HttpException -> 0x092d }
            int r11 = r1.f18119t     // Catch:{ HttpException -> 0x092d }
            if (r11 != 0) goto L_0x0885
            if (r3 != r2) goto L_0x0874
            w5.d r2 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            boolean r2 = r2.mo42408J0()     // Catch:{ HttpException -> 0x092d }
            if (r2 == 0) goto L_0x0874
            w5.d r2 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            byte r2 = r2.peek()     // Catch:{ HttpException -> 0x092d }
            r3 = 10
            if (r2 != r3) goto L_0x0874
            w5.d r2 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            byte r2 = r2.get()     // Catch:{ HttpException -> 0x092d }
            r1.f18115p = r2     // Catch:{ HttpException -> 0x092d }
        L_0x0874:
            boolean r2 = r1.f18112m     // Catch:{ HttpException -> 0x092d }
            if (r2 == 0) goto L_0x087a
            r2 = 0
            goto L_0x087b
        L_0x087a:
            r2 = 7
        L_0x087b:
            r1.f18114o = r2     // Catch:{ HttpException -> 0x092d }
            org.eclipse.jetty.http.m$a r2 = r1.f18100a     // Catch:{ HttpException -> 0x092d }
            long r3 = r1.f18118s     // Catch:{ HttpException -> 0x092d }
            r2.mo39535d(r3)     // Catch:{ HttpException -> 0x092d }
            return r6
        L_0x0885:
            r3 = 6
            r1.f18114o = r3     // Catch:{ HttpException -> 0x092d }
            goto L_0x0724
        L_0x088a:
            r8 = 48
            r9 = 2
            r10 = 5
            w5.d r3 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            byte r3 = r3.peek()     // Catch:{ HttpException -> 0x092d }
            r11 = 10
            if (r3 == r2) goto L_0x08ae
            if (r3 != r11) goto L_0x089b
            goto L_0x08ae
        L_0x089b:
            if (r3 > r5) goto L_0x08a4
            w5.d r3 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            r3.get()     // Catch:{ HttpException -> 0x092d }
            goto L_0x0726
        L_0x08a4:
            r3 = 0
            r1.f18119t = r3     // Catch:{ HttpException -> 0x0931 }
            r1.f18120u = r3     // Catch:{ HttpException -> 0x0931 }
            r3 = 4
            r1.f18114o = r3     // Catch:{ HttpException -> 0x092d }
            goto L_0x0726
        L_0x08ae:
            w5.d r3 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            byte r3 = r3.get()     // Catch:{ HttpException -> 0x092d }
            r1.f18115p = r3     // Catch:{ HttpException -> 0x092d }
            goto L_0x0726
        L_0x08b8:
            long r4 = r1.f18117r     // Catch:{ HttpException -> 0x092d }
            long r7 = r1.f18118s     // Catch:{ HttpException -> 0x092d }
            long r4 = r4 - r7
            r12 = 0
            int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x08d2
            boolean r2 = r1.f18112m     // Catch:{ HttpException -> 0x092d }
            if (r2 == 0) goto L_0x08c9
            r2 = 0
            goto L_0x08ca
        L_0x08c9:
            r2 = 7
        L_0x08ca:
            r1.f18114o = r2     // Catch:{ HttpException -> 0x092d }
            org.eclipse.jetty.http.m$a r2 = r1.f18100a     // Catch:{ HttpException -> 0x092d }
            r2.mo39535d(r7)     // Catch:{ HttpException -> 0x092d }
            return r6
        L_0x08d2:
            long r7 = (long) r3     // Catch:{ HttpException -> 0x092d }
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x08d8
            int r3 = (int) r4     // Catch:{ HttpException -> 0x092d }
        L_0x08d8:
            w5.d r2 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            w5.d r2 = r2.get(r3)     // Catch:{ HttpException -> 0x092d }
            long r3 = r1.f18118s     // Catch:{ HttpException -> 0x092d }
            int r5 = r2.length()     // Catch:{ HttpException -> 0x092d }
            long r7 = (long) r5     // Catch:{ HttpException -> 0x092d }
            long r3 = r3 + r7
            r1.f18118s = r3     // Catch:{ HttpException -> 0x092d }
            w5.m r3 = r1.f18113n     // Catch:{ HttpException -> 0x092d }
            r3.mo42496e(r2)     // Catch:{ HttpException -> 0x092d }
            org.eclipse.jetty.http.m$a r3 = r1.f18100a     // Catch:{ HttpException -> 0x092d }
            r3.mo39532a(r2)     // Catch:{ HttpException -> 0x092d }
            long r2 = r1.f18118s     // Catch:{ HttpException -> 0x092d }
            long r4 = r1.f18117r     // Catch:{ HttpException -> 0x092d }
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x0908
            boolean r4 = r1.f18112m     // Catch:{ HttpException -> 0x092d }
            if (r4 == 0) goto L_0x0900
            r7 = 0
            goto L_0x0901
        L_0x0900:
            r7 = 7
        L_0x0901:
            r1.f18114o = r7     // Catch:{ HttpException -> 0x092d }
            org.eclipse.jetty.http.m$a r4 = r1.f18100a     // Catch:{ HttpException -> 0x092d }
            r4.mo39535d(r2)     // Catch:{ HttpException -> 0x092d }
        L_0x0908:
            return r6
        L_0x0909:
            w5.d r2 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            int r3 = r2.length()     // Catch:{ HttpException -> 0x092d }
            w5.d r2 = r2.get(r3)     // Catch:{ HttpException -> 0x092d }
            long r3 = r1.f18118s     // Catch:{ HttpException -> 0x092d }
            int r5 = r2.length()     // Catch:{ HttpException -> 0x092d }
            long r7 = (long) r5     // Catch:{ HttpException -> 0x092d }
            long r3 = r3 + r7
            r1.f18118s = r3     // Catch:{ HttpException -> 0x092d }
            w5.m r3 = r1.f18113n     // Catch:{ HttpException -> 0x092d }
            r3.mo42496e(r2)     // Catch:{ HttpException -> 0x092d }
            org.eclipse.jetty.http.m$a r3 = r1.f18100a     // Catch:{ HttpException -> 0x092d }
            r3.mo39532a(r2)     // Catch:{ HttpException -> 0x092d }
            return r6
        L_0x0928:
            w5.d r3 = r1.f18105f     // Catch:{ HttpException -> 0x092d }
            goto L_0x0713
        L_0x092c:
            return r4
        L_0x092d:
            r0 = move-exception
            r2 = r0
            r3 = 0
            goto L_0x0933
        L_0x0931:
            r0 = move-exception
            r2 = r0
        L_0x0933:
            r1.f18112m = r3
            r3 = 7
            r1.f18114o = r3
            goto L_0x093a
        L_0x0939:
            throw r2
        L_0x093a:
            goto L_0x0939
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.http.C9910m.mo39850p():int");
    }

    /* renamed from: q */
    public void mo39851q(boolean z) {
        this.f18121v = z;
    }

    public void reset() {
        C11940d dVar;
        C11952m mVar = this.f18113n;
        mVar.mo42442v0(mVar.mo42416U0());
        this.f18114o = this.f18112m ? -14 : this.f18102c.mo39669s() ? 0 : 7;
        this.f18117r = -3;
        this.f18118s = 0;
        this.f18116q = 0;
        this.f18110k = 0;
        if (this.f18115p == 13 && (dVar = this.f18105f) != null && dVar.mo42408J0() && this.f18105f.peek() == 10) {
            this.f18115p = this.f18105f.get();
        }
        C11940d dVar2 = this.f18104e;
        if (dVar2 != null && dVar2.mo42408J0()) {
            C11940d dVar3 = this.f18103d;
            if (dVar3 == null) {
                mo39845k();
            } else {
                dVar3.mo42427g1(-1);
                this.f18103d.mo42407H0();
            }
            int M0 = this.f18103d.mo42410M0();
            if (M0 > this.f18104e.length()) {
                M0 = this.f18104e.length();
            }
            C11940d dVar4 = this.f18104e;
            dVar4.mo42445z(dVar4.mo42409L0(), M0);
            C11940d dVar5 = this.f18104e;
            dVar5.mo42441u0(this.f18103d.mo42405E0(dVar5.mo42445z(dVar5.mo42409L0(), M0)));
        }
        C11940d dVar6 = this.f18103d;
        if (dVar6 != null) {
            dVar6.mo42427g1(-1);
            this.f18103d.mo42407H0();
        }
        C11940d dVar7 = this.f18104e;
        if (dVar7 != null) {
            dVar7.mo42427g1(-1);
        }
        this.f18105f = this.f18103d;
        mo39838d();
    }

    public String toString() {
        return String.format("%s{s=%d,l=%d,c=%d}", new Object[]{C9910m.class.getSimpleName(), Integer.valueOf(this.f18114o), Integer.valueOf(this.f18116q), Long.valueOf(this.f18117r)});
    }
}
