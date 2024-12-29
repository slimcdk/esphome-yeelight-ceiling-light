package p051j4;

import android.os.Build;
import android.text.TextUtils;
import com.miot.common.device.Device;
import com.miot.common.device.parser.xml.DddTag;
import com.miot.service.connection.wifi.SmartConfigDataProvider;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.C3064h;
import com.yeelight.yeelib.managers.C3084o;
import com.yeelight.yeelib.managers.C8272e;
import com.yeelight.yeelib.managers.C8281l;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.utils.AppUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p129b4.C3988b;
import p134c4.C4007b;

/* renamed from: j4.p */
public class C9197p {

    /* renamed from: j4.p$a */
    class C9198a implements C4007b<String> {
        C9198a() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
        }

        public void onFailure(int i, String str) {
        }
    }

    /* renamed from: j4.p$b */
    class C9199b implements C4007b<String> {
        C9199b() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
        }

        public void onFailure(int i, String str) {
        }
    }

    /* renamed from: j4.p$c */
    class C9200c implements C4007b<String> {
        C9200c() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
        }

        public void onFailure(int i, String str) {
        }
    }

    /* renamed from: a */
    public static void m22168a(C3012e eVar, C4007b<String> bVar) {
        C3064h j = C3064h.m7982j();
        int a = j.mo23393m(eVar.mo23208T()).mo23418a();
        String str = AppUtils.f4993q + "gray-upgrade-confirm?dst_version=" + j.mo23391B(a) + "&from_ver=" + eVar.mo23197N().mo42511c() + "&mac=" + eVar.mo23185G() + "&app_uuid=" + AppUtils.m8281b();
        StringBuilder sb = new StringBuilder();
        sb.append("url = ");
        sb.append(str);
        C3988b.m11567c(str, String.class, bVar);
    }

    /* renamed from: b */
    public static void m22169b() {
        try {
            String str = AppUtils.f4995s + "bind";
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mid", C3051a.m7925r().mo23366v());
            JSONArray jSONArray = new JSONArray();
            for (C3010c next : YeelightDeviceManager.m7800o0().mo23253B0()) {
                if (next.mo23212W() == Device.Ownership.MINE) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("device_id", next.mo23185G());
                    jSONObject2.put(SmartConfigDataProvider.KEY_DEVICE_MODEL, next.mo23208T());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("device_list", jSONArray);
            C3988b.m11572h(str, jSONObject.toString(), String.class, new C9199b());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m22170c(C4007b<String> bVar, C3010c cVar, String str, JSONObject jSONObject) {
        try {
            String str2 = AppUtils.f4993q + "device/debug-log";
            JSONObject jSONObject2 = new JSONObject();
            String v = C3051a.m7925r().mo23366v();
            if (TextUtils.isEmpty(v)) {
                v = "0000000000";
            }
            jSONObject2.put("mid", v);
            jSONObject2.put("did", cVar.mo23185G());
            jSONObject2.put(SmartConfigDataProvider.KEY_DEVICE_MODEL, cVar.mo23208T());
            jSONObject2.put("phone_model", Build.MODEL);
            jSONObject2.put("issue_type", str);
            jSONObject2.put("server", C8281l.m19542b().mo35223a());
            jSONObject2.put("extra", jSONObject);
            StringBuilder sb = new StringBuilder();
            sb.append("sendDebugLog params = ");
            sb.append(jSONObject2.toString());
            C3988b.m11573i(str2, jSONObject2.toString(), String.class, bVar, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public static void m22171d(C4007b<String> bVar, String str, String str2, JSONObject jSONObject) {
        try {
            String str3 = AppUtils.f4993q + "device/debug-log";
            StringBuilder sb = new StringBuilder();
            sb.append("sendDebugLog url = ");
            sb.append(str3);
            JSONObject jSONObject2 = new JSONObject();
            String v = C3051a.m7925r().mo23366v();
            if (TextUtils.isEmpty(v)) {
                v = "0000000000";
            }
            jSONObject2.put("mid", v);
            if (str != null && !str.isEmpty()) {
                jSONObject2.put("did", str);
            }
            jSONObject2.put("phone_model", Build.MODEL);
            jSONObject2.put("issue_type", str2);
            jSONObject2.put("server", C8281l.m19542b().mo35223a());
            if (jSONObject != null) {
                jSONObject2.put("extra", jSONObject);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("sendDebugLog params = ");
            sb2.append(jSONObject2.toString());
            C3988b.m11573i(str3, jSONObject2.toString(), String.class, bVar, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    public static void m22172e(C4007b<String> bVar, String str, JSONObject jSONObject) {
        m22171d(bVar, "", str, jSONObject);
    }

    /* renamed from: f */
    public static void m22173f(String str, JSONObject jSONObject) {
        m22171d(new C9200c(), "", str, jSONObject);
    }

    /* renamed from: g */
    public static void m22174g(C4007b<String> bVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Exception", str);
            m22172e(bVar, "1007", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: h */
    public static void m22175h() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("finger_print", Build.FINGERPRINT);
            jSONObject.put("build_model", Build.MODEL);
            jSONObject.put(DddTag.DEVICE_MANUFACTURER, Build.MANUFACTURER);
            jSONObject.put("build_brand", Build.BRAND);
            jSONObject.put("build_device", Build.DEVICE);
            jSONObject.put("product", Build.PRODUCT);
            m22173f("1002", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: i */
    public static void m22176i(C4007b<String> bVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("device_count", YeelightDeviceManager.m7800o0().mo23321w0().size());
            JSONArray jSONArray = new JSONArray();
            for (C3012e next : YeelightDeviceManager.m7800o0().mo23321w0()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("did", next.mo23185G());
                jSONObject2.put("model", next.mo23188I());
                jSONObject2.put("connected", next.mo23145k0());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("device_list", jSONArray.toString());
            jSONObject.put("network", C8272e.m19511b().mo35204d());
            m22171d(bVar, str, "1000", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: j */
    public static void m22177j() {
        m22173f("1004", new JSONObject());
    }

    /* renamed from: k */
    public static void m22178k(C4007b<String> bVar, C3010c cVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("open_addr", C3084o.m8096k().mo23457n());
            jSONObject.put("miot_addr", C3084o.m8096k().mo23456m());
            jSONObject.put("ping", C3084o.m8096k().mo23458o());
            jSONObject.put("dns", C3084o.m8096k().mo23455l());
            jSONObject.put("ip_addr", C3084o.m8096k().mo23459p());
            jSONObject.put("recommd_server", C3084o.m8096k().mo23460q());
            m22170c(bVar, cVar, TimerCodec.ENABLE, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: l */
    public static void m22179l(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mid", C3051a.m7925r().mo23366v());
            jSONObject.put("device_id", str);
            jSONObject.put(SmartConfigDataProvider.KEY_DEVICE_MODEL, str2);
            C3988b.m11572h(AppUtils.f4995s + "bind", jSONObject.toString(), String.class, new C9198a());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: m */
    public static void m22180m(C4007b<String> bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_uuid", AppUtils.m8281b());
            jSONObject.put("mid", C3051a.m7925r().mo23366v());
            jSONObject.put("phone_model", Build.MODEL);
            jSONObject.put("phone_os", "android");
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put(Constants.EXTRA_KEY_APP_VERSION, AppUtils.m8283d());
            jSONObject.put("app_model", "common_app_android");
            jSONObject.put("server", C8281l.m19542b().mo35223a());
            StringBuilder sb = new StringBuilder();
            sb.append("value = ");
            sb.append(jSONObject.toString());
            C3988b.m11572h(AppUtils.f4995s + "app/single-log", jSONObject.toString(), String.class, bVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: n */
    public static void m22181n(Exception exc) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Exception", exc.toString());
            m22173f("1005", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: o */
    public static void m22182o(C3012e eVar, C4007b<String> bVar, String str) {
        C3064h j = C3064h.m7982j();
        int a = j.mo23393m(eVar.mo23208T()).mo23418a();
        String str2 = AppUtils.f4993q + "gray-upgrade-success?firmware_version=" + j.mo23391B(a) + "&transaction_id=" + str + "&app_uuid=" + AppUtils.m8281b();
        StringBuilder sb = new StringBuilder();
        sb.append("url = ");
        sb.append(str2);
        C3988b.m11567c(str2, String.class, bVar);
    }
}
