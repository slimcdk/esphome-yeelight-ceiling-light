package com.xiaomi.push;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.p194io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.cs */
class C4597cs {

    /* renamed from: a */
    private String f7749a;

    /* renamed from: a */
    private final ArrayList<C4596cr> f7750a = new ArrayList<>();

    public C4597cs() {
    }

    public C4597cs(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f7749a = str;
            return;
        }
        throw new IllegalArgumentException("the host is empty");
    }

    /* renamed from: a */
    public synchronized C4596cr mo28870a() {
        for (int size = this.f7750a.size() - 1; size >= 0; size--) {
            C4596cr crVar = this.f7750a.get(size);
            if (crVar.mo28852a()) {
                C4600cv.mo28881a().mo28878a(crVar.mo28852a());
                return crVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public synchronized C4597cs mo28871a(JSONObject jSONObject) {
        this.f7749a = jSONObject.getString("host");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f7750a.add(new C4596cr(this.f7749a).mo28851a(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    /* renamed from: a */
    public String m13215a() {
        return this.f7749a;
    }

    /* renamed from: a */
    public ArrayList<C4596cr> m13216a() {
        return this.f7750a;
    }

    /* renamed from: a */
    public synchronized JSONObject m13217a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put("host", this.f7749a);
        JSONArray jSONArray = new JSONArray();
        Iterator<C4596cr> it = this.f7750a.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().mo28852a());
        }
        jSONObject.put("fbs", jSONArray);
        return jSONObject;
    }

    /* renamed from: a */
    public synchronized void mo28872a(C4596cr crVar) {
        int i = 0;
        while (true) {
            if (i >= this.f7750a.size()) {
                break;
            } else if (this.f7750a.get(i).mo28863a(crVar)) {
                this.f7750a.set(i, crVar);
                break;
            } else {
                i++;
            }
        }
        if (i >= this.f7750a.size()) {
            this.f7750a.add(crVar);
        }
    }

    /* renamed from: a */
    public synchronized void mo28873a(boolean z) {
        ArrayList<C4596cr> arrayList;
        for (int size = this.f7750a.size() - 1; size >= 0; size--) {
            C4596cr crVar = this.f7750a.get(size);
            if (z) {
                if (crVar.mo28868c()) {
                    arrayList = this.f7750a;
                }
            } else if (!crVar.mo28867b()) {
                arrayList = this.f7750a;
            }
            arrayList.remove(size);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7749a);
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        Iterator<C4596cr> it = this.f7750a.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        return sb.toString();
    }
}
