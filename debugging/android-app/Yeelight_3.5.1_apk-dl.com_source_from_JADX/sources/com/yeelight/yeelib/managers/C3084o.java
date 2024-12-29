package com.yeelight.yeelib.managers;

import android.text.TextUtils;
import com.miot.common.config.AppConfiguration;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.p194io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p051j4.C3283v;
import p129b4.C3988b;
import p134c4.C4007b;

/* renamed from: com.yeelight.yeelib.managers.o */
public class C3084o {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final String f4904i = "o";

    /* renamed from: j */
    private static C3084o f4905j;

    /* renamed from: a */
    private Map<String, String> f4906a = new HashMap();

    /* renamed from: b */
    private Map<String, String> f4907b = new HashMap();

    /* renamed from: c */
    private String f4908c = null;

    /* renamed from: d */
    private String f4909d = null;

    /* renamed from: e */
    private String f4910e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f4911f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f4912g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f4913h = 3;

    /* renamed from: com.yeelight.yeelib.managers.o$a */
    class C3085a implements C4007b<String> {
        C3085a() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String unused = C3084o.this.f4912g = jSONObject.getString("ip");
                String unused2 = C3084o.this.f4911f = jSONObject.getString("server");
                String unused3 = C3084o.f4904i;
                StringBuilder sb = new StringBuilder();
                sb.append("queryRecommendServer, onSuccess, result server = ");
                sb.append(C3084o.this.f4911f);
                sb.append(", public IP = ");
                sb.append(C3084o.this.f4912g);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String unused = C3084o.f4904i;
            StringBuilder sb = new StringBuilder();
            sb.append("queryRecommendServer, onFailure!!!! exception message = ");
            sb.append(str);
            if (C3084o.this.f4913h > 0) {
                C3084o.this.mo23462t();
                C3084o.m8094g(C3084o.this);
            }
        }
    }

    private C3084o() {
        Map<String, String> map = this.f4906a;
        AppConfiguration.Locale locale = AppConfiguration.Locale.cn;
        map.put(locale.name(), "openapp.io.mi.com");
        Map<String, String> map2 = this.f4906a;
        AppConfiguration.Locale locale2 = AppConfiguration.Locale.sg;
        map2.put(locale2.name(), "us.openapp.io.mi.com");
        Map<String, String> map3 = this.f4906a;
        AppConfiguration.Locale locale3 = AppConfiguration.Locale.us;
        map3.put(locale3.name(), "sg.openapp.io.mi.com");
        Map<String, String> map4 = this.f4906a;
        AppConfiguration.Locale locale4 = AppConfiguration.Locale.de;
        map4.put(locale4.name(), "de.openapp.io.mi.com");
        this.f4907b.put(locale.name(), "ot.io.mi.com");
        this.f4907b.put(locale2.name(), "sg.ot.io.mi.com");
        this.f4907b.put(locale3.name(), "us.ot.io.mi.com");
        this.f4907b.put(locale4.name(), "de.ot.io.mi.com");
    }

    /* renamed from: g */
    static /* synthetic */ int m8094g(C3084o oVar) {
        int i = oVar.f4913h;
        oVar.f4913h = i - 1;
        return i;
    }

    /* renamed from: h */
    private void m8095h(StringBuffer stringBuffer, String str) {
        if (stringBuffer != null) {
            stringBuffer.append(str + IOUtils.LINE_SEPARATOR_UNIX);
        }
    }

    /* renamed from: k */
    public static C3084o m8096k() {
        if (f4905j == null) {
            f4905j = new C3084o();
        }
        return f4905j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0068 A[SYNTHETIC, Splitter:B:40:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0079 A[SYNTHETIC, Splitter:B:49:0x0079] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m8097r(java.lang.String r6, java.lang.StringBuffer r7) {
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
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x005c, all -> 0x0059 }
            java.lang.Process r6 = r2.exec(r6)     // Catch:{ IOException -> 0x005c, all -> 0x0059 }
            if (r6 != 0) goto L_0x0028
            java.lang.String r2 = "ping fail:process is null."
            r5.m8095h(r7, r2)     // Catch:{ IOException -> 0x0055, all -> 0x0051 }
            if (r6 == 0) goto L_0x0027
            r6.destroy()
        L_0x0027:
            return r1
        L_0x0028:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0055, all -> 0x0051 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0055, all -> 0x0051 }
            java.io.InputStream r4 = r6.getInputStream()     // Catch:{ IOException -> 0x0055, all -> 0x0051 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0055, all -> 0x0051 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0055, all -> 0x0051 }
        L_0x0036:
            java.lang.String r0 = r2.readLine()     // Catch:{ IOException -> 0x004f, all -> 0x004d }
            if (r0 == 0) goto L_0x0040
            r5.m8095h(r7, r0)     // Catch:{ IOException -> 0x004f, all -> 0x004d }
            goto L_0x0036
        L_0x0040:
            r6.destroy()
            r2.close()     // Catch:{ IOException -> 0x0048 }
            r6 = 1
            return r6
        L_0x0048:
            r6 = move-exception
            r6.printStackTrace()
            return r1
        L_0x004d:
            r7 = move-exception
            goto L_0x0053
        L_0x004f:
            r7 = move-exception
            goto L_0x0057
        L_0x0051:
            r7 = move-exception
            r2 = r0
        L_0x0053:
            r0 = r6
            goto L_0x0072
        L_0x0055:
            r7 = move-exception
            r2 = r0
        L_0x0057:
            r0 = r6
            goto L_0x005e
        L_0x0059:
            r7 = move-exception
            r2 = r0
            goto L_0x0072
        L_0x005c:
            r7 = move-exception
            r2 = r0
        L_0x005e:
            r7.printStackTrace()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0066
            r0.destroy()
        L_0x0066:
            if (r2 == 0) goto L_0x0070
            r2.close()     // Catch:{ IOException -> 0x006c }
            goto L_0x0070
        L_0x006c:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0070:
            return r1
        L_0x0071:
            r7 = move-exception
        L_0x0072:
            if (r0 == 0) goto L_0x0077
            r0.destroy()
        L_0x0077:
            if (r2 == 0) goto L_0x0082
            r2.close()     // Catch:{ IOException -> 0x007d }
            goto L_0x0082
        L_0x007d:
            r6 = move-exception
            r6.printStackTrace()
            return r1
        L_0x0082:
            goto L_0x0084
        L_0x0083:
            throw r7
        L_0x0084:
            goto L_0x0083
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.managers.C3084o.m8097r(java.lang.String, java.lang.StringBuffer):boolean");
    }

    /* renamed from: i */
    public boolean mo23453i() {
        String a = C8281l.m19542b().mo35223a();
        StringBuilder sb = new StringBuilder();
        sb.append("Current locale: ");
        sb.append(a);
        if (a != null && !a.isEmpty()) {
            String str = this.f4907b.get(a);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("miot server domain: ");
            sb2.append(str);
            try {
                this.f4908c = InetAddress.getByName(str).getHostAddress();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Address for miot server: ");
                sb3.append(this.f4908c);
                return true;
            } catch (UnknownHostException e) {
                this.f4908c = null;
                e.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: j */
    public boolean mo23454j() {
        String a = C8281l.m19542b().mo35223a();
        StringBuilder sb = new StringBuilder();
        sb.append("Current locale: ");
        sb.append(a);
        if (a != null && !a.isEmpty()) {
            String str = this.f4906a.get(a);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("openapp server domain: ");
            sb2.append(str);
            try {
                this.f4909d = InetAddress.getByName(str).getHostAddress();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Address for openapp server: ");
                sb3.append(this.f4909d);
                return true;
            } catch (UnknownHostException e) {
                this.f4909d = null;
                e.printStackTrace();
            }
        }
        return false;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x003a */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo23455l() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.managers.C3084o.mo23455l():java.lang.String");
    }

    /* renamed from: m */
    public String mo23456m() {
        return this.f4908c;
    }

    /* renamed from: n */
    public String mo23457n() {
        return this.f4909d;
    }

    /* renamed from: o */
    public String mo23458o() {
        return this.f4910e;
    }

    /* renamed from: p */
    public String mo23459p() {
        return this.f4912g;
    }

    /* renamed from: q */
    public String mo23460q() {
        String f = C3283v.m8840f("RECOMMEND_SERVER", "");
        return TextUtils.isEmpty(f) ? this.f4911f : f;
    }

    /* renamed from: s */
    public void mo23461s() {
        String str = this.f4908c;
        if (str != null && !str.isEmpty()) {
            StringBuffer stringBuffer = new StringBuffer();
            m8097r(this.f4908c, stringBuffer);
            if (!TextUtils.isEmpty(stringBuffer)) {
                String[] split = stringBuffer.toString().split("---");
                this.f4910e = split[split.length - 1];
            }
        }
    }

    /* renamed from: t */
    public void mo23462t() {
        StringBuilder sb = new StringBuilder();
        sb.append("queryRecommendServer, url = ");
        sb.append("https://api-us.yeelight.com/sapi/assign_server?scope=ip");
        C3988b.m11568d("https://api-us.yeelight.com/sapi/assign_server?scope=ip", String.class, new C3085a(), false);
    }
}
