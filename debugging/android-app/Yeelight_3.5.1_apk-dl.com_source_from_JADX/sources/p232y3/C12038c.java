package p232y3;

import android.graphics.Color;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.models.BleMessage;
import com.yeelight.yeelib.device.status.TimerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p051j4.C9188d;
import p227x3.C11966c;
import p232y3.C12043g;
import p237z3.C12145e;

/* renamed from: y3.c */
public class C12038c extends C12036a {

    /* renamed from: K */
    private C11966c f22075K = new C11966c();

    public C12038c(String str) {
        super(str);
        mo42668a1();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008b, code lost:
        if (r2.mo31629a() < r3.mo31629a()) goto L_0x007b;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yeelight.yeelib.device.base.DeviceStatusBase.C6089a mo31538G() {
        /*
            r9 = this;
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r9.mo31611r(r0)
            y3.e r0 = (p232y3.C12041e) r0
            r1 = 0
            if (r0 == 0) goto L_0x002f
            boolean r2 = r0.mo42679c()
            if (r2 == 0) goto L_0x002f
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
            goto L_0x0030
        L_0x002f:
            r2 = r1
        L_0x0030:
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r9.mo31611r(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0070
            java.util.Iterator r0 = r0.iterator()
            r3 = r1
        L_0x0042:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0071
            java.lang.Object r4 = r0.next()
            com.yeelight.yeelib.device.status.TimerModel r4 = (com.yeelight.yeelib.device.status.TimerModel) r4
            long r4 = r4.getNextOffTime()
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0042
            if (r3 != 0) goto L_0x0064
            com.yeelight.yeelib.device.base.DeviceStatusBase$a r3 = new com.yeelight.yeelib.device.base.DeviceStatusBase$a
            com.yeelight.yeelib.device.base.DeviceStatusBase$CronJobType r6 = com.yeelight.yeelib.device.base.DeviceStatusBase.CronJobType.CRON_JOB_TYPE_SCHEDULE
            com.yeelight.yeelib.device.base.DeviceStatusBase$CronJobAction r7 = com.yeelight.yeelib.device.base.DeviceStatusBase.CronJobAction.CRON_JOB_ACTION_OFF
            r3.<init>(r9, r6, r7)
            goto L_0x006c
        L_0x0064:
            long r6 = r3.mo31629a()
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x0042
        L_0x006c:
            r3.mo31631c(r4)
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
            long r0 = r2.mo31629a()
            long r4 = r3.mo31629a()
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0075
            goto L_0x007b
        L_0x008e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p232y3.C12038c.mo31538G():com.yeelight.yeelib.device.base.DeviceStatusBase$a");
    }

    /* renamed from: H */
    public DeviceStatusBase.C6089a mo31540H() {
        List<TimerModel> list = (List) mo31611r(1);
        DeviceStatusBase.C6089a aVar = null;
        if (list != null) {
            for (TimerModel nextOnTime : list) {
                long nextOnTime2 = nextOnTime.getNextOnTime();
                if (nextOnTime2 != -1) {
                    if (aVar == null) {
                        aVar = new DeviceStatusBase.C6089a(this, DeviceStatusBase.CronJobType.CRON_JOB_TYPE_SCHEDULE, DeviceStatusBase.CronJobAction.CRON_JOB_ACTION_ON);
                    } else if (aVar.mo31629a() <= nextOnTime2) {
                    }
                    aVar.mo31631c(nextOnTime2);
                }
            }
        }
        return aVar;
    }

    /* renamed from: Z0 */
    public C11966c mo42667Z0() {
        return this.f22075K;
    }

    /* renamed from: a1 */
    public void mo42668a1() {
        ArrayList arrayList = new ArrayList();
        float[] fArr = {10.0f, 1.0f, C9188d.m22130a(this.f12466e.mo42687a())};
        arrayList.add(new C12043g.C12044a(Color.HSVToColor(fArr), 2000));
        fArr[0] = 70.0f;
        arrayList.add(new C12043g.C12044a(Color.HSVToColor(fArr), 2000));
        fArr[0] = 160.0f;
        arrayList.add(new C12043g.C12044a(Color.HSVToColor(fArr), 2000));
        fArr[0] = 270.0f;
        arrayList.add(new C12043g.C12044a(Color.HSVToColor(fArr), 2000));
        mo31604n0(arrayList);
    }

    /* renamed from: b1 */
    public void mo42669b1() {
        for (C12145e onStatusChange : this.f12464c) {
            onStatusChange.onStatusChange(8192, this);
        }
    }

    /* renamed from: c1 */
    public void mo42670c1(int i, int i2) {
        if (i == BleMessage.ADDBEACON.ordinal()) {
            Iterator<C12145e> it = this.f12464c.iterator();
            if (i2 == 0) {
                while (it.hasNext()) {
                    it.next().onStatusChange(65536, this);
                }
                return;
            }
            while (it.hasNext()) {
                it.next().onStatusChange(131072, this);
            }
        } else if (i != BleMessage.DELETEBEACON.ordinal()) {
        } else {
            if (i2 == 2) {
                mo42667Z0().mo42534c();
                for (C12145e next : this.f12464c) {
                    next.onStatusChange(16384, this);
                    next.onStatusChange(4096, this);
                }
                return;
            }
            for (C12145e onStatusChange : this.f12464c) {
                onStatusChange.onStatusChange(32768, this);
            }
        }
    }

    /* renamed from: d1 */
    public void mo42671d1(String str) {
        this.f22075K.mo42535d(str);
        mo31592h0(4096);
    }
}
