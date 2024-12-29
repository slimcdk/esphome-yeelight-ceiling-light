package p223w3;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;
import com.miot.common.exception.MiotException;
import com.yeelight.cherry.p141ui.activity.SpeakerDeviceControlActivity;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.xiaomi.WifiSpeakerService;
import com.yeelight.yeelib.device.xiaomi.YeelightWifiSpeaker;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.C8272e;
import com.yeelight.yeelib.p142ui.activity.DeviceOfflinePromptActivity;
import com.yeelight.yeelib.utils.AppUtils;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: w3.f1 */
public class C10916f1 extends WifiDeviceBase {

    /* renamed from: Q */
    public static final String f20280Q = "f1";

    /* renamed from: A */
    CompletionHandler f20281A = new C10917a(this);

    /* renamed from: B */
    CompletionHandler f20282B = new C10918b(this);

    /* renamed from: C */
    WifiSpeakerService.C8157i f20283C = new C10919c();
    /* access modifiers changed from: private */

    /* renamed from: z */
    public WifiSpeakerService.AiProvider f20284z;

    /* renamed from: w3.f1$a */
    class C10917a implements CompletionHandler {
        C10917a(C10916f1 f1Var) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.f1$b */
    class C10918b implements CompletionHandler {
        C10918b(C10916f1 f1Var) {
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

    /* renamed from: w3.f1$c */
    class C10919c implements WifiSpeakerService.C8157i {
        C10919c() {
        }

        /* renamed from: a */
        public void mo34902a(WifiSpeakerService.AiProvider aiProvider) {
            WifiSpeakerService.AiProvider unused = C10916f1.this.f20284z = aiProvider;
        }
    }

    /* renamed from: w3.f1$d */
    class C10920d implements WifiSpeakerService.C8156h {
        C10920d() {
        }

        /* renamed from: a */
        public void mo34900a(WifiSpeakerService.AiProvider aiProvider) {
            String str = C10916f1.f20280Q;
            StringBuilder sb = new StringBuilder();
            sb.append("getProperties onSucceed aiProvider: ");
            sb.append(aiProvider);
            C10916f1.this.m27913c2(aiProvider);
        }

        public void onFailed(int i, String str) {
            String str2 = C10916f1.f20280Q;
            StringBuilder sb = new StringBuilder();
            sb.append("getProperties onFailed errCode: ");
            sb.append(i);
        }
    }

    /* renamed from: w3.f1$e */
    class C10921e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ WifiSpeakerService.AiProvider f20287a;

        C10921e(WifiSpeakerService.AiProvider aiProvider) {
            this.f20287a = aiProvider;
        }

        public void onFailed(int i, String str) {
            String str2 = C10916f1.f20280Q;
            StringBuilder sb = new StringBuilder();
            sb.append("setAiProvider onFailed code:");
            sb.append(i);
            C10916f1.this.mo23221d0().mo31592h0(33554432);
        }

        public void onSucceed() {
            String str = C10916f1.f20280Q;
            WifiSpeakerService.AiProvider unused = C10916f1.this.f20284z = this.f20287a;
            C10916f1.this.mo23221d0().mo31592h0(16777216);
        }
    }

    public C10916f1(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str2, str3, ownership);
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public void m27913c2(WifiSpeakerService.AiProvider aiProvider) {
        this.f20284z = aiProvider;
    }

    /* renamed from: F */
    public int mo23116F() {
        return R$drawable.icon_yeelight_device_badge_donut_small;
    }

    /* renamed from: H */
    public int mo23119H() {
        return R$drawable.icon_yeelight_device_badge_donut_big;
    }

    /* renamed from: K1 */
    public void mo31482K1() {
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
        return (U == null || U.isEmpty()) ? C3108x.f4951e.getResources().getString(R$string.yeelight_device_name_donut) : super.mo23210U();
    }

    /* renamed from: U1 */
    public boolean mo31492U1() {
        return mo42282e2(this.f20282B, this.f20283C);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f20281A);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f20280Q, "Invalid handler!");
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

    /* renamed from: Z1 */
    public WifiSpeakerService mo31477F1() {
        AbstractDevice abstractDevice = this.f4749n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightWifiSpeaker) abstractDevice).mDeviceService;
    }

    /* renamed from: a2 */
    public WifiSpeakerService.AiProvider mo42279a2() {
        return this.f20284z;
    }

    /* renamed from: b2 */
    public boolean mo42280b2() {
        WifiSpeakerService.AiProvider a2 = mo42279a2();
        return (a2 == null || a2 == WifiSpeakerService.AiProvider.undefined) ? false : true;
    }

    /* renamed from: d2 */
    public void mo42281d2(WifiSpeakerService.AiProvider aiProvider) {
        if (aiProvider != null) {
            try {
                mo31477F1().setAiProvider(aiProvider, new C10921e(aiProvider));
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }
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

    /* renamed from: e2 */
    public boolean mo42282e2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof WifiSpeakerService.C8157i)) {
            AppUtils.m8300u(f20280Q, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (WifiSpeakerService.C8157i) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: m1 */
    public boolean mo23150m1(int i) {
        return false;
    }

    /* renamed from: u0 */
    public void mo23161u0(View view) {
        if (!C8272e.m19511b().mo35204d()) {
            Toast.makeText(view.getContext(), view.getContext().getResources().getString(R$string.common_text_please_check_network), 0).show();
        } else if (mo23145k0()) {
            Class<SpeakerDeviceControlActivity> cls = null;
            Class<SpeakerDeviceControlActivity> cls2 = SpeakerDeviceControlActivity.class;
            try {
                int i = SpeakerDeviceControlActivity.f11448g;
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

    /* renamed from: v1 */
    public boolean mo23249v1(boolean z) {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo23164w0(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("SPEAKER_DEVICE processPropJson: ");
        sb.append(str);
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 1) {
                AppUtils.m8300u("SPEAKER_DEVICE", "SPEAKER_DEVICE, Invalid length of batch rpc result: " + str);
            }
            m27913c2(WifiSpeakerService.AiProvider.valueOf(jSONArray.getString(0)));
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: x0 */
    public boolean mo23167x0() {
        if (super.mo23167x0()) {
            return true;
        }
        if (this.f4749n.getOwnership() == Device.Ownership.MINE || this.f4749n.getOwnership() == Device.Ownership.OTHERS) {
            try {
                mo31477F1().getProperties(new C10920d());
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    /* renamed from: z */
    public String[] mo23170z() {
        Service service = mo31477F1().getService();
        mo31477F1();
        return new String[]{service.getProperty(WifiSpeakerService.PROPERTY_AiProvider).getInternalName()};
    }
}
