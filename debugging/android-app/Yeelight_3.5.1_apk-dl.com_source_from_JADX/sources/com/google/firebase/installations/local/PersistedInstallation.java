package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import com.google.firebase.C2406d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class PersistedInstallation {

    /* renamed from: a */
    private File f4113a;
    @NonNull

    /* renamed from: b */
    private final C2406d f4114b;

    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(@NonNull C2406d dVar) {
        this.f4114b = dVar;
    }

    /* renamed from: a */
    private File m6534a() {
        if (this.f4113a == null) {
            synchronized (this) {
                if (this.f4113a == null) {
                    File filesDir = this.f4114b.mo18983j().getFilesDir();
                    this.f4113a = new File(filesDir, "PersistedInstallation." + this.f4114b.mo18986n() + ".json");
                }
            }
        }
        return this.f4113a;
    }

    /* renamed from: c */
    private JSONObject m6535c() {
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            fileInputStream = new FileInputStream(m6534a());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @NonNull
    /* renamed from: b */
    public C2440b mo19064b(@NonNull C2440b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.mo19068d());
            jSONObject.put("Status", bVar.mo19072g().ordinal());
            jSONObject.put("AuthToken", bVar.mo19066b());
            jSONObject.put("RefreshToken", bVar.mo19071f());
            jSONObject.put("TokenCreationEpochInSecs", bVar.mo19073h());
            jSONObject.put("ExpiresInSecs", bVar.mo19067c());
            jSONObject.put("FisError", bVar.mo19069e());
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f4114b.mo18983j().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(m6534a())) {
                return bVar;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }

    @NonNull
    /* renamed from: d */
    public C2440b mo19065d() {
        JSONObject c = m6535c();
        String optString = c.optString("Fid", (String) null);
        int optInt = c.optInt("Status", RegistrationStatus.ATTEMPT_MIGRATION.ordinal());
        String optString2 = c.optString("AuthToken", (String) null);
        String optString3 = c.optString("RefreshToken", (String) null);
        long optLong = c.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = c.optLong("ExpiresInSecs", 0);
        return C2440b.m6554a().mo19080d(optString).mo19083g(RegistrationStatus.values()[optInt]).mo19078b(optString2).mo19082f(optString3).mo19084h(optLong).mo19079c(optLong2).mo19081e(c.optString("FisError", (String) null)).mo19077a();
    }
}
