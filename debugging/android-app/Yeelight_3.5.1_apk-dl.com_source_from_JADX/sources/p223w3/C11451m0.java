package p223w3;

import com.miot.common.device.Device;
import com.p022mi.iot.common.instance.Property;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.device.base.C6094f;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.models.C8327s;
import java.util.ArrayList;
import java.util.List;
import p051j4.C9201q;
import p227x3.C11980p;
import p232y3.C12041e;

/* renamed from: w3.m0 */
public class C11451m0 extends C6094f {
    public C11451m0(String str) {
        super((String) null, "yeelink.light.meshbulb2", "", 995, "");
        mo23194L0(str);
        mo23187H0(str);
    }

    public C11451m0(String str, String str2, String str3, String str4) {
        super(str, str2, str3, 995, str4);
        mo23199O0(Device.Ownership.MINE);
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        return false;
    }

    /* renamed from: F */
    public int mo23116F() {
        return R$drawable.icon_yeelight_device_badge_meshbulb2_small;
    }

    /* renamed from: H */
    public int mo23119H() {
        return R$drawable.icon_yeelight_device_badge_meshbulb2_big;
    }

    /* renamed from: I1 */
    public List<Property> mo31712I1() {
        ArrayList arrayList = new ArrayList();
        List<Property> J1 = mo31713J1(2, new int[]{1, 2, 3});
        if (J1 != null) {
            arrayList.addAll(J1);
        }
        List<Property> J12 = mo31713J1(3, new int[]{3, 5});
        if (J12 != null) {
            arrayList.addAll(J12);
        }
        return arrayList;
    }

    /* renamed from: N1 */
    public C11980p[] mo31716N1(C8327s sVar) {
        if (sVar == null) {
            return null;
        }
        if (sVar.mo35458y()) {
            return new C11980p[]{new C11980p(mo31698M1(), 3, 1, Integer.valueOf(C9201q.m22189a(sVar.mo35439f(), 500)), mo31714K1(sVar))};
        } else if (!sVar.mo35419D()) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("newSpecAction: bright: ");
            sb.append(sVar.mo35439f());
            if (sVar.mo35439f() > 1) {
                return new C11980p[]{new C11980p(mo31698M1(), 3, 2, Integer.valueOf(C9201q.m22190b(sVar.mo35441h(), sVar.mo35439f())), mo31714K1(sVar))};
            }
            return new C11980p[]{new C11980p(mo31698M1(), 2, 3, Integer.valueOf(sVar.mo35441h()), mo31714K1(sVar))};
        }
    }

    /* renamed from: O1 */
    public C11980p[] mo31717O1(boolean z) {
        return new C11980p[]{new C11980p(mo31698M1(), 2, 1, Boolean.valueOf(z))};
    }

    /* renamed from: P1 */
    public void mo31718P1(int i, int i2, Object obj) {
        if (obj != null) {
            boolean z = true;
            if (i != 2) {
                if (i == 3) {
                    if (i2 == 3) {
                        Integer num = (Integer) obj;
                        if (mo23221d0().mo31611r(2) == null) {
                            mo23221d0().mo31577a(new C12041e(num.intValue(), num.intValue()));
                        } else {
                            mo23221d0().mo31573X0(num.intValue());
                        }
                    } else if (i2 == 5) {
                        DeviceStatusBase d0 = mo23221d0();
                        if (((Integer) obj).intValue() != 1) {
                            z = false;
                        }
                        d0.mo31597k(z);
                    }
                }
            } else if (i2 == 1) {
                mo23221d0().mo31551M0(((Boolean) obj).booleanValue());
            } else if (i2 == 2) {
                mo23221d0().mo31600l0((long) ((Integer) obj).intValue());
            } else if (i2 == 3) {
                mo23221d0().mo31610q0(((Integer) obj).intValue());
            }
        }
    }

    /* renamed from: U0 */
    public boolean mo23131U0() {
        super.mo23131U0();
        mo31733h2();
        return true;
    }

    /* renamed from: b1 */
    public boolean mo23140b1() {
        return mo31707C1(2, 1);
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        mo23162u1(0);
        return true;
    }

    /* renamed from: f1 */
    public boolean mo23142f1(boolean z) {
        return false;
    }

    /* renamed from: f2 */
    public boolean mo31731f2() {
        return false;
    }

    /* renamed from: g0 */
    public int mo23143g0() {
        return 0;
    }

    /* renamed from: l0 */
    public boolean mo23147l0() {
        return false;
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        return mo31719Q1(2, 1);
    }

    /* renamed from: m1 */
    public boolean mo23150m1(int i) {
        return false;
    }

    /* renamed from: o1 */
    public boolean mo23152o1(DeviceStatusBase.DeviceMode deviceMode) {
        return false;
    }

    /* renamed from: p0 */
    public boolean mo23153p0() {
        return false;
    }

    /* renamed from: p1 */
    public boolean mo23154p1(long j) {
        return mo31721S1(2, 2, j);
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
        return mo31723U1(2, 3, i);
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        return false;
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        return mo31725W1(3, 3, i);
    }

    /* renamed from: v */
    public void mo23238v(boolean z) {
        mo31708D1(3, 5, z);
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
        boolean x = super.mo23166x(i, obj);
        if (i == 5) {
            mo23169y0();
        } else if (i == 7) {
            mo23131U0();
        } else if (i == 10) {
            C12041e eVar = (C12041e) obj;
            mo23162u1(eVar.mo42678b());
            mo23221d0().mo31577a(eVar);
        } else if (i == 14) {
            mo23141c1();
        }
        return x;
    }

    /* renamed from: x0 */
    public boolean mo23167x0() {
        return false;
    }

    /* renamed from: x1 */
    public boolean mo23168x1(C8327s sVar) {
        if (sVar == null) {
            return false;
        }
        if (sVar.mo35458y()) {
            return mo31722T1(3, 1, sVar);
        }
        if (sVar.mo35419D()) {
            if (sVar.mo35439f() > 1) {
                mo31724V1(3, 2, sVar);
            } else {
                mo23159s1(sVar.mo35441h());
            }
        }
        return true;
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[0];
    }
}
