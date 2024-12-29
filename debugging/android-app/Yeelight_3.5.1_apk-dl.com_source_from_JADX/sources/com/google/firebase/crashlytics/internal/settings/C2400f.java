package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.C2247p;
import org.json.JSONObject;
import p118y0.C3916f;

/* renamed from: com.google.firebase.crashlytics.internal.settings.f */
public class C2400f {

    /* renamed from: a */
    private final C2247p f4017a;

    C2400f(C2247p pVar) {
        this.f4017a = pVar;
    }

    /* renamed from: a */
    private static C2401g m6377a(int i) {
        if (i == 3) {
            return new C2405k();
        }
        C3916f f = C3916f.m11190f();
        f.mo26401d("Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.");
        return new C2393b();
    }

    /* renamed from: b */
    public C2395d mo18978b(JSONObject jSONObject) {
        return m6377a(jSONObject.getInt("settings_version")).mo18966a(this.f4017a, jSONObject);
    }
}
