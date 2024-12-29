package com.xiaomi.mipush.sdk;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.xiaomi.channel.commonutils.logger.C3989b;
import java.lang.ref.WeakReference;

public abstract class BaseService extends Service {

    /* renamed from: a */
    private C4019a f6826a;

    /* renamed from: com.xiaomi.mipush.sdk.BaseService$a */
    public static class C4019a extends Handler {

        /* renamed from: a */
        private WeakReference<BaseService> f6827a;

        public C4019a(WeakReference<BaseService> weakReference) {
            this.f6827a = weakReference;
        }

        /* renamed from: a */
        public void mo22781a() {
            if (hasMessages(1001)) {
                removeMessages(1001);
            }
            sendEmptyMessageDelayed(1001, 1000);
        }

        public void handleMessage(Message message) {
            WeakReference<BaseService> weakReference;
            BaseService baseService;
            if (message.what == 1001 && (weakReference = this.f6827a) != null && (baseService = (BaseService) weakReference.get()) != null) {
                C3989b.m10680c("TimeoutHandler" + baseService.toString() + "  kill self");
                if (!baseService.mo22778a()) {
                    baseService.stopSelf();
                    return;
                }
                C3989b.m10680c("TimeoutHandler has job");
                sendEmptyMessageDelayed(1001, 1000);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo22778a();

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
        if (this.f6826a == null) {
            this.f6826a = new C4019a(new WeakReference(this));
        }
        this.f6826a.mo22781a();
    }
}
