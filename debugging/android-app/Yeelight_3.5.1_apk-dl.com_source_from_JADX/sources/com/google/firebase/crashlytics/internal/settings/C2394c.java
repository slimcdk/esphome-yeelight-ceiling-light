package com.google.firebase.crashlytics.internal.settings;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.common.C2237k;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p029e1.C3145a;
import p029e1.C3146b;
import p029e1.C3147c;
import p118y0.C3916f;

/* renamed from: com.google.firebase.crashlytics.internal.settings.c */
class C2394c implements C2404j {

    /* renamed from: a */
    private final String f3994a;

    /* renamed from: b */
    private final C3146b f3995b;

    /* renamed from: c */
    private final C3916f f3996c;

    public C2394c(String str, C3146b bVar) {
        this(str, bVar, C3916f.m11190f());
    }

    C2394c(String str, C3146b bVar, C3916f fVar) {
        if (str != null) {
            this.f3996c = fVar;
            this.f3995b = bVar;
            this.f3994a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    /* renamed from: b */
    private C3145a m6348b(C3145a aVar, C2403i iVar) {
        m6349c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", iVar.f4018a);
        m6349c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        m6349c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", C2237k.m5699i());
        m6349c(aVar, "Accept", "application/json");
        m6349c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", iVar.f4019b);
        m6349c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", iVar.f4020c);
        m6349c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", iVar.f4021d);
        m6349c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", iVar.f4022e.mo18611a());
        return aVar;
    }

    /* renamed from: c */
    private void m6349c(C3145a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.mo23634d(str, str2);
        }
    }

    /* renamed from: e */
    private JSONObject m6350e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            C3916f fVar = this.f3996c;
            fVar.mo26408l("Failed to parse settings JSON from " + this.f3994a, e);
            C3916f fVar2 = this.f3996c;
            fVar2.mo26407k("Settings response " + str);
            return null;
        }
    }

    /* renamed from: f */
    private Map<String, String> m6351f(C2403i iVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", iVar.f4025h);
        hashMap.put("display_version", iVar.f4024g);
        hashMap.put("source", Integer.toString(iVar.f4026i));
        String str = iVar.f4023f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    /* renamed from: a */
    public JSONObject mo18967a(C2403i iVar, boolean z) {
        if (z) {
            try {
                Map<String, String> f = m6351f(iVar);
                C3145a b = m6348b(mo18968d(f), iVar);
                C3916f fVar = this.f3996c;
                fVar.mo26399b("Requesting settings from " + this.f3994a);
                C3916f fVar2 = this.f3996c;
                fVar2.mo26405i("Settings query params were: " + f);
                return mo18969g(b.mo23633c());
            } catch (IOException e) {
                this.f3996c.mo26402e("Settings request failed.", e);
                return null;
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C3145a mo18968d(Map<String, String> map) {
        C3145a a = this.f3995b.mo23635a(this.f3994a, map);
        return a.mo23634d("User-Agent", "Crashlytics Android SDK/" + C2237k.m5699i()).mo23634d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public JSONObject mo18969g(C3147c cVar) {
        int b = cVar.mo23637b();
        C3916f fVar = this.f3996c;
        fVar.mo26405i("Settings response code was: " + b);
        if (mo18970h(b)) {
            return m6350e(cVar.mo23636a());
        }
        C3916f fVar2 = this.f3996c;
        fVar2.mo26401d("Settings request failed; (status: " + b + ") from " + this.f3994a);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo18970h(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }
}
