package com.yeelight.yeelib.models;

import androidx.core.view.ViewCompat;
import com.miot.service.manager.timer.TimerCodec;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.xiaomi.mipush.sdk.Constants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.models.f */
public class C8313f extends C8321m {
    public C8313f() {
        this.f14322d = 2;
    }

    public C8313f(String str, int i, int i2, int i3, int i4) {
        this.f14320b = str;
        this.f14319a = i;
        this.f14322d = i2;
        this.f14323e = i3;
        this.f14325g = i4;
    }

    /* renamed from: a0 */
    public static C8313f m19716a0(JSONObject jSONObject) {
        try {
            C8313f fVar = new C8313f(jSONObject.getString(ScanBarcodeActivity.TITLE), jSONObject.getInt("sid"), 2, jSONObject.getInt("bright"), jSONObject.getInt("wrgb"));
            if (jSONObject.has("subtype")) {
                fVar.mo35434S(jSONObject.getInt("subtype"));
            }
            if (jSONObject.has("description")) {
                fVar.mo35429N(jSONObject.getString("description"));
            }
            if (jSONObject.has("image")) {
                fVar.mo35406Y(jSONObject.getString("image"));
            }
            if (jSONObject.has("dialog")) {
                fVar.mo35432Q(TimerCodec.ENABLE.equals(jSONObject.getString("dialog")));
            }
            if (jSONObject.has("lang_id")) {
                fVar.mo35433R(true);
            }
            return fVar;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: Z */
    public String mo35345Z() {
        return "\"color\"" + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f14325g + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f14323e;
    }

    /* renamed from: a */
    public JSONObject mo35294a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject.put("method", "set_scene");
            jSONArray.put("color");
            jSONArray.put(this.f14325g & ViewCompat.MEASURED_SIZE_MASK);
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
