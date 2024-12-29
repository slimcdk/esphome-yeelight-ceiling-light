package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.C2247p;
import com.google.firebase.crashlytics.internal.settings.C2395d;
import org.json.JSONObject;

/* renamed from: com.google.firebase.crashlytics.internal.settings.k */
class C2405k implements C2401g {
    C2405k() {
    }

    /* renamed from: b */
    private static C2395d.C2396a m6383b(JSONObject jSONObject) {
        return new C2395d.C2396a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false));
    }

    /* renamed from: c */
    private static C2395d.C2397b m6384c(JSONObject jSONObject) {
        return new C2395d.C2397b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    /* renamed from: d */
    private static long m6385d(C2247p pVar, long j, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return (j * 1000) + pVar.mo18532a();
    }

    /* renamed from: a */
    public C2395d mo18966a(C2247p pVar, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        int optInt = jSONObject2.optInt("settings_version", 0);
        int optInt2 = jSONObject2.optInt("cache_duration", 3600);
        return new C2395d(m6385d(pVar, (long) optInt2, jSONObject2), m6384c(jSONObject2.has("session") ? jSONObject2.getJSONObject("session") : new JSONObject()), m6383b(jSONObject2.getJSONObject("features")), optInt, optInt2, jSONObject2.optDouble("on_demand_upload_rate_per_minute", 10.0d), jSONObject2.optDouble("on_demand_backoff_base", 1.2d), jSONObject2.optInt("on_demand_backoff_step_duration_seconds", 60));
    }
}
