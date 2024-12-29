package com.yeelight.yeelib.models;

import com.yeelight.yeelib.models.C8327s;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.models.m */
public class C8321m extends C8327s {

    /* renamed from: n */
    private String f14310n;

    /* renamed from: o */
    protected String f14311o;

    public C8321m() {
    }

    public C8321m(String str, int i, int i2, int i3, int i4, int i5, C8327s.C8328a[] aVarArr) {
        this.f14320b = str;
        this.f14322d = i2;
        this.f14323e = i3;
        this.f14324f = i4;
        this.f14325g = i5;
        this.f14328j = aVarArr;
        this.f14310n = "";
        mo35424I();
    }

    public C8321m(String str, int i, int i2, int i3, int i4, C8327s.C8328a[] aVarArr) {
        this(str, -1, i, i2, i3, i4, aVarArr);
    }

    /* renamed from: U */
    public static C8321m m19778U(int i, JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder();
        sb.append("light scene build with json, mode: ");
        sb.append(i);
        sb.append(" , params = ");
        sb.append(jSONObject.toString());
        switch (i) {
            case 0:
                return C8324p.m19790a0(jSONObject);
            case 1:
                return C8311d.m19709a0(jSONObject);
            case 2:
                return C8313f.m19716a0(jSONObject);
            case 3:
                return C8314g.m19719a0(jSONObject);
            case 4:
                return C8310c.m19705a0(jSONObject);
            case 5:
            case 7:
            case 8:
                return C8309b.m19702a0(jSONObject);
            case 6:
                return C8322n.m19784a0(jSONObject);
            case 9:
                return C8312e.m19712a0(jSONObject);
            case 10:
                return C8323o.m19787a0(jSONObject);
            default:
                return null;
        }
    }

    /* renamed from: V */
    public static C8321m m19779V(JSONObject jSONObject) {
        try {
            return m19778U(jSONObject.getInt("mode"), jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: W */
    public String mo35404W() {
        String str = this.f14310n;
        return str == null ? "未备注" : str;
    }

    /* renamed from: X */
    public String mo35405X() {
        return this.f14311o;
    }

    /* renamed from: Y */
    public void mo35406Y(String str) {
        this.f14311o = str;
    }

    /* renamed from: Z */
    public String mo35345Z() {
        return null;
    }
}
