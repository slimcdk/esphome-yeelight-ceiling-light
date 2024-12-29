package com.yeelight.yeelib.p150c.p183m;

import android.content.Context;
import com.p146mi.iot.common.abstractdevice.AbstractDevice;
import com.p146mi.iot.common.error.IotError;
import com.p146mi.iot.common.handler.CompletedHandler;
import com.p146mi.iot.common.instance.Property;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.models.C7638m0;
import com.yeelight.yeelib.device.xiaomi.base.C9763a;
import com.yeelight.yeelib.p150c.p151i.C6019c;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p185d.C7563a;
import com.yeelight.yeelib.utils.C10559w;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.yeelib.c.m.y */
public class C7472y extends C6019c {

    /* renamed from: com.yeelight.yeelib.c.m.y$a */
    class C7473a implements CompletedHandler {
        C7473a(C7472y yVar) {
        }

        public void onFailed(IotError iotError) {
        }

        public void onSucceed() {
        }
    }

    public C7472y(String str, String str2, String str3, String str4) {
        super(str, str2, str3, 1548, str4);
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        return false;
    }

    /* renamed from: B2 */
    public void mo28808B2(C9763a<Integer> aVar) {
        mo27825H1(2, 4, aVar);
    }

    /* renamed from: C2 */
    public void mo28809C2(boolean z) {
        "setCurtainHandOperateEn" + z;
        mo27622v2(3, 4, z);
    }

    /* renamed from: D2 */
    public void mo28810D2(int i) {
        mo27623w2(2, 5, i);
    }

    /* renamed from: E2 */
    public void mo28811E2() {
        int i;
        String str;
        Boolean bool = this.f12746H;
        if (bool != null && this.f12745G != null && this.f12751M && this.f12752N) {
            if (!bool.booleanValue() || this.f12745G.intValue() == 0) {
                str = mo27788M1() + "CURTAIN_MODE";
                i = 0;
            } else {
                str = mo27788M1() + "CURTAIN_MODE";
                i = this.f12745G.intValue();
            }
            C10559w.m25815k(str, i);
        }
    }

    /* renamed from: F */
    public int mo23303F() {
        return R$drawable.icon_yeelight_device_curtain_small;
    }

    /* renamed from: F2 */
    public void mo28812F2(boolean z, CompletedHandler completedHandler) {
        mo27843b2(3, 1, Boolean.valueOf(z), completedHandler);
    }

    /* renamed from: G2 */
    public void mo28813G2(boolean z, CompletedHandler completedHandler) {
        mo27843b2(3, 3, Boolean.valueOf(z), completedHandler);
    }

    /* renamed from: H */
    public int mo23306H() {
        return R$drawable.icon_yeelight_device_curtain_big;
    }

    /* renamed from: H2 */
    public void mo28814H2(boolean z, CompletedHandler completedHandler) {
        mo27843b2(3, 2, Boolean.valueOf(z), completedHandler);
    }

    /* renamed from: I1 */
    public List<Property> mo27826I1() {
        ArrayList arrayList = new ArrayList();
        List<Property> J1 = mo27827J1(2, new int[]{5, 6});
        if (J1 != null) {
            arrayList.addAll(J1);
        }
        List<Property> J12 = mo27827J1(3, new int[]{1, 7, 4, 8});
        if (J12 != null) {
            arrayList.addAll(J12);
        }
        return arrayList;
    }

    /* renamed from: I2 */
    public void mo28815I2(boolean z, CompletedHandler completedHandler) {
        mo27843b2(2, 8, Boolean.valueOf(z), completedHandler);
    }

    /* renamed from: J2 */
    public void mo28816J2(int i) {
        mo27626z2(3, 8, i);
    }

    /* renamed from: K2 */
    public void mo28817K2(int i) {
        mo27615A2(2, 7, i);
    }

    /* renamed from: N1 */
    public C7638m0[] mo27830N1(C9856y yVar) {
        return null;
    }

    /* renamed from: O1 */
    public C7638m0[] mo27831O1(boolean z) {
        int i = 1;
        C7638m0[] m0VarArr = new C7638m0[1];
        String M1 = mo27788M1();
        if (!z) {
            i = 2;
        }
        m0VarArr[0] = new C7638m0(M1, 2, 2, Integer.valueOf(i));
        return m0VarArr;
    }

    /* renamed from: P1 */
    public void mo27832P1(int i, int i2, Object obj) {
        if (obj != null) {
            if (i != 2) {
                if (i == 3) {
                    if (i2 == 1) {
                        this.f12746H = (Boolean) obj;
                    } else if (i2 == 4) {
                        this.f12747I = ((Boolean) obj).booleanValue();
                    } else if (i2 == 7) {
                        this.f12750L = ((Integer) obj).intValue();
                    } else if (i2 == 8) {
                        this.f12748J = ((Integer) obj).intValue();
                    }
                }
            } else if (i2 == 5) {
                this.f12745G = (Integer) obj;
            } else if (i2 == 6) {
                this.f12749K = ((Integer) obj).intValue();
            }
        }
    }

    /* renamed from: U0 */
    public boolean mo23317U0() {
        super.mo23317U0();
        mo27847h2();
        return false;
    }

    /* renamed from: X */
    public String mo23401X() {
        return "set_properties";
    }

    /* renamed from: X1 */
    public void mo27789X1(AbstractDevice abstractDevice) {
        super.mo27789X1(abstractDevice);
    }

    /* renamed from: b1 */
    public boolean mo23326b1() {
        return false;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        return false;
    }

    /* renamed from: e0 */
    public String mo23409e0() {
        Context context;
        int i;
        if (!mo23416o0()) {
            context = C4297y.f7456e;
            i = R$string.common_text_status_subtitle_offline;
        } else if (!mo23331k0()) {
            if (mo23333l0()) {
                context = C4297y.f7456e;
                i = R$string.common_text_status_connecting;
            } else {
                context = C4297y.f7456e;
                i = R$string.common_text_status_subtitle_online;
            }
        } else if (mo23339p0()) {
            context = C4297y.f7456e;
            i = R$string.common_text_status_upgrade;
        } else {
            context = C4297y.f7456e;
            i = R$string.common_text_status_subtitle_device_online;
        }
        return context.getString(i);
    }

    /* renamed from: f1 */
    public boolean mo23328f1(boolean z) {
        return false;
    }

    /* renamed from: f2 */
    public boolean mo27845f2() {
        return true;
    }

    /* renamed from: g0 */
    public int mo23329g0() {
        return 0;
    }

    /* renamed from: k2 */
    public boolean mo27748k2() {
        return mo27853l2(3, 5);
    }

    /* renamed from: l0 */
    public boolean mo23333l0() {
        return false;
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        return false;
    }

    /* renamed from: m0 */
    public boolean mo23335m0() {
        return !mo23331k0();
    }

    /* renamed from: m1 */
    public boolean mo23336m1(int i) {
        return false;
    }

    /* renamed from: n */
    public void mo23337n() {
    }

    /* renamed from: o1 */
    public boolean mo23338o1(C6024e.C6028d dVar) {
        return false;
    }

    /* renamed from: o2 */
    public boolean mo27749o2(String str, int i, int i2) {
        "unbindRemote mac: " + str;
        return mo27855n2(3, 6, str);
    }

    /* renamed from: p0 */
    public boolean mo23339p0() {
        return false;
    }

    /* renamed from: p1 */
    public boolean mo23340p1(long j) {
        return false;
    }

    /* renamed from: q1 */
    public boolean mo23341q1(int i) {
        return false;
    }

    /* renamed from: r */
    public void mo23342r() {
    }

    /* renamed from: r1 */
    public boolean mo23343r1(int i, int[] iArr, int i2) {
        return false;
    }

    /* renamed from: s */
    public boolean mo23344s(C7563a aVar) {
        return false;
    }

    /* renamed from: s1 */
    public boolean mo23345s1(int i) {
        return false;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        if (r3 != 0) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23347u0(android.view.View r6) {
        /*
            r5 = this;
            java.lang.String r0 = "com.yeelight.cherry.ui.activity.CurtainControlActivity"
            com.yeelight.yeelib.f.e r1 = com.yeelight.yeelib.p152f.C9784e.m23711b()
            boolean r1 = r1.mo31628d()
            if (r1 != 0) goto L_0x0027
            android.content.Context r0 = r6.getContext()
            android.content.Context r6 = r6.getContext()
            android.content.res.Resources r6 = r6.getResources()
            int r1 = com.yeelight.yeelib.R$string.common_text_please_check_network
            java.lang.String r6 = r6.getString(r1)
            r1 = 0
            android.widget.Toast r6 = android.widget.Toast.makeText(r0, r6, r1)
            r6.show()
            return
        L_0x0027:
            boolean r1 = r5.mo23331k0()
            java.lang.String r2 = "com.yeelight.cherry.device_id"
            if (r1 == 0) goto L_0x008c
            r1 = 0
            java.lang.Boolean r3 = r5.f12746H     // Catch:{ ClassNotFoundException -> 0x006f }
            if (r3 == 0) goto L_0x0050
            java.lang.Integer r3 = r5.f12745G     // Catch:{ ClassNotFoundException -> 0x006f }
            if (r3 == 0) goto L_0x0050
            java.lang.Boolean r3 = r5.f12746H     // Catch:{ ClassNotFoundException -> 0x006f }
            boolean r3 = r3.booleanValue()     // Catch:{ ClassNotFoundException -> 0x006f }
            if (r3 == 0) goto L_0x0048
            java.lang.Integer r3 = r5.f12745G     // Catch:{ ClassNotFoundException -> 0x006f }
            int r3 = r3.intValue()     // Catch:{ ClassNotFoundException -> 0x006f }
            if (r3 != 0) goto L_0x004a
        L_0x0048:
            java.lang.String r0 = "com.yeelight.cherry.ui.activity.CurtainGuideActivity"
        L_0x004a:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x006f }
            r1 = r0
            goto L_0x0073
        L_0x0050:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x006f }
            r3.<init>()     // Catch:{ ClassNotFoundException -> 0x006f }
            java.lang.String r4 = r5.mo27788M1()     // Catch:{ ClassNotFoundException -> 0x006f }
            r3.append(r4)     // Catch:{ ClassNotFoundException -> 0x006f }
            java.lang.String r4 = "CURTAIN_MODE"
            r3.append(r4)     // Catch:{ ClassNotFoundException -> 0x006f }
            java.lang.String r3 = r3.toString()     // Catch:{ ClassNotFoundException -> 0x006f }
            r4 = -1
            int r3 = com.yeelight.yeelib.utils.C10559w.m25807c(r3, r4)     // Catch:{ ClassNotFoundException -> 0x006f }
            if (r3 == r4) goto L_0x0073
            if (r3 == 0) goto L_0x0073
            goto L_0x004a
        L_0x006f:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0073:
            if (r1 == 0) goto L_0x00a6
            boolean r0 = r5.mo23331k0()
            if (r0 == 0) goto L_0x00a6
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.Context r3 = r6.getContext()
            r0.setClass(r3, r1)
            java.lang.String r1 = r5.mo23372G()
            goto L_0x009c
        L_0x008c:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.Context r1 = r6.getContext()
            java.lang.Class<com.yeelight.yeelib.ui.activity.DeviceOfflinePromptActivity> r3 = com.yeelight.yeelib.p194ui.activity.DeviceOfflinePromptActivity.class
            r0.setClass(r1, r3)
            java.lang.String r1 = r5.f7255r
        L_0x009c:
            r0.putExtra(r2, r1)
            android.content.Context r6 = r6.getContext()
            r6.startActivity(r0)
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C7472y.mo23347u0(android.view.View):void");
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        return false;
    }

    /* renamed from: v1 */
    public boolean mo23350v1(boolean z) {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo23351w0(String str) {
        return false;
    }

    /* renamed from: w1 */
    public boolean mo23352w1(C6024e.C6028d dVar) {
        return false;
    }

    /* renamed from: x */
    public boolean mo23353x(int i, Object obj) {
        super.mo23353x(i, obj);
        if (i != 7) {
            return true;
        }
        mo23317U0();
        return true;
    }

    /* renamed from: x0 */
    public boolean mo23354x0() {
        return false;
    }

    /* renamed from: x1 */
    public boolean mo23355x1(C9856y yVar) {
        return false;
    }

    /* renamed from: y2 */
    public void mo27625y2(int i, CompletedHandler completedHandler) {
        if (completedHandler == null) {
            completedHandler = new C7473a(this);
        }
        mo27843b2(2, 2, Integer.valueOf(i), completedHandler);
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[0];
    }
}
