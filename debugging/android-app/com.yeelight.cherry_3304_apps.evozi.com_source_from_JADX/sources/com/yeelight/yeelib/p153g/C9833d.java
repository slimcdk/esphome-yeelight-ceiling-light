package com.yeelight.yeelib.p153g;

import com.miot.service.manager.timer.TimerCodec;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.xiaomi.mipush.sdk.Constants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.g.d */
public class C9833d extends C9849r {
    public C9833d() {
        this.f17894d = 1;
    }

    public C9833d(String str, int i, int i2, int i3) {
        this.f17892b = str;
        this.f17891a = i;
        this.f17894d = i2;
        this.f17895e = i3;
        this.f17896f = 4000;
    }

    /* renamed from: Z */
    public static C9833d m23941Z(JSONObject jSONObject) {
        try {
            C9833d dVar = new C9833d(jSONObject.getString(ScanBarcodeActivity.TITLE), jSONObject.getInt("sid"), 1, jSONObject.getInt("bright"));
            if (jSONObject.has("subtype")) {
                dVar.mo31869R(jSONObject.getInt("subtype"));
            }
            if (jSONObject.has("description")) {
                dVar.mo31864M(jSONObject.getString("description"));
            }
            if (jSONObject.has("image")) {
                dVar.mo31819X(jSONObject.getString("image"));
            }
            if (jSONObject.has("dialog")) {
                dVar.mo31867P(TimerCodec.ENABLE.equals(jSONObject.getString("dialog")));
            }
            if (jSONObject.has("lang_id")) {
                dVar.mo31868Q(true);
            }
            return dVar;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: Y */
    public String mo31742Y() {
        return "\"bright\"" + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f17895e + ",500";
    }

    /* renamed from: a */
    public JSONObject mo31743a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject.put("method", "set_scene");
            jSONArray.put("bright");
            jSONArray.put(this.f17895e);
            jSONArray.put(500);
            jSONObject.put("params", jSONArray);
        } catch (Exception unused) {
        }
        "Advanced scene to Jason, command: " + jSONObject.toString();
        return jSONObject;
    }
}
