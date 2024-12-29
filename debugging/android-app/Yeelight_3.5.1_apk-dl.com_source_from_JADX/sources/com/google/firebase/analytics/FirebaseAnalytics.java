package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.internal.measurement.C1296s2;
import com.google.android.gms.measurement.internal.C1803u7;
import com.google.android.gms.tasks.C1874c;
import com.google.firebase.installations.C2431b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class FirebaseAnalytics {

    /* renamed from: b */
    private static volatile FirebaseAnalytics f3485b;

    /* renamed from: a */
    private final C1296s2 f3486a;

    public enum ConsentStatus {
        GRANTED,
        DENIED
    }

    public enum ConsentType {
        AD_STORAGE,
        ANALYTICS_STORAGE
    }

    public FirebaseAnalytics(C1296s2 s2Var) {
        C0917i.m1419j(s2Var);
        this.f3486a = s2Var;
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @NonNull
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (f3485b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f3485b == null) {
                    f3485b = new FirebaseAnalytics(C1296s2.m2742r(context, (String) null, (String) null, (String) null, (Bundle) null));
                }
            }
        }
        return f3485b;
    }

    @Keep
    @Nullable
    public static C1803u7 getScionFrontendApiImplementation(Context context, @Nullable Bundle bundle) {
        C1296s2 r = C1296s2.m2742r(context, (String) null, (String) null, (String) null, bundle);
        if (r == null) {
            return null;
        }
        return new C2191a(r);
    }

    /* renamed from: a */
    public void mo18496a(@Size(max = 40, min = 1) @NonNull String str, @Nullable Bundle bundle) {
        this.f3486a.mo13257F(str, bundle);
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) C1874c.m4948b(C2431b.m6505k().getId(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @MainThread
    @Deprecated
    @Keep
    public void setCurrentScreen(@NonNull Activity activity, @Size(max = 36, min = 1) @Nullable String str, @Size(max = 36, min = 1) @Nullable String str2) {
        this.f3486a.mo13262d(activity, str, str2);
    }
}
