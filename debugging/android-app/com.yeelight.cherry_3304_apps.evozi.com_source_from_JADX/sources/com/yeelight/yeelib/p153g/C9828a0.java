package com.yeelight.yeelib.p153g;

import com.miot.api.Constants;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p152f.C4297y;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.g.a0 */
public class C9828a0 {

    /* renamed from: a */
    private String f17788a = "";

    /* renamed from: b */
    private JSONObject f17789b = null;

    /* renamed from: c */
    private JSONObject f17790c = null;

    /* renamed from: d */
    private C9829a f17791d = null;

    /* renamed from: e */
    private String f17792e;

    /* renamed from: com.yeelight.yeelib.g.a0$a */
    public static class C9829a {

        /* renamed from: a */
        private int f17793a;

        /* renamed from: b */
        private int f17794b;

        /* renamed from: c */
        private String f17795c;

        public C9829a(int i, int i2) {
            this.f17793a = i;
            this.f17794b = i2;
        }

        /* renamed from: a */
        public JSONObject mo31739a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("scene_id", this.f17793a);
                jSONObject.put("scene_type", this.f17794b);
            } catch (Exception unused) {
            }
            return jSONObject;
        }

        /* renamed from: b */
        public String mo31740b() {
            return this.f17795c;
        }

        /* renamed from: c */
        public void mo31741c(String str) {
            this.f17795c = str;
        }
    }

    public C9828a0(String str, String str2) {
        this.f17788a = str;
        this.f17792e = str2;
    }

    /* renamed from: a */
    public static C9828a0 m23908a(JSONObject jSONObject) {
        "SceneBundleItem build: " + jSONObject.toString();
        C9828a0 a0Var = null;
        try {
            String string = jSONObject.getString("type");
            if (string.equals(Constants.EXTRA_PUSH_COMMAND)) {
                C9828a0 a0Var2 = new C9828a0(jSONObject.getString("did"), Constants.EXTRA_PUSH_COMMAND);
                try {
                    a0Var2.mo31735h(jSONObject.getJSONObject(Constants.EXTRA_PUSH_COMMAND));
                    return a0Var2;
                } catch (JSONException e) {
                    e = e;
                    a0Var = a0Var2;
                    e.printStackTrace();
                    return a0Var;
                }
            } else if (!string.equals("scene")) {
                return null;
            } else {
                C9828a0 a0Var3 = new C9828a0(jSONObject.getString("did"), "scene");
                try {
                    a0Var3.mo31735h(jSONObject.getJSONObject(Constants.EXTRA_PUSH_COMMAND));
                    JSONObject jSONObject2 = jSONObject.getJSONObject("scene");
                    int i = jSONObject2.getInt("scene_id");
                    int i2 = jSONObject2.getInt("scene_type");
                    String string2 = jSONObject2.getString("scene_name");
                    C9829a aVar = new C9829a(i, i2);
                    aVar.mo31741c(string2);
                    a0Var3.mo31736i(aVar);
                    return a0Var3;
                } catch (JSONException e2) {
                    e = e2;
                    a0Var = a0Var3;
                    e.printStackTrace();
                    return a0Var;
                }
            }
        } catch (JSONException e3) {
            e = e3;
            e.printStackTrace();
            return a0Var;
        }
    }

    /* renamed from: b */
    public static C9828a0 m23909b(C4198d dVar) {
        C9828a0 a0Var = new C9828a0(dVar.mo23372G(), Constants.EXTRA_PUSH_COMMAND);
        a0Var.mo31735h(dVar.mo23364B());
        return a0Var;
    }

    /* renamed from: c */
    public String mo31730c() {
        return this.f17792e;
    }

    /* renamed from: d */
    public JSONObject mo31731d() {
        return this.f17789b;
    }

    /* renamed from: e */
    public String mo31732e() {
        return this.f17788a;
    }

    /* renamed from: f */
    public JSONObject mo31733f() {
        return this.f17790c;
    }

    /* renamed from: g */
    public String mo31734g() {
        if (mo31730c().equals("scene")) {
            return this.f17791d.mo31740b();
        }
        try {
            if (this.f17789b.getString("method").equals("set_power")) {
                return this.f17789b.getString("params").contains("on") ? C4297y.f7456e.getString(R$string.common_text_turn_on) : C4297y.f7456e.getString(R$string.common_text_turn_off);
            }
            String string = this.f17789b.getString("params");
            "getSceneBundleInfo , scene params : " + string;
            String str = string.split(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP)[0];
            if (str.contains("color")) {
                return C4297y.f7456e.getString(R$string.common_text_colors);
            }
            if (!str.contains("cf")) {
                if (!str.contains("hsv")) {
                    return str.contains("nightlight") ? C4297y.f7456e.getString(R$string.common_text_night_light) : C4297y.f7456e.getString(R$string.common_text_sunshine);
                }
            }
            return C4297y.f7456e.getString(R$string.common_text_flow);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public void mo31735h(JSONObject jSONObject) {
        this.f17789b = jSONObject;
    }

    /* renamed from: i */
    public void mo31736i(C9829a aVar) {
        this.f17791d = aVar;
        mo31737j(aVar.mo31739a());
    }

    /* renamed from: j */
    public void mo31737j(JSONObject jSONObject) {
        this.f17790c = jSONObject;
    }

    /* renamed from: k */
    public C9840j mo31738k(String str) {
        C9840j jVar = new C9840j(this.f17788a);
        jVar.mo31777o(this.f17789b);
        jVar.mo31779q(str);
        return jVar;
    }
}
