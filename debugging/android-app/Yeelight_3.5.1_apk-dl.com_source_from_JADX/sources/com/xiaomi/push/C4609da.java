package com.xiaomi.push;

import com.xiaomi.mipush.sdk.Constants;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.da */
class C4609da implements Comparable<C4609da> {

    /* renamed from: a */
    protected int f7773a;

    /* renamed from: a */
    private long f7774a;

    /* renamed from: a */
    String f7775a;

    /* renamed from: a */
    private final LinkedList<C4595cq> f7776a;

    public C4609da() {
        this((String) null, 0);
    }

    public C4609da(String str) {
        this(str, 0);
    }

    public C4609da(String str, int i) {
        this.f7776a = new LinkedList<>();
        this.f7774a = 0;
        this.f7775a = str;
        this.f7773a = i;
    }

    /* renamed from: a */
    public int compareTo(C4609da daVar) {
        if (daVar == null) {
            return 1;
        }
        return daVar.f7773a - this.f7773a;
    }

    /* renamed from: a */
    public synchronized C4609da mo28896a(JSONObject jSONObject) {
        this.f7774a = jSONObject.getLong("tt");
        this.f7773a = jSONObject.getInt("wt");
        this.f7775a = jSONObject.getString("host");
        JSONArray jSONArray = jSONObject.getJSONArray("ah");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f7776a.add(new C4595cq().mo28850a(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    /* renamed from: a */
    public synchronized JSONObject mo28897a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put("tt", this.f7774a);
        jSONObject.put("wt", this.f7773a);
        jSONObject.put("host", this.f7775a);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f7776a.iterator();
        while (it.hasNext()) {
            jSONArray.put(((C4595cq) it.next()).mo28849a());
        }
        jSONObject.put("ah", jSONArray);
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo28898a(C4595cq cqVar) {
        if (cqVar != null) {
            this.f7776a.add(cqVar);
            int a = cqVar.mo28849a();
            if (a > 0) {
                this.f7773a += cqVar.mo28849a();
            } else {
                int i = 0;
                int size = this.f7776a.size() - 1;
                while (size >= 0 && this.f7776a.get(size).mo28849a() < 0) {
                    i++;
                    size--;
                }
                this.f7773a += a * i;
            }
            if (this.f7776a.size() > 30) {
                this.f7773a -= this.f7776a.remove().mo28849a();
            }
        }
    }

    public String toString() {
        return this.f7775a + Constants.COLON_SEPARATOR + this.f7773a;
    }
}
