package com.yeelight.yeelib.p153g;

import com.miot.service.manager.timer.TimerCodec;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.xiaomi.mipush.sdk.Constants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.g.b */
public class C9830b extends C9849r {
    public C9830b() {
        this.f17902l = new C9827a();
        this.f17894d = 5;
    }

    public C9830b(String str, int i, int i2) {
        this.f17892b = str;
        this.f17891a = i;
        this.f17894d = i2;
    }

    /* renamed from: Z */
    public static C9830b m23922Z(JSONObject jSONObject) {
        String str = "";
        try {
            if (jSONObject.has(ScanBarcodeActivity.TITLE)) {
                str = jSONObject.getString(ScanBarcodeActivity.TITLE);
            }
            int i = jSONObject.getInt("mode");
            int i2 = jSONObject.getInt("sid");
            C9827a c = C9827a.m23895c(new JSONArray(jSONObject.getString("colorflow")));
            C9830b bVar = new C9830b(str, i2, i);
            bVar.mo31860I(c);
            if (jSONObject.has("subtype")) {
                bVar.mo31869R(jSONObject.getInt("subtype"));
            }
            if (jSONObject.has("description")) {
                bVar.mo31864M(jSONObject.getString("description"));
            }
            if (jSONObject.has("image")) {
                bVar.mo31819X(jSONObject.getString("image"));
            }
            if (jSONObject.has("dialog")) {
                bVar.mo31867P(TimerCodec.ENABLE.equals(jSONObject.getString("dialog")));
            }
            if (jSONObject.has("lang_id")) {
                bVar.mo31868Q(true);
            }
            return bVar;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: Y */
    public String mo31742Y() {
        StringBuilder sb = new StringBuilder();
        sb.append("\"cf\"");
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb.append(this.f17902l.mo31724i());
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb.append(this.f17902l.mo31721f().ordinal());
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        if (this.f17902l != null) {
            sb.append("\"");
            for (int i = 0; i < this.f17902l.mo31723h().size(); i++) {
                if (i != 0) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb.append(this.f17902l.mo31723h().get(i).mo31788c());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(this.f17902l.mo31723h().get(i).mo31789d().ordinal());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(this.f17902l.mo31723h().get(i).mo31790e());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(this.f17902l.mo31723h().get(i).mo31787b());
            }
            sb.append("\"");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public JSONObject mo31743a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject.put("method", "set_scene");
            jSONArray.put("cf");
            jSONArray.put(this.f17902l.mo31724i());
            jSONArray.put(this.f17902l.mo31721f().ordinal());
            StringBuilder sb = new StringBuilder();
            if (this.f17902l != null) {
                for (int i = 0; i < this.f17902l.mo31723h().size(); i++) {
                    if (i != 0) {
                        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                    sb.append(this.f17902l.mo31723h().get(i).mo31788c());
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    sb.append(this.f17902l.mo31723h().get(i).mo31789d().ordinal());
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    sb.append(this.f17902l.mo31723h().get(i).mo31790e());
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    sb.append(this.f17902l.mo31723h().get(i).mo31787b());
                }
                jSONArray.put(sb.toString());
            }
            jSONObject.put("params", jSONArray);
        } catch (Exception unused) {
        }
        "Advanced scene to Jason, command: " + jSONObject.toString();
        return jSONObject;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ScanBarcodeActivity.TITLE, this.f17892b);
            jSONObject.put("mode", this.f17894d);
            jSONObject.put("sid", this.f17891a);
            jSONObject.put("bright", this.f17895e);
            jSONObject.put("ct", this.f17896f);
            jSONObject.put("color", this.f17897g);
            jSONObject.put("colorflow", this.f17902l.mo31729n());
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }
}
