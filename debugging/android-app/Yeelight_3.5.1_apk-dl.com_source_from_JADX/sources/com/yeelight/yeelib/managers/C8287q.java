package com.yeelight.yeelib.managers;

import android.text.TextUtils;
import com.miot.api.Constants;
import com.miot.bluetooth.channel.packet.Packet;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.retrofit.ContentType;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p051j4.C3283v;
import p051j4.C9190h;
import p129b4.C3988b;
import p134c4.C4007b;

/* renamed from: com.yeelight.yeelib.managers.q */
public class C8287q {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final String f14230c = "q";

    /* renamed from: d */
    private static C8287q f14231d;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f14232a = false;

    /* renamed from: b */
    C8292e f14233b;

    /* renamed from: com.yeelight.yeelib.managers.q$a */
    class C8288a implements C4007b<String> {
        C8288a(C8287q qVar) {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            String unused = C8287q.f14230c;
            StringBuilder sb = new StringBuilder();
            sb.append("report privacy policy onSuccess, result = ");
            sb.append(str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getInt("code") == 1) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(Constants.EXTRA_PUSH_MESSAGE);
                    String valueOf = String.valueOf(jSONObject2.getInt("mid"));
                    String string = jSONObject2.getString("operation");
                    int i = jSONObject2.getInt("timestamp");
                    int i2 = jSONObject2.getInt("operate_version");
                    String unused2 = C8287q.f14230c;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("report privacy policy onSuccess : mid = ");
                    sb2.append(valueOf);
                    sb2.append(" , operate = ");
                    sb2.append(string);
                    sb2.append(" , timestamp = ");
                    sb2.append(i);
                    sb2.append(" , operateversion = ");
                    sb2.append(i2);
                    return;
                }
                String unused3 = C8287q.f14230c;
            } catch (JSONException unused4) {
                String unused5 = C8287q.f14230c;
            }
        }

        public void onFailure(int i, String str) {
            String unused = C8287q.f14230c;
            StringBuilder sb = new StringBuilder();
            sb.append("report privacy policy onFailure, message = ");
            sb.append(str);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.q$b */
    class C8289b implements C4007b<String> {
        C8289b() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            JSONObject optJSONObject;
            JSONArray optJSONArray;
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (!jSONObject.has("code") || !TextUtils.equals(jSONObject.optString("code"), "200") || (optJSONObject = jSONObject.optJSONObject(Packet.DATA)) == null || (optJSONArray = optJSONObject.optJSONArray("rows")) == null) {
                        return;
                    }
                    if (optJSONArray.length() > 0) {
                        String replaceAll = optJSONArray.getJSONObject(0).optString(com.xiaomi.mipush.sdk.Constants.VERSION).replaceAll(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
                        if (C8287q.this.m19595m(C3283v.m8840f("PRIVACY_DATE_IN_CHINA", TimerCodec.DISENABLE)) < C8287q.this.m19595m(replaceAll)) {
                            C8287q.this.f14233b.mo30599e();
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

        public void onFailure(int i, String str) {
            String unused = C8287q.f14230c;
            StringBuilder sb = new StringBuilder();
            sb.append("is_local_control_user onFailure: ");
            sb.append(str);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.q$c */
    class C8290c implements C4007b<String> {
        C8290c() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getInt("code") == 1) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(Constants.EXTRA_PUSH_MESSAGE);
                    String valueOf = String.valueOf(jSONObject2.getInt("mid"));
                    String string = jSONObject2.getString("operation");
                    int i = jSONObject2.getInt("timestamp");
                    int i2 = jSONObject2.getInt("latest_version");
                    String unused = C8287q.f14230c;
                    StringBuilder sb = new StringBuilder();
                    sb.append("getPrivacyPolicyOperation onSuccess : mid = ");
                    sb.append(valueOf);
                    sb.append(" , operate = ");
                    sb.append(string);
                    sb.append(" , timestamp = ");
                    sb.append(i);
                    sb.append(" , latestversion = ");
                    sb.append(i2);
                    if (C8287q.this.f14233b == null) {
                        return;
                    }
                    if (string.equals("uncheck")) {
                        C8287q.this.f14233b.mo30600n();
                    } else if (i2 > i) {
                        C8287q.this.f14233b.mo30599e();
                    }
                } else {
                    String unused2 = C8287q.f14230c;
                }
            } catch (JSONException unused3) {
                String unused4 = C8287q.f14230c;
            }
        }

        public void onFailure(int i, String str) {
            String unused = C8287q.f14230c;
            StringBuilder sb = new StringBuilder();
            sb.append("getPrivacyPolicyOperation onFailure, message = ");
            sb.append(str);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.q$d */
    class C8291d implements C4007b<String> {
        C8291d() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            String unused = C8287q.f14230c;
            StringBuilder sb = new StringBuilder();
            sb.append("queryUserIsInLimitList onSuccess, return result: ");
            sb.append(str);
            try {
                if (new JSONObject(str).getInt("code") == 1) {
                    boolean unused2 = C8287q.this.f14232a = true;
                    C8292e eVar = C8287q.this.f14233b;
                    if (eVar != null) {
                        eVar.mo30596K();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String unused = C8287q.f14230c;
            StringBuilder sb = new StringBuilder();
            sb.append("queryUserIsInLimitList onFailure, message = ");
            sb.append(str);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.q$e */
    public interface C8292e {
        /* renamed from: K */
        void mo30596K();

        /* renamed from: e */
        void mo30599e();

        /* renamed from: n */
        void mo30600n();
    }

    /* renamed from: d */
    private void m19592d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("needDetail", false);
            jSONObject.put("pageNo", 1);
            jSONObject.put("pageSize", 1);
            jSONObject.put("country", "CN");
            jSONObject.put("language", "2");
            jSONObject.put("app", 3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C3988b.m11575k(AppUtils.f4992p + "apis/iot/v1/privacy/r/queryPrivacy/false", (Map<String, String>) null, (Map<String, String>) null, jSONObject.toString(), String.class, new C8289b(), true, ContentType.JSON);
    }

    /* renamed from: e */
    public static C8287q m19593e() {
        if (f14231d == null) {
            f14231d = new C8287q();
        }
        return f14231d;
    }

    /* renamed from: f */
    private void m19594f() {
        String str = AppUtils.f4993q + "privacy-operation";
        StringBuilder sb = new StringBuilder();
        sb.append("getPrivacyPolicyOperation, url = ");
        sb.append(str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mid", C3051a.m7925r().mo23366v());
            C3988b.m11572h(str, jSONObject.toString(), String.class, new C8290c());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public int m19595m(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: g */
    public void mo35240g() {
        if (mo35241h(C8281l.m19542b().mo35223a())) {
            m19592d();
        } else {
            m19594f();
        }
    }

    /* renamed from: h */
    public boolean mo35241h(String str) {
        return "cn".equals(str) && "zh_CN".equalsIgnoreCase(C8281l.m19542b().mo35224c());
    }

    /* renamed from: i */
    public boolean mo35242i() {
        return this.f14232a;
    }

    /* renamed from: j */
    public void mo35243j() {
        this.f14232a = false;
        String str = AppUtils.f4987k + "api/is_limit_mid/" + C3051a.m7925r().mo23366v();
        StringBuilder sb = new StringBuilder();
        sb.append("queryUserIsInLimitList url: ");
        sb.append(str);
        C3988b.m11567c(str, String.class, new C8291d());
    }

    /* renamed from: k */
    public void mo35244k(C8292e eVar) {
        this.f14233b = eVar;
    }

    /* renamed from: l */
    public void mo35245l(boolean z) {
        if (mo35241h(C8281l.m19542b().mo35223a())) {
            C3283v.m8846l("PRIVACY_DATE_IN_CHINA", C9190h.m22141a());
            return;
        }
        String str = z ? "check" : "uncheck";
        String str2 = AppUtils.f4993q + "operate-privacy";
        StringBuilder sb = new StringBuilder();
        sb.append("reportPrivacyOperation, url = ");
        sb.append(str2);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mid", C3051a.m7925r().mo23366v());
            jSONObject.put("timestamp", System.currentTimeMillis() / 1000);
            jSONObject.put("operation", str);
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("report privacy policy jsonObject: ");
            sb2.append(jSONObject2);
            C3988b.m11572h(str2, jSONObject2, String.class, new C8288a(this));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: n */
    public void mo35246n() {
        this.f14233b = null;
    }
}
