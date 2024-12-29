package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4554bk;
import com.xiaomi.push.C4765ho;
import com.xiaomi.push.C4830m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@TargetApi(24)
/* renamed from: com.xiaomi.push.service.au */
class C4886au {

    /* renamed from: a */
    private static C4886au f9483a = new C4886au();

    /* renamed from: com.xiaomi.push.service.au$a */
    private class C4887a {

        /* renamed from: a */
        List<C4888b> f9485a;

        /* renamed from: b */
        List<C4888b> f9486b;

        private C4887a() {
            this.f9485a = new ArrayList();
            this.f9486b = new ArrayList();
        }
    }

    /* renamed from: com.xiaomi.push.service.au$b */
    private class C4888b {

        /* renamed from: a */
        int f9487a;

        /* renamed from: a */
        Notification f9488a;

        public C4888b(int i, Notification notification) {
            this.f9487a = i;
            this.f9488a = notification;
        }

        public String toString() {
            return "id:" + this.f9487a;
        }
    }

    private C4886au() {
    }

    /* renamed from: a */
    private int m15289a(String str, String str2) {
        return ("GroupSummary" + str + str2).hashCode();
    }

    /* renamed from: a */
    public static C4886au m15290a() {
        return f9483a;
    }

    /* renamed from: a */
    private String m15291a(Notification notification) {
        Bundle bundle;
        if (notification == null || (bundle = notification.extras) == null) {
            return null;
        }
        return bundle.getString("push_src_group_name");
    }

    /* renamed from: a */
    private List<StatusBarNotification> m15292a(C4893ax axVar) {
        List<StatusBarNotification> b = axVar != null ? axVar.mo29984b() : null;
        if (b == null || b.size() == 0) {
            return null;
        }
        return b;
    }

    /* renamed from: a */
    private void m15293a(Context context, int i, Notification notification, boolean z) {
        String str;
        String c = C4894ay.m15360c(notification);
        if (TextUtils.isEmpty(c)) {
            str = "group auto not extract pkg from notification:" + i;
        } else {
            List<StatusBarNotification> a = m15292a(C4893ax.m15315a(context, c));
            if (a == null) {
                str = "group auto not get notifications";
            } else {
                String b = m15300b(notification);
                HashMap hashMap = new HashMap();
                for (StatusBarNotification next : a) {
                    if (!(next.getNotification() == null || next.getId() == i)) {
                        m15296a((Map<String, C4887a>) hashMap, next);
                    }
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    if (!TextUtils.isEmpty(str2)) {
                        C4887a aVar = (C4887a) entry.getValue();
                        if (z && str2.equals(b) && !m15300b(notification)) {
                            (m15291a(notification) ? aVar.f9486b : aVar.f9485a).add(new C4888b(i, notification));
                        }
                        int size = aVar.f9485a.size();
                        if (aVar.f9486b.size() <= 0) {
                            if (z && size >= 2) {
                                m15295a(context, c, str2, aVar.f9485a.get(0).f9488a);
                            }
                        } else if (size <= 0) {
                            m15294a(context, c, str2);
                        }
                    }
                }
                return;
            }
        }
        C4408b.m12464a(str);
    }

    /* renamed from: a */
    private void m15294a(Context context, String str, String str2) {
        C4408b.m12481b("group cancel summary:" + str2);
        C4893ax.m15315a(context, str).mo29980a(m15289a(str, str2));
    }

    /* renamed from: a */
    private void m15295a(Context context, String str, String str2, Notification notification) {
        Notification.Builder builder;
        try {
            if (TextUtils.isEmpty(str2)) {
                C4408b.m12464a("group show summary group is null");
                return;
            }
            int a = C4894ay.m15340a(context, str);
            if (a == 0) {
                C4408b.m12464a("group show summary not get icon from " + str);
                return;
            }
            C4893ax a2 = C4893ax.m15315a(context, str);
            if (Build.VERSION.SDK_INT >= 26) {
                String b = a2.mo29985b(notification.getChannelId(), "groupSummary");
                NotificationChannel a3 = a2.mo29978a(b);
                if ("groupSummary".equals(b) && a3 == null) {
                    a2.mo29982a(new NotificationChannel(b, "group_summary", 3));
                }
                builder = new Notification.Builder(context, b);
            } else {
                builder = new Notification.Builder(context).setPriority(0).setDefaults(-1);
            }
            C4894ay.m15353a(builder, true);
            Notification build = builder.setContentTitle("GroupSummary").setContentText("GroupSummary").setSmallIcon(Icon.createWithResource(str, a)).setAutoCancel(true).setGroup(str2).setGroupSummary(true).build();
            if (!C4830m.m15013c() && "com.xiaomi.xmsf".equals(context.getPackageName())) {
                C4894ay.m15343a(build, str);
            }
            int a4 = m15289a(str, str2);
            a2.mo29981a(a4, build);
            C4408b.m12481b("group show summary notify:" + a4);
        } catch (Exception e) {
            C4408b.m12464a("group show summary error " + e);
        }
    }

    /* renamed from: a */
    private void m15296a(Map<String, C4887a> map, StatusBarNotification statusBarNotification) {
        String b = m15300b(statusBarNotification.getNotification());
        C4887a aVar = map.get(b);
        if (aVar == null) {
            aVar = new C4887a();
            map.put(b, aVar);
        }
        (m15291a(statusBarNotification.getNotification()) ? aVar.f9486b : aVar.f9485a).add(new C4888b(statusBarNotification.getId(), statusBarNotification.getNotification()));
    }

    /* renamed from: a */
    private boolean m15297a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* renamed from: a */
    private boolean m15298a(Notification notification) {
        if (notification == null) {
            return false;
        }
        Object a = C4554bk.m13012a((Object) notification, "isGroupSummary", (Object[]) null);
        if (a instanceof Boolean) {
            return ((Boolean) a).booleanValue();
        }
        return false;
    }

    /* renamed from: a */
    private boolean m15299a(Context context) {
        if (m15303b(context) && C4893ax.m15320a(context)) {
            return C4898ba.m15362a(context).mo29996a(C4765ho.LatestNotificationNotIntoGroupSwitch.mo29322a(), false);
        }
        return false;
    }

    /* renamed from: b */
    private String m15300b(Notification notification) {
        if (notification == null) {
            return null;
        }
        return m15300b(notification) ? m15291a(notification) : notification.getGroup();
    }

    /* renamed from: b */
    private void m15301b(Context context, int i, Notification notification) {
        String str;
        String c = C4894ay.m15360c(notification);
        if (TextUtils.isEmpty(c)) {
            str = "group restore not extract pkg from notification:" + i;
        } else {
            C4893ax a = C4893ax.m15315a(context, c);
            List<StatusBarNotification> a2 = m15292a(a);
            if (a2 == null) {
                str = "group restore not get notifications";
            } else {
                for (StatusBarNotification next : a2) {
                    Notification notification2 = next.getNotification();
                    if (!(notification2 == null || !m15300b(notification2) || next.getId() == i)) {
                        Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(context, next.getNotification());
                        recoverBuilder.setGroup(m15291a(notification2));
                        C4894ay.m15353a(recoverBuilder, m15291a(notification2));
                        a.mo29981a(next.getId(), recoverBuilder.build());
                        C4408b.m12481b("group restore notification:" + next.getId());
                    }
                }
                return;
            }
        }
        C4408b.m12464a(str);
    }

    /* renamed from: b */
    private boolean m15302b(Notification notification) {
        Bundle bundle;
        if (notification == null || notification.getGroup() == null || (bundle = notification.extras) == null) {
            return false;
        }
        long j = bundle.getLong("push_src_group_time");
        String a = m15291a(notification);
        return notification.getGroup().equals(String.format("pushmask_%s_%s", new Object[]{Long.valueOf(j), a}));
    }

    /* renamed from: b */
    private boolean m15303b(Context context) {
        return C4898ba.m15362a(context).mo29996a(C4765ho.NotificationAutoGroupSwitch.mo29322a(), true);
    }

    /* renamed from: a */
    public String mo29975a(Context context, Notification.Builder builder, String str) {
        if (!m15290a() || !m15299a(context)) {
            return str;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Bundle extras = builder.getExtras();
        extras.putString("push_src_group_name", str);
        extras.putLong("push_src_group_time", currentTimeMillis);
        return String.format("pushmask_%s_%s", new Object[]{Long.valueOf(currentTimeMillis), str});
    }

    /* renamed from: a */
    public void mo29976a(Context context, int i, Notification notification) {
        if (m15290a()) {
            if (m15299a(context)) {
                try {
                    m15301b(context, i, notification);
                } catch (Exception e) {
                    C4408b.m12464a("group notify handle restore error " + e);
                }
            }
            if (m15303b(context)) {
                try {
                    m15293a(context, i, notification, true);
                } catch (Exception e2) {
                    C4408b.m12464a("group notify handle auto error " + e2);
                }
            }
        }
    }
}
