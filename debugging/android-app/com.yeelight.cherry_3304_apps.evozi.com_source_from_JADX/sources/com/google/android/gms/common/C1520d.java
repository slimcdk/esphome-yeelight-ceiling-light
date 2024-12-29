package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C1587m0;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.p105j.C1620c;
import com.google.android.gms.common.util.C1655i;
import com.google.android.gms.common.util.VisibleForTesting;
import com.xiaomi.mipush.sdk.Constants;

@ShowFirstParty
@KeepForSdk
/* renamed from: com.google.android.gms.common.d */
public class C1520d {
    @KeepForSdk

    /* renamed from: a */
    public static final int f2875a = C1533g.f2900a;

    /* renamed from: b */
    private static final C1520d f2876b = new C1520d();

    @KeepForSdk
    C1520d() {
    }

    @KeepForSdk
    /* renamed from: h */
    public static C1520d m4113h() {
        return f2876b;
    }

    @VisibleForTesting
    /* renamed from: n */
    private static String m4114n(@Nullable Context context, @Nullable String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f2875a);
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        if (context != null) {
            try {
                sb.append(C1620c.m4502a(context).mo11303e(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo11055a(Context context) {
        C1533g.m4148a(context);
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: b */
    public int mo11056b(Context context) {
        return C1533g.m4149b(context);
    }

    @ShowFirstParty
    @Nullable
    @KeepForSdk
    @Deprecated
    /* renamed from: c */
    public Intent mo11057c(int i) {
        return mo11041d((Context) null, i, (String) null);
    }

    @ShowFirstParty
    @KeepForSdk
    @Nullable
    /* renamed from: d */
    public Intent mo11041d(Context context, int i, @Nullable String str) {
        if (i == 1 || i == 2) {
            return (context == null || !C1655i.m4594d(context)) ? C1587m0.m4367a("com.google.android.gms", m4114n(context, str)) : C1587m0.m4369c();
        }
        if (i != 3) {
            return null;
        }
        return C1587m0.m4368b("com.google.android.gms");
    }

    @KeepForSdk
    @Nullable
    /* renamed from: e */
    public PendingIntent mo11042e(Context context, int i, int i2) {
        return mo11058f(context, i, i2, (String) null);
    }

    @ShowFirstParty
    @KeepForSdk
    @Nullable
    /* renamed from: f */
    public PendingIntent mo11058f(Context context, int i, int i2, @Nullable String str) {
        Intent d = mo11041d(context, i, str);
        if (d == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, d, 134217728);
    }

    @KeepForSdk
    /* renamed from: g */
    public String mo11043g(int i) {
        return C1533g.m4150c(i);
    }

    @KeepForSdk
    @HideFirstParty
    /* renamed from: i */
    public int mo11044i(Context context) {
        return mo11045j(context, f2875a);
    }

    @KeepForSdk
    /* renamed from: j */
    public int mo11045j(Context context, int i) {
        int g = C1533g.m4154g(context, i);
        if (C1533g.m4155h(context, g)) {
            return 18;
        }
        return g;
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: k */
    public boolean mo11059k(Context context, int i) {
        return C1533g.m4155h(context, i);
    }

    @KeepForSdk
    /* renamed from: l */
    public boolean mo11060l(Context context, String str) {
        return C1533g.m4157j(context, str);
    }

    @KeepForSdk
    /* renamed from: m */
    public boolean mo11046m(int i) {
        return C1533g.m4158k(i);
    }
}
