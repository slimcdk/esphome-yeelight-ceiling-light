package com.yeelight.yeelib.p150c.p183m;

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
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.xiaomi.MeshGatewayService;
import com.yeelight.yeelib.device.xiaomi.YeelightMeshGatewayDevice;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C6029f;
import com.yeelight.yeelib.p150c.p184n.C7554e;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p152f.C9784e;
import com.yeelight.yeelib.p185d.C7563a;
import com.yeelight.yeelib.p185d.C7565b;
import com.yeelight.yeelib.p194ui.activity.DeviceOfflinePromptActivity;
import com.yeelight.yeelib.utils.C4308b;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.yeelight.yeelib.c.m.o0 */
public class C7130o0 extends C6029f {

    /* renamed from: G */
    public static final String f14587G = "o0";

    /* renamed from: A */
    CompletionHandler f14588A = new C7134d(this);

    /* renamed from: B */
    MeshGatewayService.C9231r f14589B = new C7135e();

    /* renamed from: z */
    CompletionHandler f14590z = new C7133c(this);

    /* renamed from: com.yeelight.yeelib.c.m.o0$a */
    class C7131a implements MeshGatewayService.C9227n {
        C7131a() {
        }

        /* renamed from: a */
        public void mo28586a(MeshGatewayService.C9229p pVar, String str) {
            "indicator: " + pVar;
            "timezone: " + str;
            C7130o0.this.m21056l2(pVar, str);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o0$b */
    class C7132b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14592a;

        C7132b(boolean z) {
            this.f14592a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7130o0.this.mo23408d0().mo27721w0(this.f14592a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o0$c */
    class C7133c implements CompletionHandler {
        C7133c(C7130o0 o0Var) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o0$d */
    class C7134d implements CompletionHandler {
        C7134d(C7130o0 o0Var) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o0$e */
    class C7135e implements MeshGatewayService.C9231r {
        C7135e() {
        }

        /* renamed from: a */
        public void mo28588a(String str) {
            if (!TextUtils.isEmpty(str)) {
                C7130o0.this.mo23408d0().mo27660Q0(str);
            }
        }

        /* renamed from: b */
        public void mo28589b(MeshGatewayService.C9229p pVar) {
            C7130o0.this.mo23408d0().mo27721w0(pVar == MeshGatewayService.C9229p.on);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o0$f */
    class C7136f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14595a;

        C7136f(boolean z) {
            this.f14595a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7130o0.this.mo23408d0().mo27682d(this.f14595a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o0$g */
    class C7137g implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14597a;

        C7137g(int i) {
            this.f14597a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7130o0.this.mo23408d0().mo27644I0(this.f14597a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o0$h */
    class C7138h implements C6006h.C6016j {
        C7138h(C7130o0 o0Var) {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
        }

        /* renamed from: j */
        public void mo27585j(Long l) {
        }

        /* renamed from: k */
        public void mo27586k(Long l) {
        }

        /* renamed from: l */
        public void mo27587l(Long l) {
        }

        /* renamed from: m */
        public void mo27588m(C6006h.C6015i iVar) {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o0$i */
    class C7139i implements CompletionHandler {
        C7139i(C7130o0 o0Var) {
        }

        public void onFailed(int i, String str) {
            "setTimezone onFailed: " + i;
        }

        public void onSucceed() {
        }
    }

    public C7130o0(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str2, str3, ownership);
        C7565b bVar = C7565b.DEVICE_EVENT_OPEN;
        C7565b bVar2 = C7565b.DEVICE_EVENT_CLOSE;
        C7565b bVar3 = C7565b.DEVICE_EVENT_BRIGHT_CHANGE;
        C7563a aVar = C7563a.ON;
        C7563a aVar2 = C7563a.OFF;
        C7563a aVar3 = C7563a.BRIGHT;
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public void m21056l2(MeshGatewayService.C9229p pVar, String str) {
        "Mesh Gataway onPropResult name: " + mo23397U() + "     indicator: " + pVar;
        mo23408d0().mo27721w0(MeshGatewayService.C9229p.on == pVar);
        if (!TextUtils.isEmpty(str)) {
            mo23408d0().mo27660Q0(str);
        }
    }

    /* renamed from: F */
    public int mo23303F() {
        return R$drawable.icon_yeelight_device_badge_gateway_small;
    }

    /* renamed from: H */
    public int mo23306H() {
        return R$drawable.icon_yeelight_device_badge_gateway_big;
    }

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C7138h(this);
    }

    /* renamed from: M0 */
    public void mo23383M0(AbstractDevice abstractDevice) {
        super.mo23383M0(abstractDevice);
        if (abstractDevice.isOnline()) {
            mo27575U1();
        } else {
            mo27576V1();
        }
    }

    /* renamed from: M1 */
    public boolean mo27567M1(boolean z) {
        "setGeekMode --> Invoke, enable : " + z;
        try {
            mo27560F1().sendCmd(MeshGatewayService.C9225l.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7136f(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: R1 */
    public boolean mo27572R1(int i) {
        "setOnFromPower --> Invoke, value : " + i;
        try {
            mo27560F1().sendCmd(MeshGatewayService.C9225l.cfg_init_power, String.valueOf(i), new C7137g(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        return false;
    }

    /* renamed from: U */
    public String mo23397U() {
        String U = super.mo23397U();
        return (U == null || U.isEmpty()) ? C4297y.f7456e.getResources().getString(R$string.yeelight_device_name_mesh_gateway) : U;
    }

    /* renamed from: U1 */
    public boolean mo27575U1() {
        return mo28585n2(this.f14588A, this.f14589B);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f14590z);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f14587G, "Invalid handler!");
        }
        if (this.f7251n == null) {
            return true;
        }
        try {
            mo27560F1().unsubscribeNotifications((CompletionHandler) obj);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: a2 */
    public boolean mo27734a2(boolean z) {
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

    /* renamed from: f2 */
    public boolean mo27737f2(int i) {
        return false;
    }

    /* renamed from: g1 */
    public boolean mo23431g1(boolean z, String str, String str2, int i) {
        return false;
    }

    /* renamed from: j2 */
    public MeshGatewayService mo27560F1() {
        AbstractDevice abstractDevice = this.f7251n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightMeshGatewayDevice) abstractDevice).mDeviceService;
    }

    /* renamed from: k2 */
    public String mo28583k2() {
        return mo23408d0().mo27651M();
    }

    /* renamed from: m2 */
    public void mo28584m2(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                mo27560F1().setTimezone(str, new C7139i(this));
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: n2 */
    public boolean mo28585n2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof MeshGatewayService.C9231r)) {
            C4308b.m12139r(f14587G, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (MeshGatewayService.C9231r) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u0 */
    public void mo23347u0(View view) {
        if (!C9784e.m23711b().mo31628d()) {
            Toast.makeText(view.getContext(), view.getContext().getResources().getString(R$string.common_text_please_check_network), 0).show();
        } else if (mo23331k0()) {
            Class<?> cls = null;
            try {
                cls = Class.forName("com.yeelight.cherry.ui.activity.MeshGatewayControlActivity");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            if (cls != null && mo23331k0()) {
                Intent intent = new Intent();
                intent.setClass(view.getContext(), cls);
                intent.putExtra("com.yeelight.cherry.device_id", mo23372G());
                view.getContext().startActivity(intent);
            }
        } else {
            Intent intent2 = new Intent();
            intent2.setClass(view.getContext(), DeviceOfflinePromptActivity.class);
            intent2.putExtra("com.yeelight.cherry.device_id", this.f7255r);
            view.getContext().startActivity(intent2);
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f14590z);
    }

    /* renamed from: v1 */
    public boolean mo23350v1(boolean z) {
        try {
            mo27560F1().setLEDIndicator(z ? MeshGatewayService.C9230q.on : MeshGatewayService.C9230q.off, new C7132b(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: w0 */
    public boolean mo23351w0(String str) {
        "MeshGatewayDevice processPropJson: " + str;
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 2) {
                C4308b.m12139r("MESH_GATEWAY_DEVICE", "MeshGatewayDevice, Invalid length of batch rpc result: " + str);
            }
            m21056l2(MeshGatewayService.C9229p.valueOf(jSONArray.getString(0)), jSONArray.getString(1));
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: x */
    public boolean mo23353x(int i, Object obj) {
        boolean x = super.mo23353x(i, obj);
        if (i == 5) {
            mo23356y0();
        } else if (i == 7) {
            mo23317U0();
        } else if (i == 10) {
            C7554e eVar = (C7554e) obj;
            mo23348u1(eVar.mo28881b());
            mo23408d0().mo27676a(eVar);
        } else if (i == 14) {
            mo23327c1();
        }
        return x;
    }

    /* renamed from: x0 */
    public boolean mo23354x0() {
        if (super.mo23354x0()) {
            return true;
        }
        if (this.f7251n.getOwnership() == Device.Ownership.MINE || this.f7251n.getOwnership() == Device.Ownership.OTHERS) {
            try {
                mo27560F1().getProperties(new C7131a());
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty(MeshGatewayService.PROPERTY_Indicator).getInternalName(), mo27560F1().getService().getProperty(MeshGatewayService.PROPERTY_Timezone).getInternalName()};
    }
}
