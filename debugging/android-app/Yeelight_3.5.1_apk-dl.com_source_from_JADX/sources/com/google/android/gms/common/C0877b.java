package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.common.C0998k;
import com.xiaomi.mipush.sdk.Constants;
import p014c0.C0620i;
import p028e0.C3144c;
import p109w.C3846i0;

@ShowFirstParty
@KeepForSdk
/* renamed from: com.google.android.gms.common.b */
public class C0877b {
    @KeepForSdk

    /* renamed from: a */
    public static final int f884a = C0879d.f886a;

    /* renamed from: b */
    private static final C0877b f885b = new C0877b();

    @KeepForSdk
    C0877b() {
    }

    @NonNull
    @KeepForSdk
    /* renamed from: h */
    public static C0877b m1212h() {
        return f885b;
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo12118a(@NonNull Context context) {
        C0879d.m1226a(context);
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: b */
    public int mo12119b(@NonNull Context context) {
        return C0879d.m1227b(context);
    }

    @ShowFirstParty
    @Nullable
    @KeepForSdk
    @Deprecated
    /* renamed from: c */
    public Intent mo12120c(int i) {
        return mo11770d((Context) null, i, (String) null);
    }

    @ShowFirstParty
    @KeepForSdk
    @Nullable
    /* renamed from: d */
    public Intent mo11770d(@Nullable Context context, int i, @Nullable String str) {
        if (i == 1 || i == 2) {
            if (context != null && C0620i.m215d(context)) {
                return C3846i0.m10949a();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(f884a);
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
                    sb.append(C3144c.m8403a(context).mo23629d(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return C3846i0.m10950b("com.google.android.gms", sb.toString());
        } else if (i != 3) {
            return null;
        } else {
            return C3846i0.m10951c("com.google.android.gms");
        }
    }

    @KeepForSdk
    @Nullable
    /* renamed from: e */
    public PendingIntent mo11771e(@NonNull Context context, int i, int i2) {
        return mo12121f(context, i, i2, (String) null);
    }

    @ShowFirstParty
    @KeepForSdk
    @Nullable
    /* renamed from: f */
    public PendingIntent mo12121f(@NonNull Context context, int i, int i2, @Nullable String str) {
        Intent d = mo11770d(context, i, str);
        if (d == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, d, C0998k.f1219a | 134217728);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: g */
    public String mo11772g(int i) {
        return C0879d.m1228c(i);
    }

    @KeepForSdk
    @HideFirstParty
    /* renamed from: i */
    public int mo11773i(@NonNull Context context) {
        return mo11774j(context, f884a);
    }

    @KeepForSdk
    /* renamed from: j */
    public int mo11774j(@NonNull Context context, int i) {
        int f = C0879d.m1231f(context, i);
        if (C0879d.m1232g(context, f)) {
            return 18;
        }
        return f;
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: k */
    public boolean mo12122k(@NonNull Context context, int i) {
        return C0879d.m1232g(context, i);
    }

    @KeepForSdk
    /* renamed from: l */
    public boolean mo12123l(@NonNull Context context, @NonNull String str) {
        return C0879d.m1236k(context, str);
    }

    @KeepForSdk
    /* renamed from: m */
    public boolean mo11775m(int i) {
        return C0879d.m1234i(i);
    }
}
