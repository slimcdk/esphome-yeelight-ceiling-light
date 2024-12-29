package com.google.firebase.crashlytics.p110c.p122o.p124j;

import com.google.firebase.crashlytics.p110c.C2857b;
import com.google.firebase.crashlytics.p110c.p112g.C2870a;
import com.google.firebase.crashlytics.p110c.p112g.C2873b0;
import com.google.firebase.crashlytics.p110c.p112g.C2884h;
import com.google.firebase.crashlytics.p110c.p115j.C2980a;
import com.google.firebase.crashlytics.p110c.p115j.C2981b;
import com.google.firebase.crashlytics.p110c.p115j.C2982c;
import com.google.firebase.crashlytics.p110c.p115j.C2983d;
import com.google.firebase.crashlytics.p110c.p122o.p123i.C3028a;
import java.io.IOException;

/* renamed from: com.google.firebase.crashlytics.c.o.j.a */
abstract class C3035a extends C2870a {

    /* renamed from: f */
    private final String f5920f;

    public C3035a(String str, String str2, C2982c cVar, C2980a aVar, String str3) {
        super(str, str2, cVar, aVar);
        this.f5920f = str3;
    }

    /* renamed from: g */
    private C2981b m9390g(C2981b bVar, C3028a aVar) {
        bVar.mo17334d("X-CRASHLYTICS-ORG-ID", aVar.f5886a);
        bVar.mo17334d("X-CRASHLYTICS-GOOGLE-APP-ID", aVar.f5887b);
        bVar.mo17334d("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        bVar.mo17334d("X-CRASHLYTICS-API-CLIENT-VERSION", this.f5920f);
        return bVar;
    }

    /* renamed from: h */
    private C2981b m9391h(C2981b bVar, C3028a aVar) {
        bVar.mo17337g("org_id", aVar.f5886a);
        bVar.mo17337g("app[identifier]", aVar.f5888c);
        bVar.mo17337g("app[name]", aVar.f5892g);
        bVar.mo17337g("app[display_version]", aVar.f5889d);
        bVar.mo17337g("app[build_version]", aVar.f5890e);
        bVar.mo17337g("app[source]", Integer.toString(aVar.f5893h));
        bVar.mo17337g("app[minimum_sdk_version]", aVar.f5894i);
        bVar.mo17337g("app[built_sdk_version]", aVar.f5895j);
        if (!C2884h.m8797D(aVar.f5891f)) {
            bVar.mo17337g("app[instance_identifier]", aVar.f5891f);
        }
        return bVar;
    }

    /* renamed from: i */
    public boolean mo17424i(C3028a aVar, boolean z) {
        if (z) {
            C2981b c = mo17156c();
            m9390g(c, aVar);
            m9391h(c, aVar);
            C2857b f = C2857b.m8687f();
            f.mo17130b("Sending app info to " + mo17158e());
            try {
                C2983d b = c.mo17333b();
                int b2 = b.mo17341b();
                String str = "POST".equalsIgnoreCase(c.mo17336f()) ? "Create" : "Update";
                C2857b f2 = C2857b.m8687f();
                f2.mo17130b(str + " app request ID: " + b.mo17342d("X-REQUEST-ID"));
                C2857b f3 = C2857b.m8687f();
                f3.mo17130b("Result was " + b2);
                return C2873b0.m8750a(b2) == 0;
            } catch (IOException e) {
                C2857b.m8687f().mo17133e("HTTP request failed.", e);
                throw new RuntimeException(e);
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }
}
