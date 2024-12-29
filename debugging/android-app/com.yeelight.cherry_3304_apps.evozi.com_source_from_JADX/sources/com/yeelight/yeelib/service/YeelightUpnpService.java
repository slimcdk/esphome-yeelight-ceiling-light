package com.yeelight.yeelib.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import androidx.annotation.Nullable;
import p164h.p165b.p166a.C4423b;
import p164h.p165b.p166a.C4424c;
import p164h.p165b.p166a.C4425d;
import p164h.p165b.p166a.p167g.C4427b;
import p164h.p165b.p166a.p168i.C4429b;
import p164h.p165b.p166a.p169j.C11444h;
import p164h.p165b.p166a.p169j.C4432d;
import p164h.p165b.p166a.p170k.C4436a;
import p164h.p165b.p166a.p236e.C11168b;
import p164h.p165b.p166a.p236e.C11170c;
import p164h.p165b.p166a.p236e.C11171d;
import p164h.p165b.p166a.p240h.p252w.C11363d0;
import p164h.p165b.p166a.p240h.p252w.C11397x;

public class YeelightUpnpService extends Service {
    /* access modifiers changed from: private */
    public static final String TAG = YeelightUpnpService.class.getSimpleName();
    protected UpnpServiceBinder mBinder = new UpnpServiceBinder();
    protected C4423b mUpnpService;

    protected class UpnpServiceBinder extends Binder implements C11170c {
        protected UpnpServiceBinder() {
        }

        public C4423b get() {
            return YeelightUpnpService.this.mUpnpService;
        }

        public C4424c getConfiguration() {
            return YeelightUpnpService.this.mUpnpService.getConfiguration();
        }

        public C4427b getControlPoint() {
            return YeelightUpnpService.this.mUpnpService.getControlPoint();
        }

        public C4432d getRegistry() {
            return YeelightUpnpService.this.mUpnpService.getRegistry();
        }
    }

    /* access modifiers changed from: protected */
    public C4424c createConfiguration() {
        return new C11171d() {
            public C11397x[] getExclusiveServiceTypes() {
                return new C11397x[]{new C11363d0(UpnpDeviceCherry.sUpnpDeviceCherryServiceID)};
            }

            public int getRegistryMaintenanceIntervalMillis() {
                return 7000;
            }
        };
    }

    /* access modifiers changed from: protected */
    public C11168b createRouter(C4424c cVar, C4429b bVar, Context context) {
        return new C11168b(cVar, bVar, context);
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        this.mUpnpService = new C4425d(createConfiguration(), new C11444h[0]) {
            /* access modifiers changed from: protected */
            public C4436a createRouter(C4429b bVar, C4432d dVar) {
                return YeelightUpnpService.this.createRouter(getConfiguration(), bVar, YeelightUpnpService.this);
            }

            public synchronized void shutdown() {
                String unused = YeelightUpnpService.TAG;
                ((C11168b) getRouter()).mo35523v();
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
        this.mUpnpService = new C4425d(createConfiguration(), new C11444h[0]) {
            /* access modifiers changed from: protected */
            public C4436a createRouter(C4429b bVar, C4432d dVar) {
                return YeelightUpnpService.this.createRouter(getConfiguration(), bVar, YeelightUpnpService.this);
            }

            public synchronized void shutdown() {
                ((C11168b) getRouter()).mo35523v();
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
