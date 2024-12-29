package p223w3;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.p022mi.iot.common.error.IotError;
import com.p022mi.iot.common.handler.CompletedHandler;
import com.p022mi.iot.common.instance.Property;
import com.yeelight.cherry.p141ui.activity.SwitchControlActivity;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.base.C6117h;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.models.YeelightTimer;
import com.yeelight.yeelib.device.xiaomi.base.C8251a;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.C8272e;
import com.yeelight.yeelib.managers.C8301v;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.p142ui.activity.DeviceOfflinePromptActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p227x3.C11980p;
import p232y3.C12041e;
import p237z3.C12143c;

/* renamed from: w3.l1 */
public class C11406l1 extends C6117h {

    /* renamed from: w3.l1$a */
    class C11407a implements C8251a<String> {
        C11407a() {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            String str2 = C11406l1.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("getRclist onSucceed: ");
            sb.append(str);
            C11406l1.this.mo23221d0().mo31612r0(C11406l1.this.mo41895i2(str));
        }

        public void onFailed(IotError iotError) {
            String str = C11406l1.this.f4758v;
        }
    }

    /* renamed from: w3.l1$b */
    class C11408b implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ String f21024a;

        C11408b(String str) {
            this.f21024a = str;
        }

        public void onFailed(IotError iotError) {
            String str = C11406l1.this.f4758v;
        }

        public void onSucceed() {
            String str = C11406l1.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setRclistfordel onSucceed: ");
            sb.append(this.f21024a);
            C11406l1.this.mo23221d0().mo31592h0(4096);
        }
    }

    /* renamed from: w3.l1$c */
    class C11409c implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21026a;

        C11409c(boolean z) {
            this.f21026a = z;
        }

        public void onFailed(IotError iotError) {
            String str = C11406l1.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setSmartSwitch --> onFailed: ");
            sb.append(this.f21026a);
        }

        public void onSucceed() {
            String str = C11406l1.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setSmartSwitch --> onSucceed: ");
            sb.append(this.f21026a);
            boolean unused = C11406l1.this.f12526y = true;
            C11406l1.this.mo23221d0().mo31597k(this.f21026a);
        }
    }

    /* renamed from: w3.l1$d */
    class C11410d implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f21028a;

        C11410d(int i) {
            this.f21028a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C11406l1.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setDelayOff onFailed: ");
            sb.append(this.f21028a);
        }

        public void onSucceed() {
            String str = C11406l1.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setDelayOff onSucceed: ");
            sb.append(this.f21028a);
            boolean unused = C11406l1.this.f12526y = true;
        }
    }

    /* renamed from: w3.l1$e */
    class C11411e implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f21030a;

        C11411e(int i) {
            this.f21030a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C11406l1.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setDelayOff onFailed: ");
            sb.append(this.f21030a);
        }

        public void onSucceed() {
            String str = C11406l1.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setDelayOff onSucceed: ");
            sb.append(this.f21030a);
            boolean unused = C11406l1.this.f12526y = true;
        }
    }

    /* renamed from: w3.l1$f */
    class C11412f implements CompletedHandler {
        C11412f() {
        }

        public void onFailed(IotError iotError) {
            String str = C11406l1.this.f4758v;
        }

        public void onSucceed() {
            boolean unused = C11406l1.this.f12526y = true;
            String str = C11406l1.this.f4758v;
            C11406l1.this.m28976F2().mo31747f(true);
        }
    }

    /* renamed from: w3.l1$g */
    class C11413g implements CompletedHandler {
        C11413g() {
        }

        public void onFailed(IotError iotError) {
            String str = C11406l1.this.f4758v;
        }

        public void onSucceed() {
            boolean unused = C11406l1.this.f12526y = true;
            String str = C11406l1.this.f4758v;
            C11406l1.this.m28977G2().mo31747f(true);
        }
    }

    /* renamed from: w3.l1$h */
    class C11414h implements CompletedHandler {
        C11414h() {
        }

        public void onFailed(IotError iotError) {
            String str = C11406l1.this.f4758v;
        }

        public void onSucceed() {
            boolean unused = C11406l1.this.f12526y = true;
            String str = C11406l1.this.f4758v;
            C11406l1.this.m28976F2().mo31747f(false);
        }
    }

    /* renamed from: w3.l1$i */
    class C11415i implements CompletedHandler {
        C11415i() {
        }

        public void onFailed(IotError iotError) {
            String str = C11406l1.this.f4758v;
        }

        public void onSucceed() {
            boolean unused = C11406l1.this.f12526y = true;
            String str = C11406l1.this.f4758v;
            C11406l1.this.m28977G2().mo31747f(false);
        }
    }

    /* renamed from: w3.l1$j */
    class C11416j implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f21036a;

        C11416j(int i) {
            this.f21036a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C11406l1.this.f4758v;
        }

        public void onSucceed() {
            boolean unused = C11406l1.this.f12526y = true;
            C11406l1.this.m28976F2().mo31746e(this.f21036a);
        }
    }

    /* renamed from: w3.l1$k */
    class C11417k implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f21038a;

        C11417k(int i) {
            this.f21038a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C11406l1.this.f4758v;
        }

        public void onSucceed() {
            boolean unused = C11406l1.this.f12526y = true;
            C11406l1.this.m28977G2().mo31746e(this.f21038a);
        }
    }

    /* renamed from: w3.l1$l */
    class C11418l implements C8251a<Map<Integer, Object>> {
        C11418l() {
        }

        /* renamed from: a */
        public void onSucceed(Map<Integer, Object> map) {
            Boolean bool = (Boolean) map.get(1);
            Integer num = (Integer) map.get(2);
            Integer num2 = (Integer) map.get(3);
            String str = C11406l1.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("get properties1 onSucceed: on: ");
            sb.append(bool);
            sb.append("   defaultStatus: ");
            sb.append(num);
            sb.append("  delay: ");
            sb.append(num2);
            C6117h.C6118a u2 = C11406l1.this.m28976F2();
            u2.mo31747f(bool == null ? false : bool.booleanValue());
            u2.mo31746e(num == null ? 0 : num.intValue());
            if (num2 == null) {
                num2 = 0;
            }
            int intValue = num2.intValue() % 60;
            int intValue2 = num2.intValue() / 60;
            if (intValue > 0) {
                intValue2++;
            }
            Integer valueOf = Integer.valueOf(intValue2);
            if (C11406l1.this.mo23221d0().mo31611r(2) == null) {
                C11406l1.this.m28976F2().mo31742a(new C12041e(valueOf.intValue(), valueOf.intValue()));
            } else {
                C11406l1.this.m28976F2().mo31748g(valueOf.intValue());
            }
        }

        public void onFailed(IotError iotError) {
            String str = C11406l1.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("get properties1 onFailed: ");
            sb.append(iotError);
        }
    }

    /* renamed from: w3.l1$m */
    class C11419m implements C8251a<Map<Integer, Object>> {
        C11419m() {
        }

        /* renamed from: a */
        public void onSucceed(Map<Integer, Object> map) {
            Boolean bool = (Boolean) map.get(1);
            Integer num = (Integer) map.get(2);
            Integer num2 = (Integer) map.get(3);
            String str = C11406l1.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("get properties2 onSucceed: on");
            sb.append(bool);
            sb.append("   defaultStatus: ");
            sb.append(num);
            sb.append("  delay: ");
            sb.append(num2);
            C6117h.C6118a y2 = C11406l1.this.m28977G2();
            y2.mo31747f(bool == null ? false : bool.booleanValue());
            y2.mo31746e(num == null ? 0 : num.intValue());
            if (num2 == null) {
                num2 = 0;
            }
            int intValue = num2.intValue() % 60;
            int intValue2 = num2.intValue() / 60;
            if (intValue > 0) {
                intValue2++;
            }
            Integer valueOf = Integer.valueOf(intValue2);
            if (C11406l1.this.mo23221d0().mo31611r(2) == null) {
                C11406l1.this.m28977G2().mo31742a(new C12041e(valueOf.intValue(), valueOf.intValue()));
            } else {
                C11406l1.this.m28977G2().mo31748g(valueOf.intValue());
            }
        }

        public void onFailed(IotError iotError) {
            String str = C11406l1.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("get properties2 onFailed: ");
            sb.append(iotError);
        }
    }

    /* renamed from: w3.l1$n */
    class C11420n implements C8251a<Map<Integer, Object>> {
        C11420n() {
        }

        /* renamed from: a */
        public void onSucceed(Map<Integer, Object> map) {
            Integer num = (Integer) map.get(2);
            String str = C11406l1.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("get properties3 onSucceed: flexSwitch");
            sb.append(num);
            DeviceStatusBase d0 = C11406l1.this.mo23221d0();
            boolean z = true;
            if (num == null || num.intValue() != 1) {
                z = false;
            }
            d0.mo31597k(z);
        }

        public void onFailed(IotError iotError) {
            String str = C11406l1.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("get properties3 onFailed: ");
            sb.append(iotError);
        }
    }

    public C11406l1(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str3, str2, 2299, str, 2);
        mo23199O0(ownership);
        mo23189I0("wifi");
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public C6117h.C6118a m28976F2() {
        return mo31739q2(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public C6117h.C6118a m28977G2() {
        return mo31739q2(1);
    }

    /* renamed from: H2 */
    private void m28978H2(int i) {
        mo31727Z1(2, 2, Integer.valueOf(i), new C11416j(i));
    }

    /* renamed from: I2 */
    private void m28979I2(int i) {
        mo31727Z1(3, 2, Integer.valueOf(i), new C11417k(i));
    }

    /* renamed from: C */
    public C12041e mo23179C() {
        C6117h.C6118a G2;
        int i = this.f12553C;
        if (i == 0) {
            G2 = m28976F2();
        } else if (i != 1) {
            return null;
        } else {
            G2 = m28977G2();
        }
        return G2.mo31743b();
    }

    /* renamed from: F */
    public int mo23116F() {
        return R$drawable.icon_yeelight_device_badge_sw1_small;
    }

    /* renamed from: G */
    public String mo23185G() {
        if (this.f4749n == null && (mo23212W() == Device.Ownership.MINE || mo23212W() == Device.Ownership.OTHERS)) {
            return this.f4753r;
        }
        AbstractDevice abstractDevice = this.f4749n;
        return (abstractDevice == null || abstractDevice.getDeviceId() == null || this.f4749n.getDeviceId().isEmpty()) ? mo23202Q(mo23206S().getAddress()) : this.f4749n.getDeviceId();
    }

    /* renamed from: H */
    public int mo23119H() {
        return R$drawable.icon_yeelight_device_badge_sw1_big;
    }

    /* renamed from: I1 */
    public List<Property> mo31712I1() {
        return null;
    }

    /* renamed from: L1 */
    public List<YeelightTimer> mo31715L1() {
        List<YeelightTimer> list = (List) mo23221d0().mo31611r(1);
        ArrayList arrayList = new ArrayList();
        int i = this.f12553C;
        int i2 = i == 0 ? 2 : i == 1 ? 3 : 0;
        if (list != null) {
            for (YeelightTimer yeelightTimer : list) {
                if ((yeelightTimer.mo31889j() != null && yeelightTimer.mo31889j().length > 0 && yeelightTimer.mo31889j()[0].mo42552c() == i2) || (yeelightTimer.mo31884c() != null && yeelightTimer.mo31884c().length > 0 && yeelightTimer.mo31884c()[0].mo42552c() == i2)) {
                    arrayList.add(yeelightTimer);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: M0 */
    public void mo23196M0(AbstractDevice abstractDevice) {
        super.mo23196M0(abstractDevice);
        mo23199O0(this.f4749n.getOwnership());
        mo23221d0().mo31549L0(abstractDevice.isOnline());
        mo23184F0(mo23145k0() ? 11 : 0);
    }

    /* renamed from: N1 */
    public C11980p[] mo31716N1(C8327s sVar) {
        return null;
    }

    /* renamed from: O1 */
    public C11980p[] mo31717O1(boolean z) {
        int i = this.f12553C;
        if (i == 0) {
            return new C11980p[]{new C11980p(mo31698M1(), 2, 1, Boolean.valueOf(z))};
        } else if (i != 1) {
            return null;
        } else {
            return new C11980p[]{new C11980p(mo31698M1(), 3, 1, Boolean.valueOf(z))};
        }
    }

    /* renamed from: P1 */
    public void mo31718P1(int i, int i2, Object obj) {
    }

    /* renamed from: R */
    public String mo23204R() {
        return mo23206S().getAddress();
    }

    /* renamed from: V */
    public boolean mo23211V() {
        int i = this.f12553C;
        return i == 0 ? m28976F2().mo31744c() == 1 : i == 1 ? m28977G2().mo31744c() == 1 : super.mo23211V();
    }

    /* renamed from: Y1 */
    public boolean mo31726Y1(int i) {
        int i2 = this.f12553C;
        if (i2 == 0) {
            m28978H2(i);
        } else if (i2 == 1) {
            m28979I2(i);
        }
        return true;
    }

    /* renamed from: b1 */
    public boolean mo23140b1() {
        int i;
        Boolean bool;
        CompletedHandler iVar;
        int i2 = this.f12553C;
        if (i2 == 0) {
            i = 2;
            bool = Boolean.FALSE;
            iVar = new C11414h();
        } else if (i2 != 1) {
            return false;
        } else {
            i = 3;
            bool = Boolean.FALSE;
            iVar = new C11415i();
        }
        mo31727Z1(i, 1, bool, iVar);
        return false;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        return mo23162u1(0);
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

    /* renamed from: f2 */
    public boolean mo31731f2() {
        if (mo23149m0()) {
            return false;
        }
        mo31709F1(2, new int[]{1, 2, 3}, new C11418l());
        mo31709F1(3, new int[]{1, 2, 3}, new C11419m());
        mo31709F1(4, new int[]{2}, new C11420n());
        return true;
    }

    /* renamed from: k1 */
    public boolean mo23146k1() {
        C6117h.C6118a G2;
        int i = this.f12553C;
        if (i == 0) {
            G2 = m28976F2();
        } else if (i != 1) {
            return false;
        } else {
            G2 = m28977G2();
        }
        return G2.mo31745d();
    }

    /* renamed from: k2 */
    public boolean mo41896k2() {
        return mo41926l2(4, 3);
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        int i;
        Boolean bool;
        CompletedHandler gVar;
        int i2 = this.f12553C;
        if (i2 == 0) {
            i = 2;
            bool = Boolean.TRUE;
            gVar = new C11412f();
        } else {
            if (i2 == 1) {
                i = 3;
                bool = Boolean.TRUE;
                gVar = new C11413g();
            }
            return true;
        }
        mo31727Z1(i, 1, bool, gVar);
        return true;
    }

    /* renamed from: l2 */
    public boolean mo41926l2(int i, int i2) {
        mo31710G1(i, i2, new C11407a());
        return true;
    }

    /* renamed from: n2 */
    public boolean mo41928n2(int i, int i2, String str) {
        mo31727Z1(i, i2, str, new C11408b(str));
        return true;
    }

    /* renamed from: o2 */
    public boolean mo41897o2(String str, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("unbindRemote mac: ");
        sb.append(str);
        return mo41928n2(4, 4, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public void mo23235s0(int i, int i2) {
        if (i2 == 11) {
            mo23169y0();
        }
        if (i2 == 11 && this.f4749n.getOwnership() == Device.Ownership.MINE) {
            C8301v.m19657a(this);
        } else if (i2 == 0) {
            mo23183E0(-1);
        }
        for (C12143c onConnectionStateChanged : this.f4740e) {
            onConnectionStateChanged.onConnectionStateChanged(i, i2);
        }
    }

    /* renamed from: u0 */
    public void mo23161u0(View view) {
        if (!C8272e.m19511b().mo35204d()) {
            Toast.makeText(view.getContext(), view.getContext().getResources().getString(R$string.common_text_please_check_network), 0).show();
        } else if (mo23145k0()) {
            Class<SwitchControlActivity> cls = null;
            Class<SwitchControlActivity> cls2 = SwitchControlActivity.class;
            try {
                int i = SwitchControlActivity.f11456h;
                cls = cls2;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            if (cls != null && mo23145k0()) {
                Intent intent = new Intent();
                intent.setClass(view.getContext(), cls);
                intent.putExtra("com.yeelight.cherry.device_id", mo23185G());
                view.getContext().startActivity(intent);
            }
        } else {
            Intent intent2 = new Intent();
            intent2.setClass(view.getContext(), DeviceOfflinePromptActivity.class);
            intent2.putExtra("com.yeelight.cherry.device_id", this.f4753r);
            view.getContext().startActivity(intent2);
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        int i2 = this.f12553C;
        if (i2 == 0) {
            mo31727Z1(2, 3, Integer.valueOf(i * 60), new C11410d(i));
        } else if (i2 == 1) {
            mo31727Z1(3, 3, Integer.valueOf(i * 60), new C11411e(i));
        }
        return true;
    }

    /* renamed from: v */
    public void mo23238v(boolean z) {
        mo31727Z1(4, 2, Integer.valueOf(z ? 1 : 0), new C11409c(z));
    }

    /* renamed from: x */
    public boolean mo23166x(int i, Object obj) {
        C6117h.C6118a G2;
        super.mo23166x(i, obj);
        if (i == 5) {
            mo23169y0();
        } else if (i == 7) {
            mo23131U0();
        } else if (i == 10) {
            C12041e eVar = (C12041e) obj;
            mo23162u1(eVar.mo42678b());
            int i2 = this.f12553C;
            if (i2 == 0) {
                G2 = m28976F2();
            } else if (i2 == 1) {
                G2 = m28977G2();
            }
            G2.mo31742a(eVar);
        } else if (i == 14) {
            mo23141c1();
        }
        return true;
    }
}
