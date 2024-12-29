package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.R$string;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.C1610u0;
import com.google.android.gms.common.internal.C1613w;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
@Deprecated
/* renamed from: com.google.android.gms.common.api.internal.f */
public final class C1433f {

    /* renamed from: d */
    private static final Object f2669d = new Object();
    @GuardedBy("sLock")

    /* renamed from: e */
    private static C1433f f2670e;

    /* renamed from: a */
    private final String f2671a;

    /* renamed from: b */
    private final Status f2672b;

    /* renamed from: c */
    private final boolean f2673c;

    @KeepForSdk
    @VisibleForTesting
    C1433f(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(R$string.common_google_play_services_unknown_issue));
        boolean z = false;
        if (identifier != 0) {
            this.f2673c = !(resources.getInteger(identifier) != 0 ? true : z);
        } else {
            this.f2673c = false;
        }
        String a = C1610u0.m4481a(context);
        a = a == null ? new C1613w(context).mo11290a("google_app_id") : a;
        if (TextUtils.isEmpty(a)) {
            this.f2672b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f2671a = null;
            return;
        }
        this.f2671a = a;
        this.f2672b = Status.RESULT_SUCCESS;
    }

    @KeepForSdk
    /* renamed from: a */
    private static C1433f m3824a(String str) {
        C1433f fVar;
        synchronized (f2669d) {
            if (f2670e != null) {
                fVar = f2670e;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
        return fVar;
    }

    @KeepForSdk
    /* renamed from: b */
    public static String m3825b() {
        return m3824a("getGoogleAppId").f2671a;
    }

    @KeepForSdk
    /* renamed from: c */
    public static Status m3826c(Context context) {
        Status status;
        C1609u.m4476l(context, "Context must not be null.");
        synchronized (f2669d) {
            if (f2670e == null) {
                f2670e = new C1433f(context);
            }
            status = f2670e.f2672b;
        }
        return status;
    }

    @KeepForSdk
    /* renamed from: d */
    public static boolean m3827d() {
        return m3824a("isMeasurementExplicitlyDisabled").f2673c;
    }
}
