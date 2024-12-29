package com.yeelight.yeelib.models;

import com.miot.service.manager.timer.TimerCodec;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.xiaomi.mipush.sdk.Constants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.models.b */
public class C8309b extends C8321m {
    public C8309b() {
        this.f14330l = new C8308a();
        this.f14322d = 5;
    }

    public C8309b(String str, int i, int i2) {
        this.f14320b = str;
        this.f14319a = i;
        this.f14322d = i2;
    }

    /* renamed from: a0 */
    public static C8309b m19702a0(JSONObject jSONObject) {
        String str = "";
        try {
            if (jSONObject.has(ScanBarcodeActivity.TITLE)) {
                str = jSONObject.getString(ScanBarcodeActivity.TITLE);
            }
            int i = jSONObject.getInt("mode");
            int i2 = jSONObject.getInt("sid");
            C8308a c = C8308a.m19689c(new JSONArray(jSONObject.getString("colorflow")));
            C8309b bVar = new C8309b(str, i2, i);
            bVar.mo35425J(c);
            if (jSONObject.has("subtype")) {
                bVar.mo35434S(jSONObject.getInt("subtype"));
            }
            if (jSONObject.has("description")) {
                bVar.mo35429N(jSONObject.getString("description"));
            }
            if (jSONObject.has("image")) {
                bVar.mo35406Y(jSONObject.getString("image"));
            }
            if (jSONObject.has("dialog")) {
                bVar.mo35432Q(TimerCodec.ENABLE.equals(jSONObject.getString("dialog")));
            }
            if (jSONObject.has("lang_id")) {
                bVar.mo35433R(true);
            }
            return bVar;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: Z */
    public String mo35345Z() {
        StringBuilder sb = new StringBuilder();
        sb.append("\"cf\"");
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb.append(this.f14330l.mo35339i());
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb.append(this.f14330l.mo35336f().ordinal());
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        if (this.f14330l != null) {
            sb.append("\"");
            for (int i = 0; i < this.f14330l.mo35338h().size(); i++) {
                if (i != 0) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb.append(this.f14330l.mo35338h().get(i).mo35375c());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(this.f14330l.mo35338h().get(i).mo35376d().ordinal());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(this.f14330l.mo35338h().get(i).mo35377e());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(this.f14330l.mo35338h().get(i).mo35374b());
            }
            sb.append("\"");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public JSONObject mo35294a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject.put("method", "set_scene");
            jSONArray.put("cf");
            jSONArray.put(this.f14330l.mo35339i());
            jSONArray.put(this.f14330l.mo35336f().ordinal());
            StringBuilder sb = new StringBuilder();
            if (this.f14330l != null) {
                for (int i = 0; i < this.f14330l.mo35338h().size(); i++) {
                    if (i != 0) {
                        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                    sb.append(this.f14330l.mo35338h().get(i).mo35375c());
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    sb.append(this.f14330l.mo35338h().get(i).mo35376d().ordinal());
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    sb.append(this.f14330l.mo35338h().get(i).mo35377e());
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    sb.append(this.f14330l.mo35338h().get(i).mo35374b());
                }
                jSONArray.put(sb.toString());
            }
            jSONObject.put("params", jSONArray);
        } catch (Exception unused) {
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Advanced scene to Jason, command: ");
        sb2.append(jSONObject.toString());
        return jSONObject;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ScanBarcodeActivity.TITLE, this.f14320b);
            jSONObject.put("mode", this.f14322d);
            jSONObject.put("sid", this.f14319a);
            jSONObject.put("bright", this.f14323e);
            jSONObject.put("ct", this.f14324f);
            jSONObject.put("color", this.f14325g);
            jSONObject.put("colorflow", this.f14330l.mo35344n());
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }
}
