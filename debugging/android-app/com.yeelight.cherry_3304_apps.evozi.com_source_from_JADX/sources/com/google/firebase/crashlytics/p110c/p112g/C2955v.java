package com.google.firebase.crashlytics.p110c.p112g;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.p110c.C2857b;
import com.google.firebase.iid.p134b.C3207a;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* renamed from: com.google.firebase.crashlytics.c.g.v */
public class C2955v implements C2956w {

    /* renamed from: f */
    private static final Pattern f5744f = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: g */
    private static final String f5745g = Pattern.quote(MiotCloudImpl.COOKIE_PATH);

    /* renamed from: a */
    private final C2957x f5746a;

    /* renamed from: b */
    private final Context f5747b;

    /* renamed from: c */
    private final String f5748c;

    /* renamed from: d */
    private final C3207a f5749d;

    /* renamed from: e */
    private String f5750e;

    public C2955v(Context context, String str, C3207a aVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str != null) {
            this.f5747b = context;
            this.f5748c = str;
            this.f5749d = aVar;
            this.f5746a = new C2957x();
        } else {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
    }

    /* renamed from: b */
    private synchronized String m9055b(String str, SharedPreferences sharedPreferences) {
        String c;
        c = m9056c(UUID.randomUUID().toString());
        C2857b f = C2857b.m8687f();
        f.mo17130b("Created new Crashlytics IID: " + c);
        sharedPreferences.edit().putString("crashlytics.installation.id", c).putString("firebase.installation.id", str).apply();
        return c;
    }

    /* renamed from: c */
    private static String m9056c(String str) {
        if (str == null) {
            return null;
        }
        return f5744f.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    /* renamed from: i */
    private synchronized void m9057i(String str, String str2, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        C2857b f = C2857b.m8687f();
        f.mo17130b("Migrating legacy Crashlytics IID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", str).putString("firebase.installation.id", str2).apply();
        sharedPreferences2.edit().remove("crashlytics.installation.id").remove("crashlytics.advertising.id").apply();
    }

    /* renamed from: j */
    private String m9058j(String str) {
        return str.replaceAll(f5745g, "");
    }

    @NonNull
    /* renamed from: a */
    public synchronized String mo17294a() {
        String b;
        if (this.f5750e != null) {
            return this.f5750e;
        }
        SharedPreferences t = C2884h.m8823t(this.f5747b);
        String id = this.f5749d.getId();
        String string = t.getString("firebase.installation.id", (String) null);
        if (string == null) {
            SharedPreferences o = C2884h.m8818o(this.f5747b);
            String string2 = o.getString("crashlytics.installation.id", (String) null);
            C2857b f = C2857b.m8687f();
            f.mo17130b("No cached FID; legacy id is " + string2);
            if (string2 == null) {
                this.f5750e = m9055b(id, t);
            } else {
                this.f5750e = string2;
                m9057i(string2, id, t, o);
            }
            return this.f5750e;
        }
        if (string.equals(id)) {
            this.f5750e = t.getString("crashlytics.installation.id", (String) null);
            C2857b f2 = C2857b.m8687f();
            f2.mo17130b("Found matching FID, using Crashlytics IID: " + this.f5750e);
            if (this.f5750e == null) {
                b = m9055b(id, t);
            }
            return this.f5750e;
        }
        b = m9055b(id, t);
        this.f5750e = b;
        return this.f5750e;
    }

    /* renamed from: d */
    public String mo17295d() {
        return this.f5748c;
    }

    /* renamed from: e */
    public String mo17296e() {
        return this.f5746a.mo17300a(this.f5747b);
    }

    /* renamed from: f */
    public String mo17297f() {
        return String.format(Locale.US, "%s/%s", new Object[]{m9058j(Build.MANUFACTURER), m9058j(Build.MODEL)});
    }

    /* renamed from: g */
    public String mo17298g() {
        return m9058j(Build.VERSION.INCREMENTAL);
    }

    /* renamed from: h */
    public String mo17299h() {
        return m9058j(Build.VERSION.RELEASE);
    }
}
