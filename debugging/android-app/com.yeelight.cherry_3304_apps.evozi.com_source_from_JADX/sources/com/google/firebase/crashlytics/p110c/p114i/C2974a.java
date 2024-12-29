package com.google.firebase.crashlytics.p110c.p114i;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.p110c.C2857b;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.crashlytics.c.i.a */
class C2974a {

    /* renamed from: a */
    private final Context f5783a;

    /* renamed from: b */
    private final C2975a f5784b;

    /* renamed from: com.google.firebase.crashlytics.c.i.a$a */
    interface C2975a {
        /* renamed from: a */
        String mo17332a(File file);
    }

    C2974a(Context context, C2975a aVar) {
        this.f5783a = context;
        this.f5784b = aVar;
    }

    @NonNull
    /* renamed from: b */
    private File m9137b(File file) {
        if (Build.VERSION.SDK_INT < 9 || !file.getAbsolutePath().startsWith("/data")) {
            return file;
        }
        try {
            return new File(this.f5783a.getPackageManager().getApplicationInfo(this.f5783a.getPackageName(), 0).nativeLibraryDir, file.getName());
        } catch (PackageManager.NameNotFoundException e) {
            C2857b.m8687f().mo17133e("Error getting ApplicationInfo", e);
            return file;
        }
    }

    @NonNull
    /* renamed from: c */
    private static JSONObject m9138c(String str, C2977c cVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("base_address", cVar.f5785a);
        jSONObject.put("size", cVar.f5786b);
        jSONObject.put("name", cVar.f5788d);
        jSONObject.put("uuid", str);
        return jSONObject;
    }

    @NonNull
    /* renamed from: d */
    private static byte[] m9139d(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("binary_images", jSONArray);
            return jSONObject.toString().getBytes(Charset.forName("UTF-8"));
        } catch (JSONException e) {
            C2857b.m8687f().mo17137j("Binary images string is null", e);
            return new byte[0];
        }
    }

    @NonNull
    /* renamed from: e */
    private File m9140e(String str) {
        File file = new File(str);
        return !file.exists() ? m9137b(file) : file;
    }

    /* renamed from: f */
    private static boolean m9141f(C2977c cVar) {
        return (cVar.f5787c.indexOf(120) == -1 || cVar.f5788d.indexOf(47) == -1) ? false : true;
    }

    @Nullable
    /* renamed from: g */
    private JSONObject m9142g(String str) {
        C2977c a = C2978d.m9147a(str);
        if (a != null && m9141f(a)) {
            try {
                try {
                    return m9138c(this.f5784b.mo17332a(m9140e(a.f5788d)), a);
                } catch (JSONException e) {
                    C2857b.m8687f().mo17131c("Could not create a binary image json string", e);
                    return null;
                }
            } catch (IOException e2) {
                C2857b f = C2857b.m8687f();
                f.mo17131c("Could not generate ID for file " + a.f5788d, e2);
            }
        }
        return null;
    }

    @NonNull
    /* renamed from: h */
    private JSONArray m9143h(BufferedReader bufferedReader) {
        JSONArray jSONArray = new JSONArray();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return jSONArray;
            }
            JSONObject g = m9142g(readLine);
            if (g != null) {
                jSONArray.put(g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public byte[] mo17331a(BufferedReader bufferedReader) {
        return m9139d(m9143h(bufferedReader));
    }
}
