package com.yeelight.yeelib.models;

import com.miot.service.manager.timer.TimerCodec;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.xiaomi.mipush.sdk.Constants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.models.n */
public class C8322n extends C8321m {
    public C8322n() {
        this.f14322d = 6;
    }

    public C8322n(String str, int i, int i2, int i3) {
        this.f14320b = str;
        this.f14319a = i;
        this.f14322d = i2;
        this.f14323e = i3;
        this.f14324f = 2700;
    }

    /* renamed from: a0 */
    public static C8322n m19784a0(JSONObject jSONObject) {
        try {
            C8322n nVar = new C8322n(jSONObject.getString(ScanBarcodeActivity.TITLE), jSONObject.getInt("sid"), 6, jSONObject.getInt("bright"));
            if (jSONObject.has("subtype")) {
                nVar.mo35434S(jSONObject.getInt("subtype"));
            }
            if (jSONObject.has("description")) {
                nVar.mo35429N(jSONObject.getString("description"));
            }
            if (jSONObject.has("image")) {
                nVar.mo35406Y(jSONObject.getString("image"));
            }
            if (jSONObject.has("dialog")) {
                nVar.mo35432Q(TimerCodec.ENABLE.equals(jSONObject.getString("dialog")));
            }
            if (jSONObject.has("lang_id")) {
                nVar.mo35433R(true);
            }
            return nVar;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: Z */
    public String mo35345Z() {
        return "\"nightlight\"" + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f14323e;
    }

    /* renamed from: a */
    public JSONObject mo35294a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject.put("method", "set_scene");
            jSONArray.put("nightlight");
            jSONArray.put(this.f14323e);
            jSONObject.put("params", jSONArray);
        } catch (Exception unused) {
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Advanced scene to Jason, command: ");
        sb.append(jSONObject.toString());
        return jSONObject;
    }
}