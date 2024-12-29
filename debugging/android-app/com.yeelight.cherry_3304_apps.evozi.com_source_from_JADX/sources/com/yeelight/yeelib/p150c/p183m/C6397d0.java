package com.yeelight.yeelib.p150c.p183m;

import com.p146mi.iot.common.error.IotError;
import com.p146mi.iot.common.handler.CompletedHandler;
import com.p146mi.iot.common.instance.Property;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.models.C7638m0;
import com.yeelight.yeelib.device.models.YeelightTimer;
import com.yeelight.yeelib.device.xiaomi.base.C9765c;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6033g;
import com.yeelight.yeelib.p150c.p184n.C7554e;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p185d.C7563a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.yeelight.yeelib.c.m.d0 */
public class C6397d0 extends C6033g {

    /* renamed from: com.yeelight.yeelib.c.m.d0$a */
    class C6398a implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f13456a;

        C6398a(int i) {
            this.f13456a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6397d0.this.f7260v;
        }

        public void onSucceed() {
            String str = C6397d0.this.f7260v;
            C6397d0.this.mo23408d0().mo27658P0(this.f13456a);
            boolean unused = C6397d0.this.f12867y = true;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d0$b */
    class C6399b implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13458a;

        C6399b(C9856y yVar) {
            this.f13458a = yVar;
        }

        public void onFailed(IotError iotError) {
            String str = C6397d0.this.f7260v;
            "setscene ct onFailed: " + iotError.toString();
        }

        public void onSucceed() {
            String str = C6397d0.this.f7260v;
            C6397d0.this.mo23408d0().mo27707p0(this.f13458a.mo31876h());
            C6397d0.this.mo23408d0().mo27697k0((long) this.f13458a.mo31874f());
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d0$c */
    class C6400c implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13460a;

        C6400c(C9856y yVar) {
            this.f13460a = yVar;
        }

        public void onFailed(IotError iotError) {
            String str = C6397d0.this.f7260v;
        }

        public void onSucceed() {
            String str = C6397d0.this.f7260v;
            C6397d0.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT);
            C6397d0.this.mo23408d0().mo27697k0((long) this.f13460a.mo31874f());
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d0$d */
    class C6401d implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13462a;

        /* renamed from: b */
        final /* synthetic */ String f13463b;

        /* renamed from: c */
        final /* synthetic */ String f13464c;

        /* renamed from: d */
        final /* synthetic */ int f13465d;

        C6401d(boolean z, String str, String str2, int i) {
            this.f13462a = z;
            this.f13463b = str;
            this.f13464c = str2;
            this.f13465d = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6397d0.this.f7260v;
            "enableNightTime onFailed: " + iotError;
        }

        public void onSucceed() {
            String str = C6397d0.this.f7260v;
            C6397d0.this.mo23408d0().mo27640G0(this.f13462a);
            C6397d0.this.mo23408d0().mo27638F0(this.f13463b);
            C6397d0.this.mo23408d0().mo27636E0(this.f13464c);
            C6397d0.this.mo23408d0().mo27634D0(this.f13465d);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d0$e */
    class C6402e implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f13467a;

        C6402e(int i) {
            this.f13467a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6397d0.this.f7260v;
            "setDelayOff onFailed: " + this.f13467a;
        }

        public void onSucceed() {
            String str = C6397d0.this.f7260v;
            "setDelayOff onSucceed: " + this.f13467a;
            boolean unused = C6397d0.this.f12867y = true;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d0$f */
    class C6403f implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f13469a;

        C6403f(int i) {
            this.f13469a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6397d0.this.f7260v;
            "PROPERTY_ON fan onFailed: true" + iotError;
        }

        public void onSucceed() {
            String str = C6397d0.this.f7260v;
            C6397d0.this.mo27756v2().mo27648K0(true);
            C6397d0.this.m19308S2(this.f13469a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d0$g */
    class C6404g implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f13471a;

        C6404g(int i) {
            this.f13471a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6397d0.this.f7260v;
            "setDelayOff onFailed: " + this.f13471a;
        }

        public void onSucceed() {
            String str = C6397d0.this.f7260v;
            "setDelayOff onSucceed: " + this.f13471a;
            boolean unused = C6397d0.this.f12867y = true;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d0$h */
    class C6405h implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f13473a;

        C6405h(int i) {
            this.f13473a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6397d0.this.f7260v;
        }

        public void onSucceed() {
            String str = C6397d0.this.f7260v;
            "light setOnFromPower onSucceed: " + this.f13473a;
            C6397d0.this.mo23408d0().mo27644I0(this.f13473a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d0$i */
    class C6406i implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f13475a;

        C6406i(int i) {
            this.f13475a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6397d0.this.f7260v;
        }

        public void onSucceed() {
            String str = C6397d0.this.f7260v;
            "fan setOnFromPower onSucceed: " + this.f13475a;
            C6397d0.this.mo27756v2().mo27644I0(this.f13475a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d0$j */
    class C6407j implements CompletedHandler {
        C6407j() {
        }

        public void onFailed(IotError iotError) {
            String str = C6397d0.this.f7260v;
        }

        public void onSucceed() {
            String str = C6397d0.this.f7260v;
            C6397d0.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_SUNSHINE);
            boolean unused = C6397d0.this.f12867y = true;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d0$k */
    class C6408k implements CompletedHandler {
        C6408k() {
        }

        public void onFailed(IotError iotError) {
            String str = C6397d0.this.f7260v;
            "PROPERTY_ON fan onFailed: true" + iotError;
        }

        public void onSucceed() {
            String str = C6397d0.this.f7260v;
            C6397d0.this.mo27756v2().mo27648K0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d0$l */
    class C6409l implements CompletedHandler {
        C6409l() {
        }

        public void onFailed(IotError iotError) {
            String str = C6397d0.this.f7260v;
        }

        public void onSucceed() {
            String str = C6397d0.this.f7260v;
            C6397d0.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d0$m */
    class C6410m implements CompletedHandler {
        C6410m() {
        }

        public void onFailed(IotError iotError) {
            String str = C6397d0.this.f7260v;
            "PROPERTY_ON fan onFailed: true" + iotError;
        }

        public void onSucceed() {
            String str = C6397d0.this.f7260v;
            C6397d0.this.mo27756v2().mo27648K0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d0$n */
    class C6411n implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f13481a;

        C6411n(int i) {
            this.f13481a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6397d0.this.f7260v;
            "setLevel onFailed: " + this.f13481a;
        }

        public void onSucceed() {
            String str = C6397d0.this.f7260v;
            "setLevel onSucceed: " + this.f13481a;
            boolean unused = C6397d0.this.f12867y = true;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d0$o */
    class C6412o implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f13483a;

        C6412o(int i) {
            this.f13483a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6397d0.this.f7260v;
            "setFanSpeed onFailed speed: " + this.f13483a;
        }

        public void onSucceed() {
            String str = C6397d0.this.f7260v;
            "setFanSpeed onSucceed speed: " + this.f13483a;
            C6397d0.this.mo27755u2().get(0).mo27767f(this.f13483a);
            boolean unused = C6397d0.this.f12867y = true;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d0$p */
    class C6413p implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f13485a;

        C6413p(int i) {
            this.f13485a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6397d0.this.f7260v;
            "setFanSpeed onFailed speed: " + this.f13485a;
        }

        public void onSucceed() {
            String str = C6397d0.this.f7260v;
            "setFanSpeed onSucceed speed: " + this.f13485a;
            C6397d0.this.mo27755u2().get(1).mo27767f(this.f13485a);
            boolean unused = C6397d0.this.f12867y = true;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d0$q */
    class C6414q implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f13487a;

        C6414q(int i) {
            this.f13487a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6397d0.this.f7260v;
            "setFanMode onFailed mode: " + this.f13487a;
        }

        public void onSucceed() {
            String str = C6397d0.this.f7260v;
            "setFanMode onSucceed mode: " + this.f13487a;
            C6397d0.this.mo27756v2().mo27770Z0(this.f13487a);
            boolean unused = C6397d0.this.f12867y = true;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d0$r */
    class C6415r implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13489a;

        C6415r(boolean z) {
            this.f13489a = z;
        }

        public void onFailed(IotError iotError) {
            String str = C6397d0.this.f7260v;
            "enableFlexSwitch onFailed: " + this.f13489a;
        }

        public void onSucceed() {
            String str = C6397d0.this.f7260v;
            "enableFlexSwitch onFailed: " + this.f13489a;
            boolean unused = C6397d0.this.f12867y = true;
            C6397d0.this.mo23408d0().mo27696k(this.f13489a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d0$s */
    class C6416s implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13491a;

        C6416s(boolean z) {
            this.f13491a = z;
        }

        public void onFailed(IotError iotError) {
            String str = C6397d0.this.f7260v;
            "enableFanFlexSwitch onFailed: " + this.f13491a;
        }

        public void onSucceed() {
            String str = C6397d0.this.f7260v;
            "enableFanFlexSwitch onFailed: " + this.f13491a;
            boolean unused = C6397d0.this.f12867y = true;
            C6397d0.this.mo27756v2().mo27696k(this.f13491a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d0$t */
    class C6417t implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ long f13493a;

        C6417t(long j) {
            this.f13493a = j;
        }

        public void onFailed(IotError iotError) {
            String str = C6397d0.this.f7260v;
        }

        public void onSucceed() {
            String str = C6397d0.this.f7260v;
            C6397d0.this.mo23408d0().mo27697k0(this.f13493a);
            boolean unused = C6397d0.this.f12867y = true;
        }
    }

    public C6397d0(String str, String str2, String str3, int i, String str4) {
        super(str, str2, str3, i, str4);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(0, new C6033g.C6036c(0, 100, R$string.fancl_fan_style_standard, 1));
        linkedHashMap.put(1, new C6033g.C6036c(1, 100, R$string.fancl_fan_style_loop, true));
        mo27744C2(linkedHashMap);
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public void m19308S2(int i) {
        mo27843b2(5, 9, Integer.valueOf(i), new C6404g(i));
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        return false;
    }

    /* renamed from: B2 */
    public void mo27743B2(int i) {
        mo27843b2(6, 7, Integer.valueOf(i), new C6414q(i));
    }

    /* renamed from: D2 */
    public void mo27745D2(C6033g.C6036c cVar, int i) {
        int i2;
        CompletedHandler completedHandler;
        Integer num;
        if (cVar != null) {
            int a = cVar.mo27762a();
            if (a == 0) {
                i2 = 7;
                num = Integer.valueOf(i);
                completedHandler = new C6412o(i);
            } else if (a == 1) {
                i2 = 8;
                num = Integer.valueOf(i);
                completedHandler = new C6413p(i);
            } else {
                return;
            }
            mo27843b2(5, i2, num, completedHandler);
        }
    }

    /* renamed from: E2 */
    public void mo27746E2(int i) {
        mo27842a2(new C9765c[]{new C9765c(6, 2, Integer.valueOf(i)), new C9765c(6, 1, Boolean.TRUE)}, new C6411n(i));
    }

    /* renamed from: F */
    public int mo23303F() {
        return R$drawable.icon_yeelight_device_badge_fancl6_small;
    }

    /* renamed from: H */
    public int mo23306H() {
        return R$drawable.icon_yeelight_device_badge_fancl6_big;
    }

    /* renamed from: I1 */
    public List<Property> mo27826I1() {
        ArrayList arrayList = new ArrayList();
        List<Property> J1 = mo27827J1(2, new int[]{1, 3, 7, 5});
        if (J1 != null) {
            arrayList.addAll(J1);
        }
        List<Property> J12 = mo27827J1(6, new int[]{1, 2, 7});
        if (J12 != null) {
            arrayList.addAll(J12);
        }
        List<Property> J13 = mo27827J1(4, new int[]{1, 3, 6, 5, 7, 8});
        if (J13 != null) {
            arrayList.addAll(J13);
        }
        List<Property> J14 = mo27827J1(5, new int[]{5, 4, 6, 7, 8});
        if (J14 != null) {
            arrayList.addAll(J14);
        }
        return arrayList;
    }

    /* renamed from: L1 */
    public List<YeelightTimer> mo27829L1() {
        List<YeelightTimer> list = (List) mo23408d0().mo27710r(1);
        ArrayList arrayList = new ArrayList();
        int i = this.f12821H == 0 ? 2 : 3;
        if (list != null) {
            for (YeelightTimer yeelightTimer : list) {
                if ((yeelightTimer.mo29034j() != null && yeelightTimer.mo29034j().length > 0 && yeelightTimer.mo29034j()[0].mo29085c() == i) || (yeelightTimer.mo29029c() != null && yeelightTimer.mo29029c().length > 0 && yeelightTimer.mo29029c()[0].mo29085c() == i)) {
                    arrayList.add(yeelightTimer);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: N1 */
    public C7638m0[] mo27830N1(C9856y yVar) {
        if (yVar == null) {
            return null;
        }
        if (yVar.mo31893y()) {
            return new C7638m0[]{new C7638m0(mo27788M1(), 2, 1, Boolean.TRUE, mo27828K1(yVar)), new C7638m0(mo27788M1(), 2, 3, Integer.valueOf(yVar.mo31874f()))};
        } else if (yVar.mo31855D()) {
            "newSpecAction: bright: " + yVar.mo31874f();
            if (yVar.mo31874f() > 1) {
                return new C7638m0[]{new C7638m0(mo27788M1(), 2, 1, Boolean.TRUE), new C7638m0(mo27788M1(), 2, 7, 0), new C7638m0(mo27788M1(), 2, 5, Integer.valueOf(yVar.mo31876h())), new C7638m0(mo27788M1(), 2, 3, Integer.valueOf(yVar.mo31874f()))};
            }
            return new C7638m0[]{new C7638m0(mo27788M1(), 2, 1, Boolean.TRUE, mo27828K1(yVar)), new C7638m0(mo27788M1(), 2, 7, 0), new C7638m0(mo27788M1(), 2, 5, Integer.valueOf(yVar.mo31876h()))};
        } else if (!yVar.mo31857F()) {
            return null;
        } else {
            return new C7638m0[]{new C7638m0(mo27788M1(), 2, 1, Boolean.TRUE, mo27828K1(yVar)), new C7638m0(mo27788M1(), 2, 7, 1), new C7638m0(mo27788M1(), 2, 3, Integer.valueOf(yVar.mo31874f()))};
        }
    }

    /* renamed from: O1 */
    public C7638m0[] mo27831O1(boolean z) {
        if (this.f12821H == 0) {
            return new C7638m0[]{new C7638m0(mo27788M1(), 2, 1, Boolean.valueOf(z))};
        }
        return new C7638m0[]{new C7638m0(mo27788M1(), 6, 1, Boolean.valueOf(z))};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        ((com.yeelight.yeelib.p150c.p151i.C6033g.C6036c) r7).mo27767f(((java.lang.Integer) r9).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return;
     */
    /* renamed from: P1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo27832P1(int r7, int r8, java.lang.Object r9) {
        /*
            r6 = this;
            r0 = 7
            r1 = 5
            r2 = 2
            r3 = 1
            if (r7 == r2) goto L_0x0121
            r4 = 4
            r5 = 6
            if (r7 == r4) goto L_0x00a4
            if (r7 == r1) goto L_0x003c
            if (r7 == r5) goto L_0x0010
            goto L_0x0156
        L_0x0010:
            if (r8 == r3) goto L_0x0036
            if (r8 == r2) goto L_0x0027
            if (r8 == r0) goto L_0x0018
            goto L_0x0156
        L_0x0018:
            com.yeelight.yeelib.c.i.g$d r7 = r6.mo27756v2()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            r7.mo27770Z0(r8)
            goto L_0x0156
        L_0x0027:
            com.yeelight.yeelib.c.i.g$d r7 = r6.mo27756v2()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            r7.mo27769Y0(r8)
            goto L_0x0156
        L_0x0036:
            com.yeelight.yeelib.c.i.g$d r7 = r6.mo27756v2()
            goto L_0x014d
        L_0x003c:
            r7 = 0
            switch(r8) {
                case 4: goto L_0x0081;
                case 5: goto L_0x007b;
                case 6: goto L_0x0068;
                case 7: goto L_0x004f;
                case 8: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x0156
        L_0x0042:
            java.util.Map r7 = r6.mo27755u2()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            java.lang.Object r7 = r7.get(r8)
            goto L_0x005b
        L_0x004f:
            java.util.Map r8 = r6.mo27755u2()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r7 = r8.get(r7)
        L_0x005b:
            com.yeelight.yeelib.c.i.g$c r7 = (com.yeelight.yeelib.p150c.p151i.C6033g.C6036c) r7
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            r7.mo27767f(r8)
            goto L_0x0156
        L_0x0068:
            com.yeelight.yeelib.c.i.g$d r8 = r6.mo27756v2()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r9 != r3) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r3 = 0
        L_0x0076:
            r8.mo27696k(r3)
            goto L_0x0156
        L_0x007b:
            com.yeelight.yeelib.c.i.g$d r7 = r6.mo27756v2()
            goto L_0x0117
        L_0x0081:
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r7 = r9.intValue()
            com.yeelight.yeelib.c.i.g$d r8 = r6.mo27756v2()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            java.lang.Object r8 = r8.mo27710r(r9)
            if (r8 != 0) goto L_0x009f
            com.yeelight.yeelib.c.i.g$d r8 = r6.mo27756v2()
            com.yeelight.yeelib.c.n.e r9 = new com.yeelight.yeelib.c.n.e
            r9.<init>(r7, r7)
            goto L_0x00f9
        L_0x009f:
            com.yeelight.yeelib.c.i.g$d r8 = r6.mo27756v2()
            goto L_0x0101
        L_0x00a4:
            if (r8 == r3) goto L_0x0113
            r7 = 3
            if (r8 == r7) goto L_0x0105
            if (r8 == r1) goto L_0x00dc
            if (r8 == r5) goto L_0x00d5
            if (r8 == r0) goto L_0x00c5
            r7 = 8
            if (r8 == r7) goto L_0x00b5
            goto L_0x0156
        L_0x00b5:
            com.yeelight.yeelib.c.i.e r7 = r6.mo23408d0()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            long r8 = (long) r8
            r7.mo27642H0(r8)
            goto L_0x0156
        L_0x00c5:
            com.yeelight.yeelib.c.i.e r7 = r6.mo23408d0()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            long r8 = (long) r8
            r7.mo27697k0(r8)
            goto L_0x0156
        L_0x00d5:
            java.lang.String r9 = (java.lang.String) r9
            r6.mo28153R2(r9)
            goto L_0x0156
        L_0x00dc:
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r7 = r9.intValue()
            com.yeelight.yeelib.c.i.e r8 = r6.mo23408d0()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            java.lang.Object r8 = r8.mo27710r(r9)
            if (r8 != 0) goto L_0x00fd
            com.yeelight.yeelib.c.i.e r8 = r6.mo23408d0()
            com.yeelight.yeelib.c.n.e r9 = new com.yeelight.yeelib.c.n.e
            r9.<init>(r7, r7)
        L_0x00f9:
            r8.mo27676a(r9)
            goto L_0x0156
        L_0x00fd:
            com.yeelight.yeelib.c.i.e r8 = r6.mo23408d0()
        L_0x0101:
            r8.mo27670V0(r7)
            goto L_0x0156
        L_0x0105:
            com.yeelight.yeelib.c.i.e r7 = r6.mo23408d0()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            r7.mo27696k(r8)
            goto L_0x0156
        L_0x0113:
            com.yeelight.yeelib.c.i.e r7 = r6.mo23408d0()
        L_0x0117:
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            r7.mo27644I0(r8)
            goto L_0x0156
        L_0x0121:
            if (r8 == r3) goto L_0x0149
            if (r8 == r1) goto L_0x013b
            if (r8 == r0) goto L_0x0128
            goto L_0x0156
        L_0x0128:
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r7 = r9.intValue()
            if (r7 != 0) goto L_0x0136
            com.yeelight.yeelib.c.i.e$d r7 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_SUNSHINE
        L_0x0132:
            r6.mo23352w1(r7)
            goto L_0x0156
        L_0x0136:
            if (r7 != r3) goto L_0x0156
            com.yeelight.yeelib.c.i.e$d r7 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT
            goto L_0x0132
        L_0x013b:
            com.yeelight.yeelib.c.i.e r7 = r6.mo23408d0()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            r7.mo27707p0(r8)
            goto L_0x0156
        L_0x0149:
            com.yeelight.yeelib.c.i.e r7 = r6.mo23408d0()
        L_0x014d:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            r7.mo27648K0(r8)
        L_0x0156:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6397d0.mo27832P1(int, int, java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: R2 */
    public void mo28153R2(String str) {
        if (str != null) {
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    mo23408d0().mo27640G0(false);
                } else if (split[0].equals("enable")) {
                    mo23408d0().mo27640G0(true);
                }
                mo23408d0().mo27638F0(split[1]);
                mo23408d0().mo27636E0(split[2]);
                mo23408d0().mo27634D0(Integer.parseInt(split[3]));
                "start = " + mo23408d0().mo27633D() + Constants.ACCEPT_TIME_SEPARATOR_SP + mo23408d0().mo27631C() + ", " + mo23408d0().mo27629B();
            }
        }
    }

    /* renamed from: V */
    public boolean mo23398V() {
        return this.f12821H == 0 ? super.mo23398V() : this.f12820G.mo27641H() == 1;
    }

    /* renamed from: Y1 */
    public boolean mo27840Y1(int i) {
        if (this.f12821H == 0) {
            mo27843b2(4, 1, Integer.valueOf(i == 1 ? 1 : 2), new C6405h(i));
        } else {
            mo27843b2(5, 5, Integer.valueOf(i), new C6406i(i));
        }
        return true;
    }

    /* renamed from: b1 */
    public boolean mo23326b1() {
        return mo27821C1(2, 1);
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        return mo23348u1(0);
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

    /* renamed from: g1 */
    public boolean mo23431g1(boolean z, String str, String str2, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "enable" : "disable");
        sb.append("|");
        sb.append(str);
        sb.append("|");
        sb.append(str2);
        sb.append("|");
        sb.append(i);
        mo27843b2(4, 6, sb.toString(), new C6401d(z, str, str2, i));
        return false;
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
        if (i == 1) {
            mo27842a2(new C9765c[]{new C9765c(2, 1, Boolean.TRUE), new C9765c(2, 7, 0)}, new C6407j());
        } else if (i == 5) {
            mo27842a2(new C9765c[]{new C9765c(2, 1, Boolean.TRUE), new C9765c(2, 7, 1)}, new C6409l());
        }
        return false;
    }

    /* renamed from: n */
    public void mo23337n() {
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
        mo27842a2(new C9765c[]{new C9765c(2, 1, Boolean.TRUE), new C9765c(2, 3, Long.valueOf(j))}, new C6417t(j));
        return true;
    }

    /* renamed from: p2 */
    public void mo27750p2() {
        mo27843b2(6, 1, Boolean.FALSE, new C6410m());
    }

    /* renamed from: q1 */
    public boolean mo23341q1(int i) {
        return false;
    }

    /* renamed from: q2 */
    public void mo27751q2(boolean z) {
        mo27843b2(5, 6, Integer.valueOf(z ? 1 : 0), new C6416s(z));
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
        mo27842a2(new C9765c[]{new C9765c(2, 1, Boolean.TRUE), new C9765c(2, 5, Integer.valueOf(i))}, new C6398a(i));
        return true;
    }

    /* renamed from: s2 */
    public C6033g.C6036c mo27753s2() {
        return mo27755u2().get(Integer.valueOf(mo27756v2().mo27768X0()));
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        return false;
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        int i2 = this.f12821H;
        if (i2 == 0) {
            mo27843b2(4, 4, Integer.valueOf(i), new C6402e(i));
        } else if (i2 == 1) {
            if (mo27758y2()) {
                m19308S2(i);
            } else {
                mo27843b2(6, 1, Boolean.TRUE, new C6403f(i));
            }
        }
        return true;
    }

    /* renamed from: v */
    public void mo23424v(boolean z) {
        mo27843b2(4, 3, Boolean.valueOf(z), new C6415r(z));
    }

    /* renamed from: v1 */
    public boolean mo23350v1(boolean z) {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo23351w0(String str) {
        return false;
    }

    /* renamed from: x */
    public boolean mo23353x(int i, Object obj) {
        C6024e v2;
        super.mo23353x(i, obj);
        if (i == 5) {
            mo23356y0();
        } else if (i == 7) {
            mo23317U0();
        } else if (i == 10) {
            C7554e eVar = (C7554e) obj;
            mo23348u1(eVar.mo28881b());
            int i2 = this.f12821H;
            if (i2 == 0) {
                v2 = mo23408d0();
            } else if (i2 == 1) {
                v2 = mo27756v2();
            }
            v2.mo27676a(eVar);
        } else if (i == 14) {
            mo23327c1();
        }
        return true;
    }

    /* renamed from: x0 */
    public boolean mo23354x0() {
        return false;
    }

    /* renamed from: x1 */
    public boolean mo23355x1(C9856y yVar) {
        if (yVar.mo31893y()) {
            mo23340p1((long) yVar.mo31874f());
        } else if (yVar.mo31855D()) {
            if (yVar.mo31874f() > 1) {
                mo27842a2(new C9765c[]{new C9765c(2, 1, Boolean.TRUE), new C9765c(2, 7, 0), new C9765c(2, 3, Integer.valueOf(yVar.mo31874f())), new C9765c(2, 5, Integer.valueOf(yVar.mo31876h()))}, new C6399b(yVar));
            } else {
                mo23345s1(yVar.mo31876h());
            }
        } else if (yVar.mo31857F()) {
            mo27842a2(new C9765c[]{new C9765c(2, 1, Boolean.TRUE), new C9765c(2, 7, 1), new C9765c(2, 3, Integer.valueOf(yVar.mo31874f()))}, new C6400c(yVar));
        }
        return true;
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[0];
    }

    /* renamed from: z2 */
    public void mo27759z2() {
        mo27843b2(6, 1, Boolean.TRUE, new C6408k());
    }
}
