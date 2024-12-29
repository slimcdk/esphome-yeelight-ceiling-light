package com.yeelight.yeelib.models;

import com.miot.service.manager.timer.TimerCodec;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.xiaomi.mipush.sdk.Constants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.models.o */
public class C8323o extends C8321m {
    public C8323o(String str, int i, int i2, int i3, int i4) {
        this.f14320b = str;
        this.f14319a = i;
        this.f14322d = i2;
        this.f14323e = i3;
        this.f14324f = i4;
    }

    /* renamed from: a0 */
    public static C8323o m19787a0(JSONObject jSONObject) {
        try {
            C8323o oVar = new C8323o(jSONObject.getString(ScanBarcodeActivity.TITLE), jSONObject.getInt("sid"), 10, jSONObject.getInt("bright"), jSONObject.getInt("color_temperature"));
            if (jSONObject.has("subtype")) {
                oVar.mo35434S(jSONObject.getInt("subtype"));
            }
            if (jSONObject.has("description")) {
                oVar.mo35429N(jSONObject.getString("description"));
            }
            if (jSONObject.has("image")) {
                oVar.mo35406Y(jSONObject.getString("image"));
            }
            if (jSONObject.has("dialog")) {
                oVar.mo35432Q(TimerCodec.ENABLE.equals(jSONObject.getString("dialog")));
            }
            if (jSONObject.has("lang_id")) {
                oVar.mo35433R(true);
            }
            return oVar;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: Z */
    public String mo35345Z() {
        return "\"nl_ct\"" + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f14324f + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f14323e;
    }

    /* renamed from: a */
    public JSONObject mo35294a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject.put("method", "set_scene");
            jSONArray.put("nl_ct");
            jSONArray.put(this.f14324f);
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
