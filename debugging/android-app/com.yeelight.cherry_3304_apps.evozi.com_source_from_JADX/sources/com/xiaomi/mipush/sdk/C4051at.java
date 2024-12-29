package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.xiaomi.channel.commonutils.logger.C3989b;

/* renamed from: com.xiaomi.mipush.sdk.at */
class C4051at implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C4047aq f6897a;

    C4051at(C4047aq aqVar) {
        this.f6897a = aqVar;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f6897a) {
            Messenger unused = this.f6897a.f6886a = new Messenger(iBinder);
            boolean unused2 = this.f6897a.f6891c = false;
            for (Message send : C4047aq.m10830a(this.f6897a)) {
                try {
                    C4047aq.m10830a(this.f6897a).send(send);
                } catch (RemoteException e) {
                    C3989b.m10678a((Throwable) e);
                }
            }
            C4047aq.m10830a(this.f6897a).clear();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        Messenger unused = this.f6897a.f6886a = null;
        boolean unused2 = this.f6897a.f6891c = false;
    }
}
