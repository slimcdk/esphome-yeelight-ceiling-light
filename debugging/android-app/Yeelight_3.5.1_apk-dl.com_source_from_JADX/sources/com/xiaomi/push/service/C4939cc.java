package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4516al;
import com.xiaomi.push.C4554bk;
import com.xiaomi.push.C4669eq;
import com.xiaomi.push.C4830m;
import com.xiaomi.push.C4995w;
import java.util.List;
import java.util.Map;

/* renamed from: com.xiaomi.push.service.cc */
public class C4939cc {
    /* renamed from: a */
    private static int m15509a(Map<String, String> map) {
        return Math.max(0, C4995w.m15744a(map.get("notification_top_period"), 0));
    }

    @TargetApi(19)
    /* renamed from: a */
    private static Notification m15510a(Notification notification, int i, String str, C4893ax axVar) {
        if (notification != null) {
            if (!str.equals(notification.extras.getString("message_id"))) {
                notification = null;
            }
            return notification;
        }
        List<StatusBarNotification> b = axVar.mo29984b();
        if (b == null) {
            return null;
        }
        for (StatusBarNotification statusBarNotification : b) {
            Notification notification2 = statusBarNotification.getNotification();
            String string = notification2.extras.getString("message_id");
            if (i == statusBarNotification.getId() && str.equals(string)) {
                return notification2;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static C4516al.C4517a m15511a(Context context, String str, int i, String str2, Notification notification) {
        return new C4940cd(i, str2, context, str, notification);
    }

    @TargetApi(19)
    /* renamed from: a */
    static void m15513a(Context context, String str, int i, String str2, Notification notification) {
        if (C4830m.m14998a(context) && notification != null && notification.extras.getBoolean("mipush_n_top_flag", false)) {
            m15519c(context, str, i, str2, notification);
        }
    }

    /* renamed from: a */
    static void m15514a(Context context, Map<String, String> map, C4669eq eqVar, long j) {
        if (map != null && eqVar != null && C4830m.m14998a(context) && m15509a(map)) {
            int a = m15509a(map);
            int b = m15516b(map);
            if (a <= 0 || b > a) {
                C4408b.m12483d("set top notification failed - period:" + a + " frequency:" + b);
                return;
            }
            eqVar.setPriority(2);
            Bundle bundle = new Bundle();
            bundle.putLong("mipush_org_when", j);
            bundle.putBoolean("mipush_n_top_flag", true);
            if (b > 0) {
                bundle.putInt("mipush_n_top_fre", b);
            }
            bundle.putInt("mipush_n_top_prd", a);
            eqVar.addExtras(bundle);
        }
    }

    /* renamed from: a */
    private static boolean m15515a(Map<String, String> map) {
        String str = map.get("notification_top_repeat");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean parseBoolean = Boolean.parseBoolean(str);
        C4408b.m12482c("top notification' repeat is " + parseBoolean);
        return parseBoolean;
    }

    /* renamed from: b */
    private static int m15516b(Map<String, String> map) {
        return Math.max(0, C4995w.m15744a(map.get("notification_top_frequency"), 0));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m15517b(int i, String str) {
        return "n_top_update_" + i + "_" + str;
    }

    /* access modifiers changed from: private */
    @TargetApi(19)
    /* renamed from: c */
    public static void m15519c(Context context, String str, int i, String str2, Notification notification) {
        C4893ax a;
        Notification a2;
        Context context2 = context;
        int i2 = i;
        String str3 = str2;
        Notification notification2 = notification;
        if (context2 != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && Build.VERSION.SDK_INT >= 26 && (a2 = m15510a(notification2, i2, str3, a)) != null) {
            boolean z = notification2 != null;
            if (a2.getGroupAlertBehavior() != 1) {
                C4554bk.m13017a((Object) a2, "mGroupAlertBehavior", (Object) 1);
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = a2.extras.getLong("mipush_org_when", 0);
            int i3 = a2.extras.getInt("mipush_n_top_fre", 0);
            int i4 = a2.extras.getInt("mipush_n_top_prd", 0);
            if (i4 > 0 && i4 >= i3) {
                int i5 = i4;
                String str4 = "mipush_n_top_prd";
                long j2 = ((long) (i4 * 1000)) + j;
                int min = (j >= currentTimeMillis || currentTimeMillis >= j2) ? 0 : i3 > 0 ? (int) Math.min((j2 - currentTimeMillis) / 1000, (long) i3) : i5;
                if (!z) {
                    if (min > 0) {
                        a2.when = currentTimeMillis;
                        C4408b.m12464a("update top notification: " + str3);
                        a.mo29981a(i2, a2);
                    } else {
                        Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(context2, a2);
                        recoverBuilder.setPriority(0);
                        recoverBuilder.setWhen(currentTimeMillis);
                        Bundle extras = recoverBuilder.getExtras();
                        if (extras != null) {
                            extras.remove("mipush_n_top_flag");
                            extras.remove("mipush_org_when");
                            extras.remove("mipush_n_top_fre");
                            extras.remove(str4);
                            recoverBuilder.setExtras(extras);
                        }
                        C4408b.m12464a("update top notification to common: " + str3);
                        (a = C4893ax.m15315a(context, str)).mo29981a(i2, recoverBuilder.build());
                    }
                }
                if (min > 0) {
                    C4408b.m12464a("schedule top notification next update delay: " + min);
                    C4516al.m12857a(context).mo28739a(m15517b(i, str2));
                    C4516al.m12857a(context).mo28740b(m15511a(context2, str, i2, str3, (Notification) null), min);
                }
            }
        }
    }
}
