package com.yeelight.yeelib.models;

import com.miot.service.manager.timer.TimerCodec;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.xiaomi.mipush.sdk.Constants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.models.d */
public class C8311d extends C8321m {
    public C8311d() {
        this.f14322d = 1;
    }

    public C8311d(String str, int i, int i2, int i3) {
        this.f14320b = str;
        this.f14319a = i;
        this.f14322d = i2;
        this.f14323e = i3;
        this.f14324f = 4000;
    }

    /* renamed from: a0 */
    public static C8311d m19709a0(JSONObject jSONObject) {
        try {
            C8311d dVar = new C8311d(jSONObject.getString(ScanBarcodeActivity.TITLE), jSONObject.getInt("sid"), 1, jSONObject.getInt("bright"));
            if (jSONObject.has("subtype")) {
                dVar.mo35434S(jSONObject.getInt("subtype"));
            }
            if (jSONObject.has("description")) {
                dVar.mo35429N(jSONObject.getString("description"));
            }
            if (jSONObject.has("image")) {
                dVar.mo35406Y(jSONObject.getString("image"));
            }
            if (jSONObject.has("dialog")) {
                dVar.mo35432Q(TimerCodec.ENABLE.equals(jSONObject.getString("dialog")));
            }
            if (jSONObject.has("lang_id")) {
                dVar.mo35433R(true);
            }
            return dVar;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: Z */
    public String mo35345Z() {
        return "\"bright\"" + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f14323e + ",500";
    }

    /* renamed from: a */
    public JSONObject mo35294a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject.put("method", "set_scene");
            jSONArray.put("bright");
            jSONArray.put(this.f14323e);
            jSONArray.put(500);
            jSONObject.put("params", jSONArray);
        } catch (Exception unused) {
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Advanced scene to Jason, command: ");
        sb.append(jSONObject.toString());
        return jSONObject;
    }
}
