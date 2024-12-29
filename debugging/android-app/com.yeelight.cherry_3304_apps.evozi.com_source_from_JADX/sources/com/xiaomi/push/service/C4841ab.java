package com.xiaomi.push.service;

import android.app.NotificationManager;
import com.xiaomi.push.C4498ai;

/* renamed from: com.xiaomi.push.service.ab */
final class C4841ab extends C4498ai.C4499a {

    /* renamed from: a */
    final /* synthetic */ int f9945a;

    /* renamed from: a */
    final /* synthetic */ NotificationManager f9946a;

    C4841ab(int i, NotificationManager notificationManager) {
        this.f9945a = i;
        this.f9946a = notificationManager;
    }

    /* renamed from: a */
    public int mo22734a() {
        return this.f9945a;
    }

    public void run() {
        this.f9946a.cancel(this.f9945a);
    }
}
