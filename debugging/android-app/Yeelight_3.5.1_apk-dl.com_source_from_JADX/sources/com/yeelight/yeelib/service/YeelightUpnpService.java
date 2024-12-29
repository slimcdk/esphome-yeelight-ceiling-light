package com.yeelight.yeelib.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import androidx.annotation.Nullable;
import org.fourthline.cling.C10010b;
import org.fourthline.cling.C10011c;
import org.fourthline.cling.C3574d;
import org.fourthline.cling.android.C10004b;
import org.fourthline.cling.android.C10006c;
import org.fourthline.cling.android.C10007d;
import org.fourthline.cling.model.types.C10098s;
import org.fourthline.cling.model.types.C10104y;
import p074n6.C9739b;
import p127a7.C3983b;
import p127a7.C3984c;
import p132b7.C4003a;
import p230x6.C12004a;

public class YeelightUpnpService extends Service {
    /* access modifiers changed from: private */
    public static final String TAG = YeelightUpnpService.class.getSimpleName();
    protected UpnpServiceBinder mBinder = new UpnpServiceBinder();
    protected C10010b mUpnpService;

    protected class UpnpServiceBinder extends Binder implements C10006c {
        protected UpnpServiceBinder() {
        }

        public C10010b get() {
            return YeelightUpnpService.this.mUpnpService;
        }

        public C10011c getConfiguration() {
            return YeelightUpnpService.this.mUpnpService.getConfiguration();
        }

        public C9739b getControlPoint() {
            return YeelightUpnpService.this.mUpnpService.getControlPoint();
        }

        public C3983b getRegistry() {
            return YeelightUpnpService.this.mUpnpService.getRegistry();
        }
    }

    /* access modifiers changed from: protected */
    public C10011c createConfiguration() {
        return new C10007d() {
            public C10098s[] getExclusiveServiceTypes() {
                return new C10098s[]{new C10104y(UpnpDeviceCherry.sUpnpDeviceCherryServiceID)};
            }

            public int getRegistryMaintenanceIntervalMillis() {
                return 7000;
            }
        };
    }

    /* access modifiers changed from: protected */
    public C10004b createRouter(C10011c cVar, C12004a aVar, Context context) {
        return new C10004b(cVar, aVar, context);
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        this.mUpnpService = new C3574d(createConfiguration(), new C3984c[0]) {
            /* access modifiers changed from: protected */
            public C4003a createRouter(C12004a aVar, C3983b bVar) {
                return YeelightUpnpService.this.createRouter(getConfiguration(), aVar, YeelightUpnpService.this);
            }

            public synchronized void shutdown() {
                String unused = YeelightUpnpService.TAG;
                ((C10004b) getRouter()).mo40311v();
                super.shutdown(true);
            }
        };
        return this.mBinder;
    }

    public void onCreate() {
        super.onCreate();
    }

    public void onDestroy() {
        this.mUpnpService.shutdown();
        this.mUpnpService = null;
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        this.mUpnpService = new C3574d(createConfiguration(), new C3984c[0]) {
            /* access modifiers changed from: protected */
            public C4003a createRouter(C12004a aVar, C3983b bVar) {
                return YeelightUpnpService.this.createRouter(getConfiguration(), aVar, YeelightUpnpService.this);
            }

            public synchronized void shutdown() {
                ((C10004b) getRouter()).mo40311v();
                super.shutdown(true);
            }
        };
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    public boolean onUnbind(Intent intent) {
        return false;
    }
}
