package com.yeelight.yeelib.p153g;

import com.miot.service.manager.timer.TimerCodec;
import com.miot.service.qrcode.ScanBarcodeActivity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.g.u */
public class C9852u extends C9849r {
    public C9852u() {
        this.f17894d = 0;
    }

    public C9852u(String str, int i, int i2) {
        this.f17892b = str;
        this.f17891a = i;
        this.f17894d = i2;
    }

    /* renamed from: Z */
    public static C9852u m24033Z(JSONObject jSONObject) {
        try {
            C9852u uVar = new C9852u(jSONObject.getString(ScanBarcodeActivity.TITLE), jSONObject.getInt("sid"), 0);
            if (jSONObject.has("subtype")) {
                uVar.mo31869R(jSONObject.getInt("subtype"));
            }
            if (jSONObject.has("description")) {
                uVar.mo31864M(jSONObject.getString("description"));
            }
            if (jSONObject.has("image")) {
                uVar.mo31819X(jSONObject.getString("image"));
            }
            if (jSONObject.has("dialog")) {
                uVar.mo31867P(TimerCodec.ENABLE.equals(jSONObject.getString("dialog")));
            }
            if (jSONObject.has("lang_id")) {
                uVar.mo31868Q(true);
            }
            return uVar;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: Y */
    public String mo31742Y() {
        return new StringBuilder("\"off\"").toString();
    }

    /* renamed from: a */
    public JSONObject mo31743a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject.put("method", "set_scene");
            jSONArray.put("off");
            jSONArray.put(0);
            jSONArray.put(0);
            jSONObject.put("params", jSONArray);
        } catch (Exception unused) {
        }
        "Advanced scene to Jason, command: " + jSONObject.toString();
        return jSONObject;
    }
}
