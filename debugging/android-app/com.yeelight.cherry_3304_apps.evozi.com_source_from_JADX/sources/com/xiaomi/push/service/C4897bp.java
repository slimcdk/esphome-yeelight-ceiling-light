package com.xiaomi.push.service;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.xiaomi.channel.commonutils.logger.C3989b;

/* renamed from: com.xiaomi.push.service.bp */
class C4897bp implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ XMPushService f10113a;

    C4897bp(XMPushService xMPushService) {
        this.f10113a = xMPushService;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C3989b.m10679b("onServiceConnected " + iBinder);
        Service a = XMJobService.m15381a();
        if (a != null) {
            this.f10113a.startForeground(XMPushService.mo25867a(), XMPushService.m15383a((Context) this.f10113a));
            a.startForeground(XMPushService.mo25867a(), XMPushService.m15383a((Context) this.f10113a));
            a.stopForeground(true);
            this.f10113a.unbindService(this);
            return;
        }
        C3989b.m10669a("XMService connected but innerService is null " + iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
