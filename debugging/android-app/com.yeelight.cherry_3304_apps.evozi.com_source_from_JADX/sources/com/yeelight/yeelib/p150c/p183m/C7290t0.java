package com.yeelight.yeelib.p150c.p183m;

import com.p146mi.iot.common.error.IotError;
import com.p146mi.iot.common.handler.CompletedHandler;
import com.p146mi.iot.common.instance.Property;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.device.models.C7638m0;
import com.yeelight.yeelib.device.xiaomi.base.MiSpecDevice;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6039j;
import com.yeelight.yeelib.p150c.p184n.C7554e;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p185d.C7563a;
import com.yeelight.yeelib.utils.C10555s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.yeelib.c.m.t0 */
public class C7290t0 extends C6039j {

    /* renamed from: com.yeelight.yeelib.c.m.t0$a */
    class C7291a implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f14837a;

        C7291a(int i) {
            this.f14837a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C7290t0.this.f7260v;
        }

        public void onSucceed() {
            String str = C7290t0.this.f7260v;
            "setOnFromPower onSucceed: " + this.f14837a;
            C7290t0.this.mo23408d0().mo27644I0(this.f14837a);
            boolean unused = C7290t0.this.f12867y = true;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t0$b */
    class C7292b implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14839a;

        C7292b(boolean z) {
            this.f14839a = z;
        }

        public void onFailed(IotError iotError) {
            String str = C7290t0.this.f7260v;
        }

        public void onSucceed() {
            String str = C7290t0.this.f7260v;
            "setSaveState onSucceed: " + this.f14839a;
            C7290t0.this.mo23408d0().mo27652M0(this.f14839a);
            boolean unused = C7290t0.this.f12867y = true;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t0$c */
    class C7293c implements CompletedHandler {
        C7293c() {
        }

        public void onFailed(IotError iotError) {
            String str = C7290t0.this.f7260v;
        }

        public void onSucceed() {
            String str = C7290t0.this.f7260v;
        }
    }

    public C7290t0(String str) {
        super((String) null, "yeelink.light.ml1", "", 2076, "");
        mo23381L0(str);
        mo23374H0(str);
    }

    public C7290t0(String str, String str2, String str3, String str4) {
        super(str, str2, str3, 2076, str4);
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        return false;
    }

    /* renamed from: F */
    public int mo23303F() {
        return R$drawable.icon_yeelight_device_badge_ml1_small;
    }

    /* renamed from: H */
    public int mo23306H() {
        return R$drawable.icon_yeelight_device_badge_ml1_big;
    }

    /* renamed from: I1 */
    public List<Property> mo27826I1() {
        ArrayList arrayList = new ArrayList();
        List<Property> J1 = mo27827J1(2, new int[]{1, 2, 3});
        if (J1 != null) {
            arrayList.addAll(J1);
        }
        List<Property> J12 = mo27827J1(3, new int[]{3, 5, 11});
        if (J12 != null) {
            arrayList.addAll(J12);
        }
        return arrayList;
    }

    /* renamed from: N1 */
    public C7638m0[] mo27830N1(C9856y yVar) {
        if (yVar == null) {
            return null;
        }
        if (yVar.mo31893y()) {
            return new C7638m0[]{new C7638m0(mo27788M1(), 3, 1, Integer.valueOf(C10555s.m25790a(yVar.mo31874f(), 500)), mo27828K1(yVar))};
        } else if (!yVar.mo31855D()) {
            return null;
        } else {
            "newSpecAction: bright: " + yVar.mo31874f();
            return new C7638m0[]{new C7638m0(mo27788M1(), 3, 2, Integer.valueOf(C10555s.m25791b(yVar.mo31876h(), yVar.mo31874f())), mo27828K1(yVar))};
        }
    }

    /* renamed from: O1 */
    public C7638m0[] mo27831O1(boolean z) {
        return new C7638m0[]{new C7638m0(mo27788M1(), 2, 1, Boolean.valueOf(z))};
    }

    /* renamed from: P1 */
    public void mo27832P1(int i, int i2, Object obj) {
        if (obj != null) {
            boolean z = true;
            if (i != 2) {
                if (i == 3) {
                    if (i2 == 3) {
                        Integer num = (Integer) obj;
                        if (mo23408d0().mo27710r(2) == null) {
                            mo23408d0().mo27676a(new C7554e(num.intValue(), num.intValue()));
                        } else {
                            mo23408d0().mo27670V0(num.intValue());
                        }
                    } else if (i2 == 5) {
                        C6024e d0 = mo23408d0();
                        if (((Integer) obj).intValue() != 1) {
                            z = false;
                        }
                        d0.mo27696k(z);
                    } else if (i2 == 11) {
                        byte[] g = C10555s.m25796g(((Integer) obj).intValue());
                        mo23408d0().mo27644I0(g[0]);
                        C6024e d02 = mo23408d0();
                        if (g[1] != 1) {
                            z = false;
                        }
                        d02.mo27652M0(z);
                    }
                }
            } else if (i2 == 1) {
                mo23408d0().mo27648K0(((Boolean) obj).booleanValue());
            } else if (i2 == 2) {
                mo23408d0().mo27697k0((long) ((Integer) obj).intValue());
            } else if (i2 == 3) {
                mo23408d0().mo27707p0(((Integer) obj).intValue());
            }
        }
    }

    /* renamed from: U0 */
    public boolean mo23317U0() {
        super.mo23317U0();
        mo27847h2();
        return true;
    }

    /* renamed from: Y1 */
    public boolean mo27840Y1(int i) {
        mo27843b2(3, 11, Integer.valueOf(C10555s.m25792c((byte) i, mo23408d0().mo27683d0() ? (byte) 1 : 0, (byte) 0)), new C7291a(i));
        return true;
    }

    /* renamed from: b1 */
    public boolean mo23326b1() {
        return mo27821C1(2, 1);
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        mo23348u1(0);
        return false;
    }

    /* renamed from: c2 */
    public boolean mo27844c2(boolean z) {
        mo27843b2(3, 11, Integer.valueOf(C10555s.m25792c((byte) mo23408d0().mo27641H(), z ? (byte) 1 : 0, (byte) 0)), new C7292b(z));
        return true;
    }

    /* renamed from: f1 */
    public boolean mo23328f1(boolean z) {
        return false;
    }

    /* renamed from: f2 */
    public boolean mo27845f2() {
        return false;
    }

    /* renamed from: g0 */
    public int mo23329g0() {
        return 0;
    }

    /* renamed from: l0 */
    public boolean mo23333l0() {
        return false;
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        return mo27833Q1(2, 1);
    }

    /* renamed from: m1 */
    public boolean mo23336m1(int i) {
        return false;
    }

    /* renamed from: o1 */
    public boolean mo23338o1(C6024e.C6028d dVar) {
        return false;
    }

    /* renamed from: p0 */
    public boolean mo23339p0() {
        return false;
    }

    /* renamed from: p1 */
    public boolean mo23340p1(long j) {
        return mo27835S1(2, 2, j);
    }

    /* renamed from: p2 */
    public MiSpecDevice mo27787E1() {
        return (MiSpecDevice) this.f12868z;
    }

    /* renamed from: q1 */
    public boolean mo23341q1(int i) {
        return false;
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
        return mo27837U1(2, 3, i);
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        mo27843b2(3, 11, Integer.valueOf(C10555s.m25792c((byte) mo23408d0().mo27641H(), mo23408d0().mo27683d0() ? (byte) 1 : 0, (byte) 1)), new C7293c());
        return true;
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        return mo27839W1(3, 3, i);
    }

    /* renamed from: v */
    public void mo23424v(boolean z) {
        mo27822D1(3, 5, z);
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
        if (i == 10) {
            C7554e eVar = (C7554e) obj;
            mo23348u1(eVar.mo28881b());
            mo23408d0().mo27676a(eVar);
            return true;
        } else if (i != 14) {
            return super.mo23353x(i, obj);
        } else {
            mo23327c1();
            return true;
        }
    }

    /* renamed from: x0 */
    public boolean mo23354x0() {
        return false;
    }

    /* renamed from: x1 */
    public boolean mo23355x1(C9856y yVar) {
        if (yVar.mo31893y()) {
            return mo27836T1(3, 1, yVar);
        }
        if (yVar.mo31855D()) {
            return mo27838V1(3, 2, yVar);
        }
        return true;
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[0];
    }
}
