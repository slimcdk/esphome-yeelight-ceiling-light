package com.yeelight.yeelib.p153g;

import com.miot.service.qrcode.ScanBarcodeActivity;
import java.io.Serializable;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.g.c0 */
public class C9832c0 implements Serializable {

    /* renamed from: a */
    protected String f17796a;

    /* renamed from: b */
    protected String f17797b;

    /* renamed from: c */
    protected String f17798c;

    /* renamed from: d */
    protected int f17799d;

    /* renamed from: e */
    protected int f17800e;

    /* renamed from: f */
    protected int f17801f;

    /* renamed from: g */
    protected int f17802g;

    /* renamed from: h */
    private int f17803h;

    /* renamed from: i */
    private String f17804i;

    /* renamed from: j */
    private Set<String> f17805j;

    public C9832c0(JSONObject jSONObject) {
        try {
            this.f17796a = jSONObject.getString("id");
            this.f17803h = jSONObject.getInt("icon_id");
            this.f17797b = jSONObject.getString(ScanBarcodeActivity.TITLE);
            this.f17800e = jSONObject.getInt("bright");
            this.f17801f = jSONObject.getInt("color_temperature");
            this.f17802g = jSONObject.getInt("wrgb");
            jSONObject.getString("colorflow");
            this.f17798c = jSONObject.getString("description");
            this.f17799d = jSONObject.getInt("night_bright");
            this.f17804i = jSONObject.getString("onoff");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public int mo31746a() {
        return this.f17800e;
    }

    /* renamed from: b */
    public int mo31747b() {
        return this.f17802g;
    }

    /* renamed from: c */
    public int mo31748c() {
        return this.f17801f;
    }

    /* renamed from: d */
    public String mo31749d() {
        return this.f17798c;
    }

    /* renamed from: e */
    public Set<String> mo31750e() {
        return this.f17805j;
    }

    /* renamed from: f */
    public int mo31751f() {
        return this.f17803h;
    }

    /* renamed from: g */
    public int mo31752g() {
        return this.f17799d;
    }

    /* renamed from: h */
    public String mo31753h() {
        return this.f17804i;
    }

    /* renamed from: i */
    public String mo31754i() {
        return this.f17796a;
    }

    /* renamed from: j */
    public String mo31755j() {
        return this.f17797b;
    }

    /* renamed from: k */
    public void mo31756k(Set<String> set) {
        this.f17805j = set;
    }

    /* renamed from: l */
    public void mo31757l(int i) {
        this.f17803h = i;
    }
}
