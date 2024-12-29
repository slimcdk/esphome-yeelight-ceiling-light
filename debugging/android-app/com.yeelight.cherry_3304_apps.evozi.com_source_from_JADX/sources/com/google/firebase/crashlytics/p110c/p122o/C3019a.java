package com.google.firebase.crashlytics.p110c.p122o;

import android.content.Context;
import com.google.firebase.crashlytics.p110c.C2857b;
import com.google.firebase.crashlytics.p110c.p112g.C2884h;
import com.google.firebase.crashlytics.p110c.p116k.C2992i;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* renamed from: com.google.firebase.crashlytics.c.o.a */
public class C3019a {

    /* renamed from: a */
    private final Context f5870a;

    public C3019a(Context context) {
        this.f5870a = context;
    }

    /* renamed from: a */
    private File m9344a() {
        return new File(new C2992i(this.f5870a).mo17358b(), "com.crashlytics.settings.json");
    }

    /* renamed from: b */
    public JSONObject mo17409b() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        C2857b.m8687f().mo17130b("Reading cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            File a = m9344a();
            if (a.exists()) {
                fileInputStream = new FileInputStream(a);
                try {
                    jSONObject = new JSONObject(C2884h.m8803J(fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception e) {
                    e = e;
                    try {
                        C2857b.m8687f().mo17133e("Failed to fetch cached settings", e);
                        C2884h.m8808e(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        C2884h.m8808e(fileInputStream, "Error while closing settings cache file.");
                        throw th;
                    }
                }
            } else {
                C2857b.m8687f().mo17130b("No cached settings found.");
                jSONObject = null;
            }
            C2884h.m8808e(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
            C2857b.m8687f().mo17133e("Failed to fetch cached settings", e);
            C2884h.m8808e(fileInputStream, "Error while closing settings cache file.");
            return null;
        } catch (Throwable th2) {
            fileInputStream = null;
            th = th2;
            C2884h.m8808e(fileInputStream, "Error while closing settings cache file.");
            throw th;
        }
    }

    /* renamed from: c */
    public void mo17410c(long j, JSONObject jSONObject) {
        C2857b.m8687f().mo17130b("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                jSONObject.put("expires_at", j);
                FileWriter fileWriter2 = new FileWriter(m9344a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    C2884h.m8808e(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e) {
                    e = e;
                    fileWriter = fileWriter2;
                    try {
                        C2857b.m8687f().mo17133e("Failed to cache settings", e);
                        C2884h.m8808e(fileWriter, "Failed to close settings writer.");
                    } catch (Throwable th) {
                        th = th;
                        C2884h.m8808e(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    C2884h.m8808e(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                C2857b.m8687f().mo17133e("Failed to cache settings", e);
                C2884h.m8808e(fileWriter, "Failed to close settings writer.");
            }
        }
    }
}
