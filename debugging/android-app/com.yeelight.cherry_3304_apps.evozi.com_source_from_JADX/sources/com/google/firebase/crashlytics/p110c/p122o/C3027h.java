package com.google.firebase.crashlytics.p110c.p122o;

import androidx.core.app.NotificationCompat;
import com.google.firebase.crashlytics.p110c.p112g.C2946p;
import com.google.firebase.crashlytics.p110c.p122o.p123i.C3029b;
import com.google.firebase.crashlytics.p110c.p122o.p123i.C3030c;
import com.google.firebase.crashlytics.p110c.p122o.p123i.C3031d;
import com.google.firebase.crashlytics.p110c.p122o.p123i.C3033f;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.google.firebase.crashlytics.c.o.h */
class C3027h implements C3026g {
    C3027h() {
    }

    /* renamed from: b */
    private static C3029b m9378b(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        String string = jSONObject2.getString(NotificationCompat.CATEGORY_STATUS);
        boolean equals = "new".equals(string);
        String string2 = jSONObject.getString("bundle_id");
        String string3 = jSONObject.getString("org_id");
        if (equals) {
            str = "https://update.crashlytics.com/spi/v1/platforms/android/apps";
        } else {
            str = String.format(Locale.US, "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s", new Object[]{string2});
        }
        return new C3029b(string, str, String.format(Locale.US, "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports", new Object[]{string2}), String.format(Locale.US, "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps", new Object[]{string2}), string2, string3, jSONObject2.optBoolean("update_required", false), jSONObject2.optInt("report_upload_variant", 0), jSONObject2.optInt("native_report_upload_variant", 0));
    }

    /* renamed from: c */
    private static C3030c m9379c(JSONObject jSONObject) {
        return new C3030c(jSONObject.optBoolean("collect_reports", true));
    }

    /* renamed from: d */
    private static C3031d m9380d() {
        return new C3031d(8, 4);
    }

    /* renamed from: e */
    private static long m9381e(C2946p pVar, long j, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return (j * 1000) + pVar.mo17181a();
    }

    /* renamed from: a */
    public C3033f mo17411a(C2946p pVar, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new C3033f(m9381e(pVar, (long) optInt2, jSONObject), m9378b(jSONObject.getJSONObject("fabric"), jSONObject.getJSONObject("app")), m9380d(), m9379c(jSONObject.getJSONObject("features")), optInt, optInt2);
    }
}
