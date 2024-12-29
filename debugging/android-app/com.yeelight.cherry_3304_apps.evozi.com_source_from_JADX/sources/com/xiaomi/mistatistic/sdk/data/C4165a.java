package com.xiaomi.mistatistic.sdk.data;

import android.annotation.SuppressLint;
import android.view.View;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"NewApi"})
/* renamed from: com.xiaomi.mistatistic.sdk.data.a */
public class C4165a {

    /* renamed from: a */
    private int f7141a;

    /* renamed from: b */
    private int f7142b;

    /* renamed from: c */
    private int f7143c;

    /* renamed from: d */
    private int f7144d;

    public C4165a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f7141a = iArr[0];
        this.f7142b = iArr[1];
        this.f7143c = view.getWidth();
        this.f7144d = view.getHeight();
    }

    /* renamed from: a */
    public JSONObject mo23134a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("left", this.f7141a);
        jSONObject.put("top", this.f7142b);
        jSONObject.put("width", this.f7143c);
        jSONObject.put("height", this.f7144d);
        return jSONObject;
    }

    public String toString() {
        try {
            return mo23134a().toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
