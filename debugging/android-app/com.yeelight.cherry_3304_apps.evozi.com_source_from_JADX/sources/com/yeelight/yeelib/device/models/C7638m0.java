package com.yeelight.yeelib.device.models;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.device.models.m0 */
public class C7638m0 {

    /* renamed from: a */
    private String f15624a;

    /* renamed from: b */
    private int f15625b;

    /* renamed from: c */
    private int f15626c;

    /* renamed from: d */
    private Object f15627d;

    /* renamed from: e */
    private String f15628e;

    public C7638m0(String str, int i, int i2, Object obj) {
        this.f15624a = str;
        this.f15625b = i;
        this.f15626c = i2;
        this.f15627d = obj;
    }

    public C7638m0(String str, int i, int i2, Object obj, String str2) {
        this.f15624a = str;
        this.f15625b = i;
        this.f15626c = i2;
        this.f15627d = obj;
        this.f15628e = str2;
    }

    public C7638m0(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f15624a = jSONObject.getString("did");
                this.f15625b = jSONObject.getInt("siid");
                this.f15626c = jSONObject.getInt("piid");
                this.f15627d = jSONObject.get("value");
                if (jSONObject.has(this.f15628e)) {
                    this.f15628e = jSONObject.getString("desc");
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public String mo29083a() {
        return this.f15628e;
    }

    /* renamed from: b */
    public JSONObject mo29084b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", this.f15624a);
            jSONObject.put("siid", this.f15625b);
            jSONObject.put("piid", this.f15626c);
            jSONObject.put("value", this.f15627d);
            if (this.f15628e != null) {
                jSONObject.put("desc", this.f15628e);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: c */
    public int mo29085c() {
        return this.f15625b;
    }
}
