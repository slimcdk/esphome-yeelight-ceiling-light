package com.xiaomi.mistatistic.sdk.data;

import com.xiaomi.mipush.sdk.Constants;
import org.json.JSONObject;

/* renamed from: com.xiaomi.mistatistic.sdk.data.k */
public class C4175k extends AbstractEvent {

    /* renamed from: a */
    private long f7163a;

    /* renamed from: b */
    private long f7164b;

    /* renamed from: c */
    private String f7165c;

    public C4175k(long j, long j2, String str) {
        this.f7163a = j;
        this.f7164b = j2;
        this.f7165c = str;
    }

    public String getCategory() {
        return "mistat_session";
    }

    public StatEventPojo toPojo() {
        StatEventPojo statEventPojo = new StatEventPojo();
        statEventPojo.category = getCategory();
        statEventPojo.timeStamp = this.mTS;
        statEventPojo.value = this.f7163a + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f7164b;
        statEventPojo.extra = this.f7165c;
        return statEventPojo;
    }

    public JSONObject valueToJSon() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("start", this.f7163a);
        jSONObject.put("end", this.f7164b);
        jSONObject.put("env", this.f7165c);
        return jSONObject;
    }
}
