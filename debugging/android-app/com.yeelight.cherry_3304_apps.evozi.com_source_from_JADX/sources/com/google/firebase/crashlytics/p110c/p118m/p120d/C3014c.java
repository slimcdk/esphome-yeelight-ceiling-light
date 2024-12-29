package com.google.firebase.crashlytics.p110c.p118m.p120d;

import com.google.firebase.crashlytics.p110c.C2857b;
import com.google.firebase.crashlytics.p110c.p112g.C2870a;
import com.google.firebase.crashlytics.p110c.p112g.C2873b0;
import com.google.firebase.crashlytics.p110c.p115j.C2980a;
import com.google.firebase.crashlytics.p110c.p115j.C2981b;
import com.google.firebase.crashlytics.p110c.p115j.C2982c;
import com.google.firebase.crashlytics.p110c.p115j.C2983d;
import com.google.firebase.crashlytics.p110c.p118m.p119c.C3006a;
import com.google.firebase.crashlytics.p110c.p118m.p119c.C3008c;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.firebase.crashlytics.c.m.d.c */
public class C3014c extends C2870a implements C3013b {

    /* renamed from: f */
    private final String f5860f;

    C3014c(String str, String str2, C2982c cVar, C2980a aVar, String str3) {
        super(str, str2, cVar, aVar);
        this.f5860f = str3;
    }

    public C3014c(String str, String str2, C2982c cVar, String str3) {
        this(str, str2, cVar, C2980a.POST, str3);
    }

    /* renamed from: g */
    private C2981b m9330g(C2981b bVar, C3006a aVar) {
        bVar.mo17334d("X-CRASHLYTICS-GOOGLE-APP-ID", aVar.f5848b);
        bVar.mo17334d("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        bVar.mo17334d("X-CRASHLYTICS-API-CLIENT-VERSION", this.f5860f);
        for (Map.Entry<String, String> e : aVar.f5849c.mo17400a().entrySet()) {
            bVar.mo17335e(e);
        }
        return bVar;
    }

    /* renamed from: h */
    private C2981b m9331h(C2981b bVar, C3008c cVar) {
        bVar.mo17337g("report[identifier]", cVar.mo17401b());
        if (cVar.mo17403d().length == 1) {
            C2857b.m8687f().mo17130b("Adding single file " + cVar.mo17404e() + " to report " + cVar.mo17401b());
            bVar.mo17338h("report[file]", cVar.mo17404e(), "application/octet-stream", cVar.mo17402c());
            return bVar;
        }
        int i = 0;
        for (File file : cVar.mo17403d()) {
            C2857b.m8687f().mo17130b("Adding file " + file.getName() + " to report " + cVar.mo17401b());
            StringBuilder sb = new StringBuilder();
            sb.append("report[file");
            sb.append(i);
            sb.append("]");
            bVar.mo17338h(sb.toString(), file.getName(), "application/octet-stream", file);
            i++;
        }
        return bVar;
    }

    /* renamed from: b */
    public boolean mo17407b(C3006a aVar, boolean z) {
        if (z) {
            C2981b c = mo17156c();
            m9330g(c, aVar);
            m9331h(c, aVar.f5849c);
            C2857b f = C2857b.m8687f();
            f.mo17130b("Sending report to: " + mo17158e());
            try {
                C2983d b = c.mo17333b();
                int b2 = b.mo17341b();
                C2857b f2 = C2857b.m8687f();
                f2.mo17130b("Create report request ID: " + b.mo17342d("X-REQUEST-ID"));
                C2857b f3 = C2857b.m8687f();
                f3.mo17130b("Result was: " + b2);
                return C2873b0.m8750a(b2) == 0;
            } catch (IOException e) {
                C2857b.m8687f().mo17133e("Create report HTTP request failed.", e);
                throw new RuntimeException(e);
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }
}
