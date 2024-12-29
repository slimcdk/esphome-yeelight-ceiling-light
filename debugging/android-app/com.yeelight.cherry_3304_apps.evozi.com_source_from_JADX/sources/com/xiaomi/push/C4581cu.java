package com.xiaomi.push;

import org.json.JSONObject;

/* renamed from: com.xiaomi.push.cu */
public class C4581cu {

    /* renamed from: a */
    private int f8331a;

    /* renamed from: a */
    private long f8332a;

    /* renamed from: a */
    private String f8333a;

    /* renamed from: b */
    private long f8334b;

    /* renamed from: c */
    private long f8335c;

    public C4581cu() {
        this(0, 0, 0, (Exception) null);
    }

    public C4581cu(int i, long j, long j2, Exception exc) {
        this.f8331a = i;
        this.f8332a = j;
        this.f8335c = j2;
        this.f8334b = System.currentTimeMillis();
        if (exc != null) {
            this.f8333a = exc.getClass().getSimpleName();
        }
    }

    /* renamed from: a */
    public int mo24860a() {
        return this.f8331a;
    }

    /* renamed from: a */
    public C4581cu mo24861a(JSONObject jSONObject) {
        this.f8332a = jSONObject.getLong("cost");
        this.f8335c = jSONObject.getLong("size");
        this.f8334b = jSONObject.getLong("ts");
        this.f8331a = jSONObject.getInt("wt");
        this.f8333a = jSONObject.optString("expt");
        return this;
    }

    /* renamed from: a */
    public JSONObject m13615a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cost", this.f8332a);
        jSONObject.put("size", this.f8335c);
        jSONObject.put("ts", this.f8334b);
        jSONObject.put("wt", this.f8331a);
        jSONObject.put("expt", this.f8333a);
        return jSONObject;
    }
}
