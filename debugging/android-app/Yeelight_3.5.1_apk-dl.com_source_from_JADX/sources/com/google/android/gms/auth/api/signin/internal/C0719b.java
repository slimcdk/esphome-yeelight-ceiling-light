package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.VisibleForTesting;
import com.xiaomi.mipush.sdk.Constants;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

@KeepForSdk
/* renamed from: com.google.android.gms.auth.api.signin.internal.b */
public class C0719b {

    /* renamed from: c */
    private static final Lock f493c = new ReentrantLock();
    @GuardedBy("sLk")
    @Nullable

    /* renamed from: d */
    private static C0719b f494d;

    /* renamed from: a */
    private final Lock f495a = new ReentrantLock();
    @GuardedBy("mLk")

    /* renamed from: b */
    private final SharedPreferences f496b;

    @VisibleForTesting
    C0719b(Context context) {
        this.f496b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static C0719b m605a(@NonNull Context context) {
        C0917i.m1419j(context);
        Lock lock = f493c;
        lock.lock();
        try {
            if (f494d == null) {
                f494d = new C0719b(context.getApplicationContext());
            }
            C0719b bVar = f494d;
            lock.unlock();
            return bVar;
        } catch (Throwable th) {
            f493c.unlock();
            throw th;
        }
    }

    /* renamed from: d */
    private static final String m606d(String str, String str2) {
        return str + Constants.COLON_SEPARATOR + str2;
    }

    @KeepForSdk
    @Nullable
    /* renamed from: b */
    public GoogleSignInAccount mo11747b() {
        String c;
        String c2 = mo11748c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(c2) || (c = mo11748c(m606d("googleSignInAccount", c2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m579p0(c);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: c */
    public final String mo11748c(@NonNull String str) {
        this.f495a.lock();
        try {
            return this.f496b.getString(str, (String) null);
        } finally {
            this.f495a.unlock();
        }
    }
}
