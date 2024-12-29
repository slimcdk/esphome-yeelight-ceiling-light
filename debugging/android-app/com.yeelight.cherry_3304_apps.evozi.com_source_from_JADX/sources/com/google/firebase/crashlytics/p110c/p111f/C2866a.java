package com.google.firebase.crashlytics.p110c.p111f;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.p109a.C2801a;
import com.google.firebase.crashlytics.p110c.C2857b;
import com.google.firebase.crashlytics.p110c.p111f.C2868b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.crashlytics.c.f.a */
public class C2866a implements C2801a.C2803b, C2868b {

    /* renamed from: a */
    private final C2801a f5523a;

    /* renamed from: b */
    private final C2867a f5524b;

    /* renamed from: c */
    private C2868b.C2869a f5525c;

    /* renamed from: d */
    private C2801a.C2802a f5526d;

    /* renamed from: com.google.firebase.crashlytics.c.f.a$a */
    public interface C2867a {
        /* renamed from: a */
        void mo17154a(String str);
    }

    public C2866a(C2801a aVar, C2867a aVar2) {
        this.f5523a = aVar;
        this.f5524b = aVar2;
    }

    /* renamed from: c */
    private void m8735c(String str, Bundle bundle) {
        try {
            this.f5524b.mo17154a("$A$:" + m8737e(str, bundle));
        } catch (JSONException unused) {
            C2857b.m8687f().mo17136i("Unable to serialize Firebase Analytics event.");
        }
    }

    /* renamed from: d */
    private void m8736d(int i, @Nullable Bundle bundle) {
        C2868b.C2869a aVar = this.f5525c;
        if (aVar != null) {
            aVar.mo17155a(i, bundle);
        }
    }

    /* renamed from: e */
    private static String m8737e(@NonNull String str, @NonNull Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    /* renamed from: a */
    public void mo17152a(@Nullable C2868b.C2869a aVar) {
        this.f5525c = aVar;
    }

    /* renamed from: b */
    public void mo17053b(int i, @Nullable Bundle bundle) {
        C2857b f = C2857b.m8687f();
        f.mo17130b("AnalyticsConnectorReceiver received message: " + i + " " + bundle);
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            if ("clx".equals(bundle2.getString("_o"))) {
                m8736d(i, bundle);
                return;
            }
            String string = bundle.getString("name");
            if (string != null) {
                m8735c(string, bundle2);
            }
        }
    }

    public boolean register() {
        C2801a aVar = this.f5523a;
        if (aVar == null) {
            C2857b.m8687f().mo17130b("Firebase Analytics is not present; you will not see automatic logging of events before a crash occurs.");
            return false;
        }
        C2801a.C2802a b = aVar.mo17052b("clx", this);
        this.f5526d = b;
        if (b == null) {
            C2857b.m8687f().mo17130b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            C2801a.C2802a b2 = this.f5523a.mo17052b("crash", this);
            this.f5526d = b2;
            if (b2 != null) {
                C2857b.m8687f().mo17136i("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return this.f5526d != null;
    }
}
