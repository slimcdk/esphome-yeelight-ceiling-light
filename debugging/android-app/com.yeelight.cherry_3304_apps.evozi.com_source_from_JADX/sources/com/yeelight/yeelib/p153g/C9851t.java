package com.yeelight.yeelib.p153g;

import com.miot.service.manager.timer.TimerCodec;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.xiaomi.mipush.sdk.Constants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.g.t */
public class C9851t extends C9849r {
    public C9851t() {
        this.f17894d = 6;
    }

    public C9851t(String str, int i, int i2, int i3) {
        this.f17892b = str;
        this.f17891a = i;
        this.f17894d = i2;
        this.f17895e = i3;
        this.f17896f = 2700;
    }

    /* renamed from: Z */
    public static C9851t m24030Z(JSONObject jSONObject) {
        try {
            C9851t tVar = new C9851t(jSONObject.getString(ScanBarcodeActivity.TITLE), jSONObject.getInt("sid"), 6, jSONObject.getInt("bright"));
            if (jSONObject.has("subtype")) {
                tVar.mo31869R(jSONObject.getInt("subtype"));
            }
            if (jSONObject.has("description")) {
                tVar.mo31864M(jSONObject.getString("description"));
            }
            if (jSONObject.has("image")) {
                tVar.mo31819X(jSONObject.getString("image"));
            }
            if (jSONObject.has("dialog")) {
                tVar.mo31867P(TimerCodec.ENABLE.equals(jSONObject.getString("dialog")));
            }
            if (jSONObject.has("lang_id")) {
                tVar.mo31868Q(true);
            }
            return tVar;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: Y */
    public String mo31742Y() {
        return "\"nightlight\"" + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f17895e;
    }

    /* renamed from: a */
    public JSONObject mo31743a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject.put("method", "set_scene");
            jSONArray.put("nightlight");
            jSONArray.put(this.f17895e);
            jSONObject.put("params", jSONArray);
        } catch (Exception unused) {
        }
        "Advanced scene to Jason, command: " + jSONObject.toString();
        return jSONObject;
    }
}
