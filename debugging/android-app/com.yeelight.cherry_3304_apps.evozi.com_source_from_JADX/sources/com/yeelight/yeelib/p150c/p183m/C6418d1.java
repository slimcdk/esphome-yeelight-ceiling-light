package com.yeelight.yeelib.p150c.p183m;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;
import com.miot.common.exception.MiotException;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.xiaomi.WifiSpeakerService;
import com.yeelight.yeelib.device.xiaomi.YeelightWifiSpeaker;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p152f.C9784e;
import com.yeelight.yeelib.p194ui.activity.DeviceOfflinePromptActivity;
import com.yeelight.yeelib.utils.C4308b;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.yeelight.yeelib.c.m.d1 */
public class C6418d1 extends C6006h {

    /* renamed from: H */
    public static final String f13495H = "d1";

    /* renamed from: A */
    CompletionHandler f13496A = new C6419a(this);

    /* renamed from: B */
    CompletionHandler f13497B = new C6420b(this);

    /* renamed from: G */
    WifiSpeakerService.C9668j f13498G = new C6421c();
    /* access modifiers changed from: private */

    /* renamed from: z */
    public WifiSpeakerService.C9665g f13499z;

    /* renamed from: com.yeelight.yeelib.c.m.d1$a */
    class C6419a implements CompletionHandler {
        C6419a(C6418d1 d1Var) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d1$b */
    class C6420b implements CompletionHandler {
        C6420b(C6418d1 d1Var) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d1$c */
    class C6421c implements WifiSpeakerService.C9668j {
        C6421c() {
        }

        /* renamed from: a */
        public void mo28159a(WifiSpeakerService.C9665g gVar) {
            WifiSpeakerService.C9665g unused = C6418d1.this.f13499z = gVar;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d1$d */
    class C6422d implements WifiSpeakerService.C9667i {
        C6422d() {
        }

        /* renamed from: a */
        public void mo28160a(WifiSpeakerService.C9665g gVar) {
            String str = C6418d1.f13495H;
            "getProperties onSucceed aiProvider: " + gVar;
            C6418d1.this.m19356c2(gVar);
        }

        public void onFailed(int i, String str) {
            String str2 = C6418d1.f13495H;
            "getProperties onFailed errCode: " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d1$e */
    class C6423e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ WifiSpeakerService.C9665g f13502a;

        C6423e(WifiSpeakerService.C9665g gVar) {
            this.f13502a = gVar;
        }

        public void onFailed(int i, String str) {
            String str2 = C6418d1.f13495H;
            "setAiProvider onFailed code:" + i;
            C6418d1.this.mo23408d0().mo27689g0(33554432);
        }

        public void onSucceed() {
            String str = C6418d1.f13495H;
            WifiSpeakerService.C9665g unused = C6418d1.this.f13499z = this.f13502a;
            C6418d1.this.mo23408d0().mo27689g0(16777216);
        }
    }

    public C6418d1(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str2, str3, ownership);
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public void m19356c2(WifiSpeakerService.C9665g gVar) {
        this.f13499z = gVar;
    }

    /* renamed from: F */
    public int mo23303F() {
        return R$drawable.icon_yeelight_device_badge_donut_small;
    }

    /* renamed from: H */
    public int mo23306H() {
        return R$drawable.icon_yeelight_device_badge_donut_big;
    }

    /* renamed from: K1 */
    public void mo27565K1() {
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
        return false;
    }

    /* renamed from: R1 */
    public boolean mo27572R1(int i) {
        return false;
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        return false;
    }

    /* renamed from: U */
    public String mo23397U() {
        String U = super.mo23397U();
        return (U == null || U.isEmpty()) ? C4297y.f7456e.getResources().getString(R$string.yeelight_device_name_donut) : super.mo23397U();
    }

    /* renamed from: U1 */
    public boolean mo27575U1() {
        return mo28158e2(this.f13497B, this.f13498G);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f13496A);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f13495H, "Invalid handler!");
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

    /* renamed from: Z1 */
    public WifiSpeakerService mo27560F1() {
        AbstractDevice abstractDevice = this.f7251n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightWifiSpeaker) abstractDevice).mDeviceService;
    }

    /* renamed from: a2 */
    public WifiSpeakerService.C9665g mo28155a2() {
        return this.f13499z;
    }

    /* renamed from: b2 */
    public boolean mo28156b2() {
        WifiSpeakerService.C9665g a2 = mo28155a2();
        return (a2 == null || a2 == WifiSpeakerService.C9665g.undefined) ? false : true;
    }

    /* renamed from: d2 */
    public void mo28157d2(WifiSpeakerService.C9665g gVar) {
        if (gVar != null) {
            try {
                mo27560F1().setAiProvider(gVar, new C6423e(gVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }
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

    /* renamed from: e2 */
    public boolean mo28158e2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof WifiSpeakerService.C9668j)) {
            C4308b.m12139r(f13495H, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (WifiSpeakerService.C9668j) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: m1 */
    public boolean mo23336m1(int i) {
        return false;
    }

    /* renamed from: u0 */
    public void mo23347u0(View view) {
        if (!C9784e.m23711b().mo31628d()) {
            Toast.makeText(view.getContext(), view.getContext().getResources().getString(R$string.common_text_please_check_network), 0).show();
        } else if (mo23331k0()) {
            Class<?> cls = null;
            try {
                cls = Class.forName("com.yeelight.cherry.ui.activity.SpeakerDeviceControlActivity");
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

    /* renamed from: v1 */
    public boolean mo23350v1(boolean z) {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo23351w0(String str) {
        "SPEAKER_DEVICE processPropJson: " + str;
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 1) {
                C4308b.m12139r("SPEAKER_DEVICE", "SPEAKER_DEVICE, Invalid length of batch rpc result: " + str);
            }
            m19356c2(WifiSpeakerService.C9665g.valueOf(jSONArray.getString(0)));
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: x0 */
    public boolean mo23354x0() {
        if (super.mo23354x0()) {
            return true;
        }
        if (this.f7251n.getOwnership() == Device.Ownership.MINE || this.f7251n.getOwnership() == Device.Ownership.OTHERS) {
            try {
                mo27560F1().getProperties(new C6422d());
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    /* renamed from: z */
    public String[] mo23357z() {
        Service service = mo27560F1().getService();
        mo27560F1();
        return new String[]{service.getProperty(WifiSpeakerService.PROPERTY_AiProvider).getInternalName()};
    }
}
