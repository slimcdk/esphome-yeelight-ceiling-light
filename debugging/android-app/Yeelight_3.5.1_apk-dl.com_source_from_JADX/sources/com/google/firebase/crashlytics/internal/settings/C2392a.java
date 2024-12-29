package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;
import p033f1.C3160f;
import p118y0.C3916f;

/* renamed from: com.google.firebase.crashlytics.internal.settings.a */
public class C2392a {

    /* renamed from: a */
    private final File f3993a;

    public C2392a(C3160f fVar) {
        this.f3993a = fVar.mo23659e("com.crashlytics.settings.json");
    }

    /* renamed from: a */
    private File m6343a() {
        return this.f3993a;
    }

    /* renamed from: b */
    public JSONObject mo18964b() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        C3916f.m11190f().mo26399b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            File a = m6343a();
            if (a.exists()) {
                fileInputStream = new FileInputStream(a);
                try {
                    jSONObject = new JSONObject(CommonUtils.m5531C(fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception e) {
                    e = e;
                    try {
                        C3916f.m11190f().mo26402e("Failed to fetch cached settings", e);
                        CommonUtils.m5536e(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        CommonUtils.m5536e(fileInputStream, "Error while closing settings cache file.");
                        throw th;
                    }
                }
            } else {
                C3916f.m11190f().mo26405i("Settings file does not exist.");
                jSONObject = null;
            }
            CommonUtils.m5536e(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
            C3916f.m11190f().mo26402e("Failed to fetch cached settings", e);
            CommonUtils.m5536e(fileInputStream, "Error while closing settings cache file.");
            return null;
        } catch (Throwable th2) {
            fileInputStream = null;
            th = th2;
            CommonUtils.m5536e(fileInputStream, "Error while closing settings cache file.");
            throw th;
        }
    }

    /* renamed from: c */
    public void mo18965c(long j, JSONObject jSONObject) {
        C3916f.m11190f().mo26405i("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                jSONObject.put("expires_at", j);
                FileWriter fileWriter2 = new FileWriter(m6343a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    CommonUtils.m5536e(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e) {
                    e = e;
                    fileWriter = fileWriter2;
                    try {
                        C3916f.m11190f().mo26402e("Failed to cache settings", e);
                        CommonUtils.m5536e(fileWriter, "Failed to close settings writer.");
                    } catch (Throwable th) {
                        th = th;
                        CommonUtils.m5536e(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    CommonUtils.m5536e(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                C3916f.m11190f().mo26402e("Failed to cache settings", e);
                CommonUtils.m5536e(fileWriter, "Failed to close settings writer.");
            }
        }
    }
}
