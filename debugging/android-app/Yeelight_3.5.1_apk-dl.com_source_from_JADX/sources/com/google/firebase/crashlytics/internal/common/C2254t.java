package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import p081p1.C3595c;
import p118y0.C3916f;

/* renamed from: com.google.firebase.crashlytics.internal.common.t */
public class C2254t implements C2255u {

    /* renamed from: g */
    private static final Pattern f3647g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h */
    private static final String f3648h = Pattern.quote(MiotCloudImpl.COOKIE_PATH);

    /* renamed from: a */
    private final C2256v f3649a;

    /* renamed from: b */
    private final Context f3650b;

    /* renamed from: c */
    private final String f3651c;

    /* renamed from: d */
    private final C3595c f3652d;

    /* renamed from: e */
    private final C2248q f3653e;

    /* renamed from: f */
    private String f3654f;

    public C2254t(Context context, String str, C3595c cVar, C2248q qVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str != null) {
            this.f3650b = context;
            this.f3651c = str;
            this.f3652d = cVar;
            this.f3653e = qVar;
            this.f3649a = new C2256v();
        } else {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
    }

    @NonNull
    /* renamed from: b */
    private synchronized String m5768b(String str, SharedPreferences sharedPreferences) {
        String e;
        e = m5771e(UUID.randomUUID().toString());
        C3916f f = C3916f.m11190f();
        f.mo26405i("Created new Crashlytics installation ID: " + e + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e).putString("firebase.installation.id", str).apply();
        return e;
    }

    /* renamed from: c */
    static String m5769c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    @Nullable
    /* renamed from: d */
    private String m5770d() {
        try {
            return (String) C2220g0.m5622d(this.f3652d.getId());
        } catch (Exception e) {
            C3916f.m11190f().mo26408l("Failed to retrieve Firebase Installations ID.", e);
            return null;
        }
    }

    /* renamed from: e */
    private static String m5771e(String str) {
        if (str == null) {
            return null;
        }
        return f3647g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    /* renamed from: k */
    static boolean m5772k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    /* renamed from: l */
    private String m5773l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", (String) null);
    }

    /* renamed from: m */
    private String m5774m(String str) {
        return str.replaceAll(f3648h, "");
    }

    @NonNull
    /* renamed from: a */
    public synchronized String mo18611a() {
        String l;
        String str = this.f3654f;
        if (str != null) {
            return str;
        }
        C3916f.m11190f().mo26405i("Determining Crashlytics installation ID...");
        SharedPreferences r = CommonUtils.m5549r(this.f3650b);
        String string = r.getString("firebase.installation.id", (String) null);
        C3916f f = C3916f.m11190f();
        f.mo26405i("Cached Firebase Installation ID: " + string);
        if (this.f3653e.mo18607d()) {
            String d = m5770d();
            C3916f f2 = C3916f.m11190f();
            f2.mo26405i("Fetched Firebase Installation ID: " + d);
            if (d == null) {
                d = string == null ? m5769c() : string;
            }
            l = d.equals(string) ? m5773l(r) : m5768b(d, r);
        } else {
            l = m5772k(string) ? m5773l(r) : m5768b(m5769c(), r);
        }
        this.f3654f = l;
        if (this.f3654f == null) {
            C3916f.m11190f().mo26407k("Unable to determine Crashlytics Install Id, creating a new one.");
            this.f3654f = m5768b(m5769c(), r);
        }
        C3916f f3 = C3916f.m11190f();
        f3.mo26405i("Crashlytics installation ID: " + this.f3654f);
        return this.f3654f;
    }

    /* renamed from: f */
    public String mo18612f() {
        return this.f3651c;
    }

    /* renamed from: g */
    public String mo18613g() {
        return this.f3649a.mo18617a(this.f3650b);
    }

    /* renamed from: h */
    public String mo18614h() {
        return String.format(Locale.US, "%s/%s", new Object[]{m5774m(Build.MANUFACTURER), m5774m(Build.MODEL)});
    }

    /* renamed from: i */
    public String mo18615i() {
        return m5774m(Build.VERSION.INCREMENTAL);
    }

    /* renamed from: j */
    public String mo18616j() {
        return m5774m(Build.VERSION.RELEASE);
    }
}
