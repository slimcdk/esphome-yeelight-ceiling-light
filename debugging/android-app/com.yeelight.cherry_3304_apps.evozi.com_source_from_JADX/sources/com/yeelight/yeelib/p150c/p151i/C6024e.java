package com.yeelight.yeelib.p150c.p151i;

import com.yeelight.yeelib.device.models.C7622g;
import com.yeelight.yeelib.device.models.YeelightTimer;
import com.yeelight.yeelib.p150c.C5999e;
import com.yeelight.yeelib.p150c.p184n.C7554e;
import com.yeelight.yeelib.p150c.p184n.C7556g;
import com.yeelight.yeelib.p153g.C9827a;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p186e.C9772g;
import com.yeelight.yeelib.wear.C10567a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.yeelight.yeelib.c.i.e */
public class C6024e {

    /* renamed from: A */
    private boolean f12761A = false;

    /* renamed from: B */
    private boolean f12762B = false;

    /* renamed from: C */
    private int f12763C;

    /* renamed from: D */
    private boolean f12764D;

    /* renamed from: E */
    private String f12765E;

    /* renamed from: F */
    private String f12766F;

    /* renamed from: G */
    private int f12767G;

    /* renamed from: H */
    private int f12768H = -1;

    /* renamed from: I */
    private long f12769I;

    /* renamed from: J */
    private boolean f12770J = true;

    /* renamed from: a */
    C7622g f12771a = null;

    /* renamed from: b */
    protected String f12772b;

    /* renamed from: c */
    protected List<C9770e> f12773c = new CopyOnWriteArrayList();

    /* renamed from: d */
    protected List<C9772g> f12774d = new CopyOnWriteArrayList();

    /* renamed from: e */
    protected C7556g f12775e;

    /* renamed from: f */
    private ArrayList<C5999e> f12776f;

    /* renamed from: g */
    private C6046l f12777g;

    /* renamed from: h */
    private boolean f12778h = false;

    /* renamed from: i */
    private int f12779i = -1;

    /* renamed from: j */
    private int f12780j = -1;

    /* renamed from: k */
    private String f12781k = "";

    /* renamed from: l */
    private String f12782l = "";

    /* renamed from: m */
    private String f12783m = "";

    /* renamed from: n */
    private String f12784n = "";

    /* renamed from: o */
    private Map<Integer, Object> f12785o;

    /* renamed from: p */
    private boolean f12786p = false;

    /* renamed from: q */
    private boolean f12787q = false;

    /* renamed from: r */
    private boolean f12788r = false;

    /* renamed from: s */
    private boolean f12789s = false;

    /* renamed from: t */
    private boolean f12790t = false;

    /* renamed from: u */
    private boolean f12791u = false;

    /* renamed from: v */
    private boolean f12792v = false;

    /* renamed from: w */
    private boolean f12793w = false;

    /* renamed from: x */
    private boolean f12794x = false;

    /* renamed from: y */
    private boolean f12795y = false;

    /* renamed from: z */
    private boolean f12796z = false;

    /* renamed from: com.yeelight.yeelib.c.i.e$a */
    public enum C6025a {
        CRON_JOB_ACTION_OFF,
        CRON_JOB_ACTION_ON
    }

    /* renamed from: com.yeelight.yeelib.c.i.e$b */
    public enum C6026b {
        CRON_JOB_TYPE_SCHEDULE,
        CRON_JOB_TYPE_DELAY_OFF
    }

    /* renamed from: com.yeelight.yeelib.c.i.e$c */
    public class C6027c {

        /* renamed from: a */
        C6026b f12803a;

        /* renamed from: b */
        C6025a f12804b;

        /* renamed from: c */
        long f12805c;

        public C6027c(C6024e eVar, C6026b bVar, C6025a aVar) {
            this.f12803a = bVar;
            this.f12804b = aVar;
        }

        /* renamed from: a */
        public long mo27728a() {
            return this.f12805c;
        }

        /* renamed from: b */
        public C6026b mo27729b() {
            return this.f12803a;
        }

        /* renamed from: c */
        public void mo27730c(long j) {
            this.f12805c = j;
        }

        public String toString() {
            return "type: " + this.f12803a.name() + ", " + "action: " + this.f12804b.name() + ", " + "time stamp: " + this.f12805c + "";
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.e$d */
    public enum C6028d {
        DEVICE_MODE_COLOR,
        DEVICE_MODE_SUNSHINE,
        DEVICE_MODE_FLOW,
        DEVICE_MODE_COLOR_HSV,
        DEVICE_MODE_OFF,
        DEVICE_MODE_READ,
        DEVICE_MODE_COMPUTER,
        DEVICE_MODE_NIGHT_LIGHT
    }

    public C6024e(String str) {
        this.f12772b = str;
        mo27655O();
        this.f12785o = new HashMap();
    }

    /* renamed from: A */
    public String mo27627A() {
        return this.f12772b;
    }

    /* renamed from: A0 */
    public void mo27628A0(C6046l lVar) {
        this.f12777g = lVar;
        for (C9770e onStatusChange : this.f12773c) {
            onStatusChange.onStatusChange(lVar == null ? 16384 : 8192, this);
        }
    }

    /* renamed from: B */
    public int mo27629B() {
        return this.f12767G;
    }

    /* renamed from: B0 */
    public void mo27630B0(C6028d dVar) {
        if (dVar != this.f12775e.mo28897j()) {
            this.f12775e.mo28911x(dVar);
            for (C9770e onStatusChange : this.f12773c) {
                onStatusChange.onStatusChange(4, this);
            }
        }
    }

    /* renamed from: C */
    public String mo27631C() {
        return this.f12766F;
    }

    /* renamed from: C0 */
    public void mo27632C0(String str) {
        if (str != null && !str.equals(this.f12772b)) {
            this.f12772b = str;
            for (C9770e onStatusChange : this.f12773c) {
                onStatusChange.onStatusChange(1024, this);
            }
        }
    }

    /* renamed from: D */
    public String mo27633D() {
        return this.f12765E;
    }

    /* renamed from: D0 */
    public void mo27634D0(int i) {
        this.f12767G = i;
    }

    /* renamed from: E */
    public int mo27635E() {
        return this.f12775e.mo28898k();
    }

    /* renamed from: E0 */
    public void mo27636E0(String str) {
        this.f12766F = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        if (r2.mo27728a() < r3.mo27728a()) goto L_0x007d;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yeelight.yeelib.p150c.p151i.C6024e.C6027c mo27637F() {
        /*
            r9 = this;
            java.util.Map<java.lang.Integer, java.lang.Object> r0 = r9.f12785o
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            com.yeelight.yeelib.c.n.e r0 = (com.yeelight.yeelib.p150c.p184n.C7554e) r0
            r1 = 0
            if (r0 == 0) goto L_0x0031
            boolean r2 = r0.mo28882c()
            if (r2 == 0) goto L_0x0031
            com.yeelight.yeelib.c.i.e$c r2 = new com.yeelight.yeelib.c.i.e$c
            com.yeelight.yeelib.c.i.e$b r3 = com.yeelight.yeelib.p150c.p151i.C6024e.C6026b.CRON_JOB_TYPE_DELAY_OFF
            com.yeelight.yeelib.c.i.e$a r4 = com.yeelight.yeelib.p150c.p151i.C6024e.C6025a.CRON_JOB_ACTION_OFF
            r2.<init>(r9, r3, r4)
            int r0 = r0.mo28880a()
            int r0 = r0 * 60
            int r0 = r0 * 1000
            long r3 = (long) r0
            long r5 = java.lang.System.currentTimeMillis()
            long r3 = r3 + r5
            r2.mo27730c(r3)
            goto L_0x0032
        L_0x0031:
            r2 = r1
        L_0x0032:
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r9.mo27710r(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0072
            java.util.Iterator r0 = r0.iterator()
            r3 = r1
        L_0x0044:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0073
            java.lang.Object r4 = r0.next()
            com.yeelight.yeelib.device.models.YeelightTimer r4 = (com.yeelight.yeelib.device.models.YeelightTimer) r4
            long r4 = r4.mo29032g()
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0044
            if (r3 != 0) goto L_0x0066
            com.yeelight.yeelib.c.i.e$c r3 = new com.yeelight.yeelib.c.i.e$c
            com.yeelight.yeelib.c.i.e$b r6 = com.yeelight.yeelib.p150c.p151i.C6024e.C6026b.CRON_JOB_TYPE_SCHEDULE
            com.yeelight.yeelib.c.i.e$a r7 = com.yeelight.yeelib.p150c.p151i.C6024e.C6025a.CRON_JOB_ACTION_OFF
            r3.<init>(r9, r6, r7)
            goto L_0x006e
        L_0x0066:
            long r6 = r3.mo27728a()
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x0044
        L_0x006e:
            r3.mo27730c(r4)
            goto L_0x0044
        L_0x0072:
            r3 = r1
        L_0x0073:
            if (r2 != 0) goto L_0x0079
            if (r3 == 0) goto L_0x0079
        L_0x0077:
            r1 = r3
            goto L_0x0090
        L_0x0079:
            if (r2 == 0) goto L_0x007f
            if (r3 != 0) goto L_0x007f
        L_0x007d:
            r1 = r2
            goto L_0x0090
        L_0x007f:
            if (r2 == 0) goto L_0x0090
            if (r3 == 0) goto L_0x0090
            long r0 = r2.mo27728a()
            long r4 = r3.mo27728a()
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0077
            goto L_0x007d
        L_0x0090:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p151i.C6024e.mo27637F():com.yeelight.yeelib.c.i.e$c");
    }

    /* renamed from: F0 */
    public void mo27638F0(String str) {
        this.f12765E = str;
    }

    /* renamed from: G */
    public C6027c mo27639G() {
        List<YeelightTimer> list = (List) mo27710r(1);
        C6027c cVar = null;
        if (list != null) {
            for (YeelightTimer h : list) {
                long h2 = h.mo29033h();
                if (h2 != -1) {
                    if (cVar == null) {
                        cVar = new C6027c(this, C6026b.CRON_JOB_TYPE_SCHEDULE, C6025a.CRON_JOB_ACTION_ON);
                    } else if (cVar.mo27728a() <= h2) {
                    }
                    cVar.mo27730c(h2);
                }
            }
        }
        return cVar;
    }

    /* renamed from: G0 */
    public void mo27640G0(boolean z) {
        if (this.f12764D != z) {
            this.f12764D = z;
            for (C9770e onStatusChange : this.f12773c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: H */
    public int mo27641H() {
        return this.f12763C;
    }

    /* renamed from: H0 */
    public void mo27642H0(long j) {
        if (j != ((long) this.f12775e.mo28898k())) {
            this.f12775e.mo28912y((int) j);
            for (C9770e onStatusChange : this.f12773c) {
                onStatusChange.onStatusChange(8, this);
            }
        }
    }

    /* renamed from: I */
    public boolean mo27643I() {
        return this.f12778h;
    }

    /* renamed from: I0 */
    public void mo27644I0(int i) {
        if (this.f12763C != i) {
            this.f12763C = i;
            for (C9770e onStatusChange : this.f12773c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: J */
    public int mo27645J() {
        return this.f12779i;
    }

    /* renamed from: J0 */
    public void mo27646J0(boolean z) {
        if (this.f12778h != z) {
            this.f12778h = z;
            for (C9770e onStatusChange : this.f12773c) {
                onStatusChange.onStatusChange(2048, this);
            }
            C10567a.m25859c().mo33401a();
            if (!this.f12778h) {
                this.f12779i = -1;
            }
        }
    }

    /* renamed from: K */
    public String mo27647K() {
        return this.f12781k;
    }

    /* renamed from: K0 */
    public void mo27648K0(boolean z) {
        if (z != this.f12775e.mo28901n()) {
            this.f12775e.mo28913z(z);
            Iterator<C9770e> it = this.f12773c.iterator();
            while (true) {
                int i = 1;
                if (!it.hasNext()) {
                    break;
                }
                C9770e next = it.next();
                if (!z) {
                    i = 2;
                }
                next.onStatusChange(i, this);
            }
            for (C9772g d : this.f12774d) {
                d.mo27513d(z ? 1 : 2, this);
            }
            C10567a.m25859c().mo33401a();
        }
    }

    /* renamed from: L */
    public int mo27649L() {
        return this.f12768H;
    }

    /* renamed from: L0 */
    public void mo27650L0(int i) {
        int i2 = this.f12779i;
        this.f12779i = i;
        if (Math.abs(i - i2) > 10) {
            for (C9770e onStatusChange : this.f12773c) {
                onStatusChange.onStatusChange(8388608, this);
            }
        }
    }

    /* renamed from: M */
    public String mo27651M() {
        return this.f12784n;
    }

    /* renamed from: M0 */
    public void mo27652M0(boolean z) {
        if (this.f12787q != z) {
            this.f12787q = z;
            for (C9770e onStatusChange : this.f12773c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: N */
    public long mo27653N() {
        return this.f12769I;
    }

    /* renamed from: N0 */
    public boolean mo27654N0(C9856y yVar) {
        C6028d dVar;
        mo27715t0(false);
        mo27713s0((C9827a) null);
        if (yVar.mo31893y()) {
            if (yVar.mo31874f() != -1) {
                mo27697k0((long) yVar.mo31874f());
            }
            return false;
        }
        if (yVar.mo31853B()) {
            if (yVar.mo31874f() != -1) {
                mo27697k0((long) yVar.mo31874f());
            }
            mo27699l0(yVar.mo31875g());
            dVar = C6028d.DEVICE_MODE_COLOR;
        } else if (yVar.mo31855D()) {
            if (yVar.mo31874f() != -1) {
                mo27697k0((long) yVar.mo31874f());
            }
            mo27707p0(yVar.mo31876h());
            dVar = C6028d.DEVICE_MODE_SUNSHINE;
        } else {
            if (yVar.mo31891w()) {
                ArrayList arrayList = new ArrayList();
                for (int aVar : yVar.mo31878j()) {
                    arrayList.add(new C7556g.C7557a(aVar, yVar.mo31881m()));
                }
                if (yVar.mo31874f() != -1) {
                    mo27697k0((long) yVar.mo31874f());
                }
                mo27701m0(arrayList);
            } else if (yVar.mo31890v()) {
                mo27713s0(yVar.mo31871c());
                mo27715t0(true);
            } else if (!yVar.mo31857F()) {
                return true;
            } else {
                if (yVar.mo31874f() != -1) {
                    mo27642H0((long) yVar.mo31874f());
                }
                dVar = C6028d.DEVICE_MODE_NIGHT_LIGHT;
            }
            dVar = C6028d.DEVICE_MODE_FLOW;
        }
        mo27630B0(dVar);
        return false;
    }

    /* renamed from: O */
    public void mo27655O() {
        this.f12775e = C7556g.m22261f();
    }

    /* renamed from: O0 */
    public void mo27656O0(String str) {
        this.f12781k = str;
    }

    /* renamed from: P */
    public boolean mo27657P() {
        return this.f12795y;
    }

    /* renamed from: P0 */
    public void mo27658P0(int i) {
        this.f12768H = i;
    }

    /* renamed from: Q */
    public boolean mo27659Q() {
        return this.f12794x;
    }

    /* renamed from: Q0 */
    public void mo27660Q0(String str) {
        this.f12784n = str;
    }

    /* renamed from: R */
    public boolean mo27661R() {
        return this.f12775e.mo28900m();
    }

    /* renamed from: R0 */
    public void mo27662R0(long j) {
        if (this.f12769I != j) {
            this.f12769I = j;
            for (C9770e onStatusChange : this.f12773c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: S */
    public boolean mo27663S() {
        return this.f12786p;
    }

    /* renamed from: S0 */
    public void mo27664S0() {
        mo27648K0(!this.f12775e.mo28901n());
    }

    /* renamed from: T */
    public boolean mo27665T() {
        return this.f12796z;
    }

    /* renamed from: T0 */
    public void mo27666T0(C9770e eVar) {
        if (eVar == null) {
            this.f12773c.clear();
        } else {
            this.f12773c.remove(eVar);
        }
    }

    /* renamed from: U */
    public boolean mo27667U() {
        return this.f12762B;
    }

    /* renamed from: U0 */
    public void mo27668U0(C9772g gVar) {
        List<C9772g> list = this.f12774d;
        if (list == null) {
            list.clear();
        } else {
            list.remove(gVar);
        }
    }

    /* renamed from: V */
    public boolean mo27669V() {
        return this.f12791u;
    }

    /* renamed from: V0 */
    public void mo27670V0(int i) {
        C7554e eVar = (C7554e) this.f12785o.get(2);
        if (eVar != null && eVar.mo28884e(i)) {
            for (C9770e onStatusChange : this.f12773c) {
                onStatusChange.onStatusChange(4096, this);
            }
            for (C9772g d : this.f12774d) {
                d.mo27513d(4096, this);
            }
        }
    }

    /* renamed from: W */
    public boolean mo27671W() {
        return this.f12788r;
    }

    /* renamed from: W0 */
    public void mo27672W0() {
        for (C9770e onStatusChange : this.f12773c) {
            onStatusChange.onStatusChange(4096, this);
        }
    }

    /* renamed from: X */
    public boolean mo27673X() {
        return this.f12789s;
    }

    /* renamed from: Y */
    public boolean mo27674Y() {
        return this.f12793w;
    }

    /* renamed from: Z */
    public boolean mo27675Z() {
        return this.f12792v && this.f12777g != null;
    }

    /* renamed from: a */
    public void mo27676a(C7554e eVar) {
        this.f12785o.put(2, eVar);
        for (C9770e onStatusChange : this.f12773c) {
            onStatusChange.onStatusChange(4096, this);
        }
        for (C9772g d : this.f12774d) {
            d.mo27513d(4096, this);
        }
    }

    /* renamed from: a0 */
    public boolean mo27677a0() {
        return this.f12790t;
    }

    /* renamed from: b */
    public void mo27678b(Integer num, Object obj) {
        this.f12785o.put(num, obj);
        for (C9770e onStatusChange : this.f12773c) {
            onStatusChange.onStatusChange(4096, this);
        }
    }

    /* renamed from: b0 */
    public boolean mo27679b0() {
        return this.f12764D;
    }

    /* renamed from: c */
    public void mo27680c(boolean z) {
        if (this.f12795y != z) {
            this.f12795y = z;
            for (C9770e onStatusChange : this.f12773c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: c0 */
    public boolean mo27681c0() {
        return this.f12775e.mo28901n();
    }

    /* renamed from: d */
    public void mo27682d(boolean z) {
        if (this.f12786p != z) {
            this.f12786p = z;
            for (C9770e onStatusChange : this.f12773c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: d0 */
    public boolean mo27683d0() {
        return this.f12787q;
    }

    /* renamed from: e */
    public void mo27684e(boolean z) {
        if (this.f12796z != z) {
            this.f12796z = z;
            for (C9770e onStatusChange : this.f12773c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: e0 */
    public boolean mo27685e0() {
        return this.f12761A;
    }

    /* renamed from: f */
    public void mo27686f(boolean z) {
        if (this.f12762B != z) {
            this.f12762B = z;
            for (C9770e onStatusChange : this.f12773c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: f0 */
    public void mo27687f0() {
        for (C9770e onStatusChange : this.f12773c) {
            onStatusChange.onStatusChange(0, this);
        }
    }

    /* renamed from: g */
    public void mo27688g(boolean z) {
        if (this.f12791u != z) {
            this.f12791u = z;
            for (C9770e onStatusChange : this.f12773c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: g0 */
    public void mo27689g0(int i) {
        for (C9770e onStatusChange : this.f12773c) {
            onStatusChange.onStatusChange(i, this);
        }
    }

    /* renamed from: h */
    public void mo27690h(boolean z) {
        if (this.f12792v != z) {
            this.f12792v = z;
            for (C9770e onStatusChange : this.f12773c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: h0 */
    public void mo27691h0(C9770e eVar, boolean z) {
        if (!this.f12773c.contains(eVar)) {
            this.f12773c.add(eVar);
        }
        if (z) {
            eVar.onStatusChange(-1, this);
        }
    }

    /* renamed from: i */
    public void mo27692i(boolean z) {
        if (this.f12790t != z) {
            this.f12790t = z;
            for (C9770e onStatusChange : this.f12773c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: i0 */
    public void mo27693i0(C9772g gVar) {
        if (!this.f12774d.contains(gVar)) {
            this.f12774d.add(gVar);
        }
    }

    /* renamed from: j */
    public void mo27694j(boolean z) {
        if (this.f12761A != z) {
            this.f12761A = z;
            for (C9770e onStatusChange : this.f12773c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: j0 */
    public void mo27695j0(boolean z) {
        if (this.f12770J != z) {
            this.f12770J = z;
            for (C9770e onStatusChange : this.f12773c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: k */
    public void mo27696k(boolean z) {
        if (this.f12794x != z) {
            this.f12794x = z;
            for (C9770e onStatusChange : this.f12773c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: k0 */
    public void mo27697k0(long j) {
        if (j != ((long) this.f12775e.mo28888a())) {
            this.f12775e.mo28902o((int) j);
            for (C9770e onStatusChange : this.f12773c) {
                onStatusChange.onStatusChange(8, this);
            }
            for (C9772g d : this.f12774d) {
                d.mo27513d(8, this);
            }
        }
    }

    /* renamed from: l */
    public boolean mo27698l() {
        return this.f12770J;
    }

    /* renamed from: l0 */
    public void mo27699l0(int i) {
        if (i != this.f12775e.mo28889b()) {
            this.f12775e.mo28903p(i);
            for (C9770e onStatusChange : this.f12773c) {
                onStatusChange.onStatusChange(16, this);
            }
        }
    }

    /* renamed from: m */
    public int mo27700m() {
        return this.f12775e.mo28888a();
    }

    /* renamed from: m0 */
    public void mo27701m0(List<C7556g.C7557a> list) {
        this.f12775e.mo28904q(list);
        for (C9770e onStatusChange : this.f12773c) {
            onStatusChange.onStatusChange(64, this);
        }
    }

    /* renamed from: n */
    public int mo27702n() {
        return this.f12775e.mo28889b();
    }

    /* renamed from: n0 */
    public void mo27703n0(long j) {
        if (j != ((long) this.f12775e.mo28895h())) {
            this.f12775e.mo28909v((int) j);
            for (C9770e onStatusChange : this.f12773c) {
                onStatusChange.onStatusChange(16, this);
            }
        }
    }

    /* renamed from: o */
    public List<C7556g.C7557a> mo27704o() {
        return this.f12775e.mo28890c();
    }

    /* renamed from: o0 */
    public void mo27705o0(long j) {
        if (j != ((long) this.f12775e.mo28899l())) {
            this.f12775e.mo28887A((int) j);
            for (C9770e onStatusChange : this.f12773c) {
                onStatusChange.onStatusChange(16, this);
            }
        }
    }

    /* renamed from: p */
    public int mo27706p() {
        return this.f12775e.mo28892e();
    }

    /* renamed from: p0 */
    public void mo27707p0(int i) {
        if (i != this.f12775e.mo28892e()) {
            this.f12775e.mo28906s(i);
            for (C9770e onStatusChange : this.f12773c) {
                onStatusChange.onStatusChange(32, this);
            }
        }
    }

    /* renamed from: q */
    public ArrayList<C5999e> mo27708q() {
        return this.f12776f;
    }

    /* renamed from: q0 */
    public void mo27709q0(ArrayList<C5999e> arrayList) {
        this.f12776f = arrayList;
        for (C9770e onStatusChange : this.f12773c) {
            onStatusChange.onStatusChange(4096, this);
        }
    }

    /* renamed from: r */
    public Object mo27710r(Integer num) {
        return this.f12785o.get(num);
    }

    /* renamed from: r0 */
    public boolean mo27711r0(C7622g gVar) {
        if (gVar.equals(this.f12771a)) {
            return false;
        }
        this.f12771a = gVar;
        for (C9770e onStatusChange : this.f12773c) {
            onStatusChange.onStatusChange(256, this);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C7622g mo27712s() {
        return this.f12771a;
    }

    /* renamed from: s0 */
    public void mo27713s0(C9827a aVar) {
        this.f12775e.mo28907t(aVar);
        for (C9770e onStatusChange : this.f12773c) {
            onStatusChange.onStatusChange(128, this);
        }
    }

    /* renamed from: t */
    public C9827a mo27714t() {
        return this.f12775e.mo28894g();
    }

    /* renamed from: t0 */
    public void mo27715t0(boolean z) {
        this.f12775e.mo28908u(z);
        for (C9770e onStatusChange : this.f12773c) {
            onStatusChange.onStatusChange(262144, this);
        }
    }

    /* renamed from: u */
    public int mo27716u() {
        return this.f12780j;
    }

    /* renamed from: u0 */
    public void mo27717u0(boolean z) {
        if (this.f12788r != z) {
            this.f12788r = z;
            for (C9770e onStatusChange : this.f12773c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: v */
    public C7556g mo27718v() {
        return this.f12775e;
    }

    /* renamed from: v0 */
    public void mo27719v0(boolean z) {
        if (this.f12789s != z) {
            this.f12789s = z;
            for (C9770e onStatusChange : this.f12773c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: w */
    public String mo27720w() {
        return this.f12782l;
    }

    /* renamed from: w0 */
    public void mo27721w0(boolean z) {
        if (this.f12793w != z) {
            this.f12793w = z;
            for (C9770e onStatusChange : this.f12773c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: x */
    public String mo27722x() {
        return this.f12783m;
    }

    /* renamed from: x0 */
    public void mo27723x0(int i) {
        this.f12780j = i;
    }

    /* renamed from: y */
    public C6046l mo27724y() {
        return this.f12777g;
    }

    /* renamed from: y0 */
    public void mo27725y0(String str) {
        this.f12782l = str;
    }

    /* renamed from: z */
    public C6028d mo27726z() {
        return this.f12775e.mo28897j();
    }

    /* renamed from: z0 */
    public void mo27727z0(String str) {
        this.f12783m = str;
    }
}
