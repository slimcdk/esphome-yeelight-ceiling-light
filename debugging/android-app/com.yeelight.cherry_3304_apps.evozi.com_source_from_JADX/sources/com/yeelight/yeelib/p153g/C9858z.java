package com.yeelight.yeelib.p153g;

import com.miot.api.Constants;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p152f.C4247u;
import com.yeelight.yeelib.p152f.C9794k;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.g.z */
public class C9858z {

    /* renamed from: a */
    private List<C9828a0> f17908a = new ArrayList();

    /* renamed from: b */
    private String f17909b = "";

    /* renamed from: c */
    private String f17910c = "";

    /* renamed from: d */
    private String f17911d = "";

    /* renamed from: e */
    private int f17912e = 0;

    /* renamed from: f */
    private String f17913f = "";

    /* renamed from: g */
    private String f17914g = "";

    public C9858z(String str, String str2, int i, String str3, String str4, String str5) {
        this.f17909b = str;
        this.f17910c = str2;
        this.f17911d = str3;
        this.f17912e = i;
        this.f17913f = str4;
        this.f17914g = str5;
    }

    /* renamed from: c */
    public static C9858z m24107c(List<C9828a0> list, String str) {
        C9858z o = C4247u.m11865n().mo23619o(str);
        o.mo31901g();
        for (C9828a0 a : list) {
            o.mo31899a(a);
        }
        return o;
    }

    /* renamed from: d */
    public static C9858z m24108d(List<C9828a0> list, String str, int i, String str2) {
        return m24109e(list, str, i, str2, TimerCodec.ENABLE, "");
    }

    /* renamed from: e */
    public static C9858z m24109e(List<C9828a0> list, String str, int i, String str2, String str3, String str4) {
        C9858z zVar = new C9858z("", str, i, str2, str3, str4);
        for (C9828a0 a : list) {
            zVar.mo31899a(a);
        }
        return zVar;
    }

    /* renamed from: f */
    public static C9858z m24110f(JSONObject jSONObject) {
        "build scene bundle with json object: " + jSONObject.toString();
        C9858z zVar = null;
        try {
            C9858z zVar2 = new C9858z(String.valueOf(jSONObject.getInt("id")), jSONObject.getString("name"), jSONObject.has("type") ? jSONObject.getInt("type") : 0, jSONObject.getString("desc"), jSONObject.getString("from"), jSONObject.getString("template_id"));
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("bundle");
                "bundle json array length: " + jSONArray.length();
                for (int i = 0; i < jSONArray.length(); i++) {
                    zVar2.mo31899a(C9828a0.m23908a(jSONArray.getJSONObject(i)));
                }
                return zVar2;
            } catch (JSONException unused) {
                zVar = zVar2;
                return zVar;
            }
        } catch (JSONException unused2) {
            return zVar;
        }
    }

    /* renamed from: a */
    public void mo31899a(C9828a0 a0Var) {
        this.f17908a.add(a0Var);
    }

    /* renamed from: b */
    public void mo31900b() {
        "Try to apply scene bundle, item size: " + this.f17908a.size();
        for (C9828a0 k : this.f17908a) {
            C9794k.m23749e().mo31650c(k.mo31738k(mo31906l()));
        }
    }

    /* renamed from: g */
    public void mo31901g() {
        this.f17908a.clear();
    }

    /* renamed from: h */
    public boolean mo31902h(String str) {
        for (C9828a0 e : this.f17908a) {
            if (e.mo31732e().equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public C9828a0 mo31903i(String str) {
        for (C9828a0 next : this.f17908a) {
            if (next.mo31732e().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: j */
    public String mo31904j() {
        return this.f17911d;
    }

    /* renamed from: k */
    public String mo31905k() {
        return this.f17913f;
    }

    /* renamed from: l */
    public String mo31906l() {
        return this.f17909b;
    }

    /* renamed from: m */
    public String mo31907m() {
        return this.f17910c;
    }

    /* renamed from: n */
    public List<C9828a0> mo31908n() {
        return this.f17908a;
    }

    /* renamed from: o */
    public String mo31909o() {
        return this.f17914g;
    }

    /* renamed from: p */
    public int mo31910p() {
        return this.f17912e;
    }

    /* renamed from: q */
    public void mo31911q(String str) {
        this.f17910c = str;
    }

    /* renamed from: r */
    public void mo31912r(List<C9828a0> list) {
        this.f17908a = list;
    }

    /* renamed from: s */
    public void mo31913s(int i) {
        this.f17912e = i;
    }

    /* renamed from: t */
    public JSONObject mo31914t() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject.put("id", mo31906l());
            jSONObject.put("uid", C4201a.m11607r().mo23452v());
            jSONObject.put("name", mo31907m());
            jSONObject.put("type", mo31910p());
            jSONObject.put("desc", mo31904j());
            jSONObject.put("from", mo31905k());
            jSONObject.put("template_id", mo31909o());
            for (C9828a0 next : this.f17908a) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("did", next.mo31732e());
                if (next.mo31730c().equals(Constants.EXTRA_PUSH_COMMAND)) {
                    jSONObject2.put("type", Constants.EXTRA_PUSH_COMMAND);
                    jSONObject2.put(Constants.EXTRA_PUSH_COMMAND, next.mo31731d());
                } else {
                    jSONObject2.put("type", "scene");
                    jSONObject2.put("scene", next.mo31733f());
                }
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("bundle", jSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        "Scene bundle to json object: " + jSONObject.toString();
        return jSONObject;
    }
}
