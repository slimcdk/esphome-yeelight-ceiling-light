package com.yeelight.yeelib.device.base;

import com.yeelight.yeelib.device.C6163d;
import com.yeelight.yeelib.device.models.YeelightTimer;
import com.yeelight.yeelib.models.C8308a;
import com.yeelight.yeelib.models.C8327s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p179k4.C9295a;
import p207s3.C10343e;
import p227x3.C11969f;
import p232y3.C12041e;
import p232y3.C12043g;
import p237z3.C12145e;
import p237z3.C12147g;

public class DeviceStatusBase {

    /* renamed from: A */
    private boolean f12452A = false;

    /* renamed from: B */
    private boolean f12453B = false;

    /* renamed from: C */
    private int f12454C;

    /* renamed from: D */
    private boolean f12455D;

    /* renamed from: E */
    private String f12456E;

    /* renamed from: F */
    private String f12457F;

    /* renamed from: G */
    private int f12458G;

    /* renamed from: H */
    private int f12459H = -1;

    /* renamed from: I */
    private long f12460I;

    /* renamed from: J */
    private boolean f12461J = true;

    /* renamed from: a */
    C11969f f12462a = null;

    /* renamed from: b */
    protected String f12463b;

    /* renamed from: c */
    protected List<C12145e> f12464c = new CopyOnWriteArrayList();

    /* renamed from: d */
    protected List<C12147g> f12465d = new CopyOnWriteArrayList();

    /* renamed from: e */
    protected C12043g f12466e;

    /* renamed from: f */
    private ArrayList<C6163d> f12467f;

    /* renamed from: g */
    private C10343e f12468g;

    /* renamed from: h */
    private boolean f12469h = false;

    /* renamed from: i */
    private int f12470i = -1;

    /* renamed from: j */
    private int f12471j = -1;

    /* renamed from: k */
    private String f12472k = "";

    /* renamed from: l */
    private String f12473l = "";

    /* renamed from: m */
    private String f12474m = "";

    /* renamed from: n */
    private String f12475n = "";

    /* renamed from: o */
    private Map<Integer, Object> f12476o;

    /* renamed from: p */
    private boolean f12477p = false;

    /* renamed from: q */
    private boolean f12478q = false;

    /* renamed from: r */
    private boolean f12479r = false;

    /* renamed from: s */
    private boolean f12480s = false;

    /* renamed from: t */
    private boolean f12481t = false;

    /* renamed from: u */
    private boolean f12482u = false;

    /* renamed from: v */
    private boolean f12483v = false;

    /* renamed from: w */
    private boolean f12484w = false;

    /* renamed from: x */
    private boolean f12485x = false;

    /* renamed from: y */
    private boolean f12486y = false;

    /* renamed from: z */
    private boolean f12487z = false;

    public enum CronJobAction {
        CRON_JOB_ACTION_OFF,
        CRON_JOB_ACTION_ON
    }

    public enum CronJobType {
        CRON_JOB_TYPE_SCHEDULE,
        CRON_JOB_TYPE_DELAY_OFF
    }

    public enum DeviceMode {
        DEVICE_MODE_COLOR,
        DEVICE_MODE_SUNSHINE,
        DEVICE_MODE_FLOW,
        DEVICE_MODE_COLOR_HSV,
        DEVICE_MODE_READ,
        DEVICE_MODE_COMPUTER,
        DEVICE_MODE_NIGHT_LIGHT
    }

    /* renamed from: com.yeelight.yeelib.device.base.DeviceStatusBase$a */
    public class C6089a {

        /* renamed from: a */
        CronJobType f12488a;

        /* renamed from: b */
        CronJobAction f12489b;

        /* renamed from: c */
        long f12490c;

        public C6089a(DeviceStatusBase deviceStatusBase, CronJobType cronJobType, CronJobAction cronJobAction) {
            this.f12488a = cronJobType;
            this.f12489b = cronJobAction;
        }

        /* renamed from: a */
        public long mo31629a() {
            return this.f12490c;
        }

        /* renamed from: b */
        public CronJobType mo31630b() {
            return this.f12488a;
        }

        /* renamed from: c */
        public void mo31631c(long j) {
            this.f12490c = j;
        }

        public String toString() {
            return "type: " + this.f12488a.name() + ", " + "action: " + this.f12489b.name() + ", " + "time stamp: " + this.f12490c + "";
        }
    }

    public DeviceStatusBase(String str) {
        this.f12463b = str;
        mo31556P();
        this.f12476o = new HashMap();
    }

    /* renamed from: A */
    public String mo31526A() {
        return this.f12463b;
    }

    /* renamed from: A0 */
    public void mo31527A0(String str) {
        this.f12474m = str;
    }

    /* renamed from: B */
    public int mo31528B() {
        return this.f12466e.mo42698l();
    }

    /* renamed from: B0 */
    public void mo31529B0(C10343e eVar) {
        this.f12468g = eVar;
        for (C12145e onStatusChange : this.f12464c) {
            onStatusChange.onStatusChange(eVar == null ? 16384 : 8192, this);
        }
    }

    /* renamed from: C */
    public int mo31530C() {
        return this.f12458G;
    }

    /* renamed from: C0 */
    public void mo31531C0(DeviceMode deviceMode) {
        if (deviceMode != this.f12466e.mo42696j()) {
            this.f12466e.mo42711y(deviceMode);
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(4, this);
            }
        }
    }

    /* renamed from: D */
    public String mo31532D() {
        return this.f12457F;
    }

    /* renamed from: D0 */
    public void mo31533D0(String str) {
        if (str != null && !str.equals(this.f12463b)) {
            this.f12463b = str;
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(1024, this);
            }
        }
    }

    /* renamed from: E */
    public String mo31534E() {
        return this.f12456E;
    }

    /* renamed from: E0 */
    public void mo31535E0(int i) {
        if (i != this.f12466e.mo42698l()) {
            this.f12466e.mo42684A(i);
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(32, this);
            }
        }
    }

    /* renamed from: F */
    public int mo31536F() {
        return this.f12466e.mo42697k();
    }

    /* renamed from: F0 */
    public void mo31537F0(int i) {
        this.f12458G = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        if (r2.mo31629a() < r3.mo31629a()) goto L_0x007d;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yeelight.yeelib.device.base.DeviceStatusBase.C6089a mo31538G() {
        /*
            r9 = this;
            java.util.Map<java.lang.Integer, java.lang.Object> r0 = r9.f12476o
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            y3.e r0 = (p232y3.C12041e) r0
            r1 = 0
            if (r0 == 0) goto L_0x0031
            boolean r2 = r0.mo42679c()
            if (r2 == 0) goto L_0x0031
            com.yeelight.yeelib.device.base.DeviceStatusBase$a r2 = new com.yeelight.yeelib.device.base.DeviceStatusBase$a
            com.yeelight.yeelib.device.base.DeviceStatusBase$CronJobType r3 = com.yeelight.yeelib.device.base.DeviceStatusBase.CronJobType.CRON_JOB_TYPE_DELAY_OFF
            com.yeelight.yeelib.device.base.DeviceStatusBase$CronJobAction r4 = com.yeelight.yeelib.device.base.DeviceStatusBase.CronJobAction.CRON_JOB_ACTION_OFF
            r2.<init>(r9, r3, r4)
            int r0 = r0.mo42677a()
            int r0 = r0 * 60
            int r0 = r0 * 1000
            long r3 = (long) r0
            long r5 = java.lang.System.currentTimeMillis()
            long r3 = r3 + r5
            r2.mo31631c(r3)
            goto L_0x0032
        L_0x0031:
            r2 = r1
        L_0x0032:
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r9.mo31611r(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0072
            java.util.Iterator r0 = r0.iterator()
            r3 = r1
        L_0x0044:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0073
            java.lang.Object r4 = r0.next()
            com.yeelight.yeelib.device.models.YeelightTimer r4 = (com.yeelight.yeelib.device.models.YeelightTimer) r4
            long r4 = r4.mo31887g()
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0044
            if (r3 != 0) goto L_0x0066
            com.yeelight.yeelib.device.base.DeviceStatusBase$a r3 = new com.yeelight.yeelib.device.base.DeviceStatusBase$a
            com.yeelight.yeelib.device.base.DeviceStatusBase$CronJobType r6 = com.yeelight.yeelib.device.base.DeviceStatusBase.CronJobType.CRON_JOB_TYPE_SCHEDULE
            com.yeelight.yeelib.device.base.DeviceStatusBase$CronJobAction r7 = com.yeelight.yeelib.device.base.DeviceStatusBase.CronJobAction.CRON_JOB_ACTION_OFF
            r3.<init>(r9, r6, r7)
            goto L_0x006e
        L_0x0066:
            long r6 = r3.mo31629a()
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x0044
        L_0x006e:
            r3.mo31631c(r4)
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
            long r0 = r2.mo31629a()
            long r4 = r3.mo31629a()
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0077
            goto L_0x007d
        L_0x0090:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.base.DeviceStatusBase.mo31538G():com.yeelight.yeelib.device.base.DeviceStatusBase$a");
    }

    /* renamed from: G0 */
    public void mo31539G0(String str) {
        this.f12457F = str;
    }

    /* renamed from: H */
    public C6089a mo31540H() {
        List<YeelightTimer> list = (List) mo31611r(1);
        C6089a aVar = null;
        if (list != null) {
            for (YeelightTimer h : list) {
                long h2 = h.mo31888h();
                if (h2 != -1) {
                    if (aVar == null) {
                        aVar = new C6089a(this, CronJobType.CRON_JOB_TYPE_SCHEDULE, CronJobAction.CRON_JOB_ACTION_ON);
                    } else if (aVar.mo31629a() <= h2) {
                    }
                    aVar.mo31631c(h2);
                }
            }
        }
        return aVar;
    }

    /* renamed from: H0 */
    public void mo31541H0(String str) {
        this.f12456E = str;
    }

    /* renamed from: I */
    public int mo31542I() {
        return this.f12454C;
    }

    /* renamed from: I0 */
    public void mo31543I0(boolean z) {
        if (this.f12455D != z) {
            this.f12455D = z;
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: J */
    public boolean mo31544J() {
        return this.f12469h;
    }

    /* renamed from: J0 */
    public void mo31545J0(long j) {
        if (j != ((long) this.f12466e.mo42697k())) {
            this.f12466e.mo42712z((int) j);
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(8, this);
            }
        }
    }

    /* renamed from: K */
    public int mo31546K() {
        return this.f12470i;
    }

    /* renamed from: K0 */
    public void mo31547K0(int i) {
        if (this.f12454C != i) {
            this.f12454C = i;
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: L */
    public String mo31548L() {
        return this.f12472k;
    }

    /* renamed from: L0 */
    public void mo31549L0(boolean z) {
        if (this.f12469h != z) {
            this.f12469h = z;
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(2048, this);
            }
            C9295a.m22761c().mo37826a();
            if (!this.f12469h) {
                this.f12470i = -1;
            }
        }
    }

    /* renamed from: M */
    public int mo31550M() {
        return this.f12459H;
    }

    /* renamed from: M0 */
    public void mo31551M0(boolean z) {
        if (z != this.f12466e.mo42701o()) {
            this.f12466e.mo42685B(z);
            Iterator<C12145e> it = this.f12464c.iterator();
            while (true) {
                int i = 1;
                if (!it.hasNext()) {
                    break;
                }
                C12145e next = it.next();
                if (!z) {
                    i = 2;
                }
                next.onStatusChange(i, this);
            }
            for (C12147g d : this.f12465d) {
                d.mo31768d(z ? 1 : 2, this);
            }
            C9295a.m22761c().mo37826a();
        }
    }

    /* renamed from: N */
    public String mo31552N() {
        return this.f12475n;
    }

    /* renamed from: N0 */
    public void mo31553N0(int i) {
        int i2 = this.f12470i;
        this.f12470i = i;
        if (Math.abs(i - i2) > 10) {
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(8388608, this);
            }
        }
    }

    /* renamed from: O */
    public long mo31554O() {
        return this.f12460I;
    }

    /* renamed from: O0 */
    public void mo31555O0(boolean z) {
        if (this.f12478q != z) {
            this.f12478q = z;
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: P */
    public void mo31556P() {
        this.f12466e = C12043g.m31085f();
    }

    /* renamed from: P0 */
    public boolean mo31557P0(C8327s sVar) {
        DeviceMode deviceMode;
        mo31618u0(false);
        mo31616t0((C8308a) null);
        if (sVar.mo35458y()) {
            if (sVar.mo35439f() != -1) {
                mo31600l0((long) sVar.mo35439f());
            }
            return false;
        }
        if (sVar.mo35417B()) {
            if (sVar.mo35439f() != -1) {
                mo31600l0((long) sVar.mo35439f());
            }
            mo31602m0(sVar.mo35440g());
            deviceMode = DeviceMode.DEVICE_MODE_COLOR;
        } else if (sVar.mo35419D()) {
            if (sVar.mo35439f() != -1) {
                mo31600l0((long) sVar.mo35439f());
            }
            mo31610q0(sVar.mo35441h());
            deviceMode = DeviceMode.DEVICE_MODE_SUNSHINE;
        } else {
            if (sVar.mo35456w()) {
                ArrayList arrayList = new ArrayList();
                for (int aVar : sVar.mo35443j()) {
                    arrayList.add(new C12043g.C12044a(aVar, sVar.mo35446m()));
                }
                if (sVar.mo35439f() != -1) {
                    mo31600l0((long) sVar.mo35439f());
                }
                mo31604n0(arrayList);
            } else if (sVar.mo35455v()) {
                mo31616t0(sVar.mo35436c());
                mo31618u0(true);
            } else {
                if (sVar.mo35421F()) {
                    if (sVar.mo35439f() != -1) {
                        mo31545J0((long) sVar.mo35439f());
                    }
                } else if (!sVar.mo35422G()) {
                    return true;
                } else {
                    if (sVar.mo35439f() != -1) {
                        mo31545J0((long) sVar.mo35439f());
                    }
                    if (sVar.mo35441h() != -1) {
                        mo31535E0(sVar.mo35441h());
                    }
                }
                deviceMode = DeviceMode.DEVICE_MODE_NIGHT_LIGHT;
            }
            deviceMode = DeviceMode.DEVICE_MODE_FLOW;
        }
        mo31531C0(deviceMode);
        return false;
    }

    /* renamed from: Q */
    public boolean mo31558Q() {
        return this.f12486y;
    }

    /* renamed from: Q0 */
    public void mo31559Q0(String str) {
        this.f12472k = str;
    }

    /* renamed from: R */
    public boolean mo31560R() {
        return this.f12485x;
    }

    /* renamed from: R0 */
    public void mo31561R0(int i) {
        this.f12459H = i;
    }

    /* renamed from: S */
    public boolean mo31562S() {
        return this.f12466e.mo42700n();
    }

    /* renamed from: S0 */
    public void mo31563S0(String str) {
        this.f12475n = str;
    }

    /* renamed from: T */
    public boolean mo31564T() {
        return this.f12477p;
    }

    /* renamed from: T0 */
    public void mo31565T0(long j) {
        if (this.f12460I != j) {
            this.f12460I = j;
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: U */
    public boolean mo31566U() {
        return this.f12487z;
    }

    /* renamed from: U0 */
    public void mo31567U0() {
        mo31551M0(!this.f12466e.mo42701o());
    }

    /* renamed from: V */
    public boolean mo31568V() {
        return this.f12453B;
    }

    /* renamed from: V0 */
    public void mo31569V0(C12145e eVar) {
        if (eVar == null) {
            this.f12464c.clear();
        } else {
            this.f12464c.remove(eVar);
        }
    }

    /* renamed from: W */
    public boolean mo31570W() {
        return this.f12482u;
    }

    /* renamed from: W0 */
    public void mo31571W0(C12147g gVar) {
        List<C12147g> list = this.f12465d;
        if (list == null) {
            list.clear();
        } else {
            list.remove(gVar);
        }
    }

    /* renamed from: X */
    public boolean mo31572X() {
        return this.f12479r;
    }

    /* renamed from: X0 */
    public void mo31573X0(int i) {
        C12041e eVar = (C12041e) this.f12476o.get(2);
        if (eVar != null && eVar.mo42681e(i)) {
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(4096, this);
            }
            for (C12147g d : this.f12465d) {
                d.mo31768d(4096, this);
            }
        }
    }

    /* renamed from: Y */
    public boolean mo31574Y() {
        return this.f12480s;
    }

    /* renamed from: Y0 */
    public void mo31575Y0() {
        for (C12145e onStatusChange : this.f12464c) {
            onStatusChange.onStatusChange(4096, this);
        }
    }

    /* renamed from: Z */
    public boolean mo31576Z() {
        return this.f12484w;
    }

    /* renamed from: a */
    public void mo31577a(C12041e eVar) {
        this.f12476o.put(2, eVar);
        for (C12145e onStatusChange : this.f12464c) {
            onStatusChange.onStatusChange(4096, this);
        }
        for (C12147g d : this.f12465d) {
            d.mo31768d(4096, this);
        }
    }

    /* renamed from: a0 */
    public boolean mo31578a0() {
        return this.f12483v && this.f12468g != null;
    }

    /* renamed from: b */
    public void mo31579b(Integer num, Object obj) {
        this.f12476o.put(num, obj);
        for (C12145e onStatusChange : this.f12464c) {
            onStatusChange.onStatusChange(4096, this);
        }
    }

    /* renamed from: b0 */
    public boolean mo31580b0() {
        return this.f12481t;
    }

    /* renamed from: c */
    public void mo31581c(boolean z) {
        if (this.f12486y != z) {
            this.f12486y = z;
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: c0 */
    public boolean mo31582c0() {
        return this.f12455D;
    }

    /* renamed from: d */
    public void mo31583d(boolean z) {
        if (this.f12477p != z) {
            this.f12477p = z;
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: d0 */
    public boolean mo31584d0() {
        return this.f12466e.mo42701o();
    }

    /* renamed from: e */
    public void mo31585e(boolean z) {
        if (this.f12487z != z) {
            this.f12487z = z;
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: e0 */
    public boolean mo31586e0() {
        return this.f12478q;
    }

    /* renamed from: f */
    public void mo31587f(boolean z) {
        if (this.f12453B != z) {
            this.f12453B = z;
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: f0 */
    public boolean mo31588f0() {
        return this.f12452A;
    }

    /* renamed from: g */
    public void mo31589g(boolean z) {
        if (this.f12482u != z) {
            this.f12482u = z;
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: g0 */
    public void mo31590g0() {
        for (C12145e onStatusChange : this.f12464c) {
            onStatusChange.onStatusChange(0, this);
        }
    }

    /* renamed from: h */
    public void mo31591h(boolean z) {
        if (this.f12483v != z) {
            this.f12483v = z;
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: h0 */
    public void mo31592h0(int i) {
        for (C12145e onStatusChange : this.f12464c) {
            onStatusChange.onStatusChange(i, this);
        }
    }

    /* renamed from: i */
    public void mo31593i(boolean z) {
        if (this.f12481t != z) {
            this.f12481t = z;
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: i0 */
    public void mo31594i0(C12145e eVar, boolean z) {
        if (!this.f12464c.contains(eVar)) {
            this.f12464c.add(eVar);
        }
        if (z) {
            eVar.onStatusChange(-1, this);
        }
    }

    /* renamed from: j */
    public void mo31595j(boolean z) {
        if (this.f12452A != z) {
            this.f12452A = z;
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: j0 */
    public void mo31596j0(C12147g gVar) {
        if (!this.f12465d.contains(gVar)) {
            this.f12465d.add(gVar);
        }
    }

    /* renamed from: k */
    public void mo31597k(boolean z) {
        if (this.f12485x != z) {
            this.f12485x = z;
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: k0 */
    public void mo31598k0(boolean z) {
        if (this.f12461J != z) {
            this.f12461J = z;
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: l */
    public boolean mo31599l() {
        return this.f12461J;
    }

    /* renamed from: l0 */
    public void mo31600l0(long j) {
        if (j != ((long) this.f12466e.mo42687a())) {
            this.f12466e.mo42702p((int) j);
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(8, this);
            }
            for (C12147g d : this.f12465d) {
                d.mo31768d(8, this);
            }
        }
    }

    /* renamed from: m */
    public int mo31601m() {
        return this.f12466e.mo42687a();
    }

    /* renamed from: m0 */
    public void mo31602m0(int i) {
        if (i != this.f12466e.mo42688b()) {
            this.f12466e.mo42703q(i);
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(16, this);
            }
        }
    }

    /* renamed from: n */
    public int mo31603n() {
        return this.f12466e.mo42688b();
    }

    /* renamed from: n0 */
    public void mo31604n0(List<C12043g.C12044a> list) {
        this.f12466e.mo42704r(list);
        for (C12145e onStatusChange : this.f12464c) {
            onStatusChange.onStatusChange(64, this);
        }
    }

    /* renamed from: o */
    public List<C12043g.C12044a> mo31605o() {
        return this.f12466e.mo42689c();
    }

    /* renamed from: o0 */
    public void mo31606o0(long j) {
        if (j != ((long) this.f12466e.mo42694h())) {
            this.f12466e.mo42709w((int) j);
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(16, this);
            }
        }
    }

    /* renamed from: p */
    public int mo31607p() {
        return this.f12466e.mo42691e();
    }

    /* renamed from: p0 */
    public void mo31608p0(long j) {
        if (j != ((long) this.f12466e.mo42699m())) {
            this.f12466e.mo42686C((int) j);
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(16, this);
            }
        }
    }

    /* renamed from: q */
    public ArrayList<C6163d> mo31609q() {
        return this.f12467f;
    }

    /* renamed from: q0 */
    public void mo31610q0(int i) {
        if (i != this.f12466e.mo42691e()) {
            this.f12466e.mo42706t(i);
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(32, this);
            }
        }
    }

    /* renamed from: r */
    public Object mo31611r(Integer num) {
        return this.f12476o.get(num);
    }

    /* renamed from: r0 */
    public void mo31612r0(ArrayList<C6163d> arrayList) {
        this.f12467f = arrayList;
        for (C12145e onStatusChange : this.f12464c) {
            onStatusChange.onStatusChange(4096, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C11969f mo31613s() {
        return this.f12462a;
    }

    /* renamed from: s0 */
    public boolean mo31614s0(C11969f fVar) {
        if (fVar.equals(this.f12462a)) {
            return false;
        }
        this.f12462a = fVar;
        for (C12145e onStatusChange : this.f12464c) {
            onStatusChange.onStatusChange(256, this);
        }
        return true;
    }

    /* renamed from: t */
    public C8308a mo31615t() {
        return this.f12466e.mo42693g();
    }

    /* renamed from: t0 */
    public void mo31616t0(C8308a aVar) {
        this.f12466e.mo42707u(aVar);
        for (C12145e onStatusChange : this.f12464c) {
            onStatusChange.onStatusChange(128, this);
        }
    }

    /* renamed from: u */
    public int mo31617u() {
        return this.f12471j;
    }

    /* renamed from: u0 */
    public void mo31618u0(boolean z) {
        this.f12466e.mo42708v(z);
        for (C12145e onStatusChange : this.f12464c) {
            onStatusChange.onStatusChange(262144, this);
        }
    }

    /* renamed from: v */
    public C12043g mo31619v() {
        return this.f12466e;
    }

    /* renamed from: v0 */
    public void mo31620v0(boolean z) {
        if (this.f12479r != z) {
            this.f12479r = z;
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: w */
    public String mo31621w() {
        return this.f12473l;
    }

    /* renamed from: w0 */
    public void mo31622w0(boolean z) {
        if (this.f12480s != z) {
            this.f12480s = z;
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: x */
    public String mo31623x() {
        return this.f12474m;
    }

    /* renamed from: x0 */
    public void mo31624x0(boolean z) {
        if (this.f12484w != z) {
            this.f12484w = z;
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(4096, this);
            }
        }
    }

    /* renamed from: y */
    public C10343e mo31625y() {
        return this.f12468g;
    }

    /* renamed from: y0 */
    public void mo31626y0(int i) {
        this.f12471j = i;
    }

    /* renamed from: z */
    public DeviceMode mo31627z() {
        return this.f12466e.mo42696j();
    }

    /* renamed from: z0 */
    public void mo31628z0(String str) {
        this.f12473l = str;
    }
}
