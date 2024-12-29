package com.yeelight.yeelib.models;

import com.miot.api.Constants;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.managers.C3108x;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.models.u */
public class C8330u {

    /* renamed from: a */
    private String f14343a = "";

    /* renamed from: b */
    private JSONObject f14344b = null;

    /* renamed from: c */
    private JSONObject f14345c = null;

    /* renamed from: d */
    private C8331a f14346d = null;

    /* renamed from: e */
    private String f14347e;

    /* renamed from: com.yeelight.yeelib.models.u$a */
    public static class C8331a {

        /* renamed from: a */
        private int f14348a;

        /* renamed from: b */
        private int f14349b;

        /* renamed from: c */
        private String f14350c;

        public C8331a(int i, int i2) {
            this.f14348a = i;
            this.f14349b = i2;
        }

        /* renamed from: a */
        public JSONObject mo35489a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("scene_id", this.f14348a);
                jSONObject.put("scene_type", this.f14349b);
            } catch (Exception unused) {
            }
            return jSONObject;
        }

        /* renamed from: b */
        public String mo35490b() {
            return this.f14350c;
        }

        /* renamed from: c */
        public void mo35491c(String str) {
            this.f14350c = str;
        }
    }

    public C8330u(String str, String str2) {
        this.f14343a = str;
        this.f14347e = str2;
    }

    /* renamed from: a */
    public static C8330u m19873a(JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder();
        sb.append("SceneBundleItem build: ");
        sb.append(jSONObject.toString());
        C8330u uVar = null;
        try {
            String string = jSONObject.getString("type");
            if (string.equals(Constants.EXTRA_PUSH_COMMAND)) {
                C8330u uVar2 = new C8330u(jSONObject.getString("did"), Constants.EXTRA_PUSH_COMMAND);
                try {
                    uVar2.mo35485h(jSONObject.getJSONObject(Constants.EXTRA_PUSH_COMMAND));
                    return uVar2;
                } catch (JSONException e) {
                    e = e;
                    uVar = uVar2;
                    e.printStackTrace();
                    return uVar;
                }
            } else if (!string.equals("scene")) {
                return null;
            } else {
                C8330u uVar3 = new C8330u(jSONObject.getString("did"), "scene");
                try {
                    uVar3.mo35485h(jSONObject.getJSONObject(Constants.EXTRA_PUSH_COMMAND));
                    JSONObject jSONObject2 = jSONObject.getJSONObject("scene");
                    int i = jSONObject2.getInt("scene_id");
                    int i2 = jSONObject2.getInt("scene_type");
                    String string2 = jSONObject2.getString("scene_name");
                    C8331a aVar = new C8331a(i, i2);
                    aVar.mo35491c(string2);
                    uVar3.mo35486i(aVar);
                    return uVar3;
                } catch (JSONException e2) {
                    e = e2;
                    uVar = uVar3;
                    e.printStackTrace();
                    return uVar;
                }
            }
        } catch (JSONException e3) {
            e = e3;
            e.printStackTrace();
            return uVar;
        }
    }

    /* renamed from: b */
    public static C8330u m19874b(C3010c cVar) {
        C8330u uVar = new C8330u(cVar.mo23185G(), Constants.EXTRA_PUSH_COMMAND);
        uVar.mo35485h(cVar.mo23177B());
        return uVar;
    }

    /* renamed from: c */
    public String mo35480c() {
        return this.f14347e;
    }

    /* renamed from: d */
    public JSONObject mo35481d() {
        return this.f14344b;
    }

    /* renamed from: e */
    public String mo35482e() {
        return this.f14343a;
    }

    /* renamed from: f */
    public JSONObject mo35483f() {
        return this.f14345c;
    }

    /* renamed from: g */
    public String mo35484g() {
        if (mo35480c().equals("scene")) {
            return this.f14346d.mo35490b();
        }
        try {
            if (this.f14344b.getString("method").equals("set_power")) {
                return this.f14344b.getString("params").contains("on") ? C3108x.f4951e.getString(R$string.common_text_turn_on) : C3108x.f4951e.getString(R$string.common_text_turn_off);
            }
            String string = this.f14344b.getString("params");
            StringBuilder sb = new StringBuilder();
            sb.append("getSceneBundleInfo , scene params : ");
            sb.append(string);
            String str = string.split(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP)[0];
            if (str.contains("color")) {
                return C3108x.f4951e.getString(R$string.common_text_colors);
            }
            if (!str.contains("cf")) {
                if (!str.contains("hsv")) {
                    return str.contains("nightlight") ? C3108x.f4951e.getString(R$string.common_text_night_light) : C3108x.f4951e.getString(R$string.common_text_sunshine);
                }
            }
            return C3108x.f4951e.getString(R$string.common_text_flow);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public void mo35485h(JSONObject jSONObject) {
        this.f14344b = jSONObject;
    }

    /* renamed from: i */
    public void mo35486i(C8331a aVar) {
        this.f14346d = aVar;
        mo35487j(aVar.mo35489a());
    }

    /* renamed from: j */
    public void mo35487j(JSONObject jSONObject) {
        this.f14345c = jSONObject;
    }

    /* renamed from: k */
    public C8316i mo35488k(String str) {
        C8316i iVar = new C8316i(this.f14343a);
        iVar.mo35364o(this.f14344b);
        iVar.mo35366q(str);
        return iVar;
    }
}
