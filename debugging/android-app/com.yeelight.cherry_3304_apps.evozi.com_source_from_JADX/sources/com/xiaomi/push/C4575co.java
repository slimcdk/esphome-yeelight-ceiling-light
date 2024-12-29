package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.co */
public class C4575co implements C4580ct {

    /* renamed from: a */
    private static C4575co f8316a;

    /* renamed from: a */
    private int f8317a;

    /* renamed from: a */
    private Context f8318a;

    /* renamed from: a */
    private C4574cn f8319a;

    /* renamed from: a */
    private String f8320a;

    /* renamed from: a */
    private HashMap<String, C4573cm> f8321a;

    /* renamed from: b */
    private int f8322b;

    /* renamed from: b */
    private String f8323b;

    /* renamed from: c */
    private int f8324c;

    /* renamed from: c */
    private String f8325c;

    /* renamed from: d */
    private int f8326d;

    /* renamed from: a */
    public static synchronized C4575co m13593a() {
        C4575co coVar;
        synchronized (C4575co.class) {
            coVar = f8316a;
        }
        return coVar;
    }

    /* renamed from: a */
    private String m13594a(ArrayList<C4572cl> arrayList, String str) {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.f8320a)) {
            jSONObject.put("imei", C4578cr.m13607a(this.f8320a));
        }
        jSONObject.put("actionType", str);
        jSONObject.put("actionTime", System.currentTimeMillis());
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            JSONObject jSONObject2 = null;
            if (TextUtils.isEmpty(arrayList.get(i).f8310a)) {
                jSONObject2 = new JSONObject();
            } else {
                try {
                    jSONObject2 = new JSONObject(arrayList.get(i).f8310a);
                } catch (Exception unused) {
                }
            }
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            jSONObject2.put("adId", arrayList.get(i).f8309a);
            arrayList2.add(jSONObject2);
        }
        jSONObject.put("adList", new JSONArray(arrayList2));
        return Base64.encodeToString(jSONObject.toString().getBytes(), 2);
    }

    /* renamed from: a */
    private void m13595a(C4573cm cmVar) {
        if (!this.f8321a.containsKey(cmVar.f8313b)) {
            this.f8322b++;
            C4578cr.m13607a("send: " + this.f8322b);
            C4576cp cpVar = new C4576cp(this, this.f8323b, this.f8325c, cmVar);
            this.f8321a.put(cmVar.f8313b, cmVar);
            cpVar.execute(new String[0]);
        }
    }

    /* renamed from: a */
    private void m13596a(ArrayList<C4572cl> arrayList, String str, int i) {
        try {
            String a = m13594a(arrayList, str);
            String a2 = C4578cr.m13607a(a);
            if (m13595a(new C4573cm(i, a, a2))) {
                m13595a(new C4573cm(i, a, a2));
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    private boolean m13597a(C4573cm cmVar) {
        if (C4577cq.m13606a(this.f8318a)) {
            return true;
        }
        m13598b(cmVar);
        return false;
    }

    /* renamed from: b */
    private void m13598b(C4573cm cmVar) {
        this.f8326d++;
        C4578cr.m13607a("cacheCount: " + this.f8326d);
        this.f8319a.mo24848a(cmVar);
        this.f8319a.mo24847a();
    }

    /* renamed from: a */
    public void mo24849a(C4572cl clVar) {
        if (clVar.f8309a > 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(clVar);
            m13596a(arrayList, "click", clVar.f8308a);
        }
    }

    /* renamed from: a */
    public void mo24850a(Integer num, C4573cm cmVar) {
        if (this.f8321a.containsKey(cmVar.f8313b)) {
            if (num.intValue() != 0) {
                this.f8324c++;
                C4578cr.m13607a("faild: " + this.f8324c + " " + cmVar.f8313b + "  " + this.f8321a.size());
                m13598b(cmVar);
            } else {
                this.f8317a++;
                C4578cr.m13607a("success: " + this.f8317a);
            }
            this.f8321a.remove(cmVar.f8313b);
        }
    }

    /* renamed from: b */
    public void mo24851b(C4572cl clVar) {
        if (clVar.f8309a > 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(clVar);
            m13596a(arrayList, "remove", clVar.f8308a);
        }
    }

    /* renamed from: c */
    public void mo24852c(C4572cl clVar) {
        if (clVar.f8309a > 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(clVar);
            m13596a(arrayList, "received", clVar.f8308a);
        }
    }
}
