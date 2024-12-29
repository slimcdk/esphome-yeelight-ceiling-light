package com.yeelight.yeelib.retrofit.Interceptor;

import com.google.gson.C2469e;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.utils.AppUtils;
import java.io.EOFException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import okhttp3.C3505a0;
import okhttp3.C3509b0;
import okhttp3.C3518c0;
import okhttp3.C3548v;
import okhttp3.C3558z;
import okhttp3.C9834u;
import okio.C3564c;
import org.json.JSONException;
import org.json.JSONObject;
import p051j4.C3278f;

public class HttpResponseFailureInterceptor implements C9834u {

    /* renamed from: c */
    private static final Charset f14411c = StandardCharsets.UTF_8;

    /* renamed from: d */
    private static final String f14412d = HttpResponseFailureInterceptor.class.getSimpleName();

    /* renamed from: a */
    private final C2469e f14413a = new C2469e();

    /* renamed from: b */
    private final List<String> f14414b = new ArrayList<String>() {
        {
            add("api/is_limit_mid/");
            add("sapi/assign_server");
            add("apis/iot/v1/privacy/r/queryPrivacy/false");
            add("android/score_type/");
            add("firmware/update");
        }
    };

    private static class HttpErrorBean implements Serializable {
        private String requestBody;
        private String requestHeader;
        private String responseBody;
        private int responseHttpCode;
        private String responseHttpMessage;
        private String uid = C3051a.m7925r().mo23366v();
        private String url;

        public HttpErrorBean(String str, String str2, String str3, int i, String str4, String str5) {
            this.url = str;
            this.requestHeader = str2;
            this.requestBody = str3;
            this.responseHttpCode = i;
            this.responseHttpMessage = str4;
            this.responseBody = str5;
        }

        public String getRequestBody() {
            return this.requestBody;
        }

        public String getRequestHeader() {
            return this.requestHeader;
        }

        public String getResponseBody() {
            return this.responseBody;
        }

        public int getResponseHttpCode() {
            return this.responseHttpCode;
        }

        public String getResponseHttpMessage() {
            return this.responseHttpMessage;
        }

        public String getUid() {
            return this.uid;
        }

        public String getUrl() {
            return this.url;
        }

        public void setRequestBody(String str) {
            this.requestBody = str;
        }

        public void setRequestHeader(String str) {
            this.requestHeader = str;
        }

        public void setResponseBody(String str) {
            this.responseBody = str;
        }

        public void setResponseHttpCode(int i) {
            this.responseHttpCode = i;
        }

        public void setResponseHttpMessage(String str) {
            this.responseHttpMessage = str;
        }

        public void setUid(String str) {
            this.uid = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }
    }

    /* renamed from: b */
    private String m19933b(C3558z zVar) {
        String str;
        C3505a0 a = zVar.mo24652a();
        if (!(a != null)) {
            return null;
        }
        C3564c cVar = new C3564c();
        a.mo24353f(cVar);
        Charset charset = f14411c;
        C3548v b = a.mo24352b();
        if (b != null) {
            charset = b.mo24594b(charset);
        }
        if (m19935d(cVar)) {
            str = cVar.mo24780s(charset);
        } else {
            str = zVar.mo24658g() + " (binary " + a.mo24351a() + "-byte requestBodyText omitted)";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("requestBodyText: ");
        sb.append(str);
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m19934c(okhttp3.C3509b0 r5) {
        /*
            r4 = this;
            okhttp3.c0 r0 = r5.mo24356a()
            if (r0 != 0) goto L_0x0009
            java.lang.String r5 = ""
            return r5
        L_0x0009:
            okio.e r1 = r0.mo24150k()
            okhttp3.s r5 = r5.mo24363k()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1.mo24721B0(r2)
            okio.c r1 = r1.mo24724F()
            java.lang.String r2 = "Content-Encoding"
            java.lang.String r5 = r5.mo24544c(r2)
            java.lang.String r2 = "gzip"
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x004c
            r5 = 0
            okio.j r2 = new okio.j     // Catch:{ all -> 0x0043 }
            okio.c r1 = r1.clone()     // Catch:{ all -> 0x0043 }
            r2.<init>(r1)     // Catch:{ all -> 0x0043 }
            okio.c r1 = new okio.c     // Catch:{ all -> 0x0041 }
            r1.<init>()     // Catch:{ all -> 0x0041 }
            r1.mo24781s0(r2)     // Catch:{ all -> 0x0041 }
            r2.close()
            goto L_0x004c
        L_0x0041:
            r5 = move-exception
            goto L_0x0046
        L_0x0043:
            r0 = move-exception
            r2 = r5
            r5 = r0
        L_0x0046:
            if (r2 == 0) goto L_0x004b
            r2.close()
        L_0x004b:
            throw r5
        L_0x004c:
            java.nio.charset.Charset r5 = f14411c
            okhttp3.v r0 = r0.mo24149f()
            if (r0 == 0) goto L_0x0058
            java.nio.charset.Charset r5 = r0.mo24594b(r5)
        L_0x0058:
            boolean r0 = m19935d(r1)
            if (r0 != 0) goto L_0x0079
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "binary "
            r5.append(r0)
            long r0 = r1.mo24758i1()
            r5.append(r0)
            java.lang.String r0 = "-byte body omitted)"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            return r5
        L_0x0079:
            okio.c r0 = r1.clone()
            java.lang.String r5 = r0.mo24780s(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.retrofit.Interceptor.HttpResponseFailureInterceptor.m19934c(okhttp3.b0):java.lang.String");
    }

    /* renamed from: d */
    static boolean m19935d(C3564c cVar) {
        try {
            C3564c cVar2 = new C3564c();
            cVar.mo24747d(cVar2, 0, cVar.mo24758i1() < 64 ? cVar.mo24758i1() : 64);
            for (int i = 0; i < 16; i++) {
                if (cVar2.mo24734Q()) {
                    return true;
                }
                int j0 = cVar2.mo24760j0();
                if (Character.isISOControl(j0) && !Character.isWhitespace(j0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: e */
    private boolean m19936e(int i) {
        return i == 0 || i == 1 || i == 200;
    }

    /* renamed from: f */
    private boolean m19937f(String str) {
        if (str.contains(AppUtils.f4997u) || str.contains(AppUtils.f4998v)) {
            return true;
        }
        for (String contains : this.f14414b) {
            if (str.contains(contains)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C3509b0 mo35530a(C9834u.C9835a aVar) {
        C3558z a = aVar.mo38901a();
        C3509b0 d = aVar.mo38904d(a);
        String tVar = a.mo24660i().toString();
        if (!AppUtils.m8292m(tVar) || m19937f(tVar)) {
            return d;
        }
        C3518c0 a2 = d.mo24356a();
        if (!d.mo24364l()) {
            StringBuilder sb = new StringBuilder();
            sb.append("http error code: ");
            sb.append(d.mo24359d());
            C3278f.m8797b(new AppUtils.SuicideException("HTTP_ERROR_EXCEPTION", this.f14413a.mo19234r(new HttpErrorBean(tVar, a.mo24656e().toString(), m19933b(a), d.mo24359d(), d.mo24365m(), (String) null))));
        }
        if (d.mo24364l() && a2 != null) {
            String c = m19934c(d);
            try {
                JSONObject jSONObject = new JSONObject(c);
                if (!jSONObject.isNull("code") && !m19936e(jSONObject.optInt("code"))) {
                    C3278f.m8797b(new AppUtils.SuicideException("YEELIGHT_SERVER_ERROR_EXCEPTION", this.f14413a.mo19234r(new HttpErrorBean(a.mo24660i().toString(), a.mo24656e().toString(), m19933b(a), d.mo24359d(), d.mo24365m(), c))));
                }
            } catch (JSONException e) {
                C3278f.m8797b(new AppUtils.SuicideException("YEELIGHT_SERVER_ERROR_EXCEPTION", this.f14413a.mo19234r(new HttpErrorBean(a.mo24660i().toString(), a.mo24656e().toString(), m19933b(a), d.mo24359d(), d.mo24365m(), c))));
                e.printStackTrace();
            }
        }
        return d;
    }
}
