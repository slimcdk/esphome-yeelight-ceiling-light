package com.yeelight.yeelib.p152f;

import com.miot.api.Constants;
import com.yeelight.yeelib.p187h.C9862d;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import com.yeelight.yeelib.utils.C4308b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.f.q */
public class C9807q {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final String f17754c = "q";

    /* renamed from: d */
    private static C9807q f17755d;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f17756a = false;

    /* renamed from: b */
    C9811d f17757b;

    /* renamed from: com.yeelight.yeelib.f.q$a */
    class C9808a implements C9874b<String> {
        C9808a(C9807q qVar) {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            String unused = C9807q.f17754c;
            "report privacy policy onSuccess, result = " + str;
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getInt("code") == 1) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(Constants.EXTRA_PUSH_MESSAGE);
                    String valueOf = String.valueOf(jSONObject2.getInt("mid"));
                    String string = jSONObject2.getString("operation");
                    int i = jSONObject2.getInt("timestamp");
                    int i2 = jSONObject2.getInt("operate_version");
                    String unused2 = C9807q.f17754c;
                    "report privacy policy onSuccess : mid = " + valueOf + " , operate = " + string + " , timestamp = " + i + " , operateversion = " + i2;
                    return;
                }
                String unused3 = C9807q.f17754c;
            } catch (JSONException unused4) {
                String unused5 = C9807q.f17754c;
            }
        }

        public void onFailure(int i, String str) {
            String unused = C9807q.f17754c;
            "report privacy policy onFailure, message = " + str;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.q$b */
    class C9809b implements C9874b<String> {
        C9809b() {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getInt("code") == 1) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(Constants.EXTRA_PUSH_MESSAGE);
                    String valueOf = String.valueOf(jSONObject2.getInt("mid"));
                    String string = jSONObject2.getString("operation");
                    int i = jSONObject2.getInt("timestamp");
                    int i2 = jSONObject2.getInt("latest_version");
                    String unused = C9807q.f17754c;
                    "getPrivacyPolicyOperation onSuccess : mid = " + valueOf + " , operate = " + string + " , timestamp = " + i + " , latestversion = " + i2;
                    if (C9807q.this.f17757b == null) {
                        return;
                    }
                    if (string.equals("uncheck")) {
                        C9807q.this.f17757b.mo26576n();
                    } else if (i2 > i) {
                        C9807q.this.f17757b.mo26575e();
                    }
                } else {
                    String unused2 = C9807q.f17754c;
                }
            } catch (JSONException unused3) {
                String unused4 = C9807q.f17754c;
            }
        }

        public void onFailure(int i, String str) {
            String unused = C9807q.f17754c;
            "getPrivacyPolicyOperation onFailure, message = " + str;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.q$c */
    class C9810c implements C9874b<String> {
        C9810c() {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            String unused = C9807q.f17754c;
            "queryUserIsInLimitList onSuccess, return result: " + str;
            try {
                if (new JSONObject(str).getInt("code") == 1) {
                    boolean unused2 = C9807q.this.f17756a = true;
                    if (C9807q.this.f17757b != null) {
                        C9807q.this.f17757b.mo26573K();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String unused = C9807q.f17754c;
            "queryUserIsInLimitList onFailure, message = " + str;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.q$d */
    public interface C9811d {
        /* renamed from: K */
        void mo26573K();

        /* renamed from: e */
        void mo26575e();

        /* renamed from: n */
        void mo26576n();
    }

    /* renamed from: c */
    public static C9807q m23812c() {
        if (f17755d == null) {
            f17755d = new C9807q();
        }
        return f17755d;
    }

    /* renamed from: d */
    public void mo31674d() {
        String str = C4308b.f7492k + "privacy-operation";
        "getPrivacyPolicyOperation, url = " + str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mid", C4201a.m11607r().mo23452v());
            C9862d.m24138h(str, jSONObject.toString(), String.class, new C9809b());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    public boolean mo31675e() {
        return this.f17756a;
    }

    /* renamed from: f */
    public void mo31676f() {
        this.f17756a = false;
        String str = C4308b.f7490i + "api/is_limit_mid/" + C4201a.m11607r().mo23452v();
        "queryUserIsInLimitList url: " + str;
        C9862d.m24133c(str, String.class, new C9810c());
    }

    /* renamed from: g */
    public void mo31677g(C9811d dVar) {
        this.f17757b = dVar;
    }

    /* renamed from: h */
    public void mo31678h(boolean z) {
        String str = z ? "check" : "uncheck";
        String str2 = C4308b.f7492k + "operate-privacy";
        "reportPrivacyOperation, url = " + str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mid", C4201a.m11607r().mo23452v());
            jSONObject.put("timestamp", System.currentTimeMillis() / 1000);
            jSONObject.put("operation", str);
            String jSONObject2 = jSONObject.toString();
            "report privacy policy jsonObject: " + jSONObject2;
            C9862d.m24138h(str2, jSONObject2, String.class, new C9808a(this));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: i */
    public void mo31679i() {
        this.f17757b = null;
    }
}
