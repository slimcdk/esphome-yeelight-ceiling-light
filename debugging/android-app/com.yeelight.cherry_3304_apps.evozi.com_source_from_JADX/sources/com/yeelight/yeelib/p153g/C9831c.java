package com.yeelight.yeelib.p153g;

import androidx.core.view.ViewCompat;
import com.miot.service.manager.timer.TimerCodec;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.p153g.C9856y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.g.c */
public class C9831c extends C9849r {
    public C9831c(String str, int i, int i2, String str2) {
        this.f17892b = str;
        this.f17891a = i;
        this.f17894d = i2;
        this.f17901k = str2;
        mo31745a0(str2);
    }

    /* renamed from: Z */
    public static C9831c m23925Z(JSONObject jSONObject) {
        try {
            C9831c cVar = new C9831c(jSONObject.getString(ScanBarcodeActivity.TITLE), jSONObject.getInt("sid"), 4, jSONObject.getString("colorflow"));
            if (jSONObject.has("subtype")) {
                cVar.mo31869R(jSONObject.getInt("subtype"));
            }
            if (jSONObject.has("description")) {
                cVar.mo31864M(jSONObject.getString("description"));
            }
            if (jSONObject.has("image")) {
                cVar.mo31819X(jSONObject.getString("image"));
            }
            if (jSONObject.has("dialog")) {
                cVar.mo31867P(TimerCodec.ENABLE.equals(jSONObject.getString("dialog")));
            }
            if (jSONObject.has("lang_id")) {
                cVar.mo31868Q(true);
            }
            return cVar;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: Y */
    public String mo31742Y() {
        StringBuilder sb = new StringBuilder();
        sb.append("\"cf\"");
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb.append(this.f17902l.mo31724i());
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb.append(this.f17902l.mo31721f().ordinal());
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        if (this.f17901k != null) {
            sb.append("\"");
            for (int i = 0; i < this.f17900j.length; i++) {
                if (i != 0) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb.append(this.f17900j[i].mo31896b());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(this.f17900j[i].mo31897c());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(this.f17900j[i].mo31898d());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(this.f17900j[i].mo31895a());
            }
            sb.append("\"");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public JSONObject mo31743a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject.put("method", "set_scene");
            jSONArray.put("cf");
            jSONArray.put(0);
            jSONArray.put(0);
            StringBuilder sb = new StringBuilder();
            if (this.f17901k != null) {
                for (int i = 0; i < this.f17900j.length; i++) {
                    if (i != 0) {
                        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                    sb.append(this.f17900j[i].mo31896b());
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    sb.append(this.f17900j[i].mo31897c());
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    sb.append(this.f17900j[i].mo31898d());
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    sb.append(this.f17900j[i].mo31895a());
                }
                jSONArray.put(sb.toString());
            }
            jSONObject.put("params", jSONArray);
        } catch (Exception unused) {
        }
        "Advanced scene to Jason, command: " + jSONObject.toString();
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public void mo31745a0(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.get(0).toString().equalsIgnoreCase("cf") || jSONArray.get(0).toString().equals(String.valueOf(4))) {
                this.f17898h = Integer.parseInt(jSONArray.get(1).toString());
                this.f17899i = Integer.parseInt(jSONArray.get(2).toString());
                String[] split = jSONArray.getString(3).split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                this.f17900j = new C9856y.C9857a[(split.length / 4)];
                for (int i = 0; i < this.f17900j.length; i++) {
                    int i2 = i * 4;
                    this.f17900j[i] = new C9856y.C9857a(Integer.parseInt(split[i2]), Integer.parseInt(split[i2 + 1]), Integer.parseInt(split[i2 + 2]) | ViewCompat.MEASURED_STATE_MASK, Integer.parseInt(split[i2 + 3]));
                }
                this.f17895e = this.f17900j[0].mo31895a();
            }
        } catch (Exception unused) {
        }
    }
}
