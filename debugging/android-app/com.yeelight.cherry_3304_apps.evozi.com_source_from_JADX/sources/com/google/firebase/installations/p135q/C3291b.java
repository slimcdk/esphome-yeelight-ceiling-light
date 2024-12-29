package com.google.firebase.installations.p135q;

import android.content.SharedPreferences;
import android.util.Base64;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.stats.CodePackage;
import com.google.firebase.C2816c;
import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import com.xiaomi.mipush.sdk.Constants;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.installations.q.b */
public class C3291b {

    /* renamed from: c */
    private static final String[] f6372c = {"*", "FCM", CodePackage.GCM, ""};
    @GuardedBy("iidPrefs")

    /* renamed from: a */
    private final SharedPreferences f6373a;

    /* renamed from: b */
    private final String f6374b;

    public C3291b(@NonNull C2816c cVar) {
        this.f6373a = cVar.mo17061g().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f6374b = m10207b(cVar);
    }

    /* renamed from: a */
    private String m10206a(@NonNull String str, @NonNull String str2) {
        return "|T|" + str + "|" + str2;
    }

    /* renamed from: b */
    private static String m10207b(C2816c cVar) {
        String d = cVar.mo17064j().mo17743d();
        if (d != null) {
            return d;
        }
        String c = cVar.mo17064j().mo17742c();
        if (!c.startsWith("1:") && !c.startsWith("2:")) {
            return c;
        }
        String[] split = c.split(Constants.COLON_SEPARATOR);
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    @Nullable
    /* renamed from: c */
    private static String m10208c(@NonNull PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & ParameterInitDefType.CubemapSamplerInit) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private String m10209d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: e */
    private PublicKey m10210e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            "Invalid key stored " + e;
            return null;
        }
    }

    @Nullable
    /* renamed from: g */
    private String m10211g() {
        String string;
        synchronized (this.f6373a) {
            string = this.f6373a.getString("|S|id", (String) null);
        }
        return string;
    }

    @Nullable
    /* renamed from: h */
    private String m10212h() {
        synchronized (this.f6373a) {
            String string = this.f6373a.getString("|S||P|", (String) null);
            if (string == null) {
                return null;
            }
            PublicKey e = m10210e(string);
            if (e == null) {
                return null;
            }
            String c = m10208c(e);
            return c;
        }
    }

    @Nullable
    /* renamed from: f */
    public String mo17924f() {
        synchronized (this.f6373a) {
            String g = m10211g();
            if (g != null) {
                return g;
            }
            String h = m10212h();
            return h;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        return r4;
     */
    @androidx.annotation.Nullable
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo17925i() {
        /*
            r7 = this;
            android.content.SharedPreferences r0 = r7.f6373a
            monitor-enter(r0)
            java.lang.String[] r1 = f6372c     // Catch:{ all -> 0x0033 }
            int r2 = r1.length     // Catch:{ all -> 0x0033 }
            r3 = 0
        L_0x0007:
            r4 = 0
            if (r3 >= r2) goto L_0x0031
            r5 = r1[r3]     // Catch:{ all -> 0x0033 }
            java.lang.String r6 = r7.f6374b     // Catch:{ all -> 0x0033 }
            java.lang.String r5 = r7.m10206a(r6, r5)     // Catch:{ all -> 0x0033 }
            android.content.SharedPreferences r6 = r7.f6373a     // Catch:{ all -> 0x0033 }
            java.lang.String r4 = r6.getString(r5, r4)     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x002e
            boolean r5 = r4.isEmpty()     // Catch:{ all -> 0x0033 }
            if (r5 != 0) goto L_0x002e
            java.lang.String r1 = "{"
            boolean r1 = r4.startsWith(r1)     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x002c
            java.lang.String r4 = r7.m10209d(r4)     // Catch:{ all -> 0x0033 }
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x002e:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x0033:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            goto L_0x0037
        L_0x0036:
            throw r1
        L_0x0037:
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.p135q.C3291b.mo17925i():java.lang.String");
    }
}
