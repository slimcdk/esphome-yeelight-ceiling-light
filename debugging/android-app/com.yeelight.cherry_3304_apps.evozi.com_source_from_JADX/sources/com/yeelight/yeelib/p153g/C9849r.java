package com.yeelight.yeelib.p153g;

import com.yeelight.yeelib.p153g.C9856y;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.g.r */
public class C9849r extends C9856y {

    /* renamed from: n */
    private String f17872n;

    /* renamed from: o */
    protected String f17873o;

    public C9849r() {
    }

    public C9849r(String str, int i, int i2, int i3, int i4, int i5, C9856y.C9857a[] aVarArr) {
        this.f17892b = str;
        this.f17894d = i2;
        this.f17895e = i3;
        this.f17896f = i4;
        this.f17897g = i5;
        this.f17900j = aVarArr;
        this.f17872n = "";
        mo31859H();
    }

    public C9849r(String str, int i, int i2, int i3, int i4, C9856y.C9857a[] aVarArr) {
        this(str, -1, i, i2, i3, i4, aVarArr);
    }

    /* renamed from: T */
    public static C9849r m24016T(int i, JSONObject jSONObject) {
        "light scene build with json, mode: " + i + " , params = " + jSONObject.toString();
        switch (i) {
            case 0:
                return C9852u.m24033Z(jSONObject);
            case 1:
                return C9833d.m23941Z(jSONObject);
            case 2:
                return C9835f.m23948Z(jSONObject);
            case 3:
                return C9836g.m23951Z(jSONObject);
            case 4:
                return C9831c.m23925Z(jSONObject);
            case 5:
            case 7:
            case 8:
                return C9830b.m23922Z(jSONObject);
            case 6:
                return C9851t.m24030Z(jSONObject);
            case 9:
                return C9834e.m23944Z(jSONObject);
            default:
                return null;
        }
    }

    /* renamed from: U */
    public static C9849r m24017U(JSONObject jSONObject) {
        try {
            return m24016T(jSONObject.getInt("mode"), jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: V */
    public String mo31817V() {
        String str = this.f17872n;
        return str == null ? "未备注" : str;
    }

    /* renamed from: W */
    public String mo31818W() {
        return this.f17873o;
    }

    /* renamed from: X */
    public void mo31819X(String str) {
        this.f17873o = str;
    }

    /* renamed from: Y */
    public String mo31742Y() {
        return null;
    }
}
