package com.yeelight.yeelib.p153g;

import androidx.core.view.ViewCompat;
import com.miot.service.manager.timer.TimerCodec;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.xiaomi.mipush.sdk.Constants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.g.f */
public class C9835f extends C9849r {
    public C9835f() {
        this.f17894d = 2;
    }

    public C9835f(String str, int i, int i2, int i3, int i4) {
        this.f17892b = str;
        this.f17891a = i;
        this.f17894d = i2;
        this.f17895e = i3;
        this.f17897g = i4;
    }

    /* renamed from: Z */
    public static C9835f m23948Z(JSONObject jSONObject) {
        try {
            C9835f fVar = new C9835f(jSONObject.getString(ScanBarcodeActivity.TITLE), jSONObject.getInt("sid"), 2, jSONObject.getInt("bright"), jSONObject.getInt("wrgb"));
            if (jSONObject.has("subtype")) {
                fVar.mo31869R(jSONObject.getInt("subtype"));
            }
            if (jSONObject.has("description")) {
                fVar.mo31864M(jSONObject.getString("description"));
            }
            if (jSONObject.has("image")) {
                fVar.mo31819X(jSONObject.getString("image"));
            }
            if (jSONObject.has("dialog")) {
                fVar.mo31867P(TimerCodec.ENABLE.equals(jSONObject.getString("dialog")));
            }
            if (jSONObject.has("lang_id")) {
                fVar.mo31868Q(true);
            }
            return fVar;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: Y */
    public String mo31742Y() {
        return "\"color\"" + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f17897g + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f17895e;
    }

    /* renamed from: a */
    public JSONObject mo31743a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject.put("method", "set_scene");
            jSONArray.put("color");
            jSONArray.put(this.f17897g & ViewCompat.MEASURED_SIZE_MASK);
            jSONArray.put(this.f17895e);
            jSONObject.put("params", jSONArray);
        } catch (Exception unused) {
        }
        "Advanced scene to Jason, command: " + jSONObject.toString();
        return jSONObject;
    }
}
