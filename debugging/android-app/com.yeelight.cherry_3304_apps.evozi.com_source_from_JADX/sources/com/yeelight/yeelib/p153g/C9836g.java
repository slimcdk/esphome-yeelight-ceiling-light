package com.yeelight.yeelib.p153g;

import com.miot.service.manager.timer.TimerCodec;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.xiaomi.mipush.sdk.Constants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.g.g */
public class C9836g extends C9849r {
    public C9836g() {
        this.f17894d = 3;
    }

    public C9836g(String str, int i, int i2, int i3, int i4) {
        this.f17892b = str;
        this.f17891a = i;
        this.f17894d = i2;
        this.f17895e = i3;
        this.f17896f = i4;
    }

    /* renamed from: Z */
    public static C9836g m23951Z(JSONObject jSONObject) {
        try {
            C9836g gVar = new C9836g(jSONObject.getString(ScanBarcodeActivity.TITLE), jSONObject.getInt("sid"), 3, jSONObject.getInt("bright"), jSONObject.getInt("color_temperature"));
            if (jSONObject.has("subtype")) {
                gVar.mo31869R(jSONObject.getInt("subtype"));
            }
            if (jSONObject.has("description")) {
                gVar.mo31864M(jSONObject.getString("description"));
            }
            if (jSONObject.has("image")) {
                gVar.mo31819X(jSONObject.getString("image"));
            }
            if (jSONObject.has("dialog")) {
                gVar.mo31867P(TimerCodec.ENABLE.equals(jSONObject.getString("dialog")));
            }
            if (jSONObject.has("lang_id")) {
                gVar.mo31868Q(true);
            }
            return gVar;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: Y */
    public String mo31742Y() {
        return "\"ct\"" + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f17896f + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f17895e;
    }

    /* renamed from: a */
    public JSONObject mo31743a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject.put("method", "set_scene");
            jSONArray.put("ct");
            jSONArray.put(this.f17896f);
            jSONArray.put(this.f17895e);
            jSONObject.put("params", jSONArray);
        } catch (Exception unused) {
        }
        "Advanced scene to Jason, command: " + jSONObject.toString();
        return jSONObject;
    }
}
