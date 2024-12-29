package com.yeelight.yeelib.models;

import com.miot.service.manager.timer.TimerCodec;
import com.miot.service.qrcode.ScanBarcodeActivity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.models.p */
public class C8324p extends C8321m {
    public C8324p() {
        this.f14322d = 0;
    }

    public C8324p(String str, int i, int i2) {
        this.f14320b = str;
        this.f14319a = i;
        this.f14322d = i2;
    }

    /* renamed from: a0 */
    public static C8324p m19790a0(JSONObject jSONObject) {
        try {
            C8324p pVar = new C8324p(jSONObject.getString(ScanBarcodeActivity.TITLE), jSONObject.getInt("sid"), 0);
            if (jSONObject.has("subtype")) {
                pVar.mo35434S(jSONObject.getInt("subtype"));
            }
            if (jSONObject.has("description")) {
                pVar.mo35429N(jSONObject.getString("description"));
            }
            if (jSONObject.has("image")) {
                pVar.mo35406Y(jSONObject.getString("image"));
            }
            if (jSONObject.has("dialog")) {
                pVar.mo35432Q(TimerCodec.ENABLE.equals(jSONObject.getString("dialog")));
            }
            if (jSONObject.has("lang_id")) {
                pVar.mo35433R(true);
            }
            return pVar;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: Z */
    public String mo35345Z() {
        return new StringBuilder("\"off\"").toString();
    }

    /* renamed from: a */
    public JSONObject mo35294a() {
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
        StringBuilder sb = new StringBuilder();
        sb.append("Advanced scene to Jason, command: ");
        sb.append(jSONObject.toString());
        return jSONObject;
    }
}
