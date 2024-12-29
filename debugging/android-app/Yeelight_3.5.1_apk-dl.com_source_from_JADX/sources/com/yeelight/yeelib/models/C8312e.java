package com.yeelight.yeelib.models;

import android.text.TextUtils;
import com.miot.service.manager.timer.TimerCodec;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.models.e */
public class C8312e extends C8321m {

    /* renamed from: q */
    public static final String f14271q = "e";

    /* renamed from: p */
    List<C8321m> f14272p;

    public C8312e() {
        this.f14322d = 9;
    }

    public C8312e(String str, int i, int i2) {
        this.f14320b = str;
        this.f14319a = i;
        this.f14322d = i2;
    }

    /* renamed from: a0 */
    public static C8312e m19712a0(JSONObject jSONObject) {
        C8327s sVar;
        JSONObject jSONObject2 = jSONObject;
        try {
            C8312e eVar = new C8312e(jSONObject2.optString(ScanBarcodeActivity.TITLE), jSONObject2.optInt("sid"), 9);
            JSONArray jSONArray = new JSONArray(jSONObject2.getString("params"));
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < jSONArray.length()) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                int i2 = jSONObject3.getInt("mode");
                int optInt = jSONObject3.optInt("bright");
                int optInt2 = jSONObject3.optInt("color_temperature");
                int optInt3 = jSONObject3.optInt("wrgb");
                switch (i2) {
                    case 0:
                        sVar = new C8324p();
                        break;
                    case 1:
                        sVar = new C8311d();
                        break;
                    case 2:
                        sVar = new C8313f();
                        break;
                    case 3:
                        sVar = new C8314g();
                        break;
                    case 5:
                    case 7:
                    case 8:
                        sVar = new C8309b();
                        break;
                    case 6:
                        optInt = jSONObject3.optInt("night_bright");
                        sVar = new C8322n();
                        break;
                    default:
                        String str = f14271q;
                        AppUtils.m8300u(str, "Invalid bundle item scene mode: " + i2);
                        return null;
                }
                String optString = jSONObject3.optString("colorflow");
                StringBuilder sb = new StringBuilder();
                JSONArray jSONArray2 = jSONArray;
                sb.append("bundleItemColorflow: ");
                sb.append(optString);
                if (!TextUtils.isEmpty(optString)) {
                    sVar.mo35425J(C8308a.m19689c(new JSONArray(optString)));
                }
                sVar.mo35430O(i2);
                sVar.mo35426K(optInt);
                sVar.mo35428M(optInt2);
                sVar.mo35427L(optInt3);
                arrayList.add(sVar);
                i++;
                jSONArray = jSONArray2;
            }
            eVar.mo35349c0(arrayList);
            if (jSONObject2.has("subtype")) {
                eVar.mo35434S(jSONObject2.getInt("subtype"));
            }
            if (jSONObject2.has("description")) {
                eVar.mo35429N(jSONObject2.getString("description"));
            }
            if (jSONObject2.has("image")) {
                eVar.mo35406Y(jSONObject2.getString("image"));
            }
            if (jSONObject2.has("dialog")) {
                eVar.mo35432Q(TimerCodec.ENABLE.equals(jSONObject2.getString("dialog")));
            }
            if (jSONObject2.has("lang_id")) {
                eVar.mo35433R(true);
            }
            return eVar;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public JSONObject mo35294a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject.put("method", "set_scene_bundle");
            for (C8321m Z : this.f14272p) {
                jSONArray.put(Z.mo35345Z());
            }
            jSONObject.put("params", jSONArray);
        } catch (Exception unused) {
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Advanced scene to Jason, command: ");
        sb.append(jSONObject.toString());
        return jSONObject;
    }

    /* renamed from: b0 */
    public List<C8321m> mo35348b0() {
        return this.f14272p;
    }

    /* renamed from: c0 */
    public void mo35349c0(List<C8321m> list) {
        this.f14272p = list;
    }
}
