package com.yeelight.yeelib.utils;

import android.os.Build;
import android.text.TextUtils;
import com.miot.common.device.Device;
import com.miot.common.device.parser.xml.DddTag;
import com.miot.service.connection.wifi.SmartConfigDataProvider;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p152f.C4214g;
import com.yeelight.yeelib.p152f.C4230l;
import com.yeelight.yeelib.p152f.C4235o;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C9784e;
import com.yeelight.yeelib.p187h.C9862d;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.utils.r */
public class C10551r {

    /* renamed from: com.yeelight.yeelib.utils.r$a */
    static class C10552a implements C9874b<String> {
        C10552a() {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
        }

        public void onFailure(int i, String str) {
        }
    }

    /* renamed from: com.yeelight.yeelib.utils.r$b */
    static class C10553b implements C9874b<String> {
        C10553b() {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
        }

        public void onFailure(int i, String str) {
        }
    }

    /* renamed from: com.yeelight.yeelib.utils.r$c */
    static class C10554c implements C9874b<String> {
        C10554c() {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
        }

        public void onFailure(int i, String str) {
        }
    }

    /* renamed from: a */
    public static void m25769a(C4200i iVar, C9874b<String> bVar) {
        C4214g j = C4214g.m11665j();
        int a = j.mo23494m(iVar.mo23395T()).mo23519a();
        String str = C4308b.f7492k + "gray-upgrade-confirm?dst_version=" + j.mo23492B(a) + "&from_ver=" + iVar.mo23384N().mo29040c() + "&mac=" + iVar.mo23372G() + "&app_uuid=" + C4308b.m12123b();
        "url = " + str;
        C9862d.m24133c(str, String.class, bVar);
    }

    /* renamed from: b */
    public static void m25770b() {
        try {
            String str = C4308b.f7494m + "bind";
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mid", C4201a.m11607r().mo23452v());
            JSONArray jSONArray = new JSONArray();
            for (C4198d next : C4257w.m11947l0().mo23697y0()) {
                if (next.mo23399W() == Device.Ownership.MINE) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("device_id", next.mo23372G());
                    jSONObject2.put(SmartConfigDataProvider.KEY_DEVICE_MODEL, next.mo23395T());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("device_list", jSONArray);
            C9862d.m24138h(str, jSONObject.toString(), String.class, new C10553b());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m25771c(C9874b<String> bVar, C4198d dVar, String str, JSONObject jSONObject) {
        try {
            String str2 = C4308b.f7492k + "device/debug-log";
            JSONObject jSONObject2 = new JSONObject();
            String v = C4201a.m11607r().mo23452v();
            if (TextUtils.isEmpty(v)) {
                v = "0000000000";
            }
            jSONObject2.put("mid", v);
            jSONObject2.put("did", dVar.mo23372G());
            jSONObject2.put(SmartConfigDataProvider.KEY_DEVICE_MODEL, dVar.mo23395T());
            jSONObject2.put("phone_model", Build.MODEL);
            jSONObject2.put("issue_type", str);
            jSONObject2.put("server", C4230l.m11766b().mo23552a());
            jSONObject2.put("extra", jSONObject);
            "sendDebugLog params = " + jSONObject2.toString();
            C9862d.m24139i(str2, jSONObject2.toString(), String.class, bVar, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public static void m25772d(C9874b<String> bVar, String str, String str2, JSONObject jSONObject) {
        try {
            String str3 = C4308b.f7492k + "device/debug-log";
            "sendDebugLog url = " + str3;
            JSONObject jSONObject2 = new JSONObject();
            String v = C4201a.m11607r().mo23452v();
            if (TextUtils.isEmpty(v)) {
                v = "0000000000";
            }
            jSONObject2.put("mid", v);
            if (str != null && !str.isEmpty()) {
                jSONObject2.put("did", str);
            }
            jSONObject2.put("phone_model", Build.MODEL);
            jSONObject2.put("issue_type", str2);
            jSONObject2.put("server", C4230l.m11766b().mo23552a());
            if (jSONObject != null) {
                jSONObject2.put("extra", jSONObject);
            }
            "sendDebugLog params = " + jSONObject2.toString();
            C9862d.m24139i(str3, jSONObject2.toString(), String.class, bVar, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    public static void m25773e(C9874b<String> bVar, String str, JSONObject jSONObject) {
        m25772d(bVar, "", str, jSONObject);
    }

    /* renamed from: f */
    public static void m25774f(String str, JSONObject jSONObject) {
        m25772d(new C10554c(), "", str, jSONObject);
    }

    /* renamed from: g */
    public static void m25775g(C9874b<String> bVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Exception", str);
            m25773e(bVar, "1007", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: h */
    public static void m25776h() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("finger_print", Build.FINGERPRINT);
            jSONObject.put("build_model", Build.MODEL);
            jSONObject.put(DddTag.DEVICE_MANUFACTURER, Build.MANUFACTURER);
            jSONObject.put("build_brand", Build.BRAND);
            jSONObject.put("build_device", Build.DEVICE);
            jSONObject.put("product", Build.PRODUCT);
            m25774f("1002", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: i */
    public static void m25777i(C9874b<String> bVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("device_count", C4257w.m11947l0().mo23688t0().size());
            JSONArray jSONArray = new JSONArray();
            for (C4200i next : C4257w.m11947l0().mo23688t0()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("did", next.mo23372G());
                jSONObject2.put("model", next.mo23375I());
                jSONObject2.put("connected", next.mo23331k0());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("device_list", jSONArray.toString());
            jSONObject.put("network", C9784e.m23711b().mo31628d());
            m25772d(bVar, str, "1000", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: j */
    public static void m25778j() {
        m25774f("1004", new JSONObject());
    }

    /* renamed from: k */
    public static void m25779k(C9874b<String> bVar, C4198d dVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("open_addr", C4235o.m11786k().mo23564n());
            jSONObject.put("miot_addr", C4235o.m11786k().mo23563m());
            jSONObject.put("ping", C4235o.m11786k().mo23565o());
            jSONObject.put("dns", C4235o.m11786k().mo23562l());
            jSONObject.put("ip_addr", C4235o.m11786k().mo23566p());
            jSONObject.put("recommd_server", C4235o.m11786k().mo23567q());
            m25771c(bVar, dVar, TimerCodec.ENABLE, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: l */
    public static void m25780l(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mid", C4201a.m11607r().mo23452v());
            jSONObject.put("device_id", str);
            jSONObject.put(SmartConfigDataProvider.KEY_DEVICE_MODEL, str2);
            C9862d.m24138h(C4308b.f7494m + "bind", jSONObject.toString(), String.class, new C10552a());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: m */
    public static void m25781m(C9874b<String> bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_uuid", C4308b.m12123b());
            jSONObject.put("mid", C4201a.m11607r().mo23452v());
            jSONObject.put("phone_model", Build.MODEL);
            jSONObject.put("phone_os", "android");
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put(Constants.EXTRA_KEY_APP_VERSION, C4308b.m12125d());
            jSONObject.put("app_model", "common_app_android");
            jSONObject.put("server", C4230l.m11766b().mo23552a());
            "value = " + jSONObject.toString();
            C9862d.m24138h(C4308b.f7494m + "app/single-log", jSONObject.toString(), String.class, bVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: n */
    public static void m25782n(Exception exc) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Exception", exc.toString());
            m25774f("1005", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: o */
    public static void m25783o(C4200i iVar, C9874b<String> bVar, String str) {
        C4214g j = C4214g.m11665j();
        int a = j.mo23494m(iVar.mo23395T()).mo23519a();
        String str2 = C4308b.f7492k + "gray-upgrade-success?firmware_version=" + j.mo23492B(a) + "&transaction_id=" + str + "&app_uuid=" + C4308b.m12123b();
        "url = " + str2;
        C9862d.m24133c(str2, String.class, bVar);
    }
}
