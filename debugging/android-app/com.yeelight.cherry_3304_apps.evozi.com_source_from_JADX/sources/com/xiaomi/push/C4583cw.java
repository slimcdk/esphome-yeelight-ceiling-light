package com.xiaomi.push;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.p271io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.cw */
class C4583cw {

    /* renamed from: a */
    private String f8350a;

    /* renamed from: a */
    private final ArrayList<C4582cv> f8351a = new ArrayList<>();

    public C4583cw() {
    }

    public C4583cw(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f8350a = str;
            return;
        }
        throw new IllegalArgumentException("the host is empty");
    }

    /* renamed from: a */
    public synchronized C4582cv mo24881a() {
        for (int size = this.f8351a.size() - 1; size >= 0; size--) {
            C4582cv cvVar = this.f8351a.get(size);
            if (cvVar.mo24863a()) {
                C4586cz.mo24892a().mo24889a(cvVar.mo24863a());
                return cvVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public synchronized C4583cw mo24882a(JSONObject jSONObject) {
        this.f8350a = jSONObject.getString("host");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f8351a.add(new C4582cv(this.f8350a).mo24862a(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    /* renamed from: a */
    public String m13641a() {
        return this.f8350a;
    }

    /* renamed from: a */
    public ArrayList<C4582cv> m13642a() {
        return this.f8351a;
    }

    /* renamed from: a */
    public synchronized JSONObject m13643a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put("host", this.f8350a);
        JSONArray jSONArray = new JSONArray();
        Iterator<C4582cv> it = this.f8351a.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().mo24863a());
        }
        jSONObject.put("fbs", jSONArray);
        return jSONObject;
    }

    /* renamed from: a */
    public synchronized void mo24883a(C4582cv cvVar) {
        int i = 0;
        while (true) {
            if (i >= this.f8351a.size()) {
                break;
            } else if (this.f8351a.get(i).mo24874a(cvVar)) {
                this.f8351a.set(i, cvVar);
                break;
            } else {
                i++;
            }
        }
        if (i >= this.f8351a.size()) {
            this.f8351a.add(cvVar);
        }
    }

    /* renamed from: a */
    public synchronized void mo24884a(boolean z) {
        ArrayList<C4582cv> arrayList;
        for (int size = this.f8351a.size() - 1; size >= 0; size--) {
            C4582cv cvVar = this.f8351a.get(size);
            if (z) {
                if (cvVar.mo24879c()) {
                    arrayList = this.f8351a;
                }
            } else if (!cvVar.mo24878b()) {
                arrayList = this.f8351a;
            }
            arrayList.remove(size);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8350a);
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        Iterator<C4582cv> it = this.f8351a.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        return sb.toString();
    }
}
