package com.xiaomi.mistatistic.sdk.data;

import android.text.TextUtils;
import com.xiaomi.mistatistic.sdk.BaseService;
import com.xiaomi.mistatistic.sdk.controller.C4130h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.xiaomi.mistatistic.sdk.data.f */
public abstract class C4170f extends AbstractEvent {

    /* renamed from: a */
    protected long f7151a;

    /* renamed from: b */
    private String f7152b;

    /* renamed from: c */
    private String f7153c;

    /* renamed from: d */
    private Map<String, String> f7154d;

    public C4170f(String str, String str2, long j) {
        this(str, str2, j, (Map<String, String>) null);
    }

    public C4170f(String str, String str2, long j, Map<String, String> map) {
        this.f7152b = str;
        this.f7153c = str2;
        this.f7151a = j;
        this.f7154d = map == null ? null : new HashMap(map);
    }

    /* renamed from: a */
    private String m11313a(Map<String, String> map) {
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

    /* renamed from: a */
    public abstract String mo23136a();

    public boolean equals(Object obj) {
        Map<String, String> map;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4170f)) {
            return false;
        }
        C4170f fVar = (C4170f) obj;
        if (!TextUtils.equals(this.f7152b, fVar.f7152b) || !TextUtils.equals(this.f7153c, fVar.f7153c) || !TextUtils.equals(mo23136a(), fVar.mo23136a()) || this.f7151a != fVar.f7151a || (map = this.f7154d) == null) {
            return true;
        }
        return map.equals(fVar.f7154d);
    }

    public String getCategory() {
        return this.f7152b;
    }

    public StatEventPojo toPojo() {
        StatEventPojo statEventPojo = new StatEventPojo();
        statEventPojo.category = this.f7152b;
        statEventPojo.key = this.f7153c;
        statEventPojo.timeStamp = this.mTS;
        statEventPojo.type = mo23136a();
        statEventPojo.value = String.valueOf(this.f7151a);
        statEventPojo.extra = m11313a(this.f7154d);
        return statEventPojo;
    }

    public JSONObject valueToJSon() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BaseService.CATEGORY, this.f7152b);
        jSONObject.put(BaseService.KEY, this.f7153c);
        jSONObject.put("type", mo23136a());
        jSONObject.put("value", this.f7151a);
        if (this.f7154d != null) {
            jSONObject.put("params", new JSONObject(this.f7154d));
        }
        return jSONObject;
    }
}
