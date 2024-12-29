package com.google.firebase.crashlytics.p110c.p122o;

import androidx.core.app.NotificationCompat;
import com.google.firebase.crashlytics.p110c.p112g.C2946p;
import com.google.firebase.crashlytics.p110c.p122o.p123i.C3029b;
import com.google.firebase.crashlytics.p110c.p122o.p123i.C3030c;
import com.google.firebase.crashlytics.p110c.p122o.p123i.C3031d;
import com.google.firebase.crashlytics.p110c.p122o.p123i.C3032e;
import com.google.firebase.crashlytics.p110c.p122o.p123i.C3033f;
import com.miot.service.connection.wifi.WebShellActivity;
import org.json.JSONObject;

/* renamed from: com.google.firebase.crashlytics.c.o.b */
class C3020b implements C3026g {
    C3020b() {
    }

    /* renamed from: b */
    private static C3029b m9347b(JSONObject jSONObject) {
        return new C3029b(jSONObject.getString(NotificationCompat.CATEGORY_STATUS), jSONObject.getString(WebShellActivity.ARGS_KEY_URL), jSONObject.getString("reports_url"), jSONObject.getString("ndk_reports_url"), jSONObject.optBoolean("update_required", false));
    }

    /* renamed from: c */
    private static C3030c m9348c(JSONObject jSONObject) {
        return new C3030c(jSONObject.optBoolean("collect_reports", true));
    }

    /* renamed from: d */
    private static C3031d m9349d(JSONObject jSONObject) {
        return new C3031d(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    /* renamed from: e */
    static C3032e m9350e(C2946p pVar) {
        JSONObject jSONObject = new JSONObject();
        return new C3033f(m9351f(pVar, 3600, jSONObject), (C3029b) null, m9349d(jSONObject), m9348c(jSONObject), 0, 3600);
    }

    /* renamed from: f */
    private static long m9351f(C2946p pVar, long j, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return (j * 1000) + pVar.mo17181a();
    }

    /* renamed from: a */
    public C3033f mo17411a(C2946p pVar, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new C3033f(m9351f(pVar, (long) optInt2, jSONObject), m9347b(jSONObject.getJSONObject("app")), m9349d(jSONObject.getJSONObject("session")), m9348c(jSONObject.getJSONObject("features")), optInt, optInt2);
    }
}
