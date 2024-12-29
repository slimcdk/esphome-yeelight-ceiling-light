package com.yeelight.yeelib.p153g;

import android.text.TextUtils;
import com.miot.service.manager.timer.TimerCodec;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.g.e */
public class C9834e extends C9849r {

    /* renamed from: q */
    public static final String f17806q = "e";

    /* renamed from: p */
    List<C9849r> f17807p;

    public C9834e() {
        this.f17894d = 9;
    }

    public C9834e(String str, int i, int i2) {
        this.f17892b = str;
        this.f17891a = i;
        this.f17894d = i2;
    }

    /* renamed from: Z */
    public static C9834e m23944Z(JSONObject jSONObject) {
        C9856y yVar;
        JSONObject jSONObject2 = jSONObject;
        try {
            C9834e eVar = new C9834e(jSONObject2.optString(ScanBarcodeActivity.TITLE), jSONObject2.optInt("sid"), 9);
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
                        yVar = new C9852u();
                        break;
                    case 1:
                        yVar = new C9833d();
                        break;
                    case 2:
                        yVar = new C9835f();
                        break;
                    case 3:
                        yVar = new C9836g();
                        break;
                    case 5:
                    case 7:
                    case 8:
                        yVar = new C9830b();
                        break;
                    case 6:
                        optInt = jSONObject3.optInt("night_bright");
                        yVar = new C9851t();
                        break;
                    default:
                        String str = f17806q;
                        C4308b.m12139r(str, "Invalid bundle item scene mode: " + i2);
                        return null;
                }
                String optString = jSONObject3.optString("colorflow");
                StringBuilder sb = new StringBuilder();
                JSONArray jSONArray2 = jSONArray;
                sb.append("bundleItemColorflow: ");
                sb.append(optString);
                sb.toString();
                if (!TextUtils.isEmpty(optString)) {
                    yVar.mo31860I(C9827a.m23895c(new JSONArray(optString)));
                }
                yVar.mo31865N(i2);
                yVar.mo31861J(optInt);
                yVar.mo31863L(optInt2);
                yVar.mo31862K(optInt3);
                arrayList.add(yVar);
                i++;
                jSONArray = jSONArray2;
            }
            eVar.mo31759b0(arrayList);
            if (jSONObject2.has("subtype")) {
                eVar.mo31869R(jSONObject2.getInt("subtype"));
            }
            if (jSONObject2.has("description")) {
                eVar.mo31864M(jSONObject2.getString("description"));
            }
            if (jSONObject2.has("image")) {
                eVar.mo31819X(jSONObject2.getString("image"));
            }
            if (jSONObject2.has("dialog")) {
                eVar.mo31867P(TimerCodec.ENABLE.equals(jSONObject2.getString("dialog")));
            }
            if (jSONObject2.has("lang_id")) {
                eVar.mo31868Q(true);
            }
            return eVar;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public JSONObject mo31743a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject.put("method", "set_scene_bundle");
            for (C9849r Y : this.f17807p) {
                jSONArray.put(Y.mo31742Y());
            }
            jSONObject.put("params", jSONArray);
        } catch (Exception unused) {
        }
        "Advanced scene to Jason, command: " + jSONObject.toString();
        return jSONObject;
    }

    /* renamed from: a0 */
    public List<C9849r> mo31758a0() {
        return this.f17807p;
    }

    /* renamed from: b0 */
    public void mo31759b0(List<C9849r> list) {
        this.f17807p = list;
    }
}
