package com.yeelight.yeelib.p150c.p184n;

import android.graphics.Color;
import com.yeelight.yeelib.device.models.C7610a;
import com.yeelight.yeelib.device.models.C7616d;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p184n.C7556g;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.utils.C10542f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yeelight.yeelib.c.n.c */
public class C7551c extends C7549a {

    /* renamed from: K */
    private C7616d f15202K = new C7616d();

    public C7551c(String str) {
        super(str);
        mo28871Y0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008b, code lost:
        if (r2.mo27728a() < r3.mo27728a()) goto L_0x007b;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yeelight.yeelib.p150c.p151i.C6024e.C6027c mo27637F() {
        /*
            r9 = this;
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r9.mo27710r(r0)
            com.yeelight.yeelib.c.n.e r0 = (com.yeelight.yeelib.p150c.p184n.C7554e) r0
            r1 = 0
            if (r0 == 0) goto L_0x002f
            boolean r2 = r0.mo28882c()
            if (r2 == 0) goto L_0x002f
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
            goto L_0x0030
        L_0x002f:
            r2 = r1
        L_0x0030:
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r9.mo27710r(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0070
            java.util.Iterator r0 = r0.iterator()
            r3 = r1
        L_0x0042:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0071
            java.lang.Object r4 = r0.next()
            com.yeelight.yeelib.c.n.k r4 = (com.yeelight.yeelib.p150c.p184n.C7561k) r4
            long r4 = r4.mo28947h()
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0042
            if (r3 != 0) goto L_0x0064
            com.yeelight.yeelib.c.i.e$c r3 = new com.yeelight.yeelib.c.i.e$c
            com.yeelight.yeelib.c.i.e$b r6 = com.yeelight.yeelib.p150c.p151i.C6024e.C6026b.CRON_JOB_TYPE_SCHEDULE
            com.yeelight.yeelib.c.i.e$a r7 = com.yeelight.yeelib.p150c.p151i.C6024e.C6025a.CRON_JOB_ACTION_OFF
            r3.<init>(r9, r6, r7)
            goto L_0x006c
        L_0x0064:
            long r6 = r3.mo27728a()
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x0042
        L_0x006c:
            r3.mo27730c(r4)
            goto L_0x0042
        L_0x0070:
            r3 = r1
        L_0x0071:
            if (r2 != 0) goto L_0x0077
            if (r3 == 0) goto L_0x0077
        L_0x0075:
            r1 = r3
            goto L_0x008e
        L_0x0077:
            if (r2 == 0) goto L_0x007d
            if (r3 != 0) goto L_0x007d
        L_0x007b:
            r1 = r2
            goto L_0x008e
        L_0x007d:
            if (r2 == 0) goto L_0x008e
            if (r3 == 0) goto L_0x008e
            long r0 = r2.mo27728a()
            long r4 = r3.mo27728a()
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0075
            goto L_0x007b
        L_0x008e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p184n.C7551c.mo27637F():com.yeelight.yeelib.c.i.e$c");
    }

    /* renamed from: G */
    public C6024e.C6027c mo27639G() {
        List<C7561k> list = (List) mo27710r(1);
        C6024e.C6027c cVar = null;
        if (list != null) {
            for (C7561k i : list) {
                long i2 = i.mo28948i();
                if (i2 != -1) {
                    if (cVar == null) {
                        cVar = new C6024e.C6027c(this, C6024e.C6026b.CRON_JOB_TYPE_SCHEDULE, C6024e.C6025a.CRON_JOB_ACTION_ON);
                    } else if (cVar.mo27728a() <= i2) {
                    }
                    cVar.mo27730c(i2);
                }
            }
        }
        return cVar;
    }

    /* renamed from: X0 */
    public C7616d mo28870X0() {
        return this.f15202K;
    }

    /* renamed from: Y0 */
    public void mo28871Y0() {
        ArrayList arrayList = new ArrayList();
        float[] fArr = {10.0f, 1.0f, C10542f.m25732a(this.f12775e.mo28888a())};
        arrayList.add(new C7556g.C7557a(Color.HSVToColor(fArr), 2000));
        fArr[0] = 70.0f;
        arrayList.add(new C7556g.C7557a(Color.HSVToColor(fArr), 2000));
        fArr[0] = 160.0f;
        arrayList.add(new C7556g.C7557a(Color.HSVToColor(fArr), 2000));
        fArr[0] = 270.0f;
        arrayList.add(new C7556g.C7557a(Color.HSVToColor(fArr), 2000));
        mo27701m0(arrayList);
    }

    /* renamed from: Z0 */
    public void mo28872Z0() {
        for (C9770e onStatusChange : this.f12773c) {
            onStatusChange.onStatusChange(8192, this);
        }
    }

    /* renamed from: a1 */
    public void mo28873a1(int i, int i2) {
        if (i == C7610a.ADDBEACON.ordinal()) {
            Iterator<C9770e> it = this.f12773c.iterator();
            if (i2 == 0) {
                while (it.hasNext()) {
                    it.next().onStatusChange(65536, this);
                }
                return;
            }
            while (it.hasNext()) {
                it.next().onStatusChange(131072, this);
            }
        } else if (i != C7610a.DELETEBEACON.ordinal()) {
        } else {
            if (i2 == 2) {
                mo28870X0().mo29063c();
                for (C9770e next : this.f12773c) {
                    next.onStatusChange(16384, this);
                    next.onStatusChange(4096, this);
                }
                return;
            }
            for (C9770e onStatusChange : this.f12773c) {
                onStatusChange.onStatusChange(32768, this);
            }
        }
    }

    /* renamed from: b1 */
    public void mo28874b1(String str) {
        this.f15202K.mo29064d(str);
        mo27689g0(4096);
    }
}
