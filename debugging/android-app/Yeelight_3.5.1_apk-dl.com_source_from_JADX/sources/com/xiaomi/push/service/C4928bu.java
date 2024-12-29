package com.xiaomi.push.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.xiaomi.channel.commonutils.logger.C4408b;

/* renamed from: com.xiaomi.push.service.bu */
class C4928bu implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ ServiceClient f9627a;

    C4928bu(ServiceClient serviceClient) {
        this.f9627a = serviceClient;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f9627a) {
            Messenger unused = this.f9627a.f9357b = new Messenger(iBinder);
            boolean unused2 = this.f9627a.f9358b = false;
            for (Message send : ServiceClient.m15038a(this.f9627a)) {
                try {
                    ServiceClient.m15038a(this.f9627a).send(send);
                } catch (RemoteException e) {
                    C4408b.m12478a((Throwable) e);
                }
            }
            ServiceClient.m15038a(this.f9627a).clear();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        Messenger unused = this.f9627a.f9357b = null;
        boolean unused2 = this.f9627a.f9358b = false;
    }
}
