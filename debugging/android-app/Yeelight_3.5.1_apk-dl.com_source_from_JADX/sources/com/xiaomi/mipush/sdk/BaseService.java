package com.xiaomi.mipush.sdk;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.xiaomi.channel.commonutils.logger.C4408b;
import java.lang.ref.WeakReference;

public abstract class BaseService extends Service {

    /* renamed from: a */
    private C4439a f7393a;

    /* renamed from: com.xiaomi.mipush.sdk.BaseService$a */
    public static class C4439a extends Handler {

        /* renamed from: a */
        private WeakReference<BaseService> f7394a;

        public C4439a(WeakReference<BaseService> weakReference) {
            this.f7394a = weakReference;
        }

        /* renamed from: a */
        public void mo28526a() {
            if (hasMessages(1001)) {
                removeMessages(1001);
            }
            sendEmptyMessageDelayed(1001, 1000);
        }

        public void handleMessage(Message message) {
            WeakReference<BaseService> weakReference;
            BaseService baseService;
            if (message.what == 1001 && (weakReference = this.f7394a) != null && (baseService = (BaseService) weakReference.get()) != null) {
                C4408b.m12482c("TimeoutHandler " + baseService.toString() + " kill self");
                if (!baseService.mo28523a()) {
                    baseService.stopSelf();
                    return;
                }
                C4408b.m12482c("TimeoutHandler has job");
                sendEmptyMessageDelayed(1001, 1000);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo28523a();

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
        if (this.f7393a == null) {
            this.f7393a = new C4439a(new WeakReference(this));
        }
        this.f7393a.mo28526a();
    }
}
