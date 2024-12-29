package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4525ba;
import com.xiaomi.push.C4744hr;
import com.xiaomi.push.C4808l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@TargetApi(24)
/* renamed from: com.xiaomi.push.service.ag */
class C4846ag {

    /* renamed from: a */
    private static C4846ag f9954a = new C4846ag();

    /* renamed from: com.xiaomi.push.service.ag$a */
    private class C4847a {

        /* renamed from: a */
        List<C4848b> f9956a;

        /* renamed from: b */
        List<C4848b> f9957b;

        private C4847a() {
            this.f9956a = new ArrayList();
            this.f9957b = new ArrayList();
        }
    }

    /* renamed from: com.xiaomi.push.service.ag$b */
    private class C4848b {

        /* renamed from: a */
        int f9958a;

        /* renamed from: a */
        Notification f9959a;

        public C4848b(int i, Notification notification) {
            this.f9958a = i;
            this.f9959a = notification;
        }

        public String toString() {
            return "id:" + this.f9958a;
        }
    }

    private C4846ag() {
    }

    /* renamed from: a */
    private int m15539a(String str, String str2) {
        return ("GroupSummary" + str + str2).hashCode();
    }

    /* renamed from: a */
    private NotificationManager m15540a(Context context) {
        return (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: a */
    public static C4846ag m15541a() {
        return f9954a;
    }

    /* renamed from: a */
    private String m15542a(Notification notification) {
        Bundle bundle;
        if (notification == null || (bundle = notification.extras) == null) {
            return null;
        }
        return bundle.getString("push_src_group_name");
    }

    /* renamed from: a */
    private void m15543a(NotificationManager notificationManager, String str, String str2) {
        C3989b.m10679b("group cancel summary:" + str2);
        notificationManager.cancel(m15539a(str, str2));
    }

    /* renamed from: a */
    private void m15544a(Context context, int i, Notification notification, boolean z) {
        String str;
        NotificationManager a = m15540a(context);
        StatusBarNotification[] a2 = m15550a(a);
        if (a2 == null) {
            str = "group auto not get notifications";
        } else {
            String a3 = C4853aj.m15565a(notification);
            if (TextUtils.isEmpty(a3)) {
                str = "group auto not extract pkg from notification:" + i;
            } else {
                String b = m15551b(notification);
                HashMap hashMap = new HashMap();
                for (StatusBarNotification statusBarNotification : a2) {
                    Notification notification2 = statusBarNotification.getNotification();
                    if (!(notification2 == null || !a3.equals(C4853aj.m15565a(notification2)) || statusBarNotification.getId() == i)) {
                        m15546a((Map<String, C4847a>) hashMap, statusBarNotification);
                    }
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    if (!TextUtils.isEmpty(str2)) {
                        C4847a aVar = (C4847a) entry.getValue();
                        if (z && str2.equals(b) && !m15551b(notification)) {
                            (m15542a(notification) ? aVar.f9957b : aVar.f9956a).add(new C4848b(i, notification));
                        }
                        int size = aVar.f9956a.size();
                        if (aVar.f9957b.size() <= 0) {
                            if (size >= 2) {
                                m15545a(context, a, a3, str2);
                            }
                        } else if (size <= 0) {
                            m15543a(a, a3, str2);
                        } else if (size >= 2 && !m15540a(context)) {
                            C4848b bVar = aVar.f9957b.get(0);
                            C3989b.m10679b("group refresh:" + bVar);
                            bVar.f9959a.when = System.currentTimeMillis();
                            a.notify(bVar.f9958a, bVar.f9959a);
                        }
                    }
                }
                return;
            }
        }
        C3989b.m10669a(str);
    }

    /* renamed from: a */
    private void m15545a(Context context, NotificationManager notificationManager, String str, String str2) {
        Notification.Builder builder;
        try {
            if (TextUtils.isEmpty(str2)) {
                C3989b.m10669a("group show summary group is null");
                return;
            }
            int a = C4853aj.m15564a(context, str);
            if (a == 0) {
                C3989b.m10669a("group show summary not get icon from " + str);
                return;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                if (notificationManager.getNotificationChannel("groupSummary") == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("groupSummary", "group_summary", 3));
                }
                builder = new Notification.Builder(context, "groupSummary");
            } else {
                builder = new Notification.Builder(context).setPriority(0).setDefaults(-1);
            }
            Notification build = builder.setContentTitle("GroupSummary").setContentText("GroupSummary").setSmallIcon(Icon.createWithResource(str, a)).setAutoCancel(true).setGroup(str2).setGroupSummary(true).build();
            if (!C4808l.m15365c() && "com.xiaomi.xmsf".equals(context.getPackageName())) {
                C4853aj.m15566a(build, str);
            }
            int a2 = m15539a(str, str2);
            notificationManager.notify(a2, build);
            C3989b.m10679b("group show summary notify:" + a2);
        } catch (Exception e) {
            C3989b.m10669a("group show summary error " + e);
        }
    }

    /* renamed from: a */
    private void m15546a(Map<String, C4847a> map, StatusBarNotification statusBarNotification) {
        String b = m15551b(statusBarNotification.getNotification());
        C4847a aVar = map.get(b);
        if (aVar == null) {
            aVar = new C4847a();
            map.put(b, aVar);
        }
        (m15542a(statusBarNotification.getNotification()) ? aVar.f9957b : aVar.f9956a).add(new C4848b(statusBarNotification.getId(), statusBarNotification.getNotification()));
    }

    /* renamed from: a */
    private boolean m15547a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* renamed from: a */
    private boolean m15548a(Notification notification) {
        if (notification == null) {
            return false;
        }
        Object a = C4525ba.m13403a((Object) notification, "isGroupSummary", (Object[]) null);
        if (a instanceof Boolean) {
            return ((Boolean) a).booleanValue();
        }
        return false;
    }

    /* renamed from: a */
    private boolean m15549a(Context context) {
        boolean b = m15554b(context);
        return false;
    }

    /* renamed from: a */
    private StatusBarNotification[] m15550a(NotificationManager notificationManager) {
        StatusBarNotification[] activeNotifications = notificationManager != null ? notificationManager.getActiveNotifications() : null;
        if (activeNotifications == null || activeNotifications.length == 0) {
            return null;
        }
        return activeNotifications;
    }

    /* renamed from: b */
    private String m15551b(Notification notification) {
        if (notification == null) {
            return null;
        }
        return m15551b(notification) ? m15542a(notification) : notification.getGroup();
    }

    /* renamed from: b */
    private void m15552b(Context context, int i, Notification notification) {
        String str;
        NotificationManager a = m15540a(context);
        StatusBarNotification[] a2 = m15550a(a);
        if (a2 == null) {
            str = "group restore not get notifications";
        } else {
            String a3 = C4853aj.m15565a(notification);
            if (TextUtils.isEmpty(a3)) {
                str = "group restore not extract pkg from notification:" + i;
            } else {
                String b = m15551b(notification);
                for (StatusBarNotification statusBarNotification : a2) {
                    Notification notification2 = statusBarNotification.getNotification();
                    if (notification2 != null && a3.equals(C4853aj.m15565a(notification2)) && m15551b(notification2) && statusBarNotification.getId() != i) {
                        Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(context, statusBarNotification.getNotification());
                        recoverBuilder.setGroup(b);
                        a.notify(statusBarNotification.getId(), recoverBuilder.build());
                        C3989b.m10679b("group restore notification:" + statusBarNotification.getId());
                    }
                }
                return;
            }
        }
        C3989b.m10669a(str);
    }

    /* renamed from: b */
    private boolean m15553b(Notification notification) {
        Bundle bundle;
        if (notification == null || notification.getGroup() == null || (bundle = notification.extras) == null) {
            return false;
        }
        long j = bundle.getLong("push_src_group_time");
        String a = m15542a(notification);
        return notification.getGroup().equals(String.format("pushmask_%s_%s", new Object[]{Long.valueOf(j), a}));
    }

    /* renamed from: b */
    private boolean m15554b(Context context) {
        return C4854ak.m15568a(context).mo25911a(C4744hr.NotificationAutoGroupSwitch.mo25291a(), true);
    }

    /* renamed from: a */
    public String mo25903a(Context context, Notification.Builder builder, String str) {
        if (!m15541a() || !m15540a(context)) {
            return str;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Bundle extras = builder.getExtras();
        extras.putString("push_src_group_name", str);
        extras.putLong("push_src_group_time", currentTimeMillis);
        return String.format("pushmask_%s_%s", new Object[]{Long.valueOf(currentTimeMillis), str});
    }

    /* renamed from: a */
    public void mo25904a(Context context, int i, Notification notification) {
        if (m15541a()) {
            if (m15540a(context)) {
                try {
                    m15552b(context, i, notification);
                } catch (Exception e) {
                    C3989b.m10669a("group notify handle restore error " + e);
                }
            }
            if (m15554b(context)) {
                try {
                    m15544a(context, i, notification, true);
                } catch (Exception e2) {
                    C3989b.m10669a("group notify handle auto error " + e2);
                }
            }
        }
    }
}
