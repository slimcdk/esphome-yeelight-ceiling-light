package com.google.firebase.crashlytics.p110c.p122o.p124j;

import com.google.firebase.crashlytics.p110c.C2857b;
import com.google.firebase.crashlytics.p110c.p112g.C2870a;
import com.google.firebase.crashlytics.p110c.p112g.C2884h;
import com.google.firebase.crashlytics.p110c.p112g.C2935k;
import com.google.firebase.crashlytics.p110c.p115j.C2980a;
import com.google.firebase.crashlytics.p110c.p115j.C2981b;
import com.google.firebase.crashlytics.p110c.p115j.C2982c;
import com.google.firebase.crashlytics.p110c.p115j.C2983d;
import com.google.firebase.crashlytics.p110c.p122o.p123i.C3034g;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.firebase.crashlytics.c.o.j.c */
public class C3037c extends C2870a implements C3038d {

    /* renamed from: f */
    private C2857b f5921f;

    public C3037c(String str, String str2, C2982c cVar) {
        this(str, str2, cVar, C2980a.GET, C2857b.m8687f());
    }

    C3037c(String str, String str2, C2982c cVar, C2980a aVar, C2857b bVar) {
        super(str, str2, cVar, aVar);
        this.f5921f = bVar;
    }

    /* renamed from: g */
    private C2981b m9393g(C2981b bVar, C3034g gVar) {
        m9394h(bVar, "X-CRASHLYTICS-GOOGLE-APP-ID", gVar.f5911a);
        m9394h(bVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        m9394h(bVar, "X-CRASHLYTICS-API-CLIENT-VERSION", C2935k.m8990i());
        m9394h(bVar, "Accept", "application/json");
        m9394h(bVar, "X-CRASHLYTICS-DEVICE-MODEL", gVar.f5912b);
        m9394h(bVar, "X-CRASHLYTICS-OS-BUILD-VERSION", gVar.f5913c);
        m9394h(bVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", gVar.f5914d);
        m9394h(bVar, "X-CRASHLYTICS-INSTALLATION-ID", gVar.f5915e.mo17294a());
        return bVar;
    }

    /* renamed from: h */
    private void m9394h(C2981b bVar, String str, String str2) {
        if (str2 != null) {
            bVar.mo17334d(str, str2);
        }
    }

    /* renamed from: i */
    private JSONObject m9395i(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            C2857b bVar = this.f5921f;
            bVar.mo17131c("Failed to parse settings JSON from " + mo17158e(), e);
            C2857b bVar2 = this.f5921f;
            bVar2.mo17130b("Settings response " + str);
            return null;
        }
    }

    /* renamed from: j */
    private Map<String, String> m9396j(C3034g gVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", gVar.f5918h);
        hashMap.put("display_version", gVar.f5917g);
        hashMap.put("source", Integer.toString(gVar.f5919i));
        String str = gVar.f5916f;
        if (!C2884h.m8797D(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    /* renamed from: a */
    public JSONObject mo17425a(C3034g gVar, boolean z) {
        if (z) {
            try {
                Map<String, String> j = m9396j(gVar);
                C2981b d = mo17157d(j);
                m9393g(d, gVar);
                C2857b bVar = this.f5921f;
                bVar.mo17130b("Requesting settings from " + mo17158e());
                C2857b bVar2 = this.f5921f;
                bVar2.mo17130b("Settings query params were: " + j);
                C2983d b = d.mo17333b();
                C2857b bVar3 = this.f5921f;
                bVar3.mo17130b("Settings request ID: " + b.mo17342d("X-REQUEST-ID"));
                return mo17426k(b);
            } catch (IOException e) {
                this.f5921f.mo17133e("Settings request failed.", e);
                return null;
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public JSONObject mo17426k(C2983d dVar) {
        int b = dVar.mo17341b();
        C2857b bVar = this.f5921f;
        bVar.mo17130b("Settings result was: " + b);
        if (mo17427l(b)) {
            return m9395i(dVar.mo17340a());
        }
        C2857b bVar2 = this.f5921f;
        bVar2.mo17132d("Failed to retrieve settings from " + mo17158e());
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo17427l(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }
}
