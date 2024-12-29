package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mistatistic.sdk.MiStatInterface;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.apache.commons.p271io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.cv */
public class C4582cv {

    /* renamed from: a */
    private double f8336a = 0.1d;

    /* renamed from: a */
    private long f8337a;

    /* renamed from: a */
    public String f8338a = "";

    /* renamed from: a */
    private ArrayList<C4595de> f8339a = new ArrayList<>();

    /* renamed from: b */
    private long f8340b = MiStatInterface.MAX_UPLOAD_INTERVAL;

    /* renamed from: b */
    public String f8341b;

    /* renamed from: c */
    public String f8342c;

    /* renamed from: d */
    public String f8343d;

    /* renamed from: e */
    public String f8344e;

    /* renamed from: f */
    public String f8345f;

    /* renamed from: g */
    public String f8346g;

    /* renamed from: h */
    protected String f8347h;

    /* renamed from: i */
    private String f8348i;

    /* renamed from: j */
    private String f8349j = "s.mi1.cc";

    public C4582cv(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f8337a = System.currentTimeMillis();
            this.f8339a.add(new C4595de(str, -1));
            this.f8338a = C4586cz.mo24892a();
            this.f8341b = str;
            return;
        }
        throw new IllegalArgumentException("the host is empty");
    }

    /* renamed from: c */
    private synchronized void m13616c(String str) {
        Iterator<C4595de> it = this.f8339a.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().f8376a, str)) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public synchronized C4582cv mo24862a(JSONObject jSONObject) {
        this.f8338a = jSONObject.optString("net");
        this.f8340b = jSONObject.getLong("ttl");
        this.f8336a = jSONObject.getDouble("pct");
        this.f8337a = jSONObject.getLong("ts");
        this.f8343d = jSONObject.optString("city");
        this.f8342c = jSONObject.optString("prv");
        this.f8346g = jSONObject.optString("cty");
        this.f8344e = jSONObject.optString("isp");
        this.f8345f = jSONObject.optString("ip");
        this.f8341b = jSONObject.optString("host");
        this.f8347h = jSONObject.optString("xf");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i = 0; i < jSONArray.length(); i++) {
            mo24868a(new C4595de().mo24906a(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    /* renamed from: a */
    public synchronized String mo24863a() {
        if (!TextUtils.isEmpty(this.f8348i)) {
            return this.f8348i;
        } else if (TextUtils.isEmpty(this.f8344e)) {
            return "hardcode_isp";
        } else {
            String a = C4532bf.m13436a((Object[]) new String[]{this.f8344e, this.f8342c, this.f8343d, this.f8346g, this.f8345f}, "_");
            this.f8348i = a;
            return a;
        }
    }

    /* renamed from: a */
    public synchronized ArrayList<String> m13619a() {
        return mo24865a(false);
    }

    /* renamed from: a */
    public ArrayList<String> mo24864a(String str) {
        if (!TextUtils.isEmpty(str)) {
            URL url = new URL(str);
            if (TextUtils.equals(url.getHost(), this.f8341b)) {
                ArrayList<String> arrayList = new ArrayList<>();
                Iterator<String> it = mo24865a(true).iterator();
                while (it.hasNext()) {
                    C4584cx a = C4584cx.m13646a(it.next(), url.getPort());
                    arrayList.add(new URL(url.getProtocol(), a.mo24886a(), a.mo24886a(), url.getFile()).toString());
                }
                return arrayList;
            }
            throw new IllegalArgumentException("the url is not supported by the fallback");
        }
        throw new IllegalArgumentException("the url is empty.");
    }

    /* renamed from: a */
    public synchronized ArrayList<String> mo24865a(boolean z) {
        ArrayList<String> arrayList;
        String substring;
        int size = this.f8339a.size();
        C4595de[] deVarArr = new C4595de[size];
        this.f8339a.toArray(deVarArr);
        Arrays.sort(deVarArr);
        arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            C4595de deVar = deVarArr[i];
            if (z) {
                substring = deVar.f8376a;
            } else {
                int indexOf = deVar.f8376a.indexOf(Constants.COLON_SEPARATOR);
                substring = indexOf != -1 ? deVar.f8376a.substring(0, indexOf) : deVar.f8376a;
            }
            arrayList.add(substring);
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized JSONObject m13622a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put("net", this.f8338a);
        jSONObject.put("ttl", this.f8340b);
        jSONObject.put("pct", this.f8336a);
        jSONObject.put("ts", this.f8337a);
        jSONObject.put("city", this.f8343d);
        jSONObject.put("prv", this.f8342c);
        jSONObject.put("cty", this.f8346g);
        jSONObject.put("isp", this.f8344e);
        jSONObject.put("ip", this.f8345f);
        jSONObject.put("host", this.f8341b);
        jSONObject.put("xf", this.f8347h);
        JSONArray jSONArray = new JSONArray();
        Iterator<C4595de> it = this.f8339a.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().mo24907a());
        }
        jSONObject.put("fbs", jSONArray);
        return jSONObject;
    }

    /* renamed from: a */
    public void mo24866a(double d) {
        this.f8336a = d;
    }

    /* renamed from: a */
    public void mo24867a(long j) {
        if (j > 0) {
            this.f8340b = j;
            return;
        }
        throw new IllegalArgumentException("the duration is invalid " + j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo24868a(C4595de deVar) {
        m13616c(deVar.f8376a);
        this.f8339a.add(deVar);
    }

    /* renamed from: a */
    public synchronized void m13626a(String str) {
        mo24868a(new C4595de(str));
    }

    /* renamed from: a */
    public void mo24869a(String str, int i, long j, long j2, Exception exc) {
        mo24872a(str, new C4581cu(i, j, j2, exc));
    }

    /* renamed from: a */
    public void mo24870a(String str, long j, long j2) {
        try {
            mo24876b(new URL(str).getHost(), j, j2);
        } catch (MalformedURLException unused) {
        }
    }

    /* renamed from: a */
    public void mo24871a(String str, long j, long j2, Exception exc) {
        try {
            mo24877b(new URL(str).getHost(), j, j2, exc);
        } catch (MalformedURLException unused) {
        }
    }

    /* renamed from: a */
    public synchronized void mo24872a(String str, C4581cu cuVar) {
        Iterator<C4595de> it = this.f8339a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C4595de next = it.next();
            if (TextUtils.equals(str, next.f8376a)) {
                next.mo24908a(cuVar);
                break;
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo24873a(String[] strArr) {
        int i;
        int size = this.f8339a.size() - 1;
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
                if (TextUtils.equals(this.f8339a.get(size).f8376a, strArr[i])) {
                    this.f8339a.remove(size);
                    break;
                }
                i++;
            }
            size--;
        }
        Iterator<C4595de> it = this.f8339a.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C4595de next = it.next();
            if (next.f8374a > i2) {
                i2 = next.f8374a;
            }
        }
        while (i < strArr.length) {
            mo24868a(new C4595de(strArr[i], (strArr.length + i2) - i));
            i++;
        }
    }

    /* renamed from: a */
    public boolean m13632a() {
        return TextUtils.equals(this.f8338a, C4586cz.mo24892a());
    }

    /* renamed from: a */
    public boolean mo24874a(C4582cv cvVar) {
        return TextUtils.equals(this.f8338a, cvVar.f8338a);
    }

    /* renamed from: b */
    public void mo24875b(String str) {
        this.f8349j = str;
    }

    /* renamed from: b */
    public void mo24876b(String str, long j, long j2) {
        mo24869a(str, 0, j, j2, (Exception) null);
    }

    /* renamed from: b */
    public void mo24877b(String str, long j, long j2, Exception exc) {
        mo24869a(str, -1, j, j2, exc);
    }

    /* renamed from: b */
    public boolean mo24878b() {
        return System.currentTimeMillis() - this.f8337a < this.f8340b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo24879c() {
        long j = this.f8340b;
        if (864000000 >= j) {
            j = 864000000;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.f8337a;
        return currentTimeMillis - j2 > j || (currentTimeMillis - j2 > this.f8340b && this.f8338a.startsWith("WIFI-"));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8338a);
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        sb.append(mo24863a());
        Iterator<C4595de> it = this.f8339a.iterator();
        while (it.hasNext()) {
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append(it.next().toString());
        }
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        return sb.toString();
    }
}
