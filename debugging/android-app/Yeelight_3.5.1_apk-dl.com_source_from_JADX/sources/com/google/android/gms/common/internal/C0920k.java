package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.p007os.ConfigurationCompat;
import com.google.android.gms.base.R$string;
import com.google.android.gms.common.C0878c;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;
import p014c0.C0620i;
import p028e0.C3144c;

/* renamed from: com.google.android.gms.common.internal.k */
public final class C0920k {
    @GuardedBy("sCache")

    /* renamed from: a */
    private static final SimpleArrayMap f1044a = new SimpleArrayMap();
    @GuardedBy("sCache")
    @Nullable

    /* renamed from: b */
    private static Locale f1045b;

    /* renamed from: a */
    public static String m1428a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C3144c.m8403a(context).mo23628c(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: b */
    public static String m1429b(Context context) {
        return context.getResources().getString(R$string.common_google_play_services_notification_channel_name);
    }

    @NonNull
    /* renamed from: c */
    public static String m1430c(Context context, int i) {
        return context.getResources().getString(i != 1 ? i != 2 ? i != 3 ? 17039370 : R$string.common_google_play_services_enable_button : R$string.common_google_play_services_update_button : R$string.common_google_play_services_install_button);
    }

    @NonNull
    /* renamed from: d */
    public static String m1431d(Context context, int i) {
        Resources resources = context.getResources();
        String a = m1428a(context);
        if (i == 1) {
            return resources.getString(R$string.common_google_play_services_install_text, new Object[]{a});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(R$string.common_google_play_services_enable_text, new Object[]{a});
            } else if (i == 5) {
                return m1435h(context, "common_google_play_services_invalid_account_text", a);
            } else {
                if (i == 7) {
                    return m1435h(context, "common_google_play_services_network_error_text", a);
                }
                if (i == 9) {
                    return resources.getString(R$string.common_google_play_services_unsupported_text, new Object[]{a});
                } else if (i == 20) {
                    return m1435h(context, "common_google_play_services_restricted_profile_text", a);
                } else {
                    switch (i) {
                        case 16:
                            return m1435h(context, "common_google_play_services_api_unavailable_text", a);
                        case 17:
                            return m1435h(context, "common_google_play_services_sign_in_failed_text", a);
                        case 18:
                            return resources.getString(R$string.common_google_play_services_updating_text, new Object[]{a});
                        default:
                            return resources.getString(com.google.android.gms.common.R$string.common_google_play_services_unknown_issue, new Object[]{a});
                    }
                }
            }
        } else if (C0620i.m215d(context)) {
            return resources.getString(R$string.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(R$string.common_google_play_services_update_text, new Object[]{a});
        }
    }

    @NonNull
    /* renamed from: e */
    public static String m1432e(Context context, int i) {
        return (i == 6 || i == 19) ? m1435h(context, "common_google_play_services_resolution_required_text", m1428a(context)) : m1431d(context, i);
    }

    @NonNull
    /* renamed from: f */
    public static String m1433f(Context context, int i) {
        String i2 = i == 6 ? m1436i(context, "common_google_play_services_resolution_required_title") : m1434g(context, i);
        return i2 == null ? context.getResources().getString(R$string.common_google_play_services_notification_ticker) : i2;
    }

    @Nullable
    /* renamed from: g */
    public static String m1434g(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R$string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R$string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R$string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                return m1436i(context, "common_google_play_services_invalid_account_title");
            case 7:
                return m1436i(context, "common_google_play_services_network_error_title");
            case 8:
            case 9:
            case 10:
            case 11:
            case 16:
                return null;
            case 17:
                return m1436i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return m1436i(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected error code ");
                sb.append(i);
                return null;
        }
    }

    /* renamed from: h */
    private static String m1435h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i = m1436i(context, str);
        if (i == null) {
            i = resources.getString(com.google.android.gms.common.R$string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, i, new Object[]{str2});
    }

    @Nullable
    /* renamed from: i */
    private static String m1436i(Context context, String str) {
        SimpleArrayMap simpleArrayMap = f1044a;
        synchronized (simpleArrayMap) {
            Locale locale = ConfigurationCompat.getLocales(context.getResources().getConfiguration()).get(0);
            if (!locale.equals(f1045b)) {
                simpleArrayMap.clear();
                f1045b = locale;
            }
            String str2 = (String) simpleArrayMap.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources d = C0878c.m1225d(context);
            if (d == null) {
                return null;
            }
            int identifier = d.getIdentifier(str, TypedValues.Custom.S_STRING, "com.google.android.gms");
            if (identifier == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing resource: ");
                sb.append(str);
                return null;
            }
            String string = d.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Got empty resource: ");
                sb2.append(str);
                return null;
            }
            simpleArrayMap.put(str, string);
            return string;
        }
    }
}
