package com.xiaomi.push.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.xiaomi.channel.commonutils.logger.C3989b;

/* renamed from: com.xiaomi.push.service.bd */
class C4883bd implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C4881bb f10084a;

    C4883bd(C4881bb bbVar) {
        this.f10084a = bbVar;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f10084a) {
            Messenger unused = this.f10084a.f10081b = new Messenger(iBinder);
            boolean unused2 = this.f10084a.f10082b = false;
            for (Message send : C4881bb.m15664a(this.f10084a)) {
                try {
                    C4881bb.m15664a(this.f10084a).send(send);
                } catch (RemoteException e) {
                    C3989b.m10678a((Throwable) e);
                }
            }
            C4881bb.m15664a(this.f10084a).clear();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        Messenger unused = this.f10084a.f10081b = null;
        boolean unused2 = this.f10084a.f10082b = false;
    }
}
