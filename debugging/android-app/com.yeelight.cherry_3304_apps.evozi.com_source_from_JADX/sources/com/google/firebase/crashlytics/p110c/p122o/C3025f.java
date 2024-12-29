package com.google.firebase.crashlytics.p110c.p122o;

import com.google.firebase.crashlytics.p110c.p112g.C2946p;
import com.google.firebase.crashlytics.p110c.p122o.p123i.C3033f;
import org.json.JSONObject;

/* renamed from: com.google.firebase.crashlytics.c.o.f */
public class C3025f {

    /* renamed from: a */
    private final C2946p f5885a;

    C3025f(C2946p pVar) {
        this.f5885a = pVar;
    }

    /* renamed from: a */
    private static C3026g m9375a(int i) {
        return i != 3 ? new C3020b() : new C3027h();
    }

    /* renamed from: b */
    public C3033f mo17418b(JSONObject jSONObject) {
        return m9375a(jSONObject.getInt("settings_version")).mo17411a(this.f5885a, jSONObject);
    }
}
