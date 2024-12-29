package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.firebase.iid.b0 */
final class C3208b0 {

    /* renamed from: a */
    private final SharedPreferences f6201a;

    /* renamed from: b */
    private final Context f6202b;
    @GuardedBy("this")

    /* renamed from: c */
    private final Map<String, Long> f6203c = new ArrayMap();

    public C3208b0(Context context) {
        this.f6202b = context;
        this.f6201a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(ContextCompat.getNoBackupFilesDir(this.f6202b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !m10029f()) {
                    mo17806c();
                    FirebaseInstanceId.m9992b().mo17796w();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(e.getMessage());
                    if (valueOf.length() != 0) {
                        "Error creating file in no backup dir: ".concat(valueOf);
                    } else {
                        new String("Error creating file in no backup dir: ");
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private static String m10028b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: f */
    private final synchronized boolean m10029f() {
        return this.f6201a.getAll().isEmpty();
    }

    /* renamed from: g */
    private static String m10030g(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: i */
    private final long m10031i(String str) {
        String string = this.f6201a.getString(m10028b(str, "cre"), (String) null);
        if (string == null) {
            return 0;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public final synchronized C3205a0 mo17805a(String str, String str2, String str3) {
        return C3205a0.m10024a(this.f6201a.getString(m10030g(str, str2, str3), (String) null));
    }

    /* renamed from: c */
    public final synchronized void mo17806c() {
        this.f6203c.clear();
        this.f6201a.edit().clear().commit();
    }

    /* renamed from: d */
    public final synchronized void mo17807d(String str, String str2, String str3, String str4, String str5) {
        String b = C3205a0.m10025b(str4, str5, System.currentTimeMillis());
        if (b != null) {
            SharedPreferences.Editor edit = this.f6201a.edit();
            edit.putString(m10030g(str, str2, str3), b);
            edit.commit();
        }
    }

    /* renamed from: e */
    public final synchronized long mo17808e(String str) {
        long currentTimeMillis;
        currentTimeMillis = System.currentTimeMillis();
        if (!this.f6201a.contains(m10028b(str, "cre"))) {
            SharedPreferences.Editor edit = this.f6201a.edit();
            edit.putString(m10028b(str, "cre"), String.valueOf(currentTimeMillis));
            edit.commit();
        } else {
            currentTimeMillis = m10031i(str);
        }
        this.f6203c.put(str, Long.valueOf(currentTimeMillis));
        return currentTimeMillis;
    }

    /* renamed from: h */
    public final synchronized void mo17809h(String str) {
        String concat = String.valueOf(str).concat("|T|");
        SharedPreferences.Editor edit = this.f6201a.edit();
        for (String next : this.f6201a.getAll().keySet()) {
            if (next.startsWith(concat)) {
                edit.remove(next);
            }
        }
        edit.commit();
    }
}
