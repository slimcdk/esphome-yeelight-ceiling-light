package com.xiaomi.mistatistic.sdk.data;

import com.xiaomi.mistatistic.sdk.BaseService;
import com.xiaomi.mistatistic.sdk.controller.C4130h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.xiaomi.mistatistic.sdk.data.b */
public class C4166b extends AbstractEvent {

    /* renamed from: a */
    protected String f7145a;

    /* renamed from: b */
    private String f7146b;

    /* renamed from: c */
    private String f7147c;

    /* renamed from: d */
    private String f7148d;

    /* renamed from: e */
    private Map<String, String> f7149e;

    public C4166b(String str, String str2, String str3, long j, Map<String, String> map) {
        this.f7146b = str;
        this.f7147c = str3;
        this.f7148d = str2;
        this.f7145a = String.valueOf(j);
        this.f7149e = map == null ? null : new HashMap(map);
    }

    public C4166b(String str, String str2, String str3, String str4, Map<String, String> map) {
        this.f7146b = str;
        this.f7147c = str3;
        this.f7148d = str2;
        this.f7145a = str4;
        this.f7149e = map == null ? null : new HashMap(map);
    }

    /* renamed from: a */
    private String m11310a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        try {
            if (map.isEmpty()) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            for (String next : map.keySet()) {
                jSONObject.put(next, map.get(next));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            C4130h.m11176a("json error", (Throwable) e);
            return null;
        }
    }

    public String getCategory() {
        return this.f7146b;
    }

    public StatEventPojo toPojo() {
        StatEventPojo statEventPojo = new StatEventPojo();
        statEventPojo.category = this.f7146b;
        statEventPojo.key = this.f7147c;
        statEventPojo.timeStamp = this.mTS;
        statEventPojo.type = this.f7148d;
        statEventPojo.value = this.f7145a;
        statEventPojo.extra = m11310a(this.f7149e);
        return statEventPojo;
    }

    public JSONObject valueToJSon() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BaseService.CATEGORY, this.f7146b);
        jSONObject.put(BaseService.KEY, this.f7147c);
        jSONObject.put("type", this.f7148d);
        jSONObject.put("value", this.f7145a);
        if (this.f7149e != null) {
            jSONObject.put("params", new JSONObject(this.f7149e));
        }
        return jSONObject;
    }
}
