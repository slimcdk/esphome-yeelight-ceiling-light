package com.xiaomi.push.service;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import com.xiaomi.push.C4830m;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.xiaomi.push.service.d */
public class C4958d {

    /* renamed from: a */
    private static List<C4959a> f9682a = new CopyOnWriteArrayList();

    /* renamed from: com.xiaomi.push.service.d$a */
    private static class C4959a {

        /* renamed from: a */
        public final int f9683a;

        /* renamed from: a */
        public final long f9684a;

        /* renamed from: a */
        public final String f9685a;

        /* renamed from: a */
        public final Notification.Action[] f9686a;

        C4959a(String str, long j, int i, Notification.Action[] actionArr) {
            this.f9685a = str;
            this.f9684a = j;
            this.f9683a = i;
            this.f9686a = actionArr;
        }
    }

    /* renamed from: a */
    private static void m15542a() {
        for (int size = f9682a.size() - 1; size >= 0; size--) {
            C4959a aVar = f9682a.get(size);
            if (SystemClock.elapsedRealtime() - aVar.f9684a > 5000) {
                f9682a.remove(aVar);
            }
        }
        if (f9682a.size() > 10) {
            f9682a.remove(0);
        }
    }

    /* renamed from: a */
    protected static void m15543a(Context context, StatusBarNotification statusBarNotification, int i) {
        if (C4830m.m14998a(context) && i > 0 && statusBarNotification != null && Build.VERSION.SDK_INT >= 20) {
            m15544a(new C4959a(statusBarNotification.getKey(), SystemClock.elapsedRealtime(), i, C4894ay.m15345a(statusBarNotification.getNotification())));
        }
    }

    /* renamed from: a */
    private static void m15544a(C4959a aVar) {
        f9682a.add(aVar);
        m15542a();
    }
}
