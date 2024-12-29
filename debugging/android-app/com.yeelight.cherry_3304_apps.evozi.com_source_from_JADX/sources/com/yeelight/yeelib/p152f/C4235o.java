package com.yeelight.yeelib.p152f;

import android.text.TextUtils;
import com.miot.common.config.AppConfiguration;
import com.yeelight.yeelib.p187h.C9862d;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import com.yeelight.yeelib.utils.C10559w;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.p271io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.f.o */
public class C4235o {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final String f7348i = "o";

    /* renamed from: j */
    private static C4235o f7349j;

    /* renamed from: a */
    private Map<String, String> f7350a = new HashMap();

    /* renamed from: b */
    private Map<String, String> f7351b = new HashMap();

    /* renamed from: c */
    private String f7352c = null;

    /* renamed from: d */
    private String f7353d = null;

    /* renamed from: e */
    private String f7354e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f7355f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f7356g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f7357h = 3;

    /* renamed from: com.yeelight.yeelib.f.o$a */
    class C4236a implements C9874b<String> {
        C4236a() {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String unused = C4235o.this.f7356g = jSONObject.getString("ip");
                String unused2 = C4235o.this.f7355f = jSONObject.getString("server");
                String unused3 = C4235o.f7348i;
                "queryRecommendServer, onSuccess, result server = " + C4235o.this.f7355f + ", public IP = " + C4235o.this.f7356g;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String unused = C4235o.f7348i;
            "queryRecommendServer, onFailure!!!! exception message = " + str;
            if (C4235o.this.f7357h > 0) {
                C4235o.this.mo23569t();
                C4235o.m11784g(C4235o.this);
            }
        }
    }

    private C4235o() {
        this.f7350a.put(AppConfiguration.Locale.cn.name(), "openapp.io.mi.com");
        this.f7350a.put(AppConfiguration.Locale.sg.name(), "us.openapp.io.mi.com");
        this.f7350a.put(AppConfiguration.Locale.us.name(), "sg.openapp.io.mi.com");
        this.f7350a.put(AppConfiguration.Locale.de.name(), "de.openapp.io.mi.com");
        this.f7351b.put(AppConfiguration.Locale.cn.name(), "ot.io.mi.com");
        this.f7351b.put(AppConfiguration.Locale.sg.name(), "sg.ot.io.mi.com");
        this.f7351b.put(AppConfiguration.Locale.us.name(), "us.ot.io.mi.com");
        this.f7351b.put(AppConfiguration.Locale.de.name(), "de.ot.io.mi.com");
    }

    /* renamed from: g */
    static /* synthetic */ int m11784g(C4235o oVar) {
        int i = oVar.f7357h;
        oVar.f7357h = i - 1;
        return i;
    }

    /* renamed from: h */
    private void m11785h(StringBuffer stringBuffer, String str) {
        if (stringBuffer != null) {
            stringBuffer.append(str + IOUtils.LINE_SEPARATOR_UNIX);
        }
    }

    /* renamed from: k */
    public static C4235o m11786k() {
        if (f7349j == null) {
            f7349j = new C4235o();
        }
        return f7349j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x006a A[SYNTHETIC, Splitter:B:41:0x006a] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x007b A[SYNTHETIC, Splitter:B:50:0x007b] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m11787r(java.lang.String r6, java.lang.StringBuffer r7) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ping -c 4 "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r0 = 0
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x005e, all -> 0x005b }
            java.lang.Process r6 = r2.exec(r6)     // Catch:{ IOException -> 0x005e, all -> 0x005b }
            if (r6 != 0) goto L_0x0028
            java.lang.String r2 = "ping fail:process is null."
            r5.m11785h(r7, r2)     // Catch:{ IOException -> 0x0057, all -> 0x0053 }
            if (r6 == 0) goto L_0x0027
            r6.destroy()
        L_0x0027:
            return r1
        L_0x0028:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0057, all -> 0x0053 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0057, all -> 0x0053 }
            java.io.InputStream r4 = r6.getInputStream()     // Catch:{ IOException -> 0x0057, all -> 0x0053 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0057, all -> 0x0053 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0057, all -> 0x0053 }
        L_0x0036:
            java.lang.String r0 = r2.readLine()     // Catch:{ IOException -> 0x0051, all -> 0x004f }
            if (r0 == 0) goto L_0x0040
            r5.m11785h(r7, r0)     // Catch:{ IOException -> 0x0051, all -> 0x004f }
            goto L_0x0036
        L_0x0040:
            if (r6 == 0) goto L_0x0045
            r6.destroy()
        L_0x0045:
            r2.close()     // Catch:{ IOException -> 0x004a }
            r6 = 1
            return r6
        L_0x004a:
            r6 = move-exception
            r6.printStackTrace()
            return r1
        L_0x004f:
            r7 = move-exception
            goto L_0x0055
        L_0x0051:
            r7 = move-exception
            goto L_0x0059
        L_0x0053:
            r7 = move-exception
            r2 = r0
        L_0x0055:
            r0 = r6
            goto L_0x0074
        L_0x0057:
            r7 = move-exception
            r2 = r0
        L_0x0059:
            r0 = r6
            goto L_0x0060
        L_0x005b:
            r7 = move-exception
            r2 = r0
            goto L_0x0074
        L_0x005e:
            r7 = move-exception
            r2 = r0
        L_0x0060:
            r7.printStackTrace()     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0068
            r0.destroy()
        L_0x0068:
            if (r2 == 0) goto L_0x0072
            r2.close()     // Catch:{ IOException -> 0x006e }
            goto L_0x0072
        L_0x006e:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0072:
            return r1
        L_0x0073:
            r7 = move-exception
        L_0x0074:
            if (r0 == 0) goto L_0x0079
            r0.destroy()
        L_0x0079:
            if (r2 == 0) goto L_0x0084
            r2.close()     // Catch:{ IOException -> 0x007f }
            goto L_0x0084
        L_0x007f:
            r6 = move-exception
            r6.printStackTrace()
            return r1
        L_0x0084:
            goto L_0x0086
        L_0x0085:
            throw r7
        L_0x0086:
            goto L_0x0085
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p152f.C4235o.m11787r(java.lang.String, java.lang.StringBuffer):boolean");
    }

    /* renamed from: i */
    public boolean mo23560i() {
        String a = C4230l.m11766b().mo23552a();
        "Current locale: " + a;
        if (a != null && !a.isEmpty()) {
            String str = this.f7351b.get(a);
            "miot server domain: " + str;
            try {
                this.f7352c = InetAddress.getByName(str).getHostAddress();
                "Address for miot server: " + this.f7352c;
                return true;
            } catch (UnknownHostException e) {
                this.f7352c = null;
                e.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: j */
    public boolean mo23561j() {
        String a = C4230l.m11766b().mo23552a();
        "Current locale: " + a;
        if (a != null && !a.isEmpty()) {
            String str = this.f7350a.get(a);
            "openapp server domain: " + str;
            try {
                this.f7353d = InetAddress.getByName(str).getHostAddress();
                "Address for openapp server: " + this.f7353d;
                return true;
            } catch (UnknownHostException e) {
                this.f7353d = null;
                e.printStackTrace();
            }
        }
        return false;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x003a */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo23562l() {
        /*
            r6 = this;
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x0038, all -> 0x002d }
            java.lang.String r2 = "getprop net.dns1"
            java.lang.Process r1 = r1.exec(r2)     // Catch:{ IOException -> 0x0038, all -> 0x002d }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x002b, all -> 0x0026 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x002b, all -> 0x0026 }
            java.io.InputStream r4 = r1.getInputStream()     // Catch:{ IOException -> 0x002b, all -> 0x0026 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x002b, all -> 0x0026 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x002b, all -> 0x0026 }
            java.lang.String r0 = r2.readLine()     // Catch:{ IOException -> 0x003a, all -> 0x0024 }
            r2.close()     // Catch:{ IOException -> 0x0020 }
        L_0x0020:
            r1.destroy()
            return r0
        L_0x0024:
            r0 = move-exception
            goto L_0x0031
        L_0x0026:
            r2 = move-exception
            r5 = r2
            r2 = r0
            r0 = r5
            goto L_0x0031
        L_0x002b:
            r2 = r0
            goto L_0x003a
        L_0x002d:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
        L_0x0031:
            r2.close()     // Catch:{ IOException -> 0x0034 }
        L_0x0034:
            r1.destroy()
            throw r0
        L_0x0038:
            r1 = r0
            r2 = r1
        L_0x003a:
            r2.close()     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            r1.destroy()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p152f.C4235o.mo23562l():java.lang.String");
    }

    /* renamed from: m */
    public String mo23563m() {
        return this.f7352c;
    }

    /* renamed from: n */
    public String mo23564n() {
        return this.f7353d;
    }

    /* renamed from: o */
    public String mo23565o() {
        return this.f7354e;
    }

    /* renamed from: p */
    public String mo23566p() {
        return this.f7356g;
    }

    /* renamed from: q */
    public String mo23567q() {
        String f = C10559w.m25810f("RECOMMEND_SERVER", "");
        return TextUtils.isEmpty(f) ? this.f7355f : f;
    }

    /* renamed from: s */
    public void mo23568s() {
        String str = this.f7352c;
        if (str != null && !str.isEmpty()) {
            StringBuffer stringBuffer = new StringBuffer();
            m11787r(this.f7352c, stringBuffer);
            if (!TextUtils.isEmpty(stringBuffer)) {
                String[] split = stringBuffer.toString().split("---");
                this.f7354e = split[split.length - 1];
            }
        }
    }

    /* renamed from: t */
    public void mo23569t() {
        "queryRecommendServer, url = " + "https://cloud-us.yeelight.com/sapi/assign_server?scope=ip";
        C9862d.m24134d("https://cloud-us.yeelight.com/sapi/assign_server?scope=ip", String.class, new C4236a(), false);
    }
}
