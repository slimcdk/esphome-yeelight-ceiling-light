package com.xiaomi.mistatistic.sdk.data;

import org.json.JSONObject;

/* renamed from: com.xiaomi.mistatistic.sdk.data.d */
public class C4168d extends AbstractEvent {

    /* renamed from: a */
    private String f7150a = null;

    public C4168d(String str) {
        this.f7150a = str;
    }

    public String getCategory() {
        return "mistat_extra";
    }

    public StatEventPojo toPojo() {
        StatEventPojo statEventPojo = new StatEventPojo();
        statEventPojo.category = getCategory();
        statEventPojo.timeStamp = this.mTS;
        statEventPojo.value = this.f7150a;
        return statEventPojo;
    }

    public JSONObject valueToJSon() {
        return null;
    }
}
