package com.xiaomi.mistatistic.sdk.data;

import org.json.JSONObject;

/* renamed from: com.xiaomi.mistatistic.sdk.data.j */
public class C4174j extends AbstractEvent {

    /* renamed from: a */
    private String f7161a;

    /* renamed from: b */
    private String f7162b;

    public C4174j(String str, String str2) {
        this.f7161a = str;
        this.f7162b = str2;
    }

    public String getCategory() {
        return "mistat_pv";
    }

    public StatEventPojo toPojo() {
        StatEventPojo statEventPojo = new StatEventPojo();
        statEventPojo.category = getCategory();
        statEventPojo.timeStamp = this.mTS;
        statEventPojo.value = this.f7161a;
        statEventPojo.extra = this.f7162b;
        return statEventPojo;
    }

    public JSONObject valueToJSon() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("path", this.f7161a);
        jSONObject.put("source", this.f7162b);
        return jSONObject;
    }
}
