package com.xiaomi.mistatistic.sdk.data;

import com.xiaomi.mistatistic.sdk.BaseService;
import org.json.JSONObject;

/* renamed from: com.xiaomi.mistatistic.sdk.data.i */
public class C4173i extends AbstractEvent {

    /* renamed from: a */
    private String f7158a;

    /* renamed from: b */
    private Long f7159b;

    /* renamed from: c */
    private long f7160c;

    public C4173i(String str, Long l) {
        this.f7158a = str;
        this.f7160c = l.longValue();
    }

    /* renamed from: a */
    public long mo23139a() {
        return this.f7160c;
    }

    /* renamed from: a */
    public void mo23140a(Long l) {
        this.f7159b = l;
    }

    /* renamed from: b */
    public String mo23141b() {
        return this.f7158a;
    }

    public String getCategory() {
        return "mistat_pt";
    }

    public StatEventPojo toPojo() {
        StatEventPojo statEventPojo = new StatEventPojo();
        statEventPojo.category = getCategory();
        statEventPojo.timeStamp = this.mTS;
        statEventPojo.key = this.f7158a;
        statEventPojo.value = Long.toString(this.f7159b.longValue());
        return statEventPojo;
    }

    public JSONObject valueToJSon() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BaseService.KEY, this.f7158a);
        jSONObject.put("value", this.f7159b);
        return jSONObject;
    }
}
