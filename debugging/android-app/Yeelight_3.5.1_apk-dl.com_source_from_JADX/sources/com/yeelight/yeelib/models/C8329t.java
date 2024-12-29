package com.yeelight.yeelib.models;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.miot.api.Constants;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.C3096u;
import com.yeelight.yeelib.managers.LocalActionExecutor;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.models.t */
public class C8329t {

    /* renamed from: a */
    private List<C8330u> f14336a = new ArrayList();

    /* renamed from: b */
    private String f14337b = "";

    /* renamed from: c */
    private String f14338c = "";

    /* renamed from: d */
    private String f14339d = "";

    /* renamed from: e */
    private int f14340e = 0;

    /* renamed from: f */
    private String f14341f = "";

    /* renamed from: g */
    private String f14342g = "";

    public C8329t(String str, String str2, int i, String str3, String str4, String str5) {
        this.f14337b = str;
        this.f14338c = str2;
        this.f14339d = str3;
        this.f14340e = i;
        this.f14341f = str4;
        this.f14342g = str5;
    }

    /* renamed from: c */
    public static C8329t m19853c(List<C8330u> list, String str) {
        C8329t o = C3096u.m8175n().mo23512o(str);
        o.mo35466g();
        for (C8330u a : list) {
            o.mo35464a(a);
        }
        return o;
    }

    /* renamed from: d */
    public static C8329t m19854d(List<C8330u> list, String str, int i, String str2) {
        return m19855e(list, str, i, str2, TimerCodec.ENABLE, "");
    }

    /* renamed from: e */
    public static C8329t m19855e(List<C8330u> list, String str, int i, String str2, String str3, String str4) {
        C8329t tVar = new C8329t("", str, i, str2, str3, str4);
        for (C8330u a : list) {
            tVar.mo35464a(a);
        }
        return tVar;
    }

    /* renamed from: f */
    public static C8329t m19856f(JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder();
        sb.append("build scene bundle with json object: ");
        sb.append(jSONObject.toString());
        C8329t tVar = null;
        try {
            C8329t tVar2 = new C8329t(String.valueOf(jSONObject.getInt("id")), jSONObject.getString("name"), jSONObject.has("type") ? jSONObject.getInt("type") : 0, jSONObject.getString("desc"), jSONObject.getString(TypedValues.TransitionType.S_FROM), jSONObject.getString("template_id"));
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("bundle");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("bundle json array length: ");
                sb2.append(jSONArray.length());
                for (int i = 0; i < jSONArray.length(); i++) {
                    tVar2.mo35464a(C8330u.m19873a(jSONArray.getJSONObject(i)));
                }
                return tVar2;
            } catch (JSONException unused) {
                tVar = tVar2;
                return tVar;
            }
        } catch (JSONException unused2) {
            return tVar;
        }
    }

    /* renamed from: a */
    public void mo35464a(C8330u uVar) {
        this.f14336a.add(uVar);
    }

    /* renamed from: b */
    public void mo35465b() {
        StringBuilder sb = new StringBuilder();
        sb.append("Try to apply scene bundle, item size: ");
        sb.append(this.f14336a.size());
        for (C8330u k : this.f14336a) {
            LocalActionExecutor.m19455e().mo35165c(k.mo35488k(mo35471l()));
        }
    }

    /* renamed from: g */
    public void mo35466g() {
        this.f14336a.clear();
    }

    /* renamed from: h */
    public boolean mo35467h(String str) {
        for (C8330u e : this.f14336a) {
            if (e.mo35482e().equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public C8330u mo35468i(String str) {
        for (C8330u next : this.f14336a) {
            if (next.mo35482e().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: j */
    public String mo35469j() {
        return this.f14339d;
    }

    /* renamed from: k */
    public String mo35470k() {
        return this.f14341f;
    }

    /* renamed from: l */
    public String mo35471l() {
        return this.f14337b;
    }

    /* renamed from: m */
    public String mo35472m() {
        return this.f14338c;
    }

    /* renamed from: n */
    public List<C8330u> mo35473n() {
        return this.f14336a;
    }

    /* renamed from: o */
    public String mo35474o() {
        return this.f14342g;
    }

    /* renamed from: p */
    public int mo35475p() {
        return this.f14340e;
    }

    /* renamed from: q */
    public void mo35476q(String str) {
        this.f14338c = str;
    }

    /* renamed from: r */
    public void mo35477r(List<C8330u> list) {
        this.f14336a = list;
    }

    /* renamed from: s */
    public void mo35478s(int i) {
        this.f14340e = i;
    }

    /* renamed from: t */
    public JSONObject mo35479t() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject.put("id", mo35471l());
            jSONObject.put("uid", C3051a.m7925r().mo23366v());
            jSONObject.put("name", mo35472m());
            jSONObject.put("type", mo35475p());
            jSONObject.put("desc", mo35469j());
            jSONObject.put(TypedValues.TransitionType.S_FROM, mo35470k());
            jSONObject.put("template_id", mo35474o());
            for (C8330u next : this.f14336a) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("did", next.mo35482e());
                if (next.mo35480c().equals(Constants.EXTRA_PUSH_COMMAND)) {
                    jSONObject2.put("type", Constants.EXTRA_PUSH_COMMAND);
                    jSONObject2.put(Constants.EXTRA_PUSH_COMMAND, next.mo35481d());
                } else {
                    jSONObject2.put("type", "scene");
                    jSONObject2.put("scene", next.mo35483f());
                }
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("bundle", jSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Scene bundle to json object: ");
        sb.append(jSONObject.toString());
        return jSONObject;
    }
}
