package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.xiaomi.channel.commonutils.logger.C4408b;

/* renamed from: com.xiaomi.mipush.sdk.as */
class C4470as implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C4465ao f7464a;

    C4470as(C4465ao aoVar) {
        this.f7464a = aoVar;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f7464a) {
            Messenger unused = this.f7464a.f7452a = new Messenger(iBinder);
            boolean unused2 = this.f7464a.f7457c = false;
            for (Message send : C4465ao.m12641a(this.f7464a)) {
                try {
                    C4465ao.m12641a(this.f7464a).send(send);
                } catch (RemoteException e) {
                    C4408b.m12478a((Throwable) e);
                }
            }
            C4465ao.m12641a(this.f7464a).clear();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        Messenger unused = this.f7464a.f7452a = null;
        boolean unused2 = this.f7464a.f7457c = false;
    }
}
