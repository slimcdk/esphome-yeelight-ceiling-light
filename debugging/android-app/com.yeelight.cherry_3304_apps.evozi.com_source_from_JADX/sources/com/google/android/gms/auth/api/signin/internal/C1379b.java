package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.util.VisibleForTesting;
import com.xiaomi.mipush.sdk.Constants;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

/* renamed from: com.google.android.gms.auth.api.signin.internal.b */
public class C1379b {

    /* renamed from: c */
    private static final Lock f2530c = new ReentrantLock();
    @GuardedBy("sLk")

    /* renamed from: d */
    private static C1379b f2531d;

    /* renamed from: a */
    private final Lock f2532a = new ReentrantLock();
    @GuardedBy("mLk")

    /* renamed from: b */
    private final SharedPreferences f2533b;

    @VisibleForTesting
    private C1379b(Context context) {
        this.f2533b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @KeepForSdk
    /* renamed from: a */
    public static C1379b m3594a(Context context) {
        C1609u.m4475k(context);
        f2530c.lock();
        try {
            if (f2531d == null) {
                f2531d = new C1379b(context.getApplicationContext());
            }
            return f2531d;
        } finally {
            f2530c.unlock();
        }
    }

    /* renamed from: c */
    private static String m3595c(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(Constants.COLON_SEPARATOR);
        sb.append(str2);
        return sb.toString();
    }

    @Nullable
    @VisibleForTesting
    /* renamed from: d */
    private final GoogleSignInAccount m3596d(String str) {
        String e;
        if (!TextUtils.isEmpty(str) && (e = m3597e(m3595c("googleSignInAccount", str))) != null) {
            try {
                return GoogleSignInAccount.m3568a0(e);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: e */
    private final String m3597e(String str) {
        this.f2532a.lock();
        try {
            return this.f2533b.getString(str, (String) null);
        } finally {
            this.f2532a.unlock();
        }
    }

    @KeepForSdk
    @Nullable
    /* renamed from: b */
    public GoogleSignInAccount mo10742b() {
        return m3596d(m3597e("defaultGoogleSignInAccount"));
    }
}
