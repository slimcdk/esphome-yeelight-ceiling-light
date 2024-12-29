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
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.internal.measurement.C1728c;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.measurement.internal.C2111a5;
import com.google.android.gms.measurement.internal.C2137c7;
import com.google.android.gms.measurement.internal.C2176fa;
import com.google.firebase.iid.FirebaseInstanceId;

public final class FirebaseAnalytics {

    /* renamed from: d */
    private static volatile FirebaseAnalytics f5405d;

    /* renamed from: a */
    private final C2111a5 f5406a;

    /* renamed from: b */
    private final C1728c f5407b;

    /* renamed from: c */
    private final boolean f5408c;

    private FirebaseAnalytics(C1728c cVar) {
        C1609u.m4475k(cVar);
        this.f5406a = null;
        this.f5407b = cVar;
        this.f5408c = true;
    }

    private FirebaseAnalytics(C2111a5 a5Var) {
        C1609u.m4475k(a5Var);
        this.f5406a = a5Var;
        this.f5407b = null;
        this.f5408c = false;
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @NonNull
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (f5405d == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f5405d == null) {
                    f5405d = C1728c.m4916z(context) ? new FirebaseAnalytics(C1728c.m4903a(context)) : new FirebaseAnalytics(C2111a5.m6707d(context, (zzaa) null, (Long) null));
                }
            }
        }
        return f5405d;
    }

    @Keep
    public static C2137c7 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C1728c b;
        if (C1728c.m4916z(context) && (b = C1728c.m4904b(context, (String) null, (String) null, (String) null, bundle)) != null) {
            return new C2808b(b);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo17048a(@Size(max = 40, min = 1) @NonNull String str, @Nullable Bundle bundle) {
        if (this.f5408c) {
            this.f5407b.mo11532o(str, bundle);
        } else {
            this.f5406a.mo12411F().mo12710T("app", str, bundle, true);
        }
    }

    @Keep
    public final String getFirebaseInstanceId() {
        return FirebaseInstanceId.m9992b().mo17785a();
    }

    @MainThread
    @Keep
    public final void setCurrentScreen(@NonNull Activity activity, @Size(max = 36, min = 1) @Nullable String str, @Size(max = 36, min = 1) @Nullable String str2) {
        if (this.f5408c) {
            this.f5407b.mo11529h(activity, str, str2);
        } else if (!C2176fa.m7021a()) {
            this.f5406a.mo12427b().mo13099J().mo13130a("setCurrentScreen must be called from the main thread");
        } else {
            this.f5406a.mo12421P().mo12802J(activity, str, str2);
        }
    }
}
