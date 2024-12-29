package p223w3;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.cherry.p141ui.activity.MeshGatewayControlActivity;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.xiaomi.MeshGatewayService;
import com.yeelight.yeelib.device.xiaomi.YeelightMeshGatewayDevice;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.interaction.DeviceEvent;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.C8272e;
import com.yeelight.yeelib.p142ui.activity.DeviceOfflinePromptActivity;
import com.yeelight.yeelib.utils.AppUtils;
import org.json.JSONArray;
import org.json.JSONException;
import p207s3.C10333b;
import p232y3.C12041e;

/* renamed from: w3.p0 */
public class C11571p0 extends C10333b {

    /* renamed from: C */
    public static final String f21272C = "p0";

    /* renamed from: A */
    CompletionHandler f21273A = new C11575d(this);

    /* renamed from: B */
    MeshGatewayService.C7711o f21274B = new C11576e();

    /* renamed from: z */
    CompletionHandler f21275z = new C11574c(this);

    /* renamed from: w3.p0$a */
    class C11572a implements MeshGatewayService.C7709m {
        C11572a() {
        }

        /* renamed from: a */
        public void mo34235a(MeshGatewayService.Indicator indicator, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("indicator: ");
            sb.append(indicator);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("timezone: ");
            sb2.append(str);
            C11571p0.this.m29424l2(indicator, str);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.p0$b */
    class C11573b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21277a;

        C11573b(boolean z) {
            this.f21277a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11571p0.this.mo23221d0().mo31624x0(this.f21277a);
        }
    }

    /* renamed from: w3.p0$c */
    class C11574c implements CompletionHandler {
        C11574c(C11571p0 p0Var) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.p0$d */
    class C11575d implements CompletionHandler {
        C11575d(C11571p0 p0Var) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("subscribe: onFailed, error: ");
            sb.append(i);
            sb.append(", desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.p0$e */
    class C11576e implements MeshGatewayService.C7711o {
        C11576e() {
        }

        /* renamed from: a */
        public void mo34239a(String str) {
            if (!TextUtils.isEmpty(str)) {
                C11571p0.this.mo23221d0().mo31563S0(str);
            }
        }

        /* renamed from: b */
        public void mo34240b(MeshGatewayService.Indicator indicator) {
            C11571p0.this.mo23221d0().mo31624x0(indicator == MeshGatewayService.Indicator.on);
        }
    }

    /* renamed from: w3.p0$f */
    class C11577f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21280a;

        C11577f(boolean z) {
            this.f21280a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11571p0.this.mo23221d0().mo31583d(this.f21280a);
        }
    }

    /* renamed from: w3.p0$g */
    class C11578g implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21282a;

        C11578g(int i) {
            this.f21282a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11571p0.this.mo23221d0().mo31547K0(this.f21282a);
        }
    }

    /* renamed from: w3.p0$h */
    class C11579h implements WifiDeviceBase.C6080i {
        C11579h(C11571p0 p0Var) {
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

    /* renamed from: w3.p0$i */
    class C11580i implements CompletionHandler {
        C11580i(C11571p0 p0Var) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("setTimezone onFailed: ");
            sb.append(i);
        }

        public void onSucceed() {
        }
    }

    public C11571p0(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str2, str3, ownership);
        DeviceEvent deviceEvent = DeviceEvent.DEVICE_EVENT_OPEN;
        DeviceEvent deviceEvent2 = DeviceEvent.DEVICE_EVENT_CLOSE;
        DeviceEvent deviceEvent3 = DeviceEvent.DEVICE_EVENT_BRIGHT_CHANGE;
        ActionType actionType = ActionType.ON;
        ActionType actionType2 = ActionType.OFF;
        ActionType actionType3 = ActionType.BRIGHT;
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public void m29424l2(MeshGatewayService.Indicator indicator, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Mesh Gataway onPropResult name: ");
        sb.append(mo23210U());
        sb.append("     indicator: ");
        sb.append(indicator);
        mo23221d0().mo31624x0(MeshGatewayService.Indicator.on == indicator);
        if (!TextUtils.isEmpty(str)) {
            mo23221d0().mo31563S0(str);
        }
    }

    /* renamed from: F */
    public int mo23116F() {
        return R$drawable.icon_yeelight_device_badge_gateway_small;
    }

    /* renamed from: H */
    public int mo23119H() {
        return R$drawable.icon_yeelight_device_badge_gateway_big;
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C11579h(this);
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
        StringBuilder sb = new StringBuilder();
        sb.append("setGeekMode --> Invoke, enable : ");
        sb.append(z);
        try {
            mo31477F1().sendCmd(MeshGatewayService.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11577f(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: R1 */
    public boolean mo31489R1(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("setOnFromPower --> Invoke, value : ");
        sb.append(i);
        try {
            mo31477F1().sendCmd(MeshGatewayService.CmdKey.cfg_init_power, String.valueOf(i), new C11578g(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        return false;
    }

    /* renamed from: U */
    public String mo23210U() {
        String U = super.mo23210U();
        return (U == null || U.isEmpty()) ? C3108x.f4951e.getResources().getString(R$string.yeelight_device_name_mesh_gateway) : U;
    }

    /* renamed from: U1 */
    public boolean mo31492U1() {
        return mo42334n2(this.f21273A, this.f21274B);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f21275z);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f21272C, "Invalid handler!");
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

    /* renamed from: a2 */
    public boolean mo41882a2(boolean z) {
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

    /* renamed from: f2 */
    public boolean mo41885f2(int i) {
        return false;
    }

    /* renamed from: g1 */
    public boolean mo23245g1(boolean z, String str, String str2, int i) {
        return false;
    }

    /* renamed from: j2 */
    public MeshGatewayService mo31477F1() {
        AbstractDevice abstractDevice = this.f4749n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightMeshGatewayDevice) abstractDevice).mDeviceService;
    }

    /* renamed from: k2 */
    public String mo42332k2() {
        return mo23221d0().mo31552N();
    }

    /* renamed from: m2 */
    public void mo42333m2(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                mo31477F1().setTimezone(str, new C11580i(this));
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: n2 */
    public boolean mo42334n2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof MeshGatewayService.C7711o)) {
            AppUtils.m8300u(f21272C, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (MeshGatewayService.C7711o) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u0 */
    public void mo23161u0(View view) {
        if (!C8272e.m19511b().mo35204d()) {
            Toast.makeText(view.getContext(), view.getContext().getResources().getString(R$string.common_text_please_check_network), 0).show();
        } else if (mo23145k0()) {
            Class<MeshGatewayControlActivity> cls = null;
            Class<MeshGatewayControlActivity> cls2 = MeshGatewayControlActivity.class;
            try {
                int i = MeshGatewayControlActivity.f10784d;
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

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f21275z);
    }

    /* renamed from: v1 */
    public boolean mo23249v1(boolean z) {
        try {
            mo31477F1().setLEDIndicator(z ? MeshGatewayService.IndicatorParams.on : MeshGatewayService.IndicatorParams.off, new C11573b(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: w0 */
    public boolean mo23164w0(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("MeshGatewayDevice processPropJson: ");
        sb.append(str);
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 2) {
                AppUtils.m8300u("MESH_GATEWAY_DEVICE", "MeshGatewayDevice, Invalid length of batch rpc result: " + str);
            }
            m29424l2(MeshGatewayService.Indicator.valueOf(jSONArray.getString(0)), jSONArray.getString(1));
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
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
        if (super.mo23167x0()) {
            return true;
        }
        if (this.f4749n.getOwnership() == Device.Ownership.MINE || this.f4749n.getOwnership() == Device.Ownership.OTHERS) {
            try {
                mo31477F1().getProperties(new C11572a());
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty(MeshGatewayService.PROPERTY_Indicator).getInternalName(), mo31477F1().getService().getProperty(MeshGatewayService.PROPERTY_Timezone).getInternalName()};
    }
}
