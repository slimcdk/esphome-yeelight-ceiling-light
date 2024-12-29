package com.xiaomi.push;

import com.xiaomi.mipush.sdk.Constants;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.de */
class C4595de implements Comparable<C4595de> {

    /* renamed from: a */
    protected int f8374a;

    /* renamed from: a */
    private long f8375a;

    /* renamed from: a */
    String f8376a;

    /* renamed from: a */
    private final LinkedList<C4581cu> f8377a;

    public C4595de() {
        this((String) null, 0);
    }

    public C4595de(String str) {
        this(str, 0);
    }

    public C4595de(String str, int i) {
        this.f8377a = new LinkedList<>();
        this.f8375a = 0;
        this.f8376a = str;
        this.f8374a = i;
    }

    /* renamed from: a */
    public int compareTo(C4595de deVar) {
        if (deVar == null) {
            return 1;
        }
        return deVar.f8374a - this.f8374a;
    }

    /* renamed from: a */
    public synchronized C4595de mo24906a(JSONObject jSONObject) {
        this.f8375a = jSONObject.getLong("tt");
        this.f8374a = jSONObject.getInt("wt");
        this.f8376a = jSONObject.getString("host");
        JSONArray jSONArray = jSONObject.getJSONArray("ah");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f8377a.add(new C4581cu().mo24861a(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    /* renamed from: a */
    public synchronized JSONObject mo24907a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put("tt", this.f8375a);
        jSONObject.put("wt", this.f8374a);
        jSONObject.put("host", this.f8376a);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f8377a.iterator();
        while (it.hasNext()) {
            jSONArray.put(((C4581cu) it.next()).mo24860a());
        }
        jSONObject.put("ah", jSONArray);
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo24908a(C4581cu cuVar) {
        if (cuVar != null) {
            this.f8377a.add(cuVar);
            int a = cuVar.mo24860a();
            if (a > 0) {
                this.f8374a += cuVar.mo24860a();
            } else {
                int i = 0;
                int size = this.f8377a.size() - 1;
                while (size >= 0 && this.f8377a.get(size).mo24860a() < 0) {
                    i++;
                    size--;
                }
                this.f8374a += a * i;
            }
            if (this.f8377a.size() > 30) {
                this.f8374a -= this.f8377a.remove().mo24860a();
            }
        }
    }

    public String toString() {
        return this.f8376a + Constants.COLON_SEPARATOR + this.f8374a;
    }
}
