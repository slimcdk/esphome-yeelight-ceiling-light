package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.C2247p;
import com.google.firebase.crashlytics.internal.settings.C2395d;
import org.json.JSONObject;

/* renamed from: com.google.firebase.crashlytics.internal.settings.b */
class C2393b implements C2401g {
    C2393b() {
    }

    /* renamed from: b */
    static C2395d m6346b(C2247p pVar) {
        return new C2395d(((long) 3600000) + pVar.mo18532a(), new C2395d.C2397b(8, 4), new C2395d.C2396a(true, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    /* renamed from: a */
    public C2395d mo18966a(C2247p pVar, JSONObject jSONObject) {
        return m6346b(pVar);
    }
}
