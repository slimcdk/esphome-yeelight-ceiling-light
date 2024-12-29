package com.xiaomi.push.service;

import android.app.Notification;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4554bk;
import com.xiaomi.push.C4747h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.xiaomi.push.service.ay */
public class C4894ay {

    /* renamed from: a */
    public static final C4895a<String, String, String> f9501a = new C4895a<>("setSound", "canSound", "canSound");

    /* renamed from: a */
    private static String f9502a = null;

    /* renamed from: a */
    private static final String[] f9503a = {"com.mi.globalbrowser", "com.android.browser"};

    /* renamed from: b */
    public static final C4895a<String, String, String> f9504b = new C4895a<>("setVibrate", "canVibrate", "canVibrate");

    /* renamed from: c */
    public static final C4895a<String, String, String> f9505c = new C4895a<>("setLights", "canLights", "canLights");

    /* renamed from: d */
    public static final C4895a<String, String, String> f9506d = new C4895a<>("setShowOnKeyguard", "canShowOnKeyguard", "canShowOnKeyguard");

    /* renamed from: e */
    public static final C4895a<String, String, String> f9507e = new C4895a<>("setFloat", "canFloat", "canShowFloat");

    /* renamed from: f */
    public static final C4895a<String, String, String> f9508f = new C4895a<>("setShowBadge", "canShowBadge", "canShowBadge");

    /* renamed from: com.xiaomi.push.service.ay$a */
    public static class C4895a<F, S, T> {

        /* renamed from: a */
        F f9509a;

        /* renamed from: b */
        S f9510b;

        /* renamed from: c */
        T f9511c;

        private C4895a(F f, S s, T t) {
            this.f9509a = f;
            this.f9510b = s;
            this.f9511c = t;
        }
    }

    /* renamed from: a */
    public static int m15339a(ContentResolver contentResolver) {
        try {
            return Settings.Global.getInt(contentResolver, "user_aggregate", 0);
        } catch (Exception e) {
            C4408b.m12464a("get user aggregate failed, " + e);
            return 0;
        }
    }

    /* renamed from: a */
    static int m15340a(Context context, String str) {
        return C4747h.m14131b(context, str);
    }

    /* renamed from: a */
    public static int m15341a(Context context, String str, String str2, C4895a<String, String, String> aVar) {
        if (aVar == null) {
            return -1;
        }
        try {
            Bundle a = m15342a(context, (String) aVar.f9510b, str, str2, (Bundle) null);
            if (a == null || !a.containsKey((String) aVar.f9511c)) {
                return -1;
            }
            return a.getBoolean((String) aVar.f9511c) ? 1 : 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: a */
    private static Bundle m15342a(Context context, String str, String str2, String str3, Bundle bundle) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("call notification provider failed!");
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("package", str2);
        if (!TextUtils.isEmpty(str3)) {
            bundle2.putString("channel_id", str3);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        return context.getContentResolver().call(Uri.parse("content://statusbar.notification"), str, (String) null, bundle2);
    }

    /* renamed from: a */
    public static <T> T m15343a(Notification notification, String str) {
        Bundle bundle = notification.extras;
        if (bundle == null) {
            return null;
        }
        try {
            return bundle.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T m15344a(java.lang.Object r2, java.lang.String r3, T r4) {
        /*
            r0 = 0
            boolean r1 = r2 instanceof android.app.Notification     // Catch:{ Exception -> 0x0038 }
            if (r1 == 0) goto L_0x000d
            android.app.Notification r2 = (android.app.Notification) r2     // Catch:{ Exception -> 0x0038 }
            java.lang.Object r2 = m15343a((android.app.Notification) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x0038 }
        L_0x000b:
            r0 = r2
            goto L_0x004d
        L_0x000d:
            boolean r1 = r2 instanceof java.util.Map     // Catch:{ Exception -> 0x0038 }
            if (r1 == 0) goto L_0x0018
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ Exception -> 0x0038 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x0038 }
            goto L_0x000b
        L_0x0018:
            boolean r1 = r2 instanceof android.os.Bundle     // Catch:{ Exception -> 0x0038 }
            if (r1 == 0) goto L_0x0023
            android.os.Bundle r2 = (android.os.Bundle) r2     // Catch:{ Exception -> 0x0038 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x0038 }
            goto L_0x000b
        L_0x0023:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0038 }
            r3.<init>()     // Catch:{ Exception -> 0x0038 }
            java.lang.String r1 = "not support get value from classType:"
            r3.append(r1)     // Catch:{ Exception -> 0x0038 }
            r3.append(r2)     // Catch:{ Exception -> 0x0038 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0038 }
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r2)     // Catch:{ Exception -> 0x0038 }
            goto L_0x004d
        L_0x0038:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "get value error "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r2)
        L_0x004d:
            if (r0 != 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r4 = r0
        L_0x0051:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4894ay.m15344a(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* renamed from: a */
    public static String m15345a(Notification notification) {
        CharSequence charSequence;
        Bundle bundle = notification.extras;
        if (bundle != null) {
            charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_TITLE);
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence(NotificationCompat.EXTRA_TITLE_BIG);
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence("mipush.customTitle");
            }
        } else {
            charSequence = null;
        }
        return charSequence != null ? charSequence.toString() : "";
    }

    /* renamed from: a */
    public static String m15346a(Object obj) {
        return (String) m15344a(obj, "msg_busi_type", "");
    }

    /* renamed from: a */
    static void m15347a(Notification notification, int i) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putInt("miui.messageCount", i);
            }
            Object a = C4554bk.m13011a((Object) notification, "extraNotification");
            if (a != null) {
                C4554bk.m13012a(a, "setMessageCount", Integer.valueOf(i));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    static void m15348a(Notification notification, int i, int i2) {
        if (notification != null) {
            if (notification.extras == null) {
                notification.extras = new Bundle();
            }
            notification.extras.putInt("is_priority", i);
            notification.extras.putInt("mipush_class", i2);
        }
    }

    /* renamed from: a */
    static void m15349a(Notification notification, String str) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putString("target_package", str);
            }
            Object a = C4554bk.m13011a((Object) notification, "extraNotification");
            if (a != null) {
                C4554bk.m13012a(a, "setTargetPkg", str);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    static void m15350a(Notification notification, boolean z) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putBoolean("miui.enableFloat", z);
            }
            Object a = C4554bk.m13011a((Object) notification, "extraNotification");
            if (a != null) {
                C4554bk.m13012a(a, "setEnableFloat", Boolean.valueOf(z));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    static void m15351a(Context context, String str, Intent intent) {
        if (intent != null) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
            arrayList.addAll(Arrays.asList(f9503a));
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                String str2 = (String) arrayList.get(i);
                if (!TextUtils.isEmpty(str2)) {
                    Intent intent2 = new Intent(intent);
                    intent2.setPackage(str2);
                    try {
                        if (context.getPackageManager().resolveActivity(intent2, 65536) != null) {
                            intent.setPackage(str2);
                            break;
                        }
                    } catch (Exception e) {
                        C4408b.m12464a("can't match url intent. " + e);
                    }
                }
                i++;
            }
            intent.setPackage(intent.getPackage());
        }
    }

    /* renamed from: a */
    public static void m15352a(Map<String, String> map, Bundle bundle, String str) {
        if (map == null || bundle == null || TextUtils.isEmpty(str)) {
            C4408b.m12464a("cp map to b fail:" + str);
        } else if (TextUtils.isEmpty(map.get(str))) {
            bundle.remove(str);
        } else {
            bundle.putString(str, map.get(str));
        }
    }

    /* renamed from: a */
    public static boolean m15353a(Notification.Builder builder, boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setGroupAlertBehavior(z ? 2 : 1);
            return true;
        }
        C4408b.m12481b("not support setGroupAlertBehavior");
        return false;
    }

    /* renamed from: a */
    public static boolean m15354a(ContentResolver contentResolver) {
        int a = m15339a(contentResolver);
        return a == 1 || a == 2;
    }

    /* renamed from: a */
    public static boolean m15355a(Context context, String str, String str2, C4895a<String, String, String> aVar, boolean z) {
        if (aVar != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putBoolean((String) aVar.f9511c, z);
                m15342a(context, (String) aVar.f9509a, str, str2, bundle);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m15356a(Map<String, String> map) {
        return Boolean.parseBoolean((String) m15344a((Object) map, "not_suppress", "true"));
    }

    /* renamed from: a */
    public static Notification.Action[] m15357a(Notification notification) {
        Parcelable[] parcelableArray;
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr;
        }
        Bundle bundle = notification.extras;
        if (bundle == null || (parcelableArray = bundle.getParcelableArray("mipush.customActions")) == null) {
            return null;
        }
        return (Notification.Action[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Notification.Action[].class);
    }

    /* renamed from: b */
    public static String m15358b(Notification notification) {
        CharSequence charSequence;
        Bundle bundle = notification.extras;
        if (bundle != null) {
            charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_TEXT);
            if (TextUtils.isEmpty(charSequence) && Build.VERSION.SDK_INT >= 21) {
                charSequence = notification.extras.getCharSequence(NotificationCompat.EXTRA_BIG_TEXT);
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence("mipush.customContent");
            }
        } else {
            charSequence = null;
        }
        return charSequence != null ? charSequence.toString() : "";
    }

    /* renamed from: b */
    public static void m15359b(Notification notification, boolean z) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putBoolean("miui.enableKeyguard", z);
            }
            Object a = C4554bk.m13011a((Object) notification, "extraNotification");
            if (a != null) {
                C4554bk.m13012a(a, "setEnableKeyguard", Boolean.valueOf(z));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r3 = com.xiaomi.push.C4554bk.m13011a((java.lang.Object) r3, "extraNotification");
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m15360c(android.app.Notification r3) {
        /*
            r0 = 0
            android.os.Bundle r1 = r3.extras     // Catch:{ Exception -> 0x0025 }
            if (r1 == 0) goto L_0x000b
            java.lang.String r2 = "target_package"
            java.lang.String r0 = r1.getString(r2)     // Catch:{ Exception -> 0x0025 }
        L_0x000b:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0025 }
            if (r1 == 0) goto L_0x0025
            java.lang.String r1 = "extraNotification"
            java.lang.Object r3 = com.xiaomi.push.C4554bk.m13011a((java.lang.Object) r3, (java.lang.String) r1)     // Catch:{ Exception -> 0x0025 }
            if (r3 == 0) goto L_0x0025
            java.lang.String r1 = "getTargetPkg"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0025 }
            java.lang.Object r3 = com.xiaomi.push.C4554bk.m13012a((java.lang.Object) r3, (java.lang.String) r1, (java.lang.Object[]) r2)     // Catch:{ Exception -> 0x0025 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0025 }
            r0 = r3
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4894ay.m15360c(android.app.Notification):java.lang.String");
    }
}
