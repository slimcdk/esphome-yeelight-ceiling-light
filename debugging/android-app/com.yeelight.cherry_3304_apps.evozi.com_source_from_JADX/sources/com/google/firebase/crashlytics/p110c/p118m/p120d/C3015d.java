package com.google.firebase.crashlytics.p110c.p118m.p120d;

import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.p110c.C2857b;
import com.google.firebase.crashlytics.p110c.p112g.C2870a;
import com.google.firebase.crashlytics.p110c.p112g.C2873b0;
import com.google.firebase.crashlytics.p110c.p112g.C2935k;
import com.google.firebase.crashlytics.p110c.p115j.C2980a;
import com.google.firebase.crashlytics.p110c.p115j.C2981b;
import com.google.firebase.crashlytics.p110c.p115j.C2982c;
import com.google.firebase.crashlytics.p110c.p118m.p119c.C3006a;
import com.google.firebase.crashlytics.p110c.p118m.p119c.C3008c;
import com.miot.common.device.parser.xml.DddTag;
import java.io.File;
import java.io.IOException;

/* renamed from: com.google.firebase.crashlytics.c.m.d.d */
public class C3015d extends C2870a implements C3013b {

    /* renamed from: f */
    private final String f5861f;

    public C3015d(String str, String str2, C2982c cVar, String str3) {
        super(str, str2, cVar, C2980a.POST);
        this.f5861f = str3;
    }

    /* renamed from: g */
    private C2981b m9333g(C2981b bVar, String str) {
        bVar.mo17334d("User-Agent", "Crashlytics Android SDK/" + C2935k.m8990i());
        bVar.mo17334d("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        bVar.mo17334d("X-CRASHLYTICS-API-CLIENT-VERSION", this.f5861f);
        bVar.mo17334d("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        return bVar;
    }

    /* renamed from: h */
    private C2981b m9334h(C2981b bVar, @Nullable String str, C3008c cVar) {
        String name;
        String str2;
        if (str != null) {
            bVar.mo17337g("org_id", str);
        }
        bVar.mo17337g("report_id", cVar.mo17401b());
        for (File file : cVar.mo17403d()) {
            if (file.getName().equals("minidump")) {
                name = file.getName();
                str2 = "minidump_file";
            } else if (file.getName().equals("metadata")) {
                name = file.getName();
                str2 = "crash_meta_file";
            } else if (file.getName().equals("binaryImages")) {
                name = file.getName();
                str2 = "binary_images_file";
            } else if (file.getName().equals("session")) {
                name = file.getName();
                str2 = "session_meta_file";
            } else if (file.getName().equals("app")) {
                name = file.getName();
                str2 = "app_meta_file";
            } else if (file.getName().equals(DddTag.DEVICE)) {
                name = file.getName();
                str2 = "device_meta_file";
            } else if (file.getName().equals("os")) {
                name = file.getName();
                str2 = "os_meta_file";
            } else if (file.getName().equals("user")) {
                name = file.getName();
                str2 = "user_meta_file";
            } else if (file.getName().equals("logs")) {
                name = file.getName();
                str2 = "logs_file";
            } else if (file.getName().equals("keys")) {
                name = file.getName();
                str2 = "keys_file";
            }
            bVar.mo17338h(str2, name, "application/octet-stream", file);
        }
        return bVar;
    }

    /* renamed from: b */
    public boolean mo17407b(C3006a aVar, boolean z) {
        if (z) {
            C2981b c = mo17156c();
            m9333g(c, aVar.f5848b);
            m9334h(c, aVar.f5847a, aVar.f5849c);
            C2857b f = C2857b.m8687f();
            f.mo17130b("Sending report to: " + mo17158e());
            try {
                int b = c.mo17333b().mo17341b();
                C2857b f2 = C2857b.m8687f();
                f2.mo17130b("Result was: " + b);
                return C2873b0.m8750a(b) == 0;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }
}
