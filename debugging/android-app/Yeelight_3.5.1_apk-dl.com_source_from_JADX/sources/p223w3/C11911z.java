package p223w3;

import android.content.Context;
import com.p022mi.iot.common.abstractdevice.AbstractDevice;
import com.p022mi.iot.common.error.IotError;
import com.p022mi.iot.common.handler.CompletedHandler;
import com.p022mi.iot.common.instance.Property;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.xiaomi.base.C8251a;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.models.C8327s;
import java.util.ArrayList;
import java.util.List;
import p051j4.C3283v;
import p207s3.C10328a;
import p227x3.C11980p;

/* renamed from: w3.z */
public class C11911z extends C10328a {

    /* renamed from: w3.z$a */
    class C11912a implements CompletedHandler {
        C11912a(C11911z zVar) {
        }

        public void onFailed(IotError iotError) {
        }

        public void onSucceed() {
        }
    }

    public C11911z(String str, String str2, String str3, String str4) {
        super(str, str2, str3, 1548, str4);
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        return false;
    }

    /* renamed from: B2 */
    public void mo42392B2(C8251a<Integer> aVar) {
        mo31711H1(2, 4, aVar);
    }

    /* renamed from: C2 */
    public void mo42393C2(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("setCurtainHandOperateEn");
        sb.append(z);
        mo41875v2(3, 4, z);
    }

    /* renamed from: D2 */
    public void mo42394D2(int i) {
        mo41876w2(2, 5, i);
    }

    /* renamed from: E2 */
    public void mo42395E2() {
        int i;
        String str;
        Boolean bool = this.f19401Q;
        if (bool != null && this.f19400C != null && this.f19406V && this.f19407W) {
            if (!bool.booleanValue() || this.f19400C.intValue() == 0) {
                str = mo31698M1() + "CURTAIN_MODE";
                i = 0;
            } else {
                str = mo31698M1() + "CURTAIN_MODE";
                i = this.f19400C.intValue();
            }
            C3283v.m8845k(str, i);
        }
    }

    /* renamed from: F */
    public int mo23116F() {
        return R$drawable.icon_yeelight_device_curtain_small;
    }

    /* renamed from: F2 */
    public void mo42396F2(boolean z, CompletedHandler completedHandler) {
        mo31729b2(3, 1, Boolean.valueOf(z), completedHandler);
    }

    /* renamed from: G2 */
    public void mo42397G2(boolean z, CompletedHandler completedHandler) {
        mo31729b2(3, 3, Boolean.valueOf(z), completedHandler);
    }

    /* renamed from: H */
    public int mo23119H() {
        return R$drawable.icon_yeelight_device_curtain_big;
    }

    /* renamed from: H2 */
    public void mo42398H2(boolean z, CompletedHandler completedHandler) {
        mo31729b2(3, 2, Boolean.valueOf(z), completedHandler);
    }

    /* renamed from: I1 */
    public List<Property> mo31712I1() {
        ArrayList arrayList = new ArrayList();
        List<Property> J1 = mo31713J1(2, new int[]{5, 6});
        if (J1 != null) {
            arrayList.addAll(J1);
        }
        List<Property> J12 = mo31713J1(3, new int[]{1, 7, 4, 8});
        if (J12 != null) {
            arrayList.addAll(J12);
        }
        return arrayList;
    }

    /* renamed from: I2 */
    public void mo42399I2(boolean z, CompletedHandler completedHandler) {
        mo31729b2(2, 8, Boolean.valueOf(z), completedHandler);
    }

    /* renamed from: J2 */
    public void mo42400J2(int i) {
        mo41879z2(3, 8, i);
    }

    /* renamed from: K2 */
    public void mo42401K2(int i) {
        mo41868A2(2, 7, i);
    }

    /* renamed from: N1 */
    public C11980p[] mo31716N1(C8327s sVar) {
        return null;
    }

    /* renamed from: O1 */
    public C11980p[] mo31717O1(boolean z) {
        int i = 1;
        C11980p[] pVarArr = new C11980p[1];
        String M1 = mo31698M1();
        if (!z) {
            i = 2;
        }
        pVarArr[0] = new C11980p(M1, 2, 2, Integer.valueOf(i));
        return pVarArr;
    }

    /* renamed from: P1 */
    public void mo31718P1(int i, int i2, Object obj) {
        if (obj != null) {
            if (i != 2) {
                if (i == 3) {
                    if (i2 == 1) {
                        this.f19401Q = (Boolean) obj;
                    } else if (i2 == 4) {
                        this.f19402R = ((Boolean) obj).booleanValue();
                    } else if (i2 == 7) {
                        this.f19405U = ((Integer) obj).intValue();
                    } else if (i2 == 8) {
                        this.f19403S = ((Integer) obj).intValue();
                    }
                }
            } else if (i2 == 5) {
                this.f19400C = (Integer) obj;
            } else if (i2 == 6) {
                this.f19404T = ((Integer) obj).intValue();
            }
        }
    }

    /* renamed from: U0 */
    public boolean mo23131U0() {
        super.mo23131U0();
        mo31733h2();
        return false;
    }

    /* renamed from: X */
    public String mo23214X() {
        return "set_properties";
    }

    /* renamed from: X1 */
    public void mo31699X1(AbstractDevice abstractDevice) {
        super.mo31699X1(abstractDevice);
    }

    /* renamed from: b1 */
    public boolean mo23140b1() {
        return false;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        return false;
    }

    /* renamed from: e0 */
    public String mo23222e0() {
        Context context;
        int i;
        if (!mo23230o0()) {
            context = C3108x.f4951e;
            i = R$string.common_text_status_subtitle_offline;
        } else if (!mo23145k0()) {
            if (mo23147l0()) {
                context = C3108x.f4951e;
                i = R$string.common_text_status_connecting;
            } else {
                context = C3108x.f4951e;
                i = R$string.common_text_status_subtitle_online;
            }
        } else if (mo23153p0()) {
            context = C3108x.f4951e;
            i = R$string.common_text_status_upgrade;
        } else {
            context = C3108x.f4951e;
            i = R$string.common_text_status_subtitle_device_online;
        }
        return context.getString(i);
    }

    /* renamed from: f1 */
    public boolean mo23142f1(boolean z) {
        return false;
    }

    /* renamed from: f2 */
    public boolean mo31731f2() {
        return true;
    }

    /* renamed from: g0 */
    public int mo23143g0() {
        return 0;
    }

    /* renamed from: k2 */
    public boolean mo41896k2() {
        return mo41926l2(3, 5);
    }

    /* renamed from: l0 */
    public boolean mo23147l0() {
        return false;
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        return false;
    }

    /* renamed from: m0 */
    public boolean mo23149m0() {
        return !mo23145k0();
    }

    /* renamed from: m1 */
    public boolean mo23150m1(int i) {
        return false;
    }

    /* renamed from: n */
    public void mo23151n() {
    }

    /* renamed from: o1 */
    public boolean mo23152o1(DeviceStatusBase.DeviceMode deviceMode) {
        return false;
    }

    /* renamed from: o2 */
    public boolean mo41897o2(String str, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("unbindRemote mac: ");
        sb.append(str);
        return mo41928n2(3, 6, str);
    }

    /* renamed from: p0 */
    public boolean mo23153p0() {
        return false;
    }

    /* renamed from: p1 */
    public boolean mo23154p1(long j) {
        return false;
    }

    /* renamed from: q1 */
    public boolean mo23155q1(int i) {
        return false;
    }

    /* renamed from: r */
    public void mo23156r() {
    }

    /* renamed from: r1 */
    public boolean mo23157r1(int i, int[] iArr, int i2) {
        return false;
    }

    /* renamed from: s */
    public boolean mo23158s(ActionType actionType) {
        return false;
    }

    /* renamed from: s1 */
    public boolean mo23159s1(int i) {
        return false;
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23161u0(android.view.View r6) {
        /*
            r5 = this;
            java.lang.Class<com.yeelight.cherry.ui.activity.CurtainControlActivity> r0 = com.yeelight.cherry.p141ui.activity.CurtainControlActivity.class
            com.yeelight.yeelib.managers.e r1 = com.yeelight.yeelib.managers.C8272e.m19511b()
            boolean r1 = r1.mo35204d()
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
            boolean r1 = r5.mo23145k0()
            java.lang.String r2 = "com.yeelight.cherry.device_id"
            if (r1 == 0) goto L_0x008e
            r1 = 0
            java.lang.Boolean r3 = r5.f19401Q     // Catch:{ ClassNotFoundException -> 0x0071 }
            if (r3 == 0) goto L_0x004f
            java.lang.Integer r4 = r5.f19400C     // Catch:{ ClassNotFoundException -> 0x0071 }
            if (r4 == 0) goto L_0x004f
            boolean r3 = r3.booleanValue()     // Catch:{ ClassNotFoundException -> 0x0071 }
            if (r3 == 0) goto L_0x004a
            java.lang.Integer r3 = r5.f19400C     // Catch:{ ClassNotFoundException -> 0x0071 }
            int r3 = r3.intValue()     // Catch:{ ClassNotFoundException -> 0x0071 }
            if (r3 != 0) goto L_0x0047
            goto L_0x004a
        L_0x0047:
            int r1 = com.yeelight.cherry.p141ui.activity.CurtainControlActivity.f10206d     // Catch:{ ClassNotFoundException -> 0x0071 }
            goto L_0x006f
        L_0x004a:
            java.lang.Class<com.yeelight.cherry.ui.activity.CurtainGuideActivity> r0 = com.yeelight.cherry.p141ui.activity.CurtainGuideActivity.class
            int r1 = com.yeelight.cherry.p141ui.activity.CurtainGuideActivity.f10217f     // Catch:{ ClassNotFoundException -> 0x0071 }
            goto L_0x006f
        L_0x004f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0071 }
            r3.<init>()     // Catch:{ ClassNotFoundException -> 0x0071 }
            java.lang.String r4 = r5.mo31698M1()     // Catch:{ ClassNotFoundException -> 0x0071 }
            r3.append(r4)     // Catch:{ ClassNotFoundException -> 0x0071 }
            java.lang.String r4 = "CURTAIN_MODE"
            r3.append(r4)     // Catch:{ ClassNotFoundException -> 0x0071 }
            java.lang.String r3 = r3.toString()     // Catch:{ ClassNotFoundException -> 0x0071 }
            r4 = -1
            int r3 = p051j4.C3283v.m8837c(r3, r4)     // Catch:{ ClassNotFoundException -> 0x0071 }
            if (r3 == r4) goto L_0x006e
            if (r3 == 0) goto L_0x006e
            goto L_0x0047
        L_0x006e:
            r0 = r1
        L_0x006f:
            r1 = r0
            goto L_0x0075
        L_0x0071:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0075:
            if (r1 == 0) goto L_0x00a8
            boolean r0 = r5.mo23145k0()
            if (r0 == 0) goto L_0x00a8
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.Context r3 = r6.getContext()
            r0.setClass(r3, r1)
            java.lang.String r1 = r5.mo23185G()
            goto L_0x009e
        L_0x008e:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.Context r1 = r6.getContext()
            java.lang.Class<com.yeelight.yeelib.ui.activity.DeviceOfflinePromptActivity> r3 = com.yeelight.yeelib.p142ui.activity.DeviceOfflinePromptActivity.class
            r0.setClass(r1, r3)
            java.lang.String r1 = r5.f4753r
        L_0x009e:
            r0.putExtra(r2, r1)
            android.content.Context r6 = r6.getContext()
            r6.startActivity(r0)
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p223w3.C11911z.mo23161u0(android.view.View):void");
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo23164w0(String str) {
        return false;
    }

    /* renamed from: w1 */
    public boolean mo23165w1(DeviceStatusBase.DeviceMode deviceMode) {
        return false;
    }

    /* renamed from: x */
    public boolean mo23166x(int i, Object obj) {
        super.mo23166x(i, obj);
        if (i != 7) {
            return true;
        }
        mo23131U0();
        return true;
    }

    /* renamed from: x0 */
    public boolean mo23167x0() {
        return false;
    }

    /* renamed from: x1 */
    public boolean mo23168x1(C8327s sVar) {
        return false;
    }

    /* renamed from: y2 */
    public void mo41878y2(int i, CompletedHandler completedHandler) {
        if (completedHandler == null) {
            completedHandler = new C11912a(this);
        }
        mo31729b2(2, 2, Integer.valueOf(i), completedHandler);
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[0];
    }
}
