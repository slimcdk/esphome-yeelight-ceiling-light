package com.xiaomi.push;

import org.json.JSONObject;

/* renamed from: com.xiaomi.push.cq */
public class C4595cq {

    /* renamed from: a */
    private int f7730a;

    /* renamed from: a */
    private long f7731a;

    /* renamed from: a */
    private String f7732a;

    /* renamed from: b */
    private long f7733b;

    /* renamed from: c */
    private long f7734c;

    public C4595cq() {
        this(0, 0, 0, (Exception) null);
    }

    public C4595cq(int i, long j, long j2, Exception exc) {
        this.f7730a = i;
        this.f7731a = j;
        this.f7734c = j2;
        this.f7733b = System.currentTimeMillis();
        if (exc != null) {
            this.f7732a = exc.getClass().getSimpleName();
        }
    }

    /* renamed from: a */
    public int mo28849a() {
        return this.f7730a;
    }

    /* renamed from: a */
    public C4595cq mo28850a(JSONObject jSONObject) {
        this.f7731a = jSONObject.getLong("cost");
        this.f7734c = jSONObject.getLong("size");
        this.f7733b = jSONObject.getLong("ts");
        this.f7730a = jSONObject.getInt("wt");
        this.f7732a = jSONObject.optString("expt");
        return this;
    }

    /* renamed from: a */
    public JSONObject m13189a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cost", this.f7731a);
        jSONObject.put("size", this.f7734c);
        jSONObject.put("ts", this.f7733b);
        jSONObject.put("wt", this.f7730a);
        jSONObject.put("expt", this.f7732a);
        return jSONObject;
    }
}
