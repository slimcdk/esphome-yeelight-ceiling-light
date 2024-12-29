package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4554bk;
import com.xiaomi.push.C4765ho;
import com.xiaomi.push.C4805j;
import com.xiaomi.push.C4830m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: com.xiaomi.push.service.ax */
public class C4893ax {

    /* renamed from: a */
    private static Context f9495a;

    /* renamed from: a */
    private static Object f9496a;

    /* renamed from: a */
    private static WeakHashMap<Integer, C4893ax> f9497a = new WeakHashMap<>();

    /* renamed from: a */
    private static boolean f9498a;

    /* renamed from: a */
    private String f9499a;

    /* renamed from: b */
    private String f9500b;

    private C4893ax(String str) {
        this.f9499a = str;
    }

    /* renamed from: a */
    private static int mo29978a(String str) {
        if (Build.VERSION.SDK_INT < 24) {
            return -1;
        }
        try {
            return f9495a.getPackageManager().getPackageUid(str, 0);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: a */
    private static NotificationManager mo29979a() {
        return (NotificationManager) f9495a.getSystemService("notification");
    }

    /* renamed from: a */
    public static C4893ax m15315a(Context context, String str) {
        m15320a(context);
        int hashCode = str.hashCode();
        C4893ax axVar = f9497a.get(Integer.valueOf(hashCode));
        if (axVar != null) {
            return axVar;
        }
        C4893ax axVar2 = new C4893ax(str);
        f9497a.put(Integer.valueOf(hashCode), axVar2);
        return axVar2;
    }

    /* renamed from: a */
    private static <T> T m15316a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return obj.getClass().getMethod("getList", new Class[0]).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Object m15317a(List list) {
        return Class.forName("android.content.pm.ParceledListSlice").getConstructor(new Class[]{List.class}).newInstance(new Object[]{list});
    }

    /* renamed from: a */
    public static String m15318a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String a = m15319a("mipush|%s|%s", str2, "");
        return str.startsWith(a) ? m15319a("mipush_%s_%s", str2, str.replace(a, "")) : str;
    }

    /* renamed from: a */
    private static String m15319a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return String.format(str, new Object[]{str2, str3});
    }

    /* renamed from: a */
    private static void m15320a(Context context) {
        if (f9495a == null) {
            f9495a = context.getApplicationContext();
            NotificationManager a = mo29979a();
            Boolean bool = (Boolean) C4554bk.m13012a((Object) a, "isSystemConditionProviderEnabled", "xmsf_fake_condition_provider_path");
            mo29978a("fwk is support.init:" + bool);
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            f9498a = booleanValue;
            if (booleanValue) {
                f9496a = C4554bk.m13012a((Object) a, "getService", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    static void m15321a(String str) {
        C4408b.m12464a("NMHelper:" + str);
    }

    /* renamed from: a */
    private static boolean m15322a() {
        if (C4830m.m14997a() && C4898ba.m15362a(f9495a).mo29996a(C4765ho.NotificationBelongToAppSwitch.mo29322a(), true)) {
            return f9498a;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m15323a(Context context) {
        m15320a(context);
        return mo29979a();
    }

    /* renamed from: a */
    private StatusBarNotification[] m15324a() {
        if (!C4830m.m14998a(mo29979a())) {
            return null;
        }
        try {
            String packageName = mo29979a().getPackageName();
            Object a = C4554bk.m13012a(f9496a, "getActiveNotifications", packageName);
            if (a instanceof StatusBarNotification[]) {
                return (StatusBarNotification[]) a;
            }
            return null;
        } catch (Throwable th) {
            mo29978a("getAllNotifications error " + th);
            return null;
        }
    }

    /* renamed from: b */
    private String m15325b(String str) {
        return m15319a(mo29979a() ? "mipush|%s|%s" : "mipush_%s_%s", this.f9499a, str);
    }

    @TargetApi(26)
    /* renamed from: a */
    public NotificationChannel m15326a(String str) {
        try {
            if (!mo29979a()) {
                return mo29979a().getNotificationChannel(str);
            }
            List<NotificationChannel> a = mo29979a();
            if (a == null) {
                return null;
            }
            for (NotificationChannel notificationChannel : a) {
                if (str.equals(notificationChannel.getId())) {
                    return notificationChannel;
                }
            }
            return null;
        } catch (Exception e) {
            mo29978a("getNotificationChannel error" + e);
            return null;
        }
    }

    /* renamed from: a */
    public Context m15327a() {
        return f9495a;
    }

    /* renamed from: a */
    public String m15328a() {
        return this.f9499a;
    }

    /* renamed from: a */
    public String m15329a(String str) {
        return TextUtils.isEmpty(str) ? mo29984b() : C4830m.m14998a(mo29979a()) ? m15325b(str) : str;
    }

    /* access modifiers changed from: package-private */
    @TargetApi(26)
    /* renamed from: a */
    public List<NotificationChannel> m15330a() {
        String str;
        String str2 = this.f9499a;
        List<NotificationChannel> list = null;
        try {
            if (mo29979a()) {
                int a = mo29978a(str2);
                if (a != -1) {
                    str = "mipush|%s|%s";
                    list = (List) m15316a(C4554bk.m13012a(f9496a, "getNotificationChannelsForPackage", str2, Integer.valueOf(a), Boolean.FALSE));
                } else {
                    str = null;
                }
            } else {
                list = mo29979a().getNotificationChannels();
                str = "mipush_%s_%s";
            }
            if (!C4830m.m14997a() || list == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            String a2 = m15319a(str, str2, "");
            for (NotificationChannel next : list) {
                if (next.getId().startsWith(a2)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        } catch (Exception e) {
            mo29978a("getNotificationChannels error " + e);
            return null;
        }
    }

    /* renamed from: a */
    public void mo29980a(int i) {
        String str = this.f9499a;
        try {
            if (mo29979a()) {
                int a = C4805j.m14859a();
                String packageName = mo29979a().getPackageName();
                if (Build.VERSION.SDK_INT >= 30) {
                    C4554bk.m13021b(f9496a, "cancelNotificationWithTag", str, packageName, null, Integer.valueOf(i), Integer.valueOf(a));
                } else {
                    C4554bk.m13021b(f9496a, "cancelNotificationWithTag", str, null, Integer.valueOf(i), Integer.valueOf(a));
                }
                mo29978a("cancel succ:" + i);
                return;
            }
            mo29979a().cancel(i);
        } catch (Exception e) {
            mo29978a("cancel error" + e);
        }
    }

    /* renamed from: a */
    public void mo29981a(int i, Notification notification) {
        String str = this.f9499a;
        NotificationManager a = mo29979a();
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (mo29979a()) {
                if (i2 >= 19) {
                    notification.extras.putString("xmsf_target_package", str);
                }
                if (i2 >= 29) {
                    a.notifyAsPackage(str, (String) null, i, notification);
                    return;
                }
            }
            a.notify(i, notification);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    @TargetApi(26)
    /* renamed from: a */
    public void mo29982a(NotificationChannel notificationChannel) {
        String str = this.f9499a;
        try {
            if (mo29979a()) {
                int a = mo29978a(str);
                if (a != -1) {
                    Object a2 = m15317a(Arrays.asList(new NotificationChannel[]{notificationChannel}));
                    C4554bk.m13021b(f9496a, "createNotificationChannelsForPackage", str, Integer.valueOf(a), a2);
                    return;
                }
                return;
            }
            mo29979a().createNotificationChannel(notificationChannel);
        } catch (Exception e) {
            mo29978a("createNotificationChannel error" + e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29983a(NotificationChannel notificationChannel, boolean z) {
        String str = this.f9499a;
        if (z) {
            try {
                int a = mo29978a(str);
                if (a != -1) {
                    C4554bk.m13021b(f9496a, "updateNotificationChannelForPackage", str, Integer.valueOf(a), notificationChannel);
                }
            } catch (Exception e) {
                mo29978a("updateNotificationChannel error " + e);
            }
        } else {
            mo29982a(notificationChannel);
        }
    }

    /* renamed from: a */
    public boolean m15335a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.startsWith(m15325b(""));
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo29984b() {
        if (TextUtils.isEmpty(this.f9500b)) {
            this.f9500b = m15325b("default");
        }
        return this.f9500b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo29985b(String str, String str2) {
        return mo29979a() ? str : str2;
    }

    /* renamed from: b */
    public List<StatusBarNotification> m15338b() {
        String str = this.f9499a;
        NotificationManager a = mo29979a();
        ArrayList arrayList = null;
        try {
            if (mo29979a()) {
                int a2 = C4805j.m14859a();
                if (a2 == -1) {
                    return null;
                }
                return (List) m15316a(C4554bk.m13012a(f9496a, "getAppActiveNotifications", str, Integer.valueOf(a2)));
            }
            StatusBarNotification[] activeNotifications = Build.VERSION.SDK_INT >= 23 ? a.getActiveNotifications() : mo29979a();
            boolean a3 = C4830m.m14997a();
            if (activeNotifications == null || activeNotifications.length <= 0) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (StatusBarNotification statusBarNotification : activeNotifications) {
                    if (!a3 || str.equals(C4894ay.m15360c(statusBarNotification.getNotification()))) {
                        arrayList2.add(statusBarNotification);
                    }
                }
                return arrayList2;
            } catch (Throwable th) {
                th = th;
                arrayList = arrayList2;
                mo29978a("getActiveNotifications error " + th);
                return arrayList;
            }
        } catch (Throwable th2) {
            th = th2;
            mo29978a("getActiveNotifications error " + th);
            return arrayList;
        }
    }

    public String toString() {
        return "NotificationManagerHelper{" + this.f9499a + "}";
    }
}
