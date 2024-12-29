package com.xiaomi.push;

import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.cj */
public class C4570cj {

    /* renamed from: a */
    public int f8299a;

    /* renamed from: a */
    public long f8300a;

    /* renamed from: a */
    private String f8301a;

    /* renamed from: b */
    public int f8302b;

    /* renamed from: b */
    public long f8303b;

    /* renamed from: c */
    public int f8304c;

    /* renamed from: d */
    public int f8305d;

    /* renamed from: e */
    public int f8306e;

    /* renamed from: h */
    public String f8307h;

    public C4570cj() {
    }

    public C4570cj(C4570cj cjVar) {
        this.f8300a = cjVar.f8300a;
        this.f8299a = cjVar.f8299a;
        this.f8307h = cjVar.f8307h;
        this.f8302b = cjVar.f8302b;
        this.f8304c = cjVar.f8304c;
        this.f8303b = cjVar.f8303b;
        this.f8305d = cjVar.f8305d;
        this.f8301a = cjVar.f8301a;
        this.f8306e = cjVar.f8306e;
    }

    /* renamed from: a */
    public Bundle mo24842a() {
        Bundle bundle = new Bundle();
        bundle.putLong("id", this.f8300a);
        bundle.putInt("showType", this.f8299a);
        bundle.putInt("nonsense", this.f8302b);
        bundle.putInt("receiveUpperBound", this.f8304c);
        bundle.putLong("lastShowTime", this.f8303b);
        bundle.putInt("multi", this.f8306e);
        return bundle;
    }

    /* renamed from: a */
    public String m13587a() {
        return this.f8301a;
    }

    /* renamed from: a */
    public void mo24843a(String str) {
        this.f8301a = str;
    }

    /* renamed from: a */
    public void mo24844a(JSONObject jSONObject) {
        this.f8300a = jSONObject.optLong("id");
        this.f8299a = jSONObject.optInt("showType");
        this.f8302b = jSONObject.optInt("nonsense");
        this.f8304c = jSONObject.optInt("receiveUpperBound");
        this.f8303b = jSONObject.optLong("lastShowTime");
        this.f8306e = jSONObject.optInt("multi");
    }

    public String toString() {
        return "";
    }
}
