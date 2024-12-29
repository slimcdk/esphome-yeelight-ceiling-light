package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.apache.commons.p194io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.cr */
public class C4596cr {

    /* renamed from: a */
    private double f7735a = 0.1d;

    /* renamed from: a */
    private long f7736a;

    /* renamed from: a */
    public String f7737a = "";

    /* renamed from: a */
    private ArrayList<C4609da> f7738a = new ArrayList<>();

    /* renamed from: b */
    private long f7739b = 86400000;

    /* renamed from: b */
    public String f7740b;

    /* renamed from: c */
    public String f7741c;

    /* renamed from: d */
    public String f7742d;

    /* renamed from: e */
    public String f7743e;

    /* renamed from: f */
    public String f7744f;

    /* renamed from: g */
    public String f7745g;

    /* renamed from: h */
    protected String f7746h;

    /* renamed from: i */
    private String f7747i;

    /* renamed from: j */
    private String f7748j = "s.mi1.cc";

    public C4596cr(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f7736a = System.currentTimeMillis();
            this.f7738a.add(new C4609da(str, -1));
            this.f7737a = C4600cv.mo28881a();
            this.f7740b = str;
            return;
        }
        throw new IllegalArgumentException("the host is empty");
    }

    /* renamed from: c */
    private synchronized void m13190c(String str) {
        Iterator<C4609da> it = this.f7738a.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().f7775a, str)) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public synchronized C4596cr mo28851a(JSONObject jSONObject) {
        this.f7737a = jSONObject.optString("net");
        this.f7739b = jSONObject.getLong("ttl");
        this.f7735a = jSONObject.getDouble("pct");
        this.f7736a = jSONObject.getLong("ts");
        this.f7742d = jSONObject.optString("city");
        this.f7741c = jSONObject.optString("prv");
        this.f7745g = jSONObject.optString("cty");
        this.f7743e = jSONObject.optString("isp");
        this.f7744f = jSONObject.optString("ip");
        this.f7740b = jSONObject.optString("host");
        this.f7746h = jSONObject.optString("xf");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i = 0; i < jSONArray.length(); i++) {
            mo28857a(new C4609da().mo28896a(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    /* renamed from: a */
    public synchronized String mo28852a() {
        if (!TextUtils.isEmpty(this.f7747i)) {
            return this.f7747i;
        } else if (TextUtils.isEmpty(this.f7743e)) {
            return "hardcode_isp";
        } else {
            String a = C4561bp.m13047a((Object[]) new String[]{this.f7743e, this.f7741c, this.f7742d, this.f7745g, this.f7744f}, "_");
            this.f7747i = a;
            return a;
        }
    }

    /* renamed from: a */
    public synchronized ArrayList<String> m13193a() {
        return mo28854a(false);
    }

    /* renamed from: a */
    public ArrayList<String> mo28853a(String str) {
        if (!TextUtils.isEmpty(str)) {
            URL url = new URL(str);
            if (TextUtils.equals(url.getHost(), this.f7740b)) {
                ArrayList<String> arrayList = new ArrayList<>();
                Iterator<String> it = mo28854a(true).iterator();
                while (it.hasNext()) {
                    C4598ct a = C4598ct.m13220a(it.next(), url.getPort());
                    arrayList.add(new URL(url.getProtocol(), a.mo28875a(), a.mo28875a(), url.getFile()).toString());
                }
                return arrayList;
            }
            throw new IllegalArgumentException("the url is not supported by the fallback");
        }
        throw new IllegalArgumentException("the url is empty.");
    }

    /* renamed from: a */
    public synchronized ArrayList<String> mo28854a(boolean z) {
        ArrayList<String> arrayList;
        String substring;
        int size = this.f7738a.size();
        C4609da[] daVarArr = new C4609da[size];
        this.f7738a.toArray(daVarArr);
        Arrays.sort(daVarArr);
        arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            C4609da daVar = daVarArr[i];
            if (z) {
                substring = daVar.f7775a;
            } else {
                int indexOf = daVar.f7775a.indexOf(Constants.COLON_SEPARATOR);
                substring = indexOf != -1 ? daVar.f7775a.substring(0, indexOf) : daVar.f7775a;
            }
            arrayList.add(substring);
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized JSONObject m13196a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put("net", this.f7737a);
        jSONObject.put("ttl", this.f7739b);
        jSONObject.put("pct", this.f7735a);
        jSONObject.put("ts", this.f7736a);
        jSONObject.put("city", this.f7742d);
        jSONObject.put("prv", this.f7741c);
        jSONObject.put("cty", this.f7745g);
        jSONObject.put("isp", this.f7743e);
        jSONObject.put("ip", this.f7744f);
        jSONObject.put("host", this.f7740b);
        jSONObject.put("xf", this.f7746h);
        JSONArray jSONArray = new JSONArray();
        Iterator<C4609da> it = this.f7738a.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().mo28897a());
        }
        jSONObject.put("fbs", jSONArray);
        return jSONObject;
    }

    /* renamed from: a */
    public void mo28855a(double d) {
        this.f7735a = d;
    }

    /* renamed from: a */
    public void mo28856a(long j) {
        if (j > 0) {
            this.f7739b = j;
            return;
        }
        throw new IllegalArgumentException("the duration is invalid " + j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo28857a(C4609da daVar) {
        m13190c(daVar.f7775a);
        this.f7738a.add(daVar);
    }

    /* renamed from: a */
    public synchronized void m13200a(String str) {
        mo28857a(new C4609da(str));
    }

    /* renamed from: a */
    public void mo28858a(String str, int i, long j, long j2, Exception exc) {
        mo28861a(str, new C4595cq(i, j, j2, exc));
    }

    /* renamed from: a */
    public void mo28859a(String str, long j, long j2) {
        try {
            mo28865b(new URL(str).getHost(), j, j2);
        } catch (MalformedURLException unused) {
        }
    }

    /* renamed from: a */
    public void mo28860a(String str, long j, long j2, Exception exc) {
        try {
            mo28866b(new URL(str).getHost(), j, j2, exc);
        } catch (MalformedURLException unused) {
        }
    }

    /* renamed from: a */
    public synchronized void mo28861a(String str, C4595cq cqVar) {
        Iterator<C4609da> it = this.f7738a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C4609da next = it.next();
            if (TextUtils.equals(str, next.f7775a)) {
                next.mo28898a(cqVar);
                break;
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo28862a(String[] strArr) {
        int i;
        int size = this.f7738a.size() - 1;
        while (true) {
            i = 0;
            if (size < 0) {
                break;
            }
            int length = strArr.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (TextUtils.equals(this.f7738a.get(size).f7775a, strArr[i])) {
                    this.f7738a.remove(size);
                    break;
                }
                i++;
            }
            size--;
        }
        Iterator<C4609da> it = this.f7738a.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int i3 = it.next().f7773a;
            if (i3 > i2) {
                i2 = i3;
            }
        }
        while (i < strArr.length) {
            mo28857a(new C4609da(strArr[i], (strArr.length + i2) - i));
            i++;
        }
    }

    /* renamed from: a */
    public boolean m13206a() {
        return TextUtils.equals(this.f7737a, C4600cv.mo28881a());
    }

    /* renamed from: a */
    public boolean mo28863a(C4596cr crVar) {
        return TextUtils.equals(this.f7737a, crVar.f7737a);
    }

    /* renamed from: b */
    public void mo28864b(String str) {
        this.f7748j = str;
    }

    /* renamed from: b */
    public void mo28865b(String str, long j, long j2) {
        mo28858a(str, 0, j, j2, (Exception) null);
    }

    /* renamed from: b */
    public void mo28866b(String str, long j, long j2, Exception exc) {
        mo28858a(str, -1, j, j2, exc);
    }

    /* renamed from: b */
    public boolean mo28867b() {
        return System.currentTimeMillis() - this.f7736a < this.f7739b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo28868c() {
        long j = this.f7739b;
        if (864000000 >= j) {
            j = 864000000;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.f7736a;
        return currentTimeMillis - j2 > j || (currentTimeMillis - j2 > this.f7739b && this.f7737a.startsWith("WIFI-"));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7737a);
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        sb.append(mo28852a());
        Iterator<C4609da> it = this.f7738a.iterator();
        while (it.hasNext()) {
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append(it.next().toString());
        }
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        return sb.toString();
    }
}
