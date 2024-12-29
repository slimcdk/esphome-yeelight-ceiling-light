package com.google.firebase.iid;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.iid.a0 */
final class C3205a0 {

    /* renamed from: d */
    private static final long f6196d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a */
    final String f6197a;

    /* renamed from: b */
    private final String f6198b;

    /* renamed from: c */
    private final long f6199c;

    private C3205a0(String str, String str2, long j) {
        this.f6197a = str;
        this.f6198b = str2;
        this.f6199c = j;
    }

    /* renamed from: a */
    static C3205a0 m10024a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C3205a0(str, (String) null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C3205a0(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to parse token: ");
            sb.append(valueOf);
            sb.toString();
            return null;
        }
    }

    /* renamed from: b */
    static String m10025b(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(valueOf);
            sb.toString();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo17804c(String str) {
        return System.currentTimeMillis() > this.f6199c + f6196d || !str.equals(this.f6198b);
    }
}
