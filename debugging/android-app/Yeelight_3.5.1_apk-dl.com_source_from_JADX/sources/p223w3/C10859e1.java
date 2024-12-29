package p223w3;

import android.view.View;
import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.xiaomi.MonoService;
import com.yeelight.yeelib.device.xiaomi.RemoteControlService;
import com.yeelight.yeelib.device.xiaomi.YeelightRemoteControl;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.utils.AppUtils;

/* renamed from: w3.e1 */
public class C10859e1 extends WifiDeviceBase {

    /* renamed from: C */
    public static final String f20183C = C11842x0.class.getSimpleName();

    /* renamed from: A */
    CompletionHandler f20184A = new C10862c(this);

    /* renamed from: B */
    RemoteControlService.C7953h f20185B = new C10863d(this);

    /* renamed from: z */
    CompletionHandler f20186z = new C10861b(this);

    /* renamed from: w3.e1$a */
    class C10860a implements RemoteControlService.C7952g {
        C10860a(C10859e1 e1Var) {
        }

        /* renamed from: a */
        public void mo34593a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("batteryStatus: ");
            sb.append(l);
        }

        public void onFailed(int i, String str) {
        }
    }

    /* renamed from: w3.e1$b */
    class C10861b implements CompletionHandler {
        C10861b(C10859e1 e1Var) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.e1$c */
    class C10862c implements CompletionHandler {
        C10862c(C10859e1 e1Var) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("subscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.e1$d */
    class C10863d implements RemoteControlService.C7953h {
        C10863d(C10859e1 e1Var) {
        }

        /* renamed from: a */
        public void mo34595a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBatteryStatusChanged, batteryStatus: ");
            sb.append(l);
        }
    }

    /* renamed from: w3.e1$e */
    class C10864e implements WifiDeviceBase.C6080i {
        C10864e(C10859e1 e1Var) {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
        }

        /* renamed from: h */
        public void mo31501h(Long l) {
        }

        /* renamed from: j */
        public void mo31502j(Long l) {
        }

        /* renamed from: k */
        public void mo31503k(Long l) {
        }

        /* renamed from: l */
        public void mo31504l(Long l) {
        }

        /* renamed from: m */
        public void mo31505m(WifiDeviceBase.Power power) {
        }
    }

    public C10859e1(String str, String str2, Device.Ownership ownership) {
        super(str, str2, "yeelink.controller.v1", ownership);
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        return false;
    }

    /* renamed from: C1 */
    public boolean mo31474C1() {
        return false;
    }

    /* renamed from: E1 */
    public boolean mo31476E1(String str, int i) {
        return false;
    }

    /* renamed from: F */
    public int mo23116F() {
        return 0;
    }

    /* renamed from: H */
    public int mo23119H() {
        return 0;
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C10864e(this);
    }

    /* renamed from: M0 */
    public void mo23196M0(AbstractDevice abstractDevice) {
        super.mo23196M0(abstractDevice);
        if (abstractDevice.isOnline()) {
            mo31492U1();
        } else {
            mo31493V1();
        }
    }

    /* renamed from: M1 */
    public boolean mo31484M1(boolean z) {
        return false;
    }

    /* renamed from: R1 */
    public boolean mo31489R1(int i) {
        return false;
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        return false;
    }

    /* renamed from: U */
    public String mo23210U() {
        String U = super.mo23210U();
        return (U == null || U.isEmpty()) ? C3108x.f4951e.getResources().getString(R$string.yeelight_device_name_mono) : U;
    }

    /* renamed from: U1 */
    public boolean mo31492U1() {
        return mo42247Y1(this.f20184A, this.f20185B);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f20186z);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f20183C, "Invalid handler!");
        }
        if (this.f4749n == null) {
            return true;
        }
        try {
            mo31477F1().unsubscribeNotifications((CompletionHandler) obj);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: X1 */
    public RemoteControlService mo31477F1() {
        return ((YeelightRemoteControl) this.f4749n).mDeviceService;
    }

    /* renamed from: Y1 */
    public boolean mo42247Y1(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof MonoService.C7769j0)) {
            AppUtils.m8300u(f20183C, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (RemoteControlService.C7953h) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: b1 */
    public boolean mo23140b1() {
        return false;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        return false;
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        return false;
    }

    /* renamed from: m1 */
    public boolean mo23150m1(int i) {
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

    /* renamed from: r1 */
    public boolean mo23157r1(int i, int[] iArr, int i2) {
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

    /* renamed from: u0 */
    public void mo23161u0(View view) {
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        return false;
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f20186z);
    }

    /* renamed from: v1 */
    public boolean mo23249v1(boolean z) {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo23164w0(String str) {
        return false;
    }

    /* renamed from: x */
    public boolean mo23166x(int i, Object obj) {
        boolean x = super.mo23166x(i, obj);
        if (i == 5) {
            mo23169y0();
        } else if (i == 7) {
            mo23131U0();
        }
        return x;
    }

    /* renamed from: x0 */
    public boolean mo23167x0() {
        if (this.f4749n.getOwnership() != Device.Ownership.MINE && this.f4749n.getOwnership() != Device.Ownership.OTHERS) {
            return true;
        }
        try {
            mo31477F1().getProperties(new C10860a(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: x1 */
    public boolean mo23168x1(C8327s sVar) {
        return false;
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[0];
    }
}
