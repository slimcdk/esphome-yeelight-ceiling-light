package com.google.firebase.installations.p135q;

import androidx.annotation.NonNull;
import com.google.firebase.C2816c;
import com.google.firebase.installations.p135q.C3294d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.installations.q.c */
public class C3292c {

    /* renamed from: a */
    private final File f6375a;
    @NonNull

    /* renamed from: b */
    private final C2816c f6376b;

    /* renamed from: com.google.firebase.installations.q.c$a */
    public enum C3293a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C3292c(@NonNull C2816c cVar) {
        File filesDir = cVar.mo17061g().getFilesDir();
        this.f6375a = new File(filesDir, "PersistedInstallation." + cVar.mo17065k() + ".json");
        this.f6376b = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x002e */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject m10215b() {
        /*
            r6 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 16384(0x4000, float:2.2959E-41)
            byte[] r2 = new byte[r1]
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException | JSONException -> 0x002f }
            java.io.File r4 = r6.f6375a     // Catch:{ IOException | JSONException -> 0x002f }
            r3.<init>(r4)     // Catch:{ IOException | JSONException -> 0x002f }
        L_0x0010:
            r4 = 0
            int r5 = r3.read(r2, r4, r1)     // Catch:{ all -> 0x0028 }
            if (r5 >= 0) goto L_0x0024
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0028 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0028 }
            r1.<init>(r0)     // Catch:{ all -> 0x0028 }
            r3.close()     // Catch:{ IOException | JSONException -> 0x002f }
            return r1
        L_0x0024:
            r0.write(r2, r4, r5)     // Catch:{ all -> 0x0028 }
            goto L_0x0010
        L_0x0028:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002a }
        L_0x002a:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x002e }
        L_0x002e:
            throw r0     // Catch:{ IOException | JSONException -> 0x002f }
        L_0x002f:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.p135q.C3292c.m10215b():org.json.JSONObject");
    }

    @NonNull
    /* renamed from: a */
    public C3294d mo17926a(@NonNull C3294d dVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.mo17907d());
            jSONObject.put("Status", dVar.mo17911g().ordinal());
            jSONObject.put("AuthToken", dVar.mo17905b());
            jSONObject.put("RefreshToken", dVar.mo17910f());
            jSONObject.put("TokenCreationEpochInSecs", dVar.mo17912h());
            jSONObject.put("ExpiresInSecs", dVar.mo17906c());
            jSONObject.put("FisError", dVar.mo17908e());
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f6376b.mo17061g().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(this.f6375a)) {
                return dVar;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }

    @NonNull
    /* renamed from: c */
    public C3294d mo17927c() {
        JSONObject b = m10215b();
        String optString = b.optString("Fid", (String) null);
        int optInt = b.optInt("Status", C3293a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = b.optString("AuthToken", (String) null);
        String optString3 = b.optString("RefreshToken", (String) null);
        long optLong = b.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = b.optLong("ExpiresInSecs", 0);
        String optString4 = b.optString("FisError", (String) null);
        C3294d.C3295a a = C3294d.m10218a();
        a.mo17919d(optString);
        a.mo17922g(C3293a.values()[optInt]);
        a.mo17917b(optString2);
        a.mo17921f(optString3);
        a.mo17923h(optLong);
        a.mo17918c(optLong2);
        a.mo17920e(optString4);
        return a.mo17916a();
    }
}
