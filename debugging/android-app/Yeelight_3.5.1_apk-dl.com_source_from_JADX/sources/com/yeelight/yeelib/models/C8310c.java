package com.yeelight.yeelib.models;

import androidx.core.view.ViewCompat;
import com.miot.service.manager.timer.TimerCodec;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.models.C8327s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.models.c */
public class C8310c extends C8321m {
    public C8310c(String str, int i, int i2, String str2) {
        this.f14320b = str;
        this.f14319a = i;
        this.f14322d = i2;
        this.f14329k = str2;
        mo35347b0(str2);
    }

    /* renamed from: a0 */
    public static C8310c m19705a0(JSONObject jSONObject) {
        try {
            C8310c cVar = new C8310c(jSONObject.getString(ScanBarcodeActivity.TITLE), jSONObject.getInt("sid"), 4, jSONObject.getString("colorflow"));
            if (jSONObject.has("subtype")) {
                cVar.mo35434S(jSONObject.getInt("subtype"));
            }
            if (jSONObject.has("description")) {
                cVar.mo35429N(jSONObject.getString("description"));
            }
            if (jSONObject.has("image")) {
                cVar.mo35406Y(jSONObject.getString("image"));
            }
            if (jSONObject.has("dialog")) {
                cVar.mo35432Q(TimerCodec.ENABLE.equals(jSONObject.getString("dialog")));
            }
            if (jSONObject.has("lang_id")) {
                cVar.mo35433R(true);
            }
            return cVar;
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
        if (this.f14329k != null) {
            sb.append("\"");
            for (int i = 0; i < this.f14328j.length; i++) {
                if (i != 0) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb.append(this.f14328j[i].mo35461b());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(this.f14328j[i].mo35462c());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(this.f14328j[i].mo35463d());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(this.f14328j[i].mo35460a());
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
            jSONArray.put(0);
            jSONArray.put(0);
            StringBuilder sb = new StringBuilder();
            if (this.f14329k != null) {
                for (int i = 0; i < this.f14328j.length; i++) {
                    if (i != 0) {
                        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                    sb.append(this.f14328j[i].mo35461b());
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    sb.append(this.f14328j[i].mo35462c());
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    sb.append(this.f14328j[i].mo35463d());
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    sb.append(this.f14328j[i].mo35460a());
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

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public void mo35347b0(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.get(0).toString().equalsIgnoreCase("cf") || jSONArray.get(0).toString().equals(String.valueOf(4))) {
                this.f14326h = Integer.parseInt(jSONArray.get(1).toString());
                this.f14327i = Integer.parseInt(jSONArray.get(2).toString());
                String[] split = jSONArray.getString(3).split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                this.f14328j = new C8327s.C8328a[(split.length / 4)];
                int i = 0;
                while (true) {
                    C8327s.C8328a[] aVarArr = this.f14328j;
                    if (i < aVarArr.length) {
                        int i2 = i * 4;
                        this.f14328j[i] = new C8327s.C8328a(Integer.parseInt(split[i2]), Integer.parseInt(split[i2 + 1]), Integer.parseInt(split[i2 + 2]) | ViewCompat.MEASURED_STATE_MASK, Integer.parseInt(split[i2 + 3]));
                        i++;
                    } else {
                        this.f14323e = aVarArr[0].mo35460a();
                        return;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
